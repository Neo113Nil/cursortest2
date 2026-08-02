package com.vk.feed.core.models.dzen;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.info.InfoPopup;

/* compiled from: DzenFooter.kt */
/* loaded from: classes18.dex */
public final class DzenFooter implements Serializer.StreamParcelable {
    public static final Serializer.c<DzenFooter> CREATOR = new a();
    public final String b;
    public final InfoPopup c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DzenFooter> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DzenFooter a(Serializer serializer) {
            return new DzenFooter(serializer.H(), (InfoPopup) serializer.G(InfoPopup.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DzenFooter[i];
        }
    }

    public DzenFooter(String str, InfoPopup infoPopup) {
        this.b = str;
        this.c = infoPopup;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
