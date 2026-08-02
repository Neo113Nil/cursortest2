package androidx.credentials.playservices.controllers.GetRestoreCredential;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements w7.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f1519b;

    public /* synthetic */ a(Function1 function1, int i5) {
        this.f1518a = i5;
        this.f1519b = function1;
    }

    @Override // w7.d
    public final void onSuccess(Object obj) {
        switch (this.f1518a) {
            case 0:
                this.f1519b.invoke(obj);
                break;
            default:
                this.f1519b.invoke(obj);
                break;
        }
    }
}
