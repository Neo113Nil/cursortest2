package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation;

import Sc.s;
import Wc.a;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import m0.C7980b;
import m0.C8008p;
import m0.T0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.LocalPinTriggerModifierKt$rememberPinTriggerAnimation$1$1", f = "LocalPinTriggerModifier.kt", l = {23, 24, TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER, TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class LocalPinTriggerModifierKt$rememberPinTriggerAnimation$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ C7980b<Float, C8008p> $animationProgress;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocalPinTriggerModifierKt$rememberPinTriggerAnimation$1$1(C7980b<Float, C8008p> c7980b, d<? super LocalPinTriggerModifierKt$rememberPinTriggerAnimation$1$1> dVar) {
        super(2, dVar);
        this.$animationProgress = c7980b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new LocalPinTriggerModifierKt$rememberPinTriggerAnimation$1$1(this.$animationProgress, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0077, code lost:
    
        if (m0.C7980b.f(r6, r7, r8, null, r10, 12) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (xe.Y.b(3000, r12) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (m0.C7980b.f(r6, r7, r8, null, r10, 12) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (xe.Y.b(1, r12) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0077 -> B:13:0x002c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LocalPinTriggerModifierKt$rememberPinTriggerAnimation$1$1 localPinTriggerModifierKt$rememberPinTriggerAnimation$1$1;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                s.b(obj);
                C7980b<Float, C8008p> c7980b = this.$animationProgress;
                Float f7 = new Float(0.8888889f);
                T0<Float> pinTrigger = MorkovskTabbarAnimationSpecs.INSTANCE.getPinTrigger();
                this.label = 2;
                localPinTriggerModifierKt$rememberPinTriggerAnimation$1$1 = this;
            } else if (i11 == 2) {
                s.b(obj);
                localPinTriggerModifierKt$rememberPinTriggerAnimation$1$1 = this;
                localPinTriggerModifierKt$rememberPinTriggerAnimation$1$1.label = 3;
            } else if (i11 == 3) {
                s.b(obj);
                localPinTriggerModifierKt$rememberPinTriggerAnimation$1$1 = this;
                C7980b<Float, C8008p> c7980b2 = localPinTriggerModifierKt$rememberPinTriggerAnimation$1$1.$animationProgress;
                Float f11 = new Float(1.0f);
                T0<Float> pinTrigger2 = MorkovskTabbarAnimationSpecs.INSTANCE.getPinTrigger();
                localPinTriggerModifierKt$rememberPinTriggerAnimation$1$1.label = 4;
            } else if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        s.b(obj);
        this.label = 1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((LocalPinTriggerModifierKt$rememberPinTriggerAnimation$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
