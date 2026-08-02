package com.vk.movika.sdk.base.model;

import java.util.ArrayList;
import kotlin.collections.EmptyList;
import xsna.epx;

/* loaded from: classes3.dex */
public final class h {
    public static final a Companion = new a();
    public final String a;
    public final ArrayList b;
    public final long c;
    public final Long d;

    public static final class a {
    }

    static {
        EmptyList emptyList = EmptyList.b;
    }

    public h(String str, ArrayList arrayList, long j, Long l) {
        this.a = str;
        this.b = arrayList;
        this.c = j;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (h.class.equals(obj != null ? obj.getClass() : null)) {
            return epx.f(this.a, ((h) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Episode(id=" + this.a + ", containerIds=" + this.b + ", startTime=" + this.c + ", endTime=" + this.d + ")";
    }
}
