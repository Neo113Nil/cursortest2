package com.vk.profile.design.compose.header.sink;

import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import xsna.epx;
import xsna.ho8;

/* compiled from: AuthorHeaderEvent.kt */
/* loaded from: classes5.dex */
public final class a implements AuthorHeaderEvent.a {
    public final String a;

    public a(String str) {
        this.a = str;
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
        return ho8.a(new StringBuilder("ImageStatus(status="), this.a, ')');
    }
}
