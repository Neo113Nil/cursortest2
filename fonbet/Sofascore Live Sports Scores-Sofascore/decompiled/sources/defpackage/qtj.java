package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class qtj extends UrlRequest.Callback {
    public final lj2 a;
    public final mqi b = ypa.b(ptj.j);

    public qtj(lj2 lj2Var) {
        this.a = lj2Var;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        urlRequest.getClass();
        lj2 lj2Var = this.a;
        if (lj2Var.r() instanceof oed) {
            lj2Var.a(new CancellationException());
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        urlRequest.getClass();
        cronetException.getClass();
        lj2 lj2Var = this.a;
        if (lj2Var.r() instanceof oed) {
            p2g p2gVar = w2g.b;
            lj2Var.resumeWith(new u2g(cronetException));
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        urlRequest.getClass();
        urlResponseInfo.getClass();
        byteBuffer.getClass();
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.getClass();
        urlResponseInfo.getClass();
        str.getClass();
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        urlRequest.getClass();
        urlResponseInfo.getClass();
        mqi mqiVar = this.b;
        Object value = mqiVar.getValue();
        value.getClass();
        ((ByteBuffer) value).clear();
        Object value2 = mqiVar.getValue();
        value2.getClass();
        urlRequest.read((ByteBuffer) value2);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        urlRequest.getClass();
        urlResponseInfo.getClass();
        lj2 lj2Var = this.a;
        if (lj2Var.r() instanceof oed) {
            p2g p2gVar = w2g.b;
            lj2Var.resumeWith(Integer.valueOf(urlResponseInfo.getHttpStatusCode()));
        }
    }
}
