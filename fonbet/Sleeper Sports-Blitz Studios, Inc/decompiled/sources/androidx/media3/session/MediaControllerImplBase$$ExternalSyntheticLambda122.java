package androidx.media3.session;

import android.os.Bundle;
import androidx.media3.common.MediaItem;
import com.google.common.base.Function;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class MediaControllerImplBase$$ExternalSyntheticLambda122 implements Function {
    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        Bundle bundleIncludeLocalConfiguration;
        bundleIncludeLocalConfiguration = ((MediaItem) obj).toBundleIncludeLocalConfiguration();
        return bundleIncludeLocalConfiguration;
    }
}
