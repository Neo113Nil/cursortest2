package ru.ozon.app.android.regulardraw.widgets.lotteryResult.core;

import d00.C6020f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "LotteryResultWidget", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ln20/i;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LotteryResultWidgetKt {
    @NotNull
    public static final i LotteryResultWidget(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return C6020f.b("regulardraw", "lotteryResult", null, new LotteryResultWidgetKt$LotteryResultWidget$1(jsonDeserializer), 4, null);
    }
}
