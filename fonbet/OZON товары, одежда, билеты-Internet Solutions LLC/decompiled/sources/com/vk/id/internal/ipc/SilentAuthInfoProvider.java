package com.vk.id.internal.ipc;

import Fb.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00028VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/vk/id/internal/ipc/SilentAuthInfoProvider;", "", "", "timeout", "", "LFb/b;", "getSilentAuthInfos", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "", "appId", "", "setAppId", "(I)V", "getDefaultTimeout", "()J", "getDefaultTimeout$annotations", "()V", "defaultTimeout", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface SilentAuthInfoProvider {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getSilentAuthInfos$default(SilentAuthInfoProvider silentAuthInfoProvider, long j11, d dVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSilentAuthInfos");
            }
            if ((i11 & 1) != 0) {
                j11 = silentAuthInfoProvider.getDefaultTimeout();
            }
            return silentAuthInfoProvider.getSilentAuthInfos(j11, dVar);
        }
    }

    long getDefaultTimeout();

    Object getSilentAuthInfos(long j11, @NotNull d<? super List<b>> dVar);

    void setAppId(int appId);
}
