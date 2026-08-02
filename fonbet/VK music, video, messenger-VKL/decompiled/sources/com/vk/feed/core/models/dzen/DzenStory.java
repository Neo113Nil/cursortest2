package com.vk.feed.core.models.dzen;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.feed.core.models.ImagePhoto;
import com.vk.feed.core.models.NewsfeedResearch;
import com.vk.feed.core.models.dzen.DzenNews;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.shy;
import xsna.urd0;

/* compiled from: DzenStory.kt */
/* loaded from: classes18.dex */
public final class DzenStory extends NewsEntry {
    public static final Serializer.c<DzenStory> CREATOR = new b();
    public final Header i;
    public final List<DzenStoryItem> j;
    public final String k;

    /* compiled from: DzenStory.kt */
    public static final class Description implements Serializer.StreamParcelable {
        public static final Serializer.c<Description> CREATOR = new a();
        public final String b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Description> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Description a(Serializer serializer) {
                return new Description(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Description[i];
            }
        }

        public Description(String str) {
            this.b = str;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Description) && epx.f(this.b, ((Description) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Description(text="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: DzenStory.kt */
    public static final class DzenStoryItem implements Serializer.StreamParcelable {
        public static final Serializer.c<DzenStoryItem> CREATOR = new a();
        public final ImagePhoto b;
        public final DzenNews.ItemHeader c;
        public final Description d;
        public final ActionOpenUrl e;
        public final String f;
        public final int g;
        public final NewsfeedResearch h;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<DzenStoryItem> {
            @Override // com.vk.core.serialize.Serializer.c
            public final DzenStoryItem a(Serializer serializer) {
                return new DzenStoryItem((ImagePhoto) serializer.G(ImagePhoto.class.getClassLoader()), (DzenNews.ItemHeader) serializer.G(DzenNews.ItemHeader.class.getClassLoader()), (Description) serializer.G(Description.class.getClassLoader()), (ActionOpenUrl) serializer.G(ActionOpenUrl.class.getClassLoader()), serializer.H(), serializer.u(), (NewsfeedResearch) serializer.G(NewsfeedResearch.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DzenStoryItem[i];
            }
        }

        public DzenStoryItem(ImagePhoto imagePhoto, DzenNews.ItemHeader itemHeader, Description description, ActionOpenUrl actionOpenUrl, String str, int i, NewsfeedResearch newsfeedResearch) {
            this.b = imagePhoto;
            this.c = itemHeader;
            this.d = description;
            this.e = actionOpenUrl;
            this.f = str;
            this.g = i;
            this.h = newsfeedResearch;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
            serializer.i0(this.c);
            serializer.i0(this.d);
            serializer.i0(this.e);
            serializer.j0(this.f);
            serializer.S(this.g);
            serializer.i0(this.h);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DzenStoryItem)) {
                return false;
            }
            DzenStoryItem dzenStoryItem = (DzenStoryItem) obj;
            return epx.f(this.b, dzenStoryItem.b) && epx.f(this.c, dzenStoryItem.c) && epx.f(this.d, dzenStoryItem.d) && epx.f(this.e, dzenStoryItem.e) && epx.f(this.f, dzenStoryItem.f) && this.g == dzenStoryItem.g && epx.f(this.h, dzenStoryItem.h);
        }

        public final int hashCode() {
            ImagePhoto imagePhoto = this.b;
            int hashCode = (this.e.hashCode() + urd0.a((this.c.hashCode() + ((imagePhoto == null ? 0 : imagePhoto.hashCode()) * 31)) * 31, 31, this.d.b)) * 31;
            String str = this.f;
            int a2 = shy.a(this.g, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            NewsfeedResearch newsfeedResearch = this.h;
            return a2 + (newsfeedResearch != null ? newsfeedResearch.hashCode() : 0);
        }

        public final String toString() {
            return "DzenStoryItem(image=" + this.b + ", title=" + this.c + ", description=" + this.d + ", action=" + this.e + ", trackCode=" + this.f + ", date=" + this.g + ", research=" + this.h + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: DzenStory.kt */
    public static final class Header implements Serializer.StreamParcelable {
        public static final Serializer.c<Header> CREATOR = new a();
        public final String b;
        public final String c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Header> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Header a(Serializer serializer) {
                return new Header(serializer.H(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Header[i];
            }
        }

        public Header(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return epx.f(this.b, header.b) && epx.f(this.c, header.c);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Header(title=");
            sb.append(this.b);
            sb.append(", subtitle=");
            return ho8.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: DzenStory.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public static DzenStory a(JSONObject jSONObject) {
            ?? r5;
            ImagePhoto imagePhoto;
            Serializer.c<Header> cVar = Header.CREATOR;
            JSONObject jSONObject2 = jSONObject.getJSONObject("header");
            Header header = new Header(jSONObject2.optString("title"), jSONObject2.optString("subtitle"));
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray != null) {
                Serializer.c<DzenStoryItem> cVar2 = DzenStoryItem.CREATOR;
                r5 = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
                        NewsfeedResearch newsfeedResearch = null;
                        if (optJSONObject2 != null) {
                            Serializer.c<ImagePhoto> cVar3 = ImagePhoto.CREATOR;
                            imagePhoto = ImagePhoto.a.a(optJSONObject2, null);
                        } else {
                            imagePhoto = null;
                        }
                        Serializer.c<DzenNews.ItemHeader> cVar4 = DzenNews.ItemHeader.CREATOR;
                        DzenNews.ItemHeader a = DzenNews.ItemHeader.a.a(optJSONObject.getJSONObject("title"));
                        Serializer.c<Description> cVar5 = Description.CREATOR;
                        Description description = new Description(optJSONObject.getJSONObject("description").optString("text"));
                        ActionOpenUrl.a aVar = ActionOpenUrl.e;
                        ActionOpenUrl a2 = ActionOpenUrl.a.a(optJSONObject.getJSONObject("action"));
                        String optString = optJSONObject.optString("track_code");
                        int optInt = optJSONObject.optInt("date");
                        JSONObject optJSONObject3 = optJSONObject.optJSONObject("research");
                        if (optJSONObject3 != null) {
                            Serializer.c<NewsfeedResearch> cVar6 = NewsfeedResearch.CREATOR;
                            newsfeedResearch = NewsfeedResearch.a.a(optJSONObject3);
                        }
                        r5.add(new DzenStoryItem(imagePhoto, a, description, a2, optString, optInt, newsfeedResearch));
                    }
                }
            } else {
                r5 = EmptyList.b;
            }
            return new DzenStory(header, r5, jSONObject.optString("track_code"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<DzenStory> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DzenStory a(Serializer serializer) {
            return new DzenStory((Header) serializer.G(Header.class.getClassLoader()), serializer.j(DzenStoryItem.CREATOR), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DzenStory[i];
        }
    }

    public DzenStory(Header header, List<DzenStoryItem> list, String str) {
        super(new NewsEntry.TrackData(str, 0, 0L, false, false, null, null, 0, 254, null));
        this.i = header;
        this.j = list;
        this.k = str;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return "dzen_story_news";
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.i);
        serializer.o0(this.j);
        serializer.j0(this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DzenStory)) {
            return false;
        }
        DzenStory dzenStory = (DzenStory) obj;
        return epx.f(this.i, dzenStory.i) && epx.f(this.j, dzenStory.j) && epx.f(this.k, dzenStory.k);
    }

    public final int hashCode() {
        int a2 = fw3.a(this.i.hashCode() * 31, 31, this.j);
        String str = this.k;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DzenStory(header=");
        sb.append(this.i);
        sb.append(", items=");
        sb.append(this.j);
        sb.append(", trackCode=");
        return ho8.a(sb, this.k, ')');
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 58;
    }
}
