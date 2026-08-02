package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/Function2;", "", "", "", "onTagClickListener", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "travelPersonalAccountReplenishmentAdapterDelegate", "(Lkotlin/jvm/functions/Function2;)Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "b2b_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelPersonalAccountReplenishmentAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<TagV3Atom.TagAtom>> travelPersonalAccountReplenishmentAdapterDelegate(@NotNull Function2<? super String, ? super Integer, Unit> onTagClickListener) {
        Intrinsics.checkNotNullParameter(onTagClickListener, "onTagClickListener");
        return new DslViewBindingListAdapterDelegate(TravelPersonalAccountReplenishmentAdapterDelegateKt$travelPersonalAccountReplenishmentAdapterDelegate$1.INSTANCE, TravelPersonalAccountReplenishmentAdapterDelegateKt$travelPersonalAccountReplenishmentAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new TravelPersonalAccountReplenishmentAdapterDelegateKt$travelPersonalAccountReplenishmentAdapterDelegate$2(onTagClickListener), TravelPersonalAccountReplenishmentAdapterDelegateKt$travelPersonalAccountReplenishmentAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
