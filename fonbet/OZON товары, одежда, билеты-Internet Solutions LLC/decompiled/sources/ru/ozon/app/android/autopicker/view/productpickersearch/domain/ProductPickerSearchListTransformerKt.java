package ru.ozon.app.android.autopicker.view.productpickersearch.domain;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7747g;
import kotlin.sequences.l;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter.Type;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u001a\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b\u001a\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b\u001a\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, d2 = {"toPlainList", "", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "items", "", "hasMultiselection", "", "showAllItems", "toListWithCaptions", "selectItemInRadioList", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "selectItemInCheckboxList", "toInitialState", "expandToSelected", "indexOfSelected", "", "autopicker_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductPickerSearchListTransformerKt {
    @NotNull
    public static final List<ProductPickerSearchVO.ProductPickerSearchItem> expandToSelected(@NotNull List<ProductPickerSearchVO.ProductPickerSearchItem> items, int i11) {
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList W02 = C7714v.W0(items);
        int offset = items.get(i11).getOffset();
        for (int i12 = i11; -1 < i12; i12--) {
            if (((ProductPickerSearchVO.ProductPickerSearchItem) W02.get(i12)).getOffset() == offset - 1) {
                W02.set(i12, ProductPickerSearchVO.ProductPickerSearchItem.copy$default((ProductPickerSearchVO.ProductPickerSearchItem) W02.get(i12), 0, null, null, null, 0, false, false, false, false, 0, null, 1951, null));
                int size = W02.size();
                for (int i13 = i12 + 1; i13 < size && ((ProductPickerSearchVO.ProductPickerSearchItem) W02.get(i13)).getOffset() != ((ProductPickerSearchVO.ProductPickerSearchItem) W02.get(i12)).getOffset(); i13++) {
                    if (((ProductPickerSearchVO.ProductPickerSearchItem) W02.get(i13)).getOffset() == ((ProductPickerSearchVO.ProductPickerSearchItem) W02.get(i12)).getOffset() + 1) {
                        W02.set(i13, ProductPickerSearchVO.ProductPickerSearchItem.copy$default((ProductPickerSearchVO.ProductPickerSearchItem) W02.get(i13), 0, null, null, null, 0, true, false, false, false, 0, null, 1951, null));
                    }
                }
                offset--;
                if (offset < 1) {
                    break;
                }
            }
        }
        return W02;
    }

    @NotNull
    public static final List<ProductPickerSearchVO.ProductPickerSearchItem> selectItemInCheckboxList(@NotNull List<ProductPickerSearchVO.ProductPickerSearchItem> items, @NotNull String value) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList W02 = C7714v.W0(items);
        int size = W02.size();
        for (int i11 = 0; i11 < size; i11++) {
            ProductPickerSearchVO.ProductPickerSearchItem productPickerSearchItem = (ProductPickerSearchVO.ProductPickerSearchItem) W02.get(i11);
            if (productPickerSearchItem.getType() == Type.CHECKBOX && Intrinsics.d(productPickerSearchItem.getValue(), value)) {
                W02.set(i11, ProductPickerSearchVO.ProductPickerSearchItem.copy$default(productPickerSearchItem, 0, null, null, null, 0, false, false, !productPickerSearchItem.getIsSelected(), false, 0, null, 1919, null));
            }
        }
        return W02;
    }

    @NotNull
    public static final List<ProductPickerSearchVO.ProductPickerSearchItem> selectItemInRadioList(@NotNull List<ProductPickerSearchVO.ProductPickerSearchItem> items, @NotNull String value) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList W02 = C7714v.W0(items);
        int size = W02.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((ProductPickerSearchVO.ProductPickerSearchItem) W02.get(i11)).getType() == Type.RADIO) {
                W02.set(i11, ProductPickerSearchVO.ProductPickerSearchItem.copy$default((ProductPickerSearchVO.ProductPickerSearchItem) W02.get(i11), 0, null, null, null, 0, false, false, Intrinsics.d(((ProductPickerSearchVO.ProductPickerSearchItem) W02.get(i11)).getValue(), value), false, 0, null, 1919, null));
            }
        }
        return W02;
    }

    private static final List<ProductPickerSearchVO.ProductPickerSearchItem> toInitialState(List<ProductPickerSearchVO.ProductPickerSearchItem> list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            CharSequence title = list.get(i11).getTitle();
            ProductPickerSearchVO.ProductPickerSearchItem productPickerSearchItem = list.get(i11);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(title);
            spannableStringBuilder.clearSpans();
            Unit unit = Unit.f71690a;
            list.set(i11, ProductPickerSearchVO.ProductPickerSearchItem.copy$default(productPickerSearchItem, 0, new SpannedString(spannableStringBuilder), null, null, 0, false, false, false, false, 0, null, 1981, null));
        }
        return list;
    }

    @NotNull
    public static final List<ProductPickerSearchVO.ProductPickerSearchItem> toListWithCaptions(@NotNull List<ProductPickerSearchVO.ProductPickerSearchItem> items) {
        String str;
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = new ArrayList();
        C7747g h11 = l.h(C7714v.w(items), ProductPickerSearchListTransformerKt$toListWithCaptions$1$1.INSTANCE);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = h11.iterator();
        while (true) {
            C7747g.a aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                break;
            }
            Object next = aVar.next();
            String obj = ((ProductPickerSearchVO.ProductPickerSearchItem) next).getTitle().toString();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = obj.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            Character F11 = h.F(upperCase);
            if (F11 != null && !Character.isLetter(F11.charValue())) {
                str = "1-9";
            } else if (F11 == null || (str = F11.toString()) == null) {
                str = "";
            }
            Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(str, obj2);
            }
            ((List) obj2).add(next);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
            String upperCase2 = str2.toUpperCase(locale2);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            arrayList.add(new ProductPickerSearchVO.ProductPickerSearchItem(0, upperCase2, Type.CAPTION, null, 1, false, false, false, false, 0, K.f71697a, 777, null));
            arrayList.addAll(toInitialState(C7714v.W0(list)));
        }
        return arrayList;
    }

    @NotNull
    public static final List<ProductPickerSearchVO.ProductPickerSearchItem> toPlainList(@NotNull List<ProductPickerSearchVO.ProductPickerSearchItem> items, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = new ArrayList();
        kotlin.jvm.internal.K k11 = new kotlin.jvm.internal.K();
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            toPlainList$lambda$3$dfs(z11, arrayList, k11, z12, (ProductPickerSearchVO.ProductPickerSearchItem) it.next(), 1);
        }
        return arrayList;
    }

    public static /* synthetic */ List toPlainList$default(List list, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        return toPlainList(list, z11, z12);
    }

    private static final void toPlainList$lambda$3$dfs(boolean z11, List<ProductPickerSearchVO.ProductPickerSearchItem> list, kotlin.jvm.internal.K k11, boolean z12, ProductPickerSearchVO.ProductPickerSearchItem productPickerSearchItem, int i11) {
        kotlin.jvm.internal.K k12 = k11;
        Type type = productPickerSearchItem.getChildren().isEmpty() ? z11 ? Type.CHECKBOX : Type.RADIO : Type.CATEGORY;
        int i12 = k12.f71785a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(productPickerSearchItem.getTitle());
        spannableStringBuilder.clearSpans();
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        boolean z13 = true;
        List<ProductPickerSearchVO.ProductPickerSearchItem> list2 = list;
        list2.add(new ProductPickerSearchVO.ProductPickerSearchItem(i12, spannedString, type, productPickerSearchItem.getValue(), i11, !z12, (z12 || i11 == 1) ? false : true, productPickerSearchItem.getIsSelected(), false, productPickerSearchItem.getChildren().size(), K.f71697a, 256, null));
        k12.f71785a++;
        Iterator<T> it = productPickerSearchItem.getChildren().iterator();
        while (it.hasNext()) {
            toPlainList$lambda$3$dfs(z11, list2, k12, z12, (ProductPickerSearchVO.ProductPickerSearchItem) it.next(), i11 + 1);
            list2 = list;
            k12 = k11;
            z13 = z13;
        }
    }
}
