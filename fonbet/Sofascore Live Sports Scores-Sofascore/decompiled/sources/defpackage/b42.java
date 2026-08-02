package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.sofascore.model.buzzer.APIBuzzerTile;
import com.sofascore.model.chat.DbChatMessage;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class b42 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ b42(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Event d;
        Drawable mutate;
        Drawable mutate2;
        Drawable mutate3;
        Drawable drawable = null;
        switch (this.a) {
            case 0:
                aee aeeVar = (aee) obj;
                ff5 ff5Var = nz.b;
                aeeVar.getClass();
                if (((Context) ktm.I(aeeVar, ff5Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return d42.b;
                }
                a42.a.getClass();
                return z32.c;
            case 1:
                y3h.j((b4h) obj, 0);
                return Unit.a;
            case 2:
                y3h.j((b4h) obj, 0);
                return Unit.a;
            case 3:
                obj.getClass();
                if (obj instanceof APIBuzzerTile) {
                    return (APIBuzzerTile) obj;
                }
                return null;
            case 4:
                ((UniqueTournament) obj).getClass();
                return Boolean.TRUE;
            case 5:
                ((UniqueTournament) obj).getClass();
                return Boolean.valueOf(!Intrinsics.c(r15.getCompetitionType(), wk2.j.a));
            case 6:
                UniqueTournament uniqueTournament = (UniqueTournament) obj;
                uniqueTournament.getClass();
                return Boolean.valueOf(Intrinsics.c(uniqueTournament.getCompetitionType(), "domestic-league"));
            case 7:
                UniqueTournament uniqueTournament2 = (UniqueTournament) obj;
                uniqueTournament2.getClass();
                return Boolean.valueOf(Intrinsics.c(uniqueTournament2.getCompetitionType(), "domestic-cup"));
            case 8:
                UniqueTournament uniqueTournament3 = (UniqueTournament) obj;
                uniqueTournament3.getClass();
                return Boolean.valueOf(Intrinsics.c(uniqueTournament3.getCompetitionType(), "international-cup"));
            case 9:
                UniqueTournament uniqueTournament4 = (UniqueTournament) obj;
                uniqueTournament4.getClass();
                return Boolean.valueOf(Intrinsics.c(uniqueTournament4.getCompetitionType(), "national"));
            case 10:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return new ep5(((sl2) entry.getKey()).a, entry.getValue());
            case 11:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                String str = (String) entry2.getKey();
                str.getClass();
                return new ep5(new sl2(str), entry2.getValue());
            case 12:
                sl2 sl2Var = (sl2) obj;
                sl2Var.getClass();
                return sl2Var.a;
            case 13:
                String str2 = (String) obj;
                str2.getClass();
                return new sl2(str2);
            case 14:
                ij9 ij9Var = (ij9) obj;
                ij9Var.getClass();
                return Integer.valueOf(ij9Var.a.length());
            case 15:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                nlg V0 = glgVar.V0("SELECT * FROM chat_message_table");
                try {
                    int r = w1a.r(V0, "eventId");
                    int r2 = w1a.r(V0, "messageTimestamp");
                    int r3 = w1a.r(V0, "voteTimestamp");
                    int r4 = w1a.r(V0, "reportTimestamp");
                    ArrayList arrayList = new ArrayList();
                    while (V0.U0()) {
                        arrayList.add(new DbChatMessage((int) V0.getLong(r), V0.getLong(r2), V0.getLong(r3), V0.getLong(r4)));
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            case 16:
                return Unit.a;
            case 17:
                jyj jyjVar = (jyj) obj;
                jyjVar.getClass();
                f9e f9eVar = (f9e) jyjVar;
                f9eVar.p = false;
                sea.p(f9eVar);
                return Boolean.FALSE;
            case 18:
                Event event = (Event) obj;
                event.getClass();
                return Long.valueOf(event.getStartTimestamp());
            case 19:
                obj.getClass();
                y21 y21Var = obj instanceof y21 ? (y21) obj : null;
                if (y21Var == null || (d = y21Var.d()) == null) {
                    return null;
                }
                return Long.valueOf(d.getStartTimestamp());
            case 20:
                Context context = (Context) obj;
                context.getClass();
                Drawable drawable2 = context.getDrawable(R.drawable.ic_swap_injured_16);
                if (drawable2 != null && (mutate = drawable2.mutate()) != null) {
                    mutate.setTint(context.getColor(R.color.error));
                    drawable = mutate;
                }
                return hkg.c0(context) ? new pa5(1.0f, new Drawable[]{drawable}) : drawable;
            case 21:
                Context context2 = (Context) obj;
                context2.getClass();
                Drawable drawable3 = context2.getDrawable(R.drawable.ic_swap_commentary);
                if (drawable3 != null && (mutate2 = drawable3.mutate()) != null) {
                    drawable = mutate2;
                }
                return hkg.c0(context2) ? new pa5(-1.0f, new Drawable[]{drawable}) : drawable;
            case 22:
                Context context3 = (Context) obj;
                context3.getClass();
                Integer valueOf = Integer.valueOf(R.color.n_lv_1);
                if ((4 & 2) != 0) {
                    valueOf = null;
                }
                Drawable drawable4 = context3.getDrawable(R.drawable.ic_swap_16);
                if (drawable4 == null || (mutate3 = drawable4.mutate()) == null) {
                    return null;
                }
                if (valueOf != null) {
                    mutate3.setTint(context3.getColor(valueOf.intValue()));
                }
                return mutate3;
            case 23:
                String str3 = (String) obj;
                str3.getClass();
                return Long.valueOf(str3.length() == 0 ? 0L : 300L);
            case 24:
                ((r60) obj).getClass();
                return l98.l0(uo5.e(null, 3), uo5.f(null, 3));
            case 25:
                gv9 gv9Var = (gv9) obj;
                gv9Var.getClass();
                return Integer.valueOf(gv9Var.size());
            case 26:
                ((r60) obj).getClass();
                return l98.l0(uo5.e(null, 3), uo5.f(null, 3));
            case 27:
                gv9 gv9Var2 = (gv9) obj;
                gv9Var2.getClass();
                return Integer.valueOf(gv9Var2.size());
            case 28:
                ((c73) obj).getClass();
                return null;
            default:
                ((r60) obj).getClass();
                return l98.l0(uo5.e(null, 3), uo5.f(null, 3));
        }
    }
}
