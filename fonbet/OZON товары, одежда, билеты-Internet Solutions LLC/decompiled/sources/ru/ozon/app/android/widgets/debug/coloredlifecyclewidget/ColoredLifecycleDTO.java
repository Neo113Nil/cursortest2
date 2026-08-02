package ru.ozon.app.android.widgets.debug.coloredlifecyclewidget;

import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/widgets/debug/coloredlifecyclewidget/ColoredLifecycleDTO;", "", "height", "", "excludeSticky", "", "atomAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(IZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getHeight", "()I", "getExcludeSticky", "()Z", "getAtomAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ColoredLifecycleDTO {
    public static final int $stable = 8;

    @NotNull
    private final AtomActionDTO atomAction;
    private final boolean excludeSticky;
    private final int height;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ColoredLifecycleDTO(int i11, boolean z11, @NotNull AtomActionDTO atomAction, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        this.height = i11;
        this.excludeSticky = z11;
        this.atomAction = atomAction;
        this.trackingInfo = map;
    }

    @NotNull
    public final AtomActionDTO getAtomAction() {
        return this.atomAction;
    }

    public final boolean getExcludeSticky() {
        return this.excludeSticky;
    }

    public final int getHeight() {
        return this.height;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public /* synthetic */ ColoredLifecycleDTO(int i11, boolean z11, AtomActionDTO atomActionDTO, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? true : z11, atomActionDTO, map);
    }
}
