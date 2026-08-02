package ru.ozon.app.android.favorites.ui.actionhandler;

import Ge.f;
import Sc.s;
import Wc.a;
import androidx.fragment.app.r;
import i10.l;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.data.shoppinglists.models.FavoriteShareListVO;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.domain.utils.FavoritesListExtentionsKt;
import ru.ozon.app.android.uikit.R$drawable;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.favorites.ui.actionhandler.FavoriteShareListActionHandler$shareList$1", f = "FavoriteShareListActionHandler.kt", l = {118, 120, 124}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FavoriteShareListActionHandler$shareList$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ long $listId;
    final /* synthetic */ String $permission;
    final /* synthetic */ ComposerReferences $references;
    final /* synthetic */ Boolean $shareAsManager;
    int label;
    final /* synthetic */ FavoriteShareListActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteShareListActionHandler$shareList$1(ComposerReferences composerReferences, FavoriteShareListActionHandler favoriteShareListActionHandler, long j11, String str, Boolean bool, d<? super FavoriteShareListActionHandler$shareList$1> dVar) {
        super(2, dVar);
        this.$references = composerReferences;
        this.this$0 = favoriteShareListActionHandler;
        this.$listId = j11;
        this.$permission = str;
        this.$shareAsManager = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FavoriteShareListActionHandler$shareList$1(this.$references, this.this$0, this.$listId, this.$permission, this.$shareAsManager, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (r14 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        if (r14 != r1) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FavoritesListsInteractor favoritesListsInteractor;
        Object showShareSheet;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            Lm0.a.f17149a.e(th2);
            this.$references.getController().hideLoader();
            FavoriteShareListActionHandler favoriteShareListActionHandler = this.this$0;
            ComposerReferences composerReferences = this.$references;
            String message = FavoritesListExtentionsKt.toMessage(th2);
            Integer num = new Integer(R$drawable.ic_warning);
            this.label = 3;
            obj = FavoriteShareListActionHandler.showMessage$default(favoriteShareListActionHandler, composerReferences, message, num, 0L, null, this, 24, null);
        }
        if (i11 == 0) {
            s.b(obj);
            this.$references.getController().e(new l.a.C1079a(0L, null, 3));
            favoritesListsInteractor = this.this$0.favoritesListsInteractor;
            y<FavoriteShareListVO> shareFavoritesList = favoritesListsInteractor.shareFavoritesList(this.$listId, this.$permission, this.$shareAsManager);
            this.label = 1;
            obj = f.b(shareFavoritesList, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    s.b(obj);
                    return Unit.f71690a;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        Intrinsics.checkNotNullExpressionValue(obj, "await(...)");
        this.$references.getController().hideLoader();
        FavoriteShareListActionHandler favoriteShareListActionHandler2 = this.this$0;
        r i12 = this.$references.getContainer().i();
        String shareMessage = ((FavoriteShareListVO) obj).getShareMessage();
        this.label = 2;
        showShareSheet = favoriteShareListActionHandler2.showShareSheet(i12, shareMessage, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FavoriteShareListActionHandler$shareList$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
