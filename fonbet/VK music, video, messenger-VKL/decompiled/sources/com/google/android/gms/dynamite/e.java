package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class e implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0115a interfaceC0115a) throws DynamiteModule.LoadingException {
        int b;
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int a = interfaceC0115a.a(context, str);
        bVar.a = a;
        int i = 1;
        int i2 = 0;
        if (a != 0) {
            b = interfaceC0115a.b(context, str, false);
            bVar.b = b;
        } else {
            b = interfaceC0115a.b(context, str, true);
            bVar.b = b;
        }
        int i3 = bVar.a;
        if (i3 != 0) {
            i2 = i3;
        } else if (b == 0) {
            i = 0;
            bVar.c = i;
            return bVar;
        }
        if (i2 >= b) {
            i = -1;
        }
        bVar.c = i;
        return bVar;
    }
}
