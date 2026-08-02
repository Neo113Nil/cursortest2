package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* renamed from: androidx.core.view.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2081d {

    /* renamed from: a, reason: collision with root package name */
    public final f f19190a;

    /* renamed from: androidx.core.view.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final c f19191a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f19191a = new b(clipData, i10);
            } else {
                this.f19191a = new C0364d(clipData, i10);
            }
        }

        public C2081d a() {
            return this.f19191a.build();
        }

        public a b(Bundle bundle) {
            this.f19191a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f19191a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f19191a.a(uri);
            return this;
        }
    }

    /* renamed from: androidx.core.view.d$b */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f19192a;

        public b(ClipData clipData, int i10) {
            this.f19192a = AbstractC2087g.a(clipData, i10);
        }

        @Override // androidx.core.view.C2081d.c
        public void a(Uri uri) {
            this.f19192a.setLinkUri(uri);
        }

        @Override // androidx.core.view.C2081d.c
        public void b(int i10) {
            this.f19192a.setFlags(i10);
        }

        @Override // androidx.core.view.C2081d.c
        public C2081d build() {
            ContentInfo build;
            build = this.f19192a.build();
            return new C2081d(new e(build));
        }

        @Override // androidx.core.view.C2081d.c
        public void setExtras(Bundle bundle) {
            this.f19192a.setExtras(bundle);
        }
    }

    /* renamed from: androidx.core.view.d$c */
    public interface c {
        void a(Uri uri);

        void b(int i10);

        C2081d build();

        void setExtras(Bundle bundle);
    }

    /* renamed from: androidx.core.view.d$d, reason: collision with other inner class name */
    public static final class C0364d implements c {

        /* renamed from: a, reason: collision with root package name */
        public ClipData f19193a;

        /* renamed from: b, reason: collision with root package name */
        public int f19194b;

        /* renamed from: c, reason: collision with root package name */
        public int f19195c;

        /* renamed from: d, reason: collision with root package name */
        public Uri f19196d;

        /* renamed from: e, reason: collision with root package name */
        public Bundle f19197e;

        public C0364d(ClipData clipData, int i10) {
            this.f19193a = clipData;
            this.f19194b = i10;
        }

        @Override // androidx.core.view.C2081d.c
        public void a(Uri uri) {
            this.f19196d = uri;
        }

        @Override // androidx.core.view.C2081d.c
        public void b(int i10) {
            this.f19195c = i10;
        }

        @Override // androidx.core.view.C2081d.c
        public C2081d build() {
            return new C2081d(new g(this));
        }

        @Override // androidx.core.view.C2081d.c
        public void setExtras(Bundle bundle) {
            this.f19197e = bundle;
        }
    }

    /* renamed from: androidx.core.view.d$e */
    public static final class e implements f {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo f19198a;

        public e(ContentInfo contentInfo) {
            this.f19198a = AbstractC2079c.a(x0.f.g(contentInfo));
        }

        @Override // androidx.core.view.C2081d.f
        public ContentInfo a() {
            return this.f19198a;
        }

        @Override // androidx.core.view.C2081d.f
        public int b() {
            int source;
            source = this.f19198a.getSource();
            return source;
        }

        @Override // androidx.core.view.C2081d.f
        public ClipData c() {
            ClipData clip;
            clip = this.f19198a.getClip();
            return clip;
        }

        @Override // androidx.core.view.C2081d.f
        public int d() {
            int flags;
            flags = this.f19198a.getFlags();
            return flags;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f19198a + "}";
        }
    }

    /* renamed from: androidx.core.view.d$f */
    public interface f {
        ContentInfo a();

        int b();

        ClipData c();

        int d();
    }

    /* renamed from: androidx.core.view.d$g */
    public static final class g implements f {

        /* renamed from: a, reason: collision with root package name */
        public final ClipData f19199a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19200b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19201c;

        /* renamed from: d, reason: collision with root package name */
        public final Uri f19202d;

        /* renamed from: e, reason: collision with root package name */
        public final Bundle f19203e;

        public g(C0364d c0364d) {
            this.f19199a = (ClipData) x0.f.g(c0364d.f19193a);
            this.f19200b = x0.f.c(c0364d.f19194b, 0, 5, "source");
            this.f19201c = x0.f.f(c0364d.f19195c, 1);
            this.f19202d = c0364d.f19196d;
            this.f19203e = c0364d.f19197e;
        }

        @Override // androidx.core.view.C2081d.f
        public ContentInfo a() {
            return null;
        }

        @Override // androidx.core.view.C2081d.f
        public int b() {
            return this.f19200b;
        }

        @Override // androidx.core.view.C2081d.f
        public ClipData c() {
            return this.f19199a;
        }

        @Override // androidx.core.view.C2081d.f
        public int d() {
            return this.f19201c;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f19199a.getDescription());
            sb2.append(", source=");
            sb2.append(C2081d.e(this.f19200b));
            sb2.append(", flags=");
            sb2.append(C2081d.a(this.f19201c));
            if (this.f19202d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f19202d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f19203e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }
    }

    public C2081d(f fVar) {
        this.f19190a = fVar;
    }

    public static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    public static String e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static C2081d g(ContentInfo contentInfo) {
        return new C2081d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f19190a.c();
    }

    public int c() {
        return this.f19190a.d();
    }

    public int d() {
        return this.f19190a.b();
    }

    public ContentInfo f() {
        ContentInfo a10 = this.f19190a.a();
        Objects.requireNonNull(a10);
        return AbstractC2079c.a(a10);
    }

    public String toString() {
        return this.f19190a.toString();
    }
}
