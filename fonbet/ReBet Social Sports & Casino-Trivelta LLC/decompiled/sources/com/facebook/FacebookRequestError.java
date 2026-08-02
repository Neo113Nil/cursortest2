package com.facebook;

import T7.A;
import T7.C1675o;
import T7.C1682w;
import T7.Y;
import X9.m;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.gifdecoder.e;
import com.google.android.material.shape.i;
import com.plaid.internal.EnumC3631g;
import com.twilio.voice.EventGroupType;
import com.twilio.voice.EventKeys;
import g6.C4331C;
import g6.C4333E;
import g6.C4357q;
import i3.C4527h;
import java.net.HttpURLConnection;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 K2\u00020\u0001:\u0003*.0B\u0083\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B#\b\u0017\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u001a\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019¢\u0006\u0004\b\u0016\u0010\u001bB%\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u001dB\u0011\b\u0012\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u0016\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010)R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010)R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b2\u00101\u001a\u0004\b3\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b4\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b3\u00105\u001a\u0004\b6\u00107R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b-\u0010;R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b6\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00068F¢\u0006\f\n\u0004\b,\u00101\u001a\u0004\b0\u0010\"R(\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010?\u001a\u0004\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u0010@\u001a\u0004\b8\u0010AR\u0017\u0010G\u001a\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010J\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bH\u00101\u001a\u0004\bI\u0010\"¨\u0006L"}, d2 = {"Lcom/facebook/FacebookRequestError;", "Landroid/os/Parcelable;", "", "requestStatusCode", "errorCode", "subErrorCode", "", "errorType", "errorMessageField", "errorUserTitle", "errorUserMessage", "Lorg/json/JSONObject;", "requestResultBody", "requestResult", "", "batchRequestResult", "Ljava/net/HttpURLConnection;", EventGroupType.CONNECTION_EVENT_GROUP, "Lg6/q;", "exceptionField", "", "errorIsTransient", "<init>", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lg6/q;Z)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V", "errorMessage", "(ILjava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "toString", "()Ljava/lang/String;", "out", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "I", "k", com.google.crypto.tink.integration.android.b.f37029b, "c", "l", W9.d.f13160a, "Ljava/lang/String;", e.f29601m, "g", "f", "Lorg/json/JSONObject;", "j", "()Lorg/json/JSONObject;", C4527h.f48087o, i.f35755A, "Ljava/lang/Object;", "()Ljava/lang/Object;", "Ljava/net/HttpURLConnection;", "getConnection", "()Ljava/net/HttpURLConnection;", "<set-?>", "Lg6/q;", "()Lg6/q;", "Lcom/facebook/FacebookRequestError$a;", m.f13664a, "Lcom/facebook/FacebookRequestError$a;", "getCategory", "()Lcom/facebook/FacebookRequestError$a;", "category", "n", "getErrorRecoveryMessage", "errorRecoveryMessage", "o", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FacebookRequestError implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int requestStatusCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int errorCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int subErrorCode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String errorType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String errorUserTitle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String errorUserMessage;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final JSONObject requestResultBody;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final JSONObject requestResult;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final Object batchRequestResult;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final HttpURLConnection connection;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final String errorMessage;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public C4357q exception;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final a category;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final String errorRecoveryMessage;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: p, reason: collision with root package name */
    public static final d f30294p = new d(200, EnumC3631g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new b();

    public enum a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FacebookRequestError(parcel, (DefaultConstructorMarker) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError[] newArray(int i10) {
            return new FacebookRequestError[i10];
        }
    }

    /* renamed from: com.facebook.FacebookRequestError$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FacebookRequestError a(JSONObject singleResult, Object obj, HttpURLConnection httpURLConnection) {
            String str;
            String optString;
            int optInt;
            String str2;
            Object obj2;
            boolean z10;
            String str3;
            String str4;
            Intrinsics.checkNotNullParameter(singleResult, "singleResult");
            try {
                if (singleResult.has(EventKeys.ERROR_CODE)) {
                    int i10 = singleResult.getInt(EventKeys.ERROR_CODE);
                    Object O10 = Y.O(singleResult, "body", "FACEBOOK_NON_JSON_RESULT");
                    if (O10 == null || !(O10 instanceof JSONObject)) {
                        str = "body";
                    } else {
                        boolean z11 = true;
                        boolean z12 = false;
                        int i11 = -1;
                        if (((JSONObject) O10).has("error")) {
                            JSONObject jSONObject = (JSONObject) Y.O((JSONObject) O10, "error", null);
                            String optString2 = jSONObject == null ? null : jSONObject.optString("type", null);
                            optString = jSONObject == null ? null : jSONObject.optString("message", null);
                            int optInt2 = jSONObject == null ? -1 : jSONObject.optInt(EventKeys.ERROR_CODE, -1);
                            if (jSONObject != null) {
                                i11 = jSONObject.optInt("error_subcode", -1);
                            }
                            str4 = jSONObject == null ? null : jSONObject.optString("error_user_msg", null);
                            String optString3 = jSONObject == null ? null : jSONObject.optString("error_user_title", null);
                            if (jSONObject != null) {
                                z12 = jSONObject.optBoolean("is_transient", false);
                            }
                            str = "body";
                            optInt = i11;
                            i11 = optInt2;
                            str2 = optString2;
                            obj2 = O10;
                            str3 = optString3;
                            z10 = z12;
                        } else {
                            if (!((JSONObject) O10).has(EventKeys.ERROR_CODE_KEY) && !((JSONObject) O10).has("error_msg") && !((JSONObject) O10).has("error_reason")) {
                                str = "body";
                                obj2 = O10;
                                z11 = false;
                                z10 = false;
                                optInt = -1;
                                str2 = null;
                                str3 = null;
                                optString = null;
                                str4 = null;
                            }
                            String optString4 = ((JSONObject) O10).optString("error_reason", null);
                            optString = ((JSONObject) O10).optString("error_msg", null);
                            i11 = ((JSONObject) O10).optInt(EventKeys.ERROR_CODE_KEY, -1);
                            str = "body";
                            optInt = ((JSONObject) O10).optInt("error_subcode", -1);
                            str2 = optString4;
                            obj2 = O10;
                            z10 = false;
                            str3 = null;
                            str4 = null;
                        }
                        if (z11) {
                            return new FacebookRequestError(i10, i11, optInt, str2, optString, str3, str4, (JSONObject) obj2, singleResult, obj, httpURLConnection, null, z10, null);
                        }
                    }
                    if (!c().a(i10)) {
                        return new FacebookRequestError(i10, -1, -1, null, null, null, null, singleResult.has(str) ? (JSONObject) Y.O(singleResult, str, "FACEBOOK_NON_JSON_RESULT") : null, singleResult, obj, httpURLConnection, null, false, null);
                    }
                }
            } catch (JSONException unused) {
            }
            return null;
        }

        public final synchronized C1675o b() {
            A a10 = A.f10965a;
            C1682w f10 = A.f(C4331C.m());
            if (f10 == null) {
                return C1675o.f11150g.b();
            }
            return f10.d();
        }

        public final d c() {
            return FacebookRequestError.f30294p;
        }

        public Companion() {
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f30312a;

        /* renamed from: b, reason: collision with root package name */
        public final int f30313b;

        public d(int i10, int i11) {
            this.f30312a = i10;
            this.f30313b = i11;
        }

        public final boolean a(int i10) {
            return i10 <= this.f30313b && this.f30312a <= i10;
        }
    }

    public /* synthetic */ FacebookRequestError(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, C4357q c4357q, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, c4357q, z10);
    }

    /* renamed from: b, reason: from getter */
    public final Object getBatchRequestResult() {
        return this.batchRequestResult;
    }

    /* renamed from: c, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String d() {
        String str = this.errorMessage;
        if (str != null) {
            return str;
        }
        C4357q c4357q = this.exception;
        if (c4357q == null) {
            return null;
        }
        return c4357q.getLocalizedMessage();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    /* renamed from: f, reason: from getter */
    public final String getErrorUserMessage() {
        return this.errorUserMessage;
    }

    /* renamed from: g, reason: from getter */
    public final String getErrorUserTitle() {
        return this.errorUserTitle;
    }

    /* renamed from: h, reason: from getter */
    public final C4357q getException() {
        return this.exception;
    }

    /* renamed from: i, reason: from getter */
    public final JSONObject getRequestResult() {
        return this.requestResult;
    }

    /* renamed from: j, reason: from getter */
    public final JSONObject getRequestResultBody() {
        return this.requestResultBody;
    }

    /* renamed from: k, reason: from getter */
    public final int getRequestStatusCode() {
        return this.requestStatusCode;
    }

    /* renamed from: l, reason: from getter */
    public final int getSubErrorCode() {
        return this.subErrorCode;
    }

    public String toString() {
        String str = "{HttpStatus: " + this.requestStatusCode + ", errorCode: " + this.errorCode + ", subErrorCode: " + this.subErrorCode + ", errorType: " + this.errorType + ", errorMessage: " + d() + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.requestStatusCode);
        out.writeInt(this.errorCode);
        out.writeInt(this.subErrorCode);
        out.writeString(this.errorType);
        out.writeString(d());
        out.writeString(this.errorUserTitle);
        out.writeString(this.errorUserMessage);
    }

    public /* synthetic */ FacebookRequestError(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public FacebookRequestError(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, C4357q c4357q, boolean z10) {
        a c10;
        this.requestStatusCode = i10;
        this.errorCode = i11;
        this.subErrorCode = i12;
        this.errorType = str;
        this.errorUserTitle = str3;
        this.errorUserMessage = str4;
        this.requestResultBody = jSONObject;
        this.requestResult = jSONObject2;
        this.batchRequestResult = obj;
        this.connection = httpURLConnection;
        this.errorMessage = str2;
        if (c4357q != null) {
            this.exception = c4357q;
            c10 = a.OTHER;
        } else {
            this.exception = new C4333E(this, d());
            c10 = INSTANCE.b().c(i11, i12, z10);
        }
        this.category = c10;
        this.errorRecoveryMessage = INSTANCE.b().d(c10);
    }

    public FacebookRequestError(HttpURLConnection httpURLConnection, Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof C4357q ? (C4357q) exc : new C4357q(exc), false);
    }

    public FacebookRequestError(int i10, String str, String str2) {
        this(-1, i10, -1, str, str2, null, null, null, null, null, null, null, false);
    }

    public FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }
}
