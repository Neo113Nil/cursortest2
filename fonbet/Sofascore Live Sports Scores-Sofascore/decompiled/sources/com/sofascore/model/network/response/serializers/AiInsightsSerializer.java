package com.sofascore.model.network.response.serializers;

import com.sofascore.model.Sports;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.AiInsightsResponse;
import com.sofascore.model.newNetwork.EventAiInsightsResponse;
import com.sofascore.model.newNetwork.EventTennisAiInsightsResponse;
import defpackage.cp4;
import defpackage.duf;
import defpackage.dy4;
import defpackage.hfa;
import defpackage.qfa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.b;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/network/response/serializers/AiInsightsSerializer;", "Lhfa;", "Lcom/sofascore/model/newNetwork/AiInsightsResponse;", "<init>", "()V", "Lkotlinx/serialization/json/b;", "element", "Ldy4;", "selectDeserializer", "(Lkotlinx/serialization/json/b;)Ldy4;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AiInsightsSerializer extends hfa {

    @NotNull
    public static final AiInsightsSerializer INSTANCE = new AiInsightsSerializer();

    private AiInsightsSerializer() {
        super(duf.a.getOrCreateKotlinClass(AiInsightsResponse.class));
    }

    @Override // defpackage.hfa
    @NotNull
    public dy4 selectDeserializer(@NotNull b element) {
        b bVar;
        element.getClass();
        b bVar2 = (b) qfa.g(element).get(SearchResponseKt.SPORT_ENTITY);
        String c = (bVar2 == null || (bVar = (b) qfa.g(bVar2).get("slug")) == null) ? null : qfa.h(bVar).c();
        if (Intrinsics.c(c, Sports.TENNIS)) {
            return EventTennisAiInsightsResponse.INSTANCE.serializer();
        }
        if (Intrinsics.c(c, Sports.FOOTBALL)) {
            return EventAiInsightsResponse.INSTANCE.serializer();
        }
        cp4.g(c, "Unsupported sport for AiInsights: ");
        return null;
    }
}
