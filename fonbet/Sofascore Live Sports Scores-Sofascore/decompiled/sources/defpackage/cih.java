package defpackage;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class cih extends lij {
    public static final Object g = new Object();
    public final long b;
    public final long c;
    public final boolean d;
    public final f6c e;
    public final t5c f;

    static {
        i5c i5cVar = new i5c();
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        List list = Collections.EMPTY_LIST;
        av9 av9Var2 = hv9.b;
        vvf vvfVar2 = vvf.e;
        y5c y5cVar = y5c.c;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new x5c(uri, null, list, vvfVar2);
        }
        new l5c(i5cVar);
        p6c p6cVar = p6c.G;
    }

    public cih(long j, boolean z, boolean z2, f6c f6cVar) {
        t5c t5cVar = z2 ? f6cVar.c : null;
        this.b = j;
        this.c = j;
        this.d = z;
        f6cVar.getClass();
        this.e = f6cVar;
        this.f = t5cVar;
    }

    @Override // defpackage.lij
    public final int b(Object obj) {
        return g != obj ? -1 : 0;
    }

    @Override // defpackage.lij
    public final hij f(int i, hij hijVar, boolean z) {
        qx9.s(i, 1);
        Object obj = z ? g : null;
        hijVar.getClass();
        hijVar.h(null, obj, 0, this.b, 0L, jg.f, false);
        return hijVar;
    }

    @Override // defpackage.lij
    public final int h() {
        return 1;
    }

    @Override // defpackage.lij
    public final Object l(int i) {
        qx9.s(i, 1);
        return g;
    }

    @Override // defpackage.lij
    public final jij m(int i, jij jijVar, long j) {
        qx9.s(i, 1);
        jijVar.b(jij.p, this.e, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, this.d, false, this.f, 0L, this.c, 0, 0, 0L);
        return jijVar;
    }

    @Override // defpackage.lij
    public final int o() {
        return 1;
    }
}
