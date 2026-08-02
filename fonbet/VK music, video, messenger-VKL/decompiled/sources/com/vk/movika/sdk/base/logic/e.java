package com.vk.movika.sdk.base.logic;

import com.vk.movika.sdk.base.model.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.xe9;

/* loaded from: classes3.dex */
public final class e {
    public final String a;
    public final String b;
    public final List<String> c;
    public final Set<String> d;
    public final Set<com.vk.movika.sdk.base.model.d> e;
    public final Set<String> f;
    public final String g;
    public final long h;
    public final boolean i;
    public final o j;
    public final boolean k;

    public e() {
        this(null, null, null, null, null, 0L, null, false, 2047);
    }

    public static e a(e eVar, String str, String str2, List list, Set set, Set set2, Set set3, String str3, long j, boolean z, o oVar, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = eVar.a;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            str2 = eVar.b;
        }
        String str5 = str2;
        List list2 = (i & 4) != 0 ? eVar.c : list;
        Set set4 = (i & 8) != 0 ? eVar.d : set;
        Set set5 = (i & 16) != 0 ? eVar.e : set2;
        Set set6 = (i & 32) != 0 ? eVar.f : set3;
        String str6 = (i & 64) != 0 ? eVar.g : str3;
        long j2 = (i & 128) != 0 ? eVar.h : j;
        boolean z3 = (i & 256) != 0 ? eVar.i : z;
        o oVar2 = (i & 512) != 0 ? eVar.j : oVar;
        boolean z4 = (i & 1024) != 0 ? eVar.k : z2;
        eVar.getClass();
        return new e(str4, str5, list2, set4, set5, set6, str6, j2, z3, oVar2, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        e eVar = (e) obj;
        return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d) && epx.f(this.e, eVar.e) && epx.f(this.f, eVar.f) && epx.f(this.g, eVar.g) && this.h == eVar.h && this.i == eVar.i && this.k == eVar.k;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int b = fw3.b(fw3.b(fw3.b(fw3.a((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str3 = this.g;
        return Boolean.hashCode(this.k) + qoy.b(bh10.a((b + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder a = xe9.a("GameLogicState(manifestId=", this.a, ", currentChapterId=", this.b, ", showingContainerIds=");
        a.append(this.c);
        a.append(", containerIdsToSkip=");
        a.append(this.d);
        a.append(", completedContainers=");
        a.append(this.e);
        a.append(", completedEpisodeIds=");
        a.append(this.f);
        a.append(", nextChapterId=");
        a.append(this.g);
        a.append(", currentChapterTime=");
        a.append(this.h);
        a.append(", isPausePlayback=");
        a.append(this.i);
        a.append(", history=");
        a.append(this.j);
        a.append(", isSeekToPreviousInProgress=");
        a.append(this.k);
        a.append(")");
        return a.toString();
    }

    public e(String str, String str2, List<String> list, Set<String> set, Set<com.vk.movika.sdk.base.model.d> set2, Set<String> set3, String str3, long j, boolean z, o oVar, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = set;
        this.e = set2;
        this.f = set3;
        this.g = str3;
        this.h = j;
        this.i = z;
        this.j = oVar;
        this.k = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(String str, String str2, ArrayList arrayList, Set set, String str3, long j, o oVar, boolean z, int i) {
        this(r4, r5, r6, r7, r7, (i & 32) != 0 ? r7 : set, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? 0L : j, false, (i & 512) != 0 ? null : oVar, (i & 1024) != 0 ? false : z);
        String str4 = (i & 1) != 0 ? null : str;
        String str5 = (i & 2) != 0 ? null : str2;
        List list = (i & 4) != 0 ? EmptyList.b : arrayList;
        EmptySet emptySet = EmptySet.b;
    }
}
