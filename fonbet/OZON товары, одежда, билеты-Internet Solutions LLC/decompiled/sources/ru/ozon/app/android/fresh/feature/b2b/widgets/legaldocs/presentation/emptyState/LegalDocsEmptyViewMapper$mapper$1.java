package ru.ozon.app.android.fresh.feature.b2b.widgets.legaldocs.presentation.emptyState;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legaldocs.data.LegalDocsDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/data/LegalDocsDTO;", "dto", "Ll20/d;", "info", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/presentation/emptyState/LegalDocsEmptyVO;", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/data/LegalDocsDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class LegalDocsEmptyViewMapper$mapper$1 extends AbstractC7737t implements Function2<LegalDocsDTO, d, List<? extends LegalDocsEmptyVO>> {
    public static final LegalDocsEmptyViewMapper$mapper$1 INSTANCE = new LegalDocsEmptyViewMapper$mapper$1();

    LegalDocsEmptyViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<LegalDocsEmptyVO> invoke(LegalDocsDTO dto, d info) {
        List<LegalDocsEmptyVO> a02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        LegalDocsDTO.EmptyStateDTO emptyState = dto.getEmptyState();
        return (emptyState == null || (a02 = C7714v.a0(new LegalDocsEmptyVO((long) info.d().hashCode(), emptyState.getTitle(), emptyState.getMessage(), emptyState.getImage()))) == null) ? K.f71697a : a02;
    }
}
