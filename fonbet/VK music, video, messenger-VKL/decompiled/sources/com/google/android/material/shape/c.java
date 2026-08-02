package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.google.android.material.shadow.ShadowRenderer;
import com.google.android.material.shape.d;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ShapePath.java */
/* loaded from: classes13.dex */
public final class c extends d.g {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public c(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // com.google.android.material.shape.d.g
    public final void a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((d.g) it.next()).a(this.d, shadowRenderer, i, canvas);
        }
    }
}
