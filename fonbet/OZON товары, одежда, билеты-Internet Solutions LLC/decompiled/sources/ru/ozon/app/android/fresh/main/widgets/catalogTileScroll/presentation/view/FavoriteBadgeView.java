package ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.view;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.domain.FavoriteBadgeVO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 82\u00020\u0001:\u00018B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJO\u0010(\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\"\u0010#\u001a\u001e\u0012\f\u0012\n\u0018\u00010 j\u0004\u0018\u0001`!\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020\f0\u001f2\u0006\u0010%\u001a\u00020$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0&¢\u0006\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00069"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/view/FavoriteBadgeView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", "bindText", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "bindIcon", "(Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "", "", "colors", "bindGradient", "(Ljava/util/List;)V", "colorToken", "bindBorder", "(Ljava/lang/String;)V", "setupView", "()V", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/FavoriteBadgeVO;", "badgeVO", "Lkotlin/Function2;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "Lru/ozon/uni/atoms/af/AtomAction;", "onClickWithAnalytics", "Landroid/view/View$OnTouchListener;", "onTouchListener", "Lkotlin/Function0;", "defaultClickAction", "bind", "(Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/FavoriteBadgeVO;Lkotlin/jvm/functions/Function2;Landroid/view/View$OnTouchListener;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textAtom", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/atom/icon/IconView;", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "defaultStrokeColor", "Ljava/lang/Integer;", "Landroid/graphics/drawable/GradientDrawable;", "drawableBackground$delegate", "LSc/j;", "getDrawableBackground", "()Landroid/graphics/drawable/GradientDrawable;", "drawableBackground", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteBadgeView extends LinearLayout {

    @NotNull
    private static final float[] cornerRadiiDefault;

    @NotNull
    private static final float[] cornerRadiiWithStroke;
    private static final float mainRadius;
    private static final float strokeTranslation;
    private static final int strokeWidth;
    private static final float zeroRadius;
    private static final float zeroTranslation;
    private final Integer defaultStrokeColor;

    /* renamed from: drawableBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j drawableBackground;

    @NotNull
    private final IconView iconView;

    @NotNull
    private final TextAtomV2View textAtom;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int rightPadding = ResourceExtKt.toPx(8);
    private static final int leftPadding = ResourceExtKt.toPx(6);
    private static final int verticalPadding = ResourceExtKt.toPx(4);
    private static final int badgeSize = ResourceExtKt.toPx(16);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/view/FavoriteBadgeView$Companion;", "", "<init>", "()V", "", "cornerRadiiDefault", "[F", "getCornerRadiiDefault", "()[F", "", "FAVORITE_BADGE", "Ljava/lang/String;", "FAVORITE_BADGE_TITLE", "FAVORITE_BADGE_ICON", "START_GRADIENT_DEFAULT", "END_GRADIENT_DEFAULT", "", "DEFAULT_STROKE_SIZE", "I", "DEFAULT_STROKE_COLOR", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final float[] getCornerRadiiDefault() {
            return FavoriteBadgeView.cornerRadiiDefault;
        }

        private Companion() {
        }
    }

    static {
        float pxF = ResourceExtKt.toPxF(16);
        mainRadius = pxF;
        strokeWidth = ResourceExtKt.toPx(2);
        float pxF2 = ResourceExtKt.toPxF(0);
        zeroRadius = pxF2;
        strokeTranslation = ResourceExtKt.toPxF(2);
        zeroTranslation = pxF2;
        cornerRadiiDefault = new float[]{pxF2, pxF2, pxF, pxF, pxF2, pxF2, pxF, pxF};
        cornerRadiiWithStroke = new float[]{pxF2, pxF2, pxF, pxF, pxF2, pxF2, pxF2, pxF2};
    }

    public /* synthetic */ FavoriteBadgeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindBorder(String colorToken) {
        if (colorToken == null) {
            getDrawableBackground().setStroke(0, 0);
            getDrawableBackground().setCornerRadii(cornerRadiiDefault);
            int i11 = leftPadding;
            int i12 = verticalPadding;
            ViewExtKt.updatePadding(this, i11, i12, rightPadding, i12);
            float f7 = zeroTranslation;
            setTranslationX(f7);
            setTranslationY(f7);
            return;
        }
        GradientDrawable drawableBackground = getDrawableBackground();
        int i13 = strokeWidth;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, colorToken);
        if (parseColor == null) {
            parseColor = this.defaultStrokeColor;
            Intrinsics.f(parseColor);
        }
        drawableBackground.setStroke(i13, parseColor.intValue());
        getDrawableBackground().setCornerRadii(cornerRadiiWithStroke);
        int i14 = leftPadding + i13;
        int i15 = verticalPadding;
        ViewExtKt.updatePadding(this, i14, i15 + i13, rightPadding + i13, i15 + i13);
        float f11 = strokeTranslation;
        setTranslationX(-f11);
        setTranslationY(f11);
    }

    private final void bindGradient(List<String> colors) {
        GradientDrawable drawableBackground = getDrawableBackground();
        ArrayList arrayList = new ArrayList();
        for (String str : colors) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, str);
            if (parseColor != null) {
                arrayList.add(parseColor);
            }
        }
        drawableBackground.setColors(C7714v.T0(arrayList));
    }

    private final void bindIcon(IconDTO icon) {
        IconHolderKt.bindOrGone$default(this.iconView, icon, null, 2, null);
    }

    private final void bindText(TextDTO text) {
        TextHolderKt.bindOrGone$default(this.textAtom, text, null, 2, null);
    }

    private final GradientDrawable getDrawableBackground() {
        return (GradientDrawable) this.drawableBackground.getValue();
    }

    private final void setupView() {
        setOrientation(0);
        setGravity(16);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setBackground(getDrawableBackground());
    }

    public final void bind(@NotNull FavoriteBadgeVO badgeVO, @NotNull Function2<? super t, ? super AtomAction, Unit> onClickWithAnalytics, @NotNull View.OnTouchListener onTouchListener, @NotNull final Function0<Unit> defaultClickAction) {
        Intrinsics.checkNotNullParameter(badgeVO, "badgeVO");
        Intrinsics.checkNotNullParameter(onClickWithAnalytics, "onClickWithAnalytics");
        Intrinsics.checkNotNullParameter(onTouchListener, "onTouchListener");
        Intrinsics.checkNotNullParameter(defaultClickAction, "defaultClickAction");
        bindText(badgeVO.getText());
        bindIcon(badgeVO.getIcon());
        bindGradient(C7714v.b0(badgeVO.getGradient().getStartColor(), badgeVO.getGradient().getEndColor()));
        bindBorder(badgeVO.getBorderColor());
        boolean z11 = badgeVO.getAction() != null;
        final FavoriteBadgeView$bind$1$onClick$1 favoriteBadgeView$bind$1$onClick$1 = new FavoriteBadgeView$bind$1$onClick$1(onClickWithAnalytics, badgeVO);
        if (z11) {
            setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.view.FavoriteBadgeView$bindClick$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    favoriteBadgeView$bind$1$onClick$1.invoke();
                }
            });
        } else {
            setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.view.FavoriteBadgeView$bindClick$2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    defaultClickAction.invoke();
                }
            });
            setOnTouchListener(onTouchListener);
        }
        TextAtomV2View textAtomV2View = this.textAtom;
        if (z11) {
            textAtomV2View.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.view.FavoriteBadgeView$bindClick$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    favoriteBadgeView$bind$1$onClick$1.invoke();
                }
            });
        } else {
            textAtomV2View.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.view.FavoriteBadgeView$bindClick$2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    defaultClickAction.invoke();
                }
            });
            textAtomV2View.setOnTouchListener(onTouchListener);
        }
        IconView iconView = this.iconView;
        if (z11) {
            iconView.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.view.FavoriteBadgeView$bindClick$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    favoriteBadgeView$bind$1$onClick$1.invoke();
                }
            });
        } else {
            iconView.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.view.FavoriteBadgeView$bindClick$2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    defaultClickAction.invoke();
                }
            });
            iconView.setOnTouchListener(onTouchListener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteBadgeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        TextViewExtKt.setTextCopyable(textAtomV2View, false);
        this.textAtom = textAtomV2View;
        IconView iconView = new IconView(context, null, 0, 6, null);
        int i12 = badgeSize;
        iconView.setLayoutParams(new LinearLayout.LayoutParams(i12, i12));
        this.iconView = iconView;
        this.defaultStrokeColor = StyleParser.INSTANCE.parseColor(context, UniColors.LAYER_FLOOR_1.getToken());
        this.drawableBackground = k.b(FavoriteBadgeView$drawableBackground$2.INSTANCE);
        setContentDescription("catalogScrollTileFavoriteBadge");
        textAtomV2View.setLocatorTag("catalogScrollTileFavoriteBadgeTitle");
        iconView.setLocatorTag("catalogScrollTileFavoriteBadgeIcon");
        addView(iconView);
        addView(textAtomV2View);
        setupView();
    }
}
