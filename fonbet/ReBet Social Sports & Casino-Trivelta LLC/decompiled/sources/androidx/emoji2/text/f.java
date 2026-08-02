package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import z.C6901b;

/* loaded from: classes.dex */
public class f {

    /* renamed from: n, reason: collision with root package name */
    public static final Object f19725n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public static final Object f19726o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public static volatile f f19727p;

    /* renamed from: b, reason: collision with root package name */
    public final Set f19729b;

    /* renamed from: e, reason: collision with root package name */
    public final b f19732e;

    /* renamed from: f, reason: collision with root package name */
    public final h f19733f;

    /* renamed from: g, reason: collision with root package name */
    public final j f19734g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19735h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f19736i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f19737j;

    /* renamed from: k, reason: collision with root package name */
    public final int f19738k;

    /* renamed from: l, reason: collision with root package name */
    public final int f19739l;

    /* renamed from: m, reason: collision with root package name */
    public final e f19740m;
    final int[] mEmojiAsDefaultStyleExceptions;

    /* renamed from: a, reason: collision with root package name */
    public final ReadWriteLock f19728a = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    public volatile int f19730c = 3;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f19731d = new Handler(Looper.getMainLooper());

    public static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        public volatile androidx.emoji2.text.i f19741b;

        /* renamed from: c, reason: collision with root package name */
        public volatile n f19742c;

        /* renamed from: androidx.emoji2.text.f$a$a, reason: collision with other inner class name */
        public class C0375a extends i {
            public C0375a() {
            }

            @Override // androidx.emoji2.text.f.i
            public void a(Throwable th2) {
                a.this.f19744a.n(th2);
            }

            @Override // androidx.emoji2.text.f.i
            public void b(n nVar) {
                a.this.d(nVar);
            }
        }

        public a(f fVar) {
            super(fVar);
        }

        @Override // androidx.emoji2.text.f.b
        public void a() {
            try {
                this.f19744a.f19733f.a(new C0375a());
            } catch (Throwable th2) {
                this.f19744a.n(th2);
            }
        }

        @Override // androidx.emoji2.text.f.b
        public CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f19741b.h(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.f.b
        public void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f19742c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f19744a.f19735h);
        }

        public void d(n nVar) {
            if (nVar == null) {
                this.f19744a.n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f19742c = nVar;
            n nVar2 = this.f19742c;
            j jVar = this.f19744a.f19734g;
            e eVar = this.f19744a.f19740m;
            f fVar = this.f19744a;
            this.f19741b = new androidx.emoji2.text.i(nVar2, jVar, eVar, fVar.f19736i, fVar.mEmojiAsDefaultStyleExceptions, androidx.emoji2.text.h.a());
            this.f19744a.o();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final f f19744a;

        public b(f fVar) {
            this.f19744a = fVar;
        }

        public abstract void a();

        public abstract CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10);

        public abstract void c(EditorInfo editorInfo);
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final h f19745a;

        /* renamed from: b, reason: collision with root package name */
        public j f19746b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f19747c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f19748d;

        /* renamed from: e, reason: collision with root package name */
        public Set f19749e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f19750f;

        /* renamed from: g, reason: collision with root package name */
        public int f19751g = -16711936;

        /* renamed from: h, reason: collision with root package name */
        public int f19752h = 0;

        /* renamed from: i, reason: collision with root package name */
        public e f19753i = new androidx.emoji2.text.e();
        int[] mEmojiAsDefaultStyleExceptions;

        public c(h hVar) {
            x0.f.h(hVar, "metadataLoader cannot be null.");
            this.f19745a = hVar;
        }

        public final h a() {
            return this.f19745a;
        }

        public c b(int i10) {
            this.f19752h = i10;
            return this;
        }
    }

    public static class d implements j {
        @Override // androidx.emoji2.text.f.j
        public androidx.emoji2.text.j a(p pVar) {
            return new q(pVar);
        }
    }

    public interface e {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* renamed from: androidx.emoji2.text.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC0376f {
        public void a(Throwable th2) {
        }

        public void b() {
        }
    }

    public static class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final List f19754a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f19755b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19756c;

        public g(AbstractC0376f abstractC0376f, int i10) {
            this(Arrays.asList((AbstractC0376f) x0.f.h(abstractC0376f, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f19754a.size();
            int i10 = 0;
            if (this.f19756c != 1) {
                while (i10 < size) {
                    ((AbstractC0376f) this.f19754a.get(i10)).a(this.f19755b);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    ((AbstractC0376f) this.f19754a.get(i10)).b();
                    i10++;
                }
            }
        }

        public g(Collection collection, int i10) {
            this(collection, i10, null);
        }

        public g(Collection collection, int i10, Throwable th2) {
            x0.f.h(collection, "initCallbacks cannot be null");
            this.f19754a = new ArrayList(collection);
            this.f19756c = i10;
            this.f19755b = th2;
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th2);

        public abstract void b(n nVar);
    }

    public interface j {
        androidx.emoji2.text.j a(p pVar);
    }

    public f(c cVar) {
        this.f19735h = cVar.f19747c;
        this.f19736i = cVar.f19748d;
        this.mEmojiAsDefaultStyleExceptions = cVar.mEmojiAsDefaultStyleExceptions;
        this.f19737j = cVar.f19750f;
        this.f19738k = cVar.f19751g;
        this.f19733f = cVar.f19745a;
        this.f19739l = cVar.f19752h;
        this.f19740m = cVar.f19753i;
        C6901b c6901b = new C6901b();
        this.f19729b = c6901b;
        j jVar = cVar.f19746b;
        this.f19734g = jVar == null ? new d() : jVar;
        Set set = cVar.f19749e;
        if (set != null && !set.isEmpty()) {
            c6901b.addAll(cVar.f19749e);
        }
        this.f19732e = new a(this);
        m();
    }

    public static f c() {
        f fVar;
        synchronized (f19725n) {
            fVar = f19727p;
            x0.f.i(fVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return fVar;
    }

    public static boolean f(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return androidx.emoji2.text.i.b(inputConnection, editable, i10, i11, z10);
    }

    public static boolean g(Editable editable, int i10, KeyEvent keyEvent) {
        return androidx.emoji2.text.i.c(editable, i10, keyEvent);
    }

    public static f h(c cVar) {
        f fVar;
        f fVar2 = f19727p;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (f19725n) {
            try {
                fVar = f19727p;
                if (fVar == null) {
                    fVar = new f(cVar);
                    f19727p = fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static boolean i() {
        return f19727p != null;
    }

    public int d() {
        return this.f19738k;
    }

    public int e() {
        this.f19728a.readLock().lock();
        try {
            return this.f19730c;
        } finally {
            this.f19728a.readLock().unlock();
        }
    }

    public boolean j() {
        return this.f19737j;
    }

    public final boolean k() {
        return e() == 1;
    }

    public void l() {
        x0.f.i(this.f19739l == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (k()) {
            return;
        }
        this.f19728a.writeLock().lock();
        try {
            if (this.f19730c == 0) {
                return;
            }
            this.f19730c = 0;
            this.f19728a.writeLock().unlock();
            this.f19732e.a();
        } finally {
            this.f19728a.writeLock().unlock();
        }
    }

    public final void m() {
        this.f19728a.writeLock().lock();
        try {
            if (this.f19739l == 0) {
                this.f19730c = 0;
            }
            this.f19728a.writeLock().unlock();
            if (e() == 0) {
                this.f19732e.a();
            }
        } catch (Throwable th2) {
            this.f19728a.writeLock().unlock();
            throw th2;
        }
    }

    public void n(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f19728a.writeLock().lock();
        try {
            this.f19730c = 2;
            arrayList.addAll(this.f19729b);
            this.f19729b.clear();
            this.f19728a.writeLock().unlock();
            this.f19731d.post(new g(arrayList, this.f19730c, th2));
        } catch (Throwable th3) {
            this.f19728a.writeLock().unlock();
            throw th3;
        }
    }

    public void o() {
        ArrayList arrayList = new ArrayList();
        this.f19728a.writeLock().lock();
        try {
            this.f19730c = 1;
            arrayList.addAll(this.f19729b);
            this.f19729b.clear();
            this.f19728a.writeLock().unlock();
            this.f19731d.post(new g(arrayList, this.f19730c));
        } catch (Throwable th2) {
            this.f19728a.writeLock().unlock();
            throw th2;
        }
    }

    public CharSequence p(CharSequence charSequence) {
        return q(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11) {
        return r(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12) {
        return s(charSequence, i10, i11, i12, 0);
    }

    public CharSequence s(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        x0.f.i(k(), "Not initialized yet");
        x0.f.e(i10, "start cannot be negative");
        x0.f.e(i11, "end cannot be negative");
        x0.f.e(i12, "maxEmojiCount cannot be negative");
        x0.f.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        x0.f.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        x0.f.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f19735h : false;
        } else {
            z10 = true;
        }
        return this.f19732e.b(charSequence, i10, i11, i12, z10);
    }

    public void t(AbstractC0376f abstractC0376f) {
        x0.f.h(abstractC0376f, "initCallback cannot be null");
        this.f19728a.writeLock().lock();
        try {
            if (this.f19730c != 1 && this.f19730c != 2) {
                this.f19729b.add(abstractC0376f);
                this.f19728a.writeLock().unlock();
            }
            this.f19731d.post(new g(abstractC0376f, this.f19730c));
            this.f19728a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f19728a.writeLock().unlock();
            throw th2;
        }
    }

    public void u(AbstractC0376f abstractC0376f) {
        x0.f.h(abstractC0376f, "initCallback cannot be null");
        this.f19728a.writeLock().lock();
        try {
            this.f19729b.remove(abstractC0376f);
        } finally {
            this.f19728a.writeLock().unlock();
        }
    }

    public void v(EditorInfo editorInfo) {
        if (!k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f19732e.c(editorInfo);
    }
}
