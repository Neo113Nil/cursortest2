package ru.ozon.app.android.geo;

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
public final class PinsProto$Coordinates extends GeneratedMessageLite<PinsProto$Coordinates, Builder> implements PinsProto$CoordinatesOrBuilder {
    private static final PinsProto$Coordinates DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile E<PinsProto$Coordinates> PARSER;
    private double latitude_;
    private double longitude_;

    public static final class Builder extends GeneratedMessageLite.Builder<PinsProto$Coordinates, Builder> implements PinsProto$CoordinatesOrBuilder {
        /* synthetic */ Builder(int i11) {
            this();
        }

        public Builder clearLatitude() {
            copyOnWrite();
            ((PinsProto$Coordinates) this.instance).clearLatitude();
            return this;
        }

        public Builder clearLongitude() {
            copyOnWrite();
            ((PinsProto$Coordinates) this.instance).clearLongitude();
            return this;
        }

        @Override // ru.ozon.app.android.geo.PinsProto$CoordinatesOrBuilder
        public double getLatitude() {
            return ((PinsProto$Coordinates) this.instance).getLatitude();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$CoordinatesOrBuilder
        public double getLongitude() {
            return ((PinsProto$Coordinates) this.instance).getLongitude();
        }

        public Builder setLatitude(double d11) {
            copyOnWrite();
            ((PinsProto$Coordinates) this.instance).setLatitude(d11);
            return this;
        }

        public Builder setLongitude(double d11) {
            copyOnWrite();
            ((PinsProto$Coordinates) this.instance).setLongitude(d11);
            return this;
        }

        private Builder() {
            super(PinsProto$Coordinates.DEFAULT_INSTANCE);
        }
    }

    static {
        PinsProto$Coordinates pinsProto$Coordinates = new PinsProto$Coordinates();
        DEFAULT_INSTANCE = pinsProto$Coordinates;
        GeneratedMessageLite.registerDefaultInstance(PinsProto$Coordinates.class, pinsProto$Coordinates);
    }

    private PinsProto$Coordinates() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitude() {
        this.latitude_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongitude() {
        this.longitude_ = 0.0d;
    }

    public static PinsProto$Coordinates getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PinsProto$Coordinates parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PinsProto$Coordinates) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PinsProto$Coordinates parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PinsProto$Coordinates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<PinsProto$Coordinates> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitude(double d11) {
        this.latitude_ = d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongitude(double d11) {
        this.longitude_ = d11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        switch (PinsProto$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[bVar.ordinal()]) {
            case 1:
                return new PinsProto$Coordinates();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<PinsProto$Coordinates> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (PinsProto$Coordinates.class) {
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

    @Override // ru.ozon.app.android.geo.PinsProto$CoordinatesOrBuilder
    public double getLatitude() {
        return this.latitude_;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$CoordinatesOrBuilder
    public double getLongitude() {
        return this.longitude_;
    }

    public static Builder newBuilder(PinsProto$Coordinates pinsProto$Coordinates) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(pinsProto$Coordinates);
    }

    public static PinsProto$Coordinates parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (PinsProto$Coordinates) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static PinsProto$Coordinates parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (PinsProto$Coordinates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static PinsProto$Coordinates parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PinsProto$Coordinates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PinsProto$Coordinates parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (PinsProto$Coordinates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static PinsProto$Coordinates parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PinsProto$Coordinates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PinsProto$Coordinates parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (PinsProto$Coordinates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static PinsProto$Coordinates parseFrom(InputStream inputStream) throws IOException {
        return (PinsProto$Coordinates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PinsProto$Coordinates parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (PinsProto$Coordinates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static PinsProto$Coordinates parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PinsProto$Coordinates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PinsProto$Coordinates parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (PinsProto$Coordinates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
