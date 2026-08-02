package ru.ozon.app.android.storefront.stories.setContainer.data;

import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/data/CommonVoSet;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "getTitle", "()Ljava/lang/String;", SelectionItemFormDTO.TITLE_FIELD_NAME, "getSubtitle", "subtitle", "", "Lru/ozon/app/android/storefront/stories/setContainer/data/CommonItemVO;", "getPreviews", "()Ljava/util/List;", "previews", "Landroid/os/Parcelable;", "getScrollState", "()Landroid/os/Parcelable;", "setScrollState", "(Landroid/os/Parcelable;)V", "scrollState", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface CommonVoSet extends c {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Integer getScrollWidgetKey(@NotNull CommonVoSet commonVoSet) {
            return null;
        }

        public static int getViewItemKey(@NotNull CommonVoSet commonVoSet) {
            return commonVoSet.hashCode();
        }
    }

    @NotNull
    List<CommonItemVO> getPreviews();

    Parcelable getScrollState();

    String getSubtitle();

    @NotNull
    String getTitle();

    void setScrollState(Parcelable parcelable);
}
