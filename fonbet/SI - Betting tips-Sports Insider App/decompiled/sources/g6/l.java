package g6;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f9854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GoogleApiActivity f9855b;

    public l(Intent intent, GoogleApiActivity googleApiActivity) {
        this.f9854a = intent;
        this.f9855b = googleApiActivity;
    }

    @Override // g6.n
    public final void a() {
        Intent intent = this.f9854a;
        if (intent != null) {
            this.f9855b.startActivityForResult(intent, 2);
        }
    }
}
