package ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.data.AccompanyingDocsDownloadingDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/data/AccompanyingDocsDownloadingDTO;", "dto", "Ll20/d;", "info", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsDownloadingVO;", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/data/AccompanyingDocsDownloadingDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class AccompanyingDocsDownloadingViewMapper$mapper$1 extends AbstractC7737t implements Function2<AccompanyingDocsDownloadingDTO, d, List<? extends AccompanyingDocsDownloadingVO>> {
    final /* synthetic */ AccompanyingDocsDownloadingViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccompanyingDocsDownloadingViewMapper$mapper$1(AccompanyingDocsDownloadingViewMapper accompanyingDocsDownloadingViewMapper) {
        super(2);
        this.this$0 = accompanyingDocsDownloadingViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<AccompanyingDocsDownloadingVO> invoke(AccompanyingDocsDownloadingDTO dto, d info) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        String title = dto.getTitle();
        List<AccompanyingDocsDownloadingDTO.DocumentDTO> documents = dto.getDocuments();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = documents.iterator();
        while (it.hasNext()) {
            CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon = ((AccompanyingDocsDownloadingDTO.DocumentDTO) it.next()).getCellWithSubtitle24Icon();
            if (cellWithSubtitle24Icon != null) {
                arrayList.add(cellWithSubtitle24Icon);
            }
        }
        AccompanyingDocsDownloadingDTO.NotificationDTO notification = dto.getNotification();
        return C7714v.a0(new AccompanyingDocsDownloadingVO(hashCode, title, arrayList, notification != null ? this.this$0.toVo(notification) : null));
    }
}
