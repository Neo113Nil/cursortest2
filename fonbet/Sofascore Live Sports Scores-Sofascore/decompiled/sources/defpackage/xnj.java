package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xnj implements v6b {
    public final /* synthetic */ Context a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ynj c;
    public final /* synthetic */ dib d;

    public xnj(a7b a7bVar, Context context, long j, ynj ynjVar, dib dibVar) {
        this.a = context;
        this.b = j;
        this.c = ynjVar;
        this.d = dibVar;
    }

    @Override // defpackage.v6b
    public final void a() {
        long v = yaa.v() - this.b;
        String lowerCase = this.c.c.b.toLowerCase(this.d.a);
        lowerCase.getClass();
        nv.L(this.a, "league_stats", v, lowerCase);
    }
}
