package com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply;

import com.vk.im.engine.models.dialogs.Dialog;
import xsna.epx;
import xsna.xl50;

/* compiled from: ChatClipsReplyPatch.kt */
/* loaded from: classes2.dex */
public interface f extends xl50 {

    /* compiled from: ChatClipsReplyPatch.kt */
    public static final class a implements f {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 943323544;
        }

        public final String toString() {
            return "MsgSentPatch";
        }
    }

    /* compiled from: ChatClipsReplyPatch.kt */
    public static final class b implements f {
        public final Dialog b;

        public b(Dialog dialog) {
            this.b = dialog;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateDialogPatch(dialog=" + this.b + ')';
        }
    }
}
