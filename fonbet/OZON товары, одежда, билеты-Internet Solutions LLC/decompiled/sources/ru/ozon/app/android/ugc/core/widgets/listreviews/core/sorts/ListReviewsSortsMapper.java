package ru.ozon.app.android.ugc.core.widgets.listreviews.core.sorts;

import Kk.c;
import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.listReviews.ListReviewsSortsVO;
import ru.ozon.app.android.ugc.core.widgets.listreviews.data.ListReviewsDTO;
import ru.ozon.app.android.ugc.core.widgets.listreviews.data.SortsWrapper;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/listreviews/core/sorts/ListReviewsSortsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/listreviews/data/SortsWrapper;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewsSortsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "info", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/listreviews/data/SortsWrapper;Ll20/d;)Ljava/util/List;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ListReviewsSortsMapper implements Function2<SortsWrapper, d, List<? extends ListReviewsSortsVO>> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AtomActionDTO.Behavior.values().length];
            try {
                iArr[AtomActionDTO.Behavior.DISMISS_REDIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AtomActionDTO.Behavior.DISMISS_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<ListReviewsSortsVO> invoke(@NotNull SortsWrapper dto, @NotNull d info) {
        Object obj;
        AtomAction atomAction;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        long a11 = c.a(info.d(), ".sorts");
        List<ListReviewsDTO.Sort> sort = dto.getSort();
        ArrayList arrayList = new ArrayList(C7714v.z(sort, 10));
        Iterator<T> it = sort.iterator();
        while (true) {
            t tVar = null;
            if (!it.hasNext()) {
                break;
            }
            ListReviewsDTO.Sort sort2 = (ListReviewsDTO.Sort) it.next();
            String name = sort2.getName();
            AtomActionDTO selectAction = sort2.getSelectAction();
            if (selectAction != null) {
                int i11 = WhenMappings.$EnumSwitchMapping$0[sort2.getSelectAction().getBehavior().ordinal()];
                AtomActionDTO copy$default = AtomActionDTO.copy$default(selectAction, i11 != 1 ? i11 != 2 ? sort2.getSelectAction().getBehavior() : AtomActionDTO.Behavior.BEHAVIOR_TYPE_REFRESH : AtomActionDTO.Behavior.REDIRECT, null, null, null, null, 30, null);
                if (copy$default != null) {
                    atomAction = AtomActionMapperKt.toAtomAction(copy$default, null);
                    boolean isSelected = sort2.isSelected();
                    String deeplink = sort2.getDeeplink();
                    trackingInfo = sort2.getTrackingInfo();
                    if (trackingInfo == null) {
                        tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(a11), null, 2, null);
                    }
                    arrayList.add(new ListReviewsSortsVO.Sort(name, atomAction, deeplink, isSelected, tVar));
                }
            }
            atomAction = null;
            boolean isSelected2 = sort2.isSelected();
            String deeplink2 = sort2.getDeeplink();
            trackingInfo = sort2.getTrackingInfo();
            if (trackingInfo == null) {
            }
            arrayList.add(new ListReviewsSortsVO.Sort(name, atomAction, deeplink2, isSelected2, tVar));
        }
        Iterator<T> it2 = dto.getSort().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((ListReviewsDTO.Sort) obj).isSelected()) {
                break;
            }
        }
        ListReviewsDTO.Sort sort3 = (ListReviewsDTO.Sort) obj;
        return C7714v.a0(new ListReviewsSortsVO(a11, arrayList, sort3 != null ? sort3.getName() : null, dto.getBottomPaddingEnabled()));
    }
}
