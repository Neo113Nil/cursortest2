package A0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f12a;

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final InputContentInfo f13a;

        public a(Object obj) {
            this.f13a = (InputContentInfo) obj;
        }

        @Override // A0.d.b
        public Object a() {
            return this.f13a;
        }

        @Override // A0.d.b
        public Uri b() {
            return this.f13a.getContentUri();
        }

        @Override // A0.d.b
        public void c() {
            this.f13a.requestPermission();
        }

        @Override // A0.d.b
        public Uri d() {
            return this.f13a.getLinkUri();
        }

        @Override // A0.d.b
        public ClipDescription getDescription() {
            return this.f13a.getDescription();
        }
    }

    public interface b {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public d(b bVar) {
        this.f12a = bVar;
    }

    public static d f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new d(new a(obj));
    }

    public Uri a() {
        return this.f12a.b();
    }

    public ClipDescription b() {
        return this.f12a.getDescription();
    }

    public Uri c() {
        return this.f12a.d();
    }

    public void d() {
        this.f12a.c();
    }

    public Object e() {
        return this.f12a.a();
    }
}
