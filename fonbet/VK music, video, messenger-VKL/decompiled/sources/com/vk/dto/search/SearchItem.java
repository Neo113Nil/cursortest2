package com.vk.dto.search;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.NamedActionLink;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.group.Group;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.UserProfile;
import org.json.JSONObject;
import xsna.aay;
import xsna.asp;
import xsna.f370;
import xsna.zrp;

/* compiled from: SearchItem.kt */
/* loaded from: classes18.dex */
public final class SearchItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<SearchItem> CREATOR = new b();
    public final Type b;
    public final UserProfile c;
    public final Group d;
    public final ApiApplication e;
    public final NamedActionLink f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchItem.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final a Companion;
        public static final Type GAME;
        public static final Type GROUP;
        public static final Type LINK;
        public static final Type PROFILE;
        public static final Type UNDEFINED;
        private int t;

        /* compiled from: SearchItem.kt */
        public static final class a {
        }

        static {
            Type type = new Type("UNDEFINED", 0, 0);
            UNDEFINED = type;
            Type type2 = new Type("PROFILE", 1, 1);
            PROFILE = type2;
            Type type3 = new Type("GROUP", 2, 2);
            GROUP = type3;
            Type type4 = new Type("GAME", 3, 3);
            GAME = type4;
            Type type5 = new Type("LINK", 4, 4);
            LINK = type5;
            Type[] typeArr = {type, type2, type3, type4, type5};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new a();
        }

        public Type(String str, int i, int i2) {
            this.t = i2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final int h() {
            return this.t;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<SearchItem> {
        @Override // xsna.aay
        public final SearchItem a(JSONObject jSONObject) {
            return new SearchItem(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<SearchItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SearchItem a(Serializer serializer) {
            return new SearchItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SearchItem[i];
        }
    }

    static {
        new a();
    }

    public SearchItem() {
        this.b = Type.UNDEFINED;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.h());
        serializer.i0(this.c);
        serializer.i0(this.d);
        serializer.i0(this.e);
        serializer.i0(this.f);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public SearchItem(JSONObject jSONObject) {
        this();
        String string = jSONObject.getString("type");
        f370.A("description", jSONObject);
        if (string != null) {
            switch (string.hashCode()) {
                case -309425751:
                    if (string.equals(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)) {
                        this.b = Type.PROFILE;
                        this.c = new UserProfile(jSONObject.getJSONObject(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE));
                        break;
                    }
                    break;
                case 3165170:
                    if (string.equals("game")) {
                        this.b = Type.GAME;
                        this.e = new ApiApplication(jSONObject.getJSONObject("game"));
                        break;
                    }
                    break;
                case 3321850:
                    if (string.equals("link")) {
                        this.b = Type.LINK;
                        Serializer.c<NamedActionLink> cVar = NamedActionLink.CREATOR;
                        JSONObject jSONObject2 = jSONObject.getJSONObject("link");
                        JSONObject optJSONObject = jSONObject2.optJSONObject("photo");
                        Photo photo = (optJSONObject == null || (photo = (Photo) Photo.R.a(optJSONObject)) == null) ? new Photo(Image.d) : photo;
                        ActionOpenUrl.a aVar = ActionOpenUrl.e;
                        this.f = new NamedActionLink(ActionOpenUrl.a.a(jSONObject2), jSONObject2.optString("title"), jSONObject2.optString("caption"), photo);
                        break;
                    }
                    break;
                case 98629247:
                    if (string.equals("group")) {
                        this.b = Type.GROUP;
                        this.d = new Group(jSONObject.getJSONObject("group"));
                        break;
                    }
                    break;
            }
        }
    }

    public SearchItem(Serializer serializer) {
        this();
        Type type;
        Type.a aVar = Type.Companion;
        int u = serializer.u();
        aVar.getClass();
        if (u == 1) {
            type = Type.PROFILE;
        } else if (u == 2) {
            type = Type.GROUP;
        } else if (u == 3) {
            type = Type.GAME;
        } else if (u != 4) {
            type = Type.UNDEFINED;
        } else {
            type = Type.LINK;
        }
        this.b = type;
        this.c = (UserProfile) serializer.G(UserProfile.class.getClassLoader());
        this.d = (Group) serializer.G(Group.class.getClassLoader());
        this.e = (ApiApplication) serializer.G(ApiApplication.class.getClassLoader());
        this.f = (NamedActionLink) serializer.G(NamedActionLink.class.getClassLoader());
    }
}
