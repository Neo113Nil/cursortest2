package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ge.f;
import Ge.n;
import He.b;
import Sc.r;
import Sc.s;
import WZ.l;
import WZ.t;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import h20.InterfaceC6786a;
import h3.C6788a;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.AddProductsWithTokenizedAnalytics;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.cart.common.models.events.ProductTokenizedCartAnalyticsEvent;
import ru.ozon.app.android.cart.common.models.events.TokenizedCartAnalyticsEvent;
import ru.ozon.app.android.cart.common.models.events.TokenizedCartType;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.AddToCartParams;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10720e0;
import xe.C10721f;
import xe.C10727i;
import xe.E0;
import xe.M;
import xe.Y;
import ze.C11115c;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0001QB#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0094\u0001\u0010$\u001a\u00020\f*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00152\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\f0\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001f\u001a\u00020\u00102\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u00192\b\b\u0002\u0010#\u001a\u00020\"H\u0082@¢\u0006\u0004\b$\u0010%J7\u0010'\u001a\u00020&*\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015H\u0002¢\u0006\u0004\b'\u0010(J%\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020)0\u0015*\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b*\u0010+J'\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0012*\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\f2\u0006\u00101\u001a\u00020\u0016H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\fH\u0016¢\u0006\u0004\b4\u0010\u000eJ\u0015\u00107\u001a\u00020\f2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b9\u00103J#\u0010;\u001a\u0004\u0018\u00010\u00132\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b;\u0010<Js\u0010=\u001a\u00020\f2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00152\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\f0\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001f\u001a\u00020\u0010¢\u0006\u0004\b=\u0010>J\u0097\u0001\u0010=\u001a\u00020\f2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010?\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00102\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00152\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\f0\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001f\u001a\u00020\u00102\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u00192\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b=\u0010@R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010AR\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010CR\u0018\u00101\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020I0L8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "repository", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;)V", "", "cancelAddToCart", "()V", "Lxe/M;", "", "widgetId", "", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/AddToCartParams$CartItem;", "products", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/Function0;", "onFailure", "additionalAction", "delay", "", "onSyncSuccess", "", "asyncEnabled", "addToCartInternal", "(Lxe/M;JLjava/util/List;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lru/ozon/uni/atoms/af/AtomAction;JLkotlin/jvm/functions/Function1;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/cart/common/models/AddProductsWithTokenizedAnalytics;", "toAddProductsParams", "(Ljava/util/List;JLjava/util/Map;)Lru/ozon/app/android/cart/common/models/AddProductsWithTokenizedAnalytics;", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "toCartItemsMap", "(Ljava/util/List;)Ljava/util/Map;", "LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/cart/common/models/events/ProductTokenizedCartAnalyticsEvent;", "toTokenizedAnalytics", "(Ljava/util/List;LWZ/t;)Ljava/util/List;", "asyncData", "asyncUpdateWidget", "(Ljava/lang/String;)V", "onCleared", "LWZ/l;", "tokenizedAnalytics", "attachAnalyticsHandler", "(LWZ/l;)V", "setAsyncData", "params", "getFirstProductFromParams", "(Ljava/util/Map;)Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/AddToCartParams$CartItem;", "addToCart", "(Ljava/util/Map;JLjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lru/ozon/uni/atoms/af/AtomAction;J)V", "quantity", "(Ljava/util/Map;IJLjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lru/ozon/uni/atoms/af/AtomAction;JLkotlin/jvm/functions/Function1;Z)V", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Ljava/lang/String;", "Lxe/B0;", "addToCartJob", "Lxe/B0;", "Lze/h;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalUpdateResponse;", "_widgetUpdate", "Lze/h;", "LAe/h;", "widgetUpdate", "LAe/h;", "getWidgetUpdate", "()LAe/h;", "Companion", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StickyTotalViewModel extends w0 implements InterfaceC6786a {

    @NotNull
    private final h<StickyTotalUpdateResponse> _widgetUpdate;
    private B0 addToCartJob;
    private String asyncData;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final ComposerAsyncWidgetRepository repository;

    @NotNull
    private final InterfaceC2395h<StickyTotalUpdateResponse> widgetUpdate;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/common/domain/CartState;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalViewModel$1", f = "StickyTotalViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<CartState, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return StickyTotalViewModel.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            String str = StickyTotalViewModel.this.asyncData;
            if (str != null) {
                StickyTotalViewModel.this.asyncUpdateWidget(str);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CartState cartState, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(cartState, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalViewModel$Companion;", "", "<init>", "()V", "ADD_TO_CART_PARAMS_KEY", "", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public StickyTotalViewModel(@NotNull CartService cartService, @NotNull JsonParser jsonDeserializer, @NotNull ComposerAsyncWidgetRepository repository) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.cartService = cartService;
        this.jsonDeserializer = jsonDeserializer;
        this.repository = repository;
        C11115c a11 = k.a(-2, 6, null);
        this._widgetUpdate = a11;
        this.widgetUpdate = C2399j.H(a11);
        C2399j.C(new C2408n0(n.a(CartService.DefaultImpls.observeCartStateChanged$default(cartService, null, 1, null)), new AnonymousClass1(null)), x0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|(1:(1:(1:(6:11|(1:13)|14|(1:16)|17|18)(2:20|21))(14:22|23|24|25|26|27|28|29|30|(5:32|(1:34)|35|(2:38|(0))|37)|14|(0)|17|18))(4:46|47|48|49))(7:67|(4:70|(3:76|77|78)(3:72|73|74)|75|68)|79|80|81|82|(18:84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|(1:101)|37)(8:118|52|53|(2:56|54)|57|58|(11:60|26|27|28|29|30|(0)|14|(0)|17|18)|37))|50|51|52|53|(1:54)|57|58|(0)|37))|121|6|(0)(0)|50|51|52|53|(1:54)|57|58|(0)|37|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c5 A[Catch: all -> 0x01f2, LOOP:0: B:54:0x01bf->B:56:0x01c5, LOOP_END, TryCatch #1 {all -> 0x01f2, blocks: (B:53:0x01aa, B:54:0x01bf, B:56:0x01c5, B:58:0x01f4), top: B:52:0x01aa }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addToCartInternal(M m11, long j11, List<AddToCartParams.CartItem> list, Map<String, TokenizedTrackingInfo> map, Function1<? super AtomAction, Unit> function1, Function0<Unit> function0, AtomAction atomAction, long j12, Function1<? super Integer, Unit> function12, boolean z11, d<? super Unit> dVar) {
        StickyTotalViewModel$addToCartInternal$1 stickyTotalViewModel$addToCartInternal$1;
        a aVar;
        int i11;
        K k11;
        Function1<? super AtomAction, Unit> function13;
        Function0<Unit> function02;
        AtomAction atomAction2;
        long j13;
        boolean z12;
        Function1<? super Integer, Unit> function14;
        boolean z13;
        Map<String, TokenizedTrackingInfo> map2;
        List list2;
        StickyTotalViewModel stickyTotalViewModel;
        M m12;
        long j14;
        Map<String, TokenizedTrackingInfo> map3;
        K k12;
        Function1<? super AtomAction, Unit> function15;
        AtomAction atomAction3;
        Function1<? super Integer, Unit> function16;
        Object obj;
        StickyTotalViewModel stickyTotalViewModel2;
        boolean z14;
        ArrayList arrayList;
        Iterator it;
        K k13;
        AtomAction atomAction4;
        long j15;
        Object a11;
        Function0<Unit> function03;
        AtomAction atomAction5;
        Function1<? super AtomAction, Unit> function17;
        Throwable b11;
        if (dVar instanceof StickyTotalViewModel$addToCartInternal$1) {
            stickyTotalViewModel$addToCartInternal$1 = (StickyTotalViewModel$addToCartInternal$1) dVar;
            int i12 = stickyTotalViewModel$addToCartInternal$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                stickyTotalViewModel$addToCartInternal$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = stickyTotalViewModel$addToCartInternal$1.result;
                aVar = a.COROUTINE_SUSPENDED;
                i11 = stickyTotalViewModel$addToCartInternal$1.label;
                if (i11 != 0) {
                    s.b(obj2);
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list) {
                        if (((AddToCartParams.CartItem) obj3).getQuantity() <= 0) {
                            arrayList2.add(obj3);
                        } else {
                            arrayList3.add(obj3);
                        }
                    }
                    Pair pair = new Pair(arrayList2, arrayList3);
                    List list3 = (List) pair.a();
                    List<AddToCartParams.CartItem> list4 = (List) pair.b();
                    k11 = new K();
                    try {
                        r.Companion companion = r.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        function13 = function1;
                    }
                    if (list4.isEmpty()) {
                        function13 = function1;
                        function02 = function0;
                        atomAction2 = atomAction;
                        j13 = j12;
                        map2 = map;
                        z13 = z11;
                        list2 = list3;
                        stickyTotalViewModel = this;
                        function14 = function12;
                        m12 = m11;
                        j14 = j11;
                        List list5 = list2;
                        long j16 = j14;
                        arrayList = new ArrayList(C7714v.z(list5, 10));
                        it = list5.iterator();
                        while (it.hasNext()) {
                            StickyTotalViewModel stickyTotalViewModel3 = stickyTotalViewModel;
                            arrayList.add(C10727i.a(m12, null, null, new StickyTotalViewModel$addToCartInternal$4$1$1(stickyTotalViewModel3, (AddToCartParams.CartItem) it.next(), map2, j16, null), 3));
                            it = it;
                            stickyTotalViewModel = stickyTotalViewModel3;
                            map2 = map2;
                        }
                        stickyTotalViewModel$addToCartInternal$1.L$0 = function13;
                        stickyTotalViewModel$addToCartInternal$1.L$1 = function02;
                        stickyTotalViewModel$addToCartInternal$1.L$2 = atomAction2;
                        stickyTotalViewModel$addToCartInternal$1.L$3 = function14;
                        stickyTotalViewModel$addToCartInternal$1.L$4 = k11;
                        stickyTotalViewModel$addToCartInternal$1.L$5 = null;
                        stickyTotalViewModel$addToCartInternal$1.L$6 = null;
                        stickyTotalViewModel$addToCartInternal$1.L$7 = null;
                        stickyTotalViewModel$addToCartInternal$1.L$8 = null;
                        stickyTotalViewModel$addToCartInternal$1.L$9 = null;
                        stickyTotalViewModel$addToCartInternal$1.J$0 = j13;
                        stickyTotalViewModel$addToCartInternal$1.Z$0 = z13;
                        stickyTotalViewModel$addToCartInternal$1.label = 2;
                        if (C10721f.a(arrayList, stickyTotalViewModel$addToCartInternal$1) != aVar) {
                            k13 = k11;
                            atomAction4 = atomAction2;
                            j15 = j13;
                            Integer num = new Integer(k13.f71785a);
                            r.Companion companion2 = r.INSTANCE;
                            a11 = num;
                            function03 = function02;
                            if (!(a11 instanceof r.b)) {
                            }
                            b11 = r.b(a11);
                            if (b11 != null) {
                            }
                            return Unit.f71690a;
                        }
                        return aVar;
                    }
                    y<CartAddItemDTO> addMultipleProductsWithCustomAnalytics = this.cartService.addMultipleProductsWithCustomAnalytics(toAddProductsParams(list4, j11, map));
                    stickyTotalViewModel$addToCartInternal$1.L$0 = this;
                    stickyTotalViewModel$addToCartInternal$1.L$1 = map;
                    function13 = function1;
                    try {
                        stickyTotalViewModel$addToCartInternal$1.L$2 = function13;
                        function02 = function0;
                        try {
                            stickyTotalViewModel$addToCartInternal$1.L$3 = function02;
                            atomAction2 = atomAction;
                            try {
                                stickyTotalViewModel$addToCartInternal$1.L$4 = atomAction2;
                                stickyTotalViewModel$addToCartInternal$1.L$5 = function12;
                                stickyTotalViewModel$addToCartInternal$1.L$6 = list3;
                                stickyTotalViewModel$addToCartInternal$1.L$7 = k11;
                                stickyTotalViewModel$addToCartInternal$1.L$8 = m11;
                                stickyTotalViewModel$addToCartInternal$1.L$9 = k11;
                                stickyTotalViewModel$addToCartInternal$1.J$0 = j11;
                                j13 = j12;
                            } catch (Throwable th3) {
                                th = th3;
                                j13 = j12;
                                z12 = z11;
                                function14 = function12;
                                z13 = z12;
                                r.Companion companion3 = r.INSTANCE;
                                a11 = s.a(th);
                                atomAction4 = atomAction2;
                                j15 = j13;
                                function03 = function02;
                                if (!(a11 instanceof r.b)) {
                                }
                                b11 = r.b(a11);
                                if (b11 != null) {
                                }
                                return Unit.f71690a;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            atomAction2 = atomAction;
                            j13 = j12;
                            z12 = z11;
                            function14 = function12;
                            z13 = z12;
                            r.Companion companion32 = r.INSTANCE;
                            a11 = s.a(th);
                            atomAction4 = atomAction2;
                            j15 = j13;
                            function03 = function02;
                            if (!(a11 instanceof r.b)) {
                            }
                            b11 = r.b(a11);
                            if (b11 != null) {
                            }
                            return Unit.f71690a;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        function02 = function0;
                        atomAction2 = atomAction;
                        j13 = j12;
                        z12 = z11;
                        function14 = function12;
                        z13 = z12;
                        r.Companion companion322 = r.INSTANCE;
                        a11 = s.a(th);
                        atomAction4 = atomAction2;
                        j15 = j13;
                        function03 = function02;
                        if (!(a11 instanceof r.b)) {
                        }
                        b11 = r.b(a11);
                        if (b11 != null) {
                        }
                        return Unit.f71690a;
                    }
                    try {
                        stickyTotalViewModel$addToCartInternal$1.J$1 = j13;
                        z12 = z11;
                        try {
                            stickyTotalViewModel$addToCartInternal$1.Z$0 = z12;
                            stickyTotalViewModel$addToCartInternal$1.label = 1;
                            Object b12 = f.b(addMultipleProductsWithCustomAnalytics, stickyTotalViewModel$addToCartInternal$1);
                            if (b12 != aVar) {
                                map3 = map;
                                k12 = k11;
                                function15 = function13;
                                atomAction3 = atomAction2;
                                list2 = list3;
                                function16 = function12;
                                obj = b12;
                                stickyTotalViewModel2 = this;
                                m12 = m11;
                                z14 = z12;
                                j14 = j11;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            function14 = function12;
                            z13 = z12;
                            r.Companion companion3222 = r.INSTANCE;
                            a11 = s.a(th);
                            atomAction4 = atomAction2;
                            j15 = j13;
                            function03 = function02;
                            if (!(a11 instanceof r.b)) {
                            }
                            b11 = r.b(a11);
                            if (b11 != null) {
                            }
                            return Unit.f71690a;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        z12 = z11;
                        function14 = function12;
                        z13 = z12;
                        r.Companion companion32222 = r.INSTANCE;
                        a11 = s.a(th);
                        atomAction4 = atomAction2;
                        j15 = j13;
                        function03 = function02;
                        if (!(a11 instanceof r.b)) {
                        }
                        b11 = r.b(a11);
                        if (b11 != null) {
                        }
                        return Unit.f71690a;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a11 = stickyTotalViewModel$addToCartInternal$1.L$3;
                        atomAction5 = (AtomAction) stickyTotalViewModel$addToCartInternal$1.L$2;
                        function03 = (Function0) stickyTotalViewModel$addToCartInternal$1.L$1;
                        function17 = (Function1) stickyTotalViewModel$addToCartInternal$1.L$0;
                        s.b(obj2);
                        if (atomAction5 != null) {
                            function17.invoke(atomAction5);
                        }
                        b11 = r.b(a11);
                        if (b11 != null) {
                            function03.invoke();
                            Lm0.a.f17149a.e(b11);
                        }
                        return Unit.f71690a;
                    }
                    boolean z15 = stickyTotalViewModel$addToCartInternal$1.Z$0;
                    j15 = stickyTotalViewModel$addToCartInternal$1.J$0;
                    k13 = (K) stickyTotalViewModel$addToCartInternal$1.L$4;
                    Function1<? super Integer, Unit> function18 = (Function1) stickyTotalViewModel$addToCartInternal$1.L$3;
                    atomAction4 = (AtomAction) stickyTotalViewModel$addToCartInternal$1.L$2;
                    Function0<Unit> function04 = (Function0) stickyTotalViewModel$addToCartInternal$1.L$1;
                    Function1<? super AtomAction, Unit> function19 = (Function1) stickyTotalViewModel$addToCartInternal$1.L$0;
                    try {
                        s.b(obj2);
                        z13 = z15;
                        function14 = function18;
                        function02 = function04;
                        function13 = function19;
                        try {
                            Integer num2 = new Integer(k13.f71785a);
                            r.Companion companion22 = r.INSTANCE;
                            a11 = num2;
                        } catch (Throwable th8) {
                            th = th8;
                            j13 = j15;
                            atomAction2 = atomAction4;
                            r.Companion companion322222 = r.INSTANCE;
                            a11 = s.a(th);
                            atomAction4 = atomAction2;
                            j15 = j13;
                            function03 = function02;
                            if (!(a11 instanceof r.b)) {
                            }
                            b11 = r.b(a11);
                            if (b11 != null) {
                            }
                            return Unit.f71690a;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        z13 = z15;
                        function14 = function18;
                        function02 = function04;
                        function13 = function19;
                        j13 = j15;
                        atomAction2 = atomAction4;
                        r.Companion companion3222222 = r.INSTANCE;
                        a11 = s.a(th);
                        atomAction4 = atomAction2;
                        j15 = j13;
                        function03 = function02;
                        if (!(a11 instanceof r.b)) {
                        }
                        b11 = r.b(a11);
                        if (b11 != null) {
                        }
                        return Unit.f71690a;
                    }
                    function03 = function02;
                    if (!(a11 instanceof r.b)) {
                        int intValue = ((Number) a11).intValue();
                        if (!z13) {
                            function14.invoke(new Integer(intValue));
                        }
                        stickyTotalViewModel$addToCartInternal$1.L$0 = function13;
                        stickyTotalViewModel$addToCartInternal$1.L$1 = function03;
                        stickyTotalViewModel$addToCartInternal$1.L$2 = atomAction4;
                        stickyTotalViewModel$addToCartInternal$1.L$3 = a11;
                        stickyTotalViewModel$addToCartInternal$1.L$4 = null;
                        stickyTotalViewModel$addToCartInternal$1.L$5 = null;
                        stickyTotalViewModel$addToCartInternal$1.L$6 = null;
                        stickyTotalViewModel$addToCartInternal$1.L$7 = null;
                        stickyTotalViewModel$addToCartInternal$1.L$8 = null;
                        stickyTotalViewModel$addToCartInternal$1.L$9 = null;
                        stickyTotalViewModel$addToCartInternal$1.label = 3;
                        if (Y.b(j15, stickyTotalViewModel$addToCartInternal$1) != aVar) {
                            atomAction5 = atomAction4;
                            function17 = function13;
                            if (atomAction5 != null) {
                            }
                        }
                        return aVar;
                    }
                    b11 = r.b(a11);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
                z14 = stickyTotalViewModel$addToCartInternal$1.Z$0;
                j13 = stickyTotalViewModel$addToCartInternal$1.J$1;
                j14 = stickyTotalViewModel$addToCartInternal$1.J$0;
                K k14 = (K) stickyTotalViewModel$addToCartInternal$1.L$9;
                m12 = (M) stickyTotalViewModel$addToCartInternal$1.L$8;
                K k15 = (K) stickyTotalViewModel$addToCartInternal$1.L$7;
                List list6 = (List) stickyTotalViewModel$addToCartInternal$1.L$6;
                function16 = (Function1) stickyTotalViewModel$addToCartInternal$1.L$5;
                atomAction3 = (AtomAction) stickyTotalViewModel$addToCartInternal$1.L$4;
                function02 = (Function0) stickyTotalViewModel$addToCartInternal$1.L$3;
                function15 = (Function1) stickyTotalViewModel$addToCartInternal$1.L$2;
                Map<String, TokenizedTrackingInfo> map4 = (Map) stickyTotalViewModel$addToCartInternal$1.L$1;
                StickyTotalViewModel stickyTotalViewModel4 = (StickyTotalViewModel) stickyTotalViewModel$addToCartInternal$1.L$0;
                try {
                    s.b(obj2);
                    k12 = k15;
                    list2 = list6;
                    k11 = k14;
                    obj = obj2;
                    stickyTotalViewModel2 = stickyTotalViewModel4;
                    map3 = map4;
                } catch (Throwable th10) {
                    th = th10;
                    z13 = z14;
                    function14 = function16;
                    atomAction2 = atomAction3;
                    function13 = function15;
                    r.Companion companion32222222 = r.INSTANCE;
                    a11 = s.a(th);
                    atomAction4 = atomAction2;
                    j15 = j13;
                    function03 = function02;
                    if (!(a11 instanceof r.b)) {
                    }
                    b11 = r.b(a11);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
                k11.f71785a = ((CartAddItemDTO) obj).getTotalCount();
                map2 = map3;
                stickyTotalViewModel = stickyTotalViewModel2;
                k11 = k12;
                z13 = z14;
                function14 = function16;
                atomAction2 = atomAction3;
                function13 = function15;
                List list52 = list2;
                long j162 = j14;
                arrayList = new ArrayList(C7714v.z(list52, 10));
                it = list52.iterator();
                while (it.hasNext()) {
                }
                stickyTotalViewModel$addToCartInternal$1.L$0 = function13;
                stickyTotalViewModel$addToCartInternal$1.L$1 = function02;
                stickyTotalViewModel$addToCartInternal$1.L$2 = atomAction2;
                stickyTotalViewModel$addToCartInternal$1.L$3 = function14;
                stickyTotalViewModel$addToCartInternal$1.L$4 = k11;
                stickyTotalViewModel$addToCartInternal$1.L$5 = null;
                stickyTotalViewModel$addToCartInternal$1.L$6 = null;
                stickyTotalViewModel$addToCartInternal$1.L$7 = null;
                stickyTotalViewModel$addToCartInternal$1.L$8 = null;
                stickyTotalViewModel$addToCartInternal$1.L$9 = null;
                stickyTotalViewModel$addToCartInternal$1.J$0 = j13;
                stickyTotalViewModel$addToCartInternal$1.Z$0 = z13;
                stickyTotalViewModel$addToCartInternal$1.label = 2;
                if (C10721f.a(arrayList, stickyTotalViewModel$addToCartInternal$1) != aVar) {
                }
                return aVar;
            }
        }
        stickyTotalViewModel$addToCartInternal$1 = new StickyTotalViewModel$addToCartInternal$1(this, dVar);
        Object obj22 = stickyTotalViewModel$addToCartInternal$1.result;
        aVar = a.COROUTINE_SUSPENDED;
        i11 = stickyTotalViewModel$addToCartInternal$1.label;
        if (i11 != 0) {
        }
        k11.f71785a = ((CartAddItemDTO) obj).getTotalCount();
        map2 = map3;
        stickyTotalViewModel = stickyTotalViewModel2;
        k11 = k12;
        z13 = z14;
        function14 = function16;
        atomAction2 = atomAction3;
        function13 = function15;
        List list522 = list2;
        long j1622 = j14;
        arrayList = new ArrayList(C7714v.z(list522, 10));
        it = list522.iterator();
        while (it.hasNext()) {
        }
        stickyTotalViewModel$addToCartInternal$1.L$0 = function13;
        stickyTotalViewModel$addToCartInternal$1.L$1 = function02;
        stickyTotalViewModel$addToCartInternal$1.L$2 = atomAction2;
        stickyTotalViewModel$addToCartInternal$1.L$3 = function14;
        stickyTotalViewModel$addToCartInternal$1.L$4 = k11;
        stickyTotalViewModel$addToCartInternal$1.L$5 = null;
        stickyTotalViewModel$addToCartInternal$1.L$6 = null;
        stickyTotalViewModel$addToCartInternal$1.L$7 = null;
        stickyTotalViewModel$addToCartInternal$1.L$8 = null;
        stickyTotalViewModel$addToCartInternal$1.L$9 = null;
        stickyTotalViewModel$addToCartInternal$1.J$0 = j13;
        stickyTotalViewModel$addToCartInternal$1.Z$0 = z13;
        stickyTotalViewModel$addToCartInternal$1.label = 2;
        if (C10721f.a(arrayList, stickyTotalViewModel$addToCartInternal$1) != aVar) {
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void asyncUpdateWidget(String asyncData) {
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, b.f10879b, null, new StickyTotalViewModel$asyncUpdateWidget$1(this, asyncData, null), 2);
    }

    private final void cancelAddToCart() {
        B0 b02 = this.addToCartJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.addToCartJob = null;
    }

    private final AddProductsWithTokenizedAnalytics toAddProductsParams(List<AddToCartParams.CartItem> list, long j11, Map<String, TokenizedTrackingInfo> map) {
        List<ProductTokenizedCartAnalyticsEvent> list2;
        t tokenizedEvent$default = map != null ? TrackingInfoMapperKt.toTokenizedEvent$default(map, Long.valueOf(j11), null, 2, null) : null;
        Map<Long, CartItemInfo> cartItemsMap = toCartItemsMap(list);
        if (tokenizedEvent$default == null || (list2 = toTokenizedAnalytics(list, tokenizedEvent$default)) == null) {
            list2 = kotlin.collections.K.f71697a;
        }
        return new AddProductsWithTokenizedAnalytics(cartItemsMap, list2, null, Long.valueOf(j11), null, 20, null);
    }

    private final Map<Long, CartItemInfo> toCartItemsMap(List<AddToCartParams.CartItem> list) {
        List<AddToCartParams.CartItem> list2 = list;
        int h11 = U.h(C7714v.z(list2, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (AddToCartParams.CartItem cartItem : list2) {
            Pair pair = new Pair(Long.valueOf(Long.parseLong(cartItem.getId())), new CartItemInfo(cartItem.getQuantity(), cartItem.getSelectedDeliverySchema(), null, null, null, null, 60, null));
            linkedHashMap.put(pair.e(), pair.f());
        }
        return linkedHashMap;
    }

    private final List<ProductTokenizedCartAnalyticsEvent> toTokenizedAnalytics(List<AddToCartParams.CartItem> list, t tVar) {
        List<AddToCartParams.CartItem> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (AddToCartParams.CartItem cartItem : list2) {
            arrayList.add(new ProductTokenizedCartAnalyticsEvent(Long.parseLong(cartItem.getId()), new TokenizedCartAnalyticsEvent(new TokenizedCartType.ChangeCartType(cartItem.getQuantity()), tVar)));
        }
        return arrayList;
    }

    public final void addToCart(@NotNull Map<String, String> params, long widgetId, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function0<Unit> onFailure, AtomAction additionalAction, long delay) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        cancelAddToCart();
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.addToCartJob = C10727i.c(a11, b.f10879b, null, new StickyTotalViewModel$addToCart$1(params, this, widgetId, trackingInfo, actionHandler, onFailure, additionalAction, delay, null), 2);
    }

    public final void attachAnalyticsHandler(@NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.cartService.attach(tokenizedAnalytics);
    }

    public final AddToCartParams.CartItem getFirstProductFromParams(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String str = params.get("postData");
        if (str == null) {
            return null;
        }
        return ((AddToCartParams) this.jsonDeserializer.fromJson(str, AddToCartParams.class)).getItems().get(0);
    }

    @NotNull
    public final InterfaceC2395h<StickyTotalUpdateResponse> getWidgetUpdate() {
        return this.widgetUpdate;
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
        E0.d(x0.a(this).getCoroutineContext());
    }

    public final void setAsyncData(String asyncData) {
        this.asyncData = asyncData;
    }

    public final void addToCart(@NotNull Map<String, String> params, int quantity, long widgetId, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function0<Unit> onFailure, AtomAction additionalAction, long delay, @NotNull Function1<? super Integer, Unit> onSyncSuccess, boolean asyncEnabled) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Intrinsics.checkNotNullParameter(onSyncSuccess, "onSyncSuccess");
        cancelAddToCart();
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.addToCartJob = C10727i.c(a11, b.f10879b, null, new StickyTotalViewModel$addToCart$2(this, params, quantity, widgetId, trackingInfo, actionHandler, onFailure, additionalAction, delay, onSyncSuccess, asyncEnabled, null), 2);
    }
}
