package ru.ozon.app.android.uikit.view.atoms.buttons.addtocart;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.res.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\u000eH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/buttons/addtocart/AddToCartButtonImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isActive", "", "setState", "", "updateBackground", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AddToCartButtonImageView extends AppCompatImageView implements AtomView {
    private boolean isActive;

    public /* synthetic */ AddToCartButtonImageView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void updateBackground() {
        setBackgroundColor(g.b(getResources(), this.isActive ? R$color.oz_semantic_accent_secondary : R$color.oz_semantic_accent_primary, getContext().getTheme()));
    }

    public final void setState(boolean isActive) {
        this.isActive = isActive;
        updateBackground();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToCartButtonImageView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setId(R$id.addToCartButtonImageView);
        setImageResource(R$drawable.ic_m_cart);
        ThemeExtKt.tint(this, Integer.valueOf(g.b(getResources(), R$color.oz_white_1, context.getTheme())));
        setScaleType(ImageView.ScaleType.CENTER);
        updateBackground();
    }
}
