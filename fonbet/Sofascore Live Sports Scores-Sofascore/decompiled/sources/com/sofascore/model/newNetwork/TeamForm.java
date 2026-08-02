package com.sofascore.model.newNetwork;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Team;
import defpackage.bxi;
import defpackage.dmi;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\"JR\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001dJ\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001fJ\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\"R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b4\u0010\"R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamForm;", "Ljava/io/Serializable;", "", "avgRating", "", "position", U3.i.X, "", "form", "Lcom/sofascore/model/newNetwork/TypeForm;", "winTypeForm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;)V", "seen0", "Lcom/sofascore/model/mvvm/model/Team;", "team", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/sofascore/model/mvvm/model/Team;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TeamForm;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Ljava/util/List;", "component5", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/TeamForm;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAvgRating", "I", "getPosition", "getValue", "Ljava/util/List;", "getForm", "getWinTypeForm", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "()Lcom/sofascore/model/mvvm/model/Team;", "setTeam", "(Lcom/sofascore/model/mvvm/model/Team;)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamForm implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String avgRating;

    @NotNull
    private final List<String> form;
    private final int position;

    @Nullable
    private Team team;

    @NotNull
    private final String value;

    @Nullable
    private final List<TypeForm> winTypeForm;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, ypa.a(ysaVar, new bxi(0)), ypa.a(ysaVar, new bxi(1)), ypa.a(ysaVar, new bxi(2))};
    }

    public /* synthetic */ TeamForm(int i, String str, int i2, String str2, List list, List list2, Team team, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, TeamForm$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.avgRating = str;
        this.position = i2;
        this.value = str2;
        this.form = list;
        this.winTypeForm = list2;
        if ((i & 32) == 0) {
            this.team = null;
        } else {
            this.team = team;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(uhi.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TypeForm$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ TeamForm copy$default(TeamForm teamForm, String str, int i, String str2, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = teamForm.avgRating;
        }
        if ((i2 & 2) != 0) {
            i = teamForm.position;
        }
        if ((i2 & 4) != 0) {
            str2 = teamForm.value;
        }
        if ((i2 & 8) != 0) {
            list = teamForm.form;
        }
        if ((i2 & 16) != 0) {
            list2 = teamForm.winTypeForm;
        }
        List list3 = list2;
        String str3 = str2;
        return teamForm.copy(str, i, str3, list, list3);
    }

    public static final /* synthetic */ void write$Self$model_release(TeamForm self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, uhi.a, self.avgRating);
        output.u(1, self.position, serialDesc);
        output.y(serialDesc, 2, self.value);
        output.f(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.form);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.winTypeForm);
        if (!output.o(serialDesc) && self.team == null) {
            return;
        }
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.team);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getAvgRating() {
        return this.avgRating;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final List<String> component4() {
        return this.form;
    }

    @Nullable
    public final List<TypeForm> component5() {
        return this.winTypeForm;
    }

    @NotNull
    public final TeamForm copy(@Nullable String avgRating, int position, @NotNull String value, @NotNull List<String> form, @Nullable List<TypeForm> winTypeForm) {
        value.getClass();
        form.getClass();
        return new TeamForm(avgRating, position, value, form, winTypeForm);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamForm)) {
            return false;
        }
        TeamForm teamForm = (TeamForm) other;
        return Intrinsics.c(this.avgRating, teamForm.avgRating) && this.position == teamForm.position && Intrinsics.c(this.value, teamForm.value) && Intrinsics.c(this.form, teamForm.form) && Intrinsics.c(this.winTypeForm, teamForm.winTypeForm);
    }

    @Nullable
    public final String getAvgRating() {
        return this.avgRating;
    }

    @NotNull
    public final List<String> getForm() {
        return this.form;
    }

    public final int getPosition() {
        return this.position;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    @Nullable
    public final List<TypeForm> getWinTypeForm() {
        return this.winTypeForm;
    }

    public int hashCode() {
        String str = this.avgRating;
        int d = dmi.d(dmi.c(wv8.a(this.position, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.value), 31, this.form);
        List<TypeForm> list = this.winTypeForm;
        return d + (list != null ? list.hashCode() : 0);
    }

    public final void setTeam(@Nullable Team team) {
        this.team = team;
    }

    @NotNull
    public String toString() {
        String str = this.avgRating;
        int i = this.position;
        String str2 = this.value;
        List<String> list = this.form;
        List<TypeForm> list2 = this.winTypeForm;
        StringBuilder q = mz1.q(i, "TeamForm(avgRating=", str, ", position=", ", value=");
        q.append(str2);
        q.append(", form=");
        q.append(list);
        q.append(", winTypeForm=");
        return mz1.p(q, list2, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamForm$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TeamForm;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TeamForm$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TeamForm(@Nullable String str, int i, @NotNull String str2, @NotNull List<String> list, @Nullable List<TypeForm> list2) {
        str2.getClass();
        list.getClass();
        this.avgRating = str;
        this.position = i;
        this.value = str2;
        this.form = list;
        this.winTypeForm = list2;
    }
}
