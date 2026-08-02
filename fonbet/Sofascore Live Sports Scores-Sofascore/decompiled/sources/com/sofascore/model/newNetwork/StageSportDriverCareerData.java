package com.sofascore.model.newNetwork;

import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019¨\u0006 "}, d2 = {"Lcom/sofascore/model/newNetwork/StageSportDriverCareerData;", "", "", "victories", "racesStarted", "podiums", "polePositions", "worldChampionshipTitles", "<init>", "(IIIII)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIIIIILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/StageSportDriverCareerData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getVictories", "()I", "getRacesStarted", "getPodiums", "getPolePositions", "getWorldChampionshipTitles", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StageSportDriverCareerData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int podiums;
    private final int polePositions;
    private final int racesStarted;
    private final int victories;
    private final int worldChampionshipTitles;

    public /* synthetic */ StageSportDriverCareerData(int i, int i2, int i3, int i4, int i5, int i6, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, StageSportDriverCareerData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.victories = i2;
        this.racesStarted = i3;
        this.podiums = i4;
        this.polePositions = i5;
        this.worldChampionshipTitles = i6;
    }

    public static final /* synthetic */ void write$Self$model_release(StageSportDriverCareerData self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.victories, serialDesc);
        output.u(1, self.racesStarted, serialDesc);
        output.u(2, self.podiums, serialDesc);
        output.u(3, self.polePositions, serialDesc);
        output.u(4, self.worldChampionshipTitles, serialDesc);
    }

    public final int getPodiums() {
        return this.podiums;
    }

    public final int getPolePositions() {
        return this.polePositions;
    }

    public final int getRacesStarted() {
        return this.racesStarted;
    }

    public final int getVictories() {
        return this.victories;
    }

    public final int getWorldChampionshipTitles() {
        return this.worldChampionshipTitles;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/StageSportDriverCareerData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/StageSportDriverCareerData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StageSportDriverCareerData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StageSportDriverCareerData(int i, int i2, int i3, int i4, int i5) {
        this.victories = i;
        this.racesStarted = i2;
        this.podiums = i3;
        this.polePositions = i4;
        this.worldChampionshipTitles = i5;
    }
}
