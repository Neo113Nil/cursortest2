package com.vk.stories.design.view.stats.tabs.viewers.mvi;

import com.vk.dto.common.data.VKList;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;
import java.util.ArrayList;
import java.util.List;
import xsna.ao50;
import xsna.asp;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.sr;
import xsna.tr;
import xsna.vu5;
import xsna.yzt0;
import xsna.zam0;
import xsna.zrp;

/* compiled from: StoryStatisticsViewersViewState.kt */
/* loaded from: classes6.dex */
public final class StoryStatisticsViewersViewState implements ao50 {
    public final fi50 a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoryStatisticsViewersViewState.kt */
    public static final class FullPageState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FullPageState[] $VALUES;
        public static final FullPageState ANONYMOUS_STUB;
        public static final FullPageState EMPTY;
        public static final FullPageState ERROR;
        public static final FullPageState LIST;
        public static final FullPageState LOADING;

        static {
            FullPageState fullPageState = new FullPageState("ERROR", 0);
            ERROR = fullPageState;
            FullPageState fullPageState2 = new FullPageState("LOADING", 1);
            LOADING = fullPageState2;
            FullPageState fullPageState3 = new FullPageState("ANONYMOUS_STUB", 2);
            ANONYMOUS_STUB = fullPageState3;
            FullPageState fullPageState4 = new FullPageState("EMPTY", 3);
            EMPTY = fullPageState4;
            FullPageState fullPageState5 = new FullPageState("LIST", 4);
            LIST = fullPageState5;
            FullPageState[] fullPageStateArr = {fullPageState, fullPageState2, fullPageState3, fullPageState4, fullPageState5};
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

    /* compiled from: StoryStatisticsViewersViewState.kt */
    public static final class a implements fm50<j> {
        public final yzt0<StoryEntry> a;
        public final yzt0<g> b;
        public final yzt0<c> c;
        public final yzt0<List<zam0>> d;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(currentStoryEntry=");
            sb.append(this.a);
            sb.append(", visibilityState=");
            sb.append(this.b);
            sb.append(", listState=");
            sb.append(this.c);
            sb.append(", reactions=");
            return tr.c(sb, this.d, ')');
        }
    }

    /* compiled from: StoryStatisticsViewersViewState.kt */
    public static abstract class b {

        /* compiled from: StoryStatisticsViewersViewState.kt */
        public static final class a extends b {
        }

        /* compiled from: StoryStatisticsViewersViewState.kt */
        /* renamed from: com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersViewState$b$b, reason: collision with other inner class name */
        public static final class C1819b extends b {
            public static final C1819b a = new C1819b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1819b);
            }

            public final int hashCode() {
                return 192567709;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    /* compiled from: StoryStatisticsViewersViewState.kt */
    public static final class c {
        public final d a;
        public final f b;

        public c(d dVar, f fVar) {
            this.a = dVar;
            this.b = fVar;
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
            return "ListState(repliesState=" + this.a + ", usersState=" + this.b + ')';
        }
    }

    /* compiled from: StoryStatisticsViewersViewState.kt */
    public static final class d {
        public final ArrayList<StoriesContainer> a;

        public d(ArrayList<StoriesContainer> arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            ArrayList<StoriesContainer> arrayList = this.a;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("RepliesState(replies="), this.a);
        }
    }

    /* compiled from: StoryStatisticsViewersViewState.kt */
    public static final class e {
        public final int a;
        public final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UsersHeaderState(viewsCount=");
            sb.append(this.a);
            sb.append(", reactionsCount=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: StoryStatisticsViewersViewState.kt */
    public static final class f {
        public final e a;
        public final VKList<StoryUserViewer> b;

        public f(e eVar, VKList<StoryUserViewer> vKList) {
            this.a = eVar;
            this.b = vKList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b);
        }

        public final int hashCode() {
            e eVar = this.a;
            int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
            VKList<StoryUserViewer> vKList = this.b;
            return hashCode + (vKList != null ? vKList.hashCode() : 0);
        }

        public final String toString() {
            return "UsersState(usersHeader=" + this.a + ", users=" + this.b + ')';
        }
    }

    /* compiled from: StoryStatisticsViewersViewState.kt */
    public static final class g {
        public final FullPageState a;
        public final b b;

        public g(FullPageState fullPageState, b bVar) {
            this.a = fullPageState;
            this.b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && epx.f(this.b, gVar.b);
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

    public StoryStatisticsViewersViewState(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
