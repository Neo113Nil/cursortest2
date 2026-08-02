package com.sofascore.local_persistance;

import androidx.core.app.NotificationCompat;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.dmi;
import defpackage.duf;
import defpackage.gc2;
import defpackage.lm5;
import defpackage.wx4;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B·\u0001\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u0003\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u0003\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0003\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#J½\u0001\u0010$\u001a\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00032\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u00032\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u00032\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00032\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b$\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b,\u0010+R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b-\u0010+R&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b.\u0010+R&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b/\u0010+R&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010)\u001a\u0004\b0\u0010+R&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b1\u0010+¨\u00063"}, d2 = {"Lcom/sofascore/local_persistance/BrandingConfig;", "Lcom/squareup/wire/Message;", "", "", "", "Lcom/sofascore/local_persistance/BrandingTeam;", "teams", "Lcom/sofascore/local_persistance/BrandingTournament;", "uniqueTournaments", "Lcom/sofascore/local_persistance/BrandingOddsTab;", "oddsTab", "Lcom/sofascore/local_persistance/MediaFeedTab;", "mediaFeedTab", "Lcom/sofascore/local_persistance/BrandingFantasyCompetition;", "fantasyCompetitions", "Lcom/sofascore/local_persistance/BrandingFeaturedTournament;", "featuredUniqueTournaments", "Lcom/sofascore/local_persistance/BrandingEvent;", "boostedOddsEvents", "partnerEvents", "Lgc2;", "unknownFields", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/sofascore/local_persistance/MediaFeedTab;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lgc2;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/sofascore/local_persistance/MediaFeedTab;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lgc2;)Lcom/sofascore/local_persistance/BrandingConfig;", "Lcom/sofascore/local_persistance/MediaFeedTab;", "getMediaFeedTab", "()Lcom/sofascore/local_persistance/MediaFeedTab;", "Ljava/util/Map;", "getTeams", "()Ljava/util/Map;", "getUniqueTournaments", "getOddsTab", "getFantasyCompetitions", "getFeaturedUniqueTournaments", "getBoostedOddsEvents", "getPartnerEvents", "Companion", "localPersistence_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BrandingConfig extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.sofascore.local_persistance.BrandingEvent#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    @NotNull
    private final Map<String, BrandingEvent> boostedOddsEvents;

    @WireField(adapter = "com.sofascore.local_persistance.BrandingFantasyCompetition#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    @NotNull
    private final Map<String, BrandingFantasyCompetition> fantasyCompetitions;

    @WireField(adapter = "com.sofascore.local_persistance.BrandingFeaturedTournament#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    @NotNull
    private final Map<String, BrandingFeaturedTournament> featuredUniqueTournaments;

    @WireField(adapter = "com.sofascore.local_persistance.MediaFeedTab#ADAPTER", schemaIndex = 3, tag = 4)
    @Nullable
    private final MediaFeedTab mediaFeedTab;

    @WireField(adapter = "com.sofascore.local_persistance.BrandingOddsTab#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    @NotNull
    private final Map<String, BrandingOddsTab> oddsTab;

    @WireField(adapter = "com.sofascore.local_persistance.BrandingEvent#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    @NotNull
    private final Map<String, BrandingEvent> partnerEvents;

    @WireField(adapter = "com.sofascore.local_persistance.BrandingTeam#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    @NotNull
    private final Map<String, BrandingTeam> teams;

    @WireField(adapter = "com.sofascore.local_persistance.BrandingTournament#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    @NotNull
    private final Map<String, BrandingTournament> uniqueTournaments;

    @NotNull
    public static final ProtoAdapter<BrandingConfig> ADAPTER = new BrandingConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, duf.a.getOrCreateKotlinClass(BrandingConfig.class), Syntax.PROTO_3);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BrandingConfig(Map map, Map map2, Map map3, MediaFeedTab mediaFeedTab, Map map4, Map map5, Map map6, Map map7, gc2 gc2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, map2, r5, mediaFeedTab, r7, map5, r9, map7, r11);
        if ((i & 1) != 0) {
            map = lm5.a;
            map.getClass();
        }
        if ((i & 2) != 0) {
            map2 = lm5.a;
            map2.getClass();
        }
        if ((i & 4) != 0) {
            map3 = lm5.a;
            map3.getClass();
        }
        mediaFeedTab = (i & 8) != 0 ? null : mediaFeedTab;
        if ((i & 16) != 0) {
            map4 = lm5.a;
            map4.getClass();
        }
        if ((i & 32) != 0) {
            map5 = lm5.a;
            map5.getClass();
        }
        if ((i & 64) != 0) {
            map6 = lm5.a;
            map6.getClass();
        }
        if ((i & 128) != 0) {
            map7 = lm5.a;
            map7.getClass();
        }
        gc2Var = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? gc2.d : gc2Var;
        gc2 gc2Var2 = gc2Var;
        Map map8 = map6;
        Map map9 = map4;
        Map map10 = map3;
        Map map11 = map;
    }

    public static /* synthetic */ BrandingConfig copy$default(BrandingConfig brandingConfig, Map map, Map map2, Map map3, MediaFeedTab mediaFeedTab, Map map4, Map map5, Map map6, Map map7, gc2 gc2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            map = brandingConfig.teams;
        }
        if ((i & 2) != 0) {
            map2 = brandingConfig.uniqueTournaments;
        }
        if ((i & 4) != 0) {
            map3 = brandingConfig.oddsTab;
        }
        if ((i & 8) != 0) {
            mediaFeedTab = brandingConfig.mediaFeedTab;
        }
        if ((i & 16) != 0) {
            map4 = brandingConfig.fantasyCompetitions;
        }
        if ((i & 32) != 0) {
            map5 = brandingConfig.featuredUniqueTournaments;
        }
        if ((i & 64) != 0) {
            map6 = brandingConfig.boostedOddsEvents;
        }
        if ((i & 128) != 0) {
            map7 = brandingConfig.partnerEvents;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            gc2Var = brandingConfig.unknownFields();
        }
        Map map8 = map7;
        gc2 gc2Var2 = gc2Var;
        Map map9 = map5;
        Map map10 = map6;
        Map map11 = map4;
        Map map12 = map3;
        return brandingConfig.copy(map, map2, map12, mediaFeedTab, map11, map9, map10, map8, gc2Var2);
    }

    @NotNull
    public final BrandingConfig copy(@NotNull Map<String, BrandingTeam> teams, @NotNull Map<String, BrandingTournament> uniqueTournaments, @NotNull Map<String, BrandingOddsTab> oddsTab, @Nullable MediaFeedTab mediaFeedTab, @NotNull Map<String, BrandingFantasyCompetition> fantasyCompetitions, @NotNull Map<String, BrandingFeaturedTournament> featuredUniqueTournaments, @NotNull Map<String, BrandingEvent> boostedOddsEvents, @NotNull Map<String, BrandingEvent> partnerEvents, @NotNull gc2 unknownFields) {
        teams.getClass();
        uniqueTournaments.getClass();
        oddsTab.getClass();
        fantasyCompetitions.getClass();
        featuredUniqueTournaments.getClass();
        boostedOddsEvents.getClass();
        partnerEvents.getClass();
        unknownFields.getClass();
        return new BrandingConfig(teams, uniqueTournaments, oddsTab, mediaFeedTab, fantasyCompetitions, featuredUniqueTournaments, boostedOddsEvents, partnerEvents, unknownFields);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BrandingConfig)) {
            return false;
        }
        BrandingConfig brandingConfig = (BrandingConfig) other;
        return Intrinsics.c(unknownFields(), brandingConfig.unknownFields()) && Intrinsics.c(this.teams, brandingConfig.teams) && Intrinsics.c(this.uniqueTournaments, brandingConfig.uniqueTournaments) && Intrinsics.c(this.oddsTab, brandingConfig.oddsTab) && Intrinsics.c(this.mediaFeedTab, brandingConfig.mediaFeedTab) && Intrinsics.c(this.fantasyCompetitions, brandingConfig.fantasyCompetitions) && Intrinsics.c(this.featuredUniqueTournaments, brandingConfig.featuredUniqueTournaments) && Intrinsics.c(this.boostedOddsEvents, brandingConfig.boostedOddsEvents) && Intrinsics.c(this.partnerEvents, brandingConfig.partnerEvents);
    }

    @NotNull
    public final Map<String, BrandingEvent> getBoostedOddsEvents() {
        return this.boostedOddsEvents;
    }

    @NotNull
    public final Map<String, BrandingFantasyCompetition> getFantasyCompetitions() {
        return this.fantasyCompetitions;
    }

    @NotNull
    public final Map<String, BrandingFeaturedTournament> getFeaturedUniqueTournaments() {
        return this.featuredUniqueTournaments;
    }

    @Nullable
    public final MediaFeedTab getMediaFeedTab() {
        return this.mediaFeedTab;
    }

    @NotNull
    public final Map<String, BrandingOddsTab> getOddsTab() {
        return this.oddsTab;
    }

    @NotNull
    public final Map<String, BrandingEvent> getPartnerEvents() {
        return this.partnerEvents;
    }

    @NotNull
    public final Map<String, BrandingTeam> getTeams() {
        return this.teams;
    }

    @NotNull
    public final Map<String, BrandingTournament> getUniqueTournaments() {
        return this.uniqueTournaments;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int g = dmi.g(this.oddsTab, dmi.g(this.uniqueTournaments, dmi.g(this.teams, unknownFields().hashCode() * 37, 37), 37), 37);
        MediaFeedTab mediaFeedTab = this.mediaFeedTab;
        int hashCode = this.partnerEvents.hashCode() + dmi.g(this.boostedOddsEvents, dmi.g(this.featuredUniqueTournaments, dmi.g(this.fantasyCompetitions, (g + (mediaFeedTab != null ? mediaFeedTab.hashCode() : 0)) * 37, 37), 37), 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @wx4
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m680newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.teams.isEmpty()) {
            arrayList.add("teams=" + this.teams);
        }
        if (!this.uniqueTournaments.isEmpty()) {
            arrayList.add("uniqueTournaments=" + this.uniqueTournaments);
        }
        if (!this.oddsTab.isEmpty()) {
            arrayList.add("oddsTab=" + this.oddsTab);
        }
        MediaFeedTab mediaFeedTab = this.mediaFeedTab;
        if (mediaFeedTab != null) {
            arrayList.add("mediaFeedTab=" + mediaFeedTab);
        }
        if (!this.fantasyCompetitions.isEmpty()) {
            arrayList.add("fantasyCompetitions=" + this.fantasyCompetitions);
        }
        if (!this.featuredUniqueTournaments.isEmpty()) {
            arrayList.add("featuredUniqueTournaments=" + this.featuredUniqueTournaments);
        }
        if (!this.boostedOddsEvents.isEmpty()) {
            arrayList.add("boostedOddsEvents=" + this.boostedOddsEvents);
        }
        if (!this.partnerEvents.isEmpty()) {
            arrayList.add("partnerEvents=" + this.partnerEvents);
        }
        return CollectionsKt.f0(arrayList, ", ", "BrandingConfig{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m680newBuilder();
    }

    public BrandingConfig() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandingConfig(@NotNull Map<String, BrandingTeam> map, @NotNull Map<String, BrandingTournament> map2, @NotNull Map<String, BrandingOddsTab> map3, @Nullable MediaFeedTab mediaFeedTab, @NotNull Map<String, BrandingFantasyCompetition> map4, @NotNull Map<String, BrandingFeaturedTournament> map5, @NotNull Map<String, BrandingEvent> map6, @NotNull Map<String, BrandingEvent> map7, @NotNull gc2 gc2Var) {
        super(ADAPTER, gc2Var);
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        map5.getClass();
        map6.getClass();
        map7.getClass();
        gc2Var.getClass();
        this.mediaFeedTab = mediaFeedTab;
        this.teams = Internal.immutableCopyOf("teams", map);
        this.uniqueTournaments = Internal.immutableCopyOf("uniqueTournaments", map2);
        this.oddsTab = Internal.immutableCopyOf("oddsTab", map3);
        this.fantasyCompetitions = Internal.immutableCopyOf("fantasyCompetitions", map4);
        this.featuredUniqueTournaments = Internal.immutableCopyOf("featuredUniqueTournaments", map5);
        this.boostedOddsEvents = Internal.immutableCopyOf("boostedOddsEvents", map6);
        this.partnerEvents = Internal.immutableCopyOf("partnerEvents", map7);
    }
}
