package com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply;

import com.vk.im.engine.models.dialogs.Dialog;
import xsna.epx;
import xsna.km50;

/* compiled from: ChatClipsReplyMviState.kt */
/* loaded from: classes2.dex */
public interface e extends km50 {

    /* compiled from: ChatClipsReplyMviState.kt */
    public static final class a implements e {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1538685450;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: ChatClipsReplyMviState.kt */
    public static final class b implements e {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1812245633;
        }

        public final String toString() {
            return "MsgSent";
        }
    }

    /* compiled from: ChatClipsReplyMviState.kt */
    public static final class c implements e {
        public final Dialog b;

        public c(Dialog dialog) {
            this.b = dialog;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateDialog(dialog=" + this.b + ')';
        }
    }
}
