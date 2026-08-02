package ru.ozon.uni.atoms.af;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.CommonAtomDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "Lru/ozon/uni/atoms/af/CommonAtomDecorator;", "modifyVerticalLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "lp", "data", "Lru/ozon/uni/atoms/data/AtomDTO;", "position", "", "last", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface VerticalAtomsDecorator extends CommonAtomDecorator {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static void decorate(@NotNull VerticalAtomsDecorator verticalAtomsDecorator, @NotNull Canvas canvas, @NotNull Rect bounds, int i11, boolean z11) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            CommonAtomDecorator.DefaultImpls.decorate(verticalAtomsDecorator, canvas, bounds, i11, z11);
        }

        @NotNull
        public static LinearLayout.LayoutParams modifyVerticalLayoutParams(@NotNull VerticalAtomsDecorator verticalAtomsDecorator, @NotNull LinearLayout.LayoutParams lp, @NotNull AtomDTO data, int i11, boolean z11) {
            Intrinsics.checkNotNullParameter(lp, "lp");
            Intrinsics.checkNotNullParameter(data, "data");
            return lp;
        }
    }

    @NotNull
    LinearLayout.LayoutParams modifyVerticalLayoutParams(@NotNull LinearLayout.LayoutParams lp, @NotNull AtomDTO data, int position, boolean last);
}
