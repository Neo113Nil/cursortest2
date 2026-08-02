package ag;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenTextView;
import com.zoho.livechat.android.modules.knowledgebase.domain.entities.SalesIQResource;
import com.zoho.livechat.android.utils.LiveChatUtil;
import kotlin.jvm.functions.Function1;
import od.AbstractC5886l;
import rd.C6218a;

/* loaded from: classes4.dex */
public class h1 extends RecyclerView.F {

    /* renamed from: a, reason: collision with root package name */
    public Function1 f15651a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f15652b;

    /* renamed from: c, reason: collision with root package name */
    public MobilistenTextView f15653c;

    /* renamed from: d, reason: collision with root package name */
    public MobilistenTextView f15654d;

    /* renamed from: e, reason: collision with root package name */
    public ConstraintLayout f15655e;

    public h1(View view, Function1 function1) {
        super(view);
        this.f15651a = function1;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(od.q.f60567k0);
        this.f15655e = constraintLayout;
        og.p.q(constraintLayout, com.zoho.livechat.android.utils.P.e(constraintLayout.getContext(), AbstractC5886l.f59817e));
        this.f15652b = (ImageView) view.findViewById(od.q.f60537h0);
        MobilistenTextView mobilistenTextView = (MobilistenTextView) view.findViewById(od.q.f60547i0);
        this.f15653c = mobilistenTextView;
        mobilistenTextView.setTypeface(C6218a.P());
        MobilistenTextView mobilistenTextView2 = (MobilistenTextView) view.findViewById(od.q.f60577l0);
        this.f15654d = mobilistenTextView2;
        mobilistenTextView2.setTypeface(C6218a.P());
    }

    public static /* synthetic */ void b(h1 h1Var, SalesIQResource.Data data, View view) {
        Function1 function1 = h1Var.f15651a;
        if (function1 != null) {
            function1.invoke(data);
        }
    }

    public void c(final SalesIQResource.Data data, int i10) {
        if ("DARK".equalsIgnoreCase(com.zoho.livechat.android.utils.P.j(this.f15652b.getContext()))) {
            ImageView imageView = this.f15652b;
            imageView.setImageDrawable(androidx.core.content.res.k.f(imageView.getContext().getResources(), od.p.f60149q, this.f15652b.getContext().getTheme()));
        } else {
            ImageView imageView2 = this.f15652b;
            imageView2.setImageDrawable(androidx.core.content.res.k.f(imageView2.getContext().getResources(), od.p.f60144p, this.f15652b.getContext().getTheme()));
        }
        int b10 = i10 == 0 ? C6218a.b(16.0f) : C6218a.b(12.0f);
        View view = this.itemView;
        view.setPadding(view.getPaddingLeft(), b10, this.itemView.getPaddingRight(), this.itemView.getPaddingBottom());
        this.f15653c.setText(LiveChatUtil.unescapeHtml(data.getTitle()));
        d(data);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: ag.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h1.b(h1.this, data, view2);
            }
        });
    }

    public void d(SalesIQResource.Data data) {
        if (data.getStats() != null) {
            this.f15654d.setText(data.getStats().getViewed() > 1 ? String.format(this.f15654d.getContext().getString(od.t.f61011e), Integer.valueOf(data.getStats().getViewed())) : data.getStats().getViewed() == 1 ? String.format(this.f15654d.getContext().getString(od.t.f61018f), Integer.valueOf(data.getStats().getViewed())) : this.f15654d.getContext().getString(od.t.f61098q2));
        }
    }
}
