package ru.ozon.app.android.bank.widgets.premiumPoints.presentation;

import Am.C2438a;
import H30.z;
import Lm0.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import j.C7232a;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.R$id;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 '2\u00020\u0001:\u0001'B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001c\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u000eH\u0002J\b\u0010\u001f\u001a\u00020\fH\u0002J\u0018\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0002J\u0018\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001dH\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lru/ozon/app/android/bank/widgets/premiumPoints/presentation/PremiumPointsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "titleView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "imageView", "Landroid/widget/ImageView;", "dataVO", "Lru/ozon/app/android/bank/widgets/premiumPoints/presentation/PremiumPointsVO;", "isNewNavBar", "", "bind", "", "item", "setTitle", "titleAtom", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "setBackgroundContainer", "view", "Landroid/view/View;", "background", "", "createImageView", "createTitleView", "loadIcon", "icon", "iconTint", "setIcon", "drawable", "Landroid/graphics/drawable/Drawable;", "tint", "Companion", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PremiumPointsView extends ConstraintLayout {
    private PremiumPointsVO dataVO;
    private ImageView imageView;
    private boolean isNewNavBar;
    private TextAtomView titleView;
    private static int MIN_HEIGHT_VIEW_28 = ResourceExtKt.toPx(28);
    private static int MIN_HEIGHT_VIEW_20 = ResourceExtKt.toPx(20);
    private static int ICON_SIZE_20 = ResourceExtKt.toPx(20);
    private static int ICON_SIZE_16 = ResourceExtKt.toPx(16);
    private static int SPACE_VIEW_2 = ResourceExtKt.toPx(2);
    private static int SPACE_VIEW_4 = ResourceExtKt.toPx(4);

    public /* synthetic */ PremiumPointsView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final ImageView createImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setId(R$id.premiumPointIv);
        imageView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        setBackgroundContainer(imageView, StyleParser.OzColor.OZ_SEMANTIC_CTRL_MARKETING_PALE.getValue());
        Drawable a11 = C7232a.a(imageView.getContext(), R$drawable.ic_m_bonus);
        if (a11 != null) {
            setIcon(a11, StyleParser.OzColor.OZ_COLOR_WHITE_1.getValue());
        }
        addView(imageView);
        imageView.setClickable(false);
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToStart$default(dVar, R$id.premiumPointIv, 0, 0, 4, null);
        ConstraintSetExtKt.endToStart$default(dVar, R$id.premiumPointIv, R$id.premiumPointTv, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, R$id.premiumPointIv, 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, R$id.premiumPointIv, 0, 0, 4, null);
        dVar.f(this);
        int i11 = SPACE_VIEW_2;
        ViewExtKt.updatePadding(imageView, i11, i11, i11, i11);
        this.imageView = imageView;
        return imageView;
    }

    private final TextAtomView createTitleView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        C2438a.e(textAtomView, R$id.premiumPointTv, -2, -2);
        addView(textAtomView);
        textAtomView.setMaxLinesOrDefault(1);
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToEnd$default(dVar, R$id.premiumPointTv, R$id.premiumPointIv, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, R$id.premiumPointTv, 0, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, R$id.premiumPointTv, 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, R$id.premiumPointTv, 0, 0, 4, null);
        dVar.f(this);
        z.e(SPACE_VIEW_4, textAtomView);
        this.titleView = textAtomView;
        return textAtomView;
    }

    private final void loadIcon(String icon, final String iconTint) {
        int i11 = this.isNewNavBar ? ICON_SIZE_16 : ICON_SIZE_20;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ContextExtKt.load(context, icon, (r15 & 2) != 0 ? K.f71697a : null, (r15 & 4) != 0 ? null : new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.bank.widgets.premiumPoints.presentation.PremiumPointsView$loadIcon$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception e11) {
                PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, e11);
                a.f17149a.e(e11);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                ImageView imageView;
                if (resource != null) {
                    PremiumPointsView.this.setIcon(resource, StyleParser.OzColor.OZ_COLOR_WHITE_1.getValue());
                    imageView = PremiumPointsView.this.imageView;
                    if (imageView != null) {
                        PremiumPointsView.this.setBackgroundContainer(imageView, iconTint);
                    }
                }
            }
        }, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? LoadPriority.NORMAL : null, (r15 & 32) != 0 ? false : false, (r15 & 64) != 0 ? null : new ImageSize(i11, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBackgroundContainer(View view, String background) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, background);
        Drawable a11 = C7232a.a(getContext(), ru.ozon.app.android.bank.R$drawable.bg_premium_points);
        if (a11 == null || parseColor == null) {
            view.setBackground(a11);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(a11, "wrap(...)");
        androidx.core.graphics.drawable.a.i(a11, parseColor.intValue());
        view.setBackground(a11);
    }

    static /* synthetic */ void setBackgroundContainer$default(PremiumPointsView premiumPointsView, View view, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            view = premiumPointsView;
        }
        premiumPointsView.setBackgroundContainer(view, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setIcon(Drawable drawable, String tint) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, tint);
        if (parseColor != null) {
            drawable.setTint(parseColor.intValue());
        } else {
            drawable.setTintList(null);
        }
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        ImageView imageView2 = this.imageView;
        if (imageView2 != null) {
            z.e(SPACE_VIEW_4, imageView2);
        }
        if (!this.isNewNavBar) {
            ImageView imageView3 = this.imageView;
            if (imageView3 != null) {
                z.f(SPACE_VIEW_4, imageView3);
                return;
            }
            return;
        }
        ImageView imageView4 = this.imageView;
        if (imageView4 != null) {
            z.f(SPACE_VIEW_2, imageView4);
        }
        ImageView imageView5 = this.imageView;
        if (imageView5 != null) {
            ViewGroup.LayoutParams layoutParams = imageView5.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            int i11 = ICON_SIZE_16;
            ((ViewGroup.MarginLayoutParams) bVar).width = i11;
            ((ViewGroup.MarginLayoutParams) bVar).height = i11;
            imageView5.setLayoutParams(bVar);
        }
        setMinHeight(MIN_HEIGHT_VIEW_20);
    }

    private final void setTitle(TextAtom titleAtom) {
        TextAtomView textAtomView = this.titleView;
        if (textAtomView != null) {
            TextAtomHolderKt.bindOrGone$default(textAtomView, titleAtom, null, 2, null);
        }
    }

    public final void bind(@NotNull PremiumPointsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (Intrinsics.d(item, this.dataVO)) {
            return;
        }
        this.isNewNavBar = (item.getMarginRight() == null && item.getMarginLeft() == null) ? false : true;
        TextAtom title = item.getTitle();
        PremiumPointsVO premiumPointsVO = this.dataVO;
        if (!Intrinsics.d(title, premiumPointsVO != null ? premiumPointsVO.getTitle() : null)) {
            setTitle(item.getTitle());
        }
        String icon = item.getIcon();
        PremiumPointsVO premiumPointsVO2 = this.dataVO;
        if (!Intrinsics.d(icon, premiumPointsVO2 != null ? premiumPointsVO2.getIcon() : null)) {
            loadIcon(item.getIcon(), item.getIconTintColor());
        }
        String backgroundColor = item.getBackgroundColor();
        PremiumPointsVO premiumPointsVO3 = this.dataVO;
        if (!Intrinsics.d(backgroundColor, premiumPointsVO3 != null ? premiumPointsVO3.getBackgroundColor() : null)) {
            setBackgroundContainer$default(this, null, item.getBackgroundColor(), 1, null);
        }
        if (item.getMarginRight() != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0) != ResourceExtKt.toPx(item.getMarginRight().intValue())) {
                z.e(ResourceExtKt.toPx(item.getMarginRight().intValue()), this);
            }
        }
        if (item.getMarginLeft() != null) {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart() : 0) != ResourceExtKt.toPx(item.getMarginLeft().intValue())) {
                z.f(ResourceExtKt.toPx(item.getMarginLeft().intValue()), this);
            }
        }
        this.dataVO = item;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumPointsView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        setId(R$id.premiumPointContainerCl);
        setLayoutParams(new ConstraintLayout.b(-2, -2));
        setMinHeight(MIN_HEIGHT_VIEW_28);
        createTitleView();
        createImageView();
    }
}
