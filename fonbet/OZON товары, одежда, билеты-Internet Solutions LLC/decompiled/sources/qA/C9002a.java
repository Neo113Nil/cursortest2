package qA;

import qc.InterfaceC9019a;
import ru.ozon.app.android.mediaupload.video.validation.VideoValidationWebSocket;

/* renamed from: qA.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C9002a implements InterfaceC9019a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VideoValidationWebSocket f81762a;

    public /* synthetic */ C9002a(VideoValidationWebSocket videoValidationWebSocket) {
        this.f81762a = videoValidationWebSocket;
    }

    @Override // qc.InterfaceC9019a
    public final void run() {
        this.f81762a.ozonWebSocket = null;
    }
}
