package com.sofascore.model.network.response.serializers;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Referee;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.SearchEntity;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.aik;
import defpackage.mfa;
import defpackage.qfa;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0096\u0080\u0004J\u0018\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004R\u0015\u0010\u0005\u001a\u00020\u0006X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/sofascore/model/network/response/serializers/SearchEntitySerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/SearchEntity;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", U3.i.X, "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SearchEntitySerializer implements KSerializer {

    @NotNull
    public static final SearchEntitySerializer INSTANCE = new SearchEntitySerializer();

    @NotNull
    private static final SerialDescriptor descriptor = aik.v("SearchEntity", new SerialDescriptor[0]);

    private SearchEntitySerializer() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.dy4
    @Nullable
    public SearchEntity<?> deserialize(@NotNull Decoder decoder) {
        KSerializer serializer;
        decoder.getClass();
        mfa mfaVar = (mfa) decoder;
        b j = mfaVar.j();
        b bVar = (b) qfa.g(j).get("type");
        String c = bVar != null ? qfa.h(bVar).c() : null;
        if (c != null) {
            switch (c.hashCode()) {
                case -1931148883:
                    if (c.equals(SearchResponseKt.UNIQUE_STAGE_ENTITY)) {
                        serializer = SearchEntity.INSTANCE.serializer(UniqueStage.INSTANCE.serializer());
                        return (SearchEntity) mfaVar.d().a(serializer, j);
                    }
                    break;
                case -985752863:
                    if (c.equals(SearchResponseKt.PLAYER_ENTITY)) {
                        serializer = SearchEntity.INSTANCE.serializer(Player.INSTANCE.serializer());
                        return (SearchEntity) mfaVar.d().a(serializer, j);
                    }
                    break;
                case 3555933:
                    if (c.equals("team")) {
                        serializer = SearchEntity.INSTANCE.serializer(Team.INSTANCE.serializer());
                        return (SearchEntity) mfaVar.d().a(serializer, j);
                    }
                    break;
                case 96891546:
                    if (c.equals("event")) {
                        serializer = SearchEntity.INSTANCE.serializer(Event.INSTANCE.serializer());
                        return (SearchEntity) mfaVar.d().a(serializer, j);
                    }
                    break;
                case 109651828:
                    if (c.equals(SearchResponseKt.SPORT_ENTITY)) {
                        serializer = SearchEntity.INSTANCE.serializer(Sport.INSTANCE.serializer());
                        return (SearchEntity) mfaVar.d().a(serializer, j);
                    }
                    break;
                case 109757182:
                    if (c.equals("stage")) {
                        serializer = SearchEntity.INSTANCE.serializer(Stage.INSTANCE.serializer());
                        return (SearchEntity) mfaVar.d().a(serializer, j);
                    }
                    break;
                case 496955546:
                    if (c.equals(SearchResponseKt.LEAGUE_ENTITY)) {
                        serializer = SearchEntity.INSTANCE.serializer(UniqueTournament.INSTANCE.serializer());
                        return (SearchEntity) mfaVar.d().a(serializer, j);
                    }
                    break;
                case 835260333:
                    if (c.equals(SearchResponseKt.MANAGER_ENTITY)) {
                        serializer = SearchEntity.INSTANCE.serializer(Manager.INSTANCE.serializer());
                        return (SearchEntity) mfaVar.d().a(serializer, j);
                    }
                    break;
                case 1085069600:
                    if (c.equals(SearchResponseKt.REFEREE_ENTITY)) {
                        serializer = SearchEntity.INSTANCE.serializer(Referee.INSTANCE.serializer());
                        return (SearchEntity) mfaVar.d().a(serializer, j);
                    }
                    break;
            }
        }
        return null;
    }

    @Override // defpackage.dy4
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @Nullable SearchEntity<?> value) {
        encoder.getClass();
    }
}
