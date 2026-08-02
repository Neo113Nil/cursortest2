package com.sofascore.model.newNetwork.commentary;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.mvvm.model.Point2D$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yhk;
import defpackage.z8e;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/commentary/FootballPassingNetworkSegment.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/commentary/FootballPassingNetworkSegment;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/commentary/FootballPassingNetworkSegment;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/commentary/FootballPassingNetworkSegment;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class FootballPassingNetworkSegment$$serializer implements iw8 {

    @NotNull
    public static final FootballPassingNetworkSegment$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FootballPassingNetworkSegment$$serializer footballPassingNetworkSegment$$serializer = new FootballPassingNetworkSegment$$serializer();
        INSTANCE = footballPassingNetworkSegment$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.commentary.FootballPassingNetworkSegment", footballPassingNetworkSegment$$serializer, 11);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        uyeVar.j("eventType", false);
        uyeVar.j("isAssist", false);
        uyeVar.j("time", false);
        uyeVar.j("playerCoordinates", false);
        uyeVar.j("gkCoordinates", false);
        uyeVar.j("goalMouthCoordinates", false);
        uyeVar.j("goalShotCoordinates", false);
        uyeVar.j(Incident.GoalIncident.TYPE_GOALKEEPER, false);
        uyeVar.j("isHome", false);
        uyeVar.j("goalType", false);
        descriptor = uyeVar;
    }

    private FootballPassingNetworkSegment$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = FootballPassingNetworkSegment.$childSerializers;
        Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
        KSerializer W = l98.W(SegmentEventTypeSerializer.INSTANCE);
        gz1 gz1Var = gz1.a;
        KSerializer W2 = l98.W(gz1Var);
        KSerializer W3 = l98.W(a7a.a);
        Point2D$$serializer point2D$$serializer = Point2D$$serializer.INSTANCE;
        return new KSerializer[]{player$$serializer, W, W2, W3, point2D$$serializer, l98.W(point2D$$serializer), l98.W(point2D$$serializer), l98.W(point2D$$serializer), l98.W(player$$serializer), l98.W(gz1Var), l98.W((KSerializer) joaVarArr[10].getValue())};
    }

    @Override // defpackage.dy4
    @NotNull
    public final FootballPassingNetworkSegment deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        joa[] joaVarArr2;
        boolean z;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = FootballPassingNetworkSegment.$childSerializers;
        AnimatedGoalType animatedGoalType = null;
        Boolean bool = null;
        Player player = null;
        boolean z2 = true;
        Point2D point2D = null;
        int i = 0;
        Player player2 = null;
        SegmentEventType segmentEventType = null;
        Boolean bool2 = null;
        Integer num = null;
        Point2D point2D2 = null;
        Point2D point2D3 = null;
        Point2D point2D4 = null;
        while (z2) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    player2 = (Player) b.w(serialDescriptor, 0, Player$$serializer.INSTANCE, player2);
                    i |= 1;
                    break;
                case 1:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    segmentEventType = (SegmentEventType) b.i(serialDescriptor, 1, SegmentEventTypeSerializer.INSTANCE, segmentEventType);
                    i |= 2;
                    break;
                case 2:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    bool2 = (Boolean) b.i(serialDescriptor, 2, gz1.a, bool2);
                    i |= 4;
                    break;
                case 3:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    num = (Integer) b.i(serialDescriptor, 3, a7a.a, num);
                    i |= 8;
                    break;
                case 4:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    point2D2 = (Point2D) b.w(serialDescriptor, 4, Point2D$$serializer.INSTANCE, point2D2);
                    i |= 16;
                    break;
                case 5:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    point2D3 = (Point2D) b.i(serialDescriptor, 5, Point2D$$serializer.INSTANCE, point2D3);
                    i |= 32;
                    break;
                case 6:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    point2D4 = (Point2D) b.i(serialDescriptor, 6, Point2D$$serializer.INSTANCE, point2D4);
                    i |= 64;
                    break;
                case 7:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    point2D = (Point2D) b.i(serialDescriptor, 7, Point2D$$serializer.INSTANCE, point2D);
                    i |= 128;
                    break;
                case 8:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    player = (Player) b.i(serialDescriptor, 8, Player$$serializer.INSTANCE, player);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    bool = (Boolean) b.i(serialDescriptor, 9, gz1.a, bool);
                    i |= 512;
                    break;
                case 10:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    animatedGoalType = (AnimatedGoalType) b.i(serialDescriptor, 10, (dy4) joaVarArr2[10].getValue(), animatedGoalType);
                    i |= 1024;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
            joaVarArr = joaVarArr2;
            z2 = z;
        }
        b.c(serialDescriptor);
        return new FootballPassingNetworkSegment(i, player2, segmentEventType, bool2, num, point2D2, point2D3, point2D4, point2D, player, bool, animatedGoalType, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull FootballPassingNetworkSegment value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        FootballPassingNetworkSegment.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
