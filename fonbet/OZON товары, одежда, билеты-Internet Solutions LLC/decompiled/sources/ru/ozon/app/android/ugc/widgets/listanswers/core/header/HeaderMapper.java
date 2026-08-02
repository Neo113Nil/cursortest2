package ru.ozon.app.android.ugc.widgets.listanswers.core.header;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.listanswers.data.ListAnswersDTO;
import ru.ozon.app.android.ugc.widgets.listanswers.presentation.header.HeaderVO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/widgets/listanswers/core/header/HeaderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/listanswers/presentation/header/HeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO;Ll20/d;)Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HeaderMapper implements Function2<ListAnswersDTO, d, List<? extends HeaderVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HeaderVO> invoke(@NotNull ListAnswersDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        ListAnswersDTO.Header header = dto.getHeader();
        if (header != null) {
            long hashCode = widgetInfo.d().hashCode();
            String title = header.getTitle();
            Integer count = header.getCount();
            List<HeaderVO> a02 = C7714v.a0(new HeaderVO(hashCode, title, count != null ? count.toString() : null));
            if (a02 != null) {
                return a02;
            }
        }
        return K.f71697a;
    }
}
