package com.vk.dto.shortvideo;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;

/* compiled from: ChallengeRule.kt */
/* loaded from: classes18.dex */
public final class ChallengeRule implements Serializer.StreamParcelable {
    public static final Serializer.c<ChallengeRule> CREATOR = new a();
    public final Image b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ChallengeRule> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ChallengeRule a(Serializer serializer) {
            return new ChallengeRule(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChallengeRule[i];
        }
    }

    public ChallengeRule(Image image, String str) {
        this.b = image;
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.j0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public ChallengeRule(Serializer serializer) {
        this((Image) serializer.G(Image.class.getClassLoader()), serializer.H());
    }
}
