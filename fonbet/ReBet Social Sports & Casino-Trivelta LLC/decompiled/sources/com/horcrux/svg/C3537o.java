package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3537o extends AbstractC3539q {

    /* renamed from: c, reason: collision with root package name */
    public ReadableArray f38898c;

    public C3537o(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.AbstractC3539q
    public Bitmap o(HashMap hashMap, Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int size = this.f38898c.size();
        for (int i10 = 0; i10 < size; i10++) {
            String string = this.f38898c.getString(i10);
            Bitmap bitmap2 = string.isEmpty() ? bitmap : (Bitmap) hashMap.get(string);
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint());
            }
        }
        return createBitmap;
    }

    public void w(ReadableArray readableArray) {
        this.f38898c = readableArray;
        invalidate();
    }
}
