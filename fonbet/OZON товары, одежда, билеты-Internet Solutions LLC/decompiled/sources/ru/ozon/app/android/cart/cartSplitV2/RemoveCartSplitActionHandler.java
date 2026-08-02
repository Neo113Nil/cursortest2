package ru.ozon.app.android.cart.cartSplitV2;

import HY.b;
import Lm0.a;
import WZ.t;
import android.content.Intent;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.squareup.moshi.j;
import com.squareup.moshi.k;
import java.io.EOFException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.cart.feature.R$string;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.network.utils.UriExtKt;
import ru.ozon.app.android.uikit.dialog.AlertDialogFragment;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u0015\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/RemoveCartSplitActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "getTokenizedEvent", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)LWZ/t;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "RemoveTrackingInfo", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RemoveCartSplitActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final JsonParser jsonDeserializer;
    public static final int $stable = 8;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/RemoveCartSplitActionHandler$RemoveTrackingInfo;", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/Map;)V", "getTrackingInfo", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class RemoveTrackingInfo {
        public static final int $stable = 8;

        @NotNull
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public RemoveTrackingInfo(@NotNull Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
            this.trackingInfo = trackingInfo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RemoveTrackingInfo copy$default(RemoveTrackingInfo removeTrackingInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = removeTrackingInfo.trackingInfo;
            }
            return removeTrackingInfo.copy(map);
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> component1() {
            return this.trackingInfo;
        }

        @NotNull
        public final RemoveTrackingInfo copy(@NotNull Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
            return new RemoveTrackingInfo(trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RemoveTrackingInfo) && Intrinsics.d(this.trackingInfo, ((RemoveTrackingInfo) other).trackingInfo);
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            return this.trackingInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return b.b("RemoveTrackingInfo(trackingInfo=", ")", this.trackingInfo);
        }
    }

    public RemoveCartSplitActionHandler(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
        this.actionId = "removeCartSplit";
    }

    private final t getTokenizedEvent(AtomAction.Click action, CustomActionHandler.HandlerReferences handlerRefs) {
        Map<String, String> params = action.getParams();
        String str = params != null ? params.get("trackingInfo") : null;
        if (str != null) {
            try {
                return TrackingInfoMapperKt.toTokenizedEvent$default(((RemoveTrackingInfo) this.jsonDeserializer.fromJson(UriExtKt.base64Decode(str), RemoveTrackingInfo.class)).getTrackingInfo(), handlerRefs.getVoId(), null, 2, null);
            } catch (Exception e11) {
                if (!(e11 instanceof IllegalArgumentException) && !(e11 instanceof k) && !(e11 instanceof EOFException)) {
                    throw e11;
                }
                a.f17149a.e(e11, "Can't deserialize RemoveTrackingInfo. base64TrackingInfo = %s", str);
            }
        }
        return null;
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
            AtomAction.Click click = (AtomAction.Click) action;
            Map<String, String> params = click.getParams();
            String str = params != null ? params.get("warningMessage") : null;
            Map<String, String> params2 = click.getParams();
            String str2 = params2 != null ? params2.get("actionTitle") : null;
            Map<String, String> params3 = click.getParams();
            String str3 = params3 != null ? params3.get("widgetScrollId") : null;
            Map<String, String> params4 = click.getParams();
            String str4 = params4 != null ? params4.get("widgetOffsetScroll") : null;
            t tokenizedEvent = getTokenizedEvent(click, handlerRefs);
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
                if (str6 == null || !Boolean.parseBoolean(str6)) {
                    AlertDialogFragment newInstanceForFragmentResult = AlertDialogFragment.INSTANCE.newInstanceForFragmentResult(new AlertDialogFragment.Params(Integer.valueOf(R$string.delete_product_confirmation), str, null, null, R$string.delete, str2, Integer.valueOf(R$string.cancel), 0, 140, null), intent);
                    newInstanceForFragmentResult.setTargetFragment(handlerRefs.getRefs().getContainer().c(), 9021);
                    newInstanceForFragmentResult.show(handlerRefs.getRefs().getContainer().k(), (String) null);
                } else {
                    ComponentCallbacksC5392m b11 = Sh.a.b(handlerRefs);
                    if (b11 != null) {
                        b11.onActivityResult(9021, -1, intent);
                    }
                }
            }
        }
    }
}
