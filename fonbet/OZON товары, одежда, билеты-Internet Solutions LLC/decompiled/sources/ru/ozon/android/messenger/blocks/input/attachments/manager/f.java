package ru.ozon.android.messenger.blocks.input.attachments.manager;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.input.attachments.manager.a;
import ru.ozon.android.messenger.blocks.input.attachments.presentation.b;
import ru.ozon.android.messenger.utils.i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.attachments.manager.InputAttachmentsManagerImpl$uploadFile$2", f = "InputAttachmentsManager.kt", l = {307}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class f extends j implements Function2<M, kotlin.coroutines.d<? super b.a>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f85439d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ b.a f85440e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Integer f85441f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ d f85442g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(Integer num, kotlin.coroutines.d dVar, d dVar2, b.a aVar) {
        super(2, dVar);
        this.f85440e = aVar;
        this.f85441f = num;
        this.f85442g = dVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f(this.f85441f, dVar, this.f85442g, this.f85440e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super b.a> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.blocks.input.attachments.data.g gVar;
        Object a11;
        ru.ozon.android.messenger.blocks.input.attachments.data.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f85439d;
        b.a aVar3 = this.f85440e;
        if (i11 == 0) {
            s.b(obj);
            String a12 = a.b.a();
            if (a12 != null) {
                gVar = this.f85442g.f85404d;
                Intrinsics.checkNotNullParameter(aVar3, "<this>");
                ru.ozon.android.messenger.blocks.input.attachments.data.a aVar4 = new ru.ozon.android.messenger.blocks.input.attachments.data.a(aVar3.b(), aVar3.g(), aVar3.c(), aVar3.d(), aVar3.j(), aVar3.k(), 8);
                this.f85439d = 1;
                a11 = ((ru.ozon.android.messenger.blocks.input.attachments.data.j) gVar).a(aVar4, a12, this);
                if (a11 == aVar2) {
                    return aVar2;
                }
            }
            aVar = null;
            if (aVar == null) {
                b.c.C1503c c1503c = b.c.C1503c.f85485a;
                Integer num = this.f85441f;
                return b.a.i(aVar3, c1503c, num != null ? num.intValue() : aVar3.a(), 815);
            }
            b.c.a uploadingStatus = b.c.a.f85479a;
            int e11 = aVar3.e();
            int a13 = aVar3.a();
            boolean h11 = aVar3.h();
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            Intrinsics.checkNotNullParameter(uploadingStatus, "uploadingStatus");
            return new b.a(aVar.c(), aVar.h(), aVar.d(), aVar.e(), uploadingStatus, e11, a13, h11, aVar.b(), aVar.g());
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        a11 = obj;
        i iVar = (i) a11;
        if (iVar != null) {
            aVar = (ru.ozon.android.messenger.blocks.input.attachments.data.a) iVar.a();
            if (aVar == null) {
            }
        }
        aVar = null;
        if (aVar == null) {
        }
    }
}
