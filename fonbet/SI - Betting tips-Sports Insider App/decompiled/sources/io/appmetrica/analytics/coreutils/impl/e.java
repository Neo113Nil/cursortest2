package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f11668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11669b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11670c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str, int i5) {
        super(0);
        this.f11668a = context;
        this.f11669b = str;
        this.f11670c = i5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f11668a.getPackageManager().getPackageInfo(this.f11669b, this.f11670c);
    }
}
