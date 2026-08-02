package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.presentation;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomDecorator;
import ru.ozon.uni.atoms.af.HorizontalAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/presentation/ControlsDecoration;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/HorizontalAtomsDecorator;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "marginBeforeBadges", "", "modifyHorizontalLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "lp", "data", "Lru/ozon/uni/atoms/data/AtomDTO;", "position", "last", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ControlsDecoration extends AtomDecorator implements HorizontalAtomsDecorator {
    private final int marginBeforeBadges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlsDecoration(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.marginBeforeBadges = toPx(8);
    }

    @Override // ru.ozon.uni.atoms.af.HorizontalAtomsDecorator
    @NotNull
    public LinearLayout.LayoutParams modifyHorizontalLayoutParams(@NotNull LinearLayout.LayoutParams lp, @NotNull AtomDTO data, int position, boolean last) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        Intrinsics.checkNotNullParameter(data, "data");
        lp.gravity = 16;
        if (data instanceof Badge) {
            if (position > 0) {
                setLeft(lp, this.marginBeforeBadges);
                return lp;
            }
        } else {
            if (!(data instanceof ButtonV3Atom.SmallButton)) {
                HorizontalAtomsDecorator.DefaultImpls.modifyHorizontalLayoutParams(this, lp, data, position, last);
                return lp;
            }
            if (position > 0) {
                setLeft(lp, this.marginBeforeBadges);
            }
        }
        return lp;
    }
}
