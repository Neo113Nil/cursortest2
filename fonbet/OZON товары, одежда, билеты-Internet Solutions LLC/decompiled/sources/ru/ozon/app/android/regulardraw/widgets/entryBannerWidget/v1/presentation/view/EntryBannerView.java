package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.view;

import Bi.b;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.google.android.gms.internal.mlkit_common.a;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.R$id;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.Banner;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import xe.M;
import y7.C10850a;
import y7.k;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 ?2\u00020\u0001:\u0001?B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\fJ+\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J)\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010-R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/view/EntryBannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "onLifecycleScopeAttached", "()V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "bindTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner$Badge;", "badge", "bindTitleBadge", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner$Badge;)V", "bindSubtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bindBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner$Images;", "images", "bindImages", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner$Images;)V", "", "backgroundColor", "bindBackgroundColor", "(Ljava/lang/String;)V", "Lxe/M;", "scope", "attachLifecycleScope", "(Lxe/M;)V", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner;", "entryBannerState", "bind", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "lifecycleScope", "Lxe/M;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/view/EntryBannerTitleBadgeView;", "titleBadgeView", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/view/EntryBannerTitleBadgeView;", "subtitleView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "Landroidx/appcompat/widget/AppCompatImageView;", "underImageView", "Landroidx/appcompat/widget/AppCompatImageView;", "animationImageView", "Lcom/google/android/material/imageview/ShapeableImageView;", "overImageView", "Lcom/google/android/material/imageview/ShapeableImageView;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/view/LoadImages;", "loadImages", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/view/LoadImages;", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EntryBannerView extends ConstraintLayout {

    @NotNull
    private final AppCompatImageView animationImageView;

    @NotNull
    private final BadgeView badgeView;

    @NotNull
    private final Context context;
    private M lifecycleScope;
    private LoadImages loadImages;

    @NotNull
    private final ShapeableImageView overImageView;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final EntryBannerTitleBadgeView titleBadgeView;

    @NotNull
    private final TextAtomV2View titleView;

    @NotNull
    private final AppCompatImageView underImageView;
    public static final int $stable = 8;
    private static final int dp8 = UiExtKt.toPx(8);
    private static final int dp12 = UiExtKt.toPx(12);
    private static final int dp16 = UiExtKt.toPx(16);
    private static final float dpF18 = UiExtKt.toPxF(18);
    private static final int dp80 = UiExtKt.toPx(80);
    private static final int dp114 = UiExtKt.toPx(114);
    private static final int dp140 = UiExtKt.toPx(140);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.view.EntryBannerView$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<d, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
            invoke2(dVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(d updateConstraints) {
            Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
            ConstraintSetExtKt.layoutConstraintTopToTopOfParent(updateConstraints, EntryBannerView.this.underImageView);
            ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, EntryBannerView.this.underImageView);
            ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(updateConstraints, EntryBannerView.this.underImageView);
            ConstraintSetExtKt.layoutConstraintTopToTopOfParent(updateConstraints, EntryBannerView.this.animationImageView);
            ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, EntryBannerView.this.animationImageView);
            ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(updateConstraints, EntryBannerView.this.animationImageView);
            ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, EntryBannerView.this.overImageView);
            ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(updateConstraints, EntryBannerView.this.overImageView);
            ConstraintSetExtKt.layoutConstraintTopToTopOfParent(updateConstraints, EntryBannerView.this.titleView);
            ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, EntryBannerView.this.titleView);
            ConstraintSetExtKt.layoutConstraintEndToStartOf(updateConstraints, EntryBannerView.this.titleView, EntryBannerView.this.titleBadgeView);
            ConstraintSetExtKt.layoutConstraintTopToTopOfParent(updateConstraints, EntryBannerView.this.titleBadgeView);
            ConstraintSetExtKt.layoutConstraintStartToEndOf(updateConstraints, EntryBannerView.this.titleBadgeView, EntryBannerView.this.titleView);
            ConstraintSetExtKt.layoutConstraintEndToStartOf(updateConstraints, EntryBannerView.this.titleBadgeView, EntryBannerView.this.animationImageView);
            ConstraintSetExtKt.layoutConstraintTopToBottomOf(updateConstraints, EntryBannerView.this.subtitleView, EntryBannerView.this.titleView);
            ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, EntryBannerView.this.subtitleView);
            ConstraintSetExtKt.layoutConstraintEndToStartOf(updateConstraints, EntryBannerView.this.subtitleView, EntryBannerView.this.animationImageView);
            ConstraintSetExtKt.layoutConstraintTopToBottomOf(updateConstraints, EntryBannerView.this.badgeView, EntryBannerView.this.subtitleView);
            ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, EntryBannerView.this.badgeView);
            ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(updateConstraints, EntryBannerView.this.badgeView);
            ConstraintSetExtKt.layoutConstraintEndToStartOf(updateConstraints, EntryBannerView.this.badgeView, EntryBannerView.this.animationImageView);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntryBannerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.entryBannerWidget_BannerView_Title, 0, -2);
        d11.f41598E = 0.0f;
        d11.f41603J = 2;
        d11.f41605L = 1;
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        this.titleView = textAtomV2View;
        EntryBannerTitleBadgeView entryBannerTitleBadgeView = new EntryBannerTitleBadgeView(context);
        entryBannerTitleBadgeView.setId(R$id.entryBannerWidget_BannerView_TitleBadge);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41605L = 1;
        entryBannerTitleBadgeView.setLayoutParams(bVar);
        this.titleBadgeView = entryBannerTitleBadgeView;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, R$id.entryBannerWidget_BannerView_Subtitle, 0, -2);
        d12.f41598E = 0.0f;
        textAtomV2View2.setLayoutParams(d12);
        textAtomV2View2.setTextIsSelectable(false);
        this.subtitleView = textAtomV2View2;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        ConstraintLayout.b a11 = a.a(badgeView, R$id.entryBannerWidget_BannerView_Badge, 0, -2);
        a11.f41598E = 0.0f;
        a11.f41605L = 1;
        badgeView.setLayoutParams(a11);
        this.badgeView = badgeView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.entryBannerWidget_BannerView_UnderImage);
        int i11 = dp140;
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(i11, 0));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        appCompatImageView.setScaleType(scaleType);
        this.underImageView = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R$id.entryBannerWidget_BannerView_Animation);
        appCompatImageView2.setLayoutParams(new ConstraintLayout.b(i11, 0));
        appCompatImageView2.setScaleType(scaleType);
        this.animationImageView = appCompatImageView2;
        ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        shapeableImageView.setId(R$id.entryBannerWidget_BannerView_OverImage);
        int i12 = dp80;
        shapeableImageView.setLayoutParams(new ConstraintLayout.b(i12, i12));
        shapeableImageView.setScaleType(scaleType);
        shapeableImageView.setRotation(5.0f);
        k.a aVar = new k.a(new k());
        aVar.d(new C10850a(dpF18));
        shapeableImageView.setShapeAppearanceModel(aVar.a());
        this.overImageView = shapeableImageView;
        setId(R$id.entryBannerWidget_BannerView_Root);
        setLayoutParams(new ConstraintLayout.b(-1, dp114));
        setClipToOutline(true);
        addView(textAtomV2View);
        addView(entryBannerTitleBadgeView);
        addView(textAtomV2View2);
        addView(badgeView);
        addView(appCompatImageView);
        addView(appCompatImageView2);
        addView(shapeableImageView);
        ConstraintLayoutExtKt.updateConstraints(this, new AnonymousClass1());
        ViewGroup.LayoutParams layoutParams = shapeableImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.rightMargin = dp12;
        int i13 = dp8;
        marginLayoutParams.bottomMargin = -i13;
        shapeableImageView.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams2 = textAtomV2View.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        int i14 = dp16;
        marginLayoutParams2.setMarginStart(i14);
        marginLayoutParams2.topMargin = i14;
        textAtomV2View.setLayoutParams(marginLayoutParams2);
        ViewGroup.LayoutParams layoutParams3 = entryBannerTitleBadgeView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams3.topMargin = i14;
        marginLayoutParams3.setMarginEnd(i13);
        entryBannerTitleBadgeView.setLayoutParams(marginLayoutParams3);
        ViewGroup.LayoutParams layoutParams4 = textAtomV2View2.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
        marginLayoutParams4.setMarginStart(i14);
        marginLayoutParams4.setMarginEnd(i13);
        textAtomV2View2.setLayoutParams(marginLayoutParams4);
        ViewGroup.LayoutParams layoutParams5 = badgeView.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
        marginLayoutParams5.setMarginStart(i14);
        marginLayoutParams5.bottomMargin = i14;
        badgeView.setLayoutParams(marginLayoutParams5);
    }

    private final void bindBackgroundColor(String backgroundColor) {
        ViewExtKt.setBackgroundTint(this, StyleParser.INSTANCE.parseColor(this.context, backgroundColor, UniColors.LAYER_FLOOR_1.getResId()));
    }

    private final void bindBadge(BadgeDTO badge, Function1<? super AtomAction, Unit> actionHandler) {
        BadgeHolderKt.bind(this.badgeView, badge, actionHandler);
    }

    private final void bindImages(Banner.Images images) {
        LoadImages loadImages = this.loadImages;
        if (loadImages != null) {
            loadImages.load(images, this);
        } else {
            Intrinsics.n("loadImages");
            throw null;
        }
    }

    private final void bindSubtitle(TextDTO text) {
        TextHolderKt.bind$default(this.subtitleView, text, null, 2, null);
    }

    private final void bindTitle(TextDTO text) {
        TextHolderKt.bind$default(this.titleView, text, null, 2, null);
    }

    private final void bindTitleBadge(Banner.Badge badge) {
        this.titleBadgeView.bind(badge);
    }

    private final void onLifecycleScopeAttached() {
        this.loadImages = new LoadImages(this.lifecycleScope, this.underImageView, this.animationImageView, this.overImageView);
    }

    public final void attachLifecycleScope(@NotNull M scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.lifecycleScope = scope;
        onLifecycleScopeAttached();
    }

    public final void bind(@NotNull Banner entryBannerState, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(entryBannerState, "entryBannerState");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        bindTitle(entryBannerState.getTitle());
        bindTitleBadge(entryBannerState.getTitleBadgeState());
        bindSubtitle(entryBannerState.getSubtitle());
        bindBadge(entryBannerState.getBadge(), actionHandler);
        bindBackgroundColor(entryBannerState.getBackgroundColor());
        bindImages(entryBannerState.getImages());
    }
}
