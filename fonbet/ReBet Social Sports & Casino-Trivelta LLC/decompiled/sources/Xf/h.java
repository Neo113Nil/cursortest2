package Xf;

import a1.C1908a;
import android.R;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.AbstractC2082d0;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.P;
import java.util.Arrays;
import l.AbstractC5335a;
import od.AbstractC5886l;
import od.n;
import od.q;
import od.t;
import og.AbstractC5895g;
import og.p;
import rd.C6218a;
import zf.C6966g;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public Context f13791a;

    /* renamed from: b, reason: collision with root package name */
    public LinearLayout f13792b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f13793c;

    /* renamed from: d, reason: collision with root package name */
    public LinearLayout f13794d;

    /* renamed from: e, reason: collision with root package name */
    public RelativeLayout f13795e;

    /* renamed from: f, reason: collision with root package name */
    public RelativeLayout f13796f;

    /* renamed from: g, reason: collision with root package name */
    public RelativeLayout f13797g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f13798h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView f13799i;

    /* renamed from: j, reason: collision with root package name */
    public ImageView f13800j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f13801k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f13802l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f13803m;

    /* renamed from: n, reason: collision with root package name */
    public EditText f13804n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f13805o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f13806p;

    /* renamed from: q, reason: collision with root package name */
    public int f13807q = 0;

    /* renamed from: r, reason: collision with root package name */
    public SalesIQChat f13808r;

    /* renamed from: s, reason: collision with root package name */
    public Dialog f13809s;

    /* renamed from: t, reason: collision with root package name */
    public int f13810t;

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!C6218a.c0()) {
                h.s(h.this.f13804n.getContext(), h.this.f13804n.getContext().getString(t.f61107s));
                return;
            }
            LiveChatUtil.hideKeyboard(h.this.f13804n);
            String trim = h.this.f13804n.getText().toString().trim();
            if (trim.length() > 0) {
                h.s(h.this.f13804n.getContext(), LiveChatUtil.getFeedbackResponse(h.this.f13808r, h.this.f13794d.getContext()));
            }
            h.this.l(trim);
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) h.this.f13800j.getLayoutParams();
            layoutParams.height = intValue;
            layoutParams.width = intValue;
            h.this.f13800j.setLayoutParams(layoutParams);
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) h.this.f13799i.getLayoutParams();
            layoutParams.height = intValue;
            layoutParams.width = intValue;
            h.this.f13799i.setLayoutParams(layoutParams);
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) h.this.f13798h.getLayoutParams();
            layoutParams.height = intValue;
            layoutParams.width = intValue;
            h.this.f13798h.setLayoutParams(layoutParams);
        }
    }

    public h(Context context, View view, int i10) {
        this.f13791a = context;
        this.f13810t = i10;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(q.f60203A3);
        this.f13792b = linearLayout;
        AbstractC2082d0.p0(linearLayout, n(context));
        TextView textView = (TextView) view.findViewById(q.f60720z3);
        this.f13793c = textView;
        textView.setTypeface(C6218a.P());
        this.f13793c.setTextColor(P.e(context, AbstractC5886l.f59863n0));
        this.f13794d = (LinearLayout) view.findViewById(q.f60406U6);
        this.f13795e = (RelativeLayout) view.findViewById(q.f60356P6);
        this.f13796f = (RelativeLayout) view.findViewById(q.f60386S6);
        if ("true".equalsIgnoreCase(System.getProperty("binaryRating"))) {
            this.f13796f.setVisibility(8);
        } else {
            this.f13796f.setVisibility(0);
        }
        this.f13797g = (RelativeLayout) view.findViewById(q.f60426W6);
        this.f13798h = (ImageView) view.findViewById(q.f60346O6);
        TextView textView2 = (TextView) view.findViewById(q.f60366Q6);
        this.f13801k = textView2;
        textView2.setTextColor(P.e(context, AbstractC5886l.f59864n1));
        this.f13799i = (ImageView) view.findViewById(q.f60376R6);
        TextView textView3 = (TextView) view.findViewById(q.f60396T6);
        this.f13802l = textView3;
        textView3.setTextColor(P.e(context, AbstractC5886l.f59864n1));
        this.f13800j = (ImageView) view.findViewById(q.f60416V6);
        TextView textView4 = (TextView) view.findViewById(q.f60436X6);
        this.f13803m = textView4;
        textView4.setTextColor(P.e(context, AbstractC5886l.f59864n1));
        EditText editText = (EditText) view.findViewById(q.f60710y3);
        this.f13804n = editText;
        editText.setTypeface(C6218a.P());
        this.f13804n.setTextColor(P.e(context, AbstractC5886l.f59853l0));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C6218a.b(4.0f));
        gradientDrawable.setStroke(C6218a.b(1.0f), P.e(context, AbstractC5886l.f59848k0));
        gradientDrawable.setColor(P.e(context, AbstractC5886l.f59838i0));
        AbstractC2082d0.p0(this.f13804n, gradientDrawable);
        TextView textView5 = (TextView) view.findViewById(q.f60223C3);
        this.f13805o = textView5;
        textView5.setTypeface(C6218a.C());
        TextView textView6 = (TextView) view.findViewById(q.f60303K3);
        this.f13806p = textView6;
        textView6.setTypeface(C6218a.C());
        this.f13806p.setTextColor(P.e(context, AbstractC5886l.f59859m1));
        float[] fArr = new float[8];
        Arrays.fill(fArr, C6218a.b(4.0f));
        p.u(this.f13805o, P.e(context, AbstractC5886l.f59858m0), fArr, null, true, androidx.core.content.res.k.d(context.getResources(), n.f59924d, context.getTheme()));
        p.u(this.f13806p, R.color.transparent, fArr, null, true, P.b(context, 8.0f, AbstractC5335a.f55002q));
    }

    public static /* synthetic */ void a(h hVar, View view) {
        hVar.r(3);
        hVar.o();
    }

    public static /* synthetic */ void b(h hVar, View view) {
        hVar.r(1);
        hVar.o();
    }

    public static /* synthetic */ void c(h hVar, SalesIQChat salesIQChat, Dialog dialog, View view) {
        hVar.getClass();
        if (!m()) {
            LiveChatUtil.hideKeyboard(hVar.f13804n);
            C6966g.v(salesIQChat.getChid(), Message.g.Feedback);
        } else if (hVar.k()) {
            LiveChatUtil.hideKeyboard(hVar.f13804n);
        }
        dialog.dismiss();
    }

    public static /* synthetic */ void d(h hVar, View view) {
        hVar.r(2);
        hVar.o();
    }

    public static boolean m() {
        return Boolean.TRUE.equals(Boolean.valueOf(Ye.d.d(De.a.ShowFeedbackAfterSkip)));
    }

    public static void s(Context context, String str) {
        Toast makeText = Toast.makeText(context, str, 0);
        makeText.setGravity(48, 0, C6218a.V() + C6218a.b(16.0f));
        makeText.show();
    }

    public boolean k() {
        return this.f13810t == -1 && LiveChatUtil.canShowFeedback();
    }

    public void l(String str) {
        String attenderid;
        String attenderName;
        int i10 = this.f13807q;
        String str2 = i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : "happy" : "neutral" : "sad";
        Message I10 = C6966g.I(this.f13808r.getChid());
        if (I10 != null) {
            attenderid = I10.getSender();
            attenderName = I10.getSenderName();
        } else {
            attenderid = this.f13808r.getAttenderid();
            attenderName = this.f13808r.getAttenderName();
        }
        String str3 = attenderid;
        if (attenderName == null || attenderName.length() == 0) {
            attenderName = this.f13808r.getAttenderName();
        }
        String str4 = attenderName;
        Message O10 = C6966g.O(this.f13808r, String.valueOf(Vf.b.i().c(LiveChatUtil.unescapeHtml(str4))), Long.valueOf(rd.b.f()), str3, str4, "", Message.g.Feedback, Message.f.Sent);
        com.google.gson.k kVar = new com.google.gson.k();
        kVar.o("rating", Integer.valueOf(this.f13807q));
        kVar.p("ratingmessage", str);
        if (O10 != null) {
            Message.Attachment attachment = (Message.Attachment) AbstractC5895g.a(Yd.a.j(), kVar, Message.Attachment.class);
            attachment.setFeedbackTime(Long.valueOf(O10.getClientTime()));
            C6966g.t0(Message.addAttachment(O10, attachment));
        }
        Intent intent = new Intent("receivelivechat");
        intent.putExtra("message", "refreshchat");
        intent.putExtra("chid", this.f13808r.getChid());
        C1908a.b(MobilistenInitProvider.k()).d(intent);
        if (this.f13810t != this.f13807q) {
            new pd.t(this.f13808r.getChid(), this.f13808r.getVisitorid(), str, str2).start();
        }
        this.f13809s.dismiss();
    }

    public final GradientDrawable n(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        float b10 = C6218a.b(12.0f);
        gradientDrawable.setCornerRadii(new float[]{b10, b10, b10, b10, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(P.e(context, AbstractC5886l.f59838i0));
        return gradientDrawable;
    }

    public final void o() {
        boolean z10 = false;
        if (LiveChatUtil.canShowRating() && this.f13807q != 0) {
            z10 = true;
        }
        if (this.f13804n.getText().toString().trim().length() > 0 || z10) {
            this.f13805o.setAlpha(1.0f);
            this.f13805o.setOnClickListener(new b());
        } else {
            this.f13805o.setAlpha(0.38f);
            this.f13805o.setOnClickListener(null);
        }
    }

    public void p(final Dialog dialog, final SalesIQChat salesIQChat) {
        this.f13808r = salesIQChat;
        this.f13809s = dialog;
        boolean canShowRating = LiveChatUtil.canShowRating();
        this.f13793c.setText((k() && canShowRating) ? LiveChatUtil.getFeedbackHeading(salesIQChat, this.f13793c.getContext(), 0) : k() ? LiveChatUtil.getFeedbackHeading(salesIQChat, this.f13793c.getContext(), 1) : canShowRating ? LiveChatUtil.getFeedbackHeading(salesIQChat, this.f13793c.getContext(), 2) : null);
        if (this.f13810t < 1) {
            this.f13806p.setOnClickListener(new View.OnClickListener() { // from class: Xf.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.c(h.this, salesIQChat, dialog, view);
                }
            });
        }
        if (canShowRating) {
            r(0);
            this.f13797g.setOnClickListener(new View.OnClickListener() { // from class: Xf.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.b(h.this, view);
                }
            });
            this.f13796f.setOnClickListener(new View.OnClickListener() { // from class: Xf.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.d(h.this, view);
                }
            });
            this.f13795e.setOnClickListener(new View.OnClickListener() { // from class: Xf.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.a(h.this, view);
                }
            });
        } else {
            this.f13794d.setVisibility(8);
            if (k()) {
                this.f13804n.requestFocus();
                LiveChatUtil.showKeyboard(this.f13804n);
            }
        }
        q(this.f13810t);
        o();
        if (this.f13810t == -1) {
            this.f13806p.setVisibility(0);
        } else {
            this.f13806p.setVisibility(8);
        }
        if (k()) {
            this.f13804n.setVisibility(0);
            this.f13804n.addTextChangedListener(new a());
        } else {
            this.f13804n.setVisibility(8);
            LiveChatUtil.hideKeyboard(this.f13792b);
        }
    }

    public final void q(int i10) {
        if (i10 > 0) {
            int i11 = i10 - 1;
            ImageView[] imageViewArr = {this.f13800j, this.f13799i, this.f13798h};
            TextView[] textViewArr = {this.f13803m, this.f13802l, this.f13801k};
            int i12 = 0;
            while (i12 < 3) {
                boolean z10 = i12 == i11;
                float f10 = 1.0f;
                imageViewArr[i12].setAlpha(z10 ? 1.0f : 0.64f);
                TextView textView = textViewArr[i12];
                if (!z10) {
                    f10 = 0.64f;
                }
                textView.setAlpha(f10);
                i12++;
            }
        }
    }

    public void r(int i10) {
        if (i10 == 0 || this.f13807q != i10) {
            this.f13807q = i10;
            int b10 = C6218a.b(60.0f);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f13800j.getLayoutParams();
            layoutParams.height = b10;
            layoutParams.width = b10;
            this.f13800j.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f13799i.getLayoutParams();
            layoutParams2.height = b10;
            layoutParams2.width = b10;
            this.f13799i.setLayoutParams(layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f13798h.getLayoutParams();
            layoutParams3.height = b10;
            layoutParams3.width = b10;
            this.f13798h.setLayoutParams(layoutParams3);
            q(i10);
            if (i10 == 1) {
                ValueAnimator ofInt = ValueAnimator.ofInt(C6218a.b(50.0f), C6218a.b(70.0f));
                ofInt.addUpdateListener(new c());
                ofInt.setDuration(200L);
                ofInt.start();
            } else if (i10 == 2) {
                ValueAnimator ofInt2 = ValueAnimator.ofInt(C6218a.b(50.0f), C6218a.b(70.0f));
                ofInt2.addUpdateListener(new d());
                ofInt2.setDuration(200L);
                ofInt2.start();
            } else if (i10 == 3) {
                ValueAnimator ofInt3 = ValueAnimator.ofInt(C6218a.b(50.0f), C6218a.b(70.0f));
                ofInt3.addUpdateListener(new e());
                ofInt3.setDuration(200L);
                ofInt3.start();
            }
            if (i10 == 0 || !LiveChatUtil.canShowFeedback()) {
                return;
            }
            this.f13804n.requestFocus();
            LiveChatUtil.showKeyboard(this.f13804n);
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            h.this.o();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
