package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.n;
import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zoe extends o8 {
    public final d25 d;
    public final mqi e;
    public yoe f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoe(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        if (root == null) {
            yhk.s("rootView");
            throw null;
        }
        this.d = new d25((RecyclerView) root, 1);
        this.e = ypa.b(new nzd(context, 6));
    }

    private final int getItemWidth() {
        return ((Number) this.e.getValue()).intValue();
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.player_event_statistics_view_footer;
    }

    public final int getSelectedPosition() {
        yoe yoeVar = this.f;
        if (yoeVar != null) {
            return yoeVar.l;
        }
        Intrinsics.i("playerAdapter");
        throw null;
    }

    public final void j(List list, int i, gpe gpeVar) {
        list.getClass();
        Context context = getContext();
        context.getClass();
        yoe yoeVar = new yoe(context);
        yoeVar.l = i;
        this.f = yoeVar;
        RecyclerView recyclerView = this.d.b;
        recyclerView.setAdapter(yoeVar);
        Context context2 = recyclerView.getContext();
        context2.getClass();
        z8e.b0(recyclerView, context2, true, true, null, 16);
        m itemAnimator = recyclerView.getItemAnimator();
        itemAnimator.getClass();
        ((nq4) itemAnimator).g = false;
        yoe yoeVar2 = this.f;
        if (yoeVar2 == null) {
            Intrinsics.i("playerAdapter");
            throw null;
        }
        yoeVar2.a.d = new yya(10, (Object) this, (Object) gpeVar);
        if (yoeVar2 == null) {
            Intrinsics.i("playerAdapter");
            throw null;
        }
        yoeVar2.F(list);
        n layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, (Resources.getSystem().getDisplayMetrics().widthPixels - getItemWidth()) / 2);
    }

    public final void l(int i) {
        int selectedPosition = getSelectedPosition();
        yoe yoeVar = this.f;
        if (yoeVar == null) {
            Intrinsics.i("playerAdapter");
            throw null;
        }
        yoeVar.l = i;
        n layoutManager = this.d.b.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            yoe yoeVar2 = this.f;
            if (yoeVar2 == null) {
                Intrinsics.i("playerAdapter");
                throw null;
            }
            linearLayoutManager.scrollToPositionWithOffset(yoeVar2.l, (Resources.getSystem().getDisplayMetrics().widthPixels - getItemWidth()) / 2);
        }
        yoe yoeVar3 = this.f;
        if (yoeVar3 == null) {
            Intrinsics.i("playerAdapter");
            throw null;
        }
        yoeVar3.notifyItemChanged(selectedPosition);
        yoe yoeVar4 = this.f;
        if (yoeVar4 != null) {
            yoeVar4.notifyItemChanged(i);
        } else {
            Intrinsics.i("playerAdapter");
            throw null;
        }
    }
}
