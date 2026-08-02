package defpackage;

import com.moloco.sdk.internal.h0;
import com.moloco.sdk.internal.i0;
import com.moloco.sdk.internal.ortb.model.d;
import com.moloco.sdk.internal.ortb.model.e0;
import com.moloco.sdk.internal.r;
import java.net.HttpURLConnection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class ay implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ay(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (r12.equals("Content-Length") != false) goto L24;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        tc3 tc3Var;
        e0 e0Var;
        int i = this.a;
        Object obj3 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                if (z) {
                    List list = zi9.a;
                    break;
                }
                ((HttpURLConnection) obj3).addRequestProperty(str, str2);
                return Unit.a;
            default:
                ((Number) obj2).intValue();
                av8 av8Var = (av8) ((of3) obj);
                av8Var.e0(-874204308);
                if (z || (e0Var = ((d) obj3).e) == null) {
                    tc3Var = null;
                } else {
                    mv1 a = r.a(e0Var.d, e0Var.e);
                    float f = e0Var.c;
                    t3e t3eVar = new t3e(f, f, f, f);
                    String str3 = e0Var.a;
                    long j = e0Var.f;
                    r13 r13Var = e0Var.g;
                    long j2 = r13Var != null ? r13Var.a : i0.a;
                    String str4 = e0Var.b;
                    av8Var.e0(959702933);
                    tc3Var = yqo.y(-927135997, av8Var, new h0(a, t3eVar, str4, str3, j, j2));
                    av8Var.s(false);
                }
                av8Var.s(false);
                return tc3Var;
        }
    }
}
