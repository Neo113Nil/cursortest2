package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: classes9.dex */
class Internal$MapAdapter$1 {
    final /* synthetic */ Internal.b val$enumMap;
    final /* synthetic */ Internal.a val$unrecognizedValue;

    Internal$MapAdapter$1(Internal.b bVar, Internal.a aVar) {
        this.val$enumMap = bVar;
        this.val$unrecognizedValue = aVar;
    }

    public Integer doBackward(Internal.a aVar) {
        return Integer.valueOf(aVar.getNumber());
    }

    public Internal.a doForward(Integer num) {
        Internal.a findValueByNumber = this.val$enumMap.findValueByNumber(num.intValue());
        return findValueByNumber == null ? this.val$unrecognizedValue : findValueByNumber;
    }
}
