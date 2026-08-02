package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class yea {
    public static final xea d = new xea(new gfa(false, false, false, false, false, true, "    ", false, "type", true, sv2.c, true), h6h.a);
    public final gfa a;
    public final p5c b;
    public final j0l c = new j0l(21);

    public yea(gfa gfaVar, p5c p5cVar) {
        this.a = gfaVar;
        this.b = p5cVar;
    }

    public final Object a(dy4 dy4Var, b bVar) {
        Decoder sgaVar;
        dy4Var.getClass();
        bVar.getClass();
        String str = null;
        if (bVar instanceof c) {
            sgaVar = new aha(this, (c) bVar, str, 12);
        } else if (bVar instanceof a) {
            sgaVar = new bha(this, (a) bVar);
        } else {
            if (!(bVar instanceof dga) && !bVar.equals(JsonNull.INSTANCE)) {
                zzl.b();
                return null;
            }
            sgaVar = new sga(this, (d) bVar, null);
        }
        return sgaVar.y(dy4Var);
    }

    public final Object b(dy4 dy4Var, String str) {
        dy4Var.getClass();
        str.getClass();
        rhi h = kda.h(this, str);
        Object y = new ehi(this, eml.c, h, dy4Var.getDescriptor(), null).y(dy4Var);
        h.q();
        return y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String c(KSerializer kSerializer, Object obj) {
        kSerializer.getClass();
        Object[] objArr = 0;
        yz1 yz1Var = new yz1(6, false);
        po2 po2Var = po2.c;
        yz1Var.c = po2Var.F(128);
        try {
            new fhi(this.a.e ? new tf3(yz1Var, this) : new fjg((Object) yz1Var, (byte) (objArr == true ? 1 : 0)), this, eml.c, new vfa[eml.h.size()]).l(kSerializer, obj);
            String yz1Var2 = yz1Var.toString();
            char[] cArr = (char[]) yz1Var.c;
            po2Var.getClass();
            cArr.getClass();
            po2Var.C(cArr);
            return yz1Var2;
        } catch (Throwable th) {
            po2 po2Var2 = po2.c;
            char[] cArr2 = (char[]) yz1Var.c;
            po2Var2.getClass();
            cArr2.getClass();
            po2Var2.C(cArr2);
            throw th;
        }
    }
}
