package com.google.protobuf;

import com.google.protobuf.WireFormat;
import java.io.IOException;

/* compiled from: CodedOutputStreamWriter.java */
/* loaded from: classes.dex */
public final class e implements Writer {
    public final CodedOutputStream a;

    /* compiled from: CodedOutputStreamWriter.java */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public e(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.checkNotNull(codedOutputStream, "output");
        this.a = codedOutputStream2;
        codedOutputStream2.wrapper = this;
    }

    public final void a(int i, ByteString byteString) throws IOException {
        this.a.writeBytes(i, byteString);
    }

    public final void b(int i, int i2) throws IOException {
        this.a.writeFixed32(i, i2);
    }

    public final void c(int i, long j) throws IOException {
        this.a.writeFixed64(i, j);
    }

    public final void d(int i, Object obj, v vVar) throws IOException {
        this.a.writeGroup(i, (MessageLite) obj, vVar);
    }

    public final void e(int i, int i2) throws IOException {
        this.a.writeInt32(i, i2);
    }

    public final void f(int i, long j) throws IOException {
        this.a.writeInt64(i, j);
    }

    public final void g(int i, Object obj, v vVar) throws IOException {
        this.a.writeMessage(i, (MessageLite) obj, vVar);
    }

    public final void h(int i, Object obj) throws IOException {
        boolean z = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.a;
        if (z) {
            codedOutputStream.writeRawMessageSetExtension(i, (ByteString) obj);
        } else {
            codedOutputStream.writeMessageSetExtension(i, (MessageLite) obj);
        }
    }
}
