package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.graphics.D;
import androidx.emoji2.text.f;
import androidx.emoji2.text.k;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import v0.i;

/* loaded from: classes.dex */
public class k extends f.c {

    /* renamed from: j, reason: collision with root package name */
    public static final a f19779j = new a();

    public static class a {
        public Typeface a(Context context, i.b bVar) {
            return v0.i.a(context, null, new i.b[]{bVar});
        }

        public i.a b(Context context, v0.e eVar) {
            return v0.i.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    public static class b implements f.h {

        /* renamed from: a, reason: collision with root package name */
        public final Context f19780a;

        /* renamed from: b, reason: collision with root package name */
        public final v0.e f19781b;

        /* renamed from: c, reason: collision with root package name */
        public final a f19782c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f19783d = new Object();

        /* renamed from: e, reason: collision with root package name */
        public Handler f19784e;

        /* renamed from: f, reason: collision with root package name */
        public Executor f19785f;

        /* renamed from: g, reason: collision with root package name */
        public ThreadPoolExecutor f19786g;

        /* renamed from: h, reason: collision with root package name */
        public f.i f19787h;

        /* renamed from: i, reason: collision with root package name */
        public ContentObserver f19788i;

        /* renamed from: j, reason: collision with root package name */
        public Runnable f19789j;

        public b(Context context, v0.e eVar, a aVar) {
            x0.f.h(context, "Context cannot be null");
            x0.f.h(eVar, "FontRequest cannot be null");
            this.f19780a = context.getApplicationContext();
            this.f19781b = eVar;
            this.f19782c = aVar;
        }

        @Override // androidx.emoji2.text.f.h
        public void a(f.i iVar) {
            x0.f.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f19783d) {
                this.f19787h = iVar;
            }
            d();
        }

        public final void b() {
            synchronized (this.f19783d) {
                try {
                    this.f19787h = null;
                    ContentObserver contentObserver = this.f19788i;
                    if (contentObserver != null) {
                        this.f19782c.c(this.f19780a, contentObserver);
                        this.f19788i = null;
                    }
                    Handler handler = this.f19784e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f19789j);
                    }
                    this.f19784e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f19786g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f19785f = null;
                    this.f19786g = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void c() {
            synchronized (this.f19783d) {
                try {
                    if (this.f19787h == null) {
                        return;
                    }
                    try {
                        i.b e10 = e();
                        int b10 = e10.b();
                        if (b10 == 2) {
                            synchronized (this.f19783d) {
                            }
                        }
                        if (b10 != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + b10 + ")");
                        }
                        try {
                            u0.o.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface a10 = this.f19782c.a(this.f19780a, e10);
                            ByteBuffer f10 = D.f(this.f19780a, null, e10.e());
                            if (f10 == null || a10 == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            n b11 = n.b(a10, f10);
                            u0.o.b();
                            synchronized (this.f19783d) {
                                try {
                                    f.i iVar = this.f19787h;
                                    if (iVar != null) {
                                        iVar.b(b11);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th2) {
                            u0.o.b();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        synchronized (this.f19783d) {
                            try {
                                f.i iVar2 = this.f19787h;
                                if (iVar2 != null) {
                                    iVar2.a(th3);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void d() {
            synchronized (this.f19783d) {
                try {
                    if (this.f19787h == null) {
                        return;
                    }
                    if (this.f19785f == null) {
                        ThreadPoolExecutor b10 = c.b("emojiCompat");
                        this.f19786g = b10;
                        this.f19785f = b10;
                    }
                    this.f19785f.execute(new Runnable() { // from class: androidx.emoji2.text.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            k.b.this.c();
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final i.b e() {
            try {
                i.a b10 = this.f19782c.b(this.f19780a, this.f19781b);
                if (b10.e() == 0) {
                    i.b[] c10 = b10.c();
                    if (c10 == null || c10.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return c10[0];
                }
                throw new RuntimeException("fetchFonts failed (" + b10.e() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        public void f(Executor executor) {
            synchronized (this.f19783d) {
                this.f19785f = executor;
            }
        }
    }

    public k(Context context, v0.e eVar) {
        super(new b(context, eVar, f19779j));
    }

    public k c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
