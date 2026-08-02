package com.vk.superapp.api.dto.menu;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import org.json.JSONObject;

/* compiled from: QueueSettings.kt */
/* loaded from: classes6.dex */
public final class QueueSettings implements Parcelable {
    public static final a CREATOR = new a();
    public final boolean b;
    public final boolean c;

    /* compiled from: QueueSettings.kt */
    public static final class a implements Parcelable.Creator<QueueSettings> {
        public static QueueSettings a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("payload") : null;
            return new QueueSettings(optJSONObject != null ? optJSONObject.optBoolean("pending_queue_data", false) : false, jSONObject != null ? jSONObject.optBoolean("is_updated_by_queue", false) : false);
        }

        @Override // android.os.Parcelable.Creator
        public final QueueSettings createFromParcel(Parcel parcel) {
            return new QueueSettings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final QueueSettings[] newArray(int i) {
            return new QueueSettings[i];
        }
    }

    public QueueSettings(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueueSettings)) {
            return false;
        }
        QueueSettings queueSettings = (QueueSettings) obj;
        return this.b == queueSettings.b && this.c == queueSettings.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueueSettings(isQueueHasPendingData=");
        sb.append(this.b);
        sb.append(", isUpdatedByQueue=");
        return q0.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
    }

    public QueueSettings(Parcel parcel) {
        this(parcel.readByte() != 0, parcel.readByte() != 0);
    }
}
