package com.sofascore.model.fantasy;

import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Category$$serializer;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.jf7;
import defpackage.joa;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.w1l;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b)\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011Bk\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b-\u0010,Jj\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b0\u0010$J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010 J\u001a\u00103\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010(R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\b\u000e\u0010,R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\b\u000f\u0010,¨\u0006D"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyUpcomingCompetition;", "", "", "id", "Lcom/sofascore/model/fantasy/FantasyCompetitionType;", "type", "", "name", "uniqueTournamentId", "Lcom/sofascore/model/mvvm/model/Category;", "category", "", "countries", "", "isAlpha", "isOfficial", "<init>", "(ILcom/sofascore/model/fantasy/FantasyCompetitionType;Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Category;Ljava/util/List;ZZ)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/fantasy/FantasyCompetitionType;Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Category;Ljava/util/List;ZZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyUpcomingCompetition;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Lcom/sofascore/model/fantasy/FantasyCompetitionType;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Integer;", "component5", "()Lcom/sofascore/model/mvvm/model/Category;", "component6", "()Ljava/util/List;", "component7", "()Z", "component8", "copy", "(ILcom/sofascore/model/fantasy/FantasyCompetitionType;Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Category;Ljava/util/List;ZZ)Lcom/sofascore/model/fantasy/FantasyUpcomingCompetition;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lcom/sofascore/model/fantasy/FantasyCompetitionType;", "getType", "Ljava/lang/String;", "getName", "Ljava/lang/Integer;", "getUniqueTournamentId", "Lcom/sofascore/model/mvvm/model/Category;", "getCategory", "Ljava/util/List;", "getCountries", "Z", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyUpcomingCompetition {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Category category;

    @Nullable
    private final List<String> countries;
    private final int id;
    private final boolean isAlpha;
    private final boolean isOfficial;

    @NotNull
    private final String name;

    @NotNull
    private final FantasyCompetitionType type;

    @Nullable
    private final Integer uniqueTournamentId;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, ypa.a(ysaVar, new jf7(26)), null, null, null, ypa.a(ysaVar, new jf7(27)), null, null};
    }

    public /* synthetic */ FantasyUpcomingCompetition(int i, int i2, FantasyCompetitionType fantasyCompetitionType, String str, Integer num, Category category, List list, boolean z, boolean z2, t5h t5hVar) {
        if (253 != (i & 253)) {
            oea.z(i, 253, FantasyUpcomingCompetition$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        if ((i & 2) == 0) {
            this.type = FantasyCompetitionType.SEASON;
        } else {
            this.type = fantasyCompetitionType;
        }
        this.name = str;
        this.uniqueTournamentId = num;
        this.category = category;
        this.countries = list;
        this.isAlpha = z;
        this.isOfficial = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return FantasyCompetitionType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(uhi.a, 0);
    }

    public static /* synthetic */ FantasyUpcomingCompetition copy$default(FantasyUpcomingCompetition fantasyUpcomingCompetition, int i, FantasyCompetitionType fantasyCompetitionType, String str, Integer num, Category category, List list, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fantasyUpcomingCompetition.id;
        }
        if ((i2 & 2) != 0) {
            fantasyCompetitionType = fantasyUpcomingCompetition.type;
        }
        if ((i2 & 4) != 0) {
            str = fantasyUpcomingCompetition.name;
        }
        if ((i2 & 8) != 0) {
            num = fantasyUpcomingCompetition.uniqueTournamentId;
        }
        if ((i2 & 16) != 0) {
            category = fantasyUpcomingCompetition.category;
        }
        if ((i2 & 32) != 0) {
            list = fantasyUpcomingCompetition.countries;
        }
        if ((i2 & 64) != 0) {
            z = fantasyUpcomingCompetition.isAlpha;
        }
        if ((i2 & 128) != 0) {
            z2 = fantasyUpcomingCompetition.isOfficial;
        }
        boolean z3 = z;
        boolean z4 = z2;
        Category category2 = category;
        List list2 = list;
        return fantasyUpcomingCompetition.copy(i, fantasyCompetitionType, str, num, category2, list2, z3, z4);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyUpcomingCompetition self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        if (output.o(serialDesc) || self.type != FantasyCompetitionType.SEASON) {
            output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.type);
        }
        output.y(serialDesc, 2, self.name);
        output.h(serialDesc, 3, a7a.a, self.uniqueTournamentId);
        output.f(serialDesc, 4, Category$$serializer.INSTANCE, self.category);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.countries);
        output.x(serialDesc, 6, self.isAlpha);
        output.x(serialDesc, 7, self.isOfficial);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FantasyCompetitionType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getUniqueTournamentId() {
        return this.uniqueTournamentId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Category getCategory() {
        return this.category;
    }

    @Nullable
    public final List<String> component6() {
        return this.countries;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsAlpha() {
        return this.isAlpha;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsOfficial() {
        return this.isOfficial;
    }

    @NotNull
    public final FantasyUpcomingCompetition copy(int id, @NotNull FantasyCompetitionType type, @NotNull String name, @Nullable Integer uniqueTournamentId, @NotNull Category category, @Nullable List<String> countries, boolean isAlpha, boolean isOfficial) {
        type.getClass();
        name.getClass();
        category.getClass();
        return new FantasyUpcomingCompetition(id, type, name, uniqueTournamentId, category, countries, isAlpha, isOfficial);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyUpcomingCompetition)) {
            return false;
        }
        FantasyUpcomingCompetition fantasyUpcomingCompetition = (FantasyUpcomingCompetition) other;
        return this.id == fantasyUpcomingCompetition.id && this.type == fantasyUpcomingCompetition.type && Intrinsics.c(this.name, fantasyUpcomingCompetition.name) && Intrinsics.c(this.uniqueTournamentId, fantasyUpcomingCompetition.uniqueTournamentId) && Intrinsics.c(this.category, fantasyUpcomingCompetition.category) && Intrinsics.c(this.countries, fantasyUpcomingCompetition.countries) && this.isAlpha == fantasyUpcomingCompetition.isAlpha && this.isOfficial == fantasyUpcomingCompetition.isOfficial;
    }

    @NotNull
    public final Category getCategory() {
        return this.category;
    }

    @Nullable
    public final List<String> getCountries() {
        return this.countries;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final FantasyCompetitionType getType() {
        return this.type;
    }

    @Nullable
    public final Integer getUniqueTournamentId() {
        return this.uniqueTournamentId;
    }

    public int hashCode() {
        int c = dmi.c((this.type.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31, this.name);
        Integer num = this.uniqueTournamentId;
        int hashCode = (this.category.hashCode() + ((c + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        List<String> list = this.countries;
        return Boolean.hashCode(this.isOfficial) + dmi.e((hashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.isAlpha);
    }

    public final boolean isAlpha() {
        return this.isAlpha;
    }

    public final boolean isOfficial() {
        return this.isOfficial;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        FantasyCompetitionType fantasyCompetitionType = this.type;
        String str = this.name;
        Integer num = this.uniqueTournamentId;
        Category category = this.category;
        List<String> list = this.countries;
        boolean z = this.isAlpha;
        boolean z2 = this.isOfficial;
        StringBuilder sb = new StringBuilder("FantasyUpcomingCompetition(id=");
        sb.append(i);
        sb.append(", type=");
        sb.append(fantasyCompetitionType);
        sb.append(", name=");
        me4.o(num, str, ", uniqueTournamentId=", ", category=", sb);
        sb.append(category);
        sb.append(", countries=");
        sb.append(list);
        sb.append(", isAlpha=");
        return w1l.i(", isOfficial=", ")", sb, z, z2);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyUpcomingCompetition$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyUpcomingCompetition;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyUpcomingCompetition$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyUpcomingCompetition(int i, @NotNull FantasyCompetitionType fantasyCompetitionType, @NotNull String str, @Nullable Integer num, @NotNull Category category, @Nullable List<String> list, boolean z, boolean z2) {
        fantasyCompetitionType.getClass();
        str.getClass();
        category.getClass();
        this.id = i;
        this.type = fantasyCompetitionType;
        this.name = str;
        this.uniqueTournamentId = num;
        this.category = category;
        this.countries = list;
        this.isAlpha = z;
        this.isOfficial = z2;
    }

    public /* synthetic */ FantasyUpcomingCompetition(int i, FantasyCompetitionType fantasyCompetitionType, String str, Integer num, Category category, List list, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? FantasyCompetitionType.SEASON : fantasyCompetitionType, str, num, category, list, z, z2);
    }
}
