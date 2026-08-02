package ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.content.adapter;

import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.badge.Badge;

@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\f\u001a\u00020\t\"\n\b\u0000\u0010\u0000\u0018\u0001*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"I", "T", "LX4/a;", "V", "item", "", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "", "invoke", "(Ljava/lang/Object;Ljava/util/List;I)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes5.dex */
public final class ToursFlightBadgesAdapterDelegateKt$toursFlightBadgesAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1 extends AbstractC7737t implements InterfaceC6511n<Badge, List<? extends Badge>, Integer, Boolean> {
    public static final ToursFlightBadgesAdapterDelegateKt$toursFlightBadgesAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1 INSTANCE = new ToursFlightBadgesAdapterDelegateKt$toursFlightBadgesAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1();

    public ToursFlightBadgesAdapterDelegateKt$toursFlightBadgesAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1() {
        super(3);
    }

    @NotNull
    public final Boolean invoke(Badge badge, @NotNull List<? extends Badge> list, int i11) {
        Intrinsics.checkNotNullParameter(list, "<anonymous parameter 1>");
        return Boolean.valueOf(badge instanceof Badge);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Boolean invoke(Badge badge, List<? extends Badge> list, Integer num) {
        return invoke(badge, list, num.intValue());
    }
}
