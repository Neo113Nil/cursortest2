package com.vk.superapp.miniapps.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import org.json.JSONObject;
import xsna.dre0;
import xsna.epx;
import xsna.gp;
import xsna.qoy;

/* compiled from: AppsCatalogBadgesQueueProvider.kt */
/* loaded from: classes6.dex */
public final class BadgeEvent implements dre0<BadgeEventPayload> {
    public final UserId a;

    public BadgeEvent(UserId userId) {
        this.a = userId;
    }

    @Override // xsna.dre0
    public final BadgeEventPayload a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        String string = jSONObject2.getString("uid");
        boolean z = jSONObject2.getBoolean("is_badge_allowed");
        BadgeInfo.a aVar = BadgeInfo.CREATOR;
        JSONObject jSONObject3 = jSONObject2.getJSONObject("badge_info");
        aVar.getClass();
        return new BadgeEventPayload(string, z, new BadgeInfo(jSONObject3.optString(NotificationCompat.CATEGORY_PROMO), jSONObject3.optBoolean("is_new", false), jSONObject3.optBoolean("has_dot", false), jSONObject3.optInt("counter", 0), jSONObject3.optBoolean("is_favourite", false), jSONObject3.optBoolean("has_messenger_integration", false)));
    }

    @Override // xsna.dre0
    public final String b() {
        return "appbadges_" + this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BadgeEvent) && epx.f(this.a, ((BadgeEvent) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("BadgeEvent(userId="), this.a, ')');
    }

    /* compiled from: AppsCatalogBadgesQueueProvider.kt */
    public static final class BadgeEventPayload implements Parcelable {
        public static final Parcelable.Creator<BadgeEventPayload> CREATOR = new a();
        public final String b;
        public final boolean c;
        public final BadgeInfo d;

        /* compiled from: AppsCatalogBadgesQueueProvider.kt */
        public static final class a implements Parcelable.Creator<BadgeEventPayload> {
            @Override // android.os.Parcelable.Creator
            public final BadgeEventPayload createFromParcel(Parcel parcel) {
                return new BadgeEventPayload(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final BadgeEventPayload[] newArray(int i) {
                return new BadgeEventPayload[i];
            }
        }

        public BadgeEventPayload(String str, boolean z, BadgeInfo badgeInfo) {
            this.b = str;
            this.c = z;
            this.d = badgeInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BadgeEventPayload)) {
                return false;
            }
            BadgeEventPayload badgeEventPayload = (BadgeEventPayload) obj;
            return epx.f(this.b, badgeEventPayload.b) && this.c == badgeEventPayload.c && epx.f(this.d, badgeEventPayload.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            return "BadgeEventPayload(uid=" + this.b + ", isBadgeAllowed=" + this.c + ", badgeInfo=" + this.d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeValue(Boolean.valueOf(this.c));
            parcel.writeParcelable(this.d, i);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public BadgeEventPayload(Parcel parcel) {
            this(r0 == null ? "" : r0, ((Boolean) parcel.readValue(Boolean.TYPE.getClassLoader())).booleanValue(), (BadgeInfo) parcel.readParcelable(BadgeInfo.class.getClassLoader()));
            String readString = parcel.readString();
        }
    }
}
