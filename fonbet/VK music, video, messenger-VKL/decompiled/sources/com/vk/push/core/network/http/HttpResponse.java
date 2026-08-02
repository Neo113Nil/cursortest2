package com.vk.push.core.network.http;

import xsna.epx;
import xsna.ho8;
import xsna.shy;

/* compiled from: HttpResponse.kt */
/* loaded from: classes5.dex */
public final class HttpResponse {
    public final String a;
    public final int b;
    public final String c;

    public HttpResponse(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = httpResponse.a;
        }
        if ((i2 & 2) != 0) {
            i = httpResponse.b;
        }
        if ((i2 & 4) != 0) {
            str2 = httpResponse.c;
        }
        return httpResponse.copy(str, i, str2);
    }

    public final String component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final HttpResponse copy(String str, int i, String str2) {
        return new HttpResponse(str, i, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return epx.f(this.a, httpResponse.a) && this.b == httpResponse.b && epx.f(this.c, httpResponse.c);
    }

    public final String getBody() {
        return this.a;
    }

    public final int getCode() {
        return this.b;
    }

    public final String getMessage() {
        return this.c;
    }

    public int hashCode() {
        int a = shy.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final boolean isSuccessful() {
        int i = this.b;
        return 200 <= i && i < 300;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpResponse(body=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", message=");
        return ho8.a(sb, this.c, ')');
    }
}
