package Xf;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenTextView;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.P;
import l.AbstractC5335a;
import od.AbstractC5886l;
import od.q;
import od.t;
import og.p;
import rd.C6218a;
import ue.C6549a;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: A, reason: collision with root package name */
    public LinearLayout f13734A;

    /* renamed from: B, reason: collision with root package name */
    public RelativeLayout f13735B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f13736C;

    /* renamed from: D, reason: collision with root package name */
    public Group f13737D;

    /* renamed from: E, reason: collision with root package name */
    public LinearLayout f13738E;

    /* renamed from: F, reason: collision with root package name */
    public LinearLayout f13739F;

    /* renamed from: G, reason: collision with root package name */
    public TextView f13740G;

    /* renamed from: H, reason: collision with root package name */
    public TextView f13741H;

    /* renamed from: I, reason: collision with root package name */
    public TextView f13742I;

    /* renamed from: J, reason: collision with root package name */
    public TextView f13743J;

    /* renamed from: K, reason: collision with root package name */
    public View f13744K;

    /* renamed from: L, reason: collision with root package name */
    public ConstraintLayout f13745L;

    /* renamed from: M, reason: collision with root package name */
    public ConstraintLayout f13746M;

    /* renamed from: N, reason: collision with root package name */
    public ConstraintLayout f13747N;

    /* renamed from: O, reason: collision with root package name */
    public ConstraintLayout f13748O;

    /* renamed from: P, reason: collision with root package name */
    public ConstraintLayout f13749P;

    /* renamed from: Q, reason: collision with root package name */
    public TextView f13750Q;

    /* renamed from: R, reason: collision with root package name */
    public MobilistenTextView f13751R;

    /* renamed from: S, reason: collision with root package name */
    public MobilistenTextView f13752S;

    /* renamed from: T, reason: collision with root package name */
    public ImageView f13753T;

    /* renamed from: U, reason: collision with root package name */
    public ImageView f13754U;

    /* renamed from: V, reason: collision with root package name */
    public FloatingActionButton f13755V;

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f13756a;

    /* renamed from: b, reason: collision with root package name */
    public LinearLayout f13757b;

    /* renamed from: c, reason: collision with root package name */
    public LinearLayout f13758c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f13759d;

    /* renamed from: e, reason: collision with root package name */
    public EditText f13760e;

    /* renamed from: f, reason: collision with root package name */
    public ImageView f13761f;

    /* renamed from: g, reason: collision with root package name */
    public RelativeLayout f13762g;

    /* renamed from: h, reason: collision with root package name */
    public RelativeLayout f13763h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView f13764i;

    /* renamed from: j, reason: collision with root package name */
    public ProgressBar f13765j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f13766k;

    /* renamed from: l, reason: collision with root package name */
    public RelativeLayout f13767l;

    /* renamed from: m, reason: collision with root package name */
    public LinearLayout f13768m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f13769n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f13770o;

    /* renamed from: p, reason: collision with root package name */
    public LinearLayout f13771p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f13772q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f13773r;

    /* renamed from: s, reason: collision with root package name */
    public FrameLayout f13774s;

    /* renamed from: t, reason: collision with root package name */
    public View f13775t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f13776u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f13777v;

    /* renamed from: w, reason: collision with root package name */
    public ImageView f13778w;

    /* renamed from: x, reason: collision with root package name */
    public RelativeLayout f13779x;

    /* renamed from: y, reason: collision with root package name */
    public ImageView f13780y;

    /* renamed from: z, reason: collision with root package name */
    public ImageView f13781z;

    public a(View view) {
        this.f13749P = (ConstraintLayout) view.findViewById(q.f60514f);
        this.f13757b = (LinearLayout) view.findViewById(q.f60568k1);
        this.f13758c = (LinearLayout) view.findViewById(q.f60615o8);
        TextView textView = (TextView) view.findViewById(q.f60625p8);
        this.f13759d = textView;
        textView.setTypeface(C6218a.P());
        EditText editText = (EditText) view.findViewById(q.f60683v6);
        this.f13760e = editText;
        editText.setTypeface(C6218a.P());
        this.f13762g = (RelativeLayout) view.findViewById(q.f60399U);
        this.f13761f = (ImageView) view.findViewById(q.f60389T);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(q.f60343O3);
        this.f13756a = recyclerView;
        recyclerView.setItemAnimator(null);
        this.f13763h = (RelativeLayout) view.findViewById(q.f60664t7);
        this.f13764i = (ImageView) view.findViewById(q.f60654s7);
        ProgressBar progressBar = (ProgressBar) view.findViewById(q.f60633q6);
        this.f13765j = progressBar;
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        int a10 = P.a(this.f13765j.getContext());
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        indeterminateDrawable.setColorFilter(a10, mode);
        TextView textView2 = (TextView) view.findViewById(q.f60723z6);
        this.f13766k = textView2;
        textView2.setTypeface(C6218a.P());
        this.f13767l = (RelativeLayout) view.findViewById(q.f60585l8);
        this.f13768m = (LinearLayout) view.findViewById(q.f60278H8);
        TextView textView3 = (TextView) view.findViewById(q.f60268G8);
        this.f13770o = textView3;
        textView3.setTypeface(C6218a.P());
        this.f13771p = (LinearLayout) view.findViewById(q.f60288I8);
        TextView textView4 = (TextView) view.findViewById(q.f60298J8);
        this.f13772q = textView4;
        textView4.setTypeface(C6218a.C());
        this.f13769n = (LinearLayout) view.findViewById(q.f60703x6);
        this.f13773r = (TextView) view.findViewById(q.f60713y6);
        O();
        FrameLayout frameLayout = (FrameLayout) view.findViewById(q.f60400U0);
        this.f13774s = frameLayout;
        frameLayout.setVisibility(8);
        View findViewById = view.findViewById(q.f60500d7);
        this.f13775t = findViewById;
        findViewById.getBackground().setColorFilter(P.e(this.f13775t.getContext(), AbstractC5886l.f59868o1), mode);
        TextView textView5 = (TextView) view.findViewById(q.f60511e7);
        this.f13776u = textView5;
        textView5.setTypeface(C6218a.P());
        TextView textView6 = this.f13776u;
        textView6.setTextColor(P.e(textView6.getContext(), AbstractC5886l.f59872p1));
        TextView textView7 = (TextView) view.findViewById(q.f60489c7);
        this.f13777v = textView7;
        textView7.setTextColor(P.e(textView7.getContext(), AbstractC5886l.f59884s1));
        this.f13777v.setTypeface(C6218a.P());
        ImageView imageView = (ImageView) view.findViewById(q.f60478b7);
        this.f13778w = imageView;
        imageView.setColorFilter(P.e(imageView.getContext(), AbstractC5886l.f59880r1), mode);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(q.f60467a7);
        this.f13779x = relativeLayout;
        relativeLayout.getBackground().setColorFilter(P.e(this.f13779x.getContext(), AbstractC5886l.f59876q1), mode);
        this.f13780y = (ImageView) view.findViewById(q.f60456Z6);
        this.f13734A = (LinearLayout) view.findViewById(q.f60724z7);
        RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(q.f60446Y6);
        this.f13735B = relativeLayout2;
        relativeLayout2.getBackground().setColorFilter(P.g(P.e(this.f13735B.getContext(), AbstractC5335a.f55002q), 64), PorterDuff.Mode.MULTIPLY);
        this.f13736C = (TextView) view.findViewById(q.f60533g7);
        this.f13737D = (Group) view.findViewById(q.f60544h7);
        TextView textView8 = this.f13736C;
        textView8.setBackground(P.d(0, P.e(textView8.getContext(), AbstractC5886l.f59888t1), C6218a.b(4.0f), 0, 0));
        this.f13736C.setTypeface(C6218a.C());
        this.f13738E = (LinearLayout) view.findViewById(q.f60429X);
        this.f13739F = (LinearLayout) view.findViewById(q.f60419W);
        this.f13747N = (ConstraintLayout) view.findViewById(q.f60276H6);
        TextView textView9 = (TextView) view.findViewById(q.f60326M6);
        this.f13740G = textView9;
        textView9.setTextColor(P.e(textView9.getContext(), AbstractC5886l.f59854l1));
        this.f13740G.setTypeface(C6218a.C());
        this.f13741H = (TextView) view.findViewById(q.f60316L6);
        if (Te.a.W()) {
            this.f13741H.setVisibility(8);
        } else {
            TextView textView10 = this.f13741H;
            textView10.setTextColor(P.e(textView10.getContext(), AbstractC5886l.f59849k1));
            this.f13741H.setTypeface(C6218a.P());
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(q.f60296J6);
        this.f13746M = constraintLayout;
        constraintLayout.getBackground().setColorFilter(P.e(this.f13746M.getContext(), AbstractC5886l.f59834h1), mode);
        TextView textView11 = (TextView) view.findViewById(q.f60286I6);
        this.f13742I = textView11;
        textView11.setTextColor(P.e(textView11.getContext(), AbstractC5886l.f59844j1));
        this.f13742I.setTypeface(C6218a.P(), 1);
        TextView textView12 = (TextView) view.findViewById(q.f60306K6);
        this.f13743J = textView12;
        textView12.setTextColor(P.e(textView12.getContext(), AbstractC5886l.f59839i1));
        this.f13743J.setTypeface(C6218a.P());
        this.f13744K = view.findViewById(q.f60578l1);
        this.f13745L = (ConstraintLayout) view.findViewById(q.f60353P3);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(q.f60199A);
        this.f13748O = constraintLayout2;
        p.g(constraintLayout2, new float[]{C6218a.b(12.0f), C6218a.b(12.0f), C6218a.b(12.0f), C6218a.b(12.0f), 0.0f, 0.0f, 0.0f, 0.0f}, null, Integer.valueOf(P.e(this.f13748O.getContext(), AbstractC5886l.f59779V1)));
        this.f13750Q = (TextView) view.findViewById(q.f60363Q3);
        this.f13751R = (MobilistenTextView) view.findViewById(q.f60626q);
        this.f13752S = (MobilistenTextView) view.findViewById(q.f60616p);
        this.f13753T = (ImageView) view.findViewById(q.f60586m);
        ImageView imageView2 = (ImageView) view.findViewById(q.f60606o);
        this.f13754U = imageView2;
        p.f(imageView2, null, Integer.valueOf(C6218a.b(8.0f)));
        this.f13781z = (ImageView) view.findViewById(q.f60596n);
        this.f13755V = (FloatingActionButton) view.findViewById(q.f60636r);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(q.f60686w);
        float b10 = C6218a.b(24.0f);
        if (MobilistenUtil.m()) {
            appCompatImageView.setTranslationX(b10);
        } else {
            appCompatImageView.setTranslationX(-b10);
        }
    }

    public FrameLayout A() {
        return this.f13774s;
    }

    public ImageView B() {
        return this.f13780y;
    }

    public LinearLayout C() {
        return this.f13734A;
    }

    public TextView D() {
        return this.f13776u;
    }

    public TextView E() {
        return this.f13736C;
    }

    public Group F() {
        return this.f13737D;
    }

    public FloatingActionButton G() {
        return this.f13755V;
    }

    public ImageView H() {
        return this.f13764i;
    }

    public RelativeLayout I() {
        return this.f13763h;
    }

    public View J() {
        return this.f13744K;
    }

    public MobilistenTextView K() {
        return this.f13752S;
    }

    public MobilistenTextView L() {
        return this.f13751R;
    }

    public LinearLayout M() {
        return this.f13758c;
    }

    public TextView N() {
        return this.f13759d;
    }

    public void O() {
        this.f13769n.setVisibility(0);
        if (qd.c.k() && C6218a.c0()) {
            this.f13769n.setVisibility(8);
            return;
        }
        if (C6549a.k() && !C6218a.c0()) {
            this.f13773r.setText(t.f61132w0);
        } else if (qd.c.i()) {
            this.f13773r.setText(t.f60898L4);
        } else {
            this.f13769n.setVisibility(8);
        }
    }

    public void P(Message.b bVar) {
        int i10;
        int i11;
        String format = String.format(this.f13750Q.getContext().getString(t.f61122u2), bVar.e());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Spannable a10 = Vf.b.i().a(bVar);
        spannableStringBuilder.append((CharSequence) format);
        String e10 = bVar.e();
        if (e10 != null) {
            i11 = spannableStringBuilder.toString().indexOf(e10);
            i10 = e10.length() + i11;
        } else {
            i10 = -1;
            i11 = -1;
        }
        if (i11 != -1 && i10 != -1) {
            spannableStringBuilder.replace(i11, i10, (CharSequence) a10);
        }
        spannableStringBuilder.setSpan(new StyleSpan(1), i11, i10, 33);
        this.f13750Q.setText(spannableStringBuilder);
    }

    public ImageView a() {
        return this.f13761f;
    }

    public RelativeLayout b() {
        return this.f13762g;
    }

    public LinearLayout c() {
        return this.f13739F;
    }

    public LinearLayout d() {
        return this.f13738E;
    }

    public LinearLayout e() {
        return this.f13771p;
    }

    public TextView f() {
        return this.f13772q;
    }

    public LinearLayout g() {
        return this.f13768m;
    }

    public TextView h() {
        return this.f13770o;
    }

    public LinearLayout i() {
        return this.f13757b;
    }

    public RecyclerView j() {
        return this.f13756a;
    }

    public ConstraintLayout k() {
        return this.f13745L;
    }

    public ImageView l() {
        return this.f13754U;
    }

    public ImageView m() {
        return this.f13753T;
    }

    public ImageView n() {
        return this.f13781z;
    }

    public ConstraintLayout o() {
        return this.f13748O;
    }

    public RelativeLayout p() {
        return this.f13767l;
    }

    public ProgressBar q() {
        return this.f13765j;
    }

    public EditText r() {
        return this.f13760e;
    }

    public TextView s() {
        return this.f13766k;
    }

    public ConstraintLayout t() {
        return this.f13749P;
    }

    public ConstraintLayout u() {
        return this.f13747N;
    }

    public ConstraintLayout v() {
        return this.f13746M;
    }

    public TextView w() {
        return this.f13742I;
    }

    public TextView x() {
        return this.f13741H;
    }

    public TextView y() {
        return this.f13740G;
    }

    public RelativeLayout z() {
        return this.f13735B;
    }
}
