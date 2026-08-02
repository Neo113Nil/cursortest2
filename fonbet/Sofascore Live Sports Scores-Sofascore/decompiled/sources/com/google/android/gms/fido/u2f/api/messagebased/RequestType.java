package com.google.android.gms.fido.u2f.api.messagebased;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes3.dex */
public enum RequestType {
    /* JADX INFO: Fake field, exist only in values array */
    REGISTER("u2f_register_request"),
    /* JADX INFO: Fake field, exist only in values array */
    SIGN("u2f_sign_request");

    public final String a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class UnsupportedRequestTypeException extends Exception {
    }

    RequestType(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
