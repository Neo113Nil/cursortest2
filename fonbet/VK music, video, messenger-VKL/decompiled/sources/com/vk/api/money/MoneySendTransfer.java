package com.vk.api.money;

import android.os.Parcel;
import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.ijp0;
import xsna.lmf0;
import xsna.rsg0;
import xsna.s730;
import xsna.shy;

/* compiled from: MoneySendTransfer.kt */
/* loaded from: classes15.dex */
public final class MoneySendTransfer extends rsg0<s730> implements Serializer.StreamParcelable {
    public static final Serializer.c<MoneySendTransfer> CREATOR = new a();
    public final int A;
    public final long B;
    public final String C;
    public final UserId s;
    public final int t;
    public final String u;
    public final String v;
    public final String w;
    public final int x;
    public final String y;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MoneySendTransfer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MoneySendTransfer a(Serializer serializer) {
            return new MoneySendTransfer((UserId) serializer.A(UserId.class.getClassLoader()), serializer.u(), serializer.H(), serializer.H(), serializer.H(), serializer.u(), serializer.H(), serializer.H(), serializer.u(), serializer.w(), null, 1024, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneySendTransfer[i];
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MoneySendTransfer(com.vk.dto.common.id.UserId r17, int r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, java.lang.String r23, java.lang.String r24, int r25, long r26, java.lang.String r28, int r29, xsna.zcl r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L9
            r9 = r2
            goto Lb
        L9:
            r9 = r22
        Lb:
            r1 = r0 & 64
            r3 = 0
            if (r1 == 0) goto L12
            r10 = r3
            goto L14
        L12:
            r10 = r23
        L14:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L1a
            r11 = r3
            goto L1c
        L1a:
            r11 = r24
        L1c:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L22
            r12 = r2
            goto L24
        L22:
            r12 = r25
        L24:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L2c
            r1 = 0
            r13 = r1
            goto L2e
        L2c:
            r13 = r26
        L2e:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L40
            r15 = r3
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r3 = r16
            goto L4e
        L40:
            r15 = r28
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
        L4e:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.api.money.MoneySendTransfer.<init>(com.vk.dto.common.id.UserId, int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, long, java.lang.String, int, xsna.zcl):void");
    }

    public static MoneySendTransfer F0(MoneySendTransfer moneySendTransfer, int i, String str, String str2, int i2) {
        UserId userId = moneySendTransfer.s;
        int i3 = moneySendTransfer.t;
        String str3 = moneySendTransfer.u;
        String str4 = moneySendTransfer.v;
        String str5 = moneySendTransfer.w;
        if ((i2 & 32) != 0) {
            i = moneySendTransfer.x;
        }
        int i4 = i;
        String str6 = (i2 & 64) != 0 ? moneySendTransfer.y : str;
        String str7 = (i2 & 128) != 0 ? moneySendTransfer.z : str2;
        int i5 = moneySendTransfer.A;
        long j = moneySendTransfer.B;
        String str8 = moneySendTransfer.C;
        moneySendTransfer.getClass();
        return new MoneySendTransfer(userId, i3, str3, str4, str5, i4, str6, str7, i5, j, str8);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.s);
        serializer.S(this.t);
        serializer.j0(this.u);
        serializer.j0(this.v);
        serializer.j0(this.w);
        serializer.S(this.x);
        serializer.j0(this.y);
        serializer.j0(this.z);
        serializer.S(this.A);
        serializer.Y(this.B);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        return jSONObject2.has("redirect_uri") ? new lmf0(jSONObject2.getString("redirect_uri")) : new ijp0(jSONObject2.getString("transfer_id"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneySendTransfer)) {
            return false;
        }
        MoneySendTransfer moneySendTransfer = (MoneySendTransfer) obj;
        return epx.f(this.s, moneySendTransfer.s) && this.t == moneySendTransfer.t && epx.f(this.u, moneySendTransfer.u) && epx.f(this.v, moneySendTransfer.v) && epx.f(this.w, moneySendTransfer.w) && this.x == moneySendTransfer.x && epx.f(this.y, moneySendTransfer.y) && epx.f(this.z, moneySendTransfer.z) && this.A == moneySendTransfer.A && this.B == moneySendTransfer.B && epx.f(this.C, moneySendTransfer.C);
    }

    public final int hashCode() {
        int a2 = shy.a(this.t, Long.hashCode(this.s.b) * 31, 31);
        String str = this.u;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.v;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.w;
        int a3 = shy.a(this.x, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.y;
        int hashCode3 = (a3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.z;
        int a4 = bh10.a(shy.a(this.A, (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31), 31, this.B);
        String str6 = this.C;
        return a4 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneySendTransfer(receiverId=");
        sb.append(this.s);
        sb.append(", amount=");
        sb.append(this.t);
        sb.append(", message=");
        sb.append(this.u);
        sb.append(", currency=");
        sb.append(this.v);
        sb.append(", from=");
        sb.append(this.w);
        sb.append(", type=");
        sb.append(this.x);
        sb.append(", cardId=");
        sb.append(this.y);
        sb.append(", vkPayPin=");
        sb.append(this.z);
        sb.append(", requestId=");
        sb.append(this.A);
        sb.append(", peerId=");
        sb.append(this.B);
        sb.append(", section=");
        return ho8.a(sb, this.C, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public MoneySendTransfer(UserId userId, int i, String str, String str2, String str3, int i2, String str4, String str5, int i3, long j, String str6) {
        super("money.sendTransfer");
        this.s = userId;
        this.t = i;
        this.u = str;
        this.v = str2;
        this.w = str3;
        this.x = i2;
        this.y = str4;
        this.z = str5;
        this.A = i3;
        this.B = j;
        this.C = str6;
        F(userId, "receiver_id");
        C(i, "amount");
        K("message", str);
        K("from", str3);
        if (!TextUtils.isEmpty(str2)) {
            K(InAppPurchaseMetaData.KEY_CURRENCY, str2);
        }
        C(i2, "type");
        K("card_id", str4);
        K("vkpay_pin", str5);
        if (i3 != 0) {
            C(i3, CommonUrlParts.REQUEST_ID);
        }
        if (j != 0) {
            D(j, "peer_id");
        }
        if (str6 != null) {
            K("section", str6);
        }
    }
}
