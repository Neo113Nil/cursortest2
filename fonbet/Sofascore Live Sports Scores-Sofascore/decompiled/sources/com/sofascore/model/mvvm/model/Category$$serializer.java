package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.network.response.SearchResponseKt;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/Category.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/Category;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/Category;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/Category;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Category$$serializer implements iw8 {

    @NotNull
    public static final Category$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Category$$serializer category$$serializer = new Category$$serializer();
        INSTANCE = category$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.Category", category$$serializer, 27);
        uyeVar.j("id", false);
        uyeVar.j("slug", false);
        uyeVar.j("name", false);
        uyeVar.j("flag", false);
        uyeVar.j("alpha2", false);
        uyeVar.j(SearchResponseKt.SPORT_ENTITY, false);
        uyeVar.j(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, false);
        uyeVar.j("fieldTranslations", false);
        uyeVar.j("sportVariant", false);
        uyeVar.j("uniqueStages", false);
        uyeVar.j("type", true);
        uyeVar.j("totalEvents", true);
        uyeVar.j("liveEvents", true);
        uyeVar.j("uniqueTournamentIds", true);
        uyeVar.j("teamIds", true);
        uyeVar.j("mccList", true);
        uyeVar.j("events", true);
        uyeVar.j("transferPeriod", true);
        uyeVar.j("hasEventPlayerStatistics", true);
        uyeVar.j("hasVideos", true);
        uyeVar.j("expanded", true);
        uyeVar.j("isDownloading", true);
        uyeVar.j("isSection", true);
        uyeVar.j("isPinnedSection", true);
        uyeVar.j("isPopularSection", true);
        uyeVar.j("isPopular", true);
        uyeVar.j("remainingLeagues", true);
        descriptor = uyeVar;
    }

    private Category$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = Category.$childSerializers;
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{a7aVar, uhiVar, uhiVar, uhiVar, l98.W(uhiVar), Sport$$serializer.INSTANCE, l98.W(a7aVar), l98.W(FieldTranslations$$serializer.INSTANCE), l98.W(a7aVar), l98.W((KSerializer) joaVarArr[9].getValue()), l98.W((KSerializer) joaVarArr[10].getValue()), a7aVar, a7aVar, l98.W((KSerializer) joaVarArr[13].getValue()), l98.W((KSerializer) joaVarArr[14].getValue()), l98.W((KSerializer) joaVarArr[15].getValue()), joaVarArr[16].getValue(), l98.W((KSerializer) joaVarArr[17].getValue()), gz1Var, gz1Var, gz1Var, gz1Var, gz1Var, gz1Var, gz1Var, gz1Var, a7aVar};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Category deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        String str;
        int i;
        List list;
        String str2;
        String str3;
        String str4;
        int i2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = Category.$childSerializers;
        List list2 = null;
        CategoryType categoryType = null;
        List list3 = null;
        Integer num = null;
        List list4 = null;
        FieldTranslations fieldTranslations = null;
        int i3 = 0;
        List list5 = null;
        List list6 = null;
        List list7 = null;
        String str5 = null;
        String str6 = null;
        Sport sport = null;
        Integer num2 = null;
        boolean z = true;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        String str7 = null;
        String str8 = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        int i7 = 0;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    list = list2;
                    z = false;
                    str6 = str6;
                    list2 = list;
                case 0:
                    list = list2;
                    str2 = str5;
                    i4 = b.l(serialDescriptor, 0);
                    i3 |= 1;
                    str6 = str6;
                    str5 = str2;
                    list2 = list;
                case 1:
                    list = list2;
                    str2 = str5;
                    str7 = b.n(serialDescriptor, 1);
                    i3 |= 2;
                    str5 = str2;
                    list2 = list;
                case 2:
                    list = list2;
                    str2 = str5;
                    str8 = b.n(serialDescriptor, 2);
                    i3 |= 4;
                    str5 = str2;
                    list2 = list;
                case 3:
                    list = list2;
                    str5 = b.n(serialDescriptor, 3);
                    i3 |= 8;
                    list2 = list;
                case 4:
                    str2 = str5;
                    list = list2;
                    str6 = (String) b.i(serialDescriptor, 4, uhi.a, str6);
                    i3 |= 16;
                    str5 = str2;
                    list2 = list;
                case 5:
                    str3 = str5;
                    str4 = str6;
                    sport = (Sport) b.w(serialDescriptor, 5, Sport$$serializer.INSTANCE, sport);
                    i3 |= 32;
                    str5 = str3;
                    str6 = str4;
                case 6:
                    str3 = str5;
                    str4 = str6;
                    num2 = (Integer) b.i(serialDescriptor, 6, a7a.a, num2);
                    i3 |= 64;
                    str5 = str3;
                    str6 = str4;
                case 7:
                    str3 = str5;
                    str4 = str6;
                    fieldTranslations = (FieldTranslations) b.i(serialDescriptor, 7, FieldTranslations$$serializer.INSTANCE, fieldTranslations);
                    i3 |= 128;
                    str5 = str3;
                    str6 = str4;
                case 8:
                    str3 = str5;
                    str4 = str6;
                    num = (Integer) b.i(serialDescriptor, 8, a7a.a, num);
                    i3 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    str5 = str3;
                    str6 = str4;
                case 9:
                    str3 = str5;
                    str4 = str6;
                    list3 = (List) b.i(serialDescriptor, 9, (dy4) joaVarArr[9].getValue(), list3);
                    i3 |= 512;
                    str5 = str3;
                    str6 = str4;
                case 10:
                    str3 = str5;
                    str4 = str6;
                    categoryType = (CategoryType) b.i(serialDescriptor, 10, (dy4) joaVarArr[10].getValue(), categoryType);
                    i3 |= 1024;
                    str5 = str3;
                    str6 = str4;
                case 11:
                    str = str5;
                    i5 = b.l(serialDescriptor, 11);
                    i3 |= a.o;
                    str5 = str;
                case 12:
                    str = str5;
                    i6 = b.l(serialDescriptor, 12);
                    i3 |= 4096;
                    str5 = str;
                case 13:
                    str3 = str5;
                    str4 = str6;
                    list2 = (List) b.i(serialDescriptor, 13, (dy4) joaVarArr[13].getValue(), list2);
                    i3 |= 8192;
                    str5 = str3;
                    str6 = str4;
                case 14:
                    str3 = str5;
                    str4 = str6;
                    list4 = (List) b.i(serialDescriptor, 14, (dy4) joaVarArr[14].getValue(), list4);
                    i3 |= 16384;
                    str5 = str3;
                    str6 = str4;
                case 15:
                    str3 = str5;
                    str4 = str6;
                    list5 = (List) b.i(serialDescriptor, 15, (dy4) joaVarArr[15].getValue(), list5);
                    i2 = 32768;
                    i3 |= i2;
                    str5 = str3;
                    str6 = str4;
                case 16:
                    str3 = str5;
                    str4 = str6;
                    list6 = (List) b.w(serialDescriptor, 16, (dy4) joaVarArr[16].getValue(), list6);
                    i2 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i3 |= i2;
                    str5 = str3;
                    str6 = str4;
                case 17:
                    str3 = str5;
                    str4 = str6;
                    list7 = (List) b.i(serialDescriptor, 17, (dy4) joaVarArr[17].getValue(), list7);
                    i2 = 131072;
                    i3 |= i2;
                    str5 = str3;
                    str6 = str4;
                case 18:
                    str = str5;
                    z2 = b.B(serialDescriptor, 18);
                    i = 262144;
                    i3 |= i;
                    str5 = str;
                case 19:
                    str = str5;
                    z3 = b.B(serialDescriptor, 19);
                    i = 524288;
                    i3 |= i;
                    str5 = str;
                case 20:
                    str = str5;
                    z4 = b.B(serialDescriptor, 20);
                    i = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i3 |= i;
                    str5 = str;
                case 21:
                    str = str5;
                    z5 = b.B(serialDescriptor, 21);
                    i = 2097152;
                    i3 |= i;
                    str5 = str;
                case 22:
                    str = str5;
                    z6 = b.B(serialDescriptor, 22);
                    i = 4194304;
                    i3 |= i;
                    str5 = str;
                case 23:
                    str = str5;
                    z7 = b.B(serialDescriptor, 23);
                    i = 8388608;
                    i3 |= i;
                    str5 = str;
                case 24:
                    str = str5;
                    z8 = b.B(serialDescriptor, 24);
                    i = C.DEFAULT_MUXED_BUFFER_SIZE;
                    i3 |= i;
                    str5 = str;
                case 25:
                    str = str5;
                    z9 = b.B(serialDescriptor, 25);
                    i = 33554432;
                    i3 |= i;
                    str5 = str;
                case 26:
                    str = str5;
                    i7 = b.l(serialDescriptor, 26);
                    i = 67108864;
                    i3 |= i;
                    str5 = str;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        String str9 = str5;
        b.c(serialDescriptor);
        return new Category(i3, i4, str7, str8, str9, str6, sport, num2, fieldTranslations, num, list3, categoryType, i5, i6, list2, list4, list5, list6, list7, z2, z3, z4, z5, z6, z7, z8, z9, i7, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Category value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Category.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
