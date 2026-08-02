package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.mvvm.IUrlSharing;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.lkb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
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
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 `2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002a`By\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B£\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0016\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010)J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010)J\u0012\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b/\u0010.J\u0012\u00100\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b2\u00103J\u009a\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b6\u0010$J\u0010\u00107\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b7\u0010\"J\u001a\u0010:\u001a\u00020\u00192\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b:\u0010;J'\u0010D\u001a\u00020A2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0001¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bF\u0010\"R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010G\u0012\u0004\bI\u0010J\u001a\u0004\bH\u0010$R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010G\u001a\u0004\bK\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010L\u001a\u0004\bM\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010N\u001a\u0004\bO\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010N\u001a\u0004\bP\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010N\u001a\u0004\bQ\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010N\u001a\u0004\bR\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010S\u001a\u0004\bT\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010S\u001a\u0004\bU\u0010.R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010V\u001a\u0004\bW\u00101R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010X\u001a\u0004\bY\u00103R\"\u0010\u001a\u001a\u00020\u00198\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010Z\u001a\u0004\b\u001a\u0010 \"\u0004\b[\u0010\\R\u001a\u0010\u001b\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010G\u001a\u0004\b]\u0010$R\u0016\u0010_\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010$¨\u0006b"}, d2 = {"Lcom/sofascore/model/mvvm/model/Referee;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/IRecent;", "Lcom/sofascore/model/mvvm/IUrlSharing;", "", "id", "", "name", "slug", "Lcom/sofascore/model/mvvm/model/Country;", "country", "yellowCards", "redCards", "yellowRedCards", "games", "", "dateOfBirthTimestamp", "firstLeagueDebutTimestamp", "Lcom/sofascore/model/mvvm/model/Sport;", SearchResponseKt.SPORT_ENTITY, "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "fieldTranslations", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Country;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Lcom/sofascore/model/mvvm/model/Sport;Lcom/sofascore/model/mvvm/model/FieldTranslations;)V", "seen0", "", "isRecent", "webUrl", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Country;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Lcom/sofascore/model/mvvm/model/Sport;Lcom/sofascore/model/mvvm/model/FieldTranslations;ZLjava/lang/String;Lt5h;)V", "hasCards", "()Z", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/sofascore/model/mvvm/model/Country;", "component5", "()Ljava/lang/Integer;", "component6", "component7", "component8", "component9", "()Ljava/lang/Long;", "component10", "component11", "()Lcom/sofascore/model/mvvm/model/Sport;", "component12", "()Lcom/sofascore/model/mvvm/model/FieldTranslations;", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Country;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Lcom/sofascore/model/mvvm/model/Sport;Lcom/sofascore/model/mvvm/model/FieldTranslations;)Lcom/sofascore/model/mvvm/model/Referee;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Referee;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "getSlug", "Lcom/sofascore/model/mvvm/model/Country;", "getCountry", "Ljava/lang/Integer;", "getYellowCards", "getRedCards", "getYellowRedCards", "getGames", "Ljava/lang/Long;", "getDateOfBirthTimestamp", "getFirstLeagueDebutTimestamp", "Lcom/sofascore/model/mvvm/model/Sport;", "getSport", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "getFieldTranslations", "Z", "setRecent", "(Z)V", "getWebUrl", "getSportSlug", "sportSlug", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Referee implements Serializable, IRecent, IUrlSharing {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Country country;

    @Nullable
    private final Long dateOfBirthTimestamp;

    @Nullable
    private final FieldTranslations fieldTranslations;

    @Nullable
    private final Long firstLeagueDebutTimestamp;

    @Nullable
    private final Integer games;
    private final int id;
    private boolean isRecent;

    @NotNull
    private final String name;

    @Nullable
    private final Integer redCards;

    @NotNull
    private final String slug;

    @Nullable
    private final Sport sport;

    @NotNull
    private final String webUrl;

    @Nullable
    private final Integer yellowCards;

    @Nullable
    private final Integer yellowRedCards;

    public /* synthetic */ Referee(int i, int i2, String str, String str2, Country country, Integer num, Integer num2, Integer num3, Integer num4, Long l, Long l2, Sport sport, FieldTranslations fieldTranslations, boolean z, String str3, t5h t5hVar) {
        if (4095 != (i & 4095)) {
            oea.z(i, 4095, Referee$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.name = str;
        this.slug = str2;
        this.country = country;
        this.yellowCards = num;
        this.redCards = num2;
        this.yellowRedCards = num3;
        this.games = num4;
        this.dateOfBirthTimestamp = l;
        this.firstLeagueDebutTimestamp = l2;
        this.sport = sport;
        this.fieldTranslations = fieldTranslations;
        this.isRecent = (i & 4096) == 0 ? false : z;
        this.webUrl = (i & 8192) == 0 ? dmi.l(getId(), "/referee/", str2, "/") : str3;
    }

    public static /* synthetic */ Referee copy$default(Referee referee, int i, String str, String str2, Country country, Integer num, Integer num2, Integer num3, Integer num4, Long l, Long l2, Sport sport, FieldTranslations fieldTranslations, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = referee.id;
        }
        if ((i2 & 2) != 0) {
            str = referee.name;
        }
        if ((i2 & 4) != 0) {
            str2 = referee.slug;
        }
        if ((i2 & 8) != 0) {
            country = referee.country;
        }
        if ((i2 & 16) != 0) {
            num = referee.yellowCards;
        }
        if ((i2 & 32) != 0) {
            num2 = referee.redCards;
        }
        if ((i2 & 64) != 0) {
            num3 = referee.yellowRedCards;
        }
        if ((i2 & 128) != 0) {
            num4 = referee.games;
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            l = referee.dateOfBirthTimestamp;
        }
        if ((i2 & 512) != 0) {
            l2 = referee.firstLeagueDebutTimestamp;
        }
        if ((i2 & 1024) != 0) {
            sport = referee.sport;
        }
        if ((i2 & a.o) != 0) {
            fieldTranslations = referee.fieldTranslations;
        }
        Sport sport2 = sport;
        FieldTranslations fieldTranslations2 = fieldTranslations;
        Long l3 = l;
        Long l4 = l2;
        Integer num5 = num3;
        Integer num6 = num4;
        Integer num7 = num;
        Integer num8 = num2;
        return referee.copy(i, str, str2, country, num7, num8, num5, num6, l3, l4, sport2, fieldTranslations2);
    }

    public static final /* synthetic */ void write$Self$model_release(Referee self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.getId(), serialDesc);
        output.y(serialDesc, 1, self.name);
        output.y(serialDesc, 2, self.slug);
        output.h(serialDesc, 3, Country$$serializer.INSTANCE, self.country);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 4, a7aVar, self.yellowCards);
        output.h(serialDesc, 5, a7aVar, self.redCards);
        output.h(serialDesc, 6, a7aVar, self.yellowRedCards);
        output.h(serialDesc, 7, a7aVar, self.games);
        lkb lkbVar = lkb.a;
        output.h(serialDesc, 8, lkbVar, self.dateOfBirthTimestamp);
        output.h(serialDesc, 9, lkbVar, self.firstLeagueDebutTimestamp);
        output.h(serialDesc, 10, Sport$$serializer.INSTANCE, self.sport);
        output.h(serialDesc, 11, FieldTranslations$$serializer.INSTANCE, self.fieldTranslations);
        if (output.o(serialDesc) || self.getIsRecent()) {
            output.x(serialDesc, 12, self.getIsRecent());
        }
        if (!output.o(serialDesc)) {
            if (Intrinsics.c(self.getWebUrl(), "/referee/" + self.slug + "/" + self.getId())) {
                return;
            }
        }
        output.y(serialDesc, 13, self.getWebUrl());
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Long getFirstLeagueDebutTimestamp() {
        return this.firstLeagueDebutTimestamp;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Sport getSport() {
        return this.sport;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Country getCountry() {
        return this.country;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getRedCards() {
        return this.redCards;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getYellowRedCards() {
        return this.yellowRedCards;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getGames() {
        return this.games;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Long getDateOfBirthTimestamp() {
        return this.dateOfBirthTimestamp;
    }

    @NotNull
    public final Referee copy(int id, @NotNull String name, @NotNull String slug, @Nullable Country country, @Nullable Integer yellowCards, @Nullable Integer redCards, @Nullable Integer yellowRedCards, @Nullable Integer games, @Nullable Long dateOfBirthTimestamp, @Nullable Long firstLeagueDebutTimestamp, @Nullable Sport sport, @Nullable FieldTranslations fieldTranslations) {
        name.getClass();
        slug.getClass();
        return new Referee(id, name, slug, country, yellowCards, redCards, yellowRedCards, games, dateOfBirthTimestamp, firstLeagueDebutTimestamp, sport, fieldTranslations);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Referee)) {
            return false;
        }
        Referee referee = (Referee) other;
        return this.id == referee.id && Intrinsics.c(this.name, referee.name) && Intrinsics.c(this.slug, referee.slug) && Intrinsics.c(this.country, referee.country) && Intrinsics.c(this.yellowCards, referee.yellowCards) && Intrinsics.c(this.redCards, referee.redCards) && Intrinsics.c(this.yellowRedCards, referee.yellowRedCards) && Intrinsics.c(this.games, referee.games) && Intrinsics.c(this.dateOfBirthTimestamp, referee.dateOfBirthTimestamp) && Intrinsics.c(this.firstLeagueDebutTimestamp, referee.firstLeagueDebutTimestamp) && Intrinsics.c(this.sport, referee.sport) && Intrinsics.c(this.fieldTranslations, referee.fieldTranslations);
    }

    @Nullable
    public final Country getCountry() {
        return this.country;
    }

    @Nullable
    public final Long getDateOfBirthTimestamp() {
        return this.dateOfBirthTimestamp;
    }

    @Nullable
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    @Nullable
    public final Long getFirstLeagueDebutTimestamp() {
        return this.firstLeagueDebutTimestamp;
    }

    @Nullable
    public final Integer getGames() {
        return this.games;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    public int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getRedCards() {
        return this.redCards;
    }

    @NotNull
    public final String getSlug() {
        return this.slug;
    }

    @Nullable
    public final Sport getSport() {
        return this.sport;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    @Nullable
    public String getSportSlug() {
        Sport sport = this.sport;
        if (sport != null) {
            return sport.getSlug();
        }
        return null;
    }

    @Override // com.sofascore.model.mvvm.IUrlSharing
    @NotNull
    public String getWebUrl() {
        return this.webUrl;
    }

    @Nullable
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    @Nullable
    public final Integer getYellowRedCards() {
        return this.yellowRedCards;
    }

    public final boolean hasCards() {
        Integer num;
        return (this.yellowCards == null || this.redCards == null || this.yellowRedCards == null || (num = this.games) == null || num.intValue() <= 0) ? false : true;
    }

    public int hashCode() {
        int c = dmi.c(dmi.c(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.slug);
        Country country = this.country;
        int hashCode = (c + (country == null ? 0 : country.hashCode())) * 31;
        Integer num = this.yellowCards;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.redCards;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.yellowRedCards;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.games;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l = this.dateOfBirthTimestamp;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.firstLeagueDebutTimestamp;
        int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Sport sport = this.sport;
        int hashCode8 = (hashCode7 + (sport == null ? 0 : sport.hashCode())) * 31;
        FieldTranslations fieldTranslations = this.fieldTranslations;
        return hashCode8 + (fieldTranslations != null ? fieldTranslations.hashCode() : 0);
    }

    @Override // com.sofascore.model.mvvm.IRecent
    /* renamed from: isRecent, reason: from getter */
    public boolean getIsRecent() {
        return this.isRecent;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    public void setRecent(boolean z) {
        this.isRecent = z;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.name;
        String str2 = this.slug;
        Country country = this.country;
        Integer num = this.yellowCards;
        Integer num2 = this.redCards;
        Integer num3 = this.yellowRedCards;
        Integer num4 = this.games;
        Long l = this.dateOfBirthTimestamp;
        Long l2 = this.firstLeagueDebutTimestamp;
        Sport sport = this.sport;
        FieldTranslations fieldTranslations = this.fieldTranslations;
        StringBuilder t = dmi.t(i, "Referee(id=", ", name=", str, ", slug=");
        t.append(str2);
        t.append(", country=");
        t.append(country);
        t.append(", yellowCards=");
        vxd.r(num, num2, ", redCards=", ", yellowRedCards=", t);
        vxd.r(num3, num4, ", games=", ", dateOfBirthTimestamp=", t);
        t.append(l);
        t.append(", firstLeagueDebutTimestamp=");
        t.append(l2);
        t.append(", sport=");
        t.append(sport);
        t.append(", fieldTranslations=");
        t.append(fieldTranslations);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Referee$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Referee;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Referee$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @wx4
    public static /* synthetic */ void getName$annotations() {
    }

    public Referee(int i, @NotNull String str, @NotNull String str2, @Nullable Country country, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Long l, @Nullable Long l2, @Nullable Sport sport, @Nullable FieldTranslations fieldTranslations) {
        str.getClass();
        str2.getClass();
        this.id = i;
        this.name = str;
        this.slug = str2;
        this.country = country;
        this.yellowCards = num;
        this.redCards = num2;
        this.yellowRedCards = num3;
        this.games = num4;
        this.dateOfBirthTimestamp = l;
        this.firstLeagueDebutTimestamp = l2;
        this.sport = sport;
        this.fieldTranslations = fieldTranslations;
        this.webUrl = dmi.l(getId(), "/referee/", str2, "/");
    }
}
