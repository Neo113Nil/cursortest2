package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class HeaderKt$Header$1$1 extends AbstractC7737t implements Function2<AtomActionDTO, Map<String, ? extends TokenizedTrackingInfo>, Unit> {
    public static final HeaderKt$Header$1$1 INSTANCE = new HeaderKt$Header$1$1();

    HeaderKt$Header$1$1() {
        super(2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomActionDTO aa2, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(aa2, "aa");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AtomActionDTO atomActionDTO, Map<String, ? extends TokenizedTrackingInfo> map) {
        invoke2(atomActionDTO, (Map<String, TokenizedTrackingInfo>) map);
        return Unit.f71690a;
    }
}
