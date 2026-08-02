package org.chromium.net.apihelpers;

import java.util.Objects;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes10.dex */
public class CronetResponse<T> {
    private final T mResponseBody;
    private final UrlResponseInfo mUrlResponseInfo;

    CronetResponse(UrlResponseInfo urlResponseInfo, T responseBody) {
        this.mUrlResponseInfo = urlResponseInfo;
        this.mResponseBody = responseBody;
    }

    public UrlResponseInfo getUrlResponseInfo() {
        return this.mUrlResponseInfo;
    }

    public T getResponseBody() {
        return this.mResponseBody;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CronetResponse)) {
            return false;
        }
        CronetResponse cronetResponse = (CronetResponse) o;
        return Objects.equals(this.mUrlResponseInfo, cronetResponse.mUrlResponseInfo) && Objects.equals(this.mResponseBody, cronetResponse.mResponseBody);
    }

    public int hashCode() {
        return Objects.hash(this.mUrlResponseInfo, this.mResponseBody);
    }
}
