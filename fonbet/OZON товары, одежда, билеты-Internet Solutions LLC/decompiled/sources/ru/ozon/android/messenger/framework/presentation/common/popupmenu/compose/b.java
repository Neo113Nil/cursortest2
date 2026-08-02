package ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose;

import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.repository.UniTheme;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final float f90816a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f90817b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f90818c;

    /* renamed from: d, reason: collision with root package name */
    private static final float f90819d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final IconDTO f90820e;

    static {
        UniTheme uniTheme = UniTheme.INSTANCE;
        f90816a = uniTheme.getPaddings().getPadding400();
        f90817b = uniTheme.getPaddings().getPadding400();
        f90818c = uniTheme.getPaddings().getPadding500();
        f90819d = 66;
        f90820e = new IconDTO(IconDTO.IconSize.SIZE_500, null, null, null, new CommonAtomIconDTO("ic_m_copy_filled", "graphicTertiary"), null, "layerFloor2", null, null, null, null, null, null, null, null, null, 65454, null);
    }

    @NotNull
    public static IconDTO a() {
        return f90820e;
    }

    public static float b() {
        return f90819d;
    }

    public static float c() {
        return f90818c;
    }

    public static float d() {
        return f90816a;
    }

    public static float e() {
        return f90817b;
    }
}
