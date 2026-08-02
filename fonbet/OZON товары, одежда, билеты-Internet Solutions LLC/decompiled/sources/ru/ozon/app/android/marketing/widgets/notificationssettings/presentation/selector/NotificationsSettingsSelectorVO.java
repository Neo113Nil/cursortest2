package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector;

import Ak.C2436a;
import E0.C2942q;
import G.g;
import Kk.C3532b;
import Lh.a;
import N3.C3660k;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.notificationssettings.data.NotificationsSettingsDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001+BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J^\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\"\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "type", "settingId", "commId", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;", "dialog", "", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO$Variant;", "variants", "<init>", "(JLjava/lang/String;Ljava/lang/String;JJLru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;Ljava/util/List;)V", "copy", "(JLjava/lang/String;Ljava/lang/String;JJLru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;Ljava/util/List;)Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getType", "getSettingId", "getCommId", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;", "getDialog", "()Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;", "Ljava/util/List;", "getVariants", "()Ljava/util/List;", "Variant", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NotificationsSettingsSelectorVO implements c {
    private final long commId;
    private final NotificationsSettingsDTO.NotificationSource.Dialog dialog;
    private final long id;
    private final long settingId;

    @NotNull
    private final String title;

    @NotNull
    private final String type;

    @NotNull
    private final List<Variant> variants;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\rJL\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u0006\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO$Variant;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "isSelected", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZJLWZ/t;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;ZJLWZ/t;)Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO$Variant;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Z", "()Z", "J", "getValue", "()J", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Variant {
        private final boolean isSelected;
        private final String subtitle;

        @NotNull
        private final String title;
        private final t trackingInfo;
        private final long value;

        public Variant(@NotNull String title, String str, boolean z11, long j11, t tVar) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = str;
            this.isSelected = z11;
            this.value = j11;
            this.trackingInfo = tVar;
        }

        public static /* synthetic */ Variant copy$default(Variant variant, String str, String str2, boolean z11, long j11, t tVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = variant.title;
            }
            if ((i11 & 2) != 0) {
                str2 = variant.subtitle;
            }
            if ((i11 & 4) != 0) {
                z11 = variant.isSelected;
            }
            if ((i11 & 8) != 0) {
                j11 = variant.value;
            }
            if ((i11 & 16) != 0) {
                tVar = variant.trackingInfo;
            }
            t tVar2 = tVar;
            boolean z12 = z11;
            return variant.copy(str, str2, z12, j11, tVar2);
        }

        @NotNull
        public final Variant copy(@NotNull String title, String subtitle, boolean isSelected, long value, t trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Variant(title, subtitle, isSelected, value, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Variant)) {
                return false;
            }
            Variant variant = (Variant) other;
            return Intrinsics.d(this.title, variant.title) && Intrinsics.d(this.subtitle, variant.subtitle) && this.isSelected == variant.isSelected && this.value == variant.value && Intrinsics.d(this.trackingInfo, variant.trackingInfo);
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final t getTrackingInfo() {
            return this.trackingInfo;
        }

        public final long getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int a11 = Pk0.c.a(C3532b.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isSelected), 31, this.value);
            t tVar = this.trackingInfo;
            return a11 + (tVar != null ? tVar.hashCode() : 0);
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            boolean z11 = this.isSelected;
            long j11 = this.value;
            t tVar = this.trackingInfo;
            StringBuilder d11 = C3660k.d("Variant(title=", str, ", subtitle=", str2, ", isSelected=");
            d11.append(z11);
            d11.append(", value=");
            d11.append(j11);
            return a.b(d11, ", trackingInfo=", tVar, ")");
        }
    }

    public NotificationsSettingsSelectorVO(long j11, @NotNull String title, @NotNull String type, long j12, long j13, NotificationsSettingsDTO.NotificationSource.Dialog dialog, @NotNull List<Variant> variants) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(variants, "variants");
        this.id = j11;
        this.title = title;
        this.type = type;
        this.settingId = j12;
        this.commId = j13;
        this.dialog = dialog;
        this.variants = variants;
    }

    public static /* synthetic */ NotificationsSettingsSelectorVO copy$default(NotificationsSettingsSelectorVO notificationsSettingsSelectorVO, long j11, String str, String str2, long j12, long j13, NotificationsSettingsDTO.NotificationSource.Dialog dialog, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = notificationsSettingsSelectorVO.id;
        }
        long j14 = j11;
        if ((i11 & 2) != 0) {
            str = notificationsSettingsSelectorVO.title;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = notificationsSettingsSelectorVO.type;
        }
        return notificationsSettingsSelectorVO.copy(j14, str3, str2, (i11 & 8) != 0 ? notificationsSettingsSelectorVO.settingId : j12, (i11 & 16) != 0 ? notificationsSettingsSelectorVO.commId : j13, (i11 & 32) != 0 ? notificationsSettingsSelectorVO.dialog : dialog, (i11 & 64) != 0 ? notificationsSettingsSelectorVO.variants : list);
    }

    @NotNull
    public final NotificationsSettingsSelectorVO copy(long id2, @NotNull String title, @NotNull String type, long settingId, long commId, NotificationsSettingsDTO.NotificationSource.Dialog dialog, @NotNull List<Variant> variants) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(variants, "variants");
        return new NotificationsSettingsSelectorVO(id2, title, type, settingId, commId, dialog, variants);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationsSettingsSelectorVO)) {
            return false;
        }
        NotificationsSettingsSelectorVO notificationsSettingsSelectorVO = (NotificationsSettingsSelectorVO) other;
        return this.id == notificationsSettingsSelectorVO.id && Intrinsics.d(this.title, notificationsSettingsSelectorVO.title) && Intrinsics.d(this.type, notificationsSettingsSelectorVO.type) && this.settingId == notificationsSettingsSelectorVO.settingId && this.commId == notificationsSettingsSelectorVO.commId && Intrinsics.d(this.dialog, notificationsSettingsSelectorVO.dialog) && Intrinsics.d(this.variants, notificationsSettingsSelectorVO.variants);
    }

    public final long getCommId() {
        return this.commId;
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

    public final long getSettingId() {
        return this.settingId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<Variant> getVariants() {
        return this.variants;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = Pk0.c.a(Pk0.c.a(g.a(g.a(Long.hashCode(this.id) * 31, 31, this.title), 31, this.type), 31, this.settingId), 31, this.commId);
        NotificationsSettingsDTO.NotificationSource.Dialog dialog = this.dialog;
        return this.variants.hashCode() + ((a11 + (dialog == null ? 0 : dialog.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.type;
        long j12 = this.settingId;
        long j13 = this.commId;
        NotificationsSettingsDTO.NotificationSource.Dialog dialog = this.dialog;
        List<Variant> list = this.variants;
        StringBuilder c11 = C2436a.c(j11, "NotificationsSettingsSelectorVO(id=", ", title=", str);
        c11.append(", type=");
        c11.append(str2);
        c11.append(", settingId=");
        c11.append(j12);
        C2942q.f(c11, ", commId=", j13, ", dialog=");
        c11.append(dialog);
        c11.append(", variants=");
        c11.append(list);
        c11.append(")");
        return c11.toString();
    }
}
