package ru.ozon.app.android.seller.molecule.sisbrandfavorite.v2;

import Sc.s;
import Tg.b;
import Wc.a;
import a00.C4911f;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteInteractor;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTg/b;", "action", "", "invoke", "(LTg/b;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ComposeSisBrandFavoriteButtonDelegateImpl$actionHandler$1 extends AbstractC7737t implements Function1<b, Boolean> {
    final /* synthetic */ ComposeSisBrandFavoriteButtonDelegateImpl this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.seller.molecule.sisbrandfavorite.v2.ComposeSisBrandFavoriteButtonDelegateImpl$actionHandler$1$1", f = "ComposeSisBrandFavoriteButtonDelegateImpl.kt", l = {43}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.seller.molecule.sisbrandfavorite.v2.ComposeSisBrandFavoriteButtonDelegateImpl$actionHandler$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ b $action;
        int label;
        final /* synthetic */ ComposeSisBrandFavoriteButtonDelegateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ComposeSisBrandFavoriteButtonDelegateImpl composeSisBrandFavoriteButtonDelegateImpl, b bVar, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = composeSisBrandFavoriteButtonDelegateImpl;
            this.$action = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$action, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            SisBrandFavoriteButton sisBrandFavoriteButton;
            SisBrandFavoriteInteractor sisBrandFavoriteInteractor;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                sisBrandFavoriteButton = this.this$0.button;
                if (sisBrandFavoriteButton == null) {
                    return Unit.f71690a;
                }
                long id2 = sisBrandFavoriteButton.getId();
                sisBrandFavoriteInteractor = this.this$0.sisBrandFavoriteInteractor;
                AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) this.$action;
                this.label = 1;
                obj = sisBrandFavoriteInteractor.processAction(id2, composerAction, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            NotificationModelWrapper notificationModelWrapper = (NotificationModelWrapper) obj;
            if (notificationModelWrapper == null) {
                return Unit.f71690a;
            }
            this.this$0.showNotification(notificationModelWrapper);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposeSisBrandFavoriteButtonDelegateImpl$actionHandler$1(ComposeSisBrandFavoriteButtonDelegateImpl composeSisBrandFavoriteButtonDelegateImpl) {
        super(1);
        this.this$0 = composeSisBrandFavoriteButtonDelegateImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(b action) {
        C4911f c4911f;
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.ComposerAction)) {
            return Boolean.FALSE;
        }
        c4911f = this.this$0.ownerContainer;
        C10727i.c(K.a(c4911f.g()), null, null, new AnonymousClass1(this.this$0, action, null), 3);
        return Boolean.TRUE;
    }
}
