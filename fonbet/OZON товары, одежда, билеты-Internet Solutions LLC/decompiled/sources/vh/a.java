package vh;

import Kk.C3532b;
import Pj.C3828f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.icon.IconDTO;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final IconDTO.IconSize f102894a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f102895b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3828f f102896c;

    public a(@NotNull IconDTO.IconSize size, boolean z11, @NotNull C3828f mainAddonSettings) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(mainAddonSettings, "mainAddonSettings");
        this.f102894a = size;
        this.f102895b = z11;
        this.f102896c = mainAddonSettings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f102894a == aVar.f102894a && this.f102895b == aVar.f102895b && Intrinsics.d(this.f102896c, aVar.f102896c);
    }

    public final int hashCode() {
        return this.f102896c.hashCode() + C3532b.a(this.f102894a.hashCode() * 31, 31, this.f102895b);
    }

    @NotNull
    public final String toString() {
        return "IconAddonWrapperPreset(size=" + this.f102894a + ", hasShape=" + this.f102895b + ", mainAddonSettings=" + this.f102896c + ")";
    }
}
