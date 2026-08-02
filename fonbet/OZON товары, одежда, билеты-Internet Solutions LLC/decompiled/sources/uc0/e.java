package uc0;

import Fb0.f;
import Sc.s;
import dc0.C6146J;
import dc0.C6176v;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.migration.domain.MigrateSharedStoreUseCase$migrateCrossAppAsync$1", f = "MigrateSharedStoreUseCase.kt", l = {130, 134}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f100638d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C10020a f100639e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ List<C6146J> f100640f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(C10020a c10020a, List<C6146J> list, kotlin.coroutines.d<? super e> dVar) {
        super(2, dVar);
        this.f100639e = c10020a;
        this.f100640f = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(this.f100639e, this.f100640f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r8 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002b, code lost:
    
        if (r8 == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C6176v c6176v;
        Object obj2;
        Object g10;
        f fVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f100638d;
        C10020a c10020a = this.f100639e;
        if (i11 == 0) {
            s.b(obj);
            c6176v = c10020a.f100607c;
            this.f100638d = 1;
            obj = c6176v.c(this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        Long l11 = (Long) obj;
        Iterator<T> it = this.f100640f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            C6146J c6146j = (C6146J) obj2;
            if (Intrinsics.d(c6146j.c().h(), l11)) {
                String a11 = c6146j.a();
                fVar = c10020a.f100606b;
                if (Intrinsics.d(a11, fVar.getAppName().a())) {
                    break;
                }
            }
        }
        C6146J c6146j2 = (C6146J) obj2;
        if (c6146j2 == null) {
            return Unit.f71690a;
        }
        List a02 = C7714v.a0(c6146j2);
        this.f100638d = 2;
        g10 = c10020a.g(a02, this);
    }
}
