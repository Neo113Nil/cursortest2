package ru.ozon.app.android.ugc.core.widgets.commentsListV3.core;

import GU.a;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.ugc.core.R$string;
import ru.ozon.app.android.ugc.core.databinding.ItemReviewCommentInputBinding;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsListDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.di.CommentsListComponent;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentInputViewHolder;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListInputVO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModel;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModelImpl;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\u00020\u0019j\u0002`\u001a2\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/core/CommentInputV3NoUiViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/di/CommentsListComponent;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListInputVO;", "<init>", "()V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CommentInputV3NoUiViewMapper extends OverlayWidgetScreenViewItemMapper2<CommentsListComponent, CommentsListDTO, CommentsListInputVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(ItemReviewCommentInputBinding itemReviewCommentInputBinding, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LinearLayout constraintLayout = itemReviewCommentInputBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof CommentsListDTO) && ((CommentsListDTO) state).isCommentable();
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<CommentsListInputVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        ItemReviewCommentInputBinding inflate = ItemReviewCommentInputBinding.inflate(LayoutInflater.from(container.L()), null, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        Object a11 = new z0(container.b0().a(), new z0.c() { // from class: ru.ozon.app.android.ugc.core.widgets.commentsListV3.core.CommentInputV3NoUiViewMapper$createHolder$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CommentsViewModelImpl commentsViewModelImpl = CommentInputV3NoUiViewMapper.this.component().getCommentsViewModelProvider().get();
                Intrinsics.g(commentsViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return commentsViewModelImpl;
            }
        }).a(CommentsViewModelImpl.class);
        Intrinsics.checkNotNullExpressionValue(a11, "createViewModel(...)");
        return new CommentInputViewHolder(inflate, (CommentsViewModel) a11, component().getOzonRouter(), component().getAppType() == AppType.SELECT, container, new a(inflate, 0));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CommentsListComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CommentsListComponent.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<CommentsListInputVO> map(@NotNull CommentsListDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        String inputPlaceholder = state.getInputPlaceholder();
        if (inputPlaceholder == null) {
            inputPlaceholder = StringProvider.getString(R$string.review_send_comment_hint);
        }
        String inputAnswerPlaceholder = state.getInputAnswerPlaceholder();
        if (inputAnswerPlaceholder == null) {
            inputAnswerPlaceholder = StringProvider.getString(R$string.review_reply_comment_hint);
        }
        return C7714v.a0(new CommentsListInputVO(hashCode, inputPlaceholder, inputAnswerPlaceholder));
    }
}
