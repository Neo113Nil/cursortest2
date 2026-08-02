package Ng;

import Ph.C0;
import Qg.h;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public abstract class e {

    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Qg.b f8090d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Qg.b bVar) {
            super(1);
            this.f8090d = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th2) {
            this.f8090d.close();
        }
    }

    public static final Ng.a a(h engineFactory, Function1 block) {
        Intrinsics.checkNotNullParameter(engineFactory, "engineFactory");
        Intrinsics.checkNotNullParameter(block, "block");
        b bVar = new b();
        block.invoke(bVar);
        Qg.b a10 = engineFactory.a(bVar.c());
        Ng.a aVar = new Ng.a(a10, bVar, true);
        CoroutineContext.Element element = aVar.getCoroutineContext().get(C0.f9001U2);
        Intrinsics.checkNotNull(element);
        ((C0) element).invokeOnCompletion(new a(a10));
        return aVar;
    }
}
