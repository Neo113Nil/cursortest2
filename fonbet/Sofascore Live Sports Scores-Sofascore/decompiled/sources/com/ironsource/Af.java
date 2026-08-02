package com.ironsource;

import android.app.Activity;
import android.content.Context;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Af implements Y3 {

    @Nullable
    private Activity a;

    @Nullable
    private Context b;

    @Override // com.ironsource.Y3
    @Nullable
    public Activity a() {
        return this.a;
    }

    @Override // com.ironsource.Y3
    @Nullable
    public Context b() {
        return this.b;
    }

    @Override // com.ironsource.Y3
    public void a(@Nullable Activity activity) {
        this.a = activity;
    }

    @Override // com.ironsource.Y3
    public void a(@Nullable Context context) {
        this.b = context;
    }
}
