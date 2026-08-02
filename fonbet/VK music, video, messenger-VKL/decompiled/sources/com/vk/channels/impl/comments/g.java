package com.vk.channels.impl.comments;

import com.vk.dto.common.id.UserId;
import defpackage.q0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.ao50;
import xsna.epx;
import xsna.gp;
import xsna.hfz;
import xsna.thl0;
import xsna.urd0;

/* compiled from: ChannelCommentsViewState.kt */
/* loaded from: classes16.dex */
public final class g implements ao50 {
    public static final g e = new g(EmptyList.b, null, null, false);
    public final List<hfz> a;
    public final a b;
    public final b c;
    public final boolean d;

    /* compiled from: ChannelCommentsViewState.kt */
    public static final class a {
        public final boolean a;

        public a() {
            this(false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("RefreshState(isRefreshing="), this.a, ')');
        }

        public a(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: ChannelCommentsViewState.kt */
    public static final class b {
        public final a a;

        /* compiled from: ChannelCommentsViewState.kt */
        public interface a {

            /* compiled from: ChannelCommentsViewState.kt */
            /* renamed from: com.vk.channels.impl.comments.g$b$a$a, reason: collision with other inner class name */
            public static final class C0534a implements a {
                public final int a;
                public final CharSequence b;

                public C0534a(int i, CharSequence charSequence) {
                    this.a = i;
                    this.b = charSequence;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0534a)) {
                        return false;
                    }
                    C0534a c0534a = (C0534a) obj;
                    return this.a == c0534a.a && epx.f(this.b, c0534a.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Edit(commentId=");
                    sb.append(this.a);
                    sb.append(", text=");
                    return thl0.a(sb, this.b, ')');
                }
            }

            /* compiled from: ChannelCommentsViewState.kt */
            /* renamed from: com.vk.channels.impl.comments.g$b$a$b, reason: collision with other inner class name */
            public static final class C0535b implements a {
                public static final C0535b a = new C0535b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0535b);
                }

                public final int hashCode() {
                    return -111429786;
                }

                public final String toString() {
                    return "Normal";
                }
            }

            /* compiled from: ChannelCommentsViewState.kt */
            public static final class c implements a {
                public final int a;
                public final String b;
                public final String c;
                public final UserId d;

                public c(int i, UserId userId, String str, String str2) {
                    this.a = i;
                    this.b = str;
                    this.c = str2;
                    this.d = userId;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return this.a == cVar.a && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
                }

                public final int hashCode() {
                    return Long.hashCode(this.d.b) + urd0.a(urd0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Reply(commentId=");
                    sb.append(this.a);
                    sb.append(", nameDat=");
                    sb.append(this.b);
                    sb.append(", nameNom=");
                    sb.append(this.c);
                    sb.append(", userId=");
                    return gp.b(sb, this.d, ')');
                }
            }
        }

        public b() {
            this(0);
        }

        public final Integer a() {
            a aVar = this.a;
            a.c cVar = aVar instanceof a.c ? (a.c) aVar : null;
            if (cVar != null) {
                return Integer.valueOf(cVar.a);
            }
            return null;
        }

        public final Integer b() {
            a aVar = this.a;
            if (aVar instanceof a.C0534a) {
                return Integer.valueOf(((a.C0534a) aVar).a);
            }
            if (aVar instanceof a.c) {
                return Integer.valueOf(((a.c) aVar).a);
            }
            if (epx.f(aVar, a.C0535b.a)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
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
            return "WriteBarState(mode=" + this.a + ')';
        }

        public /* synthetic */ b(int i) {
            this(a.C0535b.a);
        }

        public b(a aVar) {
            this.a = aVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(List<? extends hfz> list, a aVar, b bVar, boolean z) {
        this.a = list;
        this.b = aVar;
        this.c = bVar;
        this.d = z;
    }

    public static g a(g gVar, List list, a aVar, b bVar, boolean z, int i) {
        if ((i & 1) != 0) {
            list = gVar.a;
        }
        if ((i & 2) != 0) {
            aVar = gVar.b;
        }
        if ((i & 4) != 0) {
            bVar = gVar.c;
        }
        if ((i & 8) != 0) {
            z = gVar.d;
        }
        gVar.getClass();
        return new g(list, aVar, bVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c) && this.d == gVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : Boolean.hashCode(aVar.a))) * 31;
        b bVar = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (bVar != null ? bVar.a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelCommentsViewState(items=");
        sb.append(this.a);
        sb.append(", refreshState=");
        sb.append(this.b);
        sb.append(", writeBarState=");
        sb.append(this.c);
        sb.append(", fullScreenLoading=");
        return q0.a(sb, this.d, ')');
    }
}
