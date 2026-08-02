package com.sofascore.model.network.response;

import defpackage.ild;
import defpackage.joa;
import defpackage.qq3;
import defpackage.r5h;
import defpackage.ypa;
import defpackage.ysa;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007¨\u0006\b"}, d2 = {"Lcom/sofascore/model/network/response/OtherPlayerEventStatistics;", "Lcom/sofascore/model/network/response/PlayerEventStatistics;", "<init>", "()V", "readResolve", "", "serializer", "Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OtherPlayerEventStatistics implements PlayerEventStatistics {

    @NotNull
    public static final OtherPlayerEventStatistics INSTANCE = new OtherPlayerEventStatistics();
    private static final /* synthetic */ joa $cachedSerializer$delegate = ypa.a(ysa.b, new ild(20));

    private OtherPlayerEventStatistics() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new qq3("com.sofascore.model.network.response.OtherPlayerEventStatistics", INSTANCE, new Annotation[0]);
    }

    private final /* synthetic */ KSerializer get$cachedSerializer() {
        return (KSerializer) $cachedSerializer$delegate.getValue();
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // com.sofascore.model.network.response.PlayerEventStatistics
    @Nullable
    public /* bridge */ Double getRating() {
        return super.getRating();
    }

    @NotNull
    public final KSerializer serializer() {
        return get$cachedSerializer();
    }
}
