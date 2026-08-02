package com.ironsource;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.fpf0;
import xsna.p7f0;
import xsna.qcy;

/* loaded from: classes13.dex */
public final class dh implements InterfaceC4237b4 {
    static final /* synthetic */ qcy<Object>[] c;
    private Context a;
    private final p7f0 b;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(dh.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        fpf0.a.getClass();
        c = new qcy[]{mutablePropertyReference1Impl};
    }

    public dh(Activity activity, Context context) {
        this.a = context;
        this.b = C4276d7.a(activity);
    }

    @Override // com.ironsource.InterfaceC4237b4
    public void a(Context context) {
        this.a = context;
    }

    @Override // com.ironsource.InterfaceC4237b4
    public Context b() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.InterfaceC4237b4
    public Activity a() {
        return (Activity) this.b.getValue(this, c[0]);
    }

    @Override // com.ironsource.InterfaceC4237b4
    public void a(Activity activity) {
        this.b.setValue(this, c[0], activity);
    }
}
