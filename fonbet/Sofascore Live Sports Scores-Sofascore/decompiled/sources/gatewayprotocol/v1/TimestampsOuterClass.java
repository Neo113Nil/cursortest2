package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import defpackage.a70;
import defpackage.ejj;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class TimestampsOuterClass {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface TimestampsOrBuilder extends MessageLiteOrBuilder {
        long getSessionDurationInForeground();

        long getSessionTimestamp();

        Timestamp getTimestamp();

        boolean hasTimestamp();
    }

    private TimestampsOuterClass() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Timestamps extends GeneratedMessageLite<Timestamps, Builder> implements TimestampsOrBuilder {
        private static final Timestamps DEFAULT_INSTANCE;
        private static volatile Parser<Timestamps> PARSER = null;
        public static final int SESSION_DURATION_IN_FOREGROUND_FIELD_NUMBER = 3;
        public static final int SESSION_TIMESTAMP_FIELD_NUMBER = 2;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private int bitField0_;
        private long sessionDurationInForeground_;
        private long sessionTimestamp_;
        private Timestamp timestamp_;

        static {
            Timestamps timestamps = new Timestamps();
            DEFAULT_INSTANCE = timestamps;
            GeneratedMessageLite.registerDefaultInstance(Timestamps.class, timestamps);
        }

        private Timestamps() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionDurationInForeground() {
            this.sessionDurationInForeground_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionTimestamp() {
            this.sessionTimestamp_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = null;
            this.bitField0_ &= -2;
        }

        public static Timestamps getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.timestamp_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.timestamp_ = timestamp;
            } else {
                this.timestamp_ = Timestamp.newBuilder(this.timestamp_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Timestamps parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Timestamps) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Timestamps parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Timestamps> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionDurationInForeground(long j) {
            this.sessionDurationInForeground_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionTimestamp(long j) {
            this.sessionTimestamp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            this.timestamp_ = timestamp;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i = ejj.a[methodToInvoke.ordinal()];
            ejj ejjVar = null;
            switch (i) {
                case 1:
                    return new Timestamps();
                case 2:
                    return new Builder(ejjVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0002\u0003\u0002", new Object[]{"bitField0_", "timestamp_", "sessionTimestamp_", "sessionDurationInForeground_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Timestamps> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (Timestamps.class) {
                        try {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                default:
                    a70.i();
                case 7:
                    return null;
            }
        }

        @Override // gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder
        public long getSessionDurationInForeground() {
            return this.sessionDurationInForeground_;
        }

        @Override // gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder
        public long getSessionTimestamp() {
            return this.sessionTimestamp_;
        }

        @Override // gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder
        public Timestamp getTimestamp() {
            Timestamp timestamp = this.timestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder
        public boolean hasTimestamp() {
            return (this.bitField0_ & 1) != 0;
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class Builder extends GeneratedMessageLite.Builder<Timestamps, Builder> implements TimestampsOrBuilder {
            private Builder() {
                super(Timestamps.DEFAULT_INSTANCE);
            }

            public Builder clearSessionDurationInForeground() {
                copyOnWrite();
                ((Timestamps) this.instance).clearSessionDurationInForeground();
                return this;
            }

            public Builder clearSessionTimestamp() {
                copyOnWrite();
                ((Timestamps) this.instance).clearSessionTimestamp();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((Timestamps) this.instance).clearTimestamp();
                return this;
            }

            @Override // gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder
            public long getSessionDurationInForeground() {
                return ((Timestamps) this.instance).getSessionDurationInForeground();
            }

            @Override // gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder
            public long getSessionTimestamp() {
                return ((Timestamps) this.instance).getSessionTimestamp();
            }

            @Override // gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder
            public Timestamp getTimestamp() {
                return ((Timestamps) this.instance).getTimestamp();
            }

            @Override // gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder
            public boolean hasTimestamp() {
                return ((Timestamps) this.instance).hasTimestamp();
            }

            public Builder mergeTimestamp(Timestamp timestamp) {
                copyOnWrite();
                ((Timestamps) this.instance).mergeTimestamp(timestamp);
                return this;
            }

            public Builder setSessionDurationInForeground(long j) {
                copyOnWrite();
                ((Timestamps) this.instance).setSessionDurationInForeground(j);
                return this;
            }

            public Builder setSessionTimestamp(long j) {
                copyOnWrite();
                ((Timestamps) this.instance).setSessionTimestamp(j);
                return this;
            }

            public Builder setTimestamp(Timestamp.Builder builder) {
                copyOnWrite();
                ((Timestamps) this.instance).setTimestamp(builder.build());
                return this;
            }

            public /* synthetic */ Builder(ejj ejjVar) {
                this();
            }

            public Builder setTimestamp(Timestamp timestamp) {
                copyOnWrite();
                ((Timestamps) this.instance).setTimestamp(timestamp);
                return this;
            }
        }

        public static Builder newBuilder(Timestamps timestamps) {
            return DEFAULT_INSTANCE.createBuilder(timestamps);
        }

        public static Timestamps parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Timestamps) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Timestamps parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Timestamps parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Timestamps parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Timestamps parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Timestamps parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Timestamps parseFrom(InputStream inputStream) throws IOException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Timestamps parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Timestamps parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Timestamps parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
