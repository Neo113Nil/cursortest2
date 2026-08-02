package com.vk.attachpicker;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.attachpicker.b;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreImageEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bmk0;
import xsna.c5g;
import xsna.e43;
import xsna.j5g;
import xsna.p870;

/* compiled from: SelectionContextImpl.kt */
/* loaded from: classes15.dex */
public final class c implements b {
    public Integer b;
    public b.c c;
    public b.d d;
    public int a = 10;
    public final ArrayList e = new ArrayList();
    public final LinkedHashMap f = new LinkedHashMap();
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashMap h = new LinkedHashMap();
    public final LinkedHashMap i = new LinkedHashMap();
    public final LinkedHashMap j = new LinkedHashMap();
    public final LinkedHashMap k = new LinkedHashMap();
    public final LinkedHashMap l = new LinkedHashMap();

    @Override // com.vk.attachpicker.b
    public final void a(MediaStoreEntry mediaStoreEntry, MediaStoreEntry mediaStoreEntry2, Object obj, bmk0 bmk0Var) {
        String lastPathSegment = mediaStoreEntry2.f().getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        this.j.put(lastPathSegment, mediaStoreEntry);
        this.k.put(lastPathSegment, obj);
        this.l.put(lastPathSegment, bmk0Var);
    }

    @Override // com.vk.attachpicker.b
    public final ArrayList b() {
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) it.next();
            MediaStoreEntry s = s(mediaStoreEntry);
            if (s != null) {
                mediaStoreEntry = s;
            }
            arrayList2.add(mediaStoreEntry);
        }
        return arrayList2;
    }

    @Override // com.vk.attachpicker.b
    public final boolean c(MediaStoreEntry mediaStoreEntry) {
        List<Integer> list;
        if (q(mediaStoreEntry)) {
            ArrayList arrayList = this.e;
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((MediaStoreEntry) it.next()).getId() == mediaStoreEntry.getId()) {
                    break;
                }
                i++;
            }
            b.d dVar = this.d;
            if (dVar != null) {
                list = dVar.e();
            } else {
                com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("selectionPositionsProvider is null"));
                list = EmptyList.b;
            }
            if (i != -1) {
                arrayList.remove(i);
                this.f.remove(Integer.valueOf(mediaStoreEntry.getId()));
                this.g.remove(Integer.valueOf(mediaStoreEntry.getId()));
                this.h.remove(Integer.valueOf(mediaStoreEntry.getId()));
                this.i.remove(Integer.valueOf(mediaStoreEntry.getId()));
                b.c cVar = this.c;
                if (cVar != null) {
                    cVar.d(mediaStoreEntry);
                    x(list);
                }
                return true;
            }
            b.c cVar2 = this.c;
            if (cVar2 != null) {
                cVar2.d(mediaStoreEntry);
                x(list);
            }
        }
        return false;
    }

    @Override // com.vk.attachpicker.b
    public final void clear() {
        List<Integer> list;
        b.d dVar = this.d;
        if (dVar != null) {
            list = dVar.e();
        } else {
            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("selectionPositionsProvider is null"));
            list = EmptyList.b;
        }
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.i.clear();
        this.l.clear();
        x(list);
    }

    @Override // com.vk.attachpicker.b
    public final int d(MediaStoreEntry mediaStoreEntry) {
        if (mediaStoreEntry == null) {
            return -1;
        }
        Iterator it = this.e.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((MediaStoreEntry) it.next()).getId() == mediaStoreEntry.getId()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.vk.attachpicker.b
    public final boolean e() {
        return h() == 1;
    }

    @Override // com.vk.attachpicker.b
    public final int f(int i, Integer num, MediaStoreEntry mediaStoreEntry) {
        if (!o(i, mediaStoreEntry)) {
            return Integer.MIN_VALUE;
        }
        ArrayList arrayList = this.e;
        if (arrayList.size() == this.a || q(mediaStoreEntry)) {
            return d(mediaStoreEntry);
        }
        if (num == null) {
            arrayList.add(mediaStoreEntry);
        } else {
            arrayList.add(num.intValue(), mediaStoreEntry);
        }
        String lastPathSegment = mediaStoreEntry.f().getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap.containsKey(lastPathSegment)) {
            Object remove = linkedHashMap.remove(lastPathSegment);
            if (remove != null) {
                this.g.put(Integer.valueOf(mediaStoreEntry.getId()), remove);
            }
            MediaStoreEntry mediaStoreEntry2 = (MediaStoreEntry) this.j.remove(lastPathSegment);
            if (mediaStoreEntry2 != null) {
                this.h.put(Integer.valueOf(mediaStoreEntry.getId()), mediaStoreEntry2);
            }
            bmk0 bmk0Var = (bmk0) this.l.remove(lastPathSegment);
            if (bmk0Var != null) {
                this.i.put(Integer.valueOf(mediaStoreEntry.getId()), bmk0Var);
            }
            this.f.put(Integer.valueOf(mediaStoreEntry.getId()), mediaStoreEntry);
        }
        b.c cVar = this.c;
        if (cVar != null) {
            cVar.a(i, mediaStoreEntry);
            x(Collections.singletonList(Integer.valueOf(i)));
        }
        return e43.h(arrayList);
    }

    @Override // com.vk.attachpicker.b
    public final Object g(MediaStoreEntry mediaStoreEntry) {
        return this.g.get(Integer.valueOf(mediaStoreEntry.getId()));
    }

    @Override // com.vk.attachpicker.b
    public final int h() {
        Integer num = this.b;
        return num != null ? num.intValue() : this.a;
    }

    @Override // com.vk.attachpicker.b
    public final void i(List<? extends MediaStoreEntry> list) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.addAll(list);
        x(EmptyList.b);
    }

    @Override // com.vk.attachpicker.b
    public final boolean j(int i) {
        MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) j5g.b0(i, this.e);
        if (mediaStoreEntry == null) {
            return false;
        }
        return c(mediaStoreEntry);
    }

    @Override // com.vk.attachpicker.b
    public final int k() {
        return this.e.size();
    }

    @Override // com.vk.attachpicker.b
    public final MediaStoreEntry l(MediaStoreEntry mediaStoreEntry) {
        return (MediaStoreEntry) this.h.get(Integer.valueOf(mediaStoreEntry.getId()));
    }

    @Override // com.vk.attachpicker.b
    public final void m(b.c cVar) {
        this.c = cVar;
    }

    @Override // com.vk.attachpicker.b
    public final boolean o(int i, MediaStoreEntry mediaStoreEntry) {
        b.c cVar = this.c;
        if (cVar == null) {
            return true;
        }
        return cVar.c(mediaStoreEntry);
    }

    @Override // com.vk.attachpicker.b
    public final void p(b.d dVar) {
        this.d = dVar;
    }

    @Override // com.vk.attachpicker.b
    public final boolean q(MediaStoreEntry mediaStoreEntry) {
        Object obj;
        if (mediaStoreEntry == null) {
            return false;
        }
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((MediaStoreEntry) obj).getId() == mediaStoreEntry.getId()) {
                break;
            }
        }
        return obj != null;
    }

    @Override // com.vk.attachpicker.b
    public final void r(MediaStoreEntry mediaStoreEntry, bmk0 bmk0Var) {
        this.i.put(Integer.valueOf(mediaStoreEntry.getId()), bmk0Var);
    }

    @Override // com.vk.attachpicker.b
    public final MediaStoreEntry s(MediaStoreEntry mediaStoreEntry) {
        return (MediaStoreEntry) this.f.get(Integer.valueOf(mediaStoreEntry.getId()));
    }

    @Override // com.vk.attachpicker.b
    public final void t(MediaStoreEntry mediaStoreEntry, MediaStoreEntry mediaStoreEntry2, Object obj, bmk0 bmk0Var) {
        if (mediaStoreEntry2 instanceof MediaStoreImageEntry) {
            MediaStoreImageEntry mediaStoreImageEntry = (MediaStoreImageEntry) mediaStoreEntry2;
            this.f.put(Integer.valueOf(mediaStoreEntry.getId()), new MediaStoreImageEntry(mediaStoreEntry.getId(), mediaStoreImageEntry.k, mediaStoreEntry.e(), mediaStoreImageEntry.m, mediaStoreImageEntry.n, mediaStoreImageEntry.o, mediaStoreImageEntry.p, mediaStoreImageEntry.q));
            this.g.put(Integer.valueOf(mediaStoreEntry.getId()), obj);
            this.h.put(Integer.valueOf(mediaStoreEntry.getId()), mediaStoreEntry);
            this.i.put(Integer.valueOf(mediaStoreEntry.getId()), bmk0Var);
        }
    }

    @Override // com.vk.attachpicker.b
    public final boolean u(MediaStoreEntry mediaStoreEntry) {
        if (mediaStoreEntry == null) {
            return false;
        }
        return this.f.containsKey(Integer.valueOf(mediaStoreEntry.getId()));
    }

    @Override // com.vk.attachpicker.b
    public final int v() {
        return this.a;
    }

    @Override // com.vk.attachpicker.b
    public final Intent w() {
        Bundle y = y();
        Intent intent = new Intent();
        intent.putExtra("result_attachments", y);
        return intent;
    }

    public final void x(List<Integer> list) {
        p870.f().c(1);
        b.c cVar = this.c;
        if (cVar != null) {
            cVar.b(this.e.size(), list);
        }
    }

    public final Bundle y() {
        boolean z;
        bmk0 bmk0Var;
        ArrayList arrayList = this.e;
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
        boolean[] zArr = new boolean[arrayList.size()];
        boolean[] zArr2 = new boolean[arrayList.size()];
        boolean[] zArr3 = new boolean[arrayList.size()];
        Iterator it = b().iterator();
        int i = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this.i;
            boolean z2 = true;
            if (!hasNext) {
                boolean[] zArr4 = new boolean[arrayList.size()];
                Iterator it2 = b().iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    bmk0 bmk0Var2 = (bmk0) linkedHashMap.get(Integer.valueOf(((MediaStoreEntry) arrayList.get(i2)).getId()));
                    zArr4[i2] = bmk0Var2 != null && bmk0Var2.b;
                    i2 = i3;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("result_files", arrayList2);
                bundle.putBooleanArray("result_video_flags", zArr);
                bundle.putBooleanArray("result_send_as_file_flags", zArr2);
                bundle.putBooleanArray("result_spoiler_mask_flags", zArr3);
                bundle.putBooleanArray("result_donut_flags", zArr4);
                return bundle;
            }
            Object next2 = it.next();
            int i4 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) next2;
            arrayList2.add(mediaStoreEntry.f());
            boolean z3 = mediaStoreEntry instanceof MediaStoreVideoEntry;
            zArr[i] = z3;
            if (!z3) {
                if (mediaStoreEntry.getHeight() + mediaStoreEntry.getWidth() > 24000) {
                    z = true;
                    zArr2[i] = z;
                    bmk0Var = (bmk0) linkedHashMap.get(Integer.valueOf(((MediaStoreEntry) arrayList.get(i)).getId()));
                    if (bmk0Var != null || !bmk0Var.a) {
                        z2 = false;
                    }
                    zArr3[i] = z2;
                    i = i4;
                }
            }
            z = false;
            zArr2[i] = z;
            bmk0Var = (bmk0) linkedHashMap.get(Integer.valueOf(((MediaStoreEntry) arrayList.get(i)).getId()));
            if (bmk0Var != null) {
            }
            z2 = false;
            zArr3[i] = z2;
            i = i4;
        }
    }
}
