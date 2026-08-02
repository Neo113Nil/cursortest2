package com.sofascore.model.newNetwork;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.mvvm.model.Point2D$$serializer;
import com.sofascore.model.newNetwork.FootballEventPlayerRatingBreakdownResponse;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse.RatingBreakdownElement.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse$RatingBreakdownElement;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse$RatingBreakdownElement;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse$RatingBreakdownElement;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class FootballEventPlayerRatingBreakdownResponse$RatingBreakdownElement$$serializer implements iw8 {

    @NotNull
    public static final FootballEventPlayerRatingBreakdownResponse$RatingBreakdownElement$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FootballEventPlayerRatingBreakdownResponse$RatingBreakdownElement$$serializer footballEventPlayerRatingBreakdownResponse$RatingBreakdownElement$$serializer = new FootballEventPlayerRatingBreakdownResponse$RatingBreakdownElement$$serializer();
        INSTANCE = footballEventPlayerRatingBreakdownResponse$RatingBreakdownElement$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.FootballEventPlayerRatingBreakdownResponse.RatingBreakdownElement", footballEventPlayerRatingBreakdownResponse$RatingBreakdownElement$$serializer, 8);
        uyeVar.j("playerCoordinates", false);
        uyeVar.j("passEndCoordinates", false);
        uyeVar.j("eventActionType", true);
        uyeVar.j("outcome", false);
        uyeVar.j("keypass", false);
        uyeVar.j("isAssist", false);
        uyeVar.j("wasFouled", false);
        uyeVar.j("isLongBall", false);
        descriptor = uyeVar;
    }

    private FootballEventPlayerRatingBreakdownResponse$RatingBreakdownElement$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = FootballEventPlayerRatingBreakdownResponse.RatingBreakdownElement.$childSerializers;
        Point2D$$serializer point2D$$serializer = Point2D$$serializer.INSTANCE;
        KSerializer W = l98.W(point2D$$serializer);
        KSerializer W2 = l98.W((KSerializer) joaVarArr[2].getValue());
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{point2D$$serializer, W, W2, l98.W(gz1Var), l98.W(gz1Var), l98.W(gz1Var), l98.W(gz1Var), l98.W(gz1Var)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final FootballEventPlayerRatingBreakdownResponse.RatingBreakdownElement deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = FootballEventPlayerRatingBreakdownResponse.RatingBreakdownElement.$childSerializers;
        FootballEventPlayerRatingBreakdownResponse.RatingBreakdownElement ratingBreakdownElement = null;
        boolean z = true;
        Boolean bool = null;
        Point2D point2D = null;
        Point2D point2D2 = null;
        FootballEventPlayerRatingBreakdownResponse.ActionType actionType = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        int i = 0;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    point2D = (Point2D) b.w(serialDescriptor, 0, Point2D$$serializer.INSTANCE, point2D);
                    i |= 1;
                    break;
                case 1:
                    point2D2 = (Point2D) b.i(serialDescriptor, 1, Point2D$$serializer.INSTANCE, point2D2);
                    i |= 2;
                    break;
                case 2:
                    actionType = (FootballEventPlayerRatingBreakdownResponse.ActionType) b.i(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), actionType);
                    i |= 4;
                    break;
                case 3:
                    bool2 = (Boolean) b.i(serialDescriptor, 3, gz1.a, bool2);
                    i |= 8;
                    break;
                case 4:
                    bool3 = (Boolean) b.i(serialDescriptor, 4, gz1.a, bool3);
                    i |= 16;
                    break;
                case 5:
                    bool4 = (Boolean) b.i(serialDescriptor, 5, gz1.a, bool4);
                    i |= 32;
                    break;
                case 6:
                    bool5 = (Boolean) b.i(serialDescriptor, 6, gz1.a, bool5);
                    i |= 64;
                    break;
                case 7:
                    bool = (Boolean) b.i(serialDescriptor, 7, gz1.a, bool);
                    i |= 128;
                    break;
                default:
                    yhk.e(o);
                    return ratingBreakdownElement;
            }
            ratingBreakdownElement = null;
        }
        b.c(serialDescriptor);
        return new FootballEventPlayerRatingBreakdownResponse.RatingBreakdownElement(i, point2D, point2D2, actionType, bool2, bool3, bool4, bool5, bool, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull FootballEventPlayerRatingBreakdownResponse.RatingBreakdownElement value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        FootballEventPlayerRatingBreakdownResponse.RatingBreakdownElement.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
