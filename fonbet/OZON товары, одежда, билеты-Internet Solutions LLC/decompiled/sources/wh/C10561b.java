package wh;

import Pj.g;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cell.CommonCellSettings;

/* renamed from: wh.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10561b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C10560a f104562a;

    static {
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.NONE;
        f104562a = new C10560a(layoutPadding, layoutPadding, g.h());
    }

    @NotNull
    public static C10560a a() {
        return f104562a;
    }
}
