package ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.view.adapter;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.uni.atoms.af.AtomDecorator;
import ru.ozon.uni.atoms.af.HorizontalAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/view/adapter/AviaFavoriteListTripRouteAtomsDecoration;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/HorizontalAtomsDecorator;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dsProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "modifyHorizontalLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "lp", "data", "Lru/ozon/uni/atoms/data/AtomDTO;", "position", "", "last", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaFavoriteListTripRouteAtomsDecoration extends AtomDecorator implements HorizontalAtomsDecorator {
    public static final int $stable = DesignSystemDimensProvider.$stable;

    @NotNull
    private final DesignSystemDimensProvider dsProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaFavoriteListTripRouteAtomsDecoration(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dsProvider = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
    }

    @Override // ru.ozon.uni.atoms.af.HorizontalAtomsDecorator
    @NotNull
    public LinearLayout.LayoutParams modifyHorizontalLayoutParams(@NotNull LinearLayout.LayoutParams lp, @NotNull AtomDTO data, int position, boolean last) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof TextDTO) {
            if (!last) {
                setRight(lp, this.dsProvider.getMargin8());
                return lp;
            }
        } else {
            if (!(data instanceof IconDTO)) {
                HorizontalAtomsDecorator.DefaultImpls.modifyHorizontalLayoutParams(this, lp, data, position, last);
                return lp;
            }
            if (!last) {
                setRight(lp, this.dsProvider.getMargin4());
            }
        }
        return lp;
    }
}
