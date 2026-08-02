package ru.ozon.fintech.features.camera.domain;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.fintech.features.camera.domain.CameraInteractor", f = "CameraInteractor.kt", l = {153}, m = "ensureTestCookie")
/* loaded from: classes3.dex */
final class CameraInteractor$ensureTestCookie$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CameraInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraInteractor$ensureTestCookie$1(CameraInteractor cameraInteractor, d<? super CameraInteractor$ensureTestCookie$1> dVar) {
        super(dVar);
        this.this$0 = cameraInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.ensureTestCookie(this);
    }
}
