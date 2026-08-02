package ag;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import m.AbstractActivityC5481c;
import od.AbstractC5886l;
import rd.C6218a;
import zf.C6963d;

/* loaded from: classes4.dex */
public class H0 extends H implements View.OnClickListener {

    /* renamed from: Q4, reason: collision with root package name */
    public cg.f f15348Q4;

    /* renamed from: R4, reason: collision with root package name */
    public ImageView f15349R4;

    /* renamed from: S4, reason: collision with root package name */
    public LinearLayout f15350S4;

    /* renamed from: T4, reason: collision with root package name */
    public TextView f15351T4;

    /* renamed from: U4, reason: collision with root package name */
    public ImageView f15352U4;

    /* renamed from: V4, reason: collision with root package name */
    public Message f15353V4;

    /* renamed from: W4, reason: collision with root package name */
    public cg.e f15354W4;

    public H0(View view, ConstraintLayout constraintLayout, cg.f fVar, cg.e eVar) {
        super(view);
        super.K1(constraintLayout);
        super.U1(fVar);
        this.f15348Q4 = fVar;
        this.f15354W4 = eVar;
        this.f15349R4 = (ImageView) view.findViewById(od.q.f60517f2);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(od.q.f60371R1);
        this.f15350S4 = linearLayout;
        linearLayout.getBackground().setColorFilter(com.zoho.livechat.android.utils.P.e(this.f15350S4.getContext(), AbstractC5886l.f59721H), PorterDuff.Mode.SRC_ATOP);
        TextView textView = (TextView) view.findViewById(od.q.f60391T1);
        this.f15351T4 = textView;
        textView.setTypeface(C6218a.C());
        ImageView imageView = (ImageView) view.findViewById(od.q.f60381S1);
        this.f15352U4 = imageView;
        imageView.setColorFilter(com.zoho.livechat.android.utils.P.a(view.getContext()));
    }

    public static /* synthetic */ void Z1(H0 h02, String str, Message.g gVar, Object obj, String str2) {
        cg.f fVar = h02.f15348Q4;
        if (fVar == null || str == null) {
            return;
        }
        fVar.P(str, gVar, obj, str2);
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, final Message message) {
        super.F1(salesIQChat, message);
        this.f15353V4 = message;
        C6963d.y(O0(), message.getContent(), message, w1(), true);
        if (message.getMeta() == null || message.getMeta().getDisplayCard() == null || message.getMeta().getDisplayCard().getImage() == null) {
            this.f15349R4.setVisibility(8);
        } else {
            this.f15349R4.setVisibility(0);
            wd.d.F(this.f15349R4, message.getMeta().getDisplayCard().getImage(), Float.valueOf(10.0f));
        }
        this.f15349R4.setOnClickListener(new View.OnClickListener() { // from class: ag.F0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                H0.this.f15354W4.M(message);
            }
        });
        if (!message.isLastMessage() || salesIQChat == null || (salesIQChat.getStatus() != 2 && salesIQChat.getStatus() != 6 && salesIQChat.getStatus() != 5)) {
            this.f15350S4.setVisibility(8);
            return;
        }
        this.f15350S4.setVisibility(0);
        String label = message.getMeta().getInputCard().getLabel();
        if (label == null) {
            this.f15351T4.setText(od.t.f60979Z1);
        } else {
            this.f15351T4.setText(label);
        }
        if (salesIQChat.getStatus() == 4 || salesIQChat.getStatus() == 3) {
            this.f15350S4.setVisibility(8);
        } else {
            this.f15350S4.setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != this.f15350S4.getId() || this.f15353V4.getMeta() == null) {
            return;
        }
        FragmentManager supportFragmentManager = ((AbstractActivityC5481c) this.f15350S4.getContext()).getSupportFragmentManager();
        bg.q qVar = new bg.q();
        Bundle bundle = new Bundle();
        bundle.putString(EventKeys.DATA, Yd.a.j().v(this.f15353V4.getMeta()));
        qVar.setArguments(bundle);
        supportFragmentManager.s().c(od.q.f60627q0, qVar, bg.q.class.getName()).g(bg.q.class.getName()).h();
        qVar.E0(new cg.d() { // from class: ag.G0
            @Override // cg.d
            public final void a(String str, Message.g gVar, Object obj, String str2) {
                H0.Z1(H0.this, str, gVar, obj, str2);
            }
        });
    }
}
