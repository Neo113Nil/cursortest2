package ru.ozon.app.android.geo;

import com.google.protobuf.A;
import com.google.protobuf.MessageLite;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public interface PinsProto$PinsOrBuilder extends A {
    boolean containsCustomPinStyles(int i11);

    boolean containsCustomTextContent(int i11);

    boolean containsImages(int i11);

    @Deprecated
    Map<Integer, PinsProto$CustomPinStyle> getCustomPinStyles();

    int getCustomPinStylesCount();

    Map<Integer, PinsProto$CustomPinStyle> getCustomPinStylesMap();

    PinsProto$CustomPinStyle getCustomPinStylesOrDefault(int i11, PinsProto$CustomPinStyle pinsProto$CustomPinStyle);

    PinsProto$CustomPinStyle getCustomPinStylesOrThrow(int i11);

    @Deprecated
    Map<Integer, PinsProto$AdditionalPinContent> getCustomTextContent();

    int getCustomTextContentCount();

    Map<Integer, PinsProto$AdditionalPinContent> getCustomTextContentMap();

    PinsProto$AdditionalPinContent getCustomTextContentOrDefault(int i11, PinsProto$AdditionalPinContent pinsProto$AdditionalPinContent);

    PinsProto$AdditionalPinContent getCustomTextContentOrThrow(int i11);

    /* synthetic */ MessageLite getDefaultInstanceForType();

    @Deprecated
    Map<Integer, String> getImages();

    int getImagesCount();

    Map<Integer, String> getImagesMap();

    String getImagesOrDefault(int i11, String str);

    String getImagesOrThrow(int i11);

    PinsProto$Pin getPins(int i11);

    int getPinsCount();

    List<PinsProto$Pin> getPinsList();

    PinsProto$PinStyleType getStyleType();

    int getStyleTypeValue();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
