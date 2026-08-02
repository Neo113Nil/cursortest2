package com.vk.auth.oauth.passkey;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.silentauth.SilentAuthInfo;
import com.vkontakte.android.R;
import kotlin.Result;
import xsna.bh10;
import xsna.dgn0;
import xsna.eo70;
import xsna.epx;
import xsna.h5s;
import xsna.ho8;
import xsna.m63;
import xsna.q55;
import xsna.urd0;
import xsna.w6v0;
import xsna.zcl;

/* compiled from: VkPasskeyWebOAuthResult.kt */
/* loaded from: classes15.dex */
public abstract class VkPasskeyWebOAuthResult implements Parcelable {

    /* compiled from: VkPasskeyWebOAuthResult.kt */
    public static final class Fail extends VkPasskeyWebOAuthResult {
        public static final Parcelable.Creator<Fail> CREATOR = new a();
        public final String b;

        /* compiled from: VkPasskeyWebOAuthResult.kt */
        public static final class a implements Parcelable.Creator<Fail> {
            @Override // android.os.Parcelable.Creator
            public final Fail createFromParcel(Parcel parcel) {
                return new Fail(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Fail[] newArray(int i) {
                return new Fail[i];
            }
        }

        public Fail(String str) {
            super(null);
            this.b = str;
        }

        @Override // com.vk.auth.oauth.passkey.VkPasskeyWebOAuthResult
        public final boolean a(w6v0.b bVar, Context context) {
            context.getString(R.string.vk_common_error);
            bVar.invoke(new eo70.a());
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fail) && epx.f(this.b, ((Fail) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Fail(error="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    /* compiled from: VkPasskeyWebOAuthResult.kt */
    public static final class Invalid extends VkPasskeyWebOAuthResult {
        public static final Invalid b = new Invalid(null);
        public static final Parcelable.Creator<Invalid> CREATOR = new a();

        /* compiled from: VkPasskeyWebOAuthResult.kt */
        public static final class a implements Parcelable.Creator<Invalid> {
            @Override // android.os.Parcelable.Creator
            public final Invalid createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Invalid.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Invalid[] newArray(int i) {
                return new Invalid[i];
            }
        }

        @Override // com.vk.auth.oauth.passkey.VkPasskeyWebOAuthResult
        public final boolean a(w6v0.b bVar, Context context) {
            return false;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: VkPasskeyWebOAuthResult.kt */
    public static final class Redirect extends VkPasskeyWebOAuthResult {
        public static final Parcelable.Creator<Redirect> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;

        /* compiled from: VkPasskeyWebOAuthResult.kt */
        public static final class a implements Parcelable.Creator<Redirect> {
            @Override // android.os.Parcelable.Creator
            public final Redirect createFromParcel(Parcel parcel) {
                return new Redirect(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Redirect[] newArray(int i) {
                return new Redirect[i];
            }
        }

        public Redirect(String str, String str2, String str3) {
            super(null);
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.vk.auth.oauth.passkey.VkPasskeyWebOAuthResult
        public final boolean a(w6v0.b bVar, Context context) {
            eo70.c.a aVar;
            Object failure;
            String str = this.b;
            int hashCode = str.hashCode();
            String str2 = this.d;
            eo70.c.a.C2828c c2828c = eo70.c.a.C2828c.a;
            switch (hashCode) {
                case 1782234289:
                    if (str.equals("ANOTHER_ACCOUNT")) {
                        aVar = new eo70.c.a.C2827a(str2);
                        break;
                    }
                    aVar = c2828c;
                    break;
                case 1815502446:
                    if (str.equals("RESTORE")) {
                        aVar = new eo70.c.a.d(str2);
                        break;
                    }
                    aVar = c2828c;
                    break;
                case 1856104307:
                    if (str.equals("ANOTHER_WAY")) {
                        aVar = new eo70.c.a.b(this.c, str2);
                        break;
                    }
                    aVar = c2828c;
                    break;
                case 1980572282:
                    str.equals("CANCEL");
                    aVar = c2828c;
                    break;
                default:
                    aVar = c2828c;
                    break;
            }
            bVar.invoke(new eo70.c(aVar));
            try {
                q55 q55Var = q55.a;
                Bundle bundle = q55.c().a.K;
                failure = bundle != null ? Boolean.valueOf(m63.g(bundle)) : null;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (epx.f(failure instanceof Result.Failure ? null : failure, Boolean.TRUE)) {
                if (aVar.equals(c2828c)) {
                    return false;
                }
            } else if (aVar.equals(c2828c) || (aVar instanceof eo70.c.a.C2827a)) {
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Redirect)) {
                return false;
            }
            Redirect redirect = (Redirect) obj;
            return epx.f(this.b, redirect.b) && epx.f(this.c, redirect.c) && epx.f(this.d, redirect.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Redirect(type=");
            sb.append(this.b);
            sb.append(", login=");
            sb.append(this.c);
            sb.append(", sid=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }
    }

    /* compiled from: VkPasskeyWebOAuthResult.kt */
    public static final class Success extends VkPasskeyWebOAuthResult {
        public static final Parcelable.Creator<Success> CREATOR = new a();
        public final String b;
        public final String c;
        public final long d;
        public final UserId e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final OAuth j;
        public final String k;

        /* compiled from: VkPasskeyWebOAuthResult.kt */
        public static final class OAuth implements Parcelable {
            public static final Parcelable.Creator<OAuth> CREATOR = new a();
            public final String b;

            /* compiled from: VkPasskeyWebOAuthResult.kt */
            public static final class a implements Parcelable.Creator<OAuth> {
                @Override // android.os.Parcelable.Creator
                public final OAuth createFromParcel(Parcel parcel) {
                    return new OAuth(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final OAuth[] newArray(int i) {
                    return new OAuth[i];
                }
            }

            public OAuth(String str) {
                this.b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OAuth) && epx.f(this.b, ((OAuth) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("OAuth(code="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
            }
        }

        /* compiled from: VkPasskeyWebOAuthResult.kt */
        public static final class a implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success(parcel.readString(), parcel.readString(), parcel.readLong(), (UserId) parcel.readParcelable(Success.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : OAuth.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(String str, String str2, long j, UserId userId, String str3, String str4, String str5, String str6, OAuth oAuth, String str7) {
            super(null);
            this.b = str;
            this.c = str2;
            this.d = j;
            this.e = userId;
            this.f = str3;
            this.g = str4;
            this.h = str5;
            this.i = str6;
            this.j = oAuth;
            this.k = str7;
        }

        @Override // com.vk.auth.oauth.passkey.VkPasskeyWebOAuthResult
        public final boolean a(w6v0.b bVar, Context context) {
            eo70 fVar;
            OAuth oAuth = this.j;
            if (oAuth != null) {
                fVar = new eo70.e(oAuth.b, null, String.valueOf(dgn0.b().b), h5s.c(dgn0.b().b, "://vk.ru", new StringBuilder("vk")), null);
            } else {
                UserId userId = this.e;
                String str = this.c;
                String str2 = this.b;
                long j = this.d;
                String str3 = this.f;
                String str4 = this.h;
                fVar = new eo70.f(new SilentAuthInfo(userId, str, str2, j, str3, str4, str4, str4, this.g, this.i, null, null, 0, null, null, null, 0, null, 260096, null), this.k);
            }
            bVar.invoke(fVar);
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return epx.f(this.b, success.b) && epx.f(this.c, success.c) && this.d == success.d && epx.f(this.e, success.e) && epx.f(this.f, success.f) && epx.f(this.g, success.g) && epx.f(this.h, success.h) && epx.f(this.i, success.i) && epx.f(this.j, success.j) && epx.f(this.k, success.k);
        }

        public final int hashCode() {
            int a2 = urd0.a(urd0.a(bh10.a(bh10.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e.b), 31, this.f), 31, this.g);
            String str = this.h;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.i;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            OAuth oAuth = this.j;
            int hashCode3 = (hashCode2 + (oAuth == null ? 0 : oAuth.b.hashCode())) * 31;
            String str3 = this.k;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(token=");
            sb.append(this.b);
            sb.append(", uuid=");
            sb.append(this.c);
            sb.append(", expireTime=");
            sb.append(this.d);
            sb.append(", userId=");
            sb.append(this.e);
            sb.append(", firstName=");
            sb.append(this.f);
            sb.append(", lastName=");
            sb.append(this.g);
            sb.append(", avatar=");
            sb.append(this.h);
            sb.append(", phone=");
            sb.append(this.i);
            sb.append(", oauth=");
            sb.append(this.j);
            sb.append(", superAppToken=");
            return ho8.a(sb, this.k, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeLong(this.d);
            parcel.writeParcelable(this.e, i);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
            OAuth oAuth = this.j;
            if (oAuth == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                oAuth.writeToParcel(parcel, i);
            }
            parcel.writeString(this.k);
        }
    }

    public /* synthetic */ VkPasskeyWebOAuthResult(zcl zclVar) {
        this();
    }

    public abstract boolean a(w6v0.b bVar, Context context);

    public VkPasskeyWebOAuthResult() {
    }
}
