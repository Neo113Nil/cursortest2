package com.sofascore.model.firebase;

import com.sofascore.model.firebase.BaseAdUnit;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001b¨\u0006."}, d2 = {"Lcom/sofascore/model/firebase/AdUnit;", "", "Lcom/sofascore/model/firebase/BaseAdUnit$GamAdUnit;", "gam", "nimbus", "Lcom/sofascore/model/firebase/BaseAdUnit$EquativAdUnit;", "equativ", "<init>", "(Lcom/sofascore/model/firebase/BaseAdUnit$GamAdUnit;Lcom/sofascore/model/firebase/BaseAdUnit$GamAdUnit;Lcom/sofascore/model/firebase/BaseAdUnit$EquativAdUnit;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/firebase/BaseAdUnit$GamAdUnit;Lcom/sofascore/model/firebase/BaseAdUnit$GamAdUnit;Lcom/sofascore/model/firebase/BaseAdUnit$EquativAdUnit;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/firebase/AdUnit;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/firebase/BaseAdUnit$GamAdUnit;", "component2", "component3", "()Lcom/sofascore/model/firebase/BaseAdUnit$EquativAdUnit;", "copy", "(Lcom/sofascore/model/firebase/BaseAdUnit$GamAdUnit;Lcom/sofascore/model/firebase/BaseAdUnit$GamAdUnit;Lcom/sofascore/model/firebase/BaseAdUnit$EquativAdUnit;)Lcom/sofascore/model/firebase/AdUnit;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/firebase/BaseAdUnit$GamAdUnit;", "getGam", "getNimbus", "Lcom/sofascore/model/firebase/BaseAdUnit$EquativAdUnit;", "getEquativ", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AdUnit {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final BaseAdUnit.EquativAdUnit equativ;

    @Nullable
    private final BaseAdUnit.GamAdUnit gam;

    @Nullable
    private final BaseAdUnit.GamAdUnit nimbus;

    public /* synthetic */ AdUnit(int i, BaseAdUnit.GamAdUnit gamAdUnit, BaseAdUnit.GamAdUnit gamAdUnit2, BaseAdUnit.EquativAdUnit equativAdUnit, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, AdUnit$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.gam = gamAdUnit;
        this.nimbus = gamAdUnit2;
        this.equativ = equativAdUnit;
    }

    public static /* synthetic */ AdUnit copy$default(AdUnit adUnit, BaseAdUnit.GamAdUnit gamAdUnit, BaseAdUnit.GamAdUnit gamAdUnit2, BaseAdUnit.EquativAdUnit equativAdUnit, int i, Object obj) {
        if ((i & 1) != 0) {
            gamAdUnit = adUnit.gam;
        }
        if ((i & 2) != 0) {
            gamAdUnit2 = adUnit.nimbus;
        }
        if ((i & 4) != 0) {
            equativAdUnit = adUnit.equativ;
        }
        return adUnit.copy(gamAdUnit, gamAdUnit2, equativAdUnit);
    }

    public static final /* synthetic */ void write$Self$model_release(AdUnit self, wf3 output, SerialDescriptor serialDesc) {
        BaseAdUnit$GamAdUnit$$serializer baseAdUnit$GamAdUnit$$serializer = BaseAdUnit$GamAdUnit$$serializer.INSTANCE;
        output.h(serialDesc, 0, baseAdUnit$GamAdUnit$$serializer, self.gam);
        output.h(serialDesc, 1, baseAdUnit$GamAdUnit$$serializer, self.nimbus);
        output.h(serialDesc, 2, BaseAdUnit$EquativAdUnit$$serializer.INSTANCE, self.equativ);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final BaseAdUnit.GamAdUnit getGam() {
        return this.gam;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final BaseAdUnit.GamAdUnit getNimbus() {
        return this.nimbus;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final BaseAdUnit.EquativAdUnit getEquativ() {
        return this.equativ;
    }

    @NotNull
    public final AdUnit copy(@Nullable BaseAdUnit.GamAdUnit gam, @Nullable BaseAdUnit.GamAdUnit nimbus, @Nullable BaseAdUnit.EquativAdUnit equativ) {
        return new AdUnit(gam, nimbus, equativ);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdUnit)) {
            return false;
        }
        AdUnit adUnit = (AdUnit) other;
        return Intrinsics.c(this.gam, adUnit.gam) && Intrinsics.c(this.nimbus, adUnit.nimbus) && Intrinsics.c(this.equativ, adUnit.equativ);
    }

    @Nullable
    public final BaseAdUnit.EquativAdUnit getEquativ() {
        return this.equativ;
    }

    @Nullable
    public final BaseAdUnit.GamAdUnit getGam() {
        return this.gam;
    }

    @Nullable
    public final BaseAdUnit.GamAdUnit getNimbus() {
        return this.nimbus;
    }

    public int hashCode() {
        BaseAdUnit.GamAdUnit gamAdUnit = this.gam;
        int hashCode = (gamAdUnit == null ? 0 : gamAdUnit.hashCode()) * 31;
        BaseAdUnit.GamAdUnit gamAdUnit2 = this.nimbus;
        int hashCode2 = (hashCode + (gamAdUnit2 == null ? 0 : gamAdUnit2.hashCode())) * 31;
        BaseAdUnit.EquativAdUnit equativAdUnit = this.equativ;
        return hashCode2 + (equativAdUnit != null ? equativAdUnit.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdUnit(gam=" + this.gam + ", nimbus=" + this.nimbus + ", equativ=" + this.equativ + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/firebase/AdUnit$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/firebase/AdUnit;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AdUnit$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AdUnit(@Nullable BaseAdUnit.GamAdUnit gamAdUnit, @Nullable BaseAdUnit.GamAdUnit gamAdUnit2, @Nullable BaseAdUnit.EquativAdUnit equativAdUnit) {
        this.gam = gamAdUnit;
        this.nimbus = gamAdUnit2;
        this.equativ = equativAdUnit;
    }
}
