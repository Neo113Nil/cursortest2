package com.vk.dto.newsfeed;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bh10;
import xsna.cqm0;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;

/* compiled from: Caption.kt */
/* loaded from: classes18.dex */
public final class Caption extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Caption> CREATOR = new b();
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final ArrayList<Image> g;
    public final UserId h;
    public final String i;
    public String j;
    public final String k;
    public final String l;
    public final String m;

    /* compiled from: Caption.kt */
    public static final class a {
        public static Caption a(JSONObject jSONObject) {
            String optString = jSONObject.optString("type");
            String optString2 = jSONObject.optString("text");
            boolean z = jSONObject.has("can_hide_post") ? jSONObject.getBoolean("can_hide_post") : false;
            String optString3 = jSONObject.optString("action_title");
            String optString4 = jSONObject.optString("action_url");
            JSONArray optJSONArray = jSONObject.optJSONArray("images");
            ArrayList arrayList = null;
            if (optJSONArray != null) {
                ArrayList arrayList2 = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList2.add(new Image(optJSONArray.getJSONArray(i), null, 2, null));
                }
                arrayList = arrayList2;
            }
            return new Caption(optString, optString2, z, optString3, optString4, arrayList, new UserId(jSONObject.optLong("source_id")), cqm0.a(jSONObject.optString("target")), null, jSONObject.optString("icon"), jSONObject.optString("hide_button_title"), jSONObject.optString("track_code"), 256, null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Caption> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Caption a(Serializer serializer) {
            return new Caption(serializer.H(), serializer.H(), serializer.m(), serializer.H(), serializer.H(), serializer.j(Image.CREATOR), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Caption[i];
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ Caption(java.lang.String r16, java.lang.String r17, boolean r18, java.lang.String r19, java.lang.String r20, java.util.ArrayList r21, com.vk.dto.common.id.UserId r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28, xsna.zcl r29) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 4
            if (r1 == 0) goto L9
            r1 = 0
            r5 = r1
            goto Lb
        L9:
            r5 = r18
        Lb:
            r1 = r0 & 128(0x80, float:1.8E-43)
            r2 = 0
            if (r1 == 0) goto L12
            r10 = r2
            goto L14
        L12:
            r10 = r23
        L14:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L2d
            r11 = r2
            r3 = r16
            r4 = r17
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r12 = r25
            r13 = r26
            r14 = r27
            r2 = r15
            goto L42
        L2d:
            r11 = r24
            r2 = r15
            r3 = r16
            r4 = r17
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r12 = r25
            r13 = r26
            r14 = r27
        L42:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.dto.newsfeed.Caption.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.util.ArrayList, com.vk.dto.common.id.UserId, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, xsna.zcl):void");
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.o0(this.g);
        serializer.e0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.j0(this.l);
        serializer.j0(this.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Caption)) {
            return false;
        }
        Caption caption = (Caption) obj;
        return epx.f(this.b, caption.b) && epx.f(this.c, caption.c) && this.d == caption.d && epx.f(this.e, caption.e) && epx.f(this.f, caption.f) && epx.f(this.g, caption.g) && epx.f(this.h, caption.h) && epx.f(this.i, caption.i) && epx.f(this.j, caption.j) && epx.f(this.k, caption.k) && epx.f(this.l, caption.l) && epx.f(this.m, caption.m);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(qoy.b(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        ArrayList<Image> arrayList = this.g;
        int a3 = bh10.a((a2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31, 31, this.h.b);
        String str = this.i;
        int hashCode = (a3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.m;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Caption(type=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", canHidePost=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", url=");
        sb.append(this.f);
        sb.append(", images=");
        sb.append(this.g);
        sb.append(", sourceId=");
        sb.append(this.h);
        sb.append(", target=");
        sb.append(this.i);
        sb.append(", sourceName=");
        sb.append(this.j);
        sb.append(", icon=");
        sb.append(this.k);
        sb.append(", hideButtonTitle=");
        sb.append(this.l);
        sb.append(", trackCode=");
        return ho8.a(sb, this.m, ')');
    }

    public Caption(String str, String str2, boolean z, String str3, String str4, ArrayList<Image> arrayList, UserId userId, String str5, String str6, String str7, String str8, String str9) {
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = arrayList;
        this.h = userId;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = str9;
    }
}
