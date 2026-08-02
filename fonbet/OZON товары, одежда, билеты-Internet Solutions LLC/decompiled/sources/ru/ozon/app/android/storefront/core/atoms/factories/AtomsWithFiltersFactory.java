package ru.ozon.app.android.storefront.core.atoms.factories;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.factories.DefaultAtomsFactory;
import ru.ozon.app.android.storefront.core.atoms.data.OpenRangeFilter;
import ru.ozon.app.android.storefront.core.atoms.data.RangeFilter;
import ru.ozon.app.android.storefront.core.atoms.data.TimeRangeFilter;
import ru.ozon.app.android.storefront.core.atoms.holders.openRangeFilter.OpenRangeFilterHolder;
import ru.ozon.app.android.storefront.core.atoms.holders.rangefilter.RangeFilterHolder;
import ru.ozon.app.android.storefront.core.atoms.holders.timeRangeFilter.TimeRangeFilterHolder;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000e\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0006\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/factories/AtomsWithFiltersFactory;", "Lru/ozon/app/android/atoms/v3/factories/DefaultAtomsFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ozon/uni/atoms/data/AtomDTO;", "data", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "createAtom", "(Landroid/content/Context;Lru/ozon/uni/atoms/data/AtomDTO;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AtomsWithFiltersFactory extends DefaultAtomsFactory {
    @Override // ru.ozon.app.android.atoms.v3.factories.DefaultAtomsFactory, ru.ozon.uni.atoms.AtomsFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull AtomDTO data, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> rangeFilterHolder = data instanceof RangeFilter ? new RangeFilterHolder(context, ((RangeFilter) data).getContext()) : data instanceof TimeRangeFilter ? new TimeRangeFilterHolder(context, ((TimeRangeFilter) data).getContext()) : data instanceof OpenRangeFilter ? new OpenRangeFilterHolder(context, ((OpenRangeFilter) data).getContext()) : super.createAtom(context, data, onAction);
        if (rangeFilterHolder != null) {
            return rangeFilterHolder.withAction(onAction);
        }
        return null;
    }
}
