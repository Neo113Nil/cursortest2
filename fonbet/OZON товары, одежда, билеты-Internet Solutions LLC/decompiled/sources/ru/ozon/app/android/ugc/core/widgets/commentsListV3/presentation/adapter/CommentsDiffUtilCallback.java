package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter;

import Xc.a;
import Xc.b;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsDiffUtilCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;)Z", "areContentsTheSame", "", "getChangePayload", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;)Ljava/lang/Object;", "Payload", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentsDiffUtilCallback extends i.d<CommentsAdapterVO> {

    @NotNull
    public static final CommentsDiffUtilCallback INSTANCE = new CommentsDiffUtilCallback();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsDiffUtilCallback$Payload;", "", "<init>", "(Ljava/lang/String;I)V", SelectionItemDescriptionDTO.SOCIAL_HEADER, "BACKGROUND", "ACTION_BUTTONS", "COMMENT_CONTENT", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Payload {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Payload[] $VALUES;
        public static final Payload SOCIAL_HEADER = new Payload(SelectionItemDescriptionDTO.SOCIAL_HEADER, 0);
        public static final Payload BACKGROUND = new Payload("BACKGROUND", 1);
        public static final Payload ACTION_BUTTONS = new Payload("ACTION_BUTTONS", 2);
        public static final Payload COMMENT_CONTENT = new Payload("COMMENT_CONTENT", 3);

        private static final /* synthetic */ Payload[] $values() {
            return new Payload[]{SOCIAL_HEADER, BACKGROUND, ACTION_BUTTONS, COMMENT_CONTENT};
        }

        static {
            Payload[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Payload(String str, int i11) {
        }

        public static Payload valueOf(String str) {
            return (Payload) Enum.valueOf(Payload.class, str);
        }

        public static Payload[] values() {
            return (Payload[]) $VALUES.clone();
        }
    }

    private CommentsDiffUtilCallback() {
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areContentsTheSame(@NotNull CommentsAdapterVO oldItem, @NotNull CommentsAdapterVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areItemsTheSame(@NotNull CommentsAdapterVO oldItem, @NotNull CommentsAdapterVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem.getUuid(), newItem.getUuid());
    }

    @Override // androidx.recyclerview.widget.i.d
    @NotNull
    public Object getChangePayload(@NotNull CommentsAdapterVO oldItem, @NotNull CommentsAdapterVO newItem) {
        CommonControlSettings common;
        CommonControlSettings common2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if ((oldItem instanceof CommentVO) && (newItem instanceof CommentVO)) {
            CommentVO commentVO = (CommentVO) oldItem;
            CommentVO commentVO2 = (CommentVO) newItem;
            if (commentVO.getAuthor().getSocialHeader().getIsSubscribed() != commentVO2.getAuthor().getSocialHeader().getIsSubscribed()) {
                arrayList.add(Payload.SOCIAL_HEADER);
            } else {
                CellDTO.RightBlock rightBlock = commentVO.getAuthor().getSocialHeader().getSubscribe().getRightBlock();
                AtomActionDTO atomActionDTO = null;
                AtomActionDTO action = (rightBlock == null || (common2 = rightBlock.getCommon()) == null) ? null : common2.getAction();
                CellDTO.RightBlock rightBlock2 = commentVO2.getAuthor().getSocialHeader().getSubscribe().getRightBlock();
                if (rightBlock2 != null && (common = rightBlock2.getCommon()) != null) {
                    atomActionDTO = common.getAction();
                }
                if (!Intrinsics.d(action, atomActionDTO)) {
                    C7714v.p(C7714v.b0(Payload.SOCIAL_HEADER, Payload.ACTION_BUTTONS), arrayList);
                } else if (commentVO.getIsLast() != commentVO2.getIsLast() || commentVO.getIsFirst() != commentVO2.getIsFirst() || commentVO.getIsNested() != commentVO2.getIsNested() || commentVO.getIsLastNested() != commentVO2.getIsLastNested() || commentVO.getHasAnswers() != commentVO2.getHasAnswers()) {
                    arrayList.add(Payload.BACKGROUND);
                } else if (!Intrinsics.d(commentVO.getReportButton(), commentVO2.getReportButton())) {
                    arrayList.add(Payload.ACTION_BUTTONS);
                }
            }
        }
        if ((oldItem instanceof CommentV3VO) && (newItem instanceof CommentV3VO) && !Intrinsics.d(((CommentV3VO) oldItem).getItems(), ((CommentV3VO) newItem).getItems())) {
            arrayList.add(Payload.COMMENT_CONTENT);
        }
        return arrayList;
    }
}
