package com.vk.stories.design.view.stats.tabs.info.mvi;

import java.util.List;
import xsna.ao50;
import xsna.fi50;
import xsna.fm50;
import xsna.gfm0;
import xsna.h0u0;
import xsna.ifm0;
import xsna.yzt0;

/* compiled from: StoryStatisticsInfoViewState.kt */
/* loaded from: classes6.dex */
public final class g implements ao50 {
    public final fi50 a;

    /* compiled from: StoryStatisticsInfoViewState.kt */
    public static final class a implements fm50<ifm0> {
        public final yzt0<b> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    /* compiled from: StoryStatisticsInfoViewState.kt */
    public static final class b {
        public final boolean a;
        public final List<gfm0> b;
        public final Throwable c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z, List<? extends gfm0> list, Throwable th) {
            this.a = z;
            this.b = list;
            this.c = th;
        }
    }

    public g(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
