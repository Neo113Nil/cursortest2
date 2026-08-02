package ag;

import android.text.Editable;
import android.text.TextWatcher;
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

/* renamed from: ag.x0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2001x0 extends H implements TextWatcher {

    /* renamed from: Q4, reason: collision with root package name */
    public cg.f f15886Q4;

    /* renamed from: R4, reason: collision with root package name */
    public C6963d f15887R4;

    /* renamed from: S4, reason: collision with root package name */
    public ImageView f15888S4;

    /* renamed from: T4, reason: collision with root package name */
    public EditText f15889T4;

    /* renamed from: U4, reason: collision with root package name */
    public LinearLayout f15890U4;

    /* renamed from: V4, reason: collision with root package name */
    public RelativeLayout f15891V4;

    /* renamed from: W4, reason: collision with root package name */
    public ImageView f15892W4;

    /* renamed from: X4, reason: collision with root package name */
    public TextView f15893X4;

    /* renamed from: Y4, reason: collision with root package name */
    public TextView f15894Y4;

    /* renamed from: ag.x0$a */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Message f15895a;

        public a(Message message) {
            this.f15895a = message;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2001x0.this.o0().M(this.f15895a);
        }
    }

    /* renamed from: ag.x0$b */
    public class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Message f15897a;

        public b(Message message) {
            this.f15897a = message;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Hashtable s10 = C2001x0.this.f15887R4.s();
            String str = s10 != null ? (String) s10.get(EventKeys.VALUE_KEY) : null;
            if (str != null && str.trim().length() > 0) {
                C2001x0.this.f15886Q4.P(str.trim(), Message.g.WidgetInputName, str.trim(), null);
                C2001x0.this.f15887R4.A(null);
                return;
            }
            C2001x0.this.f15893X4.setVisibility(0);
            List<String> error = this.f15897a.getMeta().getInputCard().getError();
            if (error == null || error.size() <= 0) {
                C2001x0.this.f15893X4.setText(od.t.f61076n1);
            } else {
                C2001x0.this.f15893X4.setText(String.valueOf(error.get(0)));
            }
        }
    }

    public C2001x0(View view, ConstraintLayout constraintLayout, cg.f fVar, C6963d c6963d, cg.e eVar) {
        super(view, eVar);
        super.K1(constraintLayout);
        this.f15886Q4 = fVar;
        this.f15887R4 = c6963d;
        this.f15888S4 = (ImageView) view.findViewById(od.q.f60517f2);
        EditText editText = (EditText) view.findViewById(od.q.f60629q2);
        this.f15889T4 = editText;
        editText.setBackground(com.zoho.livechat.android.utils.P.d(0, com.zoho.livechat.android.utils.P.e(editText.getContext(), AbstractC5886l.f59721H), C6218a.b(4.0f), 0, 0));
        this.f15889T4.setTypeface(C6218a.P());
        e1(this.f15889T4);
        this.f15890U4 = (LinearLayout) view.findViewById(od.q.f60639r2);
        this.f15891V4 = (RelativeLayout) view.findViewById(od.q.f60202A2);
        ImageView imageView = (ImageView) view.findViewById(od.q.f60212B2);
        this.f15892W4 = imageView;
        imageView.setColorFilter(com.zoho.livechat.android.utils.P.e(imageView.getContext(), AbstractC5886l.f59778V0));
        TextView textView = (TextView) view.findViewById(od.q.f60619p2);
        this.f15893X4 = textView;
        textView.setTypeface(C6218a.P());
        TextView textView2 = (TextView) view.findViewById(od.q.f60682v5);
        this.f15894Y4 = textView2;
        textView2.setTypeface(C6218a.P());
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, Message message) {
        super.F1(salesIQChat, message);
        boolean z10 = true;
        C6963d.y(O0(), message.getContent(), message, w1(), !message.isLastMessage());
        boolean z11 = false;
        if (message.getMeta() == null || message.getMeta().getDisplayCard() == null || message.getMeta().getDisplayCard().getImage() == null) {
            this.f15888S4.setVisibility(8);
        } else {
            this.f15888S4.setVisibility(0);
            wd.d.F(this.f15888S4, message.getMeta().getDisplayCard().getImage(), Float.valueOf(10.0f));
            z10 = false;
        }
        this.f15888S4.setOnClickListener(new a(message));
        if (!message.isLastMessage() || salesIQChat == null || (!(salesIQChat.getStatus() == 2 || salesIQChat.getStatus() == 6 || salesIQChat.getStatus() == 5) || message.getMeta() == null || message.getMeta().getInputCard() == null)) {
            this.f15890U4.setVisibility(8);
            z11 = z10;
        } else {
            this.f15890U4.setVisibility(0);
            this.f15889T4.setHint(message.getMeta().getInputCard().getPlaceholder());
            this.f15893X4.setVisibility(8);
            Hashtable s10 = this.f15887R4.s();
            String str = s10 != null ? (String) s10.get(EventKeys.VALUE_KEY) : null;
            if (str != null && str.length() > 0) {
                this.f15889T4.setText(str);
                EditText editText = this.f15889T4;
                editText.setSelection(editText.getText().toString().length());
            } else if (message.getMeta().getInputCard().getValue() != null) {
                Hashtable hashtable = new Hashtable();
                hashtable.put(EventKeys.VALUE_KEY, message.getMeta().getInputCard().getValue());
                this.f15887R4.A(hashtable);
                this.f15889T4.setText(message.getMeta().getInputCard().getValue());
                EditText editText2 = this.f15889T4;
                editText2.setSelection(editText2.getText().toString().length());
            } else {
                this.f15889T4.setText((CharSequence) null);
            }
            V1(this.f15889T4);
            Q(this.f15891V4, C6218a.b(3.0f), AbstractC5335a.f55002q);
            this.f15891V4.setOnClickListener(new b(message));
        }
        T1(message, z11, this.f15894Y4);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.f15893X4.setVisibility(8);
    }

    public void b2() {
        this.f15889T4.removeTextChangedListener(this);
    }

    public void c2() {
        this.f15889T4.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        Hashtable hashtable = new Hashtable();
        hashtable.put(EventKeys.VALUE_KEY, charSequence.toString());
        this.f15887R4.A(hashtable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
