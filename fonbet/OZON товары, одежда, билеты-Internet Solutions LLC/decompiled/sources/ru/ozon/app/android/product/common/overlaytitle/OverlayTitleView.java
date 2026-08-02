package ru.ozon.app.android.product.common.overlaytitle;

import Xc.a;
import Xc.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bind", "", "overlayTitle", "", "sizeMode", "Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView$SizeMode;", "SizeMode", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"UseCompatLoadingForDrawables"})
/* loaded from: classes13.dex */
public final class OverlayTitleView extends AppCompatTextView {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView$SizeMode;", "", "height", "", "titleTopPadding", "<init>", "(Ljava/lang/String;III)V", "getHeight", "()I", "getTitleTopPadding", "SMALL", "MEDIUM", "LARGE", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SizeMode {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SizeMode[] $VALUES;
        private final int height;
        private final int titleTopPadding;
        public static final SizeMode SMALL = new SizeMode("SMALL", 0, ResourceExtKt.toPx(30), ResourceExtKt.toPx(4));
        public static final SizeMode MEDIUM = new SizeMode("MEDIUM", 1, ResourceExtKt.toPx(36), ResourceExtKt.toPx(6));
        public static final SizeMode LARGE = new SizeMode("LARGE", 2, ResourceExtKt.toPx(40), ResourceExtKt.toPx(8));

        private static final /* synthetic */ SizeMode[] $values() {
            return new SizeMode[]{SMALL, MEDIUM, LARGE};
        }

        static {
            SizeMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private SizeMode(String str, int i11, int i12, int i13) {
            this.height = i12;
            this.titleTopPadding = i13;
        }

        public static SizeMode valueOf(String str) {
            return (SizeMode) Enum.valueOf(SizeMode.class, str);
        }

        public static SizeMode[] values() {
            return (SizeMode[]) $VALUES.clone();
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getTitleTopPadding() {
            return this.titleTopPadding;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OverlayTitleView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bind(@NotNull String overlayTitle, @NotNull SizeMode sizeMode) {
        Intrinsics.checkNotNullParameter(overlayTitle, "overlayTitle");
        Intrinsics.checkNotNullParameter(sizeMode, "sizeMode");
        setText(overlayTitle);
        setLetterSpacing(0.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null || layoutParams.height != sizeMode.getHeight()) {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = sizeMode.getHeight();
            } else {
                layoutParams2 = new ViewGroup.LayoutParams(-1, sizeMode.getHeight());
            }
            setLayoutParams(layoutParams2);
            ViewExtKt.updatePadding$default(this, 0, sizeMode.getTitleTopPadding(), 0, 0, 13, null);
        }
    }

    public /* synthetic */ OverlayTitleView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayTitleView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setContentDescription("ProductGalleryView.overlayTitleView");
        setBackground(context.getDrawable(R$drawable.bg_primary_top_rounded));
        setAlpha(0.9f);
        setGravity(1);
        setTextAppearance(R$style.TextStyle_Caption);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
    }
}
