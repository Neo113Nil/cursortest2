package com.inmobi.media;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ek, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3399ek extends ByteArrayOutputStream {
    public final /* synthetic */ C3425fk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3399ek(C3425fk c3425fk, int i) {
        super(i);
        this.a = c3425fk;
    }

    @Override // java.io.ByteArrayOutputStream
    public final synchronized String toString() {
        int i;
        i = ((ByteArrayOutputStream) this).count;
        if (i > 0) {
            int i2 = i - 1;
            if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                i = i2;
            }
        }
        try {
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
        return new String(((ByteArrayOutputStream) this).buf, 0, i, this.a.b.name());
    }
}
