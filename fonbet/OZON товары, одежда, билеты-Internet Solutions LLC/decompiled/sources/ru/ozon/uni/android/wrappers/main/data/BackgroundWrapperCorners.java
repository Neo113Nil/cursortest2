package ru.ozon.uni.android.wrappers.main.data;

import Sc.InterfaceC3999a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperCorners;", "", "<init>", "()V", "Lru/ozon/uni/android/wrappers/main/data/Corners;", "cornersAll", "Lru/ozon/uni/android/wrappers/main/data/Corners;", "getCornersAll", "()Lru/ozon/uni/android/wrappers/main/data/Corners;", "cornersNone", "getCornersNone", "cornersLeft", "getCornersLeft", "cornersRight", "getCornersRight", "cornersUp", "getCornersUp", "cornersDown", "getCornersDown", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BackgroundWrapperCorners {

    @NotNull
    public static final BackgroundWrapperCorners INSTANCE = new BackgroundWrapperCorners();

    @NotNull
    private static final Corners cornersAll = new Corners(false, false, false, false, 15, null);

    @NotNull
    private static final Corners cornersNone = new Corners(false, false, false, false);

    @NotNull
    private static final Corners cornersLeft = new Corners(false, false, false, false, 3, null);

    @NotNull
    private static final Corners cornersRight = new Corners(false, false, false, false, 12, null);

    @NotNull
    private static final Corners cornersUp = new Corners(false, false, false, false, 5, null);

    @NotNull
    private static final Corners cornersDown = new Corners(false, false, false, false, 10, null);

    private BackgroundWrapperCorners() {
    }

    @NotNull
    public final Corners getCornersAll() {
        return cornersAll;
    }
}
