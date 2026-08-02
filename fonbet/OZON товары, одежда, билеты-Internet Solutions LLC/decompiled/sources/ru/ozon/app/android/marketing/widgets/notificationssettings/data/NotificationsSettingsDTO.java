package ru.ozon.app.android.marketing.widgets.notificationssettings.data;

import B90.C2618u;
import E0.C2942q;
import G.g;
import N3.C3660k;
import Pk0.c;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.deprecated.Button;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "sources", "", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getSources", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "NotificationSource", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NotificationsSettingsDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<NotificationSource> sources;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003 !\"B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource;", "", "settingInfo", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$SettingInfo;", "dialog", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;", "cell", "Lru/ozon/uni/atoms/data/AtomDTO;", "trackingInfo", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$TrackingInfo;", "<init>", "(Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$SettingInfo;Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$TrackingInfo;)V", "getSettingInfo", "()Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$SettingInfo;", "getDialog", "()Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;", "getCell", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getTrackingInfo", "()Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$TrackingInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SettingInfo", "Dialog", "TrackingInfo", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class NotificationSource {
        public static final int $stable = 8;

        @NotNull
        private final AtomDTO cell;
        private final Dialog dialog;
        private final SettingInfo settingInfo;
        private final TrackingInfo trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "message", "confirmButton", "Lru/ozon/uni/atoms/data/deprecated/Button;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/deprecated/Button;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getConfirmButton", "()Lru/ozon/uni/atoms/data/deprecated/Button;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Dialog {
            public static final int $stable = Button.$stable;

            @NotNull
            private final Button confirmButton;

            @NotNull
            private final String message;

            @NotNull
            private final String title;

            public Dialog(@NotNull String title, @NotNull String message, @NotNull Button confirmButton) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
                this.title = title;
                this.message = message;
                this.confirmButton = confirmButton;
            }

            public static /* synthetic */ Dialog copy$default(Dialog dialog, String str, String str2, Button button, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = dialog.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = dialog.message;
                }
                if ((i11 & 4) != 0) {
                    button = dialog.confirmButton;
                }
                return dialog.copy(str, str2, button);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final Button getConfirmButton() {
                return this.confirmButton;
            }

            @NotNull
            public final Dialog copy(@NotNull String title, @NotNull String message, @NotNull Button confirmButton) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
                return new Dialog(title, message, confirmButton);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Dialog)) {
                    return false;
                }
                Dialog dialog = (Dialog) other;
                return Intrinsics.d(this.title, dialog.title) && Intrinsics.d(this.message, dialog.message) && Intrinsics.d(this.confirmButton, dialog.confirmButton);
            }

            @NotNull
            public final Button getConfirmButton() {
                return this.confirmButton;
            }

            @NotNull
            public final String getMessage() {
                return this.message;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.confirmButton.hashCode() + g.a(this.title.hashCode() * 31, 31, this.message);
            }

            @NotNull
            public String toString() {
                String str = this.title;
                String str2 = this.message;
                Button button = this.confirmButton;
                StringBuilder d11 = C3660k.d("Dialog(title=", str, ", message=", str2, ", confirmButton=");
                d11.append(button);
                d11.append(")");
                return d11.toString();
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$SettingInfo;", "", "type", "", "settingId", "", "commId", "<init>", "(Ljava/lang/String;JJ)V", "getType", "()Ljava/lang/String;", "getSettingId", "()J", "getCommId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SettingInfo {
            public static final int $stable = 0;
            private final long commId;
            private final long settingId;

            @NotNull
            private final String type;

            public SettingInfo(@NotNull String type, long j11, long j12) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
                this.settingId = j11;
                this.commId = j12;
            }

            public static /* synthetic */ SettingInfo copy$default(SettingInfo settingInfo, String str, long j11, long j12, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = settingInfo.type;
                }
                if ((i11 & 2) != 0) {
                    j11 = settingInfo.settingId;
                }
                if ((i11 & 4) != 0) {
                    j12 = settingInfo.commId;
                }
                return settingInfo.copy(str, j11, j12);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* renamed from: component2, reason: from getter */
            public final long getSettingId() {
                return this.settingId;
            }

            /* renamed from: component3, reason: from getter */
            public final long getCommId() {
                return this.commId;
            }

            @NotNull
            public final SettingInfo copy(@NotNull String type, long settingId, long commId) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new SettingInfo(type, settingId, commId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SettingInfo)) {
                    return false;
                }
                SettingInfo settingInfo = (SettingInfo) other;
                return Intrinsics.d(this.type, settingInfo.type) && this.settingId == settingInfo.settingId && this.commId == settingInfo.commId;
            }

            public final long getCommId() {
                return this.commId;
            }

            public final long getSettingId() {
                return this.settingId;
            }

            @NotNull
            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                return Long.hashCode(this.commId) + c.a(this.type.hashCode() * 31, 31, this.settingId);
            }

            @NotNull
            public String toString() {
                String str = this.type;
                long j11 = this.settingId;
                long j12 = this.commId;
                StringBuilder d11 = C2942q.d(j11, "SettingInfo(type=", str, ", settingId=");
                d11.append(", commId=");
                d11.append(j12);
                d11.append(")");
                return d11.toString();
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J9\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$TrackingInfo;", "", "selected", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "unselected", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "getSelected", "()Ljava/util/Map;", "getUnselected", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TrackingInfo {
            public static final int $stable = 8;
            private final Map<String, TokenizedTrackingInfo> selected;
            private final Map<String, TokenizedTrackingInfo> unselected;

            public TrackingInfo(Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
                this.selected = map;
                this.unselected = map2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TrackingInfo copy$default(TrackingInfo trackingInfo, Map map, Map map2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    map = trackingInfo.selected;
                }
                if ((i11 & 2) != 0) {
                    map2 = trackingInfo.unselected;
                }
                return trackingInfo.copy(map, map2);
            }

            public final Map<String, TokenizedTrackingInfo> component1() {
                return this.selected;
            }

            public final Map<String, TokenizedTrackingInfo> component2() {
                return this.unselected;
            }

            @NotNull
            public final TrackingInfo copy(Map<String, TokenizedTrackingInfo> selected, Map<String, TokenizedTrackingInfo> unselected) {
                return new TrackingInfo(selected, unselected);
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

            public final Map<String, TokenizedTrackingInfo> getSelected() {
                return this.selected;
            }

            public final Map<String, TokenizedTrackingInfo> getUnselected() {
                return this.unselected;
            }

            public int hashCode() {
                Map<String, TokenizedTrackingInfo> map = this.selected;
                int hashCode = (map == null ? 0 : map.hashCode()) * 31;
                Map<String, TokenizedTrackingInfo> map2 = this.unselected;
                return hashCode + (map2 != null ? map2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "TrackingInfo(selected=" + this.selected + ", unselected=" + this.unselected + ")";
            }
        }

        public NotificationSource(SettingInfo settingInfo, Dialog dialog, @NotNull AtomDTO cell, TrackingInfo trackingInfo) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.settingInfo = settingInfo;
            this.dialog = dialog;
            this.cell = cell;
            this.trackingInfo = trackingInfo;
        }

        public static /* synthetic */ NotificationSource copy$default(NotificationSource notificationSource, SettingInfo settingInfo, Dialog dialog, AtomDTO atomDTO, TrackingInfo trackingInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                settingInfo = notificationSource.settingInfo;
            }
            if ((i11 & 2) != 0) {
                dialog = notificationSource.dialog;
            }
            if ((i11 & 4) != 0) {
                atomDTO = notificationSource.cell;
            }
            if ((i11 & 8) != 0) {
                trackingInfo = notificationSource.trackingInfo;
            }
            return notificationSource.copy(settingInfo, dialog, atomDTO, trackingInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final SettingInfo getSettingInfo() {
            return this.settingInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final Dialog getDialog() {
            return this.dialog;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final AtomDTO getCell() {
            return this.cell;
        }

        /* renamed from: component4, reason: from getter */
        public final TrackingInfo getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final NotificationSource copy(SettingInfo settingInfo, Dialog dialog, @NotNull AtomDTO cell, TrackingInfo trackingInfo) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            return new NotificationSource(settingInfo, dialog, cell, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotificationSource)) {
                return false;
            }
            NotificationSource notificationSource = (NotificationSource) other;
            return Intrinsics.d(this.settingInfo, notificationSource.settingInfo) && Intrinsics.d(this.dialog, notificationSource.dialog) && Intrinsics.d(this.cell, notificationSource.cell) && Intrinsics.d(this.trackingInfo, notificationSource.trackingInfo);
        }

        @NotNull
        public final AtomDTO getCell() {
            return this.cell;
        }

        public final Dialog getDialog() {
            return this.dialog;
        }

        public final SettingInfo getSettingInfo() {
            return this.settingInfo;
        }

        public final TrackingInfo getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            SettingInfo settingInfo = this.settingInfo;
            int hashCode = (settingInfo == null ? 0 : settingInfo.hashCode()) * 31;
            Dialog dialog = this.dialog;
            int hashCode2 = (this.cell.hashCode() + ((hashCode + (dialog == null ? 0 : dialog.hashCode())) * 31)) * 31;
            TrackingInfo trackingInfo = this.trackingInfo;
            return hashCode2 + (trackingInfo != null ? trackingInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "NotificationSource(settingInfo=" + this.settingInfo + ", dialog=" + this.dialog + ", cell=" + this.cell + ", trackingInfo=" + this.trackingInfo + ")";
        }
    }

    public NotificationsSettingsDTO(@NotNull String title, @NotNull String subtitle, @NotNull List<NotificationSource> sources) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(sources, "sources");
        this.title = title;
        this.subtitle = subtitle;
        this.sources = sources;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationsSettingsDTO copy$default(NotificationsSettingsDTO notificationsSettingsDTO, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = notificationsSettingsDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = notificationsSettingsDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = notificationsSettingsDTO.sources;
        }
        return notificationsSettingsDTO.copy(str, str2, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<NotificationSource> component3() {
        return this.sources;
    }

    @NotNull
    public final NotificationsSettingsDTO copy(@NotNull String title, @NotNull String subtitle, @NotNull List<NotificationSource> sources) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(sources, "sources");
        return new NotificationsSettingsDTO(title, subtitle, sources);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationsSettingsDTO)) {
            return false;
        }
        NotificationsSettingsDTO notificationsSettingsDTO = (NotificationsSettingsDTO) other;
        return Intrinsics.d(this.title, notificationsSettingsDTO.title) && Intrinsics.d(this.subtitle, notificationsSettingsDTO.subtitle) && Intrinsics.d(this.sources, notificationsSettingsDTO.sources);
    }

    @NotNull
    public final List<NotificationSource> getSources() {
        return this.sources;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.sources.hashCode() + g.a(this.title.hashCode() * 31, 31, this.subtitle);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        return C2618u.h(C3660k.d("NotificationsSettingsDTO(title=", str, ", subtitle=", str2, ", sources="), this.sources, ")");
    }
}
