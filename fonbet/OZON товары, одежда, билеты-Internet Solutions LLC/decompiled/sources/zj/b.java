package zj;

import Td0.d;
import android.content.Intent;
import kotlin.jvm.functions.Function1;

/* loaded from: classes10.dex */
public final class b extends d.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f109297a = "ozonLogger";

    /* renamed from: b, reason: collision with root package name */
    private final String f109298b = "Logger";

    /* renamed from: c, reason: collision with root package name */
    private final Function1<Td0.c, Intent> f109299c;

    b(Rd0.a aVar) {
        this.f109299c = new C11146a(aVar);
    }

    @Override // Td0.d.a
    public final String a() {
        return this.f109297a;
    }

    @Override // Td0.d.a
    public final Function1<Td0.c, Intent> b() {
        return this.f109299c;
    }

    @Override // Td0.d.a
    public final String c() {
        return this.f109298b;
    }
}
