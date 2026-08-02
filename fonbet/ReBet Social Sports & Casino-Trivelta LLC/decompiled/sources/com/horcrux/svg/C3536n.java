package com.horcrux.svg;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3536n extends AbstractC3539q {

    /* renamed from: c, reason: collision with root package name */
    public String f38892c;

    /* renamed from: d, reason: collision with root package name */
    public float f38893d;

    /* renamed from: e, reason: collision with root package name */
    public float f38894e;

    /* renamed from: f, reason: collision with root package name */
    public EnumC3540r f38895f;

    public C3536n(ReactContext reactContext) {
        super(reactContext);
    }

    public void A(float f10) {
        this.f38894e = f10;
        invalidate();
    }

    @Override // com.horcrux.svg.AbstractC3539q
    public Bitmap o(HashMap hashMap, Bitmap bitmap) {
        return w(getContext(), AbstractC3539q.q(hashMap, bitmap, this.f38892c));
    }

    public final Bitmap w(Context context, Bitmap bitmap) {
        float max = Math.max(this.f38893d, this.f38894e) * 2.0f;
        if (max <= 0.0f) {
            return bitmap;
        }
        float min = Math.min(max, 25.0f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap);
        RenderScript create = RenderScript.create(context);
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
        create2.setRadius(min);
        create2.setInput(createFromBitmap);
        create2.forEach(createFromBitmap2);
        createFromBitmap2.copyTo(createBitmap);
        createFromBitmap.destroy();
        createFromBitmap2.destroy();
        create.destroy();
        return Bitmap.createScaledBitmap(createBitmap, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public void x(String str) {
        this.f38895f = EnumC3540r.b(str);
        invalidate();
    }

    public void y(String str) {
        this.f38892c = str;
        invalidate();
    }

    public void z(float f10) {
        this.f38893d = f10;
        invalidate();
    }
}
