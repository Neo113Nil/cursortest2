package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Be.AbstractC2635g;
import Ge.n;
import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.KeyFavoriteEntityModel;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntity;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.FavoriteEntityUpdateKey;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeViewDelegate$initCollectors$1", f = "FavoriteEntityComposeViewDelegate.kt", l = {134}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FavoriteEntityComposeViewDelegate$initCollectors$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ FavoriteEntityComposeViewDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteEntityComposeViewDelegate$initCollectors$1(FavoriteEntityComposeViewDelegate favoriteEntityComposeViewDelegate, d<? super FavoriteEntityComposeViewDelegate$initCollectors$1> dVar) {
        super(2, dVar);
        this.this$0 = favoriteEntityComposeViewDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FavoriteEntityComposeViewDelegate$initCollectors$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FavoriteEntityInteractor favoriteEntityInteractor;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            favoriteEntityInteractor = this.this$0.favoriteEntityInteractor;
            InterfaceC2395h a11 = n.a(favoriteEntityInteractor.subscribeOnFavoriteUpdate());
            final FavoriteEntityComposeViewDelegate favoriteEntityComposeViewDelegate = this.this$0;
            InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeViewDelegate$initCollectors$1.1

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
                @e(c = "ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeViewDelegate$initCollectors$1$1$1", f = "FavoriteEntityComposeViewDelegate.kt", l = {}, m = "invokeSuspend")
                /* renamed from: ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeViewDelegate$initCollectors$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C17681 extends j implements Function2<M, d<? super Unit>, Object> {
                    final /* synthetic */ FavoriteEntity $entity;
                    final /* synthetic */ boolean $isFavorite;
                    int label;
                    final /* synthetic */ FavoriteEntityComposeViewDelegate this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C17681(FavoriteEntityComposeViewDelegate favoriteEntityComposeViewDelegate, FavoriteEntity favoriteEntity, boolean z11, d<? super C17681> dVar) {
                        super(2, dVar);
                        this.this$0 = favoriteEntityComposeViewDelegate;
                        this.$entity = favoriteEntity;
                        this.$isFavorite = z11;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final d<Unit> create(Object obj, d<?> dVar) {
                        return new C17681(this.this$0, this.$entity, this.$isFavorite, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        ComposeWidgetInfo composeWidgetInfo;
                        a aVar = a.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        composeWidgetInfo = this.this$0.widgetInfo;
                        composeWidgetInfo.getComposerController().update(new FavoriteEntityUpdateKey(FavoriteEntity.copy$default(this.$entity, null, 0L, this.$isFavorite, null, null, 27, null)));
                        return Unit.f71690a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(M m11, d<? super Unit> dVar) {
                        return ((C17681) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                    }
                }

                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((Map<KeyFavoriteEntityModel, Boolean>) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(Map<KeyFavoriteEntityModel, Boolean> map, d<? super Unit> dVar) {
                    FavoriteEntity favoriteEntity;
                    favoriteEntity = FavoriteEntityComposeViewDelegate.this.currentFavoriteEntity;
                    if (favoriteEntity == null) {
                        return Unit.f71690a;
                    }
                    Boolean bool = map.get(new KeyFavoriteEntityModel(favoriteEntity.getId(), favoriteEntity.getType()));
                    if (bool == null) {
                        return Unit.f71690a;
                    }
                    boolean booleanValue = bool.booleanValue();
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    Object f7 = C10727i.f(De.s.f6650a, new C17681(FavoriteEntityComposeViewDelegate.this, favoriteEntity, booleanValue, null), dVar);
                    return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
                }
            };
            this.label = 1;
            if (((AbstractC2635g) a11).collect(interfaceC2397i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FavoriteEntityComposeViewDelegate$initCollectors$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
