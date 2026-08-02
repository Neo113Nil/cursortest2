package com.braze.lrucache;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes6.dex */
public final class h extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f568a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, int i) {
        super(i);
        this.f568a = iVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i = ((ByteArrayOutputStream) this).count;
        if (i > 0) {
            int i2 = i - 1;
            if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                i = i2;
            }
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i, this.f568a.b.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
