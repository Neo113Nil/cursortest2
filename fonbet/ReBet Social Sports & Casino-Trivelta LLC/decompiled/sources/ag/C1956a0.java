package ag;

import android.R;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import zf.C6963d;

/* renamed from: ag.a0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1956a0 extends H {

    /* renamed from: Q4, reason: collision with root package name */
    public ImageView f15570Q4;

    public C1956a0(final View view, ConstraintLayout constraintLayout) {
        super(view);
        super.K1(constraintLayout);
        ImageView imageView = (ImageView) view.findViewById(od.q.f60395T5);
        this.f15570Q4 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: ag.Z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1956a0.Y1(C1956a0.this, view, view2);
            }
        });
        this.f15570Q4.setBackgroundResource(R.color.transparent);
        og.p.e(this.f15570Q4, H.m0());
    }

    public static /* synthetic */ void Y1(C1956a0 c1956a0, View view, View view2) {
        Message.Meta.CardData.Value Z12 = c1956a0.Z1();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("https://maps.google.com/maps?");
        sb2.append("q=");
        try {
            sb2.append(URLEncoder.encode(c1956a0.q0().getContent(), "UTF-8"));
        } catch (UnsupportedEncodingException e10) {
            LiveChatUtil.log(e10);
        }
        sb2.append("@");
        sb2.append(Z12.getLatitude());
        sb2.append(",");
        sb2.append(Z12.getLongitude());
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb2.toString()));
        if (intent.resolveActivity(view.getContext().getPackageManager()) != null) {
            view.getContext().startActivity(intent);
        }
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, Message message) {
        super.F1(salesIQChat, message);
        Message.Meta.CardData.Value Z12 = Z1();
        if (Z12 != null) {
            wd.d.F(this.f15570Q4, Z12.getImage(), Float.valueOf(10.0f));
            C6963d.x(O0(), message.getContent(), message, w1());
            R0().setText(message.getFormattedClientTime());
            q1(message);
        }
    }

    public final Message.Meta.CardData.Value Z1() {
        if (q0().getMeta() == null || q0().getMeta().getCardData() == null || q0().getMeta().getCardData().getValue() == null) {
            return null;
        }
        return q0().getMeta().getCardData().getValue();
    }
}
