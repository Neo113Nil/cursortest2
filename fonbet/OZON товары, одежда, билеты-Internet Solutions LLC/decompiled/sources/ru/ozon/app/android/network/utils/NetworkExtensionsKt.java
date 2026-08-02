package ru.ozon.app.android.network.utils;

import Y9.b;
import com.squareup.moshi.D;
import com.squareup.moshi.Moshi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.serialize.adapter.SkipIfNullMoshiAdapter;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¨\u0006\u0005"}, d2 = {"skipItemIntoListIfNull", "Lcom/squareup/moshi/Moshi;", "T", "itemType", "Ljava/lang/Class;", "network_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NetworkExtensionsKt {
    @NotNull
    public static final <T> Moshi skipItemIntoListIfNull(@NotNull Moshi moshi, @NotNull Class<T> itemType) {
        Intrinsics.checkNotNullParameter(moshi, "<this>");
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        b e11 = D.e(List.class, itemType);
        Moshi.a g10 = moshi.g();
        g10.c(e11, new SkipIfNullMoshiAdapter(itemType, moshi));
        return new Moshi(g10);
    }
}
