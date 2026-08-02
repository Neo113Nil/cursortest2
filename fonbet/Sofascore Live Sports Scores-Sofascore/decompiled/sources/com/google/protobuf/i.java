package com.google.protobuf;

import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class i extends k {
    public int a = 0;
    public final int b;
    public final /* synthetic */ ByteString c;

    public i(ByteString byteString) {
        this.c = byteString;
        this.b = byteString.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // com.google.protobuf.ByteString.ByteIterator
    public final byte nextByte() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return this.c.internalByteAt(i);
        }
        yhk.d();
        return (byte) 0;
    }
}
