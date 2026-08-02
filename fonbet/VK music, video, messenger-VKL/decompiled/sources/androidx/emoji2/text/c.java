package androidx.emoji2.text;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import xsna.el3;
import xsna.fdp;
import xsna.k9q0;
import xsna.mik0;
import xsna.obr;
import xsna.si20;
import xsna.xdp;
import xsna.z4q0;

/* compiled from: EmojiCompat.java */
/* loaded from: classes.dex */
public final class c {
    public static final Object j = new Object();

    @Nullable
    public static volatile c k;

    @NonNull
    public final ReentrantReadWriteLock a;

    @NonNull
    public final el3 b;
    public volatile int c;

    @NonNull
    public final Handler d;

    @NonNull
    public final a e;

    @NonNull
    public final h f;

    @NonNull
    public final d g;
    public final int h;
    public final androidx.emoji2.text.b i;

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes12.dex */
    public static final class a extends b {
        public volatile androidx.emoji2.text.e b;
        public volatile androidx.emoji2.text.g c;

        /* compiled from: EmojiCompat.java */
        /* renamed from: androidx.emoji2.text.c$a$a, reason: collision with other inner class name */
        public class C0028a extends i {
            public C0028a() {
            }

            @Override // androidx.emoji2.text.c.i
            public final void a(@Nullable Throwable th) {
                a.this.a.f(th);
            }

            @Override // androidx.emoji2.text.c.i
            public final void b(@NonNull androidx.emoji2.text.g gVar) {
                a aVar = a.this;
                aVar.c = gVar;
                androidx.emoji2.text.g gVar2 = aVar.c;
                c cVar = aVar.a;
                aVar.b = new androidx.emoji2.text.e(gVar2, cVar.g, cVar.i, Build.VERSION.SDK_INT >= 34 ? fdp.a() : k9q0.m());
                c cVar2 = aVar.a;
                cVar2.getClass();
                ArrayList arrayList = new ArrayList();
                cVar2.a.writeLock().lock();
                try {
                    cVar2.c = 1;
                    arrayList.addAll(cVar2.b);
                    cVar2.b.clear();
                    cVar2.a.writeLock().unlock();
                    cVar2.d.post(new g(arrayList, cVar2.c));
                } catch (Throwable th) {
                    cVar2.a.writeLock().unlock();
                    throw th;
                }
            }
        }

        public a(c cVar) {
            super(cVar);
        }

        public final int a(int i, @NonNull CharSequence charSequence) {
            androidx.emoji2.text.e eVar = this.b;
            eVar.getClass();
            if (i < 0 || i >= charSequence.length()) {
                return -1;
            }
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                xdp[] xdpVarArr = (xdp[]) spanned.getSpans(i, i + 1, xdp.class);
                if (xdpVarArr.length > 0) {
                    return spanned.getSpanStart(xdpVarArr[0]);
                }
            }
            return ((e.c) eVar.e(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new e.c(i))).b;
        }

        public final void b() {
            c cVar = this.a;
            try {
                cVar.f.a(new C0028a());
            } catch (Throwable th) {
                cVar.f(th);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00a7, code lost:
        
            if (r7 != false) goto L49;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[Catch: all -> 0x003c, TryCatch #2 {all -> 0x003c, blocks: (B:56:0x0014, B:59:0x0019, B:61:0x001d, B:63:0x002a, B:9:0x004b, B:11:0x0055, B:13:0x0058, B:15:0x005b, B:17:0x006b, B:18:0x006e), top: B:55:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:28:? A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00b6 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final CharSequence c(@NonNull CharSequence charSequence, int i, int i2, boolean z) {
            z4q0 z4q0Var;
            CharSequence charSequence2;
            Throwable th;
            int i3;
            xdp[] xdpVarArr;
            androidx.emoji2.text.e eVar = this.b;
            eVar.getClass();
            boolean z2 = charSequence instanceof mik0;
            if (z2) {
                ((mik0) charSequence).a();
            }
            try {
                if (!z2) {
                    try {
                        if (!(charSequence instanceof Spannable)) {
                            if (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, xdp.class) > i2) {
                                z4q0Var = null;
                            } else {
                                z4q0Var = new z4q0();
                                z4q0Var.b = false;
                                z4q0Var.c = new SpannableString(charSequence);
                            }
                            if (z4q0Var != null && (xdpVarArr = (xdp[]) z4q0Var.c.getSpans(i, i2, xdp.class)) != null && xdpVarArr.length > 0) {
                                for (xdp xdpVar : xdpVarArr) {
                                    int spanStart = z4q0Var.c.getSpanStart(xdpVar);
                                    int spanEnd = z4q0Var.c.getSpanEnd(xdpVar);
                                    if (spanStart != i2) {
                                        z4q0Var.removeSpan(xdpVar);
                                    }
                                    i = Math.min(spanStart, i);
                                    i2 = Math.max(spanEnd, i2);
                                }
                            }
                            i3 = i;
                            if (i3 != i2 || i3 >= charSequence.length()) {
                                charSequence2 = charSequence;
                                if (!z2) {
                                    return charSequence2;
                                }
                            } else {
                                charSequence2 = charSequence;
                                try {
                                    z4q0 z4q0Var2 = (z4q0) eVar.e(charSequence2, i3, i2, Integer.MAX_VALUE, z, new e.a(z4q0Var, eVar.a));
                                    if (z4q0Var2 != null) {
                                        Spannable spannable = z4q0Var2.c;
                                        if (z2) {
                                            ((mik0) charSequence2).b();
                                        }
                                        return spannable;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    th = th;
                                    if (!z2) {
                                    }
                                }
                            }
                            ((mik0) charSequence2).b();
                            return charSequence2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        charSequence2 = charSequence;
                        if (!z2) {
                        }
                    }
                }
                z4q0Var = new z4q0((Spannable) charSequence);
                if (z4q0Var != null) {
                    while (r1 < r4) {
                    }
                }
                i3 = i;
                if (i3 != i2) {
                }
                charSequence2 = charSequence;
                if (!z2) {
                }
                ((mik0) charSequence2).b();
                return charSequence2;
            } catch (Throwable th4) {
                th = th4;
                charSequence2 = charSequence;
                th = th;
                if (!z2) {
                    throw th;
                }
                ((mik0) charSequence2).b();
                throw th;
            }
        }

        public final void d(@NonNull EditorInfo editorInfo) {
            Bundle bundle = editorInfo.extras;
            si20 si20Var = this.c.a;
            int a = si20Var.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a != 0 ? si20Var.b.getInt(a + si20Var.a) : 0);
            Bundle bundle2 = editorInfo.extras;
            this.a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes12.dex */
    public static class b {
        public final c a;

        public b(c cVar) {
            this.a = cVar;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* renamed from: androidx.emoji2.text.c$c, reason: collision with other inner class name */
    /* loaded from: classes12.dex */
    public static abstract class AbstractC0029c {

        @NonNull
        public final h a;
        public int b = 0;

        @NonNull
        public final androidx.emoji2.text.b c = new androidx.emoji2.text.b();

        public AbstractC0029c(@NonNull h hVar) {
            this.a = hVar;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes12.dex */
    public static class d implements j {
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes12.dex */
    public interface e {
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes12.dex */
    public static class g implements Runnable {
        public final ArrayList b;
        public final int c;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public g(@NonNull f fVar, int i) {
            this(Arrays.asList(fVar), i, null);
            obr.e(fVar, "initCallback cannot be null");
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i = 0;
            if (this.c != 1) {
                while (i < size) {
                    ((f) arrayList.get(i)).a();
                    i++;
                }
            } else {
                while (i < size) {
                    ((f) arrayList.get(i)).b();
                    i++;
                }
            }
        }

        public g(@NonNull ArrayList arrayList, int i) {
            this(arrayList, i, null);
        }

        public g(@NonNull List list, int i, @Nullable Throwable th) {
            obr.e(list, "initCallbacks cannot be null");
            this.b = new ArrayList(list);
            this.c = i;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes12.dex */
    public interface h {
        void a(@NonNull i iVar);
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes12.dex */
    public static abstract class i {
        public abstract void a(@Nullable Throwable th);

        public abstract void b(@NonNull androidx.emoji2.text.g gVar);
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes12.dex */
    public interface j {
    }

    public c(@NonNull EmojiCompatInitializer.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        this.f = aVar.a;
        int i2 = aVar.b;
        this.h = i2;
        this.i = aVar.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new el3();
        this.g = new d();
        a aVar2 = new a(this);
        this.e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            aVar2.b();
        }
    }

    @NonNull
    public static c a() {
        c cVar;
        synchronized (j) {
            cVar = k;
            obr.f("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", cVar != null);
        }
        return cVar;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(int i2, @NonNull CharSequence charSequence) {
        obr.f("Not initialized yet", c() == 1);
        obr.e(charSequence, "charSequence cannot be null");
        return this.e.a(i2, charSequence);
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        obr.f("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.h == 1);
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            this.e.b();
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void f(@Nullable Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new g(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    @Nullable
    @CheckResult
    public final CharSequence g(int i2, int i3, int i4, @Nullable CharSequence charSequence) {
        obr.f("Not initialized yet", c() == 1);
        if (i2 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        obr.a("start should be <= than end", i2 <= i3);
        if (charSequence == null) {
            return null;
        }
        obr.a("start should be < than charSequence length", i2 <= charSequence.length());
        obr.a("end should be < than charSequence length", i3 <= charSequence.length());
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        return this.e.c(charSequence, i2, i3, i4 == 1);
    }

    public final void h(@NonNull f fVar) {
        obr.e(fVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(fVar);
                this.a.writeLock().unlock();
            }
            this.d.post(new g(fVar, this.c));
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final void i(@NonNull EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.e.d(editorInfo);
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes12.dex */
    public static abstract class f {
        public void a() {
        }

        public void b() {
        }
    }
}
