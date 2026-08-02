package ag;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AbstractC2082d0;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.Arrays;
import od.AbstractC5886l;
import rd.C6218a;
import zf.C6963d;

/* loaded from: classes4.dex */
public class O extends H {

    /* renamed from: Q4, reason: collision with root package name */
    public TextView f15421Q4;

    public O(View view, ConstraintLayout constraintLayout) {
        super(view);
        super.K1(constraintLayout);
        TextView textView = (TextView) view.findViewById(od.q.f60384S4);
        this.f15421Q4 = textView;
        textView.setTypeface(C6218a.C());
        float W02 = H.W0();
        og.p.t(this.f15421Q4, com.zoho.livechat.android.utils.P.e(d0(), AbstractC5886l.f59843j0), new float[]{0.0f, 0.0f, 0.0f, 0.0f, W02, W02, W02, W02}, null, true);
    }

    @Override // ag.H
    public void F1(final SalesIQChat salesIQChat, Message message) {
        String str;
        int i10;
        String thankingResponse;
        Drawable f10;
        if (message.getAttachment() == null || message.getAttachment().isFeedbackCardExpired() == Boolean.TRUE || message.getAttachment().getRating() != null) {
            super.F1(salesIQChat, message);
            s0().setVisibility(8);
            if (message.getAttachment() != null) {
                i10 = message.getAttachment().getRating() != null ? message.getAttachment().getRating().intValue() : 0;
                str = message.getAttachment().getRatingMessage();
            } else {
                str = null;
                i10 = 0;
            }
            this.f15421Q4.setOnClickListener(new View.OnClickListener() { // from class: ag.N
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveChatUtil.showFeedbackDialog(O.this.d0(), salesIQChat);
                }
            });
            int h10 = i10 != 1 ? i10 != 2 ? i10 != 3 ? 0 : com.zoho.livechat.android.utils.P.h(d0(), AbstractC5886l.f59791Y1) : com.zoho.livechat.android.utils.P.h(d0(), AbstractC5886l.f59795Z1) : com.zoho.livechat.android.utils.P.h(d0(), AbstractC5886l.f59800a2);
            if (i10 != 0) {
                thankingResponse = LiveChatUtil.getRatingResponse(d0(), i10);
                if (h10 > 0 && (f10 = androidx.core.content.res.k.f(this.itemView.getResources(), h10, this.itemView.getContext().getTheme())) != null) {
                    a2(f10);
                }
                this.f15421Q4.setVisibility(8);
            } else {
                w0().setVisibility(8);
                if (str == null || str.isEmpty()) {
                    thankingResponse = LiveChatUtil.getThankingResponse(salesIQChat, d0());
                    this.f15421Q4.setVisibility(0);
                } else {
                    thankingResponse = LiveChatUtil.getFeedbackResponse(salesIQChat, d0());
                    this.f15421Q4.setVisibility(8);
                }
            }
            C6963d.x(O0(), thankingResponse, message, w1());
            if (message.getAttachment() == null || message.getAttachment().getFeedbackTime() == null) {
                R0().setText(message.getFormattedClientTime());
            } else {
                R0().setText(og.j.a(message.getAttachment().getFeedbackTime().longValue()));
            }
        }
    }

    public final GradientDrawable Z1(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        float[] fArr = new float[8];
        Arrays.fill(fArr, C6218a.b(20.0f));
        gradientDrawable.setCornerRadii(fArr);
        gradientDrawable.setColor(com.zoho.livechat.android.utils.P.e(context, AbstractC5886l.f59773U));
        gradientDrawable.setStroke(C6218a.b(0.67f), com.zoho.livechat.android.utils.P.e(context, AbstractC5886l.f59766S0));
        return gradientDrawable;
    }

    public void a2(Drawable drawable) {
        w0().setImageDrawable(drawable);
        w0().setVisibility(0);
        AbstractC2082d0.p0(v0(), Z1(d0()));
    }
}
