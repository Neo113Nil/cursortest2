package com.facebook.imagepipeline.platform;

import D6.d;
import D6.k;
import G6.h;
import H6.a;
import K7.w;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;

@d
@TargetApi(19)
/* loaded from: classes2.dex */
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: b, reason: collision with root package name */
    public final w f30598b;

    @d
    public KitKatPurgeableDecoder(w wVar) {
        this.f30598b = wVar;
    }

    public static void h(byte[] bArr, int i10) {
        bArr[i10] = -1;
        bArr[i10 + 1] = -39;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public Bitmap c(a aVar, BitmapFactory.Options options) {
        h hVar = (h) aVar.z0();
        int size = hVar.size();
        a a10 = this.f30598b.a(size);
        try {
            byte[] bArr = (byte[]) a10.z0();
            hVar.i(0, bArr, 0, size);
            return (Bitmap) k.h(BitmapFactory.decodeByteArray(bArr, 0, size, options), "BitmapFactory returned null");
        } finally {
            a.U(a10);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public Bitmap d(a aVar, int i10, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.e(aVar, i10) ? null : DalvikPurgeableDecoder.EOI;
        h hVar = (h) aVar.z0();
        k.b(Boolean.valueOf(i10 <= hVar.size()));
        int i11 = i10 + 2;
        a a10 = this.f30598b.a(i11);
        try {
            byte[] bArr2 = (byte[]) a10.z0();
            hVar.i(0, bArr2, 0, i10);
            if (bArr != null) {
                h(bArr2, i10);
                i10 = i11;
            }
            Bitmap bitmap = (Bitmap) k.h(BitmapFactory.decodeByteArray(bArr2, 0, i10, options), "BitmapFactory returned null");
            a.U(a10);
            return bitmap;
        } catch (Throwable th2) {
            a.U(a10);
            throw th2;
        }
    }
}
