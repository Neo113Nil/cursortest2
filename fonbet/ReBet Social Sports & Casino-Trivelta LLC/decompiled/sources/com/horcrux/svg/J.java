package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class J extends RenderableView {

    /* renamed from: a, reason: collision with root package name */
    public Path f38689a;

    public J(ReactContext reactContext) {
        super(reactContext);
        I.f38676a = this.mScale;
        this.f38689a = new Path();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        return this.f38689a;
    }

    public void o(String str) {
        this.f38689a = I.o(str);
        ArrayList<H> arrayList = I.f38681f;
        this.elements = arrayList;
        Iterator<H> it = arrayList.iterator();
        while (it.hasNext()) {
            for (L l10 : it.next().points) {
                double d10 = l10.f38703a;
                float f10 = this.mScale;
                l10.f38703a = d10 * f10;
                l10.f38704b *= f10;
            }
        }
        invalidate();
    }
}
