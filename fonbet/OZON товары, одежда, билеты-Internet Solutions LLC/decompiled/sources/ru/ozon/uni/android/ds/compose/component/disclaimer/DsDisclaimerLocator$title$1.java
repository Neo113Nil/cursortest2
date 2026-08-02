package ru.ozon.uni.android.ds.compose.component.disclaimer;

import U7.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/ds/compose/component/disclaimer/DsDisclaimerLocator;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DsDisclaimerLocator$title$1 extends AbstractC7737t implements Function0<DsDisclaimerLocator> {
    final /* synthetic */ DsDisclaimerLocator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsDisclaimerLocator$title$1(DsDisclaimerLocator dsDisclaimerLocator) {
        super(0);
        this.this$0 = dsDisclaimerLocator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DsDisclaimerLocator invoke() {
        return new DsDisclaimerLocator(null, d.e(this.this$0.getLocatorTag(), ".title"), 1, null);
    }
}
