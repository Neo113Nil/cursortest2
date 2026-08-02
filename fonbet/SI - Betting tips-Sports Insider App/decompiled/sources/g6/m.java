package g6;

import android.content.Intent;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f9856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9857b;

    public m(Intent intent, e6.h hVar) {
        this.f9856a = intent;
        this.f9857b = hVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e6.h, java.lang.Object] */
    @Override // g6.n
    public final void a() {
        Intent intent = this.f9856a;
        if (intent != null) {
            this.f9857b.startActivityForResult(intent, 2);
        }
    }
}
