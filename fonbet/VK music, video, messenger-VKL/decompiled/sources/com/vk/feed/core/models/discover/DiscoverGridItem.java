package com.vk.feed.core.models.discover;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;
import xsna.epx;
import xsna.ho8;

/* compiled from: DiscoverGridItem.kt */
/* loaded from: classes18.dex */
public abstract class DiscoverGridItem implements Serializer.StreamParcelable {
    public final String b;
    public final NewsEntry c;
    public final int d;
    public final int e;
    public final String f;
    public final a g;
    public final List<String> h;
    public final DiscoverAction i;

    /* compiled from: DiscoverGridItem.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Titles(title=");
            sb.append(this.a);
            sb.append(", subtitle=");
            sb.append(this.b);
            sb.append(", parsedSubtitleText=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public DiscoverGridItem(String str, NewsEntry newsEntry, int i, int i2, String str2, a aVar, List<String> list, DiscoverAction discoverAction) {
        this.b = str;
        this.c = newsEntry;
        this.d = i;
        this.e = i2;
        this.f = str2;
        this.g = aVar;
        this.h = list;
        this.i = discoverAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
