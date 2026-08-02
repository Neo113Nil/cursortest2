package ru.ozon.app.android.marketing.widgets.notificationssettings.data;

import E0.C2942q;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Pk0.c;
import Ul.C4070a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.notificationssettings.data.NotificationsSettingsDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsSelectorDTO;", "", "schedule", "", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsSelectorDTO$Schedule;", "<init>", "(Ljava/util/List;)V", "getSchedule", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Schedule", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NotificationsSettingsSelectorDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<Schedule> schedule;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsSelectorDTO$Schedule;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "type", "settingId", "", "commId", "dialog", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;", "variants", "", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsSelectorDTO$Schedule$Variant;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getType", "getSettingId", "()J", "getCommId", "getDialog", "()Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;", "getVariants", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Variant", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Schedule {
        public static final int $stable = 8;
        private final long commId;
        private final NotificationsSettingsDTO.NotificationSource.Dialog dialog;
        private final long settingId;

        @NotNull
        private final String title;

        @NotNull
        private final String type;

        @NotNull
        private final List<Variant> variants;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JW\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsSelectorDTO$Schedule$Variant;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "dialog", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;", "isSelected", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;ZLjava/lang/String;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDialog", "()Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;", "()Z", "getValue", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Variant {
            public static final int $stable = 8;
            private final NotificationsSettingsDTO.NotificationSource.Dialog dialog;
            private final boolean isSelected;
            private final String subtitle;

            @NotNull
            private final String title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @NotNull
            private final String value;

            public Variant(@NotNull String title, String str, NotificationsSettingsDTO.NotificationSource.Dialog dialog, boolean z11, @NotNull String value, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(value, "value");
                this.title = title;
                this.subtitle = str;
                this.dialog = dialog;
                this.isSelected = z11;
                this.value = value;
                this.trackingInfo = map;
            }

            public static /* synthetic */ Variant copy$default(Variant variant, String str, String str2, NotificationsSettingsDTO.NotificationSource.Dialog dialog, boolean z11, String str3, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = variant.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = variant.subtitle;
                }
                if ((i11 & 4) != 0) {
                    dialog = variant.dialog;
                }
                if ((i11 & 8) != 0) {
                    z11 = variant.isSelected;
                }
                if ((i11 & 16) != 0) {
                    str3 = variant.value;
                }
                if ((i11 & 32) != 0) {
                    map = variant.trackingInfo;
                }
                String str4 = str3;
                Map map2 = map;
                return variant.copy(str, str2, dialog, z11, str4, map2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component3, reason: from getter */
            public final NotificationsSettingsDTO.NotificationSource.Dialog getDialog() {
                return this.dialog;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final Map<String, TokenizedTrackingInfo> component6() {
                return this.trackingInfo;
            }

            @NotNull
            public final Variant copy(@NotNull String title, String subtitle, NotificationsSettingsDTO.NotificationSource.Dialog dialog, boolean isSelected, @NotNull String value, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(value, "value");
                return new Variant(title, subtitle, dialog, isSelected, value, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Variant)) {
                    return false;
                }
                Variant variant = (Variant) other;
                return Intrinsics.d(this.title, variant.title) && Intrinsics.d(this.subtitle, variant.subtitle) && Intrinsics.d(this.dialog, variant.dialog) && this.isSelected == variant.isSelected && Intrinsics.d(this.value, variant.value) && Intrinsics.d(this.trackingInfo, variant.trackingInfo);
            }

            public final NotificationsSettingsDTO.NotificationSource.Dialog getDialog() {
                return this.dialog;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.subtitle;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                NotificationsSettingsDTO.NotificationSource.Dialog dialog = this.dialog;
                int a11 = g.a(C3532b.a((hashCode2 + (dialog == null ? 0 : dialog.hashCode())) * 31, 31, this.isSelected), 31, this.value);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return a11 + (map != null ? map.hashCode() : 0);
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                NotificationsSettingsDTO.NotificationSource.Dialog dialog = this.dialog;
                boolean z11 = this.isSelected;
                String str3 = this.value;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder d11 = C3660k.d("Variant(title=", str, ", subtitle=", str2, ", dialog=");
                d11.append(dialog);
                d11.append(", isSelected=");
                d11.append(z11);
                d11.append(", value=");
                return C4070a.a(d11, str3, ", trackingInfo=", map, ")");
            }
        }

        public Schedule(@NotNull String title, @NotNull String type, long j11, long j12, NotificationsSettingsDTO.NotificationSource.Dialog dialog, @NotNull List<Variant> variants) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(variants, "variants");
            this.title = title;
            this.type = type;
            this.settingId = j11;
            this.commId = j12;
            this.dialog = dialog;
            this.variants = variants;
        }

        public static /* synthetic */ Schedule copy$default(Schedule schedule, String str, String str2, long j11, long j12, NotificationsSettingsDTO.NotificationSource.Dialog dialog, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = schedule.title;
            }
            if ((i11 & 2) != 0) {
                str2 = schedule.type;
            }
            if ((i11 & 4) != 0) {
                j11 = schedule.settingId;
            }
            if ((i11 & 8) != 0) {
                j12 = schedule.commId;
            }
            if ((i11 & 16) != 0) {
                dialog = schedule.dialog;
            }
            if ((i11 & 32) != 0) {
                list = schedule.variants;
            }
            long j13 = j12;
            long j14 = j11;
            return schedule.copy(str, str2, j14, j13, dialog, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final long getSettingId() {
            return this.settingId;
        }

        /* renamed from: component4, reason: from getter */
        public final long getCommId() {
            return this.commId;
        }

        /* renamed from: component5, reason: from getter */
        public final NotificationsSettingsDTO.NotificationSource.Dialog getDialog() {
            return this.dialog;
        }

        @NotNull
        public final List<Variant> component6() {
            return this.variants;
        }

        @NotNull
        public final Schedule copy(@NotNull String title, @NotNull String type, long settingId, long commId, NotificationsSettingsDTO.NotificationSource.Dialog dialog, @NotNull List<Variant> variants) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(variants, "variants");
            return new Schedule(title, type, settingId, commId, dialog, variants);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Schedule)) {
                return false;
            }
            Schedule schedule = (Schedule) other;
            return Intrinsics.d(this.title, schedule.title) && Intrinsics.d(this.type, schedule.type) && this.settingId == schedule.settingId && this.commId == schedule.commId && Intrinsics.d(this.dialog, schedule.dialog) && Intrinsics.d(this.variants, schedule.variants);
        }

        public final long getCommId() {
            return this.commId;
        }

        public final NotificationsSettingsDTO.NotificationSource.Dialog getDialog() {
            return this.dialog;
        }

        public final long getSettingId() {
            return this.settingId;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final List<Variant> getVariants() {
            return this.variants;
        }

        public int hashCode() {
            int a11 = c.a(c.a(g.a(this.title.hashCode() * 31, 31, this.type), 31, this.settingId), 31, this.commId);
            NotificationsSettingsDTO.NotificationSource.Dialog dialog = this.dialog;
            return this.variants.hashCode() + ((a11 + (dialog == null ? 0 : dialog.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.type;
            long j11 = this.settingId;
            long j12 = this.commId;
            NotificationsSettingsDTO.NotificationSource.Dialog dialog = this.dialog;
            List<Variant> list = this.variants;
            StringBuilder d11 = C3660k.d("Schedule(title=", str, ", type=", str2, ", settingId=");
            d11.append(j11);
            C2942q.f(d11, ", commId=", j12, ", dialog=");
            d11.append(dialog);
            d11.append(", variants=");
            d11.append(list);
            d11.append(")");
            return d11.toString();
        }
    }

    public NotificationsSettingsSelectorDTO(@NotNull List<Schedule> schedule) {
        Intrinsics.checkNotNullParameter(schedule, "schedule");
        this.schedule = schedule;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationsSettingsSelectorDTO copy$default(NotificationsSettingsSelectorDTO notificationsSettingsSelectorDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = notificationsSettingsSelectorDTO.schedule;
        }
        return notificationsSettingsSelectorDTO.copy(list);
    }

    @NotNull
    public final List<Schedule> component1() {
        return this.schedule;
    }

    @NotNull
    public final NotificationsSettingsSelectorDTO copy(@NotNull List<Schedule> schedule) {
        Intrinsics.checkNotNullParameter(schedule, "schedule");
        return new NotificationsSettingsSelectorDTO(schedule);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NotificationsSettingsSelectorDTO) && Intrinsics.d(this.schedule, ((NotificationsSettingsSelectorDTO) other).schedule);
    }

    @NotNull
    public final List<Schedule> getSchedule() {
        return this.schedule;
    }

    public int hashCode() {
        return this.schedule.hashCode();
    }

    @NotNull
    public String toString() {
        return H3.c.a("NotificationsSettingsSelectorDTO(schedule=", ")", this.schedule);
    }
}
