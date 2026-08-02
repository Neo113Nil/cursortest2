package M7;

import D6.k;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import w6.InterfaceC6713d;
import w6.i;

/* loaded from: classes2.dex */
public class a extends com.facebook.imagepipeline.request.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f7546a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7547b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC6713d f7548c;

    public a(int i10, int i11) {
        k.b(Boolean.valueOf(i10 > 0));
        k.b(Boolean.valueOf(i11 > 0));
        this.f7546a = i10;
        this.f7547b = i11;
    }

    @Override // com.facebook.imagepipeline.request.a, com.facebook.imagepipeline.request.d
    public InterfaceC6713d getPostprocessorCacheKey() {
        if (this.f7548c == null) {
            this.f7548c = new i(String.format(null, "i%dr%d", Integer.valueOf(this.f7546a), Integer.valueOf(this.f7547b)));
        }
        return this.f7548c;
    }

    @Override // com.facebook.imagepipeline.request.a
    public void process(Bitmap bitmap) {
        NativeBlurFilter.a(bitmap, this.f7546a, this.f7547b);
    }
}
