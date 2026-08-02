package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pfh extends p8 {
    public final v4c c;
    public fye d;
    public bne e;
    public boolean f;
    public String g;
    public final /* synthetic */ qfh h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pfh(qfh qfhVar, v4c v4cVar) {
        super(r1);
        this.h = qfhVar;
        FrameLayout frameLayout = v4cVar.a;
        frameLayout.getClass();
        this.c = v4cVar;
        this.d = new fye();
        this.e = bne.a;
        this.g = "";
        d(v4cVar.b);
    }

    public static void d(ViewGroup viewGroup) {
        Iterator it = new tsk(viewGroup).iterator();
        while (true) {
            usk uskVar = (usk) it;
            if (!uskVar.hasNext()) {
                return;
            }
            View view = (View) uskVar.next();
            if (view instanceof WebView) {
                ((WebView) view).setBackgroundColor(0);
            } else if (view instanceof ViewGroup) {
                d((ViewGroup) view);
            }
        }
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        String str = (String) obj;
        str.getClass();
        qfh qfhVar = this.h;
        g6b g6bVar = qfhVar.l;
        v4c v4cVar = this.c;
        g6bVar.a(v4cVar.b);
        this.f = false;
        this.d = new fye();
        this.e = bne.a;
        mqi mqiVar = qhi.a;
        String c = qhi.c(str, true);
        if (c == null) {
            c = "";
        }
        this.g = c;
        YouTubePlayerView youTubePlayerView = v4cVar.b;
        ofh ofhVar = new ofh(this, youTubePlayerView, qfhVar, i);
        Context applicationContext = youTubePlayerView.getContext().getApplicationContext();
        applicationContext.getClass();
        youTubePlayerView.a(ofhVar, new hpo(applicationContext).i());
    }
}
