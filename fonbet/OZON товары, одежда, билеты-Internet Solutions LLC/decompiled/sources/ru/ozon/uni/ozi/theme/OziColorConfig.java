package ru.ozon.uni.ozi.theme;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/ozi/theme/OziColorConfig;", "", "Lru/ozon/uni/ozi/theme/OziMiniAppColorScheme;", "scheme", "Lru/ozon/uni/ozi/theme/OziColorTheme;", "theme", "<init>", "(Lru/ozon/uni/ozi/theme/OziMiniAppColorScheme;Lru/ozon/uni/ozi/theme/OziColorTheme;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/ozi/theme/OziMiniAppColorScheme;", "getScheme", "()Lru/ozon/uni/ozi/theme/OziMiniAppColorScheme;", "Lru/ozon/uni/ozi/theme/OziColorTheme;", "getTheme", "()Lru/ozon/uni/ozi/theme/OziColorTheme;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OziColorConfig {

    @NotNull
    private final OziMiniAppColorScheme scheme;

    @NotNull
    private final OziColorTheme theme;

    /* JADX WARN: Multi-variable type inference failed */
    public OziColorConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OziColorConfig)) {
            return false;
        }
        OziColorConfig oziColorConfig = (OziColorConfig) other;
        return this.scheme == oziColorConfig.scheme && this.theme == oziColorConfig.theme;
    }

    @NotNull
    public final OziMiniAppColorScheme getScheme() {
        return this.scheme;
    }

    @NotNull
    public final OziColorTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        return this.theme.hashCode() + (this.scheme.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "OziColorConfig(scheme=" + this.scheme + ", theme=" + this.theme + ")";
    }

    public OziColorConfig(@NotNull OziMiniAppColorScheme scheme, @NotNull OziColorTheme theme) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.scheme = scheme;
        this.theme = theme;
    }

    public /* synthetic */ OziColorConfig(OziMiniAppColorScheme oziMiniAppColorScheme, OziColorTheme oziColorTheme, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? OziMiniAppColorScheme.Default : oziMiniAppColorScheme, (i11 & 2) != 0 ? OziColorTheme.Light : oziColorTheme);
    }
}
