package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;

/* compiled from: PurchaseDetails.kt */
/* loaded from: classes18.dex */
public final class PurchaseDetails extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PurchaseDetails> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final PurchaseDetailsButton e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PurchaseDetails> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PurchaseDetails a(Serializer serializer) {
            return new PurchaseDetails(serializer.H(), serializer.H(), serializer.H(), (PurchaseDetailsButton) serializer.G(PurchaseDetailsButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PurchaseDetails[i];
        }
    }

    public PurchaseDetails(String str, String str2, String str3, PurchaseDetailsButton purchaseDetailsButton) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = purchaseDetailsButton;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
    }
}
