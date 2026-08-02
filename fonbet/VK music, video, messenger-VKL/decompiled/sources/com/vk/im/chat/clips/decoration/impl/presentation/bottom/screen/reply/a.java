package com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply;

import com.vk.dto.attaches.Attach;
import com.vk.dto.messages.MsgTextFormat;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.kj50;
import xsna.ly30;

/* compiled from: ChatClipsReplyAction.kt */
/* loaded from: classes2.dex */
public interface a extends kj50 {

    /* compiled from: ChatClipsReplyAction.kt */
    /* renamed from: com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.a$a, reason: collision with other inner class name */
    public static final class C1097a implements a {
        public static final C1097a b = new C1097a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1097a);
        }

        public final int hashCode() {
            return -1547528507;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: ChatClipsReplyAction.kt */
    public static final class b implements a {
        public final String b;
        public final MsgTextFormat c;
        public final List<Attach> d;
        public final ly30 e;

        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, MsgTextFormat msgTextFormat, List<? extends Attach> list, ly30 ly30Var) {
            this.b = str;
            this.c = msgTextFormat;
            this.d = list;
            this.e = ly30Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + fw3.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
        }

        public final String toString() {
            return "SendMessage(text=" + this.b + ", textFormat=" + this.c + ", attaches=" + this.d + ", msgSendConfig=" + this.e + ')';
        }
    }
}
