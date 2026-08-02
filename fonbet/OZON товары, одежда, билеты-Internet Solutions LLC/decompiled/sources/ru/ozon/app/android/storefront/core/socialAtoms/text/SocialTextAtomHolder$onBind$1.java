package ru.ozon.app.android.storefront.core.socialAtoms.text;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class SocialTextAtomHolder$onBind$1 extends C7735q implements Function2<String, Map<String, ? extends TokenizedTrackingInfo>, Unit> {
    SocialTextAtomHolder$onBind$1(Object obj) {
        super(2, obj, SocialTextAtomHolder.class, "onTagClick", "onTagClick(Ljava/lang/String;Ljava/util/Map;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Map<String, ? extends TokenizedTrackingInfo> map) {
        invoke2(str, (Map<String, TokenizedTrackingInfo>) map);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p02, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((SocialTextAtomHolder) this.receiver).onTagClick(p02, map);
    }
}
