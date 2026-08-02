package com.vk.im.channelcreation.impl;

import xsna.epx;
import xsna.oq;
import xsna.yn50;

/* compiled from: ChannelCreationViewEvent.kt */
/* loaded from: classes2.dex */
public abstract class i implements yn50 {

    /* compiled from: ChannelCreationViewEvent.kt */
    public static final class a extends i {
        public static final a a = new a();
    }

    /* compiled from: ChannelCreationViewEvent.kt */
    public static final class b extends i {
        public static final b a = new b();
    }

    /* compiled from: ChannelCreationViewEvent.kt */
    public static final class c extends i {
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
            return oq.c(new StringBuilder("ShowError(throwable="), this.a, ')');
        }
    }

    /* compiled from: ChannelCreationViewEvent.kt */
    public static final class d extends i {
        public final e a;

        public d(e eVar) {
            this.a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowPopup(popup=" + this.a + ')';
        }
    }
}
