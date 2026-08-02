package com.vk.im.engine.models.attaches;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.messages.NestedMsg;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.ms9;
import xsna.zcl;

/* compiled from: AttachFakeFwd.kt */
/* loaded from: classes2.dex */
public final class AttachFakeFwd implements Attach {
    public static final Serializer.c<AttachFakeFwd> CREATOR = new a();
    public final List<NestedMsg> b;
    public int c;
    public AttachSyncState d;
    public final UserId e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachFakeFwd> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachFakeFwd a(Serializer serializer) {
            return new AttachFakeFwd(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachFakeFwd[i];
        }
    }

    public AttachFakeFwd() {
        this(null, 1, null);
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.d;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        return "";
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.b);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.d = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachFakeFwd(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AttachFakeFwd) && epx.f(this.b, ((AttachFakeFwd) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.c = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.e;
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AttachFakeFwd(nestedMsgs="), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.c;
    }

    public AttachFakeFwd(List<NestedMsg> list) {
        this.b = list;
        this.c = -1;
        this.d = AttachSyncState.DONE;
        this.e = new UserId(-1L);
    }

    public AttachFakeFwd(Serializer serializer, zcl zclVar) {
        this(serializer.l(NestedMsg.class.getClassLoader()));
    }

    public AttachFakeFwd(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? EmptyList.b : list);
    }
}
