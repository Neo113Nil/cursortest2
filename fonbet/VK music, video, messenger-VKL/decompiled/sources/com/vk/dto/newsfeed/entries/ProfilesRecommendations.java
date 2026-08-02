package com.vk.dto.newsfeed.entries;

import android.os.Parcel;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.common.actions.Action;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.asp;
import xsna.cqm0;
import xsna.dz5;
import xsna.epx;
import xsna.ho8;
import xsna.iux0;
import xsna.kci;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ProfilesRecommendations.kt */
/* loaded from: classes18.dex */
public final class ProfilesRecommendations extends NewsEntry implements iux0 {
    public static final Serializer.c<ProfilesRecommendations> CREATOR = new b();
    public final String i;
    public final String j;
    public String k;
    public final ArrayList<RecommendedProfile> l;
    public final int m;
    public final InfoCard n;
    public final Footer o;
    public final String p;
    public final NewsEntry.TrackData q;

    /* compiled from: ProfilesRecommendations.kt */
    public static final class Footer implements Serializer.StreamParcelable {
        public static final Serializer.c<Footer> CREATOR = new a();
        public final Icon b;
        public final Action c;
        public final String d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ProfilesRecommendations.kt */
        public static final class Icon {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Icon[] $VALUES;
            public static final Icon CHEVRON;

            static {
                Icon icon = new Icon("CHEVRON", 0);
                CHEVRON = icon;
                Icon[] iconArr = {icon};
                $VALUES = iconArr;
                $ENTRIES = new asp(iconArr);
            }

            public Icon() {
                throw null;
            }

            public static Icon valueOf(String str) {
                return (Icon) Enum.valueOf(Icon.class, str);
            }

            public static Icon[] values() {
                return (Icon[]) $VALUES.clone();
            }
        }

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Footer> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Footer a(Serializer serializer) {
                return new Footer((Icon) serializer.C(), (Action) serializer.G(Action.class.getClassLoader()), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Footer[i];
            }
        }

        public Footer(Icon icon, Action action, String str) {
            this.b = icon;
            this.c = action;
            this.d = str;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.g0(this.b);
            serializer.i0(this.c);
            serializer.j0(this.d);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !Footer.class.equals(obj.getClass())) {
                return false;
            }
            Footer footer = (Footer) obj;
            return this.b == footer.b && epx.f(this.c, footer.c) && epx.f(this.d, footer.d);
        }

        public final int hashCode() {
            Action action = this.c;
            int hashCode = (action != null ? action.hashCode() : 0) * 31;
            String str = this.d;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            Icon icon = this.b;
            return hashCode2 + (icon != null ? icon.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Footer(icon=");
            sb.append(this.b);
            sb.append(", action=");
            sb.append(this.c);
            sb.append(", text=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: ProfilesRecommendations.kt */
    public static final class InfoCard extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<InfoCard> CREATOR = new b();
        public final Template b;
        public final int c;
        public final String d;
        public final String e;
        public final String[] f;
        public final String g;
        public final Image h;
        public final List<ImageSize> i;
        public final int j;
        public final Action k;
        public final String l;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ProfilesRecommendations.kt */
        public static final class Template {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Template[] $VALUES;
            public static final Template DEFAULT;
            public static final Template IMPORT;
            public static final Template IMPORT_PHOTOS;

            static {
                Template template = new Template("IMPORT", 0);
                IMPORT = template;
                Template template2 = new Template("DEFAULT", 1);
                DEFAULT = template2;
                Template template3 = new Template("IMPORT_PHOTOS", 2);
                IMPORT_PHOTOS = template3;
                Template[] templateArr = {template, template2, template3};
                $VALUES = templateArr;
                $ENTRIES = new asp(templateArr);
            }

            public Template() {
                throw null;
            }

            public static zrp<Template> h() {
                return $ENTRIES;
            }

            public static Template valueOf(String str) {
                return (Template) Enum.valueOf(Template.class, str);
            }

            public static Template[] values() {
                return (Template[]) $VALUES.clone();
            }
        }

        /* compiled from: ProfilesRecommendations.kt */
        public static final class a {
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v3 */
            /* JADX WARN: Type inference failed for: r3v4 */
            /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r3v6 */
            /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v10 */
            /* JADX WARN: Type inference failed for: r4v3 */
            /* JADX WARN: Type inference failed for: r4v4 */
            /* JADX WARN: Type inference failed for: r4v5 */
            /* JADX WARN: Type inference failed for: r4v6 */
            /* JADX WARN: Type inference failed for: r4v7 */
            /* JADX WARN: Type inference failed for: r4v8 */
            /* JADX WARN: Type inference failed for: r4v9 */
            public static InfoCard a(JSONObject jSONObject) {
                Action action;
                Object obj;
                ?? r3;
                ?? r4;
                ?? r42;
                ?? r43;
                ?? r44;
                String optString = jSONObject.optString("template");
                Iterator it = Template.h().iterator();
                while (true) {
                    action = null;
                    r44 = 0;
                    r43 = 0;
                    r42 = 0;
                    r4 = 0;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((Template) obj).name().toLowerCase(Locale.ROOT).equals(optString)) {
                        break;
                    }
                }
                Template template = (Template) obj;
                int i = -1;
                if (template != null && jSONObject.has(X3.i.L)) {
                    i = jSONObject.getInt(X3.i.L);
                }
                int i2 = i;
                String a = cqm0.a(jSONObject.optString("title"));
                String a2 = cqm0.a(jSONObject.optString("subtitle"));
                JSONArray optJSONArray = jSONObject.optJSONArray("descriptions");
                String[] G = optJSONArray != null ? dz5.G(optJSONArray) : null;
                String optString2 = jSONObject.optString("button_text");
                JSONArray optJSONArray2 = jSONObject.optJSONArray("icon");
                int i3 = 2;
                Image image = optJSONArray2 != null ? new Image(optJSONArray2, r4 == true ? 1 : 0, i3, r42 == true ? 1 : 0) : null;
                JSONArray optJSONArray3 = jSONObject.optJSONArray("images");
                if (optJSONArray3 != null) {
                    r3 = new ArrayList(optJSONArray3.length());
                    int length = optJSONArray3.length();
                    for (int i4 = 0; i4 < length; i4++) {
                        JSONObject optJSONObject = optJSONArray3.optJSONObject(i4);
                        if (optJSONObject != null) {
                            r3.add(new ImageSize(optJSONObject, (String) (r43 == true ? 1 : 0), i3, (zcl) (r44 == true ? 1 : 0)));
                        }
                    }
                } else {
                    r3 = 0;
                }
                if (r3 == 0) {
                    r3 = EmptyList.b;
                }
                List list = r3;
                int optInt = jSONObject.optInt("friends_count");
                JSONObject optJSONObject2 = jSONObject.optJSONObject("action");
                if (optJSONObject2 != null) {
                    Action.b bVar = Action.b;
                    action = Action.a.a(optJSONObject2);
                }
                return new InfoCard(template, i2, a, a2, G, optString2, image, list, optInt, action, jSONObject.optString("track_code"));
            }
        }

        /* compiled from: Serializer.kt */
        public static final class b extends Serializer.c<InfoCard> {
            @Override // com.vk.core.serialize.Serializer.c
            public final InfoCard a(Serializer serializer) {
                Object obj;
                String H = serializer.H();
                Iterator<E> it = Template.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((Template) obj).name().toLowerCase(Locale.ROOT).equals(H)) {
                        break;
                    }
                }
                return new InfoCard((Template) obj, serializer.u(), serializer.H(), serializer.H(), serializer.g(), serializer.H(), (Image) serializer.G(Image.class.getClassLoader()), serializer.k(ImageSize.class), serializer.u(), (Action) serializer.G(Action.class.getClassLoader()), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InfoCard[i];
            }
        }

        public InfoCard(Template template, int i, String str, String str2, String[] strArr, String str3, Image image, List<ImageSize> list, int i2, Action action, String str4) {
            this.b = template;
            this.c = i;
            this.d = str;
            this.e = str2;
            this.f = strArr;
            this.g = str3;
            this.h = image;
            this.i = list;
            this.j = i2;
            this.k = action;
            this.l = str4;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            Template template = this.b;
            serializer.j0(template != null ? template.name() : null);
            serializer.S(this.c);
            serializer.j0(this.d);
            serializer.j0(this.e);
            serializer.k0(this.f);
            serializer.j0(this.g);
            serializer.i0(this.h);
            serializer.W(this.i);
            serializer.S(this.j);
            serializer.i0(this.k);
            serializer.j0(this.l);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!InfoCard.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            InfoCard infoCard = (InfoCard) obj;
            return this.b == infoCard.b && this.c == infoCard.c && epx.f(this.d, infoCard.d) && epx.f(this.e, infoCard.e) && epx.f(this.g, infoCard.g) && epx.f(this.k, infoCard.k) && epx.f(this.l, infoCard.l) && epx.f(this.i, infoCard.i) && this.j == infoCard.j;
        }

        public final int hashCode() {
            Template template = this.b;
            int hashCode = ((((template != null ? template.hashCode() : 0) + 17) * 31) + this.c) * 31;
            String str = this.d;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.e;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.g;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            Action action = this.k;
            int a2 = urd0.a((hashCode4 + (action != null ? action.hashCode() : 0)) * 31, 31, this.l);
            List<ImageSize> list = this.i;
            return ((a2 + (list != null ? list.hashCode() : 0)) * 31) + this.j;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InfoCard(template=");
            sb.append(this.b);
            sb.append(", position=");
            sb.append(this.c);
            sb.append(", title=");
            sb.append(this.d);
            sb.append(", subtitle=");
            sb.append(this.e);
            sb.append(", descriptions=");
            sb.append(Arrays.toString(this.f));
            sb.append(", buttonText=");
            sb.append(this.g);
            sb.append(", icon=");
            sb.append(this.h);
            sb.append(", images=");
            sb.append(this.i);
            sb.append(", friendsCount=");
            sb.append(this.j);
            sb.append(", action=");
            sb.append(this.k);
            sb.append(", trackCode=");
            return ho8.a(sb, this.l, ')');
        }
    }

    /* compiled from: ProfilesRecommendations.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v5, types: [com.vk.dto.newsfeed.entries.ProfilesRecommendations$Footer] */
        /* JADX WARN: Type inference failed for: r9v1, types: [com.vk.dto.newsfeed.entries.ProfilesRecommendations$Footer] */
        public static ProfilesRecommendations a(JSONObject jSONObject) {
            ArrayList arrayList;
            InfoCard infoCard;
            String optString = jSONObject.optString("type");
            String optString2 = jSONObject.optString("title");
            String optString3 = jSONObject.optString("next_from");
            JSONArray jSONArray = jSONObject.getJSONArray("profiles");
            Action action = null;
            if (jSONArray != null) {
                arrayList = new ArrayList(jSONArray.length());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        arrayList.add(kci.d(optString, optJSONObject));
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("info_card");
            if (optJSONObject2 != null) {
                Serializer.c<InfoCard> cVar = InfoCard.CREATOR;
                infoCard = InfoCard.a.a(optJSONObject2);
            } else {
                infoCard = null;
            }
            NewsEntry.TrackData trackData = new NewsEntry.TrackData(jSONObject.optString("track_code"), 0, 0L, false, false, null, null, 0, 254, null);
            int optInt = jSONObject.optInt("profile_id");
            String a = cqm0.a(jSONObject.optString("reason"));
            JSONObject optJSONObject3 = jSONObject.optJSONObject("footer");
            if (optJSONObject3 != null) {
                Serializer.c<Footer> cVar2 = Footer.CREATOR;
                String a2 = cqm0.a(optJSONObject3.optString("icon"));
                Footer.Icon valueOf = a2 != null ? Footer.Icon.valueOf(a2.toUpperCase(Locale.ROOT)) : null;
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject("action");
                if (optJSONObject4 != null) {
                    Action.b.getClass();
                    action = Action.a.a(optJSONObject4);
                }
                action = new Footer(valueOf, action, cqm0.a(optJSONObject3.optString("text")));
            }
            return new ProfilesRecommendations(optString, optString2, optString3, arrayList, optInt, infoCard, action, a, trackData);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ProfilesRecommendations> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ProfilesRecommendations a(Serializer serializer) {
            return new ProfilesRecommendations(serializer.H(), serializer.H(), serializer.H(), serializer.B(RecommendedProfile.class.getClassLoader()), serializer.u(), (InfoCard) serializer.G(InfoCard.class.getClassLoader()), (Footer) serializer.G(Footer.class.getClassLoader()), serializer.H(), (NewsEntry.TrackData) serializer.G(NewsEntry.TrackData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProfilesRecommendations[i];
        }
    }

    public ProfilesRecommendations(String str, String str2, String str3, ArrayList<RecommendedProfile> arrayList, int i, InfoCard infoCard, Footer footer, String str4, NewsEntry.TrackData trackData) {
        super(trackData);
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = arrayList;
        this.m = i;
        this.n = infoCard;
        this.o = footer;
        this.p = str4;
        this.q = trackData;
    }

    public static ProfilesRecommendations Eb(ProfilesRecommendations profilesRecommendations, String str, String str2, ArrayList arrayList, InfoCard infoCard, NewsEntry.TrackData trackData) {
        String str3 = profilesRecommendations.i;
        int i = profilesRecommendations.m;
        Footer footer = profilesRecommendations.o;
        String str4 = profilesRecommendations.p;
        profilesRecommendations.getClass();
        return new ProfilesRecommendations(str3, str, str2, arrayList, i, infoCard, footer, str4, trackData);
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Ab() {
        return this.i;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Bb() {
        return this.i;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final NewsEntry.TrackData Cb() {
        return this.q;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return this.i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.f0(this.l);
        serializer.S(this.m);
        serializer.i0(this.n);
        serializer.i0(this.o);
        serializer.j0(this.p);
        serializer.i0(this.q);
    }

    public final boolean equals(Object obj) {
        InfoCard infoCard;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProfilesRecommendations) {
            ProfilesRecommendations profilesRecommendations = (ProfilesRecommendations) obj;
            if (epx.f(this.i, profilesRecommendations.i) && epx.f(this.j, profilesRecommendations.j) && (((infoCard = this.n) == null && profilesRecommendations.n == null) || (infoCard != null && infoCard.equals(profilesRecommendations.n)))) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.iux0, xsna.kru
    public final String getTitle() {
        return this.j;
    }

    public final int hashCode() {
        int a2 = urd0.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.i);
        String str = this.j;
        int hashCode = a2 + (str != null ? str.hashCode() : 0);
        InfoCard infoCard = this.n;
        if (infoCard != null) {
            return infoCard.hashCode() + (hashCode * 31);
        }
        return hashCode;
    }

    public final String toString() {
        return "ProfilesRecommendations(type=" + this.i + ", title=" + this.j + ", nextFrom=" + this.k + ", profiles=" + this.l + ", profileId=" + this.m + ", infoCard=" + this.n + ", footer=" + this.o + ", reason=" + this.p + ", trackData=" + this.q + ')';
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 13;
    }
}
