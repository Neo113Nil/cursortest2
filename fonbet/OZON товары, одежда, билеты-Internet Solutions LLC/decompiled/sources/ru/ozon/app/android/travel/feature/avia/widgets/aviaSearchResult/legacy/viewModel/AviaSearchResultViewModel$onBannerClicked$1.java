package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel;

import Sc.r;
import Sc.s;
import Wc.a;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3.AviaSearchResultApi;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel$onBannerClicked$1", f = "AviaSearchResultViewModel.kt", l = {318}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AviaSearchResultViewModel$onBannerClicked$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    int label;
    final /* synthetic */ AviaSearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultViewModel$onBannerClicked$1(AviaSearchResultViewModel aviaSearchResultViewModel, AtomAction.ComposerAction composerAction, d<? super AviaSearchResultViewModel$onBannerClicked$1> dVar) {
        super(2, dVar);
        this.this$0 = aviaSearchResultViewModel;
        this.$action = composerAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AviaSearchResultViewModel$onBannerClicked$1(this.this$0, this.$action, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        AviaSearchResultApi aviaSearchResultApi;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                AviaSearchResultViewModel aviaSearchResultViewModel = this.this$0;
                AtomAction.ComposerAction composerAction = this.$action;
                r.Companion companion = r.INSTANCE;
                aviaSearchResultApi = aviaSearchResultViewModel.api;
                String actionName = composerAction.getActionName();
                Map<String, String> params = composerAction.getParams();
                if (params == null) {
                    params = U.c();
                }
                this.label = 1;
                if (aviaSearchResultApi.performCompletableAction(actionName, params, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = Unit.f71690a;
            r.Companion companion2 = r.INSTANCE;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AviaSearchResultViewModel$onBannerClicked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
