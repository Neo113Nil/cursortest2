package Zf;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC2082d0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zoho.livechat.android.utils.P;
import java.util.ArrayList;
import l.AbstractC5335a;
import od.q;
import od.r;
import og.AbstractC5896h;
import rd.C6218a;

/* loaded from: classes4.dex */
public class f extends RecyclerView.h {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f14798a;

    /* renamed from: b, reason: collision with root package name */
    public String f14799b = "";

    public class a extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        public TextView f14800a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView f14801b;

        /* renamed from: c, reason: collision with root package name */
        public GridLayoutManager f14802c;

        public a(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(q.f60685v8);
            this.f14800a = textView;
            textView.setTypeface(C6218a.C());
            this.f14801b = (RecyclerView) view.findViewById(q.f60665t8);
            this.f14802c = new GridLayoutManager(view.getContext(), 4);
        }
    }

    public class b extends RecyclerView.h {

        /* renamed from: a, reason: collision with root package name */
        public com.google.gson.e f14804a;

        /* renamed from: b, reason: collision with root package name */
        public String f14805b;

        public class a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f14807a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0312b f14808b;

            public a(String str, C0312b c0312b) {
                this.f14807a = str;
                this.f14808b = c0312b;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (f.this.f14799b.equals(b.this.f14805b + " " + this.f14807a)) {
                    f.this.f14799b = "";
                    LinearLayout linearLayout = this.f14808b.f14810a;
                    AbstractC2082d0.p0(linearLayout, b.this.f(linearLayout.getContext()));
                } else {
                    f.this.f14799b = b.this.f14805b + " " + this.f14807a;
                    C0312b c0312b = this.f14808b;
                    AbstractC2082d0.p0(c0312b.f14810a, b.this.e(c0312b.itemView.getContext()));
                    this.f14808b.f14812c.setTextColor(-1);
                }
                f.this.notifyDataSetChanged();
            }
        }

        /* renamed from: Zf.f$b$b, reason: collision with other inner class name */
        public class C0312b extends RecyclerView.F {

            /* renamed from: a, reason: collision with root package name */
            public LinearLayout f14810a;

            /* renamed from: b, reason: collision with root package name */
            public RelativeLayout f14811b;

            /* renamed from: c, reason: collision with root package name */
            public TextView f14812c;

            public C0312b(View view) {
                super(view);
                this.f14810a = (LinearLayout) view.findViewById(q.f60655s8);
                this.f14811b = (RelativeLayout) view.findViewById(q.f60705x8);
                TextView textView = (TextView) view.findViewById(q.f60675u8);
                this.f14812c = textView;
                textView.setTypeface(C6218a.P());
            }
        }

        public b(String str, com.google.gson.e eVar) {
            this.f14805b = str;
            this.f14804a = eVar;
        }

        public final GradientDrawable e(Context context) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C6218a.b(4.0f));
            gradientDrawable.setColor(P.e(context, AbstractC5335a.f55002q));
            return gradientDrawable;
        }

        public final GradientDrawable f(Context context) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C6218a.b(4.0f));
            gradientDrawable.setStroke(1, Color.parseColor("#545454"));
            return gradientDrawable;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C0312b c0312b, int i10) {
            String f10 = AbstractC5896h.f(this.f14804a.o(i10));
            c0312b.f14812c.setText(f10);
            if (f.this.f14799b.equals(this.f14805b + " " + f10)) {
                AbstractC2082d0.p0(c0312b.f14810a, e(c0312b.itemView.getContext()));
                c0312b.f14812c.setTextColor(-1);
            } else {
                LinearLayout linearLayout = c0312b.f14810a;
                AbstractC2082d0.p0(linearLayout, f(linearLayout.getContext()));
            }
            c0312b.f14811b.setOnClickListener(new a(f10, c0312b));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            com.google.gson.e eVar = this.f14804a;
            if (eVar == null) {
                return 0;
            }
            return eVar.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C0312b onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new C0312b(LayoutInflater.from(viewGroup.getContext()).inflate(r.f60739G0, viewGroup, false));
        }
    }

    public f(ArrayList arrayList) {
        this.f14798a = arrayList;
    }

    public String e() {
        return this.f14799b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i10) {
        com.zoho.livechat.android.models.e eVar = (com.zoho.livechat.android.models.e) this.f14798a.get(i10);
        aVar.f14800a.setText(eVar.a());
        b bVar = new b(eVar.a(), eVar.b());
        aVar.f14801b.setLayoutManager(aVar.f14802c);
        aVar.f14801b.setAdapter(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(r.f60737F0, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        ArrayList arrayList = this.f14798a;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }
}
