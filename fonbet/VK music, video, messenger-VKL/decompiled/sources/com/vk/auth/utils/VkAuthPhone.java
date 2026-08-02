package com.vk.auth.utils;

import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: VkAuthPhone.kt */
/* loaded from: classes15.dex */
public final class VkAuthPhone extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VkAuthPhone> CREATOR = new b();
    public final Country b;
    public final String c;

    /* compiled from: VkAuthPhone.kt */
    public static final class a {
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<VkAuthPhone> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkAuthPhone a(Serializer serializer) {
            return new VkAuthPhone((Country) serializer.A(Country.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkAuthPhone[i];
        }
    }

    public VkAuthPhone(Country country, String str) {
        this.b = country;
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkAuthPhone)) {
            return false;
        }
        VkAuthPhone vkAuthPhone = (VkAuthPhone) obj;
        return epx.f(this.b, vkAuthPhone.b) && epx.f(this.c, vkAuthPhone.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkAuthPhone(country=");
        sb.append(this.b);
        sb.append(", phoneWithoutCode=");
        return ho8.a(sb, this.c, ')');
    }
}
