package xi0;

import Sc.s;
import com.google.protobuf.DescriptorProtos$FileOptions;
import ij0.InterfaceC7087b;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;

@e(c = "ru.ozon.tracker.debug.menu.domain.tracker.init.ExternalConfigurationInstaller$install$blocks$1$1", f = "ExternalConfigurationInstaller.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f105588d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f105589e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ d f105590f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ fj0.d<? extends Object> f105591g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, d dVar, fj0.d<? extends Object> dVar2, kotlin.coroutines.d<? super c> dVar3) {
        super(1, dVar3);
        this.f105589e = obj;
        this.f105590f = dVar;
        this.f105591g = dVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new c(this.f105589e, this.f105590f, this.f105591g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC7087b interfaceC7087b;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f105588d;
        if (i11 == 0) {
            s.b(obj);
            Object obj2 = this.f105589e;
            if (obj2 == null) {
                return Unit.f71690a;
            }
            interfaceC7087b = this.f105590f.f105592a;
            String key = this.f105591g.getKey();
            this.f105588d = 1;
            if (interfaceC7087b.a(key, obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
