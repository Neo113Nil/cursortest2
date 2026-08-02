package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.sofascore.results.event.EventActivity;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class cp4 implements dp4, ep4, ec3, xn3, ya, ic5, ig5, puk, kwj, pdb, qdb, rdb {
    public final /* synthetic */ int a;

    public /* synthetic */ cp4(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ Activity.ScreenCaptureCallback e(Object obj) {
        return (Activity.ScreenCaptureCallback) obj;
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void h(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void i(String str, Throwable th) {
        throw new IOException(str, th);
    }

    @Override // defpackage.dp4, defpackage.ep4
    public Constructor a() {
        switch (this.a) {
            case 0:
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(kl6.class).getConstructor(null);
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(ll6.class).getConstructor(null);
        }
    }

    @Override // defpackage.xn3
    public void accept(Object obj) {
    }

    @Override // defpackage.kwj
    public Object apply(Object obj) {
        y7h y7hVar = (y7h) obj;
        String m = z7h.b.m(y7hVar);
        m.getClass();
        y7hVar.getClass();
        pc6 pc6Var = pc6.SESSION_START;
        byte[] bytes = m.getBytes(Charsets.UTF_8);
        bytes.getClass();
        return bytes;
    }

    @Override // defpackage.rdb
    public void b(Object obj, i78 i78Var) {
        ((vke) obj).m(new tke(i78Var));
    }

    @Override // defpackage.pdb
    public void invoke(Object obj) {
        switch (this.a) {
            case 27:
                ((vke) obj).h(new sf6(2, new fb3("Player release timed out.", 4), 1003));
                break;
            default:
                int i = vg6.r0;
                ((wke) obj).onPlayerError(new tf6(2, new fb3("Player release timed out.", 5), 1003));
                break;
        }
    }

    @Override // defpackage.puk
    public void j(View view, float f) {
        wxf wxfVar = EventActivity.h0;
    }

    @Override // defpackage.ec3
    public Object l(vng vngVar) {
        switch (this.a) {
            case 3:
                Set i = vngVar.i(oif.a(nu0.class));
                sz8 sz8Var = sz8.c;
                if (sz8Var == null) {
                    synchronized (sz8.class) {
                        try {
                            sz8Var = sz8.c;
                            if (sz8Var == null) {
                                sz8Var = new sz8(0);
                                sz8.c = sz8Var;
                            }
                        } finally {
                        }
                    }
                }
                return new nu4(i, sz8Var);
            case 23:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 24:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 25:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            default:
                koa koaVar = ExecutorsRegistrar.a;
                return f9k.a;
        }
    }

    public /* synthetic */ cp4(Object obj, int i) {
        this.a = i;
    }

    @Override // defpackage.ic5
    public void release() {
    }

    @Override // defpackage.ya
    public void run() {
    }

    @Override // defpackage.ig5
    public float c(float f) {
        return f;
    }
}
