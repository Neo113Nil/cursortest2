package com.moloco.sdk;

import com.google.protobuf.Internal;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public enum t2 implements Internal.EnumLite {
    UNKNOWN(0),
    HTTP_SSL_ERROR(1),
    HTTP_UKNOWN_HOST(2),
    HTTP_REQUEST_TIMEOUT(3),
    HTTP_SOCKET(4),
    ANDROID_WORK_MANAGER_ISSUE(5),
    UNRECOGNIZED(-1);

    public final int a;

    t2(int i2) {
        this.a = i2;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        a70.p("Can't get the number of an unknown enum value.");
        return 0;
    }
}
