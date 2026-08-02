package androidx.car.app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.navigation.model.NavigationTemplate;
import com.google.common.collect.ImmutableSet;
import com.ironsource.X3;
import java.util.Objects;
import java.util.Set;
import xsna.e8o0;
import xsna.owj0;

/* loaded from: classes11.dex */
public class SessionInfo {
    private static final ImmutableSet<Class<? extends e8o0>> CLUSTER_SUPPORTED_TEMPLATES_API_6;
    private static final ImmutableSet<Class<? extends e8o0>> CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6;

    @NonNull
    public static final SessionInfo DEFAULT_SESSION_INFO;
    public static final int DISPLAY_TYPE_CLUSTER = 1;
    public static final int DISPLAY_TYPE_MAIN = 0;
    private static final char DIVIDER = '/';
    private final int mDisplayType;

    @NonNull
    private final String mSessionId;

    static {
        int i = ImmutableSet.d;
        CLUSTER_SUPPORTED_TEMPLATES_API_6 = new owj0(NavigationTemplate.class);
        CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6 = com.google.common.collect.i.k;
        DEFAULT_SESSION_INFO = new SessionInfo(0, X3.i.Z);
    }

    public SessionInfo(int i, @NonNull String str) {
        this.mDisplayType = i;
        this.mSessionId = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof SessionInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        return getSessionId().equals(sessionInfo.getSessionId()) && getDisplayType() == sessionInfo.getDisplayType();
    }

    public int getDisplayType() {
        return this.mDisplayType;
    }

    @NonNull
    public String getSessionId() {
        return this.mSessionId;
    }

    @Nullable
    public Set<Class<? extends e8o0>> getSupportedTemplates(int i) {
        if (this.mDisplayType == 1) {
            return i >= 6 ? CLUSTER_SUPPORTED_TEMPLATES_API_6 : CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6;
        }
        return null;
    }

    public int hashCode() {
        return Objects.hash(this.mSessionId, Integer.valueOf(this.mDisplayType));
    }

    @NonNull
    public String toString() {
        return String.valueOf(this.mDisplayType) + DIVIDER + this.mSessionId;
    }

    private SessionInfo() {
        this.mSessionId = X3.i.Z;
        this.mDisplayType = 0;
    }
}
