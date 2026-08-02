package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.chat.ChatUser;
import com.sofascore.model.util.ChatInterface;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lpq2;", "Lq8;", "mq2", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class pq2 extends q8 {
    public final s96 e;
    public final s96 f;
    public final cs2 g;
    public final wqc h;
    public final fyk i;
    public ChatInterface j;
    public mf k;
    public final yzc l;
    public final yzc m;
    public final yzc n;
    public final yzc o;
    public final yzc p;
    public final yzc q;
    public final fdi r;
    public final aeh s;
    public final hof t;
    public final yzc u;
    public final yzc v;
    public g9i w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq2(Application application, s96 s96Var, s96 s96Var2, cs2 cs2Var, wqc wqcVar, fyk fykVar, fqg fqgVar) {
        super(application);
        Object value;
        SharedPreferences d;
        SharedPreferences d2;
        s96Var.getClass();
        s96Var2.getClass();
        cs2Var.getClass();
        wqcVar.getClass();
        fykVar.getClass();
        fqgVar.getClass();
        this.e = s96Var;
        this.f = s96Var2;
        this.g = cs2Var;
        this.h = wqcVar;
        this.i = fykVar;
        this.j = (ChatInterface) fqgVar.a("CHAT_INTERFACE_OBJECT");
        this.k = mf.c;
        yzc yzcVar = new yzc();
        this.l = yzcVar;
        this.m = yzcVar;
        yzc yzcVar2 = new yzc();
        this.n = yzcVar2;
        this.o = yzcVar2;
        yzc yzcVar3 = new yzc();
        this.p = yzcVar3;
        this.q = yzcVar3;
        fdi a = gdi.a(new mq2(null, null));
        this.r = a;
        aeh b = beh.b(0, 0, null, 7);
        this.s = b;
        this.t = un0.t(b);
        yea yeaVar = j58.a;
        if (fn0.B("chat_translate_showDialog") || k().isAdmin()) {
            Context i = i();
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = i.getApplicationContext();
                synchronized (uic.i) {
                    d2 = a5f.d(applicationContext);
                    uic.j = d2;
                }
                d2.getClass();
                sharedPreferences = d2;
            }
            String string = sharedPreferences.getString("LANGUAGE", null);
            Context i2 = i();
            SharedPreferences sharedPreferences2 = uic.j;
            if (sharedPreferences2 == null) {
                Context applicationContext2 = i2.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext2);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences2 = d;
            }
            Set<String> stringSet = sharedPreferences2.getStringSet("EXCLUDED_LIST", null);
            do {
                value = a.getValue();
            } while (!a.k(value, new mq2(string, stringSet)));
        }
        yzc yzcVar4 = new yzc();
        this.u = yzcVar4;
        this.v = yzcVar4;
    }

    public static ChatUser k() {
        ia0 ia0Var = ia0.q;
        return jca.D(ok3.p().e());
    }
}
