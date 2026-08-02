package ru.ozon.app.android.geo;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.C5957h;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.E;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.u;
import com.google.protobuf.v;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ru.ozon.app.android.geo.PinsProto$Pin;

/* loaded from: classes12.dex */
public final class PinsProto$Pins extends GeneratedMessageLite<PinsProto$Pins, Builder> implements PinsProto$PinsOrBuilder {
    public static final int CUSTOM_PIN_STYLES_FIELD_NUMBER = 3;
    public static final int CUSTOM_TEXT_CONTENT_FIELD_NUMBER = 5;
    private static final PinsProto$Pins DEFAULT_INSTANCE;
    public static final int IMAGES_FIELD_NUMBER = 4;
    private static volatile E<PinsProto$Pins> PARSER = null;
    public static final int PINS_FIELD_NUMBER = 1;
    public static final int STYLE_TYPE_FIELD_NUMBER = 2;
    private int styleType_;
    private v<Integer, PinsProto$CustomPinStyle> customPinStyles_ = v.e();
    private v<Integer, String> images_ = v.e();
    private v<Integer, PinsProto$AdditionalPinContent> customTextContent_ = v.e();
    private Internal.e<PinsProto$Pin> pins_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<PinsProto$Pins, Builder> implements PinsProto$PinsOrBuilder {
        /* synthetic */ Builder(int i11) {
            this();
        }

        public Builder addAllPins(Iterable<? extends PinsProto$Pin> iterable) {
            copyOnWrite();
            ((PinsProto$Pins) this.instance).addAllPins(iterable);
            return this;
        }

        public Builder addPins(PinsProto$Pin pinsProto$Pin) {
            copyOnWrite();
            ((PinsProto$Pins) this.instance).addPins(pinsProto$Pin);
            return this;
        }

        public Builder clearCustomPinStyles() {
            copyOnWrite();
            ((PinsProto$Pins) this.instance).getMutableCustomPinStylesMap().clear();
            return this;
        }

        public Builder clearCustomTextContent() {
            copyOnWrite();
            ((PinsProto$Pins) this.instance).getMutableCustomTextContentMap().clear();
            return this;
        }

        public Builder clearImages() {
            copyOnWrite();
            ((PinsProto$Pins) this.instance).getMutableImagesMap().clear();
            return this;
        }

        public Builder clearPins() {
            copyOnWrite();
            ((PinsProto$Pins) this.instance).clearPins();
            return this;
        }

        public Builder clearStyleType() {
            copyOnWrite();
            ((PinsProto$Pins) this.instance).clearStyleType();
            return this;
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        public boolean containsCustomPinStyles(int i11) {
            return ((PinsProto$Pins) this.instance).getCustomPinStylesMap().containsKey(Integer.valueOf(i11));
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        public boolean containsCustomTextContent(int i11) {
            return ((PinsProto$Pins) this.instance).getCustomTextContentMap().containsKey(Integer.valueOf(i11));
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        public boolean containsImages(int i11) {
            return ((PinsProto$Pins) this.instance).getImagesMap().containsKey(Integer.valueOf(i11));
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        @Deprecated
        public Map<Integer, PinsProto$CustomPinStyle> getCustomPinStyles() {
            return getCustomPinStylesMap();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        public int getCustomPinStylesCount() {
            return ((PinsProto$Pins) this.instance).getCustomPinStylesMap().size();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        public Map<Integer, PinsProto$CustomPinStyle> getCustomPinStylesMap() {
            return Collections.unmodifiableMap(((PinsProto$Pins) this.instance).getCustomPinStylesMap());
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        public PinsProto$CustomPinStyle getCustomPinStylesOrDefault(int i11, PinsProto$CustomPinStyle pinsProto$CustomPinStyle) {
            Map<Integer, PinsProto$CustomPinStyle> customPinStylesMap = ((PinsProto$Pins) this.instance).getCustomPinStylesMap();
            return customPinStylesMap.containsKey(Integer.valueOf(i11)) ? customPinStylesMap.get(Integer.valueOf(i11)) : pinsProto$CustomPinStyle;
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        public PinsProto$CustomPinStyle getCustomPinStylesOrThrow(int i11) {
            Map<Integer, PinsProto$CustomPinStyle> customPinStylesMap = ((PinsProto$Pins) this.instance).getCustomPinStylesMap();
            if (customPinStylesMap.containsKey(Integer.valueOf(i11))) {
                return customPinStylesMap.get(Integer.valueOf(i11));
            }
            throw new IllegalArgumentException();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        @Deprecated
        public Map<Integer, PinsProto$AdditionalPinContent> getCustomTextContent() {
            return getCustomTextContentMap();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        public int getCustomTextContentCount() {
            return ((PinsProto$Pins) this.instance).getCustomTextContentMap().size();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        public Map<Integer, PinsProto$AdditionalPinContent> getCustomTextContentMap() {
            return Collections.unmodifiableMap(((PinsProto$Pins) this.instance).getCustomTextContentMap());
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        public PinsProto$AdditionalPinContent getCustomTextContentOrDefault(int i11, PinsProto$AdditionalPinContent pinsProto$AdditionalPinContent) {
            Map<Integer, PinsProto$AdditionalPinContent> customTextContentMap = ((PinsProto$Pins) this.instance).getCustomTextContentMap();
            return customTextContentMap.containsKey(Integer.valueOf(i11)) ? customTextContentMap.get(Integer.valueOf(i11)) : pinsProto$AdditionalPinContent;
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        public PinsProto$AdditionalPinContent getCustomTextContentOrThrow(int i11) {
            Map<Integer, PinsProto$AdditionalPinContent> customTextContentMap = ((PinsProto$Pins) this.instance).getCustomTextContentMap();
            if (customTextContentMap.containsKey(Integer.valueOf(i11))) {
                return customTextContentMap.get(Integer.valueOf(i11));
            }
            throw new IllegalArgumentException();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        @Deprecated
        public Map<Integer, String> getImages() {
            return getImagesMap();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        public int getImagesCount() {
            return ((PinsProto$Pins) this.instance).getImagesMap().size();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        public Map<Integer, String> getImagesMap() {
            return Collections.unmodifiableMap(((PinsProto$Pins) this.instance).getImagesMap());
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        public String getImagesOrDefault(int i11, String str) {
            Map<Integer, String> imagesMap = ((PinsProto$Pins) this.instance).getImagesMap();
            return imagesMap.containsKey(Integer.valueOf(i11)) ? imagesMap.get(Integer.valueOf(i11)) : str;
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        public String getImagesOrThrow(int i11) {
            Map<Integer, String> imagesMap = ((PinsProto$Pins) this.instance).getImagesMap();
            if (imagesMap.containsKey(Integer.valueOf(i11))) {
                return imagesMap.get(Integer.valueOf(i11));
            }
            throw new IllegalArgumentException();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        public PinsProto$Pin getPins(int i11) {
            return ((PinsProto$Pins) this.instance).getPins(i11);
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        public int getPinsCount() {
            return ((PinsProto$Pins) this.instance).getPinsCount();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        public List<PinsProto$Pin> getPinsList() {
            return Collections.unmodifiableList(((PinsProto$Pins) this.instance).getPinsList());
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        public PinsProto$PinStyleType getStyleType() {
            return ((PinsProto$Pins) this.instance).getStyleType();
        }

        @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
        public int getStyleTypeValue() {
            return ((PinsProto$Pins) this.instance).getStyleTypeValue();
        }

        public Builder putAllCustomPinStyles(Map<Integer, PinsProto$CustomPinStyle> map) {
            copyOnWrite();
            ((PinsProto$Pins) this.instance).getMutableCustomPinStylesMap().putAll(map);
            return this;
        }

        public Builder putAllCustomTextContent(Map<Integer, PinsProto$AdditionalPinContent> map) {
            copyOnWrite();
            ((PinsProto$Pins) this.instance).getMutableCustomTextContentMap().putAll(map);
            return this;
        }

        public Builder putAllImages(Map<Integer, String> map) {
            copyOnWrite();
            ((PinsProto$Pins) this.instance).getMutableImagesMap().putAll(map);
            return this;
        }

        public Builder putCustomPinStyles(int i11, PinsProto$CustomPinStyle pinsProto$CustomPinStyle) {
            pinsProto$CustomPinStyle.getClass();
            copyOnWrite();
            ((PinsProto$Pins) this.instance).getMutableCustomPinStylesMap().put(Integer.valueOf(i11), pinsProto$CustomPinStyle);
            return this;
        }

        public Builder putCustomTextContent(int i11, PinsProto$AdditionalPinContent pinsProto$AdditionalPinContent) {
            pinsProto$AdditionalPinContent.getClass();
            copyOnWrite();
            ((PinsProto$Pins) this.instance).getMutableCustomTextContentMap().put(Integer.valueOf(i11), pinsProto$AdditionalPinContent);
            return this;
        }

        public Builder putImages(int i11, String str) {
            str.getClass();
            copyOnWrite();
            ((PinsProto$Pins) this.instance).getMutableImagesMap().put(Integer.valueOf(i11), str);
            return this;
        }

        public Builder removeCustomPinStyles(int i11) {
            copyOnWrite();
            ((PinsProto$Pins) this.instance).getMutableCustomPinStylesMap().remove(Integer.valueOf(i11));
            return this;
        }

        public Builder removeCustomTextContent(int i11) {
            copyOnWrite();
            ((PinsProto$Pins) this.instance).getMutableCustomTextContentMap().remove(Integer.valueOf(i11));
            return this;
        }

        public Builder removeImages(int i11) {
            copyOnWrite();
            ((PinsProto$Pins) this.instance).getMutableImagesMap().remove(Integer.valueOf(i11));
            return this;
        }

        public Builder removePins(int i11) {
            copyOnWrite();
            ((PinsProto$Pins) this.instance).removePins(i11);
            return this;
        }

        public Builder setPins(int i11, PinsProto$Pin pinsProto$Pin) {
            copyOnWrite();
            ((PinsProto$Pins) this.instance).setPins(i11, pinsProto$Pin);
            return this;
        }

        public Builder setStyleType(PinsProto$PinStyleType pinsProto$PinStyleType) {
            copyOnWrite();
            ((PinsProto$Pins) this.instance).setStyleType(pinsProto$PinStyleType);
            return this;
        }

        public Builder setStyleTypeValue(int i11) {
            copyOnWrite();
            ((PinsProto$Pins) this.instance).setStyleTypeValue(i11);
            return this;
        }

        private Builder() {
            super(PinsProto$Pins.DEFAULT_INSTANCE);
        }

        public Builder addPins(int i11, PinsProto$Pin pinsProto$Pin) {
            copyOnWrite();
            ((PinsProto$Pins) this.instance).addPins(i11, pinsProto$Pin);
            return this;
        }

        public Builder setPins(int i11, PinsProto$Pin.Builder builder) {
            copyOnWrite();
            ((PinsProto$Pins) this.instance).setPins(i11, builder.build());
            return this;
        }

        public Builder addPins(PinsProto$Pin.Builder builder) {
            copyOnWrite();
            ((PinsProto$Pins) this.instance).addPins(builder.build());
            return this;
        }

        public Builder addPins(int i11, PinsProto$Pin.Builder builder) {
            copyOnWrite();
            ((PinsProto$Pins) this.instance).addPins(i11, builder.build());
            return this;
        }
    }

    private static final class CustomPinStylesDefaultEntryHolder {
        static final u<Integer, PinsProto$CustomPinStyle> defaultEntry = u.d(WireFormat$FieldType.UINT32, 0, WireFormat$FieldType.MESSAGE, PinsProto$CustomPinStyle.getDefaultInstance());
    }

    private static final class CustomTextContentDefaultEntryHolder {
        static final u<Integer, PinsProto$AdditionalPinContent> defaultEntry = u.d(WireFormat$FieldType.UINT32, 0, WireFormat$FieldType.MESSAGE, PinsProto$AdditionalPinContent.getDefaultInstance());
    }

    private static final class ImagesDefaultEntryHolder {
        static final u<Integer, String> defaultEntry = u.d(WireFormat$FieldType.UINT32, 0, WireFormat$FieldType.STRING, "");
    }

    static {
        PinsProto$Pins pinsProto$Pins = new PinsProto$Pins();
        DEFAULT_INSTANCE = pinsProto$Pins;
        GeneratedMessageLite.registerDefaultInstance(PinsProto$Pins.class, pinsProto$Pins);
    }

    private PinsProto$Pins() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPins(Iterable<? extends PinsProto$Pin> iterable) {
        ensurePinsIsMutable();
        AbstractMessageLite.addAll(iterable, this.pins_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPins(PinsProto$Pin pinsProto$Pin) {
        pinsProto$Pin.getClass();
        ensurePinsIsMutable();
        this.pins_.add(pinsProto$Pin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPins() {
        this.pins_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyleType() {
        this.styleType_ = 0;
    }

    private void ensurePinsIsMutable() {
        Internal.e<PinsProto$Pin> eVar = this.pins_;
        if (eVar.isModifiable()) {
            return;
        }
        this.pins_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    public static PinsProto$Pins getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, PinsProto$CustomPinStyle> getMutableCustomPinStylesMap() {
        return internalGetMutableCustomPinStyles();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, PinsProto$AdditionalPinContent> getMutableCustomTextContentMap() {
        return internalGetMutableCustomTextContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, String> getMutableImagesMap() {
        return internalGetMutableImages();
    }

    private v<Integer, PinsProto$CustomPinStyle> internalGetCustomPinStyles() {
        return this.customPinStyles_;
    }

    private v<Integer, PinsProto$AdditionalPinContent> internalGetCustomTextContent() {
        return this.customTextContent_;
    }

    private v<Integer, String> internalGetImages() {
        return this.images_;
    }

    private v<Integer, PinsProto$CustomPinStyle> internalGetMutableCustomPinStyles() {
        if (!this.customPinStyles_.i()) {
            this.customPinStyles_ = this.customPinStyles_.m();
        }
        return this.customPinStyles_;
    }

    private v<Integer, PinsProto$AdditionalPinContent> internalGetMutableCustomTextContent() {
        if (!this.customTextContent_.i()) {
            this.customTextContent_ = this.customTextContent_.m();
        }
        return this.customTextContent_;
    }

    private v<Integer, String> internalGetMutableImages() {
        if (!this.images_.i()) {
            this.images_ = this.images_.m();
        }
        return this.images_;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PinsProto$Pins parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PinsProto$Pins) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PinsProto$Pins parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PinsProto$Pins) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<PinsProto$Pins> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePins(int i11) {
        ensurePinsIsMutable();
        this.pins_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPins(int i11, PinsProto$Pin pinsProto$Pin) {
        pinsProto$Pin.getClass();
        ensurePinsIsMutable();
        this.pins_.set(i11, pinsProto$Pin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyleType(PinsProto$PinStyleType pinsProto$PinStyleType) {
        this.styleType_ = pinsProto$PinStyleType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyleTypeValue(int i11) {
        this.styleType_ = i11;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    public boolean containsCustomPinStyles(int i11) {
        return internalGetCustomPinStyles().containsKey(Integer.valueOf(i11));
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    public boolean containsCustomTextContent(int i11) {
        return internalGetCustomTextContent().containsKey(Integer.valueOf(i11));
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    public boolean containsImages(int i11) {
        return internalGetImages().containsKey(Integer.valueOf(i11));
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        switch (PinsProto$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[bVar.ordinal()]) {
            case 1:
                return new PinsProto$Pins();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0003\u0001\u0000\u0001\u001b\u0002\f\u00032\u00042\u00052", new Object[]{"pins_", PinsProto$Pin.class, "styleType_", "customPinStyles_", CustomPinStylesDefaultEntryHolder.defaultEntry, "images_", ImagesDefaultEntryHolder.defaultEntry, "customTextContent_", CustomTextContentDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<PinsProto$Pins> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (PinsProto$Pins.class) {
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

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    @Deprecated
    public Map<Integer, PinsProto$CustomPinStyle> getCustomPinStyles() {
        return getCustomPinStylesMap();
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    public int getCustomPinStylesCount() {
        return internalGetCustomPinStyles().size();
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    public Map<Integer, PinsProto$CustomPinStyle> getCustomPinStylesMap() {
        return Collections.unmodifiableMap(internalGetCustomPinStyles());
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    public PinsProto$CustomPinStyle getCustomPinStylesOrDefault(int i11, PinsProto$CustomPinStyle pinsProto$CustomPinStyle) {
        PinsProto$CustomPinStyle pinsProto$CustomPinStyle2 = internalGetCustomPinStyles().get(Integer.valueOf(i11));
        return pinsProto$CustomPinStyle2 != null ? pinsProto$CustomPinStyle2 : pinsProto$CustomPinStyle;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    public PinsProto$CustomPinStyle getCustomPinStylesOrThrow(int i11) {
        PinsProto$CustomPinStyle pinsProto$CustomPinStyle = internalGetCustomPinStyles().get(Integer.valueOf(i11));
        if (pinsProto$CustomPinStyle != null) {
            return pinsProto$CustomPinStyle;
        }
        throw new IllegalArgumentException();
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    @Deprecated
    public Map<Integer, PinsProto$AdditionalPinContent> getCustomTextContent() {
        return getCustomTextContentMap();
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    public int getCustomTextContentCount() {
        return internalGetCustomTextContent().size();
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    public Map<Integer, PinsProto$AdditionalPinContent> getCustomTextContentMap() {
        return Collections.unmodifiableMap(internalGetCustomTextContent());
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    public PinsProto$AdditionalPinContent getCustomTextContentOrDefault(int i11, PinsProto$AdditionalPinContent pinsProto$AdditionalPinContent) {
        PinsProto$AdditionalPinContent pinsProto$AdditionalPinContent2 = internalGetCustomTextContent().get(Integer.valueOf(i11));
        return pinsProto$AdditionalPinContent2 != null ? pinsProto$AdditionalPinContent2 : pinsProto$AdditionalPinContent;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    public PinsProto$AdditionalPinContent getCustomTextContentOrThrow(int i11) {
        PinsProto$AdditionalPinContent pinsProto$AdditionalPinContent = internalGetCustomTextContent().get(Integer.valueOf(i11));
        if (pinsProto$AdditionalPinContent != null) {
            return pinsProto$AdditionalPinContent;
        }
        throw new IllegalArgumentException();
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    @Deprecated
    public Map<Integer, String> getImages() {
        return getImagesMap();
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    public int getImagesCount() {
        return internalGetImages().size();
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    public Map<Integer, String> getImagesMap() {
        return Collections.unmodifiableMap(internalGetImages());
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    public String getImagesOrDefault(int i11, String str) {
        String str2 = internalGetImages().get(Integer.valueOf(i11));
        return str2 != null ? str2 : str;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    public String getImagesOrThrow(int i11) {
        String str = internalGetImages().get(Integer.valueOf(i11));
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    public PinsProto$Pin getPins(int i11) {
        return this.pins_.get(i11);
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    public int getPinsCount() {
        return this.pins_.size();
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    public List<PinsProto$Pin> getPinsList() {
        return this.pins_;
    }

    public PinsProto$PinOrBuilder getPinsOrBuilder(int i11) {
        return this.pins_.get(i11);
    }

    public List<? extends PinsProto$PinOrBuilder> getPinsOrBuilderList() {
        return this.pins_;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    public PinsProto$PinStyleType getStyleType() {
        PinsProto$PinStyleType forNumber = PinsProto$PinStyleType.forNumber(this.styleType_);
        return forNumber == null ? PinsProto$PinStyleType.UNRECOGNIZED : forNumber;
    }

    @Override // ru.ozon.app.android.geo.PinsProto$PinsOrBuilder
    public int getStyleTypeValue() {
        return this.styleType_;
    }

    public static Builder newBuilder(PinsProto$Pins pinsProto$Pins) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(pinsProto$Pins);
    }

    public static PinsProto$Pins parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (PinsProto$Pins) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static PinsProto$Pins parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (PinsProto$Pins) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static PinsProto$Pins parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PinsProto$Pins) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPins(int i11, PinsProto$Pin pinsProto$Pin) {
        pinsProto$Pin.getClass();
        ensurePinsIsMutable();
        this.pins_.add(i11, pinsProto$Pin);
    }

    public static PinsProto$Pins parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (PinsProto$Pins) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static PinsProto$Pins parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PinsProto$Pins) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PinsProto$Pins parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (PinsProto$Pins) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static PinsProto$Pins parseFrom(InputStream inputStream) throws IOException {
        return (PinsProto$Pins) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PinsProto$Pins parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (PinsProto$Pins) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static PinsProto$Pins parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PinsProto$Pins) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PinsProto$Pins parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (PinsProto$Pins) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
