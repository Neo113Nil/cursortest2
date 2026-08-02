package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.exception.InitializationException;
import defpackage.au3;
import defpackage.s9a;
import defpackage.xw3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/TriggerInitializeListener;", "", "Lau3;", "coroutineDispatcher", "<init>", "(Lau3;)V", "", "success", "()V", "Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "e", "error", "(Lcom/unity3d/ads/core/data/model/exception/InitializationException;)V", "Lau3;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TriggerInitializeListener {

    @NotNull
    private final au3 coroutineDispatcher;

    public TriggerInitializeListener(@NotNull au3 au3Var) {
        au3Var.getClass();
        this.coroutineDispatcher = au3Var;
    }

    public final void error(@NotNull InitializationException e) {
        e.getClass();
        xw3.L(s9a.c(this.coroutineDispatcher), null, null, new TriggerInitializeListener$error$1(e, null), 3);
    }

    public final void success() {
        xw3.L(s9a.c(this.coroutineDispatcher), null, null, new TriggerInitializeListener$success$1(null), 3);
    }
}
