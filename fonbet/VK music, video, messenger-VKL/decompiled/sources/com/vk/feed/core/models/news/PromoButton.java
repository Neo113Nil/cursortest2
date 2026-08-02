package com.vk.feed.core.models.news;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.actions.Action;
import com.vk.feed.core.models.news.NewsEntry;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.zcl;

/* compiled from: PromoButton.kt */
/* loaded from: classes18.dex */
public final class PromoButton extends NewsEntry {
    public static final Serializer.c<PromoButton> CREATOR = new a();
    public final String i;
    public final String j;
    public final Image k;
    public final Action l;
    public final String m;
    public final TrackData n;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PromoButton> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PromoButton a(Serializer serializer) {
            return new PromoButton(serializer.H(), serializer.H(), (Image) serializer.G(Image.class.getClassLoader()), (Action) serializer.G(Action.class.getClassLoader()), serializer.H(), (TrackData) serializer.G(TrackData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PromoButton[i];
        }
    }

    public PromoButton(String str, String str2, Image image, Action action, String str3, TrackData trackData) {
        super(new NewsEntry.TrackData(str3, 0, 0L, false, false, null, null, 0, 254, null));
        this.i = str;
        this.j = str2;
        this.k = image;
        this.l = action;
        this.m = str3;
        this.n = trackData;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return "promo_button";
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.i0(this.k);
        serializer.i0(this.l);
        serializer.j0(this.m);
        serializer.i0(this.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PromoButton) {
            PromoButton promoButton = (PromoButton) obj;
            if (epx.f(promoButton.i, this.i) && epx.f(promoButton.j, this.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.i;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.j;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "PromoButton(title=" + this.i + ", text=" + this.j + ", icon=" + this.k + ", action=" + this.l + ", trackCode=" + this.m + ", buttonTrackData=" + this.n + ')';
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 21;
    }

    /* compiled from: PromoButton.kt */
    public static final class TrackData extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<TrackData> CREATOR = new a();
        public int b;
        public int c;
        public String d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<TrackData> {
            @Override // com.vk.core.serialize.Serializer.c
            public final TrackData a(Serializer serializer) {
                return new TrackData(serializer.u(), serializer.u(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TrackData[i];
            }
        }

        public TrackData(int i, int i2, String str) {
            this.b = i;
            this.c = i2;
            this.d = str;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
            serializer.S(this.c);
            serializer.j0(this.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrackData)) {
                return false;
            }
            TrackData trackData = (TrackData) obj;
            return this.b == trackData.b && this.c == trackData.c && epx.f(this.d, trackData.d);
        }

        public final int hashCode() {
            int a2 = shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
            String str = this.d;
            return a2 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TrackData(listPosition=");
            sb.append(this.b);
            sb.append(", time=");
            sb.append(this.c);
            sb.append(", referer=");
            return ho8.a(sb, this.d, ')');
        }

        public TrackData() {
            this(0, 0, null);
        }
    }

    public /* synthetic */ PromoButton(String str, String str2, Image image, Action action, String str3, TrackData trackData, int i, zcl zclVar) {
        this(str, str2, image, action, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? new TrackData() : trackData);
    }
}
