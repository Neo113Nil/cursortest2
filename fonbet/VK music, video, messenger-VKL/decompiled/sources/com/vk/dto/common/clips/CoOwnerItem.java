package com.vk.dto.common.clips;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.clips.ClipMainTabState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.movika.sdk.base.observable.g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import xsna.aay;
import xsna.asp;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.qoy;
import xsna.zrp;

/* compiled from: CoOwnerItem.kt */
/* loaded from: classes18.dex */
public final class CoOwnerItem extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<CoOwnerItem> CREATOR = new c();
    public static final b g = new b();
    public final UserId b;
    public final StatusDto c;
    public final Owner d;
    public final boolean e;
    public final ClipMainTabState f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CoOwnerItem.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;
        public static final StatusDto APPROVED;
        public static final Parcelable.Creator<StatusDto> CREATOR;
        public static final StatusDto PENDING;
        private final String value;

        /* compiled from: CoOwnerItem.kt */
        public static final class a implements Parcelable.Creator<StatusDto> {
            @Override // android.os.Parcelable.Creator
            public final StatusDto createFromParcel(Parcel parcel) {
                return StatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StatusDto[] newArray(int i) {
                return new StatusDto[i];
            }
        }

        static {
            StatusDto statusDto = new StatusDto("PENDING", 0, "pending");
            PENDING = statusDto;
            StatusDto statusDto2 = new StatusDto("APPROVED", 1, "approved");
            APPROVED = statusDto2;
            StatusDto[] statusDtoArr = {statusDto, statusDto2};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
            CREATOR = new a();
        }

        public StatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static zrp<StatusDto> i() {
            return $ENTRIES;
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String j() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: CoOwnerItem.kt */
    public static final class a {
        public static CoOwnerItem a(JSONObject jSONObject, LinkedHashMap linkedHashMap) {
            StatusDto statusDto;
            UserId userId = new UserId(jSONObject.getLong("owner_id"));
            String string = jSONObject.getString("status");
            StatusDto[] values = StatusDto.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    statusDto = null;
                    break;
                }
                statusDto = values[i];
                if (epx.f(statusDto.j(), string)) {
                    break;
                }
                i++;
            }
            StatusDto statusDto2 = statusDto;
            Owner owner = (Owner) linkedHashMap.get(userId);
            if (owner == null) {
                owner = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
            }
            boolean z = jSONObject.getBoolean("can_set_status");
            int optInt = jSONObject.optInt("main_tab_state", -1);
            ClipMainTabState.a aVar = ClipMainTabState.Companion;
            Integer valueOf = Integer.valueOf(optInt);
            aVar.getClass();
            return new CoOwnerItem(userId, statusDto2, owner, z, ClipMainTabState.a.a(valueOf));
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<CoOwnerItem> {
        @Override // xsna.aay
        public final CoOwnerItem a(JSONObject jSONObject) {
            Object obj;
            JSONObject jSONObject2 = jSONObject.getJSONObject("owner");
            UserId userId = new UserId(jSONObject.getLong("owner_id"));
            Iterator<E> it = StatusDto.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((StatusDto) obj).j(), jSONObject.getString("status"))) {
                    break;
                }
            }
            Serializer.c<Owner> cVar = Owner.CREATOR;
            Owner c = Owner.a.c(jSONObject2);
            boolean z = jSONObject.getBoolean("can_set_status");
            int optInt = jSONObject.optInt("main_tab_state", -1);
            ClipMainTabState.a aVar = ClipMainTabState.Companion;
            Integer valueOf = Integer.valueOf(optInt);
            aVar.getClass();
            return new CoOwnerItem(userId, (StatusDto) obj, c, z, ClipMainTabState.a.a(valueOf));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<CoOwnerItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CoOwnerItem a(Serializer serializer) {
            ClipMainTabState clipMainTabState;
            long w = serializer.w();
            String H = serializer.H();
            Owner owner = (Owner) serializer.A(Owner.class.getClassLoader());
            boolean m = serializer.m();
            Integer v = serializer.v();
            Object obj = null;
            if (v != null) {
                int intValue = v.intValue();
                ClipMainTabState.a aVar = ClipMainTabState.Companion;
                Integer valueOf = Integer.valueOf(intValue);
                aVar.getClass();
                clipMainTabState = ClipMainTabState.a.a(valueOf);
            } else {
                clipMainTabState = null;
            }
            UserId userId = new UserId(w);
            Iterator<E> it = StatusDto.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (epx.f(((StatusDto) next).j(), H)) {
                    obj = next;
                    break;
                }
            }
            return new CoOwnerItem(userId, (StatusDto) obj, owner, m, clipMainTabState);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CoOwnerItem[i];
        }
    }

    public CoOwnerItem(UserId userId, StatusDto statusDto, Owner owner, boolean z, ClipMainTabState clipMainTabState) {
        this.b = userId;
        this.c = statusDto;
        this.d = owner;
        this.e = z;
        this.f = clipMainTabState;
    }

    public static CoOwnerItem zb(CoOwnerItem coOwnerItem, StatusDto statusDto, Owner owner, ClipMainTabState clipMainTabState, int i) {
        UserId userId = coOwnerItem.b;
        if ((i & 2) != 0) {
            statusDto = coOwnerItem.c;
        }
        StatusDto statusDto2 = statusDto;
        if ((i & 4) != 0) {
            owner = coOwnerItem.d;
        }
        Owner owner2 = owner;
        boolean z = coOwnerItem.e;
        if ((i & 16) != 0) {
            clipMainTabState = coOwnerItem.f;
        }
        coOwnerItem.getClass();
        return new CoOwnerItem(userId, statusDto2, owner2, z, clipMainTabState);
    }

    public final boolean Ab() {
        return this.c == StatusDto.APPROVED && !epx.f(this.d.b, UserId.d);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b.b);
        serializer.j0(this.c.j());
        serializer.e0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        ClipMainTabState clipMainTabState = this.f;
        serializer.V(clipMainTabState != null ? Integer.valueOf(clipMainTabState.h()) : null);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new g(this, 21));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoOwnerItem)) {
            return false;
        }
        CoOwnerItem coOwnerItem = (CoOwnerItem) obj;
        return epx.f(this.b, coOwnerItem.b) && this.c == coOwnerItem.c && epx.f(this.d, coOwnerItem.d) && this.e == coOwnerItem.e && this.f == coOwnerItem.f;
    }

    public final int hashCode() {
        int b2 = qoy.b((this.d.hashCode() + ((this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31)) * 31, 31, this.e);
        ClipMainTabState clipMainTabState = this.f;
        return b2 + (clipMainTabState == null ? 0 : clipMainTabState.hashCode());
    }

    public final String toString() {
        return "CoOwnerItem(ownerId=" + this.b + ", status=" + this.c + ", owner=" + this.d + ", canSetStatus=" + this.e + ", mainTabState=" + this.f + ')';
    }
}
