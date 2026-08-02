package d2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: d2.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6045c extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ DialogC6032I f61037b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f61038c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C6030G f61039d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Z1.s f61040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6045c(DialogC6032I dialogC6032I, Function0<Unit> function0, C6030G c6030g, Z1.s sVar) {
        super(0);
        this.f61037b = dialogC6032I;
        this.f61038c = function0;
        this.f61039d = c6030g;
        this.f61040e = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f61037b.g(this.f61038c, this.f61039d, this.f61040e);
        return Unit.f71690a;
    }
}
