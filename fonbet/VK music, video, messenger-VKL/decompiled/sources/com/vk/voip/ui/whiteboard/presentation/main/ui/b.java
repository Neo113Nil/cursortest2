package com.vk.voip.ui.whiteboard.presentation.main.ui;

import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.ho8;
import xsna.jlx0;
import xsna.qlx0;
import xsna.sr;
import xsna.tr;
import xsna.yzt0;

/* compiled from: WhiteboardViewState.kt */
/* loaded from: classes7.dex */
public final class b implements ao50 {
    public final fi50 a;

    /* compiled from: WhiteboardViewState.kt */
    public static final class a implements fm50<qlx0> {
        public final yzt0<jlx0> a;
        public final yzt0<Boolean> b;
        public final yzt0<Boolean> c;
        public final yzt0<InterfaceC2093b> d;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(actions=");
            sb.append(this.a);
            sb.append(", isCallMenuExpanded=");
            sb.append(this.b);
            sb.append(", isWhiteboardMenuOpened=");
            sb.append(this.c);
            sb.append(", whiteboardState=");
            return tr.c(sb, this.d, ')');
        }
    }

    /* compiled from: WhiteboardViewState.kt */
    /* renamed from: com.vk.voip.ui.whiteboard.presentation.main.ui.b$b, reason: collision with other inner class name */
    public interface InterfaceC2093b {

        /* compiled from: WhiteboardViewState.kt */
        /* renamed from: com.vk.voip.ui.whiteboard.presentation.main.ui.b$b$a */
        public static final class a implements InterfaceC2093b {
            public static final a a = new a();
        }

        /* compiled from: WhiteboardViewState.kt */
        /* renamed from: com.vk.voip.ui.whiteboard.presentation.main.ui.b$b$b, reason: collision with other inner class name */
        public static final class C2094b implements InterfaceC2093b {
            public final String a;

            public C2094b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2094b) && epx.f(this.a, ((C2094b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("WhiteboardByHash(whiteboardHash="), this.a, ')');
            }
        }

        /* compiled from: WhiteboardViewState.kt */
        /* renamed from: com.vk.voip.ui.whiteboard.presentation.main.ui.b$b$c */
        public static final class c implements InterfaceC2093b {
            public final String a;

            public c(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("WhiteboardByLink(whiteboardLink="), this.a, ')');
            }
        }
    }

    public b(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
