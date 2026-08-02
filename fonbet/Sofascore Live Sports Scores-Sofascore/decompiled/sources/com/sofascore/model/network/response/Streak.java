package com.sofascore.model.network.response;

import com.ironsource.U3;
import defpackage.dmi;
import defpackage.gz1;
import defpackage.me4;
import defpackage.mz1;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001d¨\u0006."}, d2 = {"Lcom/sofascore/model/network/response/Streak;", "", "", "name", U3.i.X, "team", "", "continued", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/Streak;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/sofascore/model/network/response/Streak;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getValue", "getTeam", "Ljava/lang/Boolean;", "getContinued", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Streak {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Boolean continued;

    @NotNull
    private final String name;

    @NotNull
    private final String team;

    @NotNull
    private final String value;

    public /* synthetic */ Streak(int i, String str, String str2, String str3, Boolean bool, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, Streak$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.name = str;
        this.value = str2;
        this.team = str3;
        this.continued = bool;
    }

    public static /* synthetic */ Streak copy$default(Streak streak, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streak.name;
        }
        if ((i & 2) != 0) {
            str2 = streak.value;
        }
        if ((i & 4) != 0) {
            str3 = streak.team;
        }
        if ((i & 8) != 0) {
            bool = streak.continued;
        }
        return streak.copy(str, str2, str3, bool);
    }

    public static final /* synthetic */ void write$Self$model_release(Streak self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.name);
        output.y(serialDesc, 1, self.value);
        output.y(serialDesc, 2, self.team);
        output.h(serialDesc, 3, gz1.a, self.continued);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTeam() {
        return this.team;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Boolean getContinued() {
        return this.continued;
    }

    @NotNull
    public final Streak copy(@NotNull String name, @NotNull String value, @NotNull String team, @Nullable Boolean continued) {
        name.getClass();
        value.getClass();
        team.getClass();
        return new Streak(name, value, team, continued);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Streak)) {
            return false;
        }
        Streak streak = (Streak) other;
        return Intrinsics.c(this.name, streak.name) && Intrinsics.c(this.value, streak.value) && Intrinsics.c(this.team, streak.team) && Intrinsics.c(this.continued, streak.continued);
    }

    @Nullable
    public final Boolean getContinued() {
        return this.continued;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getTeam() {
        return this.team;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int c = dmi.c(dmi.c(this.name.hashCode() * 31, 31, this.value), 31, this.team);
        Boolean bool = this.continued;
        return c + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.value;
        String str3 = this.team;
        Boolean bool = this.continued;
        StringBuilder s = mz1.s("Streak(name=", str, ", value=", str2, ", team=");
        s.append(str3);
        s.append(", continued=");
        s.append(bool);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/Streak$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/Streak;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Streak$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Streak(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Boolean bool) {
        me4.p(str, str2, str3);
        this.name = str;
        this.value = str2;
        this.team = str3;
        this.continued = bool;
    }
}
