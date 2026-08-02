package com.vk.movika.sdk.base.model.history;

import com.vk.movika.sdk.base.model.n;
import com.vk.movika.sdk.base.model.p;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.xe9;

/* loaded from: classes3.dex */
public final class c {
    public final String a;
    public final String b;
    public final String c;
    public final List<p> d;
    public final List<String> e;
    public final List<a> f;

    public c(String str, List list, List list2, List list3, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
        this.f = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c a(c cVar, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i) {
        String str2 = cVar.a;
        String str3 = cVar.b;
        if ((i & 4) != 0) {
            str = cVar.c;
        }
        String str4 = str;
        List list = arrayList;
        if ((i & 8) != 0) {
            list = cVar.d;
        }
        List list2 = list;
        List list3 = arrayList2;
        if ((i & 16) != 0) {
            list3 = cVar.e;
        }
        List list4 = list3;
        List list5 = arrayList3;
        if ((i & 32) != 0) {
            list5 = cVar.f;
        }
        cVar.getClass();
        return new c(str2, list2, list4, list5, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return epx.f(this.a, ((c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder a = xe9.a("Session(id=", this.a, ", startDate=", this.b, ", updateOn=");
        b.c(this.c, ", visitedChapters=", ", completedContainerIds=", a, this.d);
        return n.b(a, this.e, ", branches=", this.f, ")");
    }
}
