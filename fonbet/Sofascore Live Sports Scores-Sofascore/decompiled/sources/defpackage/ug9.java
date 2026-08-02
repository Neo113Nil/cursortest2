package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.player.statistics.compare.SeasonComparisonActivity;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class ug9 implements Function0 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ug9(zg9 zg9Var, int i, x52 x52Var, int i2, boolean z) {
        this.d = zg9Var;
        this.b = i;
        this.e = x52Var;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                zg9 zg9Var = (zg9) this.d;
                int i = this.b;
                x52 x52Var = (x52) this.e;
                int i2 = this.c;
                try {
                    zg9Var.k.getClass();
                    x52Var.skip(i2);
                    zg9Var.x.k(i, tp5.CANCEL);
                    synchronized (zg9Var) {
                        zg9Var.z.remove(Integer.valueOf(i));
                        Unit unit = Unit.a;
                    }
                } catch (IOException unused) {
                }
                return Unit.a;
            case 1:
                zhe zheVar = (zhe) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                int i3 = this.b;
                return "Expected " + zheVar.a + " but got " + charSequence.subSequence(i3, this.c + i3 + 1).toString();
            default:
                TextView textView = (TextView) this.d;
                int i4 = this.b;
                int i5 = this.c;
                Event event = (Event) this.e;
                Context context = textView.getContext();
                context.getClass();
                nv.z0(context, kv.CLICK, "compare_teams", "event_details");
                int i6 = SeasonComparisonActivity.L;
                Context context2 = textView.getContext();
                context2.getClass();
                Integer valueOf = Integer.valueOf(i5);
                UniqueTournament uniqueTournament = event.getTournament().getUniqueTournament();
                Integer valueOf2 = uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null;
                Season season = event.getTournament().getSeason();
                pxg.d(context2, i4, valueOf, valueOf2, season != null ? Integer.valueOf(season.getId()) : null, event.getSeasonStatisticsType(), ok3.s(event), ok3.s(event));
                return Unit.a;
        }
    }

    public /* synthetic */ ug9(zhe zheVar, CharSequence charSequence, int i, int i2) {
        this.d = zheVar;
        this.e = charSequence;
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ ug9(TextView textView, int i, int i2, Event event) {
        this.d = textView;
        this.b = i;
        this.c = i2;
        this.e = event;
    }
}
