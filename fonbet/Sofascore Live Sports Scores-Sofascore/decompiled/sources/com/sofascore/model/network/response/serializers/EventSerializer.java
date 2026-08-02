package com.sofascore.model.network.response.serializers;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.AmericanFootballEvent;
import com.sofascore.model.mvvm.model.BaseballEvent;
import com.sofascore.model.mvvm.model.BasketballEvent;
import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.DartsEvent;
import com.sofascore.model.mvvm.model.ESportsEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.FootballEvent;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.OtherEvent;
import com.sofascore.model.mvvm.model.TennisEvent;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.duf;
import defpackage.dy4;
import defpackage.hfa;
import defpackage.qfa;
import kotlin.Metadata;
import kotlinx.serialization.json.b;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/network/response/serializers/EventSerializer;", "Lhfa;", "Lcom/sofascore/model/mvvm/model/Event;", "<init>", "()V", "Lkotlinx/serialization/json/b;", "element", "Ldy4;", "selectDeserializer", "(Lkotlinx/serialization/json/b;)Ldy4;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventSerializer extends hfa {

    @NotNull
    public static final EventSerializer INSTANCE = new EventSerializer();

    private EventSerializer() {
        super(duf.a.getOrCreateKotlinClass(Event.class));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // defpackage.hfa
    @NotNull
    public dy4 selectDeserializer(@NotNull b element) {
        b bVar;
        b bVar2;
        b bVar3;
        element.getClass();
        b bVar4 = (b) qfa.g(element).get("tournament");
        String c = (bVar4 == null || (bVar = (b) qfa.g(bVar4).get("category")) == null || (bVar2 = (b) qfa.g(bVar).get(SearchResponseKt.SPORT_ENTITY)) == null || (bVar3 = (b) qfa.g(bVar2).get("slug")) == null) ? null : qfa.h(bVar3).c();
        if (c != null) {
            switch (c.hashCode()) {
                case -1721090992:
                    if (c.equals(Sports.BASEBALL)) {
                        return BaseballEvent.INSTANCE.serializer();
                    }
                    break;
                case -1452201948:
                    if (c.equals(Sports.E_SPORTS)) {
                        return ESportsEvent.INSTANCE.serializer();
                    }
                    break;
                case -877324069:
                    if (c.equals(Sports.TENNIS)) {
                        return TennisEvent.INSTANCE.serializer();
                    }
                    break;
                case -83759494:
                    if (c.equals(Sports.AMERICAN_FOOTBALL)) {
                        return AmericanFootballEvent.INSTANCE.serializer();
                    }
                    break;
                case 108225:
                    if (c.equals(Sports.MMA)) {
                        return MmaEvent.INSTANCE.serializer();
                    }
                    break;
                case 95355092:
                    if (c.equals(Sports.DARTS)) {
                        return DartsEvent.INSTANCE.serializer();
                    }
                    break;
                case 394668909:
                    if (c.equals(Sports.FOOTBALL)) {
                        return FootballEvent.INSTANCE.serializer();
                    }
                    break;
                case 727149765:
                    if (c.equals(Sports.BASKETBALL)) {
                        return BasketballEvent.INSTANCE.serializer();
                    }
                    break;
                case 1032299505:
                    if (c.equals(Sports.CRICKET)) {
                        return CricketEvent.INSTANCE.serializer();
                    }
                    break;
            }
        }
        return OtherEvent.INSTANCE.serializer();
    }
}
