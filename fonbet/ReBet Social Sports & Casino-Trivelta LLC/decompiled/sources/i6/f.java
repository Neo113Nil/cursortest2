package i6;

import X9.m;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import h6.C4470F;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import p6.g;

/* loaded from: classes2.dex */
public final class f implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: e, reason: collision with root package name */
    public static final a f48131e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final Map f48132f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Set f48133a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f48134b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f48135c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f48136d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String c(String str, String str2) {
            return Intrinsics.areEqual("r2", str) ? new Regex("[^\\d.]").replace(str2, "") : str2;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r7.equals("r5") == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        
            r8 = new kotlin.text.Regex("[^a-z]+").replace(r8, "");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        
            if (r7.equals("r4") == false) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void d(Map map, String str, String str2) {
            switch (str.hashCode()) {
                case 3585:
                    if (str.equals("r3")) {
                        str2 = (StringsKt.startsWith$default(str2, m.f13664a, false, 2, (Object) null) || StringsKt.startsWith$default(str2, com.google.crypto.tink.integration.android.b.f37029b, false, 2, (Object) null) || StringsKt.startsWith$default(str2, "ge", false, 2, (Object) null)) ? m.f13664a : "f";
                    }
                    map.put(str, str2);
                    return;
                case 3586:
                    break;
                case 3587:
                    break;
                case 3588:
                    if (str.equals("r6") && StringsKt.contains$default((CharSequence) str2, (CharSequence) "-", false, 2, (Object) null)) {
                        Object[] array = new Regex("-").split(str2, 0).toArray(new String[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        str2 = ((String[]) array)[0];
                    }
                    map.put(str, str2);
                    return;
                default:
                    map.put(str, str2);
                    return;
            }
        }

        public final void e(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int hashCode = activity.hashCode();
            Map b10 = f.b();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = b10.get(valueOf);
            if (obj == null) {
                obj = new f(activity, null);
                b10.put(valueOf, obj);
            }
            f.c((f) obj);
        }

        public a() {
        }
    }

    public /* synthetic */ f(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public static final /* synthetic */ Map b() {
        if (Y7.a.d(f.class)) {
            return null;
        }
        try {
            return f48132f;
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(f fVar) {
        if (Y7.a.d(f.class)) {
            return;
        }
        try {
            fVar.h();
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
        }
    }

    public static final void e(View view, f this$0) {
        if (Y7.a.d(f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "$view");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (view instanceof EditText) {
                this$0.f(view);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
        }
    }

    public final void d(final View view) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            g(new Runnable() { // from class: i6.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.e(view, this);
                }
            });
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void f(View view) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            String obj = ((EditText) view).getText().toString();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            String obj2 = StringsKt.trim((CharSequence) obj).toString();
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = obj2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (lowerCase.length() != 0 && !this.f48133a.contains(lowerCase) && lowerCase.length() <= 100) {
                this.f48133a.add(lowerCase);
                HashMap hashMap = new HashMap();
                List b10 = c.b(view);
                List list = null;
                for (d dVar : d.f48124d.c()) {
                    a aVar = f48131e;
                    String c10 = aVar.c(dVar.c(), lowerCase);
                    if (dVar.d().length() > 0) {
                        c cVar = c.f48123a;
                        if (!c.f(c10, dVar.d())) {
                        }
                    }
                    c cVar2 = c.f48123a;
                    if (c.e(b10, dVar.b())) {
                        aVar.d(hashMap, dVar.c(), c10);
                    } else {
                        if (list == null) {
                            list = c.a(view);
                        }
                        if (c.e(list, dVar.b())) {
                            aVar.d(hashMap, dVar.c(), c10);
                        }
                    }
                }
                C4470F.f47729b.f(hashMap);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void g(Runnable runnable) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f48134b.post(runnable);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void h() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            if (this.f48136d.getAndSet(true)) {
                return;
            }
            g gVar = g.f63069a;
            View e10 = g.e((Activity) this.f48135c.get());
            if (e10 == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = e10.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (Y7.a.d(this)) {
            return;
        }
        if (view != null) {
            try {
                d(view);
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
                return;
            }
        }
        if (view2 != null) {
            d(view2);
        }
    }

    public f(Activity activity) {
        this.f48133a = new LinkedHashSet();
        this.f48134b = new Handler(Looper.getMainLooper());
        this.f48135c = new WeakReference(activity);
        this.f48136d = new AtomicBoolean(false);
    }
}
