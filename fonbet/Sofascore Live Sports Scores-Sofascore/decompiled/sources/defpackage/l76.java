package defpackage;

import com.sofascore.model.favorites.EventMuteInfo;
import com.sofascore.model.mvvm.model.DbMyUniqueTournament;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class l76 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Integer b;

    public /* synthetic */ l76(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nlg V0;
        int i = this.a;
        Integer num = this.b;
        glg glgVar = (glg) obj;
        switch (i) {
            case 0:
                glgVar.getClass();
                V0 = glgVar.V0("SELECT id, mute FROM events_table WHERE (? IS NULL) OR (id = ?)");
                try {
                    if (num == null) {
                        V0.s(1);
                    } else {
                        V0.q(1, num.intValue());
                    }
                    if (num == null) {
                        V0.s(2);
                    } else {
                        V0.q(2, num.intValue());
                    }
                    ArrayList arrayList = new ArrayList();
                    while (V0.U0()) {
                        arrayList.add(new EventMuteInfo((int) V0.getLong(0), (int) V0.getLong(1)));
                    }
                    V0.close();
                    return arrayList;
                } finally {
                }
            default:
                glgVar.getClass();
                V0 = glgVar.V0("SELECT * FROM my_leagues WHERE (? IS NULL) OR (uniqueTournamentId = ?)");
                try {
                    if (num == null) {
                        V0.s(1);
                    } else {
                        V0.q(1, num.intValue());
                    }
                    if (num == null) {
                        V0.s(2);
                    } else {
                        V0.q(2, num.intValue());
                    }
                    int r = w1a.r(V0, "uniqueTournamentId");
                    int r2 = w1a.r(V0, "notificationsEnabled");
                    ArrayList arrayList2 = new ArrayList();
                    while (V0.U0()) {
                        arrayList2.add(new DbMyUniqueTournament((int) V0.getLong(r), ((int) V0.getLong(r2)) != 0));
                    }
                    V0.close();
                    return arrayList2;
                } finally {
                }
        }
    }
}
