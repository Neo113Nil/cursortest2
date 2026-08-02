package ru.ozon.app.android.geo;

import com.google.protobuf.BoolValue;
import com.google.protobuf.ByteString;
import com.google.protobuf.C5957h;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.E;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UInt64Value;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import ru.ozon.app.android.geo.PinsProto$Coordinates;

/* loaded from: classes12.dex */
public final class PinsProto$Pin extends GeneratedMessageLite<PinsProto$Pin, Builder> implements PinsProto$PinOrBuilder {
    public static final int ADDITIONAL_CONTENT_KEY_FIELD_NUMBER = 6;
    public static final int COORDINATES_FIELD_NUMBER = 2;
    private static final PinsProto$Pin DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_CLICK_ENABLED_FIELD_NUMBER = 5;
    private static volatile E<PinsProto$Pin> PARSER = null;
    public static final int PINS_COUNT_FIELD_NUMBER = 9;
    public static final int PIN_IMAGE_KEY_FIELD_NUMBER = 8;
    public static final int PIN_STYLE_KEY_FIELD_NUMBER = 7;
    public static final int PROVIDER_ID_FIELD_NUMBER = 4;
    public static final int Z_PRIORITY_FIELD_NUMBER = 3;
    private int additionalContentKey_;
    private int bitField0_;
    private PinsProto$Coordinates coordinates_;
    private UInt64Value id_;
    private BoolValue isClickEnabled_;
    private int pinImageKey_;
    private int pinStyleKey_;
    private int pinsCount_;
    private int providerId_;
    private Int32Value zPriority_;

    public static final class Builder extends GeneratedMessageLite.Builder<PinsProto$Pin, Builder> implements PinsProto$PinOrBuilder {
        /* synthetic */ Builder(int i11) {
            this();
        }

        public Builder clearAdditionalContentKey() {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).clearAdditionalContentKey();
            return this;
        }

        public Builder clearCoordinates() {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).clearCoordinates();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).clearId();
            return this;
        }

        public Builder clearIsClickEnabled() {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).clearIsClickEnabled();
            return this;
        }

        public Builder clearPinImageKey() {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).clearPinImageKey();
            return this;
        }

        public Builder clearPinStyleKey() {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).clearPinStyleKey();
            return this;
        }

        public Builder clearPinsCount() {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).clearPinsCount();
            return this;
        }

        public Builder clearProviderId() {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).clearProviderId();
            return this;
        }

        public Builder clearZPriority() {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).clearZPriority();
            return this;
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
        public int getAdditionalContentKey() {
            return ((PinsProto$Pin) this.instance).getAdditionalContentKey();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
        public PinsProto$Coordinates getCoordinates() {
            return ((PinsProto$Pin) this.instance).getCoordinates();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
        public UInt64Value getId() {
            return ((PinsProto$Pin) this.instance).getId();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
        public BoolValue getIsClickEnabled() {
            return ((PinsProto$Pin) this.instance).getIsClickEnabled();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
        public int getPinImageKey() {
            return ((PinsProto$Pin) this.instance).getPinImageKey();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
        public int getPinStyleKey() {
            return ((PinsProto$Pin) this.instance).getPinStyleKey();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
        public int getPinsCount() {
            return ((PinsProto$Pin) this.instance).getPinsCount();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
        public int getProviderId() {
            return ((PinsProto$Pin) this.instance).getProviderId();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
        public Int32Value getZPriority() {
            return ((PinsProto$Pin) this.instance).getZPriority();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
        public boolean hasCoordinates() {
            return ((PinsProto$Pin) this.instance).hasCoordinates();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
        public boolean hasId() {
            return ((PinsProto$Pin) this.instance).hasId();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
        public boolean hasIsClickEnabled() {
            return ((PinsProto$Pin) this.instance).hasIsClickEnabled();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
        public boolean hasZPriority() {
            return ((PinsProto$Pin) this.instance).hasZPriority();
        }

        public Builder mergeCoordinates(PinsProto$Coordinates pinsProto$Coordinates) {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).mergeCoordinates(pinsProto$Coordinates);
            return this;
        }

        public Builder mergeId(UInt64Value uInt64Value) {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).mergeId(uInt64Value);
            return this;
        }

        public Builder mergeIsClickEnabled(BoolValue boolValue) {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).mergeIsClickEnabled(boolValue);
            return this;
        }

        public Builder mergeZPriority(Int32Value int32Value) {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).mergeZPriority(int32Value);
            return this;
        }

        public Builder setAdditionalContentKey(int i11) {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).setAdditionalContentKey(i11);
            return this;
        }

        public Builder setCoordinates(PinsProto$Coordinates pinsProto$Coordinates) {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).setCoordinates(pinsProto$Coordinates);
            return this;
        }

        public Builder setId(UInt64Value uInt64Value) {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).setId(uInt64Value);
            return this;
        }

        public Builder setIsClickEnabled(BoolValue boolValue) {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).setIsClickEnabled(boolValue);
            return this;
        }

        public Builder setPinImageKey(int i11) {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).setPinImageKey(i11);
            return this;
        }

        public Builder setPinStyleKey(int i11) {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).setPinStyleKey(i11);
            return this;
        }

        public Builder setPinsCount(int i11) {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).setPinsCount(i11);
            return this;
        }

        public Builder setProviderId(int i11) {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).setProviderId(i11);
            return this;
        }

        public Builder setZPriority(Int32Value int32Value) {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).setZPriority(int32Value);
            return this;
        }

        private Builder() {
            super(PinsProto$Pin.DEFAULT_INSTANCE);
        }

        public Builder setCoordinates(PinsProto$Coordinates.Builder builder) {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).setCoordinates(builder.build());
            return this;
        }

        public Builder setId(UInt64Value.Builder builder) {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).setId(builder.build());
            return this;
        }

        public Builder setIsClickEnabled(BoolValue.Builder builder) {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).setIsClickEnabled(builder.build());
            return this;
        }

        public Builder setZPriority(Int32Value.Builder builder) {
            copyOnWrite();
            ((PinsProto$Pin) this.instance).setZPriority(builder.build());
            return this;
        }
    }

    static {
        PinsProto$Pin pinsProto$Pin = new PinsProto$Pin();
        DEFAULT_INSTANCE = pinsProto$Pin;
        GeneratedMessageLite.registerDefaultInstance(PinsProto$Pin.class, pinsProto$Pin);
    }

    private PinsProto$Pin() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdditionalContentKey() {
        this.additionalContentKey_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinates() {
        this.coordinates_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsClickEnabled() {
        this.isClickEnabled_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinImageKey() {
        this.pinImageKey_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinStyleKey() {
        this.pinStyleKey_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinsCount() {
        this.pinsCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProviderId() {
        this.providerId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZPriority() {
        this.zPriority_ = null;
        this.bitField0_ &= -5;
    }

    public static PinsProto$Pin getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoordinates(PinsProto$Coordinates pinsProto$Coordinates) {
        pinsProto$Coordinates.getClass();
        PinsProto$Coordinates pinsProto$Coordinates2 = this.coordinates_;
        if (pinsProto$Coordinates2 == null || pinsProto$Coordinates2 == PinsProto$Coordinates.getDefaultInstance()) {
            this.coordinates_ = pinsProto$Coordinates;
        } else {
            this.coordinates_ = PinsProto$Coordinates.newBuilder(this.coordinates_).mergeFrom((PinsProto$Coordinates.Builder) pinsProto$Coordinates).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeId(UInt64Value uInt64Value) {
        uInt64Value.getClass();
        UInt64Value uInt64Value2 = this.id_;
        if (uInt64Value2 == null || uInt64Value2 == UInt64Value.getDefaultInstance()) {
            this.id_ = uInt64Value;
        } else {
            this.id_ = UInt64Value.newBuilder(this.id_).mergeFrom((UInt64Value.Builder) uInt64Value).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIsClickEnabled(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.isClickEnabled_;
        if (boolValue2 == null || boolValue2 == BoolValue.getDefaultInstance()) {
            this.isClickEnabled_ = boolValue;
        } else {
            this.isClickEnabled_ = BoolValue.newBuilder(this.isClickEnabled_).mergeFrom((BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeZPriority(Int32Value int32Value) {
        int32Value.getClass();
        Int32Value int32Value2 = this.zPriority_;
        if (int32Value2 == null || int32Value2 == Int32Value.getDefaultInstance()) {
            this.zPriority_ = int32Value;
        } else {
            this.zPriority_ = Int32Value.newBuilder(this.zPriority_).mergeFrom((Int32Value.Builder) int32Value).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PinsProto$Pin parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PinsProto$Pin) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PinsProto$Pin parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PinsProto$Pin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<PinsProto$Pin> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdditionalContentKey(int i11) {
        this.additionalContentKey_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinates(PinsProto$Coordinates pinsProto$Coordinates) {
        pinsProto$Coordinates.getClass();
        this.coordinates_ = pinsProto$Coordinates;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(UInt64Value uInt64Value) {
        uInt64Value.getClass();
        this.id_ = uInt64Value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsClickEnabled(BoolValue boolValue) {
        boolValue.getClass();
        this.isClickEnabled_ = boolValue;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinImageKey(int i11) {
        this.pinImageKey_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinStyleKey(int i11) {
        this.pinStyleKey_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinsCount(int i11) {
        this.pinsCount_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderId(int i11) {
        this.providerId_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZPriority(Int32Value int32Value) {
        int32Value.getClass();
        this.zPriority_ = int32Value;
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        switch (PinsProto$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[bVar.ordinal()]) {
            case 1:
                return new PinsProto$Pin();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u000b\u0005ဉ\u0003\u0006\u000b\u0007\u000b\b\u000b\t\u000b", new Object[]{"bitField0_", "id_", "coordinates_", "zPriority_", "providerId_", "isClickEnabled_", "additionalContentKey_", "pinStyleKey_", "pinImageKey_", "pinsCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<PinsProto$Pin> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (PinsProto$Pin.class) {
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

    @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
    public int getAdditionalContentKey() {
        return this.additionalContentKey_;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
    public PinsProto$Coordinates getCoordinates() {
        PinsProto$Coordinates pinsProto$Coordinates = this.coordinates_;
        return pinsProto$Coordinates == null ? PinsProto$Coordinates.getDefaultInstance() : pinsProto$Coordinates;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
    public UInt64Value getId() {
        UInt64Value uInt64Value = this.id_;
        return uInt64Value == null ? UInt64Value.getDefaultInstance() : uInt64Value;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
    public BoolValue getIsClickEnabled() {
        BoolValue boolValue = this.isClickEnabled_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
    public int getPinImageKey() {
        return this.pinImageKey_;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
    public int getPinStyleKey() {
        return this.pinStyleKey_;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
    public int getPinsCount() {
        return this.pinsCount_;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
    public int getProviderId() {
        return this.providerId_;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
    public Int32Value getZPriority() {
        Int32Value int32Value = this.zPriority_;
        return int32Value == null ? Int32Value.getDefaultInstance() : int32Value;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
    public boolean hasCoordinates() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
    public boolean hasIsClickEnabled() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinOrBuilder
    public boolean hasZPriority() {
        return (this.bitField0_ & 4) != 0;
    }

    public static Builder newBuilder(PinsProto$Pin pinsProto$Pin) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(pinsProto$Pin);
    }

    public static PinsProto$Pin parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (PinsProto$Pin) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static PinsProto$Pin parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (PinsProto$Pin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static PinsProto$Pin parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PinsProto$Pin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PinsProto$Pin parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (PinsProto$Pin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static PinsProto$Pin parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PinsProto$Pin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PinsProto$Pin parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (PinsProto$Pin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static PinsProto$Pin parseFrom(InputStream inputStream) throws IOException {
        return (PinsProto$Pin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PinsProto$Pin parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (PinsProto$Pin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static PinsProto$Pin parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PinsProto$Pin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PinsProto$Pin parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (PinsProto$Pin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
