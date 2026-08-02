package ru.ozon.app.android.storage.auth;

import DJ.c;
import Nc.C3669c;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qc.o;
import ru.ozon.app.android.limb.OzonIdStorageDependencies;
import ru.ozon.app.android.storage.auth.model.AuthToken;
import zb0.f;
import zb0.j;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\t0\t0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010 \u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/storage/auth/AuthTokenDataSourceImpl;", "Lru/ozon/app/android/storage/auth/AuthTokenDataSource;", "Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;", "ozonIdCookieEvents", "Landroid/content/Context;", "context", "<init>", "(Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;Landroid/content/Context;)V", "Lzb0/f;", "Lru/ozon/app/android/storage/auth/model/AuthToken;", "toAuthToken-pEAxoI8", "(Lzb0/f;)Ljava/lang/String;", "toAuthToken", "getInitialToken-AZpst64", "()Ljava/lang/String;", "getInitialToken", "LNc/c;", "kotlin.jvm.PlatformType", "tokenSubject", "LNc/c;", "Lru/ozon/app/android/limb/OzonIdStorageDependencies;", "ozonIdStorageDependencies$delegate", "LSc/j;", "getOzonIdStorageDependencies", "()Lru/ozon/app/android/limb/OzonIdStorageDependencies;", "ozonIdStorageDependencies", "_token", "Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getToken-AZpst64", "setToken-m67d3Pw", "(Ljava/lang/String;)V", "token", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthTokenDataSourceImpl implements AuthTokenDataSource {
    private String _token;

    /* renamed from: ozonIdStorageDependencies$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ozonIdStorageDependencies;

    @NotNull
    private final C3669c<AuthToken> tokenSubject;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzb0/f;", "Lkotlin/jvm/internal/EnhancedNullability;", "it", "Lru/ozon/app/android/storage/auth/model/AuthToken;", "kotlin.jvm.PlatformType", "invoke-lcHO9p8", "(Lzb0/f;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storage.auth.AuthTokenDataSourceImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<f, AuthToken> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AuthToken invoke(f fVar) {
            String m1011invokelcHO9p8 = m1011invokelcHO9p8(fVar);
            if (m1011invokelcHO9p8 != null) {
                return AuthToken.m1013boximpl(m1011invokelcHO9p8);
            }
            return null;
        }

        /* renamed from: invoke-lcHO9p8, reason: not valid java name */
        public final String m1011invokelcHO9p8(f it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return AuthTokenDataSourceImpl.this.m1009toAuthTokenpEAxoI8(it);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/storage/auth/model/AuthToken;", "kotlin.jvm.PlatformType", "invoke-n13mqFg", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storage.auth.AuthTokenDataSourceImpl$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<AuthToken, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AuthToken authToken) {
            AuthToken authToken2 = authToken;
            m1012invoken13mqFg(authToken2 != null ? authToken2.getAccessToken() : null);
            return Unit.f71690a;
        }

        /* renamed from: invoke-n13mqFg, reason: not valid java name */
        public final void m1012invoken13mqFg(String str) {
            AuthTokenDataSourceImpl.this.m1010setTokenm67d3Pw(str);
        }
    }

    public AuthTokenDataSourceImpl(@NotNull OzonIdCookieEvents ozonIdCookieEvents, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(ozonIdCookieEvents, "ozonIdCookieEvents");
        Intrinsics.checkNotNullParameter(context, "context");
        C3669c<AuthToken> d11 = C3669c.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.tokenSubject = d11;
        this.ozonIdStorageDependencies = k.b(new AuthTokenDataSourceImpl$ozonIdStorageDependencies$2(context));
        p<f> observable = ozonIdCookieEvents.getObservable();
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        observable.map(new o(anonymousClass1) { // from class: ru.ozon.app.android.storage.auth.AuthTokenDataSourceImpl$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(anonymousClass1, "function");
                this.function = anonymousClass1;
            }

            @Override // qc.o
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).doOnNext(new c(new AnonymousClass2(), 2)).subscribe(d11);
    }

    /* renamed from: getInitialToken-AZpst64, reason: not valid java name */
    private final String m1008getInitialTokenAZpst64() {
        String w11 = getOzonIdStorageDependencies().getOzonIdAppApi().w();
        if (w11 == null) {
            w11 = "";
        }
        return AuthToken.m1014constructorimpl(w11);
    }

    private final OzonIdStorageDependencies getOzonIdStorageDependencies() {
        return (OzonIdStorageDependencies) this.ozonIdStorageDependencies.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toAuthToken-pEAxoI8, reason: not valid java name */
    public final String m1009toAuthTokenpEAxoI8(f fVar) {
        j b11 = fVar.a().b();
        String a11 = b11 != null ? b11.a() : null;
        if (a11 == null) {
            a11 = "";
        }
        return AuthToken.m1014constructorimpl(a11);
    }

    @Override // ru.ozon.app.android.storage.auth.AuthTokenDataSource
    @NotNull
    /* renamed from: getToken-AZpst64 */
    public String mo1006getTokenAZpst64() {
        String str = this._token;
        return str == null ? m1008getInitialTokenAZpst64() : str;
    }

    /* renamed from: setToken-m67d3Pw, reason: not valid java name */
    public void m1010setTokenm67d3Pw(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._token = value;
    }
}
