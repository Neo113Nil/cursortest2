package com.vk.clips.playlists.ui.picker;

import xsna.epx;
import xsna.uve;

/* compiled from: ClipsPlaylistPickerSideEffect.kt */
/* loaded from: classes16.dex */
public interface e {

    /* compiled from: ClipsPlaylistPickerSideEffect.kt */
    public static final class a implements e {
        public final uve a;

        public a(uve uveVar) {
            this.a = uveVar;
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
            return "Snackbar(config=" + this.a + ')';
        }
    }
}
