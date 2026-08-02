package ru.ozon.app.android.marketing.widgets.stickyLadder.presentation;

import B90.l0;
import Bi.b;
import Kk.C3531a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.seller.molecule.progressLadder.presentation.ProgressLadderView;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\bJ\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\bR\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "setupPaddings", "()V", "Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderVO;", "item", "bind", "(Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderVO;)V", "Landroid/view/View$OnClickListener;", "onClickListener", "setOnTitleClickListener", "(Landroid/view/View$OnClickListener;)V", "showWithAnim", "hideWithAnim", "Landroid/graphics/drawable/Drawable;", "circularBgDrawable$delegate", "LSc/j;", "getCircularBgDrawable", "()Landroid/graphics/drawable/Drawable;", "circularBgDrawable", "semiCircularBgDrawable$delegate", "getSemiCircularBgDrawable", "semiCircularBgDrawable", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/atom/icon/IconView;", "rightIconView", "Lru/ozon/uni/android/atom/icon/IconView;", "Lru/ozon/app/android/seller/molecule/progressLadder/presentation/ProgressLadderView;", "progressLadderView", "Lru/ozon/app/android/seller/molecule/progressLadder/presentation/ProgressLadderView;", "titleClickableView", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StickyLadderView extends ConstraintLayout {

    /* renamed from: circularBgDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j circularBgDrawable;

    @NotNull
    private final ProgressLadderView progressLadderView;

    @NotNull
    private final IconView rightIconView;

    /* renamed from: semiCircularBgDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j semiCircularBgDrawable;

    @NotNull
    private final ProgressLadderView titleClickableView;

    @NotNull
    private final TextAtomV2View titleTextView;
    public static final int $stable = 8;
    private static final int dp4 = UiExtKt.toPx(4);
    private static final int dp8 = UiExtKt.toPx(8);
    private static final int dp12 = UiExtKt.toPx(12);
    private static final int horizontalPadding = UiExtKt.toPx(16);
    private static final int bottomPadding = UiExtKt.toPx(8);
    private static final int selectTopMargin = UiExtKt.toPx(8);
    private static final int bxTopMargin = UiExtKt.toPx(10);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyLadderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.circularBgDrawable = k.b(new StickyLadderView$circularBgDrawable$2(context));
        this.semiCircularBgDrawable = k.b(new StickyLadderView$semiCircularBgDrawable$2(context));
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.stickyLadder_Title, -2, -2);
        d11.f41603J = 2;
        textAtomV2View.setLayoutParams(d11);
        this.titleTextView = textAtomV2View;
        IconView iconView = new IconView(context, null, 0, 6, null);
        ConstraintLayout.b a11 = C3531a.a(iconView, R$id.stickyLadder_RightIcon, -2, -2);
        a11.f41603J = 2;
        a11.setMarginStart(dp4);
        iconView.setLayoutParams(a11);
        this.rightIconView = iconView;
        ProgressLadderView progressLadderView = new ProgressLadderView(context);
        progressLadderView.setId(R$id.stickyLadder_ProgressLadder);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = appTypeResolver.isSelect(context) ? selectTopMargin : bxTopMargin;
        progressLadderView.setLayoutParams(bVar);
        this.progressLadderView = progressLadderView;
        ProgressLadderView progressLadderView2 = new ProgressLadderView(context);
        progressLadderView2.setId(R$id.stickyLadder_TitleClickableView);
        progressLadderView2.setLayoutParams(new ConstraintLayout.b(0, 0));
        this.titleClickableView = progressLadderView2;
        setId(R$id.stickyLadder_Root);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setBackground(appTypeResolver.isSelect(context) ? getCircularBgDrawable() : getSemiCircularBgDrawable());
        setClickable(true);
        setupPaddings();
        addView(textAtomV2View);
        addView(iconView);
        addView(progressLadderView);
        addView(progressLadderView2);
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, textAtomV2View);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, textAtomV2View);
        ConstraintSetExtKt.layoutConstraintEndToStartOf(dVar, textAtomV2View, iconView);
        ConstraintSetExtKt.layoutConstraintStartToEndOf(dVar, iconView, textAtomV2View);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, iconView);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, iconView);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, progressLadderView);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, progressLadderView, textAtomV2View);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, progressLadderView);
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(dVar, progressLadderView);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, progressLadderView2);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, progressLadderView2);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, progressLadderView2);
        ConstraintSetExtKt.layoutConstraintBottomToTopOf(dVar, progressLadderView2, progressLadderView);
        dVar.f(this);
        ViewExtKt.gone(this);
    }

    private final Drawable getCircularBgDrawable() {
        return (Drawable) this.circularBgDrawable.getValue();
    }

    private final Drawable getSemiCircularBgDrawable() {
        return (Drawable) this.semiCircularBgDrawable.getValue();
    }

    private final void setupPaddings() {
        int i11 = horizontalPadding;
        setPadding(i11, dp12, i11, bottomPadding);
    }

    public final void bind(@NotNull StickyLadderVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bind$default(this.titleTextView, item.getTitle(), null, 2, null);
        IconHolderKt.bindOrGone$default(this.rightIconView, item.getIconRight(), null, 2, null);
        this.progressLadderView.bind(item.getProgressLadder());
        AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (appTypeResolver.isSelect(context)) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = dp4;
            int i11 = dp8;
            marginLayoutParams.setMarginStart(i11);
            marginLayoutParams.setMarginEnd(i11);
            setLayoutParams(marginLayoutParams);
        }
    }

    public final void hideWithAnim() {
        animate().setDuration(250L).alpha(0.0f).withEndAction(new l0(this, 6)).start();
    }

    public final void setOnTitleClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.titleClickableView.setOnClickListener(onClickListener);
    }

    public final void showWithAnim() {
        setAlpha(0.0f);
        ViewExtKt.show(this);
        animate().setDuration(250L).alpha(1.0f).start();
    }
}
