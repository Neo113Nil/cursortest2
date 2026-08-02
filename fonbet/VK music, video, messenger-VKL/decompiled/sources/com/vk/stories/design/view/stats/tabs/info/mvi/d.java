package com.vk.stories.design.view.stats.tabs.info.mvi;

import com.vk.dto.stories.model.StoryEntry;
import xsna.c3m0;
import xsna.epx;
import xsna.oq;
import xsna.vu5;
import xsna.xl50;

/* compiled from: StoryStatisticsInfoPatch.kt */
/* loaded from: classes6.dex */
public abstract class d implements xl50 {

    /* compiled from: StoryStatisticsInfoPatch.kt */
    public static final class a extends d {
        public final int b;

        public a(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("FullStatCached(storyId="), this.b, ')');
        }
    }

    /* compiled from: StoryStatisticsInfoPatch.kt */
    public static final class b extends d {
        public final c3m0 b;

        public b(c3m0 c3m0Var) {
            this.b = c3m0Var;
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
            return "FullStatLoaded(storyFullStatContainer=" + this.b + ')';
        }
    }

    /* compiled from: StoryStatisticsInfoPatch.kt */
    public static final class c extends d {
        public final Throwable b;

        public c(Throwable th) {
            this.b = th;
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
            return oq.c(new StringBuilder("LoadFailed(throwable="), this.b, ')');
        }
    }

    /* compiled from: StoryStatisticsInfoPatch.kt */
    /* renamed from: com.vk.stories.design.view.stats.tabs.info.mvi.d$d, reason: collision with other inner class name */
    public static final class C1809d extends d {
        public static final C1809d b = new C1809d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1809d);
        }

        public final int hashCode() {
            return -482600519;
        }

        public final String toString() {
            return "StartLoading";
        }
    }

    /* compiled from: StoryStatisticsInfoPatch.kt */
    public static final class e extends d {
        public final StoryEntry b;

        public e(StoryEntry storyEntry) {
            this.b = storyEntry;
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
            return "StoryChanged(storyEntry=" + this.b + ')';
        }
    }
}
