package B4;

import B4.n;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class f implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f709a;

    /* renamed from: b, reason: collision with root package name */
    public final e f710b;

    public interface e {
        Class a();

        void b(Object obj);

        Object c(Resources.Theme theme, Resources resources, int i10);
    }

    public f(Context context, e eVar) {
        this.f709a = context.getApplicationContext();
        this.f710b = eVar;
    }

    public static o c(Context context) {
        return new a(context);
    }

    public static o e(Context context) {
        return new b(context);
    }

    public static o g(Context context) {
        return new c(context);
    }

    @Override // B4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public n.a b(Integer num, int i10, int i11, com.bumptech.glide.load.j jVar) {
        Resources.Theme theme = (Resources.Theme) jVar.c(F4.m.f3563b);
        return new n.a(new O4.c(num), new d(theme, theme != null ? theme.getResources() : this.f709a.getResources(), this.f710b, num.intValue()));
    }

    @Override // B4.n
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(Integer num) {
        return true;
    }

    public static final class a implements o, e {

        /* renamed from: a, reason: collision with root package name */
        public final Context f711a;

        public a(Context context) {
            this.f711a = context;
        }

        @Override // B4.f.e
        public Class a() {
            return AssetFileDescriptor.class;
        }

        @Override // B4.o
        public n e(r rVar) {
            return new f(this.f711a, this);
        }

        @Override // B4.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(AssetFileDescriptor assetFileDescriptor) {
            assetFileDescriptor.close();
        }

        @Override // B4.f.e
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }

        @Override // B4.o
        public void d() {
        }
    }

    public static final class b implements o, e {

        /* renamed from: a, reason: collision with root package name */
        public final Context f712a;

        public b(Context context) {
            this.f712a = context;
        }

        @Override // B4.f.e
        public Class a() {
            return Drawable.class;
        }

        @Override // B4.o
        public n e(r rVar) {
            return new f(this.f712a, this);
        }

        @Override // B4.f.e
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Drawable c(Resources.Theme theme, Resources resources, int i10) {
            return F4.i.a(this.f712a, i10, theme);
        }

        @Override // B4.o
        public void d() {
        }

        @Override // B4.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(Drawable drawable) {
        }
    }

    public static final class c implements o, e {

        /* renamed from: a, reason: collision with root package name */
        public final Context f713a;

        public c(Context context) {
            this.f713a = context;
        }

        @Override // B4.f.e
        public Class a() {
            return InputStream.class;
        }

        @Override // B4.o
        public n e(r rVar) {
            return new f(this.f713a, this);
        }

        @Override // B4.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(InputStream inputStream) {
            inputStream.close();
        }

        @Override // B4.f.e
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public InputStream c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }

        @Override // B4.o
        public void d() {
        }
    }

    public static final class d implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        public final Resources.Theme f714a;

        /* renamed from: b, reason: collision with root package name */
        public final Resources f715b;

        /* renamed from: c, reason: collision with root package name */
        public final e f716c;

        /* renamed from: d, reason: collision with root package name */
        public final int f717d;

        /* renamed from: e, reason: collision with root package name */
        public Object f718e;

        public d(Resources.Theme theme, Resources resources, e eVar, int i10) {
            this.f714a = theme;
            this.f715b = resources;
            this.f716c = eVar;
            this.f717d = i10;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f716c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Object obj = this.f718e;
            if (obj != null) {
                try {
                    this.f716c.b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, d.a aVar) {
            try {
                Object c10 = this.f716c.c(this.f714a, this.f715b, this.f717d);
                this.f718e = c10;
                aVar.f(c10);
            } catch (Resources.NotFoundException e10) {
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
