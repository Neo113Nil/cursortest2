package com.vk.clips.sdk.shared.item.static_ads;

import xsna.asp;
import xsna.cut0;
import xsna.epx;
import xsna.ixp0;
import xsna.jxk0;
import xsna.xl50;
import xsna.zrp;

/* compiled from: StaticAdsItemPatch.kt */
/* loaded from: classes17.dex */
public interface StaticAdsItemPatch extends xl50 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StaticAdsItemPatch.kt */
    public static final class UpdateStaticAdFocused implements StaticAdsItemPatch {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UpdateStaticAdFocused[] $VALUES;
        public static final UpdateStaticAdFocused FOCUSED;
        public static final UpdateStaticAdFocused UNFOCUSED;

        static {
            UpdateStaticAdFocused updateStaticAdFocused = new UpdateStaticAdFocused("FOCUSED", 0);
            FOCUSED = updateStaticAdFocused;
            UpdateStaticAdFocused updateStaticAdFocused2 = new UpdateStaticAdFocused("UNFOCUSED", 1);
            UNFOCUSED = updateStaticAdFocused2;
            UpdateStaticAdFocused[] updateStaticAdFocusedArr = {updateStaticAdFocused, updateStaticAdFocused2};
            $VALUES = updateStaticAdFocusedArr;
            $ENTRIES = new asp(updateStaticAdFocusedArr);
        }

        public UpdateStaticAdFocused() {
            throw null;
        }

        public static UpdateStaticAdFocused valueOf(String str) {
            return (UpdateStaticAdFocused) Enum.valueOf(UpdateStaticAdFocused.class, str);
        }

        public static UpdateStaticAdFocused[] values() {
            return (UpdateStaticAdFocused[]) $VALUES.clone();
        }
    }

    /* compiled from: StaticAdsItemPatch.kt */
    public interface a extends StaticAdsItemPatch {

        /* compiled from: StaticAdsItemPatch.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.static_ads.StaticAdsItemPatch$a$a, reason: collision with other inner class name */
        public static final class C0683a implements a {
            public static final C0683a b = new C0683a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0683a);
            }

            public final int hashCode() {
                return 56320788;
            }

            public final String toString() {
                return "Activated";
            }
        }

        /* compiled from: StaticAdsItemPatch.kt */
        public static final class b implements a {
            public final cut0 b;
            public final cut0 c;

            public b(cut0 cut0Var, cut0 cut0Var2) {
                this.b = cut0Var;
                this.c = cut0Var2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "ColorsLoaded(activeBackgroundColor=" + this.b + ", activeTextColor=" + this.c + ')';
            }
        }
    }

    /* compiled from: StaticAdsItemPatch.kt */
    public interface b extends StaticAdsItemPatch {

        /* compiled from: StaticAdsItemPatch.kt */
        public interface a extends b {

            /* compiled from: StaticAdsItemPatch.kt */
            /* renamed from: com.vk.clips.sdk.shared.item.static_ads.StaticAdsItemPatch$b$a$a, reason: collision with other inner class name */
            public static final class C0684a implements a {
                public final jxk0 b;
                public final ixp0 c;

                public C0684a(jxk0 jxk0Var, ixp0 ixp0Var) {
                    this.b = jxk0Var;
                    this.c = ixp0Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0684a)) {
                        return false;
                    }
                    C0684a c0684a = (C0684a) obj;
                    return epx.f(this.b, c0684a.b) && epx.f(this.c, c0684a.c);
                }

                public final int hashCode() {
                    return this.c.hashCode() + (this.b.hashCode() * 31);
                }

                public final String toString() {
                    return "Full(adsState=" + this.b + ", uiVisibilityConfig=" + this.c + ')';
                }
            }

            /* compiled from: StaticAdsItemPatch.kt */
            /* renamed from: com.vk.clips.sdk.shared.item.static_ads.StaticAdsItemPatch$b$a$b, reason: collision with other inner class name */
            public static final class C0685b implements a {
                public final jxk0 b;

                public C0685b(jxk0 jxk0Var) {
                    this.b = jxk0Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0685b) && epx.f(this.b, ((C0685b) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "Payload(adsState=" + this.b + ')';
                }
            }
        }

        /* compiled from: StaticAdsItemPatch.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.static_ads.StaticAdsItemPatch$b$b, reason: collision with other inner class name */
        public static final class C0686b implements b {
            public static final C0686b b = new C0686b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0686b);
            }

            public final int hashCode() {
                return -2037003832;
            }

            public final String toString() {
                return "Unbind";
            }
        }
    }

    /* compiled from: StaticAdsItemPatch.kt */
    public interface c extends StaticAdsItemPatch {

        /* compiled from: StaticAdsItemPatch.kt */
        public static final class a implements c {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 392760968;
            }

            public final String toString() {
                return "Collapse";
            }
        }

        /* compiled from: StaticAdsItemPatch.kt */
        public static final class b implements c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -85867467;
            }

            public final String toString() {
                return "Expand";
            }
        }
    }

    /* compiled from: StaticAdsItemPatch.kt */
    public static final class d implements StaticAdsItemPatch {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -521437285;
        }

        public final String toString() {
            return "Initial";
        }
    }

    /* compiled from: StaticAdsItemPatch.kt */
    public static final class e implements StaticAdsItemPatch {
        public final ixp0 b;

        public e(ixp0 ixp0Var) {
            this.b = ixp0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateUIVisibilityConfig(config=" + this.b + ')';
        }
    }
}
