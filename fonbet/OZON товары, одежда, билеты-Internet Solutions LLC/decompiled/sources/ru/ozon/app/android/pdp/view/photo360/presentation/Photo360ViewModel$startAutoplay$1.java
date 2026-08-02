package ru.ozon.app.android.pdp.view.photo360.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/lang/Long;)Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class Photo360ViewModel$startAutoplay$1 extends AbstractC7737t implements Function1<Long, Float> {
    public static final Photo360ViewModel$startAutoplay$1 INSTANCE = new Photo360ViewModel$startAutoplay$1();

    Photo360ViewModel$startAutoplay$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(Long it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Float.valueOf(it.longValue() * 9);
    }
}
