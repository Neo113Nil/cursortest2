package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.ConnectivityManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.a;
import defpackage.a70;
import defpackage.aol;
import defpackage.bol;
import defpackage.col;
import defpackage.d6b;
import defpackage.de0;
import defpackage.fjh;
import defpackage.hpo;
import defpackage.k1l;
import defpackage.kad;
import defpackage.p6b;
import defpackage.rjf;
import defpackage.sx2;
import defpackage.u6b;
import defpackage.v5b;
import defpackage.xnl;
import defpackage.y8;
import defpackage.zzl;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/YouTubePlayerView;", "Lfjh;", "Lp6b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "setCustomPlayerUi", "(Landroid/view/View;)V", "", a.q, "Z", "getEnableAutomaticInitialization", "()Z", "setEnableAutomaticInitialization", "(Z)V", "enableAutomaticInitialization", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class YouTubePlayerView extends fjh implements p6b {
    public final ArrayList a;
    public final v5b b;

    /* renamed from: c, reason: from kotlin metadata */
    public boolean enableAutomaticInitialization;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.a = new ArrayList();
        v5b v5bVar = new v5b(context, new bol(this));
        this.b = v5bVar;
        addView(v5bVar, new FrameLayout.LayoutParams(-1, -1));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, rjf.a, 0, 0);
        obtainStyledAttributes.getClass();
        this.enableAutomaticInitialization = obtainStyledAttributes.getBoolean(1, true);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        boolean z2 = obtainStyledAttributes.getBoolean(2, true);
        String string = obtainStyledAttributes.getString(3);
        obtainStyledAttributes.recycle();
        if (z && string == null) {
            a70.r("YouTubePlayerView: videoId is not set but autoPlay is set to true. This combination is not allowed.");
            throw null;
        }
        col colVar = new col(string, this, z);
        if (this.enableAutomaticInitialization) {
            hpo hpoVar = new hpo(context);
            hpoVar.g(1, "controls");
            v5bVar.a(colVar, z2, hpoVar.i(), string);
        }
    }

    public final void a(y8 y8Var, de0 de0Var) {
        if (this.enableAutomaticInitialization) {
            a70.r("YouTubePlayerView: If you want to initialize this view manually, you need to set 'enableAutomaticInitialization' to false.");
        } else {
            this.b.a(y8Var, true, de0Var, null);
        }
    }

    public final void b() {
        v5b v5bVar = this.b;
        k1l k1lVar = v5bVar.a;
        sx2 sx2Var = v5bVar.b;
        kad kadVar = (kad) sx2Var.c;
        if (kadVar != null) {
            Object systemService = ((Context) sx2Var.a).getSystemService("connectivity");
            systemService.getClass();
            ((ConnectivityManager) systemService).unregisterNetworkCallback(kadVar);
            ((ArrayList) sx2Var.b).clear();
            sx2Var.c = null;
        }
        v5bVar.removeView(k1lVar);
        k1lVar.removeAllViews();
        k1lVar.destroy();
    }

    public final boolean getEnableAutomaticInitialization() {
        return this.enableAutomaticInitialization;
    }

    @Override // defpackage.p6b
    public final void onStateChanged(u6b u6bVar, d6b d6bVar) {
        int i = aol.a[d6bVar.ordinal()];
        v5b v5bVar = this.b;
        switch (i) {
            case 1:
                v5bVar.c.a = true;
                v5bVar.g = true;
                break;
            case 2:
                ((xnl) v5bVar.a.getYoutubePlayer$core_release()).c();
                v5bVar.c.a = false;
                v5bVar.g = false;
                break;
            case 3:
                b();
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                break;
            default:
                zzl.b();
                break;
        }
    }

    public final void setCustomPlayerUi(@NotNull View view) {
        view.getClass();
        this.b.setCustomPlayerUi(view);
    }

    public final void setEnableAutomaticInitialization(boolean z) {
        this.enableAutomaticInitialization = z;
    }
}
