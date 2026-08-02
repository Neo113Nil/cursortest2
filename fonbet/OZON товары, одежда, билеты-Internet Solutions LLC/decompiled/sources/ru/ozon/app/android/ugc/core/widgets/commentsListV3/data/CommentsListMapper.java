package ru.ozon.app.android.ugc.core.widgets.commentsListV3.data;

import WZ.x;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsListDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \r2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\rB\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO;Ll20/d;)Ljava/util/List;", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentsListMapper implements Function2<CommentsListDTO, d, List<? extends CommentsListVO>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static long widgetVoId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListMapper$Companion;", "", "<init>", "()V", "", "widgetVoId", "J", "getWidgetVoId", "()J", "setWidgetVoId", "(J)V", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getWidgetVoId() {
            return CommentsListMapper.widgetVoId;
        }

        private Companion() {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CommentsListVO> invoke(@NotNull CommentsListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        widgetVoId = hashCode;
        String itemId = state.getItemId();
        int totalCount = state.getTotalCount();
        String reviewUuid = state.getReviewUuid();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(state.getLoadCommentsAction(), null);
        AtomActionDTO createCommentAction = state.getCreateCommentAction();
        AtomAction atomAction2 = createCommentAction != null ? AtomActionMapperKt.toAtomAction(createCommentAction, null) : null;
        AtomActionDTO removeCommentAction = state.getRemoveCommentAction();
        AtomAction atomAction3 = removeCommentAction != null ? AtomActionMapperKt.toAtomAction(removeCommentAction, null) : null;
        CommentsListDTO.EmptyStateDTO emptyState = state.getEmptyState();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new CommentsListVO(hashCode, itemId, totalCount, reviewUuid, atomAction, atomAction2, atomAction3, emptyState, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null, null, UserVerificationMethods.USER_VERIFY_NONE, null));
    }
}
