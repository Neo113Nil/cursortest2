package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.ByteString;
import com.google.protobuf.C5957h;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.E;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$HeapObject;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class TombstoneProtos$MemoryError extends GeneratedMessageLite<TombstoneProtos$MemoryError, Builder> implements TombstoneProtos$MemoryErrorOrBuilder {
    private static final TombstoneProtos$MemoryError DEFAULT_INSTANCE;
    public static final int HEAP_FIELD_NUMBER = 3;
    private static volatile E<TombstoneProtos$MemoryError> PARSER = null;
    public static final int TOOL_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int locationCase_ = 0;
    private Object location_;
    private int tool_;
    private int type_;

    public static final class Builder extends GeneratedMessageLite.Builder<TombstoneProtos$MemoryError, Builder> implements TombstoneProtos$MemoryErrorOrBuilder {
        /* synthetic */ Builder(c cVar) {
            this();
        }

        public Builder clearHeap() {
            copyOnWrite();
            ((TombstoneProtos$MemoryError) this.instance).clearHeap();
            return this;
        }

        public Builder clearLocation() {
            copyOnWrite();
            ((TombstoneProtos$MemoryError) this.instance).clearLocation();
            return this;
        }

        public Builder clearTool() {
            copyOnWrite();
            ((TombstoneProtos$MemoryError) this.instance).clearTool();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((TombstoneProtos$MemoryError) this.instance).clearType();
            return this;
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryErrorOrBuilder
        public TombstoneProtos$HeapObject getHeap() {
            return ((TombstoneProtos$MemoryError) this.instance).getHeap();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryErrorOrBuilder
        public a getLocationCase() {
            return ((TombstoneProtos$MemoryError) this.instance).getLocationCase();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryErrorOrBuilder
        public Tool getTool() {
            return ((TombstoneProtos$MemoryError) this.instance).getTool();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryErrorOrBuilder
        public int getToolValue() {
            return ((TombstoneProtos$MemoryError) this.instance).getToolValue();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryErrorOrBuilder
        public Type getType() {
            return ((TombstoneProtos$MemoryError) this.instance).getType();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryErrorOrBuilder
        public int getTypeValue() {
            return ((TombstoneProtos$MemoryError) this.instance).getTypeValue();
        }

        @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryErrorOrBuilder
        public boolean hasHeap() {
            return ((TombstoneProtos$MemoryError) this.instance).hasHeap();
        }

        public Builder mergeHeap(TombstoneProtos$HeapObject tombstoneProtos$HeapObject) {
            copyOnWrite();
            ((TombstoneProtos$MemoryError) this.instance).mergeHeap(tombstoneProtos$HeapObject);
            return this;
        }

        public Builder setHeap(TombstoneProtos$HeapObject tombstoneProtos$HeapObject) {
            copyOnWrite();
            ((TombstoneProtos$MemoryError) this.instance).setHeap(tombstoneProtos$HeapObject);
            return this;
        }

        public Builder setTool(Tool tool) {
            copyOnWrite();
            ((TombstoneProtos$MemoryError) this.instance).setTool(tool);
            return this;
        }

        public Builder setToolValue(int i11) {
            copyOnWrite();
            ((TombstoneProtos$MemoryError) this.instance).setToolValue(i11);
            return this;
        }

        public Builder setType(Type type) {
            copyOnWrite();
            ((TombstoneProtos$MemoryError) this.instance).setType(type);
            return this;
        }

        public Builder setTypeValue(int i11) {
            copyOnWrite();
            ((TombstoneProtos$MemoryError) this.instance).setTypeValue(i11);
            return this;
        }

        private Builder() {
            super(TombstoneProtos$MemoryError.DEFAULT_INSTANCE);
        }

        public Builder setHeap(TombstoneProtos$HeapObject.Builder builder) {
            copyOnWrite();
            ((TombstoneProtos$MemoryError) this.instance).setHeap(builder.build());
            return this;
        }
    }

    public enum Tool implements Internal.a {
        GWP_ASAN(0),
        SCUDO(1),
        UNRECOGNIZED(-1);

        public static final int GWP_ASAN_VALUE = 0;
        public static final int SCUDO_VALUE = 1;
        private static final Internal.b<Tool> internalValueMap = new Internal.b<Tool>() { // from class: io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryError.Tool.1
            @Override // com.google.protobuf.Internal.b
            public Tool findValueByNumber(int i11) {
                return Tool.forNumber(i11);
            }
        };
        private final int value;

        private static final class ToolVerifier implements Internal.c {
            static final Internal.c INSTANCE = new ToolVerifier();

            private ToolVerifier() {
            }

            @Override // com.google.protobuf.Internal.c
            public boolean isInRange(int i11) {
                return Tool.forNumber(i11) != null;
            }
        }

        Tool(int i11) {
            this.value = i11;
        }

        public static Tool forNumber(int i11) {
            if (i11 == 0) {
                return GWP_ASAN;
            }
            if (i11 != 1) {
                return null;
            }
            return SCUDO;
        }

        public static Internal.b<Tool> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.c internalGetVerifier() {
            return ToolVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.a
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static Tool valueOf(int i11) {
            return forNumber(i11);
        }
    }

    public enum Type implements Internal.a {
        UNKNOWN(0),
        USE_AFTER_FREE(1),
        DOUBLE_FREE(2),
        INVALID_FREE(3),
        BUFFER_OVERFLOW(4),
        BUFFER_UNDERFLOW(5),
        UNRECOGNIZED(-1);

        public static final int BUFFER_OVERFLOW_VALUE = 4;
        public static final int BUFFER_UNDERFLOW_VALUE = 5;
        public static final int DOUBLE_FREE_VALUE = 2;
        public static final int INVALID_FREE_VALUE = 3;
        public static final int UNKNOWN_VALUE = 0;
        public static final int USE_AFTER_FREE_VALUE = 1;
        private static final Internal.b<Type> internalValueMap = new Internal.b<Type>() { // from class: io.sentry.android.core.internal.tombstone.TombstoneProtos.MemoryError.Type.1
            @Override // com.google.protobuf.Internal.b
            public Type findValueByNumber(int i11) {
                return Type.forNumber(i11);
            }
        };
        private final int value;

        private static final class TypeVerifier implements Internal.c {
            static final Internal.c INSTANCE = new TypeVerifier();

            private TypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.c
            public boolean isInRange(int i11) {
                return Type.forNumber(i11) != null;
            }
        }

        Type(int i11) {
            this.value = i11;
        }

        public static Type forNumber(int i11) {
            if (i11 == 0) {
                return UNKNOWN;
            }
            if (i11 == 1) {
                return USE_AFTER_FREE;
            }
            if (i11 == 2) {
                return DOUBLE_FREE;
            }
            if (i11 == 3) {
                return INVALID_FREE;
            }
            if (i11 == 4) {
                return BUFFER_OVERFLOW;
            }
            if (i11 != 5) {
                return null;
            }
            return BUFFER_UNDERFLOW;
        }

        public static Internal.b<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.c internalGetVerifier() {
            return TypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.a
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static Type valueOf(int i11) {
            return forNumber(i11);
        }
    }

    public enum a {
        HEAP(3),
        LOCATION_NOT_SET(0);

        private final int value;

        a(int i11) {
            this.value = i11;
        }

        public static a forNumber(int i11) {
            if (i11 == 0) {
                return LOCATION_NOT_SET;
            }
            if (i11 != 3) {
                return null;
            }
            return HEAP;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static a valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        TombstoneProtos$MemoryError tombstoneProtos$MemoryError = new TombstoneProtos$MemoryError();
        DEFAULT_INSTANCE = tombstoneProtos$MemoryError;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$MemoryError.class, tombstoneProtos$MemoryError);
    }

    private TombstoneProtos$MemoryError() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeap() {
        if (this.locationCase_ == 3) {
            this.locationCase_ = 0;
            this.location_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.locationCase_ = 0;
        this.location_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTool() {
        this.tool_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static TombstoneProtos$MemoryError getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHeap(TombstoneProtos$HeapObject tombstoneProtos$HeapObject) {
        tombstoneProtos$HeapObject.getClass();
        if (this.locationCase_ != 3 || this.location_ == TombstoneProtos$HeapObject.getDefaultInstance()) {
            this.location_ = tombstoneProtos$HeapObject;
        } else {
            this.location_ = TombstoneProtos$HeapObject.newBuilder((TombstoneProtos$HeapObject) this.location_).mergeFrom((TombstoneProtos$HeapObject.Builder) tombstoneProtos$HeapObject).buildPartial();
        }
        this.locationCase_ = 3;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$MemoryError parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$MemoryError parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<TombstoneProtos$MemoryError> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeap(TombstoneProtos$HeapObject tombstoneProtos$HeapObject) {
        tombstoneProtos$HeapObject.getClass();
        this.location_ = tombstoneProtos$HeapObject;
        this.locationCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTool(Tool tool) {
        this.tool_ = tool.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToolValue(int i11) {
        this.tool_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(Type type) {
        this.type_ = type.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i11) {
        this.type_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        c cVar = null;
        switch (c.f67174a[bVar.ordinal()]) {
            case 1:
                return new TombstoneProtos$MemoryError();
            case 2:
                return new Builder(cVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003<\u0000", new Object[]{"location_", "locationCase_", "tool_", "type_", TombstoneProtos$HeapObject.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<TombstoneProtos$MemoryError> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (TombstoneProtos$MemoryError.class) {
                    try {
                        e11 = PARSER;
                        if (e11 == null) {
                            e11 = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = e11;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return e11;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryErrorOrBuilder
    public TombstoneProtos$HeapObject getHeap() {
        return this.locationCase_ == 3 ? (TombstoneProtos$HeapObject) this.location_ : TombstoneProtos$HeapObject.getDefaultInstance();
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryErrorOrBuilder
    public a getLocationCase() {
        return a.forNumber(this.locationCase_);
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryErrorOrBuilder
    public Tool getTool() {
        Tool forNumber = Tool.forNumber(this.tool_);
        return forNumber == null ? Tool.UNRECOGNIZED : forNumber;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryErrorOrBuilder
    public int getToolValue() {
        return this.tool_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryErrorOrBuilder
    public Type getType() {
        Type forNumber = Type.forNumber(this.type_);
        return forNumber == null ? Type.UNRECOGNIZED : forNumber;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryErrorOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryErrorOrBuilder
    public boolean hasHeap() {
        return this.locationCase_ == 3;
    }

    public static Builder newBuilder(TombstoneProtos$MemoryError tombstoneProtos$MemoryError) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$MemoryError);
    }

    public static TombstoneProtos$MemoryError parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$MemoryError parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static TombstoneProtos$MemoryError parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$MemoryError parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static TombstoneProtos$MemoryError parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$MemoryError parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static TombstoneProtos$MemoryError parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$MemoryError parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static TombstoneProtos$MemoryError parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$MemoryError parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
