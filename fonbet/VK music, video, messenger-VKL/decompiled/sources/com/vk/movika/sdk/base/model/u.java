package com.vk.movika.sdk.base.model;

import xsna.epx;
import xsna.h5s;
import xsna.mq;
import xsna.xe9;

/* loaded from: classes3.dex */
public final class u {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;

    public u(Integer num, String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return epx.f(this.a, uVar.a) && epx.f(this.b, uVar.b) && epx.f(this.c, uVar.c) && epx.f(this.d, uVar.d) && epx.f(this.e, uVar.e) && epx.f(this.f, uVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return this.f.hashCode() + ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder a = xe9.a("MetaInformation(id=", this.a, ", version=", this.b, ", build=");
        mq.b(this.c, ", created=", this.d, ", updated=", a);
        return h5s.d(a, this.e, ", initChapterId=", this.f, ")");
    }
}
