package ru.ozon.uni.core.repository.implementation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniPaddingToken;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"tokenMap", "", "", "Lru/ozon/uni/core/models/UniPaddingToken;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UniPaddingTokenRepositoryImplKt {

    @NotNull
    private static final Map<String, UniPaddingToken> tokenMap;

    static {
        UniPaddingTokenRepositoryImpl uniPaddingTokenRepositoryImpl = UniPaddingTokenRepositoryImpl.INSTANCE;
        tokenMap = U.j(new Pair("NONE", uniPaddingTokenRepositoryImpl.getNone()), new Pair("PADDING_100", uniPaddingTokenRepositoryImpl.getPadding100()), new Pair("PADDING_200", uniPaddingTokenRepositoryImpl.getPadding200()), new Pair("PADDING_250", uniPaddingTokenRepositoryImpl.getPadding250()), new Pair("PADDING_300", uniPaddingTokenRepositoryImpl.getPadding300()), new Pair("PADDING_350", uniPaddingTokenRepositoryImpl.getPadding350()), new Pair("PADDING_400", uniPaddingTokenRepositoryImpl.getPadding400()), new Pair("PADDING_450", uniPaddingTokenRepositoryImpl.getPadding450()), new Pair("PADDING_500", uniPaddingTokenRepositoryImpl.getPadding500()), new Pair("PADDING_550", uniPaddingTokenRepositoryImpl.getPadding550()), new Pair("PADDING_600", uniPaddingTokenRepositoryImpl.getPadding600()), new Pair("PADDING_700", uniPaddingTokenRepositoryImpl.getPadding700()), new Pair("PADDING_800", uniPaddingTokenRepositoryImpl.getPadding800()), new Pair("PADDING_900", uniPaddingTokenRepositoryImpl.getPadding900()), new Pair("PADDING_950", uniPaddingTokenRepositoryImpl.getPadding950()), new Pair("PADDING_1000", uniPaddingTokenRepositoryImpl.getPadding1000()), new Pair("PADDING_1050", uniPaddingTokenRepositoryImpl.getPadding1050()), new Pair("PADDING_1100", uniPaddingTokenRepositoryImpl.getPadding1100()));
    }
}
