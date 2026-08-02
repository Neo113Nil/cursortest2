package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ResponseDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private int f15231a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f15232b;

    /* renamed from: c, reason: collision with root package name */
    private Map f15233c;

    /* renamed from: d, reason: collision with root package name */
    private final ResponseValidityChecker f15234d;

    public ResponseDataHolder(@NonNull ResponseValidityChecker responseValidityChecker) {
        this.f15234d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.f15231a;
    }

    public byte[] getResponseData() {
        return this.f15232b;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.f15233c;
    }

    public boolean isValidResponse() {
        return this.f15234d.isResponseValid(this.f15231a);
    }

    public void setResponseCode(int i5) {
        this.f15231a = i5;
    }

    public void setResponseData(byte[] bArr) {
        this.f15232b = bArr;
    }

    public void setResponseHeaders(Map<String, List<String>> map) {
        this.f15233c = map;
    }
}
