package com.vk.superapp.vkpay.checkout.feature.threedspayment.models;

import java.io.Serializable;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: PostData.kt */
/* loaded from: classes6.dex */
public final class PostParams3DS implements Serializable {
    private final String md;
    private final String paReq;
    private final String termUrl;

    public PostParams3DS(String str, String str2, String str3) {
        this.md = str;
        this.paReq = str2;
        this.termUrl = str3;
    }

    public final String d() {
        return this.md;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostParams3DS)) {
            return false;
        }
        PostParams3DS postParams3DS = (PostParams3DS) obj;
        return epx.f(this.md, postParams3DS.md) && epx.f(this.paReq, postParams3DS.paReq) && epx.f(this.termUrl, postParams3DS.termUrl);
    }

    public final String g() {
        return this.paReq;
    }

    public final String h() {
        return this.termUrl;
    }

    public final int hashCode() {
        return this.termUrl.hashCode() + urd0.a(this.md.hashCode() * 31, 31, this.paReq);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostParams3DS(md=");
        sb.append(this.md);
        sb.append(", paReq=");
        sb.append(this.paReq);
        sb.append(", termUrl=");
        return ho8.a(sb, this.termUrl, ')');
    }
}
