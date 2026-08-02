package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC5903i;
import java.util.NoSuchElementException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C5902h extends AbstractC5903i.a {

    /* renamed from: a, reason: collision with root package name */
    private int f59374a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f59375b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC5903i f59376c;

    C5902h(AbstractC5903i abstractC5903i) {
        this.f59376c = abstractC5903i;
        this.f59375b = abstractC5903i.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f59374a < this.f59375b;
    }

    public final byte nextByte() {
        int i11 = this.f59374a;
        if (i11 >= this.f59375b) {
            throw new NoSuchElementException();
        }
        this.f59374a = i11 + 1;
        return this.f59376c.g(i11);
    }
}
