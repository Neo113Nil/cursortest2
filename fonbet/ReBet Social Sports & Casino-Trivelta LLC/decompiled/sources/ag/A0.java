package ag;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.Hashtable;
import java.util.List;
import l.AbstractC5335a;
import od.AbstractC5886l;
import rd.C6218a;
import zf.C6963d;

/* loaded from: classes4.dex */
public class A0 extends H implements TextWatcher {

    /* renamed from: Q4, reason: collision with root package name */
    public cg.f f15136Q4;

    /* renamed from: R4, reason: collision with root package name */
    public C6963d f15137R4;

    /* renamed from: S4, reason: collision with root package name */
    public ImageView f15138S4;

    /* renamed from: T4, reason: collision with root package name */
    public EditText f15139T4;

    /* renamed from: U4, reason: collision with root package name */
    public LinearLayout f15140U4;

    /* renamed from: V4, reason: collision with root package name */
    public RelativeLayout f15141V4;

    /* renamed from: W4, reason: collision with root package name */
    public TextView f15142W4;

    /* renamed from: X4, reason: collision with root package name */
    public TextView f15143X4;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Message f15144a;

        public a(Message message) {
            this.f15144a = message;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            A0.this.o0().M(this.f15144a);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            A0.this.f15139T4.requestFocus();
            LiveChatUtil.showKeyboard(A0.this.f15139T4);
        }
    }

    public class c implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Message f15147a;

        public c(Message message) {
            this.f15147a = message;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Hashtable s10 = A0.this.f15137R4.s();
            String str = s10 != null ? (String) s10.get(EventKeys.VALUE_KEY) : null;
            if (str == null || str.trim().length() <= 0 || !Patterns.WEB_URL.matcher(str).matches()) {
                A0.this.e2(true, this.f15147a.getMeta());
            } else if (A0.this.f15136Q4.P(str.trim(), Message.g.WidgetInputEmail, str.trim(), null)) {
                A0.this.f15137R4.A(null);
            }
        }
    }

    public A0(View view, ConstraintLayout constraintLayout, cg.f fVar, C6963d c6963d, cg.e eVar) {
        super(view, eVar);
        super.K1(constraintLayout);
        this.f15136Q4 = fVar;
        this.f15137R4 = c6963d;
        this.f15138S4 = (ImageView) view.findViewById(od.q.f60517f2);
        EditText editText = (EditText) view.findViewById(od.q.f60222C2);
        this.f15139T4 = editText;
        editText.setBackground(com.zoho.livechat.android.utils.P.d(0, com.zoho.livechat.android.utils.P.e(editText.getContext(), AbstractC5886l.f59721H), C6218a.b(4.0f), 0, 0));
        this.f15139T4.setTypeface(C6218a.P());
        e1(this.f15139T4);
        this.f15140U4 = (LinearLayout) view.findViewById(od.q.f60232D2);
        this.f15141V4 = (RelativeLayout) view.findViewById(od.q.f60202A2);
        TextView textView = (TextView) view.findViewById(od.q.f60619p2);
        this.f15142W4 = textView;
        textView.setTypeface(C6218a.P());
        TextView textView2 = (TextView) view.findViewById(od.q.f60712y5);
        this.f15143X4 = textView2;
        textView2.setTypeface(C6218a.P());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e2(boolean z10, Message.Meta meta) {
        if (!z10) {
            this.f15142W4.setVisibility(8);
            return;
        }
        this.f15142W4.setVisibility(0);
        if (meta.getInputCard() != null) {
            List<String> error = meta.getInputCard().getError();
            if (error == null || error.size() <= 0) {
                this.f15142W4.setText(od.t.f60955V1);
            } else {
                this.f15142W4.setText(String.valueOf(error.get(0)));
            }
        }
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, Message message) {
        boolean z10;
        super.F1(salesIQChat, message);
        C6963d.y(O0(), message.getContent(), message, w1(), !message.isLastMessage());
        boolean z11 = false;
        if (message.getMeta() == null || message.getMeta().getDisplayCard() == null || message.getMeta().getDisplayCard().getImage() == null) {
            this.f15138S4.setVisibility(8);
            z10 = true;
        } else {
            this.f15138S4.setVisibility(0);
            wd.d.F(this.f15138S4, message.getMeta().getDisplayCard().getImage(), Float.valueOf(10.0f));
            z10 = false;
        }
        this.f15138S4.setOnClickListener(new a(message));
        if (!message.isLastMessage() || salesIQChat == null || (!(salesIQChat.getStatus() == 2 || salesIQChat.getStatus() == 6 || salesIQChat.getStatus() == 5) || message.getMeta() == null || message.getMeta().getInputCard() == null)) {
            this.f15140U4.setVisibility(8);
            z11 = z10;
        } else {
            this.f15140U4.setVisibility(0);
            this.f15139T4.setHint(message.getMeta().getInputCard().getPlaceholder());
            Hashtable s10 = this.f15137R4.s();
            String str = s10 != null ? (String) s10.get(EventKeys.VALUE_KEY) : null;
            if (str != null && str.length() > 0) {
                this.f15139T4.setText(str);
                EditText editText = this.f15139T4;
                editText.setSelection(editText.getText().toString().length());
            } else if (message.getMeta().getInputCard().getValue() != null) {
                Hashtable hashtable = new Hashtable();
                hashtable.put(EventKeys.VALUE_KEY, message.getMeta().getInputCard().getValue());
                this.f15137R4.A(hashtable);
                this.f15139T4.setText(message.getMeta().getInputCard().getValue());
                EditText editText2 = this.f15139T4;
                editText2.setSelection(editText2.getText().toString().length());
            } else {
                this.f15139T4.setText((CharSequence) null);
            }
            this.f15139T4.post(new b());
            String trim = this.f15139T4.getText().toString().trim();
            e2(trim.length() > 0 && !Patterns.WEB_URL.matcher(trim).matches(), message.getMeta());
            V1(this.f15139T4);
            Q(this.f15141V4, C6218a.b(3.0f), AbstractC5335a.f55002q);
            this.f15141V4.setOnClickListener(new c(message));
        }
        T1(message, z11, this.f15143X4);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.f15142W4.setVisibility(8);
    }

    public void c2() {
        this.f15139T4.removeTextChangedListener(this);
    }

    public void d2() {
        this.f15139T4.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        Hashtable hashtable = new Hashtable();
        hashtable.put(EventKeys.VALUE_KEY, charSequence.toString());
        this.f15137R4.A(hashtable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
