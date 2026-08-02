package wj;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes10.dex */
final class i extends AbstractC7737t implements Function1<MatchResult, CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    public static final i f104591b = new i(1);

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(MatchResult matchResult) {
        MatchResult matchResult2 = matchResult;
        Intrinsics.checkNotNullParameter(matchResult2, "matchResult");
        return U7.d.e(kotlin.text.h.V(kotlin.text.h.z0(kotlin.text.h.m0(matchResult2.c().get(0), ProductContainerDTO.RATIO_DELIMITER)).toString()), ":[REDACTED]");
    }
}
