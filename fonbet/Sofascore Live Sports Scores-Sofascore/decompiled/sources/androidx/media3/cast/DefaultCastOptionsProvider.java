package androidx.media3.cast;

import android.content.Context;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.OptionsProvider;
import com.google.android.gms.cast.framework.SessionProvider;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class DefaultCastOptionsProvider implements OptionsProvider {
    @Override // com.google.android.gms.cast.framework.OptionsProvider
    public List<SessionProvider> getAdditionalSessionProviders(Context context) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.cast.framework.OptionsProvider
    public CastOptions getCastOptions(Context context) {
        CastOptions.Builder builder = new CastOptions.Builder();
        builder.e = false;
        builder.g = false;
        builder.a = "A12D4273";
        builder.c = true;
        builder.i = true;
        return builder.a();
    }
}
