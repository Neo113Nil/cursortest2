package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.presentation;

import DM.i;
import L9.c;
import Nh.a;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import io.reactivex.C;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.data.AddLegalInnMobileRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.presentation.AddLegalInnMobileVO;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001dB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/data/AddLegalInnMobileRepository;", "repository", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/data/AddLegalInnMobileRepository;)V", "", "onCleared", "()V", "", "innText", "", "params", "onInnTextChanged", "(Ljava/lang/String;Ljava/util/Map;)V", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO$StateVO;", "state", "Landroidx/lifecycle/V;", "getState", "()Landroidx/lifecycle/V;", "Lnc/a;", "compositeDisposable", "Lnc/a;", "LL9/c;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileViewModel$InnTextState;", "kotlin.jvm.PlatformType", "innTextStream", "LL9/c;", "InnTextState", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddLegalInnMobileViewModel extends w0 {

    @NotNull
    private final C8486a compositeDisposable;

    @NotNull
    private final c<InnTextState> innTextStream;

    @NotNull
    private final V<AddLegalInnMobileVO.StateVO> state;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileViewModel$InnTextState;", "Lkotlin/jvm/internal/EnhancedNullability;", "textState", "Lio/reactivex/C;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO$StateVO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileViewModel$InnTextState;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.presentation.AddLegalInnMobileViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<InnTextState, C<? extends AddLegalInnMobileVO.StateVO>> {
        final /* synthetic */ AddLegalInnMobileRepository $repository;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AddLegalInnMobileRepository addLegalInnMobileRepository) {
            super(1);
            this.$repository = addLegalInnMobileRepository;
        }

        @Override // kotlin.jvm.functions.Function1
        public final C<? extends AddLegalInnMobileVO.StateVO> invoke(InnTextState textState) {
            Intrinsics.checkNotNullParameter(textState, "textState");
            return this.$repository.getLegalsByInn(textState.getInnText(), textState.getParams());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.presentation.AddLegalInnMobileViewModel$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<AddLegalInnMobileVO.StateVO, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, V.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AddLegalInnMobileVO.StateVO stateVO) {
            invoke2(stateVO);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AddLegalInnMobileVO.StateVO stateVO) {
            ((V) this.receiver).setValue(stateVO);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileViewModel$InnTextState;", "", "", "innText", "", "params", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInnText", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class InnTextState {

        @NotNull
        private final String innText;
        private final Map<String, String> params;

        public InnTextState(@NotNull String innText, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(innText, "innText");
            this.innText = innText;
            this.params = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InnTextState)) {
                return false;
            }
            InnTextState innTextState = (InnTextState) other;
            return Intrinsics.d(this.innText, innTextState.innText) && Intrinsics.d(this.params, innTextState.params);
        }

        @NotNull
        public final String getInnText() {
            return this.innText;
        }

        public final Map<String, String> getParams() {
            return this.params;
        }

        public int hashCode() {
            int hashCode = this.innText.hashCode() * 31;
            Map<String, String> map = this.params;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            return a.d("InnTextState(innText=", this.innText, ", params=", ")", this.params);
        }
    }

    public AddLegalInnMobileViewModel(@NotNull AddLegalInnMobileRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        V<AddLegalInnMobileVO.StateVO> v11 = new V<>();
        this.state = v11;
        C8486a c8486a = new C8486a();
        this.compositeDisposable = c8486a;
        c<InnTextState> c11 = c.c();
        Intrinsics.checkNotNullExpressionValue(c11, "create(...)");
        this.innTextStream = c11;
        InterfaceC8487b subscribe = c11.debounce(200L, TimeUnit.MILLISECONDS).observeOn(Mc.a.b()).switchMapSingle(new GH.a(new AnonymousClass1(repository), 7)).observeOn(C8125a.a()).subscribe(new i(new AnonymousClass2(v11), 9));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C _init_$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    @NotNull
    public final V<AddLegalInnMobileVO.StateVO> getState() {
        return this.state;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.compositeDisposable.d();
    }

    public final void onInnTextChanged(@NotNull String innText, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(innText, "innText");
        this.innTextStream.accept(new InnTextState(innText, params));
    }
}
