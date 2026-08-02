package A7;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import w6.InterfaceC6713d;

/* renamed from: A7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1023b implements InterfaceC6713d {

    /* renamed from: a, reason: collision with root package name */
    public final String f198a;

    /* renamed from: b, reason: collision with root package name */
    public final B7.g f199b;

    /* renamed from: c, reason: collision with root package name */
    public final B7.h f200c;

    /* renamed from: d, reason: collision with root package name */
    public final B7.d f201d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC6713d f202e;

    /* renamed from: f, reason: collision with root package name */
    public final String f203f;

    /* renamed from: g, reason: collision with root package name */
    public Object f204g;

    /* renamed from: h, reason: collision with root package name */
    public final int f205h;

    /* renamed from: i, reason: collision with root package name */
    public final long f206i;

    public C1023b(String sourceString, B7.g gVar, B7.h rotationOptions, B7.d imageDecodeOptions, InterfaceC6713d interfaceC6713d, String str) {
        Intrinsics.checkNotNullParameter(sourceString, "sourceString");
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(imageDecodeOptions, "imageDecodeOptions");
        this.f198a = sourceString;
        this.f199b = gVar;
        this.f200c = rotationOptions;
        this.f201d = imageDecodeOptions;
        this.f202e = interfaceC6713d;
        this.f203f = str;
        this.f205h = (((((((((sourceString.hashCode() * 31) + (gVar != null ? gVar.hashCode() : 0)) * 31) + rotationOptions.hashCode()) * 31) + imageDecodeOptions.hashCode()) * 31) + (interfaceC6713d != null ? interfaceC6713d.hashCode() : 0)) * 31) + (str != null ? str.hashCode() : 0);
        this.f206i = RealtimeSinceBootClock.get().now();
    }

    @Override // w6.InterfaceC6713d
    public String a() {
        return this.f198a;
    }

    @Override // w6.InterfaceC6713d
    public boolean b(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String a10 = a();
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        return StringsKt.contains$default((CharSequence) a10, (CharSequence) uri2, false, 2, (Object) null);
    }

    @Override // w6.InterfaceC6713d
    public boolean c() {
        return false;
    }

    public final void d(Object obj) {
        this.f204g = obj;
    }

    @Override // w6.InterfaceC6713d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C1023b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.cache.BitmapMemoryCacheKey");
        C1023b c1023b = (C1023b) obj;
        return Intrinsics.areEqual(this.f198a, c1023b.f198a) && Intrinsics.areEqual(this.f199b, c1023b.f199b) && Intrinsics.areEqual(this.f200c, c1023b.f200c) && Intrinsics.areEqual(this.f201d, c1023b.f201d) && Intrinsics.areEqual(this.f202e, c1023b.f202e) && Intrinsics.areEqual(this.f203f, c1023b.f203f);
    }

    @Override // w6.InterfaceC6713d
    public int hashCode() {
        return this.f205h;
    }

    public String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.f198a + ", resizeOptions=" + this.f199b + ", rotationOptions=" + this.f200c + ", imageDecodeOptions=" + this.f201d + ", postprocessorCacheKey=" + this.f202e + ", postprocessorName=" + this.f203f + ")";
    }
}
