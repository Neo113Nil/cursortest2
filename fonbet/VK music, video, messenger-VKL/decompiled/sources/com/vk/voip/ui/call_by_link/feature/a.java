package com.vk.voip.ui.call_by_link.feature;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.kj50;

/* compiled from: VoipCallByLinkAction.kt */
/* loaded from: classes7.dex */
public abstract class a implements kj50 {

    /* compiled from: VoipCallByLinkAction.kt */
    /* renamed from: com.vk.voip.ui.call_by_link.feature.a$a, reason: collision with other inner class name */
    public static final class C2014a extends a {
        public static final C2014a b = new C2014a();
    }

    /* compiled from: VoipCallByLinkAction.kt */
    public static abstract class b extends a {

        /* compiled from: VoipCallByLinkAction.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.feature.a$b$a, reason: collision with other inner class name */
        public static final class C2015a extends b {
            public static final C2015a b = new C2015a();
        }

        /* compiled from: VoipCallByLinkAction.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.feature.a$b$b, reason: collision with other inner class name */
        public static final class C2016b extends b {
            public final UserId b;

            public C2016b(UserId userId) {
                this.b = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2016b) && epx.f(this.b, ((C2016b) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("SelectGroup(groupId="), this.b, ')');
            }
        }
    }

    /* compiled from: VoipCallByLinkAction.kt */
    public static abstract class c extends a {

        /* compiled from: VoipCallByLinkAction.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.feature.a$c$a, reason: collision with other inner class name */
        public static final class C2017a extends c {
            public static final C2017a b = new C2017a();
        }

        /* compiled from: VoipCallByLinkAction.kt */
        public static final class b extends c {
            public static final b b = new b();
        }

        /* compiled from: VoipCallByLinkAction.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.feature.a$c$c, reason: collision with other inner class name */
        public static final class C2018c extends c {
            public static final C2018c b = new C2018c();
        }
    }

    /* compiled from: VoipCallByLinkAction.kt */
    public static final class d extends a {
        public static final d b = new d();
    }

    /* compiled from: VoipCallByLinkAction.kt */
    public static final class e extends a {
        public static final e b = new e();
    }

    /* compiled from: VoipCallByLinkAction.kt */
    public static abstract class f extends a {
    }

    /* compiled from: VoipCallByLinkAction.kt */
    public static abstract class g extends a {

        /* compiled from: VoipCallByLinkAction.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.feature.a$g$a, reason: collision with other inner class name */
        public static final class C2019a extends g {
            public static final C2019a b = new C2019a();
        }

        /* compiled from: VoipCallByLinkAction.kt */
        public static final class b extends g {
            public static final b b = new b();
        }

        /* compiled from: VoipCallByLinkAction.kt */
        public static final class c extends g {
            public static final c b = new c();
        }

        /* compiled from: VoipCallByLinkAction.kt */
        public static final class d extends g {
            public static final d b = new d();
        }

        /* compiled from: VoipCallByLinkAction.kt */
        public static final class e extends g {
            public static final e b = new e();
        }

        /* compiled from: VoipCallByLinkAction.kt */
        public static final class f extends g {
            public static final f b = new f();
        }

        /* compiled from: VoipCallByLinkAction.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.feature.a$g$g, reason: collision with other inner class name */
        public static final class C2020g extends g {
            public static final C2020g b = new C2020g();
        }
    }

    /* compiled from: VoipCallByLinkAction.kt */
    public static abstract class h extends a {
    }

    /* compiled from: VoipCallByLinkAction.kt */
    public static abstract class i extends a {

        /* compiled from: VoipCallByLinkAction.kt */
        /* renamed from: com.vk.voip.ui.call_by_link.feature.a$i$a, reason: collision with other inner class name */
        public static final class C2021a extends i {
            public static final C2021a b = new C2021a();
        }

        /* compiled from: VoipCallByLinkAction.kt */
        public static final class b extends i {
            public static final b b = new b();
        }

        /* compiled from: VoipCallByLinkAction.kt */
        public static final class c extends i {
            public static final c b = new c();
        }
    }

    /* compiled from: VoipCallByLinkAction.kt */
    public static final class j extends a {
        public static final j b = new j();
    }

    /* compiled from: VoipCallByLinkAction.kt */
    public static final class k extends a {
        public static final k b = new k();
    }
}
