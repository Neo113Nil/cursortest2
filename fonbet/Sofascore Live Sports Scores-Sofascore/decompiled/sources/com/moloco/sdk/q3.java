package com.moloco.sdk;

import com.google.protobuf.Internal;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public enum q3 implements Internal.EnumLite {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    UNRECOGNIZED(-1);

    public final int a;

    q3(int i) {
        this.a = i;
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
