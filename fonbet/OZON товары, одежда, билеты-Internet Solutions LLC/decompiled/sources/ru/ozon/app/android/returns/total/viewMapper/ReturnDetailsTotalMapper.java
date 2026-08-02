package ru.ozon.app.android.returns.total.viewMapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.total.data.dto.ReturnDetailsTotalDto;
import ru.ozon.app.android.returns.total.presentation.viewObject.ReturnDetailsTotalVO;
import ru.ozon.app.android.returns.ui.molecules.balance.data.BalanceDetailsBlockDTO;
import ru.ozon.app.android.returns.ui.molecules.balance.data.BalanceRowDTO;
import ru.ozon.app.android.returns.ui.molecules.balance.mappers.BalanceMapperKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/returns/total/viewMapper/ReturnDetailsTotalMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/returns/total/data/dto/ReturnDetailsTotalDto;", "Ll20/d;", "", "Lru/ozon/app/android/returns/total/presentation/viewObject/ReturnDetailsTotalVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/returns/total/data/dto/ReturnDetailsTotalDto;Ljava/lang/String;)Lru/ozon/app/android/returns/total/presentation/viewObject/ReturnDetailsTotalVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/returns/total/data/dto/ReturnDetailsTotalDto;Ll20/d;)Ljava/util/List;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnDetailsTotalMapper implements Function2<ReturnDetailsTotalDto, d, List<? extends ReturnDetailsTotalVO>> {
    private final ReturnDetailsTotalVO toVO(ReturnDetailsTotalDto returnDetailsTotalDto, String str) {
        long hashCode = str.hashCode();
        String backgroundColor = returnDetailsTotalDto.getBackgroundColor();
        List<BalanceRowDTO> rows = returnDetailsTotalDto.getRows();
        if (rows == null) {
            rows = K.f71697a;
        }
        List<BalanceRowDTO> list = rows;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                BalanceDetailsBlockDTO refundDetailsBlock = returnDetailsTotalDto.getRefundDetailsBlock();
                return new ReturnDetailsTotalVO(hashCode, backgroundColor, arrayList, refundDetailsBlock != null ? BalanceMapperKt.toVO(refundDetailsBlock, str) : null, returnDetailsTotalDto.getCommon());
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(BalanceMapperKt.toVO((BalanceRowDTO) next, str, i11));
            i11 = i12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReturnDetailsTotalVO> invoke(@NotNull ReturnDetailsTotalDto state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d()));
    }
}
