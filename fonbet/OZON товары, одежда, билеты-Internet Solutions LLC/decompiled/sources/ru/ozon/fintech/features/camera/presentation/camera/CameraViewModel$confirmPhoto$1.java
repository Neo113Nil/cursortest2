package ru.ozon.fintech.features.camera.presentation.camera;

import Sc.s;
import android.net.Uri;
import g30.InterfaceC6618a;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.camera.domain.CameraInteractor;
import ru.ozon.fintech.network.models.a;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.fintech.features.camera.presentation.camera.CameraViewModel$confirmPhoto$1", f = "CameraViewModel.kt", l = {579, 581}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CameraViewModel$confirmPhoto$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ File $file;
    final /* synthetic */ long $videoUploadStart;
    int label;
    final /* synthetic */ CameraViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraViewModel$confirmPhoto$1(CameraViewModel cameraViewModel, File file, long j11, d<? super CameraViewModel$confirmPhoto$1> dVar) {
        super(2, dVar);
        this.this$0 = cameraViewModel;
        this.$file = file;
        this.$videoUploadStart = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CameraViewModel$confirmPhoto$1(this.this$0, this.$file, this.$videoUploadStart, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r10 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC6618a interfaceC6618a;
        CameraInteractor cameraInteractor;
        CameraInteractor cameraInteractor2;
        InterfaceC6618a interfaceC6618a2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Exception e11) {
            L80.a.a("VIDEO_FLOW", "exception=" + e11);
            if (e11 instanceof CancellationException) {
                this.this$0.videoUploadState = a.b.f96629a;
            } else {
                int currentTimeMillis = (int) ((System.currentTimeMillis() - this.$videoUploadStart) / 1000);
                interfaceC6618a = this.this$0.analyticInteractor;
                interfaceC6618a.P0(currentTimeMillis, e11.getMessage(), false);
                if (this.this$0.getVideoUploadAttempt() >= 3) {
                    this.this$0.actuallyConfirmPhoto(null);
                } else {
                    this.this$0.videoUploadState = new a.C2102a(e11);
                    int videoUploadAttempt = this.this$0.getVideoUploadAttempt();
                    this.this$0.setVideoUploadAttempt(videoUploadAttempt + 1);
                    new Integer(videoUploadAttempt);
                }
            }
            this.this$0.handleState();
        }
        if (i11 == 0) {
            s.b(obj);
            this.this$0.videoUploadState = a.c.f96630a;
            this.this$0.handleState();
            cameraInteractor = this.this$0.cameraInteractor;
            this.label = 1;
            if (cameraInteractor.ensureTestCookie(this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                int currentTimeMillis2 = (int) ((System.currentTimeMillis() - this.$videoUploadStart) / 1000);
                interfaceC6618a2 = this.this$0.analyticInteractor;
                interfaceC6618a2.P0(currentTimeMillis2, null, true);
                this.this$0.actuallyConfirmPhoto((String) obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        cameraInteractor2 = this.this$0.cameraInteractor;
        Uri fromFile = Uri.fromFile(this.$file);
        this.label = 2;
        obj = cameraInteractor2.uploadVideo(fromFile, "ident", this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CameraViewModel$confirmPhoto$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
