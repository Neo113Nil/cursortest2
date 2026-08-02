package ru.ozon.app.android.videomoleculecompose.slots.centeraction;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import x1.F;
import x1.InterfaceC10628c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx1/F;", "", "<anonymous>", "(Lx1/F;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.videomoleculecompose.slots.centeraction.VideoMoleculeCenterActionOverlayKt$ReplayAction$1$1", f = "VideoMoleculeCenterActionOverlay.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VideoMoleculeCenterActionOverlayKt$ReplayAction$1$1 extends j implements Function2<F, d<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx1/c;", "", "<anonymous>", "(Lx1/c;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.videomoleculecompose.slots.centeraction.VideoMoleculeCenterActionOverlayKt$ReplayAction$1$1$1", f = "VideoMoleculeCenterActionOverlay.kt", l = {63}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.videomoleculecompose.slots.centeraction.VideoMoleculeCenterActionOverlayKt$ReplayAction$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends i implements Function2<InterfaceC10628c, d<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0040 A[LOOP:0: B:6:0x003a->B:8:0x0040, LOOP_END] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002b -> B:5:0x002e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                Wc.a r0 = Wc.a.COROUTINE_SUSPENDED
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                java.lang.Object r1 = r4.L$0
                x1.c r1 = (x1.InterfaceC10628c) r1
                Sc.s.b(r5)
                goto L2e
            L11:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L19:
                Sc.s.b(r5)
                java.lang.Object r5 = r4.L$0
                x1.c r5 = (x1.InterfaceC10628c) r5
                r1 = r5
            L21:
                r4.L$0 = r1
                r4.label = r2
                x1.o r5 = x1.EnumC10640o.Main
                java.lang.Object r5 = r1.i0(r5, r4)
                if (r5 != r0) goto L2e
                return r0
            L2e:
                x1.m r5 = (x1.C10638m) r5
                java.util.List r5 = r5.b()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
            L3a:
                boolean r3 = r5.hasNext()
                if (r3 == 0) goto L21
                java.lang.Object r3 = r5.next()
                x1.x r3 = (x1.x) r3
                r3.a()
                goto L3a
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.videomoleculecompose.slots.centeraction.VideoMoleculeCenterActionOverlayKt$ReplayAction$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC10628c interfaceC10628c, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    VideoMoleculeCenterActionOverlayKt$ReplayAction$1$1(d<? super VideoMoleculeCenterActionOverlayKt$ReplayAction$1$1> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        VideoMoleculeCenterActionOverlayKt$ReplayAction$1$1 videoMoleculeCenterActionOverlayKt$ReplayAction$1$1 = new VideoMoleculeCenterActionOverlayKt$ReplayAction$1$1(dVar);
        videoMoleculeCenterActionOverlayKt$ReplayAction$1$1.L$0 = obj;
        return videoMoleculeCenterActionOverlayKt$ReplayAction$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            F f7 = (F) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (f7.N0(anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(F f7, d<? super Unit> dVar) {
        return ((VideoMoleculeCenterActionOverlayKt$ReplayAction$1$1) create(f7, dVar)).invokeSuspend(Unit.f71690a);
    }
}
