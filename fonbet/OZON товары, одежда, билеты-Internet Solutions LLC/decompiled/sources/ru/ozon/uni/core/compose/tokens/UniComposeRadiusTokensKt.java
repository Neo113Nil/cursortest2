package ru.ozon.uni.core.compose.tokens;

import Z1.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniRadiusToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "Lru/ozon/uni/core/models/UniRadiusToken;", "LZ1/h;", "composeRadiusTokenMap", "Ljava/util/Map;", "getComposeRadiusTokenMap", "()Ljava/util/Map;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UniComposeRadiusTokensKt {

    @NotNull
    private static final Map<UniRadiusToken, h> composeRadiusTokenMap;

    static {
        UniTheme uniTheme = UniTheme.INSTANCE;
        composeRadiusTokenMap = U.j(new Pair(uniTheme.getRadiusTokens().getNone(), h.a(0)), new Pair(uniTheme.getRadiusTokens().getRadius200(), h.a(4)), new Pair(uniTheme.getRadiusTokens().getRadius250(), h.a(6)), new Pair(uniTheme.getRadiusTokens().getRadius300(), h.a(8)), new Pair(uniTheme.getRadiusTokens().getRadius350(), h.a(10)), new Pair(uniTheme.getRadiusTokens().getRadius400(), h.a(12)), new Pair(uniTheme.getRadiusTokens().getRadius450(), h.a(14)), new Pair(uniTheme.getRadiusTokens().getRadius500(), h.a(16)), new Pair(uniTheme.getRadiusTokens().getRadius525(), h.a(18)), new Pair(uniTheme.getRadiusTokens().getRadius550(), h.a(20)), new Pair(uniTheme.getRadiusTokens().getRadius600(), h.a(24)), new Pair(uniTheme.getRadiusTokens().getRadius650(), h.a(28)), new Pair(uniTheme.getRadiusTokens().getRadius700(), h.a(32)));
    }

    @NotNull
    public static final Map<UniRadiusToken, h> getComposeRadiusTokenMap() {
        return composeRadiusTokenMap;
    }
}
