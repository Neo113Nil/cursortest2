package com.unity3d.ads.injection;

import com.ironsource.U3;
import defpackage.joa;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0014\u0010\r\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/injection/Factory;", "T", "Ljoa;", "Lkotlin/Function0;", "initializer", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "isInitialized", "()Z", "Lkotlin/jvm/functions/Function0;", "getValue", "()Ljava/lang/Object;", U3.i.X, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Factory<T> implements joa {

    @NotNull
    private final Function0<T> initializer;

    /* JADX WARN: Multi-variable type inference failed */
    public Factory(@NotNull Function0<? extends T> function0) {
        function0.getClass();
        this.initializer = function0;
    }

    @Override // defpackage.joa
    public T getValue() {
        return (T) this.initializer.invoke();
    }

    @Override // defpackage.joa
    public boolean isInitialized() {
        return false;
    }
}
