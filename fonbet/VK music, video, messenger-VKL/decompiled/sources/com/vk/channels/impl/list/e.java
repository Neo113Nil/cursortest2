package com.vk.channels.impl.list;

import android.view.View;
import com.vk.dto.common.Peer;
import java.lang.ref.WeakReference;
import java.util.Set;
import xsna.epx;
import xsna.eq;
import xsna.ho8;
import xsna.kj50;
import xsna.thl0;
import xsna.tq;
import xsna.u8m;
import xsna.vu5;

/* compiled from: ChannelsListViewAction.kt */
/* loaded from: classes16.dex */
public abstract class e implements kj50 {

    /* compiled from: ChannelsListViewAction.kt */
    public static final class a extends e {
        public final long b;
        public final CharSequence c;

        public a(long j, CharSequence charSequence) {
            this.b = j;
            this.c = charSequence;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AcceptSuggestedChannel(channelId=");
            sb.append(this.b);
            sb.append(", channelName=");
            return thl0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ChannelsListViewAction.kt */
    public static final class b extends e {
        public final long b;
        public final u8m c;

        public b(long j, u8m u8mVar) {
            this.b = j;
            this.c = u8mVar;
        }
    }

    /* compiled from: ChannelsListViewAction.kt */
    public static final class c extends e {
        public final long b;
        public final CharSequence c;

        public c(long j, CharSequence charSequence) {
            this.b = j;
            this.c = charSequence;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HideSuggestedChannel(channelId=");
            sb.append(this.b);
            sb.append(", channelName=");
            return thl0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ChannelsListViewAction.kt */
    public static final class d extends e {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -141837689;
        }

        public final String toString() {
            return "LoadChannels";
        }
    }

    /* compiled from: ChannelsListViewAction.kt */
    /* renamed from: com.vk.channels.impl.list.e$e, reason: collision with other inner class name */
    public static final class C0538e extends e {
        public static final C0538e b = new C0538e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0538e);
        }

        public final int hashCode() {
            return -113311364;
        }

        public final String toString() {
            return "LoadMoreChannels";
        }
    }

    /* compiled from: ChannelsListViewAction.kt */
    public static final class f extends e {
        public final String b;

        public f(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OnChannelsBannerClick(url="), this.b, ')');
        }
    }

    /* compiled from: ChannelsListViewAction.kt */
    public static final class g extends e {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -861410293;
        }

        public final String toString() {
            return "OnCollapseRecommendationsClick";
        }
    }

    /* compiled from: ChannelsListViewAction.kt */
    public static final class h extends e {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1247423276;
        }

        public final String toString() {
            return "OnCollapseSuggests";
        }
    }

    /* compiled from: ChannelsListViewAction.kt */
    public static final class i extends e {
        public final long b;

        public i(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("OnDeleteChannelSubmitClick(channelId="));
        }
    }

    /* compiled from: ChannelsListViewAction.kt */
    public static final class j extends e {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1422333320;
        }

        public final String toString() {
            return "OnExpandRecommendationsClick";
        }
    }

    /* compiled from: ChannelsListViewAction.kt */
    public static final class k extends e {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -318003943;
        }

        public final String toString() {
            return "OnExpandSuggests";
        }
    }

    /* compiled from: ChannelsListViewAction.kt */
    public static final class l extends e {
        public final long b;
        public final String c;

        public l(long j, String str) {
            this.b = j;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.b == lVar.b && epx.f(this.c, lVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnJoinToRecommendedChannelClick(channelId=");
            sb.append(this.b);
            sb.append(", channelName=");
            return tq.f(sb, this.c, ')');
        }
    }

    /* compiled from: ChannelsListViewAction.kt */
    public static final class m extends e {
        public final long b;

        public m(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.b == ((m) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("OnLeaveChannelCancelClick(channelId="));
        }
    }

    /* compiled from: ChannelsListViewAction.kt */
    public static final class n extends e {
        public final long b;

        public n(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.b == ((n) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("OnLeaveChannelSubmitClick(channelId="));
        }
    }

    /* compiled from: ChannelsListViewAction.kt */
    public static final class o extends e {
        public final long b;

        public o(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.b == ((o) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("OnRecommendedChannelClick(channelId="));
        }
    }

    /* compiled from: ChannelsListViewAction.kt */
    public static final class p extends e {
        public final long b;

        public p(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.b == ((p) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("OnReturnChannelInAllFolderClick(channelId="));
        }
    }

    /* compiled from: ChannelsListViewAction.kt */
    public static final class q extends e {
        public final long b;
        public final boolean c;
        public final WeakReference<View> d;

        public q(long j, boolean z, WeakReference<View> weakReference) {
            this.b = j;
            this.c = z;
            this.d = weakReference;
        }
    }

    /* compiled from: ChannelsListViewAction.kt */
    public static final class r extends e {
        public final Peer b;

        public r(Peer peer) {
            this.b = peer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && epx.f(this.b, ((r) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return eq.a(new StringBuilder("OnUnarchiveChannel(channelId="), this.b, ')');
        }
    }

    /* compiled from: ChannelsListViewAction.kt */
    public static final class s extends e {
        public final Set<Long> b;

        public s(Set<Long> set) {
            this.b = set;
        }
    }

    /* compiled from: ChannelsListViewAction.kt */
    public static final class t extends e {
        public final long b;

        public t(long j) {
            this.b = j;
        }
    }

    /* compiled from: ChannelsListViewAction.kt */
    public static final class u extends e {
        public final long b;

        public u(long j) {
            this.b = j;
        }
    }
}
