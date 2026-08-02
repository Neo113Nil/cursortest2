package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.cell;

import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.notificationssettings.data.NotificationsSettingsDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001+B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJH\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/cell/NotificationsSettingsCellVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$SettingInfo;", "settingInfo", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;", "dialog", "Lru/ozon/uni/atoms/data/AtomDTO;", "cell", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/cell/NotificationsSettingsCellVO$TrackingInfo;", "trackingInfo", "<init>", "(JLru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$SettingInfo;Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/cell/NotificationsSettingsCellVO$TrackingInfo;)V", "copy", "(JLru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$SettingInfo;Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/cell/NotificationsSettingsCellVO$TrackingInfo;)Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/cell/NotificationsSettingsCellVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$SettingInfo;", "getSettingInfo", "()Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$SettingInfo;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;", "getDialog", "()Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;", "Lru/ozon/uni/atoms/data/AtomDTO;", "getCell", "()Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/cell/NotificationsSettingsCellVO$TrackingInfo;", "getTrackingInfo", "()Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/cell/NotificationsSettingsCellVO$TrackingInfo;", "TrackingInfo", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NotificationsSettingsCellVO implements c {

    @NotNull
    private final AtomDTO cell;
    private final NotificationsSettingsDTO.NotificationSource.Dialog dialog;
    private final long id;
    private final NotificationsSettingsDTO.NotificationSource.SettingInfo settingInfo;
    private final TrackingInfo trackingInfo;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u000e\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/cell/NotificationsSettingsCellVO$TrackingInfo;", "", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "selected", "unselected", "<init>", "(LWZ/t;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getSelected", "()LWZ/t;", "getUnselected", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrackingInfo {
        private final t selected;
        private final t unselected;

        public TrackingInfo(t tVar, t tVar2) {
            this.selected = tVar;
            this.unselected = tVar2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackingInfo)) {
                return false;
            }
            TrackingInfo trackingInfo = (TrackingInfo) other;
            return Intrinsics.d(this.selected, trackingInfo.selected) && Intrinsics.d(this.unselected, trackingInfo.unselected);
        }

        public final t getSelected() {
            return this.selected;
        }

        public final t getUnselected() {
            return this.unselected;
        }

        public int hashCode() {
            t tVar = this.selected;
            int hashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
            t tVar2 = this.unselected;
            return hashCode + (tVar2 != null ? tVar2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TrackingInfo(selected=" + this.selected + ", unselected=" + this.unselected + ")";
        }
    }

    public NotificationsSettingsCellVO(long j11, NotificationsSettingsDTO.NotificationSource.SettingInfo settingInfo, NotificationsSettingsDTO.NotificationSource.Dialog dialog, @NotNull AtomDTO cell, TrackingInfo trackingInfo) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.id = j11;
        this.settingInfo = settingInfo;
        this.dialog = dialog;
        this.cell = cell;
        this.trackingInfo = trackingInfo;
    }

    public static /* synthetic */ NotificationsSettingsCellVO copy$default(NotificationsSettingsCellVO notificationsSettingsCellVO, long j11, NotificationsSettingsDTO.NotificationSource.SettingInfo settingInfo, NotificationsSettingsDTO.NotificationSource.Dialog dialog, AtomDTO atomDTO, TrackingInfo trackingInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = notificationsSettingsCellVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            settingInfo = notificationsSettingsCellVO.settingInfo;
        }
        NotificationsSettingsDTO.NotificationSource.SettingInfo settingInfo2 = settingInfo;
        if ((i11 & 4) != 0) {
            dialog = notificationsSettingsCellVO.dialog;
        }
        NotificationsSettingsDTO.NotificationSource.Dialog dialog2 = dialog;
        if ((i11 & 8) != 0) {
            atomDTO = notificationsSettingsCellVO.cell;
        }
        AtomDTO atomDTO2 = atomDTO;
        if ((i11 & 16) != 0) {
            trackingInfo = notificationsSettingsCellVO.trackingInfo;
        }
        return notificationsSettingsCellVO.copy(j12, settingInfo2, dialog2, atomDTO2, trackingInfo);
    }

    @NotNull
    public final NotificationsSettingsCellVO copy(long id2, NotificationsSettingsDTO.NotificationSource.SettingInfo settingInfo, NotificationsSettingsDTO.NotificationSource.Dialog dialog, @NotNull AtomDTO cell, TrackingInfo trackingInfo) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        return new NotificationsSettingsCellVO(id2, settingInfo, dialog, cell, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationsSettingsCellVO)) {
            return false;
        }
        NotificationsSettingsCellVO notificationsSettingsCellVO = (NotificationsSettingsCellVO) other;
        return this.id == notificationsSettingsCellVO.id && Intrinsics.d(this.settingInfo, notificationsSettingsCellVO.settingInfo) && Intrinsics.d(this.dialog, notificationsSettingsCellVO.dialog) && Intrinsics.d(this.cell, notificationsSettingsCellVO.cell) && Intrinsics.d(this.trackingInfo, notificationsSettingsCellVO.trackingInfo);
    }

    @NotNull
    public final AtomDTO getCell() {
        return this.cell;
    }

    public final NotificationsSettingsDTO.NotificationSource.Dialog getDialog() {
        return this.dialog;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final NotificationsSettingsDTO.NotificationSource.SettingInfo getSettingInfo() {
        return this.settingInfo;
    }

    public final TrackingInfo getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        NotificationsSettingsDTO.NotificationSource.SettingInfo settingInfo = this.settingInfo;
        int hashCode2 = (hashCode + (settingInfo == null ? 0 : settingInfo.hashCode())) * 31;
        NotificationsSettingsDTO.NotificationSource.Dialog dialog = this.dialog;
        int hashCode3 = (this.cell.hashCode() + ((hashCode2 + (dialog == null ? 0 : dialog.hashCode())) * 31)) * 31;
        TrackingInfo trackingInfo = this.trackingInfo;
        return hashCode3 + (trackingInfo != null ? trackingInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NotificationsSettingsCellVO(id=" + this.id + ", settingInfo=" + this.settingInfo + ", dialog=" + this.dialog + ", cell=" + this.cell + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
