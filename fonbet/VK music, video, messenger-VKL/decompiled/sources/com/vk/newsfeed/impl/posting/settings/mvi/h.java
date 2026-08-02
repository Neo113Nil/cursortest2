package com.vk.newsfeed.impl.posting.settings.mvi;

import java.util.List;
import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.plc0;
import xsna.tr;
import xsna.yzt0;

/* compiled from: PostingSettingsViewState.kt */
/* loaded from: classes4.dex */
public final class h implements ao50 {
    public final fi50 a;

    /* compiled from: PostingSettingsViewState.kt */
    public static final class a implements fm50<PostingSettingsState> {
        public final yzt0<List<plc0>> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
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
            return tr.c(new StringBuilder("Data(settingItems="), this.a, ')');
        }
    }

    public h(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
