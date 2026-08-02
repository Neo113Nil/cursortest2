package ag;

import ag.ViewOnClickListenerC1984o0;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import cg.InterfaceC2918a;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import m.AbstractActivityC5481c;
import od.AbstractC5886l;
import rd.C6218a;
import zf.C6963d;

/* renamed from: ag.o0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class ViewOnClickListenerC1984o0 extends H implements View.OnClickListener {

    /* renamed from: Q4, reason: collision with root package name */
    public cg.f f15732Q4;

    /* renamed from: R4, reason: collision with root package name */
    public ImageView f15733R4;

    /* renamed from: S4, reason: collision with root package name */
    public LinearLayout f15734S4;

    /* renamed from: T4, reason: collision with root package name */
    public TextView f15735T4;

    /* renamed from: U4, reason: collision with root package name */
    public TextView f15736U4;

    /* renamed from: V4, reason: collision with root package name */
    public ImageView f15737V4;

    /* renamed from: W4, reason: collision with root package name */
    public cg.e f15738W4;

    /* renamed from: ag.o0$a */
    public class a implements Runnable {
        public a() {
        }

        public static /* synthetic */ void a(a aVar, String str, Message.g gVar, String str2, String str3) {
            cg.f fVar = ViewOnClickListenerC1984o0.this.f15732Q4;
            if (fVar != null) {
                fVar.P(str, gVar, str2, str3);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager supportFragmentManager = ((AbstractActivityC5481c) ViewOnClickListenerC1984o0.this.f15734S4.getContext()).getSupportFragmentManager();
            bg.m mVar = new bg.m();
            mVar.z0(new InterfaceC2918a() { // from class: ag.n0
                @Override // cg.InterfaceC2918a
                public final void a(String str, Message.g gVar, String str2, String str3) {
                    ViewOnClickListenerC1984o0.a.a(ViewOnClickListenerC1984o0.a.this, str, gVar, str2, str3);
                }
            });
            Bundle bundle = new Bundle();
            bundle.putString(EventKeys.DATA, Yd.a.j().v(ViewOnClickListenerC1984o0.this.q0().getMeta()));
            mVar.setArguments(bundle);
            supportFragmentManager.s().b(od.q.f60627q0, mVar).g(null).i();
        }
    }

    public ViewOnClickListenerC1984o0(View view, ConstraintLayout constraintLayout, cg.f fVar, cg.e eVar) {
        super(view);
        super.K1(constraintLayout);
        super.U1(fVar);
        this.f15732Q4 = fVar;
        this.f15738W4 = eVar;
        this.f15733R4 = (ImageView) view.findViewById(od.q.f60517f2);
        this.f15734S4 = (LinearLayout) view.findViewById(od.q.f60371R1);
        this.f15736U4 = (TextView) view.findViewById(od.q.f60618p1);
        this.f15734S4.getBackground().setColorFilter(com.zoho.livechat.android.utils.P.e(this.f15734S4.getContext(), AbstractC5886l.f59721H), PorterDuff.Mode.SRC_ATOP);
        TextView textView = (TextView) view.findViewById(od.q.f60391T1);
        this.f15735T4 = textView;
        textView.setTypeface(C6218a.C());
        ImageView imageView = (ImageView) view.findViewById(od.q.f60381S1);
        this.f15737V4 = imageView;
        imageView.setColorFilter(com.zoho.livechat.android.utils.P.e(view.getContext(), AbstractC5886l.f59725I));
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, final Message message) {
        super.F1(salesIQChat, message);
        boolean z10 = true;
        C6963d.y(O0(), message.getContent(), message, w1(), !message.isLastMessage());
        boolean z11 = false;
        if (message.getMeta() == null || message.getMeta().getDisplayCard() == null || message.getMeta().getDisplayCard().getImage() == null) {
            this.f15733R4.setVisibility(8);
        } else {
            this.f15733R4.setVisibility(0);
            wd.d.F(this.f15733R4, message.getMeta().getDisplayCard().getImage(), Float.valueOf(10.0f));
            z10 = false;
        }
        this.f15733R4.setOnClickListener(new View.OnClickListener() { // from class: ag.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnClickListenerC1984o0.this.f15738W4.M(message);
            }
        });
        if (message.isLastMessage() && salesIQChat != null && (salesIQChat.getStatus() == 2 || salesIQChat.getStatus() == 6 || salesIQChat.getStatus() == 5)) {
            String label = message.getMeta().getInputCard().getLabel();
            if (label == null) {
                this.f15735T4.setText(od.t.f60907N1);
            } else {
                this.f15735T4.setText(label);
            }
            this.f15734S4.setVisibility(0);
            this.f15734S4.setOnClickListener(this);
        } else {
            this.f15734S4.setVisibility(8);
            z11 = z10;
        }
        T1(q0(), z11, this.f15736U4);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == this.f15734S4.getId()) {
            new Handler().postDelayed(new a(), 200L);
        }
    }
}
