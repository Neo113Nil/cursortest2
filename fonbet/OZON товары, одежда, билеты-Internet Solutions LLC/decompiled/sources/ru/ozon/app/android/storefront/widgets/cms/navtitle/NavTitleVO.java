package ru.ozon.app.android.storefront.widgets.cms.navtitle;

import kotlin.Metadata;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "getTitle", "()Ljava/lang/String;", SelectionItemFormDTO.TITLE_FIELD_NAME, "getSubtitle", "subtitle", "getTitleColor", "titleColor", "getSubtitleColor", "subtitleColor", "Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleAlign;", "getAlign", "()Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleAlign;", "align", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface NavTitleVO extends c {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Integer getScrollWidgetKey(@NotNull NavTitleVO navTitleVO) {
            return null;
        }

        public static int getViewItemKey(@NotNull NavTitleVO navTitleVO) {
            return navTitleVO.hashCode();
        }
    }

    @NotNull
    NavTitleAlign getAlign();

    String getSubtitle();

    String getSubtitleColor();

    @NotNull
    String getTitle();

    String getTitleColor();
}
