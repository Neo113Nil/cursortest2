package ru.ozon.app.android.pdp.widgets.sellerV7.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ge.n;
import Sc.o;
import Sc.s;
import Wc.a;
import Ye.b;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import gk0.q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.ui.configurators.pdp.seller.SellerV7VO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.sellerV7.core.SellerV7HeaderViewMapper;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00140(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV7/presentation/SellerV7HeaderBinder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/BaseWidgetPlaceholderBinder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO;", "Landroid/widget/LinearLayout;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "Lru/ozon/composer/ui/widget/k;", "viewHolderOwner", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "sellerFavoriteService", "<init>", "(Landroid/widget/LinearLayout;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;)V", "Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerBadge;", "badgeVO", "", "bindBadge", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerBadge;)V", "item", "Ll20/d;", "info", "", "payload", "Lkotlin/Function0;", "onFinish", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO;Ll20/d;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "Lru/ozon/composer/ui/widget/k;", "getViewHolderOwner", "()Lru/ozon/composer/ui/widget/k;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerV7HeaderBinder extends BaseWidgetPlaceholderBinder<SellerV7VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final BadgeView badgeView;

    @NotNull
    private final LinearLayout containerView;

    @NotNull
    private final TextAtomV2View titleTav;

    @NotNull
    private final k<SellerV7VO> viewHolderOwner;

    @NotNull
    private final WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "favorites", "", "", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.pdp.widgets.sellerV7.presentation.SellerV7HeaderBinder$2", f = "SellerV7HeaderBinder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.pdp.widgets.sellerV7.presentation.SellerV7HeaderBinder$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<Map<Long, ? extends Boolean>, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = SellerV7HeaderBinder.this.new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Map<Long, ? extends Boolean> map, d<? super Unit> dVar) {
            return invoke2((Map<Long, Boolean>) map, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            SellerV7VO.SellerBadge badge;
            Long l11;
            AtomActionDTO action;
            AtomAction atomAction;
            AtomActionDTO action2;
            AtomActionDTO copy$default;
            AtomAction atomAction2;
            AtomActionDTO action3;
            Map<String, String> params;
            long j11;
            Map<String, String> params2;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Map map = (Map) this.L$0;
            SellerV7VO boundData = SellerV7HeaderBinder.this.getViewHolderOwner().getBoundData();
            if (boundData == null) {
                return Unit.f71690a;
            }
            SellerV7VO.SellerHeader header = boundData.getHeader();
            if (header == null || (badge = header.getBadge()) == null) {
                return Unit.f71690a;
            }
            CommonControlSettings common = badge.getSubscribed().getCommon();
            AtomActionDTO action4 = common != null ? common.getAction() : null;
            String toLongOrDefault = (action4 == null || (params2 = action4.getParams()) == null) ? null : params2.get("sellerId");
            Intrinsics.f(map);
            if (toLongOrDefault != null) {
                byte[] bArr = b.f34900a;
                Intrinsics.checkNotNullParameter(toLongOrDefault, "$this$toLongOrDefault");
                try {
                    j11 = Long.parseLong(toLongOrDefault);
                } catch (NumberFormatException unused) {
                    j11 = 0;
                }
                l11 = new Long(j11);
            } else {
                l11 = null;
            }
            Boolean bool = (Boolean) map.get(l11);
            if (bool == null) {
                return Unit.f71690a;
            }
            boolean booleanValue = bool.booleanValue();
            if (badge.getIsSubscribed() != booleanValue) {
                CommonControlSettings common2 = badge.getUnsubscribed().getCommon();
                LinkedHashMap u11 = (common2 == null || (action3 = common2.getAction()) == null || (params = action3.getParams()) == null) ? null : U.u(params);
                if (u11 != null) {
                }
                CommonControlSettings common3 = badge.getSubscribed().getCommon();
                if (common3 == null || (action = common3.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, null)) == null) {
                    return Unit.f71690a;
                }
                CommonControlSettings common4 = badge.getUnsubscribed().getCommon();
                if (common4 == null || (action2 = common4.getAction()) == null || (copy$default = AtomActionDTO.copy$default(action2, null, null, null, u11, null, 23, null)) == null || (atomAction2 = AtomActionMapperKt.toAtomAction(copy$default, null)) == null) {
                    return Unit.f71690a;
                }
                Function1 function1 = SellerV7HeaderBinder.this.actionHandler;
                if (booleanValue) {
                    atomAction = atomAction2;
                }
                function1.invoke(atomAction);
            }
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Map<Long, Boolean> map, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(map, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    public SellerV7HeaderBinder(@NotNull LinearLayout containerView, @NotNull ComposerReferences refs, @NotNull Vg.d customActionHandlersStoreFactory, @NotNull WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, @NotNull k<SellerV7VO> viewHolderOwner, @NotNull SellerFavoriteService sellerFavoriteService) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(widgetImagePlaceholderAdapter, "widgetImagePlaceholderAdapter");
        Intrinsics.checkNotNullParameter(viewHolderOwner, "viewHolderOwner");
        Intrinsics.checkNotNullParameter(sellerFavoriteService, "sellerFavoriteService");
        this.containerView = containerView;
        this.widgetImagePlaceholderAdapter = widgetImagePlaceholderAdapter;
        this.viewHolderOwner = viewHolderOwner;
        this.actionHandler = new ActionHandler.Builder(refs, getViewHolderOwner()).customActionHandlers(new SellerV7HeaderBinder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.i(N.b(TextAtomV2View.class), containerView.getContext());
        if (textAtomV2View == null) {
            Context context = containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        }
        textAtomV2View.setId(R$id.sellerV7Title);
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
        this.titleTav = textAtomV2View;
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        BadgeView badgeView = new BadgeView(context2, null, 0, 0, 14, null);
        badgeView.setId(R$id.sellerV7Badge);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = Dimens.INSTANCE.getDP_6();
        badgeView.setLayoutParams(layoutParams);
        this.badgeView = badgeView;
        containerView.addView(textAtomV2View);
        containerView.addView(badgeView);
        final InterfaceC2395h a11 = n.a(sellerFavoriteService.favoritesChangeEvents());
        C2399j.C(new C2408n0(C5427n.a(C2399j.o(new InterfaceC2395h<Map<Long, ? extends Boolean>>() { // from class: ru.ozon.app.android.pdp.widgets.sellerV7.presentation.SellerV7HeaderBinder$special$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.pdp.widgets.sellerV7.presentation.SellerV7HeaderBinder$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.pdp.widgets.sellerV7.presentation.SellerV7HeaderBinder$special$$inlined$filter$1$2", f = "SellerV7HeaderBinder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.pdp.widgets.sellerV7.presentation.SellerV7HeaderBinder$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                Map map = (Map) obj;
                                Intrinsics.f(map);
                                if (!map.isEmpty()) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super Map<Long, ? extends Boolean>> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }), getViewHolderOwner().getLifecycle(), AbstractC5434v.b.STARTED), new AnonymousClass2(null)), K.a(getViewHolderOwner()));
    }

    private final void bindBadge(SellerV7VO.SellerBadge badgeVO) {
        BadgeHolderKt.bindOrGone(this.badgeView, badgeVO != null ? badgeVO.getIsSubscribed() ? badgeVO.getSubscribed() : badgeVO.getUnsubscribed() : null, this.actionHandler);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder
    public /* bridge */ /* synthetic */ void bind(SellerV7VO sellerV7VO, l20.d dVar, Object obj, Function0 function0) {
        bind2(sellerV7VO, dVar, obj, (Function0<Unit>) function0);
    }

    @NotNull
    public k<SellerV7VO> getViewHolderOwner() {
        return this.viewHolderOwner;
    }

    public void onVisibleAreaChanged(@NotNull jk0.q info) {
        String stateId;
        Intrinsics.checkNotNullParameter(info, "info");
        String json = getJson();
        if (json == null || (stateId = getStateId()) == null) {
            return;
        }
        Pair pair = new Pair(json, stateId);
        WidgetImagePlaceholderAdapter.cacheViewIfNeeded$default(this.widgetImagePlaceholderAdapter, this.containerView, "SellerV7HeaderCellWidget", (String) pair.b(), info, (String) pair.a(), null, 32, null);
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull SellerV7VO item, l20.d info, Object payload, Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind((SellerV7HeaderBinder) item, info, payload, onFinish);
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        if (Intrinsics.d(payload, Unit.f71690a) || payload == null) {
            TextAtomV2View textAtomV2View = this.titleTav;
            SellerV7VO.SellerHeader header = item.getHeader();
            TextHolderKt.bindOrGone(textAtomV2View, header != null ? header.getTitle() : null, this.actionHandler);
            SellerV7VO.SellerHeader header2 = item.getHeader();
            bindBadge(header2 != null ? header2.getBadge() : null);
        }
        List list = payload instanceof List ? (List) payload : null;
        if (list != null) {
            ArrayList<SellerV7HeaderViewMapper.SellerV7HeaderPayload> arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof SellerV7HeaderViewMapper.SellerV7HeaderPayload) {
                    arrayList.add(obj);
                }
            }
            for (SellerV7HeaderViewMapper.SellerV7HeaderPayload sellerV7HeaderPayload : arrayList) {
                if (Intrinsics.d(sellerV7HeaderPayload, SellerV7HeaderViewMapper.SellerV7HeaderPayload.BadgePayload.INSTANCE)) {
                    SellerV7VO.SellerHeader header3 = item.getHeader();
                    bindBadge(header3 != null ? header3.getBadge() : null);
                } else {
                    if (!Intrinsics.d(sellerV7HeaderPayload, SellerV7HeaderViewMapper.SellerV7HeaderPayload.TitlePayload.INSTANCE)) {
                        throw new o();
                    }
                    TextAtomV2View textAtomV2View2 = this.titleTav;
                    SellerV7VO.SellerHeader header4 = item.getHeader();
                    TextHolderKt.bindOrGone(textAtomV2View2, header4 != null ? header4.getTitle() : null, this.actionHandler);
                }
            }
        }
        if (onFinish != null) {
            onFinish.invoke();
        }
    }
}
