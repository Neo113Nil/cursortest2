package Zf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.P;
import com.zoho.salesiqembed.ZohoSalesIQ;
import java.util.List;
import od.AbstractC5886l;
import od.q;
import od.r;
import rd.C6218a;

/* loaded from: classes4.dex */
public class h extends RecyclerView.h {

    /* renamed from: a, reason: collision with root package name */
    public List f14817a;

    /* renamed from: b, reason: collision with root package name */
    public b f14818b;

    public class a extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        public ImageView f14819a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f14820b;

        /* renamed from: c, reason: collision with root package name */
        public CircularProgressIndicator f14821c;

        public a(View view) {
            super(view);
            this.f14819a = (ImageView) view.findViewById(q.f60581l4);
            this.f14820b = (TextView) view.findViewById(q.f60251F1);
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) view.findViewById(q.f60404U4);
            this.f14821c = circularProgressIndicator;
            circularProgressIndicator.setIndicatorColor(P.a(new ContextThemeWrapper(view.getContext(), ZohoSalesIQ.getStyleForCurrentThemeMode())));
        }
    }

    public interface b {
        void a(Channel.Department department);
    }

    public static /* synthetic */ void c(h hVar, a aVar, Channel.Department department, View view) {
        if (hVar.f14818b != null) {
            aVar.f14821c.setVisibility(0);
            hVar.f14818b.a(department);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final a aVar, int i10) {
        final Channel.Department department = (Channel.Department) this.f14817a.get(i10);
        Bitmap createBitmap = Bitmap.createBitmap(C6218a.b(24.0f), C6218a.b(24.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setStrokeWidth(10.0f);
        paint.setStyle(Paint.Style.FILL);
        if (department == null) {
            paint.setColor(P.e(aVar.f14819a.getContext(), AbstractC5886l.f59833h0));
        } else if (department.isEngaged() != null && department.isEngaged() == Boolean.TRUE) {
            paint.setColor(P.e(aVar.f14819a.getContext(), AbstractC5886l.f59828g0));
        } else if (department.isOnline() == null || department.isOnline() != Boolean.TRUE) {
            paint.setColor(P.e(aVar.f14819a.getContext(), AbstractC5886l.f59833h0));
        } else {
            paint.setColor(P.e(aVar.f14819a.getContext(), AbstractC5886l.f59823f0));
        }
        canvas.drawCircle(C6218a.b(12.0f), C6218a.b(12.0f), C6218a.b(10.0f), paint);
        aVar.f14819a.setImageBitmap(createBitmap);
        String unescapeHtml = LiveChatUtil.unescapeHtml(department.getName());
        if (unescapeHtml != null) {
            aVar.f14820b.setText(unescapeHtml);
        } else {
            aVar.f14820b.setText(department.getName());
        }
        aVar.f14821c.setVisibility(8);
        aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: Zf.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.c(h.this, aVar, department, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(r.f60808s, viewGroup, false));
    }

    public void f(b bVar) {
        this.f14818b = bVar;
    }

    public void g(List list) {
        this.f14817a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        List list = this.f14817a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
