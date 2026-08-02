package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import com.ironsource.L6;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.newNetwork.SetPP;
import com.sofascore.results.R;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.details.EventDetailsFragment;
import com.sofascore.results.event.details.view.tv.model.TvChannelData;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class nx5 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventDetailsFragment b;

    public /* synthetic */ nx5(EventDetailsFragment eventDetailsFragment, int i) {
        this.a = i;
        this.b = eventDetailsFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0149, code lost:
    
        if (r0 > 90) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014b, code lost:
    
        r1 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0169, code lost:
    
        if (r0 > 90) goto L58;
     */
    @Override // defpackage.ct8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Integer valueOf;
        Object obj4;
        int i = this.a;
        Integer num = null;
        Object obj5 = null;
        num = null;
        num = null;
        EventDetailsFragment eventDetailsFragment = this.b;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                TvChannelData tvChannelData = (TvChannelData) obj2;
                o3k o3kVar = (o3k) obj3;
                tvChannelData.getClass();
                o3kVar.getClass();
                dz5 E = eventDetailsFragment.E();
                xw3.L(un0.z(E), null, null, new z23(E, intValue, tvChannelData, o3kVar, (rq3) null, 3), 3);
                return Unit.a;
            default:
                View view = (View) obj;
                ((Integer) obj2).getClass();
                view.getClass();
                g7 g7Var = eventDetailsFragment.D;
                if (g7Var == null) {
                    Intrinsics.i(L6.G1);
                    throw null;
                }
                final int i2 = 1;
                if ((g7Var instanceof ii6) && (obj3 instanceof fz9)) {
                    ii6 ii6Var = (ii6) g7Var;
                    fz9 fz9Var = (fz9) obj3;
                    Set keySet = ii6Var.p.keySet();
                    keySet.getClass();
                    Iterator it = keySet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (Intrinsics.c(((fz9) next).c, fz9Var.c)) {
                                obj5 = next;
                            }
                        }
                    }
                    fz9 fz9Var2 = (fz9) obj5;
                    if (fz9Var2 != null) {
                        boolean z = !fz9Var2.j;
                        Integer num2 = fz9Var2.c;
                        String str = fz9Var2.d;
                        boolean z2 = fz9Var2.e;
                        String str2 = fz9Var2.f;
                        String str3 = fz9Var2.g;
                        Integer num3 = fz9Var2.h;
                        Integer num4 = fz9Var2.i;
                        str.getClass();
                        fz9 fz9Var3 = new fz9(num2, str, z2, str2, str3, num3, num4, z);
                        LinkedHashMap linkedHashMap = new LinkedHashMap(ii6Var.p.size());
                        Set<Map.Entry> entrySet = ii6Var.p.entrySet();
                        entrySet.getClass();
                        for (Map.Entry entry : entrySet) {
                            entry.getClass();
                            Object key = entry.getKey();
                            key.getClass();
                            fz9 fz9Var4 = (fz9) key;
                            Object value = entry.getValue();
                            value.getClass();
                            hi6 hi6Var = (hi6) value;
                            if (fz9Var4 == fz9Var2) {
                                linkedHashMap.put(fz9Var3, hi6Var);
                            } else {
                                linkedHashMap.put(fz9Var4, hi6Var);
                            }
                        }
                        ii6Var.p = linkedHashMap;
                        ii6Var.F(ii6.K(linkedHashMap));
                    }
                    krk krkVar = eventDetailsFragment.l;
                    krkVar.getClass();
                    eventDetailsFragment.t(((hy4) krkVar).b, new fa(26, fz9Var, eventDetailsFragment, ii6Var));
                } else if ((g7Var instanceof wye) && (obj3 instanceof aze)) {
                    wye wyeVar = (wye) g7Var;
                    aze azeVar = (aze) obj3;
                    int i3 = azeVar.a;
                    List list = wyeVar.m;
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj4 = it2.next();
                                if (((SetPP) obj4).getSet() == i3) {
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        SetPP setPP = (SetPP) obj4;
                        if (setPP != null) {
                            setPP.setExpanded(!setPP.getExpanded());
                        }
                        Event event = wyeVar.l;
                        if (event == null) {
                            Intrinsics.i("currentEvent");
                            throw null;
                        }
                        wyeVar.G(event, list);
                    }
                    krk krkVar2 = eventDetailsFragment.l;
                    krkVar2.getClass();
                    eventDetailsFragment.t(((hy4) krkVar2).b, new fa(27, azeVar, eventDetailsFragment, wyeVar));
                } else if (g7Var instanceof mq5) {
                    int i4 = -1;
                    if (obj3 instanceof rq5) {
                        rq5 rq5Var = (rq5) obj3;
                        valueOf = Integer.valueOf(rq5Var.b.getId());
                        Integer coverage = rq5Var.c.getCoverage();
                        if (coverage != null) {
                            i4 = coverage.intValue();
                            break;
                        }
                    } else {
                        if (obj3 instanceof lq5) {
                            lq5 lq5Var = (lq5) obj3;
                            valueOf = Integer.valueOf(lq5Var.b.getId());
                            Integer coverage2 = lq5Var.c.getCoverage();
                            if (coverage2 != null) {
                                i4 = coverage2.intValue();
                                break;
                            }
                        }
                        if (num != null) {
                            eventDetailsFragment.D().L = Integer.valueOf(num.intValue());
                            eventDetailsFragment.M().f(rd6.i);
                        }
                    }
                } else if (obj3 instanceof gz9) {
                    gz9 gz9Var = (gz9) obj3;
                    ArrayList arrayList = gz9Var.f;
                    if (arrayList.size() > 1) {
                        View findViewById = view.findViewById(gz9Var.c.a ? R.id.popup_anchor_home : R.id.popup_anchor_away);
                        if (findViewById != null) {
                            pse pseVar = (pse) eventDetailsFragment.F0.getValue();
                            final jx5 jx5Var = new jx5(eventDetailsFragment, 13);
                            pseVar.getClass();
                            pseVar.c();
                            final int i5 = 0;
                            final jwf jwfVar = (jwf) CollectionsKt.a0(0, arrayList);
                            final int i6 = 2;
                            if (jwfVar != null) {
                                nfc nfcVar = pseVar.g;
                                if (nfcVar == null) {
                                    Intrinsics.i("player1Binding");
                                    throw null;
                                }
                                pseVar.f(nfcVar, tba.t(jwfVar.a), new Function0() { // from class: mse
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i7 = i6;
                                        jwf jwfVar2 = jwfVar;
                                        jx5 jx5Var2 = jx5Var;
                                        switch (i7) {
                                            case 0:
                                                jx5Var2.invoke(jwfVar2);
                                                break;
                                            case 1:
                                                jx5Var2.invoke(jwfVar2);
                                                break;
                                            default:
                                                jx5Var2.invoke(jwfVar2);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                });
                            }
                            final jwf jwfVar2 = (jwf) CollectionsKt.a0(1, arrayList);
                            if (jwfVar2 != null) {
                                nfc nfcVar2 = pseVar.h;
                                if (nfcVar2 == null) {
                                    Intrinsics.i("player2Binding");
                                    throw null;
                                }
                                pseVar.f(nfcVar2, tba.t(jwfVar2.a), new Function0() { // from class: mse
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i7 = i5;
                                        jwf jwfVar22 = jwfVar2;
                                        jx5 jx5Var2 = jx5Var;
                                        switch (i7) {
                                            case 0:
                                                jx5Var2.invoke(jwfVar22);
                                                break;
                                            case 1:
                                                jx5Var2.invoke(jwfVar22);
                                                break;
                                            default:
                                                jx5Var2.invoke(jwfVar22);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                });
                            }
                            final jwf jwfVar3 = (jwf) CollectionsKt.a0(2, arrayList);
                            if (jwfVar3 != null) {
                                nfc nfcVar3 = pseVar.i;
                                if (nfcVar3 == null) {
                                    Intrinsics.i("player3Binding");
                                    throw null;
                                }
                                pseVar.f(nfcVar3, tba.t(jwfVar3.a), new Function0() { // from class: mse
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i7 = i2;
                                        jwf jwfVar22 = jwfVar3;
                                        jx5 jx5Var2 = jx5Var;
                                        switch (i7) {
                                            case 0:
                                                jx5Var2.invoke(jwfVar22);
                                                break;
                                            case 1:
                                                jx5Var2.invoke(jwfVar22);
                                                break;
                                            default:
                                                jx5Var2.invoke(jwfVar22);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                });
                            }
                            PopupWindow popupWindow = pseVar.d;
                            if (popupWindow != null) {
                                pseVar.b(findViewById, popupWindow);
                            }
                        } else {
                            s38.a().c(new IllegalArgumentException(view.toString()));
                        }
                    } else {
                        jwf jwfVar4 = (jwf) CollectionsKt.firstOrNull(arrayList);
                        if (jwfVar4 != null) {
                            Player player = jwfVar4.a;
                            eventDetailsFragment.N(jwfVar4.b, Integer.valueOf(player.getId()), player);
                        }
                    }
                } else if (obj3 instanceof Incident) {
                    Incident incident = (Incident) obj3;
                    Integer playerId = incident.getPlayerId();
                    if (playerId != null) {
                        int intValue2 = playerId.intValue();
                        eventDetailsFragment.N(iwf.a(incident, intValue2), Integer.valueOf(intValue2), null);
                    }
                } else if (obj3 instanceof y21) {
                    wxf wxfVar = EventActivity.h0;
                    Context requireContext = eventDetailsFragment.requireContext();
                    requireContext.getClass();
                    wxf.B(requireContext, ((y21) obj3).d().getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                } else if (obj3 instanceof zy9) {
                    Context requireContext2 = eventDetailsFragment.requireContext();
                    requireContext2.getClass();
                    nv.w(requireContext2, eventDetailsFragment.F().getId(), eventDetailsFragment.F().getStatus().getType(), uu.SUGGEST_CHANGES);
                    eventDetailsFragment.M().f(rd6.e);
                }
                return Unit.a;
        }
    }
}
