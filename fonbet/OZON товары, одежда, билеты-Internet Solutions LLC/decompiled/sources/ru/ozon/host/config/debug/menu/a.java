package ru.ozon.host.config.debug.menu;

import Ca0.d;
import android.app.Application;
import android.net.Uri;
import f3.AbstractC6409a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class a extends AbstractC7737t implements Function1<AbstractC6409a, Ba0.a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Application f97133b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Uri f97134c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(Application application, Uri uri) {
        super(1);
        this.f97133b = application;
        this.f97134c = uri;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Ba0.a invoke(AbstractC6409a abstractC6409a) {
        AbstractC6409a initializer = abstractC6409a;
        Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
        return new Ba0.a(this.f97133b, new d(new Va0.a(this.f97134c)));
    }
}
