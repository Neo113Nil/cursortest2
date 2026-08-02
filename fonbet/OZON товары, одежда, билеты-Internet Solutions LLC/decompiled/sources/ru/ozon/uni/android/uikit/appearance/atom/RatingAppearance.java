package ru.ozon.uni.android.uikit.appearance.atom;

import Sc.InterfaceC3999a;
import android.content.res.TypedArray;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikit.appearance.AttributesAppearance;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.rating.RatingView;

@InterfaceC3999a
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/android/uikit/appearance/atom/RatingAppearance;", "Lru/ozon/uni/android/uikit/appearance/AttributesAppearance;", "Lru/ozon/uni/android/uikit/view/atoms/rating/RatingView;", "<init>", "()V", "styleableId", "", "getStyleableId", "()[I", "defaultStarSize", "", "defaultStarSeparation", "starSize", "starsSeparation", "readAttribute", "", "attr", "", "typedAttributes", "Landroid/content/res/TypedArray;", "apply", "view", "reset", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RatingAppearance extends AttributesAppearance<RatingView> {
    private final float defaultStarSeparation;
    private final float defaultStarSize;
    private float starSize;
    private float starsSeparation;

    @NotNull
    private final int[] styleableId;

    public RatingAppearance() {
        int[] RatingBar = R$styleable.RatingBar;
        Intrinsics.checkNotNullExpressionValue(RatingBar, "RatingBar");
        this.styleableId = RatingBar;
        float pxF = ResourceExtKt.toPxF(16);
        this.defaultStarSize = pxF;
        this.starSize = pxF;
        this.starsSeparation = this.defaultStarSeparation;
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    @NotNull
    protected int[] getStyleableId() {
        return this.styleableId;
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    public void readAttribute(int attr, @NotNull TypedArray typedAttributes) {
        Intrinsics.checkNotNullParameter(typedAttributes, "typedAttributes");
        if (attr == R$styleable.RatingBar_rb_starSize) {
            this.starSize = typedAttributes.getDimension(attr, 0.0f);
        } else if (attr == R$styleable.RatingBar_rb_starsSeparation) {
            this.starsSeparation = typedAttributes.getDimension(attr, 0.0f);
        }
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    public void reset() {
        this.starSize = this.defaultStarSize;
        this.starsSeparation = this.defaultStarSeparation;
    }

    @Override // ru.ozon.uni.android.uikit.appearance.StyleAppearance
    public void apply(@NotNull RatingView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRatingSize(this.starSize, this.starsSeparation);
    }
}
