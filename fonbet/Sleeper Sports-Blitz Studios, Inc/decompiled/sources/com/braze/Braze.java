package com.braze;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.appsflyer.AppsFlyerProperties;
import com.braze.Braze;
import com.braze.configuration.BrazeConfig;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.configuration.RuntimeAppConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.braze.enums.GeofenceTransitionType;
import com.braze.events.BannersUpdatedEvent;
import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.events.BrazePushEvent;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.IFireOnceEventSubscriber;
import com.braze.events.IValueCallback;
import com.braze.events.InAppMessageEvent;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.events.SdkDataWipeEvent;
import com.braze.events.SessionStateChangedEvent;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.images.IBrazeImageLoader;
import com.braze.location.IBrazeGeofenceApi;
import com.braze.managers.i1;
import com.braze.managers.j1;
import com.braze.managers.o0;
import com.braze.managers.q0;
import com.braze.managers.r;
import com.braze.managers.r0;
import com.braze.managers.v0;
import com.braze.managers.y0;
import com.braze.managers.z0;
import com.braze.models.Banner;
import com.braze.models.FeatureFlag;
import com.braze.models.IBrazeLocation;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.GeofenceDataStoreProvider;
import com.braze.storage.n3;
import com.braze.storage.s0;
import com.braze.storage.t0;
import com.braze.storage.v2;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import com.braze.support.StringUtils;
import com.braze.support.ValidationUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.radar.sdk.RadarTrackingOptions;
import java.io.File;
import java.io.FilenameFilter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0082\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 Á\u00022\u00020\u0001:\u0002Á\u0002B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u0013J\u0019\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b!\u0010 J\u0019\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b#\u0010$J#\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u00182\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b#\u0010'J-\u0010,\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010\u00182\b\u0010)\u001a\u0004\u0018\u00010\u00182\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J7\u0010,\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010\u00182\b\u0010)\u001a\u0004\u0018\u00010\u00182\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b,\u0010.J5\u0010,\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010\u00182\b\u0010)\u001a\u0004\u0018\u00010\u00182\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b,\u00101J?\u0010,\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010\u00182\b\u0010)\u001a\u0004\u0018\u00010\u00182\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u00100\u001a\u00020/2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b,\u00102J\u0019\u00104\u001a\u00020\u000b2\b\u00103\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b4\u0010$J\u0019\u00104\u001a\u00020\u000b2\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b4\u00107J-\u0010:\u001a\u00020\u000b2\b\u00103\u001a\u0004\u0018\u00010\u00182\b\u00108\u001a\u0004\u0018\u00010\u00182\b\u00109\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b:\u0010;J#\u0010=\u001a\u00020\u000b2\b\u00103\u001a\u0004\u0018\u00010\u00182\b\u0010<\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u000bH\u0016¢\u0006\u0004\b?\u0010\u0013J\u000f\u0010@\u001a\u00020\u000bH\u0016¢\u0006\u0004\b@\u0010\u0013J\u000f\u0010A\u001a\u00020\u000bH\u0016¢\u0006\u0004\bA\u0010\u0013J\u0015\u0010D\u001a\b\u0012\u0004\u0012\u00020C0BH\u0016¢\u0006\u0004\bD\u0010EJ\u0019\u0010G\u001a\u0004\u0018\u00010C2\u0006\u0010F\u001a\u00020\u0018H\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u0018H\u0016¢\u0006\u0004\bI\u0010$J\u001d\u0010K\u001a\u00020\u000b2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00180BH\u0016¢\u0006\u0004\bK\u0010LJ-\u0010K\u001a\u00020\u000b2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00180B2\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020N\u0018\u00010MH\u0016¢\u0006\u0004\bK\u0010PJ\u0019\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010F\u001a\u00020\u0018H\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\t2\u0006\u0010T\u001a\u00020\u0018H\u0016¢\u0006\u0004\bU\u0010\u001bJ!\u0010W\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020\u00182\b\u0010V\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bW\u0010>J\u000f\u0010X\u001a\u00020\u000bH\u0016¢\u0006\u0004\bX\u0010\u0013J\u001d\u0010\\\u001a\u00020\u000b2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0YH\u0016¢\u0006\u0004\b\\\u0010]J\u001d\u0010_\u001a\u00020\u000b2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020^0YH\u0016¢\u0006\u0004\b_\u0010]J\u001d\u0010a\u001a\u00020\u000b2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020`0YH\u0016¢\u0006\u0004\ba\u0010]J\u001d\u0010c\u001a\u00020\u000b2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020b0YH\u0016¢\u0006\u0004\bc\u0010]J\u001d\u0010d\u001a\u00020\u000b2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020N0YH\u0016¢\u0006\u0004\bd\u0010]J\u001d\u0010f\u001a\u00020\u000b2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020e0YH\u0016¢\u0006\u0004\bf\u0010]J\u001d\u0010h\u001a\u00020\u000b2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020g0YH\u0016¢\u0006\u0004\bh\u0010]J\u001d\u0010j\u001a\u00020\u000b2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020i0YH\u0016¢\u0006\u0004\bj\u0010]J\u001d\u0010l\u001a\u00020\u000b2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020k0YH\u0016¢\u0006\u0004\bl\u0010]J\u001d\u0010n\u001a\u00020\u000b2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020m0YH\u0016¢\u0006\u0004\bn\u0010]J\u001d\u0010p\u001a\u00020\u000b2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020o0YH\u0016¢\u0006\u0004\bp\u0010]J1\u0010t\u001a\u00020\u000b\"\u0004\b\u0000\u0010q2\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000Y2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000rH\u0016¢\u0006\u0004\bt\u0010uJ3\u0010v\u001a\u00020\u000b\"\u0004\b\u0000\u0010q2\u000e\u0010[\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010Y2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000rH\u0016¢\u0006\u0004\bv\u0010uJ\u0019\u0010x\u001a\u00020\u000b2\b\u0010w\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bx\u0010$J#\u0010x\u001a\u00020\u000b2\b\u0010w\u001a\u0004\u0018\u00010\u00182\b\u0010y\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bx\u0010>J\u001d\u0010{\u001a\u00020\u000b2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020z0MH\u0016¢\u0006\u0004\b{\u0010|J\u001d\u0010}\u001a\u00020\u000b2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00180MH\u0016¢\u0006\u0004\b}\u0010|J\u000f\u0010~\u001a\u00020/H\u0016¢\u0006\u0004\b~\u0010\u007fJ\u0011\u0010\u0080\u0001\u001a\u00020/H\u0016¢\u0006\u0005\b\u0080\u0001\u0010\u007fJ\u0013\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001a\u0010\u0085\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0084\u0001\u0018\u00010BH\u0016¢\u0006\u0005\b\u0085\u0001\u0010EJ\u0010\u0010\u0086\u0001\u001a\u00020\t¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J \u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0084\u00012\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J!\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0084\u00012\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u0001H\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u008d\u0001J \u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008f\u00012\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J&\u0010\u0095\u0001\u001a\u00020\u000b2\b\u0010\u0093\u0001\u001a\u00030\u0092\u00012\b\u0010\u0094\u0001\u001a\u00030\u0092\u0001H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0011\u0010\u0097\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0097\u0001\u0010\u0013J&\u0010\u009a\u0001\u001a\u00020\u000b2\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00182\u0007\u0010\u0099\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001a\u0010\u009d\u0001\u001a\u00020\u000b2\u0007\u0010\u009c\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u009d\u0001\u0010$J)\u0010£\u0001\u001a\u00020\u000b2\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u00182\n\u0010 \u0001\u001a\u0005\u0018\u00010\u009f\u0001H\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u001e\u0010¨\u0001\u001a\u00020\u000b2\n\u0010¥\u0001\u001a\u0005\u0018\u00010¤\u0001H\u0000¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u001a\u0010¨\u0001\u001a\u00020\u000b2\u0007\u0010©\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b¦\u0001\u0010\rJ$\u0010¬\u0001\u001a\u00020\u000b2\u0007\u0010ª\u0001\u001a\u00020\u00182\b\u0010w\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0005\b«\u0001\u0010>J\u001c\u0010®\u0001\u001a\u00020\u000b2\b\u0010¥\u0001\u001a\u00030¤\u0001H\u0000¢\u0006\u0006\b\u00ad\u0001\u0010§\u0001J\u0011\u0010°\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b¯\u0001\u0010\u0013J\u0011\u0010²\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b±\u0001\u0010\u0013J\u0019\u0010´\u0001\u001a\u00020\u000b2\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0005\b³\u0001\u00107J\u0011\u0010¶\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\bµ\u0001\u0010\u0013J\u0011\u0010¸\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b·\u0001\u0010\u0013J\u0011\u0010º\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b¹\u0001\u0010\u0013J\u001b\u0010¾\u0001\u001a\u00020\u000b2\u0007\u0010»\u0001\u001a\u00020ZH\u0000¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u001b\u0010À\u0001\u001a\u00020\u000b2\u0007\u0010»\u0001\u001a\u00020ZH\u0000¢\u0006\u0006\b¿\u0001\u0010½\u0001J&\u0010Ç\u0001\u001a\u00020\u000b2\b\u0010Â\u0001\u001a\u00030Á\u00012\b\u0010Ä\u0001\u001a\u00030Ã\u0001H\u0000¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J$\u0010Ë\u0001\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u00182\b\u0010È\u0001\u001a\u00030\u0081\u0001H\u0000¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\u001c\u0010Î\u0001\u001a\u00020\u000b2\b\u0010È\u0001\u001a\u00030\u0081\u0001H\u0000¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J\u0011\u0010Ð\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\bÏ\u0001\u0010\u0013J\u001a\u0010Ó\u0001\u001a\u00020\u000b2\u0007\u0010Ñ\u0001\u001a\u00020\u0018H\u0000¢\u0006\u0005\bÒ\u0001\u0010$J\u001a\u0010Ö\u0001\u001a\u00020\t2\u0007\u0010Ô\u0001\u001a\u00020\u0018H\u0000¢\u0006\u0005\bÕ\u0001\u0010\u001bJ\u0011\u0010Ø\u0001\u001a\u00020\u000bH\u0001¢\u0006\u0005\b×\u0001\u0010\u0013J\u0081\u0001\u0010ç\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010q2\u0007\u0010Ù\u0001\u001a\u00028\u00002\u000e\u0010Û\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180Ú\u00012\t\b\u0002\u0010Ü\u0001\u001a\u00020\t2\t\b\u0002\u0010Ý\u0001\u001a\u00020\t2\t\b\u0002\u0010Þ\u0001\u001a\u00020\t2-\u0010ä\u0001\u001a(\b\u0001\u0012\u0005\u0012\u00030à\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000á\u0001\u0012\u0007\u0012\u0005\u0018\u00010â\u00010ß\u0001¢\u0006\u0003\bã\u0001H\u0001¢\u0006\u0006\bå\u0001\u0010æ\u0001JS\u0010ê\u0001\u001a\u00020\u000b2\u000e\u0010Û\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180Ú\u00012\t\b\u0002\u0010Ü\u0001\u001a\u00020\t2\t\b\u0002\u0010Ý\u0001\u001a\u00020\t2\t\b\u0002\u0010Þ\u0001\u001a\u00020\t2\u000e\u0010ä\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0Ú\u0001H\u0001¢\u0006\u0006\bè\u0001\u0010é\u0001J\u001b\u0010î\u0001\u001a\u00030ë\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0006\bì\u0001\u0010í\u0001R4\u0010ñ\u0001\u001a\u00030ï\u00012\b\u0010ð\u0001\u001a\u00030ï\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bñ\u0001\u0010ò\u0001\u001a\u0006\bó\u0001\u0010ô\u0001\"\u0006\bõ\u0001\u0010ö\u0001R\u0019\u0010÷\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010ø\u0001R\u001a\u0010ú\u0001\u001a\u00030ù\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R\u0019\u0010ü\u0001\u001a\u00020z8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R2\u0010þ\u0001\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bþ\u0001\u0010ÿ\u0001\u0012\u0005\b\u0084\u0002\u0010\u0013\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002\"\u0006\b\u0082\u0002\u0010\u0083\u0002R\u0019\u0010\u0085\u0002\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0002\u0010\u0086\u0002R1\u0010\u0088\u0002\u001a\u00030\u0087\u00028\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b\u0088\u0002\u0010\u0089\u0002\u0012\u0005\b\u008e\u0002\u0010\u0013\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002\"\u0006\b\u008c\u0002\u0010\u008d\u0002R1\u0010\u0090\u0002\u001a\u00030\u008f\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u0090\u0002\u0010\u0091\u0002\u0012\u0005\b\u0096\u0002\u0010\u0013\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002\"\u0006\b\u0094\u0002\u0010\u0095\u0002R1\u0010\u0098\u0002\u001a\u00030\u0097\u00028\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b\u0098\u0002\u0010\u0099\u0002\u0012\u0005\b\u009e\u0002\u0010\u0013\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002\"\u0006\b\u009c\u0002\u0010\u009d\u0002R1\u0010\u009f\u0002\u001a\u00030ë\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b\u009f\u0002\u0010 \u0002\u0012\u0005\b¥\u0002\u0010\u0013\u001a\u0006\b¡\u0002\u0010¢\u0002\"\u0006\b£\u0002\u0010¤\u0002R1\u0010§\u0002\u001a\u00030¦\u00028\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b§\u0002\u0010¨\u0002\u0012\u0005\b\u00ad\u0002\u0010\u0013\u001a\u0006\b©\u0002\u0010ª\u0002\"\u0006\b«\u0002\u0010¬\u0002R1\u0010¯\u0002\u001a\u00030®\u00028\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b¯\u0002\u0010°\u0002\u0012\u0005\bµ\u0002\u0010\u0013\u001a\u0006\b±\u0002\u0010²\u0002\"\u0006\b³\u0002\u0010´\u0002R\u0019\u0010¸\u0002\u001a\u0004\u0018\u00010`8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¶\u0002\u0010·\u0002R\u0017\u0010»\u0002\u001a\u00020\u00188VX\u0096\u0004¢\u0006\b\u001a\u0006\b¹\u0002\u0010º\u0002R\u0018\u0010½\u0002\u001a\u0004\u0018\u00010z8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b{\u0010¼\u0002R-\u0010À\u0002\u001a\u0004\u0018\u00010\u00182\t\u0010ð\u0001\u001a\u0004\u0018\u00010\u00188V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b¾\u0002\u0010º\u0002\"\u0005\b¿\u0002\u0010$¨\u0006Â\u0002"}, d2 = {"Lcom/braze/Braze;", "Lcom/braze/IBraze;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/braze/managers/n0;", "getDeviceDataProvider", "()Lcom/braze/managers/n0;", "", "isOffline", "", "setSyncPolicyOfflineStatus", "(Z)V", "", "throwable", "publishError", "(Ljava/lang/Throwable;)V", "verifyProperSdkSetup", "()V", "Lcom/braze/managers/j1;", "dependencyProvider", "setUserSpecificMemberVariablesAndStartDispatch", "(Lcom/braze/managers/j1;)V", "", SDKConstants.PARAM_KEY, "isEphemeralEventKey", "(Ljava/lang/String;)Z", "safeCallFlushDelayedInitPushAnalyticsQueue", "Landroid/app/Activity;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "openSession", "(Landroid/app/Activity;)V", "closeSession", "eventName", "logCustomEvent", "(Ljava/lang/String;)V", "Lcom/braze/models/outgoing/BrazeProperties;", "properties", "(Ljava/lang/String;Lcom/braze/models/outgoing/BrazeProperties;)V", "productId", AppsFlyerProperties.CURRENCY_CODE, "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.PRICE, "logPurchase", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/braze/models/outgoing/BrazeProperties;)V", "", "quantity", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;I)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILcom/braze/models/outgoing/BrazeProperties;)V", "campaignId", "logPushNotificationOpened", "Landroid/content/Intent;", SDKConstants.PARAM_INTENT, "(Landroid/content/Intent;)V", "actionId", SDKConstants.PARAM_GAME_REQUESTS_ACTION_TYPE, "logPushNotificationActionClicked", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "pageId", "logPushStoryPageClicked", "(Ljava/lang/String;Ljava/lang/String;)V", "requestContentCardsRefresh", "requestContentCardsRefreshFromCache", "refreshFeatureFlags", "", "Lcom/braze/models/FeatureFlag;", "getAllFeatureFlags", "()Ljava/util/List;", "id", "getFeatureFlag", "(Ljava/lang/String;)Lcom/braze/models/FeatureFlag;", "logFeatureFlagImpression", "ids", "requestBannersRefresh", "(Ljava/util/List;)V", "Lcom/braze/events/IValueCallback;", "Lcom/braze/events/BannersUpdatedEvent;", "completionCallback", "(Ljava/util/List;Lcom/braze/events/IValueCallback;)V", "Lcom/braze/models/Banner;", "getBanner", "(Ljava/lang/String;)Lcom/braze/models/Banner;", "placementId", "logBannerImpression", "buttonId", "logBannerClick", "requestImmediateDataFlush", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/InAppMessageEvent;", "subscriber", "subscribeToNewInAppMessages", "(Lcom/braze/events/IEventSubscriber;)V", "Lcom/braze/events/NoMatchingTriggerEvent;", "subscribeToNoMatchingTriggerForEvent", "Lcom/braze/events/ContentCardsUpdatedEvent;", "subscribeToContentCardsUpdates", "Lcom/braze/events/FeatureFlagsUpdatedEvent;", "subscribeToFeatureFlagsUpdates", "subscribeToBannersUpdates", "Lcom/braze/events/internal/b;", "subscribeToBannersErrors", "Lcom/braze/events/SessionStateChangedEvent;", "subscribeToSessionUpdates", "Lcom/braze/events/BrazeNetworkFailureEvent;", "subscribeToNetworkFailures", "Lcom/braze/events/BrazeSdkAuthenticationErrorEvent;", "subscribeToSdkAuthenticationFailures", "Lcom/braze/events/BrazePushEvent;", "subscribeToPushNotificationEvents", "Lcom/braze/events/BrazeUserChangeEvent;", "subscribeToChangeUserEvents", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "eventClass", "addSingleSynchronousSubscription", "(Lcom/braze/events/IEventSubscriber;Ljava/lang/Class;)V", "removeSingleSubscription", "userId", "changeUser", "sdkAuthSignature", "Lcom/braze/BrazeUser;", "getCurrentUser", "(Lcom/braze/events/IValueCallback;)V", "getDeviceIdAsync", "getContentCardCount", "()I", "getContentCardUnviewedCount", "", "getContentCardsLastUpdatedInSecondsFromEpoch", "()J", "Lcom/braze/models/cards/Card;", "getCachedContentCards", "areCachedContentCardsStale", "()Z", "contentCardString", "deserializeContentCard", "(Ljava/lang/String;)Lcom/braze/models/cards/Card;", "Lorg/json/JSONObject;", "contentCardJson", "(Lorg/json/JSONObject;)Lcom/braze/models/cards/Card;", "inAppMessageString", "Lcom/braze/models/inappmessage/IInAppMessage;", "deserializeInAppMessageString", "(Ljava/lang/String;)Lcom/braze/models/inappmessage/IInAppMessage;", "", "latitude", "longitude", "requestGeofences", "(DD)V", "requestLocationInitialization", "googleAdvertisingId", "isLimitAdTrackingEnabled", "setGoogleAdvertisingId", "(Ljava/lang/String;Z)V", "signature", "setSdkAuthenticationSignature", "geofenceId", "Lcom/braze/enums/GeofenceTransitionType;", "transitionType", "recordGeofenceTransition$android_sdk_base_release", "(Ljava/lang/String;Lcom/braze/enums/GeofenceTransitionType;)V", "recordGeofenceTransition", "Lcom/braze/models/IBrazeLocation;", FirebaseAnalytics.Param.LOCATION, "requestGeofenceRefresh$android_sdk_base_release", "(Lcom/braze/models/IBrazeLocation;)V", "requestGeofenceRefresh", "ignoreRateLimit", "serializedCardJson", "addSerializedCardJsonToStorage$android_sdk_base_release", "addSerializedCardJsonToStorage", "logLocationRecordedEventFromLocationUpdate$android_sdk_base_release", "logLocationRecordedEventFromLocationUpdate", "requestGeofencesInitialization$android_sdk_base_release", "requestGeofencesInitialization", "requestSingleLocationUpdate$android_sdk_base_release", "requestSingleLocationUpdate", "handleInAppMessageTestPush$android_sdk_base_release", "handleInAppMessageTestPush", "handleInternalBannerRefresh$android_sdk_base_release", "handleInternalBannerRefresh", "deleteRegisteredGeofenceCache$android_sdk_base_release", "deleteRegisteredGeofenceCache", "applyPendingRuntimeConfiguration$android_sdk_base_release", "applyPendingRuntimeConfiguration", "event", "retryInAppMessage$android_sdk_base_release", "(Lcom/braze/events/InAppMessageEvent;)V", "retryInAppMessage", "reenqueueInAppMessage$android_sdk_base_release", "reenqueueInAppMessage", "Lcom/braze/enums/BrazePushEventType;", "pushActionType", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "publishBrazePushAction$android_sdk_base_release", "(Lcom/braze/enums/BrazePushEventType;Lcom/braze/models/push/BrazeNotificationPayload;)V", "publishBrazePushAction", "timeInMs", "logPushDelivery$android_sdk_base_release", "(Ljava/lang/String;J)V", "logPushDelivery", "schedulePushDelivery$android_sdk_base_release", "(J)V", "schedulePushDelivery", "performPushDeliveryFlush$android_sdk_base_release", "performPushDeliveryFlush", "campaign", "logPushMaxCampaign$android_sdk_base_release", "logPushMaxCampaign", "pushId", "validateAndStorePushId$android_sdk_base_release", "validateAndStorePushId", "waitForUserDependencyThread$android_sdk_base_release", "waitForUserDependencyThread", "defaultValueOnException", "Lkotlin/Function0;", "errorLog", "earlyReturnIfDisabled", "earlyReturnIfDelayedInitEnabled", "earlyReturnIfUdmUninitialized", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "runForResult$android_sdk_base_release", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;ZZZLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "runForResult", "run$android_sdk_base_release", "(Lkotlin/jvm/functions/Function0;ZZZLkotlin/jvm/functions/Function0;)V", "run", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProviderSafe$android_sdk_base_release", "(Landroid/content/Context;)Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProviderSafe", "Lcom/braze/images/IBrazeImageLoader;", "value", "imageLoader", "Lcom/braze/images/IBrazeImageLoader;", "getImageLoader", "()Lcom/braze/images/IBrazeImageLoader;", "setImageLoader", "(Lcom/braze/images/IBrazeImageLoader;)V", "applicationContext", "Landroid/content/Context;", "Lcom/braze/configuration/e;", "offlineUserStorageProvider", "Lcom/braze/configuration/e;", "brazeUser", "Lcom/braze/BrazeUser;", "isApiKeyPresent", "Ljava/lang/Boolean;", "isApiKeyPresent$android_sdk_base_release", "()Ljava/lang/Boolean;", "setApiKeyPresent$android_sdk_base_release", "(Ljava/lang/Boolean;)V", "isApiKeyPresent$android_sdk_base_release$annotations", "isInstanceStopped", "Z", "Lcom/braze/managers/o0;", "deviceIdProvider", "Lcom/braze/managers/o0;", "getDeviceIdProvider$android_sdk_base_release", "()Lcom/braze/managers/o0;", "setDeviceIdProvider$android_sdk_base_release", "(Lcom/braze/managers/o0;)V", "getDeviceIdProvider$android_sdk_base_release$annotations", "Lcom/braze/events/e;", "externalIEventMessenger", "Lcom/braze/events/e;", "getExternalIEventMessenger$android_sdk_base_release", "()Lcom/braze/events/e;", "setExternalIEventMessenger$android_sdk_base_release", "(Lcom/braze/events/e;)V", "getExternalIEventMessenger$android_sdk_base_release$annotations", "Lcom/braze/managers/q0;", "registrationDataProvider", "Lcom/braze/managers/q0;", "getRegistrationDataProvider$android_sdk_base_release", "()Lcom/braze/managers/q0;", "setRegistrationDataProvider$android_sdk_base_release", "(Lcom/braze/managers/q0;)V", "getRegistrationDataProvider$android_sdk_base_release$annotations", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProvider$android_sdk_base_release", "()Lcom/braze/configuration/BrazeConfigurationProvider;", "setConfigurationProvider$android_sdk_base_release", "(Lcom/braze/configuration/BrazeConfigurationProvider;)V", "getConfigurationProvider$android_sdk_base_release$annotations", "Lcom/braze/managers/v0;", "pushDeliveryManager", "Lcom/braze/managers/v0;", "getPushDeliveryManager$android_sdk_base_release", "()Lcom/braze/managers/v0;", "setPushDeliveryManager$android_sdk_base_release", "(Lcom/braze/managers/v0;)V", "getPushDeliveryManager$android_sdk_base_release$annotations", "Lcom/braze/managers/r0;", "udm", "Lcom/braze/managers/r0;", "getUdm$android_sdk_base_release", "()Lcom/braze/managers/r0;", "setUdm$android_sdk_base_release", "(Lcom/braze/managers/r0;)V", "getUdm$android_sdk_base_release$annotations", "getCachedContentCardsUpdatedEvent", "()Lcom/braze/events/ContentCardsUpdatedEvent;", "cachedContentCardsUpdatedEvent", "getDeviceId", "()Ljava/lang/String;", "deviceId", "()Lcom/braze/BrazeUser;", "currentUser", "getRegisteredPushToken", "setRegisteredPushToken", "registeredPushToken", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Braze implements IBraze {
    private static boolean areOutboundNetworkRequestsOffline;
    private static IBrazeNotificationFactory customBrazeNotificationFactory;
    private static t0 delayedInitializationProvider;
    private static com.braze.managers.n0 deviceDataProvider;
    private static IBrazeEndpointProvider endpointProvider;
    private static volatile Braze instance;
    private static v2 sdkEnablementProvider;
    private static boolean shouldMockNetworkRequestsAndDropEvents;
    private static com.braze.events.e staticExternalIEventMessenger;
    private Context applicationContext;
    private BrazeUser brazeUser;
    public BrazeConfigurationProvider configurationProvider;
    public o0 deviceIdProvider;
    private com.braze.events.e externalIEventMessenger;
    private IBrazeImageLoader imageLoader;
    private Boolean isApiKeyPresent;
    private boolean isInstanceStopped;
    private com.braze.configuration.e offlineUserStorageProvider;
    public v0 pushDeliveryManager;
    public q0 registrationDataProvider;
    public r0 udm;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ReentrantLock brazeClassLock = new ReentrantLock();
    private static final Set<String> KNOWN_APP_CRAWLER_DEVICE_MODELS = SetsKt.setOf("calypso appcrawler");
    private static final Set<String> NECESSARY_BRAZE_SDK_PERMISSIONS = SetsKt.setOf((Object[]) new String[]{"android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"});
    private static final ReentrantLock endpointProviderLock = new ReentrantLock();
    private static boolean shouldRequestFrameworkListenToNetworkUpdates = true;
    private static final List<BrazeConfig> pendingConfigurations = new ArrayList();
    private static final BrazeConfig clearConfigSentinel = new BrazeConfig.Builder().build();

    @Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u0003J\u0017\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\b#\u0010$J%\u0010(\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\rH\u0007¢\u0006\u0004\b*\u0010\u000fJ\u0017\u0010+\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010\bJ\u0017\u0010,\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b,\u0010\bJ\u0017\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b-\u0010\bJ!\u00100\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b2\u0010\bJ\u0019\u00106\u001a\u00020\u00062\b\u00103\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0004\b4\u00105J\u0017\u0010:\u001a\u0002072\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b8\u00109J\u001f\u0010A\u001a\u00020\u00062\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0001¢\u0006\u0004\b?\u0010@J\u0017\u0010E\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\rH\u0001¢\u0006\u0004\bC\u0010DJ\u000f\u0010G\u001a\u00020\u0006H\u0001¢\u0006\u0004\bF\u0010\u0003R(\u0010H\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bH\u0010I\u0012\u0004\bL\u0010\u0003\u001a\u0004\bJ\u0010\u000f\"\u0004\bK\u0010DR*\u0010M\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bM\u0010N\u0012\u0004\bS\u0010\u0003\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR*\u0010T\u001a\u0004\u0018\u0001078\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bT\u0010U\u0012\u0004\bY\u0010\u0003\u001a\u0004\b8\u0010V\"\u0004\bW\u0010XR*\u0010[\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b[\u0010\\\u0012\u0004\ba\u0010\u0003\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R*\u0010c\u001a\u0004\u0018\u00010b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bc\u0010d\u0012\u0004\bi\u0010\u0003\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR*\u0010k\u001a\u0004\u0018\u00010j8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bk\u0010l\u0012\u0004\bq\u0010\u0003\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR*\u0010v\u001a\u00020\r2\u0006\u0010r\u001a\u00020\r8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bu\u0010\u0003\u001a\u0004\bs\u0010\u000f\"\u0004\bt\u0010DR\u001a\u0010w\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\bx\u0010\u0003\u001a\u0004\bw\u0010\u000fR\u001a\u0010y\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\bz\u0010\u0003\u001a\u0004\by\u0010\u000fR\u001a\u0010{\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b|\u0010\u0003\u001a\u0004\b{\u0010\u000fR\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00020\u00150\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001e\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00020\u00150\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0082\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0016\u0010\u0086\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u007fR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0019\u0010\u0087\u0001R\u0018\u0010\u0088\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010IR\u0018\u0010\u0089\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010IR\u001e\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00020!0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u008d\u0001\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001¨\u0006\u008f\u0001"}, d2 = {"Lcom/braze/Braze$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "clearSharedPreferencesData", "(Landroid/content/Context;)V", "clearDataStoreData", "Lcom/braze/storage/v2;", "getSdkEnablementProvider", "(Landroid/content/Context;)Lcom/braze/storage/v2;", "", "shouldAllowSingletonInitialization", "()Z", "Lcom/braze/Braze;", "getInstance", "(Landroid/content/Context;)Lcom/braze/Braze;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "", "getConfiguredApiKey", "(Lcom/braze/configuration/BrazeConfigurationProvider;)Ljava/lang/String;", "Lcom/braze/IBrazeEndpointProvider;", "endpointProvider", "setEndpointProvider", "(Lcom/braze/IBrazeEndpointProvider;)V", "clearEndpointProvider", "Landroid/net/Uri;", "brazeEndpoint", "getApiEndpoint", "(Landroid/net/Uri;)Landroid/net/Uri;", "Lcom/braze/configuration/BrazeConfig;", AnalyticsConstantsKt.KEY_CONFIG, "configure", "(Landroid/content/Context;Lcom/braze/configuration/BrazeConfig;)Z", "Ljava/util/EnumSet;", "Lcom/braze/enums/BrazeSdkMetadata;", "sdkMetadata", "addSdkMetadata", "(Landroid/content/Context;Ljava/util/EnumSet;)V", "enableMockNetworkRequestsAndDropEventsMode", "disableSdk", "enableSdk", "disableDelayedInitialization", "Lcom/braze/enums/DelayedInitializationAnalyticsBehavior;", "analyticsBehavior", "enableDelayedInitialization", "(Landroid/content/Context;Lcom/braze/enums/DelayedInitializationAnalyticsBehavior;)V", "wipeData", "configuredCustomEndpoint", "setConfiguredCustomEndpoint$android_sdk_base_release", "(Ljava/lang/String;)V", "setConfiguredCustomEndpoint", "Lcom/braze/storage/t0;", "getDelayedInitializationProvider$android_sdk_base_release", "(Landroid/content/Context;)Lcom/braze/storage/t0;", "getDelayedInitializationProvider", "Landroid/content/Intent;", SDKConstants.PARAM_INTENT, "Lcom/braze/managers/m0;", "brazeManager", "requestTriggersIfInAppMessageTestPush$android_sdk_base_release", "(Landroid/content/Intent;Lcom/braze/managers/m0;)V", "requestTriggersIfInAppMessageTestPush", "clearStorage", "stopInstance$android_sdk_base_release", "(Z)V", "stopInstance", "clearInstance$android_sdk_base_release", "clearInstance", "shouldRequestFrameworkListenToNetworkUpdates", "Z", "getShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release", "setShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release", "getShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release$annotations", "sdkEnablementProvider", "Lcom/braze/storage/v2;", "getSdkEnablementProvider$android_sdk_base_release", "()Lcom/braze/storage/v2;", "setSdkEnablementProvider$android_sdk_base_release", "(Lcom/braze/storage/v2;)V", "getSdkEnablementProvider$android_sdk_base_release$annotations", "delayedInitializationProvider", "Lcom/braze/storage/t0;", "()Lcom/braze/storage/t0;", "setDelayedInitializationProvider$android_sdk_base_release", "(Lcom/braze/storage/t0;)V", "getDelayedInitializationProvider$android_sdk_base_release$annotations", "Lcom/braze/IBrazeNotificationFactory;", "customBrazeNotificationFactory", "Lcom/braze/IBrazeNotificationFactory;", "getCustomBrazeNotificationFactory", "()Lcom/braze/IBrazeNotificationFactory;", "setCustomBrazeNotificationFactory", "(Lcom/braze/IBrazeNotificationFactory;)V", "getCustomBrazeNotificationFactory$annotations", "Lcom/braze/managers/n0;", "deviceDataProvider", "Lcom/braze/managers/n0;", "getDeviceDataProvider$android_sdk_base_release", "()Lcom/braze/managers/n0;", "setDeviceDataProvider$android_sdk_base_release", "(Lcom/braze/managers/n0;)V", "getDeviceDataProvider$android_sdk_base_release$annotations", "Lcom/braze/events/e;", "staticExternalIEventMessenger", "Lcom/braze/events/e;", "getStaticExternalIEventMessenger$android_sdk_base_release", "()Lcom/braze/events/e;", "setStaticExternalIEventMessenger$android_sdk_base_release", "(Lcom/braze/events/e;)V", "getStaticExternalIEventMessenger$android_sdk_base_release$annotations", "isOffline", "getOutboundNetworkRequestsOffline", "setOutboundNetworkRequestsOffline", "getOutboundNetworkRequestsOffline$annotations", "outboundNetworkRequestsOffline", "isDisabled", "isDisabled$annotations", "isDelayedInitializationEnabled", "isDelayedInitializationEnabled$annotations", "isSdkDisabledOrDelayed", "isSdkDisabledOrDelayed$annotations", "Ljava/util/concurrent/locks/ReentrantLock;", "brazeClassLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "KNOWN_APP_CRAWLER_DEVICE_MODELS", "Ljava/util/Set;", "NECESSARY_BRAZE_SDK_PERMISSIONS", "instance", "Lcom/braze/Braze;", "endpointProviderLock", "Lcom/braze/IBrazeEndpointProvider;", "shouldMockNetworkRequestsAndDropEvents", "areOutboundNetworkRequestsOffline", "", "pendingConfigurations", "Ljava/util/List;", "clearConfigSentinel", "Lcom/braze/configuration/BrazeConfig;", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDelayedInitializationEnabled_$lambda$5() {
            return "DelayedInitializationProvider was null. Returning delayed initialization as disabled.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDelayedInitializationEnabled_$lambda$6() {
            return "Delayed initialization mode is enabled. Actions will not be performed on the SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDisabled_$lambda$2() {
            return "SDK enablement provider was null. Returning SDK as enabled.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDisabled_$lambda$3() {
            return "API key not present. Actions will not be performed on the SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDisabled_$lambda$4() {
            return "SDK is disabled. Actions will not be performed on the SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _set_outboundNetworkRequestsOffline_$lambda$0(boolean z) {
            return "Braze SDK outbound network requests are now ".concat(z ? "disabled" : "enabled");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String addSdkMetadata$lambda$20$lambda$19(EnumSet enumSet) {
            return "Failed to add SDK Metadata of: " + enumSet;
        }

        private final void clearDataStoreData(Context context) {
            try {
                DataStoreProvider.INSTANCE.shutdownAllDataStores(context);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String clearDataStoreData$lambda$41;
                        clearDataStoreData$lambda$41 = Braze.Companion.clearDataStoreData$lambda$41();
                        return clearDataStoreData$lambda$41;
                    }
                }, 4, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String clearDataStoreData$lambda$41() {
            return "Failed to delete DataStore data for the Braze SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String clearInstance$lambda$55$lambda$53() {
            return "Clearing Braze instance";
        }

        private final void clearSharedPreferencesData(Context context) {
            File[] listFiles;
            try {
                File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles(new FilenameFilter() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda40
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str) {
                        boolean clearSharedPreferencesData$lambda$37;
                        clearSharedPreferencesData$lambda$37 = Braze.Companion.clearSharedPreferencesData$lambda$37(file2, str);
                        return clearSharedPreferencesData$lambda$37;
                    }
                })) != null) {
                    for (final File file2 : listFiles) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda41
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String clearSharedPreferencesData$lambda$39$lambda$38;
                                clearSharedPreferencesData$lambda$39$lambda$38 = Braze.Companion.clearSharedPreferencesData$lambda$39$lambda$38(file2);
                                return clearSharedPreferencesData$lambda$39$lambda$38;
                            }
                        }, 6, (Object) null);
                        Intrinsics.checkNotNull(file2);
                        BrazeFileUtils.deleteSharedPreferencesFile(context, file2);
                    }
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String clearSharedPreferencesData$lambda$40;
                        clearSharedPreferencesData$lambda$40 = Braze.Companion.clearSharedPreferencesData$lambda$40();
                        return clearSharedPreferencesData$lambda$40;
                    }
                }, 4, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean clearSharedPreferencesData$lambda$37(File file, String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (!StringsKt.startsWith$default(name, DataStoreProvider.PERSISTENT_DATASTORE_PREFIX, false, 2, (Object) null)) {
                if (StringsKt.startsWith$default(name, "com.appboy", false, 2, (Object) null) && !Intrinsics.areEqual(name, "com.appboy.override.configuration.cache")) {
                    return true;
                }
                if (StringsKt.startsWith$default(name, "com.braze", false, 2, (Object) null) && !Intrinsics.areEqual(name, "com.braze.override.configuration.cache")) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String clearSharedPreferencesData$lambda$39$lambda$38(File file) {
            return "Deleting shared prefs file at: " + file.getAbsolutePath();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String clearSharedPreferencesData$lambda$40() {
            return "Failed to delete shared preference data for the Braze SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String configure$lambda$15(BrazeConfig brazeConfig) {
            return "Braze.configure() called with configuration: " + brazeConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String configure$lambda$18$lambda$16() {
            return "Braze.configure() cannot be called while the singleton is still live.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String configure$lambda$18$lambda$17() {
            return "Braze.configure() called with a null config; Clearing all configuration values.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableDelayedInitialization$lambda$30() {
            return "Disabling delayed initialization.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableDelayedInitialization$lambda$31() {
            return "Enabling all network requests";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableSdk$lambda$25() {
            return "Stopping the SDK instance.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableSdk$lambda$26() {
            return "Disabling all network requests";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableSdk$lambda$27() {
            return "disableSdk has finished";
        }

        public static /* synthetic */ void enableDelayedInitialization$default(Companion companion, Context context, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior, int i, Object obj) {
            if ((i & 2) != 0) {
                delayedInitializationAnalyticsBehavior = DelayedInitializationAnalyticsBehavior.QUEUE;
            }
            companion.enableDelayedInitialization(context, delayedInitializationAnalyticsBehavior);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableDelayedInitialization$lambda$32() {
            return "Enabling delayed initialization.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableDelayedInitialization$lambda$33() {
            return "Stopping the SDK instance.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableDelayedInitialization$lambda$34() {
            return "Disabling all network requests";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableDelayedInitialization$lambda$35(DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
            return "Failed to enable delayed initialization for behavior " + delayedInitializationAnalyticsBehavior;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableMockNetworkRequestsAndDropEventsMode$lambda$23$lambda$21() {
            return "Braze network requests already being mocked. Note that events dispatched in this mode are dropped.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableMockNetworkRequestsAndDropEventsMode$lambda$23$lambda$22() {
            return "Braze network requests will be mocked. Events dispatchedin this mode will be dropped.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableMockNetworkRequestsAndDropEventsMode$lambda$24() {
            return "Attempt to enable mocking Braze network requests had no effect since getInstance() has already been called.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableSdk$lambda$28() {
            return "Setting SDK to enabled.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableSdk$lambda$29() {
            return "Enabling all network requests";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getApiEndpoint$lambda$14$lambda$13$lambda$12() {
            return "Caught exception trying to get a Braze API endpoint from the BrazeEndpointProvider. Using the original URI";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConfiguredApiKey$lambda$9() {
            return "Caught exception while retrieving API key.";
        }

        @JvmStatic
        public static /* synthetic */ void getCustomBrazeNotificationFactory$annotations() {
        }

        public static /* synthetic */ void getDelayedInitializationProvider$android_sdk_base_release$annotations() {
        }

        public static /* synthetic */ void getDeviceDataProvider$android_sdk_base_release$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInstance$lambda$8$lambda$7() {
            return "Created external messenger " + Braze.INSTANCE.getStaticExternalIEventMessenger$android_sdk_base_release();
        }

        @JvmStatic
        public static /* synthetic */ void getOutboundNetworkRequestsOffline$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final v2 getSdkEnablementProvider(Context context) {
            v2 sdkEnablementProvider$android_sdk_base_release = getSdkEnablementProvider$android_sdk_base_release();
            if (sdkEnablementProvider$android_sdk_base_release != null) {
                return sdkEnablementProvider$android_sdk_base_release;
            }
            v2 v2Var = new v2(context);
            setSdkEnablementProvider$android_sdk_base_release(v2Var);
            return v2Var;
        }

        public static /* synthetic */ void getSdkEnablementProvider$android_sdk_base_release$annotations() {
        }

        public static /* synthetic */ void getShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release$annotations() {
        }

        public static /* synthetic */ void getStaticExternalIEventMessenger$android_sdk_base_release$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void isDelayedInitializationEnabled$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void isDisabled$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void isSdkDisabledOrDelayed$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String requestTriggersIfInAppMessageTestPush$lambda$47() {
            return "Push contained key for fetching test triggers, fetching triggers.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Uri setConfiguredCustomEndpoint$lambda$43$lambda$42(String str, Uri brazeEndpoint) {
            String authority;
            Intrinsics.checkNotNullParameter(brazeEndpoint, "brazeEndpoint");
            Uri parse = str != null ? Uri.parse(str) : null;
            String scheme = parse != null ? parse.getScheme() : null;
            boolean z = scheme == null || StringsKt.isBlank(scheme) || (authority = parse.getAuthority()) == null || StringsKt.isBlank(authority);
            Uri.Builder builder = new Uri.Builder();
            if (z) {
                builder.scheme(brazeEndpoint.getScheme());
            } else if (parse.getScheme() != null) {
                builder.scheme(parse.getScheme());
            } else {
                builder.scheme(brazeEndpoint.getScheme());
            }
            if (z) {
                builder.encodedAuthority(str);
            } else if (parse.getEncodedAuthority() != null) {
                builder.encodedAuthority(parse.getEncodedAuthority());
            } else {
                builder.encodedAuthority(brazeEndpoint.getEncodedAuthority());
            }
            if (z) {
                builder.path(brazeEndpoint.getPath());
            } else if (parse.getPath() != null) {
                builder.path(parse.getPath() + brazeEndpoint.getPath());
            } else {
                builder.path(brazeEndpoint.getPath());
            }
            return builder.build();
        }

        private final boolean shouldAllowSingletonInitialization() {
            Braze braze = Braze.instance;
            if (braze == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String shouldAllowSingletonInitialization$lambda$44;
                        shouldAllowSingletonInitialization$lambda$44 = Braze.Companion.shouldAllowSingletonInitialization$lambda$44();
                        return shouldAllowSingletonInitialization$lambda$44;
                    }
                }, 6, (Object) null);
                return true;
            }
            if (braze.isInstanceStopped) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String shouldAllowSingletonInitialization$lambda$45;
                        shouldAllowSingletonInitialization$lambda$45 = Braze.Companion.shouldAllowSingletonInitialization$lambda$45();
                        return shouldAllowSingletonInitialization$lambda$45;
                    }
                }, 7, (Object) null);
                return true;
            }
            if (!Intrinsics.areEqual(Boolean.FALSE, braze.getIsApiKeyPresent())) {
                return false;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String shouldAllowSingletonInitialization$lambda$46;
                    shouldAllowSingletonInitialization$lambda$46 = Braze.Companion.shouldAllowSingletonInitialization$lambda$46();
                    return shouldAllowSingletonInitialization$lambda$46;
                }
            }, 7, (Object) null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String shouldAllowSingletonInitialization$lambda$44() {
            return "The instance is null. Allowing instance initialization";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String shouldAllowSingletonInitialization$lambda$45() {
            return "The instance was stopped. Allowing instance initialization";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String shouldAllowSingletonInitialization$lambda$46() {
            return "No API key was found previously. Allowing instance initialization";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$48() {
            return "Shutting down all queued work on the Braze SDK";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$51$lambda$49() {
            return "Sending sdk data wipe event to external subscribers";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$51$lambda$50() {
            return "Shutting down the singleton work queue";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$52() {
            return "Failed to shutdown queued work on the Braze SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String wipeData$lambda$36() {
            return "Failed to delete data from the internal storage cache.";
        }

        @JvmStatic
        public final void addSdkMetadata(Context context, final EnumSet<BrazeSdkMetadata> sdkMetadata) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sdkMetadata, "sdkMetadata");
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                try {
                    Braze.pendingConfigurations.add(new BrazeConfig.Builder().setSdkMetadata(sdkMetadata).build());
                    Braze braze = Braze.instance;
                    if (braze != null) {
                        braze.applyPendingRuntimeConfiguration$android_sdk_base_release();
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String addSdkMetadata$lambda$20$lambda$19;
                            addSdkMetadata$lambda$20$lambda$19 = Braze.Companion.addSdkMetadata$lambda$20$lambda$19(sdkMetadata);
                            return addSdkMetadata$lambda$20$lambda$19;
                        }
                    }, 4, (Object) null);
                    Unit unit2 = Unit.INSTANCE;
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @JvmStatic
        public final void clearEndpointProvider() {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.endpointProvider = null;
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void clearInstance$android_sdk_base_release() {
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze braze = Braze.instance;
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                Companion companion = Braze.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String clearInstance$lambda$55$lambda$53;
                        clearInstance$lambda$55$lambda$53 = Braze.Companion.clearInstance$lambda$55$lambda$53();
                        return clearInstance$lambda$55$lambda$53;
                    }
                }, 6, (Object) null);
                BrazeCoroutineScope.cancelChildren();
                if (braze != null && braze.udm != null) {
                    ((j1) braze.getUdm$android_sdk_base_release()).r.i();
                }
                Braze.instance = null;
                Braze.shouldMockNetworkRequestsAndDropEvents = false;
                Braze.areOutboundNetworkRequestsOffline = false;
                companion.setSdkEnablementProvider$android_sdk_base_release(null);
                Braze.endpointProvider = null;
                companion.setShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release(true);
                companion.setStaticExternalIEventMessenger$android_sdk_base_release(null);
                companion.setDelayedInitializationProvider$android_sdk_base_release(null);
                com.braze.managers.g gVar = com.braze.managers.j.h;
                com.braze.managers.g.c();
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        @JvmStatic
        public final boolean configure(Context context, final BrazeConfig config) {
            Intrinsics.checkNotNullParameter(context, "context");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.I;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String configure$lambda$15;
                    configure$lambda$15 = Braze.Companion.configure$lambda$15(BrazeConfig.this);
                    return configure$lambda$15;
                }
            }, 6, (Object) null);
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze braze = Braze.instance;
                if (braze != null && !braze.isInstanceStopped && Intrinsics.areEqual(Boolean.TRUE, braze.getIsApiKeyPresent())) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) Braze.INSTANCE, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String configure$lambda$18$lambda$16;
                            configure$lambda$18$lambda$16 = Braze.Companion.configure$lambda$18$lambda$16();
                            return configure$lambda$18$lambda$16;
                        }
                    }, 6, (Object) null);
                    reentrantLock.unlock();
                    return false;
                }
                if (config != null) {
                    Braze.pendingConfigurations.add(config);
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) Braze.INSTANCE, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String configure$lambda$18$lambda$17;
                            configure$lambda$18$lambda$17 = Braze.Companion.configure$lambda$18$lambda$17();
                            return configure$lambda$18$lambda$17;
                        }
                    }, 6, (Object) null);
                    Braze.pendingConfigurations.add(Braze.clearConfigSentinel);
                }
                reentrantLock.unlock();
                return true;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @JvmStatic
        public final void disableDelayedInitialization(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.W;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String disableDelayedInitialization$lambda$30;
                    disableDelayedInitialization$lambda$30 = Braze.Companion.disableDelayedInitialization$lambda$30();
                    return disableDelayedInitialization$lambda$30;
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String disableDelayedInitialization$lambda$31;
                    disableDelayedInitialization$lambda$31 = Braze.Companion.disableDelayedInitialization$lambda$31();
                    return disableDelayedInitialization$lambda$31;
                }
            }, 6, (Object) null);
            setOutboundNetworkRequestsOffline(false);
            t0 delayedInitializationProvider$android_sdk_base_release = getDelayedInitializationProvider$android_sdk_base_release(context);
            delayedInitializationProvider$android_sdk_base_release.b(false);
            delayedInitializationProvider$android_sdk_base_release.f754a.writeData(DataStoreKey.DELAYED_INIT_SET_DURING_RUNTIME_FLAG, Boolean.TRUE);
            Braze braze = Braze.instance;
            if (braze != null) {
                braze.safeCallFlushDelayedInitPushAnalyticsQueue();
            }
        }

        @JvmStatic
        public final void disableSdk(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            getSdkEnablementProvider(context).b(true);
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.W;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String disableSdk$lambda$25;
                    disableSdk$lambda$25 = Braze.Companion.disableSdk$lambda$25();
                    return disableSdk$lambda$25;
                }
            }, 6, (Object) null);
            stopInstance$android_sdk_base_release(false);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String disableSdk$lambda$26;
                    disableSdk$lambda$26 = Braze.Companion.disableSdk$lambda$26();
                    return disableSdk$lambda$26;
                }
            }, 6, (Object) null);
            setOutboundNetworkRequestsOffline(true);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String disableSdk$lambda$27;
                    disableSdk$lambda$27 = Braze.Companion.disableSdk$lambda$27();
                    return disableSdk$lambda$27;
                }
            }, 6, (Object) null);
        }

        @JvmStatic
        public final void enableDelayedInitialization(Context context, final DelayedInitializationAnalyticsBehavior analyticsBehavior) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(analyticsBehavior, "analyticsBehavior");
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.W;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String enableDelayedInitialization$lambda$32;
                        enableDelayedInitialization$lambda$32 = Braze.Companion.enableDelayedInitialization$lambda$32();
                        return enableDelayedInitialization$lambda$32;
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String enableDelayedInitialization$lambda$33;
                        enableDelayedInitialization$lambda$33 = Braze.Companion.enableDelayedInitialization$lambda$33();
                        return enableDelayedInitialization$lambda$33;
                    }
                }, 6, (Object) null);
                stopInstance$android_sdk_base_release(false);
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String enableDelayedInitialization$lambda$34;
                        enableDelayedInitialization$lambda$34 = Braze.Companion.enableDelayedInitialization$lambda$34();
                        return enableDelayedInitialization$lambda$34;
                    }
                }, 6, (Object) null);
                setOutboundNetworkRequestsOffline(true);
                getDelayedInitializationProvider$android_sdk_base_release(context).b(analyticsBehavior);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String enableDelayedInitialization$lambda$35;
                        enableDelayedInitialization$lambda$35 = Braze.Companion.enableDelayedInitialization$lambda$35(DelayedInitializationAnalyticsBehavior.this);
                        return enableDelayedInitialization$lambda$35;
                    }
                }, 4, (Object) null);
            }
        }

        @JvmStatic
        public final boolean enableMockNetworkRequestsAndDropEventsMode() {
            if (Braze.instance == null) {
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    if (Braze.instance == null) {
                        if (Braze.shouldMockNetworkRequestsAndDropEvents) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda37
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String enableMockNetworkRequestsAndDropEventsMode$lambda$23$lambda$21;
                                    enableMockNetworkRequestsAndDropEventsMode$lambda$23$lambda$21 = Braze.Companion.enableMockNetworkRequestsAndDropEventsMode$lambda$23$lambda$21();
                                    return enableMockNetworkRequestsAndDropEventsMode$lambda$23$lambda$21;
                                }
                            }, 6, (Object) null);
                        } else {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda38
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String enableMockNetworkRequestsAndDropEventsMode$lambda$23$lambda$22;
                                    enableMockNetworkRequestsAndDropEventsMode$lambda$23$lambda$22 = Braze.Companion.enableMockNetworkRequestsAndDropEventsMode$lambda$23$lambda$22();
                                    return enableMockNetworkRequestsAndDropEventsMode$lambda$23$lambda$22;
                                }
                            }, 6, (Object) null);
                            Braze.shouldMockNetworkRequestsAndDropEvents = true;
                        }
                        return true;
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String enableMockNetworkRequestsAndDropEventsMode$lambda$24;
                    enableMockNetworkRequestsAndDropEventsMode$lambda$24 = Braze.Companion.enableMockNetworkRequestsAndDropEventsMode$lambda$24();
                    return enableMockNetworkRequestsAndDropEventsMode$lambda$24;
                }
            }, 6, (Object) null);
            return false;
        }

        @JvmStatic
        public final void enableSdk(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.W;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String enableSdk$lambda$28;
                    enableSdk$lambda$28 = Braze.Companion.enableSdk$lambda$28();
                    return enableSdk$lambda$28;
                }
            }, 6, (Object) null);
            getSdkEnablementProvider(context).b(false);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String enableSdk$lambda$29;
                    enableSdk$lambda$29 = Braze.Companion.enableSdk$lambda$29();
                    return enableSdk$lambda$29;
                }
            }, 6, (Object) null);
            setOutboundNetworkRequestsOffline(false);
        }

        @JvmStatic
        public final Uri getApiEndpoint(Uri brazeEndpoint) {
            Intrinsics.checkNotNullParameter(brazeEndpoint, "brazeEndpoint");
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                IBrazeEndpointProvider iBrazeEndpointProvider = Braze.endpointProvider;
                if (iBrazeEndpointProvider != null) {
                    try {
                        Uri apiEndpoint = iBrazeEndpointProvider.getApiEndpoint(brazeEndpoint);
                        if (apiEndpoint != null) {
                            return apiEndpoint;
                        }
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda24
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String apiEndpoint$lambda$14$lambda$13$lambda$12;
                                apiEndpoint$lambda$14$lambda$13$lambda$12 = Braze.Companion.getApiEndpoint$lambda$14$lambda$13$lambda$12();
                                return apiEndpoint$lambda$14$lambda$13$lambda$12;
                            }
                        }, 4, (Object) null);
                    }
                }
                return brazeEndpoint;
            } finally {
                reentrantLock.unlock();
            }
        }

        @JvmStatic
        public final String getConfiguredApiKey(BrazeConfigurationProvider configurationProvider) {
            Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
            try {
                return configurationProvider.getBrazeApiKey().f639a;
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String configuredApiKey$lambda$9;
                        configuredApiKey$lambda$9 = Braze.Companion.getConfiguredApiKey$lambda$9();
                        return configuredApiKey$lambda$9;
                    }
                }, 4, (Object) null);
                return null;
            }
        }

        public final IBrazeNotificationFactory getCustomBrazeNotificationFactory() {
            return Braze.customBrazeNotificationFactory;
        }

        public final t0 getDelayedInitializationProvider$android_sdk_base_release() {
            return Braze.delayedInitializationProvider;
        }

        public final com.braze.managers.n0 getDeviceDataProvider$android_sdk_base_release() {
            return Braze.deviceDataProvider;
        }

        @JvmStatic
        public final Braze getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (shouldAllowSingletonInitialization()) {
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    Companion companion = Braze.INSTANCE;
                    if (companion.shouldAllowSingletonInitialization()) {
                        if (companion.getStaticExternalIEventMessenger$android_sdk_base_release() == null) {
                            companion.setStaticExternalIEventMessenger$android_sdk_base_release(new com.braze.events.d(new v2(context), new t0(context), false));
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) companion, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String instance$lambda$8$lambda$7;
                                    instance$lambda$8$lambda$7 = Braze.Companion.getInstance$lambda$8$lambda$7();
                                    return instance$lambda$8$lambda$7;
                                }
                            }, 6, (Object) null);
                        }
                        Braze braze = new Braze(context);
                        braze.isInstanceStopped = false;
                        Braze.instance = braze;
                        return braze;
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            }
            Braze braze2 = Braze.instance;
            Intrinsics.checkNotNull(braze2, "null cannot be cast to non-null type com.braze.Braze");
            return braze2;
        }

        public final boolean getOutboundNetworkRequestsOffline() {
            return Braze.areOutboundNetworkRequestsOffline;
        }

        public final v2 getSdkEnablementProvider$android_sdk_base_release() {
            return Braze.sdkEnablementProvider;
        }

        public final boolean getShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release() {
            return Braze.shouldRequestFrameworkListenToNetworkUpdates;
        }

        public final com.braze.events.e getStaticExternalIEventMessenger$android_sdk_base_release() {
            return Braze.staticExternalIEventMessenger;
        }

        public final boolean isDelayedInitializationEnabled() {
            t0 delayedInitializationProvider$android_sdk_base_release = getDelayedInitializationProvider$android_sdk_base_release();
            if (delayedInitializationProvider$android_sdk_base_release == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _get_isDelayedInitializationEnabled_$lambda$5;
                        _get_isDelayedInitializationEnabled_$lambda$5 = Braze.Companion._get_isDelayedInitializationEnabled_$lambda$5();
                        return _get_isDelayedInitializationEnabled_$lambda$5;
                    }
                }, 7, (Object) null);
                return false;
            }
            boolean c = delayedInitializationProvider$android_sdk_base_release.c();
            if (c) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _get_isDelayedInitializationEnabled_$lambda$6;
                        _get_isDelayedInitializationEnabled_$lambda$6 = Braze.Companion._get_isDelayedInitializationEnabled_$lambda$6();
                        return _get_isDelayedInitializationEnabled_$lambda$6;
                    }
                }, 6, (Object) null);
            }
            return c;
        }

        public final boolean isDisabled() {
            v2 sdkEnablementProvider$android_sdk_base_release = getSdkEnablementProvider$android_sdk_base_release();
            if (sdkEnablementProvider$android_sdk_base_release == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _get_isDisabled_$lambda$2;
                        _get_isDisabled_$lambda$2 = Braze.Companion._get_isDisabled_$lambda$2();
                        return _get_isDisabled_$lambda$2;
                    }
                }, 7, (Object) null);
                return false;
            }
            Braze braze = Braze.instance;
            if (braze != null && Intrinsics.areEqual(Boolean.FALSE, braze.getIsApiKeyPresent())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _get_isDisabled_$lambda$3;
                        _get_isDisabled_$lambda$3 = Braze.Companion._get_isDisabled_$lambda$3();
                        return _get_isDisabled_$lambda$3;
                    }
                }, 6, (Object) null);
                return true;
            }
            boolean a2 = sdkEnablementProvider$android_sdk_base_release.a();
            if (a2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _get_isDisabled_$lambda$4;
                        _get_isDisabled_$lambda$4 = Braze.Companion._get_isDisabled_$lambda$4();
                        return _get_isDisabled_$lambda$4;
                    }
                }, 6, (Object) null);
            }
            return a2;
        }

        public final boolean isSdkDisabledOrDelayed() {
            return isDisabled() || isDelayedInitializationEnabled();
        }

        public final void requestTriggersIfInAppMessageTestPush$android_sdk_base_release(Intent intent, com.braze.managers.m0 brazeManager) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
            String stringExtra = intent.getStringExtra(Constants.BRAZE_PUSH_FETCH_TEST_TRIGGERS_KEY);
            if (stringExtra == null || !Intrinsics.areEqual(stringExtra, "true")) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestTriggersIfInAppMessageTestPush$lambda$47;
                    requestTriggersIfInAppMessageTestPush$lambda$47 = Braze.Companion.requestTriggersIfInAppMessageTestPush$lambda$47();
                    return requestTriggersIfInAppMessageTestPush$lambda$47;
                }
            }, 6, (Object) null);
            com.braze.models.outgoing.j jVar = new com.braze.models.outgoing.j();
            jVar.b = Boolean.TRUE;
            ((r) brazeManager).a(jVar);
        }

        public final void setConfiguredCustomEndpoint$android_sdk_base_release(final String configuredCustomEndpoint) {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.INSTANCE.setEndpointProvider(new IBrazeEndpointProvider() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda36
                    @Override // com.braze.IBrazeEndpointProvider
                    public final Uri getApiEndpoint(Uri uri) {
                        Uri configuredCustomEndpoint$lambda$43$lambda$42;
                        configuredCustomEndpoint$lambda$43$lambda$42 = Braze.Companion.setConfiguredCustomEndpoint$lambda$43$lambda$42(configuredCustomEndpoint, uri);
                        return configuredCustomEndpoint$lambda$43$lambda$42;
                    }
                });
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void setCustomBrazeNotificationFactory(IBrazeNotificationFactory iBrazeNotificationFactory) {
            Braze.customBrazeNotificationFactory = iBrazeNotificationFactory;
        }

        public final void setDelayedInitializationProvider$android_sdk_base_release(t0 t0Var) {
            Braze.delayedInitializationProvider = t0Var;
        }

        public final void setDeviceDataProvider$android_sdk_base_release(com.braze.managers.n0 n0Var) {
            Braze.deviceDataProvider = n0Var;
        }

        @JvmStatic
        public final void setEndpointProvider(IBrazeEndpointProvider endpointProvider) {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.endpointProvider = endpointProvider;
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void setOutboundNetworkRequestsOffline(final boolean z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _set_outboundNetworkRequestsOffline_$lambda$0;
                    _set_outboundNetworkRequestsOffline_$lambda$0 = Braze.Companion._set_outboundNetworkRequestsOffline_$lambda$0(z);
                    return _set_outboundNetworkRequestsOffline_$lambda$0;
                }
            }, 6, (Object) null);
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze.areOutboundNetworkRequestsOffline = z;
                Braze braze = Braze.instance;
                if (braze != null) {
                    braze.setSyncPolicyOfflineStatus(z);
                    Unit unit = Unit.INSTANCE;
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void setSdkEnablementProvider$android_sdk_base_release(v2 v2Var) {
            Braze.sdkEnablementProvider = v2Var;
        }

        public final void setShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release(boolean z) {
            Braze.shouldRequestFrameworkListenToNetworkUpdates = z;
        }

        public final void setStaticExternalIEventMessenger$android_sdk_base_release(com.braze.events.e eVar) {
            Braze.staticExternalIEventMessenger = eVar;
        }

        public final void stopInstance$android_sdk_base_release(boolean clearStorage) {
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String stopInstance$lambda$48;
                        stopInstance$lambda$48 = Braze.Companion.stopInstance$lambda$48();
                        return stopInstance$lambda$48;
                    }
                }, 6, (Object) null);
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    BrazeCoroutineScope.cancelChildren();
                    Braze braze = Braze.instance;
                    if (braze != null) {
                        Companion companion = Braze.INSTANCE;
                        BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String stopInstance$lambda$51$lambda$49;
                                stopInstance$lambda$51$lambda$49 = Braze.Companion.stopInstance$lambda$51$lambda$49();
                                return stopInstance$lambda$51$lambda$49;
                            }
                        }, 6, (Object) null);
                        ((com.braze.events.d) braze.getExternalIEventMessenger()).b(new SdkDataWipeEvent(), SdkDataWipeEvent.class);
                        BrazeLogger.brazelog$default(brazeLogger, (Object) companion, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String stopInstance$lambda$51$lambda$50;
                                stopInstance$lambda$51$lambda$50 = Braze.Companion.stopInstance$lambda$51$lambda$50();
                                return stopInstance$lambda$51$lambda$50;
                            }
                        }, 7, (Object) null);
                        com.braze.coroutine.f.f492a.a();
                        if (braze.udm != null) {
                            if (clearStorage) {
                                com.braze.storage.p pVar = ((j1) braze.getUdm$android_sdk_base_release()).D;
                                pVar.i.clear();
                                pVar.h.clear();
                                com.braze.managers.k0 k0Var = ((j1) braze.getUdm$android_sdk_base_release()).B;
                                k0Var.getClass();
                                k0Var.f = CollectionsKt.emptyList();
                                com.braze.managers.j jVar = ((j1) braze.getUdm$android_sdk_base_release()).C;
                                jVar.getClass();
                                jVar.f = CollectionsKt.emptyList();
                            }
                            com.braze.dispatch.f fVar = ((j1) braze.getUdm$android_sdk_base_release()).r;
                            synchronized (fVar) {
                                fVar.l = true;
                                fVar.b();
                                fVar.f();
                            }
                            com.braze.managers.h0 h0Var = ((j1) braze.getUdm$android_sdk_base_release()).t;
                            h0Var.b = true;
                            h0Var.f586a.c = true;
                            ((j1) braze.getUdm$android_sdk_base_release()).z.unregisterGeofences();
                        }
                        braze.getImageLoader().shutdown();
                        braze.isInstanceStopped = true;
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String stopInstance$lambda$52;
                        stopInstance$lambda$52 = Braze.Companion.stopInstance$lambda$52();
                        return stopInstance$lambda$52;
                    }
                }, 4, (Object) null);
            }
        }

        @JvmStatic
        public final void wipeData(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            stopInstance$android_sdk_base_release(true);
            try {
                com.braze.triggers.managers.b.e.a(context);
                DefaultBrazeImageLoader.Companion.a(context);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String wipeData$lambda$36;
                        wipeData$lambda$36 = Braze.Companion.wipeData$lambda$36();
                        return wipeData$lambda$36;
                    }
                }, 4, (Object) null);
            }
            clearSharedPreferencesData(context);
            clearDataStoreData(context);
        }

        private Companion() {
        }

        public final t0 getDelayedInitializationProvider$android_sdk_base_release(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            t0 delayedInitializationProvider$android_sdk_base_release = getDelayedInitializationProvider$android_sdk_base_release();
            if (delayedInitializationProvider$android_sdk_base_release != null) {
                return delayedInitializationProvider$android_sdk_base_release;
            }
            t0 t0Var = new t0(context);
            setDelayedInitializationProvider$android_sdk_base_release(t0Var);
            return t0Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Braze(final Context context) {
        BrazeLogger brazeLogger;
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.imageLoader = new DefaultBrazeImageLoader(applicationContext);
        final long nanoTime = System.nanoTime();
        BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger2, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _init_$lambda$0;
                _init_$lambda$0 = Braze._init_$lambda$0();
                return _init_$lambda$0;
            }
        }, 7, (Object) null);
        this.applicationContext = context.getApplicationContext();
        final String str = Build.MODEL;
        if (str != null) {
            Set<String> set = KNOWN_APP_CRAWLER_DEVICE_MODELS;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (set.contains(lowerCase)) {
                BrazeLogger.brazelog$default(brazeLogger2, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda111
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.lambda$2$lambda$1(str);
                    }
                }, 6, (Object) null);
                brazeLogger = brazeLogger2;
                INSTANCE.enableMockNetworkRequestsAndDropEventsMode();
                com.braze.events.e eVar = staticExternalIEventMessenger;
                this.externalIEventMessenger = eVar == null ? new com.braze.events.d(new v2(this.applicationContext), new t0(this.applicationContext), false) : eVar;
                run$android_sdk_base_release(new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda129
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _init_$lambda$3;
                        _init_$lambda$3 = Braze._init_$lambda$3();
                        return _init_$lambda$3;
                    }
                }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda140
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit _init_$lambda$27;
                        _init_$lambda$27 = Braze._init_$lambda$27(Braze.this, context);
                        return _init_$lambda$27;
                    }
                });
                final long nanoTime2 = System.nanoTime();
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda151
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _init_$lambda$28;
                        _init_$lambda$28 = Braze._init_$lambda$28(nanoTime2, nanoTime);
                        return _init_$lambda$28;
                    }
                }, 7, (Object) null);
            }
        }
        brazeLogger = brazeLogger2;
        com.braze.events.e eVar2 = staticExternalIEventMessenger;
        this.externalIEventMessenger = eVar2 == null ? new com.braze.events.d(new v2(this.applicationContext), new t0(this.applicationContext), false) : eVar2;
        run$android_sdk_base_release(new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda129
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _init_$lambda$3;
                _init_$lambda$3 = Braze._init_$lambda$3();
                return _init_$lambda$3;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda140
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit _init_$lambda$27;
                _init_$lambda$27 = Braze._init_$lambda$27(Braze.this, context);
                return _init_$lambda$27;
            }
        });
        final long nanoTime22 = System.nanoTime();
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda151
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _init_$lambda$28;
                _init_$lambda$28 = Braze._init_$lambda$28(nanoTime22, nanoTime);
                return _init_$lambda$28;
            }
        }, 7, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_cachedContentCardsUpdatedEvent_$lambda$37() {
        return "Failed to retrieve the cached ContentCardsUpdatedEvent.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_currentUser_$lambda$30() {
        return "Failed to retrieve the current user.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_deviceId_$lambda$29() {
        return "Failed to retrieve the device id.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_registeredPushToken_$lambda$31() {
        return "Failed to get the registered push registration token.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0() {
        return "Braze SDK Initializing";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$27(Braze braze, Context context) {
        Braze braze2;
        com.braze.configuration.e eVar;
        Braze braze3;
        braze.applyPendingRuntimeConfiguration$android_sdk_base_release();
        braze.setConfigurationProvider$android_sdk_base_release(new BrazeConfigurationProvider(braze.applicationContext));
        Companion companion = INSTANCE;
        String configuredApiKey = companion.getConfiguredApiKey(braze.getConfigurationProvider$android_sdk_base_release());
        braze.isApiKeyPresent = Boolean.valueOf(!(configuredApiKey == null || StringsKt.isBlank(configuredApiKey)));
        t0 delayedInitializationProvider$android_sdk_base_release = companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext);
        BrazeConfigurationProvider configurationProvider = braze.getConfigurationProvider$android_sdk_base_release();
        delayedInitializationProvider$android_sdk_base_release.getClass();
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        s0 s0Var = delayedInitializationProvider$android_sdk_base_release.f754a;
        DataStoreKey dataStoreKey = DataStoreKey.DELAYED_INIT_SET_DURING_RUNTIME_FLAG;
        Boolean bool = Boolean.FALSE;
        Boolean readBoolean = s0Var.readBoolean(dataStoreKey, bool);
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.areEqual(readBoolean, bool2) && configurationProvider.isDelayedInitializationEnabled()) {
            delayedInitializationProvider$android_sdk_base_release.b(true);
        }
        if (!Intrinsics.areEqual(delayedInitializationProvider$android_sdk_base_release.f754a.readBoolean(dataStoreKey, bool), bool2)) {
            delayedInitializationProvider$android_sdk_base_release.c(configurationProvider.getDelayedInitializationAnalyticsBehavior());
        }
        BrazeLogger.setInitialLogLevelFromConfiguration(braze.getConfigurationProvider$android_sdk_base_release().getLoggerInitialLogLevel());
        BrazeLogger.checkForSystemLogLevelProperty$default(false, 1, null);
        if (companion.getSdkEnablementProvider(context).a() || companion.isDelayedInitializationEnabled()) {
            companion.setOutboundNetworkRequestsOffline(true);
        }
        String str = braze.getConfigurationProvider$android_sdk_base_release().getBrazeApiKey().f639a;
        braze.setPushDeliveryManager$android_sdk_base_release(new v0(braze.applicationContext, str));
        braze.setDeviceIdProvider$android_sdk_base_release(new com.braze.managers.y(braze.applicationContext, str));
        braze.offlineUserStorageProvider = new com.braze.configuration.e(braze.applicationContext);
        braze.setRegistrationDataProvider$android_sdk_base_release(new z0(braze.applicationContext, braze.getConfigurationProvider$android_sdk_base_release()));
        String customEndpoint = braze.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint();
        if (customEndpoint != null && !StringsKt.isBlank(customEndpoint)) {
            if (ValidationUtils.isInvalidCustomEndpoint$android_sdk_base_release(braze.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint())) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.W;
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.lambda$27$lambda$4();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda41
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.lambda$27$lambda$5();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda45
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.lambda$27$lambda$6();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda46
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.lambda$27$lambda$7();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda47
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.lambda$27$lambda$8();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda48
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.lambda$27$lambda$9();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda49
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.lambda$27$lambda$10();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda50
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.lambda$27$lambda$11();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda51
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.lambda$27$lambda$12();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda52
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.lambda$27$lambda$13();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.lambda$27$lambda$14();
                    }
                }, 6, (Object) null);
            }
            companion.setConfiguredCustomEndpoint$android_sdk_base_release(braze.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint());
        }
        try {
            if (braze.getConfigurationProvider$android_sdk_base_release().isFirebaseCloudMessagingRegistrationEnabled()) {
                com.braze.managers.l0 l0Var = new com.braze.managers.l0(context, braze.getRegistrationDataProvider$android_sdk_base_release());
                if (l0Var.a()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda31
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Braze.lambda$27$lambda$15();
                        }
                    }, 6, (Object) null);
                    String firebaseCloudMessagingSenderIdKey = braze.getConfigurationProvider$android_sdk_base_release().getFirebaseCloudMessagingSenderIdKey();
                    if (firebaseCloudMessagingSenderIdKey != null) {
                        l0Var.a(firebaseCloudMessagingSenderIdKey);
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda32
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Braze.lambda$27$lambda$17();
                        }
                    }, 6, (Object) null);
                }
                braze3 = braze;
            } else {
                braze3 = braze;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze3, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.lambda$27$lambda$18();
                    }
                }, 6, (Object) null);
            }
            if (braze3.getConfigurationProvider$android_sdk_base_release().isAdmMessagingRegistrationEnabled()) {
                com.braze.managers.b bVar = com.braze.managers.c.c;
                Context context2 = braze3.applicationContext;
                Intrinsics.checkNotNullParameter(context2, "context");
                if (bVar.a() && bVar.a(context2)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze3, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda35
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Braze.lambda$27$lambda$19();
                        }
                    }, 6, (Object) null);
                    new com.braze.managers.c(braze3.applicationContext, braze3.getRegistrationDataProvider$android_sdk_base_release()).a();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze3, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda36
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Braze.lambda$27$lambda$20();
                        }
                    }, 6, (Object) null);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda37
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.lambda$27$lambda$21();
                    }
                }, 6, (Object) null);
            }
            braze.verifyProperSdkSetup();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Braze.lambda$27$lambda$22();
                }
            }, 4, (Object) null);
        }
        BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority2 = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, priority2, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Braze.lambda$27$lambda$23();
            }
        }, 6, (Object) null);
        try {
            Context context3 = braze.applicationContext;
            com.braze.configuration.e eVar2 = braze.offlineUserStorageProvider;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                eVar = null;
            } else {
                eVar = eVar2;
            }
            braze.setUserSpecificMemberVariablesAndStartDispatch(new j1(context3, eVar, braze.getConfigurationProvider$android_sdk_base_release(), braze.externalIEventMessenger, braze.getDeviceIdProvider$android_sdk_base_release(), braze.getRegistrationDataProvider$android_sdk_base_release(), braze.getPushDeliveryManager$android_sdk_base_release(), shouldMockNetworkRequestsAndDropEvents, areOutboundNetworkRequestsOffline, braze.getDeviceDataProvider(), shouldRequestFrameworkListenToNetworkUpdates));
            BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, priority2, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Braze.lambda$27$lambda$24();
                }
            }, 6, (Object) null);
            braze2 = braze;
        } catch (Exception e2) {
            braze2 = braze;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze2, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda42
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Braze.lambda$27$lambda$25();
                }
            }, 4, (Object) null);
            braze2.publishError(e2);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze2, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Braze.lambda$27$lambda$26();
            }
        }, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$28(long j, long j2) {
        long j3 = j - j2;
        return "Braze SDK loaded in " + TimeUnit.MILLISECONDS.convert(j3, TimeUnit.NANOSECONDS) + " ms / " + j3 + " nanos";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$3() {
        return "Failed to perform initial Braze singleton setup.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$32(String str) {
        return "Failed to set the push token " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _set_registeredPushToken_$lambda$36(Braze braze, final String str) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.I;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda188
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _set_registeredPushToken_$lambda$36$lambda$33;
                _set_registeredPushToken_$lambda$36$lambda$33 = Braze._set_registeredPushToken_$lambda$36$lambda$33(str);
                return _set_registeredPushToken_$lambda$36$lambda$33;
            }
        }, 6, (Object) null);
        if (str == null || StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda190
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _set_registeredPushToken_$lambda$36$lambda$34;
                    _set_registeredPushToken_$lambda$36$lambda$34 = Braze._set_registeredPushToken_$lambda$36$lambda$34();
                    return _set_registeredPushToken_$lambda$36$lambda$34;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(((z0) braze.getRegistrationDataProvider$android_sdk_base_release()).b(), str)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda189
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _set_registeredPushToken_$lambda$36$lambda$35;
                    _set_registeredPushToken_$lambda$36$lambda$35 = Braze._set_registeredPushToken_$lambda$36$lambda$35(str);
                    return _set_registeredPushToken_$lambda$36$lambda$35;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        ((z0) braze.getRegistrationDataProvider$android_sdk_base_release()).a(str);
        com.braze.storage.v0 v0Var = ((j1) braze.getUdm$android_sdk_base_release()).m;
        if (v0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
            v0Var = null;
        }
        v0Var.e();
        braze.requestImmediateDataFlush();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$36$lambda$33(String str) {
        return "Push token registered: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$36$lambda$34() {
        return "Push token must not be null or blank. Not registering for push with Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$36$lambda$35(String str) {
        return "Push token " + str + " is the same as the previous token. Not calling sendFullDeviceObjectOnNextExport or requesting data flush";
    }

    @JvmStatic
    public static final void addSdkMetadata(Context context, EnumSet<BrazeSdkMetadata> enumSet) {
        INSTANCE.addSdkMetadata(context, enumSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addSerializedCardJsonToStorage$lambda$168(String str, String str2) {
        return "Failed to update ContentCard storage provider with single card update. User id: " + str + " Serialized json: " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addSerializedCardJsonToStorage$lambda$170(final String str, Braze braze, final String str2) {
        if (StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda205
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addSerializedCardJsonToStorage$lambda$170$lambda$169;
                    addSerializedCardJsonToStorage$lambda$170$lambda$169 = Braze.addSerializedCardJsonToStorage$lambda$170$lambda$169(str2, str);
                    return addSerializedCardJsonToStorage$lambda$170$lambda$169;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        ((j1) braze.getUdm$android_sdk_base_release()).D.a(new com.braze.models.response.c(str), str2);
        ((com.braze.events.d) braze.externalIEventMessenger).b(((j1) braze.getUdm$android_sdk_base_release()).D.a(true, (Long) null), ContentCardsUpdatedEvent.class);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addSerializedCardJsonToStorage$lambda$170$lambda$169(String str, String str2) {
        return "Cannot add null or blank card json to storage. Returning. User id: " + str + " Serialized json: " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addSingleSynchronousSubscription$lambda$125(Class cls) {
        return "Failed to add synchronous subscriber for class: " + cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyPendingRuntimeConfiguration$lambda$188$lambda$185() {
        return "Applying any pending runtime configuration values";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyPendingRuntimeConfiguration$lambda$188$lambda$186() {
        return "Clearing config values";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyPendingRuntimeConfiguration$lambda$188$lambda$187(BrazeConfig brazeConfig) {
        return "Setting pending config object: " + brazeConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String areCachedContentCardsStale$lambda$144() {
        return "The ContentCardsUpdatedEvent was null. Returning false for stale check.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$130(String str) {
        return "Failed to set external id to: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeUser$lambda$137(final String str, Braze braze, final String str2) {
        com.braze.configuration.e eVar;
        if (str == null || str.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda136
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String changeUser$lambda$137$lambda$131;
                    changeUser$lambda$137$lambda$131 = Braze.changeUser$lambda$137$lambda$131();
                    return changeUser$lambda$137$lambda$131;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (StringUtils.getByteSize(str) > 997) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda131
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String changeUser$lambda$137$lambda$132;
                    changeUser$lambda$137$lambda$132 = Braze.changeUser$lambda$137$lambda$132(str);
                    return changeUser$lambda$137$lambda$132;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        BrazeUser brazeUser = braze.brazeUser;
        if (brazeUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
            brazeUser = null;
        }
        final String userId = brazeUser.getUserId();
        if (Intrinsics.areEqual(userId, str)) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda132
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String changeUser$lambda$137$lambda$133;
                    changeUser$lambda$137$lambda$133 = Braze.changeUser$lambda$137$lambda$133(str);
                    return changeUser$lambda$137$lambda$133;
                }
            }, 6, (Object) null);
            if (str2 != null && !StringsKt.isBlank(str2)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda133
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String changeUser$lambda$137$lambda$134;
                        changeUser$lambda$137$lambda$134 = Braze.changeUser$lambda$137$lambda$134(str2);
                        return changeUser$lambda$137$lambda$134;
                    }
                }, 7, (Object) null);
                ((j1) braze.getUdm$android_sdk_base_release()).v.b(str2);
            }
        } else {
            BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda134
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String changeUser$lambda$137$lambda$135;
                    changeUser$lambda$137$lambda$135 = Braze.changeUser$lambda$137$lambda$135(userId, str);
                    return changeUser$lambda$137$lambda$135;
                }
            }, 6, (Object) null);
            com.braze.events.d dVar = ((j1) braze.getUdm$android_sdk_base_release()).n;
            ReentrantLock reentrantLock = dVar.h;
            reentrantLock.lock();
            try {
                reentrantLock.unlock();
                y0 y0Var = ((j1) braze.getUdm$android_sdk_base_release()).u;
                y0Var.b.clearData(DataStoreKey.PUSH_MAX_CAMPAIGNS);
                y0Var.b.clearData(DataStoreKey.PUSH_MAX_LAST_UPDATE);
                ((j1) braze.getUdm$android_sdk_base_release()).y.d();
                ((j1) braze.getUdm$android_sdk_base_release()).p.a();
                com.braze.configuration.e eVar2 = braze.offlineUserStorageProvider;
                if (eVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                    eVar2 = null;
                }
                eVar2.b(str);
                r0 udm$android_sdk_base_release = braze.getUdm$android_sdk_base_release();
                Context context = braze.applicationContext;
                com.braze.configuration.e eVar3 = braze.offlineUserStorageProvider;
                if (eVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                    eVar = null;
                } else {
                    eVar = eVar3;
                }
                braze.setUserSpecificMemberVariablesAndStartDispatch(new j1(context, eVar, braze.getConfigurationProvider$android_sdk_base_release(), braze.externalIEventMessenger, braze.getDeviceIdProvider$android_sdk_base_release(), braze.getRegistrationDataProvider$android_sdk_base_release(), braze.getPushDeliveryManager$android_sdk_base_release(), shouldMockNetworkRequestsAndDropEvents, areOutboundNetworkRequestsOffline, braze.getDeviceDataProvider(), shouldRequestFrameworkListenToNetworkUpdates));
                if (str2 != null && !StringsKt.isBlank(str2)) {
                    BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda135
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String changeUser$lambda$137$lambda$136;
                            changeUser$lambda$137$lambda$136 = Braze.changeUser$lambda$137$lambda$136(str2);
                            return changeUser$lambda$137$lambda$136;
                        }
                    }, 7, (Object) null);
                    ((j1) braze.getUdm$android_sdk_base_release()).v.b(str2);
                }
                ((j1) braze.getUdm$android_sdk_base_release()).d().j();
                ((j1) braze.getUdm$android_sdk_base_release()).y.l();
                j1 j1Var = (j1) udm$android_sdk_base_release;
                j1Var.getClass();
                BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new i1(j1Var, null), 3, null);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$137$lambda$131() {
        return "userId passed to changeUser was null or empty. The current user will remain the active user.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$137$lambda$132(String str) {
        return "Rejected user id with byte length longer than 997. Not changing user. Input user id: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$137$lambda$133(String str) {
        return "Received request to change current user " + str + " to the same user id. Not changing user.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$137$lambda$134(String str) {
        return "Set sdk auth signature on changeUser call: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$137$lambda$135(String str, String str2) {
        return "Changing current user '" + str + "' to new user '" + str2 + ".'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$137$lambda$136(String str) {
        return "Set sdk auth signature on changeUser call: " + str;
    }

    @JvmStatic
    public static final void clearEndpointProvider() {
        INSTANCE.clearEndpointProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeSession$lambda$41() {
        return "Cannot close session with null activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeSession$lambda$42() {
        return "Failed to close session.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit closeSession$lambda$43(Braze braze, com.braze.managers.a aVar) {
        ((j1) braze.getUdm$android_sdk_base_release()).y.a(aVar);
        return Unit.INSTANCE;
    }

    @JvmStatic
    public static final boolean configure(Context context, BrazeConfig brazeConfig) {
        return INSTANCE.configure(context, brazeConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteRegisteredGeofenceCache$lambda$183() {
        return "Failed to delete registered geofence cache.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteRegisteredGeofenceCache$lambda$184(Braze braze) {
        GeofenceDataStoreProvider geofenceDataStoreProvider = ((j1) braze.getUdm$android_sdk_base_release()).z.getGeofenceDataStoreProvider();
        IBrazeGeofenceApi iBrazeGeofenceApi = new com.braze.location.a(geofenceDataStoreProvider).b;
        if (iBrazeGeofenceApi != null) {
            iBrazeGeofenceApi.deleteRegisteredGeofenceCache(geofenceDataStoreProvider);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deserializeContentCard$lambda$145() {
        return "Cannot deserialize null content card json string. Returning null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deserializeContentCard$lambda$146(String str) {
        return "Failed to deserialize content card json string. Payload: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deserializeContentCard$lambda$147(JSONObject jSONObject) {
        return "Failed to deserialize content card json. Payload: " + jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deserializeInAppMessageString$lambda$148(String str) {
        return "Failed to deserialize in-app message json. Payload: " + str;
    }

    @JvmStatic
    public static final void disableDelayedInitialization(Context context) {
        INSTANCE.disableDelayedInitialization(context);
    }

    @JvmStatic
    public static final void disableSdk(Context context) {
        INSTANCE.disableSdk(context);
    }

    @JvmStatic
    public static final void enableDelayedInitialization(Context context, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
        INSTANCE.enableDelayedInitialization(context, delayedInitializationAnalyticsBehavior);
    }

    @JvmStatic
    public static final boolean enableMockNetworkRequestsAndDropEventsMode() {
        return INSTANCE.enableMockNetworkRequestsAndDropEventsMode();
    }

    @JvmStatic
    public static final void enableSdk(Context context) {
        INSTANCE.enableSdk(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getAllFeatureFlags$lambda$81() {
        return "Failed to get all feature flags";
    }

    @JvmStatic
    public static final Uri getApiEndpoint(Uri uri) {
        return INSTANCE.getApiEndpoint(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBanner$lambda$95(String str) {
        return "Failed to get Banner " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCachedContentCards$lambda$143() {
        return "The ContentCardsUpdatedEvent was null. Returning null for the list of cached cards.";
    }

    private final ContentCardsUpdatedEvent getCachedContentCardsUpdatedEvent() {
        return (ContentCardsUpdatedEvent) runForResult$android_sdk_base_release$default(this, null, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda146
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _get_cachedContentCardsUpdatedEvent_$lambda$37;
                _get_cachedContentCardsUpdatedEvent_$lambda$37 = Braze._get_cachedContentCardsUpdatedEvent_$lambda$37();
                return _get_cachedContentCardsUpdatedEvent_$lambda$37;
            }
        }, false, false, false, new a(this, null), 28, null);
    }

    public static /* synthetic */ void getConfigurationProvider$android_sdk_base_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getConfigurationProviderSafe$lambda$216() {
        return "ConfigurationProvider has not been initialized. Constructing a new one.";
    }

    @JvmStatic
    public static final String getConfiguredApiKey(BrazeConfigurationProvider brazeConfigurationProvider) {
        return INSTANCE.getConfiguredApiKey(brazeConfigurationProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getContentCardCount$lambda$140() {
        return "The ContentCardsUpdatedEvent was null. Returning the default value for the card count.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getContentCardUnviewedCount$lambda$141() {
        return "The ContentCardsUpdatedEvent was null. Returning the default value for the unviewed card count.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getContentCardsLastUpdatedInSecondsFromEpoch$lambda$142() {
        return "The ContentCardsUpdatedEvent was null. Returning the default value for the last update timestamp.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCurrentUser$lambda$138() {
        return "Failed to retrieve the current user.";
    }

    public static final IBrazeNotificationFactory getCustomBrazeNotificationFactory() {
        return INSTANCE.getCustomBrazeNotificationFactory();
    }

    private final com.braze.managers.n0 getDeviceDataProvider() {
        com.braze.managers.n0 n0Var = deviceDataProvider;
        if (n0Var == null) {
            n0Var = new com.braze.managers.x(this.applicationContext, getConfigurationProvider$android_sdk_base_release());
        }
        deviceDataProvider = n0Var;
        return n0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDeviceIdAsync$lambda$139() {
        return "Failed to retrieve the current device id.";
    }

    public static /* synthetic */ void getDeviceIdProvider$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getExternalIEventMessenger$android_sdk_base_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getFeatureFlag$lambda$82(String str) {
        return "Failed to get feature flag " + str;
    }

    @JvmStatic
    public static final Braze getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }

    public static final boolean getOutboundNetworkRequestsOffline() {
        return INSTANCE.getOutboundNetworkRequestsOffline();
    }

    public static /* synthetic */ void getPushDeliveryManager$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getRegistrationDataProvider$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getUdm$android_sdk_base_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleInAppMessageTestPush$lambda$179() {
        return "Error handling test in-app message push";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleInAppMessageTestPush$lambda$180(Intent intent, Braze braze) {
        INSTANCE.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(intent, ((j1) braze.getUdm$android_sdk_base_release()).y);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleInternalBannerRefresh$lambda$181() {
        return "Error handling banner push refresh";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleInternalBannerRefresh$lambda$182(Braze braze) {
        ((j1) braze.getUdm$android_sdk_base_release()).C.a();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void isApiKeyPresent$android_sdk_base_release$annotations() {
    }

    public static final boolean isDelayedInitializationEnabled() {
        return INSTANCE.isDelayedInitializationEnabled();
    }

    public static final boolean isDisabled() {
        return INSTANCE.isDisabled();
    }

    private final boolean isEphemeralEventKey(final String key) {
        if (!getConfigurationProvider$android_sdk_base_release().isEphemeralEventsEnabled()) {
            return false;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String isEphemeralEventKey$lambda$210;
                isEphemeralEventKey$lambda$210 = Braze.isEphemeralEventKey$lambda$210();
                return isEphemeralEventKey$lambda$210;
            }
        }, 6, (Object) null);
        final Set<String> ephemeralEventKeys = getConfigurationProvider$android_sdk_base_release().getEphemeralEventKeys();
        final boolean contains = ephemeralEventKeys.contains(key);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String isEphemeralEventKey$lambda$211;
                isEphemeralEventKey$lambda$211 = Braze.isEphemeralEventKey$lambda$211(key, ephemeralEventKeys, contains);
                return isEphemeralEventKey$lambda$211;
            }
        }, 6, (Object) null);
        return contains;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isEphemeralEventKey$lambda$210() {
        return "Ephemeral events enabled";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isEphemeralEventKey$lambda$211(String str, Set set, boolean z) {
        return "Checking event key [" + str + "] against ephemeral event list " + set + " and got match?: " + z;
    }

    public static final boolean isSdkDisabledOrDelayed() {
        return INSTANCE.isSdkDisabledOrDelayed();
    }

    static final String lambda$2$lambda$1(String str) {
        return "Device build model matches a known crawler. Enabling mock network request mode. Device it: " + str;
    }

    static final String lambda$27$lambda$10() {
        return "**                Replace \"rest\" with \"sdk\" in your configuration                    **";
    }

    static final String lambda$27$lambda$11() {
        return "**                                        See                                        **";
    }

    static final String lambda$27$lambda$12() {
        return "**  https://www.braze.com/docs/user_guide/administrative/access_braze/sdk_endpoints  **";
    }

    static final String lambda$27$lambda$13() {
        return "**                                                                                   **";
    }

    static final String lambda$27$lambda$14() {
        return "***************************************************************************************";
    }

    static final String lambda$27$lambda$15() {
        return "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.";
    }

    static final String lambda$27$lambda$17() {
        return "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.";
    }

    static final String lambda$27$lambda$18() {
        return "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.";
    }

    static final String lambda$27$lambda$19() {
        return "Amazon Device Messaging found. Setting up Amazon Device Messaging";
    }

    static final String lambda$27$lambda$20() {
        return "ADM manifest requirements not met. Braze will not register for ADM.";
    }

    static final String lambda$27$lambda$21() {
        return "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.";
    }

    static final String lambda$27$lambda$22() {
        return "Failed to setup pre SDK tasks";
    }

    static final String lambda$27$lambda$23() {
        return "Starting up a new user dependency manager";
    }

    static final String lambda$27$lambda$24() {
        return "Finished UserDependencyManager creation.";
    }

    static final String lambda$27$lambda$25() {
        return "Failed to startup user dependency manager.";
    }

    static final String lambda$27$lambda$26() {
        return "Finished singleton setup.";
    }

    static final String lambda$27$lambda$4() {
        return "***************************************************************************************";
    }

    static final String lambda$27$lambda$5() {
        return "**                                                                                   **";
    }

    static final String lambda$27$lambda$6() {
        return "**                                   !! WARNING !!                                   **";
    }

    static final String lambda$27$lambda$7() {
        return "**                                                                                   **";
    }

    static final String lambda$27$lambda$8() {
        return "**                       You are using a Braze REST API endpoint                     **";
    }

    static final String lambda$27$lambda$9() {
        return "**                             instead of an SDK endpoint                            **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logBannerClick$lambda$97(String str) {
        return "Failed to log a Banner impression for " + str + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logBannerClick$lambda$98(Braze braze, String str, String str2) {
        ((j1) braze.getUdm$android_sdk_base_release()).C.a(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logBannerImpression$lambda$96(String str) {
        return "Failed to log a Banner impression for " + str + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$44(String str) {
        return "Failed to log custom event: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, java.lang.String] */
    public static final Unit logCustomEvent$lambda$50(Braze braze, final String str, BrazeProperties brazeProperties, final BrazeProperties brazeProperties2) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda182
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logCustomEvent$lambda$50$lambda$45;
                logCustomEvent$lambda$50$lambda$45 = Braze.logCustomEvent$lambda$50$lambda$45(str, brazeProperties2);
                return logCustomEvent$lambda$50$lambda$45;
            }
        }, 6, (Object) null);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = str;
        if (!ValidationUtils.isValidLogCustomEventInput(str, ((j1) braze.getUdm$android_sdk_base_release()).o)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda183
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logCustomEvent$lambda$50$lambda$46;
                    logCustomEvent$lambda$50$lambda$46 = Braze.logCustomEvent$lambda$50$lambda$46(Ref.ObjectRef.this);
                    return logCustomEvent$lambda$50$lambda$46;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (brazeProperties != null && brazeProperties.isInvalid()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda185
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logCustomEvent$lambda$50$lambda$47;
                    logCustomEvent$lambda$50$lambda$47 = Braze.logCustomEvent$lambda$50$lambda$47(Ref.ObjectRef.this);
                    return logCustomEvent$lambda$50$lambda$47;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        ?? ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength((String) objectRef.element);
        objectRef.element = ensureBrazeFieldLength;
        com.braze.models.k a2 = com.braze.models.outgoing.event.b.g.a((String) ensureBrazeFieldLength, brazeProperties);
        if (a2 == null) {
            return Unit.INSTANCE;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda186
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logCustomEvent$lambda$50$lambda$48;
                logCustomEvent$lambda$50$lambda$48 = Braze.logCustomEvent$lambda$50$lambda$48(str, brazeProperties2);
                return logCustomEvent$lambda$50$lambda$48;
            }
        }, 6, (Object) null);
        if (braze.isEphemeralEventKey((String) objectRef.element) ? ((j1) braze.getUdm$android_sdk_base_release()).o.G() : ((j1) braze.getUdm$android_sdk_base_release()).y.a(a2)) {
            ((j1) braze.getUdm$android_sdk_base_release()).G.a((com.braze.triggers.events.i) new com.braze.triggers.events.a((String) objectRef.element, brazeProperties, a2));
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda187
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logCustomEvent$lambda$50$lambda$49;
                    logCustomEvent$lambda$50$lambda$49 = Braze.logCustomEvent$lambda$50$lambda$49(Ref.ObjectRef.this);
                    return logCustomEvent$lambda$50$lambda$49;
                }
            }, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$50$lambda$45(String str, BrazeProperties brazeProperties) {
        return "Called logCustomEvent for custom event " + str + " and properties " + brazeProperties;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$50$lambda$46(Ref.ObjectRef objectRef) {
        return "Logged custom event with name " + objectRef.element + " was invalid. Not logging custom event to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$50$lambda$47(Ref.ObjectRef objectRef) {
        return "Custom event with name " + objectRef.element + " logged with invalid properties. Not logging custom event to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$50$lambda$48(String str, BrazeProperties brazeProperties) {
        return "Logging custom event " + str + " and properties " + brazeProperties;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$50$lambda$49(Ref.ObjectRef objectRef) {
        return "Not passing event with name " + objectRef.element + " to trigger manager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logFeatureFlagImpression$lambda$83() {
        return "Failed to log a Feature Flag impression.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logFeatureFlagImpression$lambda$84(Braze braze, String str) {
        ((j1) braze.getUdm$android_sdk_base_release()).B.a(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logLocationRecordedEventFromLocationUpdate$lambda$171() {
        return "Failed to log location recorded event.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logLocationRecordedEventFromLocationUpdate$lambda$174(Braze braze, IBrazeLocation iBrazeLocation) {
        if (!braze.getConfigurationProvider$android_sdk_base_release().isAutomaticLocationCollectionEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda201
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logLocationRecordedEventFromLocationUpdate$lambda$174$lambda$172;
                    logLocationRecordedEventFromLocationUpdate$lambda$174$lambda$172 = Braze.logLocationRecordedEventFromLocationUpdate$lambda$174$lambda$172();
                    return logLocationRecordedEventFromLocationUpdate$lambda$174$lambda$172;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        com.braze.models.k a2 = com.braze.models.outgoing.event.b.g.a(iBrazeLocation);
        if (a2 != null) {
            ((j1) braze.getUdm$android_sdk_base_release()).y.a(a2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logLocationRecordedEventFromLocationUpdate$lambda$174$lambda$172() {
        return "Automatic location collection is disabled. Not logging location recorded event.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchase$lambda$51(String str) {
        return "Failed to log purchase event of: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPurchase$lambda$54(String str, String str2, BigDecimal bigDecimal, int i, Braze braze, BrazeProperties brazeProperties) {
        if (!ValidationUtils.isValidLogPurchaseInput(str, str2, bigDecimal, i, ((j1) braze.getUdm$android_sdk_base_release()).o)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda81
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPurchase$lambda$54$lambda$52;
                    logPurchase$lambda$54$lambda$52 = Braze.logPurchase$lambda$54$lambda$52();
                    return logPurchase$lambda$54$lambda$52;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (brazeProperties != null && brazeProperties.isInvalid()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda82
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPurchase$lambda$54$lambda$53;
                    logPurchase$lambda$54$lambda$53 = Braze.logPurchase$lambda$54$lambda$53();
                    return logPurchase$lambda$54$lambda$53;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(str);
        com.braze.models.outgoing.event.a aVar = com.braze.models.outgoing.event.b.g;
        Intrinsics.checkNotNull(str2);
        Intrinsics.checkNotNull(bigDecimal);
        com.braze.models.k a2 = aVar.a(ensureBrazeFieldLength, str2, bigDecimal, i, brazeProperties);
        if (a2 == null) {
            return Unit.INSTANCE;
        }
        if (((j1) braze.getUdm$android_sdk_base_release()).y.a(a2)) {
            ((j1) braze.getUdm$android_sdk_base_release()).G.a((com.braze.triggers.events.i) new com.braze.triggers.events.f(ensureBrazeFieldLength, brazeProperties, a2));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchase$lambda$54$lambda$52() {
        return "Log purchase input was invalid. Not logging in-app purchase to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchase$lambda$54$lambda$53() {
        return "Purchase logged with invalid properties. Not logging custom event to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushDelivery$lambda$193(String str) {
        return "Error logging Push Delivery " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushDelivery$lambda$194(Braze braze, String str, long j) {
        ((j1) braze.getUdm$android_sdk_base_release()).y.a(str);
        braze.schedulePushDelivery$android_sdk_base_release(j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushMaxCampaign$lambda$199() {
        return "Failed to log push max campaign";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushMaxCampaign$lambda$200(Braze braze, String str) {
        ((j1) braze.getUdm$android_sdk_base_release()).y.c(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$63() {
        return "Failed to log push notification action clicked.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushNotificationActionClicked$lambda$67(String campaignId, Braze braze, String actionId, String actionType) {
        if (campaignId == null || StringsKt.isBlank(campaignId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushNotificationActionClicked$lambda$67$lambda$64;
                    logPushNotificationActionClicked$lambda$67$lambda$64 = Braze.logPushNotificationActionClicked$lambda$67$lambda$64();
                    return logPushNotificationActionClicked$lambda$67$lambda$64;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (actionId == null || StringsKt.isBlank(actionId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushNotificationActionClicked$lambda$67$lambda$65;
                    logPushNotificationActionClicked$lambda$67$lambda$65 = Braze.logPushNotificationActionClicked$lambda$67$lambda$65();
                    return logPushNotificationActionClicked$lambda$67$lambda$65;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (actionType == null || StringsKt.isBlank(actionType)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushNotificationActionClicked$lambda$67$lambda$66;
                    logPushNotificationActionClicked$lambda$67$lambda$66 = Braze.logPushNotificationActionClicked$lambda$67$lambda$66();
                    return logPushNotificationActionClicked$lambda$67$lambda$66;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        int i = com.braze.models.outgoing.event.push.a.j;
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cid", campaignId);
        jSONObject.put("a", actionId);
        com.braze.enums.c cVar = com.braze.enums.d.b;
        com.braze.models.outgoing.event.push.a aVar = new com.braze.models.outgoing.event.push.a(jSONObject, actionType);
        Companion companion = INSTANCE;
        if (companion.isDelayedInitializationEnabled()) {
            companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(aVar);
            return Unit.INSTANCE;
        }
        ((j1) braze.getUdm$android_sdk_base_release()).y.a(aVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$67$lambda$64() {
        return "No campaign Id associated with this notification (this is expected for test sends). Not logging push notification action clicked.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$67$lambda$65() {
        return "Action ID cannot be null or blank.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$67$lambda$66() {
        return "Action Type cannot be null or blank.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$55(String str) {
        return "Failed to log push open for '" + str + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushNotificationOpened$lambda$57(String campaignId, Braze braze) {
        if (campaignId == null || StringsKt.isBlank(campaignId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushNotificationOpened$lambda$57$lambda$56;
                    logPushNotificationOpened$lambda$57$lambda$56 = Braze.logPushNotificationOpened$lambda$57$lambda$56();
                    return logPushNotificationOpened$lambda$57$lambda$56;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        int i = com.braze.models.outgoing.event.push.c.i;
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cid", campaignId);
        com.braze.enums.c cVar = com.braze.enums.d.b;
        com.braze.models.outgoing.event.push.c cVar2 = new com.braze.models.outgoing.event.push.c(jSONObject);
        Companion companion = INSTANCE;
        if (companion.isDelayedInitializationEnabled()) {
            companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(cVar2);
            return Unit.INSTANCE;
        }
        ((j1) braze.getUdm$android_sdk_base_release()).y.a(cVar2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$57$lambda$56() {
        return "No campaign Id associated with this notification (this is expected for test sends). Not logging push notification opened.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$58(Intent intent) {
        return "Error logging push notification with intent: " + intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushNotificationOpened$lambda$62(Intent intent, Braze braze) {
        if (intent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda66
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushNotificationOpened$lambda$62$lambda$59;
                    logPushNotificationOpened$lambda$62$lambda$59 = Braze.logPushNotificationOpened$lambda$62$lambda$59();
                    return logPushNotificationOpened$lambda$62$lambda$59;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        final String campaignId = intent.getStringExtra("cid");
        if (campaignId == null || StringsKt.isBlank(campaignId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda88
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushNotificationOpened$lambda$62$lambda$61;
                    logPushNotificationOpened$lambda$62$lambda$61 = Braze.logPushNotificationOpened$lambda$62$lambda$61();
                    return logPushNotificationOpened$lambda$62$lambda$61;
                }
            }, 6, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda77
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushNotificationOpened$lambda$62$lambda$60;
                    logPushNotificationOpened$lambda$62$lambda$60 = Braze.logPushNotificationOpened$lambda$62$lambda$60(campaignId);
                    return logPushNotificationOpened$lambda$62$lambda$60;
                }
            }, 6, (Object) null);
            int i = com.braze.models.outgoing.event.push.c.i;
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cid", campaignId);
            com.braze.enums.c cVar = com.braze.enums.d.b;
            com.braze.models.outgoing.event.push.c cVar2 = new com.braze.models.outgoing.event.push.c(jSONObject);
            Companion companion = INSTANCE;
            if (companion.isDelayedInitializationEnabled()) {
                companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(cVar2);
                return Unit.INSTANCE;
            }
            ((j1) braze.getUdm$android_sdk_base_release()).y.a(cVar2);
        }
        INSTANCE.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(intent, ((j1) braze.getUdm$android_sdk_base_release()).y);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$62$lambda$59() {
        return "Cannot logPushNotificationOpened with null intent. Not logging push click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$62$lambda$60(String str) {
        return "Logging push click. Campaign Id: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$62$lambda$61() {
        return "No campaign Id associated with this notification (this is expected for test sends). Not logging push click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushStoryPageClicked$lambda$68(String str, String str2) {
        return "Failed to log push story page clicked for pageId: " + str + " campaignId: " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushStoryPageClicked$lambda$71(String str, String str2, Braze braze) {
        if (!ValidationUtils.isValidPushStoryClickInput(str, str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda125
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushStoryPageClicked$lambda$71$lambda$69;
                    logPushStoryPageClicked$lambda$71$lambda$69 = Braze.logPushStoryPageClicked$lambda$71$lambda$69();
                    return logPushStoryPageClicked$lambda$71$lambda$69;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        com.braze.models.outgoing.event.a aVar = com.braze.models.outgoing.event.b.g;
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNull(str2);
        com.braze.models.k o = aVar.o(str, str2);
        if (o != null) {
            Companion companion = INSTANCE;
            if (companion.isDelayedInitializationEnabled()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda126
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String logPushStoryPageClicked$lambda$71$lambda$70;
                        logPushStoryPageClicked$lambda$71$lambda$70 = Braze.logPushStoryPageClicked$lambda$71$lambda$70();
                        return logPushStoryPageClicked$lambda$71$lambda$70;
                    }
                }, 7, (Object) null);
                companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(o);
                return Unit.INSTANCE;
            }
            ((j1) braze.getUdm$android_sdk_base_release()).y.a(o);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushStoryPageClicked$lambda$71$lambda$69() {
        return "Push story page click input was invalid. Not logging in-app purchase to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushStoryPageClicked$lambda$71$lambda$70() {
        return "Enqueuing push story page click to delayed init provider";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openSession$lambda$38() {
        return "Cannot open session with null activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openSession$lambda$39() {
        return "Failed to open session.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openSession$lambda$40(Braze braze, com.braze.managers.a aVar) {
        ((j1) braze.getUdm$android_sdk_base_release()).y.b(aVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performPushDeliveryFlush$lambda$197() {
        return "Failed to flush push delivery events";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performPushDeliveryFlush$lambda$198(Braze braze) {
        ((j1) braze.getUdm$android_sdk_base_release()).y.a(0L);
        return Unit.INSTANCE;
    }

    private final void publishError(final Throwable throwable) {
        if (this.udm == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, throwable, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String publishError$lambda$205;
                    publishError$lambda$205 = Braze.publishError$lambda$205();
                    return publishError$lambda$205;
                }
            }, 4, (Object) null);
            return;
        }
        try {
            ((j1) getUdm$android_sdk_base_release()).n.b(throwable, Throwable.class);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String publishError$lambda$206;
                    publishError$lambda$206 = Braze.publishError$lambda$206(throwable);
                    return publishError$lambda$206;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String publishError$lambda$205() {
        return "User dependency manager is uninitialized. Not publishing error.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String publishError$lambda$206(Throwable th) {
        return "Failed to log throwable: " + th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String recordGeofenceTransition$lambda$161() {
        return "Failed to post geofence report.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recordGeofenceTransition$lambda$162(String str, GeofenceTransitionType geofenceTransitionType, Braze braze) {
        if (str == null || StringsKt.isBlank(str) || geofenceTransitionType == null) {
            return Unit.INSTANCE;
        }
        ((j1) braze.getUdm$android_sdk_base_release()).z.postGeofenceReport(str, geofenceTransitionType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String reenqueueInAppMessage$lambda$191(InAppMessageEvent inAppMessageEvent) {
        return "Error reenqueueing In-App Message from event " + inAppMessageEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reenqueueInAppMessage$lambda$192(Braze braze, InAppMessageEvent inAppMessageEvent) {
        ((j1) braze.getUdm$android_sdk_base_release()).G.b(inAppMessageEvent.getTriggerAction());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlags$lambda$78() {
        return "Failed to refresh feature flags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshFeatureFlags$lambda$80(Braze braze) {
        if (((j1) braze.getUdm$android_sdk_base_release()).o.H()) {
            ((j1) braze.getUdm$android_sdk_base_release()).B.e();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String refreshFeatureFlags$lambda$80$lambda$79;
                    refreshFeatureFlags$lambda$80$lambda$79 = Braze.refreshFeatureFlags$lambda$80$lambda$79();
                    return refreshFeatureFlags$lambda$80$lambda$79;
                }
            }, 6, (Object) null);
            ((j1) braze.getUdm$android_sdk_base_release()).n.b(new com.braze.events.internal.j(), com.braze.events.internal.j.class);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlags$lambda$80$lambda$79() {
        return "Feature flags not enabled. Not refreshing feature flags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeSingleSubscription$lambda$128$lambda$126(Class cls, IEventSubscriber iEventSubscriber, boolean z) {
        return "Did remove the background " + cls + " " + iEventSubscriber + "? " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeSingleSubscription$lambda$128$lambda$127(Class cls, IEventSubscriber iEventSubscriber, boolean z) {
        return "Did remove the synchronous " + cls + " " + iEventSubscriber + "? " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeSingleSubscription$lambda$129(Class cls) {
        return "Failed to remove " + cls.getName() + " subscriber.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestBannersRefresh$lambda$85() {
        return "Failed to refresh banners.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, com.braze.Braze$$ExternalSyntheticLambda17] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, com.braze.Braze$$ExternalSyntheticLambda18] */
    public static final Unit requestBannersRefresh$lambda$94(List list, final Braze braze, final IValueCallback iValueCallback) {
        com.braze.managers.j.h.a(list);
        if (((j1) braze.getUdm$android_sdk_base_release()).o.d()) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            if (iValueCallback != null) {
                objectRef.element = new IFireOnceEventSubscriber() { // from class: com.braze.Braze$$ExternalSyntheticLambda17
                    @Override // com.braze.events.IEventSubscriber
                    public final void trigger(Object obj) {
                        Braze.requestBannersRefresh$lambda$94$lambda$92$lambda$88(IValueCallback.this, objectRef, objectRef2, braze, (BannersUpdatedEvent) obj);
                    }
                };
                objectRef2.element = new IFireOnceEventSubscriber() { // from class: com.braze.Braze$$ExternalSyntheticLambda18
                    @Override // com.braze.events.IEventSubscriber
                    public final void trigger(Object obj) {
                        Braze.requestBannersRefresh$lambda$94$lambda$92$lambda$89(IValueCallback.this, objectRef, objectRef2, braze, (com.braze.events.internal.b) obj);
                    }
                };
                IFireOnceEventSubscriber iFireOnceEventSubscriber = (IFireOnceEventSubscriber) objectRef.element;
                if (iFireOnceEventSubscriber != null) {
                    ((com.braze.events.d) braze.externalIEventMessenger).d(BannersUpdatedEvent.class, iFireOnceEventSubscriber);
                }
                IFireOnceEventSubscriber iFireOnceEventSubscriber2 = (IFireOnceEventSubscriber) objectRef2.element;
                if (iFireOnceEventSubscriber2 != null) {
                    ((com.braze.events.d) braze.externalIEventMessenger).d(com.braze.events.internal.b.class, iFireOnceEventSubscriber2);
                }
            }
            if (!((j1) braze.getUdm$android_sdk_base_release()).C.b(list)) {
                ((j1) braze.getUdm$android_sdk_base_release()).n.b(new com.braze.events.internal.b(), com.braze.events.internal.b.class);
                requestBannersRefresh$lambda$94$unsubscribeLocalListeners(objectRef, objectRef2, braze);
                if (iValueCallback != null) {
                    iValueCallback.onError();
                }
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestBannersRefresh$lambda$94$lambda$93;
                    requestBannersRefresh$lambda$94$lambda$93 = Braze.requestBannersRefresh$lambda$94$lambda$93();
                    return requestBannersRefresh$lambda$94$lambda$93;
                }
            }, 6, (Object) null);
            ((j1) braze.getUdm$android_sdk_base_release()).n.b(new com.braze.events.internal.b(), com.braze.events.internal.b.class);
            if (iValueCallback != null) {
                iValueCallback.onError();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestBannersRefresh$lambda$94$lambda$92$lambda$88(IValueCallback iValueCallback, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Braze braze, BannersUpdatedEvent message) {
        Intrinsics.checkNotNullParameter(message, "message");
        requestBannersRefresh$lambda$94$unsubscribeLocalListeners(objectRef, objectRef2, braze);
        iValueCallback.onSuccess(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestBannersRefresh$lambda$94$lambda$92$lambda$89(IValueCallback iValueCallback, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Braze braze, com.braze.events.internal.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<unused var>");
        requestBannersRefresh$lambda$94$unsubscribeLocalListeners(objectRef, objectRef2, braze);
        iValueCallback.onError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestBannersRefresh$lambda$94$lambda$93() {
        return "Banners not enabled. Not refreshing banners. Make sure you have at least one campaign and relaunch the app.";
    }

    private static final void requestBannersRefresh$lambda$94$unsubscribeLocalListeners(Ref.ObjectRef<IFireOnceEventSubscriber<BannersUpdatedEvent>> objectRef, Ref.ObjectRef<IFireOnceEventSubscriber<com.braze.events.internal.b>> objectRef2, Braze braze) {
        IFireOnceEventSubscriber<BannersUpdatedEvent> iFireOnceEventSubscriber = objectRef.element;
        if (iFireOnceEventSubscriber != null) {
            ((com.braze.events.d) braze.externalIEventMessenger).a(BannersUpdatedEvent.class, (IEventSubscriber) iFireOnceEventSubscriber);
        }
        IFireOnceEventSubscriber<com.braze.events.internal.b> iFireOnceEventSubscriber2 = objectRef2.element;
        if (iFireOnceEventSubscriber2 != null) {
            ((com.braze.events.d) braze.externalIEventMessenger).a(com.braze.events.internal.b.class, (IEventSubscriber) iFireOnceEventSubscriber2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefresh$lambda$72() {
        return "Failed to request Content Cards refresh from Braze servers.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestContentCardsRefresh$lambda$75(Braze braze) {
        if (((j1) braze.getUdm$android_sdk_base_release()).o.E()) {
            if (((j1) braze.getUdm$android_sdk_base_release()).o.D()) {
                com.braze.communication.dust.i iVar = (com.braze.communication.dust.i) ((j1) braze.getUdm$android_sdk_base_release()).p.c;
                iVar.getClass();
                long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
                long j = iVar.c.get();
                long j2 = nowInMilliseconds - j;
                Job job = iVar.f482a;
                if (job != null && job.isActive() && iVar.b.get() && j != 0 && j2 > 3000) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String requestContentCardsRefresh$lambda$75$lambda$73;
                            requestContentCardsRefresh$lambda$75$lambda$73 = Braze.requestContentCardsRefresh$lambda$75$lambda$73();
                            return requestContentCardsRefresh$lambda$75$lambda$73;
                        }
                    }, 6, (Object) null);
                    com.braze.events.e eVar = braze.externalIEventMessenger;
                    com.braze.storage.p pVar = ((j1) braze.getUdm$android_sdk_base_release()).D;
                    pVar.getClass();
                    ((com.braze.events.d) eVar).b(pVar.a(true, Long.valueOf(DateTimeUtils.nowInSeconds())), ContentCardsUpdatedEvent.class);
                    return Unit.INSTANCE;
                }
            }
            ((j1) braze.getUdm$android_sdk_base_release()).y.a(((j1) braze.getUdm$android_sdk_base_release()).D.d, ((j1) braze.getUdm$android_sdk_base_release()).D.e, 0, com.braze.requests.c.d);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestContentCardsRefresh$lambda$75$lambda$74;
                    requestContentCardsRefresh$lambda$75$lambda$74 = Braze.requestContentCardsRefresh$lambda$75$lambda$74();
                    return requestContentCardsRefresh$lambda$75$lambda$74;
                }
            }, 7, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefresh$lambda$75$lambda$73() {
        return "DUST is enabled and blocking Content Cards refreshes during active connections. Returning cached Content Cards.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefresh$lambda$75$lambda$74() {
        return "Content Cards is not enabled, skipping API call to refresh";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefreshFromCache$lambda$76() {
        return "Failed to request Content Cards refresh from the cache.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestContentCardsRefreshFromCache$lambda$77(Braze braze) {
        ((com.braze.events.d) braze.externalIEventMessenger).b(((j1) braze.getUdm$android_sdk_base_release()).D.a(true, (Long) null), ContentCardsUpdatedEvent.class);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$163() {
        return "Failed to request geofence refresh.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestGeofenceRefresh$lambda$165(IBrazeLocation iBrazeLocation, Braze braze) {
        if (iBrazeLocation == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda165
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestGeofenceRefresh$lambda$165$lambda$164;
                    requestGeofenceRefresh$lambda$165$lambda$164 = Braze.requestGeofenceRefresh$lambda$165$lambda$164();
                    return requestGeofenceRefresh$lambda$165$lambda$164;
                }
            }, 7, (Object) null);
            return Unit.INSTANCE;
        }
        ((j1) braze.getUdm$android_sdk_base_release()).z.requestGeofenceRefresh(iBrazeLocation);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$165$lambda$164() {
        return "Cannot request Geofence refresh with null location.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$166(boolean z) {
        return "Failed to request geofence refresh with rate limit ignore: " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestGeofenceRefresh$lambda$167(Braze braze, boolean z) {
        ((j1) braze.getUdm$android_sdk_base_release()).z.requestGeofenceRefresh(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofences$lambda$149() {
        return "Failed to request geofence refresh.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestGeofences$lambda$152(final double d, final double d2, Braze braze) {
        if (!ValidationUtils.isValidLocation(d, d2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda119
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestGeofences$lambda$152$lambda$150;
                    requestGeofences$lambda$152$lambda$150 = Braze.requestGeofences$lambda$152$lambda$150(d, d2);
                    return requestGeofences$lambda$152$lambda$150;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda120
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestGeofences$lambda$152$lambda$151;
                requestGeofences$lambda$152$lambda$151 = Braze.requestGeofences$lambda$152$lambda$151(d, d2);
                return requestGeofences$lambda$152$lambda$151;
            }
        }, 6, (Object) null);
        ((j1) braze.getUdm$android_sdk_base_release()).z.requestGeofenceRefresh(new BrazeLocation(d, d2, null, null, null, 28, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofences$lambda$152$lambda$150(double d, double d2) {
        return "Location provided is invalid. Not requesting refresh of Braze Geofences. Provided latitude - longitude: " + d + " - " + d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofences$lambda$152$lambda$151(double d, double d2) {
        return "Manually requesting Geofence refresh of with provided latitude - longitude: " + d + " - " + d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofencesInitialization$lambda$175() {
        return "Failed to initialize geofences with the geofence manager.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestGeofencesInitialization$lambda$176(Braze braze) {
        ((j1) braze.getUdm$android_sdk_base_release()).z.initializeGeofences();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestImmediateDataFlush$lambda$101(Braze braze) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda70
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestImmediateDataFlush$lambda$101$lambda$100;
                requestImmediateDataFlush$lambda$101$lambda$100 = Braze.requestImmediateDataFlush$lambda$101$lambda$100();
                return requestImmediateDataFlush$lambda$101$lambda$100;
            }
        }, 6, (Object) null);
        r rVar = ((j1) braze.getUdm$android_sdk_base_release()).y;
        rVar.getClass();
        rVar.a(new com.braze.models.outgoing.j());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestImmediateDataFlush$lambda$101$lambda$100() {
        return "requestImmediateDataFlush() called";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestImmediateDataFlush$lambda$99() {
        return "Failed to request data flush.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestLocationInitialization$lambda$153() {
        return "Location permissions were granted. Requesting geofence and location initialization.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestSingleLocationUpdate$lambda$177() {
        return "Failed to request single location update";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestSingleLocationUpdate$lambda$178(Braze braze) {
        ((j1) braze.getUdm$android_sdk_base_release()).A.f();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retryInAppMessage$lambda$189(InAppMessageEvent inAppMessageEvent) {
        return "Error retrying In-App Message from event " + inAppMessageEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retryInAppMessage$lambda$190(Braze braze, InAppMessageEvent inAppMessageEvent) {
        ((j1) braze.getUdm$android_sdk_base_release()).G.a(inAppMessageEvent.getTriggerEvent(), inAppMessageEvent.getTriggerAction());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void run$android_sdk_base_release$default(Braze braze, Function0 function0, boolean z, boolean z2, boolean z3, Function0 function02, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        braze.run$android_sdk_base_release(function0, z, z2, z3, function02);
    }

    public static /* synthetic */ Object runForResult$android_sdk_base_release$default(Braze braze, Object obj, Function0 function0, boolean z, boolean z2, boolean z3, Function2 function2, int i, Object obj2) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        if ((i & 16) != 0) {
            z3 = true;
        }
        return braze.runForResult$android_sdk_base_release(obj, function0, z, z2, z3, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void safeCallFlushDelayedInitPushAnalyticsQueue() {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda54
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String safeCallFlushDelayedInitPushAnalyticsQueue$lambda$212;
                safeCallFlushDelayedInitPushAnalyticsQueue$lambda$212 = Braze.safeCallFlushDelayedInitPushAnalyticsQueue$lambda$212();
                return safeCallFlushDelayedInitPushAnalyticsQueue$lambda$212;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda56
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit safeCallFlushDelayedInitPushAnalyticsQueue$lambda$213;
                safeCallFlushDelayedInitPushAnalyticsQueue$lambda$213 = Braze.safeCallFlushDelayedInitPushAnalyticsQueue$lambda$213(Braze.this);
                return safeCallFlushDelayedInitPushAnalyticsQueue$lambda$213;
            }
        }, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String safeCallFlushDelayedInitPushAnalyticsQueue$lambda$212() {
        return "Error calling flushPushAnalyticsQueue on instance";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit safeCallFlushDelayedInitPushAnalyticsQueue$lambda$213(Braze braze) {
        INSTANCE.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(((j1) braze.getUdm$android_sdk_base_release()).y);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String schedulePushDelivery$lambda$195() {
        return "Error scheduling push delivery";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit schedulePushDelivery$lambda$196(Braze braze, long j) {
        ((j1) braze.getUdm$android_sdk_base_release()).y.a(j);
        return Unit.INSTANCE;
    }

    public static final void setCustomBrazeNotificationFactory(IBrazeNotificationFactory iBrazeNotificationFactory) {
        INSTANCE.setCustomBrazeNotificationFactory(iBrazeNotificationFactory);
    }

    @JvmStatic
    public static final void setEndpointProvider(IBrazeEndpointProvider iBrazeEndpointProvider) {
        INSTANCE.setEndpointProvider(iBrazeEndpointProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGoogleAdvertisingId$lambda$154(String str, boolean z) {
        return "Failed to set Google Advertising ID data on device. Google Advertising ID: " + str + " and limit-ad-tracking: " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r9) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit setGoogleAdvertisingId$lambda$156(Braze braze, final String str, final boolean z) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.D, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda175
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String googleAdvertisingId$lambda$156$lambda$155;
                googleAdvertisingId$lambda$156$lambda$155 = Braze.setGoogleAdvertisingId$lambda$156$lambda$155(str, z);
                return googleAdvertisingId$lambda$156$lambda$155;
            }
        }, 6, (Object) null);
        com.braze.managers.x xVar = (com.braze.managers.x) braze.getDeviceDataProvider();
        if (str != null) {
            xVar.getClass();
        }
        str = "";
        xVar.d.writeData(DataStoreKey.GOOGLE_ADVERTISING_ID, str);
        ((com.braze.managers.x) braze.getDeviceDataProvider()).d.writeData(DataStoreKey.AD_TRACKING_ENABLED, Boolean.valueOf(!z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGoogleAdvertisingId$lambda$156$lambda$155(String str, boolean z) {
        return "Setting Google Advertising ID: " + str + " and limit-ad-tracking: " + z;
    }

    public static final void setOutboundNetworkRequestsOffline(boolean z) {
        INSTANCE.setOutboundNetworkRequestsOffline(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSdkAuthenticationSignature$lambda$157(String str) {
        return "Failed to set SDK authentication signature on device.\n" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSdkAuthenticationSignature$lambda$160(Braze braze, final String str) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda104
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String sdkAuthenticationSignature$lambda$160$lambda$158;
                sdkAuthenticationSignature$lambda$160$lambda$158 = Braze.setSdkAuthenticationSignature$lambda$160$lambda$158(str);
                return sdkAuthenticationSignature$lambda$160$lambda$158;
            }
        }, 6, (Object) null);
        if (StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda105
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String sdkAuthenticationSignature$lambda$160$lambda$159;
                    sdkAuthenticationSignature$lambda$160$lambda$159 = Braze.setSdkAuthenticationSignature$lambda$160$lambda$159();
                    return sdkAuthenticationSignature$lambda$160$lambda$159;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        ((j1) braze.getUdm$android_sdk_base_release()).v.b(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSdkAuthenticationSignature$lambda$160$lambda$158(String str) {
        return "Got new sdk auth signature " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSdkAuthenticationSignature$lambda$160$lambda$159() {
        return "SDK authentication signature cannot be null or blank";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSyncPolicyOfflineStatus(final boolean isOffline) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda156
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String syncPolicyOfflineStatus$lambda$202;
                syncPolicyOfflineStatus$lambda$202 = Braze.setSyncPolicyOfflineStatus$lambda$202(isOffline);
                return syncPolicyOfflineStatus$lambda$202;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda157
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit syncPolicyOfflineStatus$lambda$204;
                syncPolicyOfflineStatus$lambda$204 = Braze.setSyncPolicyOfflineStatus$lambda$204(Braze.this, isOffline);
                return syncPolicyOfflineStatus$lambda$204;
            }
        }, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSyncPolicyOfflineStatus$lambda$202(boolean z) {
        return "Failed to set sync policy offline to " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSyncPolicyOfflineStatus$lambda$204(Braze braze, final boolean z) {
        ((j1) braze.getUdm$android_sdk_base_release()).y.getClass();
        com.braze.dispatch.f fVar = ((j1) braze.getUdm$android_sdk_base_release()).r;
        synchronized (fVar) {
            fVar.l = z;
            fVar.b();
            if (z) {
                fVar.f();
            } else {
                fVar.c();
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String syncPolicyOfflineStatus$lambda$204$lambda$203;
                syncPolicyOfflineStatus$lambda$204$lambda$203 = Braze.setSyncPolicyOfflineStatus$lambda$204$lambda$203(z);
                return syncPolicyOfflineStatus$lambda$204$lambda$203;
            }
        }, 7, (Object) null);
        braze.getImageLoader().setOffline(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSyncPolicyOfflineStatus$lambda$204$lambda$203(boolean z) {
        return "Setting the image loader deny network downloads to " + z;
    }

    private final void setUserSpecificMemberVariablesAndStartDispatch(j1 dependencyProvider) {
        setUdm$android_sdk_base_release(dependencyProvider);
        com.braze.coroutine.f fVar = com.braze.coroutine.f.f492a;
        com.braze.coroutine.f.b = ((j1) getUdm$android_sdk_base_release()).n;
        DataStoreProvider.INSTANCE.setEventPublisher$android_sdk_base_release(((j1) getUdm$android_sdk_base_release()).n);
        n3 d = ((j1) getUdm$android_sdk_base_release()).d();
        r rVar = ((j1) getUdm$android_sdk_base_release()).y;
        com.braze.configuration.e eVar = this.offlineUserStorageProvider;
        BrazeUser brazeUser = null;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
            eVar = null;
        }
        this.brazeUser = new BrazeUser(d, rVar, eVar.a(), ((j1) getUdm$android_sdk_base_release()).A, ((j1) getUdm$android_sdk_base_release()).o);
        ((j1) getUdm$android_sdk_base_release()).q.a(((j1) getUdm$android_sdk_base_release()).n);
        ((j1) getUdm$android_sdk_base_release()).n.a();
        ((j1) getUdm$android_sdk_base_release()).t.a(((j1) getUdm$android_sdk_base_release()).n);
        ((j1) getUdm$android_sdk_base_release()).F.i();
        com.braze.events.e eVar2 = this.externalIEventMessenger;
        BrazeUser brazeUser2 = this.brazeUser;
        if (brazeUser2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
            brazeUser2 = null;
        }
        ((com.braze.events.d) eVar2).b(new BrazeUserChangeEvent(brazeUser2.getUserId()), BrazeUserChangeEvent.class);
        com.braze.events.d dVar = ((j1) getUdm$android_sdk_base_release()).n;
        BrazeUser brazeUser3 = this.brazeUser;
        if (brazeUser3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
        } else {
            brazeUser = brazeUser3;
        }
        dVar.b(new BrazeUserChangeEvent(brazeUser.getUserId()), BrazeUserChangeEvent.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersErrors$lambda$116() {
        return "Failed to add subscriber for Banner errors.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersUpdates$lambda$112() {
        return "Failed to send cached banners upon subscribeToBannersUpdates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToBannersUpdates$lambda$114(Braze braze) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda67
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String subscribeToBannersUpdates$lambda$114$lambda$113;
                subscribeToBannersUpdates$lambda$114$lambda$113 = Braze.subscribeToBannersUpdates$lambda$114$lambda$113();
                return subscribeToBannersUpdates$lambda$114$lambda$113;
            }
        }, 7, (Object) null);
        if (((j1) braze.getUdm$android_sdk_base_release()).o.d()) {
            com.braze.managers.j jVar = ((j1) braze.getUdm$android_sdk_base_release()).C;
            jVar.getClass();
            List list = jVar.f;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Banner) it.next()).deepcopy$android_sdk_base_release());
            }
            ((com.braze.events.d) jVar.b).b(new BannersUpdatedEvent(arrayList), BannersUpdatedEvent.class);
        } else {
            ((j1) braze.getUdm$android_sdk_base_release()).n.b(new BannersUpdatedEvent(CollectionsKt.emptyList()), BannersUpdatedEvent.class);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersUpdates$lambda$114$lambda$113() {
        return "Sending cached update upon banners subscription";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersUpdates$lambda$115() {
        return "Failed to add subscriber for Banner updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToChangeUserEvents$lambda$121() {
        return "Failed to send initial BrazeUserChangeEvent upon subscribeToChangeUserEvents.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToChangeUserEvents$lambda$123(Braze braze) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda167
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String subscribeToChangeUserEvents$lambda$123$lambda$122;
                subscribeToChangeUserEvents$lambda$123$lambda$122 = Braze.subscribeToChangeUserEvents$lambda$123$lambda$122();
                return subscribeToChangeUserEvents$lambda$123$lambda$122;
            }
        }, 7, (Object) null);
        com.braze.events.e eVar = braze.externalIEventMessenger;
        BrazeUser brazeUser = braze.brazeUser;
        if (brazeUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
            brazeUser = null;
        }
        ((com.braze.events.d) eVar).b(new BrazeUserChangeEvent(brazeUser.getUserId()), BrazeUserChangeEvent.class);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToChangeUserEvents$lambda$123$lambda$122() {
        return "Sending initial BrazeUserChangeEvent upon subscribeToChangeUserEvents";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToChangeUserEvents$lambda$124() {
        return "Failed to add subscriber for braze user change events.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$104() {
        return "Failed to send cached content cards upon subscribeToContentCardsUpdates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToContentCardsUpdates$lambda$106(Braze braze) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda55
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String subscribeToContentCardsUpdates$lambda$106$lambda$105;
                subscribeToContentCardsUpdates$lambda$106$lambda$105 = Braze.subscribeToContentCardsUpdates$lambda$106$lambda$105();
                return subscribeToContentCardsUpdates$lambda$106$lambda$105;
            }
        }, 7, (Object) null);
        if (((j1) braze.getUdm$android_sdk_base_release()).o.E()) {
            com.braze.events.e eVar = braze.externalIEventMessenger;
            ((com.braze.events.d) eVar).b(((j1) braze.getUdm$android_sdk_base_release()).D.a(true, (Long) null), ContentCardsUpdatedEvent.class);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$106$lambda$105() {
        return "Sending cached update upon content card subscription";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$107() {
        return "Failed to add subscriber for Content Cards updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToFeatureFlagsUpdates$lambda$108() {
        return "Failed to send cached feature flags upon subscribeToFeatureFlagsUpdates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToFeatureFlagsUpdates$lambda$110(Braze braze) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda94
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String subscribeToFeatureFlagsUpdates$lambda$110$lambda$109;
                subscribeToFeatureFlagsUpdates$lambda$110$lambda$109 = Braze.subscribeToFeatureFlagsUpdates$lambda$110$lambda$109();
                return subscribeToFeatureFlagsUpdates$lambda$110$lambda$109;
            }
        }, 7, (Object) null);
        if (((j1) braze.getUdm$android_sdk_base_release()).o.H()) {
            com.braze.managers.k0 k0Var = ((j1) braze.getUdm$android_sdk_base_release()).B;
            if (k0Var.g.get()) {
                List list = k0Var.f;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
                }
                ((com.braze.events.d) k0Var.b).b(new FeatureFlagsUpdatedEvent(arrayList), FeatureFlagsUpdatedEvent.class);
            }
        } else {
            ((j1) braze.getUdm$android_sdk_base_release()).n.b(new com.braze.events.internal.j(), com.braze.events.internal.j.class);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToFeatureFlagsUpdates$lambda$110$lambda$109() {
        return "Sending cached update upon feature flag subscription";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToFeatureFlagsUpdates$lambda$111() {
        return "Failed to add subscriber for Feature Flags updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToNetworkFailures$lambda$118() {
        return "Failed to add subscriber for network failures.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToNewInAppMessages$lambda$102() {
        return "Failed to add subscriber to new in-app messages.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToNoMatchingTriggerForEvent$lambda$103() {
        return "Failed to add subscriber to no matching trigger events.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToPushNotificationEvents$lambda$120() {
        return "Failed to add subscriber for push notification updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToSdkAuthenticationFailures$lambda$119() {
        return "Failed to add subscriber for SDK authentication failures.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToSessionUpdates$lambda$117() {
        return "Failed to add subscriber for session updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String validateAndStorePushId$lambda$201() {
        return "Failed to validate and store push identifier";
    }

    private final void verifyProperSdkSetup() {
        boolean z = true;
        for (final String str : NECESSARY_BRAZE_SDK_PERMISSIONS) {
            if (!PermissionUtils.hasPermission(this.applicationContext, str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda171
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String verifyProperSdkSetup$lambda$207;
                        verifyProperSdkSetup$lambda$207 = Braze.verifyProperSdkSetup$lambda$207(str);
                        return verifyProperSdkSetup$lambda$207;
                    }
                }, 6, (Object) null);
                z = false;
            }
        }
        if (StringsKt.isBlank(getConfigurationProvider$android_sdk_base_release().getBrazeApiKey().f639a)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda172
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String verifyProperSdkSetup$lambda$208;
                    verifyProperSdkSetup$lambda$208 = Braze.verifyProperSdkSetup$lambda$208();
                    return verifyProperSdkSetup$lambda$208;
                }
            }, 6, (Object) null);
            z = false;
        }
        if (z) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda174
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String verifyProperSdkSetup$lambda$209;
                verifyProperSdkSetup$lambda$209 = Braze.verifyProperSdkSetup$lambda$209();
                return verifyProperSdkSetup$lambda$209;
            }
        }, 6, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyProperSdkSetup$lambda$207(String str) {
        return "The Braze SDK requires the permission " + str + ". Check your AndroidManifest.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyProperSdkSetup$lambda$208() {
        return "The Braze SDK requires a non-empty API key. Check your braze.xml or BrazeConfig.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyProperSdkSetup$lambda$209() {
        return "The Braze SDK is not integrated correctly. Please visit https://www.braze.com/docs/developer_guide/platform_integration_guides/android/initial_sdk_setup/android_sdk_integration/";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String waitForUserDependencyThread$lambda$214() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String waitForUserDependencyThread$lambda$215() {
        return "Caught exception while waiting for previous tasks in serial work queue to finish.";
    }

    @JvmStatic
    public static final void wipeData(Context context) {
        INSTANCE.wipeData(context);
    }

    public final /* synthetic */ void addSerializedCardJsonToStorage$android_sdk_base_release(final String serializedCardJson, final String userId) {
        Intrinsics.checkNotNullParameter(serializedCardJson, "serializedCardJson");
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda202
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String addSerializedCardJsonToStorage$lambda$168;
                addSerializedCardJsonToStorage$lambda$168 = Braze.addSerializedCardJsonToStorage$lambda$168(userId, serializedCardJson);
                return addSerializedCardJsonToStorage$lambda$168;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda203
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit addSerializedCardJsonToStorage$lambda$170;
                addSerializedCardJsonToStorage$lambda$170 = Braze.addSerializedCardJsonToStorage$lambda$170(serializedCardJson, this, userId);
                return addSerializedCardJsonToStorage$lambda$170;
            }
        }, 14, null);
    }

    @Override // com.braze.IBraze
    public <T> void addSingleSynchronousSubscription(IEventSubscriber<T> subscriber, final Class<T> eventClass) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).c(eventClass, subscriber);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda204
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addSingleSynchronousSubscription$lambda$125;
                    addSingleSynchronousSubscription$lambda$125 = Braze.addSingleSynchronousSubscription$lambda$125(eventClass);
                    return addSingleSynchronousSubscription$lambda$125;
                }
            }, 4, (Object) null);
            publishError(e);
        }
    }

    public final /* synthetic */ void applyPendingRuntimeConfiguration$android_sdk_base_release() {
        ReentrantLock reentrantLock = brazeClassLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda168
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String applyPendingRuntimeConfiguration$lambda$188$lambda$185;
                    applyPendingRuntimeConfiguration$lambda$188$lambda$185 = Braze.applyPendingRuntimeConfiguration$lambda$188$lambda$185();
                    return applyPendingRuntimeConfiguration$lambda$188$lambda$185;
                }
            }, 7, (Object) null);
            Braze braze = this;
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = new RuntimeAppConfigurationProvider(braze.applicationContext);
            for (final BrazeConfig brazeConfig : pendingConfigurations) {
                if (Intrinsics.areEqual(brazeConfig, clearConfigSentinel)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda169
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String applyPendingRuntimeConfiguration$lambda$188$lambda$186;
                            applyPendingRuntimeConfiguration$lambda$188$lambda$186 = Braze.applyPendingRuntimeConfiguration$lambda$188$lambda$186();
                            return applyPendingRuntimeConfiguration$lambda$188$lambda$186;
                        }
                    }, 6, (Object) null);
                    runtimeAppConfigurationProvider.clearAllConfigurationValues();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda170
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String applyPendingRuntimeConfiguration$lambda$188$lambda$187;
                            applyPendingRuntimeConfiguration$lambda$188$lambda$187 = Braze.applyPendingRuntimeConfiguration$lambda$188$lambda$187(BrazeConfig.this);
                            return applyPendingRuntimeConfiguration$lambda$188$lambda$187;
                        }
                    }, 6, (Object) null);
                    runtimeAppConfigurationProvider.setConfiguration(brazeConfig);
                }
                braze = this;
            }
            pendingConfigurations.clear();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean areCachedContentCardsStale() {
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.isTimestampOlderThan(60L);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda142
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String areCachedContentCardsStale$lambda$144;
                areCachedContentCardsStale$lambda$144 = Braze.areCachedContentCardsStale$lambda$144();
                return areCachedContentCardsStale$lambda$144;
            }
        }, 6, (Object) null);
        return false;
    }

    @Override // com.braze.IBraze
    public void changeUser(String userId) {
        changeUser(userId, null);
    }

    @Override // com.braze.IBraze
    public void closeSession(Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda161
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String closeSession$lambda$41;
                    closeSession$lambda$41 = Braze.closeSession$lambda$41();
                    return closeSession$lambda$41;
                }
            }, 6, (Object) null);
        } else {
            final com.braze.managers.a aVar = new com.braze.managers.a(activity.getClass());
            run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda163
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String closeSession$lambda$42;
                    closeSession$lambda$42 = Braze.closeSession$lambda$42();
                    return closeSession$lambda$42;
                }
            }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda164
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit closeSession$lambda$43;
                    closeSession$lambda$43 = Braze.closeSession$lambda$43(Braze.this, aVar);
                    return closeSession$lambda$43;
                }
            }, 14, null);
        }
    }

    public final void deleteRegisteredGeofenceCache$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda85
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String deleteRegisteredGeofenceCache$lambda$183;
                deleteRegisteredGeofenceCache$lambda$183 = Braze.deleteRegisteredGeofenceCache$lambda$183();
                return deleteRegisteredGeofenceCache$lambda$183;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda86
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit deleteRegisteredGeofenceCache$lambda$184;
                deleteRegisteredGeofenceCache$lambda$184 = Braze.deleteRegisteredGeofenceCache$lambda$184(Braze.this);
                return deleteRegisteredGeofenceCache$lambda$184;
            }
        }, 14, null);
    }

    @Override // com.braze.IBraze
    public Card deserializeContentCard(final String contentCardString) {
        if (contentCardString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda139
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String deserializeContentCard$lambda$145;
                    deserializeContentCard$lambda$145 = Braze.deserializeContentCard$lambda$145();
                    return deserializeContentCard$lambda$145;
                }
            }, 6, (Object) null);
            return null;
        }
        try {
            return deserializeContentCard(new JSONObject(contentCardString));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda141
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String deserializeContentCard$lambda$146;
                    deserializeContentCard$lambda$146 = Braze.deserializeContentCard$lambda$146(contentCardString);
                    return deserializeContentCard$lambda$146;
                }
            }, 4, (Object) null);
            publishError(e);
            return null;
        }
    }

    @Override // com.braze.IBraze
    public IInAppMessage deserializeInAppMessageString(final String inAppMessageString) {
        return (IInAppMessage) runForResult$android_sdk_base_release$default(this, null, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda115
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String deserializeInAppMessageString$lambda$148;
                deserializeInAppMessageString$lambda$148 = Braze.deserializeInAppMessageString$lambda$148(inAppMessageString);
                return deserializeInAppMessageString$lambda$148;
            }
        }, false, false, false, new d(inAppMessageString, this, null), 28, null);
    }

    @Override // com.braze.IBraze
    public List<FeatureFlag> getAllFeatureFlags() {
        return (List) runForResult$android_sdk_base_release$default(this, CollectionsKt.emptyList(), new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda99
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String allFeatureFlags$lambda$81;
                allFeatureFlags$lambda$81 = Braze.getAllFeatureFlags$lambda$81();
                return allFeatureFlags$lambda$81;
            }
        }, false, false, false, new f(this, null), 28, null);
    }

    @Override // com.braze.IBraze
    public Banner getBanner(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return (Banner) runForResult$android_sdk_base_release$default(this, null, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda114
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String banner$lambda$95;
                banner$lambda$95 = Braze.getBanner$lambda$95(id);
                return banner$lambda$95;
            }
        }, false, false, false, new g(this, id, null), 28, null);
    }

    @Override // com.braze.IBraze
    public List<Card> getCachedContentCards() {
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getAllCards();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String cachedContentCards$lambda$143;
                cachedContentCards$lambda$143 = Braze.getCachedContentCards$lambda$143();
                return cachedContentCards$lambda$143;
            }
        }, 6, (Object) null);
        return null;
    }

    public final BrazeConfigurationProvider getConfigurationProvider$android_sdk_base_release() {
        BrazeConfigurationProvider brazeConfigurationProvider = this.configurationProvider;
        if (brazeConfigurationProvider != null) {
            return brazeConfigurationProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("configurationProvider");
        return null;
    }

    public final BrazeConfigurationProvider getConfigurationProviderSafe$android_sdk_base_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.configurationProvider != null) {
            return getConfigurationProvider$android_sdk_base_release();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String configurationProviderSafe$lambda$216;
                configurationProviderSafe$lambda$216 = Braze.getConfigurationProviderSafe$lambda$216();
                return configurationProviderSafe$lambda$216;
            }
        }, 7, (Object) null);
        return new BrazeConfigurationProvider(context);
    }

    @Override // com.braze.IBraze
    public int getContentCardCount() {
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getCardCount();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda179
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String contentCardCount$lambda$140;
                contentCardCount$lambda$140 = Braze.getContentCardCount$lambda$140();
                return contentCardCount$lambda$140;
            }
        }, 6, (Object) null);
        return -1;
    }

    @Override // com.braze.IBraze
    public int getContentCardUnviewedCount() {
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getUnviewedCardCount();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda95
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String contentCardUnviewedCount$lambda$141;
                contentCardUnviewedCount$lambda$141 = Braze.getContentCardUnviewedCount$lambda$141();
                return contentCardUnviewedCount$lambda$141;
            }
        }, 6, (Object) null);
        return -1;
    }

    @Override // com.braze.IBraze
    public long getContentCardsLastUpdatedInSecondsFromEpoch() {
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getTimestampSeconds();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda58
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String contentCardsLastUpdatedInSecondsFromEpoch$lambda$142;
                contentCardsLastUpdatedInSecondsFromEpoch$lambda$142 = Braze.getContentCardsLastUpdatedInSecondsFromEpoch$lambda$142();
                return contentCardsLastUpdatedInSecondsFromEpoch$lambda$142;
            }
        }, 6, (Object) null);
        return -1L;
    }

    @Override // com.braze.IBraze
    public BrazeUser getCurrentUser() {
        return (BrazeUser) runForResult$android_sdk_base_release(null, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda162
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _get_currentUser_$lambda$30;
                _get_currentUser_$lambda$30 = Braze._get_currentUser_$lambda$30();
                return _get_currentUser_$lambda$30;
            }
        }, false, false, true, new b(this, null));
    }

    @Override // com.braze.IBraze
    public String getDeviceId() {
        return (String) runForResult$android_sdk_base_release("", new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda138
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _get_deviceId_$lambda$29;
                _get_deviceId_$lambda$29 = Braze._get_deviceId_$lambda$29();
                return _get_deviceId_$lambda$29;
            }
        }, false, false, false, new e(this, null));
    }

    @Override // com.braze.IBraze
    public void getDeviceIdAsync(IValueCallback<String> completionCallback) {
        Intrinsics.checkNotNullParameter(completionCallback, "completionCallback");
        try {
            BuildersKt__Builders_commonKt.launch$default(com.braze.coroutine.f.f492a, null, null, new k(completionCallback, this, null), 3, null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda116
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String deviceIdAsync$lambda$139;
                    deviceIdAsync$lambda$139 = Braze.getDeviceIdAsync$lambda$139();
                    return deviceIdAsync$lambda$139;
                }
            }, 4, (Object) null);
            completionCallback.onError();
            publishError(e);
        }
    }

    public final o0 getDeviceIdProvider$android_sdk_base_release() {
        o0 o0Var = this.deviceIdProvider;
        if (o0Var != null) {
            return o0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceIdProvider");
        return null;
    }

    /* renamed from: getExternalIEventMessenger$android_sdk_base_release, reason: from getter */
    public final com.braze.events.e getExternalIEventMessenger() {
        return this.externalIEventMessenger;
    }

    @Override // com.braze.IBraze
    public FeatureFlag getFeatureFlag(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return (FeatureFlag) runForResult$android_sdk_base_release$default(this, null, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda53
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String featureFlag$lambda$82;
                featureFlag$lambda$82 = Braze.getFeatureFlag$lambda$82(id);
                return featureFlag$lambda$82;
            }
        }, false, false, false, new l(this, id, null), 28, null);
    }

    @Override // com.braze.IBraze
    public IBrazeImageLoader getImageLoader() {
        return this.imageLoader;
    }

    public final v0 getPushDeliveryManager$android_sdk_base_release() {
        v0 v0Var = this.pushDeliveryManager;
        if (v0Var != null) {
            return v0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pushDeliveryManager");
        return null;
    }

    @Override // com.braze.IBraze
    public String getRegisteredPushToken() {
        return (String) runForResult$android_sdk_base_release$default(this, null, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda93
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _get_registeredPushToken_$lambda$31;
                _get_registeredPushToken_$lambda$31 = Braze._get_registeredPushToken_$lambda$31();
                return _get_registeredPushToken_$lambda$31;
            }
        }, false, false, false, new n(this, null), 28, null);
    }

    public final q0 getRegistrationDataProvider$android_sdk_base_release() {
        q0 q0Var = this.registrationDataProvider;
        if (q0Var != null) {
            return q0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("registrationDataProvider");
        return null;
    }

    public final r0 getUdm$android_sdk_base_release() {
        r0 r0Var = this.udm;
        if (r0Var != null) {
            return r0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("udm");
        return null;
    }

    public final /* synthetic */ void handleInAppMessageTestPush$android_sdk_base_release(final Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda153
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String handleInAppMessageTestPush$lambda$179;
                handleInAppMessageTestPush$lambda$179 = Braze.handleInAppMessageTestPush$lambda$179();
                return handleInAppMessageTestPush$lambda$179;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda154
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit handleInAppMessageTestPush$lambda$180;
                handleInAppMessageTestPush$lambda$180 = Braze.handleInAppMessageTestPush$lambda$180(intent, this);
                return handleInAppMessageTestPush$lambda$180;
            }
        }, 14, null);
    }

    public final /* synthetic */ void handleInternalBannerRefresh$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda76
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String handleInternalBannerRefresh$lambda$181;
                handleInternalBannerRefresh$lambda$181 = Braze.handleInternalBannerRefresh$lambda$181();
                return handleInternalBannerRefresh$lambda$181;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda78
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit handleInternalBannerRefresh$lambda$182;
                handleInternalBannerRefresh$lambda$182 = Braze.handleInternalBannerRefresh$lambda$182(Braze.this);
                return handleInternalBannerRefresh$lambda$182;
            }
        }, 14, null);
    }

    /* renamed from: isApiKeyPresent$android_sdk_base_release, reason: from getter */
    public final Boolean getIsApiKeyPresent() {
        return this.isApiKeyPresent;
    }

    @Override // com.braze.IBraze
    public void logBannerClick(final String placementId, final String buttonId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda72
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logBannerClick$lambda$97;
                logBannerClick$lambda$97 = Braze.logBannerClick$lambda$97(placementId);
                return logBannerClick$lambda$97;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda73
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logBannerClick$lambda$98;
                logBannerClick$lambda$98 = Braze.logBannerClick$lambda$98(Braze.this, placementId, buttonId);
                return logBannerClick$lambda$98;
            }
        }, 14, null);
    }

    @Override // com.braze.IBraze
    public boolean logBannerImpression(final String placementId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        return ((Boolean) runForResult$android_sdk_base_release$default(this, Boolean.FALSE, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda101
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logBannerImpression$lambda$96;
                logBannerImpression$lambda$96 = Braze.logBannerImpression$lambda$96(placementId);
                return logBannerImpression$lambda$96;
            }
        }, false, false, false, new m(this, placementId, null), 28, null)).booleanValue();
    }

    @Override // com.braze.IBraze
    public void logCustomEvent(String eventName) {
        logCustomEvent(eventName, null);
    }

    @Override // com.braze.IBraze
    public void logFeatureFlagImpression(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logFeatureFlagImpression$lambda$83;
                logFeatureFlagImpression$lambda$83 = Braze.logFeatureFlagImpression$lambda$83();
                return logFeatureFlagImpression$lambda$83;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logFeatureFlagImpression$lambda$84;
                logFeatureFlagImpression$lambda$84 = Braze.logFeatureFlagImpression$lambda$84(Braze.this, id);
                return logFeatureFlagImpression$lambda$84;
            }
        }, 14, null);
    }

    public final /* synthetic */ void logLocationRecordedEventFromLocationUpdate$android_sdk_base_release(final IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda121
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logLocationRecordedEventFromLocationUpdate$lambda$171;
                logLocationRecordedEventFromLocationUpdate$lambda$171 = Braze.logLocationRecordedEventFromLocationUpdate$lambda$171();
                return logLocationRecordedEventFromLocationUpdate$lambda$171;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda122
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logLocationRecordedEventFromLocationUpdate$lambda$174;
                logLocationRecordedEventFromLocationUpdate$lambda$174 = Braze.logLocationRecordedEventFromLocationUpdate$lambda$174(Braze.this, location);
                return logLocationRecordedEventFromLocationUpdate$lambda$174;
            }
        }, 14, null);
    }

    @Override // com.braze.IBraze
    public void logPurchase(String productId, String currencyCode, BigDecimal price) {
        logPurchase(productId, currencyCode, price, 1);
    }

    public final /* synthetic */ void logPushDelivery$android_sdk_base_release(final String campaignId, final long timeInMs) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda206
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logPushDelivery$lambda$193;
                logPushDelivery$lambda$193 = Braze.logPushDelivery$lambda$193(campaignId);
                return logPushDelivery$lambda$193;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logPushDelivery$lambda$194;
                logPushDelivery$lambda$194 = Braze.logPushDelivery$lambda$194(Braze.this, campaignId, timeInMs);
                return logPushDelivery$lambda$194;
            }
        }, 14, null);
    }

    public final /* synthetic */ void logPushMaxCampaign$android_sdk_base_release(final String campaign) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda79
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logPushMaxCampaign$lambda$199;
                logPushMaxCampaign$lambda$199 = Braze.logPushMaxCampaign$lambda$199();
                return logPushMaxCampaign$lambda$199;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda80
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logPushMaxCampaign$lambda$200;
                logPushMaxCampaign$lambda$200 = Braze.logPushMaxCampaign$lambda$200(Braze.this, campaign);
                return logPushMaxCampaign$lambda$200;
            }
        }, 14, null);
    }

    @Override // com.braze.IBraze
    public void logPushNotificationActionClicked(final String campaignId, final String actionId, final String actionType) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda68
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logPushNotificationActionClicked$lambda$63;
                logPushNotificationActionClicked$lambda$63 = Braze.logPushNotificationActionClicked$lambda$63();
                return logPushNotificationActionClicked$lambda$63;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda69
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logPushNotificationActionClicked$lambda$67;
                logPushNotificationActionClicked$lambda$67 = Braze.logPushNotificationActionClicked$lambda$67(campaignId, this, actionId, actionType);
                return logPushNotificationActionClicked$lambda$67;
            }
        }, 10, null);
    }

    @Override // com.braze.IBraze
    public void logPushNotificationOpened(final String campaignId) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda128
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logPushNotificationOpened$lambda$55;
                logPushNotificationOpened$lambda$55 = Braze.logPushNotificationOpened$lambda$55(campaignId);
                return logPushNotificationOpened$lambda$55;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda130
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logPushNotificationOpened$lambda$57;
                logPushNotificationOpened$lambda$57 = Braze.logPushNotificationOpened$lambda$57(campaignId, this);
                return logPushNotificationOpened$lambda$57;
            }
        }, 10, null);
    }

    @Override // com.braze.IBraze
    public void logPushStoryPageClicked(final String campaignId, final String pageId) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda191
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logPushStoryPageClicked$lambda$68;
                logPushStoryPageClicked$lambda$68 = Braze.logPushStoryPageClicked$lambda$68(pageId, campaignId);
                return logPushStoryPageClicked$lambda$68;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda192
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logPushStoryPageClicked$lambda$71;
                logPushStoryPageClicked$lambda$71 = Braze.logPushStoryPageClicked$lambda$71(campaignId, pageId, this);
                return logPushStoryPageClicked$lambda$71;
            }
        }, 10, null);
    }

    @Override // com.braze.IBraze
    public void openSession(Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda176
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String openSession$lambda$38;
                    openSession$lambda$38 = Braze.openSession$lambda$38();
                    return openSession$lambda$38;
                }
            }, 6, (Object) null);
        } else {
            final com.braze.managers.a aVar = new com.braze.managers.a(activity.getClass());
            run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda177
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String openSession$lambda$39;
                    openSession$lambda$39 = Braze.openSession$lambda$39();
                    return openSession$lambda$39;
                }
            }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda178
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit openSession$lambda$40;
                    openSession$lambda$40 = Braze.openSession$lambda$40(Braze.this, aVar);
                    return openSession$lambda$40;
                }
            }, 14, null);
        }
    }

    public final /* synthetic */ void performPushDeliveryFlush$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda91
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String performPushDeliveryFlush$lambda$197;
                performPushDeliveryFlush$lambda$197 = Braze.performPushDeliveryFlush$lambda$197();
                return performPushDeliveryFlush$lambda$197;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda92
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit performPushDeliveryFlush$lambda$198;
                performPushDeliveryFlush$lambda$198 = Braze.performPushDeliveryFlush$lambda$198(Braze.this);
                return performPushDeliveryFlush$lambda$198;
            }
        }, 14, null);
    }

    public final /* synthetic */ void publishBrazePushAction$android_sdk_base_release(BrazePushEventType pushActionType, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(pushActionType, "pushActionType");
        Intrinsics.checkNotNullParameter(payload, "payload");
        ((com.braze.events.d) this.externalIEventMessenger).b(new BrazePushEvent(pushActionType, payload), BrazePushEvent.class);
    }

    public final /* synthetic */ void recordGeofenceTransition$android_sdk_base_release(final String geofenceId, final GeofenceTransitionType transitionType) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda117
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String recordGeofenceTransition$lambda$161;
                recordGeofenceTransition$lambda$161 = Braze.recordGeofenceTransition$lambda$161();
                return recordGeofenceTransition$lambda$161;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda118
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit recordGeofenceTransition$lambda$162;
                recordGeofenceTransition$lambda$162 = Braze.recordGeofenceTransition$lambda$162(geofenceId, transitionType, this);
                return recordGeofenceTransition$lambda$162;
            }
        }, 14, null);
    }

    public final void reenqueueInAppMessage$android_sdk_base_release(final InAppMessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda62
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String reenqueueInAppMessage$lambda$191;
                reenqueueInAppMessage$lambda$191 = Braze.reenqueueInAppMessage$lambda$191(InAppMessageEvent.this);
                return reenqueueInAppMessage$lambda$191;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda63
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit reenqueueInAppMessage$lambda$192;
                reenqueueInAppMessage$lambda$192 = Braze.reenqueueInAppMessage$lambda$192(Braze.this, event);
                return reenqueueInAppMessage$lambda$192;
            }
        }, 14, null);
    }

    @Override // com.braze.IBraze
    public void refreshFeatureFlags() {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda96
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String refreshFeatureFlags$lambda$78;
                refreshFeatureFlags$lambda$78 = Braze.refreshFeatureFlags$lambda$78();
                return refreshFeatureFlags$lambda$78;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda97
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit refreshFeatureFlags$lambda$80;
                refreshFeatureFlags$lambda$80 = Braze.refreshFeatureFlags$lambda$80(Braze.this);
                return refreshFeatureFlags$lambda$80;
            }
        }, 14, null);
    }

    @Override // com.braze.IBraze
    public <T> void removeSingleSubscription(final IEventSubscriber<T> subscriber, final Class<T> eventClass) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        if (subscriber != null) {
            try {
                final boolean a2 = ((com.braze.events.d) this.externalIEventMessenger).a((Class) eventClass, (IEventSubscriber) subscriber);
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.V;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda198
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String removeSingleSubscription$lambda$128$lambda$126;
                        removeSingleSubscription$lambda$128$lambda$126 = Braze.removeSingleSubscription$lambda$128$lambda$126(eventClass, subscriber, a2);
                        return removeSingleSubscription$lambda$128$lambda$126;
                    }
                }, 6, (Object) null);
                final boolean b = ((com.braze.events.d) this.externalIEventMessenger).b((Class) eventClass, (IEventSubscriber) subscriber);
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda199
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String removeSingleSubscription$lambda$128$lambda$127;
                        removeSingleSubscription$lambda$128$lambda$127 = Braze.removeSingleSubscription$lambda$128$lambda$127(eventClass, subscriber, b);
                        return removeSingleSubscription$lambda$128$lambda$127;
                    }
                }, 6, (Object) null);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda200
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String removeSingleSubscription$lambda$129;
                        removeSingleSubscription$lambda$129 = Braze.removeSingleSubscription$lambda$129(eventClass);
                        return removeSingleSubscription$lambda$129;
                    }
                }, 4, (Object) null);
                publishError(e);
            }
        }
    }

    @Override // com.braze.IBraze
    public void requestBannersRefresh(List<String> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        requestBannersRefresh(ids, null);
    }

    @Override // com.braze.IBraze
    public void requestContentCardsRefresh() {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda64
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestContentCardsRefresh$lambda$72;
                requestContentCardsRefresh$lambda$72 = Braze.requestContentCardsRefresh$lambda$72();
                return requestContentCardsRefresh$lambda$72;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda65
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestContentCardsRefresh$lambda$75;
                requestContentCardsRefresh$lambda$75 = Braze.requestContentCardsRefresh$lambda$75(Braze.this);
                return requestContentCardsRefresh$lambda$75;
            }
        }, 14, null);
    }

    @Override // com.braze.IBraze
    public void requestContentCardsRefreshFromCache() {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda74
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestContentCardsRefreshFromCache$lambda$76;
                requestContentCardsRefreshFromCache$lambda$76 = Braze.requestContentCardsRefreshFromCache$lambda$76();
                return requestContentCardsRefreshFromCache$lambda$76;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda75
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestContentCardsRefreshFromCache$lambda$77;
                requestContentCardsRefreshFromCache$lambda$77 = Braze.requestContentCardsRefreshFromCache$lambda$77(Braze.this);
                return requestContentCardsRefreshFromCache$lambda$77;
            }
        }, 14, null);
    }

    public final /* synthetic */ void requestGeofenceRefresh$android_sdk_base_release(final IBrazeLocation location) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestGeofenceRefresh$lambda$163;
                requestGeofenceRefresh$lambda$163 = Braze.requestGeofenceRefresh$lambda$163();
                return requestGeofenceRefresh$lambda$163;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestGeofenceRefresh$lambda$165;
                requestGeofenceRefresh$lambda$165 = Braze.requestGeofenceRefresh$lambda$165(IBrazeLocation.this, this);
                return requestGeofenceRefresh$lambda$165;
            }
        }, 14, null);
    }

    @Override // com.braze.IBraze
    public void requestGeofences(final double latitude, final double longitude) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestGeofences$lambda$149;
                requestGeofences$lambda$149 = Braze.requestGeofences$lambda$149();
                return requestGeofences$lambda$149;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestGeofences$lambda$152;
                requestGeofences$lambda$152 = Braze.requestGeofences$lambda$152(latitude, longitude, this);
                return requestGeofences$lambda$152;
            }
        }, 14, null);
    }

    public final /* synthetic */ void requestGeofencesInitialization$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda180
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestGeofencesInitialization$lambda$175;
                requestGeofencesInitialization$lambda$175 = Braze.requestGeofencesInitialization$lambda$175();
                return requestGeofencesInitialization$lambda$175;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda181
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestGeofencesInitialization$lambda$176;
                requestGeofencesInitialization$lambda$176 = Braze.requestGeofencesInitialization$lambda$176(Braze.this);
                return requestGeofencesInitialization$lambda$176;
            }
        }, 14, null);
    }

    @Override // com.braze.IBraze
    public void requestImmediateDataFlush() {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda83
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestImmediateDataFlush$lambda$99;
                requestImmediateDataFlush$lambda$99 = Braze.requestImmediateDataFlush$lambda$99();
                return requestImmediateDataFlush$lambda$99;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda84
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestImmediateDataFlush$lambda$101;
                requestImmediateDataFlush$lambda$101 = Braze.requestImmediateDataFlush$lambda$101(Braze.this);
                return requestImmediateDataFlush$lambda$101;
            }
        }, 14, null);
    }

    @Override // com.braze.IBraze
    public void requestLocationInitialization() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda166
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestLocationInitialization$lambda$153;
                requestLocationInitialization$lambda$153 = Braze.requestLocationInitialization$lambda$153();
                return requestLocationInitialization$lambda$153;
            }
        }, 7, (Object) null);
        requestGeofencesInitialization$android_sdk_base_release();
        requestSingleLocationUpdate$android_sdk_base_release();
    }

    public final /* synthetic */ void requestSingleLocationUpdate$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda87
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestSingleLocationUpdate$lambda$177;
                requestSingleLocationUpdate$lambda$177 = Braze.requestSingleLocationUpdate$lambda$177();
                return requestSingleLocationUpdate$lambda$177;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda89
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestSingleLocationUpdate$lambda$178;
                requestSingleLocationUpdate$lambda$178 = Braze.requestSingleLocationUpdate$lambda$178(Braze.this);
                return requestSingleLocationUpdate$lambda$178;
            }
        }, 14, null);
    }

    public final /* synthetic */ void retryInAppMessage$android_sdk_base_release(final InAppMessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda109
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String retryInAppMessage$lambda$189;
                retryInAppMessage$lambda$189 = Braze.retryInAppMessage$lambda$189(InAppMessageEvent.this);
                return retryInAppMessage$lambda$189;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda112
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit retryInAppMessage$lambda$190;
                retryInAppMessage$lambda$190 = Braze.retryInAppMessage$lambda$190(Braze.this, event);
                return retryInAppMessage$lambda$190;
            }
        }, 14, null);
    }

    public final /* synthetic */ void run$android_sdk_base_release(Function0 errorLog, boolean earlyReturnIfDisabled, boolean earlyReturnIfDelayedInitEnabled, boolean earlyReturnIfUdmUninitialized, Function0 block) {
        Intrinsics.checkNotNullParameter(errorLog, "errorLog");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            BuildersKt__Builders_commonKt.launch$default(com.braze.coroutine.f.f492a, null, null, new p(earlyReturnIfDisabled, earlyReturnIfDelayedInitEnabled, earlyReturnIfUdmUninitialized, this, block, errorLog, null), 3, null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, errorLog, 4, (Object) null);
            publishError(e);
        }
    }

    public final <T> T runForResult$android_sdk_base_release(T defaultValueOnException, Function0<String> errorLog, boolean earlyReturnIfDisabled, boolean earlyReturnIfDelayedInitEnabled, boolean earlyReturnIfUdmUninitialized, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(errorLog, "errorLog");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new t(earlyReturnIfDisabled, defaultValueOnException, earlyReturnIfDelayedInitEnabled, earlyReturnIfUdmUninitialized, this, block, errorLog, null), 1, null);
            return (T) runBlocking$default;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) errorLog, 4, (Object) null);
            publishError(e);
            return defaultValueOnException;
        }
    }

    public final /* synthetic */ void schedulePushDelivery$android_sdk_base_release(final long timeInMs) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda98
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String schedulePushDelivery$lambda$195;
                schedulePushDelivery$lambda$195 = Braze.schedulePushDelivery$lambda$195();
                return schedulePushDelivery$lambda$195;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda100
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit schedulePushDelivery$lambda$196;
                schedulePushDelivery$lambda$196 = Braze.schedulePushDelivery$lambda$196(Braze.this, timeInMs);
                return schedulePushDelivery$lambda$196;
            }
        }, 14, null);
    }

    public final void setApiKeyPresent$android_sdk_base_release(Boolean bool) {
        this.isApiKeyPresent = bool;
    }

    public final void setConfigurationProvider$android_sdk_base_release(BrazeConfigurationProvider brazeConfigurationProvider) {
        Intrinsics.checkNotNullParameter(brazeConfigurationProvider, "<set-?>");
        this.configurationProvider = brazeConfigurationProvider;
    }

    public final void setDeviceIdProvider$android_sdk_base_release(o0 o0Var) {
        Intrinsics.checkNotNullParameter(o0Var, "<set-?>");
        this.deviceIdProvider = o0Var;
    }

    public final void setExternalIEventMessenger$android_sdk_base_release(com.braze.events.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.externalIEventMessenger = eVar;
    }

    @Override // com.braze.IBraze
    public void setGoogleAdvertisingId(final String googleAdvertisingId, final boolean isLimitAdTrackingEnabled) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda144
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String googleAdvertisingId$lambda$154;
                googleAdvertisingId$lambda$154 = Braze.setGoogleAdvertisingId$lambda$154(googleAdvertisingId, isLimitAdTrackingEnabled);
                return googleAdvertisingId$lambda$154;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda145
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit googleAdvertisingId$lambda$156;
                googleAdvertisingId$lambda$156 = Braze.setGoogleAdvertisingId$lambda$156(Braze.this, googleAdvertisingId, isLimitAdTrackingEnabled);
                return googleAdvertisingId$lambda$156;
            }
        }, 14, null);
    }

    @Override // com.braze.IBraze
    public void setImageLoader(IBrazeImageLoader value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.imageLoader.shutdown();
        this.imageLoader = value;
    }

    public final void setPushDeliveryManager$android_sdk_base_release(v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "<set-?>");
        this.pushDeliveryManager = v0Var;
    }

    @Override // com.braze.IBraze
    public void setRegisteredPushToken(final String str) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _set_registeredPushToken_$lambda$32;
                _set_registeredPushToken_$lambda$32 = Braze._set_registeredPushToken_$lambda$32(str);
                return _set_registeredPushToken_$lambda$32;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit _set_registeredPushToken_$lambda$36;
                _set_registeredPushToken_$lambda$36 = Braze._set_registeredPushToken_$lambda$36(Braze.this, str);
                return _set_registeredPushToken_$lambda$36;
            }
        }, 14, null);
    }

    public final void setRegistrationDataProvider$android_sdk_base_release(q0 q0Var) {
        Intrinsics.checkNotNullParameter(q0Var, "<set-?>");
        this.registrationDataProvider = q0Var;
    }

    @Override // com.braze.IBraze
    public void setSdkAuthenticationSignature(final String signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda193
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String sdkAuthenticationSignature$lambda$157;
                sdkAuthenticationSignature$lambda$157 = Braze.setSdkAuthenticationSignature$lambda$157(signature);
                return sdkAuthenticationSignature$lambda$157;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda194
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit sdkAuthenticationSignature$lambda$160;
                sdkAuthenticationSignature$lambda$160 = Braze.setSdkAuthenticationSignature$lambda$160(Braze.this, signature);
                return sdkAuthenticationSignature$lambda$160;
            }
        }, 14, null);
    }

    public final void setUdm$android_sdk_base_release(r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<set-?>");
        this.udm = r0Var;
    }

    @Override // com.braze.IBraze
    public void subscribeToBannersErrors(IEventSubscriber<com.braze.events.internal.b> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(com.braze.events.internal.b.class, subscriber);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda127
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToBannersErrors$lambda$116;
                    subscribeToBannersErrors$lambda$116 = Braze.subscribeToBannersErrors$lambda$116();
                    return subscribeToBannersErrors$lambda$116;
                }
            }, 4, (Object) null);
            publishError(e);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToBannersUpdates(IEventSubscriber<BannersUpdatedEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(BannersUpdatedEvent.class, subscriber);
            run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda59
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToBannersUpdates$lambda$112;
                    subscribeToBannersUpdates$lambda$112 = Braze.subscribeToBannersUpdates$lambda$112();
                    return subscribeToBannersUpdates$lambda$112;
                }
            }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda60
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit subscribeToBannersUpdates$lambda$114;
                    subscribeToBannersUpdates$lambda$114 = Braze.subscribeToBannersUpdates$lambda$114(Braze.this);
                    return subscribeToBannersUpdates$lambda$114;
                }
            }, 14, null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda61
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToBannersUpdates$lambda$115;
                    subscribeToBannersUpdates$lambda$115 = Braze.subscribeToBannersUpdates$lambda$115();
                    return subscribeToBannersUpdates$lambda$115;
                }
            }, 4, (Object) null);
            publishError(e);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToChangeUserEvents(IEventSubscriber<BrazeUserChangeEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).c(BrazeUserChangeEvent.class, subscriber);
            run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda158
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToChangeUserEvents$lambda$121;
                    subscribeToChangeUserEvents$lambda$121 = Braze.subscribeToChangeUserEvents$lambda$121();
                    return subscribeToChangeUserEvents$lambda$121;
                }
            }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda159
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit subscribeToChangeUserEvents$lambda$123;
                    subscribeToChangeUserEvents$lambda$123 = Braze.subscribeToChangeUserEvents$lambda$123(Braze.this);
                    return subscribeToChangeUserEvents$lambda$123;
                }
            }, 14, null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda160
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToChangeUserEvents$lambda$124;
                    subscribeToChangeUserEvents$lambda$124 = Braze.subscribeToChangeUserEvents$lambda$124();
                    return subscribeToChangeUserEvents$lambda$124;
                }
            }, 4, (Object) null);
            publishError(e);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToContentCardsUpdates(IEventSubscriber<ContentCardsUpdatedEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(ContentCardsUpdatedEvent.class, subscriber);
            run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda147
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToContentCardsUpdates$lambda$104;
                    subscribeToContentCardsUpdates$lambda$104 = Braze.subscribeToContentCardsUpdates$lambda$104();
                    return subscribeToContentCardsUpdates$lambda$104;
                }
            }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda148
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit subscribeToContentCardsUpdates$lambda$106;
                    subscribeToContentCardsUpdates$lambda$106 = Braze.subscribeToContentCardsUpdates$lambda$106(Braze.this);
                    return subscribeToContentCardsUpdates$lambda$106;
                }
            }, 14, null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda149
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToContentCardsUpdates$lambda$107;
                    subscribeToContentCardsUpdates$lambda$107 = Braze.subscribeToContentCardsUpdates$lambda$107();
                    return subscribeToContentCardsUpdates$lambda$107;
                }
            }, 4, (Object) null);
            publishError(e);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToFeatureFlagsUpdates(IEventSubscriber<FeatureFlagsUpdatedEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(FeatureFlagsUpdatedEvent.class, subscriber);
            run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda106
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToFeatureFlagsUpdates$lambda$108;
                    subscribeToFeatureFlagsUpdates$lambda$108 = Braze.subscribeToFeatureFlagsUpdates$lambda$108();
                    return subscribeToFeatureFlagsUpdates$lambda$108;
                }
            }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda107
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit subscribeToFeatureFlagsUpdates$lambda$110;
                    subscribeToFeatureFlagsUpdates$lambda$110 = Braze.subscribeToFeatureFlagsUpdates$lambda$110(Braze.this);
                    return subscribeToFeatureFlagsUpdates$lambda$110;
                }
            }, 14, null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda108
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToFeatureFlagsUpdates$lambda$111;
                    subscribeToFeatureFlagsUpdates$lambda$111 = Braze.subscribeToFeatureFlagsUpdates$lambda$111();
                    return subscribeToFeatureFlagsUpdates$lambda$111;
                }
            }, 4, (Object) null);
            publishError(e);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToNetworkFailures(IEventSubscriber<BrazeNetworkFailureEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(BrazeNetworkFailureEvent.class, subscriber);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda110
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToNetworkFailures$lambda$118;
                    subscribeToNetworkFailures$lambda$118 = Braze.subscribeToNetworkFailures$lambda$118();
                    return subscribeToNetworkFailures$lambda$118;
                }
            }, 4, (Object) null);
            publishError(e);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToNewInAppMessages(IEventSubscriber<InAppMessageEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(InAppMessageEvent.class, subscriber);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda195
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToNewInAppMessages$lambda$102;
                    subscribeToNewInAppMessages$lambda$102 = Braze.subscribeToNewInAppMessages$lambda$102();
                    return subscribeToNewInAppMessages$lambda$102;
                }
            }, 4, (Object) null);
            publishError(e);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToNoMatchingTriggerForEvent(IEventSubscriber<NoMatchingTriggerEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(NoMatchingTriggerEvent.class, subscriber);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda155
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToNoMatchingTriggerForEvent$lambda$103;
                    subscribeToNoMatchingTriggerForEvent$lambda$103 = Braze.subscribeToNoMatchingTriggerForEvent$lambda$103();
                    return subscribeToNoMatchingTriggerForEvent$lambda$103;
                }
            }, 4, (Object) null);
            publishError(e);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToPushNotificationEvents(IEventSubscriber<BrazePushEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(BrazePushEvent.class, subscriber);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda71
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToPushNotificationEvents$lambda$120;
                    subscribeToPushNotificationEvents$lambda$120 = Braze.subscribeToPushNotificationEvents$lambda$120();
                    return subscribeToPushNotificationEvents$lambda$120;
                }
            }, 4, (Object) null);
            publishError(e);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToSdkAuthenticationFailures(IEventSubscriber<BrazeSdkAuthenticationErrorEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(BrazeSdkAuthenticationErrorEvent.class, subscriber);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda137
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToSdkAuthenticationFailures$lambda$119;
                    subscribeToSdkAuthenticationFailures$lambda$119 = Braze.subscribeToSdkAuthenticationFailures$lambda$119();
                    return subscribeToSdkAuthenticationFailures$lambda$119;
                }
            }, 4, (Object) null);
            publishError(e);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToSessionUpdates(IEventSubscriber<SessionStateChangedEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(SessionStateChangedEvent.class, subscriber);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda57
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToSessionUpdates$lambda$117;
                    subscribeToSessionUpdates$lambda$117 = Braze.subscribeToSessionUpdates$lambda$117();
                    return subscribeToSessionUpdates$lambda$117;
                }
            }, 4, (Object) null);
            publishError(e);
        }
    }

    public final /* synthetic */ boolean validateAndStorePushId$android_sdk_base_release(String pushId) {
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        return ((Boolean) runForResult$android_sdk_base_release$default(this, Boolean.TRUE, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String validateAndStorePushId$lambda$201;
                validateAndStorePushId$lambda$201 = Braze.validateAndStorePushId$lambda$201();
                return validateAndStorePushId$lambda$201;
            }
        }, false, false, false, new u(this, pushId, null), 28, null)).booleanValue();
    }

    public final /* synthetic */ void waitForUserDependencyThread$android_sdk_base_release() {
        try {
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String waitForUserDependencyThread$lambda$215;
                    waitForUserDependencyThread$lambda$215 = Braze.waitForUserDependencyThread$lambda$215();
                    return waitForUserDependencyThread$lambda$215;
                }
            }, 4, (Object) null);
        }
    }

    @Override // com.braze.IBraze
    public void changeUser(final String userId, final String sdkAuthSignature) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda123
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String changeUser$lambda$130;
                changeUser$lambda$130 = Braze.changeUser$lambda$130(userId);
                return changeUser$lambda$130;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda124
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit changeUser$lambda$137;
                changeUser$lambda$137 = Braze.changeUser$lambda$137(userId, this, sdkAuthSignature);
                return changeUser$lambda$137;
            }
        }, 14, null);
    }

    @Override // com.braze.IBraze
    public void logCustomEvent(final String eventName, final BrazeProperties properties) {
        final BrazeProperties clone = properties != null ? properties.clone() : null;
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda173
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logCustomEvent$lambda$44;
                logCustomEvent$lambda$44 = Braze.logCustomEvent$lambda$44(eventName);
                return logCustomEvent$lambda$44;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda184
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logCustomEvent$lambda$50;
                logCustomEvent$lambda$50 = Braze.logCustomEvent$lambda$50(Braze.this, eventName, clone, properties);
                return logCustomEvent$lambda$50;
            }
        }, 14, null);
    }

    @Override // com.braze.IBraze
    public void logPurchase(String productId, String currencyCode, BigDecimal price, BrazeProperties properties) {
        logPurchase(productId, currencyCode, price, 1, properties);
    }

    @Override // com.braze.IBraze
    public void logPushNotificationOpened(final Intent intent) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda196
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logPushNotificationOpened$lambda$58;
                logPushNotificationOpened$lambda$58 = Braze.logPushNotificationOpened$lambda$58(intent);
                return logPushNotificationOpened$lambda$58;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda197
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logPushNotificationOpened$lambda$62;
                logPushNotificationOpened$lambda$62 = Braze.logPushNotificationOpened$lambda$62(intent, this);
                return logPushNotificationOpened$lambda$62;
            }
        }, 10, null);
    }

    @Override // com.braze.IBraze
    public void requestBannersRefresh(final List<String> ids, final IValueCallback<BannersUpdatedEvent> completionCallback) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda150
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestBannersRefresh$lambda$85;
                requestBannersRefresh$lambda$85 = Braze.requestBannersRefresh$lambda$85();
                return requestBannersRefresh$lambda$85;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda152
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestBannersRefresh$lambda$94;
                requestBannersRefresh$lambda$94 = Braze.requestBannersRefresh$lambda$94(ids, this, completionCallback);
                return requestBannersRefresh$lambda$94;
            }
        }, 14, null);
    }

    public final /* synthetic */ void requestGeofenceRefresh$android_sdk_base_release(final boolean ignoreRateLimit) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestGeofenceRefresh$lambda$166;
                requestGeofenceRefresh$lambda$166 = Braze.requestGeofenceRefresh$lambda$166(ignoreRateLimit);
                return requestGeofenceRefresh$lambda$166;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestGeofenceRefresh$lambda$167;
                requestGeofenceRefresh$lambda$167 = Braze.requestGeofenceRefresh$lambda$167(Braze.this, ignoreRateLimit);
                return requestGeofenceRefresh$lambda$167;
            }
        }, 14, null);
    }

    @Override // com.braze.IBraze
    public void getCurrentUser(IValueCallback<BrazeUser> completionCallback) {
        Intrinsics.checkNotNullParameter(completionCallback, "completionCallback");
        try {
            BuildersKt__Builders_commonKt.launch$default(com.braze.coroutine.f.f492a, null, null, new i(completionCallback, this, null), 3, null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda113
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String currentUser$lambda$138;
                    currentUser$lambda$138 = Braze.getCurrentUser$lambda$138();
                    return currentUser$lambda$138;
                }
            }, 4, (Object) null);
            completionCallback.onError();
            publishError(e);
        }
    }

    @Override // com.braze.IBraze
    public void logPurchase(String productId, String currencyCode, BigDecimal price, int quantity) {
        logPurchase(productId, currencyCode, price, quantity, null);
    }

    @Override // com.braze.IBraze
    public void logPurchase(final String productId, final String currencyCode, final BigDecimal price, final int quantity, BrazeProperties properties) {
        final BrazeProperties clone = properties != null ? properties.clone() : null;
        run$android_sdk_base_release$default(this, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda102
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logPurchase$lambda$51;
                logPurchase$lambda$51 = Braze.logPurchase$lambda$51(productId);
                return logPurchase$lambda$51;
            }
        }, false, false, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda103
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logPurchase$lambda$54;
                logPurchase$lambda$54 = Braze.logPurchase$lambda$54(productId, currencyCode, price, quantity, this, clone);
                return logPurchase$lambda$54;
            }
        }, 14, null);
    }

    @Override // com.braze.IBraze
    public Card deserializeContentCard(final JSONObject contentCardJson) {
        return (Card) runForResult$android_sdk_base_release$default(this, null, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda143
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String deserializeContentCard$lambda$147;
                deserializeContentCard$lambda$147 = Braze.deserializeContentCard$lambda$147(contentCardJson);
                return deserializeContentCard$lambda$147;
            }
        }, false, false, false, new c(this, contentCardJson, null), 28, null);
    }
}
