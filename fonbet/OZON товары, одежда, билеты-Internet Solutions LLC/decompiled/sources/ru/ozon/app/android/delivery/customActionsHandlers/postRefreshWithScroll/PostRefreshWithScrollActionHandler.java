package ru.ozon.app.android.delivery.customActionsHandlers.postRefreshWithScroll;

import A00.a;
import He.b;
import Sc.o;
import Sc.s;
import Wc.a;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.D;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel;
import ru.ozon.app.android.delivery.customActionsHandlers.postRefreshWithScroll.ScrollType;
import ru.ozon.uni.atoms.af.AtomAction;
import v10.C10183a;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 *2\u00020\u0001:\u0001*B\u0015\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000f\u001a\u00020\u00072\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001e\u001a\u00020\u001d*\u00020\u001c2\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010 \u001a\u00020\u001d*\u00020\u001c2\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b \u0010\u001fJ\u001c\u0010!\u001a\u00020\u000b*\u00020\u001c2\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b!\u0010\u001fJ\u001f\u0010#\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010$R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010%R\u001a\u0010&\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/postRefreshWithScroll/PostRefreshWithScrollActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "", "doRefresh", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Lru/ozon/app/android/delivery/customActionsHandlers/postRefreshWithScroll/ScrollType;", "refs", "", "", "params", "LA00/a$C;", "getScrollEvent", "(Lru/ozon/app/android/delivery/customActionsHandlers/postRefreshWithScroll/ScrollType;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Ljava/util/Map;)LA00/a$C;", "LA00/a$C$d;", "resolveScrollEvent", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Ljava/util/Map;)LA00/a$C$d;", "Landroidx/recyclerview/widget/RecyclerView;", "getComposerRV", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "", "doAsyncRefreshIfNeed", "(Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;Lru/ozon/uni/atoms/af/AtomAction$Click;Lkotlin/coroutines/d;)Ljava/lang/Object;", "isAsyncCartEnabled", "doAsyncRefresh", "Lru/ozon/uni/atoms/af/AtomAction;", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PostRefreshWithScrollActionHandler extends CustomActionHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actionId;

    @NotNull
    private final JsonParser jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/postRefreshWithScroll/PostRefreshWithScrollActionHandler$Companion;", "", "<init>", "()V", "PARAM_POST_REFRESH_BODY", "", "PARAM_SCROLL_TYPE", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScrollType.values().length];
            try {
                iArr[ScrollType.VIEW_PORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScrollType.ANCHOR_ELSE_VIEW_PORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScrollType.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScrollType.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PostRefreshWithScrollActionHandler(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
        this.actionId = "postRefreshWithScroll";
    }

    private final Object doAsyncRefresh(AsyncCartViewModel asyncCartViewModel, AtomAction.Click click, d<? super Unit> dVar) {
        Object f7 = C10727i.f(C10720e0.a(), new PostRefreshWithScrollActionHandler$doAsyncRefresh$2(click, asyncCartViewModel, this, null), dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r2.doAsyncRefresh(r6, r7, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doAsyncRefreshIfNeed(AsyncCartViewModel asyncCartViewModel, AtomAction.Click click, d<? super Boolean> dVar) {
        PostRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1 postRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1;
        Object obj;
        int i11;
        PostRefreshWithScrollActionHandler postRefreshWithScrollActionHandler;
        if (dVar instanceof PostRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1) {
            postRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1 = (PostRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1) dVar;
            int i12 = postRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                postRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = postRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = postRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    postRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1.L$0 = this;
                    postRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1.L$1 = asyncCartViewModel;
                    postRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1.L$2 = click;
                    postRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1.label = 1;
                    obj = isAsyncCartEnabled(asyncCartViewModel, click, postRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1);
                    if (obj != aVar) {
                        postRefreshWithScrollActionHandler = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Boolean.TRUE;
                }
                click = (AtomAction.Click) postRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1.L$2;
                asyncCartViewModel = (AsyncCartViewModel) postRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1.L$1;
                postRefreshWithScrollActionHandler = (PostRefreshWithScrollActionHandler) postRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1.L$0;
                s.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                postRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1.L$0 = null;
                postRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1.L$1 = null;
                postRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1.L$2 = null;
                postRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1.label = 2;
            }
        }
        postRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1 = new PostRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1(this, dVar);
        obj = postRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = postRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1.label;
        if (i11 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doRefresh(CustomActionHandler.HandlerReferences handlerRefs, AtomAction.Click action) {
        ScrollType.Companion companion = ScrollType.INSTANCE;
        Map<String, String> params = action.getParams();
        a.C scrollEvent = getScrollEvent(companion.mapToScrollType(params != null ? params.get("scrollType") : null), handlerRefs, action.getParams());
        D a11 = K.a(handlerRefs.getRefs().getContainer().f());
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, b.f10879b, null, new PostRefreshWithScrollActionHandler$doRefresh$1(action, handlerRefs, scrollEvent, this, null), 2);
    }

    private final RecyclerView getComposerRV(CustomActionHandler.HandlerReferences handlerReferences) {
        View view;
        ComponentCallbacksC5392m b11 = Sh.a.b(handlerReferences);
        if (b11 == null || (view = b11.getView()) == null) {
            return null;
        }
        return C10183a.j(view);
    }

    private final a.C getScrollEvent(ScrollType scrollType, CustomActionHandler.HandlerReferences handlerReferences, Map<String, String> map) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[scrollType.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return resolveScrollEvent(handlerReferences, map);
        }
        if (i11 == 3) {
            return new a.C.b();
        }
        if (i11 == 4) {
            return null;
        }
        throw new o();
    }

    private final Object isAsyncCartEnabled(AsyncCartViewModel asyncCartViewModel, AtomAction.Click click, d<? super Boolean> dVar) {
        String str;
        if (!asyncCartViewModel.isEnabled()) {
            return Boolean.FALSE;
        }
        Map<String, String> params = click.getParams();
        return (params == null || (str = params.get("body")) == null) ? Boolean.FALSE : C10727i.f(C10720e0.a(), new PostRefreshWithScrollActionHandler$isAsyncCartEnabled$2(this, str, null), dVar);
    }

    private final a.C.d resolveScrollEvent(CustomActionHandler.HandlerReferences refs, Map<String, String> params) {
        String str;
        Integer w02;
        String str2;
        Integer w03;
        if (params == null || (str = params.get("widgetScrollId")) == null || (w02 = h.w0(str)) == null) {
            RecyclerView composerRV = getComposerRV(refs);
            if (composerRV != null) {
                return M10.d.a(composerRV);
            }
            return null;
        }
        int intValue = w02.intValue();
        if (intValue == -1 || (str2 = params.get("widgetOffsetScroll")) == null || (w03 = h.w0(str2)) == null) {
            return null;
        }
        return new a.C.d(intValue, w03.intValue(), 28, false);
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.Click) {
            AsyncCartViewModel asyncCartViewModel = ((CartServiceApi) handlerRefs.getRefs().getComposerWidgetComponentStorage().getComponent(CartServiceApi.class)).getAsyncCartViewModelProvider().get(handlerRefs.getRefs());
            D a11 = K.a(handlerRefs.getRefs().getContainer().f());
            C10720e0 c10720e0 = C10720e0.f105451a;
            C10727i.c(a11, De.s.f6650a.x(), null, new PostRefreshWithScrollActionHandler$processAction$1(this, asyncCartViewModel, action, handlerRefs, null), 2);
        }
    }
}
