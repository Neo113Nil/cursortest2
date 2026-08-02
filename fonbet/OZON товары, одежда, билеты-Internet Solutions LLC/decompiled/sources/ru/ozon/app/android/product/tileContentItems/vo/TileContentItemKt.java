package ru.ozon.app.android.product.tileContentItems.vo;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.labelList.presentation.vo.LabelListMapperKt;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItem;
import ru.ozon.app.android.storefront.data.tiles.labellist.LabelListDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"mapContentElements", "", "Lru/ozon/app/android/product/tileContentItems/vo/TileContentItem;", "", "isTextTagSupported", "", "(Ljava/util/List;Ljava/lang/Boolean;)Ljava/util/List;", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileContentItemKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0012 A[SYNTHETIC] */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<TileContentItem> mapContentElements(@NotNull List<? extends Object> list, Boolean bool) {
        Object atom;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if ((obj instanceof TextDTO) && Intrinsics.d(bool, Boolean.TRUE)) {
                atom = new TileContentItem.Atom(TextDTO.copy$default((TextDTO) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null));
                if (atom == null) {
                    arrayList.add(atom);
                }
            }
            atom = obj instanceof AtomDTO ? new TileContentItem.Atom((AtomDTO) obj) : obj instanceof LabelListDTO ? new TileContentItem.LabelListV2(LabelListMapperKt.toVO((LabelListDTO) obj)) : null;
            if (atom == null) {
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List mapContentElements$default(List list, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = null;
        }
        return mapContentElements(list, bool);
    }
}
