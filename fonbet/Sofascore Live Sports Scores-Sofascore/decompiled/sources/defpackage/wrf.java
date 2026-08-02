package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class wrf {
    public static final void a(RecyclerView recyclerView, Function1 function1) {
        recyclerView.addOnScrollListener(new vrf(recyclerView.getResources().getDimension(R.dimen.header_elevation), function1));
    }

    public static final void b(RecyclerView recyclerView) {
        sih sihVar = new sih();
        sihVar.b = -1;
        recyclerView.addOnItemTouchListener(sihVar);
        recyclerView.addOnScrollListener(sihVar);
    }

    public static final RecyclerView c(ViewPager2 viewPager2) {
        viewPager2.getClass();
        View w = wca.w(viewPager2);
        if (w instanceof RecyclerView) {
            return (RecyclerView) w;
        }
        return null;
    }

    public static final void d(ViewPager2 viewPager2, int i) {
        viewPager2.getClass();
        Boolean bool = y05.a;
        Context context = viewPager2.getContext();
        context.getClass();
        if (y05.a(context)) {
            i = -1;
        }
        viewPager2.setOffscreenPageLimit(i);
    }
}
