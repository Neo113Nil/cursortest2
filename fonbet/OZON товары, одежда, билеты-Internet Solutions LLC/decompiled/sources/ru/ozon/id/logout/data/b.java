package ru.ozon.id.logout.data;

import B0.C2454a;
import java.util.Map;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;

/* loaded from: classes7.dex */
final class b extends AbstractC7737t implements Function0<Map<String, ? extends String>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f97157b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(d dVar) {
        super(0);
        this.f97157b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends String> invoke() {
        return C2454a.b("deviceId", (String) C10727i.d(g.f71771a, new a(this.f97157b, null)));
    }
}
