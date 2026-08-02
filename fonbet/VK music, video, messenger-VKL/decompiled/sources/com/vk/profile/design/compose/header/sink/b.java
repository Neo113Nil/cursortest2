package com.vk.profile.design.compose.header.sink;

import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import xsna.epx;
import xsna.itj0;
import xsna.zhf0;

/* compiled from: AuthorHeaderEvent.kt */
/* loaded from: classes5.dex */
public final class b implements AuthorHeaderEvent.a {
    public final zhf0 a;

    public b(zhf0 zhf0Var) {
        this.a = zhf0Var;
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
        return itj0.c(new StringBuilder("MiniAvatar(anchorInWindow="), this.a, ')');
    }
}
