package com.google.android.material.timepicker;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5983b;

    public /* synthetic */ b(int i5, Object obj) {
        this.f5982a = i5;
        this.f5983b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5982a) {
            case 0:
                ((RadialViewGroup) this.f5983b).updateLayoutParams();
                break;
            default:
                ((MaterialTimePicker) this.f5983b).lambda$onViewCreated$0();
                break;
        }
    }
}
