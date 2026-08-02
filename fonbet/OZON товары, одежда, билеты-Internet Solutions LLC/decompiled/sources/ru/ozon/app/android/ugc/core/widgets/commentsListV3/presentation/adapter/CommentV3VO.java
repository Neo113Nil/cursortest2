package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter;

import Ak.C2436a;
import B0.C2454a;
import Ek.a;
import El.C2971a;
import Fj.c;
import G.g;
import GR.b;
import Kk.C3532b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001:\u0002=>BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0019\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0012*\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u0004\u0018\u00010 *\u00020\u0000¢\u0006\u0004\b!\u0010\"J\\\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u00104R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u00107R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b\f\u00109R\"\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;", "", "widgetId", "", "uuid", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$AvatarVO;", "avatar", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content;", "items", "", "isNested", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$AvatarVO;Ljava/util/List;ZLWZ/t;)V", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content$HeaderVO;", "", "getSubscribeActionParams", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content$HeaderVO;)Ljava/util/Map;", "authorId", "sellerId", "isSubscribe", "updateSubscribeState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO;", "getAuthorName", "()Ljava/lang/String;", "getAuthorId", "getHeader", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO;)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content$HeaderVO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content$FooterVO;", "getFooter", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO;)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content$FooterVO;", "copy", "(JLjava/lang/String;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$AvatarVO;Ljava/util/List;ZLWZ/t;)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getWidgetId", "()J", "Ljava/lang/String;", "getUuid", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$AvatarVO;", "getAvatar", "()Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$AvatarVO;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Z", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "AvatarVO", "Content", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommentV3VO implements CommentsAdapterVO {
    private final AvatarVO avatar;
    private final boolean isNested;

    @NotNull
    private final List<Content> items;
    private final t tokenizedEvent;

    @NotNull
    private final String uuid;
    private final long widgetId;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$AvatarVO;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AvatarVO {
        public static final int $stable = AtomAction.$stable | IconDTO.$stable;
        private final AtomAction clickAction;

        @NotNull
        private final IconDTO icon;

        public AvatarVO(@NotNull IconDTO icon, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.clickAction = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AvatarVO)) {
                return false;
            }
            AvatarVO avatarVO = (AvatarVO) other;
            return Intrinsics.d(this.icon, avatarVO.icon) && Intrinsics.d(this.clickAction, avatarVO.clickAction);
        }

        public final AtomAction getClickAction() {
            return this.clickAction;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            AtomAction atomAction = this.clickAction;
            return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
        }

        @NotNull
        public String toString() {
            return "AvatarVO(icon=" + this.icon + ", clickAction=" + this.clickAction + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommentV3VO(long j11, @NotNull String uuid, AvatarVO avatarVO, @NotNull List<? extends Content> items, boolean z11, t tVar) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(items, "items");
        this.widgetId = j11;
        this.uuid = uuid;
        this.avatar = avatarVO;
        this.items = items;
        this.isNested = z11;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ CommentV3VO copy$default(CommentV3VO commentV3VO, long j11, String str, AvatarVO avatarVO, List list, boolean z11, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = commentV3VO.widgetId;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = commentV3VO.uuid;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            avatarVO = commentV3VO.avatar;
        }
        AvatarVO avatarVO2 = avatarVO;
        if ((i11 & 8) != 0) {
            list = commentV3VO.items;
        }
        List list2 = list;
        if ((i11 & 16) != 0) {
            z11 = commentV3VO.isNested;
        }
        boolean z12 = z11;
        if ((i11 & 32) != 0) {
            tVar = commentV3VO.tokenizedEvent;
        }
        return commentV3VO.copy(j12, str2, avatarVO2, list2, z12, tVar);
    }

    private final Map<String, String> getSubscribeActionParams(Content.HeaderVO headerVO) {
        CommonControlSettings commonControl;
        AtomActionDTO action;
        CommentV3DTO.Control subscribeControl = headerVO.getSubscribeControl();
        if (subscribeControl == null || (commonControl = subscribeControl.getCommonControl()) == null || (action = commonControl.getAction()) == null) {
            return null;
        }
        return action.getParams();
    }

    @NotNull
    public final CommentV3VO copy(long widgetId, @NotNull String uuid, AvatarVO avatar, @NotNull List<? extends Content> items, boolean isNested, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(items, "items");
        return new CommentV3VO(widgetId, uuid, avatar, items, isNested, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentV3VO)) {
            return false;
        }
        CommentV3VO commentV3VO = (CommentV3VO) other;
        return this.widgetId == commentV3VO.widgetId && Intrinsics.d(this.uuid, commentV3VO.uuid) && Intrinsics.d(this.avatar, commentV3VO.avatar) && Intrinsics.d(this.items, commentV3VO.items) && this.isNested == commentV3VO.isNested && Intrinsics.d(this.tokenizedEvent, commentV3VO.tokenizedEvent);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO
    public String getAuthorId() {
        Map<String, String> subscribeActionParams;
        Content.HeaderVO header = getHeader(this);
        if (header == null || (subscribeActionParams = getSubscribeActionParams(header)) == null) {
            return null;
        }
        return subscribeActionParams.get("authorId");
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO
    @NotNull
    public String getAuthorName() {
        BadgeDTO name;
        Content.HeaderVO header = getHeader(this);
        String text = (header == null || (name = header.getName()) == null) ? null : name.getText();
        return text == null ? "" : text;
    }

    public final AvatarVO getAvatar() {
        return this.avatar;
    }

    public final Content.FooterVO getFooter(@NotNull CommentV3VO commentV3VO) {
        Intrinsics.checkNotNullParameter(commentV3VO, "<this>");
        List<Content> list = commentV3VO.items;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Content.FooterVO) {
                arrayList.add(obj);
            }
        }
        return (Content.FooterVO) C7714v.M(arrayList);
    }

    public final Content.HeaderVO getHeader(@NotNull CommentV3VO commentV3VO) {
        Intrinsics.checkNotNullParameter(commentV3VO, "<this>");
        List<Content> list = commentV3VO.items;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Content.HeaderVO) {
                arrayList.add(obj);
            }
        }
        return (Content.HeaderVO) C7714v.M(arrayList);
    }

    @NotNull
    public final List<Content> getItems() {
        return this.items;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO
    public t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO
    @NotNull
    public String getUuid() {
        return this.uuid;
    }

    public long getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.widgetId) * 31, 31, this.uuid);
        AvatarVO avatarVO = this.avatar;
        int a12 = C3532b.a(g.b((a11 + (avatarVO == null ? 0 : avatarVO.hashCode())) * 31, 31, this.items), 31, this.isNested);
        t tVar = this.tokenizedEvent;
        return a12 + (tVar != null ? tVar.hashCode() : 0);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO
    /* renamed from: isNested, reason: from getter */
    public boolean getIsNested() {
        return this.isNested;
    }

    @NotNull
    public String toString() {
        long j11 = this.widgetId;
        String str = this.uuid;
        AvatarVO avatarVO = this.avatar;
        List<Content> list = this.items;
        boolean z11 = this.isNested;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "CommentV3VO(widgetId=", ", uuid=", str);
        c11.append(", avatar=");
        c11.append(avatarVO);
        c11.append(", items=");
        c11.append(list);
        C2971a.d(c11, ", isNested=", z11, ", tokenizedEvent=", tVar);
        c11.append(")");
        return c11.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CommentV3VO updateSubscribeState(String authorId, String sellerId, Boolean isSubscribe) {
        boolean z11;
        Content content;
        Content.HeaderVO headerVO;
        Content content2;
        CommentV3VO commentV3VO = this;
        Content.HeaderVO header = commentV3VO.getHeader(commentV3VO);
        if (header != null) {
            boolean z12 = authorId != null && authorId.equals(commentV3VO.getAuthorId());
            if (sellerId != null) {
                Map<String, String> subscribeActionParams = commentV3VO.getSubscribeActionParams(header);
                if (sellerId.equals(subscribeActionParams != null ? subscribeActionParams.get("sellerId") : null)) {
                    z11 = true;
                    if (!z12 || z11) {
                        List<Content> list = commentV3VO.items;
                        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                        for (Content content3 : list) {
                            if ((content3 instanceof Content.HeaderVO ? (Content.HeaderVO) content3 : null) != null) {
                                CommentV3DTO.Control subscribeControl = header.getSubscribeControl();
                                headerVO = header;
                                content = content3;
                                content2 = Content.HeaderVO.copy$default(headerVO, null, null, null, subscribeControl != null ? CommentV3DTO.Control.copy$default(subscribeControl, isSubscribe != null ? isSubscribe.booleanValue() : !header.getSubscribeControl().isSelected(), null, null, null, null, 30, null) : null, 0, 0, null, null, 247, null);
                                if (content2 != null) {
                                    arrayList.add(content2);
                                    header = headerVO;
                                }
                            } else {
                                content = content3;
                                headerVO = header;
                            }
                            content2 = content;
                            arrayList.add(content2);
                            header = headerVO;
                        }
                        commentV3VO = copy$default(commentV3VO, 0L, null, null, arrayList, false, null, 55, null);
                    }
                    if (commentV3VO == null) {
                        return commentV3VO;
                    }
                }
            }
            z11 = false;
            if (!z12) {
            }
            List<Content> list2 = commentV3VO.items;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
            while (r16.hasNext()) {
            }
            commentV3VO = copy$default(commentV3VO, 0L, null, null, arrayList2, false, null, 55, null);
            if (commentV3VO == null) {
            }
        }
        return this;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eR\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006\u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content;", "", "Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "setTopPadding", "(Lru/ozon/uni/atoms/data/common/Paddings;)V", "topPadding", "getBottomPadding", "setBottomPadding", "bottomPadding", "HeaderVO", "FooterVO", "TextVO", "ExpandableTextVO", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content$ExpandableTextVO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content$FooterVO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content$HeaderVO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content$TextVO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Content {
        @NotNull
        Paddings getBottomPadding();

        @NotNull
        Paddings getTopPadding();

        void setBottomPadding(@NotNull Paddings paddings);

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content$ExpandableTextVO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content;", "Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", "text", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "bottomPadding", "<init>", "(Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", "Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "setTopPadding", "(Lru/ozon/uni/atoms/data/common/Paddings;)V", "getBottomPadding", "setBottomPadding", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ExpandableTextVO implements Content {

            @NotNull
            private Paddings bottomPadding;

            @NotNull
            private final ExpandableTextDTO text;

            @NotNull
            private Paddings topPadding;

            public ExpandableTextVO(@NotNull ExpandableTextDTO text, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(topPadding, "topPadding");
                Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
                this.text = text;
                this.topPadding = topPadding;
                this.bottomPadding = bottomPadding;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ExpandableTextVO)) {
                    return false;
                }
                ExpandableTextVO expandableTextVO = (ExpandableTextVO) other;
                return Intrinsics.d(this.text, expandableTextVO.text) && this.topPadding == expandableTextVO.topPadding && this.bottomPadding == expandableTextVO.bottomPadding;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO.Content
            @NotNull
            public Paddings getBottomPadding() {
                return this.bottomPadding;
            }

            @NotNull
            public final ExpandableTextDTO getText() {
                return this.text;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO.Content
            @NotNull
            public Paddings getTopPadding() {
                return this.topPadding;
            }

            public int hashCode() {
                return this.bottomPadding.hashCode() + b.b(this.topPadding, this.text.hashCode() * 31, 31);
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO.Content
            public void setBottomPadding(@NotNull Paddings paddings) {
                Intrinsics.checkNotNullParameter(paddings, "<set-?>");
                this.bottomPadding = paddings;
            }

            @NotNull
            public String toString() {
                ExpandableTextDTO expandableTextDTO = this.text;
                Paddings paddings = this.topPadding;
                Paddings paddings2 = this.bottomPadding;
                StringBuilder sb2 = new StringBuilder("ExpandableTextVO(text=");
                sb2.append(expandableTextDTO);
                sb2.append(", topPadding=");
                sb2.append(paddings);
                sb2.append(", bottomPadding=");
                return D40.b.b(sb2, paddings2, ")");
            }

            public /* synthetic */ ExpandableTextVO(ExpandableTextDTO expandableTextDTO, Paddings paddings, Paddings paddings2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(expandableTextDTO, (i11 & 2) != 0 ? Paddings.NONE : paddings, (i11 & 4) != 0 ? Paddings.NONE : paddings2);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content$TextVO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "bottomPadding", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "setTopPadding", "(Lru/ozon/uni/atoms/data/common/Paddings;)V", "getBottomPadding", "setBottomPadding", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TextVO implements Content {

            @NotNull
            private Paddings bottomPadding;

            @NotNull
            private final TextDTO text;

            @NotNull
            private Paddings topPadding;

            public TextVO(@NotNull TextDTO text, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(topPadding, "topPadding");
                Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
                this.text = text;
                this.topPadding = topPadding;
                this.bottomPadding = bottomPadding;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextVO)) {
                    return false;
                }
                TextVO textVO = (TextVO) other;
                return Intrinsics.d(this.text, textVO.text) && this.topPadding == textVO.topPadding && this.bottomPadding == textVO.bottomPadding;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO.Content
            @NotNull
            public Paddings getBottomPadding() {
                return this.bottomPadding;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO.Content
            @NotNull
            public Paddings getTopPadding() {
                return this.topPadding;
            }

            public int hashCode() {
                return this.bottomPadding.hashCode() + b.b(this.topPadding, this.text.hashCode() * 31, 31);
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO.Content
            public void setBottomPadding(@NotNull Paddings paddings) {
                Intrinsics.checkNotNullParameter(paddings, "<set-?>");
                this.bottomPadding = paddings;
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.text;
                Paddings paddings = this.topPadding;
                Paddings paddings2 = this.bottomPadding;
                StringBuilder sb2 = new StringBuilder("TextVO(text=");
                sb2.append(textDTO);
                sb2.append(", topPadding=");
                sb2.append(paddings);
                sb2.append(", bottomPadding=");
                return D40.b.b(sb2, paddings2, ")");
            }

            public /* synthetic */ TextVO(TextDTO textDTO, Paddings paddings, Paddings paddings2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(textDTO, (i11 & 2) != 0 ? Paddings.NONE : paddings, (i11 & 4) != 0 ? Paddings.NONE : paddings2);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJH\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\"\u0010\u0007\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\b\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001c\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 ¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content$FooterVO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content;", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$Control;", "leftControls", "rightControls", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "bottomPadding", "<init>", "(Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "copy", "(Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content$FooterVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getLeftControls", "()Ljava/util/List;", "getRightControls", "Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "setTopPadding", "(Lru/ozon/uni/atoms/data/common/Paddings;)V", "getBottomPadding", "setBottomPadding", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FooterVO implements Content {

            @NotNull
            private Paddings bottomPadding;
            private final List<CommentV3DTO.Control> leftControls;
            private final List<CommentV3DTO.Control> rightControls;

            @NotNull
            private Paddings topPadding;

            public FooterVO(List<CommentV3DTO.Control> list, List<CommentV3DTO.Control> list2, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding) {
                Intrinsics.checkNotNullParameter(topPadding, "topPadding");
                Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
                this.leftControls = list;
                this.rightControls = list2;
                this.topPadding = topPadding;
                this.bottomPadding = bottomPadding;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ FooterVO copy$default(FooterVO footerVO, List list, List list2, Paddings paddings, Paddings paddings2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = footerVO.leftControls;
                }
                if ((i11 & 2) != 0) {
                    list2 = footerVO.rightControls;
                }
                if ((i11 & 4) != 0) {
                    paddings = footerVO.topPadding;
                }
                if ((i11 & 8) != 0) {
                    paddings2 = footerVO.bottomPadding;
                }
                return footerVO.copy(list, list2, paddings, paddings2);
            }

            @NotNull
            public final FooterVO copy(List<CommentV3DTO.Control> leftControls, List<CommentV3DTO.Control> rightControls, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding) {
                Intrinsics.checkNotNullParameter(topPadding, "topPadding");
                Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
                return new FooterVO(leftControls, rightControls, topPadding, bottomPadding);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FooterVO)) {
                    return false;
                }
                FooterVO footerVO = (FooterVO) other;
                return Intrinsics.d(this.leftControls, footerVO.leftControls) && Intrinsics.d(this.rightControls, footerVO.rightControls) && this.topPadding == footerVO.topPadding && this.bottomPadding == footerVO.bottomPadding;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO.Content
            @NotNull
            public Paddings getBottomPadding() {
                return this.bottomPadding;
            }

            public final List<CommentV3DTO.Control> getLeftControls() {
                return this.leftControls;
            }

            public final List<CommentV3DTO.Control> getRightControls() {
                return this.rightControls;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO.Content
            @NotNull
            public Paddings getTopPadding() {
                return this.topPadding;
            }

            public int hashCode() {
                List<CommentV3DTO.Control> list = this.leftControls;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                List<CommentV3DTO.Control> list2 = this.rightControls;
                return this.bottomPadding.hashCode() + b.b(this.topPadding, (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31, 31);
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO.Content
            public void setBottomPadding(@NotNull Paddings paddings) {
                Intrinsics.checkNotNullParameter(paddings, "<set-?>");
                this.bottomPadding = paddings;
            }

            @NotNull
            public String toString() {
                List<CommentV3DTO.Control> list = this.leftControls;
                List<CommentV3DTO.Control> list2 = this.rightControls;
                return b.e(c.d("FooterVO(leftControls=", list, ", rightControls=", ", topPadding=", list2), this.topPadding, ", bottomPadding=", this.bottomPadding, ")");
            }

            public /* synthetic */ FooterVO(List list, List list2, Paddings paddings, Paddings paddings2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, list2, (i11 & 4) != 0 ? Paddings.NONE : paddings, (i11 & 8) != 0 ? Paddings.NONE : paddings2);
            }
        }

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011Jh\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0018R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b,\u0010\u0018R\"\u0010\u000e\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\u000f\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010-\u001a\u0004\b2\u0010/\"\u0004\b3\u00101¨\u00064"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content$HeaderVO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nameIcon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "date", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$Control;", "subscribeControl", "", "nameLeftPadding", "dateLeftPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "bottomPadding", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$Control;IILru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "copy", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$Control;IILru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content$HeaderVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getName", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getNameIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getDate", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$Control;", "getSubscribeControl", "()Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$Control;", "I", "getNameLeftPadding", "getDateLeftPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "setTopPadding", "(Lru/ozon/uni/atoms/data/common/Paddings;)V", "getBottomPadding", "setBottomPadding", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class HeaderVO implements Content {

            @NotNull
            private Paddings bottomPadding;
            private final TextDTO date;
            private final int dateLeftPadding;
            private final BadgeDTO name;
            private final IconDTO nameIcon;
            private final int nameLeftPadding;
            private final CommentV3DTO.Control subscribeControl;

            @NotNull
            private Paddings topPadding;

            public HeaderVO(BadgeDTO badgeDTO, IconDTO iconDTO, TextDTO textDTO, CommentV3DTO.Control control, int i11, int i12, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding) {
                Intrinsics.checkNotNullParameter(topPadding, "topPadding");
                Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
                this.name = badgeDTO;
                this.nameIcon = iconDTO;
                this.date = textDTO;
                this.subscribeControl = control;
                this.nameLeftPadding = i11;
                this.dateLeftPadding = i12;
                this.topPadding = topPadding;
                this.bottomPadding = bottomPadding;
            }

            public static /* synthetic */ HeaderVO copy$default(HeaderVO headerVO, BadgeDTO badgeDTO, IconDTO iconDTO, TextDTO textDTO, CommentV3DTO.Control control, int i11, int i12, Paddings paddings, Paddings paddings2, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    badgeDTO = headerVO.name;
                }
                if ((i13 & 2) != 0) {
                    iconDTO = headerVO.nameIcon;
                }
                if ((i13 & 4) != 0) {
                    textDTO = headerVO.date;
                }
                if ((i13 & 8) != 0) {
                    control = headerVO.subscribeControl;
                }
                if ((i13 & 16) != 0) {
                    i11 = headerVO.nameLeftPadding;
                }
                if ((i13 & 32) != 0) {
                    i12 = headerVO.dateLeftPadding;
                }
                if ((i13 & 64) != 0) {
                    paddings = headerVO.topPadding;
                }
                if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    paddings2 = headerVO.bottomPadding;
                }
                Paddings paddings3 = paddings;
                Paddings paddings4 = paddings2;
                int i14 = i11;
                int i15 = i12;
                return headerVO.copy(badgeDTO, iconDTO, textDTO, control, i14, i15, paddings3, paddings4);
            }

            @NotNull
            public final HeaderVO copy(BadgeDTO name, IconDTO nameIcon, TextDTO date, CommentV3DTO.Control subscribeControl, int nameLeftPadding, int dateLeftPadding, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding) {
                Intrinsics.checkNotNullParameter(topPadding, "topPadding");
                Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
                return new HeaderVO(name, nameIcon, date, subscribeControl, nameLeftPadding, dateLeftPadding, topPadding, bottomPadding);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HeaderVO)) {
                    return false;
                }
                HeaderVO headerVO = (HeaderVO) other;
                return Intrinsics.d(this.name, headerVO.name) && Intrinsics.d(this.nameIcon, headerVO.nameIcon) && Intrinsics.d(this.date, headerVO.date) && Intrinsics.d(this.subscribeControl, headerVO.subscribeControl) && this.nameLeftPadding == headerVO.nameLeftPadding && this.dateLeftPadding == headerVO.dateLeftPadding && this.topPadding == headerVO.topPadding && this.bottomPadding == headerVO.bottomPadding;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO.Content
            @NotNull
            public Paddings getBottomPadding() {
                return this.bottomPadding;
            }

            public final TextDTO getDate() {
                return this.date;
            }

            public final int getDateLeftPadding() {
                return this.dateLeftPadding;
            }

            public final BadgeDTO getName() {
                return this.name;
            }

            public final IconDTO getNameIcon() {
                return this.nameIcon;
            }

            public final int getNameLeftPadding() {
                return this.nameLeftPadding;
            }

            public final CommentV3DTO.Control getSubscribeControl() {
                return this.subscribeControl;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO.Content
            @NotNull
            public Paddings getTopPadding() {
                return this.topPadding;
            }

            public int hashCode() {
                BadgeDTO badgeDTO = this.name;
                int hashCode = (badgeDTO == null ? 0 : badgeDTO.hashCode()) * 31;
                IconDTO iconDTO = this.nameIcon;
                int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
                TextDTO textDTO = this.date;
                int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                CommentV3DTO.Control control = this.subscribeControl;
                return this.bottomPadding.hashCode() + b.b(this.topPadding, C2454a.a(this.dateLeftPadding, C2454a.a(this.nameLeftPadding, (hashCode3 + (control != null ? control.hashCode() : 0)) * 31, 31), 31), 31);
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO.Content
            public void setBottomPadding(@NotNull Paddings paddings) {
                Intrinsics.checkNotNullParameter(paddings, "<set-?>");
                this.bottomPadding = paddings;
            }

            @NotNull
            public String toString() {
                BadgeDTO badgeDTO = this.name;
                IconDTO iconDTO = this.nameIcon;
                TextDTO textDTO = this.date;
                CommentV3DTO.Control control = this.subscribeControl;
                int i11 = this.nameLeftPadding;
                int i12 = this.dateLeftPadding;
                Paddings paddings = this.topPadding;
                Paddings paddings2 = this.bottomPadding;
                StringBuilder sb2 = new StringBuilder("HeaderVO(name=");
                sb2.append(badgeDTO);
                sb2.append(", nameIcon=");
                sb2.append(iconDTO);
                sb2.append(", date=");
                sb2.append(textDTO);
                sb2.append(", subscribeControl=");
                sb2.append(control);
                sb2.append(", nameLeftPadding=");
                a.f(i11, i12, ", dateLeftPadding=", ", topPadding=", sb2);
                return b.e(sb2, paddings, ", bottomPadding=", paddings2, ")");
            }

            public /* synthetic */ HeaderVO(BadgeDTO badgeDTO, IconDTO iconDTO, TextDTO textDTO, CommentV3DTO.Control control, int i11, int i12, Paddings paddings, Paddings paddings2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(badgeDTO, iconDTO, textDTO, control, i11, i12, (i13 & 64) != 0 ? Paddings.NONE : paddings, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? Paddings.NONE : paddings2);
            }
        }
    }
}
