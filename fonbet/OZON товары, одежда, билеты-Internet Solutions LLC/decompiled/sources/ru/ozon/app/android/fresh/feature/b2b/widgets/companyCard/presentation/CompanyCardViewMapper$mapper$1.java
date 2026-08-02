package ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.presentation;

import Sc.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.data.CompanyCardDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.presentation.CompanyCardVO;
import ru.ozon.uni.atoms.data.controls.button.UncontainedButtonDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardDTO;", "dto", "Ll20/d;", "info", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardVO;", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CompanyCardViewMapper$mapper$1 extends AbstractC7737t implements Function2<CompanyCardDTO, d, List<? extends CompanyCardVO>> {
    public static final CompanyCardViewMapper$mapper$1 INSTANCE = new CompanyCardViewMapper$mapper$1();

    CompanyCardViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<CompanyCardVO> invoke(CompanyCardDTO dto, d info) {
        Object cell;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        UncontainedButtonDTO link = dto.getLink();
        TextDTO companyName = dto.getCompanyName();
        List<CompanyCardDTO.CompanyCardOption> companyOptions = dto.getCompanyOptions();
        ArrayList arrayList = new ArrayList(C7714v.z(companyOptions, 10));
        for (CompanyCardDTO.CompanyCardOption companyCardOption : companyOptions) {
            if (companyCardOption instanceof CompanyCardDTO.CompanyCardOption.Disclosure) {
                cell = new CompanyCardVO.CompanyCardOptionVO.Disclosure(((CompanyCardDTO.CompanyCardOption.Disclosure) companyCardOption).getAtom());
            } else {
                if (!(companyCardOption instanceof CompanyCardDTO.CompanyCardOption.Cell)) {
                    throw new o();
                }
                cell = new CompanyCardVO.CompanyCardOptionVO.Cell(((CompanyCardDTO.CompanyCardOption.Cell) companyCardOption).getAtom());
            }
            arrayList.add(cell);
        }
        return C7714v.a0(new CompanyCardVO(hashCode, link, companyName, arrayList, dto.getButton(), dto.getBadge(), dto.getEmail(), dto.getBackgroundColor()));
    }
}
