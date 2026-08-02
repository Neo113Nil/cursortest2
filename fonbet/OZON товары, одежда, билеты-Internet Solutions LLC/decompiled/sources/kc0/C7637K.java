package kc0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.id.nativeauth.data.models.b;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel$onSocialLogin$1", f = "EntryCredentialsViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: kc0.K, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7637K extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ b.c f71291d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7629C f71292e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C7645c f71293f;

    /* renamed from: kc0.K$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71294a;

        static {
            int[] iArr = new int[EntryDTO.b.values().length];
            try {
                iArr[EntryDTO.b.VKID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f71294a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7637K(b.c cVar, C7629C c7629c, C7645c c7645c, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f71291d = cVar;
        this.f71292e = c7629c;
        this.f71293f = c7645c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7637K(this.f71291d, this.f71292e, this.f71293f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7637K) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String c11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        b.c cVar = this.f71291d;
        EntryDTO.b e11 = cVar.e();
        if ((e11 == null ? -1 : a.f71294a[e11.ordinal()]) != 1) {
            return Unit.f71690a;
        }
        kotlin.reflect.m<Object>[] mVarArr = C7629C.f71211y0;
        C7629C c7629c = this.f71292e;
        c7629c.getClass();
        String a11 = cVar.a();
        if (a11 != null && (c11 = cVar.c()) != null) {
            c7629c.L0(a11, c11, this.f71293f);
        }
        return Unit.f71690a;
    }
}
