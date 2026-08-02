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

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.attachments.manager.InputAttachmentsManagerImpl$uploadImage$2", f = "InputAttachmentsManager.kt", l = {288}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class g extends j implements Function2<M, kotlin.coroutines.d<? super b.C1500b>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f85443d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ b.C1500b f85444e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Integer f85445f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ d f85446g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(Integer num, kotlin.coroutines.d dVar, d dVar2, b.C1500b c1500b) {
        super(2, dVar);
        this.f85444e = c1500b;
        this.f85445f = num;
        this.f85446g = dVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f85445f, dVar, this.f85446g, this.f85444e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super b.C1500b> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.blocks.input.attachments.data.g gVar;
        Object b11;
        ru.ozon.android.messenger.blocks.input.attachments.data.b bVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f85443d;
        b.C1500b c1500b = this.f85444e;
        if (i11 == 0) {
            s.b(obj);
            String a11 = a.b.a();
            if (a11 != null) {
                gVar = this.f85446g.f85404d;
                Intrinsics.checkNotNullParameter(c1500b, "<this>");
                ru.ozon.android.messenger.blocks.input.attachments.data.b bVar2 = new ru.ozon.android.messenger.blocks.input.attachments.data.b(c1500b.b(), c1500b.g(), c1500b.c(), c1500b.d(), c1500b.getWidth(), c1500b.getHeight(), 8);
                this.f85443d = 1;
                b11 = ((ru.ozon.android.messenger.blocks.input.attachments.data.j) gVar).b(bVar2, a11, this);
                if (b11 == aVar) {
                    return aVar;
                }
            }
            bVar = null;
            if (bVar == null) {
                b.c.C1503c c1503c = b.c.C1503c.f85485a;
                Integer num = this.f85445f;
                return b.C1500b.i(c1500b, c1503c, num != null ? num.intValue() : c1500b.a(), 815);
            }
            b.c.a uploadingStatus = b.c.a.f85479a;
            int e11 = c1500b.e();
            int a12 = c1500b.a();
            boolean h11 = c1500b.h();
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            Intrinsics.checkNotNullParameter(uploadingStatus, "uploadingStatus");
            return new b.C1500b(bVar.c(), bVar.g(), bVar.d(), bVar.e(), uploadingStatus, e11, a12, h11, bVar.h(), bVar.b());
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        b11 = obj;
        i iVar = (i) b11;
        if (iVar != null) {
            bVar = (ru.ozon.android.messenger.blocks.input.attachments.data.b) iVar.a();
            if (bVar == null) {
            }
        }
        bVar = null;
        if (bVar == null) {
        }
    }
}
