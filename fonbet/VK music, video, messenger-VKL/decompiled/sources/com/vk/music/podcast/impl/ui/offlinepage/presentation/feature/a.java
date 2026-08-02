package com.vk.music.podcast.impl.ui.offlinepage.presentation.feature;

import com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState;
import xsna.epx;
import xsna.ho8;
import xsna.lj50;

/* compiled from: OfflinePodcastEpisodesMviAction.kt */
/* loaded from: classes3.dex */
public interface a extends lj50 {

    /* compiled from: OfflinePodcastEpisodesMviAction.kt */
    /* renamed from: com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.a$a, reason: collision with other inner class name */
    public static final class C1352a implements a {
        public final OfflinePodcastEpisodesMviState.SortType b;

        public C1352a(OfflinePodcastEpisodesMviState.SortType sortType) {
            this.b = sortType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1352a) && this.b == ((C1352a) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ChangeSort(sortType=" + this.b + ')';
        }
    }

    /* compiled from: OfflinePodcastEpisodesMviAction.kt */
    public static final class b implements a {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2091105960;
        }

        public final String toString() {
            return "DeleteAllEpisodes";
        }
    }

    /* compiled from: OfflinePodcastEpisodesMviAction.kt */
    public static final class c implements a {
        public final String b;

        public c(String str) {
            this.b = str;
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
            return ho8.a(new StringBuilder("DeleteEpisode(mid="), this.b, ')');
        }
    }

    /* compiled from: OfflinePodcastEpisodesMviAction.kt */
    public static final class d implements a {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -762625598;
        }

        public final String toString() {
            return "NavigateUp";
        }
    }

    /* compiled from: OfflinePodcastEpisodesMviAction.kt */
    public static final class e implements a {
        public final String b;

        public e(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("PlayEpisode(mid="), this.b, ')');
        }
    }
}
