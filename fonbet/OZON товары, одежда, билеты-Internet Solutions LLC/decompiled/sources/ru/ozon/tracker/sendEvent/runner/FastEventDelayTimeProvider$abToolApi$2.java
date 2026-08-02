package ru.ozon.tracker.sendEvent.runner;

import Ld0.c;
import fi0.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.abtool.AbToolBaseApi;
import ru.ozon.app.android.abtool.AbToolLibsApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/abtool/AbToolLibsApi;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class FastEventDelayTimeProvider$abToolApi$2 extends AbstractC7737t implements Function0<AbToolLibsApi> {
    final /* synthetic */ FastEventDelayTimeProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FastEventDelayTimeProvider$abToolApi$2(FastEventDelayTimeProvider fastEventDelayTimeProvider) {
        super(0);
        this.this$0 = fastEventDelayTimeProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbToolLibsApi invoke() {
        x xVar;
        xVar = this.this$0.settings;
        c v11 = xVar.v();
        AbToolBaseApi abToolBaseApi = v11 != null ? (AbToolBaseApi) v11.d(AbToolBaseApi.class) : null;
        if (abToolBaseApi instanceof AbToolLibsApi) {
            return (AbToolLibsApi) abToolBaseApi;
        }
        return null;
    }
}
