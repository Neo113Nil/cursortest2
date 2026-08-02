package ru.ozon.app.android.account.orders.buttonv2.core;

import com.squareup.moshi.Moshi;
import j20.C7244b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.buttonv2.data.ActionButtonV2DTO;
import ru.ozon.app.android.composer.widgets.base.Config;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/account/orders/buttonv2/core/ActionButtonV2Config;", "Lru/ozon/app/android/composer/widgets/base/Config;", "Lru/ozon/app/android/account/orders/buttonv2/data/ActionButtonV2DTO;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "supportedVersions", "", "getSupportedVersions", "()[J", "parser", "Lru/ozon/app/android/account/orders/buttonv2/core/ActionButtonV2Parser;", "getParser", "()Lru/ozon/app/android/account/orders/buttonv2/core/ActionButtonV2Parser;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActionButtonV2Config implements Config<ActionButtonV2DTO> {

    @NotNull
    private final ActionButtonV2Parser parser;
    public static final int $stable = 8;

    public ActionButtonV2Config(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.parser = new ActionButtonV2Parser(moshi);
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        return Config.DefaultImpls.canParse(this, c7244b);
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return Config.DefaultImpls.getSupportedPlaceholders(this);
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return new long[]{2};
    }

    @Override // ru.ozon.app.android.composer.widgets.base.Config
    @NotNull
    public Function2<String, String, ActionButtonV2DTO> getParser() {
        return this.parser;
    }

    @Override // j20.InterfaceC7243a
    public ActionButtonV2DTO parse(@NotNull C7244b c7244b) {
        return (ActionButtonV2DTO) Config.DefaultImpls.parse(this, c7244b);
    }
}
