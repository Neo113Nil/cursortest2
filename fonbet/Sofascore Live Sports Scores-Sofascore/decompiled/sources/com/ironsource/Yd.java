package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.xka;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Yd implements InterfaceC4384wg {

    @Nullable
    private final Ab a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends xka implements Function0<IronSourceError> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4301s5.a.d("Load task config is null");
        }
    }

    public Yd(@Nullable Ab ab) {
        this.a = ab;
    }

    @Override // com.ironsource.InterfaceC4384wg
    public void a() {
        a(this.a != null, a.a);
    }
}
