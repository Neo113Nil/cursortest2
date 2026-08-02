package ru.ozon.uni.ozi.utils.internal.presets;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.theme.OziColorsKeyTokens;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/ozi/utils/internal/presets/TokenWithAlpha;", "", "Lru/ozon/uni/ozi/theme/OziColorsKeyTokens;", "token", "", "alphaMultiplier", "<init>", "(Lru/ozon/uni/ozi/theme/OziColorsKeyTokens;F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/ozi/theme/OziColorsKeyTokens;", "getToken", "()Lru/ozon/uni/ozi/theme/OziColorsKeyTokens;", "F", "getAlphaMultiplier", "()F", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* data */ class TokenWithAlpha {
    private final float alphaMultiplier;

    @NotNull
    private final OziColorsKeyTokens token;

    public TokenWithAlpha(@NotNull OziColorsKeyTokens token, float f7) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.token = token;
        this.alphaMultiplier = f7;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenWithAlpha)) {
            return false;
        }
        TokenWithAlpha tokenWithAlpha = (TokenWithAlpha) other;
        return this.token == tokenWithAlpha.token && Float.compare(this.alphaMultiplier, tokenWithAlpha.alphaMultiplier) == 0;
    }

    public final float getAlphaMultiplier() {
        return this.alphaMultiplier;
    }

    @NotNull
    public final OziColorsKeyTokens getToken() {
        return this.token;
    }

    public int hashCode() {
        return Float.hashCode(this.alphaMultiplier) + (this.token.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "TokenWithAlpha(token=" + this.token + ", alphaMultiplier=" + this.alphaMultiplier + ")";
    }
}
