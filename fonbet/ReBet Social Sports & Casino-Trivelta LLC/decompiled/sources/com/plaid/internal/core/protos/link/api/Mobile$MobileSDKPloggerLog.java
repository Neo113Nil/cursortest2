package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
public final class Mobile$MobileSDKPloggerLog extends GeneratedMessageLite<Mobile$MobileSDKPloggerLog, a> implements MessageLiteOrBuilder {
    private static final Mobile$MobileSDKPloggerLog DEFAULT_INSTANCE;
    public static final int LOG_LEVEL_FIELD_NUMBER = 1;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    public static final int MOBILE_SDK_SESSION_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 4;
    private static volatile Parser<Mobile$MobileSDKPloggerLog> PARSER;
    private int bitField0_;
    private int logLevel_;
    private MobileSDKSession mobileSdkSession_;
    private MapFieldLite<String, String> params_ = MapFieldLite.emptyMapField();
    private String message_ = "";

    public static final class MobileSDKSession extends GeneratedMessageLite<MobileSDKSession, a> implements MessageLiteOrBuilder {
        public static final int CLIENT_TYPE_FIELD_NUMBER = 5;
        private static final MobileSDKSession DEFAULT_INSTANCE;
        public static final int LINK_OPEN_ID_FIELD_NUMBER = 1;
        public static final int LINK_PERSISTENT_ID_FIELD_NUMBER = 3;
        public static final int LINK_SESSION_ID_FIELD_NUMBER = 2;
        public static final int LINK_TOKEN_FIELD_NUMBER = 4;
        private static volatile Parser<MobileSDKSession> PARSER;
        private int clientType_;
        private String linkOpenId_ = "";
        private String linkSessionId_ = "";
        private String linkPersistentId_ = "";
        private String linkToken_ = "";

        public enum b implements Internal.EnumLite {
            CLIENT_TYPE_UNKNOWN(0),
            CLIENT_TYPE_ANDROID(1),
            CLIENT_TYPE_IOS(2),
            CLIENT_TYPE_WEB(3),
            CLIENT_TYPE_REACTNATIVEANDROID(4),
            CLIENT_TYPE_REACTNATIVEIOS(5),
            CLIENT_TYPE_LINK_WEB_SDK(6),
            CLIENT_TYPE_FLUTTERIOS(7),
            CLIENT_TYPE_FLUTTERANDROID(8),
            CLIENT_TYPE_HOSTED_LINK(9),
            UNRECOGNIZED(-1);

            public static final int CLIENT_TYPE_ANDROID_VALUE = 1;
            public static final int CLIENT_TYPE_FLUTTERANDROID_VALUE = 8;
            public static final int CLIENT_TYPE_FLUTTERIOS_VALUE = 7;
            public static final int CLIENT_TYPE_HOSTED_LINK_VALUE = 9;
            public static final int CLIENT_TYPE_IOS_VALUE = 2;
            public static final int CLIENT_TYPE_LINK_WEB_SDK_VALUE = 6;
            public static final int CLIENT_TYPE_REACTNATIVEANDROID_VALUE = 4;
            public static final int CLIENT_TYPE_REACTNATIVEIOS_VALUE = 5;
            public static final int CLIENT_TYPE_UNKNOWN_VALUE = 0;
            public static final int CLIENT_TYPE_WEB_VALUE = 3;

            /* renamed from: b, reason: collision with root package name */
            public static final a f39945b = new a();

            /* renamed from: a, reason: collision with root package name */
            public final int f39947a;

            public class a implements Internal.EnumLiteMap<b> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final b findValueByNumber(int i10) {
                    return b.forNumber(i10);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog$MobileSDKSession$b$b, reason: collision with other inner class name */
            public static final class C0557b implements Internal.EnumVerifier {

                /* renamed from: a, reason: collision with root package name */
                public static final C0557b f39948a = new C0557b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i10) {
                    return b.forNumber(i10) != null;
                }
            }

            b(int i10) {
                this.f39947a = i10;
            }

            public static b forNumber(int i10) {
                switch (i10) {
                    case 0:
                        return CLIENT_TYPE_UNKNOWN;
                    case 1:
                        return CLIENT_TYPE_ANDROID;
                    case 2:
                        return CLIENT_TYPE_IOS;
                    case 3:
                        return CLIENT_TYPE_WEB;
                    case 4:
                        return CLIENT_TYPE_REACTNATIVEANDROID;
                    case 5:
                        return CLIENT_TYPE_REACTNATIVEIOS;
                    case 6:
                        return CLIENT_TYPE_LINK_WEB_SDK;
                    case 7:
                        return CLIENT_TYPE_FLUTTERIOS;
                    case 8:
                        return CLIENT_TYPE_FLUTTERANDROID;
                    case 9:
                        return CLIENT_TYPE_HOSTED_LINK;
                    default:
                        return null;
                }
            }

            public static Internal.EnumLiteMap<b> internalGetValueMap() {
                return f39945b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return C0557b.f39948a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f39947a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static b valueOf(int i10) {
                return forNumber(i10);
            }
        }

        static {
            MobileSDKSession mobileSDKSession = new MobileSDKSession();
            DEFAULT_INSTANCE = mobileSDKSession;
            GeneratedMessageLite.registerDefaultInstance(MobileSDKSession.class, mobileSDKSession);
        }

        private MobileSDKSession() {
        }

        private void clearClientType() {
            this.clientType_ = 0;
        }

        private void clearLinkOpenId() {
            this.linkOpenId_ = getDefaultInstance().getLinkOpenId();
        }

        private void clearLinkPersistentId() {
            this.linkPersistentId_ = getDefaultInstance().getLinkPersistentId();
        }

        private void clearLinkSessionId() {
            this.linkSessionId_ = getDefaultInstance().getLinkSessionId();
        }

        private void clearLinkToken() {
            this.linkToken_ = getDefaultInstance().getLinkToken();
        }

        public static MobileSDKSession getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static MobileSDKSession parseDelimitedFrom(InputStream inputStream) {
            return (MobileSDKSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MobileSDKSession parseFrom(ByteBuffer byteBuffer) {
            return (MobileSDKSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<MobileSDKSession> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientType(b bVar) {
            this.clientType_ = bVar.getNumber();
        }

        private void setClientTypeValue(int i10) {
            this.clientType_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinkOpenId(String str) {
            str.getClass();
            this.linkOpenId_ = str;
        }

        private void setLinkOpenIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.linkOpenId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinkPersistentId(String str) {
            str.getClass();
            this.linkPersistentId_ = str;
        }

        private void setLinkPersistentIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.linkPersistentId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinkSessionId(String str) {
            str.getClass();
            this.linkSessionId_ = str;
        }

        private void setLinkSessionIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.linkSessionId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinkToken(String str) {
            str.getClass();
            this.linkToken_ = str;
        }

        private void setLinkTokenBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.linkToken_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            switch (d.f39993a[methodToInvoke.ordinal()]) {
                case 1:
                    return new MobileSDKSession();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\f", new Object[]{"linkOpenId_", "linkSessionId_", "linkPersistentId_", "linkToken_", "clientType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MobileSDKSession> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (MobileSDKSession.class) {
                        try {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public b getClientType() {
            b forNumber = b.forNumber(this.clientType_);
            return forNumber == null ? b.UNRECOGNIZED : forNumber;
        }

        public int getClientTypeValue() {
            return this.clientType_;
        }

        public String getLinkOpenId() {
            return this.linkOpenId_;
        }

        public ByteString getLinkOpenIdBytes() {
            return ByteString.copyFromUtf8(this.linkOpenId_);
        }

        public String getLinkPersistentId() {
            return this.linkPersistentId_;
        }

        public ByteString getLinkPersistentIdBytes() {
            return ByteString.copyFromUtf8(this.linkPersistentId_);
        }

        public String getLinkSessionId() {
            return this.linkSessionId_;
        }

        public ByteString getLinkSessionIdBytes() {
            return ByteString.copyFromUtf8(this.linkSessionId_);
        }

        public String getLinkToken() {
            return this.linkToken_;
        }

        public ByteString getLinkTokenBytes() {
            return ByteString.copyFromUtf8(this.linkToken_);
        }

        public static final class a extends GeneratedMessageLite.Builder<MobileSDKSession, a> implements MessageLiteOrBuilder {
            public a() {
                super(MobileSDKSession.DEFAULT_INSTANCE);
            }

            public final void a(String str) {
                copyOnWrite();
                ((MobileSDKSession) this.instance).setLinkOpenId(str);
            }

            public final void b(String str) {
                copyOnWrite();
                ((MobileSDKSession) this.instance).setLinkPersistentId(str);
            }

            public final void c(String str) {
                copyOnWrite();
                ((MobileSDKSession) this.instance).setLinkSessionId(str);
            }

            public final void d(String str) {
                copyOnWrite();
                ((MobileSDKSession) this.instance).setLinkToken(str);
            }

            public final void a(b bVar) {
                copyOnWrite();
                ((MobileSDKSession) this.instance).setClientType(bVar);
            }
        }

        public static a newBuilder(MobileSDKSession mobileSDKSession) {
            return DEFAULT_INSTANCE.createBuilder(mobileSDKSession);
        }

        public static MobileSDKSession parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MobileSDKSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MobileSDKSession parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MobileSDKSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MobileSDKSession parseFrom(ByteString byteString) {
            return (MobileSDKSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MobileSDKSession parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MobileSDKSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MobileSDKSession parseFrom(byte[] bArr) {
            return (MobileSDKSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MobileSDKSession parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MobileSDKSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MobileSDKSession parseFrom(InputStream inputStream) {
            return (MobileSDKSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MobileSDKSession parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MobileSDKSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MobileSDKSession parseFrom(CodedInputStream codedInputStream) {
            return (MobileSDKSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MobileSDKSession parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MobileSDKSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public enum b implements Internal.EnumLite {
        MOBILE_SDK_LOG_LEVEL_UNKNOWN(0),
        MOBILE_SDK_LOG_LEVEL_DEBUG(1),
        MOBILE_SDK_LOG_LEVEL_INFO(2),
        MOBILE_SDK_LOG_LEVEL_WARN(3),
        MOBILE_SDK_LOG_LEVEL_ERROR(4),
        UNRECOGNIZED(-1);

        public static final int MOBILE_SDK_LOG_LEVEL_DEBUG_VALUE = 1;
        public static final int MOBILE_SDK_LOG_LEVEL_ERROR_VALUE = 4;
        public static final int MOBILE_SDK_LOG_LEVEL_INFO_VALUE = 2;
        public static final int MOBILE_SDK_LOG_LEVEL_UNKNOWN_VALUE = 0;
        public static final int MOBILE_SDK_LOG_LEVEL_WARN_VALUE = 3;

        /* renamed from: b, reason: collision with root package name */
        public static final a f39949b = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f39951a;

        public class a implements Internal.EnumLiteMap<b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final b findValueByNumber(int i10) {
                return b.forNumber(i10);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog$b$b, reason: collision with other inner class name */
        public static final class C0558b implements Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final C0558b f39952a = new C0558b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i10) {
                return b.forNumber(i10) != null;
            }
        }

        b(int i10) {
            this.f39951a = i10;
        }

        public static b forNumber(int i10) {
            if (i10 == 0) {
                return MOBILE_SDK_LOG_LEVEL_UNKNOWN;
            }
            if (i10 == 1) {
                return MOBILE_SDK_LOG_LEVEL_DEBUG;
            }
            if (i10 == 2) {
                return MOBILE_SDK_LOG_LEVEL_INFO;
            }
            if (i10 == 3) {
                return MOBILE_SDK_LOG_LEVEL_WARN;
            }
            if (i10 != 4) {
                return null;
            }
            return MOBILE_SDK_LOG_LEVEL_ERROR;
        }

        public static Internal.EnumLiteMap<b> internalGetValueMap() {
            return f39949b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C0558b.f39952a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f39951a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static b valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final MapEntryLite<String, String> f39953a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f39953a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    static {
        Mobile$MobileSDKPloggerLog mobile$MobileSDKPloggerLog = new Mobile$MobileSDKPloggerLog();
        DEFAULT_INSTANCE = mobile$MobileSDKPloggerLog;
        GeneratedMessageLite.registerDefaultInstance(Mobile$MobileSDKPloggerLog.class, mobile$MobileSDKPloggerLog);
    }

    private Mobile$MobileSDKPloggerLog() {
    }

    private void clearLogLevel() {
        this.logLevel_ = 0;
    }

    private void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    private void clearMobileSdkSession() {
        this.mobileSdkSession_ = null;
        this.bitField0_ &= -2;
    }

    public static Mobile$MobileSDKPloggerLog getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableParamsMap() {
        return internalGetMutableParams();
    }

    private MapFieldLite<String, String> internalGetMutableParams() {
        if (!this.params_.isMutable()) {
            this.params_ = this.params_.mutableCopy();
        }
        return this.params_;
    }

    private MapFieldLite<String, String> internalGetParams() {
        return this.params_;
    }

    private void mergeMobileSdkSession(MobileSDKSession mobileSDKSession) {
        mobileSDKSession.getClass();
        MobileSDKSession mobileSDKSession2 = this.mobileSdkSession_;
        if (mobileSDKSession2 == null || mobileSDKSession2 == MobileSDKSession.getDefaultInstance()) {
            this.mobileSdkSession_ = mobileSDKSession;
        } else {
            this.mobileSdkSession_ = MobileSDKSession.newBuilder(this.mobileSdkSession_).mergeFrom((MobileSDKSession.a) mobileSDKSession).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Mobile$MobileSDKPloggerLog parseDelimitedFrom(InputStream inputStream) {
        return (Mobile$MobileSDKPloggerLog) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Mobile$MobileSDKPloggerLog parseFrom(ByteBuffer byteBuffer) {
        return (Mobile$MobileSDKPloggerLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Mobile$MobileSDKPloggerLog> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogLevel(b bVar) {
        this.logLevel_ = bVar.getNumber();
    }

    private void setLogLevelValue(int i10) {
        this.logLevel_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    private void setMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.message_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileSdkSession(MobileSDKSession mobileSDKSession) {
        mobileSDKSession.getClass();
        this.mobileSdkSession_ = mobileSDKSession;
        this.bitField0_ |= 1;
    }

    public boolean containsParams(String str) {
        str.getClass();
        return internalGetParams().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (d.f39993a[methodToInvoke.ordinal()]) {
            case 1:
                return new Mobile$MobileSDKPloggerLog();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001\f\u0002Ȉ\u0003ဉ\u0000\u00042", new Object[]{"bitField0_", "logLevel_", "message_", "mobileSdkSession_", "params_", c.f39953a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Mobile$MobileSDKPloggerLog> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Mobile$MobileSDKPloggerLog.class) {
                    try {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public b getLogLevel() {
        b forNumber = b.forNumber(this.logLevel_);
        return forNumber == null ? b.UNRECOGNIZED : forNumber;
    }

    public int getLogLevelValue() {
        return this.logLevel_;
    }

    public String getMessage() {
        return this.message_;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.message_);
    }

    public MobileSDKSession getMobileSdkSession() {
        MobileSDKSession mobileSDKSession = this.mobileSdkSession_;
        return mobileSDKSession == null ? MobileSDKSession.getDefaultInstance() : mobileSDKSession;
    }

    @Deprecated
    public Map<String, String> getParams() {
        return getParamsMap();
    }

    public int getParamsCount() {
        return internalGetParams().size();
    }

    public Map<String, String> getParamsMap() {
        return Collections.unmodifiableMap(internalGetParams());
    }

    public String getParamsOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetParams = internalGetParams();
        return internalGetParams.containsKey(str) ? internalGetParams.get(str) : str2;
    }

    public String getParamsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetParams = internalGetParams();
        if (internalGetParams.containsKey(str)) {
            return internalGetParams.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean hasMobileSdkSession() {
        return (this.bitField0_ & 1) != 0;
    }

    public static final class a extends GeneratedMessageLite.Builder<Mobile$MobileSDKPloggerLog, a> implements MessageLiteOrBuilder {
        public a() {
            super(Mobile$MobileSDKPloggerLog.DEFAULT_INSTANCE);
        }

        public final a a(b bVar) {
            copyOnWrite();
            ((Mobile$MobileSDKPloggerLog) this.instance).setLogLevel(bVar);
            return this;
        }

        public final a a(String str) {
            copyOnWrite();
            ((Mobile$MobileSDKPloggerLog) this.instance).setMessage(str);
            return this;
        }

        public final a a(MobileSDKSession mobileSDKSession) {
            copyOnWrite();
            ((Mobile$MobileSDKPloggerLog) this.instance).setMobileSdkSession(mobileSDKSession);
            return this;
        }

        public final a a(Map<String, String> map) {
            copyOnWrite();
            ((Mobile$MobileSDKPloggerLog) this.instance).getMutableParamsMap().putAll(map);
            return this;
        }
    }

    public static a newBuilder(Mobile$MobileSDKPloggerLog mobile$MobileSDKPloggerLog) {
        return DEFAULT_INSTANCE.createBuilder(mobile$MobileSDKPloggerLog);
    }

    public static Mobile$MobileSDKPloggerLog parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Mobile$MobileSDKPloggerLog) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Mobile$MobileSDKPloggerLog parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Mobile$MobileSDKPloggerLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Mobile$MobileSDKPloggerLog parseFrom(ByteString byteString) {
        return (Mobile$MobileSDKPloggerLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Mobile$MobileSDKPloggerLog parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Mobile$MobileSDKPloggerLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Mobile$MobileSDKPloggerLog parseFrom(byte[] bArr) {
        return (Mobile$MobileSDKPloggerLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Mobile$MobileSDKPloggerLog parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Mobile$MobileSDKPloggerLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Mobile$MobileSDKPloggerLog parseFrom(InputStream inputStream) {
        return (Mobile$MobileSDKPloggerLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Mobile$MobileSDKPloggerLog parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Mobile$MobileSDKPloggerLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Mobile$MobileSDKPloggerLog parseFrom(CodedInputStream codedInputStream) {
        return (Mobile$MobileSDKPloggerLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Mobile$MobileSDKPloggerLog parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Mobile$MobileSDKPloggerLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
