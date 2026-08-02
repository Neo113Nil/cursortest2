package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
public final class h implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0492b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0492b c0492b = new DynamiteModule.b.C0492b();
        c0492b.f32858a = aVar.b(context, str);
        int i10 = 1;
        int a10 = aVar.a(context, str, true);
        c0492b.f32859b = a10;
        int i11 = c0492b.f32858a;
        if (i11 == 0) {
            i11 = 0;
            if (a10 == 0) {
                i10 = 0;
                c0492b.f32860c = i10;
                return c0492b;
            }
        }
        if (a10 < i11) {
            i10 = -1;
        }
        c0492b.f32860c = i10;
        return c0492b;
    }
}
