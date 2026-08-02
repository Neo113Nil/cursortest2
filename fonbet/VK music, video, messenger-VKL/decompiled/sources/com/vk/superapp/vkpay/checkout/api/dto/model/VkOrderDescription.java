package com.vk.superapp.vkpay.checkout.api.dto.model;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: VkOrderDescription.kt */
/* loaded from: classes6.dex */
public abstract class VkOrderDescription implements Serializer.StreamParcelable {

    /* compiled from: VkOrderDescription.kt */
    public static final class Description extends VkOrderDescription {
        public static final Serializer.c<Description> CREATOR = new a();
        public final String b;
        public final String c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Description> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Description a(Serializer serializer) {
                return new Description(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Description[i];
            }
        }

        public /* synthetic */ Description(String str, String str2, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Description)) {
                return false;
            }
            Description description = (Description) obj;
            return epx.f(this.b, description.b) && epx.f(this.c, description.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Description(title=");
            sb.append(this.b);
            sb.append(", subtitle=");
            return ho8.a(sb, this.c, ')');
        }

        public Description(String str, String str2) {
            super(null);
            this.b = str;
            this.c = str2;
        }

        public Description(Serializer serializer) {
            this(serializer.H(), serializer.H());
        }
    }

    public /* synthetic */ VkOrderDescription(zcl zclVar) {
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

    public VkOrderDescription() {
    }

    /* compiled from: VkOrderDescription.kt */
    public static final class NoDescription extends VkOrderDescription {
        public static final NoDescription b = new NoDescription(null);
        public static final Serializer.c<NoDescription> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<NoDescription> {
            @Override // com.vk.core.serialize.Serializer.c
            public final NoDescription a(Serializer serializer) {
                return NoDescription.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoDescription[i];
            }
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }
}
