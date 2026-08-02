package com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion;

import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.OpinionStickerState;
import xsna.dt80;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;

/* compiled from: OpinionStickerViewState.kt */
/* loaded from: classes6.dex */
public final class h {
    public final String a;
    public final String b;
    public final OpinionStickerState.OpinionPrivacy c;
    public final boolean d;
    public final boolean e;
    public final dt80 f;

    public h(String str, String str2, OpinionStickerState.OpinionPrivacy opinionPrivacy, boolean z, boolean z2, dt80 dt80Var) {
        this.a = str;
        this.b = str2;
        this.c = opinionPrivacy;
        this.d = z;
        this.e = z2;
        this.f = dt80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return epx.f(this.a, hVar.a) && epx.f(this.b, hVar.b) && this.c == hVar.c && this.d == hVar.d && this.e == hVar.e && epx.f(this.f, hVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + qoy.b(qoy.b((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "OpinionViewData(title=" + this.a + ", text=" + this.b + ", privacy=" + this.c + ", isLoading=" + this.d + ", hasError=" + this.e + ", style=" + this.f + ')';
    }
}
