package ru.ozon.app.android.geo;

import com.google.protobuf.A;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;

/* loaded from: classes12.dex */
public interface PinsProto$CustomPinStyleOrBuilder extends A {
    String getBorderColor();

    ByteString getBorderColorBytes();

    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getIconTintColor();

    ByteString getIconTintColorBytes();

    String getPinsCountColor();

    ByteString getPinsCountColorBytes();

    String getTextColor();

    ByteString getTextColorBytes();

    String getTintColor();

    ByteString getTintColorBytes();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
