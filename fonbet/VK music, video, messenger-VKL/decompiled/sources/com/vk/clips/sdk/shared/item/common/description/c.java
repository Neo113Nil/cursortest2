package com.vk.clips.sdk.shared.item.common.description;

import xsna.epx;
import xsna.ho8;

/* compiled from: DescriptionViewEvent.kt */
/* loaded from: classes17.dex */
public interface c {

    /* compiled from: DescriptionViewEvent.kt */
    public static final class a implements c {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -192754851;
        }

        public final String toString() {
            return "CollapseClicked";
        }
    }

    /* compiled from: DescriptionViewEvent.kt */
    public static final class b implements c {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2037704848;
        }

        public final String toString() {
            return "ExpandClicked";
        }
    }

    /* compiled from: DescriptionViewEvent.kt */
    /* renamed from: com.vk.clips.sdk.shared.item.common.description.c$c, reason: collision with other inner class name */
    public static final class C0669c implements c {
        public final String a;

        public C0669c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0669c) && epx.f(this.a, ((C0669c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("HashtagClicked(hashtag="), this.a, ')');
        }
    }

    /* compiled from: DescriptionViewEvent.kt */
    public static final class d implements c {
        public final String a;

        public d(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("LinkClicked(url="), this.a, ')');
        }
    }

    /* compiled from: DescriptionViewEvent.kt */
    public static final class e implements c {
        public final String a;

        public e(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("MentionClicked(mention="), this.a, ')');
        }
    }
}
