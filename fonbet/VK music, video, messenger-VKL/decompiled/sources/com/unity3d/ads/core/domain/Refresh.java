package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import xsna.spj;

/* compiled from: Refresh.kt */
/* loaded from: classes14.dex */
public interface Refresh {
    Object invoke(ByteString byteString, ByteString byteString2, spj<? super AdDataRefreshResponseOuterClass.AdDataRefreshResponse> spjVar);
}
