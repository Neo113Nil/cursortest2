package com.vk.auth;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: VkExtendTokenData.kt */
/* loaded from: classes.dex */
public abstract class VkExtendTokenData implements Serializer.StreamParcelable {

    /* compiled from: VkExtendTokenData.kt */
    /* loaded from: classes15.dex */
    public static final class EnterByLoginPassword extends VkExtendTokenData {
        public static final EnterByLoginPassword b = new EnterByLoginPassword(null);
        public static final Serializer.c<EnterByLoginPassword> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<EnterByLoginPassword> {
            @Override // com.vk.core.serialize.Serializer.c
            public final EnterByLoginPassword a(Serializer serializer) {
                return EnterByLoginPassword.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EnterByLoginPassword[i];
            }
        }
    }

    /* compiled from: VkExtendTokenData.kt */
    /* loaded from: classes15.dex */
    public static final class SignUp extends VkExtendTokenData {
        public static final SignUp b = new SignUp(null);
        public static final Serializer.c<SignUp> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<SignUp> {
            @Override // com.vk.core.serialize.Serializer.c
            public final SignUp a(Serializer serializer) {
                return SignUp.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SignUp[i];
            }
        }
    }

    public /* synthetic */ VkExtendTokenData(zcl zclVar) {
        this();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public VkExtendTokenData() {
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
    }
}
