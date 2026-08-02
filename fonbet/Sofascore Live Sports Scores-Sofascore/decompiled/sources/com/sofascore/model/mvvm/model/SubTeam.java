package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.ironsource.Y1;
import defpackage.dmi;
import defpackage.ljg;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.wx4;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NMBa\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0014Bu\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u0012\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J|\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010\u001cJ\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001aJ\u001a\u0010/\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b@\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bB\u0010\u001fR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\bC\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010\"R\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bF\u0010\"R\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010<\u0012\u0004\bH\u0010?\u001a\u0004\bG\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bJ\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\bL\u0010(¨\u0006O"}, d2 = {"Lcom/sofascore/model/mvvm/model/SubTeam;", "Ljava/io/Serializable;", "", "id", "", "name", "slug", "", "userCount", "type", "", Y1.e, "national", "shortName", "Lcom/sofascore/model/mvvm/model/Country;", "country", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "fieldTranslations", "<init>", "(ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Lcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/mvvm/model/FieldTranslations;)V", "(ILjava/lang/String;Lcom/sofascore/model/mvvm/model/FieldTranslations;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Lcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/mvvm/model/FieldTranslations;Lt5h;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()J", "component5", "component6", "()Z", "component7", "component8", "component9", "()Lcom/sofascore/model/mvvm/model/Country;", "component10", "()Lcom/sofascore/model/mvvm/model/FieldTranslations;", "copy", "(ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Lcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/mvvm/model/FieldTranslations;)Lcom/sofascore/model/mvvm/model/SubTeam;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/SubTeam;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "getSlug", "J", "getUserCount", "getType", "Z", "getDisabled", "getNational", "getShortName", "getShortName$annotations", "Lcom/sofascore/model/mvvm/model/Country;", "getCountry", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "getFieldTranslations", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SubTeam implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Country country;
    private final boolean disabled;

    @Nullable
    private final FieldTranslations fieldTranslations;
    private final int id;

    @Nullable
    private final String name;
    private final boolean national;

    @Nullable
    private final String shortName;

    @NotNull
    private final String slug;
    private final int type;
    private final long userCount;

    public /* synthetic */ SubTeam(int i, int i2, String str, String str2, long j, int i3, boolean z, boolean z2, String str3, Country country, FieldTranslations fieldTranslations, t5h t5hVar) {
        if (991 != (i & 991)) {
            oea.z(i, 991, SubTeam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.name = str;
        this.slug = str2;
        this.userCount = j;
        this.type = i3;
        if ((i & 32) == 0) {
            this.disabled = false;
        } else {
            this.disabled = z;
        }
        this.national = z2;
        this.shortName = str3;
        this.country = country;
        this.fieldTranslations = fieldTranslations;
    }

    public static /* synthetic */ SubTeam copy$default(SubTeam subTeam, int i, String str, String str2, long j, int i2, boolean z, boolean z2, String str3, Country country, FieldTranslations fieldTranslations, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = subTeam.id;
        }
        if ((i3 & 2) != 0) {
            str = subTeam.name;
        }
        if ((i3 & 4) != 0) {
            str2 = subTeam.slug;
        }
        if ((i3 & 8) != 0) {
            j = subTeam.userCount;
        }
        if ((i3 & 16) != 0) {
            i2 = subTeam.type;
        }
        if ((i3 & 32) != 0) {
            z = subTeam.disabled;
        }
        if ((i3 & 64) != 0) {
            z2 = subTeam.national;
        }
        if ((i3 & 128) != 0) {
            str3 = subTeam.shortName;
        }
        if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            country = subTeam.country;
        }
        if ((i3 & 512) != 0) {
            fieldTranslations = subTeam.fieldTranslations;
        }
        Country country2 = country;
        FieldTranslations fieldTranslations2 = fieldTranslations;
        long j2 = j;
        String str4 = str2;
        return subTeam.copy(i, str, str4, j2, i2, z, z2, str3, country2, fieldTranslations2);
    }

    public static final /* synthetic */ void write$Self$model_release(SubTeam self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 1, uhiVar, self.name);
        output.y(serialDesc, 2, self.slug);
        output.E(serialDesc, 3, self.userCount);
        output.u(4, self.type, serialDesc);
        if (output.o(serialDesc) || self.disabled) {
            output.x(serialDesc, 5, self.disabled);
        }
        output.x(serialDesc, 6, self.national);
        output.h(serialDesc, 7, uhiVar, self.shortName);
        output.h(serialDesc, 8, Country$$serializer.INSTANCE, self.country);
        output.h(serialDesc, 9, FieldTranslations$$serializer.INSTANCE, self.fieldTranslations);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    /* renamed from: component4, reason: from getter */
    public final long getUserCount() {
        return this.userCount;
    }

    /* renamed from: component5, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getNational() {
        return this.national;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Country getCountry() {
        return this.country;
    }

    @NotNull
    public final SubTeam copy(int id, @Nullable String name, @NotNull String slug, long userCount, int type, boolean disabled, boolean national, @Nullable String shortName, @Nullable Country country, @Nullable FieldTranslations fieldTranslations) {
        slug.getClass();
        return new SubTeam(id, name, slug, userCount, type, disabled, national, shortName, country, fieldTranslations);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubTeam)) {
            return false;
        }
        SubTeam subTeam = (SubTeam) other;
        return this.id == subTeam.id && Intrinsics.c(this.name, subTeam.name) && Intrinsics.c(this.slug, subTeam.slug) && this.userCount == subTeam.userCount && this.type == subTeam.type && this.disabled == subTeam.disabled && this.national == subTeam.national && Intrinsics.c(this.shortName, subTeam.shortName) && Intrinsics.c(this.country, subTeam.country) && Intrinsics.c(this.fieldTranslations, subTeam.fieldTranslations);
    }

    @Nullable
    public final Country getCountry() {
        return this.country;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    @Nullable
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final boolean getNational() {
        return this.national;
    }

    @Nullable
    public final String getShortName() {
        return this.shortName;
    }

    @NotNull
    public final String getSlug() {
        return this.slug;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUserCount() {
        return this.userCount;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.name;
        int e = dmi.e(dmi.e(wv8.a(this.type, ljg.c(dmi.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.slug), 31, this.userCount), 31), 31, this.disabled), 31, this.national);
        String str2 = this.shortName;
        int hashCode2 = (e + (str2 == null ? 0 : str2.hashCode())) * 31;
        Country country = this.country;
        int hashCode3 = (hashCode2 + (country == null ? 0 : country.hashCode())) * 31;
        FieldTranslations fieldTranslations = this.fieldTranslations;
        return hashCode3 + (fieldTranslations != null ? fieldTranslations.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.name;
        String str2 = this.slug;
        long j = this.userCount;
        int i2 = this.type;
        boolean z = this.disabled;
        boolean z2 = this.national;
        String str3 = this.shortName;
        Country country = this.country;
        FieldTranslations fieldTranslations = this.fieldTranslations;
        StringBuilder t = dmi.t(i, "SubTeam(id=", ", name=", str, ", slug=");
        i.n(j, str2, ", userCount=", t);
        t.append(", type=");
        t.append(i2);
        t.append(", disabled=");
        t.append(z);
        t.append(", national=");
        t.append(z2);
        t.append(", shortName=");
        t.append(str3);
        t.append(", country=");
        t.append(country);
        t.append(", fieldTranslations=");
        t.append(fieldTranslations);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/SubTeam$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/SubTeam;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SubTeam$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @wx4
    public static /* synthetic */ void getName$annotations() {
    }

    @wx4
    public static /* synthetic */ void getShortName$annotations() {
    }

    public SubTeam(int i, @Nullable String str, @NotNull String str2, long j, int i2, boolean z, boolean z2, @Nullable String str3, @Nullable Country country, @Nullable FieldTranslations fieldTranslations) {
        str2.getClass();
        this.id = i;
        this.name = str;
        this.slug = str2;
        this.userCount = j;
        this.type = i2;
        this.disabled = z;
        this.national = z2;
        this.shortName = str3;
        this.country = country;
        this.fieldTranslations = fieldTranslations;
    }

    public /* synthetic */ SubTeam(int i, String str, String str2, long j, int i2, boolean z, boolean z2, String str3, Country country, FieldTranslations fieldTranslations, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, j, i2, (i3 & 32) != 0 ? false : z, z2, str3, country, fieldTranslations);
    }

    public SubTeam(int i, @Nullable String str, @Nullable FieldTranslations fieldTranslations) {
        this(i, str, "slug", 0L, 0, false, false, null, null, fieldTranslations);
    }
}
