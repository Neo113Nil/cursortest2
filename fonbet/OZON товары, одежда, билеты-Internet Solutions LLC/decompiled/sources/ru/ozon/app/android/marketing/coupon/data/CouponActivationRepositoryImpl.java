package ru.ozon.app.android.marketing.coupon.data;

import Bc.m;
import Bc.o;
import Bc.r;
import Bc.t;
import Bc.v;
import DM.e;
import DM.f;
import DM.g;
import Fw.b;
import Mc.a;
import Sq.CallableC4012a;
import We.M;
import android.net.Uri;
import io.reactivex.C;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.marketing.coupon.domain.CouponResponse;
import ru.ozon.app.android.network.error.OzonError;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u0012J\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/marketing/coupon/data/CouponActivationRepositoryImpl;", "Lru/ozon/app/android/marketing/coupon/data/CouponActivationRepository;", "Lru/ozon/app/android/marketing/coupon/data/CouponApi;", "api", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/app/android/marketing/coupon/data/CouponApi;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/app/android/marketing/coupon/data/ApplyCouponResponse;", "it", "mapToDTO", "(Lru/ozon/app/android/marketing/coupon/data/ApplyCouponResponse;)Lru/ozon/app/android/marketing/coupon/data/ApplyCouponResponse;", "", "action", "Lio/reactivex/y;", "Lru/ozon/app/android/marketing/coupon/domain/CouponResponse;", "callApi", "(Ljava/lang/String;)Lio/reactivex/y;", "LWe/M;", "body", "Lru/ozon/app/android/marketing/coupon/domain/CouponResponse$Success;", "parseSuccessBody", "(LWe/M;)Lru/ozon/app/android/marketing/coupon/domain/CouponResponse$Success;", "Lru/ozon/app/android/marketing/coupon/domain/CouponResponse$Fail;", "parseErrorBody", "(LWe/M;)Lru/ozon/app/android/marketing/coupon/domain/CouponResponse$Fail;", "appendUrl", "(Ljava/lang/String;)Ljava/lang/String;", "coupon", "activateCode", "applyCoupon", "Lru/ozon/app/android/marketing/coupon/data/CouponApi;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Companion", "coupon_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CouponActivationRepositoryImpl implements CouponActivationRepository {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final CouponApi api;

    @NotNull
    private final JsonParser jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/coupon/data/CouponActivationRepositoryImpl$Companion;", "", "<init>", "()V", "COMPOSER_ACTION_API", "", "coupon_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CouponActivationRepositoryImpl(@NotNull CouponApi api, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.api = api;
        this.jsonDeserializer = jsonDeserializer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C activateCode$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ApplyCouponResponse activateCode$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ApplyCouponResponse) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String appendUrl(String action) {
        String uri = Uri.parse("composer-api.bx/_action/").buildUpon().appendEncodedPath(action).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C applyCoupon$lambda$3(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y<CouponResponse> callApi(String action) {
        r rVar = new r(this.api.applyCoupon(action).j(a.a()), new g(new CouponActivationRepositoryImpl$callApi$1(this), 3));
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CouponResponse callApi$lambda$4(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (CouponResponse) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ApplyCouponResponse mapToDTO(ApplyCouponResponse it) {
        if (it.getError() == null || !(!h.K(r0))) {
            return it;
        }
        throw new OzonError.NetworkError.ServerError(it.getError());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CouponResponse.Fail parseErrorBody(M body) {
        Object fromJson;
        Object fail = new CouponResponse.Fail(null);
        if (body != null && (fromJson = this.jsonDeserializer.fromJson(body.string(), (Class<Object>) CouponResponse.Fail.class)) != null) {
            fail = fromJson;
        }
        return (CouponResponse.Fail) fail;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CouponResponse.Success parseSuccessBody(M body) {
        Object fromJson;
        Object success = new CouponResponse.Success(null);
        if (body != null && (fromJson = this.jsonDeserializer.fromJson(body.string(), (Class<Object>) CouponResponse.Success.class)) != null) {
            success = fromJson;
        }
        return (CouponResponse.Success) success;
    }

    @Override // ru.ozon.app.android.marketing.coupon.data.CouponActivationRepository
    @NotNull
    public y<ApplyCouponResponse> activateCode(@NotNull String coupon) {
        Intrinsics.checkNotNullParameter(coupon, "coupon");
        y<ApplyCouponResponse> activateCode = this.api.activateCode(coupon);
        e eVar = new e(new CouponActivationRepositoryImpl$activateCode$1(this), 5);
        activateCode.getClass();
        t g10 = new r(new v(activateCode, eVar), new f(new CouponActivationRepositoryImpl$activateCode$2(this), 4)).j(a.b()).g(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(g10, "observeOn(...)");
        return g10;
    }

    @Override // ru.ozon.app.android.marketing.coupon.data.CouponActivationRepository
    @NotNull
    public y<CouponResponse> applyCoupon(@NotNull String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        m mVar = new m(new o(new CallableC4012a(2, this, action)), new b(new CouponActivationRepositoryImpl$applyCoupon$2(this), 7));
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }
}
