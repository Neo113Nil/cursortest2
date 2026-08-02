package com.sofascore.results.firebase.announcement;

import androidx.annotation.Keep;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.jf7;
import defpackage.joa;
import defpackage.kf7;
import defpackage.km5;
import defpackage.lf7;
import defpackage.lm5;
import defpackage.m97;
import defpackage.me4;
import defpackage.oea;
import defpackage.of7;
import defpackage.q79;
import defpackage.qf7;
import defpackage.r5h;
import defpackage.sf7;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GHBm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u0011\u0010\u0012B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÂ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\nHÂ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0\fHÆ\u0003¢\u0006\u0004\b/\u0010.J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\b0\fHÆ\u0003¢\u0006\u0004\b0\u0010.J~\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\fHÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b3\u0010\u0018J\u0010\u00104\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010@R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010AR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bC\u0010.R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bD\u0010.R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\bE\u0010.¨\u0006I"}, d2 = {"Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncement;", "", "Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncementType;", "type", "Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncementLocation;", "location", "Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncementSeverity;", "severity", "", PglCryptUtils.KEY_MESSAGE, "", "translations", "", "", "competitions", "countries", "users", "<init>", "(Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncementType;Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncementLocation;Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncementSeverity;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncementType;Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncementLocation;Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncementSeverity;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component4", "()Ljava/lang/String;", "component5", "()Ljava/util/Map;", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$mobile_release", "(Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncement;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "locale", "getTranslatedMessage", "(Ljava/lang/String;)Ljava/lang/String;", "component1", "()Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncementType;", "component2", "()Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncementLocation;", "component3", "()Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncementSeverity;", "component6", "()Ljava/util/List;", "component7", "component8", "copy", "(Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncementType;Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncementLocation;Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncementSeverity;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncement;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncementType;", "getType", "Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncementLocation;", "getLocation", "Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncementSeverity;", "getSeverity", "Ljava/lang/String;", "Ljava/util/Map;", "Ljava/util/List;", "getCompetitions", "getCountries", "getUsers", "Companion", "kf7", "lf7", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyRemoteAnnouncement {

    @NotNull
    private static final joa[] $childSerializers;
    public static final int $stable = 0;

    @NotNull
    public static final lf7 Companion = new lf7();

    @NotNull
    private final List<Integer> competitions;

    @NotNull
    private final List<String> countries;

    @NotNull
    private final FantasyRemoteAnnouncementLocation location;

    @NotNull
    private final String message;

    @NotNull
    private final FantasyRemoteAnnouncementSeverity severity;

    @NotNull
    private final Map<String, String> translations;

    @NotNull
    private final FantasyRemoteAnnouncementType type;

    @NotNull
    private final List<String> users;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, null, ypa.a(ysaVar, new m97(29)), ypa.a(ysaVar, new jf7(0)), ypa.a(ysaVar, new jf7(1)), ypa.a(ysaVar, new jf7(2))};
    }

    public FantasyRemoteAnnouncement(int i, FantasyRemoteAnnouncementType fantasyRemoteAnnouncementType, FantasyRemoteAnnouncementLocation fantasyRemoteAnnouncementLocation, FantasyRemoteAnnouncementSeverity fantasyRemoteAnnouncementSeverity, String str, Map map, List list, List list2, List list3, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, kf7.a.getDescriptor());
            throw null;
        }
        this.type = fantasyRemoteAnnouncementType;
        this.location = fantasyRemoteAnnouncementLocation;
        this.severity = fantasyRemoteAnnouncementSeverity;
        this.message = str;
        if ((i & 16) == 0) {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            this.translations = lm5Var;
        } else {
            this.translations = map;
        }
        if ((i & 32) == 0) {
            this.competitions = km5.a;
        } else {
            this.competitions = list;
        }
        if ((i & 64) == 0) {
            this.countries = km5.a;
        } else {
            this.countries = list2;
        }
        if ((i & 128) == 0) {
            this.users = km5.a;
        } else {
            this.users = list3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        uhi uhiVar = uhi.a;
        return new q79(uhiVar, uhiVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(uhi.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(uhi.a, 0);
    }

    /* renamed from: component4, reason: from getter */
    private final String getMessage() {
        return this.message;
    }

    private final Map<String, String> component5() {
        return this.translations;
    }

    public static /* synthetic */ FantasyRemoteAnnouncement copy$default(FantasyRemoteAnnouncement fantasyRemoteAnnouncement, FantasyRemoteAnnouncementType fantasyRemoteAnnouncementType, FantasyRemoteAnnouncementLocation fantasyRemoteAnnouncementLocation, FantasyRemoteAnnouncementSeverity fantasyRemoteAnnouncementSeverity, String str, Map map, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            fantasyRemoteAnnouncementType = fantasyRemoteAnnouncement.type;
        }
        if ((i & 2) != 0) {
            fantasyRemoteAnnouncementLocation = fantasyRemoteAnnouncement.location;
        }
        if ((i & 4) != 0) {
            fantasyRemoteAnnouncementSeverity = fantasyRemoteAnnouncement.severity;
        }
        if ((i & 8) != 0) {
            str = fantasyRemoteAnnouncement.message;
        }
        if ((i & 16) != 0) {
            map = fantasyRemoteAnnouncement.translations;
        }
        if ((i & 32) != 0) {
            list = fantasyRemoteAnnouncement.competitions;
        }
        if ((i & 64) != 0) {
            list2 = fantasyRemoteAnnouncement.countries;
        }
        if ((i & 128) != 0) {
            list3 = fantasyRemoteAnnouncement.users;
        }
        List list4 = list2;
        List list5 = list3;
        Map map2 = map;
        List list6 = list;
        return fantasyRemoteAnnouncement.copy(fantasyRemoteAnnouncementType, fantasyRemoteAnnouncementLocation, fantasyRemoteAnnouncementSeverity, str, map2, list6, list4, list5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r1, r2) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void write$Self$mobile_release(FantasyRemoteAnnouncement self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, sf7.b, self.type);
        output.f(serialDesc, 1, of7.b, self.location);
        output.f(serialDesc, 2, qf7.b, self.severity);
        output.y(serialDesc, 3, self.message);
        if (!output.o(serialDesc)) {
            Map<String, String> map = self.translations;
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
        }
        output.f(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.translations);
        if (output.o(serialDesc) || !Intrinsics.c(self.competitions, km5.a)) {
            output.f(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.competitions);
        }
        if (output.o(serialDesc) || !Intrinsics.c(self.countries, km5.a)) {
            output.f(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.countries);
        }
        if (!output.o(serialDesc) && Intrinsics.c(self.users, km5.a)) {
            return;
        }
        output.f(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.users);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FantasyRemoteAnnouncementType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FantasyRemoteAnnouncementLocation getLocation() {
        return this.location;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final FantasyRemoteAnnouncementSeverity getSeverity() {
        return this.severity;
    }

    @NotNull
    public final List<Integer> component6() {
        return this.competitions;
    }

    @NotNull
    public final List<String> component7() {
        return this.countries;
    }

    @NotNull
    public final List<String> component8() {
        return this.users;
    }

    @NotNull
    public final FantasyRemoteAnnouncement copy(@NotNull FantasyRemoteAnnouncementType type, @NotNull FantasyRemoteAnnouncementLocation location, @NotNull FantasyRemoteAnnouncementSeverity severity, @NotNull String message, @NotNull Map<String, String> translations, @NotNull List<Integer> competitions, @NotNull List<String> countries, @NotNull List<String> users) {
        type.getClass();
        location.getClass();
        severity.getClass();
        message.getClass();
        translations.getClass();
        competitions.getClass();
        countries.getClass();
        users.getClass();
        return new FantasyRemoteAnnouncement(type, location, severity, message, translations, competitions, countries, users);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyRemoteAnnouncement)) {
            return false;
        }
        FantasyRemoteAnnouncement fantasyRemoteAnnouncement = (FantasyRemoteAnnouncement) other;
        return this.type == fantasyRemoteAnnouncement.type && this.location == fantasyRemoteAnnouncement.location && this.severity == fantasyRemoteAnnouncement.severity && Intrinsics.c(this.message, fantasyRemoteAnnouncement.message) && Intrinsics.c(this.translations, fantasyRemoteAnnouncement.translations) && Intrinsics.c(this.competitions, fantasyRemoteAnnouncement.competitions) && Intrinsics.c(this.countries, fantasyRemoteAnnouncement.countries) && Intrinsics.c(this.users, fantasyRemoteAnnouncement.users);
    }

    @NotNull
    public final List<Integer> getCompetitions() {
        return this.competitions;
    }

    @NotNull
    public final List<String> getCountries() {
        return this.countries;
    }

    @NotNull
    public final FantasyRemoteAnnouncementLocation getLocation() {
        return this.location;
    }

    @NotNull
    public final FantasyRemoteAnnouncementSeverity getSeverity() {
        return this.severity;
    }

    @NotNull
    public final String getTranslatedMessage(@NotNull String locale) {
        locale.getClass();
        for (Map.Entry<String, String> entry : this.translations.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (c.v(locale, key, false)) {
                return value;
            }
        }
        return this.message;
    }

    @NotNull
    public final FantasyRemoteAnnouncementType getType() {
        return this.type;
    }

    @NotNull
    public final List<String> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return this.users.hashCode() + dmi.d(dmi.d(dmi.g(this.translations, dmi.c((this.severity.hashCode() + ((this.location.hashCode() + (this.type.hashCode() * 31)) * 31)) * 31, 31, this.message), 31), 31, this.competitions), 31, this.countries);
    }

    @NotNull
    public String toString() {
        FantasyRemoteAnnouncementType fantasyRemoteAnnouncementType = this.type;
        FantasyRemoteAnnouncementLocation fantasyRemoteAnnouncementLocation = this.location;
        FantasyRemoteAnnouncementSeverity fantasyRemoteAnnouncementSeverity = this.severity;
        String str = this.message;
        Map<String, String> map = this.translations;
        List<Integer> list = this.competitions;
        List<String> list2 = this.countries;
        List<String> list3 = this.users;
        StringBuilder sb = new StringBuilder("FantasyRemoteAnnouncement(type=");
        sb.append(fantasyRemoteAnnouncementType);
        sb.append(", location=");
        sb.append(fantasyRemoteAnnouncementLocation);
        sb.append(", severity=");
        sb.append(fantasyRemoteAnnouncementSeverity);
        sb.append(", message=");
        sb.append(str);
        sb.append(", translations=");
        sb.append(map);
        sb.append(", competitions=");
        sb.append(list);
        sb.append(", countries=");
        return me4.j(sb, list2, ", users=", list3, ")");
    }

    public FantasyRemoteAnnouncement(@NotNull FantasyRemoteAnnouncementType fantasyRemoteAnnouncementType, @NotNull FantasyRemoteAnnouncementLocation fantasyRemoteAnnouncementLocation, @NotNull FantasyRemoteAnnouncementSeverity fantasyRemoteAnnouncementSeverity, @NotNull String str, @NotNull Map<String, String> map, @NotNull List<Integer> list, @NotNull List<String> list2, @NotNull List<String> list3) {
        fantasyRemoteAnnouncementType.getClass();
        fantasyRemoteAnnouncementLocation.getClass();
        fantasyRemoteAnnouncementSeverity.getClass();
        str.getClass();
        map.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.type = fantasyRemoteAnnouncementType;
        this.location = fantasyRemoteAnnouncementLocation;
        this.severity = fantasyRemoteAnnouncementSeverity;
        this.message = str;
        this.translations = map;
        this.competitions = list;
        this.countries = list2;
        this.users = list3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FantasyRemoteAnnouncement(FantasyRemoteAnnouncementType fantasyRemoteAnnouncementType, FantasyRemoteAnnouncementLocation fantasyRemoteAnnouncementLocation, FantasyRemoteAnnouncementSeverity fantasyRemoteAnnouncementSeverity, String str, Map map, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fantasyRemoteAnnouncementType, fantasyRemoteAnnouncementLocation, fantasyRemoteAnnouncementSeverity, str, r7, (i & 32) != 0 ? km5.a : list, (i & 64) != 0 ? km5.a : list2, (i & 128) != 0 ? km5.a : list3);
        Map map2;
        if ((i & 16) != 0) {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            map2 = lm5Var;
        } else {
            map2 = map;
        }
    }
}
