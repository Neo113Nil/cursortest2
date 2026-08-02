package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.ServiceLocator;
import com.vungle.ads.internal.executor.a;
import defpackage.xka;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes6.dex */
public final class BannerView$special$$inlined$inject$1 extends xka implements Function0<a> {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerView$special$$inlined$inject$1(Context context) {
        super(0);
        this.a = context;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final a invoke() {
        return ServiceLocator.d.a(this.a).getService(a.class);
    }
}
