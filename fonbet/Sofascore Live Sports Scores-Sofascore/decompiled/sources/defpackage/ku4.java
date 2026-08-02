package defpackage;

import java.io.InputStream;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ku4 extends swd {
    public final /* synthetic */ int a = 0;
    public final Long b;
    public final up3 c;
    public final /* synthetic */ Object d;

    public ku4(ghe gheVar, up3 up3Var, Object obj) {
        this.d = obj;
        t89 t89Var = ((yj9) gheVar.a).c;
        List list = zi9.a;
        String t = t89Var.t("Content-Length");
        this.b = t != null ? Long.valueOf(Long.parseLong(t)) : null;
        this.c = up3Var == null ? qp3.a : up3Var;
    }

    @Override // defpackage.swd
    public final Long a() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.swd
    public final up3 b() {
        switch (this.a) {
        }
        return this.c;
    }

    public final db2 d() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                return (db2) obj;
            default:
                InputStream inputStream = (InputStream) obj;
                hs4 hs4Var = z45.a;
                hq4 hq4Var = hq4.c;
                u92 u92Var = v92.a;
                inputStream.getClass();
                hq4Var.getClass();
                u92Var.getClass();
                return new snf(new n4a(inputStream), hq4Var);
        }
    }

    public ku4(yj9 yj9Var, up3 up3Var, Object obj) {
        this.d = obj;
        t89 t89Var = yj9Var.c;
        List list = zi9.a;
        String t = t89Var.t("Content-Length");
        this.b = t != null ? Long.valueOf(Long.parseLong(t)) : null;
        this.c = up3Var == null ? qp3.a : up3Var;
    }
}
