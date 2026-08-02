package com.vk.im.engine.models.channels;

import com.vk.im.engine.models.channels.ChannelsCounters;
import xsna.shy;
import xsna.vu5;

/* compiled from: ChannelsCountStorageModel.kt */
/* loaded from: classes2.dex */
public final class a {
    public final ChannelsCounters.Type a;
    public final int b;
    public final int c;

    public a(ChannelsCounters.Type type, int i, int i2) {
        this.a = type;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsCountStorageModel(type=");
        sb.append(this.a);
        sb.append(", count=");
        sb.append(this.b);
        sb.append(", phase=");
        return vu5.b(sb, this.c, ')');
    }
}
