package com.vk.channels.impl.post_settings;

import com.vk.channels.impl.post_settings.adapter.PostSettingType;
import defpackage.q0;
import java.util.Date;
import xsna.epx;
import xsna.kj50;
import xsna.pp80;

/* compiled from: PostSettingsViewAction.kt */
/* loaded from: classes16.dex */
public abstract class e implements kj50 {

    /* compiled from: PostSettingsViewAction.kt */
    public static final class a extends e {
        public final String b;
        public final String c;
        public final boolean d;

        public a(String str, String str2, boolean z) {
            this.b = str;
            this.c = str2;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            return Boolean.hashCode(this.d) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeAdvertisingOrd(predIdAdvertising=");
            sb.append(this.b);
            sb.append(", erid=");
            sb.append(this.c);
            sb.append(", isAddAdvertisingOrd=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: PostSettingsViewAction.kt */
    public static final class b extends e {
        public final Date b;

        public b(Date date) {
            this.b = date;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "DelayedSendDateChanged(newDate=" + this.b + ')';
        }
    }

    /* compiled from: PostSettingsViewAction.kt */
    public static abstract class c extends e {

        /* compiled from: PostSettingsViewAction.kt */
        public static final class a extends c {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1893947943;
            }

            public final String toString() {
                return "OnCreate";
            }
        }

        /* compiled from: PostSettingsViewAction.kt */
        public static final class b extends c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -888337361;
            }

            public final String toString() {
                return "OnDestroy";
            }
        }
    }

    /* compiled from: PostSettingsViewAction.kt */
    public static final class d extends e {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -177015441;
        }

        public final String toString() {
            return "MarkAdsHighlightClick";
        }
    }

    /* compiled from: PostSettingsViewAction.kt */
    /* renamed from: com.vk.channels.impl.post_settings.e$e, reason: collision with other inner class name */
    public static final class C0542e extends e {
        public final pp80 b;

        public C0542e(pp80 pp80Var) {
            this.b = pp80Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0542e) && epx.f(this.b, ((C0542e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnlyVisibleToDonsValueChanged(visibilityOption=" + this.b + ')';
        }
    }

    /* compiled from: PostSettingsViewAction.kt */
    public static final class f extends e {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1944489735;
        }

        public final String toString() {
            return "PublishPost";
        }
    }

    /* compiled from: PostSettingsViewAction.kt */
    public static final class g extends e {
        public final PostSettingType b;

        public g(PostSettingType postSettingType) {
            this.b = postSettingType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SettingClicked(type=" + this.b + ')';
        }
    }
}
