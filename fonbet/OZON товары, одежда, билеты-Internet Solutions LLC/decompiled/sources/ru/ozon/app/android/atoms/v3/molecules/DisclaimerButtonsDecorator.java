package ru.ozon.app.android.atoms.v3.molecules;

import android.content.Context;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$drawable;
import ru.ozon.uni.atoms.af.AtomDecorator;
import ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/atoms/v3/molecules/DisclaimerButtonsDecorator;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/HorizontalFlexAtomsDecorator;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/google/android/flexbox/FlexboxLayout$a;", "lp", "Lru/ozon/uni/atoms/data/AtomDTO;", "data", "", "position", "", "last", "modifyVerticalLayoutParams", "(Lcom/google/android/flexbox/FlexboxLayout$a;Lru/ozon/uni/atoms/data/AtomDTO;IZ)Lcom/google/android/flexbox/FlexboxLayout$a;", "justifyContent", "()I", "showDividerHorizontal", "showDividerVertical", "horizontalDividerDrawable", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DisclaimerButtonsDecorator extends AtomDecorator implements HorizontalFlexAtomsDecorator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclaimerButtonsDecorator(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
    public int horizontalDividerDrawable() {
        return R$drawable.space_flexbox_atom_layout;
    }

    @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
    public int justifyContent() {
        return 0;
    }

    @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
    @NotNull
    public FlexboxLayout.a modifyVerticalLayoutParams(@NotNull FlexboxLayout.a lp, @NotNull AtomDTO data, int position, boolean last) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        Intrinsics.checkNotNullParameter(data, "data");
        return lp;
    }

    @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
    public int showDividerHorizontal() {
        return 0;
    }

    @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
    public int showDividerVertical() {
        return 2;
    }
}
