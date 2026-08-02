package ru.ozon.app.android.checkoutcomposer.common.configurator;

import A00.a;
import L00.i;
import QZ.g;
import android.location.Location;
import android.net.Uri;
import i10.h;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.mapcommon.mapcommon.LastLocationRepository;
import ru.ozon.app.android.network.serialize.JsonSerializer;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000b*\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u000e*\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/configurator/CheckoutRequestInterceptor;", "LQZ/g;", "Lru/ozon/app/android/mapcommon/mapcommon/LastLocationRepository;", "lastLocationRepository", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "jsonSerializer", "<init>", "(Lru/ozon/app/android/mapcommon/mapcommon/LastLocationRepository;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/network/serialize/JsonSerializer;)V", "Li10/h;", "", "id", "", "addPvzTipId", "(Li10/h;Ljava/lang/String;)V", "extractPostBodyToParams", "(Li10/h;)Li10/h;", "addLocationParams", "(Li10/h;)V", "state", "LA00/a;", "trigger", "interceptState", "(Li10/h;LA00/a;)Li10/h;", "LL00/g;", "request", "LL00/i;", "extras", "interceptRequest", "(Li10/h;LL00/g;LL00/i;)LL00/g;", "onInit", "Lru/ozon/app/android/mapcommon/mapcommon/LastLocationRepository;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckoutRequestInterceptor implements g {

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final JsonSerializer jsonSerializer;

    @NotNull
    private final LastLocationRepository lastLocationRepository;
    public static final int $stable = 8;

    public CheckoutRequestInterceptor(@NotNull LastLocationRepository lastLocationRepository, @NotNull JsonParser jsonDeserializer, @NotNull JsonSerializer jsonSerializer) {
        Intrinsics.checkNotNullParameter(lastLocationRepository, "lastLocationRepository");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        this.lastLocationRepository = lastLocationRepository;
        this.jsonDeserializer = jsonDeserializer;
        this.jsonSerializer = jsonSerializer;
    }

    private final void addLocationParams(h hVar) {
        Location lastLocation = this.lastLocationRepository.getLastLocation();
        if (lastLocation == null) {
            return;
        }
        hVar.f().put("user_lat", Double.valueOf(lastLocation.getLatitude()));
        hVar.f().put("user_long", Double.valueOf(lastLocation.getLongitude()));
    }

    private final void addPvzTipId(h hVar, String str) {
        hVar.f().put("pvzTipID", str);
    }

    private final h extractPostBodyToParams(h hVar) {
        Map<String, Object> b11;
        Object obj;
        h.a b12;
        Map<String, Object> b13;
        h.a b14 = hVar.b();
        if (b14 != null && (b11 = b14.b()) != null && (obj = b11.get("postBody")) != null && (b12 = hVar.b()) != null && (b13 = b12.b()) != null) {
            LinkedHashMap u11 = U.u(b13);
            LinkedHashMap u12 = U.u((Map) this.jsonDeserializer.fromJson(obj.toString(), Map.class));
            Object obj2 = u12.get("items");
            if (obj2 != null) {
                u11.put("items", obj2);
                u12.remove("items");
                if (u12.isEmpty()) {
                    u11.remove("postBody");
                } else {
                    u11.put("postBody", this.jsonSerializer.toJson((JsonSerializer) u12, (Class<JsonSerializer>) Map.class));
                }
                h.a b15 = hVar.b();
                return h.a(hVar, null, null, null, b15 != null ? h.a.a(b15, u11) : null, null, 47);
            }
        }
        return hVar;
    }

    @Override // QZ.g
    @NotNull
    public L00.g interceptRequest(@NotNull h state, @NotNull L00.g request, @NotNull i extras) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(extras, "extras");
        addLocationParams(state);
        g.a.a(state, request, extras);
        return request;
    }

    @Override // QZ.g
    @NotNull
    public h interceptState(@NotNull h state, @NotNull a trigger) {
        String c11;
        Uri parse;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        h.c d11 = state.d();
        String str = null;
        h.c.a aVar = d11 instanceof h.c.a ? (h.c.a) d11 : null;
        if (aVar != null && (c11 = aVar.c()) != null && (parse = Uri.parse(c11)) != null) {
            str = parse.getQueryParameter("pvz_tip_id");
        }
        if (str != null) {
            addPvzTipId(state, str);
        }
        h extractPostBodyToParams = extractPostBodyToParams(state);
        g.a.b(extractPostBodyToParams, trigger);
        return extractPostBodyToParams;
    }

    @Override // QZ.g
    @NotNull
    public h onInit(@NotNull h state) {
        Intrinsics.checkNotNullParameter(state, "state");
        addLocationParams(state);
        Intrinsics.checkNotNullParameter(state, "state");
        return state;
    }
}
