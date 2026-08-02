package ag;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenTextView;
import com.zoho.livechat.android.modules.knowledgebase.domain.entities.SalesIQResource;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import od.AbstractC5886l;
import rd.C6218a;

/* loaded from: classes4.dex */
public final class f1 extends RecyclerView.F {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f15630a;

    /* renamed from: b, reason: collision with root package name */
    public final MobilistenTextView f15631b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f15632c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f15633d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(View itemView, Function1 function1) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f15633d = function1;
        View findViewById = itemView.findViewById(od.q.f60526g0);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
        this.f15632c = constraintLayout;
        og.p.v(constraintLayout, com.zoho.livechat.android.utils.P.e(e(), AbstractC5886l.f59802b), null, null, false, 0, 30, null);
        View findViewById2 = itemView.findViewById(od.q.f60561j4);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        MobilistenTextView mobilistenTextView = (MobilistenTextView) findViewById2;
        this.f15631b = mobilistenTextView;
        mobilistenTextView.setTypeface(C6218a.C());
        View findViewById3 = itemView.findViewById(od.q.f60551i4);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f15630a = (ImageView) findViewById3;
    }

    public static final void d(f1 this$0, SalesIQResource.b department, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(department, "$department");
        Function1 function1 = this$0.f15633d;
        if (function1 != null) {
            function1.invoke(department);
        }
    }

    private final Context e() {
        return this.itemView.getContext();
    }

    public final void c(final SalesIQResource.b department) {
        Intrinsics.checkNotNullParameter(department, "department");
        if (StringsKt.equals("DARK", com.zoho.livechat.android.utils.P.j(e()), true)) {
            this.f15630a.setImageResource(od.p.f60189y);
        } else {
            this.f15630a.setImageResource(od.p.f60184x);
        }
        this.f15631b.setText(department.a());
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: ag.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f1.d(f1.this, department, view);
            }
        });
    }
}
