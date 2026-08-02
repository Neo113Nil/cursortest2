package defpackage;

import android.content.Context;
import com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData;
import com.google.ads.interactivemedia.v3.impl.data.NetworkResponseData;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ywn implements vwn {
    public final vyo a;
    public final boolean b;

    public ywn(Context context, boolean z) {
        this.a = new vyo(context);
        this.b = z;
    }

    @Override // defpackage.vwn
    public final NetworkResponseData a(NetworkRequestData networkRequestData) {
        try {
            NetworkRequestData.RequestType requestType = networkRequestData.requestType();
            NetworkRequestData.RequestType requestType2 = NetworkRequestData.RequestType.GET;
            int i = requestType == requestType2 ? 0 : 1;
            String url = networkRequestData.url();
            String content = networkRequestData.content();
            if (url != null && (requestType == requestType2 || content != null)) {
                return NetworkResponseData.forResponse(networkRequestData.id(), (String) Tasks.await(this.a.j(i, url, content, this.b), networkRequestData.connectionTimeoutMs() + networkRequestData.readTimeoutMs(), TimeUnit.MILLISECONDS));
            }
            return NetworkResponseData.forError(networkRequestData.id(), 100);
        } catch (InterruptedException | TimeoutException unused) {
            return NetworkResponseData.forError(networkRequestData.id(), 101);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof gyo) {
                return NetworkResponseData.forError(networkRequestData.id(), ((gyo) cause).a);
            }
            return cause instanceof ApiException ? NetworkResponseData.forError(networkRequestData.id(), 102) : NetworkResponseData.forError(networkRequestData.id(), 100);
        }
    }
}
