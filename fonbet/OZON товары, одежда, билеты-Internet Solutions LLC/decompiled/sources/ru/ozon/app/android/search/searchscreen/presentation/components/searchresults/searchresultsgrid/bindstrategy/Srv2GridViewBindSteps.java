package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy;

import java.util.List;
import kotlin.Metadata;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.search.producttilebuttons.MultiButtonVO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0018\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bH&J\b\u0010\t\u001a\u00020\u0003H&J\u001c\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/Srv2GridViewBindSteps;", "", "bindGallery", "", "bindBadges", "bindMainState", "bindTopRightButtons", "topRightButtons", "", "bindButtons", "state", "Lru/ozon/app/android/search/producttilebuttons/MultiButtonVO;", "actionHandler", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "bindFooter", "bindBackground", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface Srv2GridViewBindSteps {
    void bindBackground();

    void bindBadges();

    void bindButtons();

    void bindButtons(MultiButtonVO state, DisposableActionHandler actionHandler);

    void bindFooter();

    void bindGallery();

    void bindMainState();

    void bindTopRightButtons();

    void bindTopRightButtons(List<? extends Object> topRightButtons);
}
