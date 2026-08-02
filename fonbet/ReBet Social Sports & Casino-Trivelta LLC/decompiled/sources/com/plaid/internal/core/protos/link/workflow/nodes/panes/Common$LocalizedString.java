package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class Common$LocalizedString extends GeneratedMessageLite<Common$LocalizedString, a> implements C {
    private static final Common$LocalizedString DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile Parser<Common$LocalizedString> PARSER = null;
    public static final int TEMPLATED_KEY_FIELD_NUMBER = 3;
    public static final int TRANSLATION_FIELD_NUMBER = 2;
    private int keyOrTranslationCase_ = 0;
    private Object keyOrTranslation_;

    public static final class a extends GeneratedMessageLite.Builder<Common$LocalizedString, a> implements C {
        public a() {
            super(Common$LocalizedString.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        KEY(1),
        TRANSLATION(2),
        TEMPLATED_KEY(3),
        KEYORTRANSLATION_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f40092a;

        b(int i10) {
            this.f40092a = i10;
        }

        public static b forNumber(int i10) {
            if (i10 == 0) {
                return KEYORTRANSLATION_NOT_SET;
            }
            if (i10 == 1) {
                return KEY;
            }
            if (i10 == 2) {
                return TRANSLATION;
            }
            if (i10 != 3) {
                return null;
            }
            return TEMPLATED_KEY;
        }

        public int getNumber() {
            return this.f40092a;
        }

        @Deprecated
        public static b valueOf(int i10) {
            return forNumber(i10);
        }
    }

    static {
        Common$LocalizedString common$LocalizedString = new Common$LocalizedString();
        DEFAULT_INSTANCE = common$LocalizedString;
        GeneratedMessageLite.registerDefaultInstance(Common$LocalizedString.class, common$LocalizedString);
    }

    private Common$LocalizedString() {
    }

    private void clearKey() {
        if (this.keyOrTranslationCase_ == 1) {
            this.keyOrTranslationCase_ = 0;
            this.keyOrTranslation_ = null;
        }
    }

    private void clearKeyOrTranslation() {
        this.keyOrTranslationCase_ = 0;
        this.keyOrTranslation_ = null;
    }

    private void clearTemplatedKey() {
        if (this.keyOrTranslationCase_ == 3) {
            this.keyOrTranslationCase_ = 0;
            this.keyOrTranslation_ = null;
        }
    }

    private void clearTranslation() {
        if (this.keyOrTranslationCase_ == 2) {
            this.keyOrTranslationCase_ = 0;
            this.keyOrTranslation_ = null;
        }
    }

    public static Common$LocalizedString getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeTemplatedKey(Common$TemplatedKey common$TemplatedKey) {
        common$TemplatedKey.getClass();
        if (this.keyOrTranslationCase_ != 3 || this.keyOrTranslation_ == Common$TemplatedKey.getDefaultInstance()) {
            this.keyOrTranslation_ = common$TemplatedKey;
        } else {
            this.keyOrTranslation_ = Common$TemplatedKey.newBuilder((Common$TemplatedKey) this.keyOrTranslation_).mergeFrom((Common$TemplatedKey.a) common$TemplatedKey).buildPartial();
        }
        this.keyOrTranslationCase_ = 3;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$LocalizedString parseDelimitedFrom(InputStream inputStream) {
        return (Common$LocalizedString) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$LocalizedString parseFrom(ByteBuffer byteBuffer) {
        return (Common$LocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$LocalizedString> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setKey(String str) {
        str.getClass();
        this.keyOrTranslationCase_ = 1;
        this.keyOrTranslation_ = str;
    }

    private void setKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.keyOrTranslation_ = byteString.toStringUtf8();
        this.keyOrTranslationCase_ = 1;
    }

    private void setTemplatedKey(Common$TemplatedKey common$TemplatedKey) {
        common$TemplatedKey.getClass();
        this.keyOrTranslation_ = common$TemplatedKey;
        this.keyOrTranslationCase_ = 3;
    }

    private void setTranslation(String str) {
        str.getClass();
        this.keyOrTranslationCase_ = 2;
        this.keyOrTranslation_ = str;
    }

    private void setTranslationBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.keyOrTranslation_ = byteString.toStringUtf8();
        this.keyOrTranslationCase_ = 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (C3588j.f40405a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$LocalizedString();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003<\u0000", new Object[]{"keyOrTranslation_", "keyOrTranslationCase_", Common$TemplatedKey.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$LocalizedString> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Common$LocalizedString.class) {
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

    public String getKey() {
        return this.keyOrTranslationCase_ == 1 ? (String) this.keyOrTranslation_ : "";
    }

    public ByteString getKeyBytes() {
        return ByteString.copyFromUtf8(this.keyOrTranslationCase_ == 1 ? (String) this.keyOrTranslation_ : "");
    }

    public b getKeyOrTranslationCase() {
        return b.forNumber(this.keyOrTranslationCase_);
    }

    public Common$TemplatedKey getTemplatedKey() {
        return this.keyOrTranslationCase_ == 3 ? (Common$TemplatedKey) this.keyOrTranslation_ : Common$TemplatedKey.getDefaultInstance();
    }

    public String getTranslation() {
        return this.keyOrTranslationCase_ == 2 ? (String) this.keyOrTranslation_ : "";
    }

    public ByteString getTranslationBytes() {
        return ByteString.copyFromUtf8(this.keyOrTranslationCase_ == 2 ? (String) this.keyOrTranslation_ : "");
    }

    public boolean hasKey() {
        return this.keyOrTranslationCase_ == 1;
    }

    public boolean hasTemplatedKey() {
        return this.keyOrTranslationCase_ == 3;
    }

    public boolean hasTranslation() {
        return this.keyOrTranslationCase_ == 2;
    }

    public static a newBuilder(Common$LocalizedString common$LocalizedString) {
        return DEFAULT_INSTANCE.createBuilder(common$LocalizedString);
    }

    public static Common$LocalizedString parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalizedString) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$LocalizedString parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$LocalizedString parseFrom(ByteString byteString) {
        return (Common$LocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$LocalizedString parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$LocalizedString parseFrom(byte[] bArr) {
        return (Common$LocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$LocalizedString parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$LocalizedString parseFrom(InputStream inputStream) {
        return (Common$LocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$LocalizedString parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$LocalizedString parseFrom(CodedInputStream codedInputStream) {
        return (Common$LocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$LocalizedString parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$LocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
