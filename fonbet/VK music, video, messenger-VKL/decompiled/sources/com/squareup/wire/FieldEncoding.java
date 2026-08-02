package com.squareup.wire;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.NoWhenBranchMatchedException;
import xsna.epx;
import xsna.zcl;

/* compiled from: FieldEncoding.kt */
/* loaded from: classes14.dex */
public enum FieldEncoding {
    VARINT(0),
    FIXED64(1),
    LENGTH_DELIMITED(2),
    FIXED32(5);

    public static final Companion Companion = new Companion(null);
    private final int value;

    /* compiled from: FieldEncoding.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final FieldEncoding get$wire_runtime(int i) throws IOException {
            if (i == 0) {
                return FieldEncoding.VARINT;
            }
            if (i == 1) {
                return FieldEncoding.FIXED64;
            }
            if (i == 2) {
                return FieldEncoding.LENGTH_DELIMITED;
            }
            if (i == 5) {
                return FieldEncoding.FIXED32;
            }
            throw new ProtocolException(epx.j(Integer.valueOf(i), "Unexpected FieldEncoding: "));
        }

        private Companion() {
        }
    }

    /* compiled from: FieldEncoding.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FieldEncoding.values().length];
            iArr[FieldEncoding.VARINT.ordinal()] = 1;
            iArr[FieldEncoding.FIXED32.ordinal()] = 2;
            iArr[FieldEncoding.FIXED64.ordinal()] = 3;
            iArr[FieldEncoding.LENGTH_DELIMITED.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    FieldEncoding(int i) {
        this.value = i;
    }

    public final int getValue$wire_runtime() {
        return this.value;
    }

    public final ProtoAdapter<?> rawProtoAdapter() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return ProtoAdapter.UINT64;
        }
        if (i == 2) {
            return ProtoAdapter.FIXED32;
        }
        if (i == 3) {
            return ProtoAdapter.FIXED64;
        }
        if (i == 4) {
            return ProtoAdapter.BYTES;
        }
        throw new NoWhenBranchMatchedException();
    }
}
