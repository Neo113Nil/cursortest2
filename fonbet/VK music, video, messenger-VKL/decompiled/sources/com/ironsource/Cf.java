package com.ironsource;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes13.dex */
public final class Cf implements InterfaceC4237b4 {
    private Activity a;
    private Context b;

    @Override // com.ironsource.InterfaceC4237b4
    public Activity a() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4237b4
    public Context b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4237b4
    public void a(Activity activity) {
        this.a = activity;
    }

    @Override // com.ironsource.InterfaceC4237b4
    public void a(Context context) {
        this.b = context;
    }
}
