package ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsDefaults;", "", "<init>", "()V", "LZ1/h;", "START_PADDING", "F", "getSTART_PADDING-D9Ej5fM", "()F", "END_PADDING", "getEND_PADDING-D9Ej5fM", "OVERLAP_PADDING", "getOVERLAP_PADDING-D9Ej5fM", "VERTICAL_PADDING", "getVERTICAL_PADDING-D9Ej5fM", "BADGE_STROKE_WIDTH", "getBADGE_STROKE_WIDTH-D9Ej5fM", "BADGE_STROKE_RADIUS", "getBADGE_STROKE_RADIUS-D9Ej5fM", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AvatarAchievementsDefaults {
    private static final float BADGE_STROKE_RADIUS;
    private static final float BADGE_STROKE_WIDTH;
    private static final float END_PADDING;

    @NotNull
    public static final AvatarAchievementsDefaults INSTANCE = new AvatarAchievementsDefaults();
    private static final float OVERLAP_PADDING;
    private static final float START_PADDING;
    private static final float VERTICAL_PADDING;

    static {
        Paddings paddings = Paddings.PADDING_500;
        START_PADDING = paddings.m1867getDpD9Ej5fM();
        END_PADDING = -Paddings.PADDING_400.m1867getDpD9Ej5fM();
        OVERLAP_PADDING = paddings.m1867getDpD9Ej5fM();
        VERTICAL_PADDING = Paddings.PADDING_250.m1867getDpD9Ej5fM();
        BADGE_STROKE_WIDTH = 2;
        BADGE_STROKE_RADIUS = 6;
    }

    private AvatarAchievementsDefaults() {
    }

    /* renamed from: getBADGE_STROKE_RADIUS-D9Ej5fM, reason: not valid java name */
    public final float m1457getBADGE_STROKE_RADIUSD9Ej5fM() {
        return BADGE_STROKE_RADIUS;
    }

    /* renamed from: getBADGE_STROKE_WIDTH-D9Ej5fM, reason: not valid java name */
    public final float m1458getBADGE_STROKE_WIDTHD9Ej5fM() {
        return BADGE_STROKE_WIDTH;
    }

    /* renamed from: getEND_PADDING-D9Ej5fM, reason: not valid java name */
    public final float m1459getEND_PADDINGD9Ej5fM() {
        return END_PADDING;
    }

    /* renamed from: getOVERLAP_PADDING-D9Ej5fM, reason: not valid java name */
    public final float m1460getOVERLAP_PADDINGD9Ej5fM() {
        return OVERLAP_PADDING;
    }

    /* renamed from: getSTART_PADDING-D9Ej5fM, reason: not valid java name */
    public final float m1461getSTART_PADDINGD9Ej5fM() {
        return START_PADDING;
    }

    /* renamed from: getVERTICAL_PADDING-D9Ej5fM, reason: not valid java name */
    public final float m1462getVERTICAL_PADDINGD9Ej5fM() {
        return VERTICAL_PADDING;
    }
}
