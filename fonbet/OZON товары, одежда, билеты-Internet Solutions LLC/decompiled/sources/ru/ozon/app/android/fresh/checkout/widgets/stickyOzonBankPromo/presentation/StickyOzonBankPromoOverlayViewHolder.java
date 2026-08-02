package ru.ozon.app.android.fresh.checkout.widgets.stickyOzonBankPromo.presentation;

import Ae.C2399j;
import B3.D;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.s;
import WZ.m;
import WZ.t;
import Wc.a;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.cart.common.presentation.utils.ExtensionsKt;
import ru.ozon.app.android.fresh.checkout.widgets.stickyOzonBankPromo.presentation.StickyOzonBankPromoVO;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000e0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010-\u001a\n **\u0004\u0018\u00010)0)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/stickyOzonBankPromo/presentation/StickyOzonBankPromoOverlayViewHolder;", "Ld20/a;", "Lru/ozon/app/android/fresh/checkout/widgets/stickyOzonBankPromo/presentation/StickyOzonBankPromoVO;", "Ll10/i;", "container", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "cartTotalVisibilityViewModel", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;Ld20/e;)V", "Lru/ozon/app/android/fresh/checkout/widgets/stickyOzonBankPromo/presentation/StickyOzonBankPromoVO$Spacers;", "spacers", "", "bindSpacers", "(Lru/ozon/app/android/fresh/checkout/widgets/stickyOzonBankPromo/presentation/StickyOzonBankPromoVO$Spacers;)V", "", "borderColor", "backgroundColor", "", "hasRoundedCorners", "bindBorderAndBackground", "(Ljava/lang/String;Ljava/lang/String;Z)V", "enableClicksInterception", "()V", "item", "bind", "(Lru/ozon/app/android/fresh/checkout/widgets/stickyOzonBankPromo/presentation/StickyOzonBankPromoVO;)V", "Ll10/i;", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/android/cell/CellView;", "cellView$delegate", "LSc/j;", "getCellView", "()Lru/ozon/uni/android/cell/CellView;", "cellView", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getContext", "()Landroid/content/Context;", "context", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StickyOzonBankPromoOverlayViewHolder extends AbstractC6064a<StickyOzonBankPromoVO> {

    @NotNull
    private static final float[] cornerRadiiDefault;

    @NotNull
    private static final float[] cornerRadiiFlat;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TotalVisibilityViewModel cartTotalVisibilityViewModel;

    /* renamed from: cellView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cellView;

    @NotNull
    private final i container;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int defaultStrokeColor = UniColors.GRAPHIC_STROKE_STICKY.getResId();
    private static final int strokeWidth = UiExtKt.toPx(1);
    private static final float mainRadius = UiExtKt.toPxF(24);
    private static final int badgeMargin = UiExtKt.toPx(8);
    private static final float zeroRadius = UiExtKt.toPxF(0);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "gone", "", "view", "Landroid/view/View;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.fresh.checkout.widgets.stickyOzonBankPromo.presentation.StickyOzonBankPromoOverlayViewHolder$1", f = "StickyOzonBankPromoOverlayViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.checkout.widgets.stickyOzonBankPromo.presentation.StickyOzonBankPromoOverlayViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements InterfaceC6511n<Boolean, View, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, View view, d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), view, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            ((View) this.L$0).setVisibility(this.Z$0 ? 8 : 0);
            return Unit.f71690a;
        }

        public final Object invoke(boolean z11, View view, d<? super Unit> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.Z$0 = z11;
            anonymousClass1.L$0 = view;
            return anonymousClass1.invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/stickyOzonBankPromo/presentation/StickyOzonBankPromoOverlayViewHolder$Companion;", "", "<init>", "()V", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        float[] fArr = new float[8];
        int i11 = 0;
        while (i11 < 8) {
            fArr[i11] = i11 < 4 ? mainRadius : zeroRadius;
            i11++;
        }
        cornerRadiiDefault = fArr;
        float[] fArr2 = new float[8];
        for (int i12 = 0; i12 < 8; i12++) {
            fArr2[i12] = zeroRadius;
        }
        cornerRadiiFlat = fArr2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyOzonBankPromoOverlayViewHolder(@NotNull i container, @NotNull TotalVisibilityViewModel cartTotalVisibilityViewModel, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(cartTotalVisibilityViewModel, "cartTotalVisibilityViewModel");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.cartTotalVisibilityViewModel = cartTotalVisibilityViewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
        this.cellView = k.b(new StickyOzonBankPromoOverlayViewHolder$cellView$2(this));
        C2399j.C(ExtensionsKt.onEachOutOfLayoutView$default(cartTotalVisibilityViewModel.isVisibleFlow(), getView(), null, new AnonymousClass1(null), 2, null), K.a(container.K().f()));
    }

    private final void bindBorderAndBackground(String borderColor, String backgroundColor, boolean hasRoundedCorners) {
        float[] fArr;
        GradientDrawable b11 = D.b(0);
        if (hasRoundedCorners) {
            int i11 = strokeWidth;
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "<get-context>(...)");
            b11.setStroke(i11, styleParser.parseColor(context, borderColor, defaultStrokeColor));
            fArr = cornerRadiiDefault;
        } else {
            fArr = cornerRadiiFlat;
        }
        b11.setCornerRadii(fArr);
        StyleParser styleParser2 = StyleParser.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "<get-context>(...)");
        Integer parseColor = styleParser2.parseColor(context2, backgroundColor);
        b11.setColor(parseColor != null ? parseColor.intValue() : 0);
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{b11});
        int i12 = strokeWidth;
        layerDrawable.setLayerInset(0, -i12, 0, -i12, -i12);
        getView().setBackground(layerDrawable);
    }

    private final void bindSpacers(StickyOzonBankPromoVO.Spacers spacers) {
        CellView cellView = getCellView();
        ViewGroup.LayoutParams layoutParams = cellView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(spacers.getLeft(), spacers.getTop(), spacers.getRight(), spacers.getBottom());
        cellView.setLayoutParams(marginLayoutParams);
    }

    private final void enableClicksInterception() {
        getView().setClickable(true);
        getView().setFocusable(true);
    }

    private final CellView getCellView() {
        return (CellView) this.cellView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() {
        return getView().getContext();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull StickyOzonBankPromoVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getView().setVisibility(this.cartTotalVisibilityViewModel.isVisibleFlow().getValue().booleanValue() ? 8 : 0);
        CellHolderKt.bindOrGone(getCellView(), item.getCell(), this.actionHandler);
        bindSpacers(item.getSpacers());
        bindBorderAndBackground(item.getBorderColor(), item.getBackgroundColor(), item.getHasRoundedCorners());
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.container.X(), tokenizedEvent, null);
        }
        enableClicksInterception();
    }
}
