package com.ironsource;

import android.app.Activity;
import android.content.Context;
import defpackage.duf;
import defpackage.t0d;
import defpackage.znf;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class ah implements Y3 {
    static final /* synthetic */ KProperty<Object>[] c = {duf.a.mutableProperty1(new t0d(ah.class, "activity", "getActivity()Landroid/app/Activity;", 0))};

    @Nullable
    private Context a;

    @NotNull
    private final znf b;

    public ah(@Nullable Activity activity, @Nullable Context context) {
        this.a = context;
        this.b = Z6.a(activity);
    }

    @Override // com.ironsource.Y3
    @Nullable
    public Activity a() {
        return (Activity) this.b.getValue(this, c[0]);
    }

    @Override // com.ironsource.Y3
    @Nullable
    public Context b() {
        return this.a;
    }

    @Override // com.ironsource.Y3
    public void a(@Nullable Context context) {
        this.a = context;
    }

    @Override // com.ironsource.Y3
    public void a(@Nullable Activity activity) {
        this.b.setValue(this, c[0], activity);
    }
}
