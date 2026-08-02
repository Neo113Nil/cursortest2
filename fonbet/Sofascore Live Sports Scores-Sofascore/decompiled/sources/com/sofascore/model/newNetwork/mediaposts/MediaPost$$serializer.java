package com.sofascore.model.newNetwork.mediaposts;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.Round$$serializer;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Season$$serializer;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Sport$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.NewsProvider;
import com.sofascore.model.newNetwork.NewsProvider$$serializer;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.lkb;
import defpackage.t5h;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yhk;
import defpackage.z8e;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/mediaposts/MediaPost.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/mediaposts/MediaPost;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/mediaposts/MediaPost;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/mediaposts/MediaPost;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class MediaPost$$serializer implements iw8 {

    @NotNull
    public static final MediaPost$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MediaPost$$serializer mediaPost$$serializer = new MediaPost$$serializer();
        INSTANCE = mediaPost$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.mediaposts.MediaPost", mediaPost$$serializer, 24);
        uyeVar.j("id", false);
        uyeVar.j("tags", false);
        uyeVar.j("event", false);
        uyeVar.j("team", false);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        uyeVar.j(SearchResponseKt.MANAGER_ENTITY, false);
        uyeVar.j(SearchResponseKt.LEAGUE_ENTITY, false);
        uyeVar.j(SearchResponseKt.SPORT_ENTITY, false);
        uyeVar.j("createdAtTimestamp", false);
        uyeVar.j("publishedAtTimestamp", true);
        uyeVar.j("contentDateTimestamp", false);
        uyeVar.j("type", false);
        uyeVar.j("header", false);
        uyeVar.j("description", false);
        uyeVar.j("images", false);
        uyeVar.j("contentId", false);
        uyeVar.j("externalUrl", false);
        uyeVar.j("embeddable", false);
        uyeVar.j("mediaPostIds", false);
        uyeVar.j("venue", false);
        uyeVar.j(TeamOfTheWeekRoundsResponseKt.TOTW_ROUND, false);
        uyeVar.j(TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, false);
        uyeVar.j("newsProvider", false);
        uyeVar.j("stage", false);
        descriptor = uyeVar;
    }

    private MediaPost$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = MediaPost.$childSerializers;
        lkb lkbVar = lkb.a;
        uhi uhiVar = uhi.a;
        return new KSerializer[]{a7a.a, joaVarArr[1].getValue(), l98.W(MediaEvent$$serializer.INSTANCE), l98.W(MediaTeam$$serializer.INSTANCE), l98.W(MediaPlayer$$serializer.INSTANCE), l98.W(MediaManager$$serializer.INSTANCE), l98.W(MediaUniqueTournament$$serializer.INSTANCE), l98.W(Sport$$serializer.INSTANCE), lkbVar, lkbVar, l98.W(lkbVar), l98.W((KSerializer) joaVarArr[11].getValue()), l98.W(uhiVar), l98.W(uhiVar), l98.W((KSerializer) joaVarArr[14].getValue()), l98.W(uhiVar), l98.W(uhiVar), l98.W(gz1.a), l98.W((KSerializer) joaVarArr[18].getValue()), l98.W(MediaVenue$$serializer.INSTANCE), l98.W(Round$$serializer.INSTANCE), l98.W(Season$$serializer.INSTANCE), l98.W(NewsProvider$$serializer.INSTANCE), l98.W(MediaStage$$serializer.INSTANCE)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final MediaPost deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        String str;
        MediaType mediaType;
        int i;
        String str2;
        String str3;
        MediaType mediaType2;
        int i2;
        String str4;
        MediaType mediaType3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = MediaPost.$childSerializers;
        long j = 0;
        long j2 = 0;
        String str5 = null;
        String str6 = null;
        MediaType mediaType4 = null;
        MediaStage mediaStage = null;
        List list = null;
        Season season = null;
        NewsProvider newsProvider = null;
        int i3 = 0;
        String str7 = null;
        String str8 = null;
        Boolean bool = null;
        List list2 = null;
        MediaVenue mediaVenue = null;
        Round round = null;
        int i4 = 1;
        boolean z = true;
        int i5 = 0;
        List list3 = null;
        MediaEvent mediaEvent = null;
        MediaTeam mediaTeam = null;
        MediaPlayer mediaPlayer = null;
        MediaManager mediaManager = null;
        MediaUniqueTournament mediaUniqueTournament = null;
        Sport sport = null;
        Long l = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    str2 = str5;
                    str3 = str6;
                    mediaType2 = mediaType4;
                    i2 = i4;
                    z = false;
                    mediaType4 = mediaType2;
                    str6 = str3;
                    i4 = i2;
                    str5 = str2;
                case 0:
                    str2 = str5;
                    str3 = str6;
                    mediaType2 = mediaType4;
                    i2 = i4;
                    i5 = b.l(serialDescriptor, 0);
                    i3 |= 1;
                    mediaType4 = mediaType2;
                    str6 = str3;
                    i4 = i2;
                    str5 = str2;
                case 1:
                    str2 = str5;
                    str3 = str6;
                    mediaType2 = mediaType4;
                    dy4 dy4Var = (dy4) joaVarArr[i4].getValue();
                    i2 = i4;
                    list3 = (List) b.w(serialDescriptor, i2, dy4Var, list3);
                    i3 |= 2;
                    mediaEvent = mediaEvent;
                    mediaType4 = mediaType2;
                    str6 = str3;
                    i4 = i2;
                    str5 = str2;
                case 2:
                    str2 = str5;
                    str4 = str6;
                    mediaType3 = mediaType4;
                    mediaEvent = (MediaEvent) b.i(serialDescriptor, 2, MediaEvent$$serializer.INSTANCE, mediaEvent);
                    i3 |= 4;
                    mediaType4 = mediaType3;
                    str6 = str4;
                    str5 = str2;
                case 3:
                    str2 = str5;
                    str4 = str6;
                    mediaType3 = mediaType4;
                    mediaTeam = (MediaTeam) b.i(serialDescriptor, 3, MediaTeam$$serializer.INSTANCE, mediaTeam);
                    i3 |= 8;
                    mediaType4 = mediaType3;
                    str6 = str4;
                    str5 = str2;
                case 4:
                    str2 = str5;
                    str4 = str6;
                    mediaType3 = mediaType4;
                    mediaPlayer = (MediaPlayer) b.i(serialDescriptor, 4, MediaPlayer$$serializer.INSTANCE, mediaPlayer);
                    i3 |= 16;
                    mediaType4 = mediaType3;
                    str6 = str4;
                    str5 = str2;
                case 5:
                    str2 = str5;
                    str4 = str6;
                    mediaType3 = mediaType4;
                    mediaManager = (MediaManager) b.i(serialDescriptor, 5, MediaManager$$serializer.INSTANCE, mediaManager);
                    i3 |= 32;
                    mediaType4 = mediaType3;
                    str6 = str4;
                    str5 = str2;
                case 6:
                    str2 = str5;
                    str4 = str6;
                    mediaType3 = mediaType4;
                    mediaUniqueTournament = (MediaUniqueTournament) b.i(serialDescriptor, 6, MediaUniqueTournament$$serializer.INSTANCE, mediaUniqueTournament);
                    i3 |= 64;
                    mediaType4 = mediaType3;
                    str6 = str4;
                    str5 = str2;
                case 7:
                    str2 = str5;
                    str4 = str6;
                    mediaType3 = mediaType4;
                    sport = (Sport) b.i(serialDescriptor, 7, Sport$$serializer.INSTANCE, sport);
                    i3 |= 128;
                    mediaType4 = mediaType3;
                    str6 = str4;
                    str5 = str2;
                case 8:
                    str2 = str5;
                    str4 = str6;
                    j = b.g(serialDescriptor, 8);
                    i3 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    str6 = str4;
                    str5 = str2;
                case 9:
                    str2 = str5;
                    str4 = str6;
                    j2 = b.g(serialDescriptor, 9);
                    i3 |= 512;
                    str6 = str4;
                    str5 = str2;
                case 10:
                    str2 = str5;
                    str4 = str6;
                    mediaType3 = mediaType4;
                    l = (Long) b.i(serialDescriptor, 10, lkb.a, l);
                    i3 |= 1024;
                    mediaType4 = mediaType3;
                    str6 = str4;
                    str5 = str2;
                case 11:
                    str2 = str5;
                    str4 = str6;
                    mediaType4 = (MediaType) b.i(serialDescriptor, 11, (dy4) joaVarArr[11].getValue(), mediaType4);
                    i3 |= a.o;
                    str6 = str4;
                    str5 = str2;
                case 12:
                    str2 = str5;
                    str6 = (String) b.i(serialDescriptor, 12, uhi.a, str6);
                    i3 |= 4096;
                    mediaType4 = mediaType4;
                    str5 = str2;
                case 13:
                    str = str6;
                    mediaType = mediaType4;
                    str5 = (String) b.i(serialDescriptor, 13, uhi.a, str5);
                    i3 |= 8192;
                    mediaType4 = mediaType;
                    str6 = str;
                case 14:
                    str = str6;
                    mediaType = mediaType4;
                    list = (List) b.i(serialDescriptor, 14, (dy4) joaVarArr[14].getValue(), list);
                    i3 |= 16384;
                    mediaType4 = mediaType;
                    str6 = str;
                case 15:
                    str = str6;
                    mediaType = mediaType4;
                    str7 = (String) b.i(serialDescriptor, 15, uhi.a, str7);
                    i = 32768;
                    i3 |= i;
                    mediaType4 = mediaType;
                    str6 = str;
                case 16:
                    str = str6;
                    mediaType = mediaType4;
                    str8 = (String) b.i(serialDescriptor, 16, uhi.a, str8);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i3 |= i;
                    mediaType4 = mediaType;
                    str6 = str;
                case 17:
                    str = str6;
                    mediaType = mediaType4;
                    bool = (Boolean) b.i(serialDescriptor, 17, gz1.a, bool);
                    i = 131072;
                    i3 |= i;
                    mediaType4 = mediaType;
                    str6 = str;
                case 18:
                    str = str6;
                    mediaType = mediaType4;
                    list2 = (List) b.i(serialDescriptor, 18, (dy4) joaVarArr[18].getValue(), list2);
                    i = 262144;
                    i3 |= i;
                    mediaType4 = mediaType;
                    str6 = str;
                case 19:
                    str = str6;
                    mediaType = mediaType4;
                    mediaVenue = (MediaVenue) b.i(serialDescriptor, 19, MediaVenue$$serializer.INSTANCE, mediaVenue);
                    i = 524288;
                    i3 |= i;
                    mediaType4 = mediaType;
                    str6 = str;
                case 20:
                    str = str6;
                    mediaType = mediaType4;
                    round = (Round) b.i(serialDescriptor, 20, Round$$serializer.INSTANCE, round);
                    i = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i3 |= i;
                    mediaType4 = mediaType;
                    str6 = str;
                case 21:
                    str = str6;
                    mediaType = mediaType4;
                    season = (Season) b.i(serialDescriptor, 21, Season$$serializer.INSTANCE, season);
                    i = 2097152;
                    i3 |= i;
                    mediaType4 = mediaType;
                    str6 = str;
                case 22:
                    str = str6;
                    mediaType = mediaType4;
                    newsProvider = (NewsProvider) b.i(serialDescriptor, 22, NewsProvider$$serializer.INSTANCE, newsProvider);
                    i = 4194304;
                    i3 |= i;
                    mediaType4 = mediaType;
                    str6 = str;
                case 23:
                    mediaType = mediaType4;
                    str = str6;
                    mediaStage = (MediaStage) b.i(serialDescriptor, 23, MediaStage$$serializer.INSTANCE, mediaStage);
                    i = 8388608;
                    i3 |= i;
                    mediaType4 = mediaType;
                    str6 = str;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        String str9 = str6;
        MediaType mediaType5 = mediaType4;
        List list4 = list3;
        MediaEvent mediaEvent2 = mediaEvent;
        b.c(serialDescriptor);
        Long l2 = l;
        MediaVenue mediaVenue2 = mediaVenue;
        return new MediaPost(i3, i5, list4, mediaEvent2, mediaTeam, mediaPlayer, mediaManager, mediaUniqueTournament, sport, j, j2, l2, mediaType5, str9, str5, list, str7, str8, bool, list2, mediaVenue2, round, season, newsProvider, mediaStage, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MediaPost value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        MediaPost.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
