package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;
import java.io.IOException;
import java.util.Map;
import xsna.ka20;

/* compiled from: ExtensionSchemaLite.java */
/* loaded from: classes13.dex */
public final class m extends l<GeneratedMessageLite.d> {

    /* compiled from: ExtensionSchemaLite.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat$FieldType.values().length];
            a = iArr;
            try {
                iArr[WireFormat$FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat$FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat$FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WireFormat$FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WireFormat$FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[WireFormat$FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[WireFormat$FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[WireFormat$FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[WireFormat$FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[WireFormat$FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[WireFormat$FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[WireFormat$FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[WireFormat$FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[WireFormat$FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[WireFormat$FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[WireFormat$FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[WireFormat$FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[WireFormat$FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l
    public final void a(Map.Entry entry) {
        ((GeneratedMessageLite.d) entry.getKey()).getClass();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l
    public final GeneratedMessageLite.e b(k kVar, ka20 ka20Var, int i) {
        return kVar.a.get(new k.a(i, ka20Var));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l
    public final n<GeneratedMessageLite.d> c(Object obj) {
        return ((GeneratedMessageLite.c) obj).extensions;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l
    public final n<GeneratedMessageLite.d> d(Object obj) {
        return ((GeneratedMessageLite.c) obj).p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l
    public final boolean e(ka20 ka20Var) {
        return ka20Var instanceof GeneratedMessageLite.c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l
    public final void f(Object obj) {
        n<GeneratedMessageLite.d> nVar = ((GeneratedMessageLite.c) obj).extensions;
        if (nVar.b) {
            return;
        }
        nVar.a.f();
        nVar.b = true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l
    public final Object g(Object obj) throws IOException {
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l
    public final void h(Object obj) throws IOException {
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l
    public final void i(Object obj) throws IOException {
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l
    public final void j(Map.Entry entry) throws IOException {
        ((GeneratedMessageLite.d) entry.getKey()).getClass();
        int[] iArr = a.a;
        throw null;
    }
}
