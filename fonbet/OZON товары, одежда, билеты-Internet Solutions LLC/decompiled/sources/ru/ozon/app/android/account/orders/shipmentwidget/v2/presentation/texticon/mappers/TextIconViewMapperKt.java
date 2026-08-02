package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.texticon.mappers;

import d00.C6018d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.di.ShipmentWidgetV2ComponentV2;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ld00/d;", "", "", "textIconViewMapper", "(Ld00/d;)V", "cs-orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextIconViewMapperKt {
    public static final void textIconViewMapper(@NotNull C6018d<Object> c6018d) {
        Intrinsics.checkNotNullParameter(c6018d, "<this>");
        c6018d.j().add(new C6018d.a() { // from class: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.texticon.mappers.TextIconViewMapperKt$textIconViewMapper$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ShipmentWidgetV2ComponentV2.INSTANCE.create(it);
            }
        });
        c6018d.p(TextIconViewMapperKt$textIconViewMapper$2.INSTANCE);
    }
}
