package com.vk.music.playlist.display.domain;

import com.vkontakte.android.R;

/* compiled from: DisplayMusicPlaylistSnackbarEvent.kt */
/* loaded from: classes3.dex */
public interface h {

    /* compiled from: DisplayMusicPlaylistSnackbarEvent.kt */
    public static abstract class a implements h {
        public final int a;

        /* compiled from: DisplayMusicPlaylistSnackbarEvent.kt */
        /* renamed from: com.vk.music.playlist.display.domain.h$a$a, reason: collision with other inner class name */
        public static final class C1349a extends a {
            public static final C1349a b = new C1349a(R.string.music_player_snack_bar_common_error);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1349a);
            }

            public final int hashCode() {
                return 704397763;
            }

            public final String toString() {
                return "CommonError";
            }
        }

        /* compiled from: DisplayMusicPlaylistSnackbarEvent.kt */
        public static final class b extends a {
            public static final b b = new b(R.string.music_player_snack_bar_internet_connection_problems);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 602178132;
            }

            public final String toString() {
                return "NetworkError";
            }
        }

        public a(int i) {
            this.a = i;
        }
    }
}
