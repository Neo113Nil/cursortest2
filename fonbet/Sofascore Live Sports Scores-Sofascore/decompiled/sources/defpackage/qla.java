package defpackage;

import android.media.ImageReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qla extends sq3 {
    public ImageReader r;
    public /* synthetic */ Object s;
    public final /* synthetic */ p4h t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qla(p4h p4hVar, sq3 sq3Var) {
        super(sq3Var);
        this.t = p4hVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.c(null, this);
    }
}
