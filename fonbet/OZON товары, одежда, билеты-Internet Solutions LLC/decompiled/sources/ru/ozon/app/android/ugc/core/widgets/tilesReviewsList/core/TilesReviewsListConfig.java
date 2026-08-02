package ru.ozon.app.android.ugc.core.widgets.tilesReviewsList.core;

import Sc.InterfaceC4008j;
import e10.AbstractC6252b;
import j20.C7244b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00152\u00060\u0001j\u0002`\u0002:\u0001\u0015B\u0015\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/tilesReviewsList/core/TilesReviewsListConfig;", "Le10/b;", "Lru/ozon/app/android/composer/widgets/base/config/list/ListConfig;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lj20/b;", "state", "", "", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/ugc/core/widgets/tilesReviewsList/core/TilesReviewsListParser;", "tilesReviewsListParser$delegate", "LSc/j;", "getTilesReviewsListParser", "()Lru/ozon/app/android/ugc/core/widgets/tilesReviewsList/core/TilesReviewsListParser;", "tilesReviewsListParser", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TilesReviewsListConfig extends AbstractC6252b {

    @NotNull
    private final JsonParser jsonDeserializer;

    /* renamed from: tilesReviewsListParser$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j tilesReviewsListParser;
    public static final int $stable = 8;

    public TilesReviewsListConfig(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
        this.tilesReviewsListParser = LazyUtilsKt.unsafeLazy(new TilesReviewsListConfig$tilesReviewsListParser$2(this));
    }

    private final TilesReviewsListParser getTilesReviewsListParser() {
        return (TilesReviewsListParser) this.tilesReviewsListParser.getValue();
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public List<? extends Object> parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return getTilesReviewsListParser().invoke((String) null, state.b());
    }
}
