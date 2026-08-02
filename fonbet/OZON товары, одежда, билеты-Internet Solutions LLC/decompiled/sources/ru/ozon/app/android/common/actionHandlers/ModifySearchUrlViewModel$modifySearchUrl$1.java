package ru.ozon.app.android.common.actionHandlers;

import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import ru.ozon.app.android.network.utils.UriExtKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u00042\u000b\u0010\u0005\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "key", "", "Lkotlin/jvm/internal/EnhancedNullability;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ModifySearchUrlViewModel$modifySearchUrl$1 extends AbstractC7737t implements Function2<String, String, Unit> {
    final /* synthetic */ M<Uri> $uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModifySearchUrlViewModel$modifySearchUrl$1(M<Uri> m11) {
        super(2);
        this.$uri = m11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.f71690a;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, android.net.Uri] */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        M<Uri> m11 = this.$uri;
        m11.f71787a = UriExtKt.replaceQueryParameter(m11.f71787a, key, value).build();
    }
}
