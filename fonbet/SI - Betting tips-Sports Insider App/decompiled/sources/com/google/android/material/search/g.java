package com.google.android.material.search;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5938b;

    public /* synthetic */ g(int i5, Object obj) {
        this.f5937a = i5;
        this.f5938b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5937a) {
            case 0:
                ((SearchViewAnimationHelper) this.f5938b).hide();
                break;
            case 1:
                ((SearchViewAnimationHelper) this.f5938b).lambda$startShowAnimationExpand$0();
                break;
            case 2:
                ((SearchViewAnimationHelper) this.f5938b).lambda$startShowAnimationTranslate$1();
                break;
            default:
                ((SearchBar) this.f5938b).lambda$startOnLoadAnimation$0();
                break;
        }
    }
}
