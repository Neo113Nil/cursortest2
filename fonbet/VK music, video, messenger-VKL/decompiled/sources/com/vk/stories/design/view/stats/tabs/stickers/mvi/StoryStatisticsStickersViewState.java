package com.vk.stories.design.view.stats.tabs.stickers.mvi;

import com.vk.dto.common.data.VKList;
import com.vk.dto.stories.model.StoryEntry;
import xsna.ao50;
import xsna.asp;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.qoy;
import xsna.sr;
import xsna.tr;
import xsna.ual0;
import xsna.val0;
import xsna.vu5;
import xsna.yzt0;
import xsna.zrp;

/* compiled from: StoryStatisticsStickersViewState.kt */
/* loaded from: classes6.dex */
public final class StoryStatisticsStickersViewState implements ao50 {
    public final fi50 a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoryStatisticsStickersViewState.kt */
    public static final class FullPageState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FullPageState[] $VALUES;
        public static final FullPageState EMPTY;
        public static final FullPageState ERROR;
        public static final FullPageState LIST;
        public static final FullPageState LOADING;

        static {
            FullPageState fullPageState = new FullPageState("ERROR", 0);
            ERROR = fullPageState;
            FullPageState fullPageState2 = new FullPageState("LOADING", 1);
            LOADING = fullPageState2;
            FullPageState fullPageState3 = new FullPageState("EMPTY", 2);
            EMPTY = fullPageState3;
            FullPageState fullPageState4 = new FullPageState("LIST", 3);
            LIST = fullPageState4;
            FullPageState[] fullPageStateArr = {fullPageState, fullPageState2, fullPageState3, fullPageState4};
            $VALUES = fullPageStateArr;
            $ENTRIES = new asp(fullPageStateArr);
        }

        public FullPageState() {
            throw null;
        }

        public static FullPageState valueOf(String str) {
            return (FullPageState) Enum.valueOf(FullPageState.class, str);
        }

        public static FullPageState[] values() {
            return (FullPageState[]) $VALUES.clone();
        }
    }

    /* compiled from: StoryStatisticsStickersViewState.kt */
    public static final class a implements fm50<k> {
        public final yzt0<StoryEntry> a;
        public final yzt0<f> b;
        public final yzt0<c> c;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + sr.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(currentStoryEntry=");
            sb.append(this.a);
            sb.append(", visibilityState=");
            sb.append(this.b);
            sb.append(", listState=");
            return tr.c(sb, this.c, ')');
        }
    }

    /* compiled from: StoryStatisticsStickersViewState.kt */
    public static abstract class b {

        /* compiled from: StoryStatisticsStickersViewState.kt */
        public static final class a extends b {
        }

        /* compiled from: StoryStatisticsStickersViewState.kt */
        /* renamed from: com.vk.stories.design.view.stats.tabs.stickers.mvi.StoryStatisticsStickersViewState$b$b, reason: collision with other inner class name */
        public static final class C1810b extends b {
            public static final C1810b a = new C1810b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1810b);
            }

            public final int hashCode() {
                return 1907847577;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    /* compiled from: StoryStatisticsStickersViewState.kt */
    public static final class c {
        public final d a;
        public final e b;

        public c(d dVar, e eVar) {
            this.a = dVar;
            this.b = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ListState(pollState=" + this.a + ", questionsState=" + this.b + ')';
        }
    }

    /* compiled from: StoryStatisticsStickersViewState.kt */
    public static final class d {
        public final ual0 a;

        public d(ual0 ual0Var) {
            this.a = ual0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            ual0 ual0Var = this.a;
            if (ual0Var == null) {
                return 0;
            }
            return ual0Var.b.hashCode();
        }

        public final String toString() {
            return "PollState(poll=" + this.a + ')';
        }
    }

    /* compiled from: StoryStatisticsStickersViewState.kt */
    public static final class e {
        public final VKList<val0> a;
        public final boolean b;
        public final int c;

        public e(int i, VKList vKList, boolean z) {
            this.a = vKList;
            this.b = z;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c;
        }

        public final int hashCode() {
            VKList<val0> vKList = this.a;
            return Integer.hashCode(this.c) + qoy.b((vKList == null ? 0 : vKList.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QuestionsState(questions=");
            sb.append(this.a);
            sb.append(", isMultiSelectMode=");
            sb.append(this.b);
            sb.append(", selectedCount=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: StoryStatisticsStickersViewState.kt */
    public static final class f {
        public final FullPageState a;
        public final b b;

        public f(FullPageState fullPageState, b bVar) {
            this.a = fullPageState;
            this.b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && epx.f(this.b, fVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            b bVar = this.b;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public final String toString() {
            return "VisibilityState(fullPage=" + this.a + ", footer=" + this.b + ')';
        }
    }

    public StoryStatisticsStickersViewState(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
