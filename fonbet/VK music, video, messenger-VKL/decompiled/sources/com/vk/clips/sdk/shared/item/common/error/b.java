package com.vk.clips.sdk.shared.item.common.error;

import xsna.epx;
import xsna.ho8;
import xsna.r3q0;
import xsna.vu5;

/* compiled from: ErrorOverlayState.kt */
/* loaded from: classes17.dex */
public interface b extends r3q0 {

    /* compiled from: ErrorOverlayState.kt */
    public static final class a implements b {
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
            return ho8.a(new StringBuilder("Hidden(uniqueKey="), this.a, ')');
        }
    }

    /* compiled from: ErrorOverlayState.kt */
    /* renamed from: com.vk.clips.sdk.shared.item.common.error.b$b, reason: collision with other inner class name */
    public static final class C0670b implements b {
        public final String a;
        public final int b;

        public C0670b(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0670b)) {
                return false;
            }
            C0670b c0670b = (C0670b) obj;
            return epx.f(this.a, c0670b.a) && this.b == c0670b.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Visible(uniqueKey=");
            sb.append(this.a);
            sb.append(", titleRes=");
            return vu5.b(sb, this.b, ')');
        }
    }
}
