package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate;

import Ae.w0;
import Sc.s;
import Tg.b;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntity;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTg/b;", "action", "", "invoke", "(LTg/b;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class FavoriteEntityComposeViewDelegate$buildActionHandler$1 extends AbstractC7737t implements Function1<b, Boolean> {
    final /* synthetic */ FavoriteEntityComposeViewDelegate this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeViewDelegate$buildActionHandler$1$1", f = "FavoriteEntityComposeViewDelegate.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeViewDelegate$buildActionHandler$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;
        final /* synthetic */ FavoriteEntityComposeViewDelegate this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FavoriteEntityComposeViewDelegate favoriteEntityComposeViewDelegate, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = favoriteEntityComposeViewDelegate;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            w0 w0Var;
            FavoriteEntity favoriteEntity;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            this.this$0.revertAndReBindViewState();
            w0Var = this.this$0.clickFlow;
            favoriteEntity = this.this$0.currentFavoriteEntity;
            if (favoriteEntity == null) {
                return Unit.f71690a;
            }
            w0Var.tryEmit(favoriteEntity);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteEntityComposeViewDelegate$buildActionHandler$1(FavoriteEntityComposeViewDelegate favoriteEntityComposeViewDelegate) {
        super(1);
        this.this$0 = favoriteEntityComposeViewDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(b action) {
        boolean z11;
        M m11;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.ComposerAction) {
            m11 = this.this$0.scope;
            C10727i.c(m11, null, null, new AnonymousClass1(this.this$0, null), 3);
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
