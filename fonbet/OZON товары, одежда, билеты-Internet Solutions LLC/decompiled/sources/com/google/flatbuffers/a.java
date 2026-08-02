package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: bb, reason: collision with root package name */
    protected ByteBuffer f59759bb;
    private int element_size;
    private int length;
    private int vector;

    protected int __element(int i11) {
        return (i11 * this.element_size) + this.vector;
    }

    protected void __reset(int i11, int i12, ByteBuffer byteBuffer) {
        this.f59759bb = byteBuffer;
        if (byteBuffer != null) {
            this.vector = i11;
            this.length = byteBuffer.getInt(i11 - 4);
            this.element_size = i12;
        } else {
            this.vector = 0;
            this.length = 0;
            this.element_size = 0;
        }
    }

    protected int __vector() {
        return this.vector;
    }

    public int length() {
        return this.length;
    }

    public void reset() {
        __reset(0, 0, null);
    }
}
