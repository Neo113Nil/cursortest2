package com.vk.dto.newsfeed.entries;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.entity.b;
import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.e630;
import xsna.epx;
import xsna.x9v0;
import xsna.zcl;

/* compiled from: OptionalNativeAdEntry.kt */
/* loaded from: classes18.dex */
public final class OptionalNativeAdEntry extends NewsEntry {
    public static final Serializer.c<OptionalNativeAdEntry> CREATOR = new a();
    public final NewsEntry i;
    public final String j;
    public final Integer k;
    public final List<String> l;
    public final x9v0 m;
    public final NewsEntry.TrackData n;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<OptionalNativeAdEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final OptionalNativeAdEntry a(Serializer serializer) {
            return new OptionalNativeAdEntry((NewsEntry) serializer.G(NewsEntry.class.getClassLoader()), serializer.H(), null, null, null, null, 60, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OptionalNativeAdEntry[i];
        }
    }

    public OptionalNativeAdEntry(NewsEntry newsEntry, String str, Integer num, List<String> list, x9v0 x9v0Var, NewsEntry.TrackData trackData) {
        super(trackData);
        this.i = newsEntry;
        this.j = str;
        this.k = num;
        this.l = list;
        this.m = x9v0Var;
        this.n = trackData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static OptionalNativeAdEntry Eb(OptionalNativeAdEntry optionalNativeAdEntry, Integer num, ArrayList arrayList, x9v0 x9v0Var, int i) {
        NewsEntry newsEntry = optionalNativeAdEntry.i;
        String str = optionalNativeAdEntry.j;
        if ((i & 4) != 0) {
            num = optionalNativeAdEntry.k;
        }
        Integer num2 = num;
        List list = arrayList;
        if ((i & 8) != 0) {
            list = optionalNativeAdEntry.l;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            x9v0Var = optionalNativeAdEntry.m;
        }
        NewsEntry.TrackData trackData = optionalNativeAdEntry.n;
        optionalNativeAdEntry.getClass();
        return new OptionalNativeAdEntry(newsEntry, str, num2, list2, x9v0Var, trackData);
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Ab() {
        return "ads_native";
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Bb() {
        return "ads_native";
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final NewsEntry.TrackData Cb() {
        return this.n;
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
        if (!OptionalNativeAdEntry.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        OptionalNativeAdEntry optionalNativeAdEntry = (OptionalNativeAdEntry) obj;
        return epx.f(this.i, optionalNativeAdEntry.i) && epx.f(this.j, optionalNativeAdEntry.j);
    }

    public final int hashCode() {
        int b = e630.b(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.i);
        String str = this.j;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "OptionalNativeAdEntry(fallback=" + this.i + ", adsTrackCode=" + this.j + ", adRequestId=" + this.k + ", nearestEntriesUrls=" + this.l + ", ad=" + this.m + ", trackData=" + this.n + ')';
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 67;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OptionalNativeAdEntry(NewsEntry newsEntry, String str, Integer num, List list, x9v0 x9v0Var, NewsEntry.TrackData trackData, int i, zcl zclVar) {
        this(newsEntry, str, num, list, x9v0Var, trackData);
        num = (i & 4) != 0 ? null : num;
        list = (i & 8) != 0 ? EmptyList.b : list;
        x9v0Var = (i & 16) != 0 ? null : x9v0Var;
        if ((i & 32) != 0) {
            trackData = newsEntry.Cb();
            trackData.b = str == null ? trackData.b : str;
        }
    }
}
