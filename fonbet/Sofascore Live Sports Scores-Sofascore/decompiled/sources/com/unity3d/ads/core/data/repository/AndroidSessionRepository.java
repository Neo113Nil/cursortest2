package com.unity3d.ads.core.data.repository;

import androidx.core.app.NotificationCompat;
import com.google.protobuf.ByteString;
import com.ironsource.U3;
import com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.GatewayUrl;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.properties.SessionIdReader;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.aeh;
import defpackage.au3;
import defpackage.b1d;
import defpackage.b98;
import defpackage.beh;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.hoi;
import defpackage.il4;
import defpackage.km5;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.td4;
import defpackage.un0;
import defpackage.wv8;
import defpackage.xdh;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yf4;
import defpackage.z88;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersKt;
import gatewayprotocol.v1.SessionCountersOuterClass;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010\u0015J\u0017\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010\u001eJ\u000f\u0010#\u001a\u00020\u0013H\u0016¢\u0006\u0004\b#\u0010\u0015J\u000f\u0010$\u001a\u00020\u0013H\u0016¢\u0006\u0004\b$\u0010\u0015J\u000f\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010\u0015J\u000f\u0010&\u001a\u00020\u0013H\u0016¢\u0006\u0004\b&\u0010\u0015J\u000f\u0010'\u001a\u00020\u0013H\u0016¢\u0006\u0004\b'\u0010\u0015J\u000f\u0010(\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010\u0015J\u000f\u0010)\u001a\u00020\u0013H\u0016¢\u0006\u0004\b)\u0010\u0015J\u0010\u0010+\u001a\u00020*H\u0096@¢\u0006\u0004\b+\u0010,J\u0018\u0010.\u001a\u00020\u00132\u0006\u0010-\u001a\u00020*H\u0096@¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020*H\u0096@¢\u0006\u0004\b0\u0010,J\u0018\u00101\u001a\u00020\u00132\u0006\u0010-\u001a\u00020*H\u0096@¢\u0006\u0004\b1\u0010/J\u0010\u00102\u001a\u00020*H\u0096@¢\u0006\u0004\b2\u0010,J\u0018\u00103\u001a\u00020\u00132\u0006\u0010-\u001a\u00020*H\u0096@¢\u0006\u0004\b3\u0010/J\u0010\u00104\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b4\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00105R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00105R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00106R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\t078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\t0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR \u0010D\u001a\b\u0012\u0004\u0012\u00020@0C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001e\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00109R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020*078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u00109R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020:078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u00109R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020L078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u00109R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020N078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u00109R\u001c\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010P078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u00109R\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020*078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u00109R\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020*078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u00109R\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020H078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u00109R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020U078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u00109R \u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0W078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u00109R\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u001b078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u00109R\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020:078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u00109R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020:078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u00109R$\u0010^\u001a\u0004\u0018\u00010]8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR(\u0010h\u001a\u0004\u0018\u00010H2\b\u0010-\u001a\u0004\u0018\u00010H8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0014\u0010k\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR$\u0010r\u001a\u00020L2\u0006\u0010-\u001a\u00020L8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010w\u001a\u00020N2\u0006\u0010-\u001a\u00020N8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR(\u0010|\u001a\u0004\u0018\u00010P2\b\u0010-\u001a\u0004\u0018\u00010P8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R%\u0010\u0080\u0001\u001a\u00020*2\u0006\u0010-\u001a\u00020*8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b}\u0010j\"\u0004\b~\u0010\u007fR'\u0010\u0083\u0001\u001a\u00020*2\u0006\u0010-\u001a\u00020*8V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0081\u0001\u0010j\"\u0005\b\u0082\u0001\u0010\u007fR)\u0010\u0088\u0001\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R&\u0010\u0010\u001a\u00020H2\u0006\u0010-\u001a\u00020H8V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0089\u0001\u0010e\"\u0005\b\u008a\u0001\u0010gR)\u0010\u008f\u0001\u001a\u00020U2\u0006\u0010-\u001a\u00020U8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R5\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020X0W2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020X0W8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001d\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020U0<8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010\u0098\u0001\u001a\u00020:8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010mR\u0016\u0010\u0099\u0001\u001a\u00020:8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010mR\u0016\u0010\u009a\u0001\u001a\u00020:8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010mR\u0018\u0010\u009e\u0001\u001a\u00030\u009b\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0017\u0010¡\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001R(\u0010¥\u0001\u001a\u00020:2\u0006\u0010-\u001a\u00020:8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\b¢\u0001\u0010m\"\u0006\b£\u0001\u0010¤\u0001R\u0016\u0010¦\u0001\u001a\u00020:8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010mR\u0016\u0010§\u0001\u001a\u00020:8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b§\u0001\u0010mR\u0018\u0010©\u0001\u001a\u0004\u0018\u00010H8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010eR\u0018\u0010«\u0001\u001a\u0004\u0018\u00010H8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010e¨\u0006¬\u0001"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidSessionRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "gatewayCacheDataSource", "privacyDataSource", "fsmDataSource", "nativeConfigDataSource", "Lcom/unity3d/ads/core/data/datasource/AndroidUnityInfoDataSource;", "unityInfoDataSource", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "defaultNativeConfiguration", "Lau3;", "dispatcher", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/data/model/GatewayUrl;", "gatewayUrl", "<init>", "(Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/AndroidUnityInfoDataSource;Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;Lau3;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "incrementLoadRequestCount", "()V", "incrementLoadRequestAdmCount", "incrementBannerLoadRequestCount", "incrementBannerLoadRequestAdmCount", "incrementBannerImpressionCount", "incrementGlobalAdsFocusChangeCount", "", "timeMs", "addTimeToGlobalAdsFocusTime", "(I)V", "incrementFocusChangeCount", "ms", "setInitializationLatency", "setLastLoadLatency", "incrementAllErrorsCount", "incrementCacheTimeoutErrorsCount", "incrementSuccessCount", "incrementTokenSequenceNumber", "incrementTokenWinsCount", "incrementTokenStartsCount", "resetTokenCounters", "Lcom/google/protobuf/ByteString;", "getGatewayCache", "(Lrq3;)Ljava/lang/Object;", U3.i.X, "setGatewayCache", "(Lcom/google/protobuf/ByteString;Lrq3;)Ljava/lang/Object;", "getPrivacy", "setPrivacy", "getPrivacyFsm", "setPrivacyFsm", "persistNativeConfiguration", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "Lcom/unity3d/ads/core/data/datasource/AndroidUnityInfoDataSource;", "Lf1d;", "_sdkConfiguration", "Lf1d;", "", "isInit", "Lz88;", "persistedNativeConfiguration", "Lz88;", "Lb1d;", "Lcom/unity3d/ads/core/data/model/SessionChange;", "_onChange", "Lb1d;", "Lxdh;", "onChange", "Lxdh;", "getOnChange", "()Lxdh;", "", "_gameId", "_sessionId", "_isTestModeEnabled", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "_sessionCounters", "Lcom/unity3d/ads/core/data/model/TokenCounters;", "_tokenCounters", "Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "_initializationError", "_sessionToken", "_currentState", "_gatewayUrl", "Lcom/unity3d/ads/core/data/model/InitializationState;", "_initializationState", "", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride;", "_requestUrlOverride", "_headerBiddingTokenCounter", "_shouldInitialize", "_isFirstInitAttempt", "Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;", "initializationConfiguration", "Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;", "getInitializationConfiguration", "()Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;", "setInitializationConfiguration", "(Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;)V", "getGameId", "()Ljava/lang/String;", "setGameId", "(Ljava/lang/String;)V", AndroidGetAdPlayerContext.KEY_GAME_ID, "getSessionId", "()Lcom/google/protobuf/ByteString;", "sessionId", "isTestModeEnabled", "()Z", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", "sessionCounters", "getTokenCounters", "()Lcom/unity3d/ads/core/data/model/TokenCounters;", "setTokenCounters", "(Lcom/unity3d/ads/core/data/model/TokenCounters;)V", "tokenCounters", "getInitializationError", "()Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "setInitializationError", "(Lcom/unity3d/ads/core/data/model/exception/InitializationException;)V", "initializationError", "getSessionToken", "setSessionToken", "(Lcom/google/protobuf/ByteString;)V", "sessionToken", "getGatewayState", "setGatewayState", "gatewayState", "getNativeConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "setNativeConfiguration", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;)V", "nativeConfiguration", "getGatewayUrl", "setGatewayUrl", "getInitializationState", "()Lcom/unity3d/ads/core/data/model/InitializationState;", "setInitializationState", "(Lcom/unity3d/ads/core/data/model/InitializationState;)V", "initializationState", "getRequestUrlOverrides", "()Ljava/util/List;", "setRequestUrlOverrides", "(Ljava/util/List;)V", "requestUrlOverrides", "getObserveInitializationState", "()Lz88;", "observeInitializationState", "isSdkInitialized", "isNativeConfigReady", "isDiagnosticsEnabled", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "getFeatureFlags", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "featureFlags", "getHeaderBiddingTokenCounter", "()I", "headerBiddingTokenCounter", "getShouldInitialize", "setShouldInitialize", "(Z)V", "shouldInitialize", "isOmEnabled", "isFirstInitAttempt", "getUnityInstallationId", "unityInstallationId", "getUnityMegaSessionId", "unityMegaSessionId", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidSessionRepository implements SessionRepository {

    @NotNull
    private final f1d _currentState;

    @NotNull
    private f1d _gameId;

    @NotNull
    private final f1d _gatewayUrl;

    @NotNull
    private final f1d _headerBiddingTokenCounter;

    @NotNull
    private final f1d _initializationError;

    @NotNull
    private final f1d _initializationState;

    @NotNull
    private final f1d _isFirstInitAttempt;

    @NotNull
    private final f1d _isTestModeEnabled;

    @NotNull
    private b1d _onChange;

    @NotNull
    private final f1d _requestUrlOverride;

    @NotNull
    private final f1d _sdkConfiguration;

    @NotNull
    private final f1d _sessionCounters;

    @NotNull
    private final f1d _sessionId;

    @NotNull
    private final f1d _sessionToken;

    @NotNull
    private final f1d _shouldInitialize;

    @NotNull
    private final f1d _tokenCounters;

    @NotNull
    private final ByteStringDataSource fsmDataSource;

    @NotNull
    private final ByteStringDataSource gatewayCacheDataSource;

    @Nullable
    private InitializationConfigurationInternal initializationConfiguration;

    @NotNull
    private final f1d isInit;

    @NotNull
    private final ByteStringDataSource nativeConfigDataSource;

    @NotNull
    private final xdh onChange;

    @NotNull
    private final z88 persistedNativeConfiguration;

    @NotNull
    private final ByteStringDataSource privacyDataSource;

    @NotNull
    private final AndroidUnityInfoDataSource unityInfoDataSource;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
    @il4(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$1", f = "AndroidSessionRepository.kt", l = {58}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$1, reason: invalid class name */
    public static final class AnonymousClass1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
        final /* synthetic */ SendDiagnosticEvent $sendDiagnosticEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SendDiagnosticEvent sendDiagnosticEvent, rq3<? super AnonymousClass1> rq3Var) {
            super(2, rq3Var);
            this.$sendDiagnosticEvent = sendDiagnosticEvent;
        }

        @Override // defpackage.h21
        public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
            return AndroidSessionRepository.this.new AnonymousClass1(this.$sendDiagnosticEvent, rq3Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
            return ((AnonymousClass1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.h21
        public final Object invokeSuspend(Object obj) {
            lu3 lu3Var = lu3.a;
            int i = this.label;
            try {
                if (i == 0) {
                    y6a.M(obj);
                    ByteStringDataSource byteStringDataSource = AndroidSessionRepository.this.nativeConfigDataSource;
                    this.label = 1;
                    obj = byteStringDataSource.get(this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                if (!data.isEmpty()) {
                    f1d f1dVar = AndroidSessionRepository.this._sdkConfiguration;
                    NativeConfigurationOuterClass.NativeConfiguration parseFrom = NativeConfigurationOuterClass.NativeConfiguration.parseFrom(data);
                    parseFrom.getClass();
                    ((fdi) f1dVar).l(parseFrom);
                }
            } catch (Exception e) {
                SendDiagnosticEvent sendDiagnosticEvent = this.$sendDiagnosticEvent;
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialize_missed_native_parsing", (Double) null, wv8.o("debugReason", message), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
            }
            f1d f1dVar2 = AndroidSessionRepository.this.isInit;
            Boolean bool = Boolean.TRUE;
            fdi fdiVar = (fdi) f1dVar2;
            fdiVar.getClass();
            fdiVar.m(null, bool);
            return Unit.a;
        }
    }

    private AndroidSessionRepository(ByteStringDataSource byteStringDataSource, ByteStringDataSource byteStringDataSource2, ByteStringDataSource byteStringDataSource3, ByteStringDataSource byteStringDataSource4, AndroidUnityInfoDataSource androidUnityInfoDataSource, NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, au3 au3Var, SendDiagnosticEvent sendDiagnosticEvent, String str) {
        byteStringDataSource.getClass();
        byteStringDataSource2.getClass();
        byteStringDataSource3.getClass();
        byteStringDataSource4.getClass();
        androidUnityInfoDataSource.getClass();
        nativeConfiguration.getClass();
        au3Var.getClass();
        sendDiagnosticEvent.getClass();
        str.getClass();
        this.gatewayCacheDataSource = byteStringDataSource;
        this.privacyDataSource = byteStringDataSource2;
        this.fsmDataSource = byteStringDataSource3;
        this.nativeConfigDataSource = byteStringDataSource4;
        this.unityInfoDataSource = androidUnityInfoDataSource;
        fdi a = gdi.a(nativeConfiguration);
        this._sdkConfiguration = a;
        fdi a2 = gdi.a(Boolean.FALSE);
        this.isInit = a2;
        xw3.L(s9a.c(au3Var), null, null, new AnonymousClass1(sendDiagnosticEvent, null), 3);
        final yf4 yf4Var = new yf4(a, a2, new AndroidSessionRepository$persistedNativeConfiguration$1(null), 1);
        final z88 z88Var = new z88() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements b98 {
                final /* synthetic */ b98 $this_unsafeFlow;

                @il4(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2", f = "AndroidSessionRepository.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends sq3 {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(rq3 rq3Var) {
                        super(rq3Var);
                    }

                    @Override // defpackage.h21
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(b98 b98Var) {
                    this.$this_unsafeFlow = b98Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // defpackage.b98
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, rq3 rq3Var) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (rq3Var instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) rq3Var;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            lu3 lu3Var = lu3.a;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                y6a.M(obj2);
                                b98 b98Var = this.$this_unsafeFlow;
                                if (((Boolean) ((Pair) obj).b).booleanValue()) {
                                    anonymousClass1.label = 1;
                                    if (b98Var.emit(obj, anonymousClass1) == lu3Var) {
                                        return lu3Var;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                y6a.M(obj2);
                            }
                            return Unit.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(rq3Var);
                    Object obj22 = anonymousClass1.result;
                    lu3 lu3Var2 = lu3.a;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.a;
                }
            }

            @Override // defpackage.z88
            public Object collect(b98 b98Var, rq3 rq3Var) {
                Object collect = z88.this.collect(new AnonymousClass2(b98Var), rq3Var);
                return collect == lu3.a ? collect : Unit.a;
            }
        };
        this.persistedNativeConfiguration = new z88() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements b98 {
                final /* synthetic */ b98 $this_unsafeFlow;

                @il4(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2", f = "AndroidSessionRepository.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends sq3 {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(rq3 rq3Var) {
                        super(rq3Var);
                    }

                    @Override // defpackage.h21
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(b98 b98Var) {
                    this.$this_unsafeFlow = b98Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // defpackage.b98
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, rq3 rq3Var) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (rq3Var instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) rq3Var;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            lu3 lu3Var = lu3.a;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                y6a.M(obj2);
                                b98 b98Var = this.$this_unsafeFlow;
                                Object obj3 = ((Pair) obj).a;
                                anonymousClass1.label = 1;
                                if (b98Var.emit(obj3, anonymousClass1) == lu3Var) {
                                    return lu3Var;
                                }
                            } else {
                                if (i != 1) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                y6a.M(obj2);
                            }
                            return Unit.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(rq3Var);
                    Object obj22 = anonymousClass1.result;
                    lu3 lu3Var2 = lu3.a;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.a;
                }
            }

            @Override // defpackage.z88
            public Object collect(b98 b98Var, rq3 rq3Var) {
                Object collect = z88.this.collect(new AnonymousClass2(b98Var), rq3Var);
                return collect == lu3.a ? collect : Unit.a;
            }
        };
        aeh b = beh.b(0, 0, null, 7);
        this._onChange = b;
        this.onChange = un0.t(b);
        String gameId = ClientProperties.getGameId();
        this._gameId = gdi.a(gameId == null ? null : gameId);
        UUID fromString = UUID.fromString(SessionIdReader.INSTANCE.getSessionId());
        fromString.getClass();
        this._sessionId = gdi.a(ProtobufExtensionsKt.toByteString(fromString));
        this._isTestModeEnabled = gdi.a(Boolean.valueOf(SdkProperties.isTestMode()));
        this._sessionCounters = gdi.a(SessionCountersOuterClass.SessionCounters.newBuilder().build());
        this._tokenCounters = gdi.a(new TokenCounters(0, 0, 0));
        this._initializationError = gdi.a(null);
        ByteString byteString = ByteString.EMPTY;
        this._sessionToken = gdi.a(byteString);
        this._currentState = gdi.a(byteString);
        this._gatewayUrl = gdi.a(str);
        this._initializationState = gdi.a(InitializationState.NOT_INITIALIZED);
        this._requestUrlOverride = gdi.a(km5.a);
        this._headerBiddingTokenCounter = gdi.a(0);
        Boolean bool = Boolean.TRUE;
        this._shouldInitialize = gdi.a(bool);
        this._isFirstInitAttempt = gdi.a(bool);
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void addTimeToGlobalAdsFocusTime(int timeMs) {
        fdi fdiVar;
        Object value;
        SessionCountersKt.Dsl _create;
        f1d f1dVar = this._sessionCounters;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setGlobalAdsFocusTime(_create.getGlobalAdsFocusTime() + timeMs);
        } while (!fdiVar.k(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
        NativeConfigurationOuterClass.FeatureFlags featureFlags = getNativeConfiguration().getFeatureFlags();
        featureFlags.getClass();
        return featureFlags;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public String getGameId() {
        fdi fdiVar;
        Object value;
        String gameId;
        f1d f1dVar = this._gameId;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            gameId = ClientProperties.getGameId();
            if (gameId == null) {
                gameId = null;
            }
        } while (!fdiVar.k(value, gameId));
        return gameId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getGatewayCache(@NotNull rq3<? super ByteString> rq3Var) {
        AndroidSessionRepository$getGatewayCache$1 androidSessionRepository$getGatewayCache$1;
        int i;
        if (rq3Var instanceof AndroidSessionRepository$getGatewayCache$1) {
            androidSessionRepository$getGatewayCache$1 = (AndroidSessionRepository$getGatewayCache$1) rq3Var;
            int i2 = androidSessionRepository$getGatewayCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidSessionRepository$getGatewayCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidSessionRepository$getGatewayCache$1.result;
                lu3 lu3Var = lu3.a;
                i = androidSessionRepository$getGatewayCache$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    ByteStringDataSource byteStringDataSource = this.gatewayCacheDataSource;
                    androidSessionRepository$getGatewayCache$1.label = 1;
                    obj = byteStringDataSource.get(androidSessionRepository$getGatewayCache$1);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                data.getClass();
                return data;
            }
        }
        androidSessionRepository$getGatewayCache$1 = new AndroidSessionRepository$getGatewayCache$1(this, rq3Var);
        Object obj2 = androidSessionRepository$getGatewayCache$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidSessionRepository$getGatewayCache$1.label;
        if (i != 0) {
        }
        ByteString data2 = ((ByteStringStoreOuterClass.ByteStringStore) obj2).getData();
        data2.getClass();
        return data2;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public ByteString getGatewayState() {
        return (ByteString) ((fdi) this._currentState).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public String getGatewayUrl() {
        return (String) ((fdi) this._gatewayUrl).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public int getHeaderBiddingTokenCounter() {
        fdi fdiVar;
        Object value;
        Number number;
        f1d f1dVar = this._headerBiddingTokenCounter;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            number = (Number) value;
        } while (!fdiVar.k(value, Integer.valueOf(number.intValue() + 1)));
        return number.intValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public InitializationConfigurationInternal getInitializationConfiguration() {
        return this.initializationConfiguration;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public InitializationException getInitializationError() {
        return (InitializationException) ((fdi) this._initializationError).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public InitializationState getInitializationState() {
        return (InitializationState) ((fdi) this._initializationState).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
        if (((Boolean) ((fdi) this.isInit).getValue()).booleanValue()) {
            return (NativeConfigurationOuterClass.NativeConfiguration) ((fdi) this._sdkConfiguration).getValue();
        }
        return (NativeConfigurationOuterClass.NativeConfiguration) td4.t0(g.a, new AndroidSessionRepository$nativeConfiguration$1(this, null));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public z88 getObserveInitializationState() {
        return this._initializationState;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public xdh getOnChange() {
        return this.onChange;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getPrivacy(@NotNull rq3<? super ByteString> rq3Var) {
        AndroidSessionRepository$getPrivacy$1 androidSessionRepository$getPrivacy$1;
        int i;
        if (rq3Var instanceof AndroidSessionRepository$getPrivacy$1) {
            androidSessionRepository$getPrivacy$1 = (AndroidSessionRepository$getPrivacy$1) rq3Var;
            int i2 = androidSessionRepository$getPrivacy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidSessionRepository$getPrivacy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidSessionRepository$getPrivacy$1.result;
                lu3 lu3Var = lu3.a;
                i = androidSessionRepository$getPrivacy$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    ByteStringDataSource byteStringDataSource = this.privacyDataSource;
                    androidSessionRepository$getPrivacy$1.label = 1;
                    obj = byteStringDataSource.get(androidSessionRepository$getPrivacy$1);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                data.getClass();
                return data;
            }
        }
        androidSessionRepository$getPrivacy$1 = new AndroidSessionRepository$getPrivacy$1(this, rq3Var);
        Object obj2 = androidSessionRepository$getPrivacy$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidSessionRepository$getPrivacy$1.label;
        if (i != 0) {
        }
        ByteString data2 = ((ByteStringStoreOuterClass.ByteStringStore) obj2).getData();
        data2.getClass();
        return data2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getPrivacyFsm(@NotNull rq3<? super ByteString> rq3Var) {
        AndroidSessionRepository$getPrivacyFsm$1 androidSessionRepository$getPrivacyFsm$1;
        int i;
        if (rq3Var instanceof AndroidSessionRepository$getPrivacyFsm$1) {
            androidSessionRepository$getPrivacyFsm$1 = (AndroidSessionRepository$getPrivacyFsm$1) rq3Var;
            int i2 = androidSessionRepository$getPrivacyFsm$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidSessionRepository$getPrivacyFsm$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidSessionRepository$getPrivacyFsm$1.result;
                lu3 lu3Var = lu3.a;
                i = androidSessionRepository$getPrivacyFsm$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    ByteStringDataSource byteStringDataSource = this.fsmDataSource;
                    androidSessionRepository$getPrivacyFsm$1.label = 1;
                    obj = byteStringDataSource.get(androidSessionRepository$getPrivacyFsm$1);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                data.getClass();
                return data;
            }
        }
        androidSessionRepository$getPrivacyFsm$1 = new AndroidSessionRepository$getPrivacyFsm$1(this, rq3Var);
        Object obj2 = androidSessionRepository$getPrivacyFsm$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidSessionRepository$getPrivacyFsm$1.label;
        if (i != 0) {
        }
        ByteString data2 = ((ByteStringStoreOuterClass.ByteStringStore) obj2).getData();
        data2.getClass();
        return data2;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public List<InitializationResponseOuterClass.RequestUrlOverride> getRequestUrlOverrides() {
        return (List) ((fdi) this._requestUrlOverride).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public SessionCountersOuterClass.SessionCounters getSessionCounters() {
        return (SessionCountersOuterClass.SessionCounters) ((fdi) this._sessionCounters).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public ByteString getSessionId() {
        return (ByteString) ((fdi) this._sessionId).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public ByteString getSessionToken() {
        return (ByteString) ((fdi) this._sessionToken).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean getShouldInitialize() {
        return ((Boolean) ((fdi) this._shouldInitialize).getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @NotNull
    public TokenCounters getTokenCounters() {
        return (TokenCounters) ((fdi) this._tokenCounters).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public String getUnityInstallationId() {
        return this.unityInfoDataSource.getUnityInstallationId();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public String getUnityMegaSessionId() {
        return this.unityInfoDataSource.getUnityMegaSessionId();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementAllErrorsCount() {
        fdi fdiVar;
        Object value;
        SessionCountersKt.Dsl _create;
        f1d f1dVar = this._sessionCounters;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setAllErrorsCount(_create.getAllErrorsCount() + 1);
        } while (!fdiVar.k(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerImpressionCount() {
        fdi fdiVar;
        Object value;
        SessionCountersKt.Dsl _create;
        f1d f1dVar = this._sessionCounters;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setBannerImpressions(_create.getBannerImpressions() + 1);
        } while (!fdiVar.k(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestAdmCount() {
        fdi fdiVar;
        Object value;
        SessionCountersKt.Dsl _create;
        f1d f1dVar = this._sessionCounters;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setBannerRequestsAdm(_create.getBannerRequestsAdm() + 1);
        } while (!fdiVar.k(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestCount() {
        fdi fdiVar;
        Object value;
        SessionCountersKt.Dsl _create;
        f1d f1dVar = this._sessionCounters;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setBannerLoadRequests(_create.getBannerLoadRequests() + 1);
        } while (!fdiVar.k(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementCacheTimeoutErrorsCount() {
        fdi fdiVar;
        Object value;
        SessionCountersKt.Dsl _create;
        f1d f1dVar = this._sessionCounters;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setCacheTimeoutErrorsCount(_create.getCacheTimeoutErrorsCount() + 1);
        } while (!fdiVar.k(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementFocusChangeCount() {
        fdi fdiVar;
        Object value;
        SessionCountersKt.Dsl _create;
        f1d f1dVar = this._sessionCounters;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setFocusChangeCount(_create.getFocusChangeCount() + 1);
        } while (!fdiVar.k(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementGlobalAdsFocusChangeCount() {
        fdi fdiVar;
        Object value;
        SessionCountersKt.Dsl _create;
        f1d f1dVar = this._sessionCounters;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setGlobalAdsFocusChangeCount(_create.getGlobalAdsFocusChangeCount() + 1);
        } while (!fdiVar.k(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestAdmCount() {
        fdi fdiVar;
        Object value;
        SessionCountersKt.Dsl _create;
        f1d f1dVar = this._sessionCounters;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setLoadRequestsAdm(_create.getLoadRequestsAdm() + 1);
        } while (!fdiVar.k(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestCount() {
        fdi fdiVar;
        Object value;
        SessionCountersKt.Dsl _create;
        f1d f1dVar = this._sessionCounters;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setLoadRequests(_create.getLoadRequests() + 1);
        } while (!fdiVar.k(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementSuccessCount() {
        fdi fdiVar;
        Object value;
        SessionCountersKt.Dsl _create;
        f1d f1dVar = this._sessionCounters;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setSuccessCount(_create.getSuccessCount() + 1);
        } while (!fdiVar.k(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenSequenceNumber() {
        fdi fdiVar;
        Object value;
        TokenCounters tokenCounters;
        f1d f1dVar = this._tokenCounters;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!fdiVar.k(value, TokenCounters.copy$default(tokenCounters, tokenCounters.getSeq() + 1, 0, 0, 6, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenStartsCount() {
        fdi fdiVar;
        Object value;
        TokenCounters tokenCounters;
        f1d f1dVar = this._tokenCounters;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!fdiVar.k(value, TokenCounters.copy$default(tokenCounters, 0, 0, tokenCounters.getStarts() + 1, 3, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenWinsCount() {
        fdi fdiVar;
        Object value;
        TokenCounters tokenCounters;
        f1d f1dVar = this._tokenCounters;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!fdiVar.k(value, TokenCounters.copy$default(tokenCounters, 0, tokenCounters.getWins() + 1, 0, 5, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isDiagnosticsEnabled() {
        return getNativeConfiguration().getDiagnosticEvents().getEnabled();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isFirstInitAttempt() {
        fdi fdiVar;
        Object value;
        Boolean bool;
        f1d f1dVar = this._isFirstInitAttempt;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!fdiVar.k(value, Boolean.FALSE));
        return bool.booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isNativeConfigReady() {
        return ((Boolean) ((fdi) this.isInit).getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isOmEnabled() {
        return getNativeConfiguration().getEnableOm();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isSdkInitialized() {
        return getInitializationState() == InitializationState.INITIALIZED;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isTestModeEnabled() {
        fdi fdiVar;
        Object value;
        boolean isTestMode;
        f1d f1dVar = this._isTestModeEnabled;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            ((Boolean) value).getClass();
            isTestMode = SdkProperties.isTestMode();
        } while (!fdiVar.k(value, Boolean.valueOf(isTestMode)));
        return isTestMode;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public Object persistNativeConfiguration(@NotNull rq3<? super Unit> rq3Var) {
        ByteStringDataSource byteStringDataSource = this.nativeConfigDataSource;
        ByteString byteString = getNativeConfiguration().toByteString();
        byteString.getClass();
        Object obj = byteStringDataSource.set(byteString, rq3Var);
        return obj == lu3.a ? obj : Unit.a;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void resetTokenCounters() {
        fdi fdiVar;
        Object value;
        f1d f1dVar = this._tokenCounters;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, new TokenCounters(0, 0, 0)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGameId(@Nullable String str) {
        fdi fdiVar;
        Object value;
        f1d f1dVar = this._gameId;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            ClientProperties.setGameId(str);
        } while (!fdiVar.k(value, str));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    public Object setGatewayCache(@NotNull ByteString byteString, @NotNull rq3<? super Unit> rq3Var) {
        Object obj = this.gatewayCacheDataSource.set(byteString, rq3Var);
        return obj == lu3.a ? obj : Unit.a;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayState(@NotNull ByteString byteString) {
        fdi fdiVar;
        Object value;
        byteString.getClass();
        f1d f1dVar = this._currentState;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, byteString));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayUrl(@NotNull String str) {
        fdi fdiVar;
        Object value;
        str.getClass();
        f1d f1dVar = this._gatewayUrl;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, str));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationConfiguration(@Nullable InitializationConfigurationInternal initializationConfigurationInternal) {
        this.initializationConfiguration = initializationConfigurationInternal;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationError(@Nullable InitializationException initializationException) {
        fdi fdiVar;
        Object value;
        f1d f1dVar = this._initializationError;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, initializationException));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationLatency(int ms) {
        fdi fdiVar;
        Object value;
        SessionCountersKt.Dsl _create;
        f1d f1dVar = this._sessionCounters;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setInitializationLatency(ms);
        } while (!fdiVar.k(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationState(@NotNull InitializationState initializationState) {
        fdi fdiVar;
        Object value;
        initializationState.getClass();
        f1d f1dVar = this._initializationState;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, initializationState));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setLastLoadLatency(int ms) {
        fdi fdiVar;
        Object value;
        SessionCountersKt.Dsl _create;
        f1d f1dVar = this._sessionCounters;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.INSTANCE;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setLastLoadLatency(ms);
        } while (!fdiVar.k(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setNativeConfiguration(@NotNull NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
        fdi fdiVar;
        Object value;
        nativeConfiguration.getClass();
        f1d f1dVar = this._sdkConfiguration;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, nativeConfiguration));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r8.set(r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setPrivacy(@NotNull ByteString byteString, @NotNull rq3<? super Unit> rq3Var) {
        AndroidSessionRepository$setPrivacy$1 androidSessionRepository$setPrivacy$1;
        int i;
        if (rq3Var instanceof AndroidSessionRepository$setPrivacy$1) {
            androidSessionRepository$setPrivacy$1 = (AndroidSessionRepository$setPrivacy$1) rq3Var;
            int i2 = androidSessionRepository$setPrivacy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidSessionRepository$setPrivacy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidSessionRepository$setPrivacy$1.result;
                lu3 lu3Var = lu3.a;
                i = androidSessionRepository$setPrivacy$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    ByteStringDataSource byteStringDataSource = this.privacyDataSource;
                    androidSessionRepository$setPrivacy$1.L$0 = byteString;
                    androidSessionRepository$setPrivacy$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    byteString = (ByteString) androidSessionRepository$setPrivacy$1.L$0;
                    y6a.M(obj);
                }
                b1d b1dVar = this._onChange;
                SessionChange.UserConsentChange userConsentChange = new SessionChange.UserConsentChange(byteString);
                androidSessionRepository$setPrivacy$1.L$0 = null;
                androidSessionRepository$setPrivacy$1.label = 2;
            }
        }
        androidSessionRepository$setPrivacy$1 = new AndroidSessionRepository$setPrivacy$1(this, rq3Var);
        Object obj2 = androidSessionRepository$setPrivacy$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidSessionRepository$setPrivacy$1.label;
        if (i != 0) {
        }
        b1d b1dVar2 = this._onChange;
        SessionChange.UserConsentChange userConsentChange2 = new SessionChange.UserConsentChange(byteString);
        androidSessionRepository$setPrivacy$1.L$0 = null;
        androidSessionRepository$setPrivacy$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r8.set(r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setPrivacyFsm(@NotNull ByteString byteString, @NotNull rq3<? super Unit> rq3Var) {
        AndroidSessionRepository$setPrivacyFsm$1 androidSessionRepository$setPrivacyFsm$1;
        int i;
        if (rq3Var instanceof AndroidSessionRepository$setPrivacyFsm$1) {
            androidSessionRepository$setPrivacyFsm$1 = (AndroidSessionRepository$setPrivacyFsm$1) rq3Var;
            int i2 = androidSessionRepository$setPrivacyFsm$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidSessionRepository$setPrivacyFsm$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidSessionRepository$setPrivacyFsm$1.result;
                lu3 lu3Var = lu3.a;
                i = androidSessionRepository$setPrivacyFsm$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    ByteStringDataSource byteStringDataSource = this.fsmDataSource;
                    androidSessionRepository$setPrivacyFsm$1.L$0 = byteString;
                    androidSessionRepository$setPrivacyFsm$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    byteString = (ByteString) androidSessionRepository$setPrivacyFsm$1.L$0;
                    y6a.M(obj);
                }
                b1d b1dVar = this._onChange;
                SessionChange.PrivacyFsmChange privacyFsmChange = new SessionChange.PrivacyFsmChange(byteString);
                androidSessionRepository$setPrivacyFsm$1.L$0 = null;
                androidSessionRepository$setPrivacyFsm$1.label = 2;
            }
        }
        androidSessionRepository$setPrivacyFsm$1 = new AndroidSessionRepository$setPrivacyFsm$1(this, rq3Var);
        Object obj2 = androidSessionRepository$setPrivacyFsm$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidSessionRepository$setPrivacyFsm$1.label;
        if (i != 0) {
        }
        b1d b1dVar2 = this._onChange;
        SessionChange.PrivacyFsmChange privacyFsmChange2 = new SessionChange.PrivacyFsmChange(byteString);
        androidSessionRepository$setPrivacyFsm$1.L$0 = null;
        androidSessionRepository$setPrivacyFsm$1.label = 2;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setRequestUrlOverrides(@NotNull List<InitializationResponseOuterClass.RequestUrlOverride> list) {
        fdi fdiVar;
        Object value;
        list.getClass();
        f1d f1dVar = this._requestUrlOverride;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, list));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionCounters(@NotNull SessionCountersOuterClass.SessionCounters sessionCounters) {
        fdi fdiVar;
        Object value;
        sessionCounters.getClass();
        f1d f1dVar = this._sessionCounters;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, sessionCounters));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionToken(@NotNull ByteString byteString) {
        fdi fdiVar;
        Object value;
        byteString.getClass();
        f1d f1dVar = this._sessionToken;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, byteString));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setShouldInitialize(boolean z) {
        fdi fdiVar;
        Object value;
        f1d f1dVar = this._shouldInitialize;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            ((Boolean) value).getClass();
        } while (!fdiVar.k(value, Boolean.valueOf(z)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setTokenCounters(@NotNull TokenCounters tokenCounters) {
        fdi fdiVar;
        Object value;
        tokenCounters.getClass();
        f1d f1dVar = this._tokenCounters;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, tokenCounters));
    }

    public /* synthetic */ AndroidSessionRepository(ByteStringDataSource byteStringDataSource, ByteStringDataSource byteStringDataSource2, ByteStringDataSource byteStringDataSource3, ByteStringDataSource byteStringDataSource4, AndroidUnityInfoDataSource androidUnityInfoDataSource, NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, au3 au3Var, SendDiagnosticEvent sendDiagnosticEvent, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringDataSource, byteStringDataSource2, byteStringDataSource3, byteStringDataSource4, androidUnityInfoDataSource, nativeConfiguration, au3Var, sendDiagnosticEvent, str);
    }

    public /* synthetic */ AndroidSessionRepository(ByteStringDataSource byteStringDataSource, ByteStringDataSource byteStringDataSource2, ByteStringDataSource byteStringDataSource3, ByteStringDataSource byteStringDataSource4, AndroidUnityInfoDataSource androidUnityInfoDataSource, NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, au3 au3Var, SendDiagnosticEvent sendDiagnosticEvent, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringDataSource, byteStringDataSource2, byteStringDataSource3, byteStringDataSource4, androidUnityInfoDataSource, nativeConfiguration, au3Var, sendDiagnosticEvent, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? GatewayUrl.m737constructorimpl(UnityAdsConstants.DefaultUrls.GATEWAY_URL) : str, null);
    }
}
