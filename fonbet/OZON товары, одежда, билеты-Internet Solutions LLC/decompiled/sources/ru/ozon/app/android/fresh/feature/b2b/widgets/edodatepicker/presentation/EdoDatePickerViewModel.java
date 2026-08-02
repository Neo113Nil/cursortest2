package ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.presentation;

import android.net.Uri;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.utils.UtilsKt;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.presentation.EdoDatePickerState;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.presentation.EdoDateSingleEvent;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 72\u00020\u0001:\u00017B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR(\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\u000fR$\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010'R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020)018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020-018F¢\u0006\u0006\u001a\u0004\b5\u00103¨\u00068"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDatePickerViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Ljava/util/Date;", "startDate", "endDate", "", "updateState", "(Ljava/util/Date;Ljava/util/Date;)V", "date", "", "formatDateToQuery", "(Ljava/util/Date;)Ljava/lang/String;", "getStartEpochDate", "()Ljava/util/Date;", "getTodayDate", "link", "modifyRefreshLink", "(Ljava/lang/String;)Ljava/lang/String;", "onStartDateSelected", "(Ljava/util/Date;)V", "onEndDateSelected", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "refreshPage", "(Lru/ozon/app/android/composer/ComposerReferences;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/util/Date;", "getStartDate", "getEndDate", "currentPage", "Ljava/lang/String;", "getCurrentPage", "()Ljava/lang/String;", "setCurrentPage", "(Ljava/lang/String;)V", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDatePickerState;", "_filterState", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDateSingleEvent;", "_singleEvents", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "queryDateFormat", "Landroidx/lifecycle/P;", "getFilterState", "()Landroidx/lifecycle/P;", "filterState", "getSingleEvents", "singleEvents", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EdoDatePickerViewModel extends w0 {
    private String currentPage;
    private Date endDate;
    private Date startDate;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());

    @NotNull
    private final V<EdoDatePickerState> _filterState = new V<>(EdoDatePickerState.Unfilled.INSTANCE);

    @NotNull
    private final SingleLiveEvent<EdoDateSingleEvent> _singleEvents = new SingleLiveEvent<>();

    @NotNull
    private final SimpleDateFormat queryDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDatePickerViewModel$Companion;", "", "<init>", "()V", "EDO_DATE_PICKER_DATE_FORMAT", "", "DATE_FROM_QUERY", "DATE_TO_QUERY", "QUERY_DATE_FORMAT", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final String formatDateToQuery(Date date) {
        if (date != null) {
            return this.queryDateFormat.format(date);
        }
        return null;
    }

    private final Date getStartEpochDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, 0, 0);
        UtilsKt.setMinTimeForDate(calendar);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        return time;
    }

    private final Date getTodayDate() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        Date time = UtilsKt.setMinTimeForDate(calendar).getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        return time;
    }

    private final String modifyRefreshLink(String link) {
        Uri.Builder buildUpon = Uri.parse(link).buildUpon();
        buildUpon.clearQuery();
        Date date = this.startDate;
        if (date == null) {
            date = getStartEpochDate();
        }
        String formatDateToQuery = formatDateToQuery(date);
        if (formatDateToQuery != null) {
            buildUpon.appendQueryParameter("dateFrom", formatDateToQuery);
        }
        Date date2 = this.endDate;
        if (date2 == null) {
            date2 = getTodayDate();
        }
        String formatDateToQuery2 = formatDateToQuery(date2);
        if (formatDateToQuery2 != null) {
            buildUpon.appendQueryParameter("dateTo", formatDateToQuery2);
        }
        String uri = buildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    private final void updateState(Date startDate, Date endDate) {
        this._filterState.setValue(new EdoDatePickerState.Filled(startDate != null ? this.dateFormat.format(startDate) : null, endDate != null ? this.dateFormat.format(endDate) : null));
    }

    public final Date getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final P<EdoDatePickerState> getFilterState() {
        return this._filterState;
    }

    @NotNull
    public final P<EdoDateSingleEvent> getSingleEvents() {
        return this._singleEvents;
    }

    public final Date getStartDate() {
        return this.startDate;
    }

    public final void onEndDateSelected(Date date) {
        if (date == null || Intrinsics.d(this.endDate, date)) {
            return;
        }
        this.endDate = date;
        if (this.startDate == null) {
            this._singleEvents.setValue(EdoDateSingleEvent.OpenStartDatePicker.INSTANCE);
        }
        updateState(this.startDate, this.endDate);
    }

    public final void onStartDateSelected(Date date) {
        if (date == null || Intrinsics.d(this.startDate, date)) {
            return;
        }
        this.startDate = date;
        if (this.endDate == null) {
            this._singleEvents.setValue(EdoDateSingleEvent.OpenEndDatePicker.INSTANCE);
        }
        updateState(this.startDate, this.endDate);
    }

    public final void refreshPage(@NotNull ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        String str = this.currentPage;
        if (str != null) {
            InterfaceC7851b.a.e(refs.getController(), modifyRefreshLink(str), null, null, 6);
        }
    }

    public final void setCurrentPage(String str) {
        this.currentPage = str;
    }
}
