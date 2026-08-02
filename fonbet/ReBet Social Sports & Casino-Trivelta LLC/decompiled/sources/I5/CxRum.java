package I5;

import I5.DeviceContext;
import I5.DeviceState;
import I5.ErrorContext;
import I5.MobileSdkMetadata;
import I5.SessionContext;
import I5.VersionMetadata;
import I5.j;
import J5.MobileVitalsContext;
import L5.ScreenshotContext;
import Q5.CustomMeasurementContext;
import Q5.EventContext;
import Q5.InteractionContext;
import Q5.LifecycleContext;
import Q5.LogContext;
import Q5.NetworkRequestContext;
import Q5.SnapshotContext;
import Q5.UserContext;
import Q5.ViewContext;
import Zh.B;
import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import com.twilio.voice.EventKeys;
import di.C4093i;
import di.C4096j0;
import di.J0;
import di.N;
import di.U0;
import di.Z0;
import ei.AbstractC4212b;
import i3.C4527h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import lb.C5444x;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

@Zh.n
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b~\b\u0081\b\u0018\u0000 ¼\u00012\u00020\u0001:\u0002ECB\u0095\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101B\u0091\u0002\b\u0010\u0012\u0006\u00103\u001a\u000202\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b0\u00106J'\u0010=\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b=\u0010>J\r\u0010@\u001a\u00020?¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020\u00002\u0006\u0010B\u001a\u00020?¢\u0006\u0004\bC\u0010DJ\u009e\u0002\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.HÆ\u0001¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u000202HÖ\u0001¢\u0006\u0004\bI\u0010JJ\u001a\u0010L\u001a\u00020\u00182\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bL\u0010MR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bC\u0010N\u0012\u0004\bP\u0010Q\u001a\u0004\bO\u0010HR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010R\u0012\u0004\bU\u0010Q\u001a\u0004\bS\u0010TR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bV\u0010W\u0012\u0004\bZ\u0010Q\u001a\u0004\bX\u0010YR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b[\u0010\\\u0012\u0004\b_\u0010Q\u001a\u0004\b]\u0010^R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b`\u0010a\u0012\u0004\bd\u0010Q\u001a\u0004\bb\u0010cR \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010e\u0012\u0004\bg\u0010Q\u001a\u0004\b[\u0010fR \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010h\u0012\u0004\bk\u0010Q\u001a\u0004\bi\u0010jR \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bl\u0010N\u0012\u0004\bn\u0010Q\u001a\u0004\bm\u0010HR \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bo\u0010N\u0012\u0004\bq\u0010Q\u001a\u0004\bp\u0010HR \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\br\u0010s\u0012\u0004\bv\u0010Q\u001a\u0004\bt\u0010uR \u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bw\u0010N\u0012\u0004\by\u0010Q\u001a\u0004\bx\u0010HR \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bz\u0010N\u0012\u0004\b|\u0010Q\u001a\u0004\b{\u0010HR\"\u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b}\u0010~\u0012\u0005\b\u0081\u0001\u0010Q\u001a\u0005\b\u007f\u0010\u0080\u0001R$\u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0016\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u0012\u0005\b\u0085\u0001\u0010Q\u001a\u0005\b\u0019\u0010\u0084\u0001R%\u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u0012\u0005\b\u008a\u0001\u0010Q\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R'\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u0012\u0005\b\u008f\u0001\u0010Q\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R'\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u0012\u0005\b\u0094\u0001\u0010Q\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R&\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0016\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u0012\u0005\b\u0098\u0001\u0010Q\u001a\u0005\b`\u0010\u0097\u0001R'\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u0012\u0005\b\u009d\u0001\u0010Q\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R'\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u0012\u0005\b¢\u0001\u0010Q\u001a\u0006\b \u0001\u0010¡\u0001R'\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b£\u0001\u0010¤\u0001\u0012\u0005\b§\u0001\u0010Q\u001a\u0006\b¥\u0001\u0010¦\u0001R'\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b¨\u0001\u0010©\u0001\u0012\u0005\b¬\u0001\u0010Q\u001a\u0006\bª\u0001\u0010«\u0001R'\u0010+\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u00ad\u0001\u0010®\u0001\u0012\u0005\b±\u0001\u0010Q\u001a\u0006\b¯\u0001\u0010°\u0001R'\u0010-\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b²\u0001\u0010³\u0001\u0012\u0005\b¶\u0001\u0010Q\u001a\u0006\b´\u0001\u0010µ\u0001R'\u0010/\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b·\u0001\u0010¸\u0001\u0012\u0005\b»\u0001\u0010Q\u001a\u0006\b¹\u0001\u0010º\u0001¨\u0006½\u0001"}, d2 = {"LI5/c;", "", "", "fingerPrint", "LI5/q;", "sessionContext", "LI5/d;", "deviceContext", "LI5/e;", "deviceState", "LI5/m;", "sdkMetadata", "LQ5/j;", "eventContext", "Lkotlinx/serialization/json/JsonElement;", "labels", EventKeys.PLATFORM, "spanId", "", EventKeys.TIMESTAMP, "traceId", "environment", "LQ5/A;", "viewContext", "", "isSnapshotEvent", "LI5/s;", "versionMetadata", "LQ5/p;", "logContext", "LQ5/s;", "networkRequestContext", "LQ5/t;", "snapshotContext", "LJ5/c;", "mobileVitalsContext", "LI5/f;", "errorContext", "LQ5/o;", "lifecycleContext", "LQ5/d;", "customMeasurementContext", "LQ5/n;", "interactionContext", "LL5/a;", "screenshotContext", "LI5/j;", "internalContext", "<init>", "(Ljava/lang/String;LI5/q;LI5/d;LI5/e;LI5/m;LQ5/j;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;LQ5/A;ZLI5/s;LQ5/p;LQ5/s;LQ5/t;LJ5/c;LI5/f;LQ5/o;LQ5/d;LQ5/n;LL5/a;LI5/j;)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;LI5/q;LI5/d;LI5/e;LI5/m;LQ5/j;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;LQ5/A;ZLI5/s;LQ5/p;LQ5/s;LQ5/t;LJ5/c;LI5/f;LQ5/o;LQ5/d;LQ5/n;LL5/a;LI5/j;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "g", "(LI5/c;Lci/d;Lbi/f;)V", "LQ5/h;", "f", "()LQ5/h;", "editableCxRum", "a", "(LQ5/h;)LI5/c;", com.google.crypto.tink.integration.android.b.f37029b, "(Ljava/lang/String;LI5/q;LI5/d;LI5/e;LI5/m;LQ5/j;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;LQ5/A;ZLI5/s;LQ5/p;LQ5/s;LQ5/t;LJ5/c;LI5/f;LQ5/o;LQ5/d;LQ5/n;LL5/a;LI5/j;)LI5/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFingerPrint", "getFingerPrint$annotations", "()V", "LI5/q;", "getSessionContext", "()LI5/q;", "getSessionContext$annotations", "c", "LI5/d;", "getDeviceContext", "()LI5/d;", "getDeviceContext$annotations", W9.d.f13160a, "LI5/e;", "getDeviceState", "()LI5/e;", "getDeviceState$annotations", com.bumptech.glide.gifdecoder.e.f29601m, "LI5/m;", "getSdkMetadata", "()LI5/m;", "getSdkMetadata$annotations", "LQ5/j;", "()LQ5/j;", "getEventContext$annotations", "Lkotlinx/serialization/json/JsonElement;", "getLabels", "()Lkotlinx/serialization/json/JsonElement;", "getLabels$annotations", C4527h.f48087o, "getPlatform", "getPlatform$annotations", com.google.android.material.shape.i.f35755A, "getSpanId", "getSpanId$annotations", "j", "J", "getTimestamp", "()J", "getTimestamp$annotations", "k", "getTraceId", "getTraceId$annotations", "l", "getEnvironment", "getEnvironment$annotations", X9.m.f13664a, "LQ5/A;", "getViewContext", "()LQ5/A;", "getViewContext$annotations", "n", "Z", "()Z", "isSnapshotEvent$annotations", "o", "LI5/s;", "getVersionMetadata", "()LI5/s;", "getVersionMetadata$annotations", "p", "LQ5/p;", "getLogContext", "()LQ5/p;", "getLogContext$annotations", "q", "LQ5/s;", "getNetworkRequestContext", "()LQ5/s;", "getNetworkRequestContext$annotations", "r", "LQ5/t;", "()LQ5/t;", "getSnapshotContext$annotations", "s", "LJ5/c;", "getMobileVitalsContext", "()LJ5/c;", "getMobileVitalsContext$annotations", "t", "LI5/f;", "getErrorContext", "()LI5/f;", "getErrorContext$annotations", "u", "LQ5/o;", "getLifecycleContext", "()LQ5/o;", "getLifecycleContext$annotations", "v", "LQ5/d;", "getCustomMeasurementContext", "()LQ5/d;", "getCustomMeasurementContext$annotations", "w", "LQ5/n;", "getInteractionContext", "()LQ5/n;", "getInteractionContext$annotations", C5444x.f55808b, "LL5/a;", "getScreenshotContext", "()LL5/a;", "getScreenshotContext$annotations", "y", "LI5/j;", "getInternalContext", "()LI5/j;", "getInternalContext$annotations", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCxRum.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CxRum.kt\ncom/coralogix/android/sdk/internal/model/CxRum\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"})
/* renamed from: I5.c, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class CxRum {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String fingerPrint;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final SessionContext sessionContext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final DeviceContext deviceContext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final DeviceState deviceState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final MobileSdkMetadata sdkMetadata;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final EventContext eventContext;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final JsonElement labels;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    public final String platform;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    public final String spanId;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    public final long timestamp;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    public final String traceId;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    public final String environment;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    public final ViewContext viewContext;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean isSnapshotEvent;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    public final VersionMetadata versionMetadata;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    public final LogContext logContext;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    public final NetworkRequestContext networkRequestContext;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    public final SnapshotContext snapshotContext;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    public final MobileVitalsContext mobileVitalsContext;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    public final ErrorContext errorContext;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    public final LifecycleContext lifecycleContext;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    public final CustomMeasurementContext customMeasurementContext;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    public final InteractionContext interactionContext;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    public final ScreenshotContext screenshotContext;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    public final j internalContext;

    /* renamed from: I5.c$a */
    public /* synthetic */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5390a;

        @NotNull
        private static final bi.f descriptor;

        static {
            a aVar = new a();
            f5390a = aVar;
            J0 j02 = new J0("com.coralogix.android.sdk.internal.model.CxRum", aVar, 25);
            j02.n("fingerPrint", true);
            j02.n("session_context", true);
            j02.n("device_context", true);
            j02.n("device_state", true);
            j02.n("mobile_sdk", true);
            j02.n("event_context", true);
            j02.n("labels", true);
            j02.n(EventKeys.PLATFORM, true);
            j02.n("spanId", true);
            j02.n(EventKeys.TIMESTAMP, true);
            j02.n("traceId", true);
            j02.n("environment", true);
            j02.n("view_context", true);
            j02.n("isSnapshotEvent", true);
            j02.n("version_metadata", true);
            j02.n("log_context", true);
            j02.n("network_request_context", true);
            j02.n("snapshot_context", true);
            j02.n("mobile_vitals_context", true);
            j02.n("error_context", true);
            j02.n("life_cycle_context", true);
            j02.n("custom_measurement_context", true);
            j02.n("interaction_context", true);
            j02.n("screenshot_context", true);
            j02.n("internal_context", true);
            descriptor = j02;
        }

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CxRum deserialize(ci.e decoder) {
            SessionContext sessionContext;
            j jVar;
            LogContext logContext;
            InteractionContext interactionContext;
            CustomMeasurementContext customMeasurementContext;
            LifecycleContext lifecycleContext;
            ErrorContext errorContext;
            MobileVitalsContext mobileVitalsContext;
            SnapshotContext snapshotContext;
            NetworkRequestContext networkRequestContext;
            VersionMetadata versionMetadata;
            ViewContext viewContext;
            ScreenshotContext screenshotContext;
            DeviceContext deviceContext;
            DeviceState deviceState;
            MobileSdkMetadata mobileSdkMetadata;
            EventContext eventContext;
            JsonElement jsonElement;
            String str;
            String str2;
            String str3;
            String str4;
            int i10;
            String str5;
            boolean z10;
            long j10;
            ViewContext viewContext2;
            int i11;
            JsonElement jsonElement2;
            ScreenshotContext screenshotContext2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bi.f fVar = descriptor;
            ci.c c10 = decoder.c(fVar);
            ErrorContext errorContext2 = null;
            if (c10.q()) {
                String s10 = c10.s(fVar, 0);
                SessionContext sessionContext2 = (SessionContext) c10.i(fVar, 1, SessionContext.a.f5475a, null);
                DeviceContext deviceContext2 = (DeviceContext) c10.i(fVar, 2, DeviceContext.a.f5397a, null);
                DeviceState deviceState2 = (DeviceState) c10.i(fVar, 3, DeviceState.a.f5400a, null);
                MobileSdkMetadata mobileSdkMetadata2 = (MobileSdkMetadata) c10.i(fVar, 4, MobileSdkMetadata.a.f5451a, null);
                EventContext eventContext2 = (EventContext) c10.i(fVar, 5, EventContext.a.f9433a, null);
                JsonElement jsonElement3 = (JsonElement) c10.i(fVar, 6, ei.q.f46124a, null);
                String s11 = c10.s(fVar, 7);
                String s12 = c10.s(fVar, 8);
                long g10 = c10.g(fVar, 9);
                String s13 = c10.s(fVar, 10);
                String s14 = c10.s(fVar, 11);
                ViewContext viewContext3 = (ViewContext) c10.i(fVar, 12, ViewContext.a.f9361a, null);
                boolean t10 = c10.t(fVar, 13);
                VersionMetadata versionMetadata2 = (VersionMetadata) c10.i(fVar, 14, VersionMetadata.a.f5480a, null);
                LogContext logContext2 = (LogContext) c10.C(fVar, 15, LogContext.a.f9461a, null);
                NetworkRequestContext networkRequestContext2 = (NetworkRequestContext) c10.C(fVar, 16, NetworkRequestContext.a.f9489a, null);
                SnapshotContext snapshotContext2 = (SnapshotContext) c10.C(fVar, 17, SnapshotContext.a.f9493a, null);
                MobileVitalsContext mobileVitalsContext2 = (MobileVitalsContext) c10.C(fVar, 18, MobileVitalsContext.b.f5942a, null);
                ErrorContext errorContext3 = (ErrorContext) c10.C(fVar, 19, ErrorContext.a.f5408a, null);
                LifecycleContext lifecycleContext2 = (LifecycleContext) c10.C(fVar, 20, LifecycleContext.a.f9458a, null);
                CustomMeasurementContext customMeasurementContext2 = (CustomMeasurementContext) c10.C(fVar, 21, CustomMeasurementContext.a.f9403a, null);
                InteractionContext interactionContext2 = (InteractionContext) c10.C(fVar, 22, InteractionContext.a.f9455a, null);
                ScreenshotContext screenshotContext3 = (ScreenshotContext) c10.C(fVar, 23, ScreenshotContext.C0146a.f7065a, null);
                lifecycleContext = lifecycleContext2;
                jVar = (j) c10.C(fVar, 24, j.c.f5436c, null);
                i10 = 33554431;
                deviceState = deviceState2;
                mobileSdkMetadata = mobileSdkMetadata2;
                str2 = s12;
                deviceContext = deviceContext2;
                sessionContext = sessionContext2;
                jsonElement = jsonElement3;
                str4 = s14;
                str3 = s13;
                viewContext = viewContext3;
                str = s11;
                z10 = t10;
                errorContext = errorContext3;
                mobileVitalsContext = mobileVitalsContext2;
                snapshotContext = snapshotContext2;
                networkRequestContext = networkRequestContext2;
                logContext = logContext2;
                versionMetadata = versionMetadata2;
                str5 = s10;
                eventContext = eventContext2;
                j10 = g10;
                customMeasurementContext = customMeasurementContext2;
                interactionContext = interactionContext2;
                screenshotContext = screenshotContext3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                boolean z12 = false;
                JsonElement jsonElement4 = null;
                ScreenshotContext screenshotContext4 = null;
                j jVar2 = null;
                LogContext logContext3 = null;
                InteractionContext interactionContext3 = null;
                CustomMeasurementContext customMeasurementContext3 = null;
                LifecycleContext lifecycleContext3 = null;
                MobileVitalsContext mobileVitalsContext3 = null;
                SnapshotContext snapshotContext3 = null;
                NetworkRequestContext networkRequestContext3 = null;
                VersionMetadata versionMetadata3 = null;
                ViewContext viewContext4 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                SessionContext sessionContext3 = null;
                DeviceContext deviceContext3 = null;
                DeviceState deviceState3 = null;
                MobileSdkMetadata mobileSdkMetadata3 = null;
                EventContext eventContext3 = null;
                long j11 = 0;
                while (z11) {
                    JsonElement jsonElement5 = jsonElement4;
                    int e10 = c10.e(fVar);
                    switch (e10) {
                        case -1:
                            z11 = false;
                            screenshotContext4 = screenshotContext4;
                            jsonElement4 = jsonElement5;
                            i12 = i12;
                        case 0:
                            jsonElement2 = jsonElement5;
                            str10 = c10.s(fVar, 0);
                            screenshotContext4 = screenshotContext4;
                            i12 |= 1;
                            jsonElement4 = jsonElement2;
                        case 1:
                            jsonElement2 = jsonElement5;
                            sessionContext3 = (SessionContext) c10.i(fVar, 1, SessionContext.a.f5475a, sessionContext3);
                            i12 |= 2;
                            screenshotContext4 = screenshotContext4;
                            deviceContext3 = deviceContext3;
                            jsonElement4 = jsonElement2;
                        case 2:
                            jsonElement2 = jsonElement5;
                            deviceContext3 = (DeviceContext) c10.i(fVar, 2, DeviceContext.a.f5397a, deviceContext3);
                            i12 |= 4;
                            screenshotContext4 = screenshotContext4;
                            deviceState3 = deviceState3;
                            jsonElement4 = jsonElement2;
                        case 3:
                            jsonElement2 = jsonElement5;
                            deviceState3 = (DeviceState) c10.i(fVar, 3, DeviceState.a.f5400a, deviceState3);
                            i12 |= 8;
                            screenshotContext4 = screenshotContext4;
                            mobileSdkMetadata3 = mobileSdkMetadata3;
                            jsonElement4 = jsonElement2;
                        case 4:
                            jsonElement2 = jsonElement5;
                            mobileSdkMetadata3 = (MobileSdkMetadata) c10.i(fVar, 4, MobileSdkMetadata.a.f5451a, mobileSdkMetadata3);
                            i12 |= 16;
                            screenshotContext4 = screenshotContext4;
                            eventContext3 = eventContext3;
                            jsonElement4 = jsonElement2;
                        case 5:
                            jsonElement2 = jsonElement5;
                            eventContext3 = (EventContext) c10.i(fVar, 5, EventContext.a.f9433a, eventContext3);
                            i12 |= 32;
                            screenshotContext4 = screenshotContext4;
                            jsonElement4 = jsonElement2;
                        case 6:
                            jsonElement4 = (JsonElement) c10.i(fVar, 6, ei.q.f46124a, jsonElement5);
                            i12 |= 64;
                            screenshotContext4 = screenshotContext4;
                        case 7:
                            screenshotContext2 = screenshotContext4;
                            str6 = c10.s(fVar, 7);
                            i12 |= 128;
                            screenshotContext4 = screenshotContext2;
                            jsonElement4 = jsonElement5;
                        case 8:
                            screenshotContext2 = screenshotContext4;
                            str7 = c10.s(fVar, 8);
                            i12 |= 256;
                            screenshotContext4 = screenshotContext2;
                            jsonElement4 = jsonElement5;
                        case 9:
                            screenshotContext2 = screenshotContext4;
                            j11 = c10.g(fVar, 9);
                            i12 |= 512;
                            screenshotContext4 = screenshotContext2;
                            jsonElement4 = jsonElement5;
                        case 10:
                            screenshotContext2 = screenshotContext4;
                            str8 = c10.s(fVar, 10);
                            i12 |= 1024;
                            screenshotContext4 = screenshotContext2;
                            jsonElement4 = jsonElement5;
                        case 11:
                            screenshotContext2 = screenshotContext4;
                            str9 = c10.s(fVar, 11);
                            i12 |= 2048;
                            screenshotContext4 = screenshotContext2;
                            jsonElement4 = jsonElement5;
                        case 12:
                            screenshotContext2 = screenshotContext4;
                            viewContext4 = (ViewContext) c10.i(fVar, 12, ViewContext.a.f9361a, viewContext4);
                            i12 |= 4096;
                            screenshotContext4 = screenshotContext2;
                            jsonElement4 = jsonElement5;
                        case 13:
                            viewContext2 = viewContext4;
                            z12 = c10.t(fVar, 13);
                            i12 |= 8192;
                            jsonElement4 = jsonElement5;
                            viewContext4 = viewContext2;
                        case 14:
                            viewContext2 = viewContext4;
                            versionMetadata3 = (VersionMetadata) c10.i(fVar, 14, VersionMetadata.a.f5480a, versionMetadata3);
                            i12 |= 16384;
                            jsonElement4 = jsonElement5;
                            viewContext4 = viewContext2;
                        case 15:
                            viewContext2 = viewContext4;
                            logContext3 = (LogContext) c10.C(fVar, 15, LogContext.a.f9461a, logContext3);
                            i11 = 32768;
                            i12 |= i11;
                            jsonElement4 = jsonElement5;
                            viewContext4 = viewContext2;
                        case 16:
                            viewContext2 = viewContext4;
                            networkRequestContext3 = (NetworkRequestContext) c10.C(fVar, 16, NetworkRequestContext.a.f9489a, networkRequestContext3);
                            i11 = PKIFailureInfo.notAuthorized;
                            i12 |= i11;
                            jsonElement4 = jsonElement5;
                            viewContext4 = viewContext2;
                        case 17:
                            viewContext2 = viewContext4;
                            snapshotContext3 = (SnapshotContext) c10.C(fVar, 17, SnapshotContext.a.f9493a, snapshotContext3);
                            i11 = PKIFailureInfo.unsupportedVersion;
                            i12 |= i11;
                            jsonElement4 = jsonElement5;
                            viewContext4 = viewContext2;
                        case 18:
                            viewContext2 = viewContext4;
                            mobileVitalsContext3 = (MobileVitalsContext) c10.C(fVar, 18, MobileVitalsContext.b.f5942a, mobileVitalsContext3);
                            i11 = PKIFailureInfo.transactionIdInUse;
                            i12 |= i11;
                            jsonElement4 = jsonElement5;
                            viewContext4 = viewContext2;
                        case 19:
                            viewContext2 = viewContext4;
                            errorContext2 = (ErrorContext) c10.C(fVar, 19, ErrorContext.a.f5408a, errorContext2);
                            i11 = PKIFailureInfo.signerNotTrusted;
                            i12 |= i11;
                            jsonElement4 = jsonElement5;
                            viewContext4 = viewContext2;
                        case 20:
                            viewContext2 = viewContext4;
                            lifecycleContext3 = (LifecycleContext) c10.C(fVar, 20, LifecycleContext.a.f9458a, lifecycleContext3);
                            i11 = PKIFailureInfo.badCertTemplate;
                            i12 |= i11;
                            jsonElement4 = jsonElement5;
                            viewContext4 = viewContext2;
                        case 21:
                            viewContext2 = viewContext4;
                            customMeasurementContext3 = (CustomMeasurementContext) c10.C(fVar, 21, CustomMeasurementContext.a.f9403a, customMeasurementContext3);
                            i11 = PKIFailureInfo.badSenderNonce;
                            i12 |= i11;
                            jsonElement4 = jsonElement5;
                            viewContext4 = viewContext2;
                        case 22:
                            viewContext2 = viewContext4;
                            interactionContext3 = (InteractionContext) c10.C(fVar, 22, InteractionContext.a.f9455a, interactionContext3);
                            i11 = 4194304;
                            i12 |= i11;
                            jsonElement4 = jsonElement5;
                            viewContext4 = viewContext2;
                        case 23:
                            viewContext2 = viewContext4;
                            screenshotContext4 = (ScreenshotContext) c10.C(fVar, 23, ScreenshotContext.C0146a.f7065a, screenshotContext4);
                            i11 = 8388608;
                            i12 |= i11;
                            jsonElement4 = jsonElement5;
                            viewContext4 = viewContext2;
                        case 24:
                            viewContext2 = viewContext4;
                            jVar2 = (j) c10.C(fVar, 24, j.c.f5436c, jVar2);
                            i11 = 16777216;
                            i12 |= i11;
                            jsonElement4 = jsonElement5;
                            viewContext4 = viewContext2;
                        default:
                            throw new B(e10);
                    }
                }
                sessionContext = sessionContext3;
                jVar = jVar2;
                logContext = logContext3;
                interactionContext = interactionContext3;
                customMeasurementContext = customMeasurementContext3;
                lifecycleContext = lifecycleContext3;
                errorContext = errorContext2;
                mobileVitalsContext = mobileVitalsContext3;
                snapshotContext = snapshotContext3;
                networkRequestContext = networkRequestContext3;
                versionMetadata = versionMetadata3;
                viewContext = viewContext4;
                screenshotContext = screenshotContext4;
                deviceContext = deviceContext3;
                deviceState = deviceState3;
                mobileSdkMetadata = mobileSdkMetadata3;
                eventContext = eventContext3;
                jsonElement = jsonElement4;
                str = str6;
                str2 = str7;
                str3 = str8;
                str4 = str9;
                i10 = i12;
                str5 = str10;
                z10 = z12;
                j10 = j11;
            }
            c10.b(fVar);
            return new CxRum(i10, str5, sessionContext, deviceContext, deviceState, mobileSdkMetadata, eventContext, jsonElement, str, str2, j10, str3, str4, viewContext, z10, versionMetadata, logContext, networkRequestContext, snapshotContext, mobileVitalsContext, errorContext, lifecycleContext, customMeasurementContext, interactionContext, screenshotContext, jVar, (U0) null);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(ci.f encoder, CxRum value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bi.f fVar = descriptor;
            ci.d c10 = encoder.c(fVar);
            CxRum.g(value, c10, fVar);
            c10.b(fVar);
        }

        @Override // di.N
        public final InterfaceC1901b[] childSerializers() {
            InterfaceC1901b t10 = AbstractC2028a.t(LogContext.a.f9461a);
            InterfaceC1901b t11 = AbstractC2028a.t(NetworkRequestContext.a.f9489a);
            InterfaceC1901b t12 = AbstractC2028a.t(SnapshotContext.a.f9493a);
            InterfaceC1901b t13 = AbstractC2028a.t(MobileVitalsContext.b.f5942a);
            InterfaceC1901b t14 = AbstractC2028a.t(ErrorContext.a.f5408a);
            InterfaceC1901b t15 = AbstractC2028a.t(LifecycleContext.a.f9458a);
            InterfaceC1901b t16 = AbstractC2028a.t(CustomMeasurementContext.a.f9403a);
            InterfaceC1901b t17 = AbstractC2028a.t(InteractionContext.a.f9455a);
            InterfaceC1901b t18 = AbstractC2028a.t(ScreenshotContext.C0146a.f7065a);
            InterfaceC1901b t19 = AbstractC2028a.t(j.c.f5436c);
            Z0 z02 = Z0.f45341a;
            return new InterfaceC1901b[]{z02, SessionContext.a.f5475a, DeviceContext.a.f5397a, DeviceState.a.f5400a, MobileSdkMetadata.a.f5451a, EventContext.a.f9433a, ei.q.f46124a, z02, z02, C4096j0.f45375a, z02, z02, ViewContext.a.f9361a, C4093i.f45370a, VersionMetadata.a.f5480a, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19};
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        public final bi.f getDescriptor() {
            return descriptor;
        }

        @Override // di.N
        public InterfaceC1901b[] typeParametersSerializers() {
            return N.a.a(this);
        }
    }

    /* renamed from: I5.c$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CxRum a(Ch.c span, p sessionConfiguration, O5.a snapshotManager) {
            Map map;
            Object m147constructorimpl;
            Long longOrNull;
            Object m147constructorimpl2;
            ViewContext viewContext;
            Intrinsics.checkNotNullParameter(span, "span");
            Intrinsics.checkNotNullParameter(sessionConfiguration, "sessionConfiguration");
            Intrinsics.checkNotNullParameter(snapshotManager, "snapshotManager");
            oh.g attributes = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
            boolean a10 = snapshotManager.a(attributes);
            oh.g attributes2 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes2, "getAttributes(...)");
            String c10 = R4.a.c(attributes2, "current_view_context");
            ViewContext viewContext2 = (c10 == null || (viewContext = (ViewContext) F5.b.b().d(ViewContext.INSTANCE.serializer(), c10)) == null) ? new ViewContext((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : viewContext;
            oh.g attributes3 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes3, "getAttributes(...)");
            String c11 = R4.a.c(attributes3, "screenshot_context");
            ScreenshotContext screenshotContext = c11 != null ? (ScreenshotContext) F5.b.b().d(ScreenshotContext.INSTANCE.serializer(), c11) : null;
            oh.g attributes4 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes4, "getAttributes(...)");
            String c12 = R4.a.c(attributes4, "span_id");
            if (c12 == null) {
                c12 = span.c();
            }
            String str = c12;
            oh.g attributes5 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes5, "getAttributes(...)");
            String c13 = R4.a.c(attributes5, "trace_id");
            if (c13 == null) {
                c13 = span.d();
            }
            String str2 = c13;
            oh.g attributes6 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes6, "getAttributes(...)");
            String c14 = R4.a.c(attributes6, "custom_labels");
            if (c14 != null) {
                Companion companion = CxRum.INSTANCE;
                try {
                    Result.Companion companion2 = Result.INSTANCE;
                    m147constructorimpl2 = Result.m147constructorimpl(ei.j.l(AbstractC4212b.f46079d.h(c14)));
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.INSTANCE;
                    m147constructorimpl2 = Result.m147constructorimpl(ResultKt.createFailure(th2));
                }
                if (Result.m153isFailureimpl(m147constructorimpl2)) {
                    m147constructorimpl2 = null;
                }
                map = (JsonObject) m147constructorimpl2;
            } else {
                map = null;
            }
            Map m10 = sessionConfiguration.c().m();
            Companion companion4 = CxRum.INSTANCE;
            try {
                Result.Companion companion5 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ei.j.l(F5.b.e(m10)));
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th3));
            }
            if (Result.m153isFailureimpl(m147constructorimpl)) {
                m147constructorimpl = null;
            }
            Map map2 = (JsonObject) m147constructorimpl;
            oh.g attributes7 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes7, "getAttributes(...)");
            String c15 = R4.a.c(attributes7, "session_id");
            oh.g attributes8 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes8, "getAttributes(...)");
            Long b10 = R4.a.b(attributes8, "session_creation_time");
            if (c15 == null) {
                c15 = sessionConfiguration.e();
            }
            SessionContext sessionContext = new SessionContext(b10 != null ? b10.longValue() : sessionConfiguration.d(), c15, sessionConfiguration.c().t());
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            DeviceContext deviceContext = new DeviceContext((String) null, str3, str4, str5, str6, false, 63, (DefaultConstructorMarker) null);
            MobileSdkMetadata mobileSdkMetadata = new MobileSdkMetadata(str3, str4, str5, str6, 15, (DefaultConstructorMarker) null);
            oh.g attributes9 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes9, "getAttributes(...)");
            EventContext eventContext = new EventContext(attributes9);
            if (map == null) {
                map = MapsKt.emptyMap();
            }
            if (map2 == null) {
                map2 = MapsKt.emptyMap();
            }
            JsonObject jsonObject = new JsonObject(MapsKt.plus(map, map2));
            Intrinsics.checkNotNull(str);
            oh.g attributes10 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes10, "getAttributes(...)");
            String c16 = R4.a.c(attributes10, EventKeys.TIMESTAMP);
            long longValue = (c16 == null || (longOrNull = StringsKt.toLongOrNull(c16)) == null) ? 0L : longOrNull.longValue();
            Intrinsics.checkNotNull(str2);
            String i10 = sessionConfiguration.c().i();
            VersionMetadata versionMetadata = new VersionMetadata(sessionConfiguration.c().c(), sessionConfiguration.c().v());
            LogContext.Companion companion7 = LogContext.INSTANCE;
            oh.g attributes11 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes11, "getAttributes(...)");
            LogContext a11 = companion7.a(attributes11);
            NetworkRequestContext.Companion companion8 = NetworkRequestContext.INSTANCE;
            oh.g attributes12 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes12, "getAttributes(...)");
            NetworkRequestContext a12 = companion8.a(attributes12);
            SnapshotContext c17 = a10 ? snapshotManager.c() : null;
            MobileVitalsContext.Companion companion9 = MobileVitalsContext.INSTANCE;
            oh.g attributes13 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes13, "getAttributes(...)");
            MobileVitalsContext a13 = companion9.a(attributes13);
            ErrorContext.Companion companion10 = ErrorContext.INSTANCE;
            oh.g attributes14 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes14, "getAttributes(...)");
            ErrorContext b11 = companion10.b(attributes14);
            LifecycleContext.Companion companion11 = LifecycleContext.INSTANCE;
            oh.g attributes15 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes15, "getAttributes(...)");
            LifecycleContext a14 = companion11.a(attributes15);
            CustomMeasurementContext.Companion companion12 = CustomMeasurementContext.INSTANCE;
            oh.g attributes16 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes16, "getAttributes(...)");
            CustomMeasurementContext a15 = companion12.a(attributes16);
            InteractionContext.Companion companion13 = InteractionContext.INSTANCE;
            oh.g attributes17 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes17, "getAttributes(...)");
            InteractionContext a16 = companion13.a(attributes17);
            j.Companion companion14 = j.INSTANCE;
            oh.g attributes18 = span.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes18, "getAttributes(...)");
            return new CxRum((String) null, sessionContext, deviceContext, (DeviceState) null, mobileSdkMetadata, eventContext, jsonObject, "mobile", str, longValue, str2, i10, viewContext2, a10, versionMetadata, a11, a12, c17, a13, b11, a14, a15, a16, screenshotContext, companion14.a(attributes18), 9, (DefaultConstructorMarker) null);
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f5390a;
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ CxRum(int i10, String str, SessionContext sessionContext, DeviceContext deviceContext, DeviceState deviceState, MobileSdkMetadata mobileSdkMetadata, EventContext eventContext, JsonElement jsonElement, String str2, String str3, long j10, String str4, String str5, ViewContext viewContext, boolean z10, VersionMetadata versionMetadata, LogContext logContext, NetworkRequestContext networkRequestContext, SnapshotContext snapshotContext, MobileVitalsContext mobileVitalsContext, ErrorContext errorContext, LifecycleContext lifecycleContext, CustomMeasurementContext customMeasurementContext, InteractionContext interactionContext, ScreenshotContext screenshotContext, j jVar, U0 u02) {
        String str6 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if ((i10 & 1) == 0) {
            this.fingerPrint = B5.a.c(B5.a.f796a, null, 1, null);
        } else {
            this.fingerPrint = str;
        }
        if ((i10 & 2) == 0) {
            this.sessionContext = new SessionContext(0L, (String) null, (String) null, (String) null, (String) null, (Map) null, false, 127, (DefaultConstructorMarker) null);
        } else {
            this.sessionContext = sessionContext;
        }
        if ((i10 & 4) == 0) {
            this.deviceContext = new DeviceContext((String) null, (String) null, (String) null, (String) null, (String) null, false, 63, (DefaultConstructorMarker) null);
        } else {
            this.deviceContext = deviceContext;
        }
        int i11 = 3;
        this.deviceState = (i10 & 8) == 0 ? new DeviceState(str6, (String) (objArr5 == true ? 1 : 0), i11, (DefaultConstructorMarker) (objArr4 == true ? 1 : 0)) : deviceState;
        if ((i10 & 16) == 0) {
            this.sdkMetadata = new MobileSdkMetadata((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        } else {
            this.sdkMetadata = mobileSdkMetadata;
        }
        this.eventContext = (i10 & 32) == 0 ? new EventContext((Q5.b) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : eventContext;
        this.labels = (i10 & 64) == 0 ? new JsonObject(MapsKt.emptyMap()) : jsonElement;
        if ((i10 & 128) == 0) {
            this.platform = "";
        } else {
            this.platform = str2;
        }
        if ((i10 & 256) == 0) {
            this.spanId = "";
        } else {
            this.spanId = str3;
        }
        this.timestamp = (i10 & 512) == 0 ? 0L : j10;
        if ((i10 & 1024) == 0) {
            this.traceId = "";
        } else {
            this.traceId = str4;
        }
        if ((i10 & 2048) == 0) {
            this.environment = "";
        } else {
            this.environment = str5;
        }
        this.viewContext = (i10 & 4096) == 0 ? new ViewContext((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : viewContext;
        this.isSnapshotEvent = (i10 & 8192) == 0 ? false : z10;
        this.versionMetadata = (i10 & 16384) == 0 ? new VersionMetadata((String) (objArr3 == true ? 1 : 0), (String) (objArr2 == true ? 1 : 0), i11, (DefaultConstructorMarker) (objArr == true ? 1 : 0)) : versionMetadata;
        if ((32768 & i10) == 0) {
            this.logContext = null;
        } else {
            this.logContext = logContext;
        }
        if ((65536 & i10) == 0) {
            this.networkRequestContext = null;
        } else {
            this.networkRequestContext = networkRequestContext;
        }
        if ((131072 & i10) == 0) {
            this.snapshotContext = null;
        } else {
            this.snapshotContext = snapshotContext;
        }
        if ((262144 & i10) == 0) {
            this.mobileVitalsContext = null;
        } else {
            this.mobileVitalsContext = mobileVitalsContext;
        }
        if ((524288 & i10) == 0) {
            this.errorContext = null;
        } else {
            this.errorContext = errorContext;
        }
        if ((1048576 & i10) == 0) {
            this.lifecycleContext = null;
        } else {
            this.lifecycleContext = lifecycleContext;
        }
        if ((2097152 & i10) == 0) {
            this.customMeasurementContext = null;
        } else {
            this.customMeasurementContext = customMeasurementContext;
        }
        if ((4194304 & i10) == 0) {
            this.interactionContext = null;
        } else {
            this.interactionContext = interactionContext;
        }
        if ((8388608 & i10) == 0) {
            this.screenshotContext = null;
        } else {
            this.screenshotContext = screenshotContext;
        }
        if ((i10 & 16777216) == 0) {
            this.internalContext = null;
        } else {
            this.internalContext = jVar;
        }
    }

    public static /* synthetic */ CxRum c(CxRum cxRum, String str, SessionContext sessionContext, DeviceContext deviceContext, DeviceState deviceState, MobileSdkMetadata mobileSdkMetadata, EventContext eventContext, JsonElement jsonElement, String str2, String str3, long j10, String str4, String str5, ViewContext viewContext, boolean z10, VersionMetadata versionMetadata, LogContext logContext, NetworkRequestContext networkRequestContext, SnapshotContext snapshotContext, MobileVitalsContext mobileVitalsContext, ErrorContext errorContext, LifecycleContext lifecycleContext, CustomMeasurementContext customMeasurementContext, InteractionContext interactionContext, ScreenshotContext screenshotContext, j jVar, int i10, Object obj) {
        j jVar2;
        ScreenshotContext screenshotContext2;
        String str6 = (i10 & 1) != 0 ? cxRum.fingerPrint : str;
        SessionContext sessionContext2 = (i10 & 2) != 0 ? cxRum.sessionContext : sessionContext;
        DeviceContext deviceContext2 = (i10 & 4) != 0 ? cxRum.deviceContext : deviceContext;
        DeviceState deviceState2 = (i10 & 8) != 0 ? cxRum.deviceState : deviceState;
        MobileSdkMetadata mobileSdkMetadata2 = (i10 & 16) != 0 ? cxRum.sdkMetadata : mobileSdkMetadata;
        EventContext eventContext2 = (i10 & 32) != 0 ? cxRum.eventContext : eventContext;
        JsonElement jsonElement2 = (i10 & 64) != 0 ? cxRum.labels : jsonElement;
        String str7 = (i10 & 128) != 0 ? cxRum.platform : str2;
        String str8 = (i10 & 256) != 0 ? cxRum.spanId : str3;
        long j11 = (i10 & 512) != 0 ? cxRum.timestamp : j10;
        String str9 = (i10 & 1024) != 0 ? cxRum.traceId : str4;
        String str10 = (i10 & 2048) != 0 ? cxRum.environment : str5;
        ViewContext viewContext2 = (i10 & 4096) != 0 ? cxRum.viewContext : viewContext;
        String str11 = str6;
        boolean z11 = (i10 & 8192) != 0 ? cxRum.isSnapshotEvent : z10;
        VersionMetadata versionMetadata2 = (i10 & 16384) != 0 ? cxRum.versionMetadata : versionMetadata;
        LogContext logContext2 = (i10 & 32768) != 0 ? cxRum.logContext : logContext;
        NetworkRequestContext networkRequestContext2 = (i10 & PKIFailureInfo.notAuthorized) != 0 ? cxRum.networkRequestContext : networkRequestContext;
        SnapshotContext snapshotContext2 = (i10 & PKIFailureInfo.unsupportedVersion) != 0 ? cxRum.snapshotContext : snapshotContext;
        MobileVitalsContext mobileVitalsContext2 = (i10 & PKIFailureInfo.transactionIdInUse) != 0 ? cxRum.mobileVitalsContext : mobileVitalsContext;
        ErrorContext errorContext2 = (i10 & PKIFailureInfo.signerNotTrusted) != 0 ? cxRum.errorContext : errorContext;
        LifecycleContext lifecycleContext2 = (i10 & PKIFailureInfo.badCertTemplate) != 0 ? cxRum.lifecycleContext : lifecycleContext;
        CustomMeasurementContext customMeasurementContext2 = (i10 & PKIFailureInfo.badSenderNonce) != 0 ? cxRum.customMeasurementContext : customMeasurementContext;
        InteractionContext interactionContext2 = (i10 & 4194304) != 0 ? cxRum.interactionContext : interactionContext;
        ScreenshotContext screenshotContext3 = (i10 & 8388608) != 0 ? cxRum.screenshotContext : screenshotContext;
        if ((i10 & 16777216) != 0) {
            screenshotContext2 = screenshotContext3;
            jVar2 = cxRum.internalContext;
        } else {
            jVar2 = jVar;
            screenshotContext2 = screenshotContext3;
        }
        return cxRum.b(str11, sessionContext2, deviceContext2, deviceState2, mobileSdkMetadata2, eventContext2, jsonElement2, str7, str8, j11, str9, str10, viewContext2, z11, versionMetadata2, logContext2, networkRequestContext2, snapshotContext2, mobileVitalsContext2, errorContext2, lifecycleContext2, customMeasurementContext2, interactionContext2, screenshotContext2, jVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r18.deviceContext, new I5.d((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 63, (kotlin.jvm.internal.DefaultConstructorMarker) null)) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r18.sdkMetadata, new I5.m((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 15, (kotlin.jvm.internal.DefaultConstructorMarker) null)) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r18.eventContext, new Q5.j((Q5.b) null, (java.lang.String) null, (java.lang.String) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null)) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r18.sessionContext, new I5.SessionContext(0L, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, false, 127, (kotlin.jvm.internal.DefaultConstructorMarker) null)) == false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void g(CxRum self, ci.d output, bi.f serialDesc) {
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (output.m(serialDesc, 0) || !Intrinsics.areEqual(self.fingerPrint, B5.a.c(B5.a.f796a, null, 1, null))) {
            output.G(serialDesc, 0, self.fingerPrint);
        }
        if (!output.m(serialDesc, 1)) {
        }
        output.B(serialDesc, 1, SessionContext.a.f5475a, self.sessionContext);
        if (!output.m(serialDesc, 2)) {
        }
        output.B(serialDesc, 2, DeviceContext.a.f5397a, self.deviceContext);
        int i10 = 3;
        if (output.m(serialDesc, 3) || !Intrinsics.areEqual(self.deviceState, new DeviceState(str, (String) (objArr5 == true ? 1 : 0), i10, (DefaultConstructorMarker) (objArr4 == true ? 1 : 0)))) {
            output.B(serialDesc, 3, DeviceState.a.f5400a, self.deviceState);
        }
        if (!output.m(serialDesc, 4)) {
        }
        output.B(serialDesc, 4, MobileSdkMetadata.a.f5451a, self.sdkMetadata);
        if (!output.m(serialDesc, 5)) {
        }
        output.B(serialDesc, 5, EventContext.a.f9433a, self.eventContext);
        if (output.m(serialDesc, 6) || !Intrinsics.areEqual(self.labels, new JsonObject(MapsKt.emptyMap()))) {
            output.B(serialDesc, 6, ei.q.f46124a, self.labels);
        }
        if (output.m(serialDesc, 7) || !Intrinsics.areEqual(self.platform, "")) {
            output.G(serialDesc, 7, self.platform);
        }
        if (output.m(serialDesc, 8) || !Intrinsics.areEqual(self.spanId, "")) {
            output.G(serialDesc, 8, self.spanId);
        }
        if (output.m(serialDesc, 9) || self.timestamp != 0) {
            output.e(serialDesc, 9, self.timestamp);
        }
        if (output.m(serialDesc, 10) || !Intrinsics.areEqual(self.traceId, "")) {
            output.G(serialDesc, 10, self.traceId);
        }
        if (output.m(serialDesc, 11) || !Intrinsics.areEqual(self.environment, "")) {
            output.G(serialDesc, 11, self.environment);
        }
        if (output.m(serialDesc, 12) || !Intrinsics.areEqual(self.viewContext, new ViewContext((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            output.B(serialDesc, 12, ViewContext.a.f9361a, self.viewContext);
        }
        if (output.m(serialDesc, 13) || self.isSnapshotEvent) {
            output.F(serialDesc, 13, self.isSnapshotEvent);
        }
        if (output.m(serialDesc, 14) || !Intrinsics.areEqual(self.versionMetadata, new VersionMetadata((String) (objArr3 == true ? 1 : 0), (String) (objArr2 == true ? 1 : 0), i10, (DefaultConstructorMarker) (objArr == true ? 1 : 0)))) {
            output.B(serialDesc, 14, VersionMetadata.a.f5480a, self.versionMetadata);
        }
        if (output.m(serialDesc, 15) || self.logContext != null) {
            output.C(serialDesc, 15, LogContext.a.f9461a, self.logContext);
        }
        if (output.m(serialDesc, 16) || self.networkRequestContext != null) {
            output.C(serialDesc, 16, NetworkRequestContext.a.f9489a, self.networkRequestContext);
        }
        if (output.m(serialDesc, 17) || self.snapshotContext != null) {
            output.C(serialDesc, 17, SnapshotContext.a.f9493a, self.snapshotContext);
        }
        if (output.m(serialDesc, 18) || self.mobileVitalsContext != null) {
            output.C(serialDesc, 18, MobileVitalsContext.b.f5942a, self.mobileVitalsContext);
        }
        if (output.m(serialDesc, 19) || self.errorContext != null) {
            output.C(serialDesc, 19, ErrorContext.a.f5408a, self.errorContext);
        }
        if (output.m(serialDesc, 20) || self.lifecycleContext != null) {
            output.C(serialDesc, 20, LifecycleContext.a.f9458a, self.lifecycleContext);
        }
        if (output.m(serialDesc, 21) || self.customMeasurementContext != null) {
            output.C(serialDesc, 21, CustomMeasurementContext.a.f9403a, self.customMeasurementContext);
        }
        if (output.m(serialDesc, 22) || self.interactionContext != null) {
            output.C(serialDesc, 22, InteractionContext.a.f9455a, self.interactionContext);
        }
        if (output.m(serialDesc, 23) || self.screenshotContext != null) {
            output.C(serialDesc, 23, ScreenshotContext.C0146a.f7065a, self.screenshotContext);
        }
        if (!output.m(serialDesc, 24) && self.internalContext == null) {
            return;
        }
        output.C(serialDesc, 24, j.c.f5436c, self.internalContext);
    }

    public final CxRum a(Q5.h editableCxRum) {
        JsonElement jsonElement;
        Map emptyMap;
        String email;
        String username;
        String userId;
        Intrinsics.checkNotNullParameter(editableCxRum, "editableCxRum");
        EventContext d10 = editableCxRum.d();
        EventContext eventContext = d10 == null ? new EventContext((Q5.b) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : d10;
        Map f10 = editableCxRum.f();
        if (f10 == null || (jsonElement = F5.b.e(f10)) == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        JsonElement jsonElement2 = jsonElement;
        String j10 = editableCxRum.j();
        String str = j10 == null ? "" : j10;
        String k10 = editableCxRum.k();
        String str2 = k10 == null ? "" : k10;
        String b10 = editableCxRum.b();
        String str3 = b10 == null ? "" : b10;
        ViewContext m10 = editableCxRum.m();
        ViewContext viewContext = m10 == null ? new ViewContext((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : m10;
        Boolean n10 = editableCxRum.n();
        boolean booleanValue = n10 != null ? n10.booleanValue() : false;
        Q5.i c10 = editableCxRum.c();
        ErrorContext a10 = c10 != null ? ErrorContext.INSTANCE.a(c10, this.errorContext) : null;
        LogContext h10 = editableCxRum.h();
        NetworkRequestContext i10 = editableCxRum.i();
        SessionContext sessionContext = this.sessionContext;
        UserContext l10 = editableCxRum.l();
        String str4 = (l10 == null || (userId = l10.getUserId()) == null) ? "" : userId;
        UserContext l11 = editableCxRum.l();
        String str5 = (l11 == null || (username = l11.getUsername()) == null) ? "" : username;
        UserContext l12 = editableCxRum.l();
        String str6 = (l12 == null || (email = l12.getEmail()) == null) ? "" : email;
        UserContext l13 = editableCxRum.l();
        if (l13 == null || (emptyMap = l13.getMetadata()) == null) {
            emptyMap = MapsKt.emptyMap();
        }
        return c(this, null, SessionContext.c(sessionContext, 0L, null, str4, str5, str6, emptyMap, false, 67, null), null, null, null, eventContext, jsonElement2, null, str, 0L, str2, str3, viewContext, booleanValue, null, h10, i10, null, null, a10, editableCxRum.g(), editableCxRum.a(), editableCxRum.e(), null, null, 25576093, null);
    }

    public final CxRum b(String fingerPrint, SessionContext sessionContext, DeviceContext deviceContext, DeviceState deviceState, MobileSdkMetadata sdkMetadata, EventContext eventContext, JsonElement labels, String platform, String spanId, long timestamp, String traceId, String environment, ViewContext viewContext, boolean isSnapshotEvent, VersionMetadata versionMetadata, LogContext logContext, NetworkRequestContext networkRequestContext, SnapshotContext snapshotContext, MobileVitalsContext mobileVitalsContext, ErrorContext errorContext, LifecycleContext lifecycleContext, CustomMeasurementContext customMeasurementContext, InteractionContext interactionContext, ScreenshotContext screenshotContext, j internalContext) {
        Intrinsics.checkNotNullParameter(fingerPrint, "fingerPrint");
        Intrinsics.checkNotNullParameter(sessionContext, "sessionContext");
        Intrinsics.checkNotNullParameter(deviceContext, "deviceContext");
        Intrinsics.checkNotNullParameter(deviceState, "deviceState");
        Intrinsics.checkNotNullParameter(sdkMetadata, "sdkMetadata");
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(viewContext, "viewContext");
        Intrinsics.checkNotNullParameter(versionMetadata, "versionMetadata");
        return new CxRum(fingerPrint, sessionContext, deviceContext, deviceState, sdkMetadata, eventContext, labels, platform, spanId, timestamp, traceId, environment, viewContext, isSnapshotEvent, versionMetadata, logContext, networkRequestContext, snapshotContext, mobileVitalsContext, errorContext, lifecycleContext, customMeasurementContext, interactionContext, screenshotContext, internalContext);
    }

    /* renamed from: d, reason: from getter */
    public final EventContext getEventContext() {
        return this.eventContext;
    }

    /* renamed from: e, reason: from getter */
    public final SnapshotContext getSnapshotContext() {
        return this.snapshotContext;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CxRum)) {
            return false;
        }
        CxRum cxRum = (CxRum) other;
        return Intrinsics.areEqual(this.fingerPrint, cxRum.fingerPrint) && Intrinsics.areEqual(this.sessionContext, cxRum.sessionContext) && Intrinsics.areEqual(this.deviceContext, cxRum.deviceContext) && Intrinsics.areEqual(this.deviceState, cxRum.deviceState) && Intrinsics.areEqual(this.sdkMetadata, cxRum.sdkMetadata) && Intrinsics.areEqual(this.eventContext, cxRum.eventContext) && Intrinsics.areEqual(this.labels, cxRum.labels) && Intrinsics.areEqual(this.platform, cxRum.platform) && Intrinsics.areEqual(this.spanId, cxRum.spanId) && this.timestamp == cxRum.timestamp && Intrinsics.areEqual(this.traceId, cxRum.traceId) && Intrinsics.areEqual(this.environment, cxRum.environment) && Intrinsics.areEqual(this.viewContext, cxRum.viewContext) && this.isSnapshotEvent == cxRum.isSnapshotEvent && Intrinsics.areEqual(this.versionMetadata, cxRum.versionMetadata) && Intrinsics.areEqual(this.logContext, cxRum.logContext) && Intrinsics.areEqual(this.networkRequestContext, cxRum.networkRequestContext) && Intrinsics.areEqual(this.snapshotContext, cxRum.snapshotContext) && Intrinsics.areEqual(this.mobileVitalsContext, cxRum.mobileVitalsContext) && Intrinsics.areEqual(this.errorContext, cxRum.errorContext) && Intrinsics.areEqual(this.lifecycleContext, cxRum.lifecycleContext) && Intrinsics.areEqual(this.customMeasurementContext, cxRum.customMeasurementContext) && Intrinsics.areEqual(this.interactionContext, cxRum.interactionContext) && Intrinsics.areEqual(this.screenshotContext, cxRum.screenshotContext) && Intrinsics.areEqual(this.internalContext, cxRum.internalContext);
    }

    public final Q5.h f() {
        EventContext eventContext = this.eventContext;
        JsonElement jsonElement = this.labels;
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        Map h10 = jsonObject != null ? F5.b.h(jsonObject) : null;
        if (h10 == null) {
            h10 = MapsKt.emptyMap();
        }
        Map map = h10;
        Q5.i iVar = null;
        String str = this.spanId;
        String str2 = this.traceId;
        String str3 = this.environment;
        ViewContext viewContext = this.viewContext;
        Boolean valueOf = Boolean.valueOf(this.isSnapshotEvent);
        ErrorContext errorContext = this.errorContext;
        if (errorContext != null) {
            iVar = new Q5.i(errorContext);
        }
        return new Q5.h(eventContext, map, str, str2, str3, viewContext, valueOf, iVar, this.logContext, this.networkRequestContext, this.sessionContext.d(), this.lifecycleContext, this.customMeasurementContext, this.interactionContext);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((this.fingerPrint.hashCode() * 31) + this.sessionContext.hashCode()) * 31) + this.deviceContext.hashCode()) * 31) + this.deviceState.hashCode()) * 31) + this.sdkMetadata.hashCode()) * 31) + this.eventContext.hashCode()) * 31) + this.labels.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.spanId.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + this.traceId.hashCode()) * 31) + this.environment.hashCode()) * 31) + this.viewContext.hashCode()) * 31) + Boolean.hashCode(this.isSnapshotEvent)) * 31) + this.versionMetadata.hashCode()) * 31;
        LogContext logContext = this.logContext;
        int hashCode2 = (hashCode + (logContext == null ? 0 : logContext.hashCode())) * 31;
        NetworkRequestContext networkRequestContext = this.networkRequestContext;
        int hashCode3 = (hashCode2 + (networkRequestContext == null ? 0 : networkRequestContext.hashCode())) * 31;
        SnapshotContext snapshotContext = this.snapshotContext;
        int hashCode4 = (hashCode3 + (snapshotContext == null ? 0 : snapshotContext.hashCode())) * 31;
        MobileVitalsContext mobileVitalsContext = this.mobileVitalsContext;
        int hashCode5 = (hashCode4 + (mobileVitalsContext == null ? 0 : mobileVitalsContext.hashCode())) * 31;
        ErrorContext errorContext = this.errorContext;
        int hashCode6 = (hashCode5 + (errorContext == null ? 0 : errorContext.hashCode())) * 31;
        LifecycleContext lifecycleContext = this.lifecycleContext;
        int hashCode7 = (hashCode6 + (lifecycleContext == null ? 0 : lifecycleContext.hashCode())) * 31;
        CustomMeasurementContext customMeasurementContext = this.customMeasurementContext;
        int hashCode8 = (hashCode7 + (customMeasurementContext == null ? 0 : customMeasurementContext.hashCode())) * 31;
        InteractionContext interactionContext = this.interactionContext;
        int hashCode9 = (hashCode8 + (interactionContext == null ? 0 : interactionContext.hashCode())) * 31;
        ScreenshotContext screenshotContext = this.screenshotContext;
        int hashCode10 = (hashCode9 + (screenshotContext == null ? 0 : screenshotContext.hashCode())) * 31;
        j jVar = this.internalContext;
        return hashCode10 + (jVar != null ? jVar.hashCode() : 0);
    }

    public String toString() {
        return "CxRum(fingerPrint=" + this.fingerPrint + ", sessionContext=" + this.sessionContext + ", deviceContext=" + this.deviceContext + ", deviceState=" + this.deviceState + ", sdkMetadata=" + this.sdkMetadata + ", eventContext=" + this.eventContext + ", labels=" + this.labels + ", platform=" + this.platform + ", spanId=" + this.spanId + ", timestamp=" + this.timestamp + ", traceId=" + this.traceId + ", environment=" + this.environment + ", viewContext=" + this.viewContext + ", isSnapshotEvent=" + this.isSnapshotEvent + ", versionMetadata=" + this.versionMetadata + ", logContext=" + this.logContext + ", networkRequestContext=" + this.networkRequestContext + ", snapshotContext=" + this.snapshotContext + ", mobileVitalsContext=" + this.mobileVitalsContext + ", errorContext=" + this.errorContext + ", lifecycleContext=" + this.lifecycleContext + ", customMeasurementContext=" + this.customMeasurementContext + ", interactionContext=" + this.interactionContext + ", screenshotContext=" + this.screenshotContext + ", internalContext=" + this.internalContext + ")";
    }

    public CxRum(String fingerPrint, SessionContext sessionContext, DeviceContext deviceContext, DeviceState deviceState, MobileSdkMetadata sdkMetadata, EventContext eventContext, JsonElement labels, String platform, String spanId, long j10, String traceId, String environment, ViewContext viewContext, boolean z10, VersionMetadata versionMetadata, LogContext logContext, NetworkRequestContext networkRequestContext, SnapshotContext snapshotContext, MobileVitalsContext mobileVitalsContext, ErrorContext errorContext, LifecycleContext lifecycleContext, CustomMeasurementContext customMeasurementContext, InteractionContext interactionContext, ScreenshotContext screenshotContext, j jVar) {
        Intrinsics.checkNotNullParameter(fingerPrint, "fingerPrint");
        Intrinsics.checkNotNullParameter(sessionContext, "sessionContext");
        Intrinsics.checkNotNullParameter(deviceContext, "deviceContext");
        Intrinsics.checkNotNullParameter(deviceState, "deviceState");
        Intrinsics.checkNotNullParameter(sdkMetadata, "sdkMetadata");
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(viewContext, "viewContext");
        Intrinsics.checkNotNullParameter(versionMetadata, "versionMetadata");
        this.fingerPrint = fingerPrint;
        this.sessionContext = sessionContext;
        this.deviceContext = deviceContext;
        this.deviceState = deviceState;
        this.sdkMetadata = sdkMetadata;
        this.eventContext = eventContext;
        this.labels = labels;
        this.platform = platform;
        this.spanId = spanId;
        this.timestamp = j10;
        this.traceId = traceId;
        this.environment = environment;
        this.viewContext = viewContext;
        this.isSnapshotEvent = z10;
        this.versionMetadata = versionMetadata;
        this.logContext = logContext;
        this.networkRequestContext = networkRequestContext;
        this.snapshotContext = snapshotContext;
        this.mobileVitalsContext = mobileVitalsContext;
        this.errorContext = errorContext;
        this.lifecycleContext = lifecycleContext;
        this.customMeasurementContext = customMeasurementContext;
        this.interactionContext = interactionContext;
        this.screenshotContext = screenshotContext;
        this.internalContext = jVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r53v1 */
    /* JADX WARN: Type inference failed for: r53v2, types: [I5.j] */
    /* JADX WARN: Type inference failed for: r53v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CxRum(String str, SessionContext sessionContext, DeviceContext deviceContext, DeviceState deviceState, MobileSdkMetadata mobileSdkMetadata, EventContext eventContext, JsonElement jsonElement, String str2, String str3, long j10, String str4, String str5, ViewContext viewContext, boolean z10, VersionMetadata versionMetadata, LogContext logContext, NetworkRequestContext networkRequestContext, SnapshotContext snapshotContext, MobileVitalsContext mobileVitalsContext, ErrorContext errorContext, LifecycleContext lifecycleContext, CustomMeasurementContext customMeasurementContext, InteractionContext interactionContext, ScreenshotContext screenshotContext, j jVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(r16, r4, r5, r3, r8, r7, r9, r10, r12, r13, r15, r11, r27, r6, r1, (i10 & 32768) != 0 ? r2 : logContext, (i10 & PKIFailureInfo.notAuthorized) != 0 ? r2 : networkRequestContext, (i10 & PKIFailureInfo.unsupportedVersion) != 0 ? r2 : snapshotContext, (i10 & PKIFailureInfo.transactionIdInUse) != 0 ? r2 : mobileVitalsContext, (i10 & PKIFailureInfo.signerNotTrusted) != 0 ? r2 : errorContext, (i10 & PKIFailureInfo.badCertTemplate) != 0 ? r2 : lifecycleContext, (i10 & PKIFailureInfo.badSenderNonce) != 0 ? r2 : customMeasurementContext, (i10 & 4194304) != 0 ? r2 : interactionContext, (i10 & 8388608) != 0 ? r2 : screenshotContext, (i10 & 16777216) != 0 ? r2 : jVar);
        DeviceState deviceState2;
        ViewContext viewContext2;
        LogContext logContext2;
        VersionMetadata versionMetadata2;
        String str6 = null;
        ?? r22 = 0;
        ?? r23 = 0;
        String c10 = (i10 & 1) != 0 ? B5.a.c(B5.a.f796a, null, 1, null) : str;
        SessionContext sessionContext2 = (i10 & 2) != 0 ? new SessionContext(0L, (String) null, (String) null, (String) null, (String) null, (Map) null, false, 127, (DefaultConstructorMarker) null) : sessionContext;
        DeviceContext deviceContext2 = (i10 & 4) != 0 ? new DeviceContext((String) null, (String) null, (String) null, (String) null, (String) null, false, 63, (DefaultConstructorMarker) null) : deviceContext;
        int i11 = 3;
        if ((i10 & 8) != 0) {
            deviceState2 = new DeviceState(str6, (String) (r23 == true ? 1 : 0), i11, (DefaultConstructorMarker) (r22 == true ? 1 : 0));
        } else {
            deviceState2 = deviceState;
        }
        MobileSdkMetadata mobileSdkMetadata2 = (i10 & 16) != 0 ? new MobileSdkMetadata((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : mobileSdkMetadata;
        EventContext eventContext2 = (i10 & 32) != 0 ? new EventContext((Q5.b) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : eventContext;
        JsonElement jsonObject = (i10 & 64) != 0 ? new JsonObject(MapsKt.emptyMap()) : jsonElement;
        String str7 = (i10 & 128) != 0 ? "" : str2;
        String str8 = (i10 & 256) != 0 ? "" : str3;
        long j11 = (i10 & 512) != 0 ? 0L : j10;
        String str9 = (i10 & 1024) != 0 ? "" : str4;
        String str10 = (i10 & 2048) == 0 ? str5 : "";
        ViewContext viewContext3 = (i10 & 4096) != 0 ? new ViewContext((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : viewContext;
        boolean z11 = (i10 & 8192) != 0 ? false : z10;
        String str11 = c10;
        if ((i10 & 16384) != 0) {
            viewContext2 = viewContext3;
            logContext2 = null;
            versionMetadata2 = new VersionMetadata((String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        } else {
            viewContext2 = viewContext3;
            logContext2 = null;
            versionMetadata2 = versionMetadata;
        }
    }
}
