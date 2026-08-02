package com.vk.newsfeed.impl.postmodal.reactions.tabs.all;

import java.util.List;
import xsna.fi50;
import xsna.fm50;
import xsna.gh6;
import xsna.h0u0;
import xsna.j8;
import xsna.x130;
import xsna.yzt0;

/* compiled from: ModalPostAllReactionsViewState.kt */
/* loaded from: classes4.dex */
public final class b implements gh6 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;

    /* compiled from: ModalPostAllReactionsViewState.kt */
    public static final class a implements fm50<x130> {
        public static final a a = new a();
    }

    /* compiled from: ModalPostAllReactionsViewState.kt */
    /* renamed from: com.vk.newsfeed.impl.postmodal.reactions.tabs.all.b$b, reason: collision with other inner class name */
    public static final class C1397b implements fm50<x130> {
        public static final C1397b a = new C1397b();
    }

    /* compiled from: ModalPostAllReactionsViewState.kt */
    public static final class c implements fm50<x130> {
        public static final c a = new c();
    }

    /* compiled from: ModalPostAllReactionsViewState.kt */
    public static final class d implements fm50<x130> {
        public final yzt0<List<com.vk.newsfeed.impl.postmodal.reactions.tabs.b>> a;
        public final yzt0<Boolean> b;

        public d(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }
    }

    public b(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModalPostAllReactionsViewState(tabContent=");
        sb.append(this.a);
        sb.append(", empty=");
        sb.append(this.b);
        sb.append(", error=");
        sb.append(this.c);
        sb.append(", loading=");
        return j8.b(sb, this.d, ')');
    }
}
