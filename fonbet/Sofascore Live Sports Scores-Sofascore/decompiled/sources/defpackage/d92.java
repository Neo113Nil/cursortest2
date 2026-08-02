package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.Sports;
import com.sofascore.results.R;
import com.sofascore.results.buzzer.BuzzerActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d92 extends o8 {
    public final mqi d;
    public q82 e;
    public p82 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d92(Context context) {
        super(context, null, 0);
        context.getClass();
        this.d = ypa.b(new yj1(this, 17));
    }

    private final a92 getBinding() {
        return (a92) this.d.getValue();
    }

    private final void setupBuzzer(String str) {
        View view = new View(getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(1, 0));
        getBinding().b.setVisibility(0);
        if (getBinding().a.getChildCount() > 1) {
            getBinding().a.removeViewAt(1);
        }
        p82 p82Var = this.f;
        if (p82Var == null) {
            Intrinsics.i("buzzerAdapter");
            throw null;
        }
        if (p82Var.g.isEmpty()) {
            p82 p82Var2 = this.f;
            if (p82Var2 == null) {
                Intrinsics.i("buzzerAdapter");
                throw null;
            }
            p82Var2.p(p82Var2.g.size(), view);
        }
        RecyclerView recyclerView = getBinding().b;
        getContext();
        Context context = getContext();
        context.getClass();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, hkg.c0(context)));
        RecyclerView recyclerView2 = getBinding().b;
        p82 p82Var3 = this.f;
        if (p82Var3 == null) {
            Intrinsics.i("buzzerAdapter");
            throw null;
        }
        recyclerView2.setAdapter(p82Var3);
        if (this.e == null) {
            this.e = new q82(getBinding().b, str);
        }
    }

    @Nullable
    public final q82 getBuzzerTracker() {
        return this.e;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.buzzer_layout;
    }

    public final void j() {
        getBinding().b.setVisibility(8);
    }

    public final boolean l() {
        return getBinding().b.getVisibility() == 0;
    }

    public final void n(ox1 ox1Var, mi miVar) {
        Context context = getContext();
        context.getClass();
        this.f = new p82(context, Sports.TRENDING);
        u6b w = qha.w(this);
        if (w != null) {
            wd5 wd5Var = xd5.b;
            long R = wkn.R(10, be5.SECONDS);
            e6b e6bVar = e6b.a;
            xw3.L(wca.x(w.getLifecycle()), null, null, new a74(w, new ej(this, null, 2), R, (rq3) null), 3);
        }
        setupBuzzer(Sports.TRENDING);
        miVar.invoke();
    }

    public final void o() {
        getBinding().b.setVisibility(0);
    }

    public final void setBuzzerList(@NotNull List<? extends Object> list) {
        list.getClass();
        int i = BuzzerActivity.O;
        Context context = getContext();
        context.getClass();
        if (!s9a.x(context) || list.isEmpty()) {
            q82 q82Var = this.e;
            if (q82Var != null) {
                q82Var.e();
            }
            p82 p82Var = this.f;
            if (p82Var == null) {
                Intrinsics.i("buzzerAdapter");
                throw null;
            }
            p82Var.F(km5.a);
            getBinding().b.setVisibility(8);
            return;
        }
        q82 q82Var2 = this.e;
        if (q82Var2 != null) {
            q82Var2.e();
        }
        p82 p82Var2 = this.f;
        if (p82Var2 == null) {
            Intrinsics.i("buzzerAdapter");
            throw null;
        }
        p82Var2.F(list);
        q82 q82Var3 = this.e;
        if (q82Var3 != null) {
            q82Var3.d();
        }
        if (getBinding().b.getVisibility() == 0) {
            return;
        }
        hz8.C(getBinding().b, null, 14);
    }

    public final void setBuzzerTracker(@Nullable q82 q82Var) {
        this.e = q82Var;
    }
}
