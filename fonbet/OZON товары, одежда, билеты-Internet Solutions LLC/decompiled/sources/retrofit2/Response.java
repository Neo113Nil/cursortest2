package retrofit2;

import We.F;
import We.G;
import We.L;
import We.M;
import We.z;
import androidx.recyclerview.widget.m;
import java.util.Objects;
import retrofit2.OkHttpCall;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;

/* loaded from: classes6.dex */
public final class Response<T> {
    private final T body;
    private final M errorBody;
    private final L rawResponse;

    private Response(L l11, T t2, M m11) {
        this.rawResponse = l11;
        this.body = t2;
        this.errorBody = m11;
    }

    public static <T> Response<T> error(int i11, M m11) {
        Objects.requireNonNull(m11, "body == null");
        if (i11 < 400) {
            throw new IllegalArgumentException(Ej.b.a(i11, "code < 400: "));
        }
        L.a aVar = new L.a();
        aVar.b(new OkHttpCall.NoContentResponseBody(m11.contentType(), m11.contentLength()));
        aVar.f(i11);
        aVar.l("Response.error()");
        aVar.o(F.HTTP_1_1);
        G.a aVar2 = new G.a();
        aVar2.k("http://localhost/");
        aVar.r(aVar2.b());
        return error(m11, aVar.c());
    }

    public static <T> Response<T> success(T t2) {
        L.a aVar = new L.a();
        aVar.f(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
        aVar.l(DiscountCodeResponse.RESULT_OK);
        aVar.o(F.HTTP_1_1);
        G.a aVar2 = new G.a();
        aVar2.k("http://localhost/");
        aVar.r(aVar2.b());
        return success(t2, aVar.c());
    }

    public T body() {
        return this.body;
    }

    public int code() {
        return this.rawResponse.m();
    }

    public M errorBody() {
        return this.errorBody;
    }

    public z headers() {
        return this.rawResponse.r();
    }

    public boolean isSuccessful() {
        return this.rawResponse.v();
    }

    public String message() {
        return this.rawResponse.w();
    }

    public L raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    public static <T> Response<T> success(int i11, T t2) {
        if (i11 >= 200 && i11 < 300) {
            L.a aVar = new L.a();
            aVar.f(i11);
            aVar.l("Response.success()");
            aVar.o(F.HTTP_1_1);
            G.a aVar2 = new G.a();
            aVar2.k("http://localhost/");
            aVar.r(aVar2.b());
            return success(t2, aVar.c());
        }
        throw new IllegalArgumentException(Ej.b.a(i11, "code < 200 or >= 300: "));
    }

    public static <T> Response<T> error(M m11, L l11) {
        Objects.requireNonNull(m11, "body == null");
        Objects.requireNonNull(l11, "rawResponse == null");
        if (!l11.v()) {
            return new Response<>(l11, null, m11);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> Response<T> success(T t2, z zVar) {
        Objects.requireNonNull(zVar, "headers == null");
        L.a aVar = new L.a();
        aVar.f(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
        aVar.l(DiscountCodeResponse.RESULT_OK);
        aVar.o(F.HTTP_1_1);
        aVar.j(zVar);
        G.a aVar2 = new G.a();
        aVar2.k("http://localhost/");
        aVar.r(aVar2.b());
        return success(t2, aVar.c());
    }

    public static <T> Response<T> success(T t2, L l11) {
        Objects.requireNonNull(l11, "rawResponse == null");
        if (l11.v()) {
            return new Response<>(l11, t2, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }
}
