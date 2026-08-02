package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate;

import Ge.f;
import Sc.s;
import WZ.t;
import Wc.a;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntity;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntityKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.MapperKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.restriction.RestrictionModel;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.favorites.domain.utils.FavoritesListExtentionsKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import xe.C10720e0;
import xe.L0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeViewDelegate$onFavoriteUpdateClicker$1", f = "FavoriteEntityComposeViewDelegate.kt", l = {107, 109, 117}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FavoriteEntityComposeViewDelegate$onFavoriteUpdateClicker$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ FavoriteEntity $entity;
    int label;
    final /* synthetic */ FavoriteEntityComposeViewDelegate this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeViewDelegate$onFavoriteUpdateClicker$1$1", f = "FavoriteEntityComposeViewDelegate.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeViewDelegate$onFavoriteUpdateClicker$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ FavoriteEntity $entity;
        final /* synthetic */ RestrictionModel $restriction;
        int label;
        final /* synthetic */ FavoriteEntityComposeViewDelegate this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FavoriteEntity favoriteEntity, FavoriteEntityComposeViewDelegate favoriteEntityComposeViewDelegate, RestrictionModel restrictionModel, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$entity = favoriteEntity;
            this.this$0 = favoriteEntityComposeViewDelegate;
            this.$restriction = restrictionModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$entity, this.this$0, this.$restriction, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ComposeWidgetInfo composeWidgetInfo;
            ComposeWidgetInfo composeWidgetInfo2;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Map<String, TokenizedTrackingInfo> buttonTrackingInfo = FavoriteEntityKt.getButtonTrackingInfo(this.$entity);
            if (buttonTrackingInfo != null) {
                composeWidgetInfo = this.this$0.widgetInfo;
                t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(buttonTrackingInfo, new Long(composeWidgetInfo.getWidgetId()), null, 2, null);
                if (mapToTokenizedEvent$default != null) {
                    composeWidgetInfo2 = this.this$0.widgetInfo;
                    TokenizedAnalyticsExtensionsKt.processComposerEvents$default(composeWidgetInfo2.getTokenizedAnalytics(), mapToTokenizedEvent$default, null, 2, null);
                }
            }
            FavoriteEntityComposeViewDelegate favoriteEntityComposeViewDelegate = this.this$0;
            RestrictionModel restrictionModel = this.$restriction;
            Intrinsics.f(restrictionModel);
            favoriteEntityComposeViewDelegate.showRestriction(restrictionModel);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeViewDelegate$onFavoriteUpdateClicker$1$2", f = "FavoriteEntityComposeViewDelegate.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeViewDelegate$onFavoriteUpdateClicker$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ Throwable $throwable;
        int label;
        final /* synthetic */ FavoriteEntityComposeViewDelegate this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Throwable th2, FavoriteEntityComposeViewDelegate favoriteEntityComposeViewDelegate, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$throwable = th2;
            this.this$0 = favoriteEntityComposeViewDelegate;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$throwable, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Lm0.a.f17149a.e(this.$throwable);
            this.this$0.revertAndReBindViewState();
            this.this$0.showRestriction(new RestrictionModel(OzonSpannableStringKt.toOzonSpannableString(FavoritesListExtentionsKt.toMessage(this.$throwable)), 0L, null, 6, null));
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteEntityComposeViewDelegate$onFavoriteUpdateClicker$1(FavoriteEntityComposeViewDelegate favoriteEntityComposeViewDelegate, FavoriteEntity favoriteEntity, d<? super FavoriteEntityComposeViewDelegate$onFavoriteUpdateClicker$1> dVar) {
        super(2, dVar);
        this.this$0 = favoriteEntityComposeViewDelegate;
        this.$entity = favoriteEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FavoriteEntityComposeViewDelegate$onFavoriteUpdateClicker$1(this.this$0, this.$entity, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (xe.C10727i.f(r1, r5, r8) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (xe.C10727i.f(r1, r4, r8) != r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FavoriteEntityInteractor favoriteEntityInteractor;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            C10720e0 c10720e0 = C10720e0.f105451a;
            L0 l02 = De.s.f6650a;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(th2, this.this$0, null);
            this.label = 3;
        }
        if (i11 == 0) {
            s.b(obj);
            favoriteEntityInteractor = this.this$0.favoriteEntityInteractor;
            y<RestrictionModel> updateFavoriteEntity = favoriteEntityInteractor.updateFavoriteEntity(MapperKt.toShort(this.$entity));
            this.label = 1;
            obj = f.b(updateFavoriteEntity, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    s.b(obj);
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        C10720e0 c10720e02 = C10720e0.f105451a;
        L0 l03 = De.s.f6650a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$entity, this.this$0, (RestrictionModel) obj, null);
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FavoriteEntityComposeViewDelegate$onFavoriteUpdateClicker$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
