package com.vk.photos.legacy;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.photos.legacy.PhotoListFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.a920;
import xsna.iah0;
import xsna.j6r0;
import xsna.vif0;
import xsna.vu5;

/* loaded from: classes16.dex */
public abstract class SectionedPhotoListFragment extends PhotoListFragment {
    public final ArrayList<a> T0 = new ArrayList<>();

    public class a {
        public String a;
        public b b;
        public PhotoListFragment.l c;
        public int d;
        public int e;

        public final String toString() {
            StringBuilder sb = new StringBuilder("Section{title='");
            sb.append(this.a);
            sb.append("', start=");
            sb.append(this.d);
            sb.append(", end=");
            return vu5.b(sb, this.e, '}');
        }
    }

    public class b extends UsableRecyclerView.c<c> {
        public final String c;

        public b(String str) {
            this.c = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return 4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            ((c) e0Var).V5(this.c);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            c cVar = new c(View.inflate(SectionedPhotoListFragment.this.getActivity(), R.layout.list_section_header, null));
            cVar.itemView.setBackgroundDrawable(null);
            return cVar;
        }
    }

    public class c extends vif0<String> {
        @Override // xsna.vif0
        public final void i6(String str) {
            ((TextView) this.itemView).setText(str);
        }
    }

    @Override // com.vk.photos.legacy.PhotoListFragment
    public final void Jo(RecyclerView.Adapter adapter, int i, int i2, Rect rect) {
        if ((adapter instanceof b) && i2 > 0) {
            WeakHashMap weakHashMap = j6r0.a;
            rect.top = iah0.a(-3.0f);
        }
        super.Jo(adapter, i, i2, rect);
    }

    @Override // com.vk.photos.legacy.PhotoListFragment
    public final boolean Lo(int i) {
        Iterator<a> it = this.T0.iterator();
        while (it.hasNext()) {
            if (it.next().e == i) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vk.photos.legacy.PhotoListFragment, me.grishka.appkit.fragments.BaseRecyclerFragment
    public final RecyclerView.Adapter wo() {
        if (this.J0 == null) {
            a920 a920Var = new a920();
            this.J0 = a920Var;
            if (this.M0) {
                a920Var.K0(new PhotoListFragment.i());
            }
        }
        return this.J0;
    }
}
