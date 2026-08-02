package Xf;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.graphics.AbstractC2074d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.CustomTypefaceSpan;
import com.zoho.livechat.android.utils.P;
import java.util.ArrayList;
import n.AbstractC5596a;
import od.AbstractC5886l;
import od.p;
import od.t;
import rd.C6218a;

/* loaded from: classes4.dex */
public class k implements DialogInterface.OnShowListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f13818a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f13819b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public RecyclerView f13820c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.appcompat.app.a f13821d;

    /* renamed from: e, reason: collision with root package name */
    public RelativeLayout f13822e;

    public class b extends RecyclerView.h {

        public class a extends RecyclerView.F {

            /* renamed from: a, reason: collision with root package name */
            public TextView f13824a;

            public a(View view) {
                super(view);
                TextView textView = (TextView) view;
                this.f13824a = textView;
                textView.setTypeface(C6218a.P());
            }
        }

        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(a aVar, int i10) {
            aVar.f13824a.setTextColor(P.e(k.this.f13818a, R.attr.textColorSecondary));
            aVar.f13824a.setText((CharSequence) k.this.f13819b.get(i10));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
            TextView textView = new TextView(k.this.f13818a);
            textView.setTextSize(2, 16.0f);
            textView.setTextColor(Color.parseColor("#99000000"));
            textView.setTypeface(C6218a.P());
            return new a(textView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return k.this.f13819b.size();
        }
    }

    public k(Context context, DialogInterface.OnClickListener onClickListener) {
        this.f13818a = context;
        androidx.appcompat.app.a create = qe.d.m(context).m(MobilistenInitProvider.k().getString(t.f60883J1), onClickListener).h(MobilistenInitProvider.k().getString(t.f60877I1), onClickListener).create();
        this.f13821d = create;
        if (create.getWindow() != null) {
            this.f13821d.getWindow().setBackgroundDrawable(AbstractC5596a.b(context, p.f60037S3));
        }
        this.f13821d.setOnShowListener(this);
    }

    public void b(ArrayList arrayList) {
        this.f13819b = arrayList;
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan(C6218a.P());
        SpannableString spannableString = new SpannableString(this.f13818a.getString(t.f60889K1));
        spannableString.setSpan(customTypefaceSpan, 0, spannableString.length(), 33);
        this.f13821d.setTitle(spannableString);
        this.f13822e = new RelativeLayout(this.f13818a);
        RecyclerView recyclerView = new RecyclerView(this.f13818a);
        this.f13820c = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.f13820c.setLayoutManager(new LinearLayoutManager(this.f13818a));
        this.f13820c.setAdapter(new b());
        this.f13822e.addView(this.f13820c);
        this.f13820c.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f13820c.setPadding(C6218a.b(24.0f), C6218a.b(16.0f), C6218a.b(24.0f), C6218a.b(24.0f));
        this.f13822e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    public void c() {
        this.f13821d.l(this.f13822e);
        this.f13821d.show();
        this.f13821d.getWindow().setLayout(C6218a.r() - C6218a.b(60.0f), (int) (C6218a.p() / 1.5d));
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Button i10 = this.f13821d.i(-1);
        i10.setTextColor(P.a(this.f13818a));
        i10.setTypeface(C6218a.C());
        i10.setAllCaps(false);
        og.p.u(i10, P.e(this.f13821d.getContext(), AbstractC5886l.f59755P1), qe.d.o(), null, true, AbstractC2074d.k(androidx.core.content.res.k.d(this.f13818a.getResources(), R.color.black, this.f13818a.getTheme()), 30));
        Button i11 = this.f13821d.i(-2);
        i11.setTextColor(P.a(this.f13818a));
        og.p.u(i11, P.e(this.f13821d.getContext(), AbstractC5886l.f59747N1), qe.d.o(), null, true, AbstractC2074d.k(androidx.core.content.res.k.d(this.f13818a.getResources(), R.color.black, this.f13818a.getTheme()), 30));
        i11.setTypeface(C6218a.C());
        i11.setAllCaps(false);
    }
}
