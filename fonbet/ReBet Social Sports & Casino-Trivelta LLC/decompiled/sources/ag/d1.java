package ag;

import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenTextView;
import com.zoho.livechat.android.modules.knowledgebase.domain.entities.SalesIQResource;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import od.AbstractC5886l;
import rd.C6218a;

/* loaded from: classes4.dex */
public final class d1 extends RecyclerView.F {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f15605a;

    /* renamed from: b, reason: collision with root package name */
    public final MobilistenTextView f15606b;

    /* renamed from: c, reason: collision with root package name */
    public final View f15607c;

    /* renamed from: d, reason: collision with root package name */
    public final View f15608d;

    /* renamed from: e, reason: collision with root package name */
    public final MobilistenTextView f15609e;

    /* renamed from: f, reason: collision with root package name */
    public final MobilistenTextView f15610f;

    /* renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f15611g;

    /* renamed from: h, reason: collision with root package name */
    public final Function1 f15612h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(View itemView, Function1 function1) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f15612h = function1;
        View findViewById = itemView.findViewById(od.q.f60515f0);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
        this.f15611g = constraintLayout;
        og.p.v(constraintLayout, com.zoho.livechat.android.utils.P.e(constraintLayout.getContext(), AbstractC5886l.f59797a), null, null, false, 0, 30, null);
        View findViewById2 = itemView.findViewById(od.q.f60251F1);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        MobilistenTextView mobilistenTextView = (MobilistenTextView) findViewById2;
        this.f15606b = mobilistenTextView;
        View findViewById3 = itemView.findViewById(od.q.f60617p0);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        MobilistenTextView mobilistenTextView2 = (MobilistenTextView) findViewById3;
        this.f15609e = mobilistenTextView2;
        View findViewById4 = itemView.findViewById(od.q.f60667u0);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        MobilistenTextView mobilistenTextView3 = (MobilistenTextView) findViewById4;
        this.f15610f = mobilistenTextView3;
        View findViewById5 = itemView.findViewById(od.q.f60471b0);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f15607c = findViewById5;
        View findViewById6 = itemView.findViewById(od.q.f60460a0);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f15608d = findViewById6;
        Typeface P10 = C6218a.P();
        mobilistenTextView3.setTypeface(P10);
        mobilistenTextView.setTypeface(P10);
        mobilistenTextView2.setTypeface(P10);
        View findViewById7 = itemView.findViewById(od.q.f60557j0);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f15605a = (ImageView) findViewById7;
    }

    public static final void d(d1 this$0, SalesIQResource.a category, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(category, "$category");
        Function1 function1 = this$0.f15612h;
        if (function1 != null) {
            function1.invoke(category);
        }
    }

    public final void c(final SalesIQResource.a category, int i10) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(category, "category");
        this.f15607c.setVisibility(8);
        if (StringsKt.equals("DARK", com.zoho.livechat.android.utils.P.j(this.f15605a.getContext()), true)) {
            this.f15605a.setImageResource(od.p.f60169u);
        } else {
            this.f15605a.setImageResource(od.p.f60164t);
        }
        View view = this.itemView;
        view.setPadding(view.getPaddingLeft(), i10 == 0 ? C6218a.b(16.0f) : C6218a.b(12.0f), view.getPaddingRight(), view.getPaddingBottom());
        this.f15606b.setText(LiveChatUtil.unescapeHtml(category.c()));
        if (category.a() > 0) {
            if (category.a() > 1) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string3 = this.itemView.getResources().getString(od.t.f60831A3);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                string2 = String.format(string3, Arrays.copyOf(new Object[]{Integer.valueOf(category.a())}, 1));
                Intrinsics.checkNotNullExpressionValue(string2, "format(...)");
            } else {
                string2 = this.itemView.getResources().getString(od.t.f60837B3);
                Intrinsics.checkNotNull(string2);
            }
            this.f15609e.setText(string2);
            og.p.w(this.f15609e);
            g();
        } else {
            og.p.n(this.f15609e);
            e();
        }
        if (category.b() > 0) {
            if (category.b() > 1) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String string4 = this.f15609e.getContext().getString(od.t.f60849D3);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                string = String.format(string4, Arrays.copyOf(new Object[]{Integer.valueOf(category.b())}, 1));
                Intrinsics.checkNotNullExpressionValue(string, "format(...)");
            } else {
                string = this.f15609e.getContext().getString(od.t.f60843C3);
                Intrinsics.checkNotNull(string);
            }
            this.f15610f.setText(string);
            this.f15610f.setVisibility(0);
        } else {
            this.f15610f.setVisibility(8);
            e();
        }
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: ag.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                d1.d(d1.this, category, view2);
            }
        });
    }

    public final void e() {
        og.p.n(this.f15608d);
        og.p.n(this.f15607c);
    }

    public final void g() {
        og.p.w(this.f15608d);
        og.p.w(this.f15607c);
    }
}
