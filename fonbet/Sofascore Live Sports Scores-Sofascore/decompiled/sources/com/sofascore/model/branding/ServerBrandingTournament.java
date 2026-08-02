package com.sofascore.model.branding;

import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.buzzer.BuzzerConfigResponseKt;
import defpackage.a7a;
import defpackage.gz1;
import defpackage.joa;
import defpackage.m6h;
import defpackage.oea;
import defpackage.q79;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b'\b\u0087\b\u0018\u0000 z2\u00020\u0001:\u0002{zBÿ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\"\u0010#B\u0095\u0002\b\u0010\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\"\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b/\u0010-J\u0012\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b0\u0010-J\u0012\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b1\u0010-J\u0012\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b2\u0010-J\u0012\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b3\u0010-J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b6\u0010-J\u001e\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b9\u0010-J\u0012\u0010:\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b<\u0010-J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u00105J\u0012\u0010>\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b@\u0010;J\u0012\u0010A\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u00105J\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u00105J\u0012\u0010E\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bE\u0010-J\u0012\u0010F\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bF\u0010-J\u0012\u0010G\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bG\u0010HJ¸\u0002\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\bK\u0010HJ\u0010\u0010L\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bL\u0010)J\u001a\u0010N\u001a\u00020\u00062\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bN\u0010OJ'\u0010X\u001a\u00020U2\u0006\u0010P\u001a\u00020\u00002\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020SH\u0001¢\u0006\u0004\bV\u0010WR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010Y\u001a\u0004\bZ\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010[\u001a\u0004\b\\\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010]\u001a\u0004\b^\u0010-R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010]\u001a\u0004\b_\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010]\u001a\u0004\b`\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010]\u001a\u0004\ba\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010]\u001a\u0004\bb\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010]\u001a\u0004\bc\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010]\u001a\u0004\bd\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010e\u001a\u0004\bf\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010]\u001a\u0004\bg\u0010-R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010h\u001a\u0004\bi\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010]\u001a\u0004\bj\u0010-R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010k\u001a\u0004\bl\u0010;R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010]\u001a\u0004\bm\u0010-R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010e\u001a\u0004\bn\u00105R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010o\u001a\u0004\bp\u0010?R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u001a\u0010k\u001a\u0004\bq\u0010;R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010r\u001a\u0004\bs\u0010BR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010e\u001a\u0004\bt\u00105R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010e\u001a\u0004\bu\u00105R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010]\u001a\u0004\bv\u0010-R\u0019\u0010 \u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010]\u001a\u0004\bw\u0010-R\u0019\u0010!\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b!\u0010x\u001a\u0004\by\u0010H¨\u0006|"}, d2 = {"Lcom/sofascore/model/branding/ServerBrandingTournament;", "", "", "id", "Lcom/sofascore/model/branding/ServerBrand;", "brand", "", "eventList", "standings", "playerOfTheMatch", BuzzerConfigResponseKt.TEAM_OF_THE_WEEK, "header", "banner", "details", "oddsProviderId", "forceOdds", "", "", "standingsText", "background", "Lcom/sofascore/model/branding/ServerBrandColors;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "takeoverImage", "takeoverImageHeight", "Lcom/sofascore/model/branding/ServerBrandingBackgroundColors;", "backgroundGradientColor", "eventListColor", "Lcom/sofascore/model/branding/ServerImageDisplayType;", "imageDisplayType", "bannerHeight", "adUnitHeight", "appHeader", "contentHeader", "url", "<init>", "(ILcom/sofascore/model/branding/ServerBrand;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Boolean;Lcom/sofascore/model/branding/ServerBrandColors;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/sofascore/model/branding/ServerBrandingBackgroundColors;Lcom/sofascore/model/branding/ServerBrandColors;Lcom/sofascore/model/branding/ServerImageDisplayType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/branding/ServerBrand;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Boolean;Lcom/sofascore/model/branding/ServerBrandColors;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/sofascore/model/branding/ServerBrandingBackgroundColors;Lcom/sofascore/model/branding/ServerBrandColors;Lcom/sofascore/model/branding/ServerImageDisplayType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lt5h;)V", "component1", "()I", "component2", "()Lcom/sofascore/model/branding/ServerBrand;", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/lang/Integer;", "component11", "component12", "()Ljava/util/Map;", "component13", "component14", "()Lcom/sofascore/model/branding/ServerBrandColors;", "component15", "component16", "component17", "()Lcom/sofascore/model/branding/ServerBrandingBackgroundColors;", "component18", "component19", "()Lcom/sofascore/model/branding/ServerImageDisplayType;", "component20", "component21", "component22", "component23", "component24", "()Ljava/lang/String;", "copy", "(ILcom/sofascore/model/branding/ServerBrand;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Boolean;Lcom/sofascore/model/branding/ServerBrandColors;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/sofascore/model/branding/ServerBrandingBackgroundColors;Lcom/sofascore/model/branding/ServerBrandColors;Lcom/sofascore/model/branding/ServerImageDisplayType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/sofascore/model/branding/ServerBrandingTournament;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/branding/ServerBrandingTournament;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Lcom/sofascore/model/branding/ServerBrand;", "getBrand", "Ljava/lang/Boolean;", "getEventList", "getStandings", "getPlayerOfTheMatch", "getTeamOfTheWeek", "getHeader", "getBanner", "getDetails", "Ljava/lang/Integer;", "getOddsProviderId", "getForceOdds", "Ljava/util/Map;", "getStandingsText", "getBackground", "Lcom/sofascore/model/branding/ServerBrandColors;", "getBackgroundColor", "getTakeoverImage", "getTakeoverImageHeight", "Lcom/sofascore/model/branding/ServerBrandingBackgroundColors;", "getBackgroundGradientColor", "getEventListColor", "Lcom/sofascore/model/branding/ServerImageDisplayType;", "getImageDisplayType", "getBannerHeight", "getAdUnitHeight", "getAppHeader", "getContentHeader", "Ljava/lang/String;", "getUrl", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ServerBrandingTournament {

    @Nullable
    private final Integer adUnitHeight;

    @Nullable
    private final Boolean appHeader;

    @Nullable
    private final Boolean background;

    @Nullable
    private final ServerBrandColors backgroundColor;

    @Nullable
    private final ServerBrandingBackgroundColors backgroundGradientColor;

    @Nullable
    private final Boolean banner;

    @Nullable
    private final Integer bannerHeight;

    @NotNull
    private final ServerBrand brand;

    @Nullable
    private final Boolean contentHeader;

    @Nullable
    private final Boolean details;

    @Nullable
    private final Boolean eventList;

    @Nullable
    private final ServerBrandColors eventListColor;

    @Nullable
    private final Boolean forceOdds;

    @Nullable
    private final Boolean header;
    private final int id;

    @Nullable
    private final ServerImageDisplayType imageDisplayType;

    @Nullable
    private final Integer oddsProviderId;

    @Nullable
    private final Boolean playerOfTheMatch;

    @Nullable
    private final Boolean standings;

    @Nullable
    private final Map<String, String> standingsText;

    @Nullable
    private final Boolean takeoverImage;

    @Nullable
    private final Integer takeoverImageHeight;

    @Nullable
    private final Boolean teamOfTheWeek;

    @Nullable
    private final String url;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysa.b, new m6h(5)), null, null, null, null, null, null, null, null, null, null, null, null};

    public /* synthetic */ ServerBrandingTournament(int i, int i2, ServerBrand serverBrand, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Integer num, Boolean bool8, Map map, Boolean bool9, ServerBrandColors serverBrandColors, Boolean bool10, Integer num2, ServerBrandingBackgroundColors serverBrandingBackgroundColors, ServerBrandColors serverBrandColors2, ServerImageDisplayType serverImageDisplayType, Integer num3, Integer num4, Boolean bool11, Boolean bool12, String str, t5h t5hVar) {
        if (16777215 != (i & 16777215)) {
            oea.z(i, 16777215, ServerBrandingTournament$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.brand = serverBrand;
        this.eventList = bool;
        this.standings = bool2;
        this.playerOfTheMatch = bool3;
        this.teamOfTheWeek = bool4;
        this.header = bool5;
        this.banner = bool6;
        this.details = bool7;
        this.oddsProviderId = num;
        this.forceOdds = bool8;
        this.standingsText = map;
        this.background = bool9;
        this.backgroundColor = serverBrandColors;
        this.takeoverImage = bool10;
        this.takeoverImageHeight = num2;
        this.backgroundGradientColor = serverBrandingBackgroundColors;
        this.eventListColor = serverBrandColors2;
        this.imageDisplayType = serverImageDisplayType;
        this.bannerHeight = num3;
        this.adUnitHeight = num4;
        this.appHeader = bool11;
        this.contentHeader = bool12;
        this.url = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        uhi uhiVar = uhi.a;
        return new q79(uhiVar, uhiVar, 1);
    }

    public static /* synthetic */ ServerBrandingTournament copy$default(ServerBrandingTournament serverBrandingTournament, int i, ServerBrand serverBrand, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Integer num, Boolean bool8, Map map, Boolean bool9, ServerBrandColors serverBrandColors, Boolean bool10, Integer num2, ServerBrandingBackgroundColors serverBrandingBackgroundColors, ServerBrandColors serverBrandColors2, ServerImageDisplayType serverImageDisplayType, Integer num3, Integer num4, Boolean bool11, Boolean bool12, String str, int i2, Object obj) {
        String str2;
        Boolean bool13;
        int i3 = (i2 & 1) != 0 ? serverBrandingTournament.id : i;
        ServerBrand serverBrand2 = (i2 & 2) != 0 ? serverBrandingTournament.brand : serverBrand;
        Boolean bool14 = (i2 & 4) != 0 ? serverBrandingTournament.eventList : bool;
        Boolean bool15 = (i2 & 8) != 0 ? serverBrandingTournament.standings : bool2;
        Boolean bool16 = (i2 & 16) != 0 ? serverBrandingTournament.playerOfTheMatch : bool3;
        Boolean bool17 = (i2 & 32) != 0 ? serverBrandingTournament.teamOfTheWeek : bool4;
        Boolean bool18 = (i2 & 64) != 0 ? serverBrandingTournament.header : bool5;
        Boolean bool19 = (i2 & 128) != 0 ? serverBrandingTournament.banner : bool6;
        Boolean bool20 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? serverBrandingTournament.details : bool7;
        Integer num5 = (i2 & 512) != 0 ? serverBrandingTournament.oddsProviderId : num;
        Boolean bool21 = (i2 & 1024) != 0 ? serverBrandingTournament.forceOdds : bool8;
        Map map2 = (i2 & a.o) != 0 ? serverBrandingTournament.standingsText : map;
        Boolean bool22 = (i2 & 4096) != 0 ? serverBrandingTournament.background : bool9;
        ServerBrandColors serverBrandColors3 = (i2 & 8192) != 0 ? serverBrandingTournament.backgroundColor : serverBrandColors;
        int i4 = i3;
        Boolean bool23 = (i2 & 16384) != 0 ? serverBrandingTournament.takeoverImage : bool10;
        Integer num6 = (i2 & 32768) != 0 ? serverBrandingTournament.takeoverImageHeight : num2;
        ServerBrandingBackgroundColors serverBrandingBackgroundColors2 = (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? serverBrandingTournament.backgroundGradientColor : serverBrandingBackgroundColors;
        ServerBrandColors serverBrandColors4 = (i2 & 131072) != 0 ? serverBrandingTournament.eventListColor : serverBrandColors2;
        ServerImageDisplayType serverImageDisplayType2 = (i2 & 262144) != 0 ? serverBrandingTournament.imageDisplayType : serverImageDisplayType;
        Integer num7 = (i2 & 524288) != 0 ? serverBrandingTournament.bannerHeight : num3;
        Integer num8 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? serverBrandingTournament.adUnitHeight : num4;
        Boolean bool24 = (i2 & 2097152) != 0 ? serverBrandingTournament.appHeader : bool11;
        Boolean bool25 = (i2 & 4194304) != 0 ? serverBrandingTournament.contentHeader : bool12;
        if ((i2 & 8388608) != 0) {
            bool13 = bool25;
            str2 = serverBrandingTournament.url;
        } else {
            str2 = str;
            bool13 = bool25;
        }
        return serverBrandingTournament.copy(i4, serverBrand2, bool14, bool15, bool16, bool17, bool18, bool19, bool20, num5, bool21, map2, bool22, serverBrandColors3, bool23, num6, serverBrandingBackgroundColors2, serverBrandColors4, serverImageDisplayType2, num7, num8, bool24, bool13, str2);
    }

    public static final /* synthetic */ void write$Self$model_release(ServerBrandingTournament self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.f(serialDesc, 1, ServerBrand$$serializer.INSTANCE, self.brand);
        gz1 gz1Var = gz1.a;
        output.h(serialDesc, 2, gz1Var, self.eventList);
        output.h(serialDesc, 3, gz1Var, self.standings);
        output.h(serialDesc, 4, gz1Var, self.playerOfTheMatch);
        output.h(serialDesc, 5, gz1Var, self.teamOfTheWeek);
        output.h(serialDesc, 6, gz1Var, self.header);
        output.h(serialDesc, 7, gz1Var, self.banner);
        output.h(serialDesc, 8, gz1Var, self.details);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 9, a7aVar, self.oddsProviderId);
        output.h(serialDesc, 10, gz1Var, self.forceOdds);
        output.h(serialDesc, 11, (KSerializer) joaVarArr[11].getValue(), self.standingsText);
        output.h(serialDesc, 12, gz1Var, self.background);
        ServerBrandColors$$serializer serverBrandColors$$serializer = ServerBrandColors$$serializer.INSTANCE;
        output.h(serialDesc, 13, serverBrandColors$$serializer, self.backgroundColor);
        output.h(serialDesc, 14, gz1Var, self.takeoverImage);
        output.h(serialDesc, 15, a7aVar, self.takeoverImageHeight);
        output.h(serialDesc, 16, ServerBrandingBackgroundColors$$serializer.INSTANCE, self.backgroundGradientColor);
        output.h(serialDesc, 17, serverBrandColors$$serializer, self.eventListColor);
        output.h(serialDesc, 18, ImageDisplayTypeSerializer.INSTANCE, self.imageDisplayType);
        output.h(serialDesc, 19, a7aVar, self.bannerHeight);
        output.h(serialDesc, 20, a7aVar, self.adUnitHeight);
        output.h(serialDesc, 21, gz1Var, self.appHeader);
        output.h(serialDesc, 22, gz1Var, self.contentHeader);
        output.h(serialDesc, 23, uhi.a, self.url);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getOddsProviderId() {
        return this.oddsProviderId;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Boolean getForceOdds() {
        return this.forceOdds;
    }

    @Nullable
    public final Map<String, String> component12() {
        return this.standingsText;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Boolean getBackground() {
        return this.background;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final ServerBrandColors getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Boolean getTakeoverImage() {
        return this.takeoverImage;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getTakeoverImageHeight() {
        return this.takeoverImageHeight;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final ServerBrandingBackgroundColors getBackgroundGradientColor() {
        return this.backgroundGradientColor;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final ServerBrandColors getEventListColor() {
        return this.eventListColor;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final ServerImageDisplayType getImageDisplayType() {
        return this.imageDisplayType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ServerBrand getBrand() {
        return this.brand;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getBannerHeight() {
        return this.bannerHeight;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Integer getAdUnitHeight() {
        return this.adUnitHeight;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Boolean getAppHeader() {
        return this.appHeader;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Boolean getContentHeader() {
        return this.contentHeader;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Boolean getEventList() {
        return this.eventList;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Boolean getStandings() {
        return this.standings;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Boolean getPlayerOfTheMatch() {
        return this.playerOfTheMatch;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Boolean getTeamOfTheWeek() {
        return this.teamOfTheWeek;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Boolean getHeader() {
        return this.header;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Boolean getBanner() {
        return this.banner;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Boolean getDetails() {
        return this.details;
    }

    @NotNull
    public final ServerBrandingTournament copy(int id, @NotNull ServerBrand brand, @Nullable Boolean eventList, @Nullable Boolean standings, @Nullable Boolean playerOfTheMatch, @Nullable Boolean teamOfTheWeek, @Nullable Boolean header, @Nullable Boolean banner, @Nullable Boolean details, @Nullable Integer oddsProviderId, @Nullable Boolean forceOdds, @Nullable Map<String, String> standingsText, @Nullable Boolean background, @Nullable ServerBrandColors backgroundColor, @Nullable Boolean takeoverImage, @Nullable Integer takeoverImageHeight, @Nullable ServerBrandingBackgroundColors backgroundGradientColor, @Nullable ServerBrandColors eventListColor, @Nullable ServerImageDisplayType imageDisplayType, @Nullable Integer bannerHeight, @Nullable Integer adUnitHeight, @Nullable Boolean appHeader, @Nullable Boolean contentHeader, @Nullable String url) {
        brand.getClass();
        return new ServerBrandingTournament(id, brand, eventList, standings, playerOfTheMatch, teamOfTheWeek, header, banner, details, oddsProviderId, forceOdds, standingsText, background, backgroundColor, takeoverImage, takeoverImageHeight, backgroundGradientColor, eventListColor, imageDisplayType, bannerHeight, adUnitHeight, appHeader, contentHeader, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerBrandingTournament)) {
            return false;
        }
        ServerBrandingTournament serverBrandingTournament = (ServerBrandingTournament) other;
        return this.id == serverBrandingTournament.id && Intrinsics.c(this.brand, serverBrandingTournament.brand) && Intrinsics.c(this.eventList, serverBrandingTournament.eventList) && Intrinsics.c(this.standings, serverBrandingTournament.standings) && Intrinsics.c(this.playerOfTheMatch, serverBrandingTournament.playerOfTheMatch) && Intrinsics.c(this.teamOfTheWeek, serverBrandingTournament.teamOfTheWeek) && Intrinsics.c(this.header, serverBrandingTournament.header) && Intrinsics.c(this.banner, serverBrandingTournament.banner) && Intrinsics.c(this.details, serverBrandingTournament.details) && Intrinsics.c(this.oddsProviderId, serverBrandingTournament.oddsProviderId) && Intrinsics.c(this.forceOdds, serverBrandingTournament.forceOdds) && Intrinsics.c(this.standingsText, serverBrandingTournament.standingsText) && Intrinsics.c(this.background, serverBrandingTournament.background) && Intrinsics.c(this.backgroundColor, serverBrandingTournament.backgroundColor) && Intrinsics.c(this.takeoverImage, serverBrandingTournament.takeoverImage) && Intrinsics.c(this.takeoverImageHeight, serverBrandingTournament.takeoverImageHeight) && Intrinsics.c(this.backgroundGradientColor, serverBrandingTournament.backgroundGradientColor) && Intrinsics.c(this.eventListColor, serverBrandingTournament.eventListColor) && this.imageDisplayType == serverBrandingTournament.imageDisplayType && Intrinsics.c(this.bannerHeight, serverBrandingTournament.bannerHeight) && Intrinsics.c(this.adUnitHeight, serverBrandingTournament.adUnitHeight) && Intrinsics.c(this.appHeader, serverBrandingTournament.appHeader) && Intrinsics.c(this.contentHeader, serverBrandingTournament.contentHeader) && Intrinsics.c(this.url, serverBrandingTournament.url);
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
    public final ServerBrandColors getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final ServerBrandingBackgroundColors getBackgroundGradientColor() {
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

    @NotNull
    public final ServerBrand getBrand() {
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
    public final ServerBrandColors getEventListColor() {
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
    public final ServerImageDisplayType getImageDisplayType() {
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
    public final Map<String, String> getStandingsText() {
        return this.standingsText;
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
        int hashCode = (this.brand.hashCode() + (Integer.hashCode(this.id) * 31)) * 31;
        Boolean bool = this.eventList;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.standings;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.playerOfTheMatch;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.teamOfTheWeek;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.header;
        int hashCode6 = (hashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.banner;
        int hashCode7 = (hashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.details;
        int hashCode8 = (hashCode7 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Integer num = this.oddsProviderId;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool8 = this.forceOdds;
        int hashCode10 = (hashCode9 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Map<String, String> map = this.standingsText;
        int hashCode11 = (hashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool9 = this.background;
        int hashCode12 = (hashCode11 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        ServerBrandColors serverBrandColors = this.backgroundColor;
        int hashCode13 = (hashCode12 + (serverBrandColors == null ? 0 : serverBrandColors.hashCode())) * 31;
        Boolean bool10 = this.takeoverImage;
        int hashCode14 = (hashCode13 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Integer num2 = this.takeoverImageHeight;
        int hashCode15 = (hashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ServerBrandingBackgroundColors serverBrandingBackgroundColors = this.backgroundGradientColor;
        int hashCode16 = (hashCode15 + (serverBrandingBackgroundColors == null ? 0 : serverBrandingBackgroundColors.hashCode())) * 31;
        ServerBrandColors serverBrandColors2 = this.eventListColor;
        int hashCode17 = (hashCode16 + (serverBrandColors2 == null ? 0 : serverBrandColors2.hashCode())) * 31;
        ServerImageDisplayType serverImageDisplayType = this.imageDisplayType;
        int hashCode18 = (hashCode17 + (serverImageDisplayType == null ? 0 : serverImageDisplayType.hashCode())) * 31;
        Integer num3 = this.bannerHeight;
        int hashCode19 = (hashCode18 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.adUnitHeight;
        int hashCode20 = (hashCode19 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool11 = this.appHeader;
        int hashCode21 = (hashCode20 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.contentHeader;
        int hashCode22 = (hashCode21 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        String str = this.url;
        return hashCode22 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        ServerBrand serverBrand = this.brand;
        Boolean bool = this.eventList;
        Boolean bool2 = this.standings;
        Boolean bool3 = this.playerOfTheMatch;
        Boolean bool4 = this.teamOfTheWeek;
        Boolean bool5 = this.header;
        Boolean bool6 = this.banner;
        Boolean bool7 = this.details;
        Integer num = this.oddsProviderId;
        Boolean bool8 = this.forceOdds;
        Map<String, String> map = this.standingsText;
        Boolean bool9 = this.background;
        ServerBrandColors serverBrandColors = this.backgroundColor;
        Boolean bool10 = this.takeoverImage;
        Integer num2 = this.takeoverImageHeight;
        ServerBrandingBackgroundColors serverBrandingBackgroundColors = this.backgroundGradientColor;
        ServerBrandColors serverBrandColors2 = this.eventListColor;
        ServerImageDisplayType serverImageDisplayType = this.imageDisplayType;
        Integer num3 = this.bannerHeight;
        Integer num4 = this.adUnitHeight;
        Boolean bool11 = this.appHeader;
        Boolean bool12 = this.contentHeader;
        String str = this.url;
        StringBuilder sb = new StringBuilder("ServerBrandingTournament(id=");
        sb.append(i);
        sb.append(", brand=");
        sb.append(serverBrand);
        sb.append(", eventList=");
        i.q(sb, bool, ", standings=", bool2, ", playerOfTheMatch=");
        i.q(sb, bool3, ", teamOfTheWeek=", bool4, ", header=");
        i.q(sb, bool5, ", banner=", bool6, ", details=");
        sb.append(bool7);
        sb.append(", oddsProviderId=");
        sb.append(num);
        sb.append(", forceOdds=");
        sb.append(bool8);
        sb.append(", standingsText=");
        sb.append(map);
        sb.append(", background=");
        sb.append(bool9);
        sb.append(", backgroundColor=");
        sb.append(serverBrandColors);
        sb.append(", takeoverImage=");
        sb.append(bool10);
        sb.append(", takeoverImageHeight=");
        sb.append(num2);
        sb.append(", backgroundGradientColor=");
        sb.append(serverBrandingBackgroundColors);
        sb.append(", eventListColor=");
        sb.append(serverBrandColors2);
        sb.append(", imageDisplayType=");
        sb.append(serverImageDisplayType);
        sb.append(", bannerHeight=");
        sb.append(num3);
        sb.append(", adUnitHeight=");
        vxd.v(sb, num4, ", appHeader=", bool11, ", contentHeader=");
        sb.append(bool12);
        sb.append(", url=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/branding/ServerBrandingTournament$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/branding/ServerBrandingTournament;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ServerBrandingTournament$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ServerBrandingTournament(int i, @NotNull ServerBrand serverBrand, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable Integer num, @Nullable Boolean bool8, @Nullable Map<String, String> map, @Nullable Boolean bool9, @Nullable ServerBrandColors serverBrandColors, @Nullable Boolean bool10, @Nullable Integer num2, @Nullable ServerBrandingBackgroundColors serverBrandingBackgroundColors, @Nullable ServerBrandColors serverBrandColors2, @Nullable ServerImageDisplayType serverImageDisplayType, @Nullable Integer num3, @Nullable Integer num4, @Nullable Boolean bool11, @Nullable Boolean bool12, @Nullable String str) {
        serverBrand.getClass();
        this.id = i;
        this.brand = serverBrand;
        this.eventList = bool;
        this.standings = bool2;
        this.playerOfTheMatch = bool3;
        this.teamOfTheWeek = bool4;
        this.header = bool5;
        this.banner = bool6;
        this.details = bool7;
        this.oddsProviderId = num;
        this.forceOdds = bool8;
        this.standingsText = map;
        this.background = bool9;
        this.backgroundColor = serverBrandColors;
        this.takeoverImage = bool10;
        this.takeoverImageHeight = num2;
        this.backgroundGradientColor = serverBrandingBackgroundColors;
        this.eventListColor = serverBrandColors2;
        this.imageDisplayType = serverImageDisplayType;
        this.bannerHeight = num3;
        this.adUnitHeight = num4;
        this.appHeader = bool11;
        this.contentHeader = bool12;
        this.url = str;
    }
}
