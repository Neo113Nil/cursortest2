package com.vk.dto.common.data;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.data.AvailablePeriod;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.f370;
import xsna.kvf;
import xsna.s3q0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CallProducerButton.kt */
/* loaded from: classes18.dex */
public final class CallProducerButton implements Serializer.StreamParcelable, bxx {
    public final int b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Boolean f;
    public final List<AvailablePeriod> g;
    public final String h;
    public final UserId i;
    public final InaccessibilityMessage j;
    public final String k;
    public final String l;
    public final boolean m;
    public static final a n = new a();
    public static final Serializer.c<CallProducerButton> CREATOR = new b();

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CallProducerButton> {
        @Override // xsna.aay
        public final CallProducerButton a(JSONObject jSONObject) {
            ArrayList arrayList;
            int optInt = jSONObject.optInt("type");
            String optString = jSONObject.optString("title");
            String optString2 = jSONObject.optString("phone");
            Integer valueOf = Integer.valueOf(jSONObject.optInt(AnalyticsBaseParamsConstantsKt.TIMEZONE));
            Boolean valueOf2 = Boolean.valueOf(jSONObject.optBoolean("is_available_now"));
            AvailablePeriod.a aVar = AvailablePeriod.e;
            JSONArray optJSONArray = jSONObject.optJSONArray("available");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                ArrayList arrayList2 = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        try {
                            arrayList2.add(aVar.a(optJSONObject));
                        } catch (Exception e) {
                            L.i(e);
                            s3q0 s3q0Var = s3q0.a;
                        }
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            String optString3 = jSONObject.optString(LoginApiConstants.PARAM_NAME_USERNAME);
            Long z = f370.z(jSONObject, "user_id");
            UserId userId = z != null ? new UserId(z.longValue()) : null;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("inaccessibility_message");
            return new CallProducerButton(optInt, optString, optString2, valueOf, valueOf2, arrayList, optString3, userId, optJSONObject2 != null ? (InaccessibilityMessage) InaccessibilityMessage.d.a(optJSONObject2) : null, jSONObject.optString("url"), f370.D(jSONObject, "custom_text"), false, 2048, null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CallProducerButton> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CallProducerButton a(Serializer serializer) {
            int u = serializer.u();
            String H = serializer.H();
            String H2 = serializer.H();
            Integer v = serializer.v();
            Boolean n = serializer.n();
            ArrayList k = serializer.k(AvailablePeriod.class);
            if (k == null) {
                k = new ArrayList();
            }
            return new CallProducerButton(u, H, H2, v, n, k, serializer.H(), (UserId) serializer.A(UserId.class.getClassLoader()), (InaccessibilityMessage) serializer.A(InaccessibilityMessage.class.getClassLoader()), serializer.H(), serializer.H(), false, 2048, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CallProducerButton[i];
        }
    }

    public CallProducerButton(int i, String str, String str2, Integer num, Boolean bool, List<AvailablePeriod> list, String str3, UserId userId, InaccessibilityMessage inaccessibilityMessage, String str4, String str5, boolean z) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = num;
        this.f = bool;
        this.g = list;
        this.h = str3;
        this.i = userId;
        this.j = inaccessibilityMessage;
        this.k = str4;
        this.l = str5;
        this.m = z;
    }

    public static CallProducerButton a(CallProducerButton callProducerButton, int i, String str, int i2) {
        int i3 = (i2 & 1) != 0 ? callProducerButton.b : i;
        String str2 = (i2 & 2) != 0 ? callProducerButton.c : str;
        String str3 = callProducerButton.d;
        Integer num = callProducerButton.e;
        Boolean bool = callProducerButton.f;
        List<AvailablePeriod> list = callProducerButton.g;
        String str4 = callProducerButton.h;
        UserId userId = callProducerButton.i;
        InaccessibilityMessage inaccessibilityMessage = callProducerButton.j;
        String str5 = callProducerButton.k;
        String str6 = callProducerButton.l;
        boolean z = (i2 & 2048) != 0 ? callProducerButton.m : true;
        callProducerButton.getClass();
        return new CallProducerButton(i3, str2, str3, num, bool, list, str4, userId, inaccessibilityMessage, str5, str6, z);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.V(this.e);
        serializer.J(this.f);
        serializer.W(this.g);
        serializer.j0(this.h);
        serializer.e0(this.i);
        serializer.e0(this.j);
        serializer.j0(this.k);
        serializer.j0(this.l);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.b);
        jSONObject.put("title", this.c);
        jSONObject.put("phone", this.d);
        jSONObject.put(AnalyticsBaseParamsConstantsKt.TIMEZONE, this.e);
        jSONObject.put("is_available_now", this.f);
        List<AvailablePeriod> list = this.g;
        jSONObject.put("available", list != null ? kvf.a(list) : null);
        jSONObject.put(LoginApiConstants.PARAM_NAME_USERNAME, this.h);
        UserId userId = this.i;
        jSONObject.put("user_id", userId != null ? Long.valueOf(userId.b) : null);
        jSONObject.put("inaccessibility_message", this.j);
        jSONObject.put("url", this.k);
        jSONObject.put("custom_text", this.l);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallProducerButton)) {
            return false;
        }
        CallProducerButton callProducerButton = (CallProducerButton) obj;
        return this.b == callProducerButton.b && epx.f(this.c, callProducerButton.c) && epx.f(this.d, callProducerButton.d) && epx.f(this.e, callProducerButton.e) && epx.f(this.f, callProducerButton.f) && epx.f(this.g, callProducerButton.g) && epx.f(this.h, callProducerButton.h) && epx.f(this.i, callProducerButton.i) && epx.f(this.j, callProducerButton.j) && epx.f(this.k, callProducerButton.k) && epx.f(this.l, callProducerButton.l) && this.m == callProducerButton.m;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<AvailablePeriod> list = this.g;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.h;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UserId userId = this.i;
        int hashCode6 = (hashCode5 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        InaccessibilityMessage inaccessibilityMessage = this.j;
        int hashCode7 = (hashCode6 + (inaccessibilityMessage == null ? 0 : inaccessibilityMessage.hashCode())) * 31;
        String str3 = this.k;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        return Boolean.hashCode(this.m) + ((hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallProducerButton(type=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", phone=");
        sb.append(this.d);
        sb.append(", timezone=");
        sb.append(this.e);
        sb.append(", isAvailableNow=");
        sb.append(this.f);
        sb.append(", availablePeriods=");
        sb.append(this.g);
        sb.append(", userName=");
        sb.append(this.h);
        sb.append(", userId=");
        sb.append(this.i);
        sb.append(", inaccessibilityMessage=");
        sb.append(this.j);
        sb.append(", href=");
        sb.append(this.k);
        sb.append(", customText=");
        sb.append(this.l);
        sb.append(", isOzon=");
        return q0.a(sb, this.m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ CallProducerButton(int i, String str, String str2, Integer num, Boolean bool, List list, String str3, UserId userId, InaccessibilityMessage inaccessibilityMessage, String str4, String str5, boolean z, int i2, zcl zclVar) {
        this(i, str, str2, num, bool, list, str3, userId, inaccessibilityMessage, str4, str5, (i2 & 2048) != 0 ? false : z);
    }
}
