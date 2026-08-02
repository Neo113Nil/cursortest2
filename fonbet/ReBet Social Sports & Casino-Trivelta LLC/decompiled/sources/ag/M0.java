package ag;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import java.util.List;
import od.AbstractC5886l;
import og.AbstractC5892d;
import rd.C6218a;
import zf.C6963d;

/* loaded from: classes4.dex */
public class M0 extends H implements View.OnClickListener {

    /* renamed from: Q4, reason: collision with root package name */
    public cg.f f15409Q4;

    /* renamed from: R4, reason: collision with root package name */
    public ConstraintLayout f15410R4;

    /* renamed from: S4, reason: collision with root package name */
    public ConstraintLayout f15411S4;

    /* renamed from: T4, reason: collision with root package name */
    public ImageView f15412T4;

    /* renamed from: U4, reason: collision with root package name */
    public FlexboxLayout f15413U4;

    /* renamed from: V4, reason: collision with root package name */
    public cg.e f15414V4;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Message f15415a;

        public a(Message message) {
            this.f15415a = message;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            M0.this.f15414V4.M(this.f15415a);
        }
    }

    public M0(View view, ConstraintLayout constraintLayout, cg.f fVar, cg.e eVar) {
        super(view);
        super.K1(constraintLayout);
        super.U1(fVar);
        this.f15409Q4 = fVar;
        this.f15414V4 = eVar;
        this.f15412T4 = (ImageView) view.findViewById(od.q.f60517f2);
        this.f15410R4 = (ConstraintLayout) view.findViewById(od.q.f60670u3);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(od.q.f60206A6);
        this.f15411S4 = constraintLayout2;
        og.p.g(constraintLayout2, null, Integer.valueOf(og.k.b(12)), Integer.valueOf(AbstractC5892d.f(d0(), Integer.valueOf(AbstractC5886l.f59766S0))));
        this.f15413U4 = (FlexboxLayout) view.findViewById(od.q.f60216B6);
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, Message message) {
        super.F1(salesIQChat, message);
        C6963d.x(O0(), message.getContent(), message, w1());
        ViewGroup.LayoutParams layoutParams = this.f15410R4.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.f15411S4.getLayoutParams();
        if (message.getMeta() == null || message.getMeta().getDisplayCard() == null || message.getMeta().getDisplayCard().getImage() == null) {
            layoutParams.width = -2;
            layoutParams2.width = -2;
            this.f15412T4.setVisibility(8);
        } else {
            this.f15412T4.setVisibility(0);
            layoutParams.width = -1;
            layoutParams2.width = -1;
            wd.d.F(this.f15412T4, message.getMeta().getDisplayCard().getImage(), Float.valueOf(10.0f));
        }
        this.f15410R4.setLayoutParams(layoutParams);
        this.f15411S4.setLayoutParams(layoutParams2);
        this.f15412T4.setOnClickListener(new a(message));
        this.f15413U4.setVisibility(8);
        if (message.getMeta() == null || message.getMeta().getDisplayCard() == null || salesIQChat == null) {
            return;
        }
        if (salesIQChat.getStatus() == 2 || salesIQChat.getStatus() == 6 || salesIQChat.getStatus() == 5) {
            this.f15413U4.removeAllViews();
            List<Message.Meta.DisplayCard.Phrase> phrases = message.getMeta().getDisplayCard().getPhrases();
            if (phrases == null || phrases.size() <= 0) {
                return;
            }
            this.f15413U4.setVisibility(0);
            for (int i10 = 0; i10 < phrases.size(); i10++) {
                Message.Meta.DisplayCard.Phrase phrase = phrases.get(i10);
                if (phrase.getText() != null && !phrase.getText().isEmpty()) {
                    this.f15413U4.addView(a2(phrase.getText()));
                }
            }
        }
    }

    public final View a2(final String str) {
        View inflate = LayoutInflater.from(this.itemView.getContext()).inflate(od.r.f60750M, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(od.q.f60523f8);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackground(com.zoho.livechat.android.utils.P.d(0, com.zoho.livechat.android.utils.P.e(linearLayout.getContext(), AbstractC5886l.f59803b0), C6218a.b(20.0f), C6218a.b(1.5f), com.zoho.livechat.android.utils.P.e(linearLayout.getContext(), AbstractC5886l.f59808c0)));
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(od.q.f60545h8);
        TextView textView = (TextView) inflate.findViewById(od.q.f60534g8);
        textView.setTypeface(C6218a.P());
        textView.setText(str);
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: ag.L0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                M0.this.f15409Q4.P(str, Message.g.WidgetInputDropdown, r1, null);
            }
        });
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }
}
