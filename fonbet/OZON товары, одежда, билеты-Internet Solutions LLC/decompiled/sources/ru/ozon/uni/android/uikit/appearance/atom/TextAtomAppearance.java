package ru.ozon.uni.android.uikit.appearance.atom;

import Sc.InterfaceC3999a;
import android.content.res.TypedArray;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikit.appearance.AttributesAppearance;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/uni/android/uikit/appearance/atom/TextAtomAppearance;", "Lru/ozon/uni/android/uikit/appearance/AttributesAppearance;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "<init>", "()V", "styleableId", "", "getStyleableId", "()[I", "textAppearance", "", "readAttribute", "", "attr", "typedAttributes", "Landroid/content/res/TypedArray;", "apply", "view", "reset", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TextAtomAppearance extends AttributesAppearance<TextAtomView> {
    private int textAppearance = -1;

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    @NotNull
    protected int[] getStyleableId() {
        int[] TextAtomView = R$styleable.TextAtomView;
        Intrinsics.checkNotNullExpressionValue(TextAtomView, "TextAtomView");
        return TextAtomView;
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    public void readAttribute(int attr, @NotNull TypedArray typedAttributes) {
        Intrinsics.checkNotNullParameter(typedAttributes, "typedAttributes");
        if (attr == R$styleable.TextAtomView_android_textAppearance) {
            this.textAppearance = typedAttributes.getResourceId(attr, R$style.TextStyle_Body_M);
        }
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    public void reset() {
        this.textAppearance = -1;
    }

    @Override // ru.ozon.uni.android.uikit.appearance.StyleAppearance
    public void apply(@NotNull TextAtomView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Integer valueOf = Integer.valueOf(this.textAppearance);
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            view.setTextAppearance(valueOf.intValue());
        }
    }
}
