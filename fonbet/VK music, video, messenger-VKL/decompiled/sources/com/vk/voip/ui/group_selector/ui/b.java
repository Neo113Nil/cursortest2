package com.vk.voip.ui.group_selector.ui;

import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.avatars.a;
import defpackage.q0;
import java.util.List;
import xsna.ao50;
import xsna.bh10;
import xsna.cpw0;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.fw3;
import xsna.h0u0;
import xsna.hfz;
import xsna.ho8;
import xsna.j8;
import xsna.oq;
import xsna.urd0;
import xsna.yzt0;

/* compiled from: VoipGroupSelectorViewState.kt */
/* loaded from: classes7.dex */
public final class b implements ao50 {
    public final fi50 a;

    /* compiled from: VoipGroupSelectorViewState.kt */
    public static abstract class a {

        /* compiled from: VoipGroupSelectorViewState.kt */
        /* renamed from: com.vk.voip.ui.group_selector.ui.b$a$a, reason: collision with other inner class name */
        public static final class C2045a {
            public final boolean a;

            public C2045a(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2045a) && this.a == ((C2045a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return q0.a(new StringBuilder("ButtonState(isEnabled="), this.a, ')');
            }
        }

        /* compiled from: VoipGroupSelectorViewState.kt */
        /* renamed from: com.vk.voip.ui.group_selector.ui.b$a$b, reason: collision with other inner class name */
        public static final class C2046b extends a {
            public final Throwable a;

            public C2046b(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2046b) && epx.f(this.a, ((C2046b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
            }
        }

        /* compiled from: VoipGroupSelectorViewState.kt */
        public static final class c extends a {
            public static final c a = new c();
        }

        /* compiled from: VoipGroupSelectorViewState.kt */
        public static abstract class d implements hfz {

            /* compiled from: VoipGroupSelectorViewState.kt */
            /* renamed from: com.vk.voip.ui.group_selector.ui.b$a$d$a, reason: collision with other inner class name */
            public static final class C2047a extends d {
                public final boolean b;

                public C2047a(boolean z) {
                    this.b = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2047a) && this.b == ((C2047a) obj).b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b);
                }

                @Override // com.vk.voip.ui.group_selector.ui.b.a.d
                public final boolean p() {
                    return this.b;
                }

                public final String toString() {
                    return q0.a(new StringBuilder("AllUsers(isSelected="), this.b, ')');
                }
            }

            /* compiled from: VoipGroupSelectorViewState.kt */
            /* renamed from: com.vk.voip.ui.group_selector.ui.b$a$d$b, reason: collision with other inner class name */
            public static final class C2048b extends d {
                public final boolean b;
                public final a.b.C1179b c;
                public final ImageList d;
                public final String e;
                public final boolean f;

                public C2048b(ImageList imageList, a.b.C1179b c1179b, String str, boolean z, boolean z2) {
                    this.b = z;
                    this.c = c1179b;
                    this.d = imageList;
                    this.e = str;
                    this.f = z2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C2048b)) {
                        return false;
                    }
                    C2048b c2048b = (C2048b) obj;
                    return this.b == c2048b.b && epx.f(this.c, c2048b.c) && epx.f(this.d, c2048b.d) && epx.f(this.e, c2048b.e) && this.f == c2048b.f;
                }

                public final int hashCode() {
                    int hashCode = Boolean.hashCode(this.b) * 31;
                    a.b.C1179b c1179b = this.c;
                    return Boolean.hashCode(this.f) + urd0.a(fw3.a((hashCode + (c1179b == null ? 0 : c1179b.a.hashCode())) * 31, 31, this.d.b), 31, this.e);
                }

                @Override // com.vk.voip.ui.group_selector.ui.b.a.d
                public final boolean p() {
                    return this.b;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("CurrentUser(isSelected=");
                    sb.append(this.b);
                    sb.append(", placeholderSource=");
                    sb.append(this.c);
                    sb.append(", image=");
                    sb.append(this.d);
                    sb.append(", name=");
                    sb.append(this.e);
                    sb.append(", imageIsNft=");
                    return q0.a(sb, this.f, ')');
                }
            }

            /* compiled from: VoipGroupSelectorViewState.kt */
            public static final class c extends d {
                public final boolean b;
                public final UserId c;
                public final ImageList d;
                public final String e;
                public final boolean f;

                public c(UserId userId, ImageList imageList, String str, boolean z, boolean z2) {
                    this.b = z;
                    this.c = userId;
                    this.d = imageList;
                    this.e = str;
                    this.f = z2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return this.b == cVar.b && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && this.f == cVar.f;
                }

                @Override // com.vk.voip.ui.group_selector.ui.b.a.d, xsna.hfz
                public final Number getItemId() {
                    return Integer.valueOf(Long.hashCode(this.c.b));
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f) + urd0.a(fw3.a(bh10.a(Boolean.hashCode(this.b) * 31, 31, this.c.b), 31, this.d.b), 31, this.e);
                }

                @Override // com.vk.voip.ui.group_selector.ui.b.a.d
                public final boolean p() {
                    return this.b;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Group(isSelected=");
                    sb.append(this.b);
                    sb.append(", id=");
                    sb.append(this.c);
                    sb.append(", image=");
                    sb.append(this.d);
                    sb.append(", name=");
                    sb.append(this.e);
                    sb.append(", imageIsNft=");
                    return q0.a(sb, this.f, ')');
                }
            }

            @Override // xsna.hfz
            public Number getItemId() {
                return 0;
            }

            public abstract boolean p();
        }

        /* compiled from: VoipGroupSelectorViewState.kt */
        public static final class e extends a {
            public static final e a = new e();
        }

        /* compiled from: VoipGroupSelectorViewState.kt */
        public static abstract class f {

            /* compiled from: VoipGroupSelectorViewState.kt */
            /* renamed from: com.vk.voip.ui.group_selector.ui.b$a$f$a, reason: collision with other inner class name */
            public static final class C2049a extends f {
                public static final C2049a a = new C2049a();
            }

            /* compiled from: VoipGroupSelectorViewState.kt */
            /* renamed from: com.vk.voip.ui.group_selector.ui.b$a$f$b, reason: collision with other inner class name */
            public static final class C2050b extends f {
                public final String a;

                public C2050b(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2050b) && epx.f(this.a, ((C2050b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("Visible(query="), this.a, ')');
                }
            }
        }

        /* compiled from: VoipGroupSelectorViewState.kt */
        public static final class g extends a {
            public final List<d> a;
            public final f b;
            public final C2045a c;

            /* JADX WARN: Multi-variable type inference failed */
            public g(List<? extends d> list, f fVar, C2045a c2045a) {
                this.a = list;
                this.b = fVar;
                this.c = c2045a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c);
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c.a) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "Visible(items=" + this.a + ", searchState=" + this.b + ", buttonState=" + this.c + ')';
            }
        }
    }

    /* compiled from: VoipGroupSelectorViewState.kt */
    /* renamed from: com.vk.voip.ui.group_selector.ui.b$b, reason: collision with other inner class name */
    public static final class C2051b implements fm50<cpw0> {
        public final yzt0<a> a;

        public C2051b(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    public b(fi50 fi50Var) {
        this.a = fi50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a.equals(((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j8.b(new StringBuilder("VoipGroupSelectorViewState(scene="), this.a, ')');
    }
}
