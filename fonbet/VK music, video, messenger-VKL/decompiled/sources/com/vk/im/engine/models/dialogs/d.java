package com.vk.im.engine.models.dialogs;

import com.vk.im.engine.models.dialogs.DialogsCounters;
import xsna.shy;
import xsna.vu5;

/* compiled from: DialogsCountStorageModel.kt */
/* loaded from: classes.dex */
public final class d {
    public final DialogsCounters.Type a;
    public final int b;
    public final int c;

    public d(DialogsCounters.Type type, int i, int i2) {
        this.a = type;
        this.b = i;
        this.c = i2;
    }

    public static d a(d dVar, int i) {
        DialogsCounters.Type type = dVar.a;
        int i2 = dVar.c;
        dVar.getClass();
        return new d(type, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsCountStorageModel(type=");
        sb.append(this.a);
        sb.append(", count=");
        sb.append(this.b);
        sb.append(", phase=");
        return vu5.b(sb, this.c, ')');
    }
}
