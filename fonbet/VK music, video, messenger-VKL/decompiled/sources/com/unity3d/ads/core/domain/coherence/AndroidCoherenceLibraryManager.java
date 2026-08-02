package com.unity3d.ads.core.domain.coherence;

import android.content.Context;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.coherence.CoherenceInitConfig;
import com.unity3d.coherence.CoherenceLibrary;
import com.unity3d.coherence.CommonAttributesConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.s3q0;

/* compiled from: AndroidCoherenceLibraryManager.kt */
/* loaded from: classes14.dex */
public final class AndroidCoherenceLibraryManager implements CoherenceLibraryManager {
    private final Context appContext;
    private final AtomicBoolean initialized = new AtomicBoolean(false);
    private final Logger logger;

    public AndroidCoherenceLibraryManager(Context context, Logger logger) {
        this.logger = logger;
        this.appContext = context.getApplicationContext();
    }

    private final void initialize() {
        if (this.initialized.get()) {
            return;
        }
        synchronized (this) {
            if (this.initialized.get()) {
                return;
            }
            CoherenceLibrary.init(new CoherenceInitConfig.Builder(this.appContext).setSource(2).build());
            this.initialized.set(true);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // com.unity3d.ads.core.domain.coherence.CoherenceLibraryManager
    public byte[] getCommonAttributes() {
        try {
            initialize();
            return CoherenceLibrary.getInstance().getAttributesProvider().getCommonAttributes(new CommonAttributesConfig.Builder().build());
        } catch (Throwable th) {
            this.logger.error("CoherenceLibrary fetching payload failed", th);
            return null;
        }
    }
}
