package ru.ozon.uni.android.uikit.appearance.text;

import android.content.res.TypedArray;
import android.text.TextUtils;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikit.appearance.AttributesAppearance;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0015\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0013H\u0016R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/uni/android/uikit/appearance/text/FontAppearance;", "T", "Landroid/widget/TextView;", "Lru/ozon/uni/android/uikit/appearance/AttributesAppearance;", "<init>", "()V", "includeFonPadding", "", "Ljava/lang/Boolean;", "singleLine", "gravity", "", "maxLines", "ellipsize", "styleableId", "", "getStyleableId", "()[I", "readAttribute", "", "attr", "typedAttributes", "Landroid/content/res/TypedArray;", "apply", "view", "(Landroid/widget/TextView;)V", "reset", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FontAppearance<T extends TextView> extends AttributesAppearance<T> {
    private Boolean includeFonPadding;
    private Boolean singleLine;
    public static final int $stable = 8;
    private int gravity = -1;
    private int maxLines = -1;
    private int ellipsize = -1;

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    @NotNull
    protected int[] getStyleableId() {
        int[] Font = R$styleable.Font;
        Intrinsics.checkNotNullExpressionValue(Font, "Font");
        return Font;
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    public void readAttribute(int attr, @NotNull TypedArray typedAttributes) {
        Intrinsics.checkNotNullParameter(typedAttributes, "typedAttributes");
        if (attr == R$styleable.Font_android_includeFontPadding) {
            this.includeFonPadding = Boolean.valueOf(typedAttributes.getBoolean(attr, true));
            return;
        }
        if (attr == R$styleable.Font_android_singleLine) {
            this.singleLine = Boolean.valueOf(typedAttributes.getBoolean(attr, false));
            return;
        }
        if (attr == R$styleable.Font_android_gravity) {
            this.gravity = typedAttributes.getInt(attr, -1);
        } else if (attr == R$styleable.Font_android_maxLines) {
            this.maxLines = typedAttributes.getInt(attr, -1);
        } else if (attr == R$styleable.Font_android_ellipsize) {
            this.ellipsize = typedAttributes.getInt(attr, -1);
        }
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    public void reset() {
        this.includeFonPadding = null;
        this.singleLine = null;
        this.gravity = -1;
        this.maxLines = -1;
        this.ellipsize = -1;
    }

    @Override // ru.ozon.uni.android.uikit.appearance.StyleAppearance
    public void apply(@NotNull T view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Boolean bool = this.includeFonPadding;
        if (bool != null) {
            view.setIncludeFontPadding(bool.booleanValue());
        }
        Boolean bool2 = this.singleLine;
        if (bool2 != null) {
            view.setSingleLine(bool2.booleanValue());
        }
        int i11 = this.gravity;
        if (i11 >= 0) {
            view.setGravity(i11);
        }
        int i12 = this.maxLines;
        if (i12 >= 0) {
            view.setMaxLines(i12);
        }
        int i13 = this.ellipsize;
        view.setEllipsize(i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? null : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.END : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START);
    }
}
