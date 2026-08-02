package com.sofascore.local_persistance;

import com.ironsource.U3;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import defpackage.gc2;
import defpackage.joa;
import defpackage.vs1;
import defpackage.ypa;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000k\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R-\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00140\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR-\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c0\u00140\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR-\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020 0\u00140\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR-\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020$0\u00140\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001aR-\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020(0\u00140\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0018\u001a\u0004\b*\u0010\u001aR-\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020,0\u00140\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0018\u001a\u0004\b.\u0010\u001aR-\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020,0\u00140\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0018\u001a\u0004\b1\u0010\u001a¨\u00063"}, d2 = {"com/sofascore/local_persistance/BrandingConfig$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/sofascore/local_persistance/BrandingConfig;", U3.i.X, "", "encodedSize", "(Lcom/sofascore/local_persistance/BrandingConfig;)I", "Lcom/squareup/wire/ProtoWriter;", "writer", "", "encode", "(Lcom/squareup/wire/ProtoWriter;Lcom/sofascore/local_persistance/BrandingConfig;)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;Lcom/sofascore/local_persistance/BrandingConfig;)V", "Lcom/squareup/wire/ProtoReader;", "reader", "decode", "(Lcom/squareup/wire/ProtoReader;)Lcom/sofascore/local_persistance/BrandingConfig;", "redact", "(Lcom/sofascore/local_persistance/BrandingConfig;)Lcom/sofascore/local_persistance/BrandingConfig;", "", "", "Lcom/sofascore/local_persistance/BrandingTeam;", "teamsAdapter$delegate", "Ljoa;", "getTeamsAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "teamsAdapter", "Lcom/sofascore/local_persistance/BrandingTournament;", "uniqueTournamentsAdapter$delegate", "getUniqueTournamentsAdapter", "uniqueTournamentsAdapter", "Lcom/sofascore/local_persistance/BrandingOddsTab;", "oddsTabAdapter$delegate", "getOddsTabAdapter", "oddsTabAdapter", "Lcom/sofascore/local_persistance/BrandingFantasyCompetition;", "fantasyCompetitionsAdapter$delegate", "getFantasyCompetitionsAdapter", "fantasyCompetitionsAdapter", "Lcom/sofascore/local_persistance/BrandingFeaturedTournament;", "featuredUniqueTournamentsAdapter$delegate", "getFeaturedUniqueTournamentsAdapter", "featuredUniqueTournamentsAdapter", "Lcom/sofascore/local_persistance/BrandingEvent;", "boostedOddsEventsAdapter$delegate", "getBoostedOddsEventsAdapter", "boostedOddsEventsAdapter", "partnerEventsAdapter$delegate", "getPartnerEventsAdapter", "partnerEventsAdapter", "localPersistence_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BrandingConfig$Companion$ADAPTER$1 extends ProtoAdapter<BrandingConfig> {

    /* renamed from: boostedOddsEventsAdapter$delegate, reason: from kotlin metadata */
    private final joa boostedOddsEventsAdapter;

    /* renamed from: fantasyCompetitionsAdapter$delegate, reason: from kotlin metadata */
    private final joa fantasyCompetitionsAdapter;

    /* renamed from: featuredUniqueTournamentsAdapter$delegate, reason: from kotlin metadata */
    private final joa featuredUniqueTournamentsAdapter;

    /* renamed from: oddsTabAdapter$delegate, reason: from kotlin metadata */
    private final joa oddsTabAdapter;

    /* renamed from: partnerEventsAdapter$delegate, reason: from kotlin metadata */
    private final joa partnerEventsAdapter;

    /* renamed from: teamsAdapter$delegate, reason: from kotlin metadata */
    private final joa teamsAdapter;

    /* renamed from: uniqueTournamentsAdapter$delegate, reason: from kotlin metadata */
    private final joa uniqueTournamentsAdapter;

    public BrandingConfig$Companion$ADAPTER$1(FieldEncoding fieldEncoding, KClass<BrandingConfig> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/BrandingConfig", syntax, (Object) null, "branding_config.proto");
        this.teamsAdapter = ypa.b(new vs1(20));
        this.uniqueTournamentsAdapter = ypa.b(new vs1(21));
        this.oddsTabAdapter = ypa.b(new vs1(22));
        this.fantasyCompetitionsAdapter = ypa.b(new vs1(23));
        this.featuredUniqueTournamentsAdapter = ypa.b(new vs1(24));
        this.boostedOddsEventsAdapter = ypa.b(new vs1(25));
        this.partnerEventsAdapter = ypa.b(new vs1(26));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter boostedOddsEventsAdapter_delegate$lambda$5() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, BrandingEvent.ADAPTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter fantasyCompetitionsAdapter_delegate$lambda$3() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, BrandingFantasyCompetition.ADAPTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter featuredUniqueTournamentsAdapter_delegate$lambda$4() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, BrandingFeaturedTournament.ADAPTER);
    }

    private final ProtoAdapter<Map<String, BrandingEvent>> getBoostedOddsEventsAdapter() {
        return (ProtoAdapter) this.boostedOddsEventsAdapter.getValue();
    }

    private final ProtoAdapter<Map<String, BrandingFantasyCompetition>> getFantasyCompetitionsAdapter() {
        return (ProtoAdapter) this.fantasyCompetitionsAdapter.getValue();
    }

    private final ProtoAdapter<Map<String, BrandingFeaturedTournament>> getFeaturedUniqueTournamentsAdapter() {
        return (ProtoAdapter) this.featuredUniqueTournamentsAdapter.getValue();
    }

    private final ProtoAdapter<Map<String, BrandingOddsTab>> getOddsTabAdapter() {
        return (ProtoAdapter) this.oddsTabAdapter.getValue();
    }

    private final ProtoAdapter<Map<String, BrandingEvent>> getPartnerEventsAdapter() {
        return (ProtoAdapter) this.partnerEventsAdapter.getValue();
    }

    private final ProtoAdapter<Map<String, BrandingTeam>> getTeamsAdapter() {
        return (ProtoAdapter) this.teamsAdapter.getValue();
    }

    private final ProtoAdapter<Map<String, BrandingTournament>> getUniqueTournamentsAdapter() {
        return (ProtoAdapter) this.uniqueTournamentsAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter oddsTabAdapter_delegate$lambda$2() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, BrandingOddsTab.ADAPTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter partnerEventsAdapter_delegate$lambda$6() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, BrandingEvent.ADAPTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter teamsAdapter_delegate$lambda$0() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, BrandingTeam.ADAPTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter uniqueTournamentsAdapter_delegate$lambda$1() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, BrandingTournament.ADAPTER);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public BrandingConfig decode(ProtoReader reader) {
        reader.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        long beginMessage = reader.beginMessage();
        MediaFeedTab mediaFeedTab = null;
        while (true) {
            int nextTag = reader.nextTag();
            if (nextTag == -1) {
                return new BrandingConfig(linkedHashMap, linkedHashMap2, linkedHashMap3, mediaFeedTab, linkedHashMap4, linkedHashMap5, linkedHashMap6, linkedHashMap7, reader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    linkedHashMap.putAll(getTeamsAdapter().decode(reader));
                    break;
                case 2:
                    linkedHashMap2.putAll(getUniqueTournamentsAdapter().decode(reader));
                    break;
                case 3:
                    linkedHashMap3.putAll(getOddsTabAdapter().decode(reader));
                    break;
                case 4:
                    mediaFeedTab = MediaFeedTab.ADAPTER.decode(reader);
                    break;
                case 5:
                    linkedHashMap4.putAll(getFantasyCompetitionsAdapter().decode(reader));
                    break;
                case 6:
                    linkedHashMap5.putAll(getFeaturedUniqueTournamentsAdapter().decode(reader));
                    break;
                case 7:
                    linkedHashMap6.putAll(getBoostedOddsEventsAdapter().decode(reader));
                    break;
                case 8:
                    linkedHashMap7.putAll(getPartnerEventsAdapter().decode(reader));
                    break;
                default:
                    reader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, BrandingConfig value) {
        writer.getClass();
        value.getClass();
        getTeamsAdapter().encodeWithTag(writer, 1, (int) value.getTeams());
        getUniqueTournamentsAdapter().encodeWithTag(writer, 2, (int) value.getUniqueTournaments());
        getOddsTabAdapter().encodeWithTag(writer, 3, (int) value.getOddsTab());
        MediaFeedTab.ADAPTER.encodeWithTag(writer, 4, (int) value.getMediaFeedTab());
        getFantasyCompetitionsAdapter().encodeWithTag(writer, 5, (int) value.getFantasyCompetitions());
        getFeaturedUniqueTournamentsAdapter().encodeWithTag(writer, 6, (int) value.getFeaturedUniqueTournaments());
        getBoostedOddsEventsAdapter().encodeWithTag(writer, 7, (int) value.getBoostedOddsEvents());
        getPartnerEventsAdapter().encodeWithTag(writer, 8, (int) value.getPartnerEvents());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(BrandingConfig value) {
        value.getClass();
        return getPartnerEventsAdapter().encodedSizeWithTag(8, value.getPartnerEvents()) + getBoostedOddsEventsAdapter().encodedSizeWithTag(7, value.getBoostedOddsEvents()) + getFeaturedUniqueTournamentsAdapter().encodedSizeWithTag(6, value.getFeaturedUniqueTournaments()) + getFantasyCompetitionsAdapter().encodedSizeWithTag(5, value.getFantasyCompetitions()) + MediaFeedTab.ADAPTER.encodedSizeWithTag(4, value.getMediaFeedTab()) + getOddsTabAdapter().encodedSizeWithTag(3, value.getOddsTab()) + getUniqueTournamentsAdapter().encodedSizeWithTag(2, value.getUniqueTournaments()) + getTeamsAdapter().encodedSizeWithTag(1, value.getTeams()) + value.unknownFields().h();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public BrandingConfig redact(BrandingConfig value) {
        value.getClass();
        Map<String, BrandingTeam> m718redactElements = Internal.m718redactElements(value.getTeams(), BrandingTeam.ADAPTER);
        Map<String, BrandingTournament> m718redactElements2 = Internal.m718redactElements(value.getUniqueTournaments(), BrandingTournament.ADAPTER);
        Map<String, BrandingOddsTab> m718redactElements3 = Internal.m718redactElements(value.getOddsTab(), BrandingOddsTab.ADAPTER);
        MediaFeedTab mediaFeedTab = value.getMediaFeedTab();
        MediaFeedTab redact = mediaFeedTab != null ? MediaFeedTab.ADAPTER.redact(mediaFeedTab) : null;
        Map<String, BrandingFantasyCompetition> m718redactElements4 = Internal.m718redactElements(value.getFantasyCompetitions(), BrandingFantasyCompetition.ADAPTER);
        Map<String, BrandingFeaturedTournament> m718redactElements5 = Internal.m718redactElements(value.getFeaturedUniqueTournaments(), BrandingFeaturedTournament.ADAPTER);
        Map<String, BrandingEvent> boostedOddsEvents = value.getBoostedOddsEvents();
        ProtoAdapter<BrandingEvent> protoAdapter = BrandingEvent.ADAPTER;
        return value.copy(m718redactElements, m718redactElements2, m718redactElements3, redact, m718redactElements4, m718redactElements5, Internal.m718redactElements(boostedOddsEvents, protoAdapter), Internal.m718redactElements(value.getPartnerEvents(), protoAdapter), gc2.d);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, BrandingConfig value) {
        writer.getClass();
        value.getClass();
        writer.writeBytes(value.unknownFields());
        getPartnerEventsAdapter().encodeWithTag(writer, 8, (int) value.getPartnerEvents());
        getBoostedOddsEventsAdapter().encodeWithTag(writer, 7, (int) value.getBoostedOddsEvents());
        getFeaturedUniqueTournamentsAdapter().encodeWithTag(writer, 6, (int) value.getFeaturedUniqueTournaments());
        getFantasyCompetitionsAdapter().encodeWithTag(writer, 5, (int) value.getFantasyCompetitions());
        MediaFeedTab.ADAPTER.encodeWithTag(writer, 4, (int) value.getMediaFeedTab());
        getOddsTabAdapter().encodeWithTag(writer, 3, (int) value.getOddsTab());
        getUniqueTournamentsAdapter().encodeWithTag(writer, 2, (int) value.getUniqueTournaments());
        getTeamsAdapter().encodeWithTag(writer, 1, (int) value.getTeams());
    }
}
