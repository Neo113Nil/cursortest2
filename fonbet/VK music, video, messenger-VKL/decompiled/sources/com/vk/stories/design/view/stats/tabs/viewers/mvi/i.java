package com.vk.stories.design.view.stats.tabs.viewers.mvi;

import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;
import xsna.epx;
import xsna.gzs;
import xsna.s3q0;
import xsna.tlo0;
import xsna.uf3;
import xsna.vu5;

/* compiled from: StoryStatisticsViewersSideEffect.kt */
/* loaded from: classes6.dex */
public abstract class i {

    /* compiled from: StoryStatisticsViewersSideEffect.kt */
    public static final class a extends i {
        public final StoryUserViewer a;

        public a(StoryUserViewer storyUserViewer) {
            this.a = storyUserViewer;
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
            return "OpenUserDialog(storyUserViewer=" + this.a + ')';
        }
    }

    /* compiled from: StoryStatisticsViewersSideEffect.kt */
    public static final class b extends i {
        public final StoryUserViewer a;

        public b(StoryUserViewer storyUserViewer) {
            this.a = storyUserViewer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenUserProfile(storyUserViewer=" + this.a + ')';
        }
    }

    /* compiled from: StoryStatisticsViewersSideEffect.kt */
    public static final class c extends i {
        public final tlo0 a;
        public final tlo0 b;
        public final gzs<s3q0> c;

        public c(gzs gzsVar, tlo0.f fVar, tlo0 tlo0Var) {
            this.a = tlo0Var;
            this.b = fVar;
            this.c = gzsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            tlo0 tlo0Var = this.b;
            int hashCode2 = (hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
            gzs<s3q0> gzsVar = this.c;
            return hashCode2 + (gzsVar != null ? gzsVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowSnackbar(text=");
            sb.append(this.a);
            sb.append(", buttonText=");
            sb.append(this.b);
            sb.append(", buttonClickListener=");
            return uf3.d(sb, this.c, ')');
        }
    }

    /* compiled from: StoryStatisticsViewersSideEffect.kt */
    public static final class d extends i {
        public final StoryUserViewer a;
        public final int b;

        public d(StoryUserViewer storyUserViewer, int i) {
            this.a = storyUserViewer;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowUserActions(storyUserViewer=");
            sb.append(this.a);
            sb.append(", adapterPosition=");
            return vu5.b(sb, this.b, ')');
        }
    }
}
