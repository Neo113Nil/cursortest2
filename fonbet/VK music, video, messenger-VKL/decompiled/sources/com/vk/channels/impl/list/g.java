package com.vk.channels.impl.list;

import xsna.epx;
import xsna.shy;
import xsna.thl0;
import xsna.uta;
import xsna.vu5;
import xsna.yn50;

/* compiled from: ChannelsListViewEvent.kt */
/* loaded from: classes16.dex */
public abstract class g implements yn50 {

    /* compiled from: ChannelsListViewEvent.kt */
    public static final class a extends g {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1076558422;
        }

        public final String toString() {
            return "BumpRecommendationsHeader";
        }
    }

    /* compiled from: ChannelsListViewEvent.kt */
    public static final class b extends g {
        public final Throwable a;

        public b(Throwable th) {
            this.a = th;
        }
    }

    /* compiled from: ChannelsListViewEvent.kt */
    public static final class c extends g {
        public final boolean a;

        public c(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: ChannelsListViewEvent.kt */
    public static final class d extends g {
        public final uta a;

        public d(uta utaVar) {
            this.a = utaVar;
        }
    }

    /* compiled from: ChannelsListViewEvent.kt */
    public static final class e extends g {
        public final long a;

        public e(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("ShowComplainToChannelDialog(channelId="));
        }
    }

    /* compiled from: ChannelsListViewEvent.kt */
    public static final class f extends g {
        public final long a;
        public final int b;
        public final int c;

        public f(long j, int i, int i2) {
            this.a = j;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && this.b == fVar.b && this.c == fVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, Long.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowDeleteChannelSubmit(channelId=");
            sb.append(this.a);
            sb.append(", titleRes=");
            sb.append(this.b);
            sb.append(", submitMsgRes=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ChannelsListViewEvent.kt */
    /* renamed from: com.vk.channels.impl.list.g$g, reason: collision with other inner class name */
    public static final class C0539g extends g {
        public final long a;

        public C0539g(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0539g) && this.a == ((C0539g) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("ShowLeaveChannelSubmit(channelId="));
        }
    }

    /* compiled from: ChannelsListViewEvent.kt */
    public static final class h extends g {
        public final a a;

        /* compiled from: ChannelsListViewEvent.kt */
        public interface a {

            /* compiled from: ChannelsListViewEvent.kt */
            /* renamed from: com.vk.channels.impl.list.g$h$a$a, reason: collision with other inner class name */
            public static final class C0540a implements a {
                public final long a;

                public C0540a(long j) {
                    this.a = j;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0540a) && this.a == ((C0540a) obj).a;
                }

                public final int hashCode() {
                    return Long.hashCode(this.a);
                }

                public final String toString() {
                    return vu5.a(')', this.a, new StringBuilder("ChannelHiddenInAllFolder(channelId="));
                }
            }

            /* compiled from: ChannelsListViewEvent.kt */
            public static final class b implements a {
                public static final b a = new b();
            }

            /* compiled from: ChannelsListViewEvent.kt */
            public static final class c implements a {
                public final long a;
                public final CharSequence b;

                public c(long j, CharSequence charSequence) {
                    this.a = j;
                    this.b = charSequence;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return this.a == cVar.a && epx.f(this.b, cVar.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (Long.hashCode(this.a) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("SuggestedChannelAccepted(channelId=");
                    sb.append(this.a);
                    sb.append(", channelName=");
                    return thl0.a(sb, this.b, ')');
                }
            }

            /* compiled from: ChannelsListViewEvent.kt */
            public static final class d implements a {
                public final long a;
                public final CharSequence b;

                public d(long j, CharSequence charSequence) {
                    this.a = j;
                    this.b = charSequence;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return this.a == dVar.a && epx.f(this.b, dVar.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (Long.hashCode(this.a) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("SuggestedChannelHidden(channelId=");
                    sb.append(this.a);
                    sb.append(", channelName=");
                    return thl0.a(sb, this.b, ')');
                }
            }
        }

        public h(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowSnackbar(variant=" + this.a + ')';
        }
    }
}
