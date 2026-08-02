package com.vk.voip.ui.group_selector.ui;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.thl0;

/* compiled from: VoipGroupSelectorViewEvent.kt */
/* loaded from: classes7.dex */
public abstract class a {

    /* compiled from: VoipGroupSelectorViewEvent.kt */
    /* renamed from: com.vk.voip.ui.group_selector.ui.a$a, reason: collision with other inner class name */
    public static final class C2042a extends a {
        public static final C2042a a = new C2042a();
    }

    /* compiled from: VoipGroupSelectorViewEvent.kt */
    public static final class b extends a {
        public static final b a = new b();
    }

    /* compiled from: VoipGroupSelectorViewEvent.kt */
    public static final class c extends a {
        public static final c a = new c();
    }

    /* compiled from: VoipGroupSelectorViewEvent.kt */
    public static final class d extends a {
        public static final d a = new d();
    }

    /* compiled from: VoipGroupSelectorViewEvent.kt */
    public static final class e extends a {
        public static final e a = new e();
    }

    /* compiled from: VoipGroupSelectorViewEvent.kt */
    public static final class f extends a {
        public final UserId a;

        public f(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("GroupClick(groupId="), this.a, ')');
        }
    }

    /* compiled from: VoipGroupSelectorViewEvent.kt */
    public static final class g extends a {
        public static final g a = new g();
    }

    /* compiled from: VoipGroupSelectorViewEvent.kt */
    public static abstract class h extends a {

        /* compiled from: VoipGroupSelectorViewEvent.kt */
        /* renamed from: com.vk.voip.ui.group_selector.ui.a$h$a, reason: collision with other inner class name */
        public static final class C2043a extends h {
            public static final C2043a a = new C2043a();
        }

        /* compiled from: VoipGroupSelectorViewEvent.kt */
        public static final class b extends h {
            public final CharSequence a;

            public b(CharSequence charSequence) {
                this.a = charSequence;
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
                return thl0.a(new StringBuilder("QueryChanged(query="), this.a, ')');
            }
        }
    }

    /* compiled from: VoipGroupSelectorViewEvent.kt */
    public static abstract class i extends a {

        /* compiled from: VoipGroupSelectorViewEvent.kt */
        /* renamed from: com.vk.voip.ui.group_selector.ui.a$i$a, reason: collision with other inner class name */
        public static final class C2044a extends i {
            public static final C2044a a = new C2044a();
        }

        /* compiled from: VoipGroupSelectorViewEvent.kt */
        public static final class b extends i {
            public static final b a = new b();
        }
    }
}
