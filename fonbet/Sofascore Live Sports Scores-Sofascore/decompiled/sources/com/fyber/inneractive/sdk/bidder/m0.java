package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.protobuf.d1;
import com.fyber.inneractive.sdk.protobuf.e1;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum m0 implements d1 {
    UNITCONTENTTYPEUNKNOWN(0),
    DISPLAY(1),
    VIDEO(2),
    UNRECOGNIZED(-1);

    public static final int DISPLAY_VALUE = 1;
    public static final int UNITCONTENTTYPEUNKNOWN_VALUE = 0;
    public static final int VIDEO_VALUE = 2;
    private static final e1 internalValueMap = new e1() { // from class: com.fyber.inneractive.sdk.bidder.l0
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public final d1 a(int i) {
            if (i == 0) {
                return m0.UNITCONTENTTYPEUNKNOWN;
            }
            if (i == 1) {
                return m0.DISPLAY;
            }
            if (i != 2) {
                return null;
            }
            return m0.VIDEO;
        }
    };
    private final int value;

    m0(int i) {
        this.value = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        a70.p("Can't get the number of an unknown enum value.");
        return 0;
    }
}
