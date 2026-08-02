package m0;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20103a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentProviderClient f20104b;

    public a(Context context, Uri uri, int i5) {
        this.f20103a = i5;
        switch (i5) {
            case 1:
                this.f20104b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
            default:
                this.f20104b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        switch (this.f20103a) {
            case 0:
                ContentProviderClient contentProviderClient = this.f20104b;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                    break;
                }
                break;
            default:
                ContentProviderClient contentProviderClient2 = this.f20104b;
                if (contentProviderClient2 != 0) {
                    if (!(contentProviderClient2 instanceof AutoCloseable)) {
                        if (!(contentProviderClient2 instanceof ExecutorService)) {
                            contentProviderClient2.release();
                            break;
                        } else {
                            com.appsflyer.internal.h.h((ExecutorService) contentProviderClient2);
                            break;
                        }
                    } else {
                        contentProviderClient2.close();
                        break;
                    }
                }
                break;
        }
    }
}
