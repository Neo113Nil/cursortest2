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
import java.util.Hashtable;
import java.util.List;
import l.AbstractC5335a;
import od.AbstractC5886l;
import rd.C6218a;
import zf.C6963d;

/* renamed from: ag.w0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1999w0 extends H implements TextWatcher {

    /* renamed from: Q4, reason: collision with root package name */
    public cg.f f15872Q4;

    /* renamed from: R4, reason: collision with root package name */
    public C6963d f15873R4;

    /* renamed from: S4, reason: collision with root package name */
    public ConstraintLayout f15874S4;

    /* renamed from: T4, reason: collision with root package name */
    public ImageView f15875T4;

    /* renamed from: U4, reason: collision with root package name */
    public EditText f15876U4;

    /* renamed from: V4, reason: collision with root package name */
    public LinearLayout f15877V4;

    /* renamed from: W4, reason: collision with root package name */
    public RelativeLayout f15878W4;

    /* renamed from: X4, reason: collision with root package name */
    public TextView f15879X4;

    /* renamed from: Y4, reason: collision with root package name */
    public TextView f15880Y4;

    /* renamed from: ag.w0$a */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Message f15881a;

        public a(Message message) {
            this.f15881a = message;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1999w0.this.o0().M(this.f15881a);
        }
    }

    /* renamed from: ag.w0$b */
    public class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Message f15883a;

        public b(Message message) {
            this.f15883a = message;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Hashtable s10 = C1999w0.this.f15873R4.s();
            String str = s10 != null ? (String) s10.get(EventKeys.VALUE_KEY) : null;
            if (str == null || str.trim().length() <= 0 || !Patterns.EMAIL_ADDRESS.matcher(str.trim()).matches()) {
                C1999w0.this.d2(true, this.f15883a.getMeta());
            } else if (C1999w0.this.f15872Q4.P(str.trim(), Message.g.WidgetInputEmail, str.trim(), null)) {
                C1999w0.this.f15873R4.A(null);
            }
        }
    }

    public C1999w0(View view, ConstraintLayout constraintLayout, cg.f fVar, C6963d c6963d, cg.e eVar) {
        super(view, eVar);
        super.K1(constraintLayout);
        this.f15872Q4 = fVar;
        this.f15873R4 = c6963d;
        this.f15874S4 = (ConstraintLayout) view.findViewById(od.q.f60630q3);
        this.f15875T4 = (ImageView) view.findViewById(od.q.f60517f2);
        EditText editText = (EditText) view.findViewById(od.q.f60599n2);
        this.f15876U4 = editText;
        editText.setBackground(com.zoho.livechat.android.utils.P.d(0, com.zoho.livechat.android.utils.P.e(editText.getContext(), AbstractC5886l.f59721H), C6218a.b(4.0f), 0, 0));
        this.f15876U4.setTypeface(C6218a.P());
        e1(this.f15876U4);
        this.f15877V4 = (LinearLayout) view.findViewById(od.q.f60609o2);
        this.f15878W4 = (RelativeLayout) view.findViewById(od.q.f60202A2);
        TextView textView = (TextView) view.findViewById(od.q.f60619p2);
        this.f15879X4 = textView;
        textView.setTypeface(C6218a.P());
        TextView textView2 = (TextView) view.findViewById(od.q.f60662t5);
        this.f15880Y4 = textView2;
        textView2.setTypeface(C6218a.P());
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, Message message) {
        boolean z10;
        super.F1(salesIQChat, message);
        R(this.f15874S4, AbstractC5886l.f59766S0);
        C6963d.y(O0(), message.getContent(), message, w1(), !message.isLastMessage());
        boolean z11 = false;
        if (message.getMeta() == null || message.getMeta().getDisplayCard() == null || message.getMeta().getDisplayCard().getImage() == null) {
            this.f15875T4.setVisibility(8);
            z10 = true;
        } else {
            this.f15875T4.setVisibility(0);
            wd.d.F(this.f15875T4, message.getMeta().getDisplayCard().getImage(), Float.valueOf(12.0f));
            z10 = false;
        }
        this.f15875T4.setOnClickListener(new a(message));
        if (!message.isLastMessage() || salesIQChat == null || (!(salesIQChat.getStatus() == 2 || salesIQChat.getStatus() == 6 || salesIQChat.getStatus() == 5) || message.getMeta() == null || message.getMeta().getInputCard() == null)) {
            this.f15877V4.setVisibility(8);
            z11 = z10;
        } else {
            this.f15877V4.setVisibility(0);
            this.f15876U4.setHint(message.getMeta().getInputCard().getPlaceholder());
            Hashtable s10 = this.f15873R4.s();
            String str = s10 != null ? (String) s10.get(EventKeys.VALUE_KEY) : null;
            if (str != null && !str.isEmpty()) {
                this.f15876U4.setText(str);
                EditText editText = this.f15876U4;
                editText.setSelection(editText.getText().toString().length());
            } else if (message.getMeta().getInputCard().getValue() != null) {
                Hashtable hashtable = new Hashtable();
                hashtable.put(EventKeys.VALUE_KEY, message.getMeta().getInputCard().getValue());
                this.f15873R4.A(hashtable);
                this.f15876U4.setText(message.getMeta().getInputCard().getValue());
                EditText editText2 = this.f15876U4;
                editText2.setSelection(editText2.getText().toString().length());
            } else {
                this.f15876U4.setText((CharSequence) null);
            }
            String trim = this.f15876U4.getText().toString().trim();
            d2(trim.length() > 0 && !Patterns.EMAIL_ADDRESS.matcher(trim).matches(), message.getMeta());
            V1(this.f15876U4);
            Q(this.f15878W4, C6218a.b(3.0f), AbstractC5335a.f55002q);
            this.f15878W4.setOnClickListener(new b(message));
        }
        T1(message, z11, this.f15880Y4);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.f15879X4.setVisibility(8);
    }

    public void b2() {
        this.f15876U4.removeTextChangedListener(this);
    }

    public void c2() {
        this.f15876U4.addTextChangedListener(this);
    }

    public final void d2(boolean z10, Message.Meta meta) {
        if (!z10) {
            this.f15879X4.setVisibility(8);
            return;
        }
        this.f15879X4.setVisibility(0);
        if (meta.getInputCard() != null) {
            List<String> error = meta.getInputCard().getError();
            if (error == null || error.size() <= 0) {
                this.f15879X4.setText(od.t.f61062l1);
            } else {
                this.f15879X4.setText(error.get(0));
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        Hashtable hashtable = new Hashtable();
        hashtable.put(EventKeys.VALUE_KEY, charSequence.toString());
        this.f15873R4.A(hashtable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
