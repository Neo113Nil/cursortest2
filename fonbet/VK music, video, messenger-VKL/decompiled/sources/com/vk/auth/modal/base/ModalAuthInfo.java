package com.vk.auth.modal.base;

import com.vk.auth.ui.consent.ConsentScreenInfo;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.qr.ModalAuthFlowType;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;

/* compiled from: ModalAuthInfo.kt */
/* loaded from: classes15.dex */
public final class ModalAuthInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ModalAuthInfo> CREATOR = new a();
    public final ModalAuthFlowType b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final boolean o;
    public final ConsentScreenInfo p;
    public final boolean q;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ModalAuthInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ModalAuthInfo a(Serializer serializer) {
            return new ModalAuthInfo(ModalAuthFlowType.valueOf(serializer.H()), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.m(), (ConsentScreenInfo) serializer.A(ConsentScreenInfo.class.getClassLoader()), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ModalAuthInfo[i];
        }
    }

    public ModalAuthInfo(ModalAuthFlowType modalAuthFlowType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, ConsentScreenInfo consentScreenInfo, boolean z2) {
        this.b = modalAuthFlowType;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = str11;
        this.n = str12;
        this.o = z;
        this.p = consentScreenInfo;
        this.q = z2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b.name());
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.j0(this.l);
        serializer.j0(this.m);
        serializer.j0(this.n);
        serializer.L(this.o ? (byte) 1 : (byte) 0);
        serializer.e0(this.p);
        serializer.L(this.q ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModalAuthInfo)) {
            return false;
        }
        ModalAuthInfo modalAuthInfo = (ModalAuthInfo) obj;
        return this.b == modalAuthInfo.b && epx.f(this.c, modalAuthInfo.c) && epx.f(this.d, modalAuthInfo.d) && epx.f(this.e, modalAuthInfo.e) && epx.f(this.f, modalAuthInfo.f) && epx.f(this.g, modalAuthInfo.g) && epx.f(this.h, modalAuthInfo.h) && epx.f(this.i, modalAuthInfo.i) && epx.f(this.j, modalAuthInfo.j) && epx.f(this.k, modalAuthInfo.k) && epx.f(this.l, modalAuthInfo.l) && epx.f(this.m, modalAuthInfo.m) && epx.f(this.n, modalAuthInfo.n) && this.o == modalAuthInfo.o && epx.f(this.p, modalAuthInfo.p) && this.q == modalAuthInfo.q;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int a3 = urd0.a(urd0.a(urd0.a(urd0.a((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        String str2 = this.k;
        int hashCode = (a3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int a4 = urd0.a((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.m);
        String str4 = this.n;
        int b = qoy.b((a4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.o);
        ConsentScreenInfo consentScreenInfo = this.p;
        return Boolean.hashCode(this.q) + ((b + (consentScreenInfo != null ? consentScreenInfo.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModalAuthInfo(flowType=");
        sb.append(this.b);
        sb.append(", authCode=");
        sb.append(this.c);
        sb.append(", authId=");
        sb.append(this.d);
        sb.append(", serviceName=");
        sb.append(this.e);
        sb.append(", serviceDomain=");
        sb.append(this.f);
        sb.append(", deviceName=");
        sb.append(this.g);
        sb.append(", locationAuthName=");
        sb.append(this.h);
        sb.append(", locationAuthMapUrl=");
        sb.append(this.i);
        sb.append(", ipAddress=");
        sb.append(this.j);
        sb.append(", userName=");
        sb.append(this.k);
        sb.append(", userAvatar=");
        sb.append(this.l);
        sb.append(", userPhone=");
        sb.append(this.m);
        sb.append(", browserName=");
        sb.append(this.n);
        sb.append(", isOfficialApp=");
        sb.append(this.o);
        sb.append(", scopeScreenInfo=");
        sb.append(this.p);
        sb.append(", isExternalCameraFlow=");
        return q0.a(sb, this.q, ')');
    }
}
