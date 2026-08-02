package B4;

import B4.n;
import android.content.res.AssetManager;
import android.net.Uri;

/* loaded from: classes2.dex */
public class a implements n {

    /* renamed from: c, reason: collision with root package name */
    public static final int f693c = 22;

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f694a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0015a f695b;

    /* renamed from: B4.a$a, reason: collision with other inner class name */
    public interface InterfaceC0015a {
        com.bumptech.glide.load.data.d a(AssetManager assetManager, String str);
    }

    public a(AssetManager assetManager, InterfaceC0015a interfaceC0015a) {
        this.f694a = assetManager;
        this.f695b = interfaceC0015a;
    }

    @Override // B4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, com.bumptech.glide.load.j jVar) {
        return new n.a(new O4.c(uri), this.f695b.a(this.f694a, uri.toString().substring(f693c)));
    }

    @Override // B4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    public static class b implements o, InterfaceC0015a {

        /* renamed from: a, reason: collision with root package name */
        public final AssetManager f696a;

        public b(AssetManager assetManager) {
            this.f696a = assetManager;
        }

        @Override // B4.a.InterfaceC0015a
        public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // B4.o
        public n e(r rVar) {
            return new a(this.f696a, this);
        }

        @Override // B4.o
        public void d() {
        }
    }

    public static class c implements o, InterfaceC0015a {

        /* renamed from: a, reason: collision with root package name */
        public final AssetManager f697a;

        public c(AssetManager assetManager) {
            this.f697a = assetManager;
        }

        @Override // B4.a.InterfaceC0015a
        public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // B4.o
        public n e(r rVar) {
            return new a(this.f697a, this);
        }

        @Override // B4.o
        public void d() {
        }
    }
}
