package ru.ozon.android.uikit.appearance.atom;

import Sc.InterfaceC3999a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.uikit.appearance.AttributesAppearance;
import ru.ozon.android.uikit.view.atoms.texts.TextAtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/android/uikit/appearance/atom/TextAtomAppearance;", "Lru/ozon/android/uikit/appearance/AttributesAppearance;", "Lru/ozon/android/uikit/view/atoms/texts/TextAtomView;", "<init>", "()V", "view", "", "apply", "(Lru/ozon/android/uikit/view/atoms/texts/TextAtomView;)V", "", "textAppearance", "I", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TextAtomAppearance extends AttributesAppearance<TextAtomView> {
    private int textAppearance = -1;

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
