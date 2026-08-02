package com.google.protobuf;

import com.google.protobuf.ByteString;
import defpackage.v6g;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class g2 extends k {
    public final v6g a;
    public ByteString.ByteIterator b = a();

    public g2(h2 h2Var) {
        this.a = new v6g(h2Var);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.protobuf.ByteString$ByteIterator] */
    public final ByteString.ByteIterator a() {
        v6g v6gVar = this.a;
        if (v6gVar.hasNext()) {
            return v6gVar.a().iterator2();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // com.google.protobuf.ByteString.ByteIterator
    public final byte nextByte() {
        ByteString.ByteIterator byteIterator = this.b;
        if (byteIterator == null) {
            yhk.d();
            return (byte) 0;
        }
        byte nextByte = byteIterator.nextByte();
        if (!this.b.hasNext()) {
            this.b = a();
        }
        return nextByte;
    }
}
