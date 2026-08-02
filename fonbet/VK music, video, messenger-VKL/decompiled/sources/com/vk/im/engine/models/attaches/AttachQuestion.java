package com.vk.im.engine.models.attaches;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: AttachQuestion.kt */
/* loaded from: classes2.dex */
public final class AttachQuestion implements AttachWithId {
    public static final Serializer.c<AttachQuestion> CREATOR = new a();
    public final long b;
    public final UserId c;
    public final String d;
    public final String e;
    public int f;
    public AttachSyncState g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachQuestion> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachQuestion a(Serializer serializer) {
            return new AttachQuestion(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachQuestion[i];
        }
    }

    public AttachQuestion(long j, UserId userId, String str, String str2) {
        this.b = j;
        this.c = userId;
        this.d = str;
        this.e = str2;
        this.g = AttachSyncState.DONE;
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.g;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        return this.e;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.g = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachQuestion(this.b, this.c, this.d, this.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachQuestion)) {
            return false;
        }
        AttachQuestion attachQuestion = (AttachQuestion) obj;
        return this.b == attachQuestion.b && epx.f(this.c, attachQuestion.c) && epx.f(this.d, attachQuestion.d) && epx.f(this.e, attachQuestion.e);
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.e.hashCode() + urd0.a(bh10.a(Long.hashCode(this.b) * 31, 31, this.c.b), 31, this.d);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.f = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachQuestion(id=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", question=");
        sb.append(this.d);
        sb.append(", url=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.f;
    }

    public AttachQuestion(AttachQuestion attachQuestion) {
        this(attachQuestion.b, attachQuestion.c, attachQuestion.d, attachQuestion.e);
    }

    public AttachQuestion(Serializer serializer) {
        this(serializer.w(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.H(), serializer.H());
    }

    public AttachQuestion(JSONObject jSONObject) {
        this(jSONObject.getLong("id"), new UserId(jSONObject.getLong("owner_id")), jSONObject.getString("question"), jSONObject.getString("url"));
    }
}
