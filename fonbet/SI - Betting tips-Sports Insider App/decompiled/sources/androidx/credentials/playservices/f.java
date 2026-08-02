package androidx.credentials.playservices;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements w7.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HiddenActivity f1542b;

    public /* synthetic */ f(HiddenActivity hiddenActivity, int i5) {
        this.f1541a = i5;
        this.f1542b = hiddenActivity;
    }

    @Override // w7.c
    public final void c(Exception exc) {
        switch (this.f1541a) {
            case 0:
                HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$1(this.f1542b, exc);
                break;
            case 1:
                HiddenActivity.handleCreatePassword$lambda$14$lambda$13(this.f1542b, exc);
                break;
            case 2:
                HiddenActivity.handleGetSignInIntent$lambda$6$lambda$5(this.f1542b, exc);
                break;
            default:
                HiddenActivity.handleBeginSignIn$lambda$10$lambda$9(this.f1542b, exc);
                break;
        }
    }
}
