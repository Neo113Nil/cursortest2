package com.google.gson.internal;

import io.sentry.util.l;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.composer.configurators.RefreshByCurrencyConfigurator;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements o, l.a, qc.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f59959a;

    public /* synthetic */ f(Object obj) {
        this.f59959a = obj;
    }

    @Override // com.google.gson.internal.o
    public Object f() {
        throw new com.google.gson.j((String) this.f59959a);
    }

    @Override // io.sentry.util.l.a
    public Object g() {
        return (String) this.f59959a;
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean onComposerInitialized$lambda$0;
        onComposerInitialized$lambda$0 = RefreshByCurrencyConfigurator.onComposerInitialized$lambda$0((Function1) this.f59959a, obj);
        return onComposerInitialized$lambda$0;
    }
}
