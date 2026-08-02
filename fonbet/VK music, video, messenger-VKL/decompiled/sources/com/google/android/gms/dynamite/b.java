package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class b implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0115a interfaceC0115a) throws DynamiteModule.LoadingException {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int b = interfaceC0115a.b(context, str, true);
        bVar.b = b;
        if (b != 0) {
            bVar.c = 1;
            return bVar;
        }
        int a = interfaceC0115a.a(context, str);
        bVar.a = a;
        if (a != 0) {
            bVar.c = -1;
        }
        return bVar;
    }
}
