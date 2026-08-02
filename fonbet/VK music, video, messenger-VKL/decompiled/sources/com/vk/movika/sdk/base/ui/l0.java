package com.vk.movika.sdk.base.ui;

import com.vk.movika.sdk.base.model.Chapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bh10;
import xsna.c5g;
import xsna.epx;
import xsna.fw3;
import xsna.gp;
import xsna.gsi0;
import xsna.i5s;
import xsna.qoy;
import xsna.vq;
import xsna.xe9;

/* loaded from: classes3.dex */
public final class l0 {
    public final com.vk.movika.sdk.base.model.s a;
    public final Chapter b;
    public final Chapter c;
    public final boolean d;
    public final List<com.vk.movika.sdk.base.model.f> e;
    public final List<com.vk.movika.sdk.base.model.f> f;
    public final List<com.vk.movika.sdk.base.model.i> g;
    public final long h;
    public final boolean i;
    public final com.vk.movika.sdk.base.model.o j;
    public final a k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    public static final class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final List<com.vk.movika.sdk.base.model.f> i;
        public final List<com.vk.movika.sdk.base.model.f> j;
        public final List<com.vk.movika.sdk.base.model.k> k;
        public final List<com.vk.movika.sdk.base.model.k> l;
        public final String m;

        public a() {
            this(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(a aVar, boolean z, boolean z2, List list, ArrayList arrayList, List list2, List list3, String str, int i) {
            boolean z3 = (i & 1) != 0 ? aVar.a : true;
            boolean z4 = (i & 2) != 0 ? aVar.b : true;
            boolean z5 = (i & 4) != 0 ? aVar.c : z;
            boolean z6 = (i & 8) != 0 ? aVar.d : true;
            boolean z7 = (i & 16) != 0 ? aVar.e : true;
            boolean z8 = (i & 32) != 0 ? aVar.f : z2;
            boolean z9 = (i & 64) != 0 ? aVar.g : true;
            boolean z10 = (i & 128) != 0 ? aVar.h : true;
            List list4 = (i & 256) != 0 ? aVar.i : list;
            List list5 = (i & 512) != 0 ? aVar.j : arrayList;
            List list6 = (i & 1024) != 0 ? aVar.k : list2;
            List list7 = (i & 2048) != 0 ? aVar.l : list3;
            String str2 = (i & 4096) != 0 ? aVar.m : str;
            aVar.getClass();
            return new a(z3, z4, z5, z6, z7, z8, z9, z10, list4, list5, list6, list7, str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k) && epx.f(this.l, aVar.l) && epx.f(this.m, aVar.m);
        }

        public final int hashCode() {
            int a = fw3.a(fw3.a(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
            List<com.vk.movika.sdk.base.model.k> list = this.k;
            int a2 = fw3.a((a + (list == null ? 0 : list.hashCode())) * 31, 31, this.l);
            String str = this.m;
            return a2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder c = gp.c("ActionState(wasSetHistory=", ", showChapterStarted=", ", playNextChapter=", this.a, this.b);
            gsi0.c(c, this.c, ", seekToChapterStart=", this.d, ", isSeeking=");
            gsi0.c(c, this.e, ", isEndOfEndChapter=", this.f, ", isStartOfFirstChapter=");
            gsi0.c(c, this.g, ", isGameEnd=", this.h, ", notifyContainersStart=");
            vq.d(c, this.i, ", notifyContainersEnd=", this.j, ", eventBlames=");
            vq.d(c, this.k, ", notifyLockedContainerEvent=", this.l, ", openURI=");
            return i5s.a(c, this.m, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, List<com.vk.movika.sdk.base.model.f> list, List<com.vk.movika.sdk.base.model.f> list2, List<? extends com.vk.movika.sdk.base.model.k> list3, List<? extends com.vk.movika.sdk.base.model.k> list4, String str) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
            this.f = z6;
            this.g = z7;
            this.h = z8;
            this.i = list;
            this.j = list2;
            this.k = list3;
            this.l = list4;
            this.m = str;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(int i) {
            this(false, false, false, false, false, false, false, false, r9, r9, null, r9, null);
            EmptyList emptyList = EmptyList.b;
        }
    }

    public l0() {
        this(null, null, null, false, null, 0L, null, 16383);
    }

    public static l0 a(l0 l0Var, Chapter chapter, Chapter chapter2, boolean z, List list, List list2, long j, boolean z2, com.vk.movika.sdk.base.model.o oVar, a aVar, boolean z3, boolean z4, boolean z5, int i) {
        return new l0(l0Var.a, (i & 2) != 0 ? l0Var.b : chapter, (i & 4) != 0 ? l0Var.c : chapter2, (i & 8) != 0 ? l0Var.d : z, (i & 16) != 0 ? l0Var.e : list, l0Var.f, (i & 64) != 0 ? l0Var.g : list2, (i & 128) != 0 ? l0Var.h : j, (i & 256) != 0 ? l0Var.i : z2, (i & 512) != 0 ? l0Var.j : oVar, (i & 1024) != 0 ? l0Var.k : aVar, (i & 2048) != 0 ? l0Var.l : z3, (i & 4096) != 0 ? l0Var.m : z4, (i & 8192) != 0 ? l0Var.n : z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return epx.f(this.a, l0Var.a) && epx.f(this.b, l0Var.b) && epx.f(this.c, l0Var.c) && this.d == l0Var.d && epx.f(this.e, l0Var.e) && epx.f(this.f, l0Var.f) && epx.f(this.g, l0Var.g) && this.h == l0Var.h && this.i == l0Var.i && epx.f(this.j, l0Var.j) && epx.f(this.k, l0Var.k) && this.l == l0Var.l && this.m == l0Var.m && this.n == l0Var.n;
    }

    public final int hashCode() {
        com.vk.movika.sdk.base.model.s sVar = this.a;
        int hashCode = (sVar == null ? 0 : sVar.hashCode()) * 31;
        Chapter chapter = this.b;
        int hashCode2 = (hashCode + (chapter == null ? 0 : chapter.a.hashCode())) * 31;
        Chapter chapter2 = this.c;
        int b = qoy.b(bh10.a(fw3.a(fw3.a(fw3.a(qoy.b((hashCode2 + (chapter2 == null ? 0 : chapter2.a.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        com.vk.movika.sdk.base.model.o oVar = this.j;
        return Boolean.hashCode(this.n) + qoy.b(qoy.b((this.k.hashCode() + ((b + (oVar != null ? oVar.hashCode() : 0)) * 31)) * 31, 31, this.l), 31, this.m);
    }

    public final String toString() {
        com.vk.movika.sdk.base.model.u uVar;
        com.vk.movika.sdk.base.model.s sVar = this.a;
        String str = (sVar == null || (uVar = sVar.a) == null) ? null : uVar.a;
        Chapter chapter = this.b;
        String str2 = chapter != null ? chapter.a : null;
        Chapter chapter2 = this.c;
        String str3 = chapter2 != null ? chapter2.a : null;
        List<com.vk.movika.sdk.base.model.f> list = this.e;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.vk.movika.sdk.base.model.f) it.next()).a);
        }
        StringBuilder a2 = xe9.a("GameState(\n\tmanifest.id = ", str, ",\n\tcurrentChapter.id = ", str2, ",\n\tnextChapter.id = ");
        a2.append(str3);
        a2.append(",\n\tisPause = ");
        a2.append(this.d);
        a2.append(",\n\tshowingContainers.ids = ");
        a2.append(arrayList);
        a2.append(",\n\tstartAt = ");
        a2.append(this.h);
        a2.append(",\n\tisPausePlayback = ");
        a2.append(this.i);
        a2.append(",\n\tisLoopEnabled = ");
        a2.append(this.l);
        a2.append(",\n\tactionState = ");
        a2.append(this.k);
        a2.append(",\n\thistory = ");
        a2.append(this.j);
        a2.append(",\n\tisSeekToPreviousInProgress = ");
        a2.append(this.n);
        a2.append(")");
        return a2.toString();
    }

    public l0(com.vk.movika.sdk.base.model.s sVar, Chapter chapter, Chapter chapter2, boolean z, List<com.vk.movika.sdk.base.model.f> list, List<com.vk.movika.sdk.base.model.f> list2, List<com.vk.movika.sdk.base.model.i> list3, long j, boolean z2, com.vk.movika.sdk.base.model.o oVar, a aVar, boolean z3, boolean z4, boolean z5) {
        this.a = sVar;
        this.b = chapter;
        this.c = chapter2;
        this.d = z;
        this.e = list;
        this.f = list2;
        this.g = list3;
        this.h = j;
        this.i = z2;
        this.j = oVar;
        this.k = aVar;
        this.l = z3;
        this.m = z4;
        this.n = z5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l0(com.vk.movika.sdk.base.model.s sVar, Chapter chapter, Chapter chapter2, boolean z, ArrayList arrayList, long j, a aVar, int i) {
        this(r4, r5, r6, r7, r8, r9, r9, (i & 128) != 0 ? 0L : j, false, null, (i & 1024) != 0 ? new a(0) : aVar, false, false, false);
        com.vk.movika.sdk.base.model.s sVar2 = (i & 1) != 0 ? null : sVar;
        Chapter chapter3 = (i & 2) != 0 ? null : chapter;
        Chapter chapter4 = (i & 4) != 0 ? null : chapter2;
        boolean z2 = (i & 8) != 0 ? false : z;
        List list = (i & 16) != 0 ? EmptyList.b : arrayList;
        EmptyList emptyList = EmptyList.b;
    }
}
