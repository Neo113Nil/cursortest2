package ag;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import od.AbstractC5886l;
import rd.C6218a;
import zf.C6963d;

/* renamed from: ag.c0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1960c0 extends H {

    /* renamed from: Q4, reason: collision with root package name */
    public TextView f15600Q4;

    /* renamed from: R4, reason: collision with root package name */
    public cg.e f15601R4;

    public C1960c0(View view, ConstraintLayout constraintLayout, cg.e eVar) {
        super(view);
        super.K1(constraintLayout);
        this.f15601R4 = eVar;
        this.f15600Q4 = (TextView) view.findViewById(od.q.f60488c6);
        float W02 = H.W0();
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, W02, W02, W02, W02};
        TextView textView = this.f15600Q4;
        og.p.r(textView, com.zoho.livechat.android.utils.P.e(textView.getContext(), AbstractC5886l.f59762R0), fArr);
        this.f15600Q4.setTypeface(C6218a.C());
    }

    public static /* synthetic */ void Y1(C1960c0 c1960c0, View view) {
        cg.e eVar = c1960c0.f15601R4;
        if (eVar != null) {
            eVar.D();
        }
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, Message message) {
        super.F1(salesIQChat, message);
        C6963d.x(O0(), d0().getString(od.t.f60871H1), message, w1());
        if (salesIQChat == null || salesIQChat.getStatus() != 2) {
            this.f15600Q4.setVisibility(8);
        } else {
            this.f15600Q4.setVisibility(0);
            this.f15600Q4.setOnClickListener(new View.OnClickListener() { // from class: ag.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1960c0.Y1(C1960c0.this, view);
                }
            });
        }
    }
}
