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
public final class PinsProto$CustomPinStyle extends GeneratedMessageLite<PinsProto$CustomPinStyle, Builder> implements PinsProto$CustomPinStyleOrBuilder {
    public static final int BORDER_COLOR_FIELD_NUMBER = 4;
    private static final PinsProto$CustomPinStyle DEFAULT_INSTANCE;
    public static final int ICON_TINT_COLOR_FIELD_NUMBER = 3;
    private static volatile E<PinsProto$CustomPinStyle> PARSER = null;
    public static final int PINS_COUNT_COLOR_FIELD_NUMBER = 5;
    public static final int TEXT_COLOR_FIELD_NUMBER = 2;
    public static final int TINT_COLOR_FIELD_NUMBER = 1;
    private String tintColor_ = "";
    private String textColor_ = "";
    private String iconTintColor_ = "";
    private String borderColor_ = "";
    private String pinsCountColor_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<PinsProto$CustomPinStyle, Builder> implements PinsProto$CustomPinStyleOrBuilder {
        /* synthetic */ Builder(int i11) {
            this();
        }

        public Builder clearBorderColor() {
            copyOnWrite();
            ((PinsProto$CustomPinStyle) this.instance).clearBorderColor();
            return this;
        }

        public Builder clearIconTintColor() {
            copyOnWrite();
            ((PinsProto$CustomPinStyle) this.instance).clearIconTintColor();
            return this;
        }

        public Builder clearPinsCountColor() {
            copyOnWrite();
            ((PinsProto$CustomPinStyle) this.instance).clearPinsCountColor();
            return this;
        }

        public Builder clearTextColor() {
            copyOnWrite();
            ((PinsProto$CustomPinStyle) this.instance).clearTextColor();
            return this;
        }

        public Builder clearTintColor() {
            copyOnWrite();
            ((PinsProto$CustomPinStyle) this.instance).clearTintColor();
            return this;
        }

        @Override // ru.ozon.app.android.geo.PinsProto$CustomPinStyleOrBuilder
        public String getBorderColor() {
            return ((PinsProto$CustomPinStyle) this.instance).getBorderColor();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$CustomPinStyleOrBuilder
        public ByteString getBorderColorBytes() {
            return ((PinsProto$CustomPinStyle) this.instance).getBorderColorBytes();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$CustomPinStyleOrBuilder
        public String getIconTintColor() {
            return ((PinsProto$CustomPinStyle) this.instance).getIconTintColor();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$CustomPinStyleOrBuilder
        public ByteString getIconTintColorBytes() {
            return ((PinsProto$CustomPinStyle) this.instance).getIconTintColorBytes();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$CustomPinStyleOrBuilder
        public String getPinsCountColor() {
            return ((PinsProto$CustomPinStyle) this.instance).getPinsCountColor();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$CustomPinStyleOrBuilder
        public ByteString getPinsCountColorBytes() {
            return ((PinsProto$CustomPinStyle) this.instance).getPinsCountColorBytes();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$CustomPinStyleOrBuilder
        public String getTextColor() {
            return ((PinsProto$CustomPinStyle) this.instance).getTextColor();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$CustomPinStyleOrBuilder
        public ByteString getTextColorBytes() {
            return ((PinsProto$CustomPinStyle) this.instance).getTextColorBytes();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$CustomPinStyleOrBuilder
        public String getTintColor() {
            return ((PinsProto$CustomPinStyle) this.instance).getTintColor();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$CustomPinStyleOrBuilder
        public ByteString getTintColorBytes() {
            return ((PinsProto$CustomPinStyle) this.instance).getTintColorBytes();
        }

        public Builder setBorderColor(String str) {
            copyOnWrite();
            ((PinsProto$CustomPinStyle) this.instance).setBorderColor(str);
            return this;
        }

        public Builder setBorderColorBytes(ByteString byteString) {
            copyOnWrite();
            ((PinsProto$CustomPinStyle) this.instance).setBorderColorBytes(byteString);
            return this;
        }

        public Builder setIconTintColor(String str) {
            copyOnWrite();
            ((PinsProto$CustomPinStyle) this.instance).setIconTintColor(str);
            return this;
        }

        public Builder setIconTintColorBytes(ByteString byteString) {
            copyOnWrite();
            ((PinsProto$CustomPinStyle) this.instance).setIconTintColorBytes(byteString);
            return this;
        }

        public Builder setPinsCountColor(String str) {
            copyOnWrite();
            ((PinsProto$CustomPinStyle) this.instance).setPinsCountColor(str);
            return this;
        }

        public Builder setPinsCountColorBytes(ByteString byteString) {
            copyOnWrite();
            ((PinsProto$CustomPinStyle) this.instance).setPinsCountColorBytes(byteString);
            return this;
        }

        public Builder setTextColor(String str) {
            copyOnWrite();
            ((PinsProto$CustomPinStyle) this.instance).setTextColor(str);
            return this;
        }

        public Builder setTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((PinsProto$CustomPinStyle) this.instance).setTextColorBytes(byteString);
            return this;
        }

        public Builder setTintColor(String str) {
            copyOnWrite();
            ((PinsProto$CustomPinStyle) this.instance).setTintColor(str);
            return this;
        }

        public Builder setTintColorBytes(ByteString byteString) {
            copyOnWrite();
            ((PinsProto$CustomPinStyle) this.instance).setTintColorBytes(byteString);
            return this;
        }

        private Builder() {
            super(PinsProto$CustomPinStyle.DEFAULT_INSTANCE);
        }
    }

    static {
        PinsProto$CustomPinStyle pinsProto$CustomPinStyle = new PinsProto$CustomPinStyle();
        DEFAULT_INSTANCE = pinsProto$CustomPinStyle;
        GeneratedMessageLite.registerDefaultInstance(PinsProto$CustomPinStyle.class, pinsProto$CustomPinStyle);
    }

    private PinsProto$CustomPinStyle() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBorderColor() {
        this.borderColor_ = getDefaultInstance().getBorderColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconTintColor() {
        this.iconTintColor_ = getDefaultInstance().getIconTintColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinsCountColor() {
        this.pinsCountColor_ = getDefaultInstance().getPinsCountColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextColor() {
        this.textColor_ = getDefaultInstance().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTintColor() {
        this.tintColor_ = getDefaultInstance().getTintColor();
    }

    public static PinsProto$CustomPinStyle getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PinsProto$CustomPinStyle parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PinsProto$CustomPinStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PinsProto$CustomPinStyle parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PinsProto$CustomPinStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<PinsProto$CustomPinStyle> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBorderColor(String str) {
        str.getClass();
        this.borderColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBorderColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.borderColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconTintColor(String str) {
        str.getClass();
        this.iconTintColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconTintColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iconTintColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinsCountColor(String str) {
        str.getClass();
        this.pinsCountColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinsCountColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pinsCountColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextColor(String str) {
        str.getClass();
        this.textColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.textColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTintColor(String str) {
        str.getClass();
        this.tintColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTintColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tintColor_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        switch (PinsProto$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[bVar.ordinal()]) {
            case 1:
                return new PinsProto$CustomPinStyle();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"tintColor_", "textColor_", "iconTintColor_", "borderColor_", "pinsCountColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<PinsProto$CustomPinStyle> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (PinsProto$CustomPinStyle.class) {
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

    @Override // ru.ozon.app.android.geo.PinsProto$CustomPinStyleOrBuilder
    public String getBorderColor() {
        return this.borderColor_;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$CustomPinStyleOrBuilder
    public ByteString getBorderColorBytes() {
        return ByteString.copyFromUtf8(this.borderColor_);
    }

    @Override // ru.ozon.app.android.geo.PinsProto$CustomPinStyleOrBuilder
    public String getIconTintColor() {
        return this.iconTintColor_;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$CustomPinStyleOrBuilder
    public ByteString getIconTintColorBytes() {
        return ByteString.copyFromUtf8(this.iconTintColor_);
    }

    @Override // ru.ozon.app.android.geo.PinsProto$CustomPinStyleOrBuilder
    public String getPinsCountColor() {
        return this.pinsCountColor_;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$CustomPinStyleOrBuilder
    public ByteString getPinsCountColorBytes() {
        return ByteString.copyFromUtf8(this.pinsCountColor_);
    }

    @Override // ru.ozon.app.android.geo.PinsProto$CustomPinStyleOrBuilder
    public String getTextColor() {
        return this.textColor_;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$CustomPinStyleOrBuilder
    public ByteString getTextColorBytes() {
        return ByteString.copyFromUtf8(this.textColor_);
    }

    @Override // ru.ozon.app.android.geo.PinsProto$CustomPinStyleOrBuilder
    public String getTintColor() {
        return this.tintColor_;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$CustomPinStyleOrBuilder
    public ByteString getTintColorBytes() {
        return ByteString.copyFromUtf8(this.tintColor_);
    }

    public static Builder newBuilder(PinsProto$CustomPinStyle pinsProto$CustomPinStyle) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(pinsProto$CustomPinStyle);
    }

    public static PinsProto$CustomPinStyle parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (PinsProto$CustomPinStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static PinsProto$CustomPinStyle parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (PinsProto$CustomPinStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static PinsProto$CustomPinStyle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PinsProto$CustomPinStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PinsProto$CustomPinStyle parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (PinsProto$CustomPinStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static PinsProto$CustomPinStyle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PinsProto$CustomPinStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PinsProto$CustomPinStyle parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (PinsProto$CustomPinStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static PinsProto$CustomPinStyle parseFrom(InputStream inputStream) throws IOException {
        return (PinsProto$CustomPinStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PinsProto$CustomPinStyle parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (PinsProto$CustomPinStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static PinsProto$CustomPinStyle parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PinsProto$CustomPinStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PinsProto$CustomPinStyle parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (PinsProto$CustomPinStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
