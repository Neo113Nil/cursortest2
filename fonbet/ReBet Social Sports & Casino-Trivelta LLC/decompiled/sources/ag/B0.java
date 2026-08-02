package ag;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.hermes.intl.Constants;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import od.AbstractC5886l;
import rd.C6218a;
import zf.C6963d;

/* loaded from: classes4.dex */
public class B0 extends H implements View.OnClickListener {

    /* renamed from: Q4, reason: collision with root package name */
    public cg.f f15150Q4;

    /* renamed from: R4, reason: collision with root package name */
    public ConstraintLayout f15151R4;

    /* renamed from: S4, reason: collision with root package name */
    public ImageView f15152S4;

    /* renamed from: T4, reason: collision with root package name */
    public LinearLayout f15153T4;

    /* renamed from: U4, reason: collision with root package name */
    public LinearLayout f15154U4;

    /* renamed from: V4, reason: collision with root package name */
    public LinearLayout f15155V4;

    /* renamed from: W4, reason: collision with root package name */
    public ImageView f15156W4;

    /* renamed from: X4, reason: collision with root package name */
    public ImageView f15157X4;

    /* renamed from: Y4, reason: collision with root package name */
    public TextView f15158Y4;

    /* renamed from: Z4, reason: collision with root package name */
    public TextView f15159Z4;

    /* renamed from: a5, reason: collision with root package name */
    public cg.e f15160a5;

    /* renamed from: b5, reason: collision with root package name */
    public TextView f15161b5;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Message f15162a;

        public a(Message message) {
            this.f15162a = message;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (B0.this.f15160a5 != null) {
                B0.this.f15160a5.M(this.f15162a);
            }
        }
    }

    public B0(View view, ConstraintLayout constraintLayout, cg.f fVar, cg.e eVar) {
        super(view);
        super.K1(constraintLayout);
        super.U1(fVar);
        this.f15150Q4 = fVar;
        this.f15160a5 = eVar;
        this.f15151R4 = (ConstraintLayout) view.findViewById(od.q.f60690w3);
        this.f15152S4 = (ImageView) view.findViewById(od.q.f60517f2);
        this.f15153T4 = (LinearLayout) view.findViewById(od.q.f60412V2);
        this.f15154U4 = (LinearLayout) view.findViewById(od.q.f60402U2);
        this.f15155V4 = (LinearLayout) view.findViewById(od.q.f60421W1);
        this.f15156W4 = (ImageView) view.findViewById(od.q.f60392T2);
        this.f15157X4 = (ImageView) view.findViewById(od.q.f60411V1);
        ImageView imageView = this.f15156W4;
        imageView.setImageDrawable(LiveChatUtil.changeDrawableColor(imageView.getContext(), od.p.f60183w3, com.zoho.livechat.android.utils.P.e(this.f15156W4.getContext(), AbstractC5886l.f59761R)));
        ImageView imageView2 = this.f15157X4;
        imageView2.setImageDrawable(LiveChatUtil.changeDrawableColor(imageView2.getContext(), od.p.f60163s3, com.zoho.livechat.android.utils.P.e(this.f15157X4.getContext(), AbstractC5886l.f59761R)));
        TextView textView = (TextView) view.findViewById(od.q.f60422W2);
        this.f15158Y4 = textView;
        textView.setTypeface(C6218a.P());
        TextView textView2 = (TextView) view.findViewById(od.q.f60431X1);
        this.f15159Z4 = textView2;
        textView2.setTypeface(C6218a.P());
        TextView textView3 = (TextView) view.findViewById(od.q.f60408U8);
        this.f15161b5 = textView3;
        textView3.setTextColor(com.zoho.livechat.android.utils.P.e(textView3.getContext(), AbstractC5886l.f59809c1));
        this.f15161b5.setTypeface(C6218a.P());
    }

    private static int Z1() {
        return MobilistenInitProvider.k().getResources().getConfiguration().orientation;
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, Message message) {
        super.F1(salesIQChat, message);
        R(this.f15151R4, AbstractC5886l.f59766S0);
        boolean z10 = true;
        C6963d.y(O0(), message.getContent(), message, w1(), !message.isLastMessage());
        boolean z11 = false;
        if (message.getMeta() == null || message.getMeta().getDisplayCard() == null || message.getMeta().getDisplayCard().getImage() == null) {
            this.f15152S4.setVisibility(8);
        } else {
            this.f15152S4.setVisibility(0);
            wd.d.F(this.f15152S4, message.getMeta().getDisplayCard().getImage(), Float.valueOf(10.0f));
            z10 = false;
        }
        String formattedClientTime = message.getFormattedClientTime();
        if (message.isLastMessage()) {
            this.f15154U4.setOnClickListener(this);
            this.f15155V4.setOnClickListener(this);
            this.f15153T4.setVisibility(0);
            R0().setVisibility(8);
            this.f15161b5.setVisibility(0);
            this.f15161b5.setText(formattedClientTime);
        } else {
            this.f15161b5.setVisibility(8);
            this.f15153T4.setVisibility(8);
            R0().setVisibility(0);
            R0().setText(formattedClientTime);
            z11 = z10;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) this.f15151R4.getLayoutParams();
        if (z11) {
            ((ViewGroup.MarginLayoutParams) bVar).width = -2;
        } else if (Z1() == 2) {
            ((ViewGroup.MarginLayoutParams) bVar).width = (int) (Resources.getSystem().getDisplayMetrics().heightPixels * 0.8d);
        } else {
            ((ViewGroup.MarginLayoutParams) bVar).width = -2;
        }
        this.f15151R4.setLayoutParams(bVar);
        this.f15152S4.setOnClickListener(new a(message));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        String str2;
        if (this.f15150Q4 != null) {
            if (view.getId() == this.f15154U4.getId()) {
                str = ":thumbsup:";
                str2 = "true";
            } else if (view.getId() == this.f15155V4.getId()) {
                str = ":thumbsdown:";
                str2 = Constants.CASEFIRST_FALSE;
            } else {
                str = null;
                str2 = null;
            }
            this.f15150Q4.P(str, Message.g.WidgetLikeRating, str2, null);
        }
    }
}
