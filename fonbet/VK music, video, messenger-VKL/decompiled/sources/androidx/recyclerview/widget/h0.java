package androidx.recyclerview.widget;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import xsna.dq;
import xsna.epx;
import xsna.izs;
import xsna.l100;
import xsna.shy;
import xsna.up;
import xsna.v11;

/* compiled from: PoolConfig.kt */
/* loaded from: classes12.dex */
public final class h0 {
    public final String a;
    public final izs<Context, RecyclerView.Adapter<?>> b;
    public final Context c;
    public final l100 d;
    public final Map<Integer, Integer> e;
    public final int f;
    public final i0 g;
    public final izs<RecyclerView.e0, Boolean> h;

    /* JADX WARN: Multi-variable type inference failed */
    public h0(String str, izs<? super Context, ? extends RecyclerView.Adapter<?>> izsVar, Context context, l100 l100Var, Map<Integer, Integer> map, int i, i0 i0Var, izs<? super RecyclerView.e0, Boolean> izsVar2) {
        this.a = str;
        this.b = izsVar;
        this.c = context;
        this.d = l100Var;
        this.e = map;
        this.f = i;
        this.g = i0Var;
        this.h = izsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return epx.f(this.a, h0Var.a) && epx.f(this.b, h0Var.b) && epx.f(this.c, h0Var.c) && this.d.equals(h0Var.d) && epx.f(this.e, h0Var.e) && this.f == h0Var.f && epx.f(this.g, h0Var.g) && epx.f(this.h, h0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + shy.a(this.f, v11.a((this.d.hashCode() + ((this.c.hashCode() + dq.c(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoolConfig(adapterName=");
        sb.append(this.a);
        sb.append(", adapterFactory=");
        sb.append(this.b);
        sb.append(", context=");
        sb.append(this.c);
        sb.append(", logger=");
        sb.append(this.d);
        sb.append(", viewTypes=");
        sb.append(this.e);
        sb.append(", priority=");
        sb.append(this.f);
        sb.append(", mode=");
        sb.append(this.g);
        sb.append(", prefetchViewHolderListener=");
        return up.c(sb, this.h, ')');
    }
}
