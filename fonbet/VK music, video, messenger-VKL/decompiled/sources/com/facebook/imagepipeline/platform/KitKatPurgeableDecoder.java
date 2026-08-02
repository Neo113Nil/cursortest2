package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import xsna.dor;
import xsna.uvf;
import xsna.zsn;

@zsn
@TargetApi(19)
/* loaded from: classes12.dex */
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {
    @zsn
    public KitKatPurgeableDecoder(dor dorVar) {
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap decodeByteArrayAsPurgeable(uvf<PooledByteBuffer> uvfVar, BitmapFactory.Options options) {
        uvfVar.r().size();
        throw null;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap decodeJPEGByteArrayAsPurgeable(uvf<PooledByteBuffer> uvfVar, int i, BitmapFactory.Options options) {
        DalvikPurgeableDecoder.endsWithEOI(uvfVar, i);
        if (i <= uvfVar.r().size()) {
            throw null;
        }
        throw new IllegalArgumentException();
    }
}
