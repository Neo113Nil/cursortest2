package Tg;

import Tg.d;
import fh.AbstractC4283a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import zi.InterfaceC7015a;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC7015a f11817a = AbstractC4283a.a("io.ktor.client.plugins.DefaultRequest");

    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function1 f11818d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1) {
            super(1);
            this.f11818d = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((d.a) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(d.a install) {
            Intrinsics.checkNotNullParameter(install, "$this$install");
            this.f11818d.invoke(install);
        }
    }

    public static final void b(Ng.b bVar, Function1 block) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        bVar.h(d.f11808b, new a(block));
    }
}
