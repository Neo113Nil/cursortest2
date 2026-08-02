package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
public final class a implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0492b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0492b c0492b = new DynamiteModule.b.C0492b();
        int b10 = aVar.b(context, str);
        c0492b.f32858a = b10;
        c0492b.f32860c = b10 != 0 ? -1 : 0;
        return c0492b;
    }
}
