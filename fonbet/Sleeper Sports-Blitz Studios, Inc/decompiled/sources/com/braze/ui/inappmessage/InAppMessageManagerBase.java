package com.braze.ui.inappmessage;

import android.app.Activity;
import android.content.Context;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageAnimationFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageFullViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlFullViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageModalViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageSlideupViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageViewWrapperFactory;
import com.braze.ui.inappmessage.listeners.DefaultHtmlInAppMessageActionListener;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageManagerListener;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.listeners.IHtmlInAppMessageActionListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import io.radar.sdk.RadarTrackingOptions;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InAppMessageManagerBase.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010F\u001a\u0004\u0018\u00010&2\u0006\u0010G\u001a\u00020HH\u0016J\u0012\u0010I\u001a\u0004\u0018\u00010&2\u0006\u0010G\u001a\u00020HH\u0016J\u0010\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0005H\u0016J\u0010\u0010M\u001a\u00020K2\u0006\u0010N\u001a\u00020\u0005H\u0016J\u0012\u0010O\u001a\u00020K2\b\u00107\u001a\u0004\u0018\u00010.H\u0016J\u0012\u0010P\u001a\u00020K2\b\u00107\u001a\u0004\u0018\u00010.H\u0016J\u0012\u0010Q\u001a\u00020K2\b\u0010<\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010R\u001a\u00020K2\b\u0010B\u001a\u0004\u0018\u00010,H\u0016J\u0012\u0010S\u001a\u00020K2\b\u0010T\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010U\u001a\u00020K2\b\u0010?\u001a\u0004\u0018\u000100H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R$\u0010\u0010\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\rR \u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0004@\u0004X\u0085\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0003R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0004@\u0004X\u0085\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u0003R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00109R\u0014\u0010<\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010?\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u0007¨\u0006V"}, d2 = {"Lcom/braze/ui/inappmessage/InAppMessageManagerBase;", "", "<init>", "()V", "doesClickOutsideModalViewDismissInAppMessageView", "", "getDoesClickOutsideModalViewDismissInAppMessageView", "()Z", "doesClickOutsideModalViewDismissInAppMessageViewField", "shouldSkip", "shouldNextUnregisterBeSkipped", "getShouldNextUnregisterBeSkipped", "setShouldNextUnregisterBeSkipped", "(Z)V", "doesBackButtonDismissInAppMessageView", "getDoesBackButtonDismissInAppMessageView", "doesBackButtonDismissInAppMessageViewField", "getDoesBackButtonDismissInAppMessageViewField$android_sdk_ui_release$annotations", "getDoesBackButtonDismissInAppMessageViewField$android_sdk_ui_release", "setDoesBackButtonDismissInAppMessageViewField$android_sdk_ui_release", "mActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "getMActivity$annotations", "mApplicationContext", "Landroid/content/Context;", "getMApplicationContext$annotations", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "getActivity", "()Landroid/app/Activity;", "applicationContext", "getApplicationContext", "()Landroid/content/Context;", "inAppMessageWebViewClientListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "defaultHtmlInAppMessageActionListener", "Lcom/braze/ui/inappmessage/listeners/IHtmlInAppMessageActionListener;", "inAppMessageSlideupViewFactory", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "inAppMessageModalViewFactory", "inAppMessageFullViewFactory", "inAppMessageHtmlFullViewFactory", "inAppMessageHtmlViewFactory", "inAppMessageAnimationFactoryField", "Lcom/braze/ui/inappmessage/IInAppMessageAnimationFactory;", "defaultInAppMessageManagerListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;", "defaultInAppMessageViewWrapperFactory", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapperFactory;", "customInAppMessageViewFactory", "customInAppMessageAnimationFactory", "customInAppMessageManagerListener", "customInAppMessageViewWrapperFactory", "customHtmlInAppMessageActionListener", "customControlInAppMessageManagerListener", "inAppMessageManagerListener", "getInAppMessageManagerListener", "()Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;", "controlInAppMessageManagerListener", "getControlInAppMessageManagerListener", "htmlInAppMessageActionListener", "getHtmlInAppMessageActionListener", "()Lcom/braze/ui/inappmessage/listeners/IHtmlInAppMessageActionListener;", "inAppMessageViewWrapperFactory", "getInAppMessageViewWrapperFactory", "()Lcom/braze/ui/inappmessage/IInAppMessageViewWrapperFactory;", "inAppMessageAnimationFactory", "getInAppMessageAnimationFactory", "()Lcom/braze/ui/inappmessage/IInAppMessageAnimationFactory;", "isActivitySet", "getDefaultInAppMessageViewFactory", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "getInAppMessageViewFactory", "setBackButtonDismissesInAppMessageView", "", "backButtonDismissesInAppMessageView", "setClickOutsideModalViewDismissInAppMessageView", "doesDismiss", "setCustomInAppMessageManagerListener", "setCustomControlInAppMessageManagerListener", "setCustomHtmlInAppMessageActionListener", "setCustomInAppMessageAnimationFactory", "setCustomInAppMessageViewFactory", "inAppMessageViewFactory", "setCustomInAppMessageViewWrapperFactory", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class InAppMessageManagerBase {
    private IInAppMessageManagerListener customControlInAppMessageManagerListener;
    private IHtmlInAppMessageActionListener customHtmlInAppMessageActionListener;
    private IInAppMessageAnimationFactory customInAppMessageAnimationFactory;
    private IInAppMessageManagerListener customInAppMessageManagerListener;
    private IInAppMessageViewFactory customInAppMessageViewFactory;
    private IInAppMessageViewWrapperFactory customInAppMessageViewWrapperFactory;
    private final IHtmlInAppMessageActionListener defaultHtmlInAppMessageActionListener;
    private final IInAppMessageManagerListener defaultInAppMessageManagerListener;
    private final IInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory;
    private boolean doesBackButtonDismissInAppMessageViewField = true;
    private boolean doesClickOutsideModalViewDismissInAppMessageViewField;
    private final IInAppMessageAnimationFactory inAppMessageAnimationFactoryField;
    private final IInAppMessageViewFactory inAppMessageFullViewFactory;
    private final IInAppMessageViewFactory inAppMessageHtmlFullViewFactory;
    private final IInAppMessageViewFactory inAppMessageHtmlViewFactory;
    private final IInAppMessageViewFactory inAppMessageModalViewFactory;
    private final IInAppMessageViewFactory inAppMessageSlideupViewFactory;
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;
    protected WeakReference<Activity> mActivity;
    protected Context mApplicationContext;
    private boolean shouldNextUnregisterBeSkipped;

    /* compiled from: InAppMessageManagerBase.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.SLIDEUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getDoesBackButtonDismissInAppMessageViewField$android_sdk_ui_release$annotations() {
    }

    protected static /* synthetic */ void getMActivity$annotations() {
    }

    protected static /* synthetic */ void getMApplicationContext$annotations() {
    }

    public InAppMessageManagerBase() {
        DefaultInAppMessageWebViewClientListener defaultInAppMessageWebViewClientListener = new DefaultInAppMessageWebViewClientListener();
        this.inAppMessageWebViewClientListener = defaultInAppMessageWebViewClientListener;
        this.defaultHtmlInAppMessageActionListener = new DefaultHtmlInAppMessageActionListener();
        this.inAppMessageSlideupViewFactory = new DefaultInAppMessageSlideupViewFactory();
        this.inAppMessageModalViewFactory = new DefaultInAppMessageModalViewFactory();
        this.inAppMessageFullViewFactory = new DefaultInAppMessageFullViewFactory();
        this.inAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory(defaultInAppMessageWebViewClientListener);
        this.inAppMessageHtmlViewFactory = new DefaultInAppMessageHtmlViewFactory(defaultInAppMessageWebViewClientListener);
        this.inAppMessageAnimationFactoryField = new DefaultInAppMessageAnimationFactory();
        this.defaultInAppMessageManagerListener = new DefaultInAppMessageManagerListener();
        this.defaultInAppMessageViewWrapperFactory = new DefaultInAppMessageViewWrapperFactory();
    }

    /* renamed from: getDoesClickOutsideModalViewDismissInAppMessageView, reason: from getter */
    public boolean getDoesClickOutsideModalViewDismissInAppMessageViewField() {
        return this.doesClickOutsideModalViewDismissInAppMessageViewField;
    }

    public boolean getShouldNextUnregisterBeSkipped() {
        return this.shouldNextUnregisterBeSkipped;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_shouldNextUnregisterBeSkipped_$lambda$0(boolean z) {
        return "Setting setShouldNextUnregisterBeSkipped to " + z;
    }

    public void setShouldNextUnregisterBeSkipped(final boolean z) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _set_shouldNextUnregisterBeSkipped_$lambda$0;
                _set_shouldNextUnregisterBeSkipped_$lambda$0 = InAppMessageManagerBase._set_shouldNextUnregisterBeSkipped_$lambda$0(z);
                return _set_shouldNextUnregisterBeSkipped_$lambda$0;
            }
        }, 7, (Object) null);
        this.shouldNextUnregisterBeSkipped = z;
    }

    /* renamed from: getDoesBackButtonDismissInAppMessageView, reason: from getter */
    public boolean getDoesBackButtonDismissInAppMessageViewField() {
        return this.doesBackButtonDismissInAppMessageViewField;
    }

    public final boolean getDoesBackButtonDismissInAppMessageViewField$android_sdk_ui_release() {
        return this.doesBackButtonDismissInAppMessageViewField;
    }

    public final void setDoesBackButtonDismissInAppMessageViewField$android_sdk_ui_release(boolean z) {
        this.doesBackButtonDismissInAppMessageViewField = z;
    }

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.mActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: getApplicationContext, reason: from getter */
    public Context getMApplicationContext() {
        return this.mApplicationContext;
    }

    public IInAppMessageManagerListener getInAppMessageManagerListener() {
        IInAppMessageManagerListener iInAppMessageManagerListener = this.customInAppMessageManagerListener;
        return iInAppMessageManagerListener == null ? this.defaultInAppMessageManagerListener : iInAppMessageManagerListener;
    }

    public IInAppMessageManagerListener getControlInAppMessageManagerListener() {
        IInAppMessageManagerListener iInAppMessageManagerListener = this.customControlInAppMessageManagerListener;
        return iInAppMessageManagerListener == null ? this.defaultInAppMessageManagerListener : iInAppMessageManagerListener;
    }

    public IHtmlInAppMessageActionListener getHtmlInAppMessageActionListener() {
        IHtmlInAppMessageActionListener iHtmlInAppMessageActionListener = this.customHtmlInAppMessageActionListener;
        return iHtmlInAppMessageActionListener == null ? this.defaultHtmlInAppMessageActionListener : iHtmlInAppMessageActionListener;
    }

    public IInAppMessageViewWrapperFactory getInAppMessageViewWrapperFactory() {
        IInAppMessageViewWrapperFactory iInAppMessageViewWrapperFactory = this.customInAppMessageViewWrapperFactory;
        return iInAppMessageViewWrapperFactory == null ? this.defaultInAppMessageViewWrapperFactory : iInAppMessageViewWrapperFactory;
    }

    public IInAppMessageAnimationFactory getInAppMessageAnimationFactory() {
        IInAppMessageAnimationFactory iInAppMessageAnimationFactory = this.customInAppMessageAnimationFactory;
        return iInAppMessageAnimationFactory == null ? this.inAppMessageAnimationFactoryField : iInAppMessageAnimationFactory;
    }

    public boolean isActivitySet() {
        return getActivity() != null;
    }

    public IInAppMessageViewFactory getDefaultInAppMessageViewFactory(final IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        int i = WhenMappings.$EnumSwitchMapping$0[inAppMessage.getMessageType().ordinal()];
        if (i == 1) {
            return this.inAppMessageSlideupViewFactory;
        }
        if (i == 2) {
            return this.inAppMessageModalViewFactory;
        }
        if (i == 3) {
            return this.inAppMessageFullViewFactory;
        }
        if (i == 4) {
            return this.inAppMessageHtmlFullViewFactory;
        }
        if (i == 5) {
            return this.inAppMessageHtmlViewFactory;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String defaultInAppMessageViewFactory$lambda$1;
                defaultInAppMessageViewFactory$lambda$1 = InAppMessageManagerBase.getDefaultInAppMessageViewFactory$lambda$1(IInAppMessage.this);
                return defaultInAppMessageViewFactory$lambda$1;
            }
        }, 6, (Object) null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDefaultInAppMessageViewFactory$lambda$1(IInAppMessage iInAppMessage) {
        return "Failed to find view factory for in-app message with type: " + iInAppMessage.getMessageType();
    }

    public IInAppMessageViewFactory getInAppMessageViewFactory(IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        IInAppMessageViewFactory iInAppMessageViewFactory = this.customInAppMessageViewFactory;
        return iInAppMessageViewFactory == null ? getDefaultInAppMessageViewFactory(inAppMessage) : iInAppMessageViewFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setBackButtonDismissesInAppMessageView$lambda$2(boolean z) {
        return "In-App Message back button dismissal set to " + z;
    }

    public void setBackButtonDismissesInAppMessageView(final boolean backButtonDismissesInAppMessageView) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String backButtonDismissesInAppMessageView$lambda$2;
                backButtonDismissesInAppMessageView$lambda$2 = InAppMessageManagerBase.setBackButtonDismissesInAppMessageView$lambda$2(backButtonDismissesInAppMessageView);
                return backButtonDismissesInAppMessageView$lambda$2;
            }
        }, 7, (Object) null);
        this.doesBackButtonDismissInAppMessageViewField = backButtonDismissesInAppMessageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setClickOutsideModalViewDismissInAppMessageView$lambda$3(boolean z) {
        return "Modal In-App Message outside tap dismissal set to " + z;
    }

    public void setClickOutsideModalViewDismissInAppMessageView(final boolean doesDismiss) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String clickOutsideModalViewDismissInAppMessageView$lambda$3;
                clickOutsideModalViewDismissInAppMessageView$lambda$3 = InAppMessageManagerBase.setClickOutsideModalViewDismissInAppMessageView$lambda$3(doesDismiss);
                return clickOutsideModalViewDismissInAppMessageView$lambda$3;
            }
        }, 7, (Object) null);
        this.doesClickOutsideModalViewDismissInAppMessageViewField = doesDismiss;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomInAppMessageManagerListener$lambda$4() {
        return "Custom InAppMessageManagerListener set";
    }

    public void setCustomInAppMessageManagerListener(IInAppMessageManagerListener inAppMessageManagerListener) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String customInAppMessageManagerListener$lambda$4;
                customInAppMessageManagerListener$lambda$4 = InAppMessageManagerBase.setCustomInAppMessageManagerListener$lambda$4();
                return customInAppMessageManagerListener$lambda$4;
            }
        }, 7, (Object) null);
        this.customInAppMessageManagerListener = inAppMessageManagerListener;
    }

    public void setCustomControlInAppMessageManagerListener(IInAppMessageManagerListener inAppMessageManagerListener) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String customControlInAppMessageManagerListener$lambda$5;
                customControlInAppMessageManagerListener$lambda$5 = InAppMessageManagerBase.setCustomControlInAppMessageManagerListener$lambda$5();
                return customControlInAppMessageManagerListener$lambda$5;
            }
        }, 7, (Object) null);
        this.customControlInAppMessageManagerListener = inAppMessageManagerListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomControlInAppMessageManagerListener$lambda$5() {
        return "Custom ControlInAppMessageManagerListener set. This listener will only be used for control in-app messages.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomHtmlInAppMessageActionListener$lambda$6() {
        return "Custom htmlInAppMessageActionListener set";
    }

    public void setCustomHtmlInAppMessageActionListener(IHtmlInAppMessageActionListener htmlInAppMessageActionListener) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String customHtmlInAppMessageActionListener$lambda$6;
                customHtmlInAppMessageActionListener$lambda$6 = InAppMessageManagerBase.setCustomHtmlInAppMessageActionListener$lambda$6();
                return customHtmlInAppMessageActionListener$lambda$6;
            }
        }, 7, (Object) null);
        this.customHtmlInAppMessageActionListener = htmlInAppMessageActionListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomInAppMessageAnimationFactory$lambda$7() {
        return "Custom InAppMessageAnimationFactory set";
    }

    public void setCustomInAppMessageAnimationFactory(IInAppMessageAnimationFactory inAppMessageAnimationFactory) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String customInAppMessageAnimationFactory$lambda$7;
                customInAppMessageAnimationFactory$lambda$7 = InAppMessageManagerBase.setCustomInAppMessageAnimationFactory$lambda$7();
                return customInAppMessageAnimationFactory$lambda$7;
            }
        }, 7, (Object) null);
        this.customInAppMessageAnimationFactory = inAppMessageAnimationFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomInAppMessageViewFactory$lambda$8() {
        return "Custom InAppMessageViewFactory set";
    }

    public void setCustomInAppMessageViewFactory(IInAppMessageViewFactory inAppMessageViewFactory) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String customInAppMessageViewFactory$lambda$8;
                customInAppMessageViewFactory$lambda$8 = InAppMessageManagerBase.setCustomInAppMessageViewFactory$lambda$8();
                return customInAppMessageViewFactory$lambda$8;
            }
        }, 7, (Object) null);
        this.customInAppMessageViewFactory = inAppMessageViewFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomInAppMessageViewWrapperFactory$lambda$9() {
        return "Custom IInAppMessageViewWrapperFactory set";
    }

    public void setCustomInAppMessageViewWrapperFactory(IInAppMessageViewWrapperFactory inAppMessageViewWrapperFactory) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String customInAppMessageViewWrapperFactory$lambda$9;
                customInAppMessageViewWrapperFactory$lambda$9 = InAppMessageManagerBase.setCustomInAppMessageViewWrapperFactory$lambda$9();
                return customInAppMessageViewWrapperFactory$lambda$9;
            }
        }, 7, (Object) null);
        this.customInAppMessageViewWrapperFactory = inAppMessageViewWrapperFactory;
    }
}
