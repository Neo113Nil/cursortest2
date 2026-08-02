package kotlin.reflect.jvm.internal.impl.resolve;

import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* JADX INFO: Add missing generic type declarations: [H] */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1<H> extends xka implements Function1<H, Unit> {
    final /* synthetic */ SmartSet<H> $conflictedHandles;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1(SmartSet<H> smartSet) {
        super(1);
        this.$conflictedHandles = smartSet;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m892invoke(H h) {
        SmartSet<H> smartSet = this.$conflictedHandles;
        h.getClass();
        smartSet.add(h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m892invoke((OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1<H>) obj);
        return Unit.a;
    }
}
