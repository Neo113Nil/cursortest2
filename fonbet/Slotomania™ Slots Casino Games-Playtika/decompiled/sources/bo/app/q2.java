package bo.app;

import com.braze.Constants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.sentry.cache.EnvelopeCache;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lbo/app/q2;", "", "Lbo/app/m5;", EnvelopeCache.PREFIX_CURRENT_SESSION_FILE, "", Constants.BRAZE_PUSH_CONTENT_KEY, "", JsonStorageKeyNames.SESSION_ID_KEY, "()Lbo/app/m5;", "storedOpenSession", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public interface q2 {
    m5 a();

    void a(m5 session);

    void a(String sessionId);
}
