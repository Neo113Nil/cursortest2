package ru.ozon.android.messenger.blocks.input.attachments.data;

import Sc.s;
import android.net.Uri;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.data.remote.UploadFileResponse;
import ru.ozon.android.messenger.utils.i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.attachments.data.UploadAttachmentsRepositoryImpl$uploadPhotoAttachment$2", f = "UploadAttachmentsRepository.kt", l = {DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends b>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    b f85382d;

    /* renamed from: e, reason: collision with root package name */
    int f85383e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ j f85384f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ b f85385g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f85386h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(j jVar, b bVar, String str, kotlin.coroutines.d<? super i> dVar) {
        super(2, dVar);
        this.f85384f = jVar;
        this.f85385g = bVar;
        this.f85386h = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new i(this.f85384f, this.f85385g, this.f85386h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends b>> dVar) {
        return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.utils.image.a aVar;
        c cVar;
        b bVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f85383e;
        if (i11 == 0) {
            s.b(obj);
            j jVar = this.f85384f;
            aVar = jVar.f85388b;
            b bVar2 = this.f85385g;
            ru.ozon.android.messenger.utils.i<b> a11 = aVar.a(bVar2);
            b a12 = a11.a();
            if (a12 == null) {
                return a11;
            }
            cVar = jVar.f85387a;
            Intrinsics.checkNotNullParameter(a12, "<this>");
            String f7 = a12.f();
            l lVar = new l(f7 != null ? Uri.parse(f7) : null, this.f85386h, a12.e());
            this.f85382d = bVar2;
            this.f85383e = 1;
            obj = cVar.a(lVar, this);
            if (obj == aVar2) {
                return aVar2;
            }
            bVar = bVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = this.f85382d;
            s.b(obj);
        }
        ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
        UploadFileResponse uploadFileResponse = (UploadFileResponse) iVar.a();
        return uploadFileResponse != null ? new i.b(b.a(bVar, uploadFileResponse.getUrl(), null, null, null, null, null, 125)) : (i.a) iVar;
    }
}
