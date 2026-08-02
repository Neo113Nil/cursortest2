package ru.ozon.app.android.common;

import L00.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052!\u0010\u0004\u001a\u001d\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0002\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00020\u0000¢\u0006\u0002\b\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "Lkotlin/jvm/internal/EnhancedNullability;", "LL00/c;", "it", "", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class SearchUrlPrefetchServiceImpl$cancelRedundantCalls$1 extends AbstractC7737t implements Function1<Map.Entry<String, c>, Boolean> {
    final /* synthetic */ String $actualCallDeeplink;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchUrlPrefetchServiceImpl$cancelRedundantCalls$1(String str) {
        super(1);
        this.$actualCallDeeplink = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Map.Entry<String, c> it) {
        boolean z11;
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.d(it.getKey(), this.$actualCallDeeplink)) {
            z11 = false;
        } else {
            it.getValue().a();
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }
}
