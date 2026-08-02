package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\tR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R<\u0010\u0019\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorView;", "", "", "id", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "onSelectorChanged", "(JJ)V", "onDialogResult", "(J)V", "onShowProgress", "()V", "onHideProgress", "onError", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO;", "getItem", "()Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO;", "setItem", "(Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO;)V", "item", "Lkotlin/Function4;", "getOnSettingChanged", "()Lfd/o;", "setOnSettingChanged", "(Lfd/o;)V", "onSettingChanged", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface NotificationsSettingsSelectorView {
    NotificationsSettingsSelectorVO getItem();

    void onDialogResult(long id2);

    void onError(long id2);

    void onHideProgress();

    void onSelectorChanged(long id2, long value);

    void onShowProgress();

    void setOnSettingChanged(InterfaceC6512o<? super Long, ? super Long, ? super Long, ? super Long, Unit> interfaceC6512o);
}
