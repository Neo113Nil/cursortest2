package ru.ozon.app.android.atoms.v3.holders.listed;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.atoms.data.list.NumberedListAtom;
import ru.ozon.app.android.atoms.v3.molecules.NumberedListContainer;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.AtomV3;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/listed/NumberedListHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/app/android/atoms/data/list/NumberedListAtom;", "Lru/ozon/app/android/atoms/v3/molecules/NumberedListContainer;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/atoms/v3/molecules/NumberedListContainer;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NumberedListHolder extends AtomV3<NumberedListAtom, NumberedListContainer> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberedListHolder(@NotNull NumberedListContainer view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NumberedListHolder(@NotNull Context context, String str) {
        this(new NumberedListContainer(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull NumberedListAtom item) {
        OzonSpannableString number;
        String num;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((NumberedListHolder) item);
        List<ListElementAtom.NumberedListElement> items = item.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ListElementAtom.NumberedListElement numberedListElement = (ListElementAtom.NumberedListElement) obj;
            Integer startIndex = item.getStartIndex();
            if (startIndex == null || (num = Integer.valueOf(startIndex.intValue() + i11).toString()) == null || (number = OzonSpannableStringKt.toOzonSpannableString(num)) == null) {
                number = numberedListElement.getNumber();
            }
            OzonSpannableString ozonSpannableString = number;
            String textColor = item.getTextColor();
            if (textColor == null) {
                textColor = numberedListElement.getTextColor();
            }
            arrayList.add(ListElementAtom.NumberedListElement.copy$default(numberedListElement, null, ozonSpannableString, textColor, (!item.getSeparated() || i11 >= C7714v.P(item.getItems())) ? numberedListElement.getHasSeparator() : true, null, null, null, 113, null));
            i11 = i12;
        }
        getContainerView().bind(arrayList);
    }
}
