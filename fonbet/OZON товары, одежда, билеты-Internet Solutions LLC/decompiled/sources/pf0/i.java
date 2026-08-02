package pf0;

import Sc.InterfaceC3999a;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\"\u0010\u0012\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR\"\u0010\u0015\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\"\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lpf0/i;", "", "<init>", "()V", "", "Lpf0/e;", "interceptors", "Ljava/util/List;", "getInterceptors", "()Ljava/util/List;", "", "isCronetEnabled", "Z", "()Z", "setCronetEnabled", "(Z)V", "isPerfMetricsEnabled", "setPerfMetricsEnabled", "shouldReadResponseBodyBeforeResponse", "getShouldReadResponseBodyBeforeResponse", "setShouldReadResponseBodyBeforeResponse", "isGostTlsEnabled", "setGostTlsEnabled", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "getContext$annotations", "Lpf0/b;", "getConsumer", "()Lpf0/b;", "consumer", "ozon-network-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class i {
    private final Context context;

    @NotNull
    private final List<AbstractC8922e> interceptors = K.f71697a;
    private boolean isCronetEnabled;
    private boolean isGostTlsEnabled;
    private boolean isPerfMetricsEnabled;
    private boolean shouldReadResponseBodyBeforeResponse;

    @InterfaceC3999a
    public static /* synthetic */ void getContext$annotations() {
    }

    @NotNull
    public abstract AbstractC8919b getConsumer();

    public Context getContext() {
        return this.context;
    }

    @NotNull
    public List<AbstractC8922e> getInterceptors() {
        return this.interceptors;
    }

    public boolean getShouldReadResponseBodyBeforeResponse() {
        return this.shouldReadResponseBodyBeforeResponse;
    }

    /* renamed from: isCronetEnabled, reason: from getter */
    public boolean getIsCronetEnabled() {
        return this.isCronetEnabled;
    }

    /* renamed from: isGostTlsEnabled, reason: from getter */
    public boolean getIsGostTlsEnabled() {
        return this.isGostTlsEnabled;
    }

    /* renamed from: isPerfMetricsEnabled, reason: from getter */
    public boolean getIsPerfMetricsEnabled() {
        return this.isPerfMetricsEnabled;
    }

    public void setCronetEnabled(boolean z11) {
        this.isCronetEnabled = z11;
    }

    public void setGostTlsEnabled(boolean z11) {
        this.isGostTlsEnabled = z11;
    }

    public void setPerfMetricsEnabled(boolean z11) {
        this.isPerfMetricsEnabled = z11;
    }

    public void setShouldReadResponseBodyBeforeResponse(boolean z11) {
        this.shouldReadResponseBodyBeforeResponse = z11;
    }
}
