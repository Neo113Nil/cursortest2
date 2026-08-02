package c0;

import android.content.Intent;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f3278a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f3280c;

    public k(o oVar, Intent intent, int i5) {
        this.f3280c = oVar;
        this.f3278a = intent;
        this.f3279b = i5;
    }

    @Override // c0.l
    public final void a() {
        this.f3280c.stopSelf(this.f3279b);
    }

    @Override // c0.l
    public final Intent getIntent() {
        return this.f3278a;
    }
}
