package com.vk.clips.editor.state.model;

import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.ms9;
import xsna.wzd;

/* compiled from: HistoryStateItem.kt */
/* loaded from: classes16.dex */
public final class d {
    public static final d c = new d(a.h, EmptyList.b);
    public final a a;
    public final List<wzd> b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(a aVar, List<? extends wzd> list) {
        this.a = aVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryStateItem(state=");
        sb.append(this.a);
        sb.append(", sideEffects=");
        return ms9.a(')', sb, this.b);
    }
}
