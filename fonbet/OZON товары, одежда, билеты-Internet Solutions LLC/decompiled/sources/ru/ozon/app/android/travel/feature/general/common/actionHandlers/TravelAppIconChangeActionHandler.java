package ru.ozon.app.android.travel.feature.general.common.actionHandlers;

import Lm0.a;
import Vg.f;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.appcompat.app.x;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import com.google.android.material.bottomsheet.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.travel.data.storage.TravelStorageManagerHolder;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKey;
import ru.ozon.app.android.utils.ApplicationUtilsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\b\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/actionHandlers/TravelAppIconChangeActionHandler;", "LVg/f;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/data/storage/TravelStorageManagerHolder;", "travelStorageManagerHolder", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/travel/data/storage/TravelStorageManagerHolder;)V", "Landroidx/fragment/app/G;", "fragmentManager", "", "targetAliasName", "", "changeAppIcon", "(Landroid/content/Context;Landroidx/fragment/app/G;Ljava/lang/String;)V", "closeAllBottomSheets", "(Landroidx/fragment/app/G;)V", "LTg/b;", "action", "LVg/f$a;", "widgetInfo", "Lk20/g;", "widgetComponentStorage", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "Landroid/content/Context;", "Lru/ozon/app/android/travel/data/storage/TravelStorageManagerHolder;", "", "activityAliases", "[Ljava/lang/String;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelAppIconChangeActionHandler extends f {

    @NotNull
    private final String actionId;

    @NotNull
    private final String[] activityAliases;

    @NotNull
    private final Context context;

    @NotNull
    private final TravelStorageManagerHolder travelStorageManagerHolder;
    public static final int $stable = 8;

    public TravelAppIconChangeActionHandler(@NotNull Context context, @NotNull TravelStorageManagerHolder travelStorageManagerHolder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(travelStorageManagerHolder, "travelStorageManagerHolder");
        this.context = context;
        this.travelStorageManagerHolder = travelStorageManagerHolder;
        this.activityAliases = new String[]{"OzonTravelActivityDefault", "OzonTravelActivityPremium1", "OzonTravelActivityPremium2", "OzonTravelActivityPremium3"};
        this.actionId = "travelChangeAppIcon";
    }

    private final void changeAppIcon(Context context, G fragmentManager, String targetAliasName) {
        PackageManager packageManager = context.getPackageManager();
        String[] strArr = this.activityAliases;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("ru.ozon.app.android.travel.feature.entry." + str);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                packageManager.setComponentEnabledSetting(new ComponentName(context, (String) it.next()), 2, 1);
            } catch (Exception e11) {
                a.f17149a.e(e11);
            }
        }
        try {
            packageManager.setComponentEnabledSetting(new ComponentName(context, Nk.a.b("ru.ozon.app.android.travel.feature.entry.", targetAliasName)), 1, 1);
        } catch (Exception e12) {
            a.f17149a.e(e12);
        }
        if (fragmentManager != null) {
            closeAllBottomSheets(fragmentManager);
        }
        ApplicationUtilsKt.restartApp(context);
    }

    private final void closeAllBottomSheets(G fragmentManager) {
        ComponentCallbacksC5392m parentFragment;
        G parentFragmentManager;
        List<ComponentCallbacksC5392m> r02;
        List<ComponentCallbacksC5392m> r03 = fragmentManager.r0();
        Intrinsics.checkNotNullExpressionValue(r03, "getFragments(...)");
        ComponentCallbacksC5392m componentCallbacksC5392m = (ComponentCallbacksC5392m) C7714v.Z(r03);
        if (componentCallbacksC5392m == null || (parentFragment = componentCallbacksC5392m.getParentFragment()) == null || (parentFragmentManager = parentFragment.getParentFragmentManager()) == null || (r02 = parentFragmentManager.r0()) == null) {
            return;
        }
        for (ComponentCallbacksC5392m componentCallbacksC5392m2 : r02) {
            if ((componentCallbacksC5392m2 instanceof BottomSheetComposerFragment) || (componentCallbacksC5392m2 instanceof b)) {
                ((x) componentCallbacksC5392m2).dismissAllowingStateLoss();
            }
        }
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // Vg.f
    public void processWidgetAction(@NotNull Tg.b action, @NotNull f.a widgetInfo, @NotNull C7475g widgetComponentStorage) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        Object value = this.travelStorageManagerHolder.getTravelStorageManager().getOrCreatePageStorage(TravelPageKey.ICON_CHOOSER).getValue("travelAppIconName");
        if (value == null) {
            value = "OzonTravelActivityDefault";
        }
        changeAppIcon(this.context, widgetInfo.a().d(), value.toString());
    }
}
