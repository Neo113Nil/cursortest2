package com.vk.channels.impl.channel_screen.footer;

import defpackage.q0;
import xsna.ao50;
import xsna.epx;
import xsna.shy;

/* compiled from: ChannelFooterViewState.kt */
/* loaded from: classes16.dex */
public abstract class k implements ao50 {

    /* compiled from: ChannelFooterViewState.kt */
    public static final class a extends k {
        public final int a;
        public final int b;
        public final boolean c;

        public a(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ban(banMsgResId=");
            sb.append(this.a);
            sb.append(", endDate=");
            sb.append(this.b);
            sb.append(", isBanReasonVisible=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ChannelFooterViewState.kt */
    public static final class b extends k {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2007452697;
        }

        public final String toString() {
            return "Deactivated";
        }
    }

    /* compiled from: ChannelFooterViewState.kt */
    public static final class c extends k {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2020784714;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: ChannelFooterViewState.kt */
    public static final class d extends k {
        public final l a;
        public final boolean b;

        public d(l lVar, boolean z) {
            this.a = lVar;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Main(button=");
            sb.append(this.a);
            sb.append(", isPostponedButtonAvailable=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: ChannelFooterViewState.kt */
    public static final class e extends k {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1182865927;
        }

        public final String toString() {
            return "Unavailable";
        }
    }
}
