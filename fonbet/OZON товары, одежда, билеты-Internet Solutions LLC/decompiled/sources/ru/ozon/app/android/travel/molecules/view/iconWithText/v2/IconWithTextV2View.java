package ru.ozon.app.android.travel.molecules.view.iconWithText.v2;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.ui.molecules.databinding.ViewIconWithTextV2Binding;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u001b\u0010\u001f\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001e¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/iconWithText/v2/IconWithTextV2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/ozon/app/android/travel/molecules/view/iconWithText/v2/IconWithTextV2VO;", "item", "", "bind", "(Lru/ozon/app/android/travel/molecules/view/iconWithText/v2/IconWithTextV2VO;)V", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewIconWithTextV2Binding;", "binding", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewIconWithTextV2Binding;", "dp20", "I", "dp16", "dp12", "", "dpf12", "F", "dp1", "defaultIconColor$delegate", "LSc/j;", "getDefaultIconColor", "()I", "defaultIconColor", "defaultBackgroundColor$delegate", "getDefaultBackgroundColor", "defaultBackgroundColor", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IconWithTextV2View extends ConstraintLayout {

    @NotNull
    private final ViewIconWithTextV2Binding binding;

    /* renamed from: defaultBackgroundColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultBackgroundColor;

    /* renamed from: defaultIconColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultIconColor;
    private final int dp1;
    private final int dp12;
    private final int dp16;
    private final int dp20;
    private final float dpf12;

    public /* synthetic */ IconWithTextV2View(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final int getDefaultBackgroundColor() {
        return ((Number) this.defaultBackgroundColor.getValue()).intValue();
    }

    private final int getDefaultIconColor() {
        return ((Number) this.defaultIconColor.getValue()).intValue();
    }

    public final void bind(@NotNull IconWithTextV2VO item) {
        float f7;
        Intrinsics.checkNotNullParameter(item, "item");
        TextAtomView iconWIthTextTitleTAV = this.binding.iconWIthTextTitleTAV;
        Intrinsics.checkNotNullExpressionValue(iconWIthTextTitleTAV, "iconWIthTextTitleTAV");
        TextAtomHolderKt.bind$default(iconWIthTextTitleTAV, item.getText(), null, 2, null);
        TextAtomView iconWIthTextSubtextTAV = this.binding.iconWIthTextSubtextTAV;
        Intrinsics.checkNotNullExpressionValue(iconWIthTextSubtextTAV, "iconWIthTextSubtextTAV");
        TextAtomHolderKt.bindOrGone$default(iconWIthTextSubtextTAV, item.getSubText(), null, 2, null);
        AppCompatImageView iconWIthTextIconACIV = this.binding.iconWIthTextIconACIV;
        Intrinsics.checkNotNullExpressionValue(iconWIthTextIconACIV, "iconWIthTextIconACIV");
        ImageViewExtKt.load$default(iconWIthTextIconACIV, item.getIcon().getImage(), null, null, null, null, false, null, 126, null);
        AppCompatImageView iconWIthTextIconACIV2 = this.binding.iconWIthTextIconACIV;
        Intrinsics.checkNotNullExpressionValue(iconWIthTextIconACIV2, "iconWIthTextIconACIV");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(iconWIthTextIconACIV2, Integer.valueOf(styleParser.parseColor(context, item.getIcon().getTintColor(), getDefaultIconColor())));
        Integer borderRadius = item.getBorderRadius();
        if (borderRadius != null) {
            int intValue = borderRadius.intValue();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            f7 = ResourceExtKt.toPxF(intValue, context2);
        } else {
            f7 = this.dpf12;
        }
        float f11 = f7;
        View constraintLayout = this.binding.getConstraintLayout();
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context3, item.getBackgroundColor());
        int intValue2 = parseColor != null ? parseColor.intValue() : getDefaultBackgroundColor();
        int i11 = this.dp1;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        Integer parseColor2 = styleParser.parseColor(context4, item.getBorderColor());
        constraintLayout.setBackground(roundedBackgroundProducer.produce(intValue2, parseColor2 != null ? parseColor2.intValue() : getDefaultBackgroundColor(), i11, f11, f11, f11, f11));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconWithTextV2View(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewIconWithTextV2Binding inflate = ViewIconWithTextV2Binding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        int px = ResourceExtKt.toPx(20, context);
        this.dp20 = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        int px3 = ResourceExtKt.toPx(12, context);
        this.dp12 = px3;
        this.dpf12 = ResourceExtKt.toPxF(12, context);
        this.dp1 = ResourceExtKt.toPx(1, context);
        n nVar = n.NONE;
        this.defaultIconColor = k.a(nVar, new IconWithTextV2View$defaultIconColor$2(context));
        this.defaultBackgroundColor = k.a(nVar, new IconWithTextV2View$defaultBackgroundColor$2(context));
        setPadding(px3, px2, px, px2);
    }
}
