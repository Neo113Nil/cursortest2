package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface fam {
    static /* synthetic */ void setupWith$default(fam famVar, n4m n4mVar, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: setupWith");
            return;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        famVar.j(n4mVar, j, z);
    }

    default tcm a() {
        return null;
    }

    void a(float f);

    void a(long j);

    ku3 b();

    void b(long j);

    void b(iyl iylVar);

    void c();

    void c(n4m n4mVar, lyl lylVar);

    ExoPlayer d();

    void d(n4m n4mVar, bcl bclVar);

    void e();

    boolean e(n4m n4mVar);

    void f();

    void f(n4m n4mVar, iyl iylVar);

    void g();

    void g(n4m n4mVar, lyl lylVar);

    void h();

    void h(n4m n4mVar, iyl iylVar);

    void i();

    void i(n4m n4mVar, iyl iylVar);

    boolean isPlaying();

    void j();

    void j(n4m n4mVar, long j, boolean z);

    void k();

    void k(n4m n4mVar, bmj bmjVar);

    void l();

    void m();

    void n();

    void o();

    void pause();

    void play();

    void release();

    void seekTo(long j);
}
