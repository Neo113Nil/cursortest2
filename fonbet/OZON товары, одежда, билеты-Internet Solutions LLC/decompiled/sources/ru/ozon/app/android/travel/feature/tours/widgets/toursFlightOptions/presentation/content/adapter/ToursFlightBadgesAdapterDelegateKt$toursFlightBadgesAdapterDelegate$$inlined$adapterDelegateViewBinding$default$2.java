package ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.content.adapter;

import Tl.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\"\n\b\u0000\u0010\u0000\u0018\u0001*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"I", "T", "LX4/a;", "V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "invoke", "(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes5.dex */
public final class ToursFlightBadgesAdapterDelegateKt$toursFlightBadgesAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2 extends AbstractC7737t implements Function1<ViewGroup, LayoutInflater> {
    public static final ToursFlightBadgesAdapterDelegateKt$toursFlightBadgesAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2 INSTANCE = new ToursFlightBadgesAdapterDelegateKt$toursFlightBadgesAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2();

    public ToursFlightBadgesAdapterDelegateKt$toursFlightBadgesAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final LayoutInflater invoke(@NotNull ViewGroup viewGroup) {
        return b.c(viewGroup, "parent", "from(parent.context)");
    }
}
