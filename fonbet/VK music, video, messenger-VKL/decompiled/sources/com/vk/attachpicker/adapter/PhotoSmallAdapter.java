package com.vk.attachpicker.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.adapter.a;
import com.vk.attachpicker.b;
import com.vk.attachpicker.configuration.GalleryHeaderButtonStyle;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.bwj0;
import xsna.bwt0;
import xsna.e43;
import xsna.epx;
import xsna.es8;
import xsna.fs8;
import xsna.fz10;
import xsna.gj80;
import xsna.gk90;
import xsna.gz10;
import xsna.i5f;
import xsna.ik90;
import xsna.j5g;
import xsna.jk90;
import xsna.kvs;
import xsna.n6f;
import xsna.p70;
import xsna.tcn;
import xsna.u0x;
import xsna.uuk;
import xsna.xpn0;
import xsna.zoj0;
import xsna.zrp;

/* compiled from: PhotoSmallAdapter.kt */
/* loaded from: classes15.dex */
public final class PhotoSmallAdapter extends zoj0<Object, RecyclerView.e0> implements c.i {
    public final b e;
    public final es8 f;
    public final int g;
    public final xpn0 h;
    public final GalleryHeaderButtonStyle i;
    public final p70 j;
    public final ik90 k;
    public final i5f l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhotoSmallAdapter.kt */
    public static final class PreviewType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PreviewType[] $VALUES;
        public static final PreviewType Default;
        public static final PreviewType Long;
        public static final PreviewType Preview15;
        public static final PreviewType Short;

        static {
            PreviewType previewType = new PreviewType("Default", 0);
            Default = previewType;
            PreviewType previewType2 = new PreviewType("Long", 1);
            Long = previewType2;
            PreviewType previewType3 = new PreviewType("Preview15", 2);
            Preview15 = previewType3;
            PreviewType previewType4 = new PreviewType("Short", 3);
            Short = previewType4;
            PreviewType[] previewTypeArr = {previewType, previewType2, previewType3, previewType4};
            $VALUES = previewTypeArr;
            $ENTRIES = new asp(previewTypeArr);
        }

        public PreviewType() {
            throw null;
        }

        public static PreviewType valueOf(String str) {
            return (PreviewType) Enum.valueOf(PreviewType.class, str);
        }

        public static PreviewType[] values() {
            return (PreviewType[]) $VALUES.clone();
        }
    }

    /* compiled from: PhotoSmallAdapter.kt */
    public static final class a {
        public static final a a = new a();
    }

    public PhotoSmallAdapter(b bVar, es8 es8Var, int i, xpn0 xpn0Var, GalleryHeaderButtonStyle galleryHeaderButtonStyle, p70 p70Var, ik90 ik90Var, i5f i5fVar) {
        super(new com.vk.lists.a(new fz10()));
        this.e = bVar;
        this.f = es8Var;
        this.g = i;
        this.h = xpn0Var;
        this.i = galleryHeaderButtonStyle;
        this.j = p70Var;
        this.k = ik90Var;
        this.l = i5fVar;
        setHasStableIds(true);
    }

    @Override // com.vk.lists.c.i
    public final boolean I() {
        return ((ListDataSet) this.c).d.isEmpty();
    }

    public final int K0() {
        Iterator it = ((ListDataSet) this.c).d.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() instanceof MediaStoreEntry) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final List<Integer> L0() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ListDataSet) this.c).d.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            if ((next instanceof MediaStoreEntry) && this.e.q((MediaStoreEntry) next)) {
                arrayList.add(Integer.valueOf(i - K0()));
            }
            i = i2;
        }
        return arrayList;
    }

    public final void N0(List<? extends MediaStoreEntry> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        ik90 ik90Var = this.k;
        int i = (PermissionHelper.o(ik90Var.b) && (this.i == GalleryHeaderButtonStyle.SINGLE_SPAN || this.o || this.p)) ? 1 : 0;
        if (PermissionHelper.o(ik90Var.b)) {
            arrayList.add(0, jk90.a);
        }
        if (this.o) {
            arrayList.add(i, a.b.a);
        } else if (this.p) {
            arrayList.add(i, a.C0380a.a);
        } else if (this.m || this.n || this.q) {
            arrayList.add(i, a.a);
        }
        this.c.setItems(arrayList);
    }

    @Override // xsna.zoj0, xsna.uuk, xsna.vic, com.vk.lists.c.i
    public final void clear() {
        this.c.clear();
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return E0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        Uri f;
        Object c = this.c.c(i);
        MediaStoreEntry mediaStoreEntry = c instanceof MediaStoreEntry ? (MediaStoreEntry) c : null;
        if (mediaStoreEntry == null || (f = mediaStoreEntry.f()) == null) {
            return 1L;
        }
        return f.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        Object b0 = j5g.b0(i, ((ListDataSet) this.c).d);
        if ((b0 instanceof a) && (this.m || this.n || this.q)) {
            return 0;
        }
        if (b0 instanceof com.vk.attachpicker.adapter.a) {
            return 1;
        }
        return epx.f(b0, jk90.a) ? 3 : 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r8.equals(r9 != null ? r9 : null) == false) goto L29;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List<? extends Object> list) {
        Object obj;
        boolean z = e0Var instanceof gz10;
        uuk uukVar = this.c;
        if (!z) {
            if (e0Var instanceof fs8) {
                ((fs8) e0Var).V5(this.m, this.n, this.q);
                return;
            } else {
                if (e0Var instanceof u0x) {
                    ((u0x) e0Var).V5((com.vk.attachpicker.adapter.a) uukVar.c(i));
                    return;
                }
                return;
            }
        }
        MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) uukVar.c(i);
        b bVar = this.e;
        int d = bVar.d(mediaStoreEntry);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (obj instanceof Boolean) {
                    break;
                }
            }
        }
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        MediaStoreEntry s = bVar.s(mediaStoreEntry);
        if (s != null) {
            mediaStoreEntry = s;
        }
        if (!list.isEmpty()) {
            MediaStoreEntry mediaStoreEntry2 = ((gz10) e0Var).t;
        }
        ((gz10) e0Var).W5(mediaStoreEntry);
        ((gz10) e0Var).a6(mediaStoreEntry, d, booleanValue);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        xpn0 xpn0Var = this.h;
        if (i != 0) {
            if (i == 1) {
                return (RecyclerView.e0) this.j.invoke(viewGroup, xpn0Var);
            }
            if (i != 3) {
                return (RecyclerView.e0) this.l.invoke();
            }
            ik90 ik90Var = this.k;
            ik90Var.getClass();
            return new gk90(viewGroup, ik90Var);
        }
        this.f.getClass();
        int i2 = es8.b.$EnumSwitchMapping$0[this.i.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bwj0 bwj0Var = new bwj0(new es8.a(context));
            bwt0.i0(bwj0Var.itemView, new gj80(xpn0Var, 15));
            return bwj0Var;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.picker_layout_camera_header_default, (ViewGroup) null);
        int i3 = this.g;
        ((TextView) inflate.findViewById(R.id.tv_empty)).setText(i3 != 222 ? i3 != 333 ? R.string.picker_photo_and_video_not_found : R.string.picker_video_not_found : R.string.picker_photo_not_found);
        bwt0.Z(R.attr.vk_ui_separator_primary_alpha, inflate.findViewById(R.id.picker_attach_gallery_separator_view));
        kvs kvsVar = new kvs(inflate);
        View findViewById = kvsVar.itemView.findViewById(R.id.picker_attach_gallery_photo_view);
        if (findViewById != null) {
            bwt0.i0(findViewById, new tcn(xpn0Var, 10));
        }
        View findViewById2 = kvsVar.itemView.findViewById(R.id.picker_attach_gallery_video_view);
        if (findViewById2 != null) {
            bwt0.i0(findViewById2, new n6f(xpn0Var, 28));
        }
        return kvsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        onBindViewHolder(e0Var, i, EmptyList.b);
    }
}
