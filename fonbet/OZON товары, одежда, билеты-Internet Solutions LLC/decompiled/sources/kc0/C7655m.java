package kc0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsFragment$observeViewModel$lambda$11$lambda$10$$inlined$collectFlow$3", f = "EntryCredentialsFragment.kt", l = {80}, m = "invokeSuspend")
/* renamed from: kc0.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7655m extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f71352d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f71353e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C7645c f71354f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Jb0.m f71355g;

    /* renamed from: kc0.m$a */
    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7645c f71356a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Jb0.m f71357b;

        public a(C7645c c7645c, Jb0.m mVar) {
            this.f71356a = c7645c;
            this.f71357b = mVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            boolean booleanValue = ((Boolean) t2).booleanValue();
            this.f71356a.getClass();
            TextFieldCellView textFieldCellView = this.f71357b.f14504e;
            if (booleanValue) {
                Intrinsics.f(textFieldCellView);
                cc0.c.d(textFieldCellView);
            } else {
                Intrinsics.f(textFieldCellView);
                ViewExtKt.hideKeyboard(textFieldCellView);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7655m(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, C7645c c7645c, Jb0.m mVar) {
        super(2, dVar);
        this.f71353e = interfaceC2395h;
        this.f71354f = c7645c;
        this.f71355g = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7655m(this.f71353e, dVar, this.f71354f, this.f71355g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7655m) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f71352d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f71354f, this.f71355g);
            this.f71352d = 1;
            if (this.f71353e.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
