package androidx.recyclerview.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import xsna.l100;
import xsna.mh40;

/* compiled from: RecyclerPoolExt.kt */
/* loaded from: classes12.dex */
public final class k0 extends RecyclerView.u {
    public final l100 a;
    public final a b;

    /* compiled from: RecyclerPoolExt.kt */
    public interface a {
    }

    public k0(l100 l100Var, Map map, mh40 mh40Var) {
        this.a = l100Var;
        this.b = mh40Var;
        for (Map.Entry entry : map.entrySet()) {
            setMaxRecycledViews(((Number) entry.getKey()).intValue(), Math.max(((Number) entry.getValue()).intValue(), 5));
        }
    }

    public static Activity a(Context context) {
        boolean z;
        while (true) {
            z = context instanceof Activity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (z) {
            return (Activity) context;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void detach() {
        super.detach();
        a aVar = this.b;
        if (aVar != null) {
            ((b0) ((mh40) aVar).c).k();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final RecyclerView.e0 getRecycledView(int i) {
        View view;
        RecyclerView.e0 recycledView = super.getRecycledView(i);
        if (((recycledView == null || (view = recycledView.itemView) == null) ? null : view.getParent()) == null) {
            return recycledView;
        }
        this.a.c(new IllegalStateException("Illegal get with attached parent"));
        return getRecycledView(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void putRecycledView(RecyclerView.e0 e0Var) {
        Activity a2;
        if (e0Var.itemView.getParent() == null && ((a2 = a(e0Var.itemView.getContext())) == null || (!a2.isFinishing() && !a2.isDestroyed()))) {
            super.putRecycledView(e0Var);
        } else if (e0Var.itemView.getParent() != null) {
            this.a.c(new IllegalStateException("Illegal put with attached parent"));
        }
    }
}
