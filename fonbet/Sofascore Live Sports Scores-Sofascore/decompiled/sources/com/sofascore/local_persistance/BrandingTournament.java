package com.sofascore.local_persistance;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.buzzer.BuzzerConfigResponseKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.duf;
import defpackage.gc2;
import defpackage.mz1;
import defpackage.wv8;
import defpackage.wx4;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b0\u0018\u0000 V2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001VB£\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0002H\u0017¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b-\u0010.J©\u0002\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b/\u00100R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b2\u0010,R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u00105R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u00108R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b9\u00108R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b:\u00108R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b;\u00108R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b<\u00108R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b=\u00108R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b>\u00108R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\b@\u0010.R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\bA\u00108R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\bC\u0010DR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010B\u001a\u0004\bE\u0010DR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\bF\u00108R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00106\u001a\u0004\bG\u00108R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010H\u001a\u0004\bI\u0010JR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010K\u001a\u0004\bN\u0010MR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010O\u001a\u0004\bP\u0010QR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010K\u001a\u0004\bR\u0010MR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u00106\u001a\u0004\bS\u00108R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010K\u001a\u0004\bT\u0010MR\u001c\u0010 \u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u00106\u001a\u0004\bU\u00108¨\u0006W"}, d2 = {"Lcom/sofascore/local_persistance/BrandingTournament;", "Lcom/squareup/wire/Message;", "", "", "id", "Lcom/sofascore/local_persistance/Brand;", "brand", "", "eventList", "standings", "playerOfTheMatch", BuzzerConfigResponseKt.TEAM_OF_THE_WEEK, "header", "banner", "details", "", "url", "background", "Lcom/sofascore/local_persistance/BrandColors;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "eventListColor", "appHeader", "contentHeader", "Lcom/sofascore/local_persistance/BrandingBackgroundColors;", "backgroundGradientColor", "bannerHeight", "adUnitHeight", "Lcom/sofascore/local_persistance/ImageDisplayType;", "imageDisplayType", "oddsProviderId", "takeoverImage", "takeoverImageHeight", "forceOdds", "Lgc2;", "unknownFields", "<init>", "(ILcom/sofascore/local_persistance/Brand;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/sofascore/local_persistance/BrandColors;Lcom/sofascore/local_persistance/BrandColors;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sofascore/local_persistance/BrandingBackgroundColors;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/local_persistance/ImageDisplayType;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Lgc2;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(ILcom/sofascore/local_persistance/Brand;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/sofascore/local_persistance/BrandColors;Lcom/sofascore/local_persistance/BrandColors;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sofascore/local_persistance/BrandingBackgroundColors;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/local_persistance/ImageDisplayType;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Lgc2;)Lcom/sofascore/local_persistance/BrandingTournament;", "I", "getId", "Lcom/sofascore/local_persistance/Brand;", "getBrand", "()Lcom/sofascore/local_persistance/Brand;", "Ljava/lang/Boolean;", "getEventList", "()Ljava/lang/Boolean;", "getStandings", "getPlayerOfTheMatch", "getTeamOfTheWeek", "getHeader", "getBanner", "getDetails", "Ljava/lang/String;", "getUrl", "getBackground", "Lcom/sofascore/local_persistance/BrandColors;", "getBackgroundColor", "()Lcom/sofascore/local_persistance/BrandColors;", "getEventListColor", "getAppHeader", "getContentHeader", "Lcom/sofascore/local_persistance/BrandingBackgroundColors;", "getBackgroundGradientColor", "()Lcom/sofascore/local_persistance/BrandingBackgroundColors;", "Ljava/lang/Integer;", "getBannerHeight", "()Ljava/lang/Integer;", "getAdUnitHeight", "Lcom/sofascore/local_persistance/ImageDisplayType;", "getImageDisplayType", "()Lcom/sofascore/local_persistance/ImageDisplayType;", "getOddsProviderId", "getTakeoverImage", "getTakeoverImageHeight", "getForceOdds", "Companion", "localPersistence_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BrandingTournament extends Message {

    @NotNull
    public static final ProtoAdapter<BrandingTournament> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 17, tag = 18)
    @Nullable
    private final Integer adUnitHeight;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 13, tag = 14)
    @Nullable
    private final Boolean appHeader;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 10, tag = 11)
    @Nullable
    private final Boolean background;

    @WireField(adapter = "com.sofascore.local_persistance.BrandColors#ADAPTER", schemaIndex = 11, tag = 12)
    @Nullable
    private final BrandColors backgroundColor;

    @WireField(adapter = "com.sofascore.local_persistance.BrandingBackgroundColors#ADAPTER", schemaIndex = 15, tag = 16)
    @Nullable
    private final BrandingBackgroundColors backgroundGradientColor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 7, tag = 8)
    @Nullable
    private final Boolean banner;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 16, tag = 17)
    @Nullable
    private final Integer bannerHeight;

    @WireField(adapter = "com.sofascore.local_persistance.Brand#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    @Nullable
    private final Brand brand;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 14, tag = 15)
    @Nullable
    private final Boolean contentHeader;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 8, tag = 9)
    @Nullable
    private final Boolean details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    @Nullable
    private final Boolean eventList;

    @WireField(adapter = "com.sofascore.local_persistance.BrandColors#ADAPTER", schemaIndex = 12, tag = 13)
    @Nullable
    private final BrandColors eventListColor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 22, tag = 23)
    @Nullable
    private final Boolean forceOdds;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 6, tag = 7)
    @Nullable
    private final Boolean header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int id;

    @WireField(adapter = "com.sofascore.local_persistance.ImageDisplayType#ADAPTER", schemaIndex = 18, tag = 19)
    @Nullable
    private final ImageDisplayType imageDisplayType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 19, tag = 20)
    @Nullable
    private final Integer oddsProviderId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 4, tag = 5)
    @Nullable
    private final Boolean playerOfTheMatch;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 4)
    @Nullable
    private final Boolean standings;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 20, tag = 21)
    @Nullable
    private final Boolean takeoverImage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 21, tag = 22)
    @Nullable
    private final Integer takeoverImageHeight;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 5, tag = 6)
    @Nullable
    private final Boolean teamOfTheWeek;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 10)
    @Nullable
    private final String url;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(BrandingTournament.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BrandingTournament>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.sofascore.local_persistance.BrandingTournament$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BrandingTournament decode(ProtoReader reader) {
                Boolean bool;
                int i;
                Boolean bool2;
                Brand decode;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                int i2 = 0;
                Brand brand = null;
                Boolean bool3 = null;
                Boolean bool4 = null;
                Boolean bool5 = null;
                Boolean bool6 = null;
                Boolean bool7 = null;
                Boolean bool8 = null;
                Boolean bool9 = null;
                String str = null;
                Boolean bool10 = null;
                BrandColors brandColors = null;
                BrandColors brandColors2 = null;
                Boolean bool11 = null;
                Boolean bool12 = null;
                BrandingBackgroundColors brandingBackgroundColors = null;
                Integer num = null;
                Integer num2 = null;
                ImageDisplayType imageDisplayType = null;
                Integer num3 = null;
                Boolean bool13 = null;
                Integer num4 = null;
                Boolean bool14 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new BrandingTournament(i2, brand, bool3, bool4, bool5, bool6, bool7, bool8, bool9, str, bool10, brandColors, brandColors2, bool11, bool12, brandingBackgroundColors, num, num2, imageDisplayType, num3, bool13, num4, bool14, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            i2 = ProtoAdapter.INT32.decode(reader).intValue();
                            decode = brand;
                            break;
                        case 2:
                            decode = Brand.ADAPTER.decode(reader);
                            break;
                        case 3:
                            bool3 = ProtoAdapter.BOOL.decode(reader);
                            decode = brand;
                            break;
                        case 4:
                            bool4 = ProtoAdapter.BOOL.decode(reader);
                            decode = brand;
                            break;
                        case 5:
                            bool5 = ProtoAdapter.BOOL.decode(reader);
                            decode = brand;
                            break;
                        case 6:
                            bool6 = ProtoAdapter.BOOL.decode(reader);
                            decode = brand;
                            break;
                        case 7:
                            bool7 = ProtoAdapter.BOOL.decode(reader);
                            decode = brand;
                            break;
                        case 8:
                            bool8 = ProtoAdapter.BOOL.decode(reader);
                            decode = brand;
                            break;
                        case 9:
                            bool9 = ProtoAdapter.BOOL.decode(reader);
                            decode = brand;
                            break;
                        case 10:
                            str = ProtoAdapter.STRING.decode(reader);
                            decode = brand;
                            break;
                        case 11:
                            bool10 = ProtoAdapter.BOOL.decode(reader);
                            decode = brand;
                            break;
                        case 12:
                            brandColors = BrandColors.ADAPTER.decode(reader);
                            decode = brand;
                            break;
                        case 13:
                            brandColors2 = BrandColors.ADAPTER.decode(reader);
                            decode = brand;
                            break;
                        case 14:
                            bool11 = ProtoAdapter.BOOL.decode(reader);
                            decode = brand;
                            break;
                        case 15:
                            bool12 = ProtoAdapter.BOOL.decode(reader);
                            decode = brand;
                            break;
                        case 16:
                            brandingBackgroundColors = BrandingBackgroundColors.ADAPTER.decode(reader);
                            decode = brand;
                            break;
                        case 17:
                            num = ProtoAdapter.INT32.decode(reader);
                            decode = brand;
                            break;
                        case 18:
                            num2 = ProtoAdapter.INT32.decode(reader);
                            decode = brand;
                            break;
                        case 19:
                            try {
                                imageDisplayType = ImageDisplayType.ADAPTER.decode(reader);
                                decode = brand;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                bool = bool3;
                                i = i2;
                                bool2 = bool4;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 20:
                            num3 = ProtoAdapter.INT32.decode(reader);
                            decode = brand;
                            break;
                        case 21:
                            bool13 = ProtoAdapter.BOOL.decode(reader);
                            decode = brand;
                            break;
                        case 22:
                            num4 = ProtoAdapter.INT32.decode(reader);
                            decode = brand;
                            break;
                        case 23:
                            bool14 = ProtoAdapter.BOOL.decode(reader);
                            decode = brand;
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            bool = bool3;
                            i = i2;
                            bool2 = bool4;
                            decode = brand;
                            bool3 = bool;
                            i2 = i;
                            bool4 = bool2;
                            break;
                    }
                    brand = decode;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BrandingTournament value) {
                writer.getClass();
                value.getClass();
                if (value.getId() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getId()));
                }
                if (value.getBrand() != null) {
                    Brand.ADAPTER.encodeWithTag(writer, 2, (int) value.getBrand());
                }
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getEventList());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getStandings());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getPlayerOfTheMatch());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getTeamOfTheWeek());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getHeader());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getBanner());
                protoAdapter.encodeWithTag(writer, 9, (int) value.getDetails());
                ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getUrl());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getBackground());
                ProtoAdapter<BrandColors> protoAdapter2 = BrandColors.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 12, (int) value.getBackgroundColor());
                protoAdapter2.encodeWithTag(writer, 13, (int) value.getEventListColor());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getAppHeader());
                protoAdapter.encodeWithTag(writer, 15, (int) value.getContentHeader());
                BrandingBackgroundColors.ADAPTER.encodeWithTag(writer, 16, (int) value.getBackgroundGradientColor());
                ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
                protoAdapter3.encodeWithTag(writer, 17, (int) value.getBannerHeight());
                protoAdapter3.encodeWithTag(writer, 18, (int) value.getAdUnitHeight());
                ImageDisplayType.ADAPTER.encodeWithTag(writer, 19, (int) value.getImageDisplayType());
                protoAdapter3.encodeWithTag(writer, 20, (int) value.getOddsProviderId());
                protoAdapter.encodeWithTag(writer, 21, (int) value.getTakeoverImage());
                protoAdapter3.encodeWithTag(writer, 22, (int) value.getTakeoverImageHeight());
                protoAdapter.encodeWithTag(writer, 23, (int) value.getForceOdds());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BrandingTournament value) {
                value.getClass();
                int h = value.unknownFields().h();
                if (value.getId() != 0) {
                    h += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getId()));
                }
                if (value.getBrand() != null) {
                    h += Brand.ADAPTER.encodedSizeWithTag(2, value.getBrand());
                }
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(11, value.getBackground()) + ProtoAdapter.STRING.encodedSizeWithTag(10, value.getUrl()) + protoAdapter.encodedSizeWithTag(9, value.getDetails()) + protoAdapter.encodedSizeWithTag(8, value.getBanner()) + protoAdapter.encodedSizeWithTag(7, value.getHeader()) + protoAdapter.encodedSizeWithTag(6, value.getTeamOfTheWeek()) + protoAdapter.encodedSizeWithTag(5, value.getPlayerOfTheMatch()) + protoAdapter.encodedSizeWithTag(4, value.getStandings()) + protoAdapter.encodedSizeWithTag(3, value.getEventList()) + h;
                ProtoAdapter<BrandColors> protoAdapter2 = BrandColors.ADAPTER;
                int encodedSizeWithTag2 = BrandingBackgroundColors.ADAPTER.encodedSizeWithTag(16, value.getBackgroundGradientColor()) + protoAdapter.encodedSizeWithTag(15, value.getContentHeader()) + protoAdapter.encodedSizeWithTag(14, value.getAppHeader()) + protoAdapter2.encodedSizeWithTag(13, value.getEventListColor()) + protoAdapter2.encodedSizeWithTag(12, value.getBackgroundColor()) + encodedSizeWithTag;
                ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
                return protoAdapter.encodedSizeWithTag(23, value.getForceOdds()) + protoAdapter3.encodedSizeWithTag(22, value.getTakeoverImageHeight()) + protoAdapter.encodedSizeWithTag(21, value.getTakeoverImage()) + protoAdapter3.encodedSizeWithTag(20, value.getOddsProviderId()) + ImageDisplayType.ADAPTER.encodedSizeWithTag(19, value.getImageDisplayType()) + protoAdapter3.encodedSizeWithTag(18, value.getAdUnitHeight()) + protoAdapter3.encodedSizeWithTag(17, value.getBannerHeight()) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BrandingTournament redact(BrandingTournament value) {
                BrandingTournament copy;
                value.getClass();
                Brand brand = value.getBrand();
                Brand redact = brand != null ? Brand.ADAPTER.redact(brand) : null;
                BrandColors backgroundColor = value.getBackgroundColor();
                BrandColors redact2 = backgroundColor != null ? BrandColors.ADAPTER.redact(backgroundColor) : null;
                BrandColors eventListColor = value.getEventListColor();
                BrandColors redact3 = eventListColor != null ? BrandColors.ADAPTER.redact(eventListColor) : null;
                BrandingBackgroundColors backgroundGradientColor = value.getBackgroundGradientColor();
                copy = value.copy((r42 & 1) != 0 ? value.id : 0, (r42 & 2) != 0 ? value.brand : redact, (r42 & 4) != 0 ? value.eventList : null, (r42 & 8) != 0 ? value.standings : null, (r42 & 16) != 0 ? value.playerOfTheMatch : null, (r42 & 32) != 0 ? value.teamOfTheWeek : null, (r42 & 64) != 0 ? value.header : null, (r42 & 128) != 0 ? value.banner : null, (r42 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? value.details : null, (r42 & 512) != 0 ? value.url : null, (r42 & 1024) != 0 ? value.background : null, (r42 & a.o) != 0 ? value.backgroundColor : redact2, (r42 & 4096) != 0 ? value.eventListColor : redact3, (r42 & 8192) != 0 ? value.appHeader : null, (r42 & 16384) != 0 ? value.contentHeader : null, (r42 & 32768) != 0 ? value.backgroundGradientColor : backgroundGradientColor != null ? BrandingBackgroundColors.ADAPTER.redact(backgroundGradientColor) : null, (r42 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? value.bannerHeight : null, (r42 & 131072) != 0 ? value.adUnitHeight : null, (r42 & 262144) != 0 ? value.imageDisplayType : null, (r42 & 524288) != 0 ? value.oddsProviderId : null, (r42 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? value.takeoverImage : null, (r42 & 2097152) != 0 ? value.takeoverImageHeight : null, (r42 & 4194304) != 0 ? value.forceOdds : null, (r42 & 8388608) != 0 ? value.unknownFields() : gc2.d);
                return copy;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BrandingTournament value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 23, (int) value.getForceOdds());
                ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.encodeWithTag(writer, 22, (int) value.getTakeoverImageHeight());
                protoAdapter.encodeWithTag(writer, 21, (int) value.getTakeoverImage());
                protoAdapter2.encodeWithTag(writer, 20, (int) value.getOddsProviderId());
                ImageDisplayType.ADAPTER.encodeWithTag(writer, 19, (int) value.getImageDisplayType());
                protoAdapter2.encodeWithTag(writer, 18, (int) value.getAdUnitHeight());
                protoAdapter2.encodeWithTag(writer, 17, (int) value.getBannerHeight());
                BrandingBackgroundColors.ADAPTER.encodeWithTag(writer, 16, (int) value.getBackgroundGradientColor());
                protoAdapter.encodeWithTag(writer, 15, (int) value.getContentHeader());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getAppHeader());
                ProtoAdapter<BrandColors> protoAdapter3 = BrandColors.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 13, (int) value.getEventListColor());
                protoAdapter3.encodeWithTag(writer, 12, (int) value.getBackgroundColor());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getBackground());
                ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getUrl());
                protoAdapter.encodeWithTag(writer, 9, (int) value.getDetails());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getBanner());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getHeader());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getTeamOfTheWeek());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getPlayerOfTheMatch());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getStandings());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getEventList());
                if (value.getBrand() != null) {
                    Brand.ADAPTER.encodeWithTag(writer, 2, (int) value.getBrand());
                }
                if (value.getId() != 0) {
                    protoAdapter2.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getId()));
                }
            }
        };
    }

    public /* synthetic */ BrandingTournament(int i, Brand brand, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str, Boolean bool8, BrandColors brandColors, BrandColors brandColors2, Boolean bool9, Boolean bool10, BrandingBackgroundColors brandingBackgroundColors, Integer num, Integer num2, ImageDisplayType imageDisplayType, Integer num3, Boolean bool11, Integer num4, Boolean bool12, gc2 gc2Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : brand, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : bool2, (i2 & 16) != 0 ? null : bool3, (i2 & 32) != 0 ? null : bool4, (i2 & 64) != 0 ? null : bool5, (i2 & 128) != 0 ? null : bool6, (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : bool7, (i2 & 512) != 0 ? null : str, (i2 & 1024) != 0 ? null : bool8, (i2 & a.o) != 0 ? null : brandColors, (i2 & 4096) != 0 ? null : brandColors2, (i2 & 8192) != 0 ? null : bool9, (i2 & 16384) != 0 ? null : bool10, (i2 & 32768) != 0 ? null : brandingBackgroundColors, (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : num, (i2 & 131072) != 0 ? null : num2, (i2 & 262144) != 0 ? null : imageDisplayType, (i2 & 524288) != 0 ? null : num3, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool11, (i2 & 2097152) != 0 ? null : num4, (i2 & 4194304) != 0 ? null : bool12, (i2 & 8388608) != 0 ? gc2.d : gc2Var);
    }

    @NotNull
    public final BrandingTournament copy(int id, @Nullable Brand brand, @Nullable Boolean eventList, @Nullable Boolean standings, @Nullable Boolean playerOfTheMatch, @Nullable Boolean teamOfTheWeek, @Nullable Boolean header, @Nullable Boolean banner, @Nullable Boolean details, @Nullable String url, @Nullable Boolean background, @Nullable BrandColors backgroundColor, @Nullable BrandColors eventListColor, @Nullable Boolean appHeader, @Nullable Boolean contentHeader, @Nullable BrandingBackgroundColors backgroundGradientColor, @Nullable Integer bannerHeight, @Nullable Integer adUnitHeight, @Nullable ImageDisplayType imageDisplayType, @Nullable Integer oddsProviderId, @Nullable Boolean takeoverImage, @Nullable Integer takeoverImageHeight, @Nullable Boolean forceOdds, @NotNull gc2 unknownFields) {
        unknownFields.getClass();
        return new BrandingTournament(id, brand, eventList, standings, playerOfTheMatch, teamOfTheWeek, header, banner, details, url, background, backgroundColor, eventListColor, appHeader, contentHeader, backgroundGradientColor, bannerHeight, adUnitHeight, imageDisplayType, oddsProviderId, takeoverImage, takeoverImageHeight, forceOdds, unknownFields);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BrandingTournament)) {
            return false;
        }
        BrandingTournament brandingTournament = (BrandingTournament) other;
        return Intrinsics.c(unknownFields(), brandingTournament.unknownFields()) && this.id == brandingTournament.id && Intrinsics.c(this.brand, brandingTournament.brand) && Intrinsics.c(this.eventList, brandingTournament.eventList) && Intrinsics.c(this.standings, brandingTournament.standings) && Intrinsics.c(this.playerOfTheMatch, brandingTournament.playerOfTheMatch) && Intrinsics.c(this.teamOfTheWeek, brandingTournament.teamOfTheWeek) && Intrinsics.c(this.header, brandingTournament.header) && Intrinsics.c(this.banner, brandingTournament.banner) && Intrinsics.c(this.details, brandingTournament.details) && Intrinsics.c(this.url, brandingTournament.url) && Intrinsics.c(this.background, brandingTournament.background) && Intrinsics.c(this.backgroundColor, brandingTournament.backgroundColor) && Intrinsics.c(this.eventListColor, brandingTournament.eventListColor) && Intrinsics.c(this.appHeader, brandingTournament.appHeader) && Intrinsics.c(this.contentHeader, brandingTournament.contentHeader) && Intrinsics.c(this.backgroundGradientColor, brandingTournament.backgroundGradientColor) && Intrinsics.c(this.bannerHeight, brandingTournament.bannerHeight) && Intrinsics.c(this.adUnitHeight, brandingTournament.adUnitHeight) && this.imageDisplayType == brandingTournament.imageDisplayType && Intrinsics.c(this.oddsProviderId, brandingTournament.oddsProviderId) && Intrinsics.c(this.takeoverImage, brandingTournament.takeoverImage) && Intrinsics.c(this.takeoverImageHeight, brandingTournament.takeoverImageHeight) && Intrinsics.c(this.forceOdds, brandingTournament.forceOdds);
    }

    @Nullable
    public final Integer getAdUnitHeight() {
        return this.adUnitHeight;
    }

    @Nullable
    public final Boolean getAppHeader() {
        return this.appHeader;
    }

    @Nullable
    public final Boolean getBackground() {
        return this.background;
    }

    @Nullable
    public final BrandColors getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final BrandingBackgroundColors getBackgroundGradientColor() {
        return this.backgroundGradientColor;
    }

    @Nullable
    public final Boolean getBanner() {
        return this.banner;
    }

    @Nullable
    public final Integer getBannerHeight() {
        return this.bannerHeight;
    }

    @Nullable
    public final Brand getBrand() {
        return this.brand;
    }

    @Nullable
    public final Boolean getContentHeader() {
        return this.contentHeader;
    }

    @Nullable
    public final Boolean getDetails() {
        return this.details;
    }

    @Nullable
    public final Boolean getEventList() {
        return this.eventList;
    }

    @Nullable
    public final BrandColors getEventListColor() {
        return this.eventListColor;
    }

    @Nullable
    public final Boolean getForceOdds() {
        return this.forceOdds;
    }

    @Nullable
    public final Boolean getHeader() {
        return this.header;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final ImageDisplayType getImageDisplayType() {
        return this.imageDisplayType;
    }

    @Nullable
    public final Integer getOddsProviderId() {
        return this.oddsProviderId;
    }

    @Nullable
    public final Boolean getPlayerOfTheMatch() {
        return this.playerOfTheMatch;
    }

    @Nullable
    public final Boolean getStandings() {
        return this.standings;
    }

    @Nullable
    public final Boolean getTakeoverImage() {
        return this.takeoverImage;
    }

    @Nullable
    public final Integer getTakeoverImageHeight() {
        return this.takeoverImageHeight;
    }

    @Nullable
    public final Boolean getTeamOfTheWeek() {
        return this.teamOfTheWeek;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int a = wv8.a(this.id, unknownFields().hashCode() * 37, 37);
        Brand brand = this.brand;
        int hashCode = (a + (brand != null ? brand.hashCode() : 0)) * 37;
        Boolean bool = this.eventList;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.standings;
        int hashCode3 = (hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.playerOfTheMatch;
        int hashCode4 = (hashCode3 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        Boolean bool4 = this.teamOfTheWeek;
        int hashCode5 = (hashCode4 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        Boolean bool5 = this.header;
        int hashCode6 = (hashCode5 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
        Boolean bool6 = this.banner;
        int hashCode7 = (hashCode6 + (bool6 != null ? Boolean.hashCode(bool6.booleanValue()) : 0)) * 37;
        Boolean bool7 = this.details;
        int hashCode8 = (hashCode7 + (bool7 != null ? Boolean.hashCode(bool7.booleanValue()) : 0)) * 37;
        String str = this.url;
        int hashCode9 = (hashCode8 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool8 = this.background;
        int hashCode10 = (hashCode9 + (bool8 != null ? Boolean.hashCode(bool8.booleanValue()) : 0)) * 37;
        BrandColors brandColors = this.backgroundColor;
        int hashCode11 = (hashCode10 + (brandColors != null ? brandColors.hashCode() : 0)) * 37;
        BrandColors brandColors2 = this.eventListColor;
        int hashCode12 = (hashCode11 + (brandColors2 != null ? brandColors2.hashCode() : 0)) * 37;
        Boolean bool9 = this.appHeader;
        int hashCode13 = (hashCode12 + (bool9 != null ? Boolean.hashCode(bool9.booleanValue()) : 0)) * 37;
        Boolean bool10 = this.contentHeader;
        int hashCode14 = (hashCode13 + (bool10 != null ? Boolean.hashCode(bool10.booleanValue()) : 0)) * 37;
        BrandingBackgroundColors brandingBackgroundColors = this.backgroundGradientColor;
        int hashCode15 = (hashCode14 + (brandingBackgroundColors != null ? brandingBackgroundColors.hashCode() : 0)) * 37;
        Integer num = this.bannerHeight;
        int hashCode16 = (hashCode15 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.adUnitHeight;
        int hashCode17 = (hashCode16 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        ImageDisplayType imageDisplayType = this.imageDisplayType;
        int hashCode18 = (hashCode17 + (imageDisplayType != null ? imageDisplayType.hashCode() : 0)) * 37;
        Integer num3 = this.oddsProviderId;
        int hashCode19 = (hashCode18 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0)) * 37;
        Boolean bool11 = this.takeoverImage;
        int hashCode20 = (hashCode19 + (bool11 != null ? Boolean.hashCode(bool11.booleanValue()) : 0)) * 37;
        Integer num4 = this.takeoverImageHeight;
        int hashCode21 = (hashCode20 + (num4 != null ? Integer.hashCode(num4.intValue()) : 0)) * 37;
        Boolean bool12 = this.forceOdds;
        int hashCode22 = hashCode21 + (bool12 != null ? Boolean.hashCode(bool12.booleanValue()) : 0);
        this.hashCode = hashCode22;
        return hashCode22;
    }

    @wx4
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m686newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.id);
        Brand brand = this.brand;
        if (brand != null) {
            arrayList.add("brand=" + brand);
        }
        Boolean bool = this.eventList;
        if (bool != null) {
            mz1.y("eventList=", bool, arrayList);
        }
        Boolean bool2 = this.standings;
        if (bool2 != null) {
            mz1.y("standings=", bool2, arrayList);
        }
        Boolean bool3 = this.playerOfTheMatch;
        if (bool3 != null) {
            mz1.y("playerOfTheMatch=", bool3, arrayList);
        }
        Boolean bool4 = this.teamOfTheWeek;
        if (bool4 != null) {
            mz1.y("teamOfTheWeek=", bool4, arrayList);
        }
        Boolean bool5 = this.header;
        if (bool5 != null) {
            mz1.y("header=", bool5, arrayList);
        }
        Boolean bool6 = this.banner;
        if (bool6 != null) {
            mz1.y("banner=", bool6, arrayList);
        }
        Boolean bool7 = this.details;
        if (bool7 != null) {
            mz1.y("details=", bool7, arrayList);
        }
        String str = this.url;
        if (str != null) {
            mz1.A(arrayList, "url=", Internal.sanitize(str));
        }
        Boolean bool8 = this.background;
        if (bool8 != null) {
            mz1.y("background=", bool8, arrayList);
        }
        BrandColors brandColors = this.backgroundColor;
        if (brandColors != null) {
            arrayList.add("backgroundColor=" + brandColors);
        }
        BrandColors brandColors2 = this.eventListColor;
        if (brandColors2 != null) {
            arrayList.add("eventListColor=" + brandColors2);
        }
        Boolean bool9 = this.appHeader;
        if (bool9 != null) {
            mz1.y("appHeader=", bool9, arrayList);
        }
        Boolean bool10 = this.contentHeader;
        if (bool10 != null) {
            mz1.y("contentHeader=", bool10, arrayList);
        }
        BrandingBackgroundColors brandingBackgroundColors = this.backgroundGradientColor;
        if (brandingBackgroundColors != null) {
            arrayList.add("backgroundGradientColor=" + brandingBackgroundColors);
        }
        Integer num = this.bannerHeight;
        if (num != null) {
            arrayList.add("bannerHeight=" + num);
        }
        Integer num2 = this.adUnitHeight;
        if (num2 != null) {
            arrayList.add("adUnitHeight=" + num2);
        }
        ImageDisplayType imageDisplayType = this.imageDisplayType;
        if (imageDisplayType != null) {
            arrayList.add("imageDisplayType=" + imageDisplayType);
        }
        Integer num3 = this.oddsProviderId;
        if (num3 != null) {
            arrayList.add("oddsProviderId=" + num3);
        }
        Boolean bool11 = this.takeoverImage;
        if (bool11 != null) {
            mz1.y("takeoverImage=", bool11, arrayList);
        }
        Integer num4 = this.takeoverImageHeight;
        if (num4 != null) {
            arrayList.add("takeoverImageHeight=" + num4);
        }
        Boolean bool12 = this.forceOdds;
        if (bool12 != null) {
            mz1.y("forceOdds=", bool12, arrayList);
        }
        return CollectionsKt.f0(arrayList, ", ", "BrandingTournament{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m686newBuilder();
    }

    public BrandingTournament() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandingTournament(int i, @Nullable Brand brand, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable String str, @Nullable Boolean bool8, @Nullable BrandColors brandColors, @Nullable BrandColors brandColors2, @Nullable Boolean bool9, @Nullable Boolean bool10, @Nullable BrandingBackgroundColors brandingBackgroundColors, @Nullable Integer num, @Nullable Integer num2, @Nullable ImageDisplayType imageDisplayType, @Nullable Integer num3, @Nullable Boolean bool11, @Nullable Integer num4, @Nullable Boolean bool12, @NotNull gc2 gc2Var) {
        super(ADAPTER, gc2Var);
        gc2Var.getClass();
        this.id = i;
        this.brand = brand;
        this.eventList = bool;
        this.standings = bool2;
        this.playerOfTheMatch = bool3;
        this.teamOfTheWeek = bool4;
        this.header = bool5;
        this.banner = bool6;
        this.details = bool7;
        this.url = str;
        this.background = bool8;
        this.backgroundColor = brandColors;
        this.eventListColor = brandColors2;
        this.appHeader = bool9;
        this.contentHeader = bool10;
        this.backgroundGradientColor = brandingBackgroundColors;
        this.bannerHeight = num;
        this.adUnitHeight = num2;
        this.imageDisplayType = imageDisplayType;
        this.oddsProviderId = num3;
        this.takeoverImage = bool11;
        this.takeoverImageHeight = num4;
        this.forceOdds = bool12;
    }
}
