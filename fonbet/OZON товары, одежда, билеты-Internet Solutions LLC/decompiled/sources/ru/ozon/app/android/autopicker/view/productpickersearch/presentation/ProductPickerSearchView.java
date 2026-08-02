package ru.ozon.app.android.autopicker.view.productpickersearch.presentation;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\fH&¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u001b\u0010\u001aJ#\u0010\u001e\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\fH&¢\u0006\u0004\b!\u0010\u000fJ\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H&¢\u0006\u0004\b&\u0010'R*\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8&@&X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8&@&X¦\u000e¢\u0006\f\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R0\u00106\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0004\u0018\u0001018&@&X¦\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8&@&X¦\u000e¢\u0006\f\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,¨\u0006:"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchView;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "onNewTitleData", "(Ljava/lang/String;)V", "subtitle", "onNewButtonData", "(Ljava/lang/String;Ljava/lang/String;)V", "hint", "onNewSearchData", "", "isTree", "onNewScreenStructureData", "(Z)V", "", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "items", "onNewItems", "(Ljava/util/List;)V", "enable", "onEnableButton", "", "position", "onScroll", "(I)V", "onSmoothScroll", "", "params", "onNewParams", "(Ljava/util/Map;)V", "show", "onProgress", "", "error", "onError", "(Ljava/lang/Throwable;)V", "onFinish", "()V", "Lkotlin/Function1;", "getOnMainButtonClicked", "()Lkotlin/jvm/functions/Function1;", "setOnMainButtonClicked", "(Lkotlin/jvm/functions/Function1;)V", "onMainButtonClicked", "getOnLeafClicked", "setOnLeafClicked", "onLeafClicked", "Lkotlin/Function2;", "getOnNodeClicked", "()Lkotlin/jvm/functions/Function2;", "setOnNodeClicked", "(Lkotlin/jvm/functions/Function2;)V", "onNodeClicked", "getOnSearch", "setOnSearch", "onSearch", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ProductPickerSearchView {
    void onEnableButton(boolean enable);

    void onError(@NotNull Throwable error);

    void onFinish();

    void onNewButtonData(@NotNull String title, String subtitle);

    void onNewItems(@NotNull List<ProductPickerSearchVO.ProductPickerSearchItem> items);

    void onNewParams(@NotNull Map<String, ? extends Object> params);

    void onNewScreenStructureData(boolean isTree);

    void onNewSearchData(String hint);

    void onNewTitleData(@NotNull String title);

    void onProgress(boolean show);

    void onScroll(int position);

    void onSmoothScroll(int position);

    void setOnLeafClicked(Function1<? super ProductPickerSearchVO.ProductPickerSearchItem, Unit> function1);

    void setOnMainButtonClicked(Function1<? super Boolean, Unit> function1);

    void setOnNodeClicked(Function2<? super ProductPickerSearchVO.ProductPickerSearchItem, ? super Integer, Unit> function2);

    void setOnSearch(Function1<? super String, Unit> function1);
}
