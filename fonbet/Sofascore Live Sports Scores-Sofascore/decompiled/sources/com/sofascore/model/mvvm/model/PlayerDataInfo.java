package com.sofascore.model.mvvm.model;

import com.ironsource.U3;
import defpackage.bf3;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JL\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u0019¨\u00060"}, d2 = {"Lcom/sofascore/model/mvvm/model/PlayerDataInfo;", "Ljava/io/Serializable;", "", "age", "kilometersCovered", U3.i.X, "fantasyPoints", "height", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/PlayerDataInfo;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/mvvm/model/PlayerDataInfo;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAge", "getKilometersCovered", "getValue", "getFantasyPoints", "getHeight", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlayerDataInfo implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String age;

    @Nullable
    private final String fantasyPoints;

    @Nullable
    private final String height;

    @Nullable
    private final String kilometersCovered;

    @Nullable
    private final String value;

    public /* synthetic */ PlayerDataInfo(int i, String str, String str2, String str3, String str4, String str5, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, PlayerDataInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.age = str;
        this.kilometersCovered = str2;
        this.value = str3;
        this.fantasyPoints = str4;
        this.height = str5;
    }

    public static /* synthetic */ PlayerDataInfo copy$default(PlayerDataInfo playerDataInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playerDataInfo.age;
        }
        if ((i & 2) != 0) {
            str2 = playerDataInfo.kilometersCovered;
        }
        if ((i & 4) != 0) {
            str3 = playerDataInfo.value;
        }
        if ((i & 8) != 0) {
            str4 = playerDataInfo.fantasyPoints;
        }
        if ((i & 16) != 0) {
            str5 = playerDataInfo.height;
        }
        String str6 = str5;
        String str7 = str3;
        return playerDataInfo.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerDataInfo self, wf3 output, SerialDescriptor serialDesc) {
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 0, uhiVar, self.age);
        output.h(serialDesc, 1, uhiVar, self.kilometersCovered);
        output.h(serialDesc, 2, uhiVar, self.value);
        output.h(serialDesc, 3, uhiVar, self.fantasyPoints);
        output.h(serialDesc, 4, uhiVar, self.height);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getAge() {
        return this.age;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getKilometersCovered() {
        return this.kilometersCovered;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getFantasyPoints() {
        return this.fantasyPoints;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getHeight() {
        return this.height;
    }

    @NotNull
    public final PlayerDataInfo copy(@Nullable String age, @Nullable String kilometersCovered, @Nullable String value, @Nullable String fantasyPoints, @Nullable String height) {
        return new PlayerDataInfo(age, kilometersCovered, value, fantasyPoints, height);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerDataInfo)) {
            return false;
        }
        PlayerDataInfo playerDataInfo = (PlayerDataInfo) other;
        return Intrinsics.c(this.age, playerDataInfo.age) && Intrinsics.c(this.kilometersCovered, playerDataInfo.kilometersCovered) && Intrinsics.c(this.value, playerDataInfo.value) && Intrinsics.c(this.fantasyPoints, playerDataInfo.fantasyPoints) && Intrinsics.c(this.height, playerDataInfo.height);
    }

    @Nullable
    public final String getAge() {
        return this.age;
    }

    @Nullable
    public final String getFantasyPoints() {
        return this.fantasyPoints;
    }

    @Nullable
    public final String getHeight() {
        return this.height;
    }

    @Nullable
    public final String getKilometersCovered() {
        return this.kilometersCovered;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.age;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.kilometersCovered;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.value;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fantasyPoints;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.height;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.age;
        String str2 = this.kilometersCovered;
        String str3 = this.value;
        String str4 = this.fantasyPoints;
        String str5 = this.height;
        StringBuilder s = mz1.s("PlayerDataInfo(age=", str, ", kilometersCovered=", str2, ", value=");
        bf3.v(s, str3, ", fantasyPoints=", str4, ", height=");
        return mz1.o(s, str5, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/PlayerDataInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/PlayerDataInfo;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerDataInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PlayerDataInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.age = str;
        this.kilometersCovered = str2;
        this.value = str3;
        this.fantasyPoints = str4;
        this.height = str5;
    }
}
