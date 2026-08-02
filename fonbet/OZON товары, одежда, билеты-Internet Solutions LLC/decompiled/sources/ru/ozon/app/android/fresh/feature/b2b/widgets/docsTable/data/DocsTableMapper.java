package ru.ozon.app.android.fresh.feature.b2b.widgets.docsTable.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsTable.data.DocsTableDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsTable.presentation.DocsTableVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/data/DocsTableMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/data/DocsTableDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/data/DocsTableDTO;Ll20/d;)Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DocsTableMapper implements Function2<DocsTableDTO, d, List<? extends DocsTableVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DocsTableVO> invoke(@NotNull DocsTableDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO listTitle = state.getListTitle();
        List<DocsTableDTO.Period> periods = state.getPeriods();
        ArrayList arrayList = new ArrayList(C7714v.z(periods, 10));
        for (DocsTableDTO.Period period : periods) {
            TextDTO title = period.getTitle();
            List<DocsTableDTO.Document> items = period.getItems();
            ArrayList arrayList2 = new ArrayList(C7714v.z(items, 10));
            for (DocsTableDTO.Document document : items) {
                DocsTableVO.Document.Header header = new DocsTableVO.Document.Header(document.getHeader().getTitle(), document.getHeader().getIconButton(), document.getHeader().getDate());
                List<ButtonV3DTO> buttons = document.getButtons();
                DocsTableDTO.Status status = document.getStatus();
                Map<String, TokenizedTrackingInfo> map = null;
                TextDTO status2 = status != null ? status.getStatus() : null;
                DocsTableDTO.Status status3 = document.getStatus();
                TextDTO statusTitle = status3 != null ? status3.getStatusTitle() : null;
                DocsTableDTO.Status status4 = document.getStatus();
                IconDTO icon = status4 != null ? status4.getIcon() : null;
                DocsTableDTO.Status status5 = document.getStatus();
                AtomActionDTO action = status5 != null ? status5.getAction() : null;
                DocsTableDTO.Status status6 = document.getStatus();
                if (status6 != null) {
                    map = status6.getTrackingInfo();
                }
                arrayList2.add(new DocsTableVO.Document(header, document.getText(), new DocsTableVO.Document.Status(status2, statusTitle, icon, action, map), buttons, document.getInfo()));
            }
            arrayList.add(new DocsTableVO.Period(title, arrayList2));
        }
        return C7714v.a0(new DocsTableVO(hashCode, listTitle, arrayList));
    }
}
