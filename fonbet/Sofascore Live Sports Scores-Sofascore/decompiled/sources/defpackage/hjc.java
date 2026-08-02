package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.facebook.appevents.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hjc implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public static final HashMap e = new HashMap();
    public final WeakReference c;
    public final LinkedHashSet a = new LinkedHashSet();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final AtomicBoolean d = new AtomicBoolean(false);

    public hjc(Activity activity) {
        this.c = new WeakReference(activity);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0030 -> B:6:0x0033). Please report as a decompilation issue!!! */
    public final void a(View view) {
        Set set = cw3.a;
        if (set.contains(this)) {
            return;
        }
        try {
            gjc gjcVar = new gjc(0, view, this);
            if (!set.contains(this)) {
                try {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        gjcVar.run();
                    } else {
                        this.b.post(gjcVar);
                    }
                } catch (Throwable th) {
                    cw3.a(this, th);
                }
            }
        } catch (Throwable th2) {
            cw3.a(this, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009a A[Catch: all -> 0x00f5, TRY_LEAVE, TryCatch #1 {all -> 0x00f5, blocks: (B:4:0x000c, B:9:0x002e, B:11:0x0034, B:15:0x003e, B:16:0x005b, B:18:0x0061, B:20:0x0073, B:21:0x0082, B:24:0x0094, B:26:0x009a, B:29:0x00ac, B:72:0x00c9, B:77:0x00a8, B:34:0x00cf, B:37:0x00e6, B:58:0x00ec, B:41:0x00f9, B:42:0x00fd, B:45:0x0114, B:48:0x011a, B:56:0x0110, B:64:0x00e2, B:83:0x0090, B:86:0x0123, B:61:0x00d9, B:74:0x00a4, B:69:0x00b8, B:80:0x008c, B:53:0x0107), top: B:3:0x000c, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view) {
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        boolean z;
        LinkedHashSet linkedHashSet = this.a;
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            String lowerCase = StringsKt.l0(((EditText) view).getText().toString()).toString().toLowerCase();
            lowerCase.getClass();
            if (lowerCase.length() != 0 && !linkedHashSet.contains(lowerCase) && lowerCase.length() <= 100) {
                linkedHashSet.add(lowerCase);
                HashMap hashMap = new HashMap();
                ArrayList x = zic.x(view);
                CopyOnWriteArraySet copyOnWriteArraySet = cjc.d;
                Iterator it = new HashSet(cjc.a()).iterator();
                ArrayList arrayList3 = null;
                while (it.hasNext()) {
                    cjc cjcVar = (cjc) it.next();
                    String replace = "r2".equals(cjcVar.b()) ? new Regex("[^\\d.]").replace(lowerCase, "") : lowerCase;
                    if (!cw3.a.contains(cjcVar)) {
                        try {
                            str = cjcVar.b;
                        } catch (Throwable th) {
                            cw3.a(cjcVar, th);
                        }
                        if (str.length() > 0) {
                            if (!cw3.a.contains(cjcVar)) {
                                try {
                                    str2 = cjcVar.b;
                                } catch (Throwable th2) {
                                    cw3.a(cjcVar, th2);
                                }
                                z = false;
                                if (!cw3.a.contains(zic.class)) {
                                    try {
                                        replace.getClass();
                                        str2.getClass();
                                        z = new Regex(str2).f(replace);
                                    } catch (Throwable th3) {
                                        cw3.a(zic.class, th3);
                                    }
                                }
                                if (z) {
                                }
                            }
                            str2 = null;
                            z = false;
                            if (!cw3.a.contains(zic.class)) {
                            }
                            if (z) {
                            }
                        }
                        if (!cw3.a.contains(cjcVar)) {
                            try {
                                arrayList = new ArrayList(cjcVar.c);
                            } catch (Throwable th4) {
                                cw3.a(cjcVar, th4);
                            }
                            if (zic.G(x, arrayList)) {
                                cga.L(hashMap, cjcVar.b(), replace);
                            } else {
                                if (arrayList3 == null) {
                                    arrayList3 = zic.w(view);
                                }
                                if (!cw3.a.contains(cjcVar)) {
                                    try {
                                        arrayList2 = new ArrayList(cjcVar.c);
                                    } catch (Throwable th5) {
                                        cw3.a(cjcVar, th5);
                                    }
                                    if (!zic.G(arrayList3, arrayList2)) {
                                        cga.L(hashMap, cjcVar.b(), replace);
                                    }
                                }
                                arrayList2 = null;
                                if (!zic.G(arrayList3, arrayList2)) {
                                }
                            }
                        }
                        arrayList = null;
                        if (zic.G(x, arrayList)) {
                        }
                    }
                    str = null;
                    if (str.length() > 0) {
                    }
                    if (!cw3.a.contains(cjcVar)) {
                    }
                    arrayList = null;
                    if (zic.G(x, arrayList)) {
                    }
                }
                n.o(hashMap);
            }
        } catch (Throwable th6) {
            cw3.a(this, th6);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (cw3.a.contains(this)) {
            return;
        }
        if (view != null) {
            try {
                a(view);
            } catch (Throwable th) {
                cw3.a(this, th);
                return;
            }
        }
        if (view2 != null) {
            a(view2);
        }
    }
}
