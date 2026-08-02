package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.vp2;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.з, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0386 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C0848 f1133;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0465 f1134;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0506 f1135;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final Charset f1132 = Charset.forName(StringFog.decrypt("cCqVklw=\n", "JX7Tv2TDXlQ=\n"));

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final Charset f1131 = Charset.forName(StringFog.decrypt("RZoMLPM0LIo=\n", "EMkhbaB3ZcM=\n"));

    public C0386(C0506 c0506, C0465 c0465, C0848 c0848) {
        this.f1135 = c0506;
        this.f1134 = c0465;
        this.f1133 = c0848;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static byte[] m224(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length + 20 + bArr2.length + 2 + bArr3.length + 4 + bArr4.length);
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.write(StringFog.decrypt("ZCt/Wg==\n", "MWo7Cx3noso=\n").getBytes(f1131));
            dataOutputStream.writeByte(1);
            dataOutputStream.writeShort(1);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(1);
            dataOutputStream.writeByte(bArr.length);
            dataOutputStream.write(bArr);
            dataOutputStream.writeByte(bArr2.length);
            dataOutputStream.write(bArr2);
            dataOutputStream.writeShort(bArr3.length);
            dataOutputStream.write(bArr3);
            dataOutputStream.writeInt(bArr4.length);
            dataOutputStream.write(bArr4);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            vp2.e(StringFog.decrypt("tFkYRqvrjZWdGAJPvObMjZtCFAqr4duEnlcBTw==\n", "8jhxKs6PreE=\n"), e);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] m225(String str, String str2, long j, C1112 c1112) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringFog.decrypt("xjqaUXN95Tn3NZk=\n", "o1T+IRwUi00=\n"), str);
            jSONObject.put(StringFog.decrypt("dnzpNKGW2A9qdg==\n", "BRiCYsTkq2Y=\n"), this.f1133.f2858);
            jSONObject.put(StringFog.decrypt("htHQbgplnaWP\n", "56GgJ24t/NY=\n"), this.f1133.f2857);
            jSONObject.put(StringFog.decrypt("g8Onk8lkWQuV\n", "8abW5qwXLUI=\n"), str2);
            jSONObject.put(StringFog.decrypt("j9zDAMyZQauL\n", "+7WuZb/tIMY=\n"), j);
            jSONObject.put(StringFog.decrypt("A1UxryxuZ1gTfSmrLG8=\n", "ajtFykscDiw=\n"), c1112.m659());
            return jSONObject.toString().getBytes(f1132);
        } catch (Exception e) {
            vp2.e(StringFog.decrypt("2JdtAU3bEaPx1mYYQdNV99+3QE1i7H6Z\n", "nvYEbSi/Mdc=\n"), e);
            return null;
        }
    }
}
