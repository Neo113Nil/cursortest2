package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.chat.ChatUser;
import com.sofascore.model.chat.Message;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.newNetwork.TrendingGridTileSize;
import com.sofascore.results.chat.fragment.AbstractChatFragment;
import com.sofascore.results.stagesport.fragments.details.StageDetailsResultsFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class p1 extends ot8 implements Function2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.b = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        if (r3 == 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:262:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x064c  */
    /* JADX WARN: Type inference failed for: r0v49, types: [bw4, java.lang.Object, p3h, se8, wtc] */
    /* JADX WARN: Type inference failed for: r11v13, types: [fdi] */
    /* JADX WARN: Type inference failed for: r1v77, types: [com.sofascore.results.view.typeheader.TypeHeaderView] */
    /* JADX WARN: Type inference failed for: r3v51, types: [km5] */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v54, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r9v2, types: [ara] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Collection collection;
        boolean z;
        Object value;
        Object value2;
        Object value3;
        ha7 ha7Var;
        Object obj3;
        boolean g;
        boolean g2;
        Object value4;
        byb bybVar;
        ArrayList arrayList;
        ?? r3;
        Object obj4;
        int i = 5;
        int i2 = 26;
        ?? r9 = 0;
        switch (this.b) {
            case 0:
                Message message = (Message) obj;
                View view = (View) obj2;
                message.getClass();
                view.getClass();
                AbstractChatFragment abstractChatFragment = (AbstractChatFragment) this.receiver;
                abstractChatFragment.getClass();
                ChatUser user = message.getUser();
                if (user != null && abstractChatFragment.K().isLoggedIn() && !s9a.y(message)) {
                    if (abstractChatFragment.I()) {
                        abstractChatFragment.P();
                    } else {
                        abstractChatFragment.x = true;
                        krk krkVar = abstractChatFragment.l;
                        krkVar.getClass();
                        ((yn8) krkVar).l.suppressLayout(true);
                        FragmentActivity requireActivity = abstractChatFragment.requireActivity();
                        requireActivity.getClass();
                        View currentFocus = requireActivity.getCurrentFocus();
                        if (currentFocus == null) {
                            currentFocus = new View(requireActivity);
                        }
                        EditText editText = currentFocus instanceof EditText ? (EditText) currentFocus : null;
                        if (editText != null) {
                            editText.clearFocus();
                        }
                        Context context = currentFocus.getContext();
                        context.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class);
                        if (inputMethodManager != null) {
                            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                        }
                        xw3.L(wca.x(abstractChatFragment.getLifecycle()), null, null, new u1(abstractChatFragment, view, message, user, null, 0), 3);
                    }
                }
                break;
            case 1:
                ((ry3) this.receiver).getClass();
                break;
            case 2:
                ((ry3) this.receiver).getClass();
                break;
            case 3:
                a64 a64Var = (a64) obj;
                int intValue = ((Number) obj2).intValue();
                a64Var.getClass();
                q54 q54Var = (q54) this.receiver;
                q54Var.getClass();
                xw3.L(un0.z(q54Var), null, null, new ok0(q54Var, a64Var, intValue, (rq3) null, 4), 3);
                break;
            case 4:
                int intValue2 = ((Number) obj).intValue();
                int intValue3 = ((Number) obj2).intValue();
                tr3 tr3Var = (tr3) this.receiver;
                fdi fdiVar = tr3Var.t;
                Object value5 = fdiVar.getValue();
                e0a e0aVar = value5 instanceof e0a ? (e0a) value5 : null;
                if (e0aVar != null) {
                    gv9 gv9Var = e0aVar.a;
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList(k13.r(gv9Var, 10));
                    Iterator it = gv9Var.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((wyf) it.next()).a);
                    }
                    EventSuggest.IncidentSuggest incidentSuggest = (EventSuggest.IncidentSuggest) arrayList3.get(intValue2);
                    EventSuggest.IncidentSuggest incidentSuggest2 = (EventSuggest.IncidentSuggest) arrayList3.get(intValue3);
                    if (((incidentSuggest instanceof EventSuggest.IncidentSuggest.CardSuggest) && ((EventSuggest.IncidentSuggest.CardSuggest) incidentSuggest).getTime() == null) || ((incidentSuggest2 instanceof EventSuggest.IncidentSuggest.CardSuggest) && ((EventSuggest.IncidentSuggest.CardSuggest) incidentSuggest2).getTime() == null)) {
                        do {
                            value2 = fdiVar.getValue();
                        } while (!fdiVar.k(value2, value2 instanceof e0a ? (e0a) value2 : value2));
                        xw3.L(un0.z(tr3Var), null, null, new xq3(tr3Var, r9, i), 3);
                    } else {
                        ArrayList arrayList4 = new ArrayList(gv9Var);
                        arrayList4.add(intValue3, arrayList4.remove(intValue2));
                        if ((((wyf) gv9Var.get(intValue3)).a instanceof EventSuggest.IncidentSuggest.GoalSuggest) && (((wyf) gv9Var.get(intValue2)).a instanceof EventSuggest.IncidentSuggest.GoalSuggest)) {
                            tr3.y(arrayList4);
                        }
                        ArrayList arrayList5 = new ArrayList(k13.r(arrayList4, 10));
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(((wyf) it2.next()).a);
                        }
                        Integer M = z8e.M(arrayList5, new q73(8));
                        int intValue4 = M != null ? M.intValue() : Integer.MAX_VALUE;
                        ArrayList arrayList6 = new ArrayList(k13.r(arrayList4, 10));
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            wyf wyfVar = (wyf) it3.next();
                            EventSuggest.IncidentSuggest incidentSuggest3 = wyfVar.a;
                            if (incidentSuggest3 instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                                wyfVar = wyf.a(wyfVar, null, Integer.valueOf(intValue4), 3);
                            } else if (!(incidentSuggest3 instanceof EventSuggest.IncidentSuggest.CardSuggest)) {
                                zzl.b();
                                break;
                            } else {
                                Integer M2 = z8e.M(arrayList5, new ox1((EventSuggest.IncidentSuggest.CardSuggest) incidentSuggest3, i2));
                                if (M2 != null) {
                                    wyfVar = wyf.a(wyfVar, null, Integer.valueOf(M2.intValue()), 3);
                                }
                            }
                            arrayList6.add(wyfVar);
                        }
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it4 = arrayList6.iterator();
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            if (((wyf) next).a.getTime() != null) {
                                arrayList7.add(next);
                            }
                        }
                        Iterator it5 = arrayList7.iterator();
                        if (it5.hasNext()) {
                            ArrayList arrayList8 = new ArrayList();
                            Object next2 = it5.next();
                            while (it5.hasNext()) {
                                Object next3 = it5.next();
                                EventSuggest.IncidentSuggest incidentSuggest4 = ((wyf) next2).a;
                                Integer time = incidentSuggest4.getTime();
                                EventSuggest.IncidentSuggest incidentSuggest5 = ((wyf) next3).a;
                                if (Intrinsics.c(time, incidentSuggest5.getTime())) {
                                    z = yid.m(incidentSuggest4.getAddedTime()) >= yid.m(incidentSuggest5.getAddedTime());
                                    if (!z) {
                                        arrayList2.add(Integer.valueOf(incidentSuggest4.getId()));
                                        arrayList2.add(Integer.valueOf(incidentSuggest5.getId()));
                                    }
                                } else {
                                    Integer time2 = incidentSuggest4.getTime();
                                    time2.getClass();
                                    int intValue5 = time2.intValue();
                                    Integer time3 = incidentSuggest5.getTime();
                                    time3.getClass();
                                    z = intValue5 >= time3.intValue();
                                    if (!z) {
                                        arrayList2.add(Integer.valueOf(incidentSuggest4.getId()));
                                        arrayList2.add(Integer.valueOf(incidentSuggest5.getId()));
                                    }
                                }
                                arrayList8.add(Boolean.valueOf(z));
                                next2 = next3;
                            }
                            collection = arrayList8;
                        } else {
                            collection = km5.a;
                        }
                        if (collection == null || !collection.isEmpty()) {
                            Iterator it6 = collection.iterator();
                            while (it6.hasNext()) {
                                if (((Boolean) it6.next()).booleanValue()) {
                                }
                                do {
                                    value = fdiVar.getValue();
                                } while (!fdiVar.k(value, !(value instanceof e0a) ? e0a.b((e0a) value, l6g.W(arrayList6), l6g.W(arrayList2), r7, 18) : value));
                                if (!r7) {
                                    xw3.L(un0.z(tr3Var), null, null, new xq3(tr3Var, r9, 6), 3);
                                }
                            }
                        }
                        r7 = true;
                        do {
                            value = fdiVar.getValue();
                        } while (!fdiVar.k(value, !(value instanceof e0a) ? e0a.b((e0a) value, l6g.W(arrayList6), l6g.W(arrayList2), r7, 18) : value));
                        if (!r7) {
                        }
                    }
                }
                break;
            case 5:
                String str = (String) obj;
                String str2 = (String) obj2;
                ?? r11 = ((ia7) this.receiver).g;
                do {
                    value3 = r11.getValue();
                    ha7Var = (ha7) value3;
                    aa7 aa7Var = ha7Var.a;
                    if (aa7Var instanceof y97) {
                        ha7Var = ha7.a(ha7Var, y97.a((y97) aa7Var, str == null ? ((y97) aa7Var).a : str, str2 == null ? ((y97) aa7Var).b : str2, null, false, !StringsKt.R(r13), 28), false, 2);
                    }
                } while (!r11.k(value3, ha7Var));
            case 6:
                int intValue6 = ((Number) obj).intValue();
                int intValue7 = ((Number) obj2).intValue();
                te7 te7Var = (te7) this.receiver;
                re7 k = te7Var.k();
                e1d e1dVar = te7Var.h;
                if (k.c.containsKey(intValue6 + "_" + intValue7)) {
                    String g3 = fc6.g(intValue6, intValue7, "_");
                    re7 k2 = te7Var.k();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(te7Var.k().c);
                    linkedHashMap.remove(g3);
                    Unit unit = Unit.a;
                    ((eoh) e1dVar).setValue(re7.a(k2, null, l6g.X(linkedHashMap), 3));
                } else {
                    Iterator it7 = te7Var.k().b.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            obj3 = it7.next();
                            kj7 kj7Var = (kj7) obj3;
                            if (kj7Var.a.a != intValue6 || kj7Var.b != intValue7) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    kj7 kj7Var2 = (kj7) obj3;
                    if (kj7Var2 != null) {
                        String g4 = fc6.g(kj7Var2.a.a, kj7Var2.b, "_");
                        re7 k3 = te7Var.k();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(te7Var.k().c);
                        linkedHashMap2.put(g4, new ki6(rlh.b, true));
                        Unit unit2 = Unit.a;
                        ((eoh) e1dVar).setValue(re7.a(k3, null, l6g.X(linkedHashMap2), 3));
                        iz2 z2 = un0.z(te7Var);
                        hs4 hs4Var = z45.a;
                        xw3.L(z2, hq4.c, null, new hs6(te7Var, kj7Var2, (rq3) r9, 23), 2);
                    }
                }
                break;
            case 7:
                ie8 ie8Var = (ie8) obj;
                ie8 ie8Var2 = (ie8) obj2;
                le8 le8Var = (le8) this.receiver;
                if (le8Var.n && (g = ie8Var2.g()) != ie8Var.g()) {
                    if (g) {
                        fsf fsfVar = new fsf();
                        z1a.R(le8Var, new z07(19, fsfVar, le8Var));
                        ara araVar = (ara) fsfVar.a;
                        if (araVar != null) {
                            araVar.a();
                            r9 = araVar;
                        }
                        le8Var.r = r9;
                    } else {
                        ara araVar2 = le8Var.r;
                        if (araVar2 != null) {
                            araVar2.b();
                        }
                        le8Var.r = null;
                    }
                }
                break;
            case 8:
                ie8 ie8Var3 = (ie8) obj;
                ie8 ie8Var4 = (ie8) obj2;
                ?? r0 = (se8) this.receiver;
                if (r0.n && (g2 = ie8Var4.g()) != ie8Var3.g()) {
                    Function1 function1 = r0.r;
                    if (function1 != null) {
                        function1.invoke(Boolean.valueOf(g2));
                    }
                    mx9 mx9Var = te8.o;
                    if (g2) {
                        xw3.L(r0.Y0(), null, null, new d17(r0, r9, 21), 3);
                        fsf fsfVar2 = new fsf();
                        z1a.R(r0, new n37(29, fsfVar2, (Object) r0));
                        ara araVar3 = (ara) fsfVar2.a;
                        if (araVar3 != null) {
                            araVar3.a();
                        } else {
                            araVar3 = null;
                        }
                        r0.t = araVar3;
                        dma dmaVar = r0.u;
                        if (dmaVar != null && dmaVar.f() && r0.n) {
                            jca.C(r0, mx9Var);
                        }
                    } else {
                        ara araVar4 = r0.t;
                        if (araVar4 != null) {
                            araVar4.b();
                        }
                        r0.t = null;
                        if (r0.n) {
                            jca.C(r0, mx9Var);
                        }
                    }
                    sea.p(r0);
                    wzc wzcVar = r0.q;
                    if (wzcVar != null) {
                        rd8 rd8Var = r0.s;
                        if (g2) {
                            if (rd8Var != null) {
                                r0.n1(wzcVar, new sd8(rd8Var));
                                r0.s = null;
                            }
                            rd8 rd8Var2 = new rd8();
                            r0.n1(wzcVar, rd8Var2);
                            r0.s = rd8Var2;
                        } else if (rd8Var != null) {
                            r0.n1(wzcVar, new sd8(rd8Var));
                            r0.s = null;
                        }
                    }
                }
                break;
            case 9:
                ((ry3) this.receiver).getClass();
                break;
            case 10:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                int intValue8 = ((Number) obj2).intValue();
                serialDescriptor.getClass();
                rfa rfaVar = (rfa) this.receiver;
                rfaVar.getClass();
                if (!serialDescriptor.i(intValue8) && serialDescriptor.g(intValue8).b()) {
                    r7 = true;
                }
                rfaVar.b = r7;
                break;
            case 11:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                str3.getClass();
                str4.getClass();
                dyb dybVar = (dyb) this.receiver;
                dybVar.getClass();
                fdi fdiVar2 = dybVar.e;
                do {
                    value4 = fdiVar2.getValue();
                    bybVar = (byb) value4;
                    gv9<u28> gv9Var2 = bybVar.b;
                    arrayList = new ArrayList(k13.r(gv9Var2, 10));
                    for (u28 u28Var : gv9Var2) {
                        if (Intrinsics.c(u28Var.a, str3)) {
                            u28Var = u28.a(u28Var, str4, false, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                        }
                        arrayList.add(u28Var);
                    }
                } while (!fdiVar2.k(value4, byb.a(bybVar, null, l6g.W(arrayList), 5)));
            case 12:
                Player player = (Player) obj;
                String str5 = (String) obj2;
                player.getClass();
                str5.getClass();
                roe roeVar = (roe) this.receiver;
                roeVar.getClass();
                g9i g9iVar = roeVar.p;
                rq3 rq3Var = null;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                roeVar.p = xw3.L(un0.z(roeVar), null, null, new j8c(roeVar, str5, player, rq3Var, 23), 3);
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                String str6 = (String) obj;
                ((Number) obj2).intValue();
                str6.getClass();
                StageDetailsResultsFragment stageDetailsResultsFragment = (StageDetailsResultsFragment) this.receiver;
                zsk zskVar = stageDetailsResultsFragment.E;
                if (zskVar != null) {
                    zskVar.a();
                }
                stageDetailsResultsFragment.E = null;
                w3i valueOf = w3i.valueOf(str6);
                r7 = valueOf == w3i.d;
                List list = (List) stageDetailsResultsFragment.C().o.d();
                if (list != null) {
                    r3 = new ArrayList();
                    for (Object obj5 : list) {
                        if (CollectionsKt.R(valueOf.b, ((Stage) obj5).getType())) {
                            r3.add(obj5);
                        }
                    }
                    if (r7) {
                        r3 = CollectionsKt.H0(r3, new laf(i2));
                        break;
                    }
                }
                r3 = km5.a;
                Integer num = stageDetailsResultsFragment.C().j;
                stageDetailsResultsFragment.C().j = null;
                Iterator it8 = r3.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        obj4 = it8.next();
                        int id = ((Stage) obj4).getId();
                        if (num != null && id == num.intValue()) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                Stage stage = (Stage) obj4;
                if (stage == null) {
                    if (r7) {
                        stage = (Stage) CollectionsKt.firstOrNull(r3);
                    } else {
                        joa joaVar = l5i.a;
                        stage = l5i.d(r3);
                    }
                }
                ?? r1 = stageDetailsResultsFragment.E().f;
                ArrayList arrayList9 = new ArrayList(k13.r(r3, 10));
                Iterator it9 = r3.iterator();
                while (it9.hasNext()) {
                    arrayList9.add(stageDetailsResultsFragment.F((Stage) it9.next()));
                }
                r1.y(arrayList9, stage != null ? stageDetailsResultsFragment.F(stage) : null, Boolean.TRUE);
                break;
            default:
                int intValue9 = ((Number) obj).intValue();
                TrendingGridTileSize trendingGridTileSize = (TrendingGridTileSize) obj2;
                trendingGridTileSize.getClass();
                c0k c0kVar = (c0k) this.receiver;
                c0kVar.getClass();
                c0kVar.o.add(Integer.valueOf(intValue9));
                c0kVar.n(null, new y51(trendingGridTileSize, intValue9, c0kVar, 13));
                break;
        }
        return Unit.a;
    }
}
