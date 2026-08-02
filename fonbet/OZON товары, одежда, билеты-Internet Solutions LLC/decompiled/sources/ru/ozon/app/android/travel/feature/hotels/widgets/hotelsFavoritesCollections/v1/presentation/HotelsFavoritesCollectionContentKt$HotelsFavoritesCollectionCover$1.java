package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsFavoritesCollections.v1.presentation;

import B1.InterfaceC2547p;
import Ej.b;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.y0;
import n0.C8366G;
import ru.ozon.pikazon.compose.painter.f;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class HotelsFavoritesCollectionContentKt$HotelsFavoritesCollectionCover$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ List<? extends String> $imagesLinks;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsFavoritesCollectionContentKt$HotelsFavoritesCollectionCover$1(List<? extends String> list) {
        super(2);
        this.$imagesLinks = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        e b11;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        int i12 = 0;
        if (this.$imagesLinks.isEmpty()) {
            interfaceC3967k.o(1138792120);
            b11 = androidx.compose.foundation.e.b(e.f40358c0, UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getGraphicNeutralOnLight(), y0.a());
            C5185h.a(b11, interfaceC3967k, 0);
            interfaceC3967k.k();
            return;
        }
        interfaceC3967k.o(1138902542);
        for (Object obj : this.$imagesLinks) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            String str = (String) obj;
            interfaceC3967k.G(-191927258, str);
            C8366G.a(f.a(str, InterfaceC2547p.a.a(), null, null, interfaceC3967k, 48, 12), b.a(i13, "image_"), null, null, InterfaceC2547p.a.a(), 0.0f, null, interfaceC3967k, 24576, 108);
            interfaceC3967k.J();
            i12 = i13;
        }
        interfaceC3967k.k();
    }
}
