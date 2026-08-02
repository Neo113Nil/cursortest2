package defpackage;

import java.io.FileOutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kyc extends sq3 {
    public FileOutputStream r;
    public long s;
    public /* synthetic */ Object t;
    public final /* synthetic */ f8h u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyc(f8h f8hVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = f8hVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.m(null, this);
    }
}
