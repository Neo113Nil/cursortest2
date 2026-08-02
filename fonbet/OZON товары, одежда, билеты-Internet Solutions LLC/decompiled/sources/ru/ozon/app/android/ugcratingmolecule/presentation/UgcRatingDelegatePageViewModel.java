package ru.ozon.app.android.ugcratingmolecule.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import P4.f;
import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugcratingservice.UgcRatingService;
import ru.ozon.app.android.ugcratingservice.data.RatingState;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugcratingmolecule/presentation/UgcRatingDelegatePageViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/ugcratingservice/UgcRatingService;", "ugcRatingService", "<init>", "(Lru/ozon/app/android/ugcratingservice/UgcRatingService;)V", "", "onCleared", "()V", "", "sku", "Lru/ozon/app/android/ugcratingmolecule/presentation/UgcRatingDelegateViewModel;", "getDelegateViewModelBySku", "(Ljava/lang/String;)Lru/ozon/app/android/ugcratingmolecule/presentation/UgcRatingDelegateViewModel;", "Lru/ozon/app/android/ugcratingservice/UgcRatingService;", "viewModelId", "Ljava/lang/String;", "", "_viewModelsMap", "Ljava/util/Map;", "ugcratingmolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UgcRatingDelegatePageViewModel extends w0 {

    @NotNull
    private final Map<String, UgcRatingDelegateViewModel> _viewModelsMap;

    @NotNull
    private final UgcRatingService ugcRatingService;

    @NotNull
    private final String viewModelId;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "productsMap", "", "", "Lru/ozon/app/android/ugcratingservice/data/RatingState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.ugcratingmolecule.presentation.UgcRatingDelegatePageViewModel$1", f = "UgcRatingDelegatePageViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ugcratingmolecule.presentation.UgcRatingDelegatePageViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Map<String, RatingState>, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = UgcRatingDelegatePageViewModel.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Map map = (Map) this.L$0;
            UgcRatingDelegatePageViewModel ugcRatingDelegatePageViewModel = UgcRatingDelegatePageViewModel.this;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                RatingState ratingState = (RatingState) entry.getValue();
                Map map2 = ugcRatingDelegatePageViewModel._viewModelsMap;
                Object obj2 = map2.get(str);
                if (obj2 == null) {
                    obj2 = new UgcRatingDelegateViewModel();
                    map2.put(str, obj2);
                }
                ((UgcRatingDelegateViewModel) obj2).updateRatingState(ratingState);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Map<String, RatingState> map, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(map, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    public UgcRatingDelegatePageViewModel(@NotNull UgcRatingService ugcRatingService) {
        Intrinsics.checkNotNullParameter(ugcRatingService, "ugcRatingService");
        this.ugcRatingService = ugcRatingService;
        String b11 = f.b("toString(...)");
        this.viewModelId = b11;
        this._viewModelsMap = new LinkedHashMap();
        C2399j.C(new C2408n0(ugcRatingService.getRatingStateFlow(b11), new AnonymousClass1(null)), x0.a(this));
    }

    @NotNull
    public final UgcRatingDelegateViewModel getDelegateViewModelBySku(@NotNull String sku) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Map<String, UgcRatingDelegateViewModel> map = this._viewModelsMap;
        UgcRatingDelegateViewModel ugcRatingDelegateViewModel = map.get(sku);
        if (ugcRatingDelegateViewModel == null) {
            ugcRatingDelegateViewModel = new UgcRatingDelegateViewModel();
            map.put(sku, ugcRatingDelegateViewModel);
        }
        return ugcRatingDelegateViewModel;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.ugcRatingService.unRegisterUgcRatingMoleculeScreen(this.viewModelId);
        super.onCleared();
    }
}
