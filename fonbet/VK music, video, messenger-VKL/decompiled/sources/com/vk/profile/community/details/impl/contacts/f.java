package com.vk.profile.community.details.impl.contacts;

import xsna.epx;
import xsna.oq;
import xsna.uqi;

/* compiled from: CommunityAddContactsSideEffect.kt */
/* loaded from: classes5.dex */
public interface f {

    /* compiled from: CommunityAddContactsSideEffect.kt */
    public static final class a implements f {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -218629144;
        }

        public final String toString() {
            return "ContactsSaved";
        }
    }

    /* compiled from: CommunityAddContactsSideEffect.kt */
    public static final class b implements f {
        public final Integer a;

        public b(Integer num) {
            this.a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            Integer num = this.a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return uqi.b(new StringBuilder("OpenSelectCityScreen(currentSelectedId="), this.a, ')');
        }
    }

    /* compiled from: CommunityAddContactsSideEffect.kt */
    public static final class c implements f {
        public final Throwable a;

        public c(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("ShowErrorToast(error="), this.a, ')');
        }
    }
}
