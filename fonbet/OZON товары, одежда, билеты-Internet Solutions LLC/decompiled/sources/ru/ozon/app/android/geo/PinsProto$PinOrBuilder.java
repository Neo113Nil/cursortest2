package ru.ozon.app.android.geo;

import com.google.protobuf.A;
import com.google.protobuf.BoolValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UInt64Value;

/* loaded from: classes12.dex */
public interface PinsProto$PinOrBuilder extends A {
    int getAdditionalContentKey();

    PinsProto$Coordinates getCoordinates();

    /* synthetic */ MessageLite getDefaultInstanceForType();

    UInt64Value getId();

    BoolValue getIsClickEnabled();

    int getPinImageKey();

    int getPinStyleKey();

    int getPinsCount();

    int getProviderId();

    Int32Value getZPriority();

    boolean hasCoordinates();

    boolean hasId();

    boolean hasIsClickEnabled();

    boolean hasZPriority();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
