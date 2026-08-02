package defpackage;

import com.mbridge.msdk.foundation.download.Command;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class le2 {
    public final zad a;
    public final ke2 b;
    public final ke2 c;
    public final String d;
    public o5a e;
    public final String f;
    public o5a g;
    public final String h;
    public o5a i;
    public final long j;
    public final long k;
    public final String l;
    public final int m;

    public le2(zad zadVar, mad madVar, o5a o5aVar) {
        this.a = zadVar;
        this.b = wkn.H(zadVar.d);
        this.c = wkn.H(madVar.c);
        this.m = -1;
        this.j = zadVar.b;
        this.k = zadVar.c;
        for (Map.Entry entry : zadVar.d.a.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) CollectionsKt.firstOrNull((List) entry.getValue());
            if (str2 != null) {
                if (c.o(str, "Date", true)) {
                    this.d = str2;
                } else if (c.o(str, "Expires", true)) {
                    this.h = str2;
                } else if (c.o(str, "Last-Modified", true)) {
                    this.f = str2;
                } else if (c.o(str, Command.HTTP_HEADER_ETAG, true)) {
                    this.l = str2;
                } else if (c.o(str, "Age", true)) {
                    this.m = djk.a(-1, str2);
                }
            }
        }
    }

    public final o5a a() {
        o5a L;
        o5a o5aVar = this.i;
        if (o5aVar != null) {
            return o5aVar;
        }
        String str = this.h;
        if (str == null) {
            return null;
        }
        if (str.equals("0")) {
            o5a o5aVar2 = o5a.c;
            L = uic.l(999999999, -3217862419201L);
        } else {
            o5a o5aVar3 = o5a.c;
            L = q5a.L(str, djk.a);
        }
        this.i = L;
        return L;
    }

    public final o5a b() {
        o5a o5aVar = this.e;
        if (o5aVar != null) {
            return o5aVar;
        }
        String str = this.d;
        if (str == null) {
            return null;
        }
        o5a o5aVar2 = o5a.c;
        o5a L = q5a.L(str, djk.a);
        this.e = L;
        return L;
    }
}
