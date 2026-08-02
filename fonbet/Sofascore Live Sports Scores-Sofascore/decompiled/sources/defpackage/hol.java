package defpackage;

import android.widget.FrameLayout;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hol extends y8 {
    public final WeakReference a;
    public final WeakReference b;
    public final WeakReference c;
    public final WeakReference d;
    public final String e;
    public final Function0 f;
    public final Function1 g;
    public final Function1 h;

    public hol(WeakReference weakReference, WeakReference weakReference2, WeakReference weakReference3, WeakReference weakReference4, String str, u4c u4cVar, dqk dqkVar, Function1 function1, int i) {
        u4cVar = (i & 32) != 0 ? null : u4cVar;
        dqkVar = (i & 64) != 0 ? null : dqkVar;
        this.a = weakReference;
        this.b = weakReference2;
        this.c = weakReference3;
        this.d = weakReference4;
        this.e = str;
        this.f = u4cVar;
        this.g = dqkVar;
        this.h = function1;
    }

    @Override // defpackage.y8, defpackage.ynl
    public final void a(snl snlVar, ane aneVar) {
        snlVar.getClass();
        this.h.invoke(aneVar);
    }

    @Override // defpackage.y8, defpackage.ynl
    public final void c(snl snlVar) {
        String str;
        snlVar.getClass();
        fye fyeVar = (fye) this.c.get();
        if (fyeVar != null) {
            fyeVar.a = snlVar;
        }
        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) this.d.get();
        if (youTubePlayerView != null) {
            WeakReference weakReference = this.a;
            if (weakReference.get() == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) new yth(weakReference, snlVar, this.f).c.b;
            frameLayout.getClass();
            youTubePlayerView.setCustomPlayerUi(frameLayout);
            g6b g6bVar = (g6b) this.b.get();
            if (g6bVar == null || (str = this.e) == null) {
                return;
            }
            aik.Y(snlVar, g6bVar, str);
        }
    }

    @Override // defpackage.y8, defpackage.ynl
    public final void f(snl snlVar, bne bneVar) {
        snlVar.getClass();
        Function1 function1 = this.g;
        if (function1 != null) {
            function1.invoke(bneVar);
        }
    }
}
