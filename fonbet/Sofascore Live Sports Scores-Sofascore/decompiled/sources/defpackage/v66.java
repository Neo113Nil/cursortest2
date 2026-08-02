package defpackage;

import android.graphics.Rect;
import com.sofascore.model.fantasy.BasicTeam;
import com.sofascore.model.fantasy.FantasyFixtureFDRView;
import com.sofascore.model.fantasy.FantasyNewsArticle;
import com.sofascore.model.fantasy.FantasyPlayerPriceChanges;
import com.sofascore.model.fantasy.FantasyRound;
import com.sofascore.model.fantasy.FantasyTopPlayerRoundWrapper;
import com.sofascore.model.fantasy.FantasyUserRoundRanking;
import com.sofascore.model.mvvm.model.Batsman;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.time.OffsetDateTime;
import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v66 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ v66(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Object u2gVar;
        Object u2gVar2;
        Object u2gVar3;
        Object u2gVar4;
        int i = this.a;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        switch (i) {
            case 0:
                return o93.b(((Batsman) obj).getFowOver(), ((Batsman) obj2).getFowOver());
            case 1:
                Rect rect = (Rect) obj;
                Rect rect2 = (Rect) obj2;
                return Integer.valueOf(rect.height() + rect.width() + rect.left + rect.top).compareTo(Integer.valueOf(rect2.height() + rect2.width() + rect2.left + rect2.top));
            case 2:
                return Long.valueOf(((FantasyRound) obj).getStartTimestamp()).compareTo(Long.valueOf(((FantasyRound) obj2).getStartTimestamp()));
            case 3:
                return Long.valueOf(((FantasyRound) obj).getStartTimestamp()).compareTo(Long.valueOf(((FantasyRound) obj2).getStartTimestamp()));
            case 4:
                BasicTeam basicTeam = (BasicTeam) obj;
                String nameCode = basicTeam.getNameCode();
                if (nameCode == null) {
                    nameCode = basicTeam.getName();
                }
                BasicTeam basicTeam2 = (BasicTeam) obj2;
                String nameCode2 = basicTeam2.getNameCode();
                if (nameCode2 == null) {
                    nameCode2 = basicTeam2.getName();
                }
                return o93.b(nameCode, nameCode2);
            case 5:
                return Long.valueOf(((FantasyFixtureFDRView) obj).getStartTimestamp()).compareTo(Long.valueOf(((FantasyFixtureFDRView) obj2).getStartTimestamp()));
            case 6:
                FantasyNewsArticle fantasyNewsArticle = (FantasyNewsArticle) obj2;
                try {
                    p2g p2gVar = w2g.b;
                    u2gVar = Long.valueOf(OffsetDateTime.parse(fantasyNewsArticle.getDate()).toInstant().getEpochSecond());
                } catch (Throwable th) {
                    p2g p2gVar2 = w2g.b;
                    u2gVar = new u2g(th);
                }
                if (u2gVar instanceof u2g) {
                    u2gVar = null;
                }
                Long l = (Long) u2gVar;
                Long valueOf = Long.valueOf(l != null ? l.longValue() : Long.MIN_VALUE);
                try {
                    u2gVar2 = Long.valueOf(OffsetDateTime.parse(((FantasyNewsArticle) obj).getDate()).toInstant().getEpochSecond());
                } catch (Throwable th2) {
                    p2g p2gVar3 = w2g.b;
                    u2gVar2 = new u2g(th2);
                }
                Long l2 = (Long) (u2gVar2 instanceof u2g ? null : u2gVar2);
                return valueOf.compareTo(Long.valueOf(l2 != null ? l2.longValue() : Long.MIN_VALUE));
            case 7:
                return Float.valueOf(((FantasyPlayerPriceChanges) obj2).getTotalPriceChange()).compareTo(Float.valueOf(((FantasyPlayerPriceChanges) obj).getTotalPriceChange()));
            case 8:
                return Integer.valueOf(((FantasyTopPlayerRoundWrapper) obj2).getRound().getSequence()).compareTo(Integer.valueOf(((FantasyTopPlayerRoundWrapper) obj).getRound().getSequence()));
            case 9:
                return Long.valueOf(((ho7) obj).a.e).compareTo(Long.valueOf(((ho7) obj2).a.e));
            case 10:
                return Long.valueOf(((Event) obj).getStartTimestamp()).compareTo(Long.valueOf(((Event) obj2).getStartTimestamp()));
            case 11:
                return Boolean.valueOf(((FantasyRoundPlayerUiModel) obj).k).compareTo(Boolean.valueOf(((FantasyRoundPlayerUiModel) obj2).k));
            case 12:
                return Integer.valueOf(((oz6) obj).getC()).compareTo(Integer.valueOf(((oz6) obj2).getC()));
            case 13:
                return Long.valueOf(((wn1) obj).p).compareTo(Long.valueOf(((wn1) obj2).p));
            case 14:
                return Integer.valueOf(((FantasyUserRoundRanking) obj2).getRank()).compareTo(Integer.valueOf(((FantasyUserRoundRanking) obj).getRank()));
            case 15:
                return Integer.valueOf(((FantasyRound) obj2).getSequence()).compareTo(Integer.valueOf(((FantasyRound) obj).getSequence()));
            case 16:
                return Long.valueOf(((FantasyRound) obj).getStartTimestamp()).compareTo(Long.valueOf(((FantasyRound) obj2).getStartTimestamp()));
            case 17:
                FantasyNewsArticle fantasyNewsArticle2 = (FantasyNewsArticle) obj2;
                try {
                    p2g p2gVar4 = w2g.b;
                    u2gVar3 = Long.valueOf(OffsetDateTime.parse(fantasyNewsArticle2.getDate()).toEpochSecond());
                } catch (Throwable th3) {
                    p2g p2gVar5 = w2g.b;
                    u2gVar3 = new u2g(th3);
                }
                if (u2gVar3 instanceof u2g) {
                    u2gVar3 = null;
                }
                Long l3 = (Long) u2gVar3;
                Long valueOf2 = Long.valueOf(l3 != null ? l3.longValue() : Long.MIN_VALUE);
                try {
                    u2gVar4 = Long.valueOf(OffsetDateTime.parse(((FantasyNewsArticle) obj).getDate()).toEpochSecond());
                } catch (Throwable th4) {
                    p2g p2gVar6 = w2g.b;
                    u2gVar4 = new u2g(th4);
                }
                Long l4 = (Long) (u2gVar4 instanceof u2g ? null : u2gVar4);
                return valueOf2.compareTo(Long.valueOf(l4 != null ? l4.longValue() : Long.MIN_VALUE));
            case 18:
                return Integer.valueOf(((mp6) obj).h.ordinal()).compareTo(Integer.valueOf(((mp6) obj2).h.ordinal()));
            case 19:
                Float f2 = ((FantasyRoundPlayerUiModel) obj2).q;
                Float valueOf3 = Float.valueOf(f2 != null ? f2.floatValue() : 0.0f);
                Float f3 = ((FantasyRoundPlayerUiModel) obj).q;
                if (f3 != null) {
                    f = f3.floatValue();
                }
                return valueOf3.compareTo(Float.valueOf(f));
            case 20:
                Float f4 = ((FantasyRoundPlayerUiModel) obj2).q;
                Float valueOf4 = Float.valueOf(f4 != null ? f4.floatValue() : 0.0f);
                Float f5 = ((FantasyRoundPlayerUiModel) obj).q;
                if (f5 != null) {
                    f = f5.floatValue();
                }
                return valueOf4.compareTo(Float.valueOf(f));
            case 21:
                return Integer.valueOf(((FantasyRoundPlayerUiModel) obj).b.ordinal()).compareTo(Integer.valueOf(((FantasyRoundPlayerUiModel) obj2).b.ordinal()));
            case 22:
                return Integer.valueOf(((FantasyRoundPlayerUiModel) obj).b.ordinal()).compareTo(Integer.valueOf(((FantasyRoundPlayerUiModel) obj2).b.ordinal()));
            case 23:
                return Integer.valueOf(((FantasyPlayerFixtureUiModel) obj).f).compareTo(Integer.valueOf(((FantasyPlayerFixtureUiModel) obj2).f));
            case 24:
                return Integer.valueOf(((zd7) obj).b).compareTo(Integer.valueOf(((zd7) obj2).b));
            case 25:
                return Integer.valueOf(((zd7) obj2).b).compareTo(Integer.valueOf(((zd7) obj).b));
            case 26:
                return Integer.valueOf(((FantasyRound) obj).getSequence()).compareTo(Integer.valueOf(((FantasyRound) obj2).getSequence()));
            case 27:
                return Long.valueOf(((FantasyPlayerFixtureUiModel) obj).m).compareTo(Long.valueOf(((FantasyPlayerFixtureUiModel) obj2).m));
            case 28:
                return o93.b(((ho1) obj).b, ((ho1) obj2).b);
            default:
                return Long.valueOf(((FantasyFixtureFDRView) obj).getStartTimestamp()).compareTo(Long.valueOf(((FantasyFixtureFDRView) obj2).getStartTimestamp()));
        }
    }
}
