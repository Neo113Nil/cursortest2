package com.moloco.sdk;

import com.google.protobuf.Internal;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public enum l3 implements Internal.EnumLite {
    NONE(0),
    CLOSE(1),
    SKIP(2),
    MUTE(3),
    UNMUTE(4),
    CTA(5),
    REPLAY(6),
    DEC_SKIP(7),
    AD_BADGE(8),
    UNRECOGNIZED(-1);

    public final int a;

    l3(int i) {
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
