package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation;

import AF.d;
import AF.g;
import B0.A0;
import B90.C2618u;
import BY.h;
import BY.i;
import Bc.e;
import Bt.C2673b;
import Fn.C3055d;
import Fn.C3056e;
import H2.c;
import Hs.b;
import Lm0.a;
import Nc.C3667a;
import Tm.C4047b;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.AbstractC7094b;
import io.reactivex.p;
import io.reactivex.x;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.account.currency.CurrencyRepository;
import ru.ozon.app.android.account.locale.app.data.AppLocaleRepository;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.FilterValuesRepository;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesViewModel;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ApplyFilterShortRequestInfo;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterState;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import vc.C10302g;
import vc.l;
import vc.n;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 E2\u00020\u0001:\u0002EFB!\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u000eJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010\u000eJ\u000f\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010$J\u0017\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0013H\u0002¢\u0006\u0004\b'\u0010\u0015J\u0017\u0010(\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0013H\u0002¢\u0006\u0004\b(\u0010\u0015J\u0017\u0010)\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0013H\u0002¢\u0006\u0004\b)\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R#\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020504038\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010:\u001a\u0004\b;\u0010<\"\u0004\b\u0019\u0010=R(\u0010@\u001a\u0010\u0012\f\u0012\n ?*\u0004\u0018\u00010\n0\n0>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010D¨\u0006G"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/FilterValuesRepository;", "filterValuesRepository", "Lru/ozon/app/android/account/currency/CurrencyRepository;", "currencyRepository", "Lru/ozon/app/android/account/locale/app/data/AppLocaleRepository;", "appLocaleRepository", "<init>", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/data/FilterValuesRepository;Lru/ozon/app/android/account/currency/CurrencyRepository;Lru/ozon/app/android/account/locale/app/data/AppLocaleRepository;)V", "", "searchText", "", "onTextChanged", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "atomAction", "processClickAction", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "processComposerAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesVO;", "model", "currentUrl", "setModel$filter_widgets_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesVO;Ljava/lang/String;)V", "setModel", "", "getLastButtonEnableState$filter_widgets_prodGoogleAllVendorsRelease", "()Z", "getLastButtonEnableState", "id", "toggleItem", "expandHeader", "selectAll", "()V", "deselectAll", "action", "executeApplyFilters", "changeCurrency", "saveLocale", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/FilterValuesRepository;", "Lru/ozon/app/android/account/currency/CurrencyRepository;", "Lru/ozon/app/android/account/locale/app/data/AppLocaleRepository;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action;", "viewModelAction", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getViewModelAction", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/V;", "", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "list", "Landroidx/lifecycle/V;", "getList", "()Landroidx/lifecycle/V;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesVO;", "getModel$filter_widgets_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesVO;", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesVO;)V", "LNc/a;", "kotlin.jvm.PlatformType", "searchTextSubject", "LNc/a;", "getSearchTextSubject$filter_widgets_prodGoogleAllVendorsRelease", "()LNc/a;", "Ljava/lang/String;", "Companion", "Action", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterValuesViewModel extends w0 {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final AppLocaleRepository appLocaleRepository;

    @NotNull
    private final CurrencyRepository currencyRepository;
    private String currentUrl;

    @NotNull
    private final FilterValuesRepository filterValuesRepository;

    @NotNull
    private final V<List<FilterValuesCell>> list;
    private FilterValuesVO model;

    @NotNull
    private final C3667a<String> searchTextSubject;

    @NotNull
    private final SingleLiveEvent<Action> viewModelAction;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<String, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            FilterValuesRepository filterValuesRepository = FilterValuesViewModel.this.filterValuesRepository;
            Intrinsics.f(str);
            filterValuesRepository.onSearchTextChanged(str);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesViewModel$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).e(th2);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/util/List;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesViewModel$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<List<? extends FilterValuesCell>, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends FilterValuesCell> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends FilterValuesCell> list) {
            FilterValuesViewModel.this.getList().setValue(list);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesViewModel$4, reason: invalid class name */
    /* synthetic */ class AnonymousClass4 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass4(Object obj) {
            super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).e(th2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesViewModel$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            SingleLiveEvent<Action> viewModelAction = FilterValuesViewModel.this.getViewModelAction();
            Intrinsics.f(bool);
            viewModelAction.setValue(new Action.SwitchButtonState(bool.booleanValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesViewModel$6, reason: invalid class name */
    /* synthetic */ class AnonymousClass6 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass6(Object obj) {
            super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).e(th2);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action;", "", "<init>", "()V", "Error", "ErrorAndClose", "ShowLoader", "HideLoader", "TrackComposerAction", "TrackCurrencyAction", "TrackChangeLocaleAction", "Success", "SwitchButtonState", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action$Error;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action$ErrorAndClose;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action$HideLoader;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action$ShowLoader;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action$Success;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action$SwitchButtonState;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action$TrackChangeLocaleAction;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action$TrackComposerAction;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action$TrackCurrencyAction;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action$Error;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action;", "<init>", "()V", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Error extends Action {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action$ErrorAndClose;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action;", "<init>", "()V", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ErrorAndClose extends Action {

            @NotNull
            public static final ErrorAndClose INSTANCE = new ErrorAndClose();

            private ErrorAndClose() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action$HideLoader;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action;", "<init>", "()V", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class HideLoader extends Action {

            @NotNull
            public static final HideLoader INSTANCE = new HideLoader();

            private HideLoader() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action$ShowLoader;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action;", "<init>", "()V", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ShowLoader extends Action {

            @NotNull
            public static final ShowLoader INSTANCE = new ShowLoader();

            private ShowLoader() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action$Success;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action;", "", "refreshUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRefreshUrl", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends Action {
            private final String refreshUrl;

            /* JADX WARN: Multi-variable type inference failed */
            public Success() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.d(this.refreshUrl, ((Success) other).refreshUrl);
            }

            public final String getRefreshUrl() {
                return this.refreshUrl;
            }

            public int hashCode() {
                String str = this.refreshUrl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Success(refreshUrl=", this.refreshUrl, ")");
            }

            public Success(String str) {
                super(null);
                this.refreshUrl = str;
            }

            public /* synthetic */ Success(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action$SwitchButtonState;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action;", "", "isEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SwitchButtonState extends Action {
            private final boolean isEnabled;

            public SwitchButtonState(boolean z11) {
                super(null);
                this.isEnabled = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SwitchButtonState) && this.isEnabled == ((SwitchButtonState) other).isEnabled;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isEnabled);
            }

            /* renamed from: isEnabled, reason: from getter */
            public final boolean getIsEnabled() {
                return this.isEnabled;
            }

            @NotNull
            public String toString() {
                return C2618u.g("SwitchButtonState(isEnabled=", ")", this.isEnabled);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action$TrackChangeLocaleAction;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TrackChangeLocaleAction extends Action {

            @NotNull
            private final AtomAction.ComposerAction action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TrackChangeLocaleAction(@NotNull AtomAction.ComposerAction action) {
                super(null);
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TrackChangeLocaleAction) && Intrinsics.d(this.action, ((TrackChangeLocaleAction) other).action);
            }

            @NotNull
            public final AtomAction.ComposerAction getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            @NotNull
            public String toString() {
                return "TrackChangeLocaleAction(action=" + this.action + ")";
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action$TrackComposerAction;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", "", "selectedIds", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "Ljava/util/List;", "getSelectedIds", "()Ljava/util/List;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TrackComposerAction extends Action {

            @NotNull
            private final AtomAction.ComposerAction action;

            @NotNull
            private final List<String> selectedIds;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TrackComposerAction(@NotNull AtomAction.ComposerAction action, @NotNull List<String> selectedIds) {
                super(null);
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
                this.action = action;
                this.selectedIds = selectedIds;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TrackComposerAction)) {
                    return false;
                }
                TrackComposerAction trackComposerAction = (TrackComposerAction) other;
                return Intrinsics.d(this.action, trackComposerAction.action) && Intrinsics.d(this.selectedIds, trackComposerAction.selectedIds);
            }

            @NotNull
            public final AtomAction.ComposerAction getAction() {
                return this.action;
            }

            @NotNull
            public final List<String> getSelectedIds() {
                return this.selectedIds;
            }

            public int hashCode() {
                return this.selectedIds.hashCode() + (this.action.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "TrackComposerAction(action=" + this.action + ", selectedIds=" + this.selectedIds + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action$TrackCurrencyAction;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TrackCurrencyAction extends Action {

            @NotNull
            private final AtomAction.ComposerAction action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TrackCurrencyAction(@NotNull AtomAction.ComposerAction action) {
                super(null);
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TrackCurrencyAction) && Intrinsics.d(this.action, ((TrackCurrencyAction) other).action);
            }

            @NotNull
            public final AtomAction.ComposerAction getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            @NotNull
            public String toString() {
                return "TrackCurrencyAction(action=" + this.action + ")";
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Companion;", "", "<init>", "()V", "DEFAULT_SEARCH_VALUE", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FilterValuesViewModel(@NotNull FilterValuesRepository filterValuesRepository, @NotNull CurrencyRepository currencyRepository, @NotNull AppLocaleRepository appLocaleRepository) {
        Intrinsics.checkNotNullParameter(filterValuesRepository, "filterValuesRepository");
        Intrinsics.checkNotNullParameter(currencyRepository, "currencyRepository");
        Intrinsics.checkNotNullParameter(appLocaleRepository, "appLocaleRepository");
        this.filterValuesRepository = filterValuesRepository;
        this.currencyRepository = currencyRepository;
        this.appLocaleRepository = appLocaleRepository;
        this.viewModelAction = new SingleLiveEvent<>();
        this.list = new V<>();
        C3667a<String> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.searchTextSubject = d11;
        C8486a a11 = C5415f.a(this);
        p<String> debounce = d11.debounce(300L, TimeUnit.MILLISECONDS);
        HC.a aVar = new HC.a(new AnonymousClass1(), 4);
        a.b bVar = Lm0.a.f17149a;
        InterfaceC8487b subscribe = debounce.subscribe(aVar, new g(new AnonymousClass2(bVar), 4));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(a11, subscribe);
        C8486a a12 = C5415f.a(this);
        InterfaceC8487b subscribe2 = filterValuesRepository.observe().observeOn(C8125a.a()).subscribe(new C4047b(new AnonymousClass3(), 1), new DF.a(new AnonymousClass4(bVar), 2));
        Intrinsics.checkNotNullExpressionValue(subscribe2, "subscribe(...)");
        RxExtKt.plusAssign(a12, subscribe2);
        C8486a a13 = C5415f.a(this);
        InterfaceC8487b subscribe3 = filterValuesRepository.observeButtonChange().observeOn(C8125a.a()).subscribe(new h(new AnonymousClass5(), 3), new i(new AnonymousClass6(bVar), 2));
        Intrinsics.checkNotNullExpressionValue(subscribe3, "subscribe(...)");
        RxExtKt.plusAssign(a13, subscribe3);
    }

    private final void changeCurrency(AtomAction.ComposerAction action) {
        String str;
        String actionName = action.getActionName();
        Map<String, String> params = action.getParams();
        if (params == null || (str = params.get("currency_code")) == null) {
            return;
        }
        toggleItem(str);
        C8486a a11 = C5415f.a(this);
        AbstractC7094b changeCurrency = this.currencyRepository.changeCurrency(actionName, params);
        x a12 = C8125a.a();
        changeCurrency.getClass();
        n f7 = new l(changeCurrency, a12).f(new C3056e(new FilterValuesViewModel$changeCurrency$1(this), 6));
        Intrinsics.checkNotNullExpressionValue(f7, "doOnSubscribe(...)");
        RxExtKt.plusAssign(a11, RxExtKt.subscribeBy(f7, new FilterValuesViewModel$changeCurrency$2(this, action), new FilterValuesViewModel$changeCurrency$3(this)));
    }

    private final void deselectAll() {
        onTextChanged("");
        C8486a a11 = C5415f.a(this);
        vc.p k11 = new C10302g(new InterfaceC9019a() { // from class: Vq.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                FilterValuesViewModel.deselectAll$lambda$15(FilterValuesViewModel.this);
            }
        }).k(Mc.a.a());
        uc.i iVar = new uc.i(new c(new FilterValuesViewModel$deselectAll$3(Lm0.a.f17149a), 3), new Vq.c());
        k11.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        RxExtKt.plusAssign(a11, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deselectAll$lambda$15(FilterValuesViewModel filterValuesViewModel) {
        filterValuesViewModel.filterValuesRepository.unsetAllItems();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deselectAll$lambda$16() {
    }

    private final void executeApplyFilters(AtomAction.ComposerAction action) {
        String str;
        String actionName = action.getActionName();
        FilterValuesVO filterValuesVO = this.model;
        if (filterValuesVO == null || (str = this.currentUrl) == null) {
            return;
        }
        this.viewModelAction.setValue(Action.ShowLoader.INSTANCE);
        C8486a a11 = C5415f.a(this);
        InterfaceC8487b h11 = new e(this.filterValuesRepository.executeApplySearchFilters(new ApplyFilterShortRequestInfo(str, filterValuesVO.getFilter().getKey(), filterValuesVO.getFilter().getType()), actionName).g(C8125a.a()), new InterfaceC9019a() { // from class: Vq.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                FilterValuesViewModel.executeApplyFilters$lambda$18(FilterValuesViewModel.this);
            }
        }).h(new C3055d(new FilterValuesViewModel$executeApplyFilters$2(this, action), 8), new d(new FilterValuesViewModel$executeApplyFilters$3(this), 6));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(a11, h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeApplyFilters$lambda$18(FilterValuesViewModel filterValuesViewModel) {
        filterValuesViewModel.viewModelAction.postValue(Action.HideLoader.INSTANCE);
    }

    private final void expandHeader(String id2) {
        C8486a a11 = C5415f.a(this);
        InterfaceC8487b subscribe = p.just(id2).doOnNext(new Hs.c(new FilterValuesViewModel$expandHeader$1(this, id2), 4)).subscribeOn(Mc.a.a()).subscribe(new C2673b(FilterValuesViewModel$expandHeader$2.INSTANCE, 2), new AF.a(new FilterValuesViewModel$expandHeader$3(Lm0.a.f17149a), 6));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(a11, subscribe);
    }

    private final void saveLocale(AtomAction.ComposerAction action) {
        String str;
        Map<String, String> params = action.getParams();
        if (params == null || (str = params.get("locale")) == null) {
            return;
        }
        toggleItem(str);
        String str2 = params.get("locale");
        if (str2 == null) {
            return;
        }
        C10727i.c(x0.a(this), new FilterValuesViewModel$saveLocale$$inlined$CoroutineExceptionHandler$1(J.f105405n0, this), null, new FilterValuesViewModel$saveLocale$1(this, str2, action, null), 2);
    }

    private final void selectAll() {
        onTextChanged("");
        C8486a a11 = C5415f.a(this);
        vc.p k11 = new C10302g(new InterfaceC9019a() { // from class: Vq.d
            @Override // qc.InterfaceC9019a
            public final void run() {
                FilterValuesViewModel.selectAll$lambda$12(FilterValuesViewModel.this);
            }
        }).k(Mc.a.a());
        uc.i iVar = new uc.i(new b(new FilterValuesViewModel$selectAll$3(Lm0.a.f17149a), 5), new Vq.e());
        k11.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        RxExtKt.plusAssign(a11, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void selectAll$lambda$12(FilterValuesViewModel filterValuesViewModel) {
        filterValuesViewModel.filterValuesRepository.selectAllItems();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void selectAll$lambda$13() {
    }

    private final void toggleItem(String id2) {
        C8486a a11 = C5415f.a(this);
        InterfaceC8487b subscribe = p.just(id2).doOnNext(new AJ.a(new FilterValuesViewModel$toggleItem$1(this, id2), 2)).subscribeOn(Mc.a.a()).subscribe(new DJ.c(FilterValuesViewModel$toggleItem$2.INSTANCE, 4), new AJ.c(new FilterValuesViewModel$toggleItem$3(Lm0.a.f17149a), 3));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(a11, subscribe);
    }

    public final boolean getLastButtonEnableState$filter_widgets_prodGoogleAllVendorsRelease() {
        try {
            p<Boolean> observeButtonChange = this.filterValuesRepository.observeButtonChange();
            if (observeButtonChange != null) {
                return Intrinsics.d(observeButtonChange.blockingFirst(), Boolean.TRUE);
            }
            return false;
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
            return false;
        }
    }

    @NotNull
    public final V<List<FilterValuesCell>> getList() {
        return this.list;
    }

    /* renamed from: getModel$filter_widgets_prodGoogleAllVendorsRelease, reason: from getter */
    public final FilterValuesVO getModel() {
        return this.model;
    }

    @NotNull
    public final C3667a<String> getSearchTextSubject$filter_widgets_prodGoogleAllVendorsRelease() {
        return this.searchTextSubject;
    }

    @NotNull
    public final SingleLiveEvent<Action> getViewModelAction() {
        return this.viewModelAction;
    }

    public final void onTextChanged(@NotNull String searchText) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        this.searchTextSubject.onNext(searchText);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void processClickAction(@NotNull AtomAction.Click atomAction) {
        Map<String, String> params;
        String str;
        Map<String, String> params2;
        String str2;
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        String id2 = atomAction.getId();
        if (id2 != null) {
            switch (id2.hashCode()) {
                case -906933113:
                    if (id2.equals("selectAllValues")) {
                        selectAll();
                        break;
                    }
                    break;
                case 793830935:
                    if (id2.equals("toggleActiveValue") && (params = atomAction.getParams()) != null && (str = params.get(AppMeasurementSdk.ConditionalUserProperty.VALUE)) != null) {
                        toggleItem(str);
                        break;
                    }
                    break;
                case 1255706086:
                    if (id2.equals("deselectAllValues")) {
                        deselectAll();
                        break;
                    }
                    break;
                case 1608503175:
                    if (id2.equals("headerExpand") && (params2 = atomAction.getParams()) != null && (str2 = params2.get("id")) != null) {
                        expandHeader(str2);
                        break;
                    }
                    break;
            }
        }
    }

    public final void processComposerAction(@NotNull AtomAction.ComposerAction atomAction) {
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        String id2 = atomAction.getId();
        if (id2 != null) {
            switch (id2.hashCode()) {
                case -1395075727:
                    if (!id2.equals("applyFavoriteFilters")) {
                        return;
                    }
                    break;
                case 289847265:
                    if (id2.equals("changeCurrency")) {
                        changeCurrency(atomAction);
                        return;
                    }
                    return;
                case 864479799:
                    if (id2.equals("saveLocale")) {
                        saveLocale(atomAction);
                        return;
                    }
                    return;
                case 1794496613:
                    if (!id2.equals("applySearchFilters")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            executeApplyFilters(atomAction);
        }
    }

    public final void setModel$filter_widgets_prodGoogleAllVendorsRelease(@NotNull FilterValuesVO model, String currentUrl) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.model = model;
        this.currentUrl = currentUrl;
        this.filterValuesRepository.submitItems(model.getModels(), "");
        this.filterValuesRepository.putInitFilterState(FilterState.INSTANCE.createState$filter_widgets_prodGoogleAllVendorsRelease(model.getFilter()));
    }
}
