package ru.ozon.android.messenger.blocks.input.attachments.data;

import Sc.s;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.data.remote.UploadFileResponse;
import ru.ozon.android.messenger.utils.i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.attachments.data.UploadAttachmentsRepositoryImpl$uploadFileAttachment$2", f = "UploadAttachmentsRepository.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends a>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    a f85377d;

    /* renamed from: e, reason: collision with root package name */
    int f85378e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ j f85379f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ a f85380g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f85381h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(j jVar, a aVar, String str, kotlin.coroutines.d<? super h> dVar) {
        super(2, dVar);
        this.f85379f = jVar;
        this.f85380g = aVar;
        this.f85381h = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new h(this.f85379f, this.f85380g, this.f85381h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends a>> dVar) {
        return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        c cVar;
        a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f85378e;
        if (i11 == 0) {
            s.b(obj);
            a aVar3 = this.f85380g;
            j jVar = this.f85379f;
            ru.ozon.android.messenger.utils.i c11 = j.c(jVar, aVar3);
            a aVar4 = (a) c11.a();
            if (aVar4 == null) {
                return c11;
            }
            cVar = jVar.f85387a;
            Intrinsics.checkNotNullParameter(aVar4, "<this>");
            String f7 = aVar4.f();
            l lVar = new l(f7 != null ? Uri.parse(f7) : null, this.f85381h, aVar4.e());
            this.f85377d = aVar4;
            this.f85378e = 1;
            obj = cVar.b(lVar, this);
            if (obj == aVar2) {
                return aVar2;
            }
            aVar = aVar4;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.f85377d;
            s.b(obj);
        }
        ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
        UploadFileResponse uploadFileResponse = (UploadFileResponse) iVar.a();
        return uploadFileResponse != null ? new i.b(a.a(aVar, uploadFileResponse.getUrl(), null, null, null, null, 125)) : (i.a) iVar;
    }
}
