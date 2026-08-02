package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.push;

import H30.q;
import U50.a;
import U50.d;
import V.e;
import androidx.annotation.Keep;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import g30.InterfaceC6618a;
import h90.f;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class SetJwt implements a, d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f95620a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f95621b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S30.a f95622c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f95623d;

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/push/SetJwt$Jwt;", "", "jwt", "", "cert", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getJwt", "()Ljava/lang/String;", "getCert", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Jwt {
        private final String cert;
        private final String jwt;

        public Jwt(@i(name = "jwt") String str, String str2) {
            this.jwt = str;
            this.cert = str2;
        }

        public static /* synthetic */ Jwt copy$default(Jwt jwt, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = jwt.jwt;
            }
            if ((i11 & 2) != 0) {
                str2 = jwt.cert;
            }
            return jwt.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getJwt() {
            return this.jwt;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCert() {
            return this.cert;
        }

        @NotNull
        public final Jwt copy(@i(name = "jwt") String jwt, String cert) {
            return new Jwt(jwt, cert);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Jwt)) {
                return false;
            }
            Jwt jwt = (Jwt) other;
            return Intrinsics.d(this.jwt, jwt.jwt) && Intrinsics.d(this.cert, jwt.cert);
        }

        public final String getCert() {
            return this.cert;
        }

        public final String getJwt() {
            return this.jwt;
        }

        public int hashCode() {
            String str = this.jwt;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.cert;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return e.a("Jwt(jwt=", this.jwt, ", cert=", this.cert, ")");
        }
    }

    public SetJwt(@NotNull Moshi moshi, @NotNull f notificationInteractor, @NotNull S30.a applicationInfoDataSource, @NotNull InterfaceC6618a analyticInteractor) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(notificationInteractor, "notificationInteractor");
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        this.f95620a = moshi;
        this.f95621b = notificationInteractor;
        this.f95622c = applicationInfoDataSource;
        this.f95623d = analyticInteractor;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "set_jwt";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((U50.j) callback).invoke(handleSync(weakReference, parameterJson));
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        NativeResult.Success success;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        try {
            Jwt jwt = (Jwt) q.a(this.f95620a, parameterJson, Jwt.class);
            String jwt2 = jwt != null ? jwt.getJwt() : null;
            String cert = jwt != null ? jwt.getCert() : null;
            if (jwt2 == null || cert == null) {
                return new NativeResult.Error("Не найдено поле jwt или cert в json", null, 2, null);
            }
            this.f95621b.e(jwt2, cert);
            this.f95623d.H0(jwt2);
            NativeResult.Success.INSTANCE.getClass();
            success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
            return success;
        } catch (Exception e11) {
            return new NativeResult.Error("Ошиибка при установлении JWT токена " + e11, null, 2, null);
        }
    }
}
