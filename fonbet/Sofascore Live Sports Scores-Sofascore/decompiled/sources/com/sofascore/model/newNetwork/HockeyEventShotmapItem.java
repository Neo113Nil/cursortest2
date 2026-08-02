package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.fc9;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0007\u0018\u0000 72\u00020\u0001:\u000287BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBY\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010#R\"\u0010\t\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\n\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010,\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b3\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/sofascore/model/newNetwork/HockeyEventShotmapItem;", "Lcom/sofascore/model/newNetwork/BaseHockeyShotmapItem;", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/mvvm/model/Team;", "team", "", "id", "", "x", "y", "type", "", "period", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;IFFILjava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;IFFILjava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/HockeyEventShotmapItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "()Lcom/sofascore/model/mvvm/model/Player;", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "()Lcom/sofascore/model/mvvm/model/Team;", "I", "getId", "F", "getX", "()F", "setX", "(F)V", "getY", "setY", "getType", "Ljava/lang/String;", "getPeriod", "()Ljava/lang/String;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HockeyEventShotmapItem extends BaseHockeyShotmapItem {
    private final int id;

    @Nullable
    private final String period;

    @NotNull
    private final Player player;

    @NotNull
    private final Team team;
    private final int type;
    private float x;
    private float y;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new fc9(1)), null, null, null, null, null};

    public /* synthetic */ HockeyEventShotmapItem(int i, Player player, Team team, int i2, float f, float f2, int i3, String str, t5h t5hVar) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, HockeyEventShotmapItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player = player;
        this.team = team;
        this.id = i2;
        this.x = f;
        this.y = f2;
        this.type = i3;
        this.period = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static final /* synthetic */ void write$Self$model_release(HockeyEventShotmapItem self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, Player$$serializer.INSTANCE, self.player);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.team);
        output.u(2, self.getId(), serialDesc);
        output.t(serialDesc, 3, self.getX());
        output.t(serialDesc, 4, self.getY());
        output.u(5, self.getType(), serialDesc);
        output.h(serialDesc, 6, uhi.a, self.getPeriod());
    }

    @Override // com.sofascore.model.newNetwork.BaseHockeyShotmapItem
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!HockeyEventShotmapItem.class.equals(other != null ? other.getClass() : null) || !super.equals(other)) {
            return false;
        }
        other.getClass();
        HockeyEventShotmapItem hockeyEventShotmapItem = (HockeyEventShotmapItem) other;
        return Intrinsics.c(this.player, hockeyEventShotmapItem.player) && Intrinsics.c(this.team, hockeyEventShotmapItem.team);
    }

    @Override // com.sofascore.model.newNetwork.BaseHockeyShotmapItem
    public int getId() {
        return this.id;
    }

    @Override // com.sofascore.model.newNetwork.BaseHockeyShotmapItem
    @Nullable
    public String getPeriod() {
        return this.period;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    @NotNull
    public final Team getTeam() {
        return this.team;
    }

    @Override // com.sofascore.model.newNetwork.BaseHockeyShotmapItem
    public int getType() {
        return this.type;
    }

    @Override // com.sofascore.model.newNetwork.BaseHockeyShotmapItem
    public float getX() {
        return this.x;
    }

    @Override // com.sofascore.model.newNetwork.BaseHockeyShotmapItem
    public float getY() {
        return this.y;
    }

    @Override // com.sofascore.model.newNetwork.BaseHockeyShotmapItem
    public int hashCode() {
        return this.team.hashCode() + ((this.player.hashCode() + (super.hashCode() * 31)) * 31);
    }

    @Override // com.sofascore.model.newNetwork.BaseHockeyShotmapItem
    public void setX(float f) {
        this.x = f;
    }

    @Override // com.sofascore.model.newNetwork.BaseHockeyShotmapItem
    public void setY(float f) {
        this.y = f;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/HockeyEventShotmapItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/HockeyEventShotmapItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return HockeyEventShotmapItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public HockeyEventShotmapItem(@NotNull Player player, @NotNull Team team, int i, float f, float f2, int i2, @Nullable String str) {
        player.getClass();
        team.getClass();
        this.player = player;
        this.team = team;
        this.id = i;
        this.x = f;
        this.y = f2;
        this.type = i2;
        this.period = str;
    }
}
