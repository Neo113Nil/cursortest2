package com.vk.auth.enterphone;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.states.VkAuthState;
import xsna.zcl;

/* compiled from: EnterPhonePresenterInfo.kt */
/* loaded from: classes15.dex */
public abstract class EnterPhonePresenterInfo extends Serializer.StreamParcelableAdapter {
    public final String b;

    /* compiled from: EnterPhonePresenterInfo.kt */
    public static final class Auth extends EnterPhonePresenterInfo {
        public static final a CREATOR = new a();
        public final VkAuthState c;

        /* compiled from: EnterPhonePresenterInfo.kt */
        public static final class a implements Parcelable.Creator<Auth> {
            @Override // android.os.Parcelable.Creator
            public final Auth createFromParcel(Parcel parcel) {
                return new Auth(parcel.readString(), (VkAuthState) parcel.readParcelable(VkAuthState.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Auth[] newArray(int i) {
                return new Auth[i];
            }
        }

        public Auth(String str, VkAuthState vkAuthState) {
            super(str, null);
            this.c = vkAuthState;
        }

        @Override // com.vk.auth.enterphone.EnterPhonePresenterInfo, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            super.O7(serializer);
            serializer.e0(this.c);
        }
    }

    /* compiled from: EnterPhonePresenterInfo.kt */
    public static final class SignUp extends EnterPhonePresenterInfo {
        public static final a CREATOR = new a();
        public final Country c;
        public final String d;

        /* compiled from: EnterPhonePresenterInfo.kt */
        public static final class a implements Parcelable.Creator<SignUp> {
            @Override // android.os.Parcelable.Creator
            public final SignUp createFromParcel(Parcel parcel) {
                return new SignUp(parcel.readString(), (Country) parcel.readParcelable(Country.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SignUp[] newArray(int i) {
                return new SignUp[i];
            }
        }

        public SignUp(String str, Country country, String str2) {
            super(str, null);
            this.c = country;
            this.d = str2;
        }

        @Override // com.vk.auth.enterphone.EnterPhonePresenterInfo, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            super.O7(serializer);
            serializer.e0(this.c);
            serializer.j0(this.d);
        }
    }

    /* compiled from: EnterPhonePresenterInfo.kt */
    public static final class Validate extends EnterPhonePresenterInfo {
        public static final a CREATOR = new a();
        public final boolean c;

        /* compiled from: EnterPhonePresenterInfo.kt */
        public static final class a implements Parcelable.Creator<Validate> {
            @Override // android.os.Parcelable.Creator
            public final Validate createFromParcel(Parcel parcel) {
                return new Validate(parcel.readString(), parcel.readByte() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Validate[] newArray(int i) {
                return new Validate[i];
            }
        }

        public Validate(String str, boolean z) {
            super(str, null);
            this.c = z;
        }

        @Override // com.vk.auth.enterphone.EnterPhonePresenterInfo, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            super.O7(serializer);
            serializer.L(this.c ? (byte) 1 : (byte) 0);
        }
    }

    public EnterPhonePresenterInfo(String str, zcl zclVar) {
        this.b = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.j0(this.b);
    }
}
