package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.R;
import java.util.List;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qai extends l4 {
    public final iai g;
    public final boolean h;
    public final List i;
    public final int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qai(jai jaiVar, RecyclerView recyclerView, iai iaiVar, boolean z) {
        super(jaiVar, 2, recyclerView);
        jaiVar.getClass();
        iaiVar.getClass();
        this.g = iaiVar;
        this.h = z;
        this.i = b.j(((n9i) h()).b, ((n9i) h()).c, ((n9i) h()).d, ((n9i) h()).e, ((n9i) h()).f, ((n9i) h()).g, ((n9i) h()).h, ((n9i) h()).i, ((n9i) h()).j);
        this.j = 8;
    }

    @Override // defpackage.l4
    public final void f(Object obj) {
        y6a.t((n9i) h(), (wai) obj, this.g, this.i, this.h);
        ConstraintLayout constraintLayout = ((n9i) h()).a;
        Context context = h().getRoot().getContext();
        context.getClass();
        constraintLayout.setMinHeight(ao2.s(48, context));
    }

    @Override // defpackage.l4
    public final krk g(Context context) {
        context.getClass();
        return n9i.a(LayoutInflater.from(context).inflate(R.layout.standings_cell, (ViewGroup) null, false));
    }

    @Override // defpackage.l4
    public final int i() {
        return this.j;
    }
}
