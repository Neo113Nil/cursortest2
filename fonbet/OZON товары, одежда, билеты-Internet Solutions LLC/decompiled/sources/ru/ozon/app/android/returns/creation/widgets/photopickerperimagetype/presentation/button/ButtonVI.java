package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.button;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.data.ReturnCreationPhotoPickerPerImageTypeDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/button/ButtonVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", "", "minCounts", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ReturnCreationPhotoPickerPerImageTypeDTO$Notifications;", "notifications", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ReturnCreationPhotoPickerPerImageTypeDTO$Notifications;)V", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/util/Map;", "getMinCounts", "()Ljava/util/Map;", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ReturnCreationPhotoPickerPerImageTypeDTO$Notifications;", "getNotifications", "()Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ReturnCreationPhotoPickerPerImageTypeDTO$Notifications;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ButtonVI implements c {

    @NotNull
    private final ButtonV3DTO button;
    private final long id;

    @NotNull
    private final Map<Integer, Integer> minCounts;

    @NotNull
    private final ReturnCreationPhotoPickerPerImageTypeDTO.Notifications notifications;

    public ButtonVI(long j11, @NotNull ButtonV3DTO button, @NotNull Map<Integer, Integer> minCounts, @NotNull ReturnCreationPhotoPickerPerImageTypeDTO.Notifications notifications) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(minCounts, "minCounts");
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        this.id = j11;
        this.button = button;
        this.minCounts = minCounts;
        this.notifications = notifications;
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final Map<Integer, Integer> getMinCounts() {
        return this.minCounts;
    }

    @NotNull
    public final ReturnCreationPhotoPickerPerImageTypeDTO.Notifications getNotifications() {
        return this.notifications;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }
}
