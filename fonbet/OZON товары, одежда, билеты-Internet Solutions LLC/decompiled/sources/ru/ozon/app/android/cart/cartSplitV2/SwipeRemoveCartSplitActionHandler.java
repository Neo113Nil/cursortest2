package ru.ozon.app.android.cart.cartSplitV2;

import Lm0.a;
import O7.h;
import Tg.b;
import Vg.f;
import WZ.t;
import android.content.Intent;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.squareup.moshi.D;
import com.squareup.moshi.k;
import java.io.EOFException;
import java.util.Map;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetComponent;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.extensions.SwipeAnalyticsExtKt;
import ru.ozon.app.android.cart.feature.R$string;
import ru.ozon.app.android.uikit.dialog.AlertDialogFragment;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0015\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/SwipeRemoveCartSplitActionHandler;", "LVg/f;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "Lru/ozon/composer/ui/widget/l;", "viewItem", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "getTokenizedEvent", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Lru/ozon/composer/ui/widget/l;)LWZ/t;", "LTg/b;", "LVg/f$a;", "widgetInfo", "Lk20/g;", "widgetComponentStorage", "", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwipeRemoveCartSplitActionHandler extends f {

    @NotNull
    private final String actionId;

    @NotNull
    private final JsonParser jsonDeserializer;
    public static final int $stable = 8;

    public SwipeRemoveCartSplitActionHandler(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
        this.actionId = "removeCartSplitSwipe";
    }

    private final t getTokenizedEvent(AtomAction.Click action, l viewItem) {
        String str;
        Map<String, String> params = action.getParams();
        if (params == null || (str = params.get("swipeTrackingInfo")) == null) {
            return null;
        }
        try {
            return h.k((Map) this.jsonDeserializer.fromJson(str, D.e(Map.class, String.class, TokenizedTrackingInfo.class)), Long.valueOf(viewItem.f()));
        } catch (Exception e11) {
            if (!(e11 instanceof IllegalArgumentException) && !(e11 instanceof k) && !(e11 instanceof com.squareup.moshi.l) && !(e11 instanceof EOFException)) {
                throw e11;
            }
            a.f17149a.e(e11, "Can't deserialize RemoveTrackingInfo. trackingInfo = %s", str);
            return null;
        }
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // Vg.f
    public void processWidgetAction(@NotNull b action, @NotNull f.a widgetInfo, @NotNull C7475g widgetComponentStorage) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        CartSplitV2ControlsWidgetComponent cartSplitV2ControlsWidgetComponent = (CartSplitV2ControlsWidgetComponent) widgetComponentStorage.getComponent(CartSplitV2ControlsWidgetComponent.class);
        if (action instanceof AtomAction.Click) {
            AtomAction.Click click = (AtomAction.Click) action;
            Map<String, String> params = click.getParams();
            String str = params != null ? params.get("warningMessage") : null;
            Map<String, String> params2 = click.getParams();
            String str2 = params2 != null ? params2.get("actionTitle") : null;
            Map<String, String> params3 = click.getParams();
            String str3 = params3 != null ? params3.get("widgetScrollId") : null;
            Map<String, String> params4 = click.getParams();
            String str4 = params4 != null ? params4.get("widgetOffsetScroll") : null;
            t tokenizedEvent = getTokenizedEvent(click, widgetInfo.c());
            Map<String, String> params5 = click.getParams();
            String str5 = params5 != null ? params5.get("body") : null;
            Map<String, String> params6 = click.getParams();
            String str6 = params6 != null ? params6.get("hideAlert") : null;
            String link = click.getLink();
            if (link != null) {
                Intent intent = new Intent();
                intent.putExtra("EXTRA_REMOVE_DEEPLINK", link);
                intent.putExtra("EXTRA_WIDGET_SCROLL_ID", str3 != null ? Integer.valueOf(Integer.parseInt(str3)) : null);
                intent.putExtra("EXTRA_WIDGET_SCROLL_OFFSET", str4);
                intent.putExtra("EXTRA_TOKENIZED_EVENT", tokenizedEvent);
                intent.putExtra("EXTRA_BODY_PARAMS", str5);
                intent.putExtra("EXTRA_REMOVE_BY_SWIPE_PARAMS", true);
                if (str6 == null || !Boolean.parseBoolean(str6)) {
                    SwipeAnalyticsExtKt.processEventsSwipePreRemove$default(cartSplitV2ControlsWidgetComponent.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
                    AlertDialogFragment newInstanceForFragmentResult = AlertDialogFragment.INSTANCE.newInstanceForFragmentResult(new AlertDialogFragment.Params(Integer.valueOf(R$string.delete_product_confirmation), str, null, null, R$string.delete, str2, Integer.valueOf(R$string.cancel), 0, 140, null), intent);
                    newInstanceForFragmentResult.setTargetFragment(widgetInfo.a().c(), 9021);
                    newInstanceForFragmentResult.show(widgetInfo.a().k(), (String) null);
                    return;
                }
                ComponentCallbacksC5392m c11 = widgetInfo.a().c();
                if (c11 != null) {
                    c11.onActivityResult(9021, -1, intent);
                }
            }
        }
    }
}
