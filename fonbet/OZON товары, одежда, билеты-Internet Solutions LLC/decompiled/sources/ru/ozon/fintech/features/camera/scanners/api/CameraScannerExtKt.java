package ru.ozon.fintech.features.camera.scanners.api;

import H30.C3133b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"encodeRawBytes", "", "", "camera-scanners-api_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CameraScannerExtKt {
    public static final String encodeRawBytes(byte[] bArr) {
        if (bArr != null) {
            try {
                return C3133b.a(bArr);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
