package com.vk.dto.group;

import com.vk.core.serialize.Serializer;
import com.vk.dto.group.GroupContentTabCollectionType;
import com.vk.dto.group.GroupContentTabType;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.asp;
import xsna.c5g;
import xsna.epx;
import xsna.f370;
import xsna.j5g;
import xsna.ms9;
import xsna.qoy;
import xsna.shy;
import xsna.tn;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupContentTabSetting.kt */
/* loaded from: classes18.dex */
public final class GroupContentTabSetting extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GroupContentTabSetting> CREATOR = new b();
    public static final a j = new a();
    public final GroupContentTabType b;
    public final List<GroupContentTabType> c;
    public final boolean d;
    public final boolean e;
    public final GroupContentTabTabletConfig f;
    public final List<GroupContentTabCollection> g;
    public final GroupContentTabSpecialValues h;
    public final boolean i;

    /* compiled from: GroupContentTabSetting.kt */
    public static final class GroupContentTabSpecialValues extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<GroupContentTabSpecialValues> CREATOR = new a();
        public final Integer b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<GroupContentTabSpecialValues> {
            @Override // com.vk.core.serialize.Serializer.c
            public final GroupContentTabSpecialValues a(Serializer serializer) {
                return new GroupContentTabSpecialValues(serializer.v());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GroupContentTabSpecialValues[i];
            }
        }

        public GroupContentTabSpecialValues(Integer num) {
            this.b = num;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.V(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GroupContentTabSpecialValues) && epx.f(this.b, ((GroupContentTabSpecialValues) obj).b);
        }

        public final int hashCode() {
            Integer num = this.b;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return uqi.b(new StringBuilder("GroupContentTabSpecialValues(coOwnerInvitationsCount="), this.b, ')');
        }
    }

    /* compiled from: GroupContentTabSetting.kt */
    public static final class GroupContentTabTabletConfig extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<GroupContentTabTabletConfig> CREATOR = new a();
        public final boolean b;
        public final Boolean c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<GroupContentTabTabletConfig> {
            @Override // com.vk.core.serialize.Serializer.c
            public final GroupContentTabTabletConfig a(Serializer serializer) {
                return new GroupContentTabTabletConfig(serializer.m(), serializer.n());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GroupContentTabTabletConfig[i];
            }
        }

        public GroupContentTabTabletConfig(boolean z, Boolean bool) {
            this.b = z;
            this.c = bool;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.L(this.b ? (byte) 1 : (byte) 0);
            serializer.J(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupContentTabTabletConfig)) {
                return false;
            }
            GroupContentTabTabletConfig groupContentTabTabletConfig = (GroupContentTabTabletConfig) obj;
            return this.b == groupContentTabTabletConfig.b && epx.f(this.c, groupContentTabTabletConfig.c);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.b) * 31;
            Boolean bool = this.c;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GroupContentTabTabletConfig(isShown=");
            sb.append(this.b);
            sb.append(", canAdd=");
            return tn.a(sb, this.c, ')');
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<GroupContentTabSetting> {
        @Override // xsna.aay
        public final GroupContentTabSetting a(JSONObject jSONObject) {
            return new GroupContentTabSetting(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<GroupContentTabSetting> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupContentTabSetting a(Serializer serializer) {
            return new GroupContentTabSetting(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupContentTabSetting[i];
        }
    }

    public /* synthetic */ GroupContentTabSetting(GroupContentTabType groupContentTabType, List list, boolean z, boolean z2, GroupContentTabTabletConfig groupContentTabTabletConfig, List list2, GroupContentTabSpecialValues groupContentTabSpecialValues, boolean z3, int i, zcl zclVar) {
        this(groupContentTabType, (i & 2) != 0 ? null : list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : groupContentTabTabletConfig, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : groupContentTabSpecialValues, (i & 128) != 0 ? false : z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.vk.core.serialize.Serializer] */
    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        ?? r1;
        serializer.j0(this.b.getId());
        List<GroupContentTabType> list = this.c;
        if (list != null) {
            List<GroupContentTabType> list2 = list;
            r1 = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                r1.add(((GroupContentTabType) it.next()).getId());
            }
        } else {
            r1 = 0;
        }
        if (r1 == 0) {
            r1 = EmptyList.b;
        }
        serializer.l0(r1);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.i0(this.f);
        serializer.W(this.g);
        serializer.i0(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupContentTabSetting)) {
            return false;
        }
        GroupContentTabSetting groupContentTabSetting = (GroupContentTabSetting) obj;
        return this.b == groupContentTabSetting.b && epx.f(this.c, groupContentTabSetting.c) && this.d == groupContentTabSetting.d && this.e == groupContentTabSetting.e && epx.f(this.f, groupContentTabSetting.f) && epx.f(this.g, groupContentTabSetting.g) && epx.f(this.h, groupContentTabSetting.h) && this.i == groupContentTabSetting.i;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        List<GroupContentTabType> list = this.c;
        int b2 = qoy.b(qoy.b((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.d), 31, this.e);
        GroupContentTabTabletConfig groupContentTabTabletConfig = this.f;
        int hashCode2 = (b2 + (groupContentTabTabletConfig == null ? 0 : groupContentTabTabletConfig.hashCode())) * 31;
        List<GroupContentTabCollection> list2 = this.g;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        GroupContentTabSpecialValues groupContentTabSpecialValues = this.h;
        return Boolean.hashCode(this.i) + ((hashCode3 + (groupContentTabSpecialValues != null ? groupContentTabSpecialValues.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupContentTabSetting(mainType=");
        sb.append(this.b);
        sb.append(", additionalTypes=");
        sb.append(this.c);
        sb.append(", canAdd=");
        sb.append(this.d);
        sb.append(", showMore=");
        sb.append(this.e);
        sb.append(", tabletConfig=");
        sb.append(this.f);
        sb.append(", collections=");
        sb.append(this.g);
        sb.append(", specialValues=");
        sb.append(this.h);
        sb.append(", isEmpty=");
        return q0.a(sb, this.i, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupContentTabSetting(GroupContentTabType groupContentTabType, List<? extends GroupContentTabType> list, boolean z, boolean z2, GroupContentTabTabletConfig groupContentTabTabletConfig, List<GroupContentTabCollection> list2, GroupContentTabSpecialValues groupContentTabSpecialValues, boolean z3) {
        this.b = groupContentTabType;
        this.c = list;
        this.d = z;
        this.e = z2;
        this.f = groupContentTabTabletConfig;
        this.g = list2;
        this.h = groupContentTabSpecialValues;
        this.i = z3;
    }

    /* compiled from: GroupContentTabSetting.kt */
    public static final class GroupContentTabCollection extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<GroupContentTabCollection> CREATOR = new b();
        public static final a e = new a();
        public final GroupContentTabCollectionType b;
        public final int c;
        public final List<GroupContentTabCollectionImage> d;

        /* compiled from: JsonParser.kt */
        public static final class a extends aay<GroupContentTabCollection> {
            @Override // xsna.aay
            public final GroupContentTabCollection a(JSONObject jSONObject) {
                return new GroupContentTabCollection(jSONObject);
            }
        }

        /* compiled from: Serializer.kt */
        public static final class b extends Serializer.c<GroupContentTabCollection> {
            @Override // com.vk.core.serialize.Serializer.c
            public final GroupContentTabCollection a(Serializer serializer) {
                return new GroupContentTabCollection(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GroupContentTabCollection[i];
            }
        }

        public GroupContentTabCollection(GroupContentTabCollectionType groupContentTabCollectionType, int i, List<GroupContentTabCollectionImage> list) {
            this.b = groupContentTabCollectionType;
            this.c = i;
            this.d = list;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b.getId());
            serializer.S(this.c);
            serializer.W(this.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupContentTabCollection)) {
                return false;
            }
            GroupContentTabCollection groupContentTabCollection = (GroupContentTabCollection) obj;
            return this.b == groupContentTabCollection.b && this.c == groupContentTabCollection.c && epx.f(this.d, groupContentTabCollection.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + shy.a(this.c, this.b.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GroupContentTabCollection(collectionType=");
            sb.append(this.b);
            sb.append(", count=");
            sb.append(this.c);
            sb.append(", images=");
            return ms9.a(')', sb, this.d);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public GroupContentTabCollection(JSONObject jSONObject) {
            this(r0, r1, r3);
            ?? r3;
            GroupContentTabCollectionType.a aVar = GroupContentTabCollectionType.Companion;
            String optString = jSONObject.optString("collection_type", "");
            aVar.getClass();
            GroupContentTabCollectionType a2 = GroupContentTabCollectionType.a.a(optString);
            int optInt = jSONObject.optInt("count", 0);
            JSONArray optJSONArray = jSONObject.optJSONArray("images");
            if (optJSONArray != null) {
                r3 = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    String optString2 = jSONObject2.optString("url");
                    int optInt2 = jSONObject2.optInt("width", 0);
                    int optInt3 = jSONObject2.optInt("height", 0);
                    String optString3 = jSONObject2.optString("id");
                    GroupContentTabCollectionImage.Theme.a aVar2 = GroupContentTabCollectionImage.Theme.Companion;
                    String optString4 = jSONObject2.optString("theme");
                    aVar2.getClass();
                    r3.add(new GroupContentTabCollectionImage(optString2, optInt2, optInt3, optString3, GroupContentTabCollectionImage.Theme.a.a(optString4), jSONObject2.optBoolean("is_base", false)));
                }
            } else {
                r3 = EmptyList.b;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public GroupContentTabCollection(Serializer serializer) {
            this(r0, r1, r4 == null ? EmptyList.b : r4);
            GroupContentTabCollectionType.a aVar = GroupContentTabCollectionType.Companion;
            String H = serializer.H();
            H = H == null ? "" : H;
            aVar.getClass();
            GroupContentTabCollectionType a2 = GroupContentTabCollectionType.a.a(H);
            int u = serializer.u();
            List k = serializer.k(GroupContentTabCollectionImage.class);
        }
    }

    /* compiled from: GroupContentTabSetting.kt */
    public static final class GroupContentTabCollectionImage extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<GroupContentTabCollectionImage> CREATOR = new b();
        public final String b;
        public final int c;
        public final int d;
        public final String e;
        public final Theme f;
        public final boolean g;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GroupContentTabSetting.kt */
        public static final class Theme {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Theme[] $VALUES;
            public static final a Companion;
            public static final Theme DARK;
            public static final Theme LIGHT;
            private final String id;

            /* compiled from: GroupContentTabSetting.kt */
            public static final class a {
                public static Theme a(String str) {
                    Object obj;
                    Iterator<E> it = Theme.h().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (epx.f(((Theme) obj).getId(), str)) {
                            break;
                        }
                    }
                    Theme theme = (Theme) obj;
                    return theme == null ? Theme.LIGHT : theme;
                }
            }

            static {
                Theme theme = new Theme("LIGHT", 0, "light");
                LIGHT = theme;
                Theme theme2 = new Theme("DARK", 1, "dark");
                DARK = theme2;
                Theme[] themeArr = {theme, theme2};
                $VALUES = themeArr;
                $ENTRIES = new asp(themeArr);
                Companion = new a();
            }

            public Theme(String str, int i, String str2) {
                this.id = str2;
            }

            public static zrp<Theme> h() {
                return $ENTRIES;
            }

            public static Theme valueOf(String str) {
                return (Theme) Enum.valueOf(Theme.class, str);
            }

            public static Theme[] values() {
                return (Theme[]) $VALUES.clone();
            }

            public final String getId() {
                return this.id;
            }
        }

        /* compiled from: JsonParser.kt */
        public static final class a extends aay<GroupContentTabCollectionImage> {
            @Override // xsna.aay
            public final GroupContentTabCollectionImage a(JSONObject jSONObject) {
                return new GroupContentTabCollectionImage(jSONObject);
            }
        }

        /* compiled from: Serializer.kt */
        public static final class b extends Serializer.c<GroupContentTabCollectionImage> {
            @Override // com.vk.core.serialize.Serializer.c
            public final GroupContentTabCollectionImage a(Serializer serializer) {
                return new GroupContentTabCollectionImage(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GroupContentTabCollectionImage[i];
            }
        }

        static {
            new a();
        }

        public GroupContentTabCollectionImage(String str, int i, int i2, String str2, Theme theme, boolean z) {
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = str2;
            this.f = theme;
            this.g = z;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.S(this.c);
            serializer.S(this.d);
            serializer.j0(this.e);
            serializer.j0(this.f.getId());
            serializer.L(this.g ? (byte) 1 : (byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupContentTabCollectionImage)) {
                return false;
            }
            GroupContentTabCollectionImage groupContentTabCollectionImage = (GroupContentTabCollectionImage) obj;
            return epx.f(this.b, groupContentTabCollectionImage.b) && this.c == groupContentTabCollectionImage.c && this.d == groupContentTabCollectionImage.d && epx.f(this.e, groupContentTabCollectionImage.e) && this.f == groupContentTabCollectionImage.f && this.g == groupContentTabCollectionImage.g;
        }

        public final int hashCode() {
            int a2 = shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31);
            String str = this.e;
            return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((a2 + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GroupContentTabCollectionImage(url=");
            sb.append(this.b);
            sb.append(", width=");
            sb.append(this.c);
            sb.append(", height=");
            sb.append(this.d);
            sb.append(", id=");
            sb.append(this.e);
            sb.append(", theme=");
            sb.append(this.f);
            sb.append(", isBase=");
            return q0.a(sb, this.g, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public GroupContentTabCollectionImage(JSONObject jSONObject) {
            this(r3, r4, r5, r6, Theme.a.a(r1), jSONObject.optBoolean("is_base", false));
            String optString = jSONObject.optString("url", "");
            int optInt = jSONObject.optInt("width", 0);
            int optInt2 = jSONObject.optInt("height", 0);
            String optString2 = jSONObject.optString("id", "");
            Theme.a aVar = Theme.Companion;
            String optString3 = jSONObject.optString("theme", Theme.LIGHT.getId());
            aVar.getClass();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public GroupContentTabCollectionImage(Serializer serializer) {
            this(r2, r3, r4, r5, Theme.a.a(r1), serializer.m());
            String H = serializer.H();
            String str = H == null ? "" : H;
            int u = serializer.u();
            int u2 = serializer.u();
            String H2 = serializer.H();
            Theme.a aVar = Theme.Companion;
            String H3 = serializer.H();
            H3 = H3 == null ? Theme.LIGHT.getId() : H3;
            aVar.getClass();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GroupContentTabSetting(JSONObject jSONObject) {
        this(r3, r4, r5, r6, r7, r8, r1, false, 128, null);
        ArrayList arrayList;
        GroupContentTabTabletConfig groupContentTabTabletConfig;
        List list;
        GroupContentTabType.a aVar = GroupContentTabType.Companion;
        String optString = jSONObject.optString("main_type", "");
        aVar.getClass();
        GroupContentTabType a2 = GroupContentTabType.a.a(optString);
        JSONArray optJSONArray = jSONObject.optJSONArray("additional_types");
        GroupContentTabSpecialValues groupContentTabSpecialValues = null;
        if (optJSONArray != null) {
            arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = optJSONArray.getString(i);
                GroupContentTabType.Companion.getClass();
                arrayList.add(GroupContentTabType.a.a(string));
            }
        } else {
            arrayList = null;
        }
        boolean optBoolean = jSONObject.optBoolean("can_add", false);
        boolean optBoolean2 = jSONObject.optBoolean("show_more", false);
        JSONObject optJSONObject = jSONObject.optJSONObject("tablet_config");
        if (optJSONObject != null) {
            Serializer.c<GroupContentTabTabletConfig> cVar = GroupContentTabTabletConfig.CREATOR;
            groupContentTabTabletConfig = new GroupContentTabTabletConfig(optJSONObject.optBoolean("is_shown", true), f370.q(optJSONObject, "can_add"));
        } else {
            groupContentTabTabletConfig = null;
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("collections");
        if (optJSONArray2 != null) {
            ArrayList arrayList2 = new ArrayList(optJSONArray2.length());
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObject2 = optJSONArray2.getJSONObject(i2);
                GroupContentTabCollection.e.getClass();
                arrayList2.add(new GroupContentTabCollection(jSONObject2));
            }
            list = j5g.V(arrayList2);
        } else {
            list = null;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("special_values");
        if (optJSONObject2 != null) {
            Serializer.c<GroupContentTabSpecialValues> cVar2 = GroupContentTabSpecialValues.CREATOR;
            groupContentTabSpecialValues = new GroupContentTabSpecialValues(Integer.valueOf(optJSONObject2.optInt("co_owner_invitations_count", 0)));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GroupContentTabSetting(Serializer serializer) {
        this(r4, r1, serializer.m(), serializer.m(), (GroupContentTabTabletConfig) serializer.G(GroupContentTabTabletConfig.class.getClassLoader()), serializer.k(GroupContentTabCollection.class), (GroupContentTabSpecialValues) serializer.G(GroupContentTabSpecialValues.class.getClassLoader()), false, 128, null);
        ArrayList arrayList;
        GroupContentTabType.a aVar = GroupContentTabType.Companion;
        String H = serializer.H();
        H = H == null ? "" : H;
        aVar.getClass();
        GroupContentTabType a2 = GroupContentTabType.a.a(H);
        ArrayList<String> h = serializer.h();
        if (h != null) {
            arrayList = new ArrayList(c5g.u(h, 10));
            Iterator<String> it = h.iterator();
            while (it.hasNext()) {
                String next = it.next();
                GroupContentTabType.a aVar2 = GroupContentTabType.Companion;
                if (next == null) {
                    next = "";
                }
                aVar2.getClass();
                arrayList.add(GroupContentTabType.a.a(next));
            }
        } else {
            arrayList = null;
        }
    }
}
