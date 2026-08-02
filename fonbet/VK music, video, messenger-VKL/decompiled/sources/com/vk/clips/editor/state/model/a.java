package com.vk.clips.editor.state.model;

import com.vk.clips.editor.state.model.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.fw3;
import xsna.j5g;
import xsna.kyd;
import xsna.l4p;
import xsna.nzd;
import xsna.pwd;
import xsna.yzd;

/* compiled from: ClipsEditorState.kt */
/* loaded from: classes16.dex */
public final class a {
    public static final a h;
    public final nzd a;
    public final yzd b;
    public final List<c> c;
    public final ClipsEditorAudioItem d;
    public final List<List<ClipsEditorAudioItem>> e;
    public final List<List<b>> f;
    public final pwd g;

    /* compiled from: ClipsEditorState.kt */
    /* renamed from: com.vk.clips.editor.state.model.a$a, reason: collision with other inner class name */
    public static final class C0580a {
        public static ArrayList a(List list) {
            List<List> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (List list3 : list2) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list3) {
                    if (!((ClipsEditorAudioItem) obj).e) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.add(arrayList2);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!((List) next).isEmpty()) {
                    arrayList3.add(next);
                }
            }
            return arrayList3;
        }
    }

    static {
        EmptyList emptyList = EmptyList.b;
        h = new a(nzd.d, yzd.f, emptyList, null, emptyList, emptyList, pwd.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(nzd nzdVar, yzd yzdVar, List<c> list, ClipsEditorAudioItem clipsEditorAudioItem, List<? extends List<ClipsEditorAudioItem>> list2, List<? extends List<b>> list3, pwd pwdVar) {
        this.a = nzdVar;
        this.b = yzdVar;
        this.c = list;
        this.d = clipsEditorAudioItem;
        this.e = list2;
        this.f = list3;
        this.g = pwdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a c(a aVar, yzd yzdVar, ArrayList arrayList, ClipsEditorAudioItem clipsEditorAudioItem, List list, List list2, pwd pwdVar, int i) {
        yzd yzdVar2 = yzdVar;
        nzd nzdVar = aVar.a;
        if ((i & 2) != 0) {
            yzdVar2 = aVar.b;
        }
        List list3 = arrayList;
        if ((i & 4) != 0) {
            list3 = aVar.c;
        }
        if ((i & 8) != 0) {
            clipsEditorAudioItem = aVar.d;
        }
        if ((i & 16) != 0) {
            list = aVar.e;
        }
        if ((i & 32) != 0) {
            list2 = aVar.f;
        }
        if ((i & 64) != 0) {
            pwdVar = aVar.g;
        }
        pwd pwdVar2 = pwdVar;
        aVar.getClass();
        List list4 = list2;
        List list5 = list;
        ClipsEditorAudioItem clipsEditorAudioItem2 = clipsEditorAudioItem;
        return new a(nzdVar, yzdVar2, list3, clipsEditorAudioItem2, list5, list4, pwdVar2);
    }

    public final ClipsEditorAudioItem a(String str) {
        ClipsEditorAudioItem clipsEditorAudioItem = this.d;
        return epx.f(clipsEditorAudioItem != null ? clipsEditorAudioItem.f : null, str) ? clipsEditorAudioItem : (ClipsEditorAudioItem) l4p.a(str, this.e);
    }

    public final Long b(long j, String str) {
        Object obj;
        Long g;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Collections.singletonList(this.c));
        arrayList.addAll(Collections.singletonList(e43.m(this.d)));
        arrayList.addAll(this.e);
        arrayList.addAll(this.f);
        Iterator it = c5g.v(arrayList).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((kyd) obj).m(), str)) {
                break;
            }
        }
        kyd kydVar = (kyd) obj;
        if (kydVar != null && (g = g(kydVar)) != null) {
            long longValue = g.longValue();
            if (j >= kydVar.getDurationMs() + longValue) {
                return Long.valueOf((kydVar.getDurationMs() + longValue) - 2);
            }
            if (j <= longValue) {
                return g;
            }
        }
        return null;
    }

    public final kyd d(String str) {
        c j = j(str);
        if (j != null) {
            return j;
        }
        ClipsEditorAudioItem a = a(str);
        return a != null ? a : (b) l4p.a(str, this.f);
    }

    public final long e() {
        Iterator<T> it = this.c.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((c) it.next()).getDurationMs();
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
    }

    public final ArrayList f() {
        List<c> list = this.c;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((c) it.next()).q);
        }
        return arrayList;
    }

    public final Long g(kyd kydVar) {
        if (kydVar instanceof c) {
            return i(((c) kydVar).j);
        }
        if (kydVar.getOffset() instanceof e.b) {
            return Long.valueOf(((e.b) kydVar.getOffset()).a + 1);
        }
        return null;
    }

    public final Long h(int i) {
        List<c> list = this.c;
        if (i >= list.size()) {
            return null;
        }
        Iterator it = j5g.H0(list, i).iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((c) it.next()).getDurationMs();
        }
        return Long.valueOf(j + 1);
    }

    public final int hashCode() {
        int a = fw3.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        ClipsEditorAudioItem clipsEditorAudioItem = this.d;
        return this.g.hashCode() + fw3.a(fw3.a((a + (clipsEditorAudioItem == null ? 0 : clipsEditorAudioItem.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    public final Long i(String str) {
        Object obj;
        List<c> list = this.c;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((c) obj).j, str)) {
                break;
            }
        }
        if (obj == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (epx.f(((c) obj2).j, str)) {
                break;
            }
            arrayList.add(obj2);
        }
        Iterator it2 = arrayList.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((c) it2.next()).getDurationMs();
        }
        return Long.valueOf(j + 1);
    }

    public final c j(String str) {
        Object obj;
        Iterator<T> it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((c) obj).j, str)) {
                break;
            }
        }
        return (c) obj;
    }

    public final String toString() {
        return "ClipsEditorState(properties=" + this.a + ", status=" + this.b + ", videoDataList=" + this.c + ", licensedMusic=" + this.d + ", audioItems=" + this.e + ", stickerItems=" + this.f + ", aspectRatioProperties=" + this.g + ')';
    }
}
