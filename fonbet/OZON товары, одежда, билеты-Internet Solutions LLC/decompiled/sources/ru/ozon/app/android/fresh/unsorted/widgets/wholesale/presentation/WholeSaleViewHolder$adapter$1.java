package ru.ozon.app.android.fresh.unsorted.widgets.wholesale.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class WholeSaleViewHolder$adapter$1 extends C7735q implements Function2<Map<String, ? extends String>, Map<String, ? extends TokenizedTrackingInfo>, Unit> {
    WholeSaleViewHolder$adapter$1(Object obj) {
        super(2, obj, WholeSaleViewHolder.class, "addToCartAction", "addToCartAction(Ljava/util/Map;Ljava/util/Map;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends String> map, Map<String, ? extends TokenizedTrackingInfo> map2) {
        invoke2((Map<String, String>) map, (Map<String, TokenizedTrackingInfo>) map2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, String> p02, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((WholeSaleViewHolder) this.receiver).addToCartAction(p02, map);
    }
}
