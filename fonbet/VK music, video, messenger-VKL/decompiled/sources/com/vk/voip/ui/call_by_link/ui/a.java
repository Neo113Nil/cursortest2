package com.vk.voip.ui.call_by_link.ui;

import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkViewState;

/* compiled from: VoipCallByLinkViewEvent.kt */
/* loaded from: classes7.dex */
public abstract class a {

    /* compiled from: VoipCallByLinkViewEvent.kt */
    /* renamed from: com.vk.voip.ui.call_by_link.ui.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC2032a extends a {

        /* compiled from: VoipCallByLinkViewEvent.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.ui.a$a$a, reason: collision with other inner class name */
        public static final class C2033a extends AbstractC2032a {
            public static final C2033a a = new C2033a();
        }

        /* compiled from: VoipCallByLinkViewEvent.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.ui.a$a$b */
        public static final class b extends AbstractC2032a {
            public static final b a = new b();
        }

        /* compiled from: VoipCallByLinkViewEvent.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.ui.a$a$c */
        public static abstract class c extends AbstractC2032a {

            /* compiled from: VoipCallByLinkViewEvent.kt */
            /* renamed from: com.vk.voip.ui.call_by_link.ui.a$a$c$a, reason: collision with other inner class name */
            public static final class C2034a extends c {
                public static final C2034a a = new C2034a();
            }

            /* compiled from: VoipCallByLinkViewEvent.kt */
            /* renamed from: com.vk.voip.ui.call_by_link.ui.a$a$c$b */
            public static final class b extends c {
                public static final b a = new b();
            }

            /* compiled from: VoipCallByLinkViewEvent.kt */
            /* renamed from: com.vk.voip.ui.call_by_link.ui.a$a$c$c, reason: collision with other inner class name */
            public static final class C2035c extends c {
                public static final C2035c a = new C2035c();
            }

            /* compiled from: VoipCallByLinkViewEvent.kt */
            /* renamed from: com.vk.voip.ui.call_by_link.ui.a$a$c$d */
            public static final class d extends c {
                public static final d a = new d();
            }

            /* compiled from: VoipCallByLinkViewEvent.kt */
            /* renamed from: com.vk.voip.ui.call_by_link.ui.a$a$c$e */
            public static final class e extends c {
                public static final e a = new e();
            }

            /* compiled from: VoipCallByLinkViewEvent.kt */
            /* renamed from: com.vk.voip.ui.call_by_link.ui.a$a$c$f */
            public static final class f extends c {
                public static final f a = new f();
            }
        }

        /* compiled from: VoipCallByLinkViewEvent.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.ui.a$a$d */
        public static final class d extends AbstractC2032a {
            public static final d a = new d();
        }
    }

    /* compiled from: VoipCallByLinkViewEvent.kt */
    public static abstract class b extends a {

        /* compiled from: VoipCallByLinkViewEvent.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.ui.a$b$a, reason: collision with other inner class name */
        public static final class C2036a extends b {
            public static final C2036a a = new C2036a();
        }

        /* compiled from: VoipCallByLinkViewEvent.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.ui.a$b$b, reason: collision with other inner class name */
        public static final class C2037b extends b {
            public final VoipCallByLinkViewState.MediaSettingDialog.Visible.Setting a;

            public C2037b(VoipCallByLinkViewState.MediaSettingDialog.Visible.Setting setting) {
                this.a = setting;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2037b) && this.a == ((C2037b) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "DisableOnJoinClick(setting=" + this.a + ')';
            }
        }

        /* compiled from: VoipCallByLinkViewEvent.kt */
        public static final class c extends b {
            public final VoipCallByLinkViewState.MediaSettingDialog.Visible.Setting a;

            public c(VoipCallByLinkViewState.MediaSettingDialog.Visible.Setting setting) {
                this.a = setting;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "DisablePermanentClick(setting=" + this.a + ')';
            }
        }

        /* compiled from: VoipCallByLinkViewEvent.kt */
        public static final class d extends b {
            public final VoipCallByLinkViewState.MediaSettingDialog.Visible.Setting a;

            public d(VoipCallByLinkViewState.MediaSettingDialog.Visible.Setting setting) {
                this.a = setting;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a == ((d) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "EnableClick(setting=" + this.a + ')';
            }
        }

        /* compiled from: VoipCallByLinkViewEvent.kt */
        public static final class e extends b {
            public static final e a = new e();
        }
    }
}
