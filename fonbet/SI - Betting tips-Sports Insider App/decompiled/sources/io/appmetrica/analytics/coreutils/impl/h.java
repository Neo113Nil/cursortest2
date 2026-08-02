package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f11676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f11677b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11678c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, Intent intent, int i5) {
        super(0);
        this.f11676a = context;
        this.f11677b = intent;
        this.f11678c = i5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f11676a.getPackageManager().resolveActivity(this.f11677b, this.f11678c);
    }
}
