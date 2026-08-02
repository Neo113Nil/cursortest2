package com.vk.stickers.settings;

import xsna.epx;
import xsna.km50;
import xsna.p6l0;

/* compiled from: StickerSettingsState.kt */
/* loaded from: classes6.dex */
public interface f extends km50 {

    /* compiled from: StickerSettingsState.kt */
    public static final class a implements f {
        public final p6l0 b;

        public a(p6l0 p6l0Var) {
            this.b = p6l0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "LoadedSettingsState(data=" + this.b + ')';
        }
    }

    /* compiled from: StickerSettingsState.kt */
    public static final class b implements f {
        public static final b b = new b();
    }
}
