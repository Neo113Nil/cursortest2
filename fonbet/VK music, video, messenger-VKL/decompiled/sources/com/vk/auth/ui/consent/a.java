package com.vk.auth.ui.consent;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.alj0;
import xsna.izs;
import xsna.s3q0;
import xsna.tf3;
import xsna.u01;

/* compiled from: ConsentAppsAdapter.kt */
/* loaded from: classes15.dex */
public final class a extends RecyclerView.Adapter<C0415a> {
    public final alj0 c;
    public final ArrayList d = new ArrayList();

    /* compiled from: ConsentAppsAdapter.kt */
    /* renamed from: com.vk.auth.ui.consent.a$a, reason: collision with other inner class name */
    public static final class C0415a extends RecyclerView.e0 {
        public final izs<c, s3q0> l;
        public final TextView m;
        public c n;

        public C0415a(ViewGroup viewGroup, alj0 alj0Var) {
            super(tf3.b(viewGroup, R.layout.vk_consent_app_item, viewGroup, false));
            this.l = alj0Var;
            TextView textView = (TextView) this.itemView.findViewById(R.id.vk_consent_app_item_title);
            this.m = textView;
            textView.setOnClickListener(new u01(this, 2));
        }
    }

    public a(alj0 alj0Var) {
        this.c = alj0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(C0415a c0415a, int i) {
        C0415a c0415a2 = c0415a;
        c cVar = (c) this.d.get(i);
        c0415a2.n = cVar;
        TextView textView = c0415a2.m;
        textView.setText(cVar.a.a);
        if (cVar.b) {
            textView.setBackgroundResource(R.drawable.vk_auth_bg_consent_app);
        } else {
            textView.setBackground(null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final C0415a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C0415a(viewGroup, this.c);
    }
}
