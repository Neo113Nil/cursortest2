package ai.verisoul.sdk.helpers.root;

import ai.verisoul.sdk.logger.Logger;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\tH\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lai/verisoul/sdk/helpers/root/RootDetectionHelperImpl;", "Lai/verisoul/sdk/helpers/root/RootDetectionHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "checkBuildTags", "", "checkForBinary", "checkForRoot", "Lai/verisoul/sdk/helpers/root/RootDetectionData;", "checkForRootApps", "checkSuCommand", "performFallbackDetection", "tryNativeDetection", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRootDetectionHelperImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootDetectionHelperImpl.kt\nai/verisoul/sdk/helpers/root/RootDetectionHelperImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,190:1\n12474#2,2:191\n12474#2,2:193\n*S KotlinDebug\n*F\n+ 1 RootDetectionHelperImpl.kt\nai/verisoul/sdk/helpers/root/RootDetectionHelperImpl\n*L\n130#1:191,2\n144#1:193,2\n*E\n"})
/* loaded from: classes.dex */
public final class RootDetectionHelperImpl implements RootDetectionHelper {

    @NotNull
    private static final String TAG = "[RootDetection]";

    @NotNull
    private final Context context;

    @NotNull
    private static final String[] SU_PATHS = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};

    @NotNull
    private static final String[] ROOT_APPS = {"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk"};

    public RootDetectionHelperImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final boolean checkBuildTags() {
        try {
            String str = Build.TAGS;
            if (str != null) {
                return StringsKt.contains$default((CharSequence) str, (CharSequence) "test-keys", false, 2, (Object) null);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private final boolean checkForBinary() {
        boolean z10;
        for (String str : SU_PATHS) {
            try {
                z10 = new File(str).exists();
            } catch (Exception unused) {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    private final boolean checkForRootApps() {
        PackageManager packageManager = this.context.getPackageManager();
        for (String str : ROOT_APPS) {
            try {
                packageManager.getPackageInfo(str, 0);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private final boolean checkSuCommand() {
        try {
            Runtime.getRuntime().exec(new String[]{"which", "su"});
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private final RootDetectionData performFallbackDetection() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (checkForBinary()) {
            arrayList2.add("su_binary_found");
        } else {
            arrayList.add("no_su_binary");
        }
        if (checkForRootApps()) {
            arrayList2.add("root_apps_found");
        } else {
            arrayList.add("no_root_apps");
        }
        if (checkBuildTags()) {
            arrayList2.add("test_keys_found");
        } else {
            arrayList.add("no_test_keys");
        }
        if (checkSuCommand()) {
            arrayList2.add("su_command_executable");
        } else {
            arrayList.add("su_not_executable");
        }
        return new RootDetectionData(!arrayList2.isEmpty(), "fallback_java", arrayList, arrayList2, null);
    }

    private final RootDetectionData tryNativeDetection() {
        try {
            System.loadLibrary("verisoul-root-check");
            int checkForRoot = new VerisoulRootCheckNative().checkForRoot();
            Logger.INSTANCE.info(TAG, "Native root detection completed successfully");
            return new RootDetectionData(checkForRoot != 0, "native", checkForRoot == 0 ? CollectionsKt.listOf("native_check") : CollectionsKt.emptyList(), checkForRoot != 0 ? CollectionsKt.listOf("native_check") : CollectionsKt.emptyList(), null, 16, null);
        } catch (Exception e10) {
            Logger.INSTANCE.error(TAG, "Error during native root detection: " + e10.getMessage());
            return null;
        } catch (UnsatisfiedLinkError e11) {
            Logger.INSTANCE.info(TAG, "Native library not available: " + e11.getMessage() + ". Using fallback detection.");
            return null;
        }
    }

    @Override // ai.verisoul.sdk.helpers.root.RootDetectionHelper
    @NotNull
    public RootDetectionData checkForRoot() {
        RootDetectionData tryNativeDetection = tryNativeDetection();
        if (tryNativeDetection != null) {
            return tryNativeDetection;
        }
        Logger.INSTANCE.info(TAG, "Using fallback Java-based root detection");
        return performFallbackDetection();
    }
}
