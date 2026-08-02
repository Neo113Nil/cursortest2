package ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation;

import Sc.s;
import Wc.a;
import androidx.lifecycle.K;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.t;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteInteractor;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SisBrandFavoriteButtonDelegateImpl$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ SisBrandFavoriteButtonDelegateImpl this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonDelegateImpl$actionHandler$1$1", f = "SisBrandFavoriteButtonDelegate.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonDelegateImpl$actionHandler$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ AtomAction.ComposerAction $it;
        int label;
        final /* synthetic */ SisBrandFavoriteButtonDelegateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SisBrandFavoriteButtonDelegateImpl sisBrandFavoriteButtonDelegateImpl, AtomAction.ComposerAction composerAction, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = sisBrandFavoriteButtonDelegateImpl;
            this.$it = composerAction;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$it, dVar);
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
                AtomAction.ComposerAction composerAction = this.$it;
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
    SisBrandFavoriteButtonDelegateImpl$actionHandler$1(SisBrandFavoriteButtonDelegateImpl sisBrandFavoriteButtonDelegateImpl) {
        super(1);
        this.this$0 = sisBrandFavoriteButtonDelegateImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction it) {
        t tVar;
        Intrinsics.checkNotNullParameter(it, "it");
        tVar = this.this$0.ownerContainer;
        C10727i.c(K.a(tVar.f()), null, null, new AnonymousClass1(this.this$0, it, null), 3);
    }
}
