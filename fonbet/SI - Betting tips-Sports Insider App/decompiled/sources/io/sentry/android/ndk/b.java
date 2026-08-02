package io.sentry.android.ndk;

import io.sentry.ndk.NativeScope;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f15917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15918c;

    public /* synthetic */ b(c cVar, String str, int i5) {
        this.f15916a = i5;
        this.f15917b = cVar;
        this.f15918c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15916a) {
            case 0:
                this.f15917b.f15920b.getClass();
                NativeScope.nativeRemoveTag(this.f15918c);
                break;
            default:
                this.f15917b.f15920b.getClass();
                NativeScope.nativeSetExtra("sessionURL", this.f15918c);
                break;
        }
    }
}
