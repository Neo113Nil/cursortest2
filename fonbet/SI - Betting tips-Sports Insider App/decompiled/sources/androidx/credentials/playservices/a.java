package androidx.credentials.playservices;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements w7.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f1481b;

    public /* synthetic */ a(Function1 function1, int i5) {
        this.f1480a = i5;
        this.f1481b = function1;
    }

    @Override // w7.d
    public final void onSuccess(Object obj) {
        switch (this.f1480a) {
            case 0:
                this.f1481b.invoke(obj);
                break;
            case 1:
                this.f1481b.invoke(obj);
                break;
            case 2:
                this.f1481b.invoke(obj);
                break;
            case 3:
                this.f1481b.invoke(obj);
                break;
            case 4:
                this.f1481b.invoke(obj);
                break;
            default:
                this.f1481b.invoke(obj);
                break;
        }
    }
}
