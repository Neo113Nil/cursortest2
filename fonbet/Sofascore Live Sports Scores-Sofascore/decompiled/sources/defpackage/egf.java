package defpackage;

import android.content.Context;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class egf {
    public static fgf a(Context context, OddsCountryProvider oddsCountryProvider, ProviderOdds providerOdds) {
        context.getClass();
        oddsCountryProvider.getClass();
        providerOdds.getClass();
        int id = providerOdds.getId();
        m9k m9kVar = new m9k(providerOdds.getMarketName());
        int marketId = providerOdds.getMarketId();
        boolean isLive = providerOdds.isLive();
        ProviderOdds.Type type = providerOdds.getType();
        String choiceGroup = providerOdds.getChoiceGroup();
        boolean shouldReverseOdds = providerOdds.getShouldReverseOdds();
        List<OddsChoice> choicesReversible = providerOdds.getChoicesReversible();
        ArrayList arrayList = new ArrayList(k13.r(choicesReversible, 10));
        Iterator<T> it = choicesReversible.iterator();
        while (it.hasNext()) {
            arrayList.add(i2a.A(context, oddsCountryProvider, providerOdds, (OddsChoice) it.next()));
        }
        return new fgf(id, m9kVar, marketId, isLive, l6g.W(arrayList), type, choiceGroup, shouldReverseOdds);
    }
}
