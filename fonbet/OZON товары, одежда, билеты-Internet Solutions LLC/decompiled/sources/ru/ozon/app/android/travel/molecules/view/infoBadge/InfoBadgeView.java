package ru.ozon.app.android.travel.molecules.view.infoBadge;

import Lo.a;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonView;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\u001dJ-\u0010$\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)JG\u0010/\u001a\u00020\u000f2\b\b\u0001\u0010*\u001a\u00020\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b/\u00100J-\u00106\u001a\u00020\u000f2\u0006\u00102\u001a\u0002012\u0016\b\u0002\u00105\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000f\u0018\u000103¢\u0006\u0004\b6\u00107J/\u00108\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u0001012\u0016\b\u0002\u00105\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000f\u0018\u000103¢\u0006\u0004\b8\u00107R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0014\u0010?\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010=R\u0016\u0010@\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010=R\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001b\u0010S\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View;", "view", "", "color", "", "colorBackground", "(Landroid/view/View;Ljava/lang/String;)V", "parent", "marginLeft", "marginRight", "marginTop", "marginBottom", "placeViews", "(IIIII)V", "placeWrapper", "()V", "size", "setIconSize", "(I)V", "margin", "setTextStartMargin", "start", "top", "end", "bottom", "setCustomPadding", "(IIII)V", "", "radius", "setBorderRadius", "(F)V", "wrapperColor", "wrapperMarginLeft", "wrapperMarginRight", "wrapperMarginTop", "wrapperMarginBottom", "setWrapper", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeVO;Lkotlin/jvm/functions/Function1;)V", "bindOrGone", "", "isWrapped", "Z", "dp4", "I", "dp8", "dp16", "borderRadius", "F", "textStartMargin", "Landroid/graphics/drawable/ShapeDrawable;", "roundedBackground", "Landroid/graphics/drawable/ShapeDrawable;", "Landroidx/appcompat/widget/AppCompatImageView;", "iconAciv", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "textTav", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonView;", "linkButtonView", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonView;", "wrapper$delegate", "LSc/j;", "getWrapper", "()Landroid/view/View;", "wrapper", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InfoBadgeView extends ConstraintLayout {
    private float borderRadius;
    private final int dp16;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final AppCompatImageView iconAciv;
    private boolean isWrapped;

    @NotNull
    private final LinkButtonView linkButtonView;

    @NotNull
    private ShapeDrawable roundedBackground;
    private int textStartMargin;

    @NotNull
    private final TextAtomView textTav;

    /* renamed from: wrapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j wrapper;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InfoBadgeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$8(InfoBadgeVO infoBadgeVO, Function1 function1, View view) {
        AtomAction action = infoBadgeVO.getAction();
        if (action == null || function1 == null) {
            return;
        }
        function1.invoke(action);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bindOrGone$default(InfoBadgeView infoBadgeView, InfoBadgeVO infoBadgeVO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        infoBadgeView.bindOrGone(infoBadgeVO, function1);
    }

    private final void colorBackground(View view, String color) {
        Drawable background = view.getBackground();
        ShapeDrawable shapeDrawable = background instanceof ShapeDrawable ? (ShapeDrawable) background : null;
        if (shapeDrawable != null) {
            Paint paint = shapeDrawable.getPaint();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            paint.setColor(styleParser.parseColor(context, color, R$color.bg_action_secondary));
        }
    }

    private final View getWrapper() {
        return (View) this.wrapper.getValue();
    }

    private final void placeViews(int parent, int marginLeft, int marginRight, int marginTop, int marginBottom) {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.topToTop(dVar, this.iconAciv.getId(), parent, marginTop);
        ConstraintSetExtKt.startToStart(dVar, this.iconAciv.getId(), parent, marginLeft);
        ConstraintSetExtKt.startToEnd(dVar, this.textTav.getId(), this.iconAciv.getId(), this.textStartMargin);
        ConstraintSetExtKt.topToTop(dVar, this.textTav.getId(), parent, marginTop);
        ConstraintSetExtKt.endToEnd(dVar, this.textTav.getId(), parent, marginRight);
        ConstraintSetExtKt.bottomToTop$default(dVar, this.textTav.getId(), this.linkButtonView.getId(), 0, 4, null);
        int id2 = this.textTav.getId();
        if (!this.isWrapped) {
            marginLeft = 0;
        }
        dVar.Z(id2, 6, marginLeft);
        dVar.Z(this.textTav.getId(), 4, marginBottom);
        dVar.C(this.textTav.getId(), true);
        ConstraintSetExtKt.startToStart$default(dVar, this.linkButtonView.getId(), this.textTav.getId(), 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.linkButtonView.getId(), this.textTav.getId(), 0, 4, null);
        ConstraintSetExtKt.topToBottom(dVar, this.linkButtonView.getId(), this.textTav.getId(), this.dp8);
        ConstraintSetExtKt.bottomToBottom(dVar, this.linkButtonView.getId(), parent, marginBottom);
        dVar.c0(0.0f, this.linkButtonView.getId());
        dVar.f0(0.0f, this.linkButtonView.getId());
        dVar.f(this);
    }

    static /* synthetic */ void placeViews$default(InfoBadgeView infoBadgeView, int i11, int i12, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i12 = 0;
        }
        if ((i16 & 4) != 0) {
            i13 = 0;
        }
        if ((i16 & 8) != 0) {
            i14 = 0;
        }
        if ((i16 & 16) != 0) {
            i15 = 0;
        }
        infoBadgeView.placeViews(i11, i12, i13, i14, i15);
    }

    private final void placeWrapper() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToStart$default(dVar, getWrapper().getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, getWrapper().getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, getWrapper().getId(), 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, getWrapper().getId(), 0, 0, 4, null);
        dVar.f(this);
    }

    public final void bind(@NotNull InfoBadgeVO item, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        AppCompatImageView appCompatImageView = this.iconAciv;
        appCompatImageView.setVisibility(item.getIsIconVisible() ? 0 : 8);
        Icon icon = item.getIcon();
        ImageViewExtKt.load$default(appCompatImageView, icon != null ? icon.getImage() : null, null, null, null, null, false, null, 126, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Icon icon2 = item.getIcon();
        ThemeExtKt.tint(appCompatImageView, styleParser.parseColor(context, icon2 != null ? icon2.getTintColor() : null));
        TextAtomView textAtomView = this.textTav;
        TextAtomHolderKt.bindOrGone$default(textAtomView, item.getText(), null, 2, null);
        textAtomView.setMaxLinesOrDefault(Integer.valueOf(item.getMaxLines()));
        this.linkButtonView.bindOrGone(item.getLinkButton(), actionHandler);
        colorBackground(this.isWrapped ? getWrapper() : this, item.getBackgroundColor());
        setOnClickListener(new a(3, item, actionHandler));
    }

    public final void bindOrGone(InfoBadgeVO item, Function1<? super AtomAction, Unit> actionHandler) {
        setVisibility(item != null ? 0 : 8);
        if (item != null) {
            bind(item, actionHandler);
        }
    }

    public final void setBorderRadius(float radius) {
        if (radius == this.borderRadius) {
            return;
        }
        ShapeDrawable produce = new RoundedBackgroundProducer().produce(0, radius);
        this.roundedBackground = produce;
        setBackground(produce);
        this.borderRadius = radius;
    }

    public final void setCustomPadding(int start, int top, int end, int bottom) {
        setPadding(start, top, end, bottom);
    }

    public final void setIconSize(int size) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(size, context);
        AppCompatImageView appCompatImageView = this.iconAciv;
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = px;
        marginLayoutParams.height = px;
        appCompatImageView.setLayoutParams(marginLayoutParams);
    }

    public final void setTextStartMargin(int margin) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.textStartMargin = ResourceExtKt.toPx(margin, context);
        TextAtomView textAtomView = this.textTav;
        ViewGroup.LayoutParams layoutParams = textAtomView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(this.textStartMargin);
        textAtomView.setLayoutParams(marginLayoutParams);
    }

    public final void setWrapper(int wrapperColor, Integer wrapperMarginLeft, Integer wrapperMarginRight, Integer wrapperMarginTop, Integer wrapperMarginBottom) {
        this.isWrapped = true;
        setBackgroundColor(wrapperColor);
        removeAllViews();
        addView(getWrapper());
        addView(this.iconAciv);
        addView(this.textTav);
        addView(this.linkButtonView);
        placeViews(getWrapper().getId(), wrapperMarginLeft != null ? wrapperMarginLeft.intValue() : 0, wrapperMarginRight != null ? wrapperMarginRight.intValue() : 0, wrapperMarginTop != null ? wrapperMarginTop.intValue() : 0, wrapperMarginBottom != null ? wrapperMarginBottom.intValue() : 0);
        placeWrapper();
    }

    public /* synthetic */ InfoBadgeView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoBadgeView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(4, context);
        this.dp4 = px;
        int px2 = ResourceExtKt.toPx(8, context);
        this.dp8 = px2;
        int px3 = ResourceExtKt.toPx(16, context);
        this.dp16 = px3;
        this.borderRadius = ResourceExtKt.toPxF(12, context);
        this.textStartMargin = px2;
        this.roundedBackground = new RoundedBackgroundProducer().produce(0, this.borderRadius);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.infoBadgeViewIconAciv);
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(px3, px3));
        this.iconAciv = appCompatImageView;
        TextAtomView textAtomView = (TextAtomView) q.f64554a.g(N.b(TextAtomView.class), context);
        textAtomView.setId(R$id.infoBadgeViewTextTav);
        textAtomView.setIncludeFontPadding(false);
        this.textTav = textAtomView;
        LinkButtonView linkButtonView = new LinkButtonView(context, null, 0, 0, 14, null);
        linkButtonView.setId(R$id.infoBadgeViewLinkButtonView);
        this.linkButtonView = linkButtonView;
        this.wrapper = LazyUtilsKt.unsafeLazy(new InfoBadgeView$wrapper$2(context, this));
        setPadding(px2, px, px2, px);
        setBackground(this.roundedBackground);
        addView(appCompatImageView);
        addView(textAtomView);
        addView(linkButtonView);
        placeViews$default(this, 0, 0, 0, 0, 0, 30, null);
    }
}
