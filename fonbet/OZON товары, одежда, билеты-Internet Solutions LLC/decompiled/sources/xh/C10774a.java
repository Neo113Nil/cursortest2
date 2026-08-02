package xh;

import Pj.C3828f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.indicator.IndicatorDTO;

/* renamed from: xh.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10774a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final IndicatorDTO.IndicatorSize f105563a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3828f f105564b;

    public C10774a(@NotNull IndicatorDTO.IndicatorSize indicatorSize, @NotNull C3828f mainAddonSettings) {
        Intrinsics.checkNotNullParameter(indicatorSize, "indicatorSize");
        Intrinsics.checkNotNullParameter(mainAddonSettings, "mainAddonSettings");
        this.f105563a = indicatorSize;
        this.f105564b = mainAddonSettings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10774a)) {
            return false;
        }
        C10774a c10774a = (C10774a) obj;
        return this.f105563a == c10774a.f105563a && Intrinsics.d(this.f105564b, c10774a.f105564b);
    }

    public final int hashCode() {
        return this.f105564b.hashCode() + (this.f105563a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "IndicatorAddonWrapperPreset(indicatorSize=" + this.f105563a + ", mainAddonSettings=" + this.f105564b + ")";
    }
}
