package j1;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.appcompat.app.v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j {
    public static final Object j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile j f18201k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f18202a;

    /* renamed from: b, reason: collision with root package name */
    public final s.f f18203b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f18204c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f18205d;

    /* renamed from: e, reason: collision with root package name */
    public final com.android.billingclient.api.b f18206e;

    /* renamed from: f, reason: collision with root package name */
    public final i f18207f;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.hints.j f18208g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18209h;

    /* renamed from: i, reason: collision with root package name */
    public final d f18210i;

    public j(q qVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f18202a = reentrantReadWriteLock;
        this.f18204c = 3;
        i iVar = (i) qVar.f18199b;
        this.f18207f = iVar;
        int i5 = qVar.f18198a;
        this.f18209h = i5;
        this.f18210i = (d) qVar.f18200c;
        this.f18205d = new Handler(Looper.getMainLooper());
        this.f18203b = new s.f(0);
        this.f18208g = new io.sentry.hints.j(23);
        com.android.billingclient.api.b bVar = new com.android.billingclient.api.b(this);
        this.f18206e = bVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i5 == 0) {
            try {
                this.f18204c = 0;
            } catch (Throwable th2) {
                this.f18202a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.a(new e(bVar));
            } catch (Throwable th3) {
                d(th3);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (j) {
            try {
                jVar = f18201k;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public final int b() {
        this.f18202a.readLock().lock();
        try {
            return this.f18204c;
        } finally {
            this.f18202a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f18209h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f18202a.writeLock().lock();
        try {
            if (this.f18204c == 0) {
                return;
            }
            this.f18204c = 0;
            this.f18202a.writeLock().unlock();
            com.android.billingclient.api.b bVar = this.f18206e;
            j jVar = (j) bVar.f3969a;
            try {
                jVar.f18207f.a(new e(bVar));
            } catch (Throwable th2) {
                jVar.d(th2);
            }
        } finally {
            this.f18202a.writeLock().unlock();
        }
    }

    public final void d(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f18202a.writeLock().lock();
        try {
            this.f18204c = 2;
            arrayList.addAll(this.f18203b);
            this.f18203b.clear();
            this.f18202a.writeLock().unlock();
            this.f18205d.post(new androidx.viewpager2.widget.o(arrayList, this.f18204c, th2));
        } catch (Throwable th3) {
            this.f18202a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:28:0x005d, B:31:0x0062, B:33:0x0066, B:35:0x0073, B:37:0x0092, B:39:0x009c, B:41:0x009f, B:43:0x00a2, B:45:0x00b2, B:46:0x00b5), top: B:27:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence e(CharSequence charSequence, int i5, int i10) {
        Throwable th2;
        CharSequence charSequence2;
        int i11;
        int i12;
        v[] vVarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        rh.g.c("start should be <= than end", i5 <= i10);
        x xVar = null;
        if (charSequence == null) {
            return null;
        }
        rh.g.c("start should be < than charSequence length", i5 <= charSequence.length());
        rh.g.c("end should be < than charSequence length", i10 <= charSequence.length());
        if (charSequence.length() == 0 || i5 == i10) {
            return charSequence;
        }
        v0 v0Var = (v0) this.f18206e.f3970b;
        v0Var.getClass();
        boolean z5 = charSequence instanceof t;
        if (z5) {
            ((t) charSequence).a();
        }
        try {
            if (!z5) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i5 - 1, i10 + 1, v.class) <= i10) {
                            xVar = new x();
                            xVar.f18245a = false;
                            xVar.f18246b = new SpannableString(charSequence);
                        }
                        if (xVar != null && (vVarArr = (v[]) xVar.f18246b.getSpans(i5, i10, v.class)) != null && vVarArr.length > 0) {
                            for (v vVar : vVarArr) {
                                int spanStart = xVar.f18246b.getSpanStart(vVar);
                                int spanEnd = xVar.f18246b.getSpanEnd(vVar);
                                if (spanStart != i10) {
                                    xVar.removeSpan(vVar);
                                }
                                i5 = Math.min(spanStart, i5);
                                i10 = Math.max(spanEnd, i10);
                            }
                        }
                        i11 = i5;
                        i12 = i10;
                        if (i11 != i12 || i11 >= charSequence.length()) {
                            charSequence2 = charSequence;
                            if (!z5) {
                                return charSequence2;
                            }
                        } else {
                            try {
                                charSequence2 = charSequence;
                            } catch (Throwable th3) {
                                charSequence2 = charSequence;
                                th2 = th3;
                                if (z5) {
                                }
                            }
                            try {
                                x xVar2 = (x) v0Var.W(charSequence2, i11, i12, Integer.MAX_VALUE, false, new x5.h(xVar, (io.sentry.hints.j) v0Var.f364b, false));
                                if (xVar2 != null) {
                                    Spannable spannable = xVar2.f18246b;
                                    if (z5) {
                                        ((t) charSequence2).b();
                                    }
                                    return spannable;
                                }
                                if (!z5) {
                                    return charSequence2;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                th2 = th;
                                if (z5) {
                                }
                            }
                        }
                        ((t) charSequence2).b();
                        return charSequence2;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    charSequence2 = charSequence;
                    if (z5) {
                        throw th2;
                    }
                    ((t) charSequence2).b();
                    throw th2;
                }
            }
            xVar = new x((Spannable) charSequence);
            if (xVar != null) {
                while (r1 < r5) {
                }
            }
            i11 = i5;
            i12 = i10;
            if (i11 != i12) {
            }
            charSequence2 = charSequence;
            if (!z5) {
            }
            ((t) charSequence2).b();
            return charSequence2;
        } catch (Throwable th6) {
            th = th6;
            charSequence2 = charSequence;
            th2 = th;
            if (z5) {
            }
        }
    }

    public final void f(h hVar) {
        rh.g.e(hVar, "initCallback cannot be null");
        this.f18202a.writeLock().lock();
        try {
            if (this.f18204c != 1 && this.f18204c != 2) {
                this.f18203b.add(hVar);
                this.f18202a.writeLock().unlock();
            }
            this.f18205d.post(new androidx.viewpager2.widget.o(Arrays.asList(hVar), this.f18204c, (Throwable) null));
            this.f18202a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f18202a.writeLock().unlock();
            throw th2;
        }
    }
}
