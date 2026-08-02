package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f11684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f11685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11686c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, ComponentName componentName, int i5, int i10) {
        super(0);
        this.f11684a = context;
        this.f11685b = componentName;
        this.f11686c = i5;
        this.f11687d = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f11684a.getPackageManager().setComponentEnabledSetting(this.f11685b, this.f11686c, this.f11687d);
        return Unit.f19194a;
    }
}
