package ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation;

import Ae.B0;
import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.data.storage.TravelStorageManagerHolder;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKey;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserVI;
import ru.ozon.app.android.travel.utils.FlowUtilsKt;
import xe.C10727i;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00160%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/data/storage/TravelStorageManagerHolder;", "travelStorageManagerHolder", "<init>", "(Lru/ozon/app/android/travel/data/storage/TravelStorageManagerHolder;)V", "", "targetAliasName", "", "putNameToStorage", "(Ljava/lang/String;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconEnum;", "currentIconName", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI;", "iconChooserVI", "bindData", "(Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconEnum;Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconSelectorVI;", "newSelectedIcon", "onIconSelected", "(Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconSelectorVI;)V", "LAe/x0;", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/UIState;", "_widgetState", "LAe/x0;", "LAe/w0;", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/Action;", "mutableAction", "LAe/w0;", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "iconChooserPageStorage", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "LAe/B0;", "action", "LAe/B0;", "getAction", "()LAe/B0;", "LAe/M0;", "widgetState", "LAe/M0;", "getWidgetState", "()LAe/M0;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconChooserViewModel extends w0 {

    @NotNull
    private final x0<UIState> _widgetState;

    @NotNull
    private final B0<Action> action;

    @NotNull
    private final TravelPageKeyValueStorage iconChooserPageStorage;

    @NotNull
    private final Ae.w0<Action> mutableAction;

    @NotNull
    private final M0<UIState> widgetState;

    public IconChooserViewModel(@NotNull TravelStorageManagerHolder travelStorageManagerHolder) {
        Intrinsics.checkNotNullParameter(travelStorageManagerHolder, "travelStorageManagerHolder");
        x0<UIState> a11 = O0.a(new UIState(null, 1, null));
        this._widgetState = a11;
        Ae.w0<Action> SingleEventsFlow = FlowUtilsKt.SingleEventsFlow();
        this.mutableAction = SingleEventsFlow;
        this.iconChooserPageStorage = travelStorageManagerHolder.getTravelStorageManager().getOrCreatePageStorage(TravelPageKey.ICON_CHOOSER);
        this.action = C2399j.a(SingleEventsFlow);
        this.widgetState = C2399j.b(a11);
    }

    private final void putNameToStorage(String targetAliasName) {
        this.iconChooserPageStorage.put("travelAppIconName", targetAliasName);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new IconChooserViewModel$putNameToStorage$2(this, targetAliasName, null), 3);
    }

    public final void bindData(@NotNull IconChooserVI.IconEnum currentIconName, IconChooserVI iconChooserVI) {
        Intrinsics.checkNotNullParameter(currentIconName, "currentIconName");
        if (iconChooserVI != null) {
            List<IconChooserVI.IconSelectorVI> iconSelectors = iconChooserVI.getIconSelectors();
            ArrayList arrayList = new ArrayList(C7714v.z(iconSelectors, 10));
            for (IconChooserVI.IconSelectorVI iconSelectorVI : iconSelectors) {
                arrayList.add(IconChooserMapperKt.selectOrDeselect(iconSelectorVI, iconChooserVI, currentIconName == iconSelectorVI.getAppIcon()));
            }
            this._widgetState.setValue(new UIState(IconChooserVI.copy$default(iconChooserVI, 0L, null, arrayList, null, null, null, 59, null)));
        }
    }

    @NotNull
    public final B0<Action> getAction() {
        return this.action;
    }

    @NotNull
    public final M0<UIState> getWidgetState() {
        return this.widgetState;
    }

    public final void onIconSelected(@NotNull IconChooserVI.IconSelectorVI newSelectedIcon) {
        Intrinsics.checkNotNullParameter(newSelectedIcon, "newSelectedIcon");
        IconChooserVI data = this._widgetState.getValue().getData();
        if (data != null) {
            List<IconChooserVI.IconSelectorVI> iconSelectors = data.getIconSelectors();
            ArrayList arrayList = new ArrayList(C7714v.z(iconSelectors, 10));
            for (IconChooserVI.IconSelectorVI iconSelectorVI : iconSelectors) {
                arrayList.add(IconChooserMapperKt.selectOrDeselect(iconSelectorVI, data, newSelectedIcon.getAppIcon() == iconSelectorVI.getAppIcon()));
            }
            this._widgetState.setValue(new UIState(IconChooserVI.copy$default(data, 0L, null, arrayList, null, null, null, 59, null)));
        }
        putNameToStorage(IconChooserMapperKt.mapToActivityAlias(newSelectedIcon.getAppIcon()));
    }
}
