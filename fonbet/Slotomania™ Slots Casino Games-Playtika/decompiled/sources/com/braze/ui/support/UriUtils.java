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
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: UriUtils.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0001\u001a\u0016\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\f*\u00020\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"TAG", "", "getMainActivityIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "extras", "Landroid/os/Bundle;", "isActivityRegisteredInManifest", "", "className", "getQueryParameters", "", "Landroid/net/Uri;", "android-sdk-ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UriUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("UriUtils");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v13, types: [T, android.net.Uri, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Map<String, String> getQueryParameters(Uri uri) {
        boolean z;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = uri;
        String encodedQuery = ((Uri) objectRef.element).getEncodedQuery();
        if (encodedQuery == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, (Function0) new Function0<String>() { // from class: com.braze.ui.support.UriUtils$getQueryParameters$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Encoded query is null for Uri: " + objectRef.element + " Returning empty map for query parameters";
                }
            }, 4, (Object) null);
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            if (((Uri) objectRef.element).isOpaque()) {
                ?? build = Uri.parse("://").buildUpon().encodedQuery(encodedQuery).build();
                Intrinsics.checkNotNullExpressionValue(build, "parse(\"://\")\n           …\n                .build()");
                objectRef.element = build;
            }
            Set<String> queryParameterNames = ((Uri) objectRef.element).getQueryParameterNames();
            Intrinsics.checkNotNullExpressionValue(queryParameterNames, "uri.queryParameterNames");
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj : queryParameterNames) {
                String str = (String) obj;
                if (str != null && str.length() != 0) {
                    z = false;
                    if (z) {
                        arrayList.add(obj);
                    }
                }
                z = true;
                if (z) {
                }
            }
            for (String queryParameterKey : arrayList) {
                String queryParameter = ((Uri) objectRef.element).getQueryParameter(queryParameterKey);
                String str2 = queryParameter;
                if (str2 != null && str2.length() != 0) {
                    Intrinsics.checkNotNullExpressionValue(queryParameterKey, "queryParameterKey");
                    linkedHashMap.put(queryParameterKey, queryParameter);
                }
            }
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e, new Function0<String>() { // from class: com.braze.ui.support.UriUtils$getQueryParameters$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Failed to map the query parameters of Uri: ", objectRef.element);
                }
            });
        }
        return linkedHashMap;
    }

    public static /* synthetic */ Intent getMainActivityIntent$default(Context context, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        return getMainActivityIntent(context, bundle);
    }

    public static final Intent getMainActivityIntent(Context context, Bundle bundle) {
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

    public static final boolean isActivityRegisteredInManifest(Context context, final String className) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.getPackageManager().getActivityInfo(new ComponentName(context, className), PackageManager.ComponentInfoFlags.of(0L));
                return true;
            }
            context.getPackageManager().getActivityInfo(new ComponentName(context, className), 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.W, (Throwable) e, new Function0<String>() { // from class: com.braze.ui.support.UriUtils$isActivityRegisteredInManifest$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Could not find activity info for class with name: ", className);
                }
            });
            return false;
        }
    }
}
