package ru.ozon.app.android.ugc.core.widgets.listreviews.core;

import Sc.InterfaceC4008j;
import e10.AbstractC6252b;
import j20.C7244b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00192\u00060\u0001j\u0002`\u0002:\u0001\u0019B\u0015\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/listreviews/core/ListReviewsConfig;", "Le10/b;", "Lru/ozon/app/android/composer/widgets/base/config/list/ListConfig;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lj20/b;", "state", "", "", "parse", "(Lj20/b;)Ljava/util/List;", "", "supportedVersions", "[J", "getSupportedVersions", "()[J", "Lru/ozon/app/android/ugc/core/widgets/listreviews/core/ListReviewsParser;", "listReviewsParser$delegate", "LSc/j;", "getListReviewsParser", "()Lru/ozon/app/android/ugc/core/widgets/listreviews/core/ListReviewsParser;", "listReviewsParser", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListReviewsConfig extends AbstractC6252b {

    /* renamed from: listReviewsParser$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j listReviewsParser;

    @NotNull
    private final long[] supportedVersions;
    public static final int $stable = 8;

    public ListReviewsConfig(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.supportedVersions = new long[]{2};
        this.listReviewsParser = LazyUtilsKt.unsafeLazy(new ListReviewsConfig$listReviewsParser$2(jsonDeserializer));
    }

    private final ListReviewsParser getListReviewsParser() {
        return (ListReviewsParser) this.listReviewsParser.getValue();
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
        return getListReviewsParser().parse(state);
    }
}
