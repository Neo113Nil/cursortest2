package com.vk.superapp.vkpay.checkout.feature.threedspayment.models;

import java.io.Serializable;
import xsna.epx;

/* compiled from: PostData.kt */
/* loaded from: classes6.dex */
public final class PostData3DS implements Serializable {
    private final String acsUrl;
    private final PostParams3DS postData3DS;

    public PostData3DS(String str, PostParams3DS postParams3DS) {
        this.acsUrl = str;
        this.postData3DS = postParams3DS;
    }

    public final String d() {
        return this.acsUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostData3DS)) {
            return false;
        }
        PostData3DS postData3DS = (PostData3DS) obj;
        return epx.f(this.acsUrl, postData3DS.acsUrl) && epx.f(this.postData3DS, postData3DS.postData3DS);
    }

    public final PostParams3DS g() {
        return this.postData3DS;
    }

    public final int hashCode() {
        return this.postData3DS.hashCode() + (this.acsUrl.hashCode() * 31);
    }

    public final String toString() {
        return "PostData3DS(acsUrl=" + this.acsUrl + ", postData3DS=" + this.postData3DS + ')';
    }
}
