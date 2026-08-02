package ru.ozon.app.android.fresh.cart.domain.actionHandlers;

import A00.a;
import He.b;
import M10.d;
import Sc.o;
import Sh.a;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.D;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.cart.domain.actionHandlers.ScrollType;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.di.CartTileComponent;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/cart/domain/actionHandlers/FreshPostRefreshWithScrollActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "<init>", "()V", "Lru/ozon/app/android/fresh/cart/domain/actionHandlers/ScrollType;", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "refs", "LA00/a$C;", "getScrollEvent", "(Lru/ozon/app/android/fresh/cart/domain/actionHandlers/ScrollType;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)LA00/a$C;", "Landroidx/recyclerview/widget/RecyclerView;", "getComposerRV", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "handlerRefs", "", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FreshPostRefreshWithScrollActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId = "postRefreshWithScroll";

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
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

    private final RecyclerView getComposerRV(CustomActionHandler.HandlerReferences handlerReferences) {
        View view;
        ComponentCallbacksC5392m b11 = a.b(handlerReferences);
        if (b11 == null || (view = b11.getView()) == null) {
            return null;
        }
        return ComposerViewExtensionKt.composerRecyclerViewOrNull(view);
    }

    private final a.C getScrollEvent(ScrollType scrollType, CustomActionHandler.HandlerReferences handlerReferences) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[scrollType.ordinal()];
        if (i11 == 1 || i11 == 2) {
            RecyclerView composerRV = getComposerRV(handlerReferences);
            if (composerRV != null) {
                return d.a(composerRV);
            }
            return null;
        }
        if (i11 == 3) {
            return new a.C.b();
        }
        if (i11 == 4) {
            return null;
        }
        throw new o();
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
            JsonParser jsonDeserializer = ((CartTileComponent) handlerRefs.getRefs().getWidgetComponent(CartTileComponent.class)).getJsonDeserializer();
            ScrollType.Companion companion = ScrollType.INSTANCE;
            Map<String, String> params = ((AtomAction.Click) action).getParams();
            a.C scrollEvent = getScrollEvent(companion.mapToScrollType(params != null ? params.get("scrollType") : null), handlerRefs);
            D a11 = K.a(handlerRefs.getRefs().getContainer().f());
            C10720e0 c10720e0 = C10720e0.f105451a;
            C10727i.c(a11, b.f10879b, null, new FreshPostRefreshWithScrollActionHandler$processAction$1(action, handlerRefs, scrollEvent, jsonDeserializer, null), 2);
        }
    }
}
