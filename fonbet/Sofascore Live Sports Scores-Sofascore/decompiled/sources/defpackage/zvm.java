package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zvm extends sq3 {
    public lzm r;
    public int s;
    public long t;
    public long u;
    public /* synthetic */ Object v;
    public final /* synthetic */ lzm w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvm(lzm lzmVar, sq3 sq3Var) {
        super(sq3Var);
        this.w = lzmVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.t(0, 0L, 0L, this);
    }
}
