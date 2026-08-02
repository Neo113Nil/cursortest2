package com.vk.stories.design.view.stats.tabs.info.mvi;

import com.vk.dto.stories.model.StoryEntry;
import com.vk.story.viewer.stat.domain.LoadStrategy;
import xsna.epx;
import xsna.kj50;

/* compiled from: StoryStatisticsInfoAction.kt */
/* loaded from: classes6.dex */
public abstract class a implements kj50 {

    /* compiled from: StoryStatisticsInfoAction.kt */
    /* renamed from: com.vk.stories.design.view.stats.tabs.info.mvi.a$a, reason: collision with other inner class name */
    public static final class C1808a extends a {
        public final LoadStrategy b;

        public C1808a(LoadStrategy loadStrategy) {
            this.b = loadStrategy;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1808a) && this.b == ((C1808a) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ReloadCurrentStoryStat(loadStrategy=" + this.b + ')';
        }
    }

    /* compiled from: StoryStatisticsInfoAction.kt */
    public static final class b extends a {
        public final StoryEntry b;

        public b(StoryEntry storyEntry) {
            this.b = storyEntry;
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
            return "StoryChanged(storyEntry=" + this.b + ')';
        }
    }
}
