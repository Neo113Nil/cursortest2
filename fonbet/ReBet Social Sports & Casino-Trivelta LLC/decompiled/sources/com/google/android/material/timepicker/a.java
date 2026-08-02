package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.C2075a;
import y0.z;

/* loaded from: classes3.dex */
public abstract class a extends C2075a {

    /* renamed from: a, reason: collision with root package name */
    public final z.a f36421a;

    public a(Context context, int i10) {
        this.f36421a = new z.a(16, context.getString(i10));
    }

    @Override // androidx.core.view.C2075a
    public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
        super.onInitializeAccessibilityNodeInfo(view, zVar);
        zVar.b(this.f36421a);
    }
}
