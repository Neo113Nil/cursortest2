package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {212}, m = "invokeSuspend")
/* renamed from: r0.Q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9116Q extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super x1.x>, Object> {

    /* renamed from: d, reason: collision with root package name */
    long f82494d;

    /* renamed from: e, reason: collision with root package name */
    int f82495e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f82496f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ x1.x f82497g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9116Q(x1.x xVar, kotlin.coroutines.d<? super C9116Q> dVar) {
        super(2, dVar);
        this.f82497g = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C9116Q c9116q = new C9116Q(this.f82497g, dVar);
        c9116q.f82496f = obj;
        return c9116q;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super x1.x> dVar) {
        return ((C9116Q) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0040 -> B:5:0x0043). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
        /*
            r7 = this;
            Wc.a r0 = Wc.a.COROUTINE_SUSPENDED
            int r1 = r7.f82495e
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            long r3 = r7.f82494d
            java.lang.Object r1 = r7.f82496f
            x1.c r1 = (x1.InterfaceC10628c) r1
            Sc.s.b(r8)
            goto L43
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            Sc.s.b(r8)
            java.lang.Object r8 = r7.f82496f
            x1.c r8 = (x1.InterfaceC10628c) r8
            x1.x r1 = r7.f82497g
            long r3 = r1.m()
            androidx.compose.ui.platform.c2 r1 = r8.b()
            r1.getClass()
            r5 = 40
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L34:
            r7.f82496f = r1
            r7.f82494d = r3
            r7.f82495e = r2
            r8 = 0
            r5 = 3
            java.lang.Object r8 = r0.C9115P.d(r1, r8, r7, r5)
            if (r8 != r0) goto L43
            return r0
        L43:
            x1.x r8 = (x1.x) r8
            long r5 = r8.m()
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L34
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.C9116Q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
