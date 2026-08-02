package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class d implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0115a interfaceC0115a) throws DynamiteModule.LoadingException {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        bVar.a = interfaceC0115a.a(context, str);
        int i = 1;
        int b = interfaceC0115a.b(context, str, true);
        bVar.b = b;
        int i2 = bVar.a;
        if (i2 == 0) {
            i2 = 0;
            if (b == 0) {
                i = 0;
                bVar.c = i;
                return bVar;
            }
        }
        if (i2 >= b) {
            i = -1;
        }
        bVar.c = i;
        return bVar;
    }
}
