package ru.ozon.app.android.ugc.core.widgets.selectionReactions.presentation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsDefaults;", "", "<init>", "()V", "LZ1/h;", "DEFAULT_PADDING", "F", "getDEFAULT_PADDING-D9Ej5fM", "()F", "DEFAULT_CORNER_RADIUS", "getDEFAULT_CORNER_RADIUS-D9Ej5fM", "CONTROLS_SPACING", "getCONTROLS_SPACING-D9Ej5fM", "GRADIENT_WIDTH", "getGRADIENT_WIDTH-D9Ej5fM", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SelectionReactionsDefaults {

    @NotNull
    public static final SelectionReactionsDefaults INSTANCE = new SelectionReactionsDefaults();
    private static final float DEFAULT_PADDING = Paddings.PADDING_400.m1867getDpD9Ej5fM();
    private static final float DEFAULT_CORNER_RADIUS = CornerRadius.RADIUS_600.m1866getDpD9Ej5fM();
    private static final float CONTROLS_SPACING = 6;
    private static final float GRADIENT_WIDTH = 40;

    private SelectionReactionsDefaults() {
    }

    /* renamed from: getCONTROLS_SPACING-D9Ej5fM, reason: not valid java name */
    public final float m1509getCONTROLS_SPACINGD9Ej5fM() {
        return CONTROLS_SPACING;
    }

    /* renamed from: getDEFAULT_CORNER_RADIUS-D9Ej5fM, reason: not valid java name */
    public final float m1510getDEFAULT_CORNER_RADIUSD9Ej5fM() {
        return DEFAULT_CORNER_RADIUS;
    }

    /* renamed from: getDEFAULT_PADDING-D9Ej5fM, reason: not valid java name */
    public final float m1511getDEFAULT_PADDINGD9Ej5fM() {
        return DEFAULT_PADDING;
    }

    /* renamed from: getGRADIENT_WIDTH-D9Ej5fM, reason: not valid java name */
    public final float m1512getGRADIENT_WIDTHD9Ej5fM() {
        return GRADIENT_WIDTH;
    }
}
