package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.protobuf.d1;
import com.fyber.inneractive.sdk.protobuf.e1;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum n implements d1 {
    NONE(0),
    SINGLETAP(1),
    TRUESINGLETAP(2),
    UNRECOGNIZED(-1);

    public static final int NONE_VALUE = 0;
    public static final int SINGLETAP_VALUE = 1;
    public static final int TRUESINGLETAP_VALUE = 2;
    private static final e1 internalValueMap = new e1() { // from class: com.fyber.inneractive.sdk.bidder.adm.m
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public final d1 a(int i) {
            if (i == 0) {
                return n.NONE;
            }
            if (i == 1) {
                return n.SINGLETAP;
            }
            if (i != 2) {
                return null;
            }
            return n.TRUESINGLETAP;
        }
    };
    private final int value;

    n(int i) {
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
