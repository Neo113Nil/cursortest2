package com.ironsource;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes2.dex */
public final class Xg implements InterfaceC2341b4 {
    static final /* synthetic */ KProperty<Object>[] c = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Xg.class, "activity", "getActivity()Landroid/app/Activity;", 0))};
    private Context a;
    private final ReadWriteProperty b;

    public Xg(Activity activity, Context context) {
        this.a = context;
        this.b = C2362c7.a(activity);
    }

    @Override // com.ironsource.InterfaceC2341b4
    public void a(Context context) {
        this.a = context;
    }

    @Override // com.ironsource.InterfaceC2341b4
    public Context b() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC2341b4
    public Activity a() {
        return (Activity) this.b.getValue(this, c[0]);
    }

    @Override // com.ironsource.InterfaceC2341b4
    public void a(Activity activity) {
        this.b.setValue(this, c[0], activity);
    }
}
