package defpackage;

import com.ironsource.U3;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a5n implements nap {
    public final /* synthetic */ int a;
    public final /* synthetic */ map b;

    public /* synthetic */ a5n(map mapVar, int i) {
        this.a = i;
        this.b = mapVar;
    }

    @Override // defpackage.nap
    public final map a(h9p h9pVar, z6n z6nVar) {
        int i = this.a;
        map mapVar = this.b;
        switch (i) {
            case 0:
                Class cls = z6nVar.a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (f9p) mapVar;
                }
                return null;
            default:
                if (z6nVar.a == Number.class) {
                    return (nep) mapVar;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                f9p f9pVar = (f9p) this.b;
                String name = Calendar.class.getName();
                String name2 = GregorianCalendar.class.getName();
                String valueOf = String.valueOf(f9pVar);
                StringBuilder sb = new StringBuilder(wt3.h(name.length(), 14, name2.length(), 9, valueOf.length()) + 1);
                bf3.v(sb, "Factory[type=", name, "+", name2);
                return wt3.m(",adapter=", valueOf, sb, U3.j.e);
            default:
                return super.toString();
        }
    }
}
