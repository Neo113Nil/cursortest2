package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.model.newNetwork.TvChannelsResponse;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg4k;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class g4k extends q8 {
    public final s96 e;
    public final z3k f;
    public final a4k g;
    public boolean h;
    public final yzc i;
    public final yzc j;
    public final fu3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4k(Application application, s96 s96Var, z3k z3kVar, a4k a4kVar) {
        super(application);
        s96Var.getClass();
        z3kVar.getClass();
        a4kVar.getClass();
        this.e = s96Var;
        this.f = z3kVar;
        this.g = a4kVar;
        yzc yzcVar = new yzc();
        this.i = yzcVar;
        this.j = yzcVar;
        this.k = j72.t(new o63(14, new o63(13, zm2.s(z3kVar.a.a, false, new String[]{"my_channels_table"}, new crj(16)), this), this));
        if (a4kVar.a.getLong("PREF_TV_SCHEDULE_LAST_UPDATE", System.currentTimeMillis()) < System.currentTimeMillis() - 604800000) {
            xw3.L(un0.z(this), null, null, new ajj(this, null, 6), 3);
        }
    }

    public static ArrayList l() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 4; i++) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, i);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            arrayList.add(calendar);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(sq3 sq3Var) {
        c4k c4kVar;
        int i;
        String str;
        TvChannelsResponse tvChannelsResponse;
        List<TvChannel> channels;
        if (sq3Var instanceof c4k) {
            c4kVar = (c4k) sq3Var;
            int i2 = c4kVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4kVar.u = i2 - Integer.MIN_VALUE;
                Object obj = c4kVar.s;
                lu3 lu3Var = lu3.a;
                i = c4kVar.u;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    ArrayList arrayList = dv3.a;
                    int i3 = ke0.c;
                    if (i3 == 0) {
                        i3 = c1c.a;
                    }
                    String d = dv3.d(new Integer(i3));
                    if (d == null) {
                        return km5.a;
                    }
                    c4kVar.r = d;
                    c4kVar.u = 1;
                    z3k z3kVar = this.f;
                    z3kVar.getClass();
                    Object P = yaa.P(new fzh(z3kVar, d, rq3Var, 9), c4kVar);
                    if (P == lu3Var) {
                        return lu3Var;
                    }
                    str = d;
                    obj = P;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = c4kVar.r;
                    y6a.M(obj);
                }
                tvChannelsResponse = (TvChannelsResponse) yaa.x((x2g) obj);
                if (tvChannelsResponse != null || (channels = tvChannelsResponse.getChannels()) == null) {
                    return km5.a;
                }
                Iterator<T> it = channels.iterator();
                while (it.hasNext()) {
                    ((TvChannel) it.next()).setCountryCode(str);
                }
                xw3.L(h(), null, null, new t3((Object) this, (Object) channels, false, rq3Var, 14), 3);
                wt3.v(this.g.a, "PREF_TV_SCHEDULE_FIRST_LOAD", false);
                return channels;
            }
        }
        c4kVar = new c4k(this, sq3Var);
        Object obj2 = c4kVar.s;
        lu3 lu3Var2 = lu3.a;
        i = c4kVar.u;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        tvChannelsResponse = (TvChannelsResponse) yaa.x((x2g) obj2);
        if (tvChannelsResponse != null) {
        }
        return km5.a;
    }
}
