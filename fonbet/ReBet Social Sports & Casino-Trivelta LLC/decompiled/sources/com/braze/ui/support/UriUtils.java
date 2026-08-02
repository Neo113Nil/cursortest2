package com.braze.ui.support;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.support.UriUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0016\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003*\u00020\u0004\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u001a\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"TAG", "", "getQueryParameters", "", "Landroid/net/Uri;", "getMainActivityIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "extras", "Landroid/os/Bundle;", "isActivityRegisteredInManifest", "", "className", "android-sdk-ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@JvmName(name = "UriUtils")
@SourceDebugExtension({"SMAP\nUriUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UriUtils.kt\ncom/braze/ui/support/UriUtils\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n29#2:88\n774#3:89\n865#3,2:90\n*S KotlinDebug\n*F\n+ 1 UriUtils.kt\ncom/braze/ui/support/UriUtils\n*L\n39#1:88\n44#1:89\n44#1:90,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class UriUtils {

    @NotNull
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("UriUtils");

    @Nullable
    public static final Intent getMainActivityIntent(@NotNull Context context, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_UTILS_GET_MAIN_ACTIVITY_INTENT));
        }
        if (bundle != null && launchIntentForPackage != null) {
            launchIntentForPackage.putExtras(bundle);
        }
        return launchIntentForPackage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v9, types: [T, android.net.Uri, java.lang.Object] */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Map<String, String> getQueryParameters(@NotNull Uri uri) {
        boolean z10;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = uri;
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: p4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String queryParameters$lambda$0;
                    queryParameters$lambda$0 = UriUtils.getQueryParameters$lambda$0(Ref.ObjectRef.this);
                    return queryParameters$lambda$0;
                }
            }, 12, (Object) null);
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            if (((Uri) objectRef.element).isOpaque()) {
                ?? build = Uri.parse("://").buildUpon().encodedQuery(encodedQuery).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                objectRef.element = build;
            }
            Set<String> queryParameterNames = ((Uri) objectRef.element).getQueryParameterNames();
            Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj : queryParameterNames) {
                String str = (String) obj;
                if (str != null && str.length() != 0) {
                    z10 = false;
                    if (z10) {
                        arrayList.add(obj);
                    }
                }
                z10 = true;
                if (z10) {
                }
            }
            for (String str2 : arrayList) {
                String queryParameter = ((Uri) objectRef.element).getQueryParameter(str2);
                if (queryParameter != null && queryParameter.length() != 0) {
                    linkedHashMap.put(str2, queryParameter);
                }
            }
            return linkedHashMap;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: p4.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String queryParameters$lambda$2;
                    queryParameters$lambda$2 = UriUtils.getQueryParameters$lambda$2(Ref.ObjectRef.this);
                    return queryParameters$lambda$2;
                }
            }, 8, (Object) null);
            return linkedHashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getQueryParameters$lambda$0(Ref.ObjectRef objectRef) {
        return "Encoded query is null for Uri: " + objectRef.element + " Returning empty map for query parameters";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getQueryParameters$lambda$2(Ref.ObjectRef objectRef) {
        return "Failed to map the query parameters of Uri: " + objectRef.element;
    }

    public static final boolean isActivityRegisteredInManifest(@NotNull Context context, @NotNull final String className) {
        PackageManager.ComponentInfoFlags of2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            if (Build.VERSION.SDK_INT < 33) {
                context.getPackageManager().getActivityInfo(new ComponentName(context, className), 0);
                return true;
            }
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, className);
            of2 = PackageManager.ComponentInfoFlags.of(0L);
            packageManager.getActivityInfo(componentName, of2);
            return true;
        } catch (PackageManager.NameNotFoundException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: p4.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isActivityRegisteredInManifest$lambda$0;
                    isActivityRegisteredInManifest$lambda$0 = UriUtils.isActivityRegisteredInManifest$lambda$0(className);
                    return isActivityRegisteredInManifest$lambda$0;
                }
            }, 8, (Object) null);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isActivityRegisteredInManifest$lambda$0(String str) {
        return "Could not find activity info for class with name: " + str;
    }
}
