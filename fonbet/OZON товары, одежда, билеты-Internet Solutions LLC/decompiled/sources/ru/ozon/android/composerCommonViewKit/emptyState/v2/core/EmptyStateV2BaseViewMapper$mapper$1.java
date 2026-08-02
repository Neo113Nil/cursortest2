package ru.ozon.android.composerCommonViewKit.emptyState.v2.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model.EmptyStateV2TopPartModel;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2TopPartVO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/EmptyStateV2TopPartModel;", "dto", "Ll20/d;", "info", "", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2TopPartVO;", "invoke", "(Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/EmptyStateV2TopPartModel;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class EmptyStateV2BaseViewMapper$mapper$1 extends AbstractC7737t implements Function2<EmptyStateV2TopPartModel, d, List<? extends EmptyStateV2TopPartVO>> {
    public static final EmptyStateV2BaseViewMapper$mapper$1 INSTANCE = new EmptyStateV2BaseViewMapper$mapper$1();

    EmptyStateV2BaseViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<EmptyStateV2TopPartVO> invoke(EmptyStateV2TopPartModel dto, d info) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        TextDTO message = dto.getMessage();
        return C7714v.a0(new EmptyStateV2TopPartVO(hashCode, message != null ? TextDTO.copy$default(message, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null) : null, dto.getTitle(), dto.getImage(), dto.getImageTopMargin(), dto.getSize(), dto.getBackgroundColor()));
    }
}
