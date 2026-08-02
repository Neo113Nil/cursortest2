package ru.ozon.app.android.ugc.core.widgets.stickyCell.presentation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/stickyCell/presentation/StickyCellDefaults;", "", "<init>", "()V", "LZ1/h;", "DEFAULT_PADDING", "F", "getDEFAULT_PADDING-D9Ej5fM", "()F", "DEFAULT_CORNER_RADIUS", "getDEFAULT_CORNER_RADIUS-D9Ej5fM", "DEFAULT_CELL_BACKGROUND_RADIUS", "getDEFAULT_CELL_BACKGROUND_RADIUS-D9Ej5fM", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class StickyCellDefaults {

    @NotNull
    public static final StickyCellDefaults INSTANCE = new StickyCellDefaults();
    private static final float DEFAULT_PADDING = Paddings.PADDING_300.m1867getDpD9Ej5fM();
    private static final float DEFAULT_CORNER_RADIUS = CornerRadius.RADIUS_600.m1866getDpD9Ej5fM();
    private static final float DEFAULT_CELL_BACKGROUND_RADIUS = CornerRadius.RADIUS_500.m1866getDpD9Ej5fM();

    private StickyCellDefaults() {
    }

    /* renamed from: getDEFAULT_CELL_BACKGROUND_RADIUS-D9Ej5fM, reason: not valid java name */
    public final float m1518getDEFAULT_CELL_BACKGROUND_RADIUSD9Ej5fM() {
        return DEFAULT_CELL_BACKGROUND_RADIUS;
    }

    /* renamed from: getDEFAULT_CORNER_RADIUS-D9Ej5fM, reason: not valid java name */
    public final float m1519getDEFAULT_CORNER_RADIUSD9Ej5fM() {
        return DEFAULT_CORNER_RADIUS;
    }

    /* renamed from: getDEFAULT_PADDING-D9Ej5fM, reason: not valid java name */
    public final float m1520getDEFAULT_PADDINGD9Ej5fM() {
        return DEFAULT_PADDING;
    }
}
