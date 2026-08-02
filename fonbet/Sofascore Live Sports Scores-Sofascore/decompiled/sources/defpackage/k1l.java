package defpackage;

import android.content.Context;
import android.webkit.WebView;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class k1l extends WebView {
    public final bol a;
    public final wnl b;
    public final xnl c;
    public ida d;
    public boolean e;
    public final vnl f;

    public k1l(Context context, bol bolVar) {
        super(context, null, 0);
        this.a = bolVar;
        wnl wnlVar = new wnl();
        this.b = wnlVar;
        this.c = new xnl(this, wnlVar);
        this.f = new vnl(this);
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        xnl xnlVar = this.c;
        synchronized (xnlVar.c) {
            xnlVar.d.clear();
            Unit unit = Unit.a;
        }
        xnlVar.b.removeCallbacksAndMessages(null);
        super.destroy();
    }

    @NotNull
    public snl getInstance() {
        return this.c;
    }

    @NotNull
    public Collection<ynl> getListeners() {
        List S0;
        xnl xnlVar = this.c;
        synchronized (xnlVar.c) {
            S0 = CollectionsKt.S0(xnlVar.d);
        }
        return S0;
    }

    @NotNull
    public final snl getYoutubePlayer$core_release() {
        return this.c;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        if (this.e && (i == 8 || i == 4)) {
            return;
        }
        super.onWindowVisibilityChanged(i);
    }

    public final void setBackgroundPlaybackEnabled$core_release(boolean z) {
        this.e = z;
    }
}
