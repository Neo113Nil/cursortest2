package com.blaze.blazesdk.cast;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.OptionsProvider;
import com.google.android.gms.cast.framework.SessionProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lcom/blaze/blazesdk/cast/BlazeDefaultCastOptionsProvider;", "Lcom/google/android/gms/cast/framework/OptionsProvider;", "<init>", "()V", "getCastOptions", "Lcom/google/android/gms/cast/framework/CastOptions;", "context", "Landroid/content/Context;", "getAdditionalSessionProviders", "", "Lcom/google/android/gms/cast/framework/SessionProvider;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeDefaultCastOptionsProvider implements OptionsProvider {
    public static final int $stable = 0;

    @Override // com.google.android.gms.cast.framework.OptionsProvider
    @NotNull
    public List<SessionProvider> getAdditionalSessionProviders(@NotNull Context context) {
        context.getClass();
        return new ArrayList();
    }

    @Override // com.google.android.gms.cast.framework.OptionsProvider
    @NotNull
    public CastOptions getCastOptions(@NotNull Context context) {
        context.getClass();
        CastOptions.Builder builder = new CastOptions.Builder();
        builder.e = false;
        builder.g = false;
        builder.a = "A12D4273";
        builder.c = true;
        return builder.a();
    }
}
