package com.sofascore.model.mvvm.model;

import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0019J\u0015\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010%¨\u0006("}, d2 = {"Lcom/sofascore/model/mvvm/model/BonusInfo;", "Ljava/io/Serializable;", "", "hasHomeBonus", "hasAwayBonus", "<init>", "(ZZ)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(IZZLt5h;)V", "component1", "()Z", "component2", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/BonusInfo;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "shouldReverseTeams", "(Z)Z", "copy", "(ZZ)Lcom/sofascore/model/mvvm/model/BonusInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BonusInfo implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean hasAwayBonus;
    private final boolean hasHomeBonus;

    public /* synthetic */ BonusInfo(int i, boolean z, boolean z2, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, BonusInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.hasHomeBonus = z;
        this.hasAwayBonus = z2;
    }

    /* renamed from: component1, reason: from getter */
    private final boolean getHasHomeBonus() {
        return this.hasHomeBonus;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getHasAwayBonus() {
        return this.hasAwayBonus;
    }

    public static /* synthetic */ BonusInfo copy$default(BonusInfo bonusInfo, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bonusInfo.hasHomeBonus;
        }
        if ((i & 2) != 0) {
            z2 = bonusInfo.hasAwayBonus;
        }
        return bonusInfo.copy(z, z2);
    }

    public static final /* synthetic */ void write$Self$model_release(BonusInfo self, wf3 output, SerialDescriptor serialDesc) {
        output.x(serialDesc, 0, self.hasHomeBonus);
        output.x(serialDesc, 1, self.hasAwayBonus);
    }

    @NotNull
    public final BonusInfo copy(boolean hasHomeBonus, boolean hasAwayBonus) {
        return new BonusInfo(hasHomeBonus, hasAwayBonus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BonusInfo)) {
            return false;
        }
        BonusInfo bonusInfo = (BonusInfo) other;
        return this.hasHomeBonus == bonusInfo.hasHomeBonus && this.hasAwayBonus == bonusInfo.hasAwayBonus;
    }

    public final boolean hasAwayBonus(boolean shouldReverseTeams) {
        return shouldReverseTeams ? this.hasHomeBonus : this.hasAwayBonus;
    }

    public final boolean hasHomeBonus(boolean shouldReverseTeams) {
        return shouldReverseTeams ? this.hasAwayBonus : this.hasHomeBonus;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasAwayBonus) + (Boolean.hashCode(this.hasHomeBonus) * 31);
    }

    @NotNull
    public String toString() {
        return "BonusInfo(hasHomeBonus=" + this.hasHomeBonus + ", hasAwayBonus=" + this.hasAwayBonus + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/BonusInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/BonusInfo;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BonusInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BonusInfo(boolean z, boolean z2) {
        this.hasHomeBonus = z;
        this.hasAwayBonus = z2;
    }
}
