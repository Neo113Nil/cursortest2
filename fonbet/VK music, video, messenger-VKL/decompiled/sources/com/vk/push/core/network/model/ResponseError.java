package com.vk.push.core.network.model;

import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: ResponseError.kt */
/* loaded from: classes5.dex */
public final class ResponseError {
    public final int a;
    public final String b;
    public final String c;

    public ResponseError(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public static /* synthetic */ ResponseError copy$default(ResponseError responseError, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = responseError.a;
        }
        if ((i2 & 2) != 0) {
            str = responseError.b;
        }
        if ((i2 & 4) != 0) {
            str2 = responseError.c;
        }
        return responseError.copy(i, str, str2);
    }

    public final int component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final ResponseError copy(int i, String str, String str2) {
        return new ResponseError(i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseError)) {
            return false;
        }
        ResponseError responseError = (ResponseError) obj;
        return this.a == responseError.a && epx.f(this.b, responseError.b) && epx.f(this.c, responseError.c);
    }

    public final int getCode() {
        return this.a;
    }

    public final String getMessage() {
        return this.b;
    }

    public final String getStatus() {
        return this.c;
    }

    public int hashCode() {
        return this.c.hashCode() + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResponseError(code=");
        sb.append(this.a);
        sb.append(", message=");
        sb.append(this.b);
        sb.append(", status=");
        return ho8.a(sb, this.c, ')');
    }
}
