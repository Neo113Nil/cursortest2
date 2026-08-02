package defpackage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.s;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.SofaTabLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class s8 extends d41 {
    public final SofaTabLayout p;
    public final mqi q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(s sVar, g6b g6bVar, ViewPager2 viewPager2, SofaTabLayout sofaTabLayout) {
        super(viewPager2, sVar, g6bVar);
        sVar.getClass();
        g6bVar.getClass();
        viewPager2.getClass();
        sofaTabLayout.getClass();
        this.p = sofaTabLayout;
        RecyclerView c = wrf.c(viewPager2);
        if (c != null) {
            wrf.b(c);
        }
        viewPager2.addOnLayoutChangeListener(new r8(this, 0));
        this.q = ypa.b(new j4(2, this, viewPager2));
    }

    public abstract String H(Enum r1);

    public int I() {
        return y().getColor(R.color.primary_default);
    }

    @Override // defpackage.wp8, androidx.recyclerview.widget.l
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        super.onAttachedToRecyclerView(recyclerView);
        ((osi) this.q.getValue()).a();
    }

    @Override // defpackage.wp8, androidx.recyclerview.widget.l
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        super.onDetachedFromRecyclerView(recyclerView);
        ((osi) this.q.getValue()).b();
    }

    @Override // defpackage.d41
    public final void v(Enum r1, int i) {
        r1.getClass();
        super.v(r1, i);
        this.p.q();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s8(AppCompatActivity appCompatActivity, ViewPager2 viewPager2, SofaTabLayout sofaTabLayout) {
        this(appCompatActivity.k(), appCompatActivity.getLifecycle(), viewPager2, sofaTabLayout);
        appCompatActivity.getClass();
        viewPager2.getClass();
        sofaTabLayout.getClass();
    }
}
