package ru.ozon.app.android.ugc.core.widgets.commentsListV3.data;

import Tc.b;
import WZ.x;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsListMapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\n\u0010\t\u001a\u00020\n*\u00020\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\b\u0012\u0004\u0012\u00020\u00010\rJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsV3Mapper;", "", "<init>", "()V", "toCommentV3VO", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO;", "isNested", "", "toVO", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$AvatarVO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$AvatarDTO;", "toItemsVO", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content;", "toCommentsListVo", "dto", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsV3DTO;", "mapItemToContent", "item", "padding", "Lru/ozon/uni/atoms/data/common/Paddings;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentsV3Mapper {
    private final CommentV3VO.Content mapItemToContent(Object item, Paddings padding) {
        if (!(item instanceof CommentV3DTO.HeaderDTO)) {
            if (item instanceof CommentV3DTO.FooterDTO) {
                CommentV3DTO.FooterDTO footerDTO = (CommentV3DTO.FooterDTO) item;
                return new CommentV3VO.Content.FooterVO(footerDTO.getLeftControls(), footerDTO.getRightControls(), padding, null, 8, null);
            }
            if (item instanceof TextDTO) {
                return new CommentV3VO.Content.TextVO(TextDTO.copy$default((TextDTO) item, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null), padding, null, 4, null);
            }
            if (item instanceof ExpandableTextDTO) {
                return new CommentV3VO.Content.ExpandableTextVO(ExpandableTextDTO.copy$default((ExpandableTextDTO) item, null, null, null, null, null, false, null, null, null, null, null, null, null, true, null, null, null, null, 253951, null), padding, null, 4, null);
            }
            return null;
        }
        CommentV3DTO.HeaderDTO headerDTO = (CommentV3DTO.HeaderDTO) item;
        BadgeDTO name = headerDTO.getName();
        IconDTO nameIcon = headerDTO.getNameIcon();
        TextDTO date = headerDTO.getDate();
        CommentV3DTO.Control subscribeControl = headerDTO.getSubscribeControl();
        Paddings nameLeftPadding = headerDTO.getNameLeftPadding();
        int px = nameLeftPadding != null ? UiExtKt.toPx(nameLeftPadding.getPx()) : 0;
        Paddings dateLeftPadding = headerDTO.getDateLeftPadding();
        return new CommentV3VO.Content.HeaderVO(name, nameIcon, date, subscribeControl, px, dateLeftPadding != null ? UiExtKt.toPx(dateLeftPadding.getPx()) : 0, padding, null, UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    private static final List<CommentV3VO> toCommentsListVo$flattenComments(CommentsV3Mapper commentsV3Mapper, CommentV3DTO commentV3DTO, boolean z11) {
        ?? r02;
        CommentV3VO commentV3VO = commentsV3Mapper.toCommentV3VO(commentV3DTO, z11);
        List<CommentV3DTO> answers = commentV3DTO.getAnswers();
        if (answers != null) {
            r02 = new ArrayList();
            Iterator it = answers.iterator();
            while (it.hasNext()) {
                C7714v.p(toCommentsListVo$flattenComments(commentsV3Mapper, (CommentV3DTO) it.next(), true), r02);
            }
        } else {
            r02 = 0;
        }
        if (r02 == 0) {
            r02 = K.f71697a;
        }
        return C7714v.p0((Iterable) r02, C7714v.a0(commentV3VO));
    }

    static /* synthetic */ List toCommentsListVo$flattenComments$default(CommentsV3Mapper commentsV3Mapper, CommentV3DTO commentV3DTO, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return toCommentsListVo$flattenComments(commentsV3Mapper, commentV3DTO, z11);
    }

    @NotNull
    public final CommentV3VO toCommentV3VO(@NotNull CommentV3DTO commentV3DTO, boolean z11) {
        Intrinsics.checkNotNullParameter(commentV3DTO, "<this>");
        CommentsListMapper.Companion companion = CommentsListMapper.INSTANCE;
        long widgetVoId = companion.getWidgetVoId();
        String uuid = commentV3DTO.getUuid();
        CommentV3DTO.AvatarDTO avatar = commentV3DTO.getAvatar();
        CommentV3VO.AvatarVO vo = avatar != null ? toVO(avatar) : null;
        List<CommentV3VO.Content> itemsVO = toItemsVO(commentV3DTO.getItems());
        Map<String, TokenizedTrackingInfo> tracking = commentV3DTO.getTracking();
        return new CommentV3VO(widgetVoId, uuid, vo, itemsVO, z11, tracking != null ? x.b(tracking, Long.valueOf(companion.getWidgetVoId()), null) : null);
    }

    @NotNull
    public final List<CommentV3VO> toCommentsListVo(@NotNull CommentsV3DTO dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        List<CommentV3DTO> comments = dto.getComments();
        if (comments == null) {
            comments = K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = comments.iterator();
        while (it.hasNext()) {
            C7714v.p(toCommentsListVo$flattenComments$default(this, (CommentV3DTO) it.next(), false, 4, null), arrayList);
        }
        return arrayList;
    }

    @NotNull
    public final List<CommentV3VO.Content> toItemsVO(@NotNull List<? extends Object> list) {
        CommentV3VO.Content content;
        Intrinsics.checkNotNullParameter(list, "<this>");
        b builder = C7714v.B();
        Paddings paddings = Paddings.NONE;
        for (Object obj : list) {
            if (obj instanceof CommentV3DTO.SpacerDTO) {
                paddings = ((CommentV3DTO.SpacerDTO) obj).getHeight();
            } else {
                CommentV3VO.Content mapItemToContent = mapItemToContent(obj, paddings);
                if (mapItemToContent != null) {
                    builder.add(mapItemToContent);
                    paddings = Paddings.NONE;
                }
            }
        }
        if (paddings != Paddings.NONE && (content = (CommentV3VO.Content) C7714v.Z(builder)) != null) {
            content.setBottomPadding(paddings);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    @NotNull
    public final CommentV3VO.AvatarVO toVO(@NotNull CommentV3DTO.AvatarDTO avatarDTO) {
        Intrinsics.checkNotNullParameter(avatarDTO, "<this>");
        IconDTO icon = avatarDTO.getIcon();
        AtomActionDTO clickAction = avatarDTO.getClickAction();
        return new CommentV3VO.AvatarVO(icon, clickAction != null ? AtomActionMapperKt.toAtomAction(clickAction, avatarDTO.getTracking()) : null);
    }
}
