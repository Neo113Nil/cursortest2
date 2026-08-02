package com.vk.dto.stickers;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.ButtonAction;

/* compiled from: PurchaseDetailsButton.kt */
/* loaded from: classes18.dex */
public final class PurchaseDetailsButton implements Serializer.StreamParcelable {
    public static final Serializer.c<PurchaseDetailsButton> CREATOR = new a();
    public final String b;
    public final ButtonAction c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PurchaseDetailsButton> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PurchaseDetailsButton a(Serializer serializer) {
            return new PurchaseDetailsButton(serializer.H(), (ButtonAction) serializer.G(ButtonAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PurchaseDetailsButton[i];
        }
    }

    public PurchaseDetailsButton(String str, ButtonAction buttonAction) {
        this.b = str;
        this.c = buttonAction;
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
