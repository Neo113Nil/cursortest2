package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;
import defpackage.q6b;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class LifecycleEventRequestOuterClass {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface LifecycleEventRequestOrBuilder extends MessageLiteOrBuilder {
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        ByteString getEventId();

        LifecycleEventType getLifecycleEventType();

        int getLifecycleEventTypeValue();

        StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        boolean hasDynamicDeviceInfo();

        boolean hasStaticDeviceInfo();
    }

    private LifecycleEventRequestOuterClass() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class LifecycleEventRequest extends GeneratedMessageLite<LifecycleEventRequest, Builder> implements LifecycleEventRequestOrBuilder {
        private static final LifecycleEventRequest DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 2;
        public static final int EVENT_ID_FIELD_NUMBER = 4;
        public static final int LIFECYCLE_EVENT_TYPE_FIELD_NUMBER = 3;
        private static volatile Parser<LifecycleEventRequest> PARSER = null;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 1;
        private int bitField0_;
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private ByteString eventId_ = ByteString.EMPTY;
        private int lifecycleEventType_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;

        static {
            LifecycleEventRequest lifecycleEventRequest = new LifecycleEventRequest();
            DEFAULT_INSTANCE = lifecycleEventRequest;
            GeneratedMessageLite.registerDefaultInstance(LifecycleEventRequest.class, lifecycleEventRequest);
        }

        private LifecycleEventRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventId() {
            this.eventId_ = getDefaultInstance().getEventId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLifecycleEventType() {
            this.lifecycleEventType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -2;
        }

        public static LifecycleEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = this.dynamicDeviceInfo_;
            if (dynamicDeviceInfo2 == null || dynamicDeviceInfo2 == DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance()) {
                this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            } else {
                this.dynamicDeviceInfo_ = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom((DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder) dynamicDeviceInfo).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = this.staticDeviceInfo_;
            if (staticDeviceInfo2 == null || staticDeviceInfo2 == StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance()) {
                this.staticDeviceInfo_ = staticDeviceInfo;
            } else {
                this.staticDeviceInfo_ = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom((StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder) staticDeviceInfo).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static LifecycleEventRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LifecycleEventRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<LifecycleEventRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventId(ByteString byteString) {
            byteString.getClass();
            this.eventId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLifecycleEventType(LifecycleEventType lifecycleEventType) {
            this.lifecycleEventType_ = lifecycleEventType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLifecycleEventTypeValue(int i) {
            this.lifecycleEventType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i = q6b.a[methodToInvoke.ordinal()];
            q6b q6bVar = null;
            switch (i) {
                case 1:
                    return new LifecycleEventRequest();
                case 2:
                    return new Builder(q6bVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f\u0004\n", new Object[]{"bitField0_", "staticDeviceInfo_", "dynamicDeviceInfo_", "lifecycleEventType_", "eventId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<LifecycleEventRequest> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (LifecycleEventRequest.class) {
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

        @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
        public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.dynamicDeviceInfo_;
            return dynamicDeviceInfo == null ? DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance() : dynamicDeviceInfo;
        }

        @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
        public ByteString getEventId() {
            return this.eventId_;
        }

        @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
        public LifecycleEventType getLifecycleEventType() {
            LifecycleEventType forNumber = LifecycleEventType.forNumber(this.lifecycleEventType_);
            return forNumber == null ? LifecycleEventType.UNRECOGNIZED : forNumber;
        }

        @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
        public int getLifecycleEventTypeValue() {
            return this.lifecycleEventType_;
        }

        @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
        public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo_;
            return staticDeviceInfo == null ? StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance() : staticDeviceInfo;
        }

        @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
        public boolean hasDynamicDeviceInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
        public boolean hasStaticDeviceInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class Builder extends GeneratedMessageLite.Builder<LifecycleEventRequest, Builder> implements LifecycleEventRequestOrBuilder {
            private Builder() {
                super(LifecycleEventRequest.DEFAULT_INSTANCE);
            }

            public Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).clearDynamicDeviceInfo();
                return this;
            }

            public Builder clearEventId() {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).clearEventId();
                return this;
            }

            public Builder clearLifecycleEventType() {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).clearLifecycleEventType();
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).clearStaticDeviceInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
            public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((LifecycleEventRequest) this.instance).getDynamicDeviceInfo();
            }

            @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
            public ByteString getEventId() {
                return ((LifecycleEventRequest) this.instance).getEventId();
            }

            @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
            public LifecycleEventType getLifecycleEventType() {
                return ((LifecycleEventRequest) this.instance).getLifecycleEventType();
            }

            @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
            public int getLifecycleEventTypeValue() {
                return ((LifecycleEventRequest) this.instance).getLifecycleEventTypeValue();
            }

            @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
            public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((LifecycleEventRequest) this.instance).getStaticDeviceInfo();
            }

            @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
            public boolean hasDynamicDeviceInfo() {
                return ((LifecycleEventRequest) this.instance).hasDynamicDeviceInfo();
            }

            @Override // gatewayprotocol.v1.LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder
            public boolean hasStaticDeviceInfo() {
                return ((LifecycleEventRequest) this.instance).hasStaticDeviceInfo();
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).mergeStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).setDynamicDeviceInfo(builder.build());
                return this;
            }

            public Builder setEventId(ByteString byteString) {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).setEventId(byteString);
                return this;
            }

            public Builder setLifecycleEventType(LifecycleEventType lifecycleEventType) {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).setLifecycleEventType(lifecycleEventType);
                return this;
            }

            public Builder setLifecycleEventTypeValue(int i) {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).setLifecycleEventTypeValue(i);
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).setStaticDeviceInfo(builder.build());
                return this;
            }

            public /* synthetic */ Builder(q6b q6bVar) {
                this();
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).setDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((LifecycleEventRequest) this.instance).setStaticDeviceInfo(staticDeviceInfo);
                return this;
            }
        }

        public static Builder newBuilder(LifecycleEventRequest lifecycleEventRequest) {
            return DEFAULT_INSTANCE.createBuilder(lifecycleEventRequest);
        }

        public static LifecycleEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LifecycleEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static LifecycleEventRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static LifecycleEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static LifecycleEventRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LifecycleEventRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static LifecycleEventRequest parseFrom(InputStream inputStream) throws IOException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LifecycleEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LifecycleEventRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static LifecycleEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LifecycleEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum LifecycleEventType implements Internal.EnumLite {
        LIFECYCLE_EVENT_TYPE_UNSPECIFIED(0),
        LIFECYCLE_EVENT_TYPE_BACKGROUND(1),
        LIFECYCLE_EVENT_TYPE_FOREGROUND(2),
        UNRECOGNIZED(-1);

        public static final int LIFECYCLE_EVENT_TYPE_BACKGROUND_VALUE = 1;
        public static final int LIFECYCLE_EVENT_TYPE_FOREGROUND_VALUE = 2;
        public static final int LIFECYCLE_EVENT_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<LifecycleEventType> internalValueMap = new l0();
        private final int value;

        LifecycleEventType(int i) {
            this.value = i;
        }

        public static LifecycleEventType forNumber(int i) {
            if (i == 0) {
                return LIFECYCLE_EVENT_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return LIFECYCLE_EVENT_TYPE_BACKGROUND;
            }
            if (i != 2) {
                return null;
            }
            return LIFECYCLE_EVENT_TYPE_FOREGROUND;
        }

        public static Internal.EnumLiteMap<LifecycleEventType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return m0.a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            a70.p("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static LifecycleEventType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
