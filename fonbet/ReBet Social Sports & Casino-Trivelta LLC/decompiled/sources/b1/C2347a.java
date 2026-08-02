package b1;

import android.view.View;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2347a {

    /* renamed from: a, reason: collision with root package name */
    public final View f24533a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24534b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24535c;

    /* renamed from: b1.a$a, reason: collision with other inner class name */
    public static final class C0429a {

        /* renamed from: a, reason: collision with root package name */
        public final View f24536a;

        /* renamed from: b, reason: collision with root package name */
        public final int f24537b;

        /* renamed from: c, reason: collision with root package name */
        public String f24538c;

        public C0429a(View view, int i10) {
            this.f24536a = view;
            this.f24537b = i10;
        }

        public C2347a a() {
            return new C2347a(this.f24536a, this.f24537b, this.f24538c);
        }

        public C0429a b(String str) {
            this.f24538c = str;
            return this;
        }
    }

    public C2347a(View view, int i10, String str) {
        this.f24533a = view;
        this.f24534b = i10;
        this.f24535c = str;
    }
}
