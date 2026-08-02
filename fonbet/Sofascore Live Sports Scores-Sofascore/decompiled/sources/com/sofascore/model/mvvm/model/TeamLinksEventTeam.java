package com.sofascore.model.mvvm.model;

import defpackage.dmi;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001c¨\u0006."}, d2 = {"Lcom/sofascore/model/mvvm/model/TeamLinksEventTeam;", "Ljava/io/Serializable;", "", "id", "", "name", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "fieldTranslations", "<init>", "(ILjava/lang/String;Lcom/sofascore/model/mvvm/model/FieldTranslations;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Lcom/sofascore/model/mvvm/model/FieldTranslations;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/TeamLinksEventTeam;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Lcom/sofascore/model/mvvm/model/FieldTranslations;", "copy", "(ILjava/lang/String;Lcom/sofascore/model/mvvm/model/FieldTranslations;)Lcom/sofascore/model/mvvm/model/TeamLinksEventTeam;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "getFieldTranslations", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamLinksEventTeam implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final FieldTranslations fieldTranslations;
    private final int id;

    @NotNull
    private final String name;

    public /* synthetic */ TeamLinksEventTeam(int i, int i2, String str, FieldTranslations fieldTranslations, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, TeamLinksEventTeam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.name = str;
        this.fieldTranslations = fieldTranslations;
    }

    public static /* synthetic */ TeamLinksEventTeam copy$default(TeamLinksEventTeam teamLinksEventTeam, int i, String str, FieldTranslations fieldTranslations, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = teamLinksEventTeam.id;
        }
        if ((i2 & 2) != 0) {
            str = teamLinksEventTeam.name;
        }
        if ((i2 & 4) != 0) {
            fieldTranslations = teamLinksEventTeam.fieldTranslations;
        }
        return teamLinksEventTeam.copy(i, str, fieldTranslations);
    }

    public static final /* synthetic */ void write$Self$model_release(TeamLinksEventTeam self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.name);
        output.h(serialDesc, 2, FieldTranslations$$serializer.INSTANCE, self.fieldTranslations);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    @NotNull
    public final TeamLinksEventTeam copy(int id, @NotNull String name, @Nullable FieldTranslations fieldTranslations) {
        name.getClass();
        return new TeamLinksEventTeam(id, name, fieldTranslations);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamLinksEventTeam)) {
            return false;
        }
        TeamLinksEventTeam teamLinksEventTeam = (TeamLinksEventTeam) other;
        return this.id == teamLinksEventTeam.id && Intrinsics.c(this.name, teamLinksEventTeam.name) && Intrinsics.c(this.fieldTranslations, teamLinksEventTeam.fieldTranslations);
    }

    @Nullable
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int c = dmi.c(Integer.hashCode(this.id) * 31, 31, this.name);
        FieldTranslations fieldTranslations = this.fieldTranslations;
        return c + (fieldTranslations == null ? 0 : fieldTranslations.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.name;
        FieldTranslations fieldTranslations = this.fieldTranslations;
        StringBuilder t = dmi.t(i, "TeamLinksEventTeam(id=", ", name=", str, ", fieldTranslations=");
        t.append(fieldTranslations);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/TeamLinksEventTeam$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/TeamLinksEventTeam;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TeamLinksEventTeam$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TeamLinksEventTeam(int i, @NotNull String str, @Nullable FieldTranslations fieldTranslations) {
        str.getClass();
        this.id = i;
        this.name = str;
        this.fieldTranslations = fieldTranslations;
    }
}
