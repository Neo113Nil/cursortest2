package ru.ozon.uni.atoms.af;

import android.graphics.Canvas;
import android.graphics.Rect;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.atoms.af.CommonAtomDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/atoms/af/HorizontalFlexAtomsDecorator;", "Lru/ozon/uni/atoms/af/CommonAtomDecorator;", "Lcom/google/android/flexbox/FlexboxLayout$a;", "lp", "Lru/ozon/uni/atoms/data/AtomDTO;", "data", "", "position", "", "last", "modifyVerticalLayoutParams", "(Lcom/google/android/flexbox/FlexboxLayout$a;Lru/ozon/uni/atoms/data/AtomDTO;IZ)Lcom/google/android/flexbox/FlexboxLayout$a;", "justifyContent", "()I", "showDividerHorizontal", "showDividerVertical", "horizontalDividerDrawable", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface HorizontalFlexAtomsDecorator extends CommonAtomDecorator {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static void decorate(@NotNull HorizontalFlexAtomsDecorator horizontalFlexAtomsDecorator, @NotNull Canvas canvas, @NotNull Rect bounds, int i11, boolean z11) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            CommonAtomDecorator.DefaultImpls.decorate(horizontalFlexAtomsDecorator, canvas, bounds, i11, z11);
        }

        public static int horizontalDividerDrawable(@NotNull HorizontalFlexAtomsDecorator horizontalFlexAtomsDecorator) {
            return R$drawable.space_flexbox_atom_layout;
        }

        public static int justifyContent(@NotNull HorizontalFlexAtomsDecorator horizontalFlexAtomsDecorator) {
            return 0;
        }

        @NotNull
        public static FlexboxLayout.a modifyVerticalLayoutParams(@NotNull HorizontalFlexAtomsDecorator horizontalFlexAtomsDecorator, @NotNull FlexboxLayout.a lp, @NotNull AtomDTO data, int i11, boolean z11) {
            Intrinsics.checkNotNullParameter(lp, "lp");
            Intrinsics.checkNotNullParameter(data, "data");
            return lp;
        }

        public static int showDividerHorizontal(@NotNull HorizontalFlexAtomsDecorator horizontalFlexAtomsDecorator) {
            return 2;
        }

        public static int showDividerVertical(@NotNull HorizontalFlexAtomsDecorator horizontalFlexAtomsDecorator) {
            return 2;
        }
    }

    int horizontalDividerDrawable();

    int justifyContent();

    @NotNull
    FlexboxLayout.a modifyVerticalLayoutParams(@NotNull FlexboxLayout.a lp, @NotNull AtomDTO data, int position, boolean last);

    int showDividerHorizontal();

    int showDividerVertical();
}
