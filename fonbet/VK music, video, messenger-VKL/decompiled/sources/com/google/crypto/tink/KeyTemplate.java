package com.google.crypto.tink;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import xsna.dey;

/* loaded from: classes.dex */
public final class KeyTemplate {
    public final dey a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OutputPrefixType {
        private static final /* synthetic */ OutputPrefixType[] $VALUES;
        public static final OutputPrefixType CRUNCHY;
        public static final OutputPrefixType LEGACY;
        public static final OutputPrefixType RAW;
        public static final OutputPrefixType TINK;

        static {
            OutputPrefixType outputPrefixType = new OutputPrefixType("TINK", 0);
            TINK = outputPrefixType;
            OutputPrefixType outputPrefixType2 = new OutputPrefixType("LEGACY", 1);
            LEGACY = outputPrefixType2;
            OutputPrefixType outputPrefixType3 = new OutputPrefixType("RAW", 2);
            RAW = outputPrefixType3;
            OutputPrefixType outputPrefixType4 = new OutputPrefixType("CRUNCHY", 3);
            CRUNCHY = outputPrefixType4;
            $VALUES = new OutputPrefixType[]{outputPrefixType, outputPrefixType2, outputPrefixType3, outputPrefixType4};
        }

        public OutputPrefixType() {
            throw null;
        }

        public static OutputPrefixType valueOf(String str) {
            return (OutputPrefixType) Enum.valueOf(OutputPrefixType.class, str);
        }

        public static OutputPrefixType[] values() {
            return (OutputPrefixType[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            b = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.google.crypto.tink.proto.OutputPrefixType.values().length];
            a = iArr2;
            try {
                iArr2[com.google.crypto.tink.proto.OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[com.google.crypto.tink.proto.OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[com.google.crypto.tink.proto.OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public KeyTemplate(dey deyVar) {
        this.a = deyVar;
    }

    public static KeyTemplate a(String str, byte[] bArr, OutputPrefixType outputPrefixType) {
        com.google.crypto.tink.proto.OutputPrefixType outputPrefixType2;
        dey.b x = dey.x();
        x.l();
        dey.q((dey) x.c, str);
        ByteString.g e = ByteString.e(0, bArr.length, bArr);
        x.l();
        dey.r((dey) x.c, e);
        int i = a.b[outputPrefixType.ordinal()];
        if (i == 1) {
            outputPrefixType2 = com.google.crypto.tink.proto.OutputPrefixType.TINK;
        } else if (i == 2) {
            outputPrefixType2 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY;
        } else if (i == 3) {
            outputPrefixType2 = com.google.crypto.tink.proto.OutputPrefixType.RAW;
        } else {
            if (i != 4) {
                throw new IllegalArgumentException("Unknown output prefix type");
            }
            outputPrefixType2 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY;
        }
        x.l();
        dey.s((dey) x.c, outputPrefixType2);
        return new KeyTemplate(x.j());
    }
}
