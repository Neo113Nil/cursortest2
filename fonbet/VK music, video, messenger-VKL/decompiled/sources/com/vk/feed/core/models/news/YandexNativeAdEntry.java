package com.vk.feed.core.models.news;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.entity.b;
import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.news.NewsEntry;
import xsna.e630;
import xsna.epx;
import xsna.z4y0;
import xsna.zcl;

/* compiled from: YandexNativeAdEntry.kt */
/* loaded from: classes18.dex */
public final class YandexNativeAdEntry extends NewsEntry {
    public static final Serializer.c<YandexNativeAdEntry> CREATOR = new a();
    public final NewsEntry i;
    public final String j;
    public final z4y0 k;
    public final Integer l;
    public final NewsEntry.TrackData m;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<YandexNativeAdEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final YandexNativeAdEntry a(Serializer serializer) {
            return new YandexNativeAdEntry((NewsEntry) serializer.G(NewsEntry.class.getClassLoader()), serializer.H(), null, null, null, 28, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new YandexNativeAdEntry[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public YandexNativeAdEntry(NewsEntry newsEntry, String str, z4y0 z4y0Var, Integer num, NewsEntry.TrackData trackData, int i, zcl zclVar) {
        this(newsEntry, str, z4y0Var, num, trackData);
        z4y0Var = (i & 4) != 0 ? null : z4y0Var;
        num = (i & 8) != 0 ? null : num;
        if ((i & 16) != 0) {
            trackData = newsEntry.Cb();
            trackData.b = str == null ? trackData.b : str;
        }
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Ab() {
        return "yandex_ads";
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Bb() {
        return "yandex_ads";
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final NewsEntry.TrackData Cb() {
        return this.m;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return b.JSON_KEY_ADS;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.i);
        serializer.j0(this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!YandexNativeAdEntry.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        YandexNativeAdEntry yandexNativeAdEntry = (YandexNativeAdEntry) obj;
        return epx.f(this.i, yandexNativeAdEntry.i) && epx.f(this.j, yandexNativeAdEntry.j);
    }

    public final int hashCode() {
        int b = e630.b(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.i);
        String str = this.j;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "YandexNativeAdEntry(fallback=" + this.i + ", adsTrackCode=" + this.j + ", ad=" + this.k + ", adRequestId=" + this.l + ", trackData=" + this.m + ')';
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 69;
    }

    public YandexNativeAdEntry(NewsEntry newsEntry, String str, z4y0 z4y0Var, Integer num, NewsEntry.TrackData trackData) {
        super(trackData);
        this.i = newsEntry;
        this.j = str;
        this.k = z4y0Var;
        this.l = num;
        this.m = trackData;
    }
}
