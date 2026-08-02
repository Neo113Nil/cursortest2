package com.braze;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.push.NotificationTrampolineActivity;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BrazeActivityLifecycleCallbackListener.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B5\b\u0017\u0012\u0014\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006BK\b\u0007\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019J\u001a\u0010\u001a\u001a\u00020\f2\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0003J\u001a\u0010\u001c\u001a\u00020\f2\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0003J\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\bH\u0007R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/braze/BrazeActivityLifecycleCallbackListener;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "inAppMessagingRegistrationBlocklist", "", "Ljava/lang/Class;", "sessionHandlingBlocklist", "(Ljava/util/Set;Ljava/util/Set;)V", "sessionHandlingEnabled", "", "registerInAppMessageManager", "(ZZLjava/util/Set;Ljava/util/Set;)V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "bundle", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "registerOnApplication", "context", "Landroid/content/Context;", "setInAppMessagingRegistrationBlocklist", "blocklist", "setSessionHandlingBlocklist", "shouldHandleLifecycleMethodsInActivity", "forSessionHandling", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public class BrazeActivityLifecycleCallbackListener implements Application.ActivityLifecycleCallbacks {
    private Set<? extends Class<?>> inAppMessagingRegistrationBlocklist;
    private final boolean registerInAppMessageManager;
    private Set<? extends Class<?>> sessionHandlingBlocklist;
    private final boolean sessionHandlingEnabled;

    public BrazeActivityLifecycleCallbackListener() {
        this(false, false, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BrazeActivityLifecycleCallbackListener(Set<? extends Class<?>> set) {
        this((Set) set, (Set) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public BrazeActivityLifecycleCallbackListener(boolean z) {
        this(z, false, null, null, 14, null);
    }

    public BrazeActivityLifecycleCallbackListener(boolean z, boolean z2) {
        this(z, z2, null, null, 12, null);
    }

    public BrazeActivityLifecycleCallbackListener(boolean z, boolean z2, Set<? extends Class<?>> set) {
        this(z, z2, set, null, 8, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    public BrazeActivityLifecycleCallbackListener(boolean z, boolean z2, Set<? extends Class<?>> set, Set<? extends Class<?>> set2) {
        this.sessionHandlingEnabled = z;
        this.registerInAppMessageManager = z2;
        this.inAppMessagingRegistrationBlocklist = set == null ? SetsKt.emptySet() : set;
        this.sessionHandlingBlocklist = set2 == null ? SetsKt.emptySet() : set2;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("BrazeActivityLifecycleCallbackListener using in-app messaging blocklist: ", BrazeActivityLifecycleCallbackListener.this.inAppMessagingRegistrationBlocklist);
            }
        }, 2, (Object) null);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("BrazeActivityLifecycleCallbackListener using session handling blocklist: ", BrazeActivityLifecycleCallbackListener.this.sessionHandlingBlocklist);
            }
        }, 2, (Object) null);
    }

    public /* synthetic */ BrazeActivityLifecycleCallbackListener(boolean z, boolean z2, Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (Set<? extends Class<?>>) ((i & 4) != 0 ? SetsKt.emptySet() : set), (Set<? extends Class<?>>) ((i & 8) != 0 ? SetsKt.emptySet() : set2));
    }

    public /* synthetic */ BrazeActivityLifecycleCallbackListener(Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((Set<? extends Class<?>>) set, (Set<? extends Class<?>>) ((i & 2) != 0 ? SetsKt.emptySet() : set2));
    }

    public BrazeActivityLifecycleCallbackListener(Set<? extends Class<?>> set, Set<? extends Class<?>> set2) {
        this(true, true, set, set2);
    }

    public final void setInAppMessagingRegistrationBlocklist(final Set<? extends Class<?>> blocklist) {
        Intrinsics.checkNotNullParameter(blocklist, "blocklist");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener$setInAppMessagingRegistrationBlocklist$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("setInAppMessagingRegistrationBlocklist called with blocklist: ", blocklist);
            }
        }, 2, (Object) null);
        this.inAppMessagingRegistrationBlocklist = blocklist;
    }

    public final void setSessionHandlingBlocklist(final Set<? extends Class<?>> blocklist) {
        Intrinsics.checkNotNullParameter(blocklist, "blocklist");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener$setSessionHandlingBlocklist$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("setSessionHandlingBlocklist called with blocklist: ", blocklist);
            }
        }, 2, (Object) null);
        this.sessionHandlingBlocklist = blocklist;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.sessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener$onActivityStarted$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Automatically calling lifecycle method: openSession for class: ", activity.getClass());
                }
            }, 2, (Object) null);
            Braze.Companion companion = Braze.INSTANCE;
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
            companion.getInstance(applicationContext).openSession(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.sessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener$onActivityStopped$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Automatically calling lifecycle method: closeSession for class: ", activity.getClass());
                }
            }, 2, (Object) null);
            Braze.Companion companion = Braze.INSTANCE;
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
            companion.getInstance(applicationContext).closeSession(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.registerInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener$onActivityResumed$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Automatically calling lifecycle method: registerInAppMessageManager for class: ", activity.getClass());
                }
            }, 2, (Object) null);
            BrazeInAppMessageManager.INSTANCE.getInstance().registerInAppMessageManager(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.registerInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener$onActivityPaused$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Automatically calling lifecycle method: unregisterInAppMessageManager for class: ", activity.getClass());
                }
            }, 2, (Object) null);
            BrazeInAppMessageManager.INSTANCE.getInstance().unregisterInAppMessageManager(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(final Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.registerInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener$onActivityCreated$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Automatically calling lifecycle method: ensureSubscribedToInAppMessageEvents for class: ", activity.getClass());
                }
            }, 2, (Object) null);
            BrazeInAppMessageManager companion = BrazeInAppMessageManager.INSTANCE.getInstance();
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
            companion.ensureSubscribedToInAppMessageEvents(applicationContext);
        }
    }

    public final boolean shouldHandleLifecycleMethodsInActivity(Activity activity, boolean forSessionHandling) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Class<?> cls = activity.getClass();
        if (!Intrinsics.areEqual(cls, NotificationTrampolineActivity.class)) {
            return forSessionHandling ? !this.sessionHandlingBlocklist.contains(cls) : !this.inAppMessagingRegistrationBlocklist.contains(cls);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener$shouldHandleLifecycleMethodsInActivity$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Skipping automatic registration for notification trampoline activity class.";
            }
        }, 2, (Object) null);
        return false;
    }

    public final void registerOnApplication(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener$registerOnApplication$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to register this lifecycle callback listener directly against application class";
                }
            });
        }
    }
}
