package com.vk.dto.newsfeed.entries;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.LinkButton;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoTag;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.cqm0;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.urd0;

/* compiled from: TagsSuggestions.kt */
/* loaded from: classes18.dex */
public final class TagsSuggestions extends NewsEntry {
    public static final Serializer.c<TagsSuggestions> CREATOR = new b();
    public final List<Item> i;
    public final EndCard j;
    public final String k;
    public final String l;

    /* compiled from: TagsSuggestions.kt */
    public static final class Button extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Button> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Button> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Button a(Serializer serializer) {
                return new Button(serializer.H(), serializer.H(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Button[i];
            }
        }

        public Button(String str, String str2, String str3) {
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return epx.f(this.b, button.b) && epx.f(this.c, button.c) && epx.f(this.d, button.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Button(title=");
            sb.append(this.b);
            sb.append(", action=");
            sb.append(this.c);
            sb.append(", style=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: TagsSuggestions.kt */
    public static final class EndCard extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<EndCard> CREATOR = new a();
        public final String b;
        public final LinkButton c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<EndCard> {
            @Override // com.vk.core.serialize.Serializer.c
            public final EndCard a(Serializer serializer) {
                return new EndCard(serializer.H(), (LinkButton) serializer.G(LinkButton.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EndCard[i];
            }
        }

        public EndCard(String str, LinkButton linkButton) {
            this.b = str;
            this.c = linkButton;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.i0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EndCard)) {
                return false;
            }
            EndCard endCard = (EndCard) obj;
            return epx.f(this.b, endCard.b) && epx.f(this.c, endCard.c);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            LinkButton linkButton = this.c;
            return hashCode + (linkButton != null ? linkButton.hashCode() : 0);
        }

        public final String toString() {
            return "EndCard(subtitle=" + this.b + ", button=" + this.c + ')';
        }
    }

    /* compiled from: TagsSuggestions.kt */
    public static final class Item extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Item> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final Photo e;
        public final List<PhotoTag> f;
        public final List<Button> g;
        public final String h;
        public final boolean i;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Item> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Item a(Serializer serializer) {
                return new Item(serializer.H(), serializer.H(), serializer.H(), (Photo) serializer.G(Photo.class.getClassLoader()), serializer.k(PhotoTag.class), serializer.k(Button.class), serializer.H(), serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Item[i];
            }
        }

        public Item(String str, String str2, String str3, Photo photo, List<PhotoTag> list, List<Button> list2, String str4, boolean z) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = photo;
            this.f = list;
            this.g = list2;
            this.h = str4;
            this.i = z;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.i0(this.e);
            serializer.W(this.f);
            serializer.W(this.g);
            serializer.j0(this.h);
            serializer.L(this.i ? (byte) 1 : (byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return epx.f(this.b, item.b) && epx.f(this.c, item.c) && epx.f(this.d, item.d) && epx.f(this.e, item.e) && epx.f(this.f, item.f) && epx.f(this.g, item.g) && epx.f(this.h, item.h) && this.i == item.i;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            int a2 = fw3.a(fw3.a((this.e.hashCode() + urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31, 31, this.f), 31, this.g);
            String str2 = this.h;
            return Boolean.hashCode(this.i) + ((a2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Item(title=");
            sb.append(this.b);
            sb.append(", caption=");
            sb.append(this.c);
            sb.append(", type=");
            sb.append(this.d);
            sb.append(", photo=");
            sb.append(this.e);
            sb.append(", tags=");
            sb.append(this.f);
            sb.append(", buttons=");
            sb.append(this.g);
            sb.append(", trackCode=");
            sb.append(this.h);
            sb.append(", isRecognition=");
            return q0.a(sb, this.i, ')');
        }
    }

    /* compiled from: TagsSuggestions.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v16, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v8 */
        /* JADX WARN: Type inference failed for: r4v9, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public static TagsSuggestions a(JSONObject jSONObject, Map map) {
            ?? r5;
            EndCard endCard;
            JSONArray jSONArray;
            int i;
            int i2;
            ?? r4;
            ArrayList arrayList;
            int i3;
            int i4;
            int i5;
            int i6;
            Owner owner;
            Map map2 = map;
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray != null) {
                r5 = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                int i7 = 0;
                while (i7 < length) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i7);
                    if (optJSONObject != null) {
                        Serializer.c<Item> cVar = Item.CREATOR;
                        Photo photo = (Photo) Photo.R.a(optJSONObject.getJSONObject("photo"));
                        photo.B = (map2 == null || (owner = (Owner) map2.get(photo.e)) == null) ? null : new UserProfile(owner);
                        String optString = optJSONObject.optString("title");
                        String a = cqm0.a(optJSONObject.optString("caption"));
                        String optString2 = optJSONObject.optString("type");
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("tags");
                        if (optJSONArray2 != null) {
                            r4 = new ArrayList(optJSONArray2.length());
                            int length2 = optJSONArray2.length();
                            int i8 = 0;
                            while (i8 < length2) {
                                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i8);
                                if (optJSONObject2 != null) {
                                    Serializer.c<PhotoTag> cVar2 = PhotoTag.CREATOR;
                                    i6 = i8;
                                    r4.add(PhotoTag.a.a(optJSONObject2));
                                } else {
                                    i6 = i8;
                                }
                                i8 = i6 + 1;
                            }
                        } else {
                            r4 = 0;
                        }
                        if (r4 == 0) {
                            r4 = EmptyList.b;
                        }
                        List list = r4;
                        JSONArray optJSONArray3 = optJSONObject.optJSONArray("buttons");
                        if (optJSONArray3 != null) {
                            arrayList = new ArrayList(optJSONArray3.length());
                            int length3 = optJSONArray3.length();
                            int i9 = 0;
                            while (i9 < length3) {
                                JSONArray jSONArray2 = optJSONArray;
                                JSONObject optJSONObject3 = optJSONArray3.optJSONObject(i9);
                                JSONArray jSONArray3 = optJSONArray3;
                                if (optJSONObject3 != null) {
                                    i3 = length;
                                    i4 = length3;
                                    i5 = i7;
                                    arrayList.add(new Button(optJSONObject3.optString("title"), optJSONObject3.optString("action"), optJSONObject3.optString(TtmlNode.TAG_STYLE)));
                                } else {
                                    i3 = length;
                                    i4 = length3;
                                    i5 = i7;
                                }
                                i9++;
                                optJSONArray3 = jSONArray3;
                                length3 = i4;
                                optJSONArray = jSONArray2;
                                length = i3;
                                i7 = i5;
                            }
                        } else {
                            arrayList = null;
                        }
                        jSONArray = optJSONArray;
                        i = length;
                        i2 = i7;
                        List list2 = arrayList;
                        if (arrayList == null) {
                            list2 = EmptyList.b;
                        }
                        r5.add(new Item(optString, a, optString2, photo, list, list2, cqm0.a(optJSONObject.optString("track_code")), optJSONObject.optBoolean("is_recognition", true)));
                    } else {
                        jSONArray = optJSONArray;
                        i = length;
                        i2 = i7;
                    }
                    i7 = i2 + 1;
                    map2 = map;
                    optJSONArray = jSONArray;
                    length = i;
                }
            } else {
                r5 = 0;
            }
            if (r5 == 0) {
                r5 = EmptyList.b;
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("end_card");
            if (optJSONObject4 != null) {
                Serializer.c<EndCard> cVar3 = EndCard.CREATOR;
                String a2 = cqm0.a(optJSONObject4.optString("subtitle"));
                JSONObject optJSONObject5 = optJSONObject4.optJSONObject("button");
                endCard = new EndCard(a2, optJSONObject5 != null ? new LinkButton(optJSONObject5) : null);
            } else {
                endCard = null;
            }
            return new TagsSuggestions(r5, endCard, cqm0.a(jSONObject.optString("track_code")), jSONObject.optString("recognition_article_link"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<TagsSuggestions> {
        @Override // com.vk.core.serialize.Serializer.c
        public final TagsSuggestions a(Serializer serializer) {
            return new TagsSuggestions(serializer.k(Item.class), (EndCard) serializer.G(EndCard.class.getClassLoader()), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TagsSuggestions[i];
        }
    }

    public TagsSuggestions(List<Item> list, EndCard endCard, String str, String str2) {
        super(new NewsEntry.TrackData(str, 0, 0L, false, false, null, null, 0, 254, null));
        this.i = list;
        this.j = endCard;
        this.k = str;
        this.l = str2;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return "tags_suggestions";
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.i);
        serializer.i0(this.j);
        serializer.j0(this.k);
        serializer.j0(this.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagsSuggestions)) {
            return false;
        }
        TagsSuggestions tagsSuggestions = (TagsSuggestions) obj;
        return epx.f(this.i, tagsSuggestions.i) && epx.f(this.j, tagsSuggestions.j) && epx.f(this.k, tagsSuggestions.k) && epx.f(this.l, tagsSuggestions.l);
    }

    public final int hashCode() {
        int hashCode = this.i.hashCode() * 31;
        EndCard endCard = this.j;
        int hashCode2 = (hashCode + (endCard == null ? 0 : endCard.hashCode())) * 31;
        String str = this.k;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TagsSuggestions(items=");
        sb.append(this.i);
        sb.append(", endCard=");
        sb.append(this.j);
        sb.append(", trackCode=");
        sb.append(this.k);
        sb.append(", infoArticleLink=");
        return ho8.a(sb, this.l, ')');
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 34;
    }
}
