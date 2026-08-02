package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import java.util.List;
import java.util.SortedSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class cjn extends lnn implements uf {
    public final List r;
    public sx2 s;
    public final SortedSet t;

    public cjn(String str, mqn mqnVar, f0o f0oVar, gbo gboVar, List list, mvn mvnVar, sx2 sx2Var, c7o c7oVar, nxn nxnVar, c0l c0lVar, b7p b7pVar, Context context, boolean z, SortedSet sortedSet) {
        super(str, mqnVar, f0oVar, mvnVar, gboVar, c7oVar, nxnVar, c0lVar, b7pVar, context, z);
        this.r = list;
        this.s = sx2Var;
        this.t = sortedSet;
    }

    @Override // defpackage.uf
    public final void a(vf vfVar) {
        this.p.zzb();
    }

    @Override // defpackage.lnn
    public final void d(ox9 ox9Var) {
        int ordinal = ((xf) ox9Var.b).ordinal();
        if (ordinal == 0) {
            super.d(ox9Var);
            e(JavaScriptMessage$MsgType.destroy);
            this.q = true;
            sx2 sx2Var = this.s;
            if (sx2Var != null) {
                ((Handler) sx2Var.a).removeCallbacksAndMessages(null);
                this.s = null;
                return;
            }
            return;
        }
        if (ordinal == 5) {
            sx2 sx2Var2 = this.s;
            if (sx2Var2 != null) {
                ((Handler) sx2Var2.a).removeCallbacksAndMessages(null);
            }
        } else if (ordinal == 6) {
            this.p.zzb();
            sx2 sx2Var3 = this.s;
            if (sx2Var3 != null) {
                ((Handler) sx2Var3.a).removeCallbacksAndMessages(null);
                sx2Var3.Q();
            }
        } else if (ordinal == 15) {
            this.p.zzb();
        } else if (ordinal == 16) {
            this.p.zza();
        }
        super.d(ox9Var);
    }

    public final void g() {
        e(JavaScriptMessage$MsgType.destroy);
        this.q = true;
        sx2 sx2Var = this.s;
        if (sx2Var != null) {
            ((Handler) sx2Var.a).removeCallbacksAndMessages(null);
            this.s = null;
        }
    }
}
