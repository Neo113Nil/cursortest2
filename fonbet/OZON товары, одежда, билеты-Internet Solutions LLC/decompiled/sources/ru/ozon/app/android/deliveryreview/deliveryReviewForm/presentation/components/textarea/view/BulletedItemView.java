package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.textarea.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0013H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/textarea/view/BulletedItemView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bulletPaddingRes", "bulletUnicode", "", "bulletView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textView", "setItem", "", "item", "Lru/ozon/uni/atoms/data/text/TextDTO;", "showBullet", "", "applyStyle", "view", "dto", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class BulletedItemView extends LinearLayout {
    private final int bulletPaddingRes;

    @NotNull
    private final String bulletUnicode;

    @NotNull
    private final TextAtomV2View bulletView;

    @NotNull
    private final TextAtomV2View textView;

    public /* synthetic */ BulletedItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void applyStyle(TextAtomV2View view, TextDTO dto) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseTextStyle = styleParser.parseTextStyle(dto.getTypographyToken());
        if (parseTextStyle != null) {
            int intValue = parseTextStyle.intValue();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextViewExtKt.applyStyle(view, context, intValue);
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context2, dto.getTextColor());
        if (parseColor != null) {
            view.setTextColor(parseColor.intValue());
        }
    }

    public final void setItem(@NotNull TextDTO item, boolean showBullet) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (showBullet) {
            ViewExtKt.show(this.bulletView);
        } else {
            ViewExtKt.gone(this.bulletView);
        }
        this.textView.setText(item.getText());
        applyStyle(this.bulletView, item);
        applyStyle(this.textView, item);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulletedItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(10);
        this.bulletPaddingRes = px;
        this.bulletUnicode = "•";
        setOrientation(0);
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setText("•");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(px);
        textAtomV2View.setLayoutParams(layoutParams);
        this.bulletView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        textAtomV2View2.setLayoutParams(layoutParams2);
        this.textView = textAtomV2View2;
        addView(textAtomV2View);
        addView(textAtomV2View2);
    }
}
