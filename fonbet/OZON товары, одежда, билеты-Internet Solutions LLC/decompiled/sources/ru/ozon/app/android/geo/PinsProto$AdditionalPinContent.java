package ru.ozon.app.android.geo;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.C5957h;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.E;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class PinsProto$AdditionalPinContent extends GeneratedMessageLite<PinsProto$AdditionalPinContent, Builder> implements PinsProto$AdditionalPinContentOrBuilder {
    private static final PinsProto$AdditionalPinContent DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 2;
    private static volatile E<PinsProto$AdditionalPinContent> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private String text_ = "";
    private String icon_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<PinsProto$AdditionalPinContent, Builder> implements PinsProto$AdditionalPinContentOrBuilder {
        /* synthetic */ Builder(int i11) {
            this();
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((PinsProto$AdditionalPinContent) this.instance).clearIcon();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((PinsProto$AdditionalPinContent) this.instance).clearText();
            return this;
        }

        @Override // ru.ozon.app.android.geo.PinsProto$AdditionalPinContentOrBuilder
        public String getIcon() {
            return ((PinsProto$AdditionalPinContent) this.instance).getIcon();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$AdditionalPinContentOrBuilder
        public ByteString getIconBytes() {
            return ((PinsProto$AdditionalPinContent) this.instance).getIconBytes();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$AdditionalPinContentOrBuilder
        public String getText() {
            return ((PinsProto$AdditionalPinContent) this.instance).getText();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$AdditionalPinContentOrBuilder
        public ByteString getTextBytes() {
            return ((PinsProto$AdditionalPinContent) this.instance).getTextBytes();
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((PinsProto$AdditionalPinContent) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((PinsProto$AdditionalPinContent) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((PinsProto$AdditionalPinContent) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((PinsProto$AdditionalPinContent) this.instance).setTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(PinsProto$AdditionalPinContent.DEFAULT_INSTANCE);
        }
    }

    static {
        PinsProto$AdditionalPinContent pinsProto$AdditionalPinContent = new PinsProto$AdditionalPinContent();
        DEFAULT_INSTANCE = pinsProto$AdditionalPinContent;
        GeneratedMessageLite.registerDefaultInstance(PinsProto$AdditionalPinContent.class, pinsProto$AdditionalPinContent);
    }

    private PinsProto$AdditionalPinContent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public static PinsProto$AdditionalPinContent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PinsProto$AdditionalPinContent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PinsProto$AdditionalPinContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PinsProto$AdditionalPinContent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PinsProto$AdditionalPinContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<PinsProto$AdditionalPinContent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        switch (PinsProto$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[bVar.ordinal()]) {
            case 1:
                return new PinsProto$AdditionalPinContent();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"text_", "icon_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<PinsProto$AdditionalPinContent> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (PinsProto$AdditionalPinContent.class) {
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
            default:
                throw null;
        }
    }

    @Override // ru.ozon.app.android.geo.PinsProto$AdditionalPinContentOrBuilder
    public String getIcon() {
        return this.icon_;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$AdditionalPinContentOrBuilder
    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    @Override // ru.ozon.app.android.geo.PinsProto$AdditionalPinContentOrBuilder
    public String getText() {
        return this.text_;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$AdditionalPinContentOrBuilder
    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public static Builder newBuilder(PinsProto$AdditionalPinContent pinsProto$AdditionalPinContent) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(pinsProto$AdditionalPinContent);
    }

    public static PinsProto$AdditionalPinContent parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (PinsProto$AdditionalPinContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static PinsProto$AdditionalPinContent parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (PinsProto$AdditionalPinContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static PinsProto$AdditionalPinContent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PinsProto$AdditionalPinContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PinsProto$AdditionalPinContent parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (PinsProto$AdditionalPinContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static PinsProto$AdditionalPinContent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PinsProto$AdditionalPinContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PinsProto$AdditionalPinContent parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (PinsProto$AdditionalPinContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static PinsProto$AdditionalPinContent parseFrom(InputStream inputStream) throws IOException {
        return (PinsProto$AdditionalPinContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PinsProto$AdditionalPinContent parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (PinsProto$AdditionalPinContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static PinsProto$AdditionalPinContent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PinsProto$AdditionalPinContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PinsProto$AdditionalPinContent parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (PinsProto$AdditionalPinContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
