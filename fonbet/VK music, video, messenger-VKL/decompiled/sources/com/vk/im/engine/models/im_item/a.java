package com.vk.im.engine.models.im_item;

import xsna.epx;
import xsna.n23;
import xsna.qoy;
import xsna.shy;
import xsna.x7w;

/* compiled from: ImItemHistory.kt */
/* loaded from: classes2.dex */
public final class a {
    public final x7w a;
    public final x7w b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public a(x7w x7wVar, x7w x7wVar2, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.a = x7wVar;
        this.b = x7wVar2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public static a a(a aVar, x7w x7wVar, x7w x7wVar2, int i) {
        if ((i & 1) != 0) {
            x7wVar = aVar.a;
        }
        x7w x7wVar3 = x7wVar;
        if ((i & 2) != 0) {
            x7wVar2 = aVar.b;
        }
        return new a(x7wVar3, x7wVar2, aVar.c, aVar.d, (i & 16) != 0 ? aVar.e : false, aVar.f, aVar.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g;
    }

    public final int hashCode() {
        x7w x7wVar = this.a;
        int hashCode = (x7wVar == null ? 0 : x7wVar.hashCode()) * 31;
        x7w x7wVar2 = this.b;
        return Boolean.hashCode(this.g) + qoy.b(qoy.b(shy.a(this.d, shy.a(this.c, (hashCode + (x7wVar2 != null ? x7wVar2.hashCode() : 0)) * 31, 31), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Meta { minDialogsWeight=");
        x7w x7wVar = this.a;
        sb.append(x7wVar != null ? b.a(x7wVar) : null);
        sb.append(", minChannelsWeight=");
        x7w x7wVar2 = this.b;
        sb.append(x7wVar2 != null ? b.a(x7wVar2) : null);
        sb.append(", dialogsPhase=");
        sb.append(this.c);
        sb.append(", channelsPhase=");
        sb.append(this.d);
        sb.append(", historyFull = ");
        sb.append(this.e);
        sb.append(", hasDialogsError=");
        sb.append(this.f);
        sb.append(", hasChannelsError=");
        return n23.b(sb, this.g, " }");
    }
}
