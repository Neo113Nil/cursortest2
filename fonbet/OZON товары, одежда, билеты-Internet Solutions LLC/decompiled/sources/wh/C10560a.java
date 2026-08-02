package wh;

import Pj.C3828f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cell.CommonCellSettings;

/* renamed from: wh.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10560a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CommonCellSettings.LayoutPadding f104559a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final CommonCellSettings.LayoutPadding f104560b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3828f f104561c;

    public C10560a(@NotNull CommonCellSettings.LayoutPadding layoutTopPadding, @NotNull CommonCellSettings.LayoutPadding layoutBottomPadding, @NotNull C3828f mainAddonSettings) {
        Intrinsics.checkNotNullParameter(layoutTopPadding, "layoutTopPadding");
        Intrinsics.checkNotNullParameter(layoutBottomPadding, "layoutBottomPadding");
        Intrinsics.checkNotNullParameter(mainAddonSettings, "mainAddonSettings");
        this.f104559a = layoutTopPadding;
        this.f104560b = layoutBottomPadding;
        this.f104561c = mainAddonSettings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10560a)) {
            return false;
        }
        C10560a c10560a = (C10560a) obj;
        return this.f104559a == c10560a.f104559a && this.f104560b == c10560a.f104560b && Intrinsics.d(this.f104561c, c10560a.f104561c);
    }

    public final int hashCode() {
        return this.f104561c.hashCode() + ((this.f104560b.hashCode() + (this.f104559a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "ImageAddonWrapperPreset(layoutTopPadding=" + this.f104559a + ", layoutBottomPadding=" + this.f104560b + ", mainAddonSettings=" + this.f104561c + ")";
    }
}
