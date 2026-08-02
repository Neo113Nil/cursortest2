package com.vk.profile.design.compose.header;

import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.wow;

/* compiled from: AuthorHeaderConfig.kt */
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: AuthorHeaderConfig.kt */
    /* renamed from: com.vk.profile.design.compose.header.a$a, reason: collision with other inner class name */
    public static final class C1660a implements a {
        public final List a;

        public C1660a(List list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1660a) && epx.f(this.a, ((C1660a) obj).a);
        }

        public final int hashCode() {
            return Integer.hashCode(0) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DefaultAvatar(urls=" + ((Object) wow.c(this.a)) + ", initialPageIndex=0)";
        }
    }

    /* compiled from: AuthorHeaderConfig.kt */
    public static final class b implements a {
        public final String a;

        public b(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("Empty(url="), this.a, ')');
        }
    }
}
