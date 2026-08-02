package com.vk.censoredsettings.presentation.obscenetext;

import defpackage.q0;
import xsna.km50;

/* compiled from: ObsceneTextFilterState.kt */
/* loaded from: classes16.dex */
public abstract class e implements km50 {

    /* compiled from: ObsceneTextFilterState.kt */
    public static final class a extends e {
        public final boolean b;

        public a(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("Content(isObsceneTextFilterEnabled="), this.b, ')');
        }
    }

    /* compiled from: ObsceneTextFilterState.kt */
    public static final class b extends e {
        public static final b b = new b();
    }
}
