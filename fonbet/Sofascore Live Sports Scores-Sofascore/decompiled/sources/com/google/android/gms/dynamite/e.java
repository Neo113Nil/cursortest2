package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        int a;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int b = iVersions.b(context, str);
        selectionResult.a = b;
        int i = 1;
        int i2 = 0;
        if (b != 0) {
            a = iVersions.a(context, str, false);
            selectionResult.b = a;
        } else {
            a = iVersions.a(context, str, true);
            selectionResult.b = a;
        }
        int i3 = selectionResult.a;
        if (i3 != 0) {
            i2 = i3;
        } else if (a == 0) {
            i = 0;
            selectionResult.c = i;
            return selectionResult;
        }
        if (i2 >= a) {
            i = -1;
        }
        selectionResult.c = i;
        return selectionResult;
    }
}
