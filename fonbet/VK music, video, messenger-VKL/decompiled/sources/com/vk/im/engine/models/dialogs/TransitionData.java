package com.vk.im.engine.models.dialogs;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: TransitionData.kt */
/* loaded from: classes2.dex */
public final class TransitionData implements Serializer.StreamParcelable {
    public static final Serializer.c<TransitionData> CREATOR = new a();
    public final List<Long> b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<TransitionData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final TransitionData a(Serializer serializer) {
            return new TransitionData(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransitionData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new TransitionData(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.a0(this.b);
        serializer.j0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionData)) {
            return false;
        }
        TransitionData transitionData = (TransitionData) obj;
        return epx.f(this.b, transitionData.b) && epx.f(this.c, transitionData.c);
    }

    public final int hashCode() {
        List<Long> list = this.b;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionData(userIds=");
        sb.append(this.b);
        sb.append(", link=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public TransitionData(List<Long> list, String str) {
        this.b = list;
        this.c = str;
    }

    public /* synthetic */ TransitionData(List list, String str, int i, zcl zclVar) {
        this((List<Long>) ((i & 1) != 0 ? null : list), (i & 2) != 0 ? null : str);
    }

    public TransitionData(Serializer serializer, zcl zclVar) {
        this(serializer.k(Object.class), serializer.H());
    }
}
