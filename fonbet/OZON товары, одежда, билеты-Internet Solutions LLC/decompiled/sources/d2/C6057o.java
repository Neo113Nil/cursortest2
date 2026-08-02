package d2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: d2.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6057o extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6034K f61063b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f61064c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C6041S f61065d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Z1.s f61066e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6057o(C6034K c6034k, Function0<Unit> function0, C6041S c6041s, String str, Z1.s sVar) {
        super(0);
        this.f61063b = c6034k;
        this.f61064c = function0;
        this.f61065d = c6041s;
        this.f61066e = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f61063b.m(this.f61064c, this.f61065d, this.f61066e);
        return Unit.f71690a;
    }
}
