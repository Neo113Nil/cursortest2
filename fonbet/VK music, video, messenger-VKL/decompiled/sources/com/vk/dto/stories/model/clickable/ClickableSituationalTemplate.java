package com.vk.dto.stories.model.clickable;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.stat.ClickableStickerStatInfo;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.q500;
import xsna.vu5;
import xsna.zcl;

/* compiled from: ClickableSituationalTemplate.kt */
/* loaded from: classes18.dex */
public final class ClickableSituationalTemplate extends ClickableSticker {
    public static final Serializer.c<ClickableSituationalTemplate> CREATOR;
    public static final RepliedUsersInfo h;
    public final Integer e;
    public final RepliedUsersInfo f;
    public final WebStickerType g;

    /* compiled from: ClickableSituationalTemplate.kt */
    public static final class RepliedUsersInfo implements Parcelable {
        public static final Parcelable.Creator<RepliedUsersInfo> CREATOR = new a();
        public final int b;
        public final List<UserId> c;
        public final List<String> d;
        public final int e;

        /* compiled from: ClickableSituationalTemplate.kt */
        public static final class a implements Parcelable.Creator<RepliedUsersInfo> {
            @Override // android.os.Parcelable.Creator
            public final RepliedUsersInfo createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = bo.b(RepliedUsersInfo.class, parcel, arrayList, i, 1);
                }
                return new RepliedUsersInfo(readInt, arrayList, parcel.createStringArrayList(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final RepliedUsersInfo[] newArray(int i) {
                return new RepliedUsersInfo[i];
            }
        }

        public RepliedUsersInfo(int i, List<UserId> list, List<String> list2, int i2) {
            this.b = i;
            this.c = list;
            this.d = list2;
            this.e = i2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RepliedUsersInfo)) {
                return false;
            }
            RepliedUsersInfo repliedUsersInfo = (RepliedUsersInfo) obj;
            return this.b == repliedUsersInfo.b && epx.f(this.c, repliedUsersInfo.c) && epx.f(this.d, repliedUsersInfo.d) && this.e == repliedUsersInfo.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + fw3.a(fw3.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RepliedUsersInfo(count=");
            sb.append(this.b);
            sb.append(", lastRepliedUsers=");
            sb.append(this.c);
            sb.append(", lastRepliedUsersPhotos=");
            sb.append(this.d);
            sb.append(", friendsCount=");
            return vu5.b(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            Iterator a2 = ao.a(parcel, this.c);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            parcel.writeStringList(this.d);
            parcel.writeInt(this.e);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickableSituationalTemplate> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickableSituationalTemplate a(Serializer serializer) {
            return new ClickableSituationalTemplate(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableSituationalTemplate[i];
        }
    }

    static {
        EmptyList emptyList = EmptyList.b;
        h = new RepliedUsersInfo(0, emptyList, emptyList, 0);
        CREATOR = new a();
    }

    public /* synthetic */ ClickableSituationalTemplate(long j, List list, q500 q500Var, Integer num, RepliedUsersInfo repliedUsersInfo, int i, zcl zclVar) {
        this((i & 1) != 0 ? -1L : j, list, (i & 4) != 0 ? null : q500Var, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : repliedUsersInfo);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final void Ab(ClickableStickerStatInfo.a aVar) {
        aVar.a(this.e, "id_value");
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final WebStickerType Cb() {
        return this.g;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.W(this.c);
        serializer.d0(this.d);
        serializer.V(this.e);
        serializer.e0(this.f);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject;
        JSONObject e5 = super.e5();
        e5.put("situational_theme_id", this.e);
        RepliedUsersInfo repliedUsersInfo = this.f;
        if (repliedUsersInfo != null) {
            jSONObject = new JSONObject();
            jSONObject.put("count", repliedUsersInfo.b);
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = repliedUsersInfo.c.iterator();
            while (it.hasNext()) {
                jSONArray.put(((UserId) it.next()).b);
            }
            jSONObject.put("items", jSONArray);
        } else {
            jSONObject = null;
        }
        e5.put("situational_replied_users", jSONObject);
        return e5;
    }

    public ClickableSituationalTemplate(long j, List<WebClickablePoint> list, q500 q500Var, Integer num, RepliedUsersInfo repliedUsersInfo) {
        super(j, list, q500Var);
        this.e = num;
        this.f = repliedUsersInfo;
        this.g = WebStickerType.SITUATIONAL_TEMPLATE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickableSituationalTemplate(Serializer serializer) {
        this(r1, r3, r4, r5, r8 == null ? h : r8);
        long w = serializer.w();
        ArrayList k = serializer.k(WebClickablePoint.class);
        ArrayList arrayList = k == null ? new ArrayList() : k;
        q500 y = serializer.y();
        Integer v = serializer.v();
        RepliedUsersInfo repliedUsersInfo = (RepliedUsersInfo) serializer.A(RepliedUsersInfo.class.getClassLoader());
    }
}
