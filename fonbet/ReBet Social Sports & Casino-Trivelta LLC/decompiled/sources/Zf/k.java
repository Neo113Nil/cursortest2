package Zf;

import android.graphics.PorterDuff;
import android.location.Location;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.LatLng;
import com.zoho.livechat.android.utils.P;
import java.util.ArrayList;
import od.AbstractC5886l;
import od.q;
import od.r;
import rd.C6218a;

/* loaded from: classes4.dex */
public class k extends RecyclerView.h {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f14831a;

    /* renamed from: b, reason: collision with root package name */
    public b f14832b;

    /* renamed from: c, reason: collision with root package name */
    public LatLng f14833c;

    /* renamed from: d, reason: collision with root package name */
    public Double f14834d;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.zoho.livechat.android.models.c f14835a;

        public a(com.zoho.livechat.android.models.c cVar) {
            this.f14835a = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (k.this.f14832b != null) {
                k.this.f14832b.a(this.f14835a);
            }
        }
    }

    public interface b {
        void a(com.zoho.livechat.android.models.c cVar);
    }

    public class c extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        public RelativeLayout f14837a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f14838b;

        /* renamed from: c, reason: collision with root package name */
        public LinearLayout f14839c;

        /* renamed from: d, reason: collision with root package name */
        public RelativeLayout f14840d;

        /* renamed from: e, reason: collision with root package name */
        public ImageView f14841e;

        /* renamed from: f, reason: collision with root package name */
        public TextView f14842f;

        /* renamed from: g, reason: collision with root package name */
        public TextView f14843g;

        public c(View view) {
            super(view);
            this.f14837a = (RelativeLayout) view.findViewById(q.f60405U5);
            TextView textView = (TextView) view.findViewById(q.f60415V5);
            this.f14838b = textView;
            textView.setTypeface(C6218a.C());
            this.f14839c = (LinearLayout) view.findViewById(q.f60455Z5);
            this.f14841e = (ImageView) view.findViewById(q.f60425W5);
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(q.f60435X5);
            this.f14840d = relativeLayout;
            relativeLayout.getBackground().setColorFilter(P.e(this.f14840d.getContext(), AbstractC5886l.f59738L0), PorterDuff.Mode.SRC_ATOP);
            TextView textView2 = (TextView) view.findViewById(q.f60466a6);
            this.f14842f = textView2;
            textView2.setTypeface(C6218a.P());
            TextView textView3 = (TextView) view.findViewById(q.f60445Y5);
            this.f14843g = textView3;
            textView3.setTypeface(C6218a.P());
        }
    }

    public k(ArrayList arrayList, LatLng latLng, Double d10) {
        this.f14831a = arrayList;
        this.f14833c = latLng;
        this.f14834d = d10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(c cVar, int i10) {
        com.zoho.livechat.android.models.c cVar2 = (com.zoho.livechat.android.models.c) this.f14831a.get(i10);
        if (i10 == 0) {
            cVar.f14837a.setVisibility(0);
        } else {
            cVar.f14837a.setVisibility(8);
        }
        if (cVar2.a() != null && cVar2.a().length() > 0) {
            cVar.f14842f.setText(cVar2.a());
        } else if (cVar2.b() != null && cVar2.b().length() > 0) {
            cVar.f14842f.setText(cVar2.b());
        } else if (cVar2.h() != null && cVar2.h().length() > 0) {
            cVar.f14842f.setText(cVar2.h());
        } else if (cVar2.c() != null && cVar2.c().length() > 0) {
            cVar.f14842f.setText(cVar2.c());
        }
        cVar.f14843g.setText(cVar2.d());
        Location location = new Location("point A");
        Location location2 = new Location("point B");
        LatLng latLng = this.f14833c;
        if (latLng != null) {
            location.setLatitude(latLng.f33210a);
            location.setLongitude(this.f14833c.f33211b);
            location2.setLatitude(Double.parseDouble(cVar2.e()));
            location2.setLongitude(Double.parseDouble(cVar2.f()));
        }
        float distanceTo = location.distanceTo(location2) / 1000.0f;
        Double d10 = this.f14834d;
        if (d10 == null || d10.doubleValue() <= 0.0d || distanceTo <= this.f14834d.doubleValue() / 1000.0d) {
            cVar.f14842f.setTextColor(P.e(cVar.f14842f.getContext(), AbstractC5886l.f59758Q0));
            cVar.f14843g.setTextColor(P.e(cVar.f14843g.getContext(), AbstractC5886l.f59750O0));
            cVar.f14841e.setColorFilter(P.e(cVar.f14841e.getContext(), AbstractC5886l.f59742M0));
            cVar.f14839c.setOnClickListener(new a(cVar2));
            return;
        }
        cVar.f14839c.setOnClickListener(null);
        cVar.f14842f.setTextColor(P.e(cVar.f14842f.getContext(), AbstractC5886l.f59754P0));
        cVar.f14843g.setTextColor(P.e(cVar.f14843g.getContext(), AbstractC5886l.f59746N0));
        cVar.f14841e.setColorFilter(P.e(cVar.f14841e.getContext(), AbstractC5886l.f59734K0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new c(LayoutInflater.from(viewGroup.getContext()).inflate(r.f60770Y, viewGroup, false));
    }

    public void f(b bVar) {
        this.f14832b = bVar;
    }

    public void g(ArrayList arrayList) {
        this.f14831a = arrayList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        ArrayList arrayList = this.f14831a;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public void h(LatLng latLng) {
        this.f14833c = latLng;
        notifyDataSetChanged();
    }

    public void i(double d10) {
        this.f14834d = Double.valueOf(d10);
        notifyDataSetChanged();
    }
}
