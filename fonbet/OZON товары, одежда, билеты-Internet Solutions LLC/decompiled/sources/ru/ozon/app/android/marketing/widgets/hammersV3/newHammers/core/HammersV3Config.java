package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core;

import e10.AbstractC6252b;
import j20.C7244b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3DTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3Parser;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3Config;", "Le10/b;", "Lru/ozon/app/android/composer/widgets/base/config/list/ListConfig;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3Parser;", "jsonParser", "<init>", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3Parser;)V", "Lj20/b;", "state", "", "", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3Parser;", "", "supportedVersions", "[J", "getSupportedVersions", "()[J", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HammersV3Config extends AbstractC6252b {

    @NotNull
    private final HammersV3Parser jsonParser;

    @NotNull
    private final long[] supportedVersions;
    public static final int $stable = 8;

    public HammersV3Config(@NotNull HammersV3Parser jsonParser) {
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        this.jsonParser = jsonParser;
        this.supportedVersions = new long[]{3};
    }

    @Override // e10.AbstractC6252b, j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return this.supportedVersions;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public List<? extends Object> parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        HammersV3DTO invoke = this.jsonParser.invoke((String) null, state.b());
        return C7714v.p0(invoke.getProducts(), C7714v.p0(C7714v.c0(invoke.getGradientHeader()), C7714v.c0(invoke.getHeader())));
    }
}
