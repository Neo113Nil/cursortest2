package com.logrocket.core;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f6643b;

    public /* synthetic */ v(x xVar, int i5) {
        this.f6642a = i5;
        this.f6643b = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6642a) {
            case 0:
                this.f6643b.a(true);
                break;
            default:
                this.f6643b.a(false);
                break;
        }
    }
}
