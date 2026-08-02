package com.google.android.material.search;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5941a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f5942b;

    public /* synthetic */ i(SearchView searchView, int i5) {
        this.f5941a = i5;
        this.f5942b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5941a) {
            case 0:
                this.f5942b.lambda$requestFocusAndShowKeyboard$8();
                break;
            case 1:
                this.f5942b.show();
                break;
            case 2:
                this.f5942b.lambda$clearFocusAndHideKeyboard$9();
                break;
            default:
                this.f5942b.requestFocusAndShowKeyboardIfNeeded();
                break;
        }
    }
}
