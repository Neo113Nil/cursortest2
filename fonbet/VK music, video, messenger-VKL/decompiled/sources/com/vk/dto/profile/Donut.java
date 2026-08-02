package com.vk.dto.profile;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.cqm0;

/* compiled from: Donut.kt */
/* loaded from: classes18.dex */
public final class Donut implements Serializer.StreamParcelable {
    public static final Serializer.c<Donut> CREATOR = new b();
    public final boolean b;
    public final String c;
    public final Action d;
    public final Description e;
    public final WallInfo f;
    public final Integer g;

    /* compiled from: Donut.kt */
    public static final class Description implements Serializer.StreamParcelable {
        public static final Serializer.c<Description> CREATOR = new a();
        public final String b;
        public final Image c;
        public final boolean d;
        public final String e;
        public final LinkButton f;
        public final LinkButton g;
        public final List<UserProfile> h;
        public final List<StatsItem> i;
        public final SubscriptionInfo j;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Description> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Description a(Serializer serializer) {
                return new Description(serializer.H(), (Image) serializer.G(Image.class.getClassLoader()), serializer.m(), serializer.H(), (LinkButton) serializer.G(LinkButton.class.getClassLoader()), (LinkButton) serializer.G(LinkButton.class.getClassLoader()), serializer.B(UserProfile.class.getClassLoader()), serializer.B(StatsItem.class.getClassLoader()), (SubscriptionInfo) serializer.G(SubscriptionInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Description[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Description(String str, Image image, boolean z, String str2, LinkButton linkButton, LinkButton linkButton2, List<? extends UserProfile> list, List<StatsItem> list2, SubscriptionInfo subscriptionInfo) {
            this.b = str;
            this.c = image;
            this.d = z;
            this.e = str2;
            this.f = linkButton;
            this.g = linkButton2;
            this.h = list;
            this.i = list2;
            this.j = subscriptionInfo;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.i0(this.c);
            serializer.L(this.d ? (byte) 1 : (byte) 0);
            serializer.j0(this.e);
            serializer.i0(this.f);
            serializer.i0(this.g);
            serializer.f0(this.h);
            serializer.f0(this.i);
            serializer.i0(this.j);
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

    /* compiled from: Donut.kt */
    public static final class StatsItem implements Serializer.StreamParcelable {
        public static final Serializer.c<StatsItem> CREATOR = new a();
        public final String b;
        public final String c;
        public final boolean d;
        public final Action e;
        public final String f;
        public final int g;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<StatsItem> {
            @Override // com.vk.core.serialize.Serializer.c
            public final StatsItem a(Serializer serializer) {
                return new StatsItem(serializer.H(), serializer.H(), serializer.m(), (Action) serializer.G(Action.class.getClassLoader()), serializer.H(), serializer.u());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StatsItem[i];
            }
        }

        public StatsItem(String str, String str2, boolean z, Action action, String str3, int i) {
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = action;
            this.f = str3;
            this.g = i;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.L(this.d ? (byte) 1 : (byte) 0);
            serializer.i0(this.e);
            serializer.j0(this.f);
            serializer.S(this.g);
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

    /* compiled from: Donut.kt */
    public static final class SubscriptionInfo implements Serializer.StreamParcelable {
        public static final Serializer.c<SubscriptionInfo> CREATOR = new a();
        public final String b;
        public final LinkButton c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<SubscriptionInfo> {
            @Override // com.vk.core.serialize.Serializer.c
            public final SubscriptionInfo a(Serializer serializer) {
                return new SubscriptionInfo(serializer.H(), (LinkButton) serializer.G(LinkButton.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubscriptionInfo[i];
            }
        }

        public SubscriptionInfo(String str, LinkButton linkButton) {
            this.b = str;
            this.c = linkButton;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.i0(this.c);
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

    /* compiled from: Donut.kt */
    public static final class WallInfo implements Serializer.StreamParcelable {
        public static final Serializer.c<WallInfo> CREATOR = new a();
        public final boolean b;
        public final boolean c;
        public final Widget d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<WallInfo> {
            @Override // com.vk.core.serialize.Serializer.c
            public final WallInfo a(Serializer serializer) {
                return new WallInfo(serializer.m(), serializer.m(), (Widget) serializer.G(Widget.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WallInfo[i];
            }
        }

        public WallInfo(boolean z, boolean z2, Widget widget) {
            this.b = z;
            this.c = z2;
            this.d = widget;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.L(this.b ? (byte) 1 : (byte) 0);
            serializer.L(this.c ? (byte) 1 : (byte) 0);
            serializer.i0(this.d);
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

    /* compiled from: Donut.kt */
    public static final class Widget implements Serializer.StreamParcelable {
        public static final Serializer.c<Widget> CREATOR = new a();
        public final String b;
        public final Image c;
        public final String d;
        public final LinkButton e;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Widget> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Widget a(Serializer serializer) {
                return new Widget(serializer.H(), (Image) serializer.G(Image.class.getClassLoader()), serializer.H(), (LinkButton) serializer.G(LinkButton.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Widget[i];
            }
        }

        public Widget(String str, Image image, String str2, LinkButton linkButton) {
            this.b = str;
            this.c = image;
            this.d = str2;
            this.e = linkButton;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.i0(this.c);
            serializer.j0(this.d);
            serializer.i0(this.e);
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

    /* compiled from: Donut.kt */
    public static final class a {
        public static Donut a(JSONObject jSONObject) {
            Action action;
            Description description;
            WallInfo wallInfo;
            Widget widget;
            LinkButton linkButton;
            Image image;
            ArrayList arrayList;
            ArrayList arrayList2;
            SubscriptionInfo subscriptionInfo;
            String str;
            JSONArray jSONArray;
            Action action2;
            boolean optBoolean = jSONObject.optBoolean("is_don");
            String optString = jSONObject.optString("status");
            JSONObject optJSONObject = jSONObject.optJSONObject("payment_link");
            if (optJSONObject != null) {
                Action.b bVar = Action.b;
                action = Action.a.a(optJSONObject);
            } else {
                action = null;
            }
            String str2 = "description";
            JSONObject optJSONObject2 = jSONObject.optJSONObject("description");
            if (optJSONObject2 != null) {
                Serializer.c<Description> cVar = Description.CREATOR;
                String optString2 = optJSONObject2.optString("title");
                JSONArray optJSONArray = optJSONObject2.optJSONArray("image");
                Image image2 = optJSONArray != null ? new Image(optJSONArray, null, 2, null) : null;
                boolean optBoolean2 = optJSONObject2.optBoolean("has_icon");
                String a = cqm0.a(optJSONObject2.optString("text"));
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("about_button");
                LinkButton linkButton2 = optJSONObject3 != null ? new LinkButton(optJSONObject3) : null;
                JSONObject optJSONObject4 = optJSONObject2.optJSONObject("button");
                LinkButton linkButton3 = optJSONObject4 != null ? new LinkButton(optJSONObject4) : null;
                JSONArray optJSONArray2 = optJSONObject2.optJSONArray("friends");
                if (optJSONArray2 != null) {
                    ArrayList arrayList3 = new ArrayList(optJSONArray2.length());
                    int length = optJSONArray2.length();
                    int i = 0;
                    while (i < length) {
                        JSONObject optJSONObject5 = optJSONArray2.optJSONObject(i);
                        int i2 = length;
                        if (optJSONObject5 != null) {
                            arrayList3.add(new UserProfile(optJSONObject5));
                        }
                        i++;
                        length = i2;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                JSONArray optJSONArray3 = optJSONObject2.optJSONArray("statistics");
                if (optJSONArray3 != null) {
                    ArrayList arrayList4 = new ArrayList(optJSONArray3.length());
                    int length2 = optJSONArray3.length();
                    int i3 = 0;
                    while (i3 < length2) {
                        JSONObject optJSONObject6 = optJSONArray3.optJSONObject(i3);
                        if (optJSONObject6 != null) {
                            Serializer.c<StatsItem> cVar2 = StatsItem.CREATOR;
                            jSONArray = optJSONArray3;
                            String optString3 = optJSONObject6.optString("icon");
                            String optString4 = optJSONObject6.optString(str2);
                            boolean optBoolean3 = optJSONObject6.optBoolean("show_friends");
                            JSONObject optJSONObject7 = optJSONObject6.optJSONObject("action");
                            if (optJSONObject7 != null) {
                                Action.b bVar2 = Action.b;
                                action2 = Action.a.a(optJSONObject7);
                            } else {
                                action2 = null;
                            }
                            str = str2;
                            arrayList4.add(new StatsItem(optString3, optString4, optBoolean3, action2, cqm0.a(optJSONObject6.optString("track_code")), optJSONObject6.optInt("value", 0)));
                        } else {
                            str = str2;
                            jSONArray = optJSONArray3;
                        }
                        i3++;
                        optJSONArray3 = jSONArray;
                        str2 = str;
                    }
                    arrayList2 = arrayList4;
                } else {
                    arrayList2 = null;
                }
                JSONObject optJSONObject8 = optJSONObject2.optJSONObject("subscription_info");
                if (optJSONObject8 != null) {
                    Serializer.c<SubscriptionInfo> cVar3 = SubscriptionInfo.CREATOR;
                    String a2 = cqm0.a(optJSONObject8.optString("text"));
                    JSONObject optJSONObject9 = optJSONObject8.optJSONObject("button");
                    subscriptionInfo = new SubscriptionInfo(a2, optJSONObject9 != null ? new LinkButton(optJSONObject9) : null);
                } else {
                    subscriptionInfo = null;
                }
                description = new Description(optString2, image2, optBoolean2, a, linkButton2, linkButton3, arrayList, arrayList2, subscriptionInfo);
            } else {
                description = null;
            }
            JSONObject optJSONObject10 = jSONObject.optJSONObject("wall");
            if (optJSONObject10 != null) {
                Serializer.c<WallInfo> cVar4 = WallInfo.CREATOR;
                boolean optBoolean4 = optJSONObject10.optBoolean("is_enabled");
                boolean optBoolean5 = optJSONObject10.optBoolean("available");
                JSONObject optJSONObject11 = optJSONObject10.optJSONObject("widget");
                if (optJSONObject11 != null) {
                    Serializer.c<Widget> cVar5 = Widget.CREATOR;
                    String optString5 = optJSONObject11.optString("title");
                    JSONArray optJSONArray4 = optJSONObject11.optJSONArray("image");
                    if (optJSONArray4 != null) {
                        linkButton = null;
                        image = new Image(optJSONArray4, null, 2, null);
                    } else {
                        linkButton = null;
                        image = null;
                    }
                    String optString6 = optJSONObject11.optString("text");
                    JSONObject optJSONObject12 = optJSONObject11.optJSONObject("button");
                    widget = new Widget(optString5, image, optString6, optJSONObject12 != null ? new LinkButton(optJSONObject12) : linkButton);
                } else {
                    widget = null;
                }
                wallInfo = new WallInfo(optBoolean4, optBoolean5, widget);
            } else {
                wallInfo = null;
            }
            return new Donut(optBoolean, optString, action, description, wallInfo, Integer.valueOf(jSONObject.optInt("active_levels_count", 0)));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Donut> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Donut a(Serializer serializer) {
            return new Donut(serializer.m(), serializer.H(), (Action) serializer.G(Action.class.getClassLoader()), (Description) serializer.G(Description.class.getClassLoader()), (WallInfo) serializer.G(WallInfo.class.getClassLoader()), serializer.v());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Donut[i];
        }
    }

    public Donut(boolean z, String str, Action action, Description description, WallInfo wallInfo, Integer num) {
        this.b = z;
        this.c = str;
        this.d = action;
        this.e = description;
        this.f = wallInfo;
        this.g = num;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.j0(this.c);
        serializer.i0(this.d);
        serializer.i0(this.e);
        serializer.i0(this.f);
        serializer.V(this.g);
    }

    public final boolean d() {
        Integer num = this.g;
        return (num != null ? num.intValue() : 0) > 0;
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
