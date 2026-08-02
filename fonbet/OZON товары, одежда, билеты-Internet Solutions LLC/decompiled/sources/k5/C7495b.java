package k5;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.LinkedHashSet;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* renamed from: k5.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7495b extends D0<Om0.a> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70707e;

    C7495b(@NonNull Context context) {
        super(Mm0.e.AccessibilityServices);
        this.f70707e = context;
    }

    @Override // k5.D0
    @NonNull
    protected final Om0.a s() throws D1 {
        return new Om0.a();
    }

    @Override // k5.D0
    public final Om0.a u() throws Mm0.a, D1 {
        String str;
        Context context = this.f70707e;
        Om0.a aVar = (Om0.a) super.u();
        if (aVar != null) {
            try {
                boolean z11 = Settings.Secure.getInt(context.getApplicationContext().getContentResolver(), "accessibility_enabled") == 1;
                if (z11) {
                    str = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), "enabled_accessibility_services");
                    if (str != null && str.length() > 300) {
                        str = TextUtils.join(ProductContainerDTO.RATIO_DELIMITER, new LinkedHashSet(Arrays.asList(str.split(ProductContainerDTO.RATIO_DELIMITER))));
                    }
                } else {
                    str = null;
                }
                aVar.put("enabled", Boolean.valueOf(z11));
                if (!(str == null || str.length() == 0)) {
                    aVar.put("packages", str);
                    return aVar;
                }
            } catch (Settings.SettingNotFoundException e11) {
                throw new P2(e11.getMessage());
            }
        }
        return aVar;
    }
}
