package defpackage;

import android.content.Context;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import com.sofascore.model.odds.ProviderOdds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class sld {
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x001c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gv9 a(Context context, OddsCountryProvider oddsCountryProvider, List list) {
        qj qjVar;
        qj ojVar;
        oddsCountryProvider.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return rlh.b;
        }
        ArrayList o = rld.o(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = o.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(egf.a(context, oddsCountryProvider, (ProviderOdds) it2.next()));
            }
            fgf fgfVar = (fgf) CollectionsKt.Y(arrayList2);
            if (fgfVar.f == ProviderOdds.Type.STANDARD) {
                if (!list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (((ProviderOdds) it3.next()).getMarketId() == 1) {
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    if (((fgf) next).d) {
                        arrayList3.add(next);
                    } else {
                        arrayList4.add(next);
                    }
                }
                qjVar = new mj(l6g.W(arrayList4), l6g.W(arrayList3));
                if (qjVar == null) {
                    arrayList.add(qjVar);
                }
            }
            ProviderOdds.Type type = fgfVar.f;
            if (type == ProviderOdds.Type.STANDARD) {
                qjVar = new pj(fgfVar);
            } else {
                if (type == ProviderOdds.Type.HANDICAP) {
                    ojVar = new nj(l6g.W(arrayList2));
                } else if (type == ProviderOdds.Type.MULTIPLE) {
                    ojVar = new oj(l6g.W(arrayList2));
                } else {
                    qjVar = null;
                }
                qjVar = ojVar;
            }
            if (qjVar == null) {
            }
        }
        return l6g.W(arrayList);
    }

    public static and b(Context context, OddsCountryProvider oddsCountryProvider, ProviderOdds providerOdds, String str) {
        oddsCountryProvider.getClass();
        str.getClass();
        List<OddsChoice> choicesReversible = providerOdds.getChoicesReversible();
        ArrayList arrayList = new ArrayList(k13.r(choicesReversible, 10));
        Iterator<T> it = choicesReversible.iterator();
        while (it.hasNext()) {
            arrayList.add(i2a.A(context, oddsCountryProvider, providerOdds, (OddsChoice) it.next()));
        }
        gv9 W = l6g.W(arrayList);
        OddsProvider provider = oddsCountryProvider.getProvider();
        provider.getClass();
        yld yldVar = new yld(provider.getId(), provider.getColors(), provider.getSlug());
        String defaultBetSlipLink = oddsCountryProvider.getDefaultBetSlipLink();
        if (defaultBetSlipLink == null) {
            defaultBetSlipLink = oddsCountryProvider.getProvider().getDefaultBetSlipLink();
        }
        return new and(new old(yldVar, defaultBetSlipLink, oddsCountryProvider.getBranded(), oddsCountryProvider.getOddsOffset(), oddsCountryProvider.getOddsMayDiffer(), oddsCountryProvider.getType(), oddsCountryProvider.getSignupLink()), new fgf(providerOdds.getId(), new m9k(providerOdds.getMarketName()), providerOdds.getMarketId(), providerOdds.isLive(), W, providerOdds.getType(), providerOdds.getChoiceGroup(), 128));
    }
}
