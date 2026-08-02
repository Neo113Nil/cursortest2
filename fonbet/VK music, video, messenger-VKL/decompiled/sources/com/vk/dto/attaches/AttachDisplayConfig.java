package com.vk.dto.attaches;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.j5g;
import xsna.ms9;

/* compiled from: AttachmentsArrangementModels.kt */
/* loaded from: classes18.dex */
public final class AttachDisplayConfig implements Serializer.StreamParcelable {
    public static final Serializer.c<AttachDisplayConfig> CREATOR = new a();
    public final String b;
    public final List<String> c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachDisplayConfig> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachDisplayConfig a(Serializer serializer) {
            List O0;
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            ArrayList<String> h = serializer.h();
            return new AttachDisplayConfig(H, (h == null || (O0 = j5g.O0(h)) == null) ? EmptyList.b : j5g.V(O0));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachDisplayConfig[i];
        }
    }

    public AttachDisplayConfig(String str, List<String> list) {
        this.b = str;
        this.c = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.l0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachDisplayConfig)) {
            return false;
        }
        AttachDisplayConfig attachDisplayConfig = (AttachDisplayConfig) obj;
        return epx.f(this.b, attachDisplayConfig.b) && epx.f(this.c, attachDisplayConfig.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachDisplayConfig(type=");
        sb.append(this.b);
        sb.append(", availableStyles=");
        return ms9.a(')', sb, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
