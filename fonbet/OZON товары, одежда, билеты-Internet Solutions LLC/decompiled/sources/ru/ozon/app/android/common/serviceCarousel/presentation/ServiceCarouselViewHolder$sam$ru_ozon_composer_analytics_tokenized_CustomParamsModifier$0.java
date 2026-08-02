package ru.ozon.app.android.common.serviceCarousel.presentation;

import Sc.InterfaceC4003e;
import UZ.a;
import WZ.e;
import WZ.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ServiceCarouselViewHolder$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0 implements e, InterfaceC7732n {
    private final /* synthetic */ Function2 function;

    ServiceCarouselViewHolder$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(Function2 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof e) && (obj instanceof InterfaceC7732n)) {
            return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7732n
    @NotNull
    public final InterfaceC4003e<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // WZ.e
    public final /* synthetic */ g modifyParams(a aVar, g gVar) {
        return (g) this.function.invoke(aVar, gVar);
    }
}
