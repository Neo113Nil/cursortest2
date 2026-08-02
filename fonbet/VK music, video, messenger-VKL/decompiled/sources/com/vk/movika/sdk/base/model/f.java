package com.vk.movika.sdk.base.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.epx;
import xsna.msy;
import xsna.xe9;

/* loaded from: classes3.dex */
public final class f implements k {
    public final String a;
    public final String b;
    public final long c;
    public final Long d;
    public final r e;
    public final String f;
    public final ArrayList g;
    public final com.vk.movika.sdk.base.model.actions.a h;
    public final String i;
    public final List<j> j;
    public final Object k = msy.a(LazyThreadSafetyMode.NONE, new e(this, 0));

    public f(String str, String str2, long j, Long l, r rVar, String str3, ArrayList arrayList, com.vk.movika.sdk.base.model.actions.a aVar, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = l;
        this.e = rVar;
        this.f = str3;
        this.g = arrayList;
        this.h = aVar;
        this.i = str4;
        this.j = list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.movika.sdk.base.model.k
    public final List<j> b() {
        return (List) this.k.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        f fVar = (f) obj;
        return epx.f(this.a, fVar.a) && epx.f(this.f, fVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a = xe9.a("Container(id=", this.a, ", parentChapterId=", this.b, ", startTime=");
        a.append(this.c);
        a.append(", endTime=");
        a.append(this.d);
        a.append(", layout=");
        a.append(this.e);
        a.append(", type=");
        a.append(this.f);
        a.append(", controls=");
        a.append(this.g);
        a.append(", containerAction=");
        a.append(this.h);
        a.append(", props=");
        a.append(this.i);
        a.append(", selfEvents=");
        a.append(this.j);
        a.append(")");
        return a.toString();
    }
}
