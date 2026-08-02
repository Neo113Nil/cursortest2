package com.horcrux.svg;

import android.graphics.Bitmap;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3539q extends AbstractC3527e {

    /* renamed from: a, reason: collision with root package name */
    public String f38918a;

    /* renamed from: b, reason: collision with root package name */
    public final FilterRegion f38919b;

    public AbstractC3539q(ReactContext reactContext) {
        super(reactContext);
        this.f38919b = new FilterRegion();
    }

    public static Bitmap q(HashMap hashMap, Bitmap bitmap, String str) {
        Bitmap bitmap2 = str != null ? (Bitmap) hashMap.get(str) : null;
        return bitmap2 != null ? bitmap2 : bitmap;
    }

    public abstract Bitmap o(HashMap hashMap, Bitmap bitmap);

    public String p() {
        return this.f38918a;
    }

    public void r(Dynamic dynamic) {
        this.f38919b.setHeight(dynamic);
        invalidate();
    }

    public void s(String str) {
        this.f38918a = str;
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
    }

    public void t(Dynamic dynamic) {
        this.f38919b.setWidth(dynamic);
        invalidate();
    }

    public void u(Dynamic dynamic) {
        this.f38919b.setX(dynamic);
        invalidate();
    }

    public void v(Dynamic dynamic) {
        this.f38919b.setY(dynamic);
        invalidate();
    }
}
