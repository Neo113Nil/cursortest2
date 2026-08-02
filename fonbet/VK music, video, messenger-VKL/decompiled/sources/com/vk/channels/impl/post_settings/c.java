package com.vk.channels.impl.post_settings;

import xsna.epx;
import xsna.ho8;
import xsna.vl50;

/* compiled from: PostSettingsNavigationEvent.kt */
/* loaded from: classes16.dex */
public abstract class c implements vl50 {

    /* compiled from: PostSettingsNavigationEvent.kt */
    public static final class a extends c {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 46368680;
        }

        public final String toString() {
            return "CloseSettings";
        }
    }

    /* compiled from: PostSettingsNavigationEvent.kt */
    public static final class b extends c {
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
            return ho8.a(new StringBuilder("OpenAddsApp(requestParams="), this.a, ')');
        }
    }

    /* compiled from: PostSettingsNavigationEvent.kt */
    /* renamed from: com.vk.channels.impl.post_settings.c$c, reason: collision with other inner class name */
    public static final class C0541c extends c {
        public static final C0541c a = new C0541c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0541c);
        }

        public final int hashCode() {
            return -616601315;
        }

        public final String toString() {
            return "OpenAddsInfo";
        }
    }
}
