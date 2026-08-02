package ru.ozon.fintech.features.camera.domain;

import Sc.s;
import Wc.a;
import android.net.Uri;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.fintech.features.camera.domain.CameraInteractor$clearPhotoFile$1", f = "CameraInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CameraInteractor$clearPhotoFile$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Uri $filePathUri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraInteractor$clearPhotoFile$1(Uri uri, d<? super CameraInteractor$clearPhotoFile$1> dVar) {
        super(2, dVar);
        this.$filePathUri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CameraInteractor$clearPhotoFile$1(this.$filePathUri, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        String encodedPath = this.$filePathUri.getEncodedPath();
        if (encodedPath != null) {
            File file = new File(encodedPath);
            if (file.exists()) {
                file.delete();
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CameraInteractor$clearPhotoFile$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
