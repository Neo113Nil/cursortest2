package ru.ozon.app.android.product.addToCart.presentation.likezone;

import B0.C2454a;
import C.o0;
import Kk.C3532b;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.app.android.storefront.data.tiles.addtocart.likezone.FamilyButtonDTO;
import ru.ozon.app.android.storefrontcommonwidgets.utils.Dimens;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u008e\u00012\u00020\u0001:\u000e\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\u001cJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010 J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b#\u0010\u001cJ!\u0010&\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\nH\u0002¢\u0006\u0004\b.\u0010\fJ\u000f\u0010/\u001a\u00020\nH\u0002¢\u0006\u0004\b/\u0010\fJ\u000f\u00100\u001a\u00020\nH\u0002¢\u0006\u0004\b0\u0010\fJ\u000f\u00101\u001a\u00020\nH\u0002¢\u0006\u0004\b1\u0010\fJ\u0017\u00103\u001a\u00020\n2\u0006\u00102\u001a\u00020\rH\u0002¢\u0006\u0004\b3\u00104J!\u00106\u001a\u00020\n2\u0006\u00102\u001a\u00020\u000f2\b\b\u0002\u00105\u001a\u00020\u0011H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\n2\u0006\u00108\u001a\u00020\u0006H\u0002¢\u0006\u0004\b9\u0010:J\u0013\u0010;\u001a\u00020\u0011*\u00020\rH\u0002¢\u0006\u0004\b;\u0010<J\u0013\u0010;\u001a\u00020\u0011*\u00020\u000fH\u0002¢\u0006\u0004\b;\u0010=J\u000f\u0010>\u001a\u00020\nH\u0002¢\u0006\u0004\b>\u0010\fJ\u000f\u0010?\u001a\u00020\u0011H\u0002¢\u0006\u0004\b?\u0010@R$\u0010A\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u00104R$\u0010F\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010)R$\u0010L\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010S\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001b\u0010]\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010e\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u001b\u0010i\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010Z\u001a\u0004\bh\u0010\\R\u0016\u0010j\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u001b\u0010o\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010Z\u001a\u0004\bm\u0010nR\u001b\u0010t\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010Z\u001a\u0004\br\u0010sR\u001b\u0010y\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010Z\u001a\u0004\bw\u0010xR#\u0010\u007f\u001a\n {*\u0004\u0018\u00010z0z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u0010Z\u001a\u0004\b}\u0010~R&\u0010\u0082\u0001\u001a\n {*\u0004\u0018\u00010z0z8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010Z\u001a\u0005\b\u0081\u0001\u0010~R&\u0010\u0085\u0001\u001a\n {*\u0004\u0018\u00010z0z8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010Z\u001a\u0005\b\u0084\u0001\u0010~R&\u0010\u0088\u0001\u001a\n {*\u0004\u0018\u00010z0z8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010Z\u001a\u0005\b\u0087\u0001\u0010~R \u0010\u008d\u0001\u001a\u00030\u0089\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008a\u0001\u0010Z\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u0095\u0001"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onDetachedFromWindow", "()V", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;", "personalCartData", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;", "familyCartData", "", "isAnimationAllowed", "bind", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;Z)V", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$ContainerMode$Personal;", "personalMode", "bindFromBothToPersonalWithAnimation", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$ContainerMode$Personal;)V", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$ContainerMode$BothButtons;", "bothButtonsMode", "bindFromPersonalToBothWithAnimation", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$ContainerMode$BothButtons;)V", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$ContainerMode$Family;", "familyMode", "bindFromBothToFamilyWithAnimation", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$ContainerMode$Family;)V", "bindFromFamilyToBothWithAnimation", "bindFamilyButtonWithStretchAnimation", "bindFamilyButtonWithShrinkAnimation", "", "duration", "bindPersonalButtonWithSnapshotFadeAnimation", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;J)V", "bindFamilyButtonWithFadeInAnimation", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;)V", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$ContainerMode;", "containerMode", "bindByMode", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$ContainerMode;)V", "handleAnimationStarting", "addPersonalButtonIfNotAdded", "addFamilyButtonIfNotAdded", "addBothButtonsIfNotAdded", "data", "bindPersonalButton", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;)V", "isBothMode", "bindFamilyButton", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;Z)V", "margin", "setAddToCartButtonLeftMargin", "(I)V", "isQuantityState", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;)Z", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;)Z", "rememberClickTime", "isUserClickRecently", "()Z", "prevPersonalCartData", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;", "getPrevPersonalCartData", "()Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;", "setPrevPersonalCartData", "prevFamilyCartData", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;", "getPrevFamilyCartData", "()Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;", "setPrevFamilyCartData", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartListener;", "personalCartListener", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartListener;", "getPersonalCartListener", "()Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartListener;", "setPersonalCartListener", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartListener;)V", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartListener;", "familyCartListener", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartListener;", "getFamilyCartListener", "()Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartListener;", "setFamilyCartListener", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartListener;)V", "containerHeight$delegate", "LSc/j;", "getContainerHeight", "()I", "containerHeight", "addToCartBtnLeftMargin", "I", "isAnimationRunning", "Z", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PendingBindData;", "pendingBindData", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PendingBindData;", "prevMode", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$ContainerMode;", "maxOffset$delegate", "getMaxOffset", "maxOffset", "lastUserClickTimeMs", "J", "animationDurationHalf$delegate", "getAnimationDurationHalf", "()J", "animationDurationHalf", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;", "addToCartBtn$delegate", "getAddToCartBtn", "()Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;", "addToCartBtn", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToFamilyCartButtonView;", "addToFamilyCartBtn$delegate", "getAddToFamilyCartBtn", "()Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToFamilyCartButtonView;", "addToFamilyCartBtn", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "alphaAnimatorToNormal$delegate", "getAlphaAnimatorToNormal", "()Landroid/animation/ValueAnimator;", "alphaAnimatorToNormal", "alphaAnimatorToZero$delegate", "getAlphaAnimatorToZero", "alphaAnimatorToZero", "offsetAnimatorToMax$delegate", "getOffsetAnimatorToMax", "offsetAnimatorToMax", "offsetAnimatorToZero$delegate", "getOffsetAnimatorToZero", "offsetAnimatorToZero", "Ljava/lang/Runnable;", "animationRunnable$delegate", "getAnimationRunnable", "()Ljava/lang/Runnable;", "animationRunnable", "Companion", "PersonalCartListener", "FamilyCartListener", "PendingBindData", "PersonalCartData", "FamilyCartData", "ContainerMode", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddToCartContainerView extends FrameLayout {
    private static final int familyButtonSide;
    private static final int marginBetweenButtons;

    /* renamed from: addToCartBtn$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j addToCartBtn;
    private final int addToCartBtnLeftMargin;

    /* renamed from: addToFamilyCartBtn$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j addToFamilyCartBtn;

    /* renamed from: alphaAnimatorToNormal$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j alphaAnimatorToNormal;

    /* renamed from: alphaAnimatorToZero$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j alphaAnimatorToZero;

    /* renamed from: animationDurationHalf$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j animationDurationHalf;

    /* renamed from: animationRunnable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j animationRunnable;

    /* renamed from: containerHeight$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j containerHeight;
    private FamilyCartListener familyCartListener;
    private boolean isAnimationRunning;
    private long lastUserClickTimeMs;

    /* renamed from: maxOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j maxOffset;

    /* renamed from: offsetAnimatorToMax$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j offsetAnimatorToMax;

    /* renamed from: offsetAnimatorToZero$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j offsetAnimatorToZero;
    private PendingBindData pendingBindData;
    private PersonalCartListener personalCartListener;
    private FamilyCartData prevFamilyCartData;
    private ContainerMode prevMode;
    private PersonalCartData prevPersonalCartData;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$ContainerMode;", "", "<init>", "()V", "BothButtons", "Personal", "Family", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$ContainerMode$BothButtons;", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$ContainerMode$Family;", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$ContainerMode$Personal;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static abstract class ContainerMode {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$ContainerMode$BothButtons;", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$ContainerMode;", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;", "personalCartData", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;", "familyCartData", "<init>", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;", "getPersonalCartData", "()Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;", "getFamilyCartData", "()Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BothButtons extends ContainerMode {

            @NotNull
            private final FamilyCartData familyCartData;

            @NotNull
            private final PersonalCartData personalCartData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BothButtons(@NotNull PersonalCartData personalCartData, @NotNull FamilyCartData familyCartData) {
                super(null);
                Intrinsics.checkNotNullParameter(personalCartData, "personalCartData");
                Intrinsics.checkNotNullParameter(familyCartData, "familyCartData");
                this.personalCartData = personalCartData;
                this.familyCartData = familyCartData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BothButtons)) {
                    return false;
                }
                BothButtons bothButtons = (BothButtons) other;
                return Intrinsics.d(this.personalCartData, bothButtons.personalCartData) && Intrinsics.d(this.familyCartData, bothButtons.familyCartData);
            }

            @NotNull
            public final FamilyCartData getFamilyCartData() {
                return this.familyCartData;
            }

            @NotNull
            public final PersonalCartData getPersonalCartData() {
                return this.personalCartData;
            }

            public int hashCode() {
                return this.familyCartData.hashCode() + (this.personalCartData.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "BothButtons(personalCartData=" + this.personalCartData + ", familyCartData=" + this.familyCartData + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$ContainerMode$Family;", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$ContainerMode;", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;", "familyCartData", "<init>", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;", "getFamilyCartData", "()Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Family extends ContainerMode {

            @NotNull
            private final FamilyCartData familyCartData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Family(@NotNull FamilyCartData familyCartData) {
                super(null);
                Intrinsics.checkNotNullParameter(familyCartData, "familyCartData");
                this.familyCartData = familyCartData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Family) && Intrinsics.d(this.familyCartData, ((Family) other).familyCartData);
            }

            @NotNull
            public final FamilyCartData getFamilyCartData() {
                return this.familyCartData;
            }

            public int hashCode() {
                return this.familyCartData.hashCode();
            }

            @NotNull
            public String toString() {
                return "Family(familyCartData=" + this.familyCartData + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$ContainerMode$Personal;", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$ContainerMode;", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;", "personalCartData", "<init>", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;", "getPersonalCartData", "()Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Personal extends ContainerMode {

            @NotNull
            private final PersonalCartData personalCartData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Personal(@NotNull PersonalCartData personalCartData) {
                super(null);
                Intrinsics.checkNotNullParameter(personalCartData, "personalCartData");
                this.personalCartData = personalCartData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Personal) && Intrinsics.d(this.personalCartData, ((Personal) other).personalCartData);
            }

            @NotNull
            public final PersonalCartData getPersonalCartData() {
                return this.personalCartData;
            }

            public int hashCode() {
                return this.personalCartData.hashCode();
            }

            @NotNull
            public String toString() {
                return "Personal(personalCartData=" + this.personalCartData + ")";
            }
        }

        public /* synthetic */ ContainerMode(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ContainerMode() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\b\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u000b\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010\u0011¨\u0006#"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;", "", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO;", "dto", "", "isDisabled", "", "currentCount", "isPlusEnabled", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "theme", "isLikezoneGradientTransformationEnabled", "", "locator", "<init>", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO;ZIZLru/ozon/app/android/product/common/TileThemeConfigVO;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO;", "getDto", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO;", "Z", "()Z", "I", "getCurrentCount", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "getTheme", "()Lru/ozon/app/android/product/common/TileThemeConfigVO;", "Ljava/lang/String;", "getLocator", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FamilyCartData {
        private final int currentCount;

        @NotNull
        private final FamilyButtonDTO dto;
        private final boolean isDisabled;
        private final boolean isLikezoneGradientTransformationEnabled;
        private final boolean isPlusEnabled;
        private final String locator;
        private final TileThemeConfigVO theme;

        public FamilyCartData(@NotNull FamilyButtonDTO dto, boolean z11, int i11, boolean z12, TileThemeConfigVO tileThemeConfigVO, boolean z13, String str) {
            Intrinsics.checkNotNullParameter(dto, "dto");
            this.dto = dto;
            this.isDisabled = z11;
            this.currentCount = i11;
            this.isPlusEnabled = z12;
            this.theme = tileThemeConfigVO;
            this.isLikezoneGradientTransformationEnabled = z13;
            this.locator = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FamilyCartData)) {
                return false;
            }
            FamilyCartData familyCartData = (FamilyCartData) other;
            return Intrinsics.d(this.dto, familyCartData.dto) && this.isDisabled == familyCartData.isDisabled && this.currentCount == familyCartData.currentCount && this.isPlusEnabled == familyCartData.isPlusEnabled && Intrinsics.d(this.theme, familyCartData.theme) && this.isLikezoneGradientTransformationEnabled == familyCartData.isLikezoneGradientTransformationEnabled && Intrinsics.d(this.locator, familyCartData.locator);
        }

        public final int getCurrentCount() {
            return this.currentCount;
        }

        @NotNull
        public final FamilyButtonDTO getDto() {
            return this.dto;
        }

        public final String getLocator() {
            return this.locator;
        }

        public final TileThemeConfigVO getTheme() {
            return this.theme;
        }

        public int hashCode() {
            int a11 = C3532b.a(C2454a.a(this.currentCount, C3532b.a(this.dto.hashCode() * 31, 31, this.isDisabled), 31), 31, this.isPlusEnabled);
            TileThemeConfigVO tileThemeConfigVO = this.theme;
            int a12 = C3532b.a((a11 + (tileThemeConfigVO == null ? 0 : tileThemeConfigVO.hashCode())) * 31, 31, this.isLikezoneGradientTransformationEnabled);
            String str = this.locator;
            return a12 + (str != null ? str.hashCode() : 0);
        }

        /* renamed from: isDisabled, reason: from getter */
        public final boolean getIsDisabled() {
            return this.isDisabled;
        }

        /* renamed from: isLikezoneGradientTransformationEnabled, reason: from getter */
        public final boolean getIsLikezoneGradientTransformationEnabled() {
            return this.isLikezoneGradientTransformationEnabled;
        }

        /* renamed from: isPlusEnabled, reason: from getter */
        public final boolean getIsPlusEnabled() {
            return this.isPlusEnabled;
        }

        @NotNull
        public String toString() {
            FamilyButtonDTO familyButtonDTO = this.dto;
            boolean z11 = this.isDisabled;
            int i11 = this.currentCount;
            boolean z12 = this.isPlusEnabled;
            TileThemeConfigVO tileThemeConfigVO = this.theme;
            boolean z13 = this.isLikezoneGradientTransformationEnabled;
            String str = this.locator;
            StringBuilder sb2 = new StringBuilder("FamilyCartData(dto=");
            sb2.append(familyButtonDTO);
            sb2.append(", isDisabled=");
            sb2.append(z11);
            sb2.append(", currentCount=");
            Ql.c.d(sb2, i11, ", isPlusEnabled=", z12, ", theme=");
            sb2.append(tileThemeConfigVO);
            sb2.append(", isLikezoneGradientTransformationEnabled=");
            sb2.append(z13);
            sb2.append(", locator=");
            return o0.c(sb2, str, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartListener;", "", "onPlusButtonClicked", "", "updateCartAction", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton$UpdateCartAction;", "onMinusButtonClicked", "onAction", "commonControlSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface FamilyCartListener {
        void onAction(@NotNull CommonControlSettings commonControlSettings);

        void onMinusButtonClicked(@NotNull FamilyButtonDTO.QuantityButton.UpdateCartAction updateCartAction);

        void onPlusButtonClicked(@NotNull FamilyButtonDTO.QuantityButton.UpdateCartAction updateCartAction);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PendingBindData;", "", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;", "personalCartData", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;", "familyCartData", "<init>", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;", "getPersonalCartData", "()Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;", "getFamilyCartData", "()Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PendingBindData {

        @NotNull
        private final FamilyCartData familyCartData;

        @NotNull
        private final PersonalCartData personalCartData;

        public PendingBindData(@NotNull PersonalCartData personalCartData, @NotNull FamilyCartData familyCartData) {
            Intrinsics.checkNotNullParameter(personalCartData, "personalCartData");
            Intrinsics.checkNotNullParameter(familyCartData, "familyCartData");
            this.personalCartData = personalCartData;
            this.familyCartData = familyCartData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingBindData)) {
                return false;
            }
            PendingBindData pendingBindData = (PendingBindData) other;
            return Intrinsics.d(this.personalCartData, pendingBindData.personalCartData) && Intrinsics.d(this.familyCartData, pendingBindData.familyCartData);
        }

        @NotNull
        public final FamilyCartData getFamilyCartData() {
            return this.familyCartData;
        }

        @NotNull
        public final PersonalCartData getPersonalCartData() {
            return this.personalCartData;
        }

        public int hashCode() {
            return this.familyCartData.hashCode() + (this.personalCartData.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PendingBindData(personalCartData=" + this.personalCartData + ", familyCartData=" + this.familyCartData + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\b\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u000b\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010\u0011¨\u0006#"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;", "", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "dto", "", "isDisabled", "", "currentCount", "isPlusEnabled", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "theme", "isLikezoneGradientTransformationEnabled", "", "locator", "<init>", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;ZIZLru/ozon/app/android/product/common/TileThemeConfigVO;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "getDto", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "Z", "()Z", "I", "getCurrentCount", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "getTheme", "()Lru/ozon/app/android/product/common/TileThemeConfigVO;", "Ljava/lang/String;", "getLocator", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PersonalCartData {
        private final int currentCount;

        @NotNull
        private final AddToCartButtonDTO dto;
        private final boolean isDisabled;
        private final boolean isLikezoneGradientTransformationEnabled;
        private final boolean isPlusEnabled;
        private final String locator;
        private final TileThemeConfigVO theme;

        public PersonalCartData(@NotNull AddToCartButtonDTO dto, boolean z11, int i11, boolean z12, TileThemeConfigVO tileThemeConfigVO, boolean z13, String str) {
            Intrinsics.checkNotNullParameter(dto, "dto");
            this.dto = dto;
            this.isDisabled = z11;
            this.currentCount = i11;
            this.isPlusEnabled = z12;
            this.theme = tileThemeConfigVO;
            this.isLikezoneGradientTransformationEnabled = z13;
            this.locator = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PersonalCartData)) {
                return false;
            }
            PersonalCartData personalCartData = (PersonalCartData) other;
            return Intrinsics.d(this.dto, personalCartData.dto) && this.isDisabled == personalCartData.isDisabled && this.currentCount == personalCartData.currentCount && this.isPlusEnabled == personalCartData.isPlusEnabled && Intrinsics.d(this.theme, personalCartData.theme) && this.isLikezoneGradientTransformationEnabled == personalCartData.isLikezoneGradientTransformationEnabled && Intrinsics.d(this.locator, personalCartData.locator);
        }

        public final int getCurrentCount() {
            return this.currentCount;
        }

        @NotNull
        public final AddToCartButtonDTO getDto() {
            return this.dto;
        }

        public final String getLocator() {
            return this.locator;
        }

        public final TileThemeConfigVO getTheme() {
            return this.theme;
        }

        public int hashCode() {
            int a11 = C3532b.a(C2454a.a(this.currentCount, C3532b.a(this.dto.hashCode() * 31, 31, this.isDisabled), 31), 31, this.isPlusEnabled);
            TileThemeConfigVO tileThemeConfigVO = this.theme;
            int a12 = C3532b.a((a11 + (tileThemeConfigVO == null ? 0 : tileThemeConfigVO.hashCode())) * 31, 31, this.isLikezoneGradientTransformationEnabled);
            String str = this.locator;
            return a12 + (str != null ? str.hashCode() : 0);
        }

        /* renamed from: isDisabled, reason: from getter */
        public final boolean getIsDisabled() {
            return this.isDisabled;
        }

        /* renamed from: isLikezoneGradientTransformationEnabled, reason: from getter */
        public final boolean getIsLikezoneGradientTransformationEnabled() {
            return this.isLikezoneGradientTransformationEnabled;
        }

        /* renamed from: isPlusEnabled, reason: from getter */
        public final boolean getIsPlusEnabled() {
            return this.isPlusEnabled;
        }

        @NotNull
        public String toString() {
            AddToCartButtonDTO addToCartButtonDTO = this.dto;
            boolean z11 = this.isDisabled;
            int i11 = this.currentCount;
            boolean z12 = this.isPlusEnabled;
            TileThemeConfigVO tileThemeConfigVO = this.theme;
            boolean z13 = this.isLikezoneGradientTransformationEnabled;
            String str = this.locator;
            StringBuilder sb2 = new StringBuilder("PersonalCartData(dto=");
            sb2.append(addToCartButtonDTO);
            sb2.append(", isDisabled=");
            sb2.append(z11);
            sb2.append(", currentCount=");
            Ql.c.d(sb2, i11, ", isPlusEnabled=", z12, ", theme=");
            sb2.append(tileThemeConfigVO);
            sb2.append(", isLikezoneGradientTransformationEnabled=");
            sb2.append(z13);
            sb2.append(", locator=");
            return o0.c(sb2, str, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartListener;", "", "onPlusButtonClicked", "", "updateCartAction", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$QuantityButton$UpdateCartAction;", "onMinusButtonClicked", "onAction", "commonControlSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface PersonalCartListener {
        void onAction(@NotNull CommonControlSettings commonControlSettings);

        void onMinusButtonClicked(@NotNull AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction);

        void onPlusButtonClicked(@NotNull AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction);
    }

    static {
        Dimens dimens = Dimens.INSTANCE;
        familyButtonSide = dimens.getDP_32();
        marginBetweenButtons = dimens.getDP_6();
    }

    public /* synthetic */ AddToCartContainerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void addBothButtonsIfNotAdded() {
        addFamilyButtonIfNotAdded();
        addPersonalButtonIfNotAdded();
    }

    private final void addFamilyButtonIfNotAdded() {
        if (indexOfChild(getAddToFamilyCartBtn()) < 0) {
            addView(getAddToFamilyCartBtn());
        }
    }

    private final void addPersonalButtonIfNotAdded() {
        if (indexOfChild(getAddToCartBtn()) < 0) {
            addView(getAddToCartBtn());
        }
    }

    public static /* synthetic */ void bind$default(AddToCartContainerView addToCartContainerView, PersonalCartData personalCartData, FamilyCartData familyCartData, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        addToCartContainerView.bind(personalCartData, familyCartData, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindByMode(ContainerMode containerMode) {
        if (containerMode instanceof ContainerMode.BothButtons) {
            addBothButtonsIfNotAdded();
            getAddToCartBtn().bringToFront();
            setAddToCartButtonLeftMargin(this.addToCartBtnLeftMargin);
            ContainerMode.BothButtons bothButtons = (ContainerMode.BothButtons) containerMode;
            bindPersonalButton(bothButtons.getPersonalCartData());
            getAddToCartBtn().setVisibility(0);
            bindFamilyButton$default(this, bothButtons.getFamilyCartData(), false, 2, null);
            getAddToFamilyCartBtn().setVisibility(0);
            return;
        }
        if (containerMode instanceof ContainerMode.Family) {
            getAddToCartBtn().setVisibility(8);
            addFamilyButtonIfNotAdded();
            bindFamilyButton$default(this, ((ContainerMode.Family) containerMode).getFamilyCartData(), false, 2, null);
            getAddToFamilyCartBtn().setVisibility(0);
            return;
        }
        if (!(containerMode instanceof ContainerMode.Personal)) {
            throw new o();
        }
        getAddToFamilyCartBtn().setVisibility(8);
        addPersonalButtonIfNotAdded();
        setAddToCartButtonLeftMargin(0);
        bindPersonalButton(((ContainerMode.Personal) containerMode).getPersonalCartData());
        getAddToCartBtn().setVisibility(0);
    }

    private final void bindFamilyButton(FamilyCartData data, boolean isBothMode) {
        AddToFamilyCartButtonView addToFamilyCartBtn = getAddToFamilyCartBtn();
        FamilyButtonDTO dto = data.getDto();
        boolean isDisabled = data.getIsDisabled();
        int currentCount = data.getCurrentCount();
        boolean isPlusEnabled = data.getIsPlusEnabled();
        TileThemeConfigVO theme = data.getTheme();
        addToFamilyCartBtn.bind(dto, isDisabled, currentCount, isPlusEnabled, theme != null ? theme.getAddToCartButtonConfig() : null, data.getIsLikezoneGradientTransformationEnabled(), isBothMode);
    }

    static /* synthetic */ void bindFamilyButton$default(AddToCartContainerView addToCartContainerView, FamilyCartData familyCartData, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        addToCartContainerView.bindFamilyButton(familyCartData, z11);
    }

    private final void bindFamilyButtonWithFadeInAnimation(FamilyCartData familyCartData) {
        bindFamilyButton$default(this, familyCartData, false, 2, null);
        AnimationExtensionsKt.fadeIn$default(getAddToFamilyCartBtn(), 0L, 1, null);
    }

    private final void bindFamilyButtonWithShrinkAnimation(final ContainerMode.BothButtons bothButtonsMode) {
        bindFamilyButton(bothButtonsMode.getFamilyCartData(), true);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(getAlphaAnimatorToZero(), getOffsetAnimatorToZero());
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerView$bindFamilyButtonWithShrinkAnimation$lambda$3$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                AddToCartContainerView.this.bindByMode(bothButtonsMode);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        animatorSet.start();
    }

    private final void bindFamilyButtonWithStretchAnimation(final ContainerMode.Family familyMode) {
        bindFamilyButton(familyMode.getFamilyCartData(), true);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(getAlphaAnimatorToNormal(), getOffsetAnimatorToMax());
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerView$bindFamilyButtonWithStretchAnimation$lambda$1$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                AddToCartContainerView.this.bindByMode(familyMode);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        animatorSet.start();
    }

    private final void bindFromBothToFamilyWithAnimation(ContainerMode.Family familyMode) {
        addBothButtonsIfNotAdded();
        handleAnimationStarting();
        AnimationExtensionsKt.fadeOut$default(getAddToCartBtn(), 0L, null, 3, null);
        bindFamilyButtonWithStretchAnimation(familyMode);
    }

    private final void bindFromBothToPersonalWithAnimation(ContainerMode.Personal personalMode) {
        addBothButtonsIfNotAdded();
        handleAnimationStarting();
        AnimationExtensionsKt.animateLeftMarginChange(getAddToCartBtn(), 0, getAnimationDurationHalf());
        AnimationExtensionsKt.fadeOut(getAddToFamilyCartBtn(), getAnimationDurationHalf(), new AddToCartContainerView$bindFromBothToPersonalWithAnimation$1(this, personalMode));
    }

    private final void bindFromFamilyToBothWithAnimation(ContainerMode.BothButtons bothButtonsMode) {
        addBothButtonsIfNotAdded();
        handleAnimationStarting();
        setAddToCartButtonLeftMargin(this.addToCartBtnLeftMargin);
        bindPersonalButton(bothButtonsMode.getPersonalCartData());
        AnimationExtensionsKt.fadeIn$default(getAddToCartBtn(), 0L, 1, null);
        getAddToFamilyCartBtn().bringToFront();
        bindFamilyButtonWithShrinkAnimation(bothButtonsMode);
    }

    private final void bindFromPersonalToBothWithAnimation(ContainerMode.BothButtons bothButtonsMode) {
        addBothButtonsIfNotAdded();
        handleAnimationStarting();
        getAddToCartBtn().bringToFront();
        bindPersonalButtonWithSnapshotFadeAnimation$default(this, bothButtonsMode.getPersonalCartData(), 0L, 2, null);
        bindFamilyButtonWithFadeInAnimation(bothButtonsMode.getFamilyCartData());
        AnimationExtensionsKt.animateLeftMarginChange$default(getAddToCartBtn(), this.addToCartBtnLeftMargin, 0L, 2, null);
    }

    private final void bindPersonalButton(PersonalCartData data) {
        AddToCartButtonView addToCartBtn = getAddToCartBtn();
        AddToCartButtonDTO dto = data.getDto();
        boolean isDisabled = data.getIsDisabled();
        int currentCount = data.getCurrentCount();
        boolean isPlusEnabled = data.getIsPlusEnabled();
        TileThemeConfigVO theme = data.getTheme();
        addToCartBtn.bind(dto, isDisabled, currentCount, isPlusEnabled, theme != null ? theme.getAddToCartButtonConfig() : null, data.getIsLikezoneGradientTransformationEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindPersonalButtonWithSnapshotFadeAnimation(PersonalCartData personalCartData, long duration) {
        Bitmap createSnapshotBitmap = AnimationExtensionsKt.createSnapshotBitmap(getAddToCartBtn());
        if (createSnapshotBitmap == null) {
            bindPersonalButton(personalCartData);
            return;
        }
        AddToCartButtonView addToCartBtn = getAddToCartBtn();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageView createSnapshotView = AnimationExtensionsKt.createSnapshotView(addToCartBtn, context, createSnapshotBitmap);
        addView(createSnapshotView);
        createSnapshotView.bringToFront();
        bindPersonalButton(personalCartData);
        AnimationExtensionsKt.fadeIn(getAddToCartBtn(), duration);
        AnimationExtensionsKt.fadeOut(createSnapshotView, duration, new AddToCartContainerView$bindPersonalButtonWithSnapshotFadeAnimation$1(createSnapshotBitmap, this, createSnapshotView));
    }

    static /* synthetic */ void bindPersonalButtonWithSnapshotFadeAnimation$default(AddToCartContainerView addToCartContainerView, PersonalCartData personalCartData, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 300;
        }
        addToCartContainerView.bindPersonalButtonWithSnapshotFadeAnimation(personalCartData, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddToCartButtonView getAddToCartBtn() {
        return (AddToCartButtonView) this.addToCartBtn.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddToFamilyCartButtonView getAddToFamilyCartBtn() {
        return (AddToFamilyCartButtonView) this.addToFamilyCartBtn.getValue();
    }

    private final ValueAnimator getAlphaAnimatorToNormal() {
        return (ValueAnimator) this.alphaAnimatorToNormal.getValue();
    }

    private final ValueAnimator getAlphaAnimatorToZero() {
        return (ValueAnimator) this.alphaAnimatorToZero.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getAnimationDurationHalf() {
        return ((Number) this.animationDurationHalf.getValue()).longValue();
    }

    private final Runnable getAnimationRunnable() {
        return (Runnable) this.animationRunnable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMaxOffset() {
        return ((Number) this.maxOffset.getValue()).intValue();
    }

    private final ValueAnimator getOffsetAnimatorToMax() {
        return (ValueAnimator) this.offsetAnimatorToMax.getValue();
    }

    private final ValueAnimator getOffsetAnimatorToZero() {
        return (ValueAnimator) this.offsetAnimatorToZero.getValue();
    }

    private final void handleAnimationStarting() {
        this.isAnimationRunning = true;
        postDelayed(getAnimationRunnable(), 400L);
    }

    private final boolean isQuantityState(PersonalCartData personalCartData) {
        return (personalCartData.getCurrentCount() <= 0 || personalCartData.getIsDisabled() || personalCartData.getDto().getQuantityButton() == null) ? false : true;
    }

    private final boolean isUserClickRecently() {
        return System.currentTimeMillis() - this.lastUserClickTimeMs < 500;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rememberClickTime() {
        this.lastUserClickTimeMs = System.currentTimeMillis();
    }

    private final void setAddToCartButtonLeftMargin(int margin) {
        AddToCartButtonView addToCartBtn = getAddToCartBtn();
        ViewGroup.LayoutParams layoutParams = getAddToCartBtn().getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = margin;
        addToCartBtn.setLayoutParams(marginLayoutParams);
    }

    public final void bind(@NotNull PersonalCartData personalCartData, @NotNull FamilyCartData familyCartData, boolean isAnimationAllowed) {
        Intrinsics.checkNotNullParameter(personalCartData, "personalCartData");
        Intrinsics.checkNotNullParameter(familyCartData, "familyCartData");
        this.prevPersonalCartData = personalCartData;
        this.prevFamilyCartData = familyCartData;
        if (this.isAnimationRunning) {
            this.pendingBindData = new PendingBindData(personalCartData, familyCartData);
            return;
        }
        this.pendingBindData = null;
        ContainerMode personal = isQuantityState(personalCartData) ? new ContainerMode.Personal(personalCartData) : isQuantityState(familyCartData) ? new ContainerMode.Family(familyCartData) : new ContainerMode.BothButtons(personalCartData, familyCartData);
        boolean z11 = isAnimationAllowed && isUserClickRecently();
        if (z11 && (this.prevMode instanceof ContainerMode.BothButtons) && (personal instanceof ContainerMode.Personal)) {
            bindFromBothToPersonalWithAnimation((ContainerMode.Personal) personal);
        } else if (z11 && (this.prevMode instanceof ContainerMode.Personal) && (personal instanceof ContainerMode.BothButtons)) {
            bindFromPersonalToBothWithAnimation((ContainerMode.BothButtons) personal);
        } else if (z11 && (this.prevMode instanceof ContainerMode.BothButtons) && (personal instanceof ContainerMode.Family)) {
            bindFromBothToFamilyWithAnimation((ContainerMode.Family) personal);
        } else if (z11 && (this.prevMode instanceof ContainerMode.Family) && (personal instanceof ContainerMode.BothButtons)) {
            bindFromFamilyToBothWithAnimation((ContainerMode.BothButtons) personal);
        } else {
            bindByMode(personal);
        }
        this.prevMode = personal;
        getAddToCartBtn().setContentDescription(personalCartData.getLocator());
        getAddToFamilyCartBtn().setContentDescription(familyCartData.getLocator());
    }

    public final int getContainerHeight() {
        return ((Number) this.containerHeight.getValue()).intValue();
    }

    public final FamilyCartListener getFamilyCartListener() {
        return this.familyCartListener;
    }

    public final PersonalCartListener getPersonalCartListener() {
        return this.personalCartListener;
    }

    public final FamilyCartData getPrevFamilyCartData() {
        return this.prevFamilyCartData;
    }

    public final PersonalCartData getPrevPersonalCartData() {
        return this.prevPersonalCartData;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(getAnimationRunnable());
        this.isAnimationRunning = false;
    }

    public final void setFamilyCartListener(FamilyCartListener familyCartListener) {
        this.familyCartListener = familyCartListener;
    }

    public final void setPersonalCartListener(PersonalCartListener personalCartListener) {
        this.personalCartListener = personalCartListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToCartContainerView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.containerHeight = LazyUtilsKt.unsafeLazy(new AddToCartContainerView$containerHeight$2(this));
        this.addToCartBtnLeftMargin = familyButtonSide + marginBetweenButtons;
        this.maxOffset = k.b(new AddToCartContainerView$maxOffset$2(this));
        this.animationDurationHalf = k.b(AddToCartContainerView$animationDurationHalf$2.INSTANCE);
        this.addToCartBtn = LazyUtilsKt.unsafeLazy(new AddToCartContainerView$addToCartBtn$2(context, this));
        this.addToFamilyCartBtn = LazyUtilsKt.unsafeLazy(new AddToCartContainerView$addToFamilyCartBtn$2(context, this));
        this.alphaAnimatorToNormal = LazyUtilsKt.unsafeLazy(new AddToCartContainerView$alphaAnimatorToNormal$2(this));
        this.alphaAnimatorToZero = LazyUtilsKt.unsafeLazy(new AddToCartContainerView$alphaAnimatorToZero$2(this));
        this.offsetAnimatorToMax = LazyUtilsKt.unsafeLazy(new AddToCartContainerView$offsetAnimatorToMax$2(this));
        this.offsetAnimatorToZero = LazyUtilsKt.unsafeLazy(new AddToCartContainerView$offsetAnimatorToZero$2(this));
        this.animationRunnable = k.b(new AddToCartContainerView$animationRunnable$2(this));
    }

    private final boolean isQuantityState(FamilyCartData familyCartData) {
        return (familyCartData.getCurrentCount() <= 0 || familyCartData.getIsDisabled() || familyCartData.getDto().getQuantityButton() == null) ? false : true;
    }
}
