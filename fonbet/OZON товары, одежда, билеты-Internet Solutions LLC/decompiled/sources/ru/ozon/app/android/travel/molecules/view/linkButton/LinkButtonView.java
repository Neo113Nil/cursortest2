package ru.ozon.app.android.travel.molecules.view.linkButton;

import FV.c;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import gk0.q;
import j.C7232a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;Lkotlin/jvm/functions/Function1;)V", "vo", "bindOrGone", "dp16", "I", "dp8", "Landroidx/appcompat/widget/AppCompatImageView;", "linkButtonIconIv", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "linkButtonTitleTAV", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LinkButtonView extends LinearLayout {
    private final int dp16;
    private final int dp8;

    @NotNull
    private final AppCompatImageView linkButtonIconIv;

    @NotNull
    private final TextAtomView linkButtonTitleTAV;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$5$lambda$4(Function1 function1, LinkButtonVO linkButtonVO, View view) {
        if (function1 != null) {
            function1.invoke(linkButtonVO.getAction());
        }
    }

    public final void bind(@NotNull LinkButtonVO item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextAtomHolderKt.bind(this.linkButtonTitleTAV, item.getTitle(), onAction);
        AppCompatImageView appCompatImageView = this.linkButtonIconIv;
        Icon icon = item.getIcon();
        ImageViewExtKt.loadImageOrGone(appCompatImageView, icon != null ? icon.getImage() : null);
        AppCompatImageView appCompatImageView2 = this.linkButtonIconIv;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Icon icon2 = item.getIcon();
        ThemeExtKt.tint(appCompatImageView2, styleParser.parseColor(context, icon2 != null ? icon2.getTintColor() : null));
        setOnClickListener(new c(item, onAction));
        if (onAction != null) {
            onAction.invoke(new AtomAction.ViewAction(item.getTrackingInfo(), null, 2, null));
        }
    }

    public final void bindOrGone(LinkButtonVO vo, Function1<? super AtomAction, Unit> onAction) {
        if (vo == null) {
            ViewExtKt.gone(this);
        } else {
            bind(vo, onAction);
            ViewExtKt.show(this);
        }
    }

    public /* synthetic */ LinkButtonView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkButtonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(16, context);
        this.dp16 = px;
        int px2 = ResourceExtKt.toPx(8, context);
        this.dp8 = px2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(px, px);
        layoutParams.gravity = 16;
        layoutParams.setMarginEnd(px2);
        appCompatImageView.setLayoutParams(layoutParams);
        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        appCompatImageView.setAdjustViewBounds(true);
        this.linkButtonIconIv = appCompatImageView;
        TextAtomView textAtomView = (TextAtomView) q.f64554a.g(N.b(TextAtomView.class), context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        textAtomView.setLayoutParams(layoutParams2);
        this.linkButtonTitleTAV = textAtomView;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        setForeground(C7232a.a(context, typedValue.resourceId));
        setOrientation(0);
        addView(appCompatImageView);
        addView(textAtomView);
    }
}
