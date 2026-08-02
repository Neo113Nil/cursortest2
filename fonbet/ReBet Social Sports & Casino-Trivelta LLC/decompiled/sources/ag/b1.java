package ag;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
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

/* loaded from: classes4.dex */
public class b1 extends H implements View.OnClickListener {

    /* renamed from: Q4, reason: collision with root package name */
    public cg.f f15583Q4;

    /* renamed from: R4, reason: collision with root package name */
    public ImageView f15584R4;

    /* renamed from: S4, reason: collision with root package name */
    public View f15585S4;

    /* renamed from: T4, reason: collision with root package name */
    public TextView f15586T4;

    /* renamed from: U4, reason: collision with root package name */
    public cg.e f15587U4;

    /* renamed from: V4, reason: collision with root package name */
    public Message f15588V4;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Message f15589a;

        public a(Message message) {
            this.f15589a = message;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b1.this.f15587U4.M(this.f15589a);
        }
    }

    public class b implements Runnable {

        public class a implements InterfaceC2918a {
            public a() {
            }

            @Override // cg.InterfaceC2918a
            public void a(String str, Message.g gVar, String str2, String str3) {
                if (b1.this.f15583Q4 != null) {
                    b1.this.f15583Q4.P(str, gVar, str2, str3);
                }
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager supportFragmentManager = ((AbstractActivityC5481c) b1.this.f15585S4.getContext()).getSupportFragmentManager();
            bg.r rVar = new bg.r();
            rVar.g0(new a());
            Bundle bundle = new Bundle();
            bundle.putString(EventKeys.DATA, Yd.a.j().v(b1.this.f15588V4.getMeta()));
            rVar.setArguments(bundle);
            supportFragmentManager.s().b(od.q.f60627q0, rVar).g(null).i();
        }
    }

    public b1(View view, ConstraintLayout constraintLayout, cg.f fVar, cg.e eVar) {
        super(view);
        super.K1(constraintLayout);
        super.U1(fVar);
        this.f15583Q4 = fVar;
        this.f15587U4 = eVar;
        ImageView imageView = (ImageView) view.findViewById(od.q.f60517f2);
        this.f15584R4 = imageView;
        og.p.e(imageView, H.l0());
        View findViewById = view.findViewById(od.q.f60635q8);
        this.f15585S4 = findViewById;
        findViewById.getBackground().setColorFilter(com.zoho.livechat.android.utils.P.e(this.f15585S4.getContext(), AbstractC5886l.f59721H), PorterDuff.Mode.SRC_ATOP);
        TextView textView = (TextView) view.findViewById(od.q.f60391T1);
        this.f15586T4 = textView;
        textView.setTypeface(C6218a.C());
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, Message message) {
        super.F1(salesIQChat, message);
        this.f15588V4 = message;
        C6963d.y(O0(), message.getContent(), message, w1(), true);
        if (message.getMeta() == null || message.getMeta().getDisplayCard() == null || message.getMeta().getDisplayCard().getImage() == null) {
            this.f15584R4.setVisibility(8);
        } else {
            this.f15584R4.setVisibility(0);
            wd.d.F(this.f15584R4, message.getMeta().getDisplayCard().getImage(), Float.valueOf(10.0f));
        }
        this.f15584R4.setOnClickListener(new a(message));
        if (!message.isLastMessage() || salesIQChat == null || (salesIQChat.getStatus() != 2 && salesIQChat.getStatus() != 6 && salesIQChat.getStatus() != 5)) {
            this.f15585S4.setVisibility(8);
            return;
        }
        this.f15585S4.setVisibility(0);
        String label = message.getMeta().getInputCard().getLabel();
        if (label == null) {
            this.f15586T4.setText(od.t.f61042i2);
        } else {
            this.f15586T4.setText(label);
        }
        this.f15585S4.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == this.f15585S4.getId()) {
            new Handler().postDelayed(new b(), 200L);
        }
    }
}
