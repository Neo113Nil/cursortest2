package com.vk.dto.compilation;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.NotificationImage;
import xsna.epx;
import xsna.shy;

/* compiled from: Compilation.kt */
/* loaded from: classes18.dex */
public final class Compilation extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Compilation> CREATOR = new a();
    public final int b;
    public final String c;
    public final int d;
    public final String e;
    public final NotificationImage f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Compilation> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Compilation a(Serializer serializer) {
            return new Compilation(serializer.u(), serializer.H(), serializer.u(), serializer.H(), (NotificationImage) serializer.G(NotificationImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Compilation[i];
        }
    }

    public Compilation(int i, String str, int i2, String str2, NotificationImage notificationImage) {
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = str2;
        this.f = notificationImage;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.S(this.d);
        serializer.j0(this.e);
        serializer.i0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Compilation)) {
            return false;
        }
        Compilation compilation = (Compilation) obj;
        return this.b == compilation.b && epx.f(this.c, compilation.c) && this.d == compilation.d && epx.f(this.e, compilation.e) && epx.f(this.f, compilation.f);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        String str = this.c;
        int a2 = shy.a(this.d, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.e;
        int hashCode2 = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        NotificationImage notificationImage = this.f;
        return hashCode2 + (notificationImage != null ? notificationImage.hashCode() : 0);
    }

    public final String toString() {
        return "Compilation(id=" + this.b + ", name=" + this.c + ", videosCount=" + this.d + ", icon=" + this.e + ", image=" + this.f + ')';
    }
}
