package com.vk.uxpolls.presentation.js.model;

import com.vk.uxpolls.api.models.UxPollsPoll;
import com.vk.uxpolls.presentation.js.model.VKWebAppEventData;
import java.util.List;
import xsna.epx;
import xsna.ms9;

/* compiled from: UxPollsPollState.kt */
/* loaded from: classes6.dex */
public final class a {
    public final UxPollsPoll a;
    public final List<VKWebAppEventData.VKWebAppUXPollsConfig.Translation> b;

    public a(UxPollsPoll uxPollsPoll, List<VKWebAppEventData.VKWebAppUXPollsConfig.Translation> list) {
        this.a = uxPollsPoll;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UxPollsPollState(poll=");
        sb.append(this.a);
        sb.append(", translations=");
        return ms9.a(')', sb, this.b);
    }
}
