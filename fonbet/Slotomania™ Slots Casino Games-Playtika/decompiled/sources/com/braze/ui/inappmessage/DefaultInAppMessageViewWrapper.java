package com.braze.ui.inappmessage;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.SlideFrom;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener;
import com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener;
import com.braze.ui.inappmessage.views.IInAppMessageImmersiveView;
import com.braze.ui.inappmessage.views.IInAppMessageView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.support.ViewUtils;
import com.google.android.exoplayer2.RendererCapabilities;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultInAppMessageViewWrapper.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 d2\u00020\u0001:\u0001dBc\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\b\u0010H\u001a\u00020IH\u0016J(\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0014\u0010L\u001a\u00020I2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010NH\u0016J\b\u0010O\u001a\u00020IH\u0016J\b\u0010P\u001a\u00020IH\u0016J\u0010\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u000208H\u0016J\b\u0010T\u001a\u00020UH\u0016J\b\u0010V\u001a\u00020UH\u0016J\b\u0010W\u001a\u00020UH\u0016J\b\u0010X\u001a\u00020YH\u0016J\b\u0010Z\u001a\u00020[H\u0016J \u0010\\\u001a\u00020I2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010]\u001a\u00020^2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010_\u001a\u00020!2\u0006\u0010`\u001a\u00020aH\u0016J\u0010\u0010b\u001a\u00020I2\u0006\u0010`\u001a\u00020aH\u0016J\u0010\u0010c\u001a\u00020I2\u0006\u0010S\u001a\u000208H\u0016R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020/X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001a\u00107\u001a\u000208X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00109\"\u0004\b:\u0010;R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u001dR\u001c\u0010=\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0017\"\u0004\b?\u0010\u0019R6\u0010@\u001a\u001e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020B0Aj\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020B`CX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006e"}, d2 = {"Lcom/braze/ui/inappmessage/DefaultInAppMessageViewWrapper;", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "inAppMessageView", "Landroid/view/View;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessageViewLifecycleListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "openingAnimation", "Landroid/view/animation/Animation;", "closingAnimation", "clickableInAppMessageView", "buttonViews", "", "closeButton", "(Landroid/view/View;Lcom/braze/models/inappmessage/IInAppMessage;Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;Lcom/braze/configuration/BrazeConfigurationProvider;Landroid/view/animation/Animation;Landroid/view/animation/Animation;Landroid/view/View;Ljava/util/List;Landroid/view/View;)V", "getButtonViews", "()Ljava/util/List;", "setButtonViews", "(Ljava/util/List;)V", "getClickableInAppMessageView", "()Landroid/view/View;", "setClickableInAppMessageView", "(Landroid/view/View;)V", "getCloseButton", "setCloseButton", "getClosingAnimation", "()Landroid/view/animation/Animation;", "getConfigurationProvider", "()Lcom/braze/configuration/BrazeConfigurationProvider;", "contentViewGroupParentLayout", "Landroid/view/ViewGroup;", "getContentViewGroupParentLayout", "()Landroid/view/ViewGroup;", "setContentViewGroupParentLayout", "(Landroid/view/ViewGroup;)V", "dismissRunnable", "Ljava/lang/Runnable;", "getDismissRunnable", "()Ljava/lang/Runnable;", "setDismissRunnable", "(Ljava/lang/Runnable;)V", "getInAppMessage", "()Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessageCloser", "Lcom/braze/ui/inappmessage/InAppMessageCloser;", "getInAppMessageCloser$annotations", "()V", "getInAppMessageCloser", "()Lcom/braze/ui/inappmessage/InAppMessageCloser;", "getInAppMessageView", "getInAppMessageViewLifecycleListener", "()Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "isAnimatingClose", "", "()Z", "setAnimatingClose", "(Z)V", "getOpeningAnimation", "previouslyFocusedView", "getPreviouslyFocusedView", "setPreviouslyFocusedView", "viewAccessibilityFlagMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getViewAccessibilityFlagMap", "()Ljava/util/HashMap;", "setViewAccessibilityFlagMap", "(Ljava/util/HashMap;)V", "addDismissRunnable", "", "addInAppMessageViewToViewGroup", "parentViewGroup", "announceForAccessibilityIfNecessary", "fallbackAccessibilityMessage", "", "close", "closeInAppMessageView", "createAnimationListener", "Landroid/view/animation/Animation$AnimationListener;", "opening", "createButtonClickListener", "Landroid/view/View$OnClickListener;", "createClickListener", "createCloseInAppMessageClickListener", "createDismissCallbacks", "Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener$DismissCallbacks;", "createTouchAwareListener", "Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener$ITouchListener;", "finalizeViewBeforeDisplay", "getLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "getParentViewGroup", "activity", "Landroid/app/Activity;", "open", "setAndStartAnimation", k.M, "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public class DefaultInAppMessageViewWrapper implements IInAppMessageViewWrapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private List<? extends View> buttonViews;
    private View clickableInAppMessageView;
    private View closeButton;
    private final Animation closingAnimation;
    private final BrazeConfigurationProvider configurationProvider;
    private ViewGroup contentViewGroupParentLayout;
    private Runnable dismissRunnable;
    private final IInAppMessage inAppMessage;
    private final InAppMessageCloser inAppMessageCloser;
    private final View inAppMessageView;
    private final IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener;
    private boolean isAnimatingClose;
    private final Animation openingAnimation;
    private View previouslyFocusedView;
    private HashMap<Integer, Integer> viewAccessibilityFlagMap;

    /* compiled from: DefaultInAppMessageViewWrapper.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            iArr[MessageType.MODAL.ordinal()] = 1;
            iArr[MessageType.FULL.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultInAppMessageViewWrapper(View inAppMessageView, IInAppMessage inAppMessage, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener, BrazeConfigurationProvider configurationProvider, Animation animation, Animation animation2, View view) {
        this(inAppMessageView, inAppMessage, inAppMessageViewLifecycleListener, configurationProvider, animation, animation2, view, null, null, RendererCapabilities.MODE_SUPPORT_MASK, null);
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultInAppMessageViewWrapper(View inAppMessageView, IInAppMessage inAppMessage, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener, BrazeConfigurationProvider configurationProvider, Animation animation, Animation animation2, View view, List<? extends View> list) {
        this(inAppMessageView, inAppMessage, inAppMessageViewLifecycleListener, configurationProvider, animation, animation2, view, list, null, 256, null);
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
    }

    public static /* synthetic */ void getInAppMessageCloser$annotations() {
    }

    public void addInAppMessageViewToViewGroup(ViewGroup parentViewGroup, IInAppMessage inAppMessage, View inAppMessageView, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener) {
        Logger.d("Braze|SafeDK: Execution> Lcom/braze/ui/inappmessage/DefaultInAppMessageViewWrapper;->addInAppMessageViewToViewGroup(Landroid/view/ViewGroup;Lcom/braze/models/inappmessage/IInAppMessage;Landroid/view/View;Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;)V");
        DetectTouchUtils.viewChangedByExternalLib(parentViewGroup, inAppMessageView);
        safedk_DefaultInAppMessageViewWrapper_addInAppMessageViewToViewGroup_e0d494d3349164e3df9fef7285b178f4(parentViewGroup, inAppMessage, inAppMessageView, inAppMessageViewLifecycleListener);
    }

    public View.OnClickListener createCloseInAppMessageClickListener() {
        return new View.OnClickListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DefaultInAppMessageViewWrapper.m5221createCloseInAppMessageClickListener$lambda5(view);
            }
        };
    }

    public DefaultInAppMessageViewWrapper(View inAppMessageView, IInAppMessage inAppMessage, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener, BrazeConfigurationProvider configurationProvider, Animation animation, Animation animation2, View view, List<? extends View> list, View view2) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.inAppMessageView = inAppMessageView;
        this.inAppMessage = inAppMessage;
        this.inAppMessageViewLifecycleListener = inAppMessageViewLifecycleListener;
        this.configurationProvider = configurationProvider;
        this.openingAnimation = animation;
        this.closingAnimation = animation2;
        this.clickableInAppMessageView = view;
        this.buttonViews = list;
        this.closeButton = view2;
        this.viewAccessibilityFlagMap = new HashMap<>();
        View clickableInAppMessageView = getClickableInAppMessageView();
        setClickableInAppMessageView(clickableInAppMessageView == null ? getInAppMessageView() : clickableInAppMessageView);
        if (getInAppMessage() instanceof InAppMessageSlideup) {
            TouchAwareSwipeDismissTouchListener touchAwareSwipeDismissTouchListener = new TouchAwareSwipeDismissTouchListener(getInAppMessageView(), createDismissCallbacks());
            touchAwareSwipeDismissTouchListener.setTouchListener(createTouchAwareListener());
            View clickableInAppMessageView2 = getClickableInAppMessageView();
            if (clickableInAppMessageView2 != null) {
                clickableInAppMessageView2.setOnTouchListener(touchAwareSwipeDismissTouchListener);
            }
        }
        View clickableInAppMessageView3 = getClickableInAppMessageView();
        if (clickableInAppMessageView3 != null) {
            clickableInAppMessageView3.setOnClickListener(createClickListener());
        }
        this.inAppMessageCloser = new InAppMessageCloser(this);
        View closeButton = getCloseButton();
        if (closeButton != null) {
            closeButton.setOnClickListener(createCloseInAppMessageClickListener());
        }
        List<View> buttonViews = getButtonViews();
        if (buttonViews == null) {
            return;
        }
        Iterator<T> it = buttonViews.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(createButtonClickListener());
        }
    }

    public /* synthetic */ DefaultInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2, List list, View view3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, iInAppMessage, iInAppMessageViewLifecycleListener, brazeConfigurationProvider, animation, animation2, view2, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : view3);
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public View getInAppMessageView() {
        return this.inAppMessageView;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public IInAppMessage getInAppMessage() {
        return this.inAppMessage;
    }

    public IInAppMessageViewLifecycleListener getInAppMessageViewLifecycleListener() {
        return this.inAppMessageViewLifecycleListener;
    }

    public BrazeConfigurationProvider getConfigurationProvider() {
        return this.configurationProvider;
    }

    public Animation getOpeningAnimation() {
        return this.openingAnimation;
    }

    public Animation getClosingAnimation() {
        return this.closingAnimation;
    }

    public View getClickableInAppMessageView() {
        return this.clickableInAppMessageView;
    }

    public void setClickableInAppMessageView(View view) {
        this.clickableInAppMessageView = view;
    }

    public List<View> getButtonViews() {
        return this.buttonViews;
    }

    public void setButtonViews(List<? extends View> list) {
        this.buttonViews = list;
    }

    public View getCloseButton() {
        return this.closeButton;
    }

    public void setCloseButton(View view) {
        this.closeButton = view;
    }

    public InAppMessageCloser getInAppMessageCloser() {
        return this.inAppMessageCloser;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    /* renamed from: isAnimatingClose, reason: from getter */
    public boolean getIsAnimatingClose() {
        return this.isAnimatingClose;
    }

    public void setAnimatingClose(boolean z) {
        this.isAnimatingClose = z;
    }

    public Runnable getDismissRunnable() {
        return this.dismissRunnable;
    }

    public void setDismissRunnable(Runnable runnable) {
        this.dismissRunnable = runnable;
    }

    public View getPreviouslyFocusedView() {
        return this.previouslyFocusedView;
    }

    public void setPreviouslyFocusedView(View view) {
        this.previouslyFocusedView = view;
    }

    public HashMap<Integer, Integer> getViewAccessibilityFlagMap() {
        return this.viewAccessibilityFlagMap;
    }

    public void setViewAccessibilityFlagMap(HashMap<Integer, Integer> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        this.viewAccessibilityFlagMap = hashMap;
    }

    public ViewGroup getContentViewGroupParentLayout() {
        return this.contentViewGroupParentLayout;
    }

    public void setContentViewGroupParentLayout(ViewGroup viewGroup) {
        this.contentViewGroupParentLayout = viewGroup;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public void open(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$open$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Opening in-app message view wrapper";
            }
        }, 2, (Object) null);
        ViewGroup parentViewGroup = getParentViewGroup(activity);
        final int height = parentViewGroup.getHeight();
        if (getConfigurationProvider().isInAppMessageAccessibilityExclusiveModeEnabled()) {
            setContentViewGroupParentLayout(parentViewGroup);
            getViewAccessibilityFlagMap().clear();
            INSTANCE.setAllViewGroupChildrenAsNonAccessibilityImportant(getContentViewGroupParentLayout(), getViewAccessibilityFlagMap());
        }
        setPreviouslyFocusedView(activity.getCurrentFocus());
        if (height == 0) {
            parentViewGroup.addOnLayoutChangeListener(new DefaultInAppMessageViewWrapper$open$2(parentViewGroup, this));
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$open$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Detected root view height of ", Integer.valueOf(height));
                }
            }, 3, (Object) null);
            addInAppMessageViewToViewGroup(parentViewGroup, getInAppMessage(), getInAppMessageView(), getInAppMessageViewLifecycleListener());
        }
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public void close() {
        if (getConfigurationProvider().isInAppMessageAccessibilityExclusiveModeEnabled()) {
            INSTANCE.resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto(getContentViewGroupParentLayout(), getViewAccessibilityFlagMap());
        }
        getInAppMessageView().removeCallbacks(getDismissRunnable());
        getInAppMessageViewLifecycleListener().beforeClosed(getInAppMessageView(), getInAppMessage());
        if (getInAppMessage().getAnimateOut()) {
            setAnimatingClose(true);
            setAndStartAnimation(false);
        } else {
            closeInAppMessageView();
        }
    }

    public ViewGroup getParentViewGroup(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        View findViewById = activity.getWindow().getDecorView().findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(findViewById, "activity.window.decorVie…yId(android.R.id.content)");
        return (ViewGroup) findViewById;
    }

    public ViewGroup.LayoutParams getLayoutParams(IInAppMessage inAppMessage) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (inAppMessage instanceof InAppMessageSlideup) {
            layoutParams.gravity = ((InAppMessageSlideup) inAppMessage).getSlideFrom() == SlideFrom.TOP ? 48 : 80;
        }
        return layoutParams;
    }

    public void safedk_DefaultInAppMessageViewWrapper_addInAppMessageViewToViewGroup_e0d494d3349164e3df9fef7285b178f4(ViewGroup parentViewGroup, IInAppMessage inAppMessage, final View inAppMessageView, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener) {
        Intrinsics.checkNotNullParameter(parentViewGroup, "parentViewGroup");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        inAppMessageViewLifecycleListener.beforeOpened(inAppMessageView, inAppMessage);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$addInAppMessageViewToViewGroup$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Adding In-app message view to parent view group.";
            }
        }, 3, (Object) null);
        parentViewGroup.addView(inAppMessageView, getLayoutParams(inAppMessage));
        if (inAppMessageView instanceof IInAppMessageView) {
            ViewGroup viewGroup = parentViewGroup;
            ViewCompat.requestApplyInsets(viewGroup);
            ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new OnApplyWindowInsetsListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$$ExternalSyntheticLambda2
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    WindowInsetsCompat m5218addInAppMessageViewToViewGroup$lambda1;
                    m5218addInAppMessageViewToViewGroup$lambda1 = DefaultInAppMessageViewWrapper.m5218addInAppMessageViewToViewGroup$lambda1(inAppMessageView, this, view, windowInsetsCompat);
                    return m5218addInAppMessageViewToViewGroup$lambda1;
                }
            });
        }
        if (inAppMessage.getAnimateIn()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$addInAppMessageViewToViewGroup$3
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "In-app message view will animate into the visible area.";
                }
            }, 3, (Object) null);
            setAndStartAnimation(true);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$addInAppMessageViewToViewGroup$4
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "In-app message view will be placed instantly into the visible area.";
                }
            }, 3, (Object) null);
            if (inAppMessage.getDismissType() == DismissType.AUTO_DISMISS) {
                addDismissRunnable();
            }
            finalizeViewBeforeDisplay(inAppMessage, inAppMessageView, inAppMessageViewLifecycleListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: addInAppMessageViewToViewGroup$lambda-1, reason: not valid java name */
    public static final WindowInsetsCompat m5218addInAppMessageViewToViewGroup$lambda1(View inAppMessageView, DefaultInAppMessageViewWrapper this$0, View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "$inAppMessageView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (windowInsetsCompat == null) {
            return windowInsetsCompat;
        }
        IInAppMessageView iInAppMessageView = (IInAppMessageView) inAppMessageView;
        if (!iInAppMessageView.getHasAppliedWindowInsets()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$addInAppMessageViewToViewGroup$2$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Calling applyWindowInsets on in-app message view.";
                }
            }, 2, (Object) null);
            iInAppMessageView.applyWindowInsets(windowInsetsCompat);
            return windowInsetsCompat;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$addInAppMessageViewToViewGroup$2$2
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Not reapplying window insets to in-app message view.";
            }
        }, 3, (Object) null);
        return windowInsetsCompat;
    }

    public static /* synthetic */ void announceForAccessibilityIfNecessary$default(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: announceForAccessibilityIfNecessary");
        }
        if ((i & 1) != 0) {
            str = "In app message displayed.";
        }
        defaultInAppMessageViewWrapper.announceForAccessibilityIfNecessary(str);
    }

    public void announceForAccessibilityIfNecessary(String fallbackAccessibilityMessage) {
        if (getInAppMessageView() instanceof IInAppMessageImmersiveView) {
            String message = getInAppMessage().getMessage();
            if (getInAppMessage() instanceof IInAppMessageImmersive) {
                getInAppMessageView().announceForAccessibility(((Object) ((IInAppMessageImmersive) getInAppMessage()).getHeader()) + " . " + ((Object) message));
                return;
            } else {
                getInAppMessageView().announceForAccessibility(message);
                return;
            }
        }
        if (getInAppMessageView() instanceof InAppMessageHtmlBaseView) {
            getInAppMessageView().announceForAccessibility(fallbackAccessibilityMessage);
        }
    }

    public View.OnClickListener createClickListener() {
        return new View.OnClickListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DefaultInAppMessageViewWrapper.m5220createClickListener$lambda2(DefaultInAppMessageViewWrapper.this, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createClickListener$lambda-2, reason: not valid java name */
    public static final void m5220createClickListener$lambda2(DefaultInAppMessageViewWrapper this$0, View view) {
        List<MessageButton> messageButtons;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IInAppMessage inAppMessage = this$0.getInAppMessage();
        IInAppMessageImmersive iInAppMessageImmersive = inAppMessage instanceof IInAppMessageImmersive ? (IInAppMessageImmersive) inAppMessage : null;
        if ((iInAppMessageImmersive == null || (messageButtons = iInAppMessageImmersive.getMessageButtons()) == null || !messageButtons.isEmpty()) && (this$0.getInAppMessage() instanceof IInAppMessageImmersive)) {
            return;
        }
        this$0.getInAppMessageViewLifecycleListener().onClicked(this$0.getInAppMessageCloser(), this$0.getInAppMessageView(), this$0.getInAppMessage());
    }

    public View.OnClickListener createButtonClickListener() {
        return new View.OnClickListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DefaultInAppMessageViewWrapper.m5219createButtonClickListener$lambda4(DefaultInAppMessageViewWrapper.this, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createButtonClickListener$lambda-4, reason: not valid java name */
    public static final void m5219createButtonClickListener$lambda4(DefaultInAppMessageViewWrapper this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        IInAppMessageImmersive iInAppMessageImmersive = (IInAppMessageImmersive) this$0.getInAppMessage();
        if (iInAppMessageImmersive.getMessageButtons().isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createButtonClickListener$1$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Cannot create button click listener since this in-app message does not have message buttons.";
                }
            }, 3, (Object) null);
            return;
        }
        List<View> buttonViews = this$0.getButtonViews();
        if (buttonViews == null) {
            return;
        }
        for (int i = 0; i < buttonViews.size(); i++) {
            if (view.getId() == buttonViews.get(i).getId()) {
                this$0.getInAppMessageViewLifecycleListener().onButtonClicked(this$0.getInAppMessageCloser(), iInAppMessageImmersive.getMessageButtons().get(i), iInAppMessageImmersive);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createCloseInAppMessageClickListener$lambda-5, reason: not valid java name */
    public static final void m5221createCloseInAppMessageClickListener$lambda5(View view) {
        BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    public void addDismissRunnable() {
        if (getDismissRunnable() == null) {
            setDismissRunnable(new Runnable() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultInAppMessageViewWrapper.m5217addDismissRunnable$lambda6();
                }
            });
            getInAppMessageView().postDelayed(getDismissRunnable(), getInAppMessage().getDurationInMilliseconds());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addDismissRunnable$lambda-6, reason: not valid java name */
    public static final void m5217addDismissRunnable$lambda6() {
        BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    public void setAndStartAnimation(boolean opening) {
        Animation closingAnimation;
        if (opening) {
            closingAnimation = getOpeningAnimation();
        } else {
            closingAnimation = getClosingAnimation();
        }
        if (closingAnimation != null) {
            closingAnimation.setAnimationListener(createAnimationListener(opening));
        }
        getInAppMessageView().clearAnimation();
        getInAppMessageView().setAnimation(closingAnimation);
        if (closingAnimation != null) {
            closingAnimation.startNow();
        }
        getInAppMessageView().invalidate();
    }

    public void closeInAppMessageView() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$closeInAppMessageView$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Closing in-app message view";
            }
        }, 3, (Object) null);
        ViewUtils.removeViewFromParent(getInAppMessageView());
        View inAppMessageView = getInAppMessageView();
        InAppMessageHtmlBaseView inAppMessageHtmlBaseView = inAppMessageView instanceof InAppMessageHtmlBaseView ? (InAppMessageHtmlBaseView) inAppMessageView : null;
        if (inAppMessageHtmlBaseView != null) {
            inAppMessageHtmlBaseView.finishWebViewDisplay();
        }
        if (getPreviouslyFocusedView() != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$closeInAppMessageView$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Returning focus to view after closing message. View: ", DefaultInAppMessageViewWrapper.this.getPreviouslyFocusedView());
                }
            }, 3, (Object) null);
            View previouslyFocusedView = getPreviouslyFocusedView();
            if (previouslyFocusedView != null) {
                previouslyFocusedView.requestFocus();
            }
        }
        getInAppMessageViewLifecycleListener().afterClosed(getInAppMessage());
    }

    public void finalizeViewBeforeDisplay(IInAppMessage inAppMessage, View inAppMessageView, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        if (ViewUtils.isDeviceNotInTouchMode(inAppMessageView)) {
            int i = WhenMappings.$EnumSwitchMapping$0[inAppMessage.getMessageType().ordinal()];
            if (i != 1 && i != 2) {
                ViewUtils.setFocusableInTouchModeAndRequestFocus(inAppMessageView);
            }
        } else {
            ViewUtils.setFocusableInTouchModeAndRequestFocus(inAppMessageView);
        }
        announceForAccessibilityIfNecessary$default(this, null, 1, null);
        inAppMessageViewLifecycleListener.afterOpened(inAppMessageView, inAppMessage);
    }

    public SwipeDismissTouchListener.DismissCallbacks createDismissCallbacks() {
        return new SwipeDismissTouchListener.DismissCallbacks() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createDismissCallbacks$1
            @Override // com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks
            public boolean canDismiss(Object token) {
                return true;
            }

            @Override // com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks
            public void onDismiss(View view, Object token) {
                Intrinsics.checkNotNullParameter(view, "view");
                DefaultInAppMessageViewWrapper.this.getInAppMessage().setAnimateOut(false);
                BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
            }
        };
    }

    public TouchAwareSwipeDismissTouchListener.ITouchListener createTouchAwareListener() {
        return new TouchAwareSwipeDismissTouchListener.ITouchListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createTouchAwareListener$1
            @Override // com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener
            public void onTouchEnded() {
            }

            @Override // com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener
            public void onTouchStartedOrContinued() {
            }
        };
    }

    public Animation.AnimationListener createAnimationListener(boolean opening) {
        if (opening) {
            return new Animation.AnimationListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createAnimationListener$1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    if (DefaultInAppMessageViewWrapper.this.getInAppMessage().getDismissType() == DismissType.AUTO_DISMISS) {
                        DefaultInAppMessageViewWrapper.this.addDismissRunnable();
                    }
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createAnimationListener$1$onAnimationEnd$1
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "In-app message animated into view.";
                        }
                    }, 3, (Object) null);
                    DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper = DefaultInAppMessageViewWrapper.this;
                    defaultInAppMessageViewWrapper.finalizeViewBeforeDisplay(defaultInAppMessageViewWrapper.getInAppMessage(), DefaultInAppMessageViewWrapper.this.getInAppMessageView(), DefaultInAppMessageViewWrapper.this.getInAppMessageViewLifecycleListener());
                }
            };
        }
        return new Animation.AnimationListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createAnimationListener$2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                DefaultInAppMessageViewWrapper.this.getInAppMessageView().clearAnimation();
                DefaultInAppMessageViewWrapper.this.getInAppMessageView().setVisibility(8);
                DefaultInAppMessageViewWrapper.this.closeInAppMessageView();
            }
        };
    }

    /* compiled from: DefaultInAppMessageViewWrapper.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bJ$\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000b¨\u0006\f"}, d2 = {"Lcom/braze/ui/inappmessage/DefaultInAppMessageViewWrapper$Companion;", "", "()V", "resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto", "", "viewGroup", "Landroid/view/ViewGroup;", "viewAccessibilityFlagMap", "", "", "setAllViewGroupChildrenAsNonAccessibilityImportant", "", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void setAllViewGroupChildrenAsNonAccessibilityImportant(ViewGroup viewGroup, Map<Integer, Integer> viewAccessibilityFlagMap) {
            Intrinsics.checkNotNullParameter(viewAccessibilityFlagMap, "viewAccessibilityFlagMap");
            if (viewGroup == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$Companion$setAllViewGroupChildrenAsNonAccessibilityImportant$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "In-app message ViewGroup was null. Not preparing in-app message accessibility for exclusive mode.";
                    }
                }, 2, (Object) null);
                return;
            }
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (i < childCount) {
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    viewAccessibilityFlagMap.put(Integer.valueOf(childAt.getId()), Integer.valueOf(childAt.getImportantForAccessibility()));
                    ViewCompat.setImportantForAccessibility(childAt, 4);
                }
                i = i2;
            }
        }

        public final void resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto(ViewGroup viewGroup, Map<Integer, Integer> viewAccessibilityFlagMap) {
            Intrinsics.checkNotNullParameter(viewAccessibilityFlagMap, "viewAccessibilityFlagMap");
            if (viewGroup == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$Companion$resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "In-app message ViewGroup was null. Not resetting in-app message accessibility for exclusive mode.";
                    }
                }, 2, (Object) null);
                return;
            }
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (i < childCount) {
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    int id = childAt.getId();
                    if (viewAccessibilityFlagMap.containsKey(Integer.valueOf(id))) {
                        Integer num = viewAccessibilityFlagMap.get(Integer.valueOf(id));
                        if (num != null) {
                            ViewCompat.setImportantForAccessibility(childAt, num.intValue());
                        }
                    } else {
                        ViewCompat.setImportantForAccessibility(childAt, 0);
                    }
                }
                i = i2;
            }
        }
    }
}
