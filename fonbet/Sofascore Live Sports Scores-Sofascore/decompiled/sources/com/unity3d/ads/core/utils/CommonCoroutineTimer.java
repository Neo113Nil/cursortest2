package com.unity3d.ads.core.utils;

import defpackage.au3;
import defpackage.ku3;
import defpackage.s9a;
import defpackage.smi;
import defpackage.tz9;
import defpackage.xa3;
import defpackage.xw3;
import defpackage.yda;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/utils/CommonCoroutineTimer;", "Lcom/unity3d/ads/core/utils/CoroutineTimer;", "Lau3;", "dispatcher", "<init>", "(Lau3;)V", "", "delayStartMillis", "repeatMillis", "Lkotlin/Function0;", "", "action", "Lyda;", "start", "(JJLkotlin/jvm/functions/Function0;)Lyda;", "Lau3;", "Lxa3;", "job", "Lxa3;", "Lku3;", "scope", "Lku3;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonCoroutineTimer implements CoroutineTimer {

    @NotNull
    private final au3 dispatcher;

    @NotNull
    private final xa3 job;

    @NotNull
    private final ku3 scope;

    public CommonCoroutineTimer(@NotNull au3 au3Var) {
        au3Var.getClass();
        this.dispatcher = au3Var;
        smi o = tz9.o();
        this.job = o;
        this.scope = s9a.c(au3Var.plus(o));
    }

    @Override // com.unity3d.ads.core.utils.CoroutineTimer
    @NotNull
    public yda start(long delayStartMillis, long repeatMillis, @NotNull Function0<Unit> action) {
        action.getClass();
        return xw3.L(this.scope, this.dispatcher, null, new CommonCoroutineTimer$start$1(delayStartMillis, action, repeatMillis, null), 2);
    }
}
