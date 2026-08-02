package com.braze;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import bo.app.e4;
import bo.app.f5;
import bo.app.f6;
import bo.app.h4;
import bo.app.h5;
import bo.app.j;
import bo.app.j4;
import bo.app.o4;
import bo.app.w6;
import bo.app.x3;
import bo.app.x6;
import com.braze.Braze;
import com.braze.configuration.BrazeConfig;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.configuration.RuntimeAppConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.GeofenceTransitionType;
import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.events.BrazePushEvent;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.FeedUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.IValueCallback;
import com.braze.events.InAppMessageEvent;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.events.SdkDataWipeEvent;
import com.braze.events.SessionStateChangedEvent;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.FeatureFlag;
import com.braze.models.IBrazeLocation;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import com.braze.support.StringUtils;
import com.braze.support.ValidationUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C2321a2;
import com.ironsource.C2608q2;
import com.ironsource.X3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.File;
import java.io.FilenameFilter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000Ê\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 \u0082\u00022\u00020\u0001:\u0002\u0082\u0002B\u0015\b\u0001\u0012\b\u0010ÿ\u0001\u001a\u00030½\u0001¢\u0006\u0006\b\u0080\u0002\u0010\u0081\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002Ja\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u00028\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00022'\u0010\u001a\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015¢\u0006\u0002\b\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010 \u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\r2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J&\u0010)\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\r2\b\u0010&\u001a\u0004\u0018\u00010\r2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016J0\u0010)\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\r2\b\u0010&\u001a\u0004\u0018\u00010\r2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J.\u0010)\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\r2\b\u0010&\u001a\u0004\u0018\u00010\r2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010+\u001a\u00020*H\u0016J8\u0010)\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\r2\b\u0010&\u001a\u0004\u0018\u00010\r2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010+\u001a\u00020*2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010-\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010-\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u00010.H\u0016J&\u00102\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010\r2\b\u00100\u001a\u0004\u0018\u00010\r2\b\u00101\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u00104\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010\r2\b\u00103\u001a\u0004\u0018\u00010\rH\u0016J\b\u00105\u001a\u00020\u0004H\u0016J\b\u00106\u001a\u00020\u0004H\u0016J\b\u00107\u001a\u00020\u0004H\u0016J\u0010\u00109\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0002H\u0017J\b\u00109\u001a\u00020\u0004H\u0016J\b\u0010:\u001a\u00020\u0004H\u0016J\b\u0010;\u001a\u00020\u0004H\u0016J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<H\u0016J\u0010\u0010@\u001a\u00020=2\u0006\u0010?\u001a\u00020\rH\u0016J\b\u0010A\u001a\u00020\u0004H\u0016J\u0016\u0010E\u001a\u00020\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00020C0BH\u0016J\u0016\u0010G\u001a\u00020\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00020F0BH\u0016J\u0016\u0010I\u001a\u00020\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00020H0BH\u0016J\u0016\u0010K\u001a\u00020\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00020J0BH\u0016J\u0016\u0010M\u001a\u00020\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00020L0BH\u0016J\u0016\u0010O\u001a\u00020\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00020N0BH\u0016J\u0016\u0010Q\u001a\u00020\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00020P0BH\u0016J\u0016\u0010S\u001a\u00020\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00020R0BH\u0016J\u0016\u0010U\u001a\u00020\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00020T0BH\u0016J*\u0010X\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00102\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000B2\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000VH\u0016J,\u0010Y\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00102\u000e\u0010D\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010B2\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000VH\u0016J\u0012\u0010[\u001a\u00020\u00042\b\u0010Z\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010[\u001a\u00020\u00042\b\u0010Z\u001a\u0004\u0018\u00010\r2\b\u0010\\\u001a\u0004\u0018\u00010\rH\u0016J\u0016\u0010`\u001a\u00020\u00042\f\u0010_\u001a\b\u0012\u0004\u0012\u00020^0]H\u0016J\u0016\u0010a\u001a\u00020\u00042\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\r0]H\u0016J\b\u0010b\u001a\u00020*H\u0016J\b\u0010c\u001a\u00020*H\u0016J\b\u0010e\u001a\u00020dH\u0016J\u0010\u0010g\u001a\n\u0012\u0004\u0012\u00020f\u0018\u00010<H\u0016J\u0014\u0010i\u001a\u0004\u0018\u00010f2\b\u0010h\u001a\u0004\u0018\u00010\rH\u0016J\u0014\u0010i\u001a\u0004\u0018\u00010f2\b\u0010k\u001a\u0004\u0018\u00010jH\u0016J\u0012\u0010m\u001a\u00020\u00042\b\u0010l\u001a\u0004\u0018\u00010\rH\u0017J\u0012\u0010n\u001a\u00020\u00042\b\u0010l\u001a\u0004\u0018\u00010\rH\u0017J\u0014\u0010q\u001a\u0004\u0018\u00010p2\b\u0010o\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u0010u\u001a\u00020\u00042\u0006\u0010s\u001a\u00020r2\u0006\u0010t\u001a\u00020rH\u0016J\b\u0010v\u001a\u00020\u0004H\u0016J\u0018\u0010y\u001a\u00020\u00042\u0006\u0010w\u001a\u00020\r2\u0006\u0010x\u001a\u00020\u0002H\u0016J\u0010\u0010{\u001a\u00020\u00042\u0006\u0010z\u001a\u00020\rH\u0016J%\u0010\u0081\u0001\u001a\u00020\u00042\b\u0010|\u001a\u0004\u0018\u00010\r2\b\u0010~\u001a\u0004\u0018\u00010}H\u0000¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001e\u0010\u0086\u0001\u001a\u00020\u00042\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u0001H\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001b\u0010\u0086\u0001\u001a\u00020\u00042\u0007\u0010\u0087\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0088\u0001J%\u0010\u008c\u0001\u001a\u00020\u00042\u0007\u0010\u0089\u0001\u001a\u00020\r2\b\u0010Z\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001c\u0010\u008e\u0001\u001a\u00020\u00042\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0000¢\u0006\u0006\b\u008d\u0001\u0010\u0085\u0001J\u0012\u0010\u0091\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0012\u0010\u0093\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0090\u0001J\u001a\u0010\u0096\u0001\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0012\u0010\u0098\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0006\b\u0097\u0001\u0010\u0090\u0001J\u001b\u0010\u009c\u0001\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020CH\u0000¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J&\u0010£\u0001\u001a\u00020\u00042\b\u0010\u009e\u0001\u001a\u00030\u009d\u00012\b\u0010 \u0001\u001a\u00030\u009f\u0001H\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001J#\u0010§\u0001\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\r2\u0007\u0010¤\u0001\u001a\u00020dH\u0000¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u001b\u0010ª\u0001\u001a\u00020\u00042\u0007\u0010¤\u0001\u001a\u00020dH\u0000¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0012\u0010¬\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0006\b«\u0001\u0010\u0090\u0001J\u001b\u0010°\u0001\u001a\u00020\u00042\u0007\u0010\u00ad\u0001\u001a\u00020\rH\u0000¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u0012\u0010²\u0001\u001a\u00020\u0004H\u0001¢\u0006\u0006\b±\u0001\u0010\u0090\u0001J:\u0010µ\u0001\u001a\u00020\u00042\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0001¢\u0006\u0006\b³\u0001\u0010´\u0001R*\u0010·\u0001\u001a\u00030¶\u00018\u0016@\u0016X\u0096.¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R\u001a\u0010¾\u0001\u001a\u00030½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0019\u0010À\u0001\u001a\u00020^8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R3\u0010Â\u0001\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0081\u000e¢\u0006 \n\u0006\bÂ\u0001\u0010Ã\u0001\u0012\u0006\bÈ\u0001\u0010\u0090\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001R\u0019\u0010É\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R2\u0010Ì\u0001\u001a\u00030Ë\u00018\u0000@\u0000X\u0081.¢\u0006 \n\u0006\bÌ\u0001\u0010Í\u0001\u0012\u0006\bÒ\u0001\u0010\u0090\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R\u0019\u0010Õ\u0001\u001a\u0004\u0018\u00010H8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÓ\u0001\u0010Ô\u0001R2\u0010×\u0001\u001a\u00030Ö\u00018\u0000@\u0000X\u0081.¢\u0006 \n\u0006\b×\u0001\u0010Ø\u0001\u0012\u0006\bÝ\u0001\u0010\u0090\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R2\u0010ß\u0001\u001a\u00030Þ\u00018\u0000@\u0000X\u0081\u000e¢\u0006 \n\u0006\bß\u0001\u0010à\u0001\u0012\u0006\bå\u0001\u0010\u0090\u0001\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R2\u0010ç\u0001\u001a\u00030æ\u00018\u0000@\u0000X\u0081.¢\u0006 \n\u0006\bç\u0001\u0010è\u0001\u0012\u0006\bí\u0001\u0010\u0090\u0001\u001a\u0006\bé\u0001\u0010ê\u0001\"\u0006\bë\u0001\u0010ì\u0001R2\u0010ï\u0001\u001a\u00030î\u00018\u0000@\u0000X\u0081.¢\u0006 \n\u0006\bï\u0001\u0010ð\u0001\u0012\u0006\bõ\u0001\u0010\u0090\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001\"\u0006\bó\u0001\u0010ô\u0001R\u0017\u0010ø\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\bö\u0001\u0010÷\u0001R\u0018\u0010ú\u0001\u001a\u0004\u0018\u00010^8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b`\u0010ù\u0001R.\u0010þ\u0001\u001a\u0004\u0018\u00010\r2\t\u0010û\u0001\u001a\u0004\u0018\u00010\r8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\bü\u0001\u0010÷\u0001\"\u0006\bý\u0001\u0010¯\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0083\u0002"}, d2 = {"Lcom/braze/Braze;", "Lcom/braze/IBraze;", "", "isOffline", "", "setSyncPolicyOfflineStatus", "", "throwable", "publishError", "verifyProperSdkSetup", "Lbo/app/x6;", "dependencyProvider", "setUserSpecificMemberVariablesAndStartDispatch", "", "key", "isEphemeralEventKey", "T", "defaultValueOnException", "Lkotlin/Function0;", "errorLog", "earlyReturnIfDisabled", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "runForResult", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Landroid/app/Activity;", "activity", "openSession", "closeSession", X3.i.j0, "logCustomEvent", "Lcom/braze/models/outgoing/BrazeProperties;", FeatureFlag.PROPERTIES, InAppPurchaseMetaData.KEY_PRODUCT_ID, "currencyCode", "Ljava/math/BigDecimal;", "price", "logPurchase", "", "quantity", "campaignId", "logPushNotificationOpened", "Landroid/content/Intent;", SDKConstants.PARAM_INTENT, "actionId", SDKConstants.PARAM_GAME_REQUESTS_ACTION_TYPE, "logPushNotificationActionClicked", "pageId", "logPushStoryPageClicked", "logFeedDisplayed", "requestFeedRefreshFromCache", "requestFeedRefresh", "fromCache", "requestContentCardsRefresh", "requestContentCardsRefreshFromCache", "refreshFeatureFlags", "", "Lcom/braze/models/FeatureFlag;", "getAllFeatureFlags", "id", "getFeatureFlag", "requestImmediateDataFlush", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/InAppMessageEvent;", "subscriber", "subscribeToNewInAppMessages", "Lcom/braze/events/NoMatchingTriggerEvent;", "subscribeToNoMatchingTriggerForEvent", "Lcom/braze/events/ContentCardsUpdatedEvent;", "subscribeToContentCardsUpdates", "Lcom/braze/events/FeatureFlagsUpdatedEvent;", "subscribeToFeatureFlagsUpdates", "Lcom/braze/events/FeedUpdatedEvent;", "subscribeToFeedUpdates", "Lcom/braze/events/SessionStateChangedEvent;", "subscribeToSessionUpdates", "Lcom/braze/events/BrazeNetworkFailureEvent;", "subscribeToNetworkFailures", "Lcom/braze/events/BrazeSdkAuthenticationErrorEvent;", "subscribeToSdkAuthenticationFailures", "Lcom/braze/events/BrazePushEvent;", "subscribeToPushNotificationEvents", "Ljava/lang/Class;", "eventClass", "addSingleSynchronousSubscription", "removeSingleSubscription", "userId", "changeUser", "sdkAuthSignature", "Lcom/braze/events/IValueCallback;", "Lcom/braze/BrazeUser;", "completionCallback", "getCurrentUser", "getDeviceIdAsync", "getContentCardCount", "getContentCardUnviewedCount", "", "getContentCardsLastUpdatedInSecondsFromEpoch", "Lcom/braze/models/cards/Card;", "getCachedContentCards", "contentCardString", "deserializeContentCard", "Lorg/json/JSONObject;", "contentCardJson", "cardId", "logFeedCardImpression", "logFeedCardClick", "inAppMessageString", "Lcom/braze/models/inappmessage/IInAppMessage;", "deserializeInAppMessageString", "", IBrazeLocation.LATITUDE, IBrazeLocation.LONGITUDE, "requestGeofences", "requestLocationInitialization", "googleAdvertisingId", X3.j.M, "setGoogleAdvertisingId", InAppPurchaseMetaData.KEY_SIGNATURE, "setSdkAuthenticationSignature", "geofenceId", "Lcom/braze/enums/GeofenceTransitionType;", "transitionType", "recordGeofenceTransition$android_sdk_base_release", "(Ljava/lang/String;Lcom/braze/enums/GeofenceTransitionType;)V", "recordGeofenceTransition", "Lcom/braze/models/IBrazeLocation;", FirebaseAnalytics.Param.LOCATION, "requestGeofenceRefresh$android_sdk_base_release", "(Lcom/braze/models/IBrazeLocation;)V", "requestGeofenceRefresh", "ignoreRateLimit", "(Z)V", "serializedCardJson", "addSerializedCardJsonToStorage$android_sdk_base_release", "(Ljava/lang/String;Ljava/lang/String;)V", "addSerializedCardJsonToStorage", "logLocationRecordedEventFromLocationUpdate$android_sdk_base_release", "logLocationRecordedEventFromLocationUpdate", "requestGeofencesInitialization$android_sdk_base_release", "()V", "requestGeofencesInitialization", "requestSingleLocationUpdate$android_sdk_base_release", "requestSingleLocationUpdate", "handleInAppMessageTestPush$android_sdk_base_release", "(Landroid/content/Intent;)V", "handleInAppMessageTestPush", "applyPendingRuntimeConfiguration$android_sdk_base_release", "applyPendingRuntimeConfiguration", "event", "retryInAppMessage$android_sdk_base_release", "(Lcom/braze/events/InAppMessageEvent;)V", "retryInAppMessage", "Lcom/braze/enums/BrazePushEventType;", "pushActionType", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "publishBrazePushAction$android_sdk_base_release", "(Lcom/braze/enums/BrazePushEventType;Lcom/braze/models/push/BrazeNotificationPayload;)V", "publishBrazePushAction", "timeInMs", "logPushDelivery$android_sdk_base_release", "(Ljava/lang/String;J)V", "logPushDelivery", "schedulePushDelivery$android_sdk_base_release", "(J)V", "schedulePushDelivery", "performPushDeliveryFlush$android_sdk_base_release", "performPushDeliveryFlush", "campaign", "logPushMaxCampaign$android_sdk_base_release", "(Ljava/lang/String;)V", "logPushMaxCampaign", "waitForUserDependencyThread$android_sdk_base_release", "waitForUserDependencyThread", "run$android_sdk_base_release", "(Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)V", "run", "Lcom/braze/images/IBrazeImageLoader;", "imageLoader", "Lcom/braze/images/IBrazeImageLoader;", "getImageLoader", "()Lcom/braze/images/IBrazeImageLoader;", "setImageLoader", "(Lcom/braze/images/IBrazeImageLoader;)V", "Landroid/content/Context;", "applicationContext", "Landroid/content/Context;", "brazeUser", "Lcom/braze/BrazeUser;", "isApiKeyPresent", "Ljava/lang/Boolean;", "isApiKeyPresent$android_sdk_base_release", "()Ljava/lang/Boolean;", "setApiKeyPresent$android_sdk_base_release", "(Ljava/lang/Boolean;)V", "isApiKeyPresent$android_sdk_base_release$annotations", "isInstanceStopped", "Z", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProvider$android_sdk_base_release", "()Lcom/braze/configuration/BrazeConfigurationProvider;", "setConfigurationProvider$android_sdk_base_release", "(Lcom/braze/configuration/BrazeConfigurationProvider;)V", "getConfigurationProvider$android_sdk_base_release$annotations", "getCachedContentCardsUpdatedEvent", "()Lcom/braze/events/ContentCardsUpdatedEvent;", "cachedContentCardsUpdatedEvent", "Lbo/app/e2;", "deviceIdReader", "Lbo/app/e2;", "getDeviceIdReader$android_sdk_base_release", "()Lbo/app/e2;", "setDeviceIdReader$android_sdk_base_release", "(Lbo/app/e2;)V", "getDeviceIdReader$android_sdk_base_release$annotations", "Lbo/app/h2;", "externalIEventMessenger", "Lbo/app/h2;", "getExternalIEventMessenger$android_sdk_base_release", "()Lbo/app/h2;", "setExternalIEventMessenger$android_sdk_base_release", "(Lbo/app/h2;)V", "getExternalIEventMessenger$android_sdk_base_release$annotations", "Lbo/app/j4;", "pushDeliveryManager", "Lbo/app/j4;", "getPushDeliveryManager$android_sdk_base_release", "()Lbo/app/j4;", "setPushDeliveryManager$android_sdk_base_release", "(Lbo/app/j4;)V", "getPushDeliveryManager$android_sdk_base_release$annotations", "Lbo/app/z2;", "udm", "Lbo/app/z2;", "getUdm$android_sdk_base_release", "()Lbo/app/z2;", "setUdm$android_sdk_base_release", "(Lbo/app/z2;)V", "getUdm$android_sdk_base_release$annotations", "getDeviceId", "()Ljava/lang/String;", "deviceId", "()Lcom/braze/BrazeUser;", "currentUser", "value", "getRegisteredPushToken", "setRegisteredPushToken", "registeredPushToken", "context", "<init>", "(Landroid/content/Context;)V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class Braze implements IBraze {
    private static boolean areOutboundNetworkRequestsOffline;
    private static IBrazeNotificationFactory customBrazeNotificationFactory;
    private static IBrazeEndpointProvider endpointProvider;
    private static volatile Braze instance;
    private static f5 sdkEnablementProvider;
    private static boolean shouldMockNetworkRequestsAndDropEvents;
    private Context applicationContext;
    private BrazeUser brazeUser;
    public BrazeConfigurationProvider configurationProvider;
    public bo.app.e2 deviceIdReader;
    private bo.app.h2 externalIEventMessenger;
    public IBrazeImageLoader imageLoader;
    private Boolean isApiKeyPresent;
    private boolean isInstanceStopped;
    private bo.app.s3 offlineUserStorageProvider;
    public j4 pushDeliveryManager;
    private bo.app.k2 registrationDataProvider;
    public bo.app.z2 udm;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ReentrantLock brazeClassLock = new ReentrantLock();
    private static final Set<String> KNOWN_APP_CRAWLER_DEVICE_MODELS = SetsKt.setOf("calypso appcrawler");
    private static final Set<String> NECESSARY_BRAZE_SDK_PERMISSIONS = SetsKt.setOf((Object[]) new String[]{"android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"});
    private static final ReentrantLock endpointProviderLock = new ReentrantLock();
    private static final List<BrazeConfig> pendingConfigurations = new ArrayList();
    private static final BrazeConfig clearConfigSentinel = new BrazeConfig.Builder().build();

    @Metadata(bv = {}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\\\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007J\b\u0010\u0012\u001a\u00020\u0010H\u0007J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u001a\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0007J\u001e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0007J\b\u0010\u001d\u001a\u00020\u0006H\u0007J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0019\u0010$\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0004\b\"\u0010#J\u001f\u0010+\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b)\u0010*J\u000f\u0010.\u001a\u00020\u0010H\u0001¢\u0006\u0004\b,\u0010-J\u000f\u00100\u001a\u00020\u0010H\u0001¢\u0006\u0004\b/\u0010-R*\u00101\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b1\u00102\u0012\u0004\b7\u0010-\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u00109\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b9\u0010:\u0012\u0004\b?\u0010-\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010F\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u00068F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bE\u0010-\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010G\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\bH\u0010-\u001a\u0004\bG\u0010BR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\f0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\f0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010KR\u0016\u0010M\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010TR\u0014\u0010U\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00160X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010N¨\u0006]"}, d2 = {"Lcom/braze/Braze$Companion;", "", "Landroid/content/Context;", "context", "Lbo/app/f5;", "getSdkEnablementProvider", "", "shouldAllowSingletonInitialization", "Lcom/braze/Braze;", com.unity3d.services.core.fid.Constants.GET_INSTANCE, "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "", "getConfiguredApiKey", "Lcom/braze/IBrazeEndpointProvider;", "endpointProvider", "", "setEndpointProvider", "clearEndpointProvider", "Landroid/net/Uri;", "brazeEndpoint", "getApiEndpoint", "Lcom/braze/configuration/BrazeConfig;", "config", "configure", "Ljava/util/EnumSet;", "Lcom/braze/enums/BrazeSdkMetadata;", "sdkMetadata", "addSdkMetadata", "enableMockNetworkRequestsAndDropEventsMode", "disableSdk", "enableSdk", "wipeData", "configuredCustomEndpoint", "setConfiguredCustomEndpoint$android_sdk_base_release", "(Ljava/lang/String;)V", "setConfiguredCustomEndpoint", "Landroid/content/Intent;", SDKConstants.PARAM_INTENT, "Lbo/app/z1;", "brazeManager", "requestTriggersIfInAppMessageTestPush$android_sdk_base_release", "(Landroid/content/Intent;Lbo/app/z1;)V", "requestTriggersIfInAppMessageTestPush", "stopInstance$android_sdk_base_release", "()V", "stopInstance", "clearInstance$android_sdk_base_release", "clearInstance", "sdkEnablementProvider", "Lbo/app/f5;", "getSdkEnablementProvider$android_sdk_base_release", "()Lbo/app/f5;", "setSdkEnablementProvider$android_sdk_base_release", "(Lbo/app/f5;)V", "getSdkEnablementProvider$android_sdk_base_release$annotations", "Lcom/braze/IBrazeNotificationFactory;", "customBrazeNotificationFactory", "Lcom/braze/IBrazeNotificationFactory;", "getCustomBrazeNotificationFactory", "()Lcom/braze/IBrazeNotificationFactory;", "setCustomBrazeNotificationFactory", "(Lcom/braze/IBrazeNotificationFactory;)V", "getCustomBrazeNotificationFactory$annotations", "isOffline", "getOutboundNetworkRequestsOffline", "()Z", "setOutboundNetworkRequestsOffline", "(Z)V", "getOutboundNetworkRequestsOffline$annotations", "outboundNetworkRequestsOffline", "isDisabled", "isDisabled$annotations", "", "KNOWN_APP_CRAWLER_DEVICE_MODELS", "Ljava/util/Set;", "NECESSARY_BRAZE_SDK_PERMISSIONS", "areOutboundNetworkRequestsOffline", "Z", "Ljava/util/concurrent/locks/ReentrantLock;", "brazeClassLock", "Ljava/util/concurrent/locks/ReentrantLock;", "clearConfigSentinel", "Lcom/braze/configuration/BrazeConfig;", "Lcom/braze/IBrazeEndpointProvider;", "endpointProviderLock", C2608q2.p, "Lcom/braze/Braze;", "", "pendingConfigurations", "Ljava/util/List;", "shouldMockNetworkRequestsAndDropEvents", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            final /* synthetic */ EnumSet<BrazeSdkMetadata> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(EnumSet<BrazeSdkMetadata> enumSet) {
                super(0);
                this.b = enumSet;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Failed to add SDK Metadata of: ", this.b);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a0 extends Lambda implements Function0<String> {
            public static final a0 b = new a0();

            a0() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to delete data from the internal storage cache.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class b extends Lambda implements Function0<String> {
            public static final b b = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Clearing Braze instance";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class b0 extends Lambda implements Function0<String> {
            final /* synthetic */ File b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b0(File file) {
                super(0);
                this.b = file;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Deleting shared prefs file at: ", this.b.getAbsolutePath());
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class c extends Lambda implements Function0<String> {
            final /* synthetic */ BrazeConfig b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(BrazeConfig brazeConfig) {
                super(0);
                this.b = brazeConfig;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Braze.configure() called with configuration: ", this.b);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class c0 extends Lambda implements Function0<String> {
            public static final c0 b = new c0();

            c0() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to delete shared preference data for the Braze SDK.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class d extends Lambda implements Function0<String> {
            public static final d b = new d();

            d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Braze.configure() cannot be called while the singleton is still live.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class e extends Lambda implements Function0<String> {
            public static final e b = new e();

            e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Braze.configure() called with a null config; Clearing all configuration values.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class f extends Lambda implements Function0<String> {
            public static final f b = new f();

            f() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Stopping the SDK instance.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class g extends Lambda implements Function0<String> {
            public static final g b = new g();

            g() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Disabling all network requests";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class h extends Lambda implements Function0<String> {
            public static final h b = new h();

            h() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Braze network requests already being mocked. Note that events dispatched in this mode are dropped.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class i extends Lambda implements Function0<String> {
            public static final i b = new i();

            i() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Braze network requests will be mocked. Events dispatchedin this mode will be dropped.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class j extends Lambda implements Function0<String> {
            public static final j b = new j();

            j() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Attempt to enable mocking Braze network requests had no effect since getInstance() has already been called.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class k extends Lambda implements Function0<String> {
            public static final k b = new k();

            k() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Setting SDK to enabled.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class l extends Lambda implements Function0<String> {
            public static final l b = new l();

            l() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Enabling all network requests";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class m extends Lambda implements Function0<String> {
            public static final m b = new m();

            m() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Caught exception trying to get a Braze API endpoint from the BrazeEndpointProvider. Using the original URI";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class n extends Lambda implements Function0<String> {
            public static final n b = new n();

            n() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Caught exception while retrieving API key.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class o extends Lambda implements Function0<String> {
            public static final o b = new o();

            o() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "SDK enablement provider was null. Returning SDK as enabled.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class p extends Lambda implements Function0<String> {
            public static final p b = new p();

            p() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "API key not present. Actions will not be performed on the SDK.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class q extends Lambda implements Function0<String> {
            public static final q b = new q();

            q() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "SDK is disabled. Actions will not be performed on the SDK.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class r extends Lambda implements Function0<String> {
            final /* synthetic */ boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            r(boolean z) {
                super(0);
                this.b = z;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Braze SDK outbound network requests are now ", this.b ? C2321a2.e : "enabled");
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class s extends Lambda implements Function0<String> {
            public static final s b = new s();

            s() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Push contained key for fetching test triggers, fetching triggers.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class t extends Lambda implements Function0<String> {
            public static final t b = new t();

            t() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "The instance is null. Allowing instance initialization";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class u extends Lambda implements Function0<String> {
            public static final u b = new u();

            u() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "The instance was stopped. Allowing instance initialization";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class v extends Lambda implements Function0<String> {
            public static final v b = new v();

            v() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "No API key was found previously. Allowing instance initialization";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class w extends Lambda implements Function0<String> {
            public static final w b = new w();

            w() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Shutting down all queued work on the Braze SDK";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class x extends Lambda implements Function0<String> {
            public static final x b = new x();

            x() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Sending sdk data wipe event to external subscribers";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class y extends Lambda implements Function0<String> {
            public static final y b = new y();

            y() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Shutting down the singleton work queue";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class z extends Lambda implements Function0<String> {
            public static final z b = new z();

            z() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to shutdown queued work on the Braze SDK.";
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getCustomBrazeNotificationFactory$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getOutboundNetworkRequestsOffline$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final f5 getSdkEnablementProvider(Context context) {
            f5 sdkEnablementProvider$android_sdk_base_release = getSdkEnablementProvider$android_sdk_base_release();
            if (sdkEnablementProvider$android_sdk_base_release != null) {
                return sdkEnablementProvider$android_sdk_base_release;
            }
            f5 f5Var = new f5(context);
            setSdkEnablementProvider$android_sdk_base_release(f5Var);
            return f5Var;
        }

        public static /* synthetic */ void getSdkEnablementProvider$android_sdk_base_release$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void isDisabled$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: setConfiguredCustomEndpoint$lambda-12$lambda-11, reason: not valid java name */
        public static final Uri m5195setConfiguredCustomEndpoint$lambda12$lambda11(String str, Uri brazeEndpoint) {
            Intrinsics.checkNotNullParameter(brazeEndpoint, "brazeEndpoint");
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String encodedAuthority = parse.getEncodedAuthority();
            Uri.Builder buildUpon = brazeEndpoint.buildUpon();
            if (scheme == null || StringsKt.isBlank(scheme) || encodedAuthority == null || StringsKt.isBlank(encodedAuthority)) {
                return buildUpon.encodedAuthority(str).build();
            }
            buildUpon.encodedAuthority(encodedAuthority);
            buildUpon.scheme(scheme);
            return buildUpon.build();
        }

        private final boolean shouldAllowSingletonInitialization() {
            Braze braze = Braze.instance;
            if (braze == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, t.b, 2, (Object) null);
                return true;
            }
            if (braze.isInstanceStopped) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, u.b, 3, (Object) null);
                return true;
            }
            if (!Intrinsics.areEqual(Boolean.FALSE, braze.getIsApiKeyPresent())) {
                return false;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, v.b, 3, (Object) null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: wipeData$lambda-9, reason: not valid java name */
        public static final boolean m5196wipeData$lambda9(File file, String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (!StringsKt.startsWith$default(name, "com.appboy", false, 2, (Object) null) || Intrinsics.areEqual(name, "com.appboy.override.configuration.cache")) {
                return StringsKt.startsWith$default(name, "com.braze", false, 2, (Object) null) && !Intrinsics.areEqual(name, "com.braze.override.configuration.cache");
            }
            return true;
        }

        @JvmStatic
        public final void addSdkMetadata(Context context, EnumSet<BrazeSdkMetadata> sdkMetadata) {
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
                } catch (Exception e2) {
                    BrazeLogger.INSTANCE.brazelog(Braze.INSTANCE, BrazeLogger.Priority.E, e2, new a(sdkMetadata));
                    Unit unit2 = Unit.INSTANCE;
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        @JvmStatic
        public final void clearEndpointProvider() {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Companion companion = Braze.INSTANCE;
                Braze.endpointProvider = null;
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final /* synthetic */ void clearInstance$android_sdk_base_release() {
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze braze = Braze.instance;
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                Companion companion = Braze.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, companion, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
                BrazeCoroutineScope.cancelChildren();
                if (braze != null && braze.udm != null) {
                    braze.getUdm$android_sdk_base_release().getM().g();
                }
                Braze.instance = null;
                Braze.shouldMockNetworkRequestsAndDropEvents = false;
                Braze.areOutboundNetworkRequestsOffline = false;
                companion.setSdkEnablementProvider$android_sdk_base_release(null);
                Braze.endpointProvider = null;
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        @JvmStatic
        public final boolean configure(Context context, BrazeConfig config) {
            Intrinsics.checkNotNullParameter(context, "context");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.I;
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new c(config), 2, (Object) null);
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze braze = Braze.instance;
                if (braze != null && !braze.isInstanceStopped && Intrinsics.areEqual(Boolean.TRUE, braze.getIsApiKeyPresent())) {
                    BrazeLogger.brazelog$default(brazeLogger, Braze.INSTANCE, priority, (Throwable) null, d.b, 2, (Object) null);
                    reentrantLock.unlock();
                    return false;
                }
                if (config != null) {
                    Braze.pendingConfigurations.add(config);
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, Braze.INSTANCE, priority, (Throwable) null, e.b, 2, (Object) null);
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
        public final void disableSdk(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            getSdkEnablementProvider(context).a(true);
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.W;
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, f.b, 2, (Object) null);
            stopInstance$android_sdk_base_release();
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, g.b, 2, (Object) null);
            setOutboundNetworkRequestsOffline(true);
        }

        @JvmStatic
        public final boolean enableMockNetworkRequestsAndDropEventsMode() {
            if (Braze.instance == null) {
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    if (Braze.instance == null) {
                        if (Braze.shouldMockNetworkRequestsAndDropEvents) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.INSTANCE, BrazeLogger.Priority.I, (Throwable) null, h.b, 2, (Object) null);
                        } else {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.INSTANCE, BrazeLogger.Priority.I, (Throwable) null, i.b, 2, (Object) null);
                            Braze.shouldMockNetworkRequestsAndDropEvents = true;
                        }
                        return true;
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, j.b, 2, (Object) null);
            return false;
        }

        @JvmStatic
        public final void enableSdk(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.W;
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, k.b, 2, (Object) null);
            getSdkEnablementProvider(context).a(false);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, l.b, 2, (Object) null);
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
                    } catch (Exception e2) {
                        BrazeLogger.INSTANCE.brazelog(Braze.INSTANCE, BrazeLogger.Priority.W, e2, m.b);
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
                return configurationProvider.getBrazeApiKey().toString();
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, n.b);
                return null;
            }
        }

        public final IBrazeNotificationFactory getCustomBrazeNotificationFactory() {
            return Braze.customBrazeNotificationFactory;
        }

        @JvmStatic
        public final Braze getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (shouldAllowSingletonInitialization()) {
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    if (Braze.INSTANCE.shouldAllowSingletonInitialization()) {
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
            if (braze2 != null) {
                return braze2;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.braze.Braze");
        }

        public final boolean getOutboundNetworkRequestsOffline() {
            return Braze.areOutboundNetworkRequestsOffline;
        }

        public final f5 getSdkEnablementProvider$android_sdk_base_release() {
            return Braze.sdkEnablementProvider;
        }

        public final boolean isDisabled() {
            f5 sdkEnablementProvider$android_sdk_base_release = getSdkEnablementProvider$android_sdk_base_release();
            if (sdkEnablementProvider$android_sdk_base_release == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, o.b, 3, (Object) null);
                return false;
            }
            Braze braze = Braze.instance;
            if (braze != null && Intrinsics.areEqual(Boolean.FALSE, braze.getIsApiKeyPresent())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, p.b, 2, (Object) null);
                return true;
            }
            boolean a2 = sdkEnablementProvider$android_sdk_base_release.a();
            if (a2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, q.b, 2, (Object) null);
            }
            return a2;
        }

        public final void requestTriggersIfInAppMessageTestPush$android_sdk_base_release(Intent intent, bo.app.z1 brazeManager) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
            String stringExtra = intent.getStringExtra(Constants.BRAZE_PUSH_FETCH_TEST_TRIGGERS_KEY);
            if (stringExtra == null || !Intrinsics.areEqual(stringExtra, "true")) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, s.b, 2, (Object) null);
            brazeManager.a(new x3.a(null, null, null, null, 15, null).c());
        }

        public final void setConfiguredCustomEndpoint$android_sdk_base_release(final String configuredCustomEndpoint) {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.INSTANCE.setEndpointProvider(new IBrazeEndpointProvider() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda0
                    @Override // com.braze.IBrazeEndpointProvider
                    public final Uri getApiEndpoint(Uri uri) {
                        Uri m5195setConfiguredCustomEndpoint$lambda12$lambda11;
                        m5195setConfiguredCustomEndpoint$lambda12$lambda11 = Braze.Companion.m5195setConfiguredCustomEndpoint$lambda12$lambda11(configuredCustomEndpoint, uri);
                        return m5195setConfiguredCustomEndpoint$lambda12$lambda11;
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

        public final void setOutboundNetworkRequestsOffline(boolean z2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new r(z2), 2, (Object) null);
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Companion companion = Braze.INSTANCE;
                Braze.areOutboundNetworkRequestsOffline = z2;
                Braze braze = Braze.instance;
                if (braze != null) {
                    braze.setSyncPolicyOfflineStatus(z2);
                    Unit unit = Unit.INSTANCE;
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void setSdkEnablementProvider$android_sdk_base_release(f5 f5Var) {
            Braze.sdkEnablementProvider = f5Var;
        }

        public final void stopInstance$android_sdk_base_release() {
            BrazeLogger brazeLogger;
            try {
                brazeLogger = BrazeLogger.INSTANCE;
                try {
                    BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, w.b, 2, (Object) null);
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
            }
            try {
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    BrazeCoroutineScope.cancelChildren();
                    Braze braze = Braze.instance;
                    if (braze != null) {
                        Companion companion = Braze.INSTANCE;
                        BrazeLogger.brazelog$default(brazeLogger, companion, BrazeLogger.Priority.V, (Throwable) null, x.b, 2, (Object) null);
                        braze.getExternalIEventMessenger().a((bo.app.h2) new SdkDataWipeEvent(), (Class<bo.app.h2>) SdkDataWipeEvent.class);
                        BrazeLogger.brazelog$default(brazeLogger, companion, (BrazeLogger.Priority) null, (Throwable) null, y.b, 3, (Object) null);
                        h5.a.a();
                        if (braze.udm != null) {
                            braze.getUdm$android_sdk_base_release().getM().a(true);
                            braze.getUdm$android_sdk_base_release().getQ().a();
                            braze.getUdm$android_sdk_base_release().getY().unregisterGeofences();
                        }
                        braze.isInstanceStopped = true;
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            } catch (Exception e4) {
                e = e4;
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, z.b);
            }
        }

        @JvmStatic
        public final void wipeData(Context context) {
            File[] listFiles;
            List<File> asList;
            Intrinsics.checkNotNullParameter(context, "context");
            stopInstance$android_sdk_base_release();
            try {
                f6.e.a(context);
                DefaultBrazeImageLoader.INSTANCE.a(context);
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, a0.b);
            }
            try {
                File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles(new FilenameFilter() { // from class: com.braze.Braze$Companion$$ExternalSyntheticLambda1
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str) {
                        boolean m5196wipeData$lambda9;
                        m5196wipeData$lambda9 = Braze.Companion.m5196wipeData$lambda9(file2, str);
                        return m5196wipeData$lambda9;
                    }
                })) != null && (asList = ArraysKt.asList(listFiles)) != null) {
                    for (File file2 : asList) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.INSTANCE, BrazeLogger.Priority.V, (Throwable) null, new b0(file2), 2, (Object) null);
                        Intrinsics.checkNotNullExpressionValue(file2, "file");
                        BrazeFileUtils.deleteSharedPreferencesFile(context, file2);
                    }
                }
            } catch (Exception e3) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e3, c0.b);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        public static final a b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Braze SDK Initializing";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.Braze$deviceId$2", f = "Braze.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        int b;

        a0(Continuation<? super a0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((a0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Braze.this.new a0(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Braze.this.getDeviceIdReader$android_sdk_base_release().getDeviceId();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class a1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ IBrazeLocation b;
        final /* synthetic */ Braze c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a1(IBrazeLocation iBrazeLocation, Braze braze) {
            super(0);
            this.b = iBrazeLocation;
            this.c = braze;
        }

        public final void a() {
            bo.app.x1 a = bo.app.j.h.a(this.b);
            if (a == null) {
                return;
            }
            this.c.getUdm$android_sdk_base_release().getW().a(a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.Braze$registeredPushToken$2", f = "Braze.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        int b;

        a2(Continuation<? super a2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((a2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Braze.this.new a2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            bo.app.k2 k2Var = Braze.this.registrationDataProvider;
            if (k2Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("registrationDataProvider");
                k2Var = null;
            }
            return k2Var.a();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class a3 extends Lambda implements Function0<Unit> {
        final /* synthetic */ InAppMessageEvent c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a3(InAppMessageEvent inAppMessageEvent) {
            super(0);
            this.c = inAppMessageEvent;
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().getX().a(this.c.getTriggerEvent(), this.c.getTriggerAction());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a4 extends Lambda implements Function0<String> {
        public static final a4 b = new a4();

        a4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Device build model matches a known crawler. Enabling mock network request mode. Device it: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b0 extends Lambda implements Function0<String> {
        public static final b0 b = new b0();

        b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to get all feature flags";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b1 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b1(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to log purchase event of: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b2 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b2(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set the push token ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.Braze$run$1", f = "Braze.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int b;
        final /* synthetic */ Function0<Unit> c;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.braze.Braze$run$1$1", f = "Braze.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int b;
            final /* synthetic */ Function0<Unit> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0<Unit> function0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = function0;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.c.invoke();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b3(Function0<Unit> function0, Continuation<? super b3> continuation) {
            super(2, continuation);
            this.c = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b3(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BuildersKt__BuildersKt.runBlocking$default(null, new a(this.c, null), 1, null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.Braze$waitForUserDependencyThread$2", f = "Braze.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int b;
        private /* synthetic */ Object c;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Waited on previous tasks to finish!";
            }
        }

        b4(Continuation<? super b4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b4 b4Var = new b4(continuation);
            b4Var.c = obj;
            return b4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (CoroutineScope) this.c, (BrazeLogger.Priority) null, (Throwable) null, a.b, 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        public static final c b = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to perform initial Braze singleton setup.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/braze/models/FeatureFlag;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.Braze$getAllFeatureFlags$2", f = "Braze.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends FeatureFlag>>, Object> {
        int b;

        c0(Continuation<? super c0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<FeatureFlag>> continuation) {
            return ((c0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Braze.this.new c0(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Braze.this.getUdm$android_sdk_base_release().getE().s() ? bo.app.g1.a(Braze.this.getUdm$android_sdk_base_release().getA(), null, 1, null) : CollectionsKt.emptyList();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class c1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ BigDecimal d;
        final /* synthetic */ int e;
        final /* synthetic */ Braze f;
        final /* synthetic */ BrazeProperties g;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Log purchase input was invalid. Not logging in-app purchase to Braze.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class b extends Lambda implements Function0<String> {
            public static final b b = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Purchase logged with invalid properties. Not logging custom event to Braze.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c1(String str, String str2, BigDecimal bigDecimal, int i, Braze braze, BrazeProperties brazeProperties) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = bigDecimal;
            this.e = i;
            this.f = braze;
            this.g = brazeProperties;
        }

        public final void a() {
            String str = this.b;
            if (!ValidationUtils.isValidLogPurchaseInput(str, this.c, this.d, this.e, this.f.getUdm$android_sdk_base_release().getE())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
                return;
            }
            BrazeProperties brazeProperties = this.g;
            if (brazeProperties != null && brazeProperties.isInvalid()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
                return;
            }
            String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(str);
            j.a aVar = bo.app.j.h;
            String str2 = this.c;
            Intrinsics.checkNotNull(str2);
            BigDecimal bigDecimal = this.d;
            Intrinsics.checkNotNull(bigDecimal);
            bo.app.x1 a2 = aVar.a(ensureBrazeFieldLength, str2, bigDecimal, this.e, this.g);
            if (a2 != null && this.f.getUdm$android_sdk_base_release().getW().a(a2)) {
                this.f.getUdm$android_sdk_base_release().getX().a(new bo.app.c4(ensureBrazeFieldLength, this.g, a2));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class c2 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String c;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Push token " + ((Object) this.b) + " registered and immediately being flushed.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class b extends Lambda implements Function0<String> {
            public static final b b = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Push token must not be null or blank. Not registering for push with Braze.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c2(String str) {
            super(0);
            this.c = str;
        }

        public final void a() {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, Braze.this, BrazeLogger.Priority.I, (Throwable) null, new a(this.c), 2, (Object) null);
            String str = this.c;
            if (str == null || StringsKt.isBlank(str)) {
                BrazeLogger.brazelog$default(brazeLogger, Braze.this, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
                return;
            }
            bo.app.k2 k2Var = Braze.this.registrationDataProvider;
            if (k2Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("registrationDataProvider");
                k2Var = null;
            }
            k2Var.a(this.c);
            Braze.this.getUdm$android_sdk_base_release().c().e();
            Braze.this.requestImmediateDataFlush();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c3 extends Lambda implements Function0<String> {
        public static final c3 b = new c3();

        c3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Got error in singleton run without result";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c4 extends Lambda implements Function0<String> {
        public static final c4 b = new c4();

        c4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception while waiting for previous tasks in serial work queue to finish.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<Unit> {
        final /* synthetic */ Context c;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to startup user dependency manager.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class b extends Lambda implements Function0<String> {
            public static final b b = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class c extends Lambda implements Function0<String> {
            public static final c b = new c();

            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: com.braze.Braze$d$d, reason: collision with other inner class name */
        static final class C0115d extends Lambda implements Function0<String> {
            public static final C0115d b = new C0115d();

            C0115d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class e extends Lambda implements Function0<String> {
            public static final e b = new e();

            e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Amazon Device Messaging found. Setting up Amazon Device Messaging";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class f extends Lambda implements Function0<String> {
            public static final f b = new f();

            f() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "ADM manifest requirements not met. Braze will not register for ADM.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class g extends Lambda implements Function0<String> {
            public static final g b = new g();

            g() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class h extends Lambda implements Function0<String> {
            public static final h b = new h();

            h() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to setup pre SDK tasks";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class i extends Lambda implements Function0<String> {
            public static final i b = new i();

            i() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Starting up a new user dependency manager";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context) {
            super(0);
            this.c = context;
        }

        public final void a() {
            bo.app.s3 s3Var;
            bo.app.k2 k2Var;
            Braze.this.applyPendingRuntimeConfiguration$android_sdk_base_release();
            Braze.this.setConfigurationProvider$android_sdk_base_release(new BrazeConfigurationProvider(Braze.this.applicationContext));
            Braze braze = Braze.this;
            Companion companion = Braze.INSTANCE;
            String configuredApiKey = companion.getConfiguredApiKey(braze.getConfigurationProvider$android_sdk_base_release());
            braze.setApiKeyPresent$android_sdk_base_release(Boolean.valueOf(!(configuredApiKey == null || StringsKt.isBlank(configuredApiKey))));
            BrazeLogger.setInitialLogLevelFromConfiguration(Braze.this.getConfigurationProvider$android_sdk_base_release().getLoggerInitialLogLevel());
            BrazeLogger.checkForSystemLogLevelProperty$default(false, 1, null);
            if (companion.getSdkEnablementProvider(this.c).a()) {
                companion.setOutboundNetworkRequestsOffline(true);
            }
            Braze.this.setPushDeliveryManager$android_sdk_base_release(new j4(Braze.this.applicationContext, Braze.this.getConfigurationProvider$android_sdk_base_release().getBrazeApiKey().toString()));
            Braze.this.setDeviceIdReader$android_sdk_base_release(new bo.app.n0(Braze.this.applicationContext));
            Braze.this.offlineUserStorageProvider = new bo.app.s3(Braze.this.applicationContext);
            Braze.this.registrationDataProvider = new o4(Braze.this.applicationContext, Braze.this.getConfigurationProvider$android_sdk_base_release());
            String customEndpoint = Braze.this.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint();
            if (customEndpoint != null && !StringsKt.isBlank(customEndpoint)) {
                companion.setConfiguredCustomEndpoint$android_sdk_base_release(Braze.this.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint());
            }
            try {
                if (Braze.this.getConfigurationProvider$android_sdk_base_release().isFirebaseCloudMessagingRegistrationEnabled()) {
                    Context context = this.c;
                    bo.app.k2 k2Var2 = Braze.this.registrationDataProvider;
                    if (k2Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("registrationDataProvider");
                        k2Var2 = null;
                    }
                    bo.app.n1 n1Var = new bo.app.n1(context, k2Var2);
                    if (n1Var.a()) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.I, (Throwable) null, b.b, 2, (Object) null);
                        String firebaseCloudMessagingSenderIdKey = Braze.this.getConfigurationProvider$android_sdk_base_release().getFirebaseCloudMessagingSenderIdKey();
                        if (firebaseCloudMessagingSenderIdKey != null) {
                            n1Var.a(firebaseCloudMessagingSenderIdKey);
                        }
                    } else {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.W, (Throwable) null, c.b, 2, (Object) null);
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.I, (Throwable) null, C0115d.b, 2, (Object) null);
                }
                if (!Braze.this.getConfigurationProvider$android_sdk_base_release().isAdmMessagingRegistrationEnabled()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.I, (Throwable) null, g.b, 2, (Object) null);
                } else if (bo.app.b.c.a(Braze.this.applicationContext)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.I, (Throwable) null, e.b, 2, (Object) null);
                    Context context2 = Braze.this.applicationContext;
                    bo.app.k2 k2Var3 = Braze.this.registrationDataProvider;
                    if (k2Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("registrationDataProvider");
                        k2Var3 = null;
                    }
                    new bo.app.b(context2, k2Var3).a();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.W, (Throwable) null, f.b, 2, (Object) null);
                }
                Braze.this.verifyProperSdkSetup();
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(Braze.this, BrazeLogger.Priority.E, e2, h.b);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.V, (Throwable) null, i.b, 2, (Object) null);
            try {
                Braze braze2 = Braze.this;
                Context context3 = braze2.applicationContext;
                bo.app.s3 s3Var2 = Braze.this.offlineUserStorageProvider;
                if (s3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                    s3Var = null;
                } else {
                    s3Var = s3Var2;
                }
                BrazeConfigurationProvider configurationProvider$android_sdk_base_release = Braze.this.getConfigurationProvider$android_sdk_base_release();
                bo.app.h2 externalIEventMessenger = Braze.this.getExternalIEventMessenger();
                bo.app.e2 deviceIdReader$android_sdk_base_release = Braze.this.getDeviceIdReader$android_sdk_base_release();
                bo.app.k2 k2Var4 = Braze.this.registrationDataProvider;
                if (k2Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("registrationDataProvider");
                    k2Var = null;
                } else {
                    k2Var = k2Var4;
                }
                braze2.setUserSpecificMemberVariablesAndStartDispatch(new x6(context3, s3Var, configurationProvider$android_sdk_base_release, externalIEventMessenger, deviceIdReader$android_sdk_base_release, k2Var, Braze.this.getPushDeliveryManager$android_sdk_base_release(), Braze.shouldMockNetworkRequestsAndDropEvents, Braze.areOutboundNetworkRequestsOffline));
            } catch (Exception e3) {
                BrazeLogger.INSTANCE.brazelog(Braze.this, BrazeLogger.Priority.E, e3, a.b);
                Braze.this.publishError(e3);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d0 extends Lambda implements Function0<String> {
        public static final d0 b = new d0();

        d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The ContentCardsUpdatedEvent was null. Returning null for the list of cached cards.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d1 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d1(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Error logging Push Delivery ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d2 extends Lambda implements Function0<String> {
        final /* synthetic */ Class<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d2(Class<T> cls) {
            super(0);
            this.b = cls;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to remove " + ((Object) this.b.getName()) + " subscriber.";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.Braze$runForResult$1", f = "Braze.kt", i = {}, l = {1322}, m = "invokeSuspend", n = {}, s = {})
    static final class d3<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        int b;
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super T>, Object> c;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.braze.Braze$runForResult$1$1", f = "Braze.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
            int b;
            final /* synthetic */ Function2<CoroutineScope, Continuation<? super T>, Object> c;

            @Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            @DebugMetadata(c = "com.braze.Braze$runForResult$1$1$1", f = "Braze.kt", i = {}, l = {1320}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.braze.Braze$d3$a$a, reason: collision with other inner class name */
            static final class C0116a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
                int b;
                private /* synthetic */ Object c;
                final /* synthetic */ Function2<CoroutineScope, Continuation<? super T>, Object> d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0116a(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super C0116a> continuation) {
                    super(2, continuation);
                    this.d = function2;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
                    return ((C0116a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C0116a c0116a = new C0116a(this.d, continuation);
                    c0116a.c = obj;
                    return c0116a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.b;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.c;
                    Function2<CoroutineScope, Continuation<? super T>, Object> function2 = this.d;
                    this.b = 1;
                    Object invoke = function2.invoke(coroutineScope, this);
                    return invoke == coroutine_suspended ? coroutine_suspended : invoke;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = function2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object runBlocking$default;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new C0116a(this.c, null), 1, null);
                return runBlocking$default;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d3(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super d3> continuation) {
            super(2, continuation);
            this.c = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((d3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d3(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Deferred async$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            async$default = BuildersKt__Builders_commonKt.async$default(h5.a, null, null, new a(this.c, null), 3, null);
            this.b = 1;
            Object await = async$default.await(this);
            return await == coroutine_suspended ? coroutine_suspended : await;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        final /* synthetic */ long b;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j, long j2) {
            super(0);
            this.b = j;
            this.c = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Braze SDK loaded in " + TimeUnit.MILLISECONDS.convert(this.b - this.c, TimeUnit.NANOSECONDS) + " ms.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e0 extends Lambda implements Function0<String> {
        public static final e0 b = new e0();

        e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The ContentCardsUpdatedEvent was null. Returning the default value for the card count.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class e1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String c;
        final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e1(String str, long j) {
            super(0);
            this.c = str;
            this.d = j;
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().getW().a(this.c);
            Braze.this.schedulePushDelivery$android_sdk_base_release(this.d);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e2 extends Lambda implements Function0<String> {
        public static final e2 b = new e2();

        e2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to request Content Cards refresh from Braze servers.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e3 extends Lambda implements Function0<String> {
        public static final e3 b = new e3();

        e3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error scheduling push delivery";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to update ContentCard storage provider with single card update. User id: " + ((Object) this.b) + " Serialized json: " + this.c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f0 extends Lambda implements Function0<String> {
        public static final f0 b = new f0();

        f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The ContentCardsUpdatedEvent was null. Returning the default value for the unviewed card count.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f1 extends Lambda implements Function0<String> {
        public static final f1 b = new f1();

        f1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to flush push delivery events";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class f2 extends Lambda implements Function0<Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Content Cards is not enabled, skipping API call to refresh";
            }
        }

        f2() {
            super(0);
        }

        public final void a() {
            if (Braze.this.getUdm$android_sdk_base_release().getE().q()) {
                bo.app.z1.a(Braze.this.getUdm$android_sdk_base_release().getW(), Braze.this.getUdm$android_sdk_base_release().getC().e(), Braze.this.getUdm$android_sdk_base_release().getC().f(), 0, true, 4, null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, (BrazeLogger.Priority) null, (Throwable) null, a.b, 3, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class f3 extends Lambda implements Function0<Unit> {
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f3(long j) {
            super(0);
            this.c = j;
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().getW().a(this.c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<Unit> {
        final /* synthetic */ String b;
        final /* synthetic */ Braze c;
        final /* synthetic */ String d;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, String str2) {
                super(0);
                this.b = str;
                this.c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Cannot add null or blank card json to storage. Returning. User id: " + ((Object) this.b) + " Serialized json: " + this.c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Braze braze, String str2) {
            super(0);
            this.b = str;
            this.c = braze;
            this.d = str2;
        }

        public final void a() {
            if (StringsKt.isBlank(this.b)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.W, (Throwable) null, new a(this.d, this.b), 2, (Object) null);
                return;
            }
            this.c.getUdm$android_sdk_base_release().getC().a(new bo.app.a0(this.b), this.d);
            this.c.getExternalIEventMessenger().a((bo.app.h2) this.c.getUdm$android_sdk_base_release().getC().getCachedCardsAsEvent(), (Class<bo.app.h2>) ContentCardsUpdatedEvent.class);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g0 extends Lambda implements Function0<String> {
        public static final g0 b = new g0();

        g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The ContentCardsUpdatedEvent was null. Returning the default value for the last update timestamp.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class g1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g1(String str) {
            super(0);
            this.c = str;
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().getW().b(this.c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g2 extends Lambda implements Function0<String> {
        public static final g2 b = new g2();

        g2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to request Content Cards refresh from the cache.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g3 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g3(String str, boolean z) {
            super(0);
            this.b = str;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set Google Advertising ID data on device. Google Advertising ID: " + this.b + " and limit-ad-tracking: " + this.c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        final /* synthetic */ Class<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Class<T> cls) {
            super(0);
            this.b = cls;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to add synchronous subscriber for class: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.Braze$getCurrentUser$1", f = "Braze.kt", i = {}, l = {797}, m = "invokeSuspend", n = {}, s = {})
    static final class h0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int b;
        final /* synthetic */ IValueCallback<BrazeUser> c;
        final /* synthetic */ Braze d;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.braze.Braze$getCurrentUser$1$1", f = "Braze.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int b;
            final /* synthetic */ IValueCallback<BrazeUser> c;
            final /* synthetic */ Braze d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(IValueCallback<BrazeUser> iValueCallback, Braze braze, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = iValueCallback;
                this.d = braze;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                IValueCallback<BrazeUser> iValueCallback = this.c;
                BrazeUser brazeUser = this.d.brazeUser;
                if (brazeUser == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
                    brazeUser = null;
                }
                iValueCallback.onSuccess(brazeUser);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(IValueCallback<BrazeUser> iValueCallback, Braze braze, Continuation<? super h0> continuation) {
            super(2, continuation);
            this.c = iValueCallback;
            this.d = braze;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((h0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new h0(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext coroutineContext = BrazeCoroutineScope.INSTANCE.getCoroutineContext();
                a aVar = new a(this.c, this.d, null);
                this.b = 1;
                if (BuildersKt.withContext(coroutineContext, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h1 extends Lambda implements Function0<String> {
        public static final h1 b = new h1();

        h1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log push notification action clicked.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class h2 extends Lambda implements Function0<Unit> {
        h2() {
            super(0);
        }

        public final void a() {
            Braze.this.getExternalIEventMessenger().a((bo.app.h2) Braze.this.getUdm$android_sdk_base_release().getC().getCachedCardsAsEvent(), (Class<bo.app.h2>) ContentCardsUpdatedEvent.class);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class h3 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String b;
        final /* synthetic */ Braze c;
        final /* synthetic */ boolean d;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Google Advertising ID cannot be null or blank";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class b extends Lambda implements Function0<String> {
            final /* synthetic */ String b;
            final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, boolean z) {
                super(0);
                this.b = str;
                this.c = z;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Setting Google Advertising ID: " + this.b + " and limit-ad-tracking: " + this.c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h3(String str, Braze braze, boolean z) {
            super(0);
            this.b = str;
            this.c = braze;
            this.d = z;
        }

        public final void a() {
            if (StringsKt.isBlank(this.b)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.D, (Throwable) null, new b(this.b, this.d), 2, (Object) null);
            this.c.getUdm$android_sdk_base_release().getS().a(this.b);
            this.c.getUdm$android_sdk_base_release().getS().a(this.d);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        public static final i b = new i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Applying any pending runtime configuration values";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i0 extends Lambda implements Function0<String> {
        public static final i0 b = new i0();

        i0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to retrieve the current user.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class i1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String b;
        final /* synthetic */ Braze c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "No campaign Id associated with this notification (this is expected for test sends). Not logging push notification action clicked.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class b extends Lambda implements Function0<String> {
            public static final b b = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Action ID cannot be null or blank.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class c extends Lambda implements Function0<String> {
            public static final c b = new c();

            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Action Type cannot be null or blank.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i1(String str, Braze braze, String str2, String str3) {
            super(0);
            this.b = str;
            this.c = braze;
            this.d = str2;
            this.e = str3;
        }

        public final void a() {
            String str = this.b;
            if (str == null || StringsKt.isBlank(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
                return;
            }
            String str2 = this.d;
            if (str2 == null || StringsKt.isBlank(str2)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
                return;
            }
            String str3 = this.e;
            if (str3 == null || StringsKt.isBlank(str3)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.W, (Throwable) null, c.b, 2, (Object) null);
            } else {
                this.c.getUdm$android_sdk_base_release().getW().a(e4.k.a(this.b, this.d, this.e));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i2 extends Lambda implements Function0<String> {
        public static final i2 b = new i2();

        i2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to request refresh of feed.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i3 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i3(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set SDK authentication signature on device.\n", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        public static final j b = new j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Clearing config values";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.Braze$getDeviceIdAsync$1", f = "Braze.kt", i = {}, l = {819}, m = "invokeSuspend", n = {}, s = {})
    static final class j0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int b;
        final /* synthetic */ IValueCallback<String> c;
        final /* synthetic */ Braze d;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.braze.Braze$getDeviceIdAsync$1$1", f = "Braze.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int b;
            final /* synthetic */ IValueCallback<String> c;
            final /* synthetic */ Braze d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(IValueCallback<String> iValueCallback, Braze braze, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = iValueCallback;
                this.d = braze;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.c.onSuccess(this.d.getDeviceIdReader$android_sdk_base_release().getDeviceId());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(IValueCallback<String> iValueCallback, Braze braze, Continuation<? super j0> continuation) {
            super(2, continuation);
            this.c = iValueCallback;
            this.d = braze;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((j0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new j0(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext coroutineContext = BrazeCoroutineScope.INSTANCE.getCoroutineContext();
                a aVar = new a(this.c, this.d, null);
                this.b = 1;
                if (BuildersKt.withContext(coroutineContext, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j1 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j1(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log push open for '" + ((Object) this.b) + '\'';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class j2 extends Lambda implements Function0<Unit> {
        j2() {
            super(0);
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().getW().a(new x3.a(null, null, null, null, 15, null).b());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class j3 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String c;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Got new sdk auth signature ", this.b);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class b extends Lambda implements Function0<String> {
            public static final b b = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "SDK authentication signature cannot be null or blank";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j3(String str) {
            super(0);
            this.c = str;
        }

        public final void a() {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, Braze.this, BrazeLogger.Priority.V, (Throwable) null, new a(this.c), 2, (Object) null);
            if (StringsKt.isBlank(this.c)) {
                BrazeLogger.brazelog$default(brazeLogger, Braze.this, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
            } else {
                Braze.this.getUdm$android_sdk_base_release().getT().a(this.c);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k extends Lambda implements Function0<String> {
        final /* synthetic */ BrazeConfig b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(BrazeConfig brazeConfig) {
            super(0);
            this.b = brazeConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Setting pending config object: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k0 extends Lambda implements Function0<String> {
        public static final k0 b = new k0();

        k0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to retrieve the current device id.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class k1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String b;
        final /* synthetic */ Braze c;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "No campaign Id associated with this notification (this is expected for test sends). Not logging push notification opened.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k1(String str, Braze braze) {
            super(0);
            this.b = str;
            this.c = braze;
        }

        public final void a() {
            String str = this.b;
            if (str == null || StringsKt.isBlank(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
            } else {
                this.c.getUdm$android_sdk_base_release().getW().a(h4.j.a(this.b));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k2 extends Lambda implements Function0<String> {
        public static final k2 b = new k2();

        k2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to retrieve and publish feed from offline cache.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k3 extends Lambda implements Function0<String> {
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k3(boolean z) {
            super(0);
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set sync policy offline to ", Boolean.valueOf(this.b));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class l extends Lambda implements Function0<String> {
        public static final l b = new l();

        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to retrieve the cached ContentCardsUpdatedEvent.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class l0 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l0(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to get feature flag ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class l1 extends Lambda implements Function0<String> {
        final /* synthetic */ Intent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l1(Intent intent) {
            super(0);
            this.b = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Error logging push notification with intent: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class l2 extends Lambda implements Function0<Unit> {
        l2() {
            super(0);
        }

        public final void a() {
            Braze.this.getExternalIEventMessenger().a((bo.app.h2) Braze.this.getUdm$android_sdk_base_release().getB().getCachedCardsAsEvent(), (Class<bo.app.h2>) FeedUpdatedEvent.class);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class l3 extends Lambda implements Function0<Unit> {
        final /* synthetic */ boolean c;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            final /* synthetic */ boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z) {
                super(0);
                this.b = z;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Setting the image loader deny network downloads to ", Boolean.valueOf(this.b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l3(boolean z) {
            super(0);
            this.c = z;
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().getW().b(this.c);
            Braze.this.getUdm$android_sdk_base_release().getM().a(this.c);
            Braze braze = Braze.this;
            if (braze.imageLoader != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, braze, (BrazeLogger.Priority) null, (Throwable) null, new a(this.c), 3, (Object) null);
                Braze.this.getImageLoader().setOffline(this.c);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/braze/events/ContentCardsUpdatedEvent;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.Braze$cachedContentCardsUpdatedEvent$2", f = "Braze.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ContentCardsUpdatedEvent>, Object> {
        int b;

        m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ContentCardsUpdatedEvent> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Braze.this.new m(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (Braze.this.getUdm$android_sdk_base_release().getE().q()) {
                return Braze.this.getUdm$android_sdk_base_release().getC().getCachedCardsAsEvent();
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/braze/models/FeatureFlag;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.Braze$getFeatureFlag$2", f = "Braze.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class m0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super FeatureFlag>, Object> {
        int b;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m0(String str, Continuation<? super m0> continuation) {
            super(2, continuation);
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FeatureFlag> continuation) {
            return ((m0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Braze.this.new m0(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!Braze.this.getUdm$android_sdk_base_release().getE().s()) {
                return FeatureFlag.INSTANCE.a(this.d);
            }
            FeatureFlag featureFlag = (FeatureFlag) CollectionsKt.firstOrNull((List) Braze.this.getUdm$android_sdk_base_release().getA().a(this.d));
            return featureFlag == null ? FeatureFlag.INSTANCE.a(this.d) : featureFlag;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class m1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Intent b;
        final /* synthetic */ Braze c;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Cannot logPushNotificationOpened with null intent. Not logging push click.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class b extends Lambda implements Function0<String> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Logging push click. Campaign Id: ", this.b);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class c extends Lambda implements Function0<String> {
            public static final c b = new c();

            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "No campaign Id associated with this notification (this is expected for test sends). Not logging push click.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m1(Intent intent, Braze braze) {
            super(0);
            this.b = intent;
            this.c = braze;
        }

        public final void a() {
            Intent intent = this.b;
            if (intent == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.I, (Throwable) null, a.b, 2, (Object) null);
                return;
            }
            String stringExtra = intent.getStringExtra(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
            if (stringExtra == null || StringsKt.isBlank(stringExtra)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.I, (Throwable) null, c.b, 2, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.I, (Throwable) null, new b(stringExtra), 2, (Object) null);
                this.c.getUdm$android_sdk_base_release().getW().a(h4.j.a(stringExtra));
            }
            Braze.INSTANCE.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(this.b, this.c.getUdm$android_sdk_base_release().getW());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class m2 extends Lambda implements Function0<String> {
        public static final m2 b = new m2();

        m2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to request geofence refresh.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class m3 extends Lambda implements Function0<String> {
        public static final m3 b = new m3();

        m3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add subscriber for Content Cards updates.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class n extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set external id to: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class n0 extends Lambda implements Function0<String> {
        public static final n0 b = new n0();

        n0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error handling test in-app message push";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class n1 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n1(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log push story page clicked for pageId: " + ((Object) this.b) + " campaignId: " + ((Object) this.c);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class n2 extends Lambda implements Function0<Unit> {
        final /* synthetic */ IBrazeLocation b;
        final /* synthetic */ Braze c;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Cannot request Geofence refresh with null location.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n2(IBrazeLocation iBrazeLocation, Braze braze) {
            super(0);
            this.b = iBrazeLocation;
            this.c = braze;
        }

        public final void a() {
            if (this.b == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, (BrazeLogger.Priority) null, (Throwable) null, a.b, 3, (Object) null);
            } else {
                this.c.getUdm$android_sdk_base_release().getY().requestGeofenceRefresh(this.b);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class n3 extends Lambda implements Function0<String> {
        public static final n3 b = new n3();

        n3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to send cached feature flags upon subscribeToFeatureFlagsUpdates.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class o extends Lambda implements Function0<Unit> {
        final /* synthetic */ String b;
        final /* synthetic */ Braze c;
        final /* synthetic */ String d;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "userId passed to changeUser was null or empty. The current user will remain the active user.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class b extends Lambda implements Function0<String> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Rejected user id with byte length longer than 997. Not changing user. Input user id: ", this.b);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class c extends Lambda implements Function0<String> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Received request to change current user " + ((Object) this.b) + " to the same user id. Not changing user.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class d extends Lambda implements Function0<String> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Set sdk auth signature on changeUser call: ", this.b);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class e extends Lambda implements Function0<String> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Changing anonymous user to ", this.b);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class f extends Lambda implements Function0<String> {
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(String str, String str2) {
                super(0);
                this.b = str;
                this.c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Changing current user " + this.b + " to new user " + ((Object) this.c) + '.';
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class g extends Lambda implements Function0<String> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Set sdk auth signature on changeUser call: ", this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, Braze braze, String str2) {
            super(0);
            this.b = str;
            this.c = braze;
            this.d = str2;
        }

        public final void a() {
            bo.app.s3 s3Var;
            bo.app.k2 k2Var;
            String str = this.b;
            if (str == null || str.length() == 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
                return;
            }
            if (StringUtils.getByteSize(this.b) > 997) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.W, (Throwable) null, new b(this.b), 2, (Object) null);
                return;
            }
            BrazeUser brazeUser = this.c.brazeUser;
            if (brazeUser == null) {
                Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
                brazeUser = null;
            }
            String userId = brazeUser.getUserId();
            if (Intrinsics.areEqual(userId, this.b)) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, this.c, BrazeLogger.Priority.I, (Throwable) null, new c(this.b), 2, (Object) null);
                String str2 = this.d;
                if (str2 == null || StringsKt.isBlank(str2)) {
                    return;
                }
                BrazeLogger.brazelog$default(brazeLogger, this.c, (BrazeLogger.Priority) null, (Throwable) null, new d(this.d), 3, (Object) null);
                this.c.getUdm$android_sdk_base_release().getT().a(this.d);
                return;
            }
            this.c.getUdm$android_sdk_base_release().getH().b();
            this.c.getUdm$android_sdk_base_release().getR().a(DateTimeUtils.nowInSeconds());
            if (Intrinsics.areEqual(userId, "")) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.I, (Throwable) null, new e(this.b), 2, (Object) null);
                bo.app.s3 s3Var2 = this.c.offlineUserStorageProvider;
                if (s3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                    s3Var2 = null;
                }
                s3Var2.a(this.b);
                BrazeUser brazeUser2 = this.c.brazeUser;
                if (brazeUser2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
                    brazeUser2 = null;
                }
                brazeUser2.setUserId(this.b);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.I, (Throwable) null, new f(userId, this.b), 2, (Object) null);
                this.c.getExternalIEventMessenger().a((bo.app.h2) new FeedUpdatedEvent(new ArrayList(), this.b, false, DateTimeUtils.nowInSeconds()), (Class<bo.app.h2>) FeedUpdatedEvent.class);
            }
            this.c.getUdm$android_sdk_base_release().getW().e();
            bo.app.s3 s3Var3 = this.c.offlineUserStorageProvider;
            if (s3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                s3Var3 = null;
            }
            s3Var3.a(this.b);
            bo.app.z2 udm$android_sdk_base_release = this.c.getUdm$android_sdk_base_release();
            Context context = this.c.applicationContext;
            bo.app.s3 s3Var4 = this.c.offlineUserStorageProvider;
            if (s3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                s3Var = null;
            } else {
                s3Var = s3Var4;
            }
            BrazeConfigurationProvider configurationProvider$android_sdk_base_release = this.c.getConfigurationProvider$android_sdk_base_release();
            bo.app.h2 externalIEventMessenger = this.c.getExternalIEventMessenger();
            bo.app.e2 deviceIdReader$android_sdk_base_release = this.c.getDeviceIdReader$android_sdk_base_release();
            bo.app.k2 k2Var2 = this.c.registrationDataProvider;
            if (k2Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("registrationDataProvider");
                k2Var = null;
            } else {
                k2Var = k2Var2;
            }
            this.c.setUserSpecificMemberVariablesAndStartDispatch(new x6(context, s3Var, configurationProvider$android_sdk_base_release, externalIEventMessenger, deviceIdReader$android_sdk_base_release, k2Var, this.c.getPushDeliveryManager$android_sdk_base_release(), Braze.shouldMockNetworkRequestsAndDropEvents, Braze.areOutboundNetworkRequestsOffline));
            String str3 = this.d;
            if (str3 != null && !StringsKt.isBlank(str3)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, (BrazeLogger.Priority) null, (Throwable) null, new g(this.d), 3, (Object) null);
                this.c.getUdm$android_sdk_base_release().getT().a(this.d);
            }
            this.c.getUdm$android_sdk_base_release().b().g();
            this.c.getUdm$android_sdk_base_release().getW().d();
            this.c.getUdm$android_sdk_base_release().getW().a(new x3.a(null, null, null, null, 15, null).b());
            this.c.requestContentCardsRefresh();
            udm$android_sdk_base_release.a();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class o0 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Intent b;
        final /* synthetic */ Braze c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o0(Intent intent, Braze braze) {
            super(0);
            this.b = intent;
            this.c = braze;
        }

        public final void a() {
            Braze.INSTANCE.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(this.b, this.c.getUdm$android_sdk_base_release().getW());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class o1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ Braze d;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Push story page click input was invalid. Not logging in-app purchase to Braze.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o1(String str, String str2, Braze braze) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = braze;
        }

        public final void a() {
            if (!ValidationUtils.isValidPushStoryClickInput(this.b, this.c)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.d, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
                return;
            }
            j.a aVar = bo.app.j.h;
            String str = this.b;
            Intrinsics.checkNotNull(str);
            String str2 = this.c;
            Intrinsics.checkNotNull(str2);
            bo.app.x1 e = aVar.e(str, str2);
            if (e == null) {
                return;
            }
            this.d.getUdm$android_sdk_base_release().getW().a(e);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class o2 extends Lambda implements Function0<String> {
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o2(boolean z) {
            super(0);
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to request geofence refresh with rate limit ignore: ", Boolean.valueOf(this.b));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class o3 extends Lambda implements Function0<Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Sending cached update upon feature flag subscription";
            }
        }

        o3() {
            super(0);
        }

        public final void a() {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, (BrazeLogger.Priority) null, (Throwable) null, a.b, 3, (Object) null);
            if (Braze.this.getUdm$android_sdk_base_release().getE().s()) {
                Braze.this.getUdm$android_sdk_base_release().getA().a(Braze.this.getExternalIEventMessenger());
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class p extends Lambda implements Function0<String> {
        public static final p b = new p();

        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to close session.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class p0 extends Lambda implements Function0<String> {
        public static final p0 b = new p0();

        p0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Ephemeral events enabled";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class p1 extends Lambda implements Function0<String> {
        public static final p1 b = new p1();

        p1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to open session.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class p2 extends Lambda implements Function0<Unit> {
        final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p2(boolean z) {
            super(0);
            this.c = z;
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().getY().requestGeofenceRefresh(this.c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class p3 extends Lambda implements Function0<String> {
        public static final p3 b = new p3();

        p3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add subscriber for Feature Flags updates.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class q extends Lambda implements Function0<Unit> {
        final /* synthetic */ Activity b;
        final /* synthetic */ Braze c;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Cannot close session with null activity.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Activity activity, Braze braze) {
            super(0);
            this.b = activity;
            this.c = braze;
        }

        public final void a() {
            if (this.b == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
            } else {
                this.c.getUdm$android_sdk_base_release().getW().closeSession(this.b);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class q0 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ Set<String> c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q0(String str, Set<String> set, boolean z) {
            super(0);
            this.b = str;
            this.c = set;
            this.d = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Checking event key [" + this.b + "] against ephemeral event list " + this.c + " and got match?: " + this.d;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class q1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Activity b;
        final /* synthetic */ Braze c;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Cannot open session with null activity.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q1(Activity activity, Braze braze) {
            super(0);
            this.b = activity;
            this.c = braze;
        }

        public final void a() {
            if (this.b == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.I, (Throwable) null, a.b, 2, (Object) null);
            } else {
                this.c.getUdm$android_sdk_base_release().getW().openSession(this.b);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class q2 extends Lambda implements Function0<String> {
        public static final q2 b = new q2();

        q2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to request geofence refresh.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class q3 extends Lambda implements Function0<String> {
        public static final q3 b = new q3();

        q3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add subscriber for feed updates.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class r extends Lambda implements Function0<String> {
        public static final r b = new r();

        r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to retrieve the current user.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class r0 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r0(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to log custom event: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class r1 extends Lambda implements Function0<String> {
        public static final r1 b = new r1();

        r1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to flush push delivery events";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class r2 extends Lambda implements Function0<Unit> {
        final /* synthetic */ double b;
        final /* synthetic */ double c;
        final /* synthetic */ Braze d;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            final /* synthetic */ double b;
            final /* synthetic */ double c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(double d, double d2) {
                super(0);
                this.b = d;
                this.c = d2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Location provided is invalid. Not requesting refresh of Braze Geofences. Provided latitude - longitude: " + this.b + " - " + this.c;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class b extends Lambda implements Function0<String> {
            final /* synthetic */ double b;
            final /* synthetic */ double c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(double d, double d2) {
                super(0);
                this.b = d;
                this.c = d2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Manually requesting Geofence refresh of with provided latitude - longitude: " + this.b + " - " + this.c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r2(double d, double d2, Braze braze) {
            super(0);
            this.b = d;
            this.c = d2;
            this.d = braze;
        }

        public final void a() {
            if (!ValidationUtils.isValidLocation(this.b, this.c)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.d, BrazeLogger.Priority.W, (Throwable) null, new a(this.b, this.c), 2, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.d, BrazeLogger.Priority.W, (Throwable) null, new b(this.b, this.c), 2, (Object) null);
            this.d.getUdm$android_sdk_base_release().getY().requestGeofenceRefresh(new BrazeLocation(this.b, this.c, null, null, null, 28, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class r3 extends Lambda implements Function0<String> {
        public static final r3 b = new r3();

        r3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add subscriber for network failures.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/braze/BrazeUser;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.Braze$currentUser$2", f = "Braze.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BrazeUser>, Object> {
        int b;

        s(Continuation<? super s> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BrazeUser> continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Braze.this.new s(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BrazeUser brazeUser = Braze.this.brazeUser;
            if (brazeUser != null) {
                return brazeUser;
            }
            Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class s0 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String b;
        final /* synthetic */ Braze c;
        final /* synthetic */ BrazeProperties d;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            final /* synthetic */ Ref.ObjectRef<String> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ref.ObjectRef<String> objectRef) {
                super(0);
                this.b = objectRef;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Logged custom event with name " + ((Object) this.b.element) + " was invalid. Not logging custom event to Braze.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class b extends Lambda implements Function0<String> {
            final /* synthetic */ Ref.ObjectRef<String> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Ref.ObjectRef<String> objectRef) {
                super(0);
                this.b = objectRef;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Custom event with name " + ((Object) this.b.element) + " logged with invalid properties. Not logging custom event to Braze.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s0(String str, Braze braze, BrazeProperties brazeProperties) {
            super(0);
            this.b = str;
            this.c = braze;
            this.d = brazeProperties;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.String] */
        public final void a() {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? r1 = this.b;
            objectRef.element = r1;
            if (!ValidationUtils.isValidLogCustomEventInput(r1, this.c.getUdm$android_sdk_base_release().getE())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.W, (Throwable) null, new a(objectRef), 2, (Object) null);
                return;
            }
            BrazeProperties brazeProperties = this.d;
            if (brazeProperties != null && brazeProperties.isInvalid()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.W, (Throwable) null, new b(objectRef), 2, (Object) null);
                return;
            }
            ?? ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength((String) objectRef.element);
            objectRef.element = ensureBrazeFieldLength;
            bo.app.x1 a2 = bo.app.j.h.a((String) ensureBrazeFieldLength, this.d);
            if (a2 == null) {
                return;
            }
            if (this.c.isEphemeralEventKey((String) objectRef.element) ? this.c.getUdm$android_sdk_base_release().getE().r() : this.c.getUdm$android_sdk_base_release().getW().a(a2)) {
                this.c.getUdm$android_sdk_base_release().getX().a(new bo.app.f0((String) objectRef.element, this.d, a2));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class s1 extends Lambda implements Function0<Unit> {
        s1() {
            super(0);
        }

        public final void a() {
            bo.app.z1.a(Braze.this.getUdm$android_sdk_base_release().getW(), 0L, 1, (Object) null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class s2 extends Lambda implements Function0<String> {
        public static final s2 b = new s2();

        s2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to initialize geofences with the geofence manager.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class s3 extends Lambda implements Function0<String> {
        public static final s3 b = new s3();

        s3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add subscriber to new in-app messages.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class t extends Lambda implements Function0<String> {
        public static final t b = new t();

        t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot deserialize null content card json string. Returning null.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class t0 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t0(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to log feed card clicked. Card id: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class t1 extends Lambda implements Function0<String> {
        public static final t1 b = new t1();

        t1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "User dependency manager is uninitialized. Not publishing error.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class t2 extends Lambda implements Function0<Unit> {
        t2() {
            super(0);
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().getY().initializeGeofences();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class t3 extends Lambda implements Function0<String> {
        public static final t3 b = new t3();

        t3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add subscriber to no matching trigger events.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class u extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to deserialize content card json string. Payload: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class u0 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String b;
        final /* synthetic */ Braze c;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Card ID cannot be null or blank.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u0(String str, Braze braze) {
            super(0);
            this.b = str;
            this.c = braze;
        }

        public final void a() {
            String str = this.b;
            if (str == null || StringsKt.isBlank(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
                return;
            }
            bo.app.x1 e = bo.app.j.h.e(this.b);
            if (e == null) {
                return;
            }
            this.c.getUdm$android_sdk_base_release().getW().a(e);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class u1 extends Lambda implements Function0<String> {
        final /* synthetic */ Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u1(Throwable th) {
            super(0);
            this.b = th;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to log throwable: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class u2 extends Lambda implements Function0<String> {
        public static final u2 b = new u2();

        u2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to request data flush.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class u3 extends Lambda implements Function0<String> {
        public static final u3 b = new u3();

        u3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add subscriber for push notification updates.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class v extends Lambda implements Function0<String> {
        final /* synthetic */ JSONObject b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(JSONObject jSONObject) {
            super(0);
            this.b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to deserialize content card json. Payload: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class v0 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v0(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to log feed card impression. Card id: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class v1 extends Lambda implements Function0<String> {
        public static final v1 b = new v1();

        v1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to post geofence report.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class v2 extends Lambda implements Function0<Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "requestImmediateDataFlush() called";
            }
        }

        v2() {
            super(0);
        }

        public final void a() {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.V, (Throwable) null, a.b, 2, (Object) null);
            Braze.this.getUdm$android_sdk_base_release().getW().b();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class v3 extends Lambda implements Function0<String> {
        public static final v3 b = new v3();

        v3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add subscriber for SDK authentication failures.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/braze/models/cards/Card;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.Braze$deserializeContentCard$4", f = "Braze.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class w extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Card>, Object> {
        int b;
        private /* synthetic */ Object c;
        final /* synthetic */ JSONObject e;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Content Cards are disabled. Not deserializing json. Returning null.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class b extends Lambda implements Function0<String> {
            public static final b b = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Cannot deserialize null content card json. Returning null.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(JSONObject jSONObject, Continuation<? super w> continuation) {
            super(2, continuation);
            this.e = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Card> continuation) {
            return ((w) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            w wVar = Braze.this.new w(this.e, continuation);
            wVar.c = obj;
            return wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.c;
            if (!Braze.this.getUdm$android_sdk_base_release().getE().q()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, coroutineScope, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
                return null;
            }
            if (this.e != null) {
                return Braze.this.getUdm$android_sdk_base_release().getC().a(this.e);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, coroutineScope, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class w0 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String b;
        final /* synthetic */ Braze c;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Card ID cannot be null or blank.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w0(String str, Braze braze) {
            super(0);
            this.b = str;
            this.c = braze;
        }

        public final void a() {
            String str = this.b;
            if (str == null || StringsKt.isBlank(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
                return;
            }
            bo.app.x1 f = bo.app.j.h.f(this.b);
            if (f != null) {
                this.c.getUdm$android_sdk_base_release().getW().a(f);
            }
            this.c.getUdm$android_sdk_base_release().getB().markCardAsViewed(this.b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class w1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String b;
        final /* synthetic */ GeofenceTransitionType c;
        final /* synthetic */ Braze d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w1(String str, GeofenceTransitionType geofenceTransitionType, Braze braze) {
            super(0);
            this.b = str;
            this.c = geofenceTransitionType;
            this.d = braze;
        }

        public final void a() {
            String str = this.b;
            if (str == null || StringsKt.isBlank(str) || this.c == null) {
                return;
            }
            this.d.getUdm$android_sdk_base_release().getY().postGeofenceReport(this.b, this.c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class w2 extends Lambda implements Function0<String> {
        public static final w2 b = new w2();

        w2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Location permissions were granted. Requesting geofence and location initialization.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class w3 extends Lambda implements Function0<String> {
        public static final w3 b = new w3();

        w3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add subscriber for session updates.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class x extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to deserialize in-app message json. Payload: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class x0 extends Lambda implements Function0<String> {
        public static final x0 b = new x0();

        x0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log that the feed was displayed.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class x1 extends Lambda implements Function0<String> {
        public static final x1 b = new x1();

        x1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to refresh feature flags.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class x2 extends Lambda implements Function0<String> {
        public static final x2 b = new x2();

        x2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to request single location update";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class x3 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x3(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The Braze SDK requires the permission " + this.b + ". Check your AndroidManifest.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/braze/models/inappmessage/IInAppMessage;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.Braze$deserializeInAppMessageString$2", f = "Braze.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class y extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super IInAppMessage>, Object> {
        int b;
        final /* synthetic */ String c;
        final /* synthetic */ Braze d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(String str, Braze braze, Continuation<? super y> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = braze;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super IInAppMessage> continuation) {
            return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new y(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = this.c;
            if (str == null) {
                return null;
            }
            return bo.app.c3.a(str, this.d.getUdm$android_sdk_base_release().getW());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class y0 extends Lambda implements Function0<Unit> {
        y0() {
            super(0);
        }

        public final void a() {
            bo.app.x1 a = bo.app.j.h.a();
            if (a == null) {
                return;
            }
            Braze.this.getUdm$android_sdk_base_release().getW().a(a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class y1 extends Lambda implements Function0<Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Feature flags not enabled. Not refreshing feature flags.";
            }
        }

        y1() {
            super(0);
        }

        public final void a() {
            if (Braze.this.getUdm$android_sdk_base_release().getE().s()) {
                Braze.this.getUdm$android_sdk_base_release().getA().g();
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.I, (Throwable) null, a.b, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class y2 extends Lambda implements Function0<Unit> {
        y2() {
            super(0);
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().getZ().a();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class y3 extends Lambda implements Function0<String> {
        public static final y3 b = new y3();

        y3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The Braze SDK requires a non-empty API key. Check your braze.xml or BrazeConfig.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class z extends Lambda implements Function0<String> {
        public static final z b = new z();

        z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to retrieve the device id.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class z0 extends Lambda implements Function0<String> {
        public static final z0 b = new z0();

        z0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log location recorded event.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class z1 extends Lambda implements Function0<String> {
        public static final z1 b = new z1();

        z1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to get the registered push registration token.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class z2 extends Lambda implements Function0<String> {
        final /* synthetic */ InAppMessageEvent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z2(InAppMessageEvent inAppMessageEvent) {
            super(0);
            this.b = inAppMessageEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Error retrying In-App Message from event ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class z3 extends Lambda implements Function0<String> {
        public static final z3 b = new z3();

        z3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The Braze SDK is not integrated correctly. Please visit https://www.braze.com/docs/developer_guide/platform_integration_guides/android/initial_sdk_setup/android_sdk_integration/";
        }
    }

    public Braze(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        long nanoTime = System.nanoTime();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, a.b, 3, (Object) null);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
        String str = Build.MODEL;
        if (str != null) {
            Set<String> set = KNOWN_APP_CRAWLER_DEVICE_MODELS;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (set.contains(lowerCase)) {
                BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, new b(str), 2, (Object) null);
                INSTANCE.enableMockNetworkRequestsAndDropEventsMode();
            }
        }
        setImageLoader(new DefaultBrazeImageLoader(this.applicationContext));
        this.externalIEventMessenger = new bo.app.b1(INSTANCE.getSdkEnablementProvider(this.applicationContext));
        run$android_sdk_base_release(c.b, false, new d(context));
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new e(System.nanoTime(), nanoTime), 3, (Object) null);
    }

    @JvmStatic
    public static final void addSdkMetadata(Context context, EnumSet<BrazeSdkMetadata> enumSet) {
        INSTANCE.addSdkMetadata(context, enumSet);
    }

    @JvmStatic
    public static final void clearEndpointProvider() {
        INSTANCE.clearEndpointProvider();
    }

    @JvmStatic
    public static final boolean configure(Context context, BrazeConfig brazeConfig) {
        return INSTANCE.configure(context, brazeConfig);
    }

    @JvmStatic
    public static final void disableSdk(Context context) {
        INSTANCE.disableSdk(context);
    }

    @JvmStatic
    public static final boolean enableMockNetworkRequestsAndDropEventsMode() {
        return INSTANCE.enableMockNetworkRequestsAndDropEventsMode();
    }

    @JvmStatic
    public static final void enableSdk(Context context) {
        INSTANCE.enableSdk(context);
    }

    @JvmStatic
    public static final Uri getApiEndpoint(Uri uri) {
        return INSTANCE.getApiEndpoint(uri);
    }

    private final ContentCardsUpdatedEvent getCachedContentCardsUpdatedEvent() {
        return (ContentCardsUpdatedEvent) runForResult$default(this, null, l.b, false, new m(null), 4, null);
    }

    public static /* synthetic */ void getConfigurationProvider$android_sdk_base_release$annotations() {
    }

    @JvmStatic
    public static final String getConfiguredApiKey(BrazeConfigurationProvider brazeConfigurationProvider) {
        return INSTANCE.getConfiguredApiKey(brazeConfigurationProvider);
    }

    public static final IBrazeNotificationFactory getCustomBrazeNotificationFactory() {
        return INSTANCE.getCustomBrazeNotificationFactory();
    }

    public static /* synthetic */ void getDeviceIdReader$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getExternalIEventMessenger$android_sdk_base_release$annotations() {
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

    private static /* synthetic */ void getRegistrationDataProvider$annotations() {
    }

    public static /* synthetic */ void getUdm$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void isApiKeyPresent$android_sdk_base_release$annotations() {
    }

    public static final boolean isDisabled() {
        return INSTANCE.isDisabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isEphemeralEventKey(String key) {
        if (!getConfigurationProvider$android_sdk_base_release().isEphemeralEventsEnabled()) {
            return false;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, p0.b, 2, (Object) null);
        Set<String> ephemeralEventKeys = getConfigurationProvider$android_sdk_base_release().getEphemeralEventKeys();
        boolean contains = ephemeralEventKeys.contains(key);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new q0(key, ephemeralEventKeys, contains), 2, (Object) null);
        return contains;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishError(Throwable throwable) {
        if (this.udm == null) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.V, throwable, t1.b);
            return;
        }
        try {
            getUdm$android_sdk_base_release().getH().a((bo.app.b1) throwable, (Class<bo.app.b1>) Throwable.class);
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e4, new u1(throwable));
        }
    }

    public static /* synthetic */ void run$android_sdk_base_release$default(Braze braze, Function0 function0, boolean z4, Function0 function02, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        braze.run$android_sdk_base_release(function0, z4, function02);
    }

    private final <T> T runForResult(T defaultValueOnException, Function0<String> errorLog, boolean earlyReturnIfDisabled, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        Object runBlocking$default;
        if (earlyReturnIfDisabled && INSTANCE.isDisabled()) {
            return defaultValueOnException;
        }
        try {
            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new d3(block, null), 1, null);
            return (T) runBlocking$default;
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e4, errorLog);
            publishError(e4);
            return defaultValueOnException;
        }
    }

    static /* synthetic */ Object runForResult$default(Braze braze, Object obj, Function0 function0, boolean z4, Function2 function2, int i4, Object obj2) {
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        return braze.runForResult(obj, function0, z4, function2);
    }

    public static final void setCustomBrazeNotificationFactory(IBrazeNotificationFactory iBrazeNotificationFactory) {
        INSTANCE.setCustomBrazeNotificationFactory(iBrazeNotificationFactory);
    }

    @JvmStatic
    public static final void setEndpointProvider(IBrazeEndpointProvider iBrazeEndpointProvider) {
        INSTANCE.setEndpointProvider(iBrazeEndpointProvider);
    }

    public static final void setOutboundNetworkRequestsOffline(boolean z4) {
        INSTANCE.setOutboundNetworkRequestsOffline(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSyncPolicyOfflineStatus(boolean isOffline) {
        run$android_sdk_base_release$default(this, new k3(isOffline), false, new l3(isOffline), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUserSpecificMemberVariablesAndStartDispatch(x6 dependencyProvider) {
        setUdm$android_sdk_base_release(dependencyProvider);
        h5.a.a(getUdm$android_sdk_base_release().getH());
        w6 b5 = getUdm$android_sdk_base_release().b();
        bo.app.z1 w4 = getUdm$android_sdk_base_release().getW();
        bo.app.s3 s3Var = this.offlineUserStorageProvider;
        if (s3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
            s3Var = null;
        }
        this.brazeUser = new BrazeUser(b5, w4, s3Var.a(), getUdm$android_sdk_base_release().getZ(), getUdm$android_sdk_base_release().getE());
        getUdm$android_sdk_base_release().getL().a(getUdm$android_sdk_base_release().getH());
        getUdm$android_sdk_base_release().getI().d();
        getUdm$android_sdk_base_release().getQ().a(getUdm$android_sdk_base_release().getI());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void verifyProperSdkSetup() {
        boolean z4 = true;
        for (String str : NECESSARY_BRAZE_SDK_PERMISSIONS) {
            if (!PermissionUtils.hasPermission(this.applicationContext, str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new x3(str), 2, (Object) null);
                z4 = false;
            }
        }
        if (StringsKt.isBlank(getConfigurationProvider$android_sdk_base_release().getBrazeApiKey().toString())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, y3.b, 2, (Object) null);
            z4 = false;
        }
        if (z4) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, z3.b, 2, (Object) null);
    }

    @JvmStatic
    public static final void wipeData(Context context) {
        INSTANCE.wipeData(context);
    }

    public final /* synthetic */ void addSerializedCardJsonToStorage$android_sdk_base_release(String serializedCardJson, String userId) {
        Intrinsics.checkNotNullParameter(serializedCardJson, "serializedCardJson");
        run$android_sdk_base_release$default(this, new f(userId, serializedCardJson), false, new g(serializedCardJson, this, userId), 2, null);
    }

    @Override // com.braze.IBraze
    public <T> void addSingleSynchronousSubscription(IEventSubscriber<T> subscriber, Class<T> eventClass) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        try {
            this.externalIEventMessenger.b(eventClass, subscriber);
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e4, new h(eventClass));
            publishError(e4);
        }
    }

    public final /* synthetic */ void applyPendingRuntimeConfiguration$android_sdk_base_release() {
        ReentrantLock reentrantLock = brazeClassLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, i.b, 3, (Object) null);
            Braze braze = this;
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = new RuntimeAppConfigurationProvider(braze.applicationContext);
            for (BrazeConfig brazeConfig : pendingConfigurations) {
                if (Intrinsics.areEqual(brazeConfig, clearConfigSentinel)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, braze, BrazeLogger.Priority.V, (Throwable) null, j.b, 2, (Object) null);
                    runtimeAppConfigurationProvider.clearAllConfigurationValues();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new k(brazeConfig), 2, (Object) null);
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

    @Override // com.braze.IBraze
    public void changeUser(String userId) {
        changeUser(userId, null);
    }

    @Override // com.braze.IBraze
    public void closeSession(Activity activity) {
        run$android_sdk_base_release$default(this, p.b, false, new q(activity, this), 2, null);
    }

    @Override // com.braze.IBraze
    public Card deserializeContentCard(String contentCardString) {
        if (INSTANCE.isDisabled()) {
            return null;
        }
        if (contentCardString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, t.b, 2, (Object) null);
            return null;
        }
        try {
            return deserializeContentCard(new JSONObject(contentCardString));
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e4, new u(contentCardString));
            publishError(e4);
            return null;
        }
    }

    @Override // com.braze.IBraze
    public IInAppMessage deserializeInAppMessageString(String inAppMessageString) {
        return (IInAppMessage) runForResult$default(this, null, new x(inAppMessageString), false, new y(inAppMessageString, this, null), 4, null);
    }

    @Override // com.braze.IBraze
    public List<FeatureFlag> getAllFeatureFlags() {
        return (List) runForResult$default(this, CollectionsKt.emptyList(), b0.b, false, new c0(null), 4, null);
    }

    @Override // com.braze.IBraze
    public List<Card> getCachedContentCards() {
        if (INSTANCE.isDisabled()) {
            return null;
        }
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getAllCards();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, d0.b, 2, (Object) null);
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

    @Override // com.braze.IBraze
    public int getContentCardCount() {
        if (INSTANCE.isDisabled()) {
            return -1;
        }
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getCardCount();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, e0.b, 2, (Object) null);
        return -1;
    }

    @Override // com.braze.IBraze
    public int getContentCardUnviewedCount() {
        if (INSTANCE.isDisabled()) {
            return -1;
        }
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getUnviewedCardCount();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, f0.b, 2, (Object) null);
        return -1;
    }

    @Override // com.braze.IBraze
    public long getContentCardsLastUpdatedInSecondsFromEpoch() {
        if (INSTANCE.isDisabled()) {
            return -1L;
        }
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getTimestampSeconds();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, g0.b, 2, (Object) null);
        return -1L;
    }

    @Override // com.braze.IBraze
    public BrazeUser getCurrentUser() {
        return (BrazeUser) runForResult(null, r.b, false, new s(null));
    }

    @Override // com.braze.IBraze
    public String getDeviceId() {
        return (String) runForResult("", z.b, false, new a0(null));
    }

    @Override // com.braze.IBraze
    public void getDeviceIdAsync(IValueCallback<String> completionCallback) {
        Intrinsics.checkNotNullParameter(completionCallback, "completionCallback");
        if (INSTANCE.isDisabled()) {
            completionCallback.onError();
            return;
        }
        try {
            BuildersKt__Builders_commonKt.launch$default(h5.a, null, null, new j0(completionCallback, this, null), 3, null);
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e4, k0.b);
            completionCallback.onError();
            publishError(e4);
        }
    }

    public final bo.app.e2 getDeviceIdReader$android_sdk_base_release() {
        bo.app.e2 e2Var = this.deviceIdReader;
        if (e2Var != null) {
            return e2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceIdReader");
        return null;
    }

    /* renamed from: getExternalIEventMessenger$android_sdk_base_release, reason: from getter */
    public final bo.app.h2 getExternalIEventMessenger() {
        return this.externalIEventMessenger;
    }

    @Override // com.braze.IBraze
    public FeatureFlag getFeatureFlag(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return (FeatureFlag) runForResult$default(this, FeatureFlag.INSTANCE.a(id), new l0(id), false, new m0(id, null), 4, null);
    }

    @Override // com.braze.IBraze
    public IBrazeImageLoader getImageLoader() {
        IBrazeImageLoader iBrazeImageLoader = this.imageLoader;
        if (iBrazeImageLoader != null) {
            return iBrazeImageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final j4 getPushDeliveryManager$android_sdk_base_release() {
        j4 j4Var = this.pushDeliveryManager;
        if (j4Var != null) {
            return j4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pushDeliveryManager");
        return null;
    }

    @Override // com.braze.IBraze
    public String getRegisteredPushToken() {
        return (String) runForResult$default(this, null, z1.b, false, new a2(null), 4, null);
    }

    public final bo.app.z2 getUdm$android_sdk_base_release() {
        bo.app.z2 z2Var = this.udm;
        if (z2Var != null) {
            return z2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("udm");
        return null;
    }

    public final /* synthetic */ void handleInAppMessageTestPush$android_sdk_base_release(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        run$android_sdk_base_release$default(this, n0.b, false, new o0(intent, this), 2, null);
    }

    /* renamed from: isApiKeyPresent$android_sdk_base_release, reason: from getter */
    public final Boolean getIsApiKeyPresent() {
        return this.isApiKeyPresent;
    }

    @Override // com.braze.IBraze
    public void logCustomEvent(String eventName) {
        logCustomEvent(eventName, null);
    }

    @Override // com.braze.IBraze
    @Deprecated(message = "Please call {@link Card#logClick()} instead to log a click.", replaceWith = @ReplaceWith(expression = "Card.logClick()", imports = {}))
    public void logFeedCardClick(String cardId) {
        run$android_sdk_base_release$default(this, new t0(cardId), false, new u0(cardId, this), 2, null);
    }

    @Override // com.braze.IBraze
    @Deprecated(message = "Please call {@link Card#logImpression()} instead to log an impression.", replaceWith = @ReplaceWith(expression = "Card.logImpression", imports = {}))
    public void logFeedCardImpression(String cardId) {
        run$android_sdk_base_release$default(this, new v0(cardId), false, new w0(cardId, this), 2, null);
    }

    @Override // com.braze.IBraze
    public void logFeedDisplayed() {
        run$android_sdk_base_release$default(this, x0.b, false, new y0(), 2, null);
    }

    public final /* synthetic */ void logLocationRecordedEventFromLocationUpdate$android_sdk_base_release(IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        run$android_sdk_base_release$default(this, z0.b, false, new a1(location, this), 2, null);
    }

    @Override // com.braze.IBraze
    public void logPurchase(String productId, String currencyCode, BigDecimal price) {
        logPurchase(productId, currencyCode, price, 1);
    }

    public final /* synthetic */ void logPushDelivery$android_sdk_base_release(String campaignId, long timeInMs) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        run$android_sdk_base_release$default(this, new d1(campaignId), false, new e1(campaignId, timeInMs), 2, null);
    }

    public final /* synthetic */ void logPushMaxCampaign$android_sdk_base_release(String campaign) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        run$android_sdk_base_release$default(this, f1.b, false, new g1(campaign), 2, null);
    }

    @Override // com.braze.IBraze
    public void logPushNotificationActionClicked(String campaignId, String actionId, String actionType) {
        run$android_sdk_base_release$default(this, h1.b, false, new i1(campaignId, this, actionId, actionType), 2, null);
    }

    @Override // com.braze.IBraze
    public void logPushNotificationOpened(String campaignId) {
        run$android_sdk_base_release$default(this, new j1(campaignId), false, new k1(campaignId, this), 2, null);
    }

    @Override // com.braze.IBraze
    public void logPushStoryPageClicked(String campaignId, String pageId) {
        run$android_sdk_base_release$default(this, new n1(pageId, campaignId), false, new o1(campaignId, pageId, this), 2, null);
    }

    @Override // com.braze.IBraze
    public void openSession(Activity activity) {
        run$android_sdk_base_release$default(this, p1.b, false, new q1(activity, this), 2, null);
    }

    public final /* synthetic */ void performPushDeliveryFlush$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, r1.b, false, new s1(), 2, null);
    }

    public final /* synthetic */ void publishBrazePushAction$android_sdk_base_release(BrazePushEventType pushActionType, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(pushActionType, "pushActionType");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.externalIEventMessenger.a((bo.app.h2) new BrazePushEvent(pushActionType, payload), (Class<bo.app.h2>) BrazePushEvent.class);
    }

    public final /* synthetic */ void recordGeofenceTransition$android_sdk_base_release(String geofenceId, GeofenceTransitionType transitionType) {
        run$android_sdk_base_release$default(this, v1.b, false, new w1(geofenceId, transitionType, this), 2, null);
    }

    @Override // com.braze.IBraze
    public void refreshFeatureFlags() {
        run$android_sdk_base_release$default(this, x1.b, false, new y1(), 2, null);
    }

    @Override // com.braze.IBraze
    public <T> void removeSingleSubscription(IEventSubscriber<T> subscriber, Class<T> eventClass) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        if (subscriber == null) {
            return;
        }
        try {
            getExternalIEventMessenger().c(eventClass, subscriber);
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e4, new d2(eventClass));
            publishError(e4);
        }
    }

    @Override // com.braze.IBraze
    @Deprecated(message = "Please call {@link IBraze#requestContentCardsRefresh()} or {@link IBraze#requestContentCardsRefreshFromCache()} instead to refresh Content Cards", replaceWith = @ReplaceWith(expression = "IBraze.requestContentCardsRefresh", imports = {}))
    public void requestContentCardsRefresh(boolean fromCache) {
        if (fromCache) {
            requestContentCardsRefreshFromCache();
        } else {
            requestContentCardsRefresh();
        }
    }

    @Override // com.braze.IBraze
    public void requestContentCardsRefreshFromCache() {
        run$android_sdk_base_release$default(this, g2.b, false, new h2(), 2, null);
    }

    @Override // com.braze.IBraze
    public void requestFeedRefresh() {
        run$android_sdk_base_release$default(this, i2.b, false, new j2(), 2, null);
    }

    @Override // com.braze.IBraze
    public void requestFeedRefreshFromCache() {
        run$android_sdk_base_release$default(this, k2.b, false, new l2(), 2, null);
    }

    public final /* synthetic */ void requestGeofenceRefresh$android_sdk_base_release(IBrazeLocation location) {
        run$android_sdk_base_release$default(this, m2.b, false, new n2(location, this), 2, null);
    }

    @Override // com.braze.IBraze
    public void requestGeofences(double latitude, double longitude) {
        run$android_sdk_base_release$default(this, q2.b, false, new r2(latitude, longitude, this), 2, null);
    }

    public final /* synthetic */ void requestGeofencesInitialization$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, s2.b, false, new t2(), 2, null);
    }

    @Override // com.braze.IBraze
    public void requestImmediateDataFlush() {
        run$android_sdk_base_release$default(this, u2.b, false, new v2(), 2, null);
    }

    @Override // com.braze.IBraze
    public void requestLocationInitialization() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, w2.b, 3, (Object) null);
        requestGeofencesInitialization$android_sdk_base_release();
        requestSingleLocationUpdate$android_sdk_base_release();
    }

    public final /* synthetic */ void requestSingleLocationUpdate$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, x2.b, false, new y2(), 2, null);
    }

    public final /* synthetic */ void retryInAppMessage$android_sdk_base_release(InAppMessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        run$android_sdk_base_release$default(this, new z2(event), false, new a3(event), 2, null);
    }

    public final /* synthetic */ void run$android_sdk_base_release(Function0 errorLog, boolean earlyReturnIfDisabled, Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (earlyReturnIfDisabled && INSTANCE.isDisabled()) {
            return;
        }
        try {
            BuildersKt__Builders_commonKt.launch$default(h5.a, null, null, new b3(block, null), 3, null);
        } catch (Exception e4) {
            if (errorLog == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, e4, c3.b, 1, (Object) null);
            } else {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e4, (Function0<String>) errorLog);
            }
            publishError(e4);
        }
    }

    public final /* synthetic */ void schedulePushDelivery$android_sdk_base_release(long timeInMs) {
        run$android_sdk_base_release$default(this, e3.b, false, new f3(timeInMs), 2, null);
    }

    public final void setApiKeyPresent$android_sdk_base_release(Boolean bool) {
        this.isApiKeyPresent = bool;
    }

    public final void setConfigurationProvider$android_sdk_base_release(BrazeConfigurationProvider brazeConfigurationProvider) {
        Intrinsics.checkNotNullParameter(brazeConfigurationProvider, "<set-?>");
        this.configurationProvider = brazeConfigurationProvider;
    }

    public final void setDeviceIdReader$android_sdk_base_release(bo.app.e2 e2Var) {
        Intrinsics.checkNotNullParameter(e2Var, "<set-?>");
        this.deviceIdReader = e2Var;
    }

    public final void setExternalIEventMessenger$android_sdk_base_release(bo.app.h2 h2Var) {
        Intrinsics.checkNotNullParameter(h2Var, "<set-?>");
        this.externalIEventMessenger = h2Var;
    }

    @Override // com.braze.IBraze
    public void setGoogleAdvertisingId(String googleAdvertisingId, boolean isLimitAdTrackingEnabled) {
        Intrinsics.checkNotNullParameter(googleAdvertisingId, "googleAdvertisingId");
        run$android_sdk_base_release$default(this, new g3(googleAdvertisingId, isLimitAdTrackingEnabled), false, new h3(googleAdvertisingId, this, isLimitAdTrackingEnabled), 2, null);
    }

    @Override // com.braze.IBraze
    public void setImageLoader(IBrazeImageLoader iBrazeImageLoader) {
        Intrinsics.checkNotNullParameter(iBrazeImageLoader, "<set-?>");
        this.imageLoader = iBrazeImageLoader;
    }

    public final void setPushDeliveryManager$android_sdk_base_release(j4 j4Var) {
        Intrinsics.checkNotNullParameter(j4Var, "<set-?>");
        this.pushDeliveryManager = j4Var;
    }

    @Override // com.braze.IBraze
    public void setRegisteredPushToken(String str) {
        run$android_sdk_base_release$default(this, new b2(str), false, new c2(str), 2, null);
    }

    @Override // com.braze.IBraze
    public void setSdkAuthenticationSignature(String signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        run$android_sdk_base_release$default(this, new i3(signature), false, new j3(signature), 2, null);
    }

    public final void setUdm$android_sdk_base_release(bo.app.z2 z2Var) {
        Intrinsics.checkNotNullParameter(z2Var, "<set-?>");
        this.udm = z2Var;
    }

    @Override // com.braze.IBraze
    public void subscribeToContentCardsUpdates(IEventSubscriber<ContentCardsUpdatedEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            this.externalIEventMessenger.a(ContentCardsUpdatedEvent.class, subscriber);
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e4, m3.b);
            publishError(e4);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToFeatureFlagsUpdates(IEventSubscriber<FeatureFlagsUpdatedEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            this.externalIEventMessenger.a(FeatureFlagsUpdatedEvent.class, subscriber);
        } catch (Exception e4) {
            e = e4;
        }
        try {
            run$android_sdk_base_release$default(this, n3.b, false, new o3(), 2, null);
        } catch (Exception e5) {
            e = e5;
            Exception exc = e;
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, exc, p3.b);
            publishError(exc);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToFeedUpdates(IEventSubscriber<FeedUpdatedEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            this.externalIEventMessenger.a(FeedUpdatedEvent.class, subscriber);
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e4, q3.b);
            publishError(e4);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToNetworkFailures(IEventSubscriber<BrazeNetworkFailureEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            this.externalIEventMessenger.a(BrazeNetworkFailureEvent.class, subscriber);
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e4, r3.b);
            publishError(e4);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToNewInAppMessages(IEventSubscriber<InAppMessageEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            this.externalIEventMessenger.a(InAppMessageEvent.class, subscriber);
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e4, s3.b);
            publishError(e4);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToNoMatchingTriggerForEvent(IEventSubscriber<NoMatchingTriggerEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            this.externalIEventMessenger.a(NoMatchingTriggerEvent.class, subscriber);
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e4, t3.b);
            publishError(e4);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToPushNotificationEvents(IEventSubscriber<BrazePushEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            this.externalIEventMessenger.a(BrazePushEvent.class, subscriber);
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e4, u3.b);
            publishError(e4);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToSdkAuthenticationFailures(IEventSubscriber<BrazeSdkAuthenticationErrorEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            this.externalIEventMessenger.a(BrazeSdkAuthenticationErrorEvent.class, subscriber);
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e4, v3.b);
            publishError(e4);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToSessionUpdates(IEventSubscriber<SessionStateChangedEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            this.externalIEventMessenger.a(SessionStateChangedEvent.class, subscriber);
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e4, w3.b);
            publishError(e4);
        }
    }

    public final /* synthetic */ void waitForUserDependencyThread$android_sdk_base_release() {
        try {
            runForResult(null, a4.b, false, new b4(null));
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e4, c4.b);
        }
    }

    @Override // com.braze.IBraze
    public void changeUser(String userId, String sdkAuthSignature) {
        run$android_sdk_base_release$default(this, new n(userId), false, new o(userId, this, sdkAuthSignature), 2, null);
    }

    @Override // com.braze.IBraze
    public void getCurrentUser(IValueCallback<BrazeUser> completionCallback) {
        Intrinsics.checkNotNullParameter(completionCallback, "completionCallback");
        if (INSTANCE.isDisabled()) {
            completionCallback.onError();
            return;
        }
        try {
            BuildersKt__Builders_commonKt.launch$default(h5.a, null, null, new h0(completionCallback, this, null), 3, null);
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e4, i0.b);
            completionCallback.onError();
            publishError(e4);
        }
    }

    @Override // com.braze.IBraze
    public void logCustomEvent(String eventName, BrazeProperties properties) {
        run$android_sdk_base_release$default(this, new r0(eventName), false, new s0(eventName, this, properties == null ? null : properties.clone()), 2, null);
    }

    @Override // com.braze.IBraze
    public void logPurchase(String productId, String currencyCode, BigDecimal price, BrazeProperties properties) {
        logPurchase(productId, currencyCode, price, 1, properties);
    }

    @Override // com.braze.IBraze
    public void logPushNotificationOpened(Intent intent) {
        run$android_sdk_base_release$default(this, new l1(intent), false, new m1(intent, this), 2, null);
    }

    public final /* synthetic */ void requestGeofenceRefresh$android_sdk_base_release(boolean ignoreRateLimit) {
        run$android_sdk_base_release$default(this, new o2(ignoreRateLimit), false, new p2(ignoreRateLimit), 2, null);
    }

    @Override // com.braze.IBraze
    public void logPurchase(String productId, String currencyCode, BigDecimal price, int quantity) {
        logPurchase(productId, currencyCode, price, quantity, null);
    }

    @Override // com.braze.IBraze
    public void logPurchase(String productId, String currencyCode, BigDecimal price, int quantity, BrazeProperties properties) {
        run$android_sdk_base_release$default(this, new b1(productId), false, new c1(productId, currencyCode, price, quantity, this, properties == null ? null : properties.clone()), 2, null);
    }

    @Override // com.braze.IBraze
    public void requestContentCardsRefresh() {
        run$android_sdk_base_release$default(this, e2.b, false, new f2(), 2, null);
    }

    @Override // com.braze.IBraze
    public Card deserializeContentCard(JSONObject contentCardJson) {
        return (Card) runForResult$default(this, null, new v(contentCardJson), false, new w(contentCardJson, null), 4, null);
    }
}
