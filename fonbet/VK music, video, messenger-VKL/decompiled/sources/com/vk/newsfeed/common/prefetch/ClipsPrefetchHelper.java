package com.vk.newsfeed.common.prefetch;

import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.newsfeed.entries.ClipsEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.p1;
import java.util.ArrayList;
import org.chromium.net.NetError;
import xsna.asp;
import xsna.blk;
import xsna.bpn0;
import xsna.cqm0;
import xsna.de;
import xsna.dz2;
import xsna.epx;
import xsna.g20;
import xsna.h7;
import xsna.ho8;
import xsna.j7;
import xsna.l5m;
import xsna.l7;
import xsna.mgj0;
import xsna.n7;
import xsna.ngj0;
import xsna.oq;
import xsna.qrk0;
import xsna.rsg0;
import xsna.sa0;
import xsna.u1c0;
import xsna.ums0;
import xsna.vt1;
import xsna.w8i;
import xsna.wh6;
import xsna.yfb;
import xsna.z63;
import xsna.zof;
import xsna.zrp;

/* compiled from: ClipsPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class ClipsPrefetchHelper extends de implements w8i {
    public final bpn0 b = new bpn0(new sa0(this, 28));
    public final ums0 c = ums0.a;

    /* compiled from: ClipsPrefetchHelper.kt */
    public static final class ClipsPrefetchEventBuilder extends l5m {
        public final Event h;
        public final String i;
        public final String j;
        public final Throwable k;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipsPrefetchHelper.kt */
        public static final class Event {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Event[] $VALUES;
            public static final Event PREFETCH_ERROR;
            private final String value = "prefetch_error";

            static {
                Event event = new Event();
                PREFETCH_ERROR = event;
                Event[] eventArr = {event};
                $VALUES = eventArr;
                $ENTRIES = new asp(eventArr);
            }

            public static Event valueOf(String str) {
                return (Event) Enum.valueOf(Event.class, str);
            }

            public static Event[] values() {
                return (Event[]) $VALUES.clone();
            }

            public final String h() {
                return this.value;
            }
        }

        public ClipsPrefetchEventBuilder(Event event, String str, String str2, Throwable th) {
            super(null, null, 3);
            this.h = event;
            this.i = str;
            this.j = str2;
            this.k = th;
        }

        @Override // xsna.l5m, xsna.cd6
        /* renamed from: u */
        public final qrk0 p() {
            String message;
            String h = DevNullEventKey.CLIPS_NEWSFEED_BLOCK_PREFETCH.h();
            String h2 = this.h.h();
            Throwable th = this.k;
            this.g = new SchemeStat$TypeDevNullItem(h, null, h2, null, this.i, null, this.j, null, (th == null || (message = th.getMessage()) == null) ? null : blk.N(cqm0.m(message)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, NetError.ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS, 3, null);
            return super.p();
        }
    }

    /* compiled from: ClipsPrefetchHelper.kt */
    public static abstract class a {

        /* compiled from: ClipsPrefetchHelper.kt */
        /* renamed from: com.vk.newsfeed.common.prefetch.ClipsPrefetchHelper$a$a, reason: collision with other inner class name */
        public static final class C1367a extends a {
            public final Throwable a;

            public C1367a(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1367a) && epx.f(this.a, ((C1367a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
            }
        }

        /* compiled from: ClipsPrefetchHelper.kt */
        public static final class b extends a {
            public final ArrayList a;
            public final PaginationKey b;
            public final String c;

            public b(ArrayList arrayList, PaginationKey paginationKey, String str) {
                this.a = arrayList;
                this.b = paginationKey;
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
                String str = this.c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Success(clips=");
                sb.append(this.a);
                sb.append(", paginationKey=");
                sb.append(this.b);
                sb.append(", title=");
                return ho8.a(sb, this.c, ')');
            }
        }
    }

    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        return 0;
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        return null;
    }

    @Override // xsna.de
    public final q e0(String str, NewsEntry newsEntry) {
        NewsEntry.TrackData trackData;
        ClipsEntry clipsEntry = newsEntry instanceof ClipsEntry ? (ClipsEntry) newsEntry : null;
        String str2 = (clipsEntry == null || (trackData = clipsEntry.b) == null) ? null : trackData.b;
        if (str == null) {
            str = "";
        }
        if (clipsEntry == null || str2 == null) {
            new ClipsPrefetchEventBuilder(ClipsPrefetchEventBuilder.Event.PREFETCH_ERROR, "null", str, new IllegalStateException("DisplayItem without entry/trackCode")).q();
            return null;
        }
        dz2 x = yfb.x(mgj0.a(new ngj0(), str2, null, Integer.valueOf(((zof) this.b.getValue()).T().a), null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE));
        x.n = true;
        return new p1(rsg0.T(x).U(new n7(new vt1(12), 14)).h0(3L).U(new j7(new g20(this, 29), 15)), new l7(new wh6(9), 11)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).U(new h7(new z63(clipsEntry, str2, str, 3), 13));
    }

    @Override // xsna.de
    public final q<NewsEntry> f0(u1c0 u1c0Var) {
        return e0(u1c0Var.l, u1c0Var.a);
    }

    @Override // xsna.de
    public final boolean l0() {
        return true;
    }
}
