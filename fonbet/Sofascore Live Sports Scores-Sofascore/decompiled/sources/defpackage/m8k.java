package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m8k {
    public static final lek k = t6a.h("http://localhost");
    public String a;
    public boolean b;
    public int c;
    public o8k d;
    public String e;
    public String f;
    public String g;
    public List h;
    public v8e i;
    public cqa j;

    public m8k() {
        km5 km5Var = km5.a;
        t8e.b.getClass();
        km5Var.getClass();
        this.a = "";
        this.b = false;
        this.c = 0;
        this.d = null;
        this.e = null;
        this.f = null;
        Set set = xz2.a;
        Charset charset = Charsets.UTF_8;
        charset.getClass();
        StringBuilder sb = new StringBuilder();
        CharsetEncoder newEncoder = charset.newEncoder();
        newEncoder.getClass();
        xz2.f(ao2.x(newEncoder, "", 0, 0), new ox1(sb, 19));
        this.g = sb.toString();
        ArrayList arrayList = new ArrayList(k13.r(km5Var, 10));
        im5.a.getClass();
        this.h = arrayList;
        v8e v8eVar = new v8e(8);
        for (String str : rm5.a) {
            str.getClass();
            km5<String> km5Var2 = km5.a;
            String e = xz2.e(str, false);
            ArrayList arrayList2 = new ArrayList(k13.r(km5Var2, 10));
            for (String str2 : km5Var2) {
                str2.getClass();
                arrayList2.add(xz2.e(str2, true));
            }
            v8eVar.r(e, arrayList2);
        }
        this.i = v8eVar;
        this.j = new cqa(v8eVar);
    }

    public final void a() {
        if (this.a.length() <= 0 && !c().a.equals(U3.i.b)) {
            lek lekVar = k;
            this.a = lekVar.a;
            if (this.d == null) {
                this.d = lekVar.g;
            }
            if (this.c == 0) {
                e(lekVar.b);
            }
        }
    }

    public final lek b() {
        a();
        o8k o8kVar = this.d;
        String str = this.a;
        int i = this.c;
        List list = this.h;
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(xz2.c((String) it.next()));
        }
        t8e s = wba.s((v8e) this.j.a);
        String d = xz2.d(0, 0, 15, this.g);
        String str2 = this.e;
        String c = str2 != null ? xz2.c(str2) : null;
        String str3 = this.f;
        String c2 = str3 != null ? xz2.c(str3) : null;
        boolean z = this.b;
        a();
        StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_LOCAL_ONLY);
        s6a.p(this, sb);
        return new lek(o8kVar, str, i, arrayList, s, d, c, c2, z, sb.toString());
    }

    public final o8k c() {
        o8k o8kVar = this.d;
        if (o8kVar != null) {
            return o8kVar;
        }
        o8k o8kVar2 = o8k.c;
        return o8k.c;
    }

    public final void d(List list) {
        list.getClass();
        this.h = list;
    }

    public final void e(int i) {
        if (i < 0 || i >= 65536) {
            ogj.h(ljg.j(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
        } else {
            this.c = i;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_LOCAL_ONLY);
        s6a.p(this, sb);
        return sb.toString();
    }
}
