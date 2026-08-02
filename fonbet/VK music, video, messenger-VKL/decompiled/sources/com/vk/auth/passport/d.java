package com.vk.auth.passport;

import xsna.epx;
import xsna.pzd0;

/* compiled from: VkPassportContract.kt */
/* loaded from: classes15.dex */
public abstract class d {

    /* compiled from: VkPassportContract.kt */
    public static final class a extends d {
        public final pzd0 a;

        public a(pzd0 pzd0Var) {
            this.a = pzd0Var;
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
            return "WithProfile(profileData=" + this.a + ')';
        }
    }
}
