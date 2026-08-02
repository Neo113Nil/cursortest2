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
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InAppMessageManagerBase.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010A\u001a\u0004\u0018\u00010\u00162\u0006\u0010B\u001a\u00020CH\u0016J\u0012\u0010D\u001a\u0004\u0018\u00010\u00162\u0006\u0010B\u001a\u00020CH\u0016J\u0010\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u001dH\u0016J\u0010\u0010H\u001a\u00020F2\u0006\u0010I\u001a\u00020\u001dH\u0016J\u0012\u0010J\u001a\u00020F2\b\u0010.\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010K\u001a\u00020F2\b\u0010$\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010L\u001a\u00020F2\b\u0010'\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010M\u001a\u00020F2\b\u0010.\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010N\u001a\u00020F2\b\u0010O\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010P\u001a\u00020F2\b\u00102\u001a\u0004\u0018\u00010\u0018H\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u000e\u0010#\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u000eR\u000e\u00100\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u001fR\u001a\u00108\u001a\u0004\u0018\u00010\u00048\u0004@\u0004X\u0085\u000e¢\u0006\b\n\u0000\u0012\u0004\b9\u0010\u0002R\u001a\u0010:\u001a\u0004\u0018\u00010\b8\u0004@\u0004X\u0085\u000e¢\u0006\b\n\u0000\u0012\u0004\b;\u0010\u0002R$\u0010=\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u001d@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001f\"\u0004\b?\u0010@¨\u0006Q"}, d2 = {"Lcom/braze/ui/inappmessage/InAppMessageManagerBase;", "", "()V", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "applicationContext", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "controlInAppMessageManagerListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;", "getControlInAppMessageManagerListener", "()Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;", "customControlInAppMessageManagerListener", "customHtmlInAppMessageActionListener", "Lcom/braze/ui/inappmessage/listeners/IHtmlInAppMessageActionListener;", "customInAppMessageAnimationFactory", "Lcom/braze/ui/inappmessage/IInAppMessageAnimationFactory;", "customInAppMessageManagerListener", "customInAppMessageViewFactory", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "customInAppMessageViewWrapperFactory", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapperFactory;", "defaultHtmlInAppMessageActionListener", "defaultInAppMessageManagerListener", "defaultInAppMessageViewWrapperFactory", "doesBackButtonDismissInAppMessageView", "", "getDoesBackButtonDismissInAppMessageView", "()Z", "doesBackButtonDismissInAppMessageViewField", "doesClickOutsideModalViewDismissInAppMessageView", "getDoesClickOutsideModalViewDismissInAppMessageView", "doesClickOutsideModalViewDismissInAppMessageViewField", "htmlInAppMessageActionListener", "getHtmlInAppMessageActionListener", "()Lcom/braze/ui/inappmessage/listeners/IHtmlInAppMessageActionListener;", "inAppMessageAnimationFactory", "getInAppMessageAnimationFactory", "()Lcom/braze/ui/inappmessage/IInAppMessageAnimationFactory;", "inAppMessageAnimationFactoryField", "inAppMessageFullViewFactory", "inAppMessageHtmlFullViewFactory", "inAppMessageHtmlViewFactory", "inAppMessageManagerListener", "getInAppMessageManagerListener", "inAppMessageModalViewFactory", "inAppMessageSlideupViewFactory", "inAppMessageViewWrapperFactory", "getInAppMessageViewWrapperFactory", "()Lcom/braze/ui/inappmessage/IInAppMessageViewWrapperFactory;", "inAppMessageWebViewClientListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "isActivitySet", "mActivity", "getMActivity$annotations", "mApplicationContext", "getMApplicationContext$annotations", "shouldSkip", "shouldNextUnregisterBeSkipped", "getShouldNextUnregisterBeSkipped", "setShouldNextUnregisterBeSkipped", "(Z)V", "getDefaultInAppMessageViewFactory", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "getInAppMessageViewFactory", "setBackButtonDismissesInAppMessageView", "", "backButtonDismissesInAppMessageView", "setClickOutsideModalViewDismissInAppMessageView", "doesDismiss", "setCustomControlInAppMessageManagerListener", "setCustomHtmlInAppMessageActionListener", "setCustomInAppMessageAnimationFactory", "setCustomInAppMessageManagerListener", "setCustomInAppMessageViewFactory", "inAppMessageViewFactory", "setCustomInAppMessageViewWrapperFactory", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
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
    protected Activity mActivity;
    protected Context mApplicationContext;
    private boolean shouldNextUnregisterBeSkipped;

    /* compiled from: InAppMessageManagerBase.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            iArr[MessageType.SLIDEUP.ordinal()] = 1;
            iArr[MessageType.MODAL.ordinal()] = 2;
            iArr[MessageType.FULL.ordinal()] = 3;
            iArr[MessageType.HTML_FULL.ordinal()] = 4;
            iArr[MessageType.HTML.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
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

    public void setShouldNextUnregisterBeSkipped(final boolean z) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase$shouldNextUnregisterBeSkipped$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Setting setShouldNextUnregisterBeSkipped to ", Boolean.valueOf(z));
            }
        }, 3, (Object) null);
        this.shouldNextUnregisterBeSkipped = z;
    }

    /* renamed from: getDoesBackButtonDismissInAppMessageView, reason: from getter */
    public boolean getDoesBackButtonDismissInAppMessageViewField() {
        return this.doesBackButtonDismissInAppMessageViewField;
    }

    /* renamed from: getActivity, reason: from getter */
    public Activity getMActivity() {
        return this.mActivity;
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
        return getMActivity() != null;
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
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase$getDefaultInAppMessageViewFactory$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Failed to find view factory for in-app message with type: ", IInAppMessage.this.getMessageType());
            }
        }, 2, (Object) null);
        return null;
    }

    public IInAppMessageViewFactory getInAppMessageViewFactory(IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        IInAppMessageViewFactory iInAppMessageViewFactory = this.customInAppMessageViewFactory;
        return iInAppMessageViewFactory == null ? getDefaultInAppMessageViewFactory(inAppMessage) : iInAppMessageViewFactory;
    }

    public void setBackButtonDismissesInAppMessageView(final boolean backButtonDismissesInAppMessageView) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase$setBackButtonDismissesInAppMessageView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("In-App Message back button dismissal set to ", Boolean.valueOf(backButtonDismissesInAppMessageView));
            }
        }, 3, (Object) null);
        this.doesBackButtonDismissInAppMessageViewField = backButtonDismissesInAppMessageView;
    }

    public void setClickOutsideModalViewDismissInAppMessageView(final boolean doesDismiss) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase$setClickOutsideModalViewDismissInAppMessageView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Modal In-App Message outside tap dismissal set to ", Boolean.valueOf(doesDismiss));
            }
        }, 3, (Object) null);
        this.doesClickOutsideModalViewDismissInAppMessageViewField = doesDismiss;
    }

    public void setCustomInAppMessageManagerListener(IInAppMessageManagerListener inAppMessageManagerListener) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase$setCustomInAppMessageManagerListener$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Custom InAppMessageManagerListener set";
            }
        }, 3, (Object) null);
        this.customInAppMessageManagerListener = inAppMessageManagerListener;
    }

    public void setCustomControlInAppMessageManagerListener(IInAppMessageManagerListener inAppMessageManagerListener) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase$setCustomControlInAppMessageManagerListener$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Custom ControlInAppMessageManagerListener set. This listener will only be used for control in-app messages.";
            }
        }, 3, (Object) null);
        this.customControlInAppMessageManagerListener = inAppMessageManagerListener;
    }

    public void setCustomHtmlInAppMessageActionListener(IHtmlInAppMessageActionListener htmlInAppMessageActionListener) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase$setCustomHtmlInAppMessageActionListener$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Custom htmlInAppMessageActionListener set";
            }
        }, 3, (Object) null);
        this.customHtmlInAppMessageActionListener = htmlInAppMessageActionListener;
    }

    public void setCustomInAppMessageAnimationFactory(IInAppMessageAnimationFactory inAppMessageAnimationFactory) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase$setCustomInAppMessageAnimationFactory$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Custom InAppMessageAnimationFactory set";
            }
        }, 3, (Object) null);
        this.customInAppMessageAnimationFactory = inAppMessageAnimationFactory;
    }

    public void setCustomInAppMessageViewFactory(IInAppMessageViewFactory inAppMessageViewFactory) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase$setCustomInAppMessageViewFactory$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Custom InAppMessageViewFactory set";
            }
        }, 3, (Object) null);
        this.customInAppMessageViewFactory = inAppMessageViewFactory;
    }

    public void setCustomInAppMessageViewWrapperFactory(IInAppMessageViewWrapperFactory inAppMessageViewWrapperFactory) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.InAppMessageManagerBase$setCustomInAppMessageViewWrapperFactory$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Custom IInAppMessageViewWrapperFactory set";
            }
        }, 3, (Object) null);
        this.customInAppMessageViewWrapperFactory = inAppMessageViewWrapperFactory;
    }
}
