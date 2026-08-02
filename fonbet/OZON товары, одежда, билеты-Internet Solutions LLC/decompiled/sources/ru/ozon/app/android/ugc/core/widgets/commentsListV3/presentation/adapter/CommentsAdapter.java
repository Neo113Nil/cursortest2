package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter;

import Sc.o;
import T7.E;
import WZ.l;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.R$layout;
import ru.ozon.app.android.ugc.core.databinding.ItemSingleReviewCommentV3Binding;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsDiffUtilCallback;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3.CommentV3View;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3.CommentV3ViewHolder;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.comments.CommentViewHolder;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import spay.sdk.domain.model.FraudMonInfo;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\t\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001:\u0001&Be\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012$\u0010\n\u001a \u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\t\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\u001b\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00152\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016¢\u0006\u0004\b\u001b\u0010 J\u0017\u0010!\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b!\u0010\"R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R2\u0010\n\u001a \u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\t\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsVH;", "Lkotlin/Function1;", "", "replyToComment", "Lkotlin/Function2;", "", "", "deleteComment", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "LWZ/l;", "tokenizedAnalytics", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;LWZ/l;Landroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsVH;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsVH;I)V", "", "", "payloads", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsVH;ILjava/util/List;)V", "getItemViewType", "(I)I", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "LWZ/l;", "Type", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentsAdapter extends i<CommentsAdapterVO, CommentsVH<CommentsAdapterVO>> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function2<String, Map<String, String>, Unit> deleteComment;

    @NotNull
    private final Function1<CommentsAdapterVO, Unit> replyToComment;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapter$Type;", "", "<init>", "(Ljava/lang/String;I)V", "COMMENT_V3", "COMMENT", FraudMonInfo.UNKNOWN, "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type COMMENT_V3 = new Type("COMMENT_V3", 0);
        public static final Type COMMENT = new Type("COMMENT", 1);
        public static final Type UNKNOWN = new Type(FraudMonInfo.UNKNOWN, 2);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{COMMENT_V3, COMMENT, UNKNOWN};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Type(String str, int i11) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CommentsAdapter(@NotNull Function1<? super CommentsAdapterVO, Unit> replyToComment, @NotNull Function2<? super String, ? super Map<String, String>, Unit> deleteComment, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics, @NotNull J lifecycleOwner) {
        super(CommentsDiffUtilCallback.INSTANCE, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(replyToComment, "replyToComment");
        Intrinsics.checkNotNullParameter(deleteComment, "deleteComment");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.replyToComment = replyToComment;
        this.deleteComment = deleteComment;
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        CommentsAdapterVO item = getItem(position);
        return item instanceof CommentV3VO ? Type.COMMENT_V3.ordinal() : item instanceof CommentVO ? Type.COMMENT.ordinal() : Type.UNKNOWN.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((CommentsVH<CommentsAdapterVO>) c11, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CommentsVH<CommentsAdapterVO> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == Type.COMMENT_V3.ordinal()) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new CommentV3ViewHolder(new CommentV3View(context), this.replyToComment, this.deleteComment, this.actionHandler, this.tokenizedAnalytics);
        }
        if (viewType != Type.COMMENT.ordinal()) {
            throw new IllegalArgumentException(E.a(viewType, "Unknown viewType = ", "!"));
        }
        ItemSingleReviewCommentV3Binding bind = ItemSingleReviewCommentV3Binding.bind(ViewGroupExtKt.inflate(parent, R$layout.item_single_review_comment_v3));
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new CommentViewHolder(bind, this.replyToComment, new CommentsAdapter$onCreateViewHolder$1(this), this.actionHandler, this.tokenizedAnalytics);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CommentsVH<CommentsAdapterVO> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        CommentsAdapterVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    public void onBindViewHolder(@NotNull CommentsVH<CommentsAdapterVO> holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        Object M11 = C7714v.M(payloads);
        List list = M11 instanceof List ? (List) M11 : null;
        if (list == null) {
            super.onBindViewHolder((CommentsAdapter) holder, position, payloads);
            return;
        }
        CommentsAdapterVO item = getItem(position);
        if (item instanceof CommentVO) {
            for (Object obj : list) {
                if (holder instanceof CommentViewHolder) {
                    if (obj == CommentsDiffUtilCallback.Payload.SOCIAL_HEADER) {
                        ((CommentViewHolder) holder).bindSocialHeader((CommentVO) item);
                    } else if (obj == CommentsDiffUtilCallback.Payload.BACKGROUND) {
                        ((CommentViewHolder) holder).bindBackground((CommentVO) item);
                    } else if (obj == CommentsDiffUtilCallback.Payload.ACTION_BUTTONS) {
                        ((CommentViewHolder) holder).setActions((CommentVO) item);
                    }
                }
            }
            return;
        }
        if (item instanceof CommentV3VO) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (it.next() == CommentsDiffUtilCallback.Payload.COMMENT_CONTENT) {
                    CommentV3ViewHolder commentV3ViewHolder = holder instanceof CommentV3ViewHolder ? (CommentV3ViewHolder) holder : null;
                    if (commentV3ViewHolder != null) {
                        commentV3ViewHolder.bindContent((CommentV3VO) item);
                    }
                }
            }
            return;
        }
        throw new o();
    }
}
