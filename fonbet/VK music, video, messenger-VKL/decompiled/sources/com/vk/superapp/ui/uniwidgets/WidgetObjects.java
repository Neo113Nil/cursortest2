package com.vk.superapp.ui.uniwidgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.api.dto.group.WebGroup;
import com.vk.superapp.api.dto.group.WebGroupShortInfo;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.c5g;
import xsna.cjl0;
import xsna.epx;
import xsna.fkq0;
import xsna.gzs;
import xsna.j5g;
import xsna.on00;
import xsna.s3q0;
import xsna.v11;

/* compiled from: WidgetObjects.kt */
/* loaded from: classes6.dex */
public final class WidgetObjects implements Parcelable {
    public static final Parcelable.Creator<WidgetObjects> CREATOR = new b();
    public final Map<Long, WebApiApplication> b;
    public final Map<Long, WebUserShortInfo> c;
    public final Map<Long, WebGroupShortInfo> d;

    /* compiled from: WidgetObjects.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList] */
        public static WidgetObjects a(JSONObject jSONObject) {
            ?? r3;
            ?? r4;
            ?? r7;
            ?? r1;
            JSONArray jSONArray;
            JSONArray optJSONArray = jSONObject.optJSONArray("mini_apps");
            if (optJSONArray != null) {
                r3 = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        Parcelable.Creator<WebApiApplication> creator = WebApiApplication.CREATOR;
                        r3.add(WebApiApplication.a.c(optJSONObject));
                    }
                }
            } else {
                r3 = EmptyList.b;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("games");
            if (optJSONArray2 != null) {
                r4 = new ArrayList(optJSONArray2.length());
                int length2 = optJSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                    if (optJSONObject2 != null) {
                        Parcelable.Creator<WebApiApplication> creator2 = WebApiApplication.CREATOR;
                        r4.add(WebApiApplication.a.c(optJSONObject2));
                    }
                }
            } else {
                r4 = EmptyList.b;
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("profiles");
            if (optJSONArray3 != null) {
                r7 = new ArrayList(optJSONArray3.length());
                int length3 = optJSONArray3.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    JSONObject optJSONObject3 = optJSONArray3.optJSONObject(i3);
                    if (optJSONObject3 != null) {
                        WebUserShortInfo.CREATOR.getClass();
                        long j = optJSONObject3.getLong("id");
                        gzs<s3q0> gzsVar = fkq0.a;
                        UserId userId = new UserId(j);
                        String string = optJSONObject3.getString("first_name");
                        String string2 = optJSONObject3.getString("last_name");
                        boolean z = optJSONObject3.optInt("sex") == 1;
                        boolean optBoolean = optJSONObject3.optBoolean("is_closed");
                        boolean optBoolean2 = optJSONObject3.optBoolean("can_access_closed");
                        WebImage.CREATOR.getClass();
                        WebImage b = WebImage.a.b(optJSONObject3);
                        JSONObject optJSONObject4 = optJSONObject3.optJSONObject("city");
                        r7.add(new WebUserShortInfo(userId, string, string2, z, optBoolean, optBoolean2, b, optJSONObject4 != null ? optJSONObject4.optString("title") : null));
                    }
                }
            } else {
                r7 = EmptyList.b;
            }
            JSONArray optJSONArray4 = jSONObject.optJSONArray("groups");
            if (optJSONArray4 != null) {
                r1 = new ArrayList(optJSONArray4.length());
                int length4 = optJSONArray4.length();
                int i4 = 0;
                while (i4 < length4) {
                    JSONObject optJSONObject5 = optJSONArray4.optJSONObject(i4);
                    if (optJSONObject5 != null) {
                        WebGroupShortInfo.CREATOR.getClass();
                        WebGroup.CREATOR.getClass();
                        long optLong = optJSONObject5.optLong("id");
                        String optString = optJSONObject5.optString("name");
                        String optString2 = optJSONObject5.optString("photo_base");
                        jSONArray = optJSONArray4;
                        WebImageSize.CREATOR.getClass();
                        WebGroup webGroup = new WebGroup(optLong, optString, WebImageSize.a.a(100, optString2).b, optJSONObject5.optInt("is_closed"));
                        String string3 = optJSONObject5.getString("screen_name");
                        int i5 = optJSONObject5.getInt("is_closed");
                        String string4 = optJSONObject5.getString("type");
                        int optInt = optJSONObject5.optInt("is_member");
                        String optString3 = optJSONObject5.optString("description");
                        int optInt2 = optJSONObject5.optInt("members_count");
                        WebImage.CREATOR.getClass();
                        r1.add(new WebGroupShortInfo(webGroup, string3, i5, string4, optInt, optString3, optInt2, WebImage.a.b(optJSONObject5)));
                    } else {
                        jSONArray = optJSONArray4;
                    }
                    i4++;
                    optJSONArray4 = jSONArray;
                }
            } else {
                r1 = EmptyList.b;
            }
            ArrayList u0 = j5g.u0((Iterable) r4, (Collection) r3);
            int e = on00.e(c5g.u(u0, 10));
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e);
            Iterator it = u0.iterator();
            while (it.hasNext()) {
                WebApiApplication webApiApplication = (WebApiApplication) it.next();
                linkedHashMap.put(Long.valueOf(webApiApplication.b), webApiApplication);
            }
            Iterable<WebUserShortInfo> iterable = (Iterable) r7;
            int e2 = on00.e(c5g.u(iterable, 10));
            if (e2 < 16) {
                e2 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2);
            for (WebUserShortInfo webUserShortInfo : iterable) {
                linkedHashMap2.put(Long.valueOf(webUserShortInfo.b.b), webUserShortInfo);
            }
            Iterable<WebGroupShortInfo> iterable2 = (Iterable) r1;
            int e3 = on00.e(c5g.u(iterable2, 10));
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(e3 >= 16 ? e3 : 16);
            for (WebGroupShortInfo webGroupShortInfo : iterable2) {
                linkedHashMap3.put(Long.valueOf(webGroupShortInfo.b.b), webGroupShortInfo);
            }
            return new WidgetObjects(linkedHashMap, linkedHashMap2, linkedHashMap3);
        }
    }

    /* compiled from: WidgetObjects.kt */
    public static final class b implements Parcelable.Creator<WidgetObjects> {
        @Override // android.os.Parcelable.Creator
        public final WidgetObjects createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(Long.valueOf(parcel.readLong()), parcel.readParcelable(WidgetObjects.class.getClassLoader()));
            }
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                linkedHashMap2.put(Long.valueOf(parcel.readLong()), parcel.readParcelable(WidgetObjects.class.getClassLoader()));
            }
            int readInt3 = parcel.readInt();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt3);
            for (int i3 = 0; i3 != readInt3; i3++) {
                linkedHashMap3.put(Long.valueOf(parcel.readLong()), parcel.readParcelable(WidgetObjects.class.getClassLoader()));
            }
            return new WidgetObjects(linkedHashMap, linkedHashMap2, linkedHashMap3);
        }

        @Override // android.os.Parcelable.Creator
        public final WidgetObjects[] newArray(int i) {
            return new WidgetObjects[i];
        }
    }

    public WidgetObjects(Map<Long, WebApiApplication> map, Map<Long, WebUserShortInfo> map2, Map<Long, WebGroupShortInfo> map3) {
        this.b = map;
        this.c = map2;
        this.d = map3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetObjects)) {
            return false;
        }
        WidgetObjects widgetObjects = (WidgetObjects) obj;
        return epx.f(this.b, widgetObjects.b) && epx.f(this.c, widgetObjects.c) && epx.f(this.d, widgetObjects.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v11.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WidgetObjects(apps=");
        sb.append(this.b);
        sb.append(", users=");
        sb.append(this.c);
        sb.append(", groups=");
        return cjl0.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Map<Long, WebApiApplication> map = this.b;
        parcel.writeInt(map.size());
        for (Map.Entry<Long, WebApiApplication> entry : map.entrySet()) {
            parcel.writeLong(entry.getKey().longValue());
            parcel.writeParcelable(entry.getValue(), i);
        }
        Map<Long, WebUserShortInfo> map2 = this.c;
        parcel.writeInt(map2.size());
        for (Map.Entry<Long, WebUserShortInfo> entry2 : map2.entrySet()) {
            parcel.writeLong(entry2.getKey().longValue());
            parcel.writeParcelable(entry2.getValue(), i);
        }
        Map<Long, WebGroupShortInfo> map3 = this.d;
        parcel.writeInt(map3.size());
        for (Map.Entry<Long, WebGroupShortInfo> entry3 : map3.entrySet()) {
            parcel.writeLong(entry3.getKey().longValue());
            parcel.writeParcelable(entry3.getValue(), i);
        }
    }
}
