package com.vk.superapp.browser.internal.ui.menu.action;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.TextViewEllipsizeEnd;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ap30;
import xsna.e3m;
import xsna.f4m;
import xsna.iah0;
import xsna.jjc;
import xsna.m520;
import xsna.vjo;

/* compiled from: UnifiedHorizontalActionsViewHolder.kt */
/* loaded from: classes6.dex */
public final class l extends RecyclerView.e0 {
    public final b l;

    /* compiled from: UnifiedHorizontalActionsViewHolder.kt */
    public static final class a extends RecyclerView.e0 {
        public final m520 l;
        public HorizontalAction m;
        public final TextViewEllipsizeEnd n;
        public final ImageView o;

        public a(m520 m520Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.vk_actions_menu_item, viewGroup, false));
            this.l = m520Var;
            this.n = (TextViewEllipsizeEnd) this.itemView.findViewById(R.id.description);
            this.o = (ImageView) this.itemView.findViewById(R.id.icon);
            jjc.g(this.itemView, new ap30(this, 23));
            View view = this.itemView;
            view.setBackground(vjo.a(view.getContext(), 0, 0, 0, iah0.b(8.0f), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 444));
        }
    }

    /* compiled from: UnifiedHorizontalActionsViewHolder.kt */
    public static final class b extends RecyclerView.Adapter<a> {
        public final m520 c;
        public List<? extends HorizontalAction> d = EmptyList.b;

        public b(m520 m520Var) {
            this.c = m520Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(a aVar, int i) {
            a aVar2 = aVar;
            HorizontalAction horizontalAction = this.d.get(i);
            aVar2.m = horizontalAction;
            int f = e3m.f(R.attr.vk_ui_action_sheet_text, aVar2.itemView.getContext());
            TextViewEllipsizeEnd textViewEllipsizeEnd = aVar2.n;
            String string = aVar2.itemView.getContext().getString(horizontalAction.i());
            int i2 = TextViewEllipsizeEnd.d;
            textViewEllipsizeEnd.b(string, null, false, false);
            textViewEllipsizeEnd.setTextColor(f);
            ImageView imageView = aVar2.o;
            imageView.setImageResource(horizontalAction.h());
            imageView.setColorFilter(f);
            f4m.v(0, imageView);
            f4m.t(iah0.a(10), imageView);
            imageView.setBackground(null);
            com.vk.typography.b.k(textViewEllipsizeEnd, FontFamily.MEDIUM, Float.valueOf(13.0f), 4);
            f4m.t(iah0.a(2), textViewEllipsizeEnd);
            f4m.q(iah0.a(14), textViewEllipsizeEnd);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new a(this.c, LayoutInflater.from(viewGroup.getContext()), viewGroup);
        }
    }

    public l(c cVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater.inflate(R.layout.vk_action_menu_base_actions_item, viewGroup, false));
        b bVar = new b(cVar);
        this.l = bVar;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.horizontal_actions_recycler);
        this.itemView.getContext();
        recyclerView.setLayoutManager(new DefaultWidthSpreaderLayoutManager(0, false));
        recyclerView.setAdapter(bVar);
        View view = this.itemView;
        view.setBackground(vjo.a(view.getContext(), e3m.f(R.attr.vk_ui_background_tertiary, this.itemView.getContext()), 0, 0, iah0.b(8.0f), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 444));
        f4m.j(this.itemView.findViewById(R.id.separator));
        f4m.v(iah0.a(12), this.itemView);
        f4m.t(iah0.a(6), recyclerView);
    }
}
