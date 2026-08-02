package com.sofascore.model.firebase;

import defpackage.ffa;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* synthetic */ class AdConfig$Banner$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0 implements ffa {
    private final /* synthetic */ String discriminator;

    public AdConfig$Banner$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0(@NotNull String str) {
        str.getClass();
        this.discriminator = str;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return ffa.class;
    }

    @Override // defpackage.ffa
    public final /* synthetic */ String discriminator() {
        return this.discriminator;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof ffa) && Intrinsics.c(discriminator(), ((ffa) obj).discriminator());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return this.discriminator.hashCode() ^ 707790692;
    }

    @Override // java.lang.annotation.Annotation
    @NotNull
    public final String toString() {
        return lnb.o("@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=", this.discriminator, ")");
    }
}
