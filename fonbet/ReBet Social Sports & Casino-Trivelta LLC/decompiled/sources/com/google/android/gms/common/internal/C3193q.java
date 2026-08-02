package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.AbstractC3204l;

/* renamed from: com.google.android.gms.common.internal.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3193q {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f32748a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32749b;

    public C3193q(Context context) {
        AbstractC3191o.m(context);
        Resources resources = context.getResources();
        this.f32748a = resources;
        this.f32749b = resources.getResourcePackageName(AbstractC3204l.f32776a);
    }

    public String a(String str) {
        String str2 = this.f32749b;
        Resources resources = this.f32748a;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
