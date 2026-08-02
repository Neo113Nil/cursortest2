package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ovb extends lij {
    public final f6c b;

    public ovb(f6c f6cVar) {
        this.b = f6cVar;
    }

    @Override // defpackage.lij
    public final int b(Object obj) {
        return obj == mvb.e ? 0 : -1;
    }

    @Override // defpackage.lij
    public final hij f(int i, hij hijVar, boolean z) {
        hijVar.h(z ? 0 : null, z ? mvb.e : null, 0, C.TIME_UNSET, 0L, jg.f, true);
        return hijVar;
    }

    @Override // defpackage.lij
    public final int h() {
        return 1;
    }

    @Override // defpackage.lij
    public final Object l(int i) {
        return mvb.e;
    }

    @Override // defpackage.lij
    public final jij m(int i, jij jijVar, long j) {
        jijVar.b(jij.p, this.b, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0, 0L);
        jijVar.j = true;
        return jijVar;
    }

    @Override // defpackage.lij
    public final int o() {
        return 1;
    }
}
