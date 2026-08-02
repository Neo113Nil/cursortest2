package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.e(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, 49, 55, 58}, m = "invokeSuspend")
    /* loaded from: classes10.dex */
    static final class a<T> extends kotlin.coroutines.jvm.internal.i implements Function2<kotlin.sequences.k<? super List<? extends T>>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        Object f71738d;

        /* renamed from: e, reason: collision with root package name */
        Iterator f71739e;

        /* renamed from: f, reason: collision with root package name */
        int f71740f;

        /* renamed from: g, reason: collision with root package name */
        int f71741g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f71742h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f71743i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f71744j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Iterator<T> f71745k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f71746l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f71747m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(int i11, int i12, Iterator<? extends T> it, boolean z11, boolean z12, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f71743i = i11;
            this.f71744j = i12;
            this.f71745k = it;
            this.f71746l = z11;
            this.f71747m = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f71743i, this.f71744j, this.f71745k, this.f71746l, this.f71747m, dVar);
            aVar.f71742h = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create((kotlin.sequences.k) obj, dVar)).invokeSuspend(Unit.f71690a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:15:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x00b3 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x00ab  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0133 -> B:12:0x0136). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x010d -> B:28:0x0110). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00a3 -> B:45:0x00a4). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 339
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.i0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(int i11, int i12) {
        if (i11 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException((i11 != i12 ? Cm.e.c("Both size ", i11, " and step ", " must be greater than zero.", i12) : T7.E.a(i11, "size ", " must be greater than zero.")).toString());
        }
    }

    @NotNull
    public static final <T> Iterator<List<T>> b(@NotNull Iterator<? extends T> iterator, int i11, int i12, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return !iterator.hasNext() ? J.f71696a : kotlin.sequences.l.s(new a(i11, i12, iterator, z12, z11, null));
    }
}
