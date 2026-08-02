package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f11681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f11682b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11683c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, Intent intent, int i5) {
        super(0);
        this.f11681a = context;
        this.f11682b = intent;
        this.f11683c = i5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f11681a.getPackageManager().resolveService(this.f11682b, this.f11683c);
    }
}
