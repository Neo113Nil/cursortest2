package com.google.android.material.textfield;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5975a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5976b;

    public /* synthetic */ d(int i5, Object obj) {
        this.f5975a = i5;
        this.f5976b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5975a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f5976b).lambda$tearDown$2();
                break;
            case 1:
                ((DropdownMenuEndIconDelegate) this.f5976b).lambda$afterEditTextChanged$3();
                break;
            default:
                ((TextInputLayout) this.f5976b).lambda$onGlobalLayout$1();
                break;
        }
    }
}
