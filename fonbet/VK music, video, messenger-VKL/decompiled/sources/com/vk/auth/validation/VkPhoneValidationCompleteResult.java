package com.vk.auth.validation;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: VkPhoneValidationCompleteResult.kt */
/* loaded from: classes15.dex */
public abstract class VkPhoneValidationCompleteResult implements Serializer.StreamParcelable {
    public final String b;

    /* compiled from: VkPhoneValidationCompleteResult.kt */
    public static final class Internal extends VkPhoneValidationCompleteResult implements Serializer.StreamParcelable {
        public static final Serializer.c<Internal> CREATOR = new a();
        public final String c;
        public final String d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Internal> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Internal a(Serializer serializer) {
                return new Internal(serializer.H(), serializer.H(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Internal[i];
            }
        }

        public Internal(String str, String str2, String str3) {
            super(str, null);
            this.c = str2;
            this.d = str3;
        }

        @Override // com.vk.auth.validation.VkPhoneValidationCompleteResult, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            super.O7(serializer);
            serializer.j0(this.c);
            serializer.j0(this.d);
        }
    }

    /* compiled from: VkPhoneValidationCompleteResult.kt */
    public static final class Public extends VkPhoneValidationCompleteResult {
        public static final Serializer.c<Public> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Public> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Public a(Serializer serializer) {
                return new Public(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Public[i];
            }
        }

        public Public(String str) {
            super(str, null);
        }
    }

    /* compiled from: VkPhoneValidationCompleteResult.kt */
    public static final class Skip extends VkPhoneValidationCompleteResult {
        public static final Skip c = new Skip(null, null);
    }

    public VkPhoneValidationCompleteResult(String str, zcl zclVar) {
        this.b = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.j0(this.b);
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
