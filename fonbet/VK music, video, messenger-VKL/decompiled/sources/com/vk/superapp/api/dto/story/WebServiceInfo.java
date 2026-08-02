package com.vk.superapp.api.dto.story;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;

/* compiled from: WebServiceInfo.kt */
/* loaded from: classes6.dex */
public final class WebServiceInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<WebServiceInfo> CREATOR = new a();
    public final String b;
    public final boolean c;
    public final Integer d;
    public final Boolean e;
    public final Boolean f;
    public final Integer g;
    public final Boolean h;
    public final String i;
    public final String j;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebServiceInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebServiceInfo a(Serializer serializer) {
            return new WebServiceInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebServiceInfo[i];
        }
    }

    public WebServiceInfo(String str, boolean z, Integer num, Boolean bool, Boolean bool2, Integer num2, Boolean bool3, String str2, String str3) {
        this.b = str;
        this.c = z;
        this.d = num;
        this.e = bool;
        this.f = bool2;
        this.g = num2;
        this.h = bool3;
        this.i = str2;
        this.j = str3;
    }

    public final String Ab() {
        return this.b;
    }

    public final String Bb() {
        return this.i;
    }

    public final String Cb() {
        return this.j;
    }

    public final boolean Db() {
        return this.c;
    }

    public final Integer Eb() {
        return this.d;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.V(this.d);
        serializer.J(this.e);
        serializer.J(this.f);
        serializer.V(this.g);
        serializer.J(this.h);
        serializer.m0(this.i);
        serializer.m0(this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebServiceInfo)) {
            return false;
        }
        WebServiceInfo webServiceInfo = (WebServiceInfo) obj;
        return epx.f(this.b, webServiceInfo.b) && this.c == webServiceInfo.c && epx.f(this.d, webServiceInfo.d) && epx.f(this.e, webServiceInfo.e) && epx.f(this.f, webServiceInfo.f) && epx.f(this.g, webServiceInfo.g) && epx.f(this.h, webServiceInfo.h) && epx.f(this.i, webServiceInfo.i) && epx.f(this.j, webServiceInfo.j);
    }

    public final int hashCode() {
        String str = this.b;
        int b = qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.c);
        Integer num = this.d;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.g;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.h;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebServiceInfo(maskId=");
        sb.append(this.b);
        sb.append(", openTextEditor=");
        sb.append(this.c);
        sb.append(", situationalSuggestId=");
        sb.append(this.d);
        sb.append(", isMaskFavorite=");
        sb.append(this.e);
        sb.append(", allowBackgroundEditor=");
        sb.append(this.f);
        sb.append(", lifetime=");
        sb.append(this.g);
        sb.append(", allowCamera=");
        sb.append(this.h);
        sb.append(", memoryDate=");
        sb.append(this.i);
        sb.append(", memoryType=");
        return ho8.a(sb, this.j, ')');
    }

    public final Integer zb() {
        return this.g;
    }

    public WebServiceInfo(Serializer serializer) {
        this(serializer.H(), serializer.m(), serializer.v(), serializer.n(), serializer.n(), serializer.v(), serializer.n(), serializer.I(), serializer.I());
    }
}
