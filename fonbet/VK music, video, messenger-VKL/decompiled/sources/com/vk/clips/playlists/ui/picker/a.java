package com.vk.clips.playlists.ui.picker;

import xsna.epx;
import xsna.ho8;
import xsna.kj50;

/* compiled from: ClipsPlaylistPickerAction.kt */
/* loaded from: classes16.dex */
public interface a extends kj50 {

    /* compiled from: ClipsPlaylistPickerAction.kt */
    /* renamed from: com.vk.clips.playlists.ui.picker.a$a, reason: collision with other inner class name */
    public static final class C0631a implements a {
        public static final C0631a b = new C0631a();
    }

    /* compiled from: ClipsPlaylistPickerAction.kt */
    public static final class b implements a {
        public static final b b = new b();
    }

    /* compiled from: ClipsPlaylistPickerAction.kt */
    public interface c extends a {

        /* compiled from: ClipsPlaylistPickerAction.kt */
        /* renamed from: com.vk.clips.playlists.ui.picker.a$c$a, reason: collision with other inner class name */
        public static final class C0632a implements c {
            public final String b;

            public C0632a(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0632a) && epx.f(this.b, ((C0632a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("ClipClick(videoId="), this.b, ')');
            }
        }
    }

    /* compiled from: ClipsPlaylistPickerAction.kt */
    public static final class d implements a {
        public static final d b = new d();
    }

    /* compiled from: ClipsPlaylistPickerAction.kt */
    public static final class e implements a {
        public static final e b = new e();
    }
}
