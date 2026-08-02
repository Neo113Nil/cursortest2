package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation;

import AA.d;
import C.C2702w;
import Cw.c;
import Lz.C3602a;
import Mc.a;
import P4.f;
import Sh.b;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.marketing.domain.ChangeSettingRequest;
import ru.ozon.app.android.marketing.domain.NotificationSettingsApi;
import ru.ozon.app.android.marketing.widgets.notificationssettings.data.NotificationsSettingsDTO;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsCellViewModelImpl;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorRepo;
import uc.i;
import vc.l;
import vc.n;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0002$%B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModel;", "Lru/ozon/app/android/marketing/domain/NotificationSettingsApi;", "api", "<init>", "(Lru/ozon/app/android/marketing/domain/NotificationSettingsApi;)V", "", "id", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$SettingInfo;", "info", "", "isSelected", "", "changeSetting", "(JLru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$SettingInfo;Z)V", "settingId", "commId", AppMeasurementSdk.ConditionalUserProperty.VALUE, "changeSettingInBottomSheet", "(JJJJ)V", "onCleared", "()V", "onDialogResult", "(J)V", "Lru/ozon/app/android/marketing/domain/NotificationSettingsApi;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action;", "actionLiveData", "Landroidx/lifecycle/V;", "getActionLiveData", "()Landroidx/lifecycle/V;", "", "Lnc/b;", "disposableMap", "Ljava/util/Map;", "Companion", "Action", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationsSettingsCellViewModelImpl extends w0 implements NotificationsSettingsCellViewModel {

    @NotNull
    private final V<Action> actionLiveData;

    @NotNull
    private final NotificationSettingsApi api;

    @NotNull
    private final Map<Long, InterfaceC8487b> disposableMap;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action;", "", "id", "", "<init>", "(J)V", "getId", "()J", "Progress", "SelectorChanged", "SettingChanged", "SettingSaved", "DialogResult", "Error", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action$DialogResult;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action$Error;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action$Progress;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action$SelectorChanged;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action$SettingChanged;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action$SettingSaved;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {
        private final long id;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action$DialogResult;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action;", "", "id", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DialogResult extends Action {
            private final long id;

            public DialogResult(long j11) {
                super(j11, null);
                this.id = j11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DialogResult) && this.id == ((DialogResult) other).id;
            }

            @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsCellViewModelImpl.Action
            public long getId() {
                return this.id;
            }

            public int hashCode() {
                return Long.hashCode(this.id);
            }

            @NotNull
            public String toString() {
                return b.b(this.id, "DialogResult(id=", ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action$Error;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action;", "", "id", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends Action {
            private final long id;

            public Error(long j11) {
                super(j11, null);
                this.id = j11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && this.id == ((Error) other).id;
            }

            @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsCellViewModelImpl.Action
            public long getId() {
                return this.id;
            }

            public int hashCode() {
                return Long.hashCode(this.id);
            }

            @NotNull
            public String toString() {
                return b.b(this.id, "Error(id=", ")");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action$Progress;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action;", "<init>", "()V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Progress extends Action {

            @NotNull
            public static final Progress INSTANCE = new Progress();

            private Progress() {
                super(0L, 1, null);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action$SelectorChanged;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action;", "", "id", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "getValue", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SelectorChanged extends Action {
            private final long id;
            private final long value;

            public SelectorChanged(long j11, long j12) {
                super(j11, null);
                this.id = j11;
                this.value = j12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectorChanged)) {
                    return false;
                }
                SelectorChanged selectorChanged = (SelectorChanged) other;
                return this.id == selectorChanged.id && this.value == selectorChanged.value;
            }

            @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsCellViewModelImpl.Action
            public long getId() {
                return this.id;
            }

            public final long getValue() {
                return this.value;
            }

            public int hashCode() {
                return Long.hashCode(this.value) + (Long.hashCode(this.id) * 31);
            }

            @NotNull
            public String toString() {
                return f.a(this.value, ")", C2702w.d(this.id, "SelectorChanged(id=", ", value="));
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action$SettingChanged;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action;", "", "id", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SettingChanged extends Action {
            private final long id;

            public SettingChanged(long j11) {
                super(j11, null);
                this.id = j11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SettingChanged) && this.id == ((SettingChanged) other).id;
            }

            @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsCellViewModelImpl.Action
            public long getId() {
                return this.id;
            }

            public int hashCode() {
                return Long.hashCode(this.id);
            }

            @NotNull
            public String toString() {
                return b.b(this.id, "SettingChanged(id=", ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action$SettingSaved;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action;", "", "id", "", "selected", "<init>", "(JZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "getSelected", "()Z", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SettingSaved extends Action {
            private final long id;
            private final boolean selected;

            public SettingSaved(long j11, boolean z11) {
                super(j11, null);
                this.id = j11;
                this.selected = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SettingSaved)) {
                    return false;
                }
                SettingSaved settingSaved = (SettingSaved) other;
                return this.id == settingSaved.id && this.selected == settingSaved.selected;
            }

            @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsCellViewModelImpl.Action
            public long getId() {
                return this.id;
            }

            public final boolean getSelected() {
                return this.selected;
            }

            public int hashCode() {
                return Boolean.hashCode(this.selected) + (Long.hashCode(this.id) * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder c11 = Bl.b.c(this.id, "SettingSaved(id=", ", selected=", this.selected);
                c11.append(")");
                return c11.toString();
            }
        }

        public /* synthetic */ Action(long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11);
        }

        public long getId() {
            return this.id;
        }

        private Action(long j11) {
            this.id = j11;
        }

        public /* synthetic */ Action(long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? -1L : j11, null);
        }
    }

    public NotificationsSettingsCellViewModelImpl(@NotNull NotificationSettingsApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
        this.actionLiveData = new V<>();
        this.disposableMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeSetting$lambda$1(NotificationsSettingsCellViewModelImpl notificationsSettingsCellViewModelImpl, long j11, boolean z11) {
        notificationsSettingsCellViewModelImpl.getActionLiveData().setValue(new Action.SettingSaved(j11, !z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeSettingInBottomSheet$lambda$4(NotificationsSettingsCellViewModelImpl notificationsSettingsCellViewModelImpl, long j11, long j12) {
        notificationsSettingsCellViewModelImpl.getActionLiveData().setValue(new Action.SelectorChanged(j11, j12));
        NotificationsSettingsSelectorRepo.INSTANCE.setShouldRefresh(true);
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsCellViewModel
    public void changeSetting(final long id2, @NotNull NotificationsSettingsDTO.NotificationSource.SettingInfo info, final boolean isSelected) {
        Intrinsics.checkNotNullParameter(info, "info");
        ChangeSettingRequest changeSettingRequest = new ChangeSettingRequest(info.getSettingId(), info.getCommId(), isSelected ? 2L : 1L);
        InterfaceC8487b interfaceC8487b = this.disposableMap.get(Long.valueOf(id2));
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        n f7 = new l(this.api.changeSetting(changeSettingRequest).k(a.b()), C8125a.a()).f(new C3602a(new NotificationsSettingsCellViewModelImpl$changeSetting$disposable$1(this, id2), 0));
        i iVar = new i(new d(new NotificationsSettingsCellViewModelImpl$changeSetting$disposable$3(this, id2), 2), new InterfaceC9019a() { // from class: Lz.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                NotificationsSettingsCellViewModelImpl.changeSetting$lambda$1(NotificationsSettingsCellViewModelImpl.this, id2, isSelected);
            }
        });
        f7.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        this.disposableMap.put(Long.valueOf(id2), iVar);
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsCellViewModel
    public void changeSettingInBottomSheet(final long id2, long settingId, long commId, final long value) {
        ChangeSettingRequest changeSettingRequest = new ChangeSettingRequest(settingId, commId, value);
        InterfaceC8487b interfaceC8487b = this.disposableMap.get(Long.valueOf(id2));
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        int i11 = 2;
        n f7 = new l(this.api.changeSetting(changeSettingRequest).k(a.b()), C8125a.a()).f(new c(new NotificationsSettingsCellViewModelImpl$changeSettingInBottomSheet$disposable$1(this), i11));
        i iVar = new i(new BT.c(new NotificationsSettingsCellViewModelImpl$changeSettingInBottomSheet$disposable$3(this, id2), i11), new InterfaceC9019a() { // from class: Lz.c
            @Override // qc.InterfaceC9019a
            public final void run() {
                NotificationsSettingsCellViewModelImpl.changeSettingInBottomSheet$lambda$4(NotificationsSettingsCellViewModelImpl.this, id2, value);
            }
        });
        f7.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        this.disposableMap.put(Long.valueOf(id2), iVar);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        Iterator<Map.Entry<Long, InterfaceC8487b>> it = this.disposableMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().dispose();
        }
        this.disposableMap.clear();
        super.onCleared();
    }

    public final void onDialogResult(long id2) {
        getActionLiveData().setValue(new Action.DialogResult(id2));
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsCellViewModel
    @NotNull
    public V<Action> getActionLiveData() {
        return this.actionLiveData;
    }
}
