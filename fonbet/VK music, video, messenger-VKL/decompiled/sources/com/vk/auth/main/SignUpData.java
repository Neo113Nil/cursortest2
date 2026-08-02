package com.vk.auth.main;

import android.net.Uri;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.core.api.models.VkGender;
import com.vk.superapp.multiaccount.api.SimpleDate;
import java.util.Locale;
import xsna.alb0;
import xsna.epx;

/* compiled from: SignUpDataHolder.kt */
/* loaded from: classes15.dex */
public final class SignUpData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<SignUpData> CREATOR = new a();
    public final String b;
    public final VkGender c;
    public final SimpleDate d;
    public final Uri e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SignUpData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SignUpData a(Serializer serializer) {
            Object obj;
            String H = serializer.H();
            String H2 = serializer.H();
            Object obj2 = VkGender.UNDEFINED;
            if (H2 != null) {
                try {
                    obj = Enum.valueOf(VkGender.class, H2.toUpperCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                if (obj != null) {
                    obj2 = obj;
                }
            }
            return new SignUpData(H, (VkGender) obj2, (SimpleDate) serializer.A(SimpleDate.class.getClassLoader()), (Uri) serializer.A(Uri.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SignUpData[i];
        }
    }

    public SignUpData(String str, VkGender vkGender, SimpleDate simpleDate, Uri uri) {
        this.b = str;
        this.c = vkGender;
        this.d = simpleDate;
        this.e = uri;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c.i());
        serializer.e0(this.d);
        serializer.e0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignUpData)) {
            return false;
        }
        SignUpData signUpData = (SignUpData) obj;
        return epx.f(this.b, signUpData.b) && this.c == signUpData.c && epx.f(this.d, signUpData.d) && epx.f(this.e, signUpData.e);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (this.c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        SimpleDate simpleDate = this.d;
        int hashCode2 = (hashCode + (simpleDate == null ? 0 : simpleDate.hashCode())) * 31;
        Uri uri = this.e;
        return hashCode2 + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SignUpData(phone=");
        sb.append(this.b);
        sb.append(", gender=");
        sb.append(this.c);
        sb.append(", birthday=");
        sb.append(this.d);
        sb.append(", avatarUri=");
        return alb0.b(sb, this.e, ')');
    }

    public final Uri zb() {
        return this.e;
    }
}
