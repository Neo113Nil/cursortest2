package com.vk.feed.core.models.news;

import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.DebugInfo;
import com.vk.feed.core.models.feedback.Feedback;
import xsna.bh10;
import xsna.bwy;
import xsna.epx;
import xsna.qoy;
import xsna.shy;
import xsna.vu5;
import xsna.zcl;

/* compiled from: NewsEntry.kt */
/* loaded from: classes18.dex */
public abstract class NewsEntry extends Serializer.StreamParcelableAdapter {
    public final TrackData b;
    public boolean c;
    public boolean d;
    public boolean e;
    public bwy f;
    public Feedback g;
    public DebugInfo h;

    /* compiled from: NewsEntry.kt */
    public static final class TrackData extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<TrackData> CREATOR = new a();
        public String b;
        public int c;
        public long d;
        public boolean e;
        public boolean f;
        public Boolean g;
        public String h;
        public int i;
        public boolean j;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<TrackData> {
            @Override // com.vk.core.serialize.Serializer.c
            public final TrackData a(Serializer serializer) {
                return new TrackData(serializer.H(), serializer.u(), serializer.w(), serializer.m(), serializer.m(), serializer.n(), serializer.H(), serializer.u());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TrackData[i];
            }
        }

        public TrackData() {
            this(null, 0, 0L, false, false, null, null, 0, 255, null);
        }

        public static TrackData zb(TrackData trackData, String str) {
            int i = trackData.c;
            long j = trackData.d;
            boolean z = trackData.e;
            boolean z2 = trackData.f;
            Boolean bool = trackData.g;
            String str2 = trackData.h;
            int i2 = trackData.i;
            trackData.getClass();
            return new TrackData(str, i, j, z, z2, bool, str2, i2);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.S(this.c);
            serializer.Y(this.d);
            serializer.L(this.e ? (byte) 1 : (byte) 0);
            serializer.L(this.f ? (byte) 1 : (byte) 0);
            serializer.J(this.g);
            serializer.j0(this.h);
            serializer.S(this.i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrackData)) {
                return false;
            }
            TrackData trackData = (TrackData) obj;
            return epx.f(this.b, trackData.b) && this.c == trackData.c && this.d == trackData.d && this.e == trackData.e && this.f == trackData.f && epx.f(this.g, trackData.g) && epx.f(this.h, trackData.h) && this.i == trackData.i;
        }

        public final int hashCode() {
            String str = this.b;
            int b = qoy.b(qoy.b(bh10.a(shy.a(this.c, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.d), 31, this.e), 31, this.f);
            Boolean bool = this.g;
            int hashCode = (b + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.h;
            return Integer.hashCode(this.i) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String r() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TrackData(trackCode=");
            sb.append(this.b);
            sb.append(", position=");
            sb.append(this.c);
            sb.append(", timeStamp=");
            sb.append(this.d);
            sb.append(", viewed=");
            sb.append(this.e);
            sb.append(", viewTimeTracked=");
            sb.append(this.f);
            sb.append(", textTruncated=");
            sb.append(this.g);
            sb.append(", referer=");
            sb.append(this.h);
            sb.append(", carouselOffset=");
            return vu5.b(sb, this.i, ')');
        }

        public /* synthetic */ TrackData(String str, int i, long j, boolean z, boolean z2, Boolean bool, String str2, int i2, int i3, zcl zclVar) {
            this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0L : j, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? null : bool, (i3 & 64) != 0 ? null : str2, (i3 & 128) != 0 ? 0 : i2);
        }

        public TrackData(String str, int i, long j, boolean z, boolean z2, Boolean bool, String str2, int i2) {
            this.b = str;
            this.c = i;
            this.d = j;
            this.e = z;
            this.f = z2;
            this.g = bool;
            this.h = str2;
            this.i = i2;
        }
    }

    public NewsEntry(TrackData trackData) {
        this.b = trackData;
        this.f = bwy.d.a;
    }

    public String Ab() {
        return Db();
    }

    public String Bb() {
        return Db();
    }

    public TrackData Cb() {
        return this.b;
    }

    public abstract String Db();

    public abstract int zb();

    public NewsEntry() {
        this(new TrackData(null, 0, 0L, false, false, null, null, 0, 254, null));
    }
}
