package ru.ozon.uni.core.compose.tokens;

import Z1.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniPaddingToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "Lru/ozon/uni/core/models/UniPaddingToken;", "LZ1/h;", "composePaddingTokenMap", "Ljava/util/Map;", "getComposePaddingTokenMap", "()Ljava/util/Map;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UniComposePaddingTokensKt {

    @NotNull
    private static final Map<UniPaddingToken, h> composePaddingTokenMap;

    static {
        UniTheme uniTheme = UniTheme.INSTANCE;
        composePaddingTokenMap = U.j(new Pair(uniTheme.getPaddingTokens().getNone(), h.a(0)), new Pair(uniTheme.getPaddingTokens().getPadding100(), h.a(2)), new Pair(uniTheme.getPaddingTokens().getPadding200(), h.a(4)), new Pair(uniTheme.getPaddingTokens().getPadding250(), h.a(6)), new Pair(uniTheme.getPaddingTokens().getPadding300(), h.a(8)), new Pair(uniTheme.getPaddingTokens().getPadding350(), h.a(10)), new Pair(uniTheme.getPaddingTokens().getPadding400(), h.a(12)), new Pair(uniTheme.getPaddingTokens().getPadding450(), h.a(14)), new Pair(uniTheme.getPaddingTokens().getPadding500(), h.a(16)), new Pair(uniTheme.getPaddingTokens().getPadding550(), h.a(18)), new Pair(uniTheme.getPaddingTokens().getPadding600(), h.a(20)), new Pair(uniTheme.getPaddingTokens().getPadding700(), h.a(24)), new Pair(uniTheme.getPaddingTokens().getPadding800(), h.a(32)), new Pair(uniTheme.getPaddingTokens().getPadding900(), h.a(40)), new Pair(uniTheme.getPaddingTokens().getPadding950(), h.a(44)), new Pair(uniTheme.getPaddingTokens().getPadding1000(), h.a(48)), new Pair(uniTheme.getPaddingTokens().getPadding1050(), h.a(52)), new Pair(uniTheme.getPaddingTokens().getPadding1100(), h.a(56)));
    }

    @NotNull
    public static final Map<UniPaddingToken, h> getComposePaddingTokenMap() {
        return composePaddingTokenMap;
    }
}
