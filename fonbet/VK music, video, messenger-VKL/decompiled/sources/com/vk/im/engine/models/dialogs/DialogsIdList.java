package com.vk.im.engine.models.dialogs;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.ms9;
import xsna.zcl;

/* compiled from: DialogsIdList.kt */
/* loaded from: classes2.dex */
public final class DialogsIdList implements Serializer.StreamParcelable {
    public static final Serializer.c<DialogsIdList> CREATOR = new a();
    public final List<Long> b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DialogsIdList> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DialogsIdList a(Serializer serializer) {
            return new DialogsIdList(serializer.D());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DialogsIdList[i];
        }
    }

    public DialogsIdList() {
        this(null, 1, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.h0(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DialogsIdList) && epx.f(this.b, ((DialogsIdList) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("DialogsIdList(dialogIds="), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public DialogsIdList(List<Long> list) {
        this.b = list;
    }

    public DialogsIdList(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? EmptyList.b : list);
    }
}
