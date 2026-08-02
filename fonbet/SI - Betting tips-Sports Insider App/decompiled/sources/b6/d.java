package b6;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements w7.a, w7.f {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d f3042b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d f3043c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d f3044d = new d(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3045a;

    public /* synthetic */ d(int i5) {
        this.f3045a = i5;
    }

    @Override // w7.f
    public Task e(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i5 = b.f3032h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? d5.q(bundle) : d5.q(null);
    }

    @Override // w7.a
    public Object f(Task task) {
        switch (this.f3045a) {
            case 0:
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
            default:
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new CloudMessage(intent);
                }
                return null;
        }
    }
}
