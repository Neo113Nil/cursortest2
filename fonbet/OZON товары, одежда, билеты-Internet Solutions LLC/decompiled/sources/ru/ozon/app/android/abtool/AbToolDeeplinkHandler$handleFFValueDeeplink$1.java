package ru.ozon.app.android.abtool;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.abtool.AbToolDeeplinkHandler$handleFFValueDeeplink$1", f = "AbToolDeeplinkHandler.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AbToolDeeplinkHandler$handleFFValueDeeplink$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AbToolImpl $abTool;
    final /* synthetic */ String $ff;
    final /* synthetic */ String $namespace;
    final /* synthetic */ String $serviceName;
    final /* synthetic */ String $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbToolDeeplinkHandler$handleFFValueDeeplink$1(AbToolImpl abToolImpl, String str, String str2, String str3, String str4, d<? super AbToolDeeplinkHandler$handleFFValueDeeplink$1> dVar) {
        super(2, dVar);
        this.$abTool = abToolImpl;
        this.$serviceName = str;
        this.$ff = str2;
        this.$value = str3;
        this.$namespace = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AbToolDeeplinkHandler$handleFFValueDeeplink$1(this.$abTool, this.$serviceName, this.$ff, this.$value, this.$namespace, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            AbToolImpl abToolImpl = this.$abTool;
            String e11 = U7.d.e(this.$serviceName, this.$ff);
            String str = this.$value;
            AbToolNamespace fromStringOrDefault = AbToolNamespace.INSTANCE.fromStringOrDefault(this.$namespace);
            this.label = 1;
            if (abToolImpl.updateLocalValue$abzone_release(e11, str, fromStringOrDefault, this) == aVar) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AbToolDeeplinkHandler$handleFFValueDeeplink$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
