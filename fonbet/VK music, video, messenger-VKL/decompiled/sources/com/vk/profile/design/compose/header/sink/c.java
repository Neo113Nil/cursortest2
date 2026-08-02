package com.vk.profile.design.compose.header.sink;

import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;

/* compiled from: AuthorHeaderEvent.kt */
/* loaded from: classes5.dex */
public final class c implements AuthorHeaderEvent.a {
    public final AuthorHeaderConfig.Header.Main.Name.Default.Verification a;

    public c(AuthorHeaderConfig.Header.Main.Name.Default.Verification verification) {
        this.a = verification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a == ((c) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Verification(verification=" + this.a + ')';
    }
}
