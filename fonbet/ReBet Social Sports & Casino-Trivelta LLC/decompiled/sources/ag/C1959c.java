package ag;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.graphics.AbstractC2074d;
import androidx.recyclerview.widget.RecyclerView;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC5335a;
import od.AbstractC5886l;
import og.AbstractC5892d;

/* renamed from: ag.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1959c extends RecyclerView.F {

    /* renamed from: a, reason: collision with root package name */
    public final View f15593a;

    /* renamed from: b, reason: collision with root package name */
    public Message f15594b;

    /* renamed from: c, reason: collision with root package name */
    public final View f15595c;

    /* renamed from: d, reason: collision with root package name */
    public final View f15596d;

    /* renamed from: e, reason: collision with root package name */
    public final View f15597e;

    /* renamed from: f, reason: collision with root package name */
    public final View f15598f;

    /* renamed from: g, reason: collision with root package name */
    public final ProgressBar f15599g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1959c(View view, final cg.e eVar) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f15593a = view;
        View findViewById = view.findViewById(od.q.f60209B);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f15595c = findViewById;
        View findViewById2 = view.findViewById(od.q.f60329N);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f15596d = findViewById2;
        View findViewById3 = view.findViewById(od.q.f60219C);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f15597e = findViewById3;
        View findViewById4 = view.findViewById(od.q.f60438X8);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f15598f = findViewById4;
        View findViewById5 = view.findViewById(od.q.f60229D);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f15599g = (ProgressBar) findViewById5;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int h10 = AbstractC5892d.h(context, Integer.valueOf(AbstractC5886l.f59696A2), 0.0f, 2, null);
        int k10 = AbstractC2074d.k(h10, 0);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        findViewById.setBackground(new GradientDrawable(orientation, new int[]{k10, h10}));
        findViewById2.setBackground(new GradientDrawable(orientation, new int[]{h10, k10}));
        int b10 = og.k.b(8);
        int a10 = og.k.a(1.5f);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        og.p.c(findViewById3, b10, 0, a10, Integer.valueOf(AbstractC5892d.h(context2, Integer.valueOf(AbstractC5335a.f55002q), 0.0f, 2, null)), false);
        findViewById4.setOnClickListener(new View.OnClickListener() { // from class: ag.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1959c.c(C1959c.this, eVar, view2);
            }
        });
    }

    public static final void c(C1959c this$0, cg.e eVar, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getBindingAdapterPosition() != -1) {
            this$0.g();
            Message message = this$0.f15594b;
            if (message == null || eVar == null) {
                return;
            }
            eVar.x(message);
        }
    }

    public final void d(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f15594b = message;
        e();
    }

    public final void e() {
        this.f15599g.setIndeterminateTintList(ColorStateList.valueOf(0));
        this.f15598f.setVisibility(0);
    }

    public final void g() {
        ProgressBar progressBar = this.f15599g;
        Context context = this.f15593a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(AbstractC5892d.h(context, Integer.valueOf(AbstractC5335a.f55002q), 0.0f, 2, null)));
        this.f15598f.setVisibility(4);
    }
}
