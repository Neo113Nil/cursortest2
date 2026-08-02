package k5;

import androidx.annotation.NonNull;
import java.util.Locale;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes8.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7537l1 f70561a;

    public G0(@NonNull C7537l1 c7537l1) {
        this.f70561a = c7537l1;
    }

    public final void a(@NonNull Mm0.e eVar, @NonNull Mm0.f fVar, @NonNull String str, int i11) {
        Locale locale = Locale.ROOT;
        this.f70561a.b(fVar, eVar + ProductContainerDTO.RATIO_DELIMITER + str, i11);
    }

    public final void b(@NonNull Mm0.e eVar, @NonNull D1 d12) {
        int i11;
        Mm0.f fVar = Mm0.f.Info;
        if ((d12 instanceof C7502c2) || (d12 instanceof P2)) {
            fVar = Mm0.f.Warning;
            i11 = 3;
        } else {
            i11 = 2;
        }
        String message = d12.getMessage();
        Locale locale = Locale.ROOT;
        this.f70561a.b(fVar, eVar + ProductContainerDTO.RATIO_DELIMITER + message, i11);
    }

    public final void c(@NonNull String str) {
        this.f70561a.b(Mm0.f.Info, str, 0);
    }
}
