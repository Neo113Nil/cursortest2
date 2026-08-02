package ag;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import zf.C6966g;

/* loaded from: classes4.dex */
public class W extends H {

    /* renamed from: Q4, reason: collision with root package name */
    public TextView f15534Q4;

    public W(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(od.q.f60642r5);
        this.f15534Q4 = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void Y1(SalesIQChat salesIQChat, Message message) {
        Spannable b10;
        this.f15534Q4.setText((CharSequence) null);
        if (salesIQChat == null || (b10 = C6966g.C6967a.b(this.f15534Q4.getContext(), Integer.valueOf(salesIQChat.getStatus()), message, true)) == null) {
            return;
        }
        this.f15534Q4.setText(b10);
    }
}
