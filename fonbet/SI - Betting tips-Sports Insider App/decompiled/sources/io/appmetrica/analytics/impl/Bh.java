package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.ICrashTransformer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Bh extends AbstractC0248j6 {

    /* renamed from: d, reason: collision with root package name */
    public final Wn f12067d;

    public Bh(@NonNull Context context, @NonNull Wn wn, @NonNull InterfaceC0223i6 interfaceC0223i6, ICrashTransformer iCrashTransformer) {
        this(wn, interfaceC0223i6, iCrashTransformer, new M9(context));
    }

    public Bh(Wn wn, InterfaceC0223i6 interfaceC0223i6, ICrashTransformer iCrashTransformer, M9 m92) {
        super(interfaceC0223i6, iCrashTransformer, m92);
        this.f12067d = wn;
    }
}
