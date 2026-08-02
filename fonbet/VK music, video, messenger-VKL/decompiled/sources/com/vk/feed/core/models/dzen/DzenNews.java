package com.vk.feed.core.models.dzen;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.news.NewsEntry;
import defpackage.q0;
import java.util.List;
import org.json.JSONObject;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.shy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: DzenNews.kt */
/* loaded from: classes18.dex */
public final class DzenNews extends NewsEntry {
    public static final Serializer.c<DzenNews> CREATOR = new a();
    public final DzenTopStoriesHeader i;
    public final List<DzenNewsItem> j;
    public int k;
    public final int l;
    public final String m;
    public final DzenFooter n;
    public final String o;
    public int p;
    public boolean q;

    /* compiled from: DzenNews.kt */
    public static final class ItemHeader implements Serializer.StreamParcelable {
        public static final Serializer.c<ItemHeader> CREATOR = new b();
        public final String b;
        public final TextSize c;
        public final boolean d;

        /* compiled from: DzenNews.kt */
        public static final class a {
            public static ItemHeader a(JSONObject jSONObject) {
                String optString = jSONObject.optString("text");
                TextSize.a aVar = TextSize.Companion;
                String optString2 = jSONObject.optString("text_size");
                aVar.getClass();
                return new ItemHeader(optString, optString2.equals("large") ? TextSize.LARGE : null, jSONObject.optBoolean(TtmlNode.BOLD));
            }
        }

        /* compiled from: Serializer.kt */
        public static final class b extends Serializer.c<ItemHeader> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ItemHeader a(Serializer serializer) {
                return new ItemHeader(serializer.H(), (TextSize) serializer.A(TextSize.class.getClassLoader()), serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ItemHeader[i];
            }
        }

        public ItemHeader(String str, TextSize textSize, boolean z) {
            this.b = str;
            this.c = textSize;
            this.d = z;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.e0(this.c);
            serializer.L(this.d ? (byte) 1 : (byte) 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemHeader)) {
                return false;
            }
            ItemHeader itemHeader = (ItemHeader) obj;
            return epx.f(this.b, itemHeader.b) && this.c == itemHeader.c && this.d == itemHeader.d;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            TextSize textSize = this.c;
            return Boolean.hashCode(this.d) + ((hashCode + (textSize == null ? 0 : textSize.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ItemHeader(text=");
            sb.append(this.b);
            sb.append(", textSize=");
            sb.append(this.c);
            sb.append(", isBold=");
            return q0.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DzenNews.kt */
    public static final class TextSize implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TextSize[] $VALUES;
        public static final Parcelable.Creator<TextSize> CREATOR;
        public static final a Companion;
        public static final TextSize LARGE;

        /* compiled from: DzenNews.kt */
        public static final class a {
        }

        /* compiled from: DzenNews.kt */
        public static final class b implements Parcelable.Creator<TextSize> {
            @Override // android.os.Parcelable.Creator
            public final TextSize createFromParcel(Parcel parcel) {
                return TextSize.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TextSize[] newArray(int i) {
                return new TextSize[i];
            }
        }

        static {
            TextSize textSize = new TextSize("LARGE", 0);
            LARGE = textSize;
            TextSize[] textSizeArr = {textSize};
            $VALUES = textSizeArr;
            $ENTRIES = new asp(textSizeArr);
            Companion = new a();
            CREATOR = new b();
        }

        public TextSize() {
            throw null;
        }

        public static TextSize valueOf(String str) {
            return (TextSize) Enum.valueOf(TextSize.class, str);
        }

        public static TextSize[] values() {
            return (TextSize[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DzenNews> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DzenNews a(Serializer serializer) {
            return new DzenNews((DzenTopStoriesHeader) serializer.G(DzenTopStoriesHeader.class.getClassLoader()), serializer.j(DzenNewsItem.CREATOR), serializer.u(), serializer.u(), serializer.H(), (DzenFooter) serializer.G(DzenFooter.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DzenNews[i];
        }
    }

    public DzenNews(DzenTopStoriesHeader dzenTopStoriesHeader, List<DzenNewsItem> list, int i, int i2, String str, DzenFooter dzenFooter, String str2) {
        super(new NewsEntry.TrackData(str2, 0, 0L, false, false, null, null, 0, 254, null));
        this.i = dzenTopStoriesHeader;
        this.j = list;
        this.k = i;
        this.l = i2;
        this.m = str;
        this.n = dzenFooter;
        this.o = str2;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return "dzen_top_stories";
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.i);
        serializer.o0(this.j);
        serializer.S(this.k);
        serializer.S(this.l);
        serializer.j0(this.m);
        serializer.i0(this.n);
        serializer.j0(this.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DzenNews) {
            DzenNews dzenNews = (DzenNews) obj;
            if (epx.f(this.i, dzenNews.i) && epx.f(this.j, dzenNews.j) && this.l == dzenNews.l && epx.f(this.m, dzenNews.m) && epx.f(this.n, dzenNews.n) && epx.f(this.o, dzenNews.o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.l, fw3.a((this.i.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31, 31, this.j), 31), 31, this.m);
        DzenFooter dzenFooter = this.n;
        int hashCode = (a2 + (dzenFooter != null ? dzenFooter.hashCode() : 0)) * 31;
        String str = this.o;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DzenNews(header=");
        sb.append(this.i);
        sb.append(", items=");
        sb.append(this.j);
        sb.append(", shownNewsCount=");
        sb.append(this.k);
        sb.append(", showMoreCount=");
        sb.append(this.l);
        sb.append(", showMoreText=");
        sb.append(this.m);
        sb.append(", footer=");
        sb.append(this.n);
        sb.append(", trackCode=");
        return ho8.a(sb, this.o, ')');
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 57;
    }
}
