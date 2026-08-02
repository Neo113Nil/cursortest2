package com.sofascore.model.fantasy;

import defpackage.duf;
import defpackage.fuf;
import defpackage.r5h;
import defpackage.zvg;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyTopPlayerWrapper;", "", "fantasyPlayer", "Lcom/sofascore/model/fantasy/FantasyPlayer;", "getFantasyPlayer", "()Lcom/sofascore/model/fantasy/FantasyPlayer;", "Companion", "Lcom/sofascore/model/fantasy/FantasyAverageScoreTopPlayerWrapper;", "Lcom/sofascore/model/fantasy/FantasyScoreTopPlayerWrapper;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FantasyTopPlayerWrapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyTopPlayerWrapper$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyTopPlayerWrapper;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            fuf fufVar = duf.a;
            return new zvg("com.sofascore.model.fantasy.FantasyTopPlayerWrapper", fufVar.getOrCreateKotlinClass(FantasyTopPlayerWrapper.class), new KClass[]{fufVar.getOrCreateKotlinClass(FantasyAverageScoreTopPlayerWrapper.class), fufVar.getOrCreateKotlinClass(FantasyScoreTopPlayerWrapper.class)}, new KSerializer[]{FantasyAverageScoreTopPlayerWrapper$$serializer.INSTANCE, FantasyScoreTopPlayerWrapper$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @NotNull
    FantasyPlayer getFantasyPlayer();
}
