package com.vk.voip.ui.history.friends.ui;

import defpackage.q0;
import java.util.ArrayList;
import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.tr;
import xsna.xpw0;
import xsna.yzt0;

/* compiled from: VoipHistoryFriendsViewState.kt */
/* loaded from: classes7.dex */
public final class b implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: VoipHistoryFriendsViewState.kt */
    public static final class a implements fm50<xpw0.a> {
        public final yzt0<c> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Content(listState="), this.a, ')');
        }
    }

    /* compiled from: VoipHistoryFriendsViewState.kt */
    /* renamed from: com.vk.voip.ui.history.friends.ui.b$b, reason: collision with other inner class name */
    public static final class C2060b implements fm50<xpw0.b> {
        public final yzt0<Throwable> a;

        public C2060b(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2060b) && epx.f(this.a, ((C2060b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Error(throwable="), this.a, ')');
        }
    }

    /* compiled from: VoipHistoryFriendsViewState.kt */
    public static final class c implements fm50<xpw0.a> {
        public final ArrayList a;
        public final boolean b;

        public c(ArrayList arrayList, boolean z) {
            this.a = arrayList;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FriendsList(items=");
            sb.append(this.a);
            sb.append(", reloadingInBackground=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VoipHistoryFriendsViewState.kt */
    public static final class d implements fm50<xpw0.c> {
        public static final d a = new d();
    }

    public b(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
