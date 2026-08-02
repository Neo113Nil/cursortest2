package g1;

import D1.H;
import I1.C3222a;
import I1.l;
import I1.m;
import I1.r;
import I1.u;
import K1.C3422b;
import Sc.s;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.activity.RunnableC5048o;
import androidx.collection.AbstractC5144m;
import androidx.collection.C;
import androidx.collection.C5133b;
import androidx.collection.C5145n;
import androidx.collection.D;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.L1;
import androidx.compose.ui.platform.M1;
import androidx.compose.ui.platform.N1;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import b2.C5520a;
import g1.ViewOnAttachStateChangeListenerC6609a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x2.C10647b;
import x2.C10648c;
import ze.C11115c;
import ze.j;
import ze.k;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC6609a implements DefaultLifecycleObserver, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f63689a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private Function0<? extends androidx.compose.ui.platform.coreshims.c> f63690b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.compose.ui.platform.coreshims.c f63691c;

    /* renamed from: m, reason: collision with root package name */
    private long f63701m;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private L1 f63703o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f63704p;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C<androidx.compose.ui.platform.coreshims.e> f63692d = new C<>();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final D f63693e = new D((Object) null);

    /* renamed from: f, reason: collision with root package name */
    private long f63694f = 100;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private EnumC1031a f63695g = EnumC1031a.SHOW_ORIGINAL;

    /* renamed from: h, reason: collision with root package name */
    private boolean f63696h = true;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C5133b<H> f63697i = new C5133b<>(0);

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C11115c f63698j = k.a(1, 6, null);

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Handler f63699k = new Handler(Looper.getMainLooper());

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private C f63700l = C5145n.a();

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private C<L1> f63702n = new C<>();

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final RunnableC5048o f63705q = new RunnableC5048o(this, 2);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: g1.a$a, reason: collision with other inner class name */
    private static final class EnumC1031a {
        private static final /* synthetic */ EnumC1031a[] $VALUES;
        public static final EnumC1031a SHOW_ORIGINAL;
        public static final EnumC1031a SHOW_TRANSLATED;

        static {
            EnumC1031a enumC1031a = new EnumC1031a("SHOW_ORIGINAL", 0);
            SHOW_ORIGINAL = enumC1031a;
            EnumC1031a enumC1031a2 = new EnumC1031a("SHOW_TRANSLATED", 1);
            SHOW_TRANSLATED = enumC1031a2;
            $VALUES = new EnumC1031a[]{enumC1031a, enumC1031a2};
        }

        private EnumC1031a() {
            throw null;
        }

        public static EnumC1031a valueOf(String str) {
            return (EnumC1031a) Enum.valueOf(EnumC1031a.class, str);
        }

        public static EnumC1031a[] values() {
            return (EnumC1031a[]) $VALUES.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1.a$b */
    /* loaded from: classes8.dex */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f63706a = new b();

        public static void a(ViewOnAttachStateChangeListenerC6609a viewOnAttachStateChangeListenerC6609a, LongSparseArray longSparseArray) {
            b(viewOnAttachStateChangeListenerC6609a, longSparseArray);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        
            r3 = r3.getText();
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
        
            r3 = r3.getValue("android:text");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(ViewOnAttachStateChangeListenerC6609a viewOnAttachStateChangeListenerC6609a, LongSparseArray longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            M1 c11;
            r b11;
            C3222a c3222a;
            Function1 function1;
            C10647b a11 = C10648c.a(longSparseArray);
            while (a11.hasNext()) {
                long b12 = a11.b();
                ViewTranslationResponse c12 = PJ.b.c(longSparseArray.get(b12));
                if (c12 != null && value != null && text != null && (c11 = viewOnAttachStateChangeListenerC6609a.c().c((int) b12)) != null && (b11 = c11.b()) != null && (c3222a = (C3222a) m.a(b11.q(), I1.k.z())) != null && (function1 = (Function1) c3222a.a()) != null) {
                }
            }
        }

        public final void c(@NotNull ViewOnAttachStateChangeListenerC6609a viewOnAttachStateChangeListenerC6609a, @NotNull long[] jArr, @NotNull int[] iArr, @NotNull Consumer<ViewTranslationRequest> consumer) {
            r b11;
            String b12;
            TranslationRequestValue forText;
            ViewTranslationRequest build;
            for (long j11 : jArr) {
                M1 c11 = viewOnAttachStateChangeListenerC6609a.c().c((int) j11);
                if (c11 != null && (b11 = c11.b()) != null) {
                    C6611c.c();
                    ViewTranslationRequest.Builder c12 = Cl0.a.c(viewOnAttachStateChangeListenerC6609a.d().getAutofillId(), b11.l());
                    l q11 = b11.q();
                    int i11 = u.f11751H;
                    List list = (List) m.a(q11, u.B());
                    if (list != null && (b12 = C5520a.b(list, "\n", null, 62)) != null) {
                        forText = TranslationRequestValue.forText(new C3422b(6, b12, null));
                        c12.setValue("android:text", forText);
                        build = c12.build();
                        consumer.accept(build);
                    }
                }
            }
        }

        public final void d(@NotNull final ViewOnAttachStateChangeListenerC6609a viewOnAttachStateChangeListenerC6609a, @NotNull final LongSparseArray<ViewTranslationResponse> longSparseArray) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (Intrinsics.d(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                b(viewOnAttachStateChangeListenerC6609a, longSparseArray);
            } else {
                viewOnAttachStateChangeListenerC6609a.d().post(new Runnable() { // from class: g1.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnAttachStateChangeListenerC6609a.b.a(ViewOnAttachStateChangeListenerC6609a.this, longSparseArray);
                    }
                });
            }
        }
    }

    public ViewOnAttachStateChangeListenerC6609a(@NotNull AndroidComposeView androidComposeView, @NotNull Function0<? extends androidx.compose.ui.platform.coreshims.c> function0) {
        this.f63689a = androidComposeView;
        this.f63690b = function0;
        this.f63703o = new L1(androidComposeView.getF40549m().a(), C5145n.a());
    }

    public static void a(ViewOnAttachStateChangeListenerC6609a viewOnAttachStateChangeListenerC6609a) {
        AndroidComposeView androidComposeView;
        long j11;
        long j12;
        long j13;
        AbstractC5144m<M1> abstractC5144m;
        int[] iArr;
        AndroidComposeView androidComposeView2;
        AbstractC5144m<M1> abstractC5144m2;
        int[] iArr2;
        int i11;
        long j14;
        r rVar;
        androidx.compose.ui.platform.coreshims.c cVar;
        int[] iArr3;
        androidx.compose.ui.platform.coreshims.c cVar2;
        if (viewOnAttachStateChangeListenerC6609a.e()) {
            AndroidComposeView androidComposeView3 = viewOnAttachStateChangeListenerC6609a.f63689a;
            androidComposeView3.x0(true);
            viewOnAttachStateChangeListenerC6609a.p(androidComposeView3.getF40549m().a(), viewOnAttachStateChangeListenerC6609a.f63703o);
            viewOnAttachStateChangeListenerC6609a.o(androidComposeView3.getF40549m().a(), viewOnAttachStateChangeListenerC6609a.f63703o);
            AbstractC5144m<M1> c11 = viewOnAttachStateChangeListenerC6609a.c();
            int[] iArr4 = c11.f38718b;
            long[] jArr = c11.f38717a;
            int length = jArr.length - 2;
            C<L1> c12 = viewOnAttachStateChangeListenerC6609a.f63702n;
            int i12 = 8;
            long j15 = -9187201950435737472L;
            if (length >= 0) {
                int i13 = 0;
                j12 = 128;
                while (true) {
                    long j16 = jArr[i13];
                    j13 = 255;
                    if ((((~j16) << 7) & j16 & j15) != j15) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j16 & 255) < 128) {
                                j14 = j15;
                                int i16 = iArr4[(i13 << 3) + i15];
                                L1 c13 = c12.c(i16);
                                M1 c14 = c11.c(i16);
                                r b11 = c14 != null ? c14.b() : null;
                                if (b11 == null) {
                                    A1.a.c("no value for specified key");
                                    throw null;
                                }
                                if (c13 == null) {
                                    Iterator<Map.Entry<? extends I1.C<?>, ? extends Object>> it = b11.q().iterator();
                                    while (it.hasNext()) {
                                        int i17 = i12;
                                        I1.C<?> key = it.next().getKey();
                                        int i18 = u.f11751H;
                                        if (Intrinsics.d(key, u.B())) {
                                            List list = (List) m.a(b11.q(), u.B());
                                            C3422b c3422b = list != null ? (C3422b) C7714v.M(list) : null;
                                            int l11 = b11.l();
                                            String valueOf = String.valueOf(c3422b);
                                            AndroidComposeView androidComposeView4 = androidComposeView3;
                                            AbstractC5144m<M1> abstractC5144m3 = c11;
                                            if (Build.VERSION.SDK_INT >= 29 && (cVar2 = viewOnAttachStateChangeListenerC6609a.f63691c) != null) {
                                                iArr3 = iArr4;
                                                AutofillId a11 = cVar2.a(l11);
                                                if (a11 == null) {
                                                    A1.a.c("Invalid content capture ID");
                                                    throw null;
                                                }
                                                cVar2.c(a11, valueOf);
                                            } else {
                                                iArr3 = iArr4;
                                            }
                                            i12 = i17;
                                            androidComposeView3 = androidComposeView4;
                                            c11 = abstractC5144m3;
                                            iArr4 = iArr3;
                                        } else {
                                            i12 = i17;
                                        }
                                    }
                                    androidComposeView2 = androidComposeView3;
                                    abstractC5144m2 = c11;
                                    iArr2 = iArr4;
                                    i11 = i12;
                                } else {
                                    androidComposeView2 = androidComposeView3;
                                    abstractC5144m2 = c11;
                                    iArr2 = iArr4;
                                    i11 = i12;
                                    Iterator<Map.Entry<? extends I1.C<?>, ? extends Object>> it2 = b11.q().iterator();
                                    while (it2.hasNext()) {
                                        I1.C<?> key2 = it2.next().getKey();
                                        int i19 = u.f11751H;
                                        if (Intrinsics.d(key2, u.B())) {
                                            List list2 = (List) m.a(c13.b(), u.B());
                                            C3422b c3422b2 = list2 != null ? (C3422b) C7714v.M(list2) : null;
                                            List list3 = (List) m.a(b11.q(), u.B());
                                            C3422b c3422b3 = list3 != null ? (C3422b) C7714v.M(list3) : null;
                                            if (Intrinsics.d(c3422b2, c3422b3)) {
                                                continue;
                                            } else {
                                                int l12 = b11.l();
                                                String valueOf2 = String.valueOf(c3422b3);
                                                if (Build.VERSION.SDK_INT >= 29 && (cVar = viewOnAttachStateChangeListenerC6609a.f63691c) != null) {
                                                    rVar = b11;
                                                    AutofillId a12 = cVar.a(l12);
                                                    if (a12 == null) {
                                                        A1.a.c("Invalid content capture ID");
                                                        throw null;
                                                    }
                                                    cVar.c(a12, valueOf2);
                                                } else {
                                                    rVar = b11;
                                                }
                                                b11 = rVar;
                                            }
                                        }
                                    }
                                }
                            } else {
                                androidComposeView2 = androidComposeView3;
                                abstractC5144m2 = c11;
                                iArr2 = iArr4;
                                i11 = i12;
                                j14 = j15;
                            }
                            j16 >>= i11;
                            i15++;
                            j15 = j14;
                            i12 = i11;
                            androidComposeView3 = androidComposeView2;
                            c11 = abstractC5144m2;
                            iArr4 = iArr2;
                        }
                        androidComposeView = androidComposeView3;
                        abstractC5144m = c11;
                        iArr = iArr4;
                        j11 = j15;
                        if (i14 != i12) {
                            break;
                        }
                    } else {
                        androidComposeView = androidComposeView3;
                        abstractC5144m = c11;
                        iArr = iArr4;
                        j11 = j15;
                    }
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                    j15 = j11;
                    androidComposeView3 = androidComposeView;
                    c11 = abstractC5144m;
                    iArr4 = iArr;
                    i12 = 8;
                }
            } else {
                androidComposeView = androidComposeView3;
                j11 = -9187201950435737472L;
                j12 = 128;
                j13 = 255;
            }
            c12.d();
            AbstractC5144m<M1> c15 = viewOnAttachStateChangeListenerC6609a.c();
            int[] iArr5 = c15.f38718b;
            Object[] objArr = c15.f38719c;
            long[] jArr2 = c15.f38717a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i21 = 0;
                while (true) {
                    long j17 = jArr2[i21];
                    if ((((~j17) << 7) & j17 & j11) != j11) {
                        int i22 = 8 - ((~(i21 - length2)) >>> 31);
                        for (int i23 = 0; i23 < i22; i23++) {
                            if ((j17 & j13) < j12) {
                                int i24 = (i21 << 3) + i23;
                                c12.j(iArr5[i24], new L1(((M1) objArr[i24]).b(), viewOnAttachStateChangeListenerC6609a.c()));
                            }
                            j17 >>= 8;
                        }
                        if (i22 != 8) {
                            break;
                        }
                    }
                    if (i21 == length2) {
                        break;
                    } else {
                        i21++;
                    }
                }
            }
            viewOnAttachStateChangeListenerC6609a.f63703o = new L1(androidComposeView.getF40549m().a(), viewOnAttachStateChangeListenerC6609a.c());
            viewOnAttachStateChangeListenerC6609a.f63704p = false;
        }
    }

    private final void f() {
        char c11;
        long j11;
        long j12;
        long j13;
        androidx.compose.ui.platform.coreshims.c cVar = this.f63691c;
        if (cVar != null && Build.VERSION.SDK_INT >= 29) {
            C<androidx.compose.ui.platform.coreshims.e> c12 = this.f63692d;
            if (c12.f38721e != 0) {
                ArrayList arrayList = new ArrayList();
                Object[] objArr = c12.f38719c;
                long[] jArr = c12.f38717a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    j11 = 128;
                    j12 = 255;
                    while (true) {
                        long j14 = jArr[i11];
                        c11 = 7;
                        j13 = -9187201950435737472L;
                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j14 & 255) < 128) {
                                    arrayList.add((androidx.compose.ui.platform.coreshims.e) objArr[(i11 << 3) + i13]);
                                }
                                j14 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                        }
                        if (i11 == length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                } else {
                    c11 = 7;
                    j11 = 128;
                    j12 = 255;
                    j13 = -9187201950435737472L;
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    arrayList2.add(((androidx.compose.ui.platform.coreshims.e) arrayList.get(i14)).h());
                }
                cVar.d(arrayList2);
                c12.d();
            } else {
                c11 = 7;
                j11 = 128;
                j12 = 255;
                j13 = -9187201950435737472L;
            }
            D d11 = this.f63693e;
            if (d11.f38727d != 0) {
                ArrayList arrayList3 = new ArrayList();
                int[] iArr = d11.f38725b;
                long[] jArr2 = d11.f38724a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j15 = jArr2[i15];
                        if ((((~j15) << c11) & j15 & j13) != j13) {
                            int i16 = 8 - ((~(i15 - length2)) >>> 31);
                            for (int i17 = 0; i17 < i16; i17++) {
                                if ((j15 & j12) < j11) {
                                    arrayList3.add(Integer.valueOf(iArr[(i15 << 3) + i17]));
                                }
                                j15 >>= 8;
                            }
                            if (i16 != 8) {
                                break;
                            }
                        }
                        if (i15 == length2) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    arrayList4.add(Long.valueOf(((Number) arrayList3.get(i18)).intValue()));
                }
                cVar.e(C7714v.V0(arrayList4));
                d11.c();
            }
        }
    }

    public static void n(@NotNull ViewOnAttachStateChangeListenerC6609a viewOnAttachStateChangeListenerC6609a, @NotNull LongSparseArray longSparseArray) {
        b.f63706a.d(viewOnAttachStateChangeListenerC6609a, longSparseArray);
    }

    private final void o(r rVar, L1 l12) {
        List j11 = r.j(rVar, 4);
        int size = j11.size();
        for (int i11 = 0; i11 < size; i11++) {
            r rVar2 = (r) j11.get(i11);
            if (c().a(rVar2.l()) && !l12.a().a(rVar2.l())) {
                q(rVar2);
            }
        }
        C<L1> c11 = this.f63702n;
        int[] iArr = c11.f38718b;
        long[] jArr = c11.f38717a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j12 = jArr[i12];
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j12) < 128) {
                            int i15 = iArr[(i12 << 3) + i14];
                            if (!c().a(i15)) {
                                C<androidx.compose.ui.platform.coreshims.e> c12 = this.f63692d;
                                if (c12.b(i15)) {
                                    c12.i(i15);
                                } else {
                                    this.f63693e.b(i15);
                                }
                            }
                        }
                        j12 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i12 == length) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        List j13 = r.j(rVar, 4);
        int size2 = j13.size();
        for (int i16 = 0; i16 < size2; i16++) {
            r rVar3 = (r) j13.get(i16);
            if (c().a(rVar3.l()) && c11.a(rVar3.l())) {
                L1 c13 = c11.c(rVar3.l());
                if (c13 == null) {
                    A1.a.c("node not present in pruned tree before this change");
                    throw null;
                }
                o(rVar3, c13);
            }
        }
    }

    private final void p(r rVar, L1 l12) {
        Throwable th2;
        Throwable th3 = null;
        D d11 = new D(th3);
        List j11 = r.j(rVar, 4);
        int size = j11.size();
        int i11 = 0;
        while (true) {
            C11115c c11115c = this.f63698j;
            C5133b<H> c5133b = this.f63697i;
            if (i11 >= size) {
                D a11 = l12.a();
                int[] iArr = a11.f38725b;
                long[] jArr = a11.f38724a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j12 = jArr[i12];
                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                            th2 = th3;
                            for (int i14 = 0; i14 < i13; i14++) {
                                if ((j12 & 255) < 128 && !d11.a(iArr[(i12 << 3) + i14])) {
                                    if (c5133b.add(rVar.n())) {
                                        c11115c.b(Unit.f71690a);
                                        return;
                                    }
                                    return;
                                }
                                j12 >>= 8;
                            }
                            if (i13 != 8) {
                                break;
                            }
                        } else {
                            th2 = th3;
                        }
                        if (i12 == length) {
                            break;
                        }
                        i12++;
                        th3 = th2;
                    }
                } else {
                    th2 = null;
                }
                List j13 = r.j(rVar, 4);
                int size2 = j13.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    r rVar2 = (r) j13.get(i15);
                    if (c().a(rVar2.l())) {
                        L1 c11 = this.f63702n.c(rVar2.l());
                        if (c11 == null) {
                            A1.a.c("node not present in pruned tree before this change");
                            throw th2;
                        }
                        p(rVar2, c11);
                    }
                }
                return;
            }
            r rVar3 = (r) j11.get(i11);
            if (c().a(rVar3.l())) {
                if (!l12.a().a(rVar3.l())) {
                    if (c5133b.add(rVar.n())) {
                        c11115c.b(Unit.f71690a);
                        return;
                    }
                    return;
                }
                d11.b(rVar3.l());
            }
            i11++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v16 android.view.autofill.AutofillId, still in use, count: 2, list:
          (r3v16 android.view.autofill.AutofillId) from 0x0095: IF  (r3v16 android.view.autofill.AutofillId) == (null android.view.autofill.AutofillId)  -> B:49:0x017d A[HIDDEN]
          (r3v16 android.view.autofill.AutofillId) from 0x009d: PHI (r3v7 android.view.autofill.AutofillId) = (r3v6 android.view.autofill.AutofillId), (r3v16 android.view.autofill.AutofillId) binds: [B:48:0x0099, B:19:0x0095] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private final void q(I1.r r9) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.ViewOnAttachStateChangeListenerC6609a.q(I1.r):void");
    }

    private final void r(r rVar) {
        if (e()) {
            int l11 = rVar.l();
            C<androidx.compose.ui.platform.coreshims.e> c11 = this.f63692d;
            if (c11.b(l11)) {
                c11.i(l11);
            } else {
                this.f63693e.b(l11);
            }
            List j11 = r.j(rVar, 4);
            int size = j11.size();
            for (int i11 = 0; i11 < size; i11++) {
                r((r) j11.get(i11));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (xe.Y.b(r6, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:12:0x002a, B:14:0x004c, B:20:0x005c, B:22:0x0064, B:24:0x006d, B:25:0x0070, B:27:0x0074, B:28:0x007d, B:36:0x003e), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008e -> B:13:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C6613e c6613e;
        int i11;
        ViewOnAttachStateChangeListenerC6609a viewOnAttachStateChangeListenerC6609a;
        j it;
        j jVar;
        Object b11;
        try {
            if (cVar instanceof C6613e) {
                c6613e = (C6613e) cVar;
                int i12 = c6613e.f63713h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c6613e.f63713h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c6613e.f63711f;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c6613e.f63713h;
                    if (i11 != 0) {
                        s.b(obj);
                        try {
                            it = this.f63698j.iterator();
                            viewOnAttachStateChangeListenerC6609a = this;
                            c6613e.f63709d = viewOnAttachStateChangeListenerC6609a;
                            c6613e.f63710e = it;
                            c6613e.f63713h = 1;
                            b11 = it.b(c6613e);
                            if (b11 != aVar) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            viewOnAttachStateChangeListenerC6609a = this;
                            viewOnAttachStateChangeListenerC6609a.f63697i.clear();
                            throw th;
                        }
                    } else if (i11 == 1) {
                        jVar = c6613e.f63710e;
                        viewOnAttachStateChangeListenerC6609a = c6613e.f63709d;
                        s.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jVar = c6613e.f63710e;
                        viewOnAttachStateChangeListenerC6609a = c6613e.f63709d;
                        s.b(obj);
                        it = jVar;
                        c6613e.f63709d = viewOnAttachStateChangeListenerC6609a;
                        c6613e.f63710e = it;
                        c6613e.f63713h = 1;
                        b11 = it.b(c6613e);
                        if (b11 != aVar) {
                            return aVar;
                        }
                        jVar = it;
                        obj = b11;
                        if (((Boolean) obj).booleanValue()) {
                            viewOnAttachStateChangeListenerC6609a.f63697i.clear();
                            return Unit.f71690a;
                        }
                        jVar.next();
                        if (viewOnAttachStateChangeListenerC6609a.e()) {
                            viewOnAttachStateChangeListenerC6609a.f();
                        }
                        if (!viewOnAttachStateChangeListenerC6609a.f63704p) {
                            viewOnAttachStateChangeListenerC6609a.f63704p = true;
                            viewOnAttachStateChangeListenerC6609a.f63699k.post(viewOnAttachStateChangeListenerC6609a.f63705q);
                        }
                        viewOnAttachStateChangeListenerC6609a.f63697i.clear();
                        long j11 = viewOnAttachStateChangeListenerC6609a.f63694f;
                        c6613e.f63709d = viewOnAttachStateChangeListenerC6609a;
                        c6613e.f63710e = jVar;
                        c6613e.f63713h = 2;
                    }
                }
            }
            if (i11 != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        c6613e = new C6613e(this, cVar);
        Object obj2 = c6613e.f63711f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c6613e.f63713h;
    }

    @NotNull
    public final AbstractC5144m<M1> c() {
        if (this.f63696h) {
            this.f63696h = false;
            this.f63700l = N1.b(this.f63689a.getF40549m());
            this.f63701m = System.currentTimeMillis();
        }
        return this.f63700l;
    }

    @NotNull
    public final AndroidComposeView d() {
        return this.f63689a;
    }

    public final boolean e() {
        return this.f63691c != null;
    }

    public final void g() {
        C3222a c3222a;
        Function0 function0;
        this.f63695g = EnumC1031a.SHOW_ORIGINAL;
        AbstractC5144m<M1> c11 = c();
        Object[] objArr = c11.f38719c;
        long[] jArr = c11.f38717a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        l q11 = ((M1) objArr[(i11 << 3) + i13]).b().q();
                        int i14 = u.f11751H;
                        if (m.a(q11, u.p()) != null && (c3222a = (C3222a) m.a(q11, I1.k.a())) != null && (function0 = (Function0) c3222a.a()) != null) {
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void h(@NotNull long[] jArr, @NotNull int[] iArr, @NotNull Consumer<ViewTranslationRequest> consumer) {
        b.f63706a.c(this, jArr, iArr, consumer);
    }

    public final void i() {
        C3222a c3222a;
        Function1 function1;
        this.f63695g = EnumC1031a.SHOW_ORIGINAL;
        AbstractC5144m<M1> c11 = c();
        Object[] objArr = c11.f38719c;
        long[] jArr = c11.f38717a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        l q11 = ((M1) objArr[(i11 << 3) + i13]).b().q();
                        int i14 = u.f11751H;
                        if (Intrinsics.d(m.a(q11, u.p()), Boolean.TRUE) && (c3222a = (C3222a) m.a(q11, I1.k.A())) != null && (function1 = (Function1) c3222a.a()) != null) {
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void j(@NotNull H h11) {
        this.f63696h = true;
        if (e() && this.f63697i.add(h11)) {
            this.f63698j.b(Unit.f71690a);
        }
    }

    public final void k() {
        this.f63696h = true;
        if (!e() || this.f63704p) {
            return;
        }
        this.f63704p = true;
        this.f63699k.post(this.f63705q);
    }

    public final void l() {
        C3222a c3222a;
        Function1 function1;
        this.f63695g = EnumC1031a.SHOW_TRANSLATED;
        AbstractC5144m<M1> c11 = c();
        Object[] objArr = c11.f38719c;
        long[] jArr = c11.f38717a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        l q11 = ((M1) objArr[(i11 << 3) + i13]).b().q();
                        int i14 = u.f11751H;
                        if (Intrinsics.d(m.a(q11, u.p()), Boolean.FALSE) && (c3222a = (C3222a) m.a(q11, I1.k.A())) != null && (function1 = (Function1) c3222a.a()) != null) {
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(@NotNull J j11) {
        this.f63691c = this.f63690b.invoke();
        q(this.f63689a.getF40549m().a());
        f();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(@NotNull J j11) {
        r(this.f63689a.getF40549m().a());
        f();
        this.f63691c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View view) {
        this.f63699k.removeCallbacks(this.f63705q);
        this.f63691c = null;
    }
}
