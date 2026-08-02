package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cl5 {
    public static final Object j = new Object();
    public static volatile cl5 k;
    public final ReentrantReadWriteLock a;
    public final gh0 b;
    public volatile int c;
    public final Handler d;
    public final lu e;
    public final bl5 f;
    public final kpg g;
    public final int h;
    public final lp4 i;

    public cl5(fg8 fg8Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        bl5 bl5Var = fg8Var.a;
        this.f = bl5Var;
        int i = fg8Var.b;
        this.h = i;
        this.i = fg8Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new gh0(0);
        this.g = new kpg(21);
        lu luVar = new lu(this);
        this.e = luVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                bl5Var.a(new zk5(luVar));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static cl5 a() {
        cl5 cl5Var;
        synchronized (j) {
            cl5Var = k;
            l4a.k("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", cl5Var != null);
        }
        return cl5Var;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(CharSequence charSequence, int i) {
        l4a.k("Not initialized yet", c() == 1);
        l4a.j(charSequence, "charSequence cannot be null");
        l2a l2aVar = (l2a) this.e.b;
        l2aVar.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            e6k[] e6kVarArr = (e6k[]) spanned.getSpans(i, i + 1, e6k.class);
            if (e6kVarArr.length > 0) {
                return spanned.getSpanStart(e6kVarArr[0]);
            }
        }
        return ((pl5) l2aVar.E(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new pl5(i))).b;
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
        l4a.k("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.h == 1);
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
            lu luVar = this.e;
            cl5 cl5Var = (cl5) luVar.a;
            try {
                cl5Var.f.a(new zk5(luVar));
            } catch (Throwable th) {
                cl5Var.f(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new q61(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab A[Catch: all -> 0x008e, TryCatch #2 {all -> 0x008e, blocks: (B:79:0x0066, B:82:0x006b, B:84:0x006f, B:86:0x007c, B:32:0x009b, B:34:0x00a5, B:36:0x00a8, B:38:0x00ab, B:40:0x00bb, B:41:0x00be), top: B:78:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence g(int i, int i2, int i3, CharSequence charSequence) {
        CharSequence charSequence2;
        Throwable th;
        int i4;
        int i5;
        e6k[] e6kVarArr;
        l4a.k("Not initialized yet", c() == 1);
        fck fckVar = null;
        if (i < 0) {
            a70.p("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            a70.p("end cannot be negative");
            return null;
        }
        l4a.h("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        l4a.h("start should be < than charSequence length", i <= charSequence.length());
        l4a.h("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        boolean z = i3 == 1;
        l2a l2aVar = (l2a) this.e.b;
        l2aVar.getClass();
        boolean z2 = charSequence instanceof swh;
        if (z2) {
            ((swh) charSequence).a();
        }
        try {
            if (!z2) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, e6k.class) <= i2) {
                            fckVar = new fck();
                            fckVar.a = false;
                            fckVar.b = new SpannableString(charSequence);
                        }
                        if (fckVar != null && (e6kVarArr = (e6k[]) fckVar.b.getSpans(i, i2, e6k.class)) != null && e6kVarArr.length > 0) {
                            for (e6k e6kVar : e6kVarArr) {
                                int spanStart = fckVar.b.getSpanStart(e6kVar);
                                int spanEnd = fckVar.b.getSpanEnd(e6kVar);
                                if (spanStart != i2) {
                                    fckVar.removeSpan(e6kVar);
                                }
                                i = Math.min(spanStart, i);
                                i2 = Math.max(spanEnd, i2);
                            }
                        }
                        i4 = i;
                        i5 = i2;
                        if (i4 != i5 || i4 >= charSequence.length()) {
                            charSequence2 = charSequence;
                            if (!z2) {
                                return charSequence2;
                            }
                        } else {
                            charSequence2 = charSequence;
                            try {
                                fck fckVar2 = (fck) l2aVar.E(charSequence2, i4, i5, Integer.MAX_VALUE, z, new fp4(10, fckVar, (kpg) l2aVar.b));
                                if (fckVar2 != null) {
                                    Spannable spannable = fckVar2.b;
                                    if (z2) {
                                        ((swh) charSequence2).b();
                                    }
                                    return spannable;
                                }
                                if (!z2) {
                                    return charSequence2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                if (!z2) {
                                }
                            }
                        }
                        ((swh) charSequence2).b();
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    charSequence2 = charSequence;
                    if (!z2) {
                    }
                }
            }
            fckVar = new fck((Spannable) charSequence);
            if (fckVar != null) {
                while (r1 < r2) {
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5) {
            }
            charSequence2 = charSequence;
            if (!z2) {
            }
            ((swh) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
            th = th;
            if (!z2) {
                throw th;
            }
            ((swh) charSequence2).b();
            throw th;
        }
    }

    public final void h(al5 al5Var) {
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(al5Var);
                this.a.writeLock().unlock();
            }
            this.d.post(new q61(Arrays.asList(al5Var), this.c, (Throwable) null));
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        lu luVar = this.e;
        luVar.getClass();
        Bundle bundle = editorInfo.extras;
        yic yicVar = (yic) ((g7h) luVar.c).b;
        int a = yicVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a != 0 ? ((ByteBuffer) yicVar.d).getInt(a + yicVar.a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
