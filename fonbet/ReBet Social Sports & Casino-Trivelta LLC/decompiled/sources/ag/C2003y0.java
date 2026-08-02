package ag;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
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
import l.AbstractC5335a;
import od.AbstractC5886l;
import rd.C6218a;
import zf.C6963d;

/* renamed from: ag.y0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2003y0 extends H implements TextWatcher {

    /* renamed from: Q4, reason: collision with root package name */
    public cg.f f15901Q4;

    /* renamed from: R4, reason: collision with root package name */
    public C6963d f15902R4;

    /* renamed from: S4, reason: collision with root package name */
    public ImageView f15903S4;

    /* renamed from: T4, reason: collision with root package name */
    public ImageView f15904T4;

    /* renamed from: U4, reason: collision with root package name */
    public EditText f15905U4;

    /* renamed from: V4, reason: collision with root package name */
    public LinearLayout f15906V4;

    /* renamed from: W4, reason: collision with root package name */
    public LinearLayout f15907W4;

    /* renamed from: X4, reason: collision with root package name */
    public TextView f15908X4;

    /* renamed from: Y4, reason: collision with root package name */
    public TextView f15909Y4;

    /* renamed from: Z4, reason: collision with root package name */
    public RelativeLayout f15910Z4;

    /* renamed from: a5, reason: collision with root package name */
    public TextView f15911a5;

    /* renamed from: b5, reason: collision with root package name */
    public ConstraintLayout f15912b5;

    /* renamed from: ag.y0$a */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Message f15913a;

        public a(Message message) {
            this.f15913a = message;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2003y0.this.o0().M(this.f15913a);
        }
    }

    /* renamed from: ag.y0$b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C2003y0.this.f15905U4.getTransformationMethod() == null) {
                C2003y0.this.f15905U4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                C2003y0.this.f15905U4.setSelection(C2003y0.this.f15905U4.getText().length());
                C2003y0.this.f15904T4.setImageDrawable(C2003y0.this.f15904T4.getContext().getResources().getDrawable(od.p.f59967E3));
                C2003y0.this.f15904T4.setColorFilter(com.zoho.livechat.android.utils.P.e(C2003y0.this.f15904T4.getContext(), AbstractC5886l.f59824f1), PorterDuff.Mode.SRC_ATOP);
                return;
            }
            C2003y0.this.f15905U4.setTransformationMethod(null);
            C2003y0.this.f15905U4.setSelection(C2003y0.this.f15905U4.getText().length());
            C2003y0.this.f15904T4.setImageDrawable(C2003y0.this.f15904T4.getContext().getResources().getDrawable(od.p.f59972F3));
            C2003y0.this.f15904T4.setColorFilter(com.zoho.livechat.android.utils.P.e(C2003y0.this.f15904T4.getContext(), AbstractC5886l.f59824f1), PorterDuff.Mode.SRC_ATOP);
        }
    }

    /* renamed from: ag.y0$c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C2003y0.this.f15905U4 == null || C2003y0.this.f15905U4.getText() == null || C2003y0.this.f15905U4.getText().length() <= 0) {
                C2003y0.this.f15909Y4.setVisibility(0);
                C2003y0.this.f15909Y4.setText(od.t.f60949U1);
            } else if (C2003y0.this.f15901Q4.P("********", Message.g.WidgetInputName, C2003y0.this.f15905U4.getText().toString(), null)) {
                C2003y0.this.f15902R4.A(null);
            }
        }
    }

    public C2003y0(View view, ConstraintLayout constraintLayout, cg.f fVar, C6963d c6963d, cg.e eVar) {
        super(view, eVar);
        super.K1(constraintLayout);
        this.f15901Q4 = fVar;
        this.f15902R4 = c6963d;
        this.f15912b5 = (ConstraintLayout) view.findViewById(od.q.f60640r3);
        this.f15903S4 = (ImageView) view.findViewById(od.q.f60517f2);
        this.f15906V4 = (LinearLayout) view.findViewById(od.q.f60659t2);
        EditText editText = (EditText) view.findViewById(od.q.f60649s2);
        this.f15905U4 = editText;
        editText.setBackground(com.zoho.livechat.android.utils.P.d(0, com.zoho.livechat.android.utils.P.e(editText.getContext(), AbstractC5886l.f59721H), C6218a.b(4.0f), 0, 0));
        this.f15905U4.setTypeface(C6218a.P());
        e1(this.f15905U4);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(od.q.f60371R1);
        this.f15907W4 = linearLayout;
        Drawable background = linearLayout.getBackground();
        int e10 = com.zoho.livechat.android.utils.P.e(this.f15907W4.getContext(), AbstractC5886l.f59721H);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        background.setColorFilter(e10, mode);
        TextView textView = (TextView) view.findViewById(od.q.f60391T1);
        this.f15908X4 = textView;
        textView.setTextColor(com.zoho.livechat.android.utils.P.e(this.f15907W4.getContext(), AbstractC5335a.f55002q));
        this.f15908X4.setTypeface(C6218a.C());
        this.f15910Z4 = (RelativeLayout) view.findViewById(od.q.f60679v2);
        ImageView imageView = (ImageView) view.findViewById(od.q.f60669u2);
        this.f15904T4 = imageView;
        imageView.setColorFilter(com.zoho.livechat.android.utils.P.e(imageView.getContext(), AbstractC5886l.f59824f1), mode);
        TextView textView2 = (TextView) view.findViewById(od.q.f60619p2);
        this.f15909Y4 = textView2;
        textView2.setTypeface(C6218a.P());
        TextView textView3 = (TextView) view.findViewById(od.q.f60692w5);
        this.f15911a5 = textView3;
        textView3.setTypeface(C6218a.P());
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, Message message) {
        super.F1(salesIQChat, message);
        R(this.f15912b5, AbstractC5886l.f59766S0);
        boolean z10 = true;
        C6963d.y(O0(), message.getContent(), message, w1(), !message.isLastMessage());
        boolean z11 = false;
        if (message.getMeta() == null || message.getMeta().getDisplayCard() == null || message.getMeta().getDisplayCard().getImage() == null) {
            this.f15903S4.setVisibility(8);
        } else {
            this.f15903S4.setVisibility(0);
            wd.d.F(this.f15903S4, message.getMeta().getDisplayCard().getImage(), Float.valueOf(10.0f));
            z10 = false;
        }
        this.f15903S4.setOnClickListener(new a(message));
        if (!message.isLastMessage() || salesIQChat == null || (!(salesIQChat.getStatus() == 2 || salesIQChat.getStatus() == 6 || salesIQChat.getStatus() == 5) || message.getMeta() == null || message.getMeta().getInputCard() == null)) {
            this.f15906V4.setVisibility(8);
            this.f15907W4.setVisibility(8);
            z11 = z10;
        } else {
            this.f15906V4.setVisibility(0);
            this.f15905U4.setHint(message.getMeta().getInputCard().getPlaceholder());
            this.f15907W4.setVisibility(0);
            this.f15909Y4.setVisibility(8);
            Hashtable s10 = this.f15902R4.s();
            String str = s10 != null ? (String) s10.get(EventKeys.VALUE_KEY) : null;
            if (str == null || str.length() <= 0) {
                this.f15905U4.setText((CharSequence) null);
            } else {
                this.f15905U4.setText(str);
                EditText editText = this.f15905U4;
                editText.setSelection(editText.getText().toString().length());
            }
            this.f15910Z4.setOnClickListener(new b());
            this.f15907W4.setOnClickListener(new c());
            V1(this.f15905U4);
        }
        T1(message, z11, this.f15911a5);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.f15909Y4.setVisibility(8);
    }

    public void d2() {
        this.f15905U4.removeTextChangedListener(this);
    }

    public void e2() {
        this.f15905U4.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        Hashtable hashtable = new Hashtable();
        hashtable.put(EventKeys.VALUE_KEY, charSequence.toString());
        this.f15902R4.A(hashtable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
