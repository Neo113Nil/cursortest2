package com.braze.support;

import Ph.AbstractC1457j;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import bo.app.sb;
import com.braze.storage.C2995i;
import com.braze.support.BrazeLogger;
import com.braze.support.PermissionUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0003*\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/content/Context;", "", "permission", "", "hasPermission", "(Landroid/content/Context;Ljava/lang/String;)Z", "Landroid/app/Activity;", "", "requestPushPermissionPrompt", "(Landroid/app/Activity;)V", "wouldPushPermissionPromptDisplay", "(Landroid/app/Activity;)Z", "context", "", "getPermissionRequestCount", "(Landroid/content/Context;Ljava/lang/String;)I", "incrementPermissionRequestCount", "(Landroid/content/Context;Ljava/lang/String;)V", "TAG", "Ljava/lang/String;", "android-sdk-base_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PermissionUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("PermissionUtils");

    public static final int getPermissionRequestCount(Context context, String permission) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return new C2995i(context).a(permission);
    }

    public static final boolean hasPermission(Context context, final String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (context != null) {
            try {
                return context.checkCallingOrSelfPermission(permission) == 0;
            } catch (Throwable th2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, th2, false, new Function0() { // from class: Y3.h0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String hasPermission$lambda$0;
                        hasPermission$lambda$0 = PermissionUtils.hasPermission$lambda$0(permission);
                        return hasPermission$lambda$0;
                    }
                }, 8, (Object) null);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String hasPermission$lambda$0(String str) {
        return "Failure checking permission " + str;
    }

    public static final void incrementPermissionRequestCount(Context context, final String permission) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        C2995i c2995i = new C2995i(context);
        Intrinsics.checkNotNullParameter(permission, "permission");
        AbstractC1457j.b(null, new sb(c2995i, permission, null), 1, null);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: Y3.l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String incrementPermissionRequestCount$lambda$0;
                incrementPermissionRequestCount$lambda$0 = PermissionUtils.incrementPermissionRequestCount$lambda$0(permission);
                return incrementPermissionRequestCount$lambda$0;
            }
        }, 12, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String incrementPermissionRequestCount$lambda$0(String str) {
        return "Incremented permission request counter for " + str + ".";
    }

    public static final void requestPushPermissionPrompt(Activity activity) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str = TAG;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f29472V;
        BrazeLogger.brazelog$default(brazeLogger, str, priority, (Throwable) null, false, new Function0() { // from class: Y3.f0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestPushPermissionPrompt$lambda$0;
                requestPushPermissionPrompt$lambda$0 = PermissionUtils.requestPushPermissionPrompt$lambda$0();
                return requestPushPermissionPrompt$lambda$0;
            }
        }, 12, (Object) null);
        if (activity == null) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestPushPermissionPrompt$lambda$1;
                    requestPushPermissionPrompt$lambda$1 = PermissionUtils.requestPushPermissionPrompt$lambda$1();
                    return requestPushPermissionPrompt$lambda$1;
                }
            }, 14, (Object) null);
            return;
        }
        if (!wouldPushPermissionPromptDisplay(activity) || Build.VERSION.SDK_INT < 33) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.k0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestPushPermissionPrompt$lambda$2;
                    requestPushPermissionPrompt$lambda$2 = PermissionUtils.requestPushPermissionPrompt$lambda$2();
                    return requestPushPermissionPrompt$lambda$2;
                }
            }, 14, (Object) null);
            return;
        }
        incrementPermissionRequestCount(activity, "android.permission.POST_NOTIFICATIONS");
        BrazeLogger.brazelog$default(brazeLogger, str, priority, (Throwable) null, false, new Function0() { // from class: Y3.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestPushPermissionPrompt$lambda$3;
                requestPushPermissionPrompt$lambda$3 = PermissionUtils.requestPushPermissionPrompt$lambda$3();
                return requestPushPermissionPrompt$lambda$3;
            }
        }, 12, (Object) null);
        activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, IntentUtils.getRequestCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$0() {
        return "Attempting to execute requestPushPermissionPrompt()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$1() {
        return "Cannot request push permission with null Activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$2() {
        return "Permission prompt would not display, not attempting to request push permission prompt.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$3() {
        return "Requesting push permission from system.";
    }

    public static final boolean wouldPushPermissionPromptDisplay(Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.m0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String wouldPushPermissionPromptDisplay$lambda$0;
                    wouldPushPermissionPromptDisplay$lambda$0 = PermissionUtils.wouldPushPermissionPromptDisplay$lambda$0();
                    return wouldPushPermissionPromptDisplay$lambda$0;
                }
            }, 14, (Object) null);
            return false;
        }
        if (Build.VERSION.SDK_INT < 33) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: Y3.n0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String wouldPushPermissionPromptDisplay$lambda$1;
                    wouldPushPermissionPromptDisplay$lambda$1 = PermissionUtils.wouldPushPermissionPromptDisplay$lambda$1();
                    return wouldPushPermissionPromptDisplay$lambda$1;
                }
            }, 12, (Object) null);
            return false;
        }
        final int i10 = activity.getApplicationInfo().targetSdkVersion;
        if (i10 < 33) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: Y3.o0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String wouldPushPermissionPromptDisplay$lambda$2;
                    wouldPushPermissionPromptDisplay$lambda$2 = PermissionUtils.wouldPushPermissionPromptDisplay$lambda$2(i10);
                    return wouldPushPermissionPromptDisplay$lambda$2;
                }
            }, 12, (Object) null);
            return false;
        }
        if (hasPermission(activity, "android.permission.POST_NOTIFICATIONS")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: Y3.p0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String wouldPushPermissionPromptDisplay$lambda$3;
                    wouldPushPermissionPromptDisplay$lambda$3 = PermissionUtils.wouldPushPermissionPromptDisplay$lambda$3();
                    return wouldPushPermissionPromptDisplay$lambda$3;
                }
            }, 12, (Object) null);
            return false;
        }
        final int permissionRequestCount = getPermissionRequestCount(activity, "android.permission.POST_NOTIFICATIONS");
        if (permissionRequestCount >= 2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: Y3.q0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String wouldPushPermissionPromptDisplay$lambda$4;
                    wouldPushPermissionPromptDisplay$lambda$4 = PermissionUtils.wouldPushPermissionPromptDisplay$lambda$4(permissionRequestCount);
                    return wouldPushPermissionPromptDisplay$lambda$4;
                }
            }, 12, (Object) null);
            return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: Y3.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String wouldPushPermissionPromptDisplay$lambda$5;
                wouldPushPermissionPromptDisplay$lambda$5 = PermissionUtils.wouldPushPermissionPromptDisplay$lambda$5();
                return wouldPushPermissionPromptDisplay$lambda$5;
            }
        }, 12, (Object) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$0() {
        return "Cannot request push permission with null Activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$1() {
        return "Device API version of " + Build.VERSION.SDK_INT + " is too low to display push permission prompt.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$2(int i10) {
        return "App Target API version of " + i10 + " is too low to display push permission prompt.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$3() {
        return "Notification permission already granted, doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$4(int i10) {
        return "Notification permission request count is " + i10 + ". Returning value of 'shouldShowRequestPermissionRationale(NOTIFICATION_PERMISSION)'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$5() {
        return "Push Prompt can be shown on this device, within a reasonable confidence.";
    }
}
