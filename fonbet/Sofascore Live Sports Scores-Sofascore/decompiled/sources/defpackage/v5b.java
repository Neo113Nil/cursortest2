package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class v5b extends fjh {
    public final k1l a;
    public final sx2 b;
    public final ike c;
    public boolean d;
    public Function0 e;
    public final LinkedHashSet f;
    public boolean g;

    public v5b(Context context, bol bolVar) {
        super(context, null, 0);
        k1l k1lVar = new k1l(context, bolVar);
        this.a = k1lVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        sx2 sx2Var = new sx2(applicationContext, 15);
        this.b = sx2Var;
        ike ikeVar = new ike();
        this.c = ikeVar;
        this.e = new ila(19);
        this.f = new LinkedHashSet();
        this.g = true;
        addView(k1lVar, new FrameLayout.LayoutParams(-1, -1));
        xnl xnlVar = k1lVar.c;
        xnlVar.a(ikeVar);
        xnlVar.a(new t5b(this, 0));
        xnlVar.a(new t5b(this, 1));
        ((ArrayList) sx2Var.b).add(new u5b(this));
    }

    public final void a(y8 y8Var, boolean z, de0 de0Var, String str) {
        if (this.d) {
            a70.r("This YouTubePlayerView has already been initialized.");
            return;
        }
        if (z) {
            sx2 sx2Var = this.b;
            Context context = (Context) sx2Var.a;
            kad kadVar = new kad(sx2Var);
            sx2Var.c = kadVar;
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ((ConnectivityManager) systemService).registerDefaultNetworkCallback(kadVar);
        }
        m61 m61Var = new m61(this, de0Var, str, y8Var, 14);
        this.e = m61Var;
        if (z) {
            return;
        }
        m61Var.invoke();
    }

    public final boolean getCanPlay$core_release() {
        return this.g;
    }

    @NotNull
    public final k1l getWebViewYouTubePlayer$core_release() {
        return this.a;
    }

    public final void setCustomPlayerUi(@NotNull View view) {
        view.getClass();
        removeViews(1, getChildCount() - 1);
        addView(view);
    }

    public final void setYouTubePlayerReady$core_release(boolean z) {
        this.d = z;
    }
}
