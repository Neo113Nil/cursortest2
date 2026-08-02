package ru.ozon.app.android.ugc.core.widgets.blockList.presentation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListDefaults;", "", "<init>", "()V", "LZ1/h;", "DEFAULT_CORNER_RADIUS", "F", "getDEFAULT_CORNER_RADIUS-D9Ej5fM", "()F", "DEFAULT_BLOCK_SPACING", "getDEFAULT_BLOCK_SPACING-D9Ej5fM", "DEFAULT_OUTER_HORIZONTAL_PADDING", "getDEFAULT_OUTER_HORIZONTAL_PADDING-D9Ej5fM", "DEFAULT_INNER_PADDING", "getDEFAULT_INNER_PADDING-D9Ej5fM", "MIN_TOP_CONTAINER_HEIGHT", "getMIN_TOP_CONTAINER_HEIGHT-D9Ej5fM", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BlockListDefaults {
    private static final float DEFAULT_INNER_PADDING;
    private static final float DEFAULT_OUTER_HORIZONTAL_PADDING;
    private static final float MIN_TOP_CONTAINER_HEIGHT;

    @NotNull
    public static final BlockListDefaults INSTANCE = new BlockListDefaults();
    private static final float DEFAULT_CORNER_RADIUS = CornerRadius.RADIUS_600.m1866getDpD9Ej5fM();
    private static final float DEFAULT_BLOCK_SPACING = Paddings.PADDING_200.m1867getDpD9Ej5fM();

    static {
        Paddings paddings = Paddings.PADDING_300;
        DEFAULT_OUTER_HORIZONTAL_PADDING = paddings.m1867getDpD9Ej5fM();
        DEFAULT_INNER_PADDING = paddings.m1867getDpD9Ej5fM();
        MIN_TOP_CONTAINER_HEIGHT = 232;
    }

    private BlockListDefaults() {
    }

    /* renamed from: getDEFAULT_BLOCK_SPACING-D9Ej5fM, reason: not valid java name */
    public final float m1468getDEFAULT_BLOCK_SPACINGD9Ej5fM() {
        return DEFAULT_BLOCK_SPACING;
    }

    /* renamed from: getDEFAULT_CORNER_RADIUS-D9Ej5fM, reason: not valid java name */
    public final float m1469getDEFAULT_CORNER_RADIUSD9Ej5fM() {
        return DEFAULT_CORNER_RADIUS;
    }

    /* renamed from: getDEFAULT_INNER_PADDING-D9Ej5fM, reason: not valid java name */
    public final float m1470getDEFAULT_INNER_PADDINGD9Ej5fM() {
        return DEFAULT_INNER_PADDING;
    }

    /* renamed from: getDEFAULT_OUTER_HORIZONTAL_PADDING-D9Ej5fM, reason: not valid java name */
    public final float m1471getDEFAULT_OUTER_HORIZONTAL_PADDINGD9Ej5fM() {
        return DEFAULT_OUTER_HORIZONTAL_PADDING;
    }

    /* renamed from: getMIN_TOP_CONTAINER_HEIGHT-D9Ej5fM, reason: not valid java name */
    public final float m1472getMIN_TOP_CONTAINER_HEIGHTD9Ej5fM() {
        return MIN_TOP_CONTAINER_HEIGHT;
    }
}
