package ru.ozon.app.android.travel.molecules.view.timer;

import android.content.res.TypedArray;
import j0.C7233a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.appearance.AttributesAppearance;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/timer/TimerViewAppearance;", "Lru/ozon/uni/android/uikit/appearance/AttributesAppearance;", "Lru/ozon/app/android/travel/molecules/view/timer/TimerView;", "<init>", "()V", "cardElevation", "", "cardCornerRadius", "contentPaddingLeft", "", "contentPaddingTop", "contentPaddingRight", "contentPaddingBottom", "styleableId", "", "getStyleableId", "()[I", "readAttribute", "", "attr", "typedAttributes", "Landroid/content/res/TypedArray;", "apply", "view", "reset", "Companion", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimerViewAppearance extends AttributesAppearance<TimerView> {
    public static final int $stable = 8;
    private float cardElevation = -1.0f;
    private float cardCornerRadius = -1.0f;
    private int contentPaddingLeft = -1;
    private int contentPaddingTop = -1;
    private int contentPaddingRight = -1;
    private int contentPaddingBottom = -1;

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    @NotNull
    protected int[] getStyleableId() {
        int[] CardView = C7233a.f68710a;
        Intrinsics.checkNotNullExpressionValue(CardView, "CardView");
        return CardView;
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    public void readAttribute(int attr, @NotNull TypedArray typedAttributes) {
        Intrinsics.checkNotNullParameter(typedAttributes, "typedAttributes");
        if (attr == 4) {
            this.cardElevation = typedAttributes.getDimension(attr, -1.0f);
            return;
        }
        if (attr == 3) {
            this.cardCornerRadius = typedAttributes.getDimension(attr, -1.0f);
            return;
        }
        if (attr == 10) {
            this.contentPaddingLeft = typedAttributes.getDimensionPixelSize(attr, -1);
            return;
        }
        if (attr == 12) {
            this.contentPaddingTop = typedAttributes.getDimensionPixelSize(attr, -1);
        } else if (attr == 11) {
            this.contentPaddingRight = typedAttributes.getDimensionPixelSize(attr, -1);
        } else if (attr == 9) {
            this.contentPaddingBottom = typedAttributes.getDimensionPixelSize(attr, -1);
        }
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    public void reset() {
        this.cardElevation = -1.0f;
        this.cardCornerRadius = -1.0f;
        this.contentPaddingLeft = -1;
        this.contentPaddingTop = -1;
        this.contentPaddingRight = -1;
        this.contentPaddingBottom = -1;
    }

    @Override // ru.ozon.uni.android.uikit.appearance.StyleAppearance
    public void apply(@NotNull TimerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        float f7 = this.cardElevation;
        if (f7 >= 0.0f) {
            view.setCardElevation(f7);
        }
        float f11 = this.cardCornerRadius;
        if (f11 >= 0.0f) {
            view.setRadius(f11);
        }
        int i11 = this.contentPaddingLeft;
        if (i11 >= 0 || this.contentPaddingTop >= 0 || this.contentPaddingRight >= 0 || this.contentPaddingBottom >= 0) {
            if (i11 < 0) {
                i11 = view.getContentPaddingLeft();
            }
            int i12 = this.contentPaddingTop;
            if (i12 < 0) {
                i12 = view.getContentPaddingTop();
            }
            int i13 = this.contentPaddingRight;
            if (i13 < 0) {
                i13 = view.getContentPaddingRight();
            }
            int i14 = this.contentPaddingBottom;
            if (i14 < 0) {
                i14 = view.getContentPaddingBottom();
            }
            view.setContentPadding(i11, i12, i13, i14);
        }
    }
}
