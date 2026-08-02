package com.vk.attachpicker.fragment.gallery;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.lists.ListDataSet;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.bwt0;
import xsna.c24;
import xsna.dcc0;
import xsna.eu1;
import xsna.gk90;
import xsna.gz10;
import xsna.hk90;
import xsna.j5g;
import xsna.jk90;
import xsna.tf3;
import xsna.x2t;
import xsna.zoj0;

/* compiled from: AttachGalleryAdapter.kt */
/* loaded from: classes15.dex */
public final class a extends zoj0<Object, RecyclerView.e0> {
    public final com.vk.attachpicker.b e;
    public final InterfaceC0383a f;
    public boolean g;

    /* compiled from: AttachGalleryAdapter.kt */
    /* renamed from: com.vk.attachpicker.fragment.gallery.a$a, reason: collision with other inner class name */
    public interface InterfaceC0383a extends hk90 {
        void a();

        void c();
    }

    /* compiled from: AttachGalleryAdapter.kt */
    public static final class b extends RecyclerView.e0 implements View.OnClickListener {
        public final InterfaceC0383a l;

        public b(ViewGroup viewGroup, InterfaceC0383a interfaceC0383a) {
            super(tf3.b(viewGroup, R.layout.picker_attach_gallery_header, viewGroup, false));
            this.l = interfaceC0383a;
            bwt0.h0(this, this.itemView.findViewById(R.id.picker_attach_gallery_photo_view));
            bwt0.h0(this, this.itemView.findViewById(R.id.picker_attach_gallery_video_view));
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
            InterfaceC0383a interfaceC0383a = this.l;
            if (valueOf != null && valueOf.intValue() == R.id.picker_attach_gallery_photo_view) {
                interfaceC0383a.a();
            } else if (valueOf != null && valueOf.intValue() == R.id.picker_attach_gallery_video_view) {
                interfaceC0383a.c();
            }
        }
    }

    public a(com.vk.attachpicker.b bVar, dcc0 dcc0Var) {
        this.e = bVar;
        this.f = dcc0Var;
    }

    public final int K0(int i) {
        if (i < 0 || i >= E0()) {
            return -1;
        }
        return i;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) y0()).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        Object b0 = j5g.b0(i, y0());
        if ((b0 instanceof MediaStoreEntry ? (MediaStoreEntry) b0 : null) != null) {
            return r3.getId();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        Object c = this.c.c(i);
        if (c instanceof x2t) {
            return 1;
        }
        return c instanceof jk90 ? 2 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        onBindViewHolder(e0Var, i, Collections.EMPTY_LIST);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        InterfaceC0383a interfaceC0383a = this.f;
        return i != 1 ? i != 2 ? new gz10(viewGroup.getContext(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, new gz10.a(new c24(0), null, new eu1(this, 4)), 29) : new gk90(viewGroup, interfaceC0383a) : new b(viewGroup, interfaceC0383a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List<Object> list) {
        int K0;
        if (!(e0Var instanceof gz10) || (K0 = K0(i)) == -1) {
            return;
        }
        Object obj = ((ListDataSet) this.c).d.get(K0);
        MediaStoreEntry mediaStoreEntry = obj instanceof MediaStoreEntry ? (MediaStoreEntry) obj : null;
        if (mediaStoreEntry == null) {
            return;
        }
        if (list.isEmpty()) {
            ((gz10) e0Var).W5(mediaStoreEntry);
        }
        ((gz10) e0Var).a6(mediaStoreEntry, this.e.d(mediaStoreEntry), false);
    }
}
