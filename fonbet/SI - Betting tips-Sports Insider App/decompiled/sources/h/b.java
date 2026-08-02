package h;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b {
    public static x7.c a(Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            String string = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
            String string2 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
            String string3 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
            String string4 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
            String string5 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
            Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) data.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class) : (Uri) data.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
            String string6 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
            Intrinsics.checkNotNull(string);
            Intrinsics.checkNotNull(string2);
            return new x7.c(string, string2, string3, string4, string5, uri, string6);
        } catch (Exception e7) {
            throw new x7.d(e7);
        }
    }

    public static int b() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 33 && (i5 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) {
            return Integer.MAX_VALUE;
        }
        return MediaStore.getPickImagesMaxLimit();
    }

    public static PackageInfo c(PackageManager packageManager, String packageName, int i5) {
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (Build.VERSION.SDK_INT >= 33) {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(i5));
            Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName, i5);
        Intrinsics.checkNotNull(packageInfo2);
        return packageInfo2;
    }

    public static Object d(Bundle bundle, String str) {
        return bundle.getParcelable(str, ActivityResult.class);
    }

    public static ArrayList e(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static Signature[] f(PackageManager packageManager, String packageName) {
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (Build.VERSION.SDK_INT < 28) {
            Signature[] signatureArr = c(packageManager, packageName, 64).signatures;
            Intrinsics.checkNotNull(signatureArr);
            return signatureArr;
        }
        SigningInfo signingInfo = c(packageManager, packageName, 134217728).signingInfo;
        Intrinsics.checkNotNull(signingInfo);
        Signature[] apkContentsSigners = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
        Intrinsics.checkNotNull(apkContentsSigners);
        return apkContentsSigners;
    }

    public static SparseArray g(Bundle bundle, String str) {
        return bundle.getSparseParcelableArray(str, Parcelable.class);
    }

    public static String h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }
}
