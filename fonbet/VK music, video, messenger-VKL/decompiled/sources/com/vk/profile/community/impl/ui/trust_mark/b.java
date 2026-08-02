package com.vk.profile.community.impl.ui.trust_mark;

import xsna.epx;
import xsna.ho8;

/* compiled from: CommunityTrustMarksEvent.kt */
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: CommunityTrustMarksEvent.kt */
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
            return ho8.a(new StringBuilder("OnPhoneClick(phone="), this.a, ')');
        }
    }

    /* compiled from: CommunityTrustMarksEvent.kt */
    /* renamed from: com.vk.profile.community.impl.ui.trust_mark.b$b, reason: collision with other inner class name */
    public static final class C1629b implements b {
        public static final C1629b a = new C1629b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1629b);
        }

        public final int hashCode() {
            return -1189248524;
        }

        public final String toString() {
            return "OnShowAllLinksClick";
        }
    }

    /* compiled from: CommunityTrustMarksEvent.kt */
    public static final class c implements b {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -570807270;
        }

        public final String toString() {
            return "OnYClientsClick";
        }
    }
}
