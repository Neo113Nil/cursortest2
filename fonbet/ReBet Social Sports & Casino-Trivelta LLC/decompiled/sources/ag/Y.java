package ag;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import od.AbstractC5886l;
import rd.C6218a;
import zf.C6963d;

/* loaded from: classes4.dex */
public class Y extends H {

    /* renamed from: Q4, reason: collision with root package name */
    public TextView f15536Q4;

    /* renamed from: R4, reason: collision with root package name */
    public cg.e f15537R4;

    public Y(View view, ConstraintLayout constraintLayout, cg.e eVar) {
        super(view);
        super.K1(constraintLayout);
        this.f15537R4 = eVar;
        TextView textView = (TextView) view.findViewById(od.q.f60488c6);
        this.f15536Q4 = textView;
        textView.setTypeface(C6218a.C());
        float W02 = H.W0();
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, W02, W02, W02, W02};
        TextView textView2 = this.f15536Q4;
        og.p.r(textView2, com.zoho.livechat.android.utils.P.e(textView2.getContext(), AbstractC5886l.f59762R0), fArr);
    }

    public static /* synthetic */ void Y1(Y y10, View view) {
        cg.e eVar = y10.f15537R4;
        if (eVar != null) {
            eVar.O();
        }
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, Message message) {
        super.F1(salesIQChat, message);
        C6963d.x(O0(), message.getContent(), message, w1());
        this.f15536Q4.setText(od.t.f61013e1);
        if (!message.isLastMessage() || message.getMeta() == null || !Boolean.TRUE.equals(message.getMeta().getHideInput()) || (salesIQChat.getStatus() != 1 && salesIQChat.getStatus() != 7 && salesIQChat.getStatus() != 6 && salesIQChat.getStatus() != 5)) {
            this.f15536Q4.setVisibility(8);
        } else {
            this.f15536Q4.setVisibility(0);
            this.f15536Q4.setOnClickListener(new View.OnClickListener() { // from class: ag.X
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Y.Y1(Y.this, view);
                }
            });
        }
    }
}
