package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int a = iVersions.a(context, str, true);
        selectionResult.b = a;
        if (a != 0) {
            selectionResult.c = 1;
            return selectionResult;
        }
        int b = iVersions.b(context, str);
        selectionResult.a = b;
        if (b != 0) {
            selectionResult.c = -1;
        }
        return selectionResult;
    }
}
