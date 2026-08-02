package ag;

import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.AbstractC3939h;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Pattern;
import l.AbstractC5335a;
import m.AbstractActivityC5481c;
import od.AbstractC5886l;
import rd.C6218a;
import zf.C6963d;

/* renamed from: ag.z0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2005z0 extends H implements TextWatcher {

    /* renamed from: Q4, reason: collision with root package name */
    public cg.f f15920Q4;

    /* renamed from: R4, reason: collision with root package name */
    public C6963d f15921R4;

    /* renamed from: S4, reason: collision with root package name */
    public ImageView f15922S4;

    /* renamed from: T4, reason: collision with root package name */
    public LinearLayout f15923T4;

    /* renamed from: U4, reason: collision with root package name */
    public TextView f15924U4;

    /* renamed from: V4, reason: collision with root package name */
    public ImageView f15925V4;

    /* renamed from: W4, reason: collision with root package name */
    public EditText f15926W4;

    /* renamed from: X4, reason: collision with root package name */
    public LinearLayout f15927X4;

    /* renamed from: Y4, reason: collision with root package name */
    public RelativeLayout f15928Y4;

    /* renamed from: Z4, reason: collision with root package name */
    public TextView f15929Z4;

    /* renamed from: a5, reason: collision with root package name */
    public TextView f15930a5;

    /* renamed from: ag.z0$a */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Message f15931a;

        public a(Message message) {
            this.f15931a = message;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2005z0.this.o0().M(this.f15931a);
        }
    }

    /* renamed from: ag.z0$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2005z0.this.f15926W4.requestFocus();
            LiveChatUtil.showKeyboard(C2005z0.this.f15926W4);
        }
    }

    /* renamed from: ag.z0$c */
    public class c implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Message f15934a;

        public c(Message message) {
            this.f15934a = message;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            String str2;
            Hashtable s10 = C2005z0.this.f15921R4.s();
            if (s10 != null) {
                str2 = (String) s10.get(EventKeys.VALUE_KEY);
                str = (String) s10.get("ccode");
            } else {
                str = null;
                str2 = null;
            }
            if (str2 != null && str2.trim().length() > 0 && str != null) {
                if (Pattern.compile("((?:\\+?\\d{1,3}[-. ]*)?(?:[(]?\\d{3}[-. )]*\\d{3}[-. ]*\\d{4,5}(?: *x\\d+)?|\\d{8,11}))").matcher(str.trim() + str2.trim()).matches()) {
                    String str3 = str.trim() + " " + str2.trim();
                    if (C2005z0.this.f15920Q4.P(str3, Message.g.WidgetInputTelephone, str3, null)) {
                        C2005z0.this.f15921R4.A(null);
                        return;
                    }
                    return;
                }
            }
            C2005z0.this.g2(true, this.f15934a.getMeta());
        }
    }

    /* renamed from: ag.z0$e */
    public class e extends RecyclerView.h {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f15942a;

        /* renamed from: b, reason: collision with root package name */
        public f f15943b;

        /* renamed from: ag.z0$e$a */
        public class a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.zoho.livechat.android.models.b f15945a;

            public a(com.zoho.livechat.android.models.b bVar) {
                this.f15945a = bVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e.this.f15943b.a(this.f15945a);
            }
        }

        /* renamed from: ag.z0$e$b */
        public class b extends RecyclerView.F {

            /* renamed from: a, reason: collision with root package name */
            public LinearLayout f15947a;

            /* renamed from: b, reason: collision with root package name */
            public TextView f15948b;

            public b(View view) {
                super(view);
                this.f15947a = (LinearLayout) view.findViewById(od.q.f60530g4);
                TextView textView = (TextView) view.findViewById(od.q.f60519f4);
                this.f15948b = textView;
                textView.setTypeface(C6218a.P());
                TextView textView2 = this.f15948b;
                textView2.setTextColor(com.zoho.livechat.android.utils.P.e(textView2.getContext(), AbstractC5886l.f59825f2));
            }
        }

        public e(ArrayList arrayList, f fVar) {
            this.f15942a = arrayList;
            this.f15943b = fVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(b bVar, int i10) {
            com.zoho.livechat.android.models.b bVar2 = (com.zoho.livechat.android.models.b) this.f15942a.get(i10);
            bVar.f15948b.setText(bVar2.c() + " (" + bVar2.b() + ")");
            bVar.f15947a.setOnClickListener(new a(bVar2));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(od.r.f60754O, viewGroup, false));
        }

        public void e(ArrayList arrayList) {
            this.f15942a = arrayList;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            ArrayList arrayList = this.f15942a;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
    }

    /* renamed from: ag.z0$f */
    public interface f {
        void a(com.zoho.livechat.android.models.b bVar);
    }

    public C2005z0(View view, ConstraintLayout constraintLayout, cg.f fVar, C6963d c6963d, cg.e eVar) {
        super(view, eVar);
        super.K1(constraintLayout);
        this.f15920Q4 = fVar;
        this.f15921R4 = c6963d;
        this.f15922S4 = (ImageView) view.findViewById(od.q.f60517f2);
        this.f15923T4 = (LinearLayout) view.findViewById(od.q.f60569k2);
        TextView textView = (TextView) view.findViewById(od.q.f60589m2);
        this.f15924U4 = textView;
        textView.setTypeface(C6218a.P());
        this.f15925V4 = (ImageView) view.findViewById(od.q.f60579l2);
        EditText editText = (EditText) view.findViewById(od.q.f60709y2);
        this.f15926W4 = editText;
        editText.setBackground(com.zoho.livechat.android.utils.P.d(0, com.zoho.livechat.android.utils.P.e(editText.getContext(), AbstractC5886l.f59721H), C6218a.b(4.0f), 0, 0));
        this.f15926W4.setTypeface(C6218a.P());
        e1(this.f15926W4);
        this.f15927X4 = (LinearLayout) view.findViewById(od.q.f60719z2);
        this.f15928Y4 = (RelativeLayout) view.findViewById(od.q.f60202A2);
        TextView textView2 = (TextView) view.findViewById(od.q.f60619p2);
        this.f15929Z4 = textView2;
        textView2.setTypeface(C6218a.P());
        TextView textView3 = (TextView) view.findViewById(od.q.f60702x5);
        this.f15930a5 = textView3;
        textView3.setTypeface(C6218a.P());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g2(boolean z10, Message.Meta meta) {
        if (!z10) {
            this.f15929Z4.setVisibility(8);
            return;
        }
        this.f15929Z4.setVisibility(0);
        if (meta.getInputCard() != null) {
            List<String> error = meta.getInputCard().getError();
            if (error == null || error.size() <= 0) {
                this.f15929Z4.setText(od.t.f61090p1);
            } else {
                this.f15929Z4.setText(String.valueOf(error.get(0)));
            }
        }
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, Message message) {
        boolean z10;
        String str;
        String str2;
        String f22;
        super.F1(salesIQChat, message);
        C6963d.y(O0(), message.getContent(), message, w1(), !message.isLastMessage());
        ImageView imageView = this.f15925V4;
        imageView.setColorFilter(com.zoho.livechat.android.utils.P.e(imageView.getContext(), AbstractC5886l.f59775U1));
        boolean z11 = false;
        if (message.getMeta() == null || message.getMeta().getDisplayCard() == null || message.getMeta().getDisplayCard().getImage() == null) {
            this.f15922S4.setVisibility(8);
            z10 = true;
        } else {
            this.f15922S4.setVisibility(0);
            wd.d.F(this.f15922S4, message.getMeta().getDisplayCard().getImage(), Float.valueOf(10.0f));
            z10 = false;
        }
        this.f15922S4.setOnClickListener(new a(message));
        if (!message.isLastMessage() || salesIQChat == null || (!(salesIQChat.getStatus() == 2 || salesIQChat.getStatus() == 6 || salesIQChat.getStatus() == 5) || message.getMeta() == null || message.getMeta().getInputCard() == null)) {
            this.f15927X4.setVisibility(8);
            z11 = z10;
        } else {
            this.f15927X4.setVisibility(0);
            this.f15926W4.setHint(message.getMeta().getInputCard().getPlaceholder());
            Hashtable s10 = this.f15921R4.s();
            if (s10 != null) {
                str2 = (String) s10.get(EventKeys.VALUE_KEY);
                str = (String) s10.get("ccode");
            } else {
                str = null;
                str2 = null;
            }
            ArrayList a10 = AbstractC3939h.a();
            if (str2 != null && str2.length() > 0) {
                this.f15926W4.setText(str2);
                EditText editText = this.f15926W4;
                editText.setSelection(editText.getText().toString().length());
                this.f15924U4.setText(str);
            } else if (message.getMeta() == null || message.getMeta().getInputCard() == null || (message.getMeta().getInputCard().getValue() == null && message.getMeta().getInputCard().getCountryCode() == null)) {
                this.f15926W4.setText((CharSequence) null);
                this.f15924U4.setText(f2());
            } else {
                Hashtable hashtable = new Hashtable();
                String value = message.getMeta().getInputCard().getValue();
                if (value != null) {
                    if (value.contains(message.getMeta().getInputCard().getCountryCode())) {
                        value = value.replace(message.getMeta().getInputCard().getCountryCode(), "");
                    }
                    hashtable.put(EventKeys.VALUE_KEY, value);
                }
                if (message.getMeta().getInputCard().getCountryCode() != null) {
                    hashtable.put("ccode", message.getMeta().getInputCard().getCountryCode());
                    f22 = message.getMeta().getInputCard().getCountryCode();
                } else {
                    f22 = f2();
                }
                this.f15921R4.A(hashtable);
                this.f15926W4.setText(value);
                EditText editText2 = this.f15926W4;
                editText2.setSelection(editText2.getText().toString().length());
                this.f15924U4.setText(f22);
            }
            this.f15926W4.post(new b());
            String trim = this.f15926W4.getText().toString().trim();
            g2(trim.length() > 0 && !Pattern.compile("((?:\\+?\\d{1,3}[-. ]*)?(?:[(]?\\d{3}[-. )]*\\d{3}[-. ]*\\d{4,5}(?: *x\\d+)?|\\d{8,11}))").matcher(trim).matches(), message.getMeta());
            V1(this.f15926W4);
            Q(this.f15928Y4, C6218a.b(3.0f), AbstractC5335a.f55002q);
            Q(this.f15926W4, C6218a.b(3.0f), AbstractC5886l.f59721H);
            Q(this.f15923T4, C6218a.b(3.0f), AbstractC5886l.f59721H);
            this.f15928Y4.setOnClickListener(new c(message));
            this.f15923T4.setOnClickListener(new d(a10));
        }
        T1(message, z11, this.f15930a5);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.f15929Z4.setVisibility(8);
    }

    public void d2() {
        this.f15926W4.removeTextChangedListener(this);
    }

    public void e2() {
        this.f15926W4.addTextChangedListener(this);
    }

    public final String f2() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.f15926W4.getContext().getSystemService("phone");
            r0 = telephonyManager != null ? telephonyManager.getNetworkCountryIso() : null;
            if (r0 == null) {
                r0 = this.f15926W4.getContext().getResources().getConfiguration().locale.getCountry();
            }
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
        return AbstractC3939h.c(r0);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        Hashtable s10 = this.f15921R4.s();
        if (s10 == null) {
            s10 = new Hashtable();
        }
        s10.put(EventKeys.VALUE_KEY, charSequence.toString());
        s10.put("ccode", this.f15924U4.getText().toString());
        this.f15921R4.A(s10);
    }

    /* renamed from: ag.z0$d */
    public class d implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15936a;

        /* renamed from: ag.z0$d$a */
        public class a implements f {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ androidx.appcompat.app.a f15938a;

            public a(androidx.appcompat.app.a aVar) {
                this.f15938a = aVar;
            }

            @Override // ag.C2005z0.f
            public void a(com.zoho.livechat.android.models.b bVar) {
                C2005z0.this.f15924U4.setText(bVar.b());
                Hashtable s10 = C2005z0.this.f15921R4.s();
                if (s10 == null) {
                    s10 = new Hashtable();
                }
                s10.put("ccode", bVar.b());
                C2005z0.this.f15921R4.A(s10);
                this.f15938a.dismiss();
            }
        }

        public d(ArrayList arrayList) {
            this.f15936a = arrayList;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.C0340a m10 = qe.d.m((AbstractActivityC5481c) view.getContext());
            View inflate = ((AbstractActivityC5481c) view.getContext()).getLayoutInflater().inflate(od.r.f60810t, (ViewGroup) null);
            m10.setView(inflate);
            EditText editText = (EditText) inflate.findViewById(od.q.f60699x2);
            editText.setTypeface(C6218a.P());
            editText.requestFocus();
            C2005z0.this.e1(editText);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(od.q.f60689w2);
            androidx.appcompat.app.a create = m10.create();
            e eVar = C2005z0.this.new e(this.f15936a, new a(create));
            recyclerView.setAdapter(eVar);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
            editText.addTextChangedListener(new b(eVar));
            WindowManager.LayoutParams attributes = create.getWindow().getAttributes();
            attributes.gravity = 48;
            create.getWindow().setAttributes(attributes);
            create.show();
            ((InputMethodManager) C2005z0.this.f15924U4.getContext().getSystemService("input_method")).toggleSoftInput(2, 0);
        }

        /* renamed from: ag.z0$d$b */
        public class b implements TextWatcher {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e f15940a;

            public b(e eVar) {
                this.f15940a = eVar;
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                if (charSequence.toString().trim().length() > 0) {
                    this.f15940a.e(AbstractC3939h.b(charSequence.toString().trim()));
                } else {
                    this.f15940a.e(AbstractC3939h.a());
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
