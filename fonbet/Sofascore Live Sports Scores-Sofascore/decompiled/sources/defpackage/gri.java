package defpackage;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.chat.ChatUser;
import com.sofascore.model.chat.Message;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gri extends d2 {
    public final dk2 g;
    public final tj4 h;
    public final ct8 i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gri(dk2 dk2Var, tj4 tj4Var, ct8 ct8Var) {
        super(r0);
        LinearLayout linearLayout = dk2Var.b;
        linearLayout.getClass();
        this.g = dk2Var;
        this.h = tj4Var;
        this.i = ct8Var;
        dk2Var.c.setOnClickListener(new tii(this, 5));
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        Message message = (Message) obj;
        message.getClass();
        this.d = message;
        dk2 dk2Var = this.g;
        dk2Var.c.setText(message.getText());
        TextView textView = dk2Var.c;
        textView.setEnabled(((ChatUser) this.h.invoke()).isAdmin());
        textView.setAutoLinkMask(message.getIsLinkify() ? 3 : 0);
    }
}
