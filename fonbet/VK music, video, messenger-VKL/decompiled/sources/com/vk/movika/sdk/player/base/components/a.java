package com.vk.movika.sdk.player.base.components;

import xsna.mj80;
import xsna.opt0;

/* loaded from: classes3.dex */
public final class a {
    public final mj80 a;
    public final mj80 b;
    public final mj80 c;
    public final mj80 d;
    public final opt0 e;

    public a(mj80 mj80Var, mj80 mj80Var2, mj80 mj80Var3, mj80 mj80Var4, opt0 opt0Var) {
        this.a = mj80Var;
        this.b = mj80Var2;
        this.c = mj80Var3;
        this.d = mj80Var4;
        this.e = opt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 961);
    }

    public final String toString() {
        return "PlayerComponents(playbackController=" + this.a + ", timePointsController=" + this.b + ", videoController=" + this.c + ", playerErrorController=" + this.d + ", preLoader=null, playerItemResolver=" + this.e + ")";
    }
}
