package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.carouselSelector;

import Im.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/carouselSelector/CarouselSelectorView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitle", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitle", "getSubtitle", "maxWidth", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CarouselSelectorView extends LinearLayout {
    private final int maxWidth;

    @NotNull
    private final TextAtomV2View subtitle;

    @NotNull
    private final TextAtomV2View title;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = TextAtomV2View.$stable;
    private static final int paddingHorizontal = ResourceExtKt.toPx(12);
    private static final int paddingVertical = ResourceExtKt.toPx(8);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/carouselSelector/CarouselSelectorView$Companion;", "", "<init>", "()V", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CarouselSelectorView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final TextAtomV2View getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtomV2View getTitle() {
        return this.title;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        if (mode == Integer.MIN_VALUE) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(size, this.maxWidth), LinearLayoutManager.INVALID_OFFSET);
        } else if (mode == 0) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.maxWidth, LinearLayoutManager.INVALID_OFFSET);
        } else if (mode != 1073741824) {
            throw new IllegalArgumentException("Unknown MeasureSpec");
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselSelectorView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        LinearLayout.LayoutParams a11 = a.a(textAtomV2View, R$id.switchTitle, -2, -2);
        a11.gravity = 1;
        textAtomV2View.setLayoutParams(a11);
        addView(textAtomV2View);
        this.title = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        LinearLayout.LayoutParams a12 = a.a(textAtomV2View2, R$id.switchSubtitle, -2, -2);
        a12.gravity = 1;
        textAtomV2View2.setLayoutParams(a12);
        addView(textAtomV2View2);
        this.subtitle = textAtomV2View2;
        this.maxWidth = (context.getResources().getDisplayMetrics().widthPixels * 2) / 3;
        setId(R$id.switchItemCL);
        int i13 = paddingHorizontal;
        int i14 = paddingVertical;
        setPadding(i13, i14, i13, i14);
        setOrientation(1);
    }
}
