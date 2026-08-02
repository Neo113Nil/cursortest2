package com.vk.movika.sdk.base.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import xsna.epx;
import xsna.fw3;
import xsna.kr;
import xsna.qoy;
import xsna.xe9;

/* loaded from: classes3.dex */
public final class o {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final boolean e;
    public final Set<String> f;
    public final List<com.vk.movika.sdk.base.model.history.c> g;
    public final List<c> h;

    public o(String str, String str2, String str3, Integer num, boolean z, Set<String> set, List<com.vk.movika.sdk.base.model.history.c> list, List<c> list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = z;
        this.f = set;
        this.g = list;
        this.h = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o a(o oVar, Set set, ArrayList arrayList, List list, int i) {
        String str = oVar.a;
        String str2 = oVar.b;
        String str3 = oVar.c;
        Integer num = oVar.d;
        boolean z = (i & 16) != 0 ? oVar.e : true;
        if ((i & 32) != 0) {
            set = oVar.f;
        }
        Set set2 = set;
        List list2 = arrayList;
        if ((i & 64) != 0) {
            list2 = oVar.g;
        }
        List list3 = list2;
        if ((i & 128) != 0) {
            list = oVar.h;
        }
        oVar.getClass();
        return new o(str, str2, str3, num, z, set2, list3, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return epx.f(this.a, oVar.a) && epx.f(this.b, oVar.b) && epx.f(this.c, oVar.c) && epx.f(this.d, oVar.d) && this.e == oVar.e && epx.f(this.f, oVar.f) && epx.f(this.g, oVar.g) && epx.f(this.h, oVar.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        return this.h.hashCode() + fw3.a(fw3.b(qoy.b((hashCode3 + (num != null ? num.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder a = xe9.a("History(id=", this.a, ", manifestId=", this.b, ", manifestVersion=");
        kr.b(this.d, this.c, ", manifestBuild=", ", isCompleted=", a);
        a.append(this.e);
        a.append(", completedContainerIds=");
        a.append(this.f);
        a.append(", sessions=");
        return n.b(a, this.g, ", chapterPlaybackHistory=", this.h, ")");
    }
}
