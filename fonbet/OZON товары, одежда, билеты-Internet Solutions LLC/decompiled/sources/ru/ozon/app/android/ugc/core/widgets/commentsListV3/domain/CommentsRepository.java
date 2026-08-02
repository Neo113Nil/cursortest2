package ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain;

import Ae.InterfaceC2395h;
import Sc.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b`\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ<\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH¦@¢\u0006\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\t8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/domain/CommentsRepository;", "", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "LAe/h;", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;", "fetchComments", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)LAe/h;", "", "comment", "itemId", "reviewUuid", "parentUuid", "sendComment", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "commentUuid", "LSc/r;", "deleteComment-BWLJW6A", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "deleteComment", "getScrollToCommentUuid", "()Ljava/lang/String;", "setScrollToCommentUuid", "(Ljava/lang/String;)V", "scrollToCommentUuid", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface CommentsRepository {
    /* renamed from: deleteComment-BWLJW6A, reason: not valid java name */
    Object mo1479deleteCommentBWLJW6A(@NotNull AtomAction.ComposerAction composerAction, @NotNull String str, @NotNull String str2, @NotNull d<? super r<? extends Object>> dVar);

    @NotNull
    InterfaceC2395h<List<CommentsAdapterVO>> fetchComments(@NotNull AtomAction.ComposerAction action);

    String getScrollToCommentUuid();

    Object sendComment(@NotNull AtomAction.ComposerAction composerAction, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull d<? super CommentsAdapterVO> dVar);
}
