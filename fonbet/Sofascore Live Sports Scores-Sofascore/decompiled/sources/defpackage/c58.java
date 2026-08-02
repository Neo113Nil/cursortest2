package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c58 implements xff {
    public final b58 a;
    public final b58 b;
    public final b58 c;
    public final b58 d;
    public final a58 e;
    public final a58 f;
    public final a58 g;

    public c58(b58 b58Var, b58 b58Var2, b58 b58Var3, b58 b58Var4, a58 a58Var, a58 a58Var2, a58 a58Var3) {
        this.a = b58Var;
        this.b = b58Var2;
        this.c = b58Var3;
        this.d = b58Var4;
        this.e = a58Var;
        this.f = a58Var2;
        this.g = a58Var3;
    }

    @Override // defpackage.yff
    public final Object get() {
        return new y48((r38) this.a.get(), (vff) this.b.get(), (l48) this.c.get(), (vff) this.d.get(), (RemoteConfigManager) this.e.get(), (oi3) this.f.get(), (SessionManager) this.g.get());
    }
}
