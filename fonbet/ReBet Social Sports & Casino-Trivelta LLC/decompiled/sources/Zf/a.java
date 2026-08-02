package Zf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.P;
import java.util.ArrayList;
import od.AbstractC5886l;
import od.q;
import od.r;
import rd.C6218a;

/* loaded from: classes4.dex */
public class a extends RecyclerView.h {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f14784a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public c f14785b;

    /* renamed from: Zf.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0311a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f14786a;

        public ViewOnClickListenerC0311a(b bVar) {
            this.f14786a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f14785b.a(this.f14786a.getAdapterPosition());
        }
    }

    public class b extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        public ImageView f14788a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f14789b;

        public b(View view) {
            super(view);
            this.f14788a = (ImageView) view.findViewById(q.f60310L0);
            TextView textView = (TextView) view.findViewById(q.f60320M0);
            this.f14789b = textView;
            textView.setTypeface(C6218a.P());
        }
    }

    public interface c {
        void a(int i10);
    }

    public void d(com.zoho.livechat.android.models.d dVar) {
        this.f14784a.add(dVar);
    }

    public com.zoho.livechat.android.models.d e(int i10) {
        return (com.zoho.livechat.android.models.d) this.f14784a.get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        com.zoho.livechat.android.models.d dVar = (com.zoho.livechat.android.models.d) this.f14784a.get(i10);
        bVar.f14789b.setText(dVar.b());
        bVar.f14788a.setImageDrawable(LiveChatUtil.changeDrawableColor(bVar.itemView.getContext(), dVar.a(), P.e(bVar.itemView.getContext(), AbstractC5886l.f59722H0)));
        if (this.f14785b != null) {
            bVar.itemView.setOnClickListener(new ViewOnClickListenerC0311a(bVar));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(r.f60744J, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        ArrayList arrayList = this.f14784a;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public void h(c cVar) {
        this.f14785b = cVar;
    }
}
