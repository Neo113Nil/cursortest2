package md;

import retrofit2.Response;

/* loaded from: classes4.dex */
public class c implements InterfaceC5581a {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f56497a;

    /* renamed from: b, reason: collision with root package name */
    public Response f56498b;

    public c(Throwable th2) {
        this.f56497a = th2;
    }

    public static c b(Response response) {
        return new c(response);
    }

    public static c c(Throwable th2) {
        return new c(th2);
    }

    @Override // md.InterfaceC5581a
    public String a() {
        Throwable th2 = this.f56497a;
        if (th2 != null) {
            return th2.getMessage();
        }
        StringBuilder sb2 = new StringBuilder();
        Response response = this.f56498b;
        if (response != null) {
            if (com.zendesk.util.d.a(response.message())) {
                sb2.append(this.f56498b.message());
            } else {
                sb2.append(this.f56498b.code());
            }
        }
        return sb2.toString();
    }

    public c(Response response) {
        this.f56498b = response;
    }
}
