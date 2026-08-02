package com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply;

import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.e;
import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.tr;
import xsna.yzt0;

/* compiled from: ChatClipsReplyViewState.kt */
/* loaded from: classes2.dex */
public final class h implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: ChatClipsReplyViewState.kt */
    public static final class a implements fm50<e.a> {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 72430325;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: ChatClipsReplyViewState.kt */
    public static final class b implements fm50<e.b> {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1093693108;
        }

        public final String toString() {
            return "MsgSent";
        }
    }

    /* compiled from: ChatClipsReplyViewState.kt */
    public static final class c implements fm50<e.c> {
        public final yzt0<Boolean> a;

        public c(h0u0 h0u0Var) {
            this.a = h0u0Var;
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
            return tr.c(new StringBuilder("UpdateDialog(canReply="), this.a, ')');
        }
    }

    public h(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var2;
        this.b = fi50Var3;
    }
}
