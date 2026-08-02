package com.braze.reactbridge;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerProperties;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.configuration.BrazeConfig;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.Channel;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.events.BannersUpdatedEvent;
import com.braze.events.BrazePushEvent;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.IFireOnceEventSubscriber;
import com.braze.events.IValueCallback;
import com.braze.models.Banner;
import com.braze.models.FeatureFlag;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageImmersiveBase;
import com.braze.models.inappmessage.MessageButton;
import com.braze.models.outgoing.AttributionData;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.reactbridge.BrazeReactBridgeImpl;
import com.braze.reactbridge.util.MapFactoryKt;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.support.PermissionUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import com.braze.ui.activities.ContentCardsActivity;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.InAppMessageOperation;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageManagerListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.twilio.voice.EventKeys;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b7\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 û\u00012\u00020\u0001:\u0004ü\u0001û\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J2\u0010!\u001a\u00020\b2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\b0\u001bH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\bH\u0002¢\u0006\u0004\b,\u0010\nJ\u001d\u0010/\u001a\u00020\b2\u0006\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020'¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\b¢\u0006\u0004\b1\u0010\nJ\u001f\u00104\u001a\u00020\b2\u0006\u00102\u001a\u00020'2\b\u00103\u001a\u0004\u0018\u00010'¢\u0006\u0004\b4\u00100J\u0015\u00107\u001a\u00020\b2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u001d\u0010;\u001a\u00020\b2\u0006\u00109\u001a\u00020'2\u0006\u0010:\u001a\u00020'¢\u0006\u0004\b;\u00100J\u0015\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020'¢\u0006\u0004\b=\u0010>J\u001f\u0010B\u001a\u00020\b2\u0006\u0010?\u001a\u00020'2\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CJ7\u0010H\u001a\u00020\b2\u0006\u0010D\u001a\u00020'2\u0006\u0010E\u001a\u00020'2\u0006\u0010F\u001a\u00020'2\u0006\u0010G\u001a\u00020\u00122\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bH\u0010IJ'\u0010L\u001a\u00020\b2\u0006\u0010J\u001a\u00020'2\u0006\u0010K\u001a\u00020'2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\bL\u0010MJ'\u0010O\u001a\u00020\b2\u0006\u0010J\u001a\u00020'2\u0006\u0010K\u001a\u00020N2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\bO\u0010PJ'\u0010Q\u001a\u00020\b2\u0006\u0010J\u001a\u00020'2\u0006\u0010K\u001a\u00020\u00122\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\bQ\u0010RJ'\u0010T\u001a\u00020\b2\u0006\u0010J\u001a\u00020'2\u0006\u0010K\u001a\u00020S2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\bT\u0010UJ'\u0010W\u001a\u00020\b2\u0006\u0010J\u001a\u00020'2\u0006\u0010V\u001a\u00020\u00122\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\bW\u0010RJ'\u0010Y\u001a\u00020\b2\u0006\u0010J\u001a\u00020'2\u0006\u0010X\u001a\u00020\u00122\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\bY\u0010RJ\u001f\u0010Z\u001a\u00020\b2\u0006\u0010J\u001a\u00020'2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\bZ\u0010[J'\u0010]\u001a\u00020\b2\u0006\u0010J\u001a\u00020'2\u0006\u0010K\u001a\u00020\\2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b]\u0010^J'\u0010_\u001a\u00020\b2\u0006\u0010J\u001a\u00020'2\u0006\u0010K\u001a\u00020\\2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b_\u0010^J3\u0010a\u001a\u00020\b2\b\u0010J\u001a\u0004\u0018\u00010'2\b\u0010K\u001a\u0004\u0018\u00010@2\u0006\u0010`\u001a\u00020N2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\ba\u0010bJ'\u0010c\u001a\u00020\b2\u0006\u0010J\u001a\u00020'2\u0006\u0010K\u001a\u00020'2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\bc\u0010MJ'\u0010d\u001a\u00020\b2\u0006\u0010J\u001a\u00020'2\u0006\u0010K\u001a\u00020'2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\bd\u0010MJ\u0017\u0010f\u001a\u00020\b2\b\u0010e\u001a\u0004\u0018\u00010'¢\u0006\u0004\bf\u0010>J\u0017\u0010h\u001a\u00020\b2\b\u0010g\u001a\u0004\u0018\u00010'¢\u0006\u0004\bh\u0010>J\u0017\u0010j\u001a\u00020\b2\b\u0010i\u001a\u0004\u0018\u00010'¢\u0006\u0004\bj\u0010>J!\u0010l\u001a\u00020\b2\b\u0010k\u001a\u0004\u0018\u00010'2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\bl\u0010[J%\u0010p\u001a\u00020\b2\u0006\u0010m\u001a\u00020\u00122\u0006\u0010n\u001a\u00020\u00122\u0006\u0010o\u001a\u00020\u0012¢\u0006\u0004\bp\u0010qJ\u0017\u0010s\u001a\u00020\b2\b\u0010r\u001a\u0004\u0018\u00010'¢\u0006\u0004\bs\u0010>J\u0017\u0010u\u001a\u00020\b2\b\u0010t\u001a\u0004\u0018\u00010'¢\u0006\u0004\bu\u0010>J\u0017\u0010w\u001a\u00020\b2\b\u0010v\u001a\u0004\u0018\u00010'¢\u0006\u0004\bw\u0010>J\u0017\u0010y\u001a\u00020\b2\b\u0010x\u001a\u0004\u0018\u00010'¢\u0006\u0004\by\u0010>J\u001f\u0010{\u001a\u00020\b2\u0006\u0010z\u001a\u00020'2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b{\u0010[J\u001f\u0010|\u001a\u00020\b2\u0006\u0010z\u001a\u00020'2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b|\u0010[J\u001f\u0010~\u001a\u00020\b2\u0006\u0010}\u001a\u00020'2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b~\u0010[J\u001f\u0010\u007f\u001a\u00020\b2\u0006\u0010}\u001a\u00020'2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b\u007f\u0010[J#\u0010\u0083\u0001\u001a\u00020\b2\u0007\u0010\u0080\u0001\u001a\u00020'2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0019\u0010\u0086\u0001\u001a\u00020\b2\u0007\u0010\u0085\u0001\u001a\u00020\\¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0018\u0010\u0088\u0001\u001a\u00020\b2\u0007\u0010\u0080\u0001\u001a\u00020'¢\u0006\u0005\b\u0088\u0001\u0010>J\"\u0010\u0089\u0001\u001a\u00020\b2\u0007\u0010\u0080\u0001\u001a\u00020'2\b\u0010\u0013\u001a\u0004\u0018\u00010'¢\u0006\u0005\b\u0089\u0001\u00100J\u001b\u0010\u008b\u0001\u001a\u00020\b2\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010N¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u000f\u0010\u008d\u0001\u001a\u00020\b¢\u0006\u0005\b\u008d\u0001\u0010\nJ\u001a\u0010\u008e\u0001\u001a\u00020\b2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001a\u0010\u0090\u0001\u001a\u00020\b2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u008f\u0001J\u0017\u0010\u0091\u0001\u001a\u00020\b2\u0006\u0010<\u001a\u00020'¢\u0006\u0005\b\u0091\u0001\u0010>J\u001b\u0010\u0093\u0001\u001a\u00020\b2\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010@¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001e\u0010\u0099\u0001\u001a\u0004\u0018\u00010'2\b\u0010\u0096\u0001\u001a\u00030\u0095\u0001H\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0017\u0010\u009a\u0001\u001a\u00020\b2\u0006\u0010(\u001a\u00020'¢\u0006\u0005\b\u009a\u0001\u0010>J\u0017\u0010\u009b\u0001\u001a\u00020\b2\u0006\u0010(\u001a\u00020'¢\u0006\u0005\b\u009b\u0001\u0010>J\u0017\u0010\u009c\u0001\u001a\u00020\b2\u0006\u0010(\u001a\u00020'¢\u0006\u0005\b\u009c\u0001\u0010>J\u0017\u0010\u009d\u0001\u001a\u00020\b2\u0006\u0010(\u001a\u00020'¢\u0006\u0005\b\u009d\u0001\u0010>J\u000f\u0010\u009e\u0001\u001a\u00020\b¢\u0006\u0005\b\u009e\u0001\u0010\nJ\u000f\u0010\u009f\u0001\u001a\u00020\b¢\u0006\u0005\b\u009f\u0001\u0010\nJ\u000f\u0010 \u0001\u001a\u00020\b¢\u0006\u0005\b \u0001\u0010\nJ\u000f\u0010¡\u0001\u001a\u00020\b¢\u0006\u0005\b¡\u0001\u0010\nJ$\u0010¥\u0001\u001a\u00020\b2\b\u0010£\u0001\u001a\u00030¢\u00012\b\u0010¤\u0001\u001a\u00030¢\u0001¢\u0006\u0006\b¥\u0001\u0010¦\u0001J6\u0010§\u0001\u001a\u00020\b2\u0006\u0010J\u001a\u00020'2\b\u0010£\u0001\u001a\u00030¢\u00012\b\u0010¤\u0001\u001a\u00030¢\u00012\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0006\b§\u0001\u0010¨\u0001JH\u0010¬\u0001\u001a\u00020\b2\b\u0010£\u0001\u001a\u00030¢\u00012\b\u0010¤\u0001\u001a\u00030¢\u00012\n\u0010©\u0001\u001a\u0005\u0018\u00010¢\u00012\n\u0010ª\u0001\u001a\u0005\u0018\u00010¢\u00012\n\u0010«\u0001\u001a\u0005\u0018\u00010¢\u0001¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u0019\u0010¯\u0001\u001a\u00020\b2\u0007\u0010®\u0001\u001a\u00020N¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u000f\u0010±\u0001\u001a\u00020\b¢\u0006\u0005\b±\u0001\u0010\nJ\u0018\u0010³\u0001\u001a\u00020\b2\u0007\u0010²\u0001\u001a\u00020'¢\u0006\u0005\b³\u0001\u0010>J\u001b\u0010´\u0001\u001a\u0004\u0018\u00010N2\u0007\u0010²\u0001\u001a\u00020'¢\u0006\u0006\b´\u0001\u0010µ\u0001J!\u0010¶\u0001\u001a\u00020\b2\u0007\u0010²\u0001\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0006\b¶\u0001\u0010·\u0001J!\u0010¸\u0001\u001a\u00020\b2\u0007\u0010²\u0001\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0006\b¸\u0001\u0010·\u0001J<\u0010½\u0001\u001a\u00020\b2\t\u0010¹\u0001\u001a\u0004\u0018\u00010'2\t\u0010º\u0001\u001a\u0004\u0018\u00010'2\t\u0010»\u0001\u001a\u0004\u0018\u00010'2\t\u0010¼\u0001\u001a\u0004\u0018\u00010'¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u0017\u0010¿\u0001\u001a\u00020\b2\u0006\u00106\u001a\u000205¢\u0006\u0005\b¿\u0001\u00108J\u0017\u0010À\u0001\u001a\u00020\b2\u0006\u00106\u001a\u000205¢\u0006\u0005\bÀ\u0001\u00108J\u0017\u0010Á\u0001\u001a\u00020\b2\u0006\u0010?\u001a\u00020'¢\u0006\u0005\bÁ\u0001\u0010>J\u0019\u0010Ã\u0001\u001a\u00020\b2\u0007\u0010Â\u0001\u001a\u00020\u0012¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J\u001a\u0010Å\u0001\u001a\u00020\b2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\bÅ\u0001\u0010\u008f\u0001J\"\u0010Æ\u0001\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\bÆ\u0001\u0010\u0084\u0001J\u000f\u0010Ç\u0001\u001a\u00020\b¢\u0006\u0005\bÇ\u0001\u0010\nJ\u0017\u0010È\u0001\u001a\u00020\b2\u0006\u0010(\u001a\u00020'¢\u0006\u0005\bÈ\u0001\u0010>J*\u0010É\u0001\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010J\u001a\u00020'2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J*\u0010Ë\u0001\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010J\u001a\u00020'2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\bË\u0001\u0010Ê\u0001J*\u0010Ì\u0001\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010J\u001a\u00020'2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\bÌ\u0001\u0010Ê\u0001J*\u0010Í\u0001\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010J\u001a\u00020'2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\bÍ\u0001\u0010Ê\u0001J*\u0010Î\u0001\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010J\u001a\u00020'2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\bÎ\u0001\u0010Ê\u0001J*\u0010Ï\u0001\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010J\u001a\u00020'2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\bÏ\u0001\u0010Ê\u0001J$\u0010Ò\u0001\u001a\u00020\b2\u0007\u0010Ð\u0001\u001a\u00020N2\t\u0010Ñ\u0001\u001a\u0004\u0018\u00010'¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0003\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000f\n\u0005\b\u0005\u0010×\u0001\u001a\u0006\bØ\u0001\u0010Ù\u0001R\u001e\u0010Û\u0001\u001a\t\u0012\u0004\u0012\u00020)0Ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R\u0018\u0010Þ\u0001\u001a\u00030Ý\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u001a\u0010á\u0001\u001a\u00030à\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R\u001a\u0010ä\u0001\u001a\u00030ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R \u0010ç\u0001\u001a\t\u0012\u0004\u0012\u00020#0æ\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bç\u0001\u0010è\u0001R!\u0010ê\u0001\u001a\n\u0012\u0005\u0012\u00030é\u00010æ\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bê\u0001\u0010è\u0001R!\u0010ì\u0001\u001a\n\u0012\u0005\u0012\u00030ë\u00010æ\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bì\u0001\u0010è\u0001R!\u0010î\u0001\u001a\n\u0012\u0005\u0012\u00030í\u00010æ\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bî\u0001\u0010è\u0001R!\u0010ð\u0001\u001a\n\u0012\u0005\u0012\u00030ï\u00010æ\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bð\u0001\u0010è\u0001R3\u0010ò\u0001\u001a\u0005\u0018\u00010ñ\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bò\u0001\u0010ó\u0001\u0012\u0005\bø\u0001\u0010\n\u001a\u0006\bô\u0001\u0010õ\u0001\"\u0006\bö\u0001\u0010÷\u0001R\u0015\u0010ú\u0001\u001a\u00030ñ\u00018F¢\u0006\b\u001a\u0006\bù\u0001\u0010õ\u0001¨\u0006ý\u0001"}, d2 = {"Lcom/braze/reactbridge/BrazeReactBridgeImpl;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactApplicationContext", "Landroid/app/Activity;", "currentActivity", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Landroid/app/Activity;)V", "", "subscribeToEvents", "()V", "subscribeToContentCardsUpdatedEvent", "subscribeToBannersUpdatedEvent", "subscribeToFeatureFlagsUpdatedEvent", "subscribeToSdkAuthenticationErrorEvents", "subscribeToPushNotificationEvents", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "", "buttonId", "Lcom/braze/reactbridge/BrazeReactBridgeImpl$InAppMessageActionData;", "getInAppMessageActionData", "(Lcom/braze/models/inappmessage/IInAppMessage;I)Lcom/braze/reactbridge/BrazeReactBridgeImpl$InAppMessageActionData;", "actionData", "executeInAppMessageAction", "(Lcom/braze/reactbridge/BrazeReactBridgeImpl$InAppMessageActionData;Lcom/braze/models/inappmessage/IInAppMessage;)V", "executeUriAction", "Lkotlin/Function1;", "Lcom/braze/BrazeUser;", "Lkotlin/ParameterName;", "name", "user", "block", "runOnUser", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/braze/events/ContentCardsUpdatedEvent;", "event", "updateContentCardsIfNeeded", "(Lcom/braze/events/ContentCardsUpdatedEvent;)V", "", StackTraceHelper.ID_KEY, "Lcom/braze/models/cards/Card;", "getContentCardById", "(Ljava/lang/String;)Lcom/braze/models/cards/Card;", "setDefaultInAppMessageListener", "apiKey", "endpoint", "initialize", "(Ljava/lang/String;Ljava/lang/String;)V", "requestImmediateDataFlush", "userName", "sdkAuthToken", "changeUser", "Lcom/facebook/react/bridge/Callback;", "callback", "getUserId", "(Lcom/facebook/react/bridge/Callback;)V", "aliasName", "aliasLabel", "addAlias", "token", "registerPushToken", "(Ljava/lang/String;)V", "eventName", "Lcom/facebook/react/bridge/ReadableMap;", "eventProperties", "logCustomEvent", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "productIdentifier", "price", AppsFlyerProperties.CURRENCY_CODE, "quantity", "logPurchase", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/facebook/react/bridge/ReadableMap;)V", "key", EventKeys.VALUE_KEY, "setStringCustomUserAttribute", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Callback;)V", "", "setBoolCustomUserAttribute", "(Ljava/lang/String;ZLcom/facebook/react/bridge/Callback;)V", "setIntCustomUserAttribute", "(Ljava/lang/String;ILcom/facebook/react/bridge/Callback;)V", "", "setDoubleCustomUserAttribute", "(Ljava/lang/String;FLcom/facebook/react/bridge/Callback;)V", "timeStamp", "setDateCustomUserAttribute", "incrementValue", "incrementCustomUserAttribute", "unsetCustomUserAttribute", "(Ljava/lang/String;Lcom/facebook/react/bridge/Callback;)V", "Lcom/facebook/react/bridge/ReadableArray;", "setCustomUserAttributeObjectArray", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Callback;)V", "setCustomUserAttributeArray", "merge", "setCustomUserAttributeObject", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;ZLcom/facebook/react/bridge/Callback;)V", "addToCustomAttributeArray", "removeFromCustomAttributeArray", "firstName", "setFirstName", "lastName", "setLastName", "email", "setEmail", "gender", "setGender", "year", "month", "day", "setDateOfBirth", "(III)V", AdRevenueScheme.COUNTRY, "setCountry", "homeCity", "setHomeCity", "phoneNumber", "setPhoneNumber", "language", "setLanguage", "groupId", "addToSubscriptionGroup", "removeFromSubscriptionGroup", "subscriptionType", "setPushNotificationSubscriptionType", "setEmailNotificationSubscriptionType", "placementId", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getBanner", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "placementIds", "requestBannersRefresh", "(Lcom/facebook/react/bridge/ReadableArray;)V", "logBannerImpression", "logBannerClick", "dismissAutomaticallyOnCardClick", "launchContentCards", "(Ljava/lang/Boolean;)V", "requestContentCardsRefresh", "getContentCards", "(Lcom/facebook/react/bridge/Promise;)V", "getCachedContentCards", "setSdkAuthenticationSignature", "options", "requestPushPermission", "(Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/braze/enums/BrazePushEventType;", "eventType", "getPushEventType$braze_react_native_sdk_release", "(Lcom/braze/enums/BrazePushEventType;)Ljava/lang/String;", "getPushEventType", "logContentCardDismissed", "logContentCardClicked", "logContentCardImpression", "processContentCardClickAction", "wipeData", "disableSDK", "enableSDK", "requestLocationInitialization", "", "latitude", "longitude", "requestGeofences", "(DD)V", "setLocationCustomAttribute", "(Ljava/lang/String;DDLcom/facebook/react/bridge/Callback;)V", "altitude", "horizontalAccuracy", "verticalAccuracy", "setLastKnownLocation", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "useBrazeUI", "subscribeToInAppMessage", "(Z)V", "hideCurrentInAppMessage", "inAppMessageString", "logInAppMessageClicked", "logInAppMessageImpression", "(Ljava/lang/String;)Ljava/lang/Boolean;", "logInAppMessageButtonClicked", "(Ljava/lang/String;I)V", "performInAppMessageAction", "network", "campaign", "adGroup", "creative", "setAttributionData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceId", "getInitialPushPayload", "addListener", "count", "removeListeners", "(I)V", "getAllFeatureFlags", "getFeatureFlag", "refreshFeatureFlags", "logFeatureFlagImpression", "getFeatureFlagBooleanProperty", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "getFeatureFlagStringProperty", "getFeatureFlagNumberProperty", "getFeatureFlagTimestampProperty", "getFeatureFlagJSONProperty", "getFeatureFlagImageProperty", "adTrackingEnabled", "googleAdvertisingId", "setAdTrackingEnabled", "(ZLjava/lang/String;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getReactApplicationContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "", "contentCards", "Ljava/util/List;", "Ljava/util/concurrent/locks/ReentrantLock;", "contentCardsLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "contentCardsUpdatedAt", "J", "Lcom/braze/ui/inappmessage/InAppMessageOperation;", "inAppMessageDisplayOperation", "Lcom/braze/ui/inappmessage/InAppMessageOperation;", "Lcom/braze/events/IEventSubscriber;", "contentCardsUpdatedSubscriber", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/BannersUpdatedEvent;", "bannersUpdatedSubscriber", "Lcom/braze/events/BrazeSdkAuthenticationErrorEvent;", "sdkAuthErrorSubscriber", "Lcom/braze/events/BrazePushEvent;", "pushNotificationEventSubscriber", "Lcom/braze/events/FeatureFlagsUpdatedEvent;", "featureFlagsUpdatedSubscriber", "Lcom/braze/Braze;", "brazeTestingMock", "Lcom/braze/Braze;", "getBrazeTestingMock$braze_react_native_sdk_release", "()Lcom/braze/Braze;", "setBrazeTestingMock$braze_react_native_sdk_release", "(Lcom/braze/Braze;)V", "getBrazeTestingMock$braze_react_native_sdk_release$annotations", "getBraze", "braze", "Companion", "InAppMessageActionData", "braze_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBrazeReactBridgeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeReactBridgeImpl.kt\ncom/braze/reactbridge/BrazeReactBridgeImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1035:1\n1563#2:1036\n1634#2,3:1037\n295#2,2:1040\n295#2,2:1043\n295#2,2:1045\n1869#2,2:1047\n1869#2,2:1049\n1#3:1042\n*S KotlinDebug\n*F\n+ 1 BrazeReactBridgeImpl.kt\ncom/braze/reactbridge/BrazeReactBridgeImpl\n*L\n352#1:1036\n352#1:1037,3\n643#1:1040,2\n677#1:1043,2\n833#1:1045,2\n838#1:1047,2\n469#1:1049,2\n*E\n"})
/* loaded from: classes.dex */
public final class BrazeReactBridgeImpl {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private IEventSubscriber<BannersUpdatedEvent> bannersUpdatedSubscriber;

    @Nullable
    private Braze brazeTestingMock;

    @NotNull
    private final List<Card> contentCards;

    @NotNull
    private final ReentrantLock contentCardsLock;
    private long contentCardsUpdatedAt;
    private IEventSubscriber<ContentCardsUpdatedEvent> contentCardsUpdatedSubscriber;

    @Nullable
    private final Activity currentActivity;
    private IEventSubscriber<FeatureFlagsUpdatedEvent> featureFlagsUpdatedSubscriber;

    @NotNull
    private InAppMessageOperation inAppMessageDisplayOperation;
    private IEventSubscriber<BrazePushEvent> pushNotificationEventSubscriber;

    @NotNull
    private final ReactApplicationContext reactApplicationContext;
    private IEventSubscriber<BrazeSdkAuthenticationErrorEvent> sdkAuthErrorSubscriber;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\r\u001a\u00020\u000e*\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010\u0016\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u0015H\u0002J\u0014\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001e*\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/braze/reactbridge/BrazeReactBridgeImpl$Companion;", "", "<init>", "()V", "NAME", "", "NO_ACTIVE_REACT_INSTANCE_PROMISE_CODE", "CONTENT_CARDS_UPDATED_EVENT_NAME", "BANNER_CARDS_UPDATED_EVENT_NAME", "FEATURE_FLAGS_UPDATED_EVENT_NAME", "SDK_AUTH_ERROR_EVENT_NAME", "IN_APP_MESSAGE_RECEIVED_EVENT_NAME", "PUSH_NOTIFICATION_EVENT_NAME", "reportResult", "", "Lcom/facebook/react/bridge/Callback;", "result", "error", "populateEventPropertiesFromReadableMap", "Lcom/braze/models/outgoing/BrazeProperties;", "eventProperties", "Lcom/facebook/react/bridge/ReadableMap;", "parseReadableMap", "", "readableMap", "parseReadableArray", "", "readableArray", "Lcom/facebook/react/bridge/ReadableArray;", "parseNotificationSubscriptionType", "Lcom/braze/enums/NotificationSubscriptionType;", "braze_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Map.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.Array.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final NotificationSubscriptionType parseNotificationSubscriptionType(String str) {
            if (str == null) {
                return null;
            }
            int hashCode = str.hashCode();
            if (hashCode == -1249604809) {
                if (str.equals("optedin")) {
                    return NotificationSubscriptionType.OPTED_IN;
                }
                return null;
            }
            if (hashCode == -1219769254) {
                if (str.equals("subscribed")) {
                    return NotificationSubscriptionType.SUBSCRIBED;
                }
                return null;
            }
            if (hashCode == 901853107 && str.equals("unsubscribed")) {
                return NotificationSubscriptionType.UNSUBSCRIBED;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<?> parseReadableArray(ReadableArray readableArray) {
            ReadableArray array;
            ArrayList<Object> arrayList = readableArray.toArrayList();
            int size = readableArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int i11 = WhenMappings.$EnumSwitchMapping$0[readableArray.getType(i10).ordinal()];
                if (i11 == 1) {
                    ReadableMap map = readableArray.getMap(i10);
                    if (map != null) {
                        if (map.hasKey("type") && map.getType("type") == ReadableType.String && Intrinsics.areEqual(map.getString("type"), "UNIX_timestamp")) {
                            arrayList.set(i10, new Date((long) map.getDouble(EventKeys.VALUE_KEY)));
                        } else {
                            arrayList.set(i10, parseReadableMap(map));
                        }
                    }
                } else if (i11 == 2 && (array = readableArray.getArray(i10)) != null) {
                    arrayList.set(i10, BrazeReactBridgeImpl.INSTANCE.parseReadableArray(array));
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<?, ?> parseReadableMap(ReadableMap readableMap) {
            ReadableArray array;
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            HashMap<String, Object> hashMap = readableMap.toHashMap();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                int i10 = WhenMappings.$EnumSwitchMapping$0[readableMap.getType(nextKey).ordinal()];
                if (i10 == 1) {
                    ReadableMap map = readableMap.getMap(nextKey);
                    if (map != null) {
                        if (map.hasKey("type") && map.getType("type") == ReadableType.String && Intrinsics.areEqual(map.getString("type"), "UNIX_timestamp")) {
                            hashMap.put(nextKey, new Date((long) map.getDouble(EventKeys.VALUE_KEY)));
                        } else {
                            hashMap.put(nextKey, parseReadableMap(map));
                        }
                    }
                } else if (i10 == 2 && (array = readableMap.getArray(nextKey)) != null) {
                    hashMap.put(nextKey, BrazeReactBridgeImpl.INSTANCE.parseReadableArray(array));
                }
            }
            return hashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final BrazeProperties populateEventPropertiesFromReadableMap(ReadableMap eventProperties) {
            if (eventProperties == null) {
                return null;
            }
            return Intrinsics.areEqual(eventProperties, JSONObject.NULL) ? new BrazeProperties() : new BrazeProperties(new JSONObject(parseReadableMap(eventProperties)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void reportResult(Callback callback, Object obj, String str) {
            if (callback == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: V3.l0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String reportResult$lambda$0;
                        reportResult$lambda$0 = BrazeReactBridgeImpl.Companion.reportResult$lambda$0();
                        return reportResult$lambda$0;
                    }
                }, 6, (Object) null);
            } else if (str != null) {
                callback.invoke(str);
            } else {
                callback.invoke(null, obj);
            }
        }

        public static /* synthetic */ void reportResult$default(Companion companion, Callback callback, Object obj, String str, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = null;
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            companion.reportResult(callback, obj, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String reportResult$lambda$0() {
            return "Warning: BrazeReactBridge callback was null.";
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/braze/reactbridge/BrazeReactBridgeImpl$InAppMessageActionData;", "", "Lcom/braze/enums/inappmessage/ClickAction;", "clickAction", "Landroid/net/Uri;", "clickUri", "", "openUriInWebView", "<init>", "(Lcom/braze/enums/inappmessage/ClickAction;Landroid/net/Uri;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/braze/enums/inappmessage/ClickAction;", "getClickAction", "()Lcom/braze/enums/inappmessage/ClickAction;", "Landroid/net/Uri;", "getClickUri", "()Landroid/net/Uri;", "Z", "getOpenUriInWebView", "()Z", "braze_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InAppMessageActionData {

        @Nullable
        private final ClickAction clickAction;

        @Nullable
        private final Uri clickUri;
        private final boolean openUriInWebView;

        public InAppMessageActionData(@Nullable ClickAction clickAction, @Nullable Uri uri, boolean z10) {
            this.clickAction = clickAction;
            this.clickUri = uri;
            this.openUriInWebView = z10;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InAppMessageActionData)) {
                return false;
            }
            InAppMessageActionData inAppMessageActionData = (InAppMessageActionData) other;
            return this.clickAction == inAppMessageActionData.clickAction && Intrinsics.areEqual(this.clickUri, inAppMessageActionData.clickUri) && this.openUriInWebView == inAppMessageActionData.openUriInWebView;
        }

        @Nullable
        public final ClickAction getClickAction() {
            return this.clickAction;
        }

        @Nullable
        public final Uri getClickUri() {
            return this.clickUri;
        }

        public final boolean getOpenUriInWebView() {
            return this.openUriInWebView;
        }

        public int hashCode() {
            ClickAction clickAction = this.clickAction;
            int hashCode = (clickAction == null ? 0 : clickAction.hashCode()) * 31;
            Uri uri = this.clickUri;
            return ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + Boolean.hashCode(this.openUriInWebView);
        }

        @NotNull
        public String toString() {
            return "InAppMessageActionData(clickAction=" + this.clickAction + ", clickUri=" + this.clickUri + ", openUriInWebView=" + this.openUriInWebView + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BrazePushEventType.values().length];
            try {
                iArr[BrazePushEventType.NOTIFICATION_RECEIVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrazePushEventType.NOTIFICATION_OPENED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClickAction.values().length];
            try {
                iArr2[ClickAction.URI.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public BrazeReactBridgeImpl(@NotNull ReactApplicationContext reactApplicationContext, @Nullable Activity activity) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        this.reactApplicationContext = reactApplicationContext;
        this.currentActivity = activity;
        this.contentCards = new ArrayList();
        this.contentCardsLock = new ReentrantLock();
        this.inAppMessageDisplayOperation = InAppMessageOperation.DISPLAY_NOW;
        subscribeToEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$3() {
        return "Invalid alias parameter: alias is required to be non-empty. Not adding alias.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$4() {
        return "Invalid label parameter: label is required to be non-empty. Not adding alias.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addAlias$lambda$5(String str, String str2, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.addAlias(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addListener$lambda$71(String str) {
        return "Adding push notification event listener " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addListener$lambda$72(String str) {
        return "Adding in-app message event listener " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addToCustomAttributeArray$lambda$18(Callback callback, String str, String str2, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.addToCustomAttributeArray(str, str2)), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addToSubscriptionGroup$lambda$30(Callback callback, String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.addToSubscriptionGroup(str)), null, 2, null);
        return Unit.INSTANCE;
    }

    private final void executeInAppMessageAction(final InAppMessageActionData actionData, IInAppMessage inAppMessage) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String executeInAppMessageAction$lambda$60;
                executeInAppMessageAction$lambda$60 = BrazeReactBridgeImpl.executeInAppMessageAction$lambda$60(BrazeReactBridgeImpl.InAppMessageActionData.this);
                return executeInAppMessageAction$lambda$60;
            }
        }, 7, (Object) null);
        ClickAction clickAction = actionData.getClickAction();
        if ((clickAction == null ? -1 : WhenMappings.$EnumSwitchMapping$1[clickAction.ordinal()]) == 1) {
            executeUriAction(actionData, inAppMessage);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String executeInAppMessageAction$lambda$61;
                    executeInAppMessageAction$lambda$61 = BrazeReactBridgeImpl.executeInAppMessageAction$lambda$61(BrazeReactBridgeImpl.InAppMessageActionData.this);
                    return executeInAppMessageAction$lambda$61;
                }
            }, 7, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String executeInAppMessageAction$lambda$60(InAppMessageActionData inAppMessageActionData) {
        return "GOT ACTION: " + inAppMessageActionData.getClickUri() + ", " + inAppMessageActionData.getOpenUriInWebView() + ", " + inAppMessageActionData.getClickAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String executeInAppMessageAction$lambda$61(InAppMessageActionData inAppMessageActionData) {
        return "Unhandled action " + inAppMessageActionData.getClickAction();
    }

    private final void executeUriAction(final InAppMessageActionData actionData, IInAppMessage inAppMessage) {
        final Uri clickUri = actionData.getClickUri();
        if (clickUri == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: V3.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String executeUriAction$lambda$63$lambda$62;
                    executeUriAction$lambda$63$lambda$62 = BrazeReactBridgeImpl.executeUriAction$lambda$63$lambda$62();
                    return executeUriAction$lambda$63$lambda$62;
                }
            }, 7, (Object) null);
            return;
        }
        BrazeDeeplinkHandler.Companion companion = BrazeDeeplinkHandler.INSTANCE;
        UriAction createUriActionFromUri = companion.getInstance().createUriActionFromUri(clickUri, BundleUtils.toBundle(inAppMessage.getExtras()), actionData.getOpenUriInWebView(), Channel.INAPP_MESSAGE);
        if (!this.reactApplicationContext.hasActiveReactInstance()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: V3.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String executeUriAction$lambda$64;
                    executeUriAction$lambda$64 = BrazeReactBridgeImpl.executeUriAction$lambda$64();
                    return executeUriAction$lambda$64;
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String executeUriAction$lambda$65;
                    executeUriAction$lambda$65 = BrazeReactBridgeImpl.executeUriAction$lambda$65(clickUri, actionData);
                    return executeUriAction$lambda$65;
                }
            }, 6, (Object) null);
            companion.getInstance().gotoUri(this.reactApplicationContext, createUriActionFromUri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String executeUriAction$lambda$63$lambda$62() {
        return "clickUri is null, not performing click action";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String executeUriAction$lambda$64() {
        return "reactApplicationContext instance not active, not performing click action";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String executeUriAction$lambda$65(Uri uri, InAppMessageActionData inAppMessageActionData) {
        return "Performing gotoUri " + uri + " " + inAppMessageActionData.getOpenUriInWebView();
    }

    private final Card getContentCardById(String id2) {
        Object obj;
        ReentrantLock reentrantLock = this.contentCardsLock;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.contentCards.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((Card) obj).getId(), id2)) {
                    break;
                }
            }
            Card card = (Card) obj;
            reentrantLock.unlock();
            return card;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getContentCards$lambda$36(BrazeReactBridgeImpl brazeReactBridgeImpl, Promise promise, ContentCardsUpdatedEvent message) {
        Intrinsics.checkNotNullParameter(message, "message");
        brazeReactBridgeImpl.updateContentCardsIfNeeded(message);
        if (brazeReactBridgeImpl.reactApplicationContext.hasActiveReactInstance()) {
            promise.resolve(ContentCardUtilKt.mapContentCards(message.getAllCards()));
        } else {
            promise.reject("no_active_react_instance", "Cannot deliver getContentCards result because the React instance is not active.");
        }
    }

    private final InAppMessageActionData getInAppMessageActionData(IInAppMessage inAppMessage, int buttonId) {
        Object obj;
        if (buttonId < 0) {
            return new InAppMessageActionData(inAppMessage.getInternalClickAction(), inAppMessage.getInternalUri(), inAppMessage.getOpenUriInWebView());
        }
        if (!(inAppMessage instanceof InAppMessageImmersiveBase)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: V3.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String inAppMessageActionData$lambda$59;
                    inAppMessageActionData$lambda$59 = BrazeReactBridgeImpl.getInAppMessageActionData$lambda$59();
                    return inAppMessageActionData$lambda$59;
                }
            }, 7, (Object) null);
            return null;
        }
        Iterator<T> it = ((InAppMessageImmersiveBase) inAppMessage).getMessageButtons().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((MessageButton) obj).getId() == buttonId) {
                break;
            }
        }
        MessageButton messageButton = (MessageButton) obj;
        return new InAppMessageActionData(messageButton != null ? messageButton.getClickAction() : null, messageButton != null ? messageButton.getUri() : null, messageButton != null ? messageButton.getOpenUriInWebview() : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getInAppMessageActionData$lambda$59() {
        return "Cannot perform IAM action because button was not null but message is not InAppMessageImmersiveBase";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getInitialPushPayload$lambda$68(WritableMap writableMap) {
        return "getInitialPushPayload returning payload: " + writableMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getInitialPushPayload$lambda$69() {
        return "getInitialPushPayload returning null - no initial payload available";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserId$lambda$2(Callback callback, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (StringsKt.isBlank(it.getUserId())) {
            INSTANCE.reportResult(callback, null, "User ID not found.");
        } else {
            Companion.reportResult$default(INSTANCE, callback, it.getUserId(), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit incrementCustomUserAttribute$lambda$11(Callback callback, String str, int i10, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.incrementCustomUserAttribute(str, i10)), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initialize$lambda$0(String str, String str2) {
        return "Initializing the Braze React Native SDK with API key: " + str + " and endpoint: " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initialize$lambda$1() {
        return "Disabling delayed initialization for Braze SDK.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performInAppMessageAction$lambda$56(String str) {
        return "Processing in-app message action " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performInAppMessageAction$lambda$57() {
        return "Can't perform click action because the cached activity is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processContentCardClickAction$lambda$47(String str) {
        return "Processing content card action " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processContentCardClickAction$lambda$48() {
        return "Card URL is null, returning null for getUriActionForCard";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeFromCustomAttributeArray$lambda$19(Callback callback, String str, String str2, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.removeFromCustomAttributeArray(str, str2)), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeFromSubscriptionGroup$lambda$31(Callback callback, String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.removeFromSubscriptionGroup(str)), null, 2, null);
        return Unit.INSTANCE;
    }

    private final void runOnUser(final Function1<? super BrazeUser, Unit> block) {
        getBraze().getCurrentUser(new IValueCallback() { // from class: V3.c0
            @Override // com.braze.events.IValueCallback
            public final void onSuccess(Object obj) {
                BrazeReactBridgeImpl.runOnUser$lambda$70(Function1.this, (BrazeUser) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runOnUser$lambda$70(Function1 function1, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setAttributionData$lambda$66() {
        return "Attribution data arguments were null. Not logging.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAttributionData$lambda$67(AttributionData attributionData, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setAttributionData(attributionData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setBoolCustomUserAttribute$lambda$7(Callback callback, String str, boolean z10, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setCustomUserAttribute(str, z10)), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCountry$lambda$26(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setCountry(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCustomUserAttributeArray$lambda$14(Callback callback, String str, String[] strArr, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setCustomAttributeArray(str, strArr)), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttributeObject$lambda$15() {
        return "Key was null. Not logging setCustomUserAttributeObject.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttributeObject$lambda$16() {
        return "Value was null. Not logging setCustomUserAttributeObject.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCustomUserAttributeObject$lambda$17(Callback callback, String str, JSONObject jSONObject, boolean z10, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setCustomAttribute(str, jSONObject, z10)), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCustomUserAttributeObjectArray$lambda$13(Callback callback, String str, JSONArray jSONArray, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setCustomUserAttribute(str, jSONArray)), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDateCustomUserAttribute$lambda$10(Callback callback, String str, int i10, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setCustomUserAttributeToSecondsFromEpoch(str, i10)), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDateOfBirth$lambda$25(int i10, int i11, int i12, BrazeReactBridgeImpl brazeReactBridgeImpl, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Month month = Month.INSTANCE.getMonth(i10 - 1);
        if (month != null) {
            it.setDateOfBirth(i11, month, i12);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeReactBridgeImpl, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: V3.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String dateOfBirth$lambda$25$lambda$24;
                    dateOfBirth$lambda$25$lambda$24 = BrazeReactBridgeImpl.setDateOfBirth$lambda$25$lambda$24();
                    return dateOfBirth$lambda$25$lambda$24;
                }
            }, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$25$lambda$24() {
        return "Invalid date of birth parameter: month is required to be within specified range. Not setting date of birth.";
    }

    private final void setDefaultInAppMessageListener() {
        BrazeInAppMessageManager.INSTANCE.getInstance().setCustomInAppMessageManagerListener(new DefaultInAppMessageManagerListener() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$setDefaultInAppMessageListener$1
            @Override // com.braze.ui.inappmessage.listeners.DefaultInAppMessageManagerListener, com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener
            public InAppMessageOperation beforeInAppMessageDisplayed(IInAppMessage inAppMessage) {
                InAppMessageOperation inAppMessageOperation;
                Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putMap("inAppMessage", InAppMessageUtilKt.mapInAppMessage(inAppMessage));
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) BrazeReactBridgeImpl.this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("inAppMessageReceived", writableNativeMap);
                inAppMessageOperation = BrazeReactBridgeImpl.this.inAppMessageDisplayOperation;
                return inAppMessageOperation;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDoubleCustomUserAttribute$lambda$9(Callback callback, String str, float f10, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setCustomUserAttribute(str, f10)), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEmail$lambda$22(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setEmail(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEmailNotificationSubscriptionType$lambda$33(Callback callback, NotificationSubscriptionType notificationSubscriptionType, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setEmailNotificationSubscriptionType(notificationSubscriptionType)), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setFirstName$lambda$20(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setFirstName(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setGender$lambda$23(Callback callback, Gender gender, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setGender(gender)), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setHomeCity$lambda$27(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setHomeCity(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setIntCustomUserAttribute$lambda$8(Callback callback, String str, int i10, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setCustomUserAttribute(str, i10)), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLanguage$lambda$29(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setLanguage(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLastKnownLocation$lambda$53(Double d10, Double d11, Double d12, double d13, double d14, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (d10 != null && d10.doubleValue() < 0.0d) {
            d10 = null;
        }
        if (d11 != null && d11.doubleValue() < 0.0d) {
            d11 = null;
        }
        it.setLastKnownLocation(d13, d14, d11 == null ? null : d12, d10, d11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLastName$lambda$21(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setLastName(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLocationCustomAttribute$lambda$49(String str, double d10, double d11, Callback callback, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setLocationCustomAttribute(str, d10, d11);
        Companion.reportResult$default(INSTANCE, callback, Boolean.TRUE, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setPhoneNumber$lambda$28(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setPhoneNumber(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setPushNotificationSubscriptionType$lambda$32(Callback callback, NotificationSubscriptionType notificationSubscriptionType, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setPushNotificationSubscriptionType(notificationSubscriptionType)), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setStringCustomUserAttribute$lambda$6(Callback callback, String str, String str2, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setCustomUserAttribute(str, str2)), null, 2, null);
        return Unit.INSTANCE;
    }

    private final void subscribeToBannersUpdatedEvent() {
        IEventSubscriber<BannersUpdatedEvent> iEventSubscriber = null;
        if (this.bannersUpdatedSubscriber != null) {
            Braze braze = getBraze();
            IEventSubscriber<BannersUpdatedEvent> iEventSubscriber2 = this.bannersUpdatedSubscriber;
            if (iEventSubscriber2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bannersUpdatedSubscriber");
                iEventSubscriber2 = null;
            }
            braze.removeSingleSubscription(iEventSubscriber2, BannersUpdatedEvent.class);
        }
        this.bannersUpdatedSubscriber = new IEventSubscriber() { // from class: V3.d
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeReactBridgeImpl.subscribeToBannersUpdatedEvent$lambda$39(BrazeReactBridgeImpl.this, (BannersUpdatedEvent) obj);
            }
        };
        Braze braze2 = getBraze();
        IEventSubscriber<BannersUpdatedEvent> iEventSubscriber3 = this.bannersUpdatedSubscriber;
        if (iEventSubscriber3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannersUpdatedSubscriber");
        } else {
            iEventSubscriber = iEventSubscriber3;
        }
        braze2.subscribeToBannersUpdates(iEventSubscriber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToBannersUpdatedEvent$lambda$39(BrazeReactBridgeImpl brazeReactBridgeImpl, BannersUpdatedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        WritableMap mutableMap = MapFactoryKt.getMutableMap();
        mutableMap.putArray("banners", BannerUtilKt.mapBanners(event.getBanners()));
        if (brazeReactBridgeImpl.reactApplicationContext.hasActiveReactInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) brazeReactBridgeImpl.reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("bannerCardsUpdated", mutableMap);
        }
    }

    private final void subscribeToContentCardsUpdatedEvent() {
        IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber = null;
        if (this.contentCardsUpdatedSubscriber != null) {
            Braze braze = getBraze();
            IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber2 = this.contentCardsUpdatedSubscriber;
            if (iEventSubscriber2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentCardsUpdatedSubscriber");
                iEventSubscriber2 = null;
            }
            braze.removeSingleSubscription(iEventSubscriber2, ContentCardsUpdatedEvent.class);
        }
        this.contentCardsUpdatedSubscriber = new IEventSubscriber() { // from class: V3.l
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeReactBridgeImpl.subscribeToContentCardsUpdatedEvent$lambda$38(BrazeReactBridgeImpl.this, (ContentCardsUpdatedEvent) obj);
            }
        };
        Braze braze2 = getBraze();
        IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber3 = this.contentCardsUpdatedSubscriber;
        if (iEventSubscriber3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentCardsUpdatedSubscriber");
        } else {
            iEventSubscriber = iEventSubscriber3;
        }
        braze2.subscribeToContentCardsUpdates(iEventSubscriber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToContentCardsUpdatedEvent$lambda$38(BrazeReactBridgeImpl brazeReactBridgeImpl, ContentCardsUpdatedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        WritableMap mutableMap = MapFactoryKt.getMutableMap();
        mutableMap.putArray("cards", ContentCardUtilKt.mapContentCards(event.getAllCards()));
        if (brazeReactBridgeImpl.reactApplicationContext.hasActiveReactInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) brazeReactBridgeImpl.reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("contentCardsUpdated", mutableMap);
        }
        brazeReactBridgeImpl.updateContentCardsIfNeeded(event);
    }

    private final void subscribeToEvents() {
        subscribeToContentCardsUpdatedEvent();
        subscribeToBannersUpdatedEvent();
        subscribeToSdkAuthenticationErrorEvents();
        subscribeToFeatureFlagsUpdatedEvent();
        if (this.pushNotificationEventSubscriber != null) {
            subscribeToPushNotificationEvents();
        }
        if (this.inAppMessageDisplayOperation != InAppMessageOperation.DISPLAY_NOW) {
            setDefaultInAppMessageListener();
        }
    }

    private final void subscribeToFeatureFlagsUpdatedEvent() {
        IEventSubscriber<FeatureFlagsUpdatedEvent> iEventSubscriber = null;
        if (this.featureFlagsUpdatedSubscriber != null) {
            Braze braze = getBraze();
            IEventSubscriber<FeatureFlagsUpdatedEvent> iEventSubscriber2 = this.featureFlagsUpdatedSubscriber;
            if (iEventSubscriber2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("featureFlagsUpdatedSubscriber");
                iEventSubscriber2 = null;
            }
            braze.removeSingleSubscription(iEventSubscriber2, FeatureFlagsUpdatedEvent.class);
        }
        this.featureFlagsUpdatedSubscriber = new IEventSubscriber() { // from class: V3.v
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeReactBridgeImpl.subscribeToFeatureFlagsUpdatedEvent$lambda$41(BrazeReactBridgeImpl.this, (FeatureFlagsUpdatedEvent) obj);
            }
        };
        Braze braze2 = getBraze();
        IEventSubscriber<FeatureFlagsUpdatedEvent> iEventSubscriber3 = this.featureFlagsUpdatedSubscriber;
        if (iEventSubscriber3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("featureFlagsUpdatedSubscriber");
        } else {
            iEventSubscriber = iEventSubscriber3;
        }
        braze2.subscribeToFeatureFlagsUpdates(iEventSubscriber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToFeatureFlagsUpdatedEvent$lambda$41(BrazeReactBridgeImpl brazeReactBridgeImpl, FeatureFlagsUpdatedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        WritableArray mutableArray = MapFactoryKt.getMutableArray();
        Iterator<T> it = event.getFeatureFlags().iterator();
        while (it.hasNext()) {
            mutableArray.pushMap(FeatureFlagUtilKt.convertFeatureFlag((FeatureFlag) it.next()));
        }
        if (brazeReactBridgeImpl.reactApplicationContext.hasActiveReactInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) brazeReactBridgeImpl.reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("featureFlagsUpdated", mutableArray);
        }
    }

    private final void subscribeToPushNotificationEvents() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: V3.E
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String subscribeToPushNotificationEvents$lambda$43;
                subscribeToPushNotificationEvents$lambda$43 = BrazeReactBridgeImpl.subscribeToPushNotificationEvents$lambda$43();
                return subscribeToPushNotificationEvents$lambda$43;
            }
        }, 6, (Object) null);
        if (!this.reactApplicationContext.hasActiveReactInstance()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: V3.F
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToPushNotificationEvents$lambda$44;
                    subscribeToPushNotificationEvents$lambda$44 = BrazeReactBridgeImpl.subscribeToPushNotificationEvents$lambda$44();
                    return subscribeToPushNotificationEvents$lambda$44;
                }
            }, 7, (Object) null);
            return;
        }
        IEventSubscriber<BrazePushEvent> iEventSubscriber = null;
        if (this.pushNotificationEventSubscriber != null) {
            Braze braze = getBraze();
            IEventSubscriber<BrazePushEvent> iEventSubscriber2 = this.pushNotificationEventSubscriber;
            if (iEventSubscriber2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pushNotificationEventSubscriber");
                iEventSubscriber2 = null;
            }
            braze.removeSingleSubscription(iEventSubscriber2, BrazePushEvent.class);
        }
        this.pushNotificationEventSubscriber = new IEventSubscriber() { // from class: V3.G
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeReactBridgeImpl.subscribeToPushNotificationEvents$lambda$46(BrazeReactBridgeImpl.this, (BrazePushEvent) obj);
            }
        };
        Braze braze2 = getBraze();
        IEventSubscriber<BrazePushEvent> iEventSubscriber3 = this.pushNotificationEventSubscriber;
        if (iEventSubscriber3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pushNotificationEventSubscriber");
        } else {
            iEventSubscriber = iEventSubscriber3;
        }
        braze2.subscribeToPushNotificationEvents(iEventSubscriber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToPushNotificationEvents$lambda$43() {
        return "subscribeToPushNotificationEvents called";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToPushNotificationEvents$lambda$44() {
        return "Cannot call subscribeToPushNotificationEvents without an active react instance";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToPushNotificationEvents$lambda$46(BrazeReactBridgeImpl brazeReactBridgeImpl, BrazePushEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String pushEventType$braze_react_native_sdk_release = brazeReactBridgeImpl.getPushEventType$braze_react_native_sdk_release(event.getEventType());
        if (pushEventType$braze_react_native_sdk_release == null) {
            return;
        }
        final WritableMap createPushNotificationMap$default = PushPayloadMapper.createPushNotificationMap$default(event.getNotificationPayload(), pushEventType$braze_react_native_sdk_release, null, null, 12, null);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeReactBridgeImpl, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: V3.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String subscribeToPushNotificationEvents$lambda$46$lambda$45;
                subscribeToPushNotificationEvents$lambda$46$lambda$45 = BrazeReactBridgeImpl.subscribeToPushNotificationEvents$lambda$46$lambda$45(WritableMap.this);
                return subscribeToPushNotificationEvents$lambda$46$lambda$45;
            }
        }, 7, (Object) null);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) brazeReactBridgeImpl.reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("pushNotificationEvent", createPushNotificationMap$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToPushNotificationEvents$lambda$46$lambda$45(WritableMap writableMap) {
        return "Sending push notification event with data " + writableMap;
    }

    private final void subscribeToSdkAuthenticationErrorEvents() {
        IEventSubscriber<BrazeSdkAuthenticationErrorEvent> iEventSubscriber = null;
        if (this.sdkAuthErrorSubscriber != null) {
            Braze braze = getBraze();
            IEventSubscriber<BrazeSdkAuthenticationErrorEvent> iEventSubscriber2 = this.sdkAuthErrorSubscriber;
            if (iEventSubscriber2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sdkAuthErrorSubscriber");
                iEventSubscriber2 = null;
            }
            braze.removeSingleSubscription(iEventSubscriber2, BrazeSdkAuthenticationErrorEvent.class);
        }
        this.sdkAuthErrorSubscriber = new IEventSubscriber() { // from class: V3.k
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeReactBridgeImpl.subscribeToSdkAuthenticationErrorEvents$lambda$42(BrazeReactBridgeImpl.this, (BrazeSdkAuthenticationErrorEvent) obj);
            }
        };
        Braze braze2 = getBraze();
        IEventSubscriber<BrazeSdkAuthenticationErrorEvent> iEventSubscriber3 = this.sdkAuthErrorSubscriber;
        if (iEventSubscriber3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sdkAuthErrorSubscriber");
        } else {
            iEventSubscriber = iEventSubscriber3;
        }
        braze2.subscribeToSdkAuthenticationFailures(iEventSubscriber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToSdkAuthenticationErrorEvents$lambda$42(BrazeReactBridgeImpl brazeReactBridgeImpl, BrazeSdkAuthenticationErrorEvent errorEvent) {
        Intrinsics.checkNotNullParameter(errorEvent, "errorEvent");
        if (brazeReactBridgeImpl.reactApplicationContext.hasActiveReactInstance()) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt(EventKeys.ERROR_CODE_KEY, errorEvent.getErrorCode());
            writableNativeMap.putString("user_id", errorEvent.getUserId());
            writableNativeMap.putString("original_signature", errorEvent.getSignature());
            writableNativeMap.putString("error_reason", errorEvent.getErrorReason());
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) brazeReactBridgeImpl.reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("sdkAuthenticationError", writableNativeMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unsetCustomUserAttribute$lambda$12(Callback callback, String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.unsetCustomUserAttribute(str)), null, 2, null);
        return Unit.INSTANCE;
    }

    private final void updateContentCardsIfNeeded(ContentCardsUpdatedEvent event) {
        if (event.getTimestampSeconds() > this.contentCardsUpdatedAt) {
            ReentrantLock reentrantLock = this.contentCardsLock;
            reentrantLock.lock();
            try {
                this.contentCardsUpdatedAt = event.getTimestampSeconds();
                this.contentCards.clear();
                this.contentCards.addAll(event.getAllCards());
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void addAlias(@NotNull final String aliasName, @NotNull final String aliasLabel) {
        Intrinsics.checkNotNullParameter(aliasName, "aliasName");
        Intrinsics.checkNotNullParameter(aliasLabel, "aliasLabel");
        if (StringsKt.isBlank(aliasName)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: V3.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addAlias$lambda$3;
                    addAlias$lambda$3 = BrazeReactBridgeImpl.addAlias$lambda$3();
                    return addAlias$lambda$3;
                }
            }, 6, (Object) null);
        } else if (StringsKt.isBlank(aliasLabel)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: V3.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addAlias$lambda$4;
                    addAlias$lambda$4 = BrazeReactBridgeImpl.addAlias$lambda$4();
                    return addAlias$lambda$4;
                }
            }, 6, (Object) null);
        } else {
            runOnUser(new Function1() { // from class: V3.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit addAlias$lambda$5;
                    addAlias$lambda$5 = BrazeReactBridgeImpl.addAlias$lambda$5(aliasName, aliasLabel, (BrazeUser) obj);
                    return addAlias$lambda$5;
                }
            });
        }
    }

    public final void addListener(@NotNull final String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (Intrinsics.areEqual(eventName, "pushNotificationEvent")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: V3.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addListener$lambda$71;
                    addListener$lambda$71 = BrazeReactBridgeImpl.addListener$lambda$71(eventName);
                    return addListener$lambda$71;
                }
            }, 7, (Object) null);
            subscribeToPushNotificationEvents();
        } else if (Intrinsics.areEqual(eventName, "inAppMessageReceived") && (BrazeInAppMessageManager.INSTANCE.getInstance().getInAppMessageManagerListener() instanceof DefaultInAppMessageManagerListener)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: V3.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addListener$lambda$72;
                    addListener$lambda$72 = BrazeReactBridgeImpl.addListener$lambda$72(eventName);
                    return addListener$lambda$72;
                }
            }, 7, (Object) null);
            setDefaultInAppMessageListener();
        }
    }

    public final void addToCustomAttributeArray(@NotNull final String key, @NotNull final String value, @Nullable final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        runOnUser(new Function1() { // from class: V3.V
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit addToCustomAttributeArray$lambda$18;
                addToCustomAttributeArray$lambda$18 = BrazeReactBridgeImpl.addToCustomAttributeArray$lambda$18(Callback.this, key, value, (BrazeUser) obj);
                return addToCustomAttributeArray$lambda$18;
            }
        });
    }

    public final void addToSubscriptionGroup(@NotNull final String groupId, @Nullable final Callback callback) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        runOnUser(new Function1() { // from class: V3.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit addToSubscriptionGroup$lambda$30;
                addToSubscriptionGroup$lambda$30 = BrazeReactBridgeImpl.addToSubscriptionGroup$lambda$30(Callback.this, groupId, (BrazeUser) obj);
                return addToSubscriptionGroup$lambda$30;
            }
        });
    }

    public final void changeUser(@NotNull String userName, @Nullable String sdkAuthToken) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        getBraze().changeUser(userName, sdkAuthToken);
    }

    public final void disableSDK() {
        Braze.INSTANCE.disableSdk(this.reactApplicationContext);
    }

    public final void enableSDK() {
        Braze.INSTANCE.enableSdk(this.reactApplicationContext);
    }

    public final void getAllFeatureFlags(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        WritableArray mutableArray = MapFactoryKt.getMutableArray();
        Iterator<T> it = getBraze().getAllFeatureFlags().iterator();
        while (it.hasNext()) {
            mutableArray.pushMap(FeatureFlagUtilKt.convertFeatureFlag((FeatureFlag) it.next()));
        }
        promise.resolve(mutableArray);
    }

    public final void getBanner(@NotNull String placementId, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Banner banner = getBraze().getBanner(placementId);
        if (banner != null) {
            promise.resolve(BannerUtilKt.mapBanner(banner));
        } else {
            promise.resolve(null);
        }
    }

    @NotNull
    public final Braze getBraze() {
        Braze braze = this.brazeTestingMock;
        return braze == null ? Braze.INSTANCE.getInstance(this.reactApplicationContext) : braze;
    }

    public final void getCachedContentCards(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        ReentrantLock reentrantLock = this.contentCardsLock;
        reentrantLock.lock();
        try {
            promise.resolve(ContentCardUtilKt.mapContentCards(this.contentCards));
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void getContentCards(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        getBraze().subscribeToContentCardsUpdates(new IFireOnceEventSubscriber() { // from class: V3.j
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeReactBridgeImpl.getContentCards$lambda$36(BrazeReactBridgeImpl.this, promise, (ContentCardsUpdatedEvent) obj);
            }
        });
        getBraze().requestContentCardsRefresh();
    }

    public final void getDeviceId(@NotNull final Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        getBraze().getDeviceIdAsync(new IValueCallback<String>() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$getDeviceId$1
            @Override // com.braze.events.IValueCallback
            public void onError() {
                BrazeReactBridgeImpl.Companion.reportResult$default(BrazeReactBridgeImpl.INSTANCE, Callback.this, null, "Failed to retrieve the current device id.", 1, null);
            }

            @Override // com.braze.events.IValueCallback
            public void onSuccess(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BrazeReactBridgeImpl.Companion.reportResult$default(BrazeReactBridgeImpl.INSTANCE, Callback.this, value, null, 2, null);
            }
        });
    }

    public final void getFeatureFlag(@NotNull String id2, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(promise, "promise");
        FeatureFlag featureFlag = getBraze().getFeatureFlag(id2);
        if (featureFlag == null) {
            promise.resolve(null);
        } else {
            promise.resolve(FeatureFlagUtilKt.convertFeatureFlag(featureFlag));
        }
    }

    public final void getFeatureFlagBooleanProperty(@NotNull String id2, @NotNull String key, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(promise, "promise");
        FeatureFlag featureFlag = getBraze().getFeatureFlag(id2);
        promise.resolve(featureFlag != null ? featureFlag.getBooleanProperty(key) : null);
    }

    public final void getFeatureFlagImageProperty(@NotNull String id2, @NotNull String key, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(promise, "promise");
        FeatureFlag featureFlag = getBraze().getFeatureFlag(id2);
        promise.resolve(featureFlag != null ? featureFlag.getImageProperty(key) : null);
    }

    public final void getFeatureFlagJSONProperty(@NotNull String id2, @NotNull String key, @NotNull Promise promise) {
        JSONObject jSONProperty;
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(promise, "promise");
        FeatureFlag featureFlag = getBraze().getFeatureFlag(id2);
        promise.resolve((featureFlag == null || (jSONProperty = featureFlag.getJSONProperty(key)) == null) ? null : JsonUtilsKt.toNativeMap(jSONProperty));
    }

    public final void getFeatureFlagNumberProperty(@NotNull String id2, @NotNull String key, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(promise, "promise");
        FeatureFlag featureFlag = getBraze().getFeatureFlag(id2);
        promise.resolve(featureFlag != null ? featureFlag.getNumberProperty(key) : null);
    }

    public final void getFeatureFlagStringProperty(@NotNull String id2, @NotNull String key, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(promise, "promise");
        FeatureFlag featureFlag = getBraze().getFeatureFlag(id2);
        promise.resolve(featureFlag != null ? featureFlag.getStringProperty(key) : null);
    }

    public final void getFeatureFlagTimestampProperty(@NotNull String id2, @NotNull String key, @NotNull Promise promise) {
        Long timestampProperty;
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(promise, "promise");
        FeatureFlag featureFlag = getBraze().getFeatureFlag(id2);
        promise.resolve((featureFlag == null || (timestampProperty = featureFlag.getTimestampProperty(key)) == null) ? null : Double.valueOf(timestampProperty.longValue()));
    }

    public final void getInitialPushPayload(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        final WritableMap initialPushPayload = BrazeReactUtils.getInitialPushPayload();
        if (initialPushPayload == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: V3.j0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String initialPushPayload$lambda$69;
                    initialPushPayload$lambda$69 = BrazeReactBridgeImpl.getInitialPushPayload$lambda$69();
                    return initialPushPayload$lambda$69;
                }
            }, 7, (Object) null);
            Companion.reportResult$default(INSTANCE, callback, null, null, 2, null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: V3.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String initialPushPayload$lambda$68;
                    initialPushPayload$lambda$68 = BrazeReactBridgeImpl.getInitialPushPayload$lambda$68(WritableMap.this);
                    return initialPushPayload$lambda$68;
                }
            }, 7, (Object) null);
            Companion.reportResult$default(INSTANCE, callback, initialPushPayload, null, 2, null);
            BrazeReactUtils.clearInitialPushPayload();
        }
    }

    @Nullable
    public final String getPushEventType$braze_react_native_sdk_release(@NotNull BrazePushEventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        int i10 = WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
        if (i10 == 1) {
            return "push_received";
        }
        if (i10 != 2) {
            return null;
        }
        return "push_opened";
    }

    @NotNull
    public final ReactApplicationContext getReactApplicationContext() {
        return this.reactApplicationContext;
    }

    public final void getUserId(@NotNull final Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        runOnUser(new Function1() { // from class: V3.S
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit userId$lambda$2;
                userId$lambda$2 = BrazeReactBridgeImpl.getUserId$lambda$2(Callback.this, (BrazeUser) obj);
                return userId$lambda$2;
            }
        });
    }

    public final void hideCurrentInAppMessage() {
        BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    public final void incrementCustomUserAttribute(@NotNull final String key, final int incrementValue, @Nullable final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        runOnUser(new Function1() { // from class: V3.N
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit incrementCustomUserAttribute$lambda$11;
                incrementCustomUserAttribute$lambda$11 = BrazeReactBridgeImpl.incrementCustomUserAttribute$lambda$11(Callback.this, key, incrementValue, (BrazeUser) obj);
                return incrementCustomUserAttribute$lambda$11;
            }
        });
    }

    public final void initialize(@NotNull final String apiKey, @NotNull final String endpoint) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f29472V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: V3.f0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String initialize$lambda$0;
                initialize$lambda$0 = BrazeReactBridgeImpl.initialize$lambda$0(apiKey, endpoint);
                return initialize$lambda$0;
            }
        }, 6, (Object) null);
        Braze.Companion companion = Braze.INSTANCE;
        companion.disableSdk(this.reactApplicationContext);
        companion.configure(this.reactApplicationContext, new BrazeConfig.Builder().setApiKey(apiKey).setCustomEndpoint(endpoint).build());
        if (companion.isDelayedInitializationEnabled()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: V3.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String initialize$lambda$1;
                    initialize$lambda$1 = BrazeReactBridgeImpl.initialize$lambda$1();
                    return initialize$lambda$1;
                }
            }, 6, (Object) null);
            companion.disableDelayedInitialization(this.reactApplicationContext);
        }
        companion.enableSdk(this.reactApplicationContext);
        subscribeToEvents();
    }

    public final void launchContentCards(@Nullable Boolean dismissAutomaticallyOnCardClick) {
        Intent intent = new Intent(this.currentActivity, (Class<?>) ContentCardsActivity.class);
        intent.setFlags(872415232);
        this.reactApplicationContext.startActivity(intent);
    }

    public final void logBannerClick(@NotNull String placementId, @Nullable String buttonId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        getBraze().logBannerClick(placementId, buttonId);
    }

    public final void logBannerImpression(@NotNull String placementId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        getBraze().logBannerImpression(placementId);
    }

    public final void logContentCardClicked(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Card contentCardById = getContentCardById(id2);
        if (contentCardById != null) {
            contentCardById.logClick();
        }
    }

    public final void logContentCardDismissed(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Card contentCardById = getContentCardById(id2);
        if (contentCardById != null) {
            contentCardById.setDismissed(true);
        }
    }

    public final void logContentCardImpression(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Card contentCardById = getContentCardById(id2);
        if (contentCardById != null) {
            contentCardById.logImpression();
        }
    }

    public final void logCustomEvent(@NotNull String eventName, @Nullable ReadableMap eventProperties) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        getBraze().logCustomEvent(eventName, INSTANCE.populateEventPropertiesFromReadableMap(eventProperties));
    }

    public final void logFeatureFlagImpression(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        getBraze().logFeatureFlagImpression(id2);
    }

    public final void logInAppMessageButtonClicked(@NotNull String inAppMessageString, int buttonId) {
        Object obj;
        Intrinsics.checkNotNullParameter(inAppMessageString, "inAppMessageString");
        IInAppMessage deserializeInAppMessageString = getBraze().deserializeInAppMessageString(inAppMessageString);
        if (deserializeInAppMessageString instanceof InAppMessageImmersiveBase) {
            InAppMessageImmersiveBase inAppMessageImmersiveBase = (InAppMessageImmersiveBase) deserializeInAppMessageString;
            Iterator<T> it = inAppMessageImmersiveBase.getMessageButtons().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((MessageButton) obj).getId() == buttonId) {
                        break;
                    }
                }
            }
            MessageButton messageButton = (MessageButton) obj;
            if (messageButton != null) {
                inAppMessageImmersiveBase.logButtonClick(messageButton);
            }
        }
    }

    public final void logInAppMessageClicked(@NotNull String inAppMessageString) {
        Intrinsics.checkNotNullParameter(inAppMessageString, "inAppMessageString");
        IInAppMessage deserializeInAppMessageString = getBraze().deserializeInAppMessageString(inAppMessageString);
        if (deserializeInAppMessageString != null) {
            deserializeInAppMessageString.logClick();
        }
    }

    @Nullable
    public final Boolean logInAppMessageImpression(@NotNull String inAppMessageString) {
        Intrinsics.checkNotNullParameter(inAppMessageString, "inAppMessageString");
        IInAppMessage deserializeInAppMessageString = getBraze().deserializeInAppMessageString(inAppMessageString);
        if (deserializeInAppMessageString != null) {
            return Boolean.valueOf(deserializeInAppMessageString.logImpression());
        }
        return null;
    }

    public final void logPurchase(@NotNull String productIdentifier, @NotNull String price, @NotNull String currencyCode, int quantity, @Nullable ReadableMap eventProperties) {
        Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        getBraze().logPurchase(productIdentifier, currencyCode, new BigDecimal(price), quantity, INSTANCE.populateEventPropertiesFromReadableMap(eventProperties));
    }

    public final void performInAppMessageAction(@NotNull final String inAppMessageString, int buttonId) {
        Intrinsics.checkNotNullParameter(inAppMessageString, "inAppMessageString");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: V3.C
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String performInAppMessageAction$lambda$56;
                performInAppMessageAction$lambda$56 = BrazeReactBridgeImpl.performInAppMessageAction$lambda$56(inAppMessageString);
                return performInAppMessageAction$lambda$56;
            }
        }, 6, (Object) null);
        IInAppMessage deserializeInAppMessageString = getBraze().deserializeInAppMessageString(inAppMessageString);
        Activity activity = this.currentActivity;
        InAppMessageActionData inAppMessageActionData = (deserializeInAppMessageString == null || activity == null) ? null : getInAppMessageActionData(deserializeInAppMessageString, buttonId);
        if (deserializeInAppMessageString != null && activity != null && inAppMessageActionData != null) {
            executeInAppMessageAction(inAppMessageActionData, deserializeInAppMessageString);
        } else if (activity == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: V3.D
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String performInAppMessageAction$lambda$57;
                    performInAppMessageAction$lambda$57 = BrazeReactBridgeImpl.performInAppMessageAction$lambda$57();
                    return performInAppMessageAction$lambda$57;
                }
            }, 6, (Object) null);
        }
    }

    public final void processContentCardClickAction(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: V3.J
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String processContentCardClickAction$lambda$47;
                processContentCardClickAction$lambda$47 = BrazeReactBridgeImpl.processContentCardClickAction$lambda$47(id2);
                return processContentCardClickAction$lambda$47;
            }
        }, 6, (Object) null);
        Card contentCardById = getContentCardById(id2);
        if (contentCardById != null) {
            Bundle bundle = new Bundle();
            for (String str : contentCardById.getExtras().keySet()) {
                bundle.putString(str, contentCardById.getExtras().get(str));
            }
            String url = contentCardById.getUrl();
            if (url == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: V3.L
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String processContentCardClickAction$lambda$48;
                        processContentCardClickAction$lambda$48 = BrazeReactBridgeImpl.processContentCardClickAction$lambda$48();
                        return processContentCardClickAction$lambda$48;
                    }
                }, 6, (Object) null);
                return;
            }
            BrazeDeeplinkHandler.Companion companion = BrazeDeeplinkHandler.INSTANCE;
            UriAction createUriActionFromUrlString = companion.getInstance().createUriActionFromUrlString(url, bundle, contentCardById.getOpenUriInWebView(), Channel.CONTENT_CARD);
            if (createUriActionFromUrlString != null) {
                companion.getInstance().gotoUri(this.reactApplicationContext, createUriActionFromUrlString);
            }
        }
    }

    public final void refreshFeatureFlags() {
        getBraze().refreshFeatureFlags();
    }

    public final void registerPushToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        getBraze().setRegisteredPushToken(token);
    }

    public final void removeFromCustomAttributeArray(@NotNull final String key, @NotNull final String value, @Nullable final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        runOnUser(new Function1() { // from class: V3.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit removeFromCustomAttributeArray$lambda$19;
                removeFromCustomAttributeArray$lambda$19 = BrazeReactBridgeImpl.removeFromCustomAttributeArray$lambda$19(Callback.this, key, value, (BrazeUser) obj);
                return removeFromCustomAttributeArray$lambda$19;
            }
        });
    }

    public final void removeFromSubscriptionGroup(@NotNull final String groupId, @Nullable final Callback callback) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        runOnUser(new Function1() { // from class: V3.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit removeFromSubscriptionGroup$lambda$31;
                removeFromSubscriptionGroup$lambda$31 = BrazeReactBridgeImpl.removeFromSubscriptionGroup$lambda$31(Callback.this, groupId, (BrazeUser) obj);
                return removeFromSubscriptionGroup$lambda$31;
            }
        });
    }

    public final void removeListeners(int count) {
    }

    public final void requestBannersRefresh(@NotNull ReadableArray placementIds) {
        Intrinsics.checkNotNullParameter(placementIds, "placementIds");
        ArrayList<Object> arrayList = placementIds.toArrayList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(String.valueOf(it.next()));
        }
        getBraze().requestBannersRefresh(arrayList2);
    }

    public final void requestContentCardsRefresh() {
        getBraze().requestContentCardsRefresh();
    }

    public final void requestGeofences(double latitude, double longitude) {
        getBraze().requestGeofences(latitude, longitude);
    }

    public final void requestImmediateDataFlush() {
        getBraze().requestImmediateDataFlush();
    }

    public final void requestLocationInitialization() {
        getBraze().requestLocationInitialization();
    }

    public final void requestPushPermission(@Nullable ReadableMap options) {
        PermissionUtils.requestPushPermissionPrompt(this.currentActivity);
    }

    public final void setAdTrackingEnabled(boolean adTrackingEnabled, @Nullable String googleAdvertisingId) {
        if (googleAdvertisingId == null) {
            googleAdvertisingId = "";
        }
        getBraze().setGoogleAdvertisingId(googleAdvertisingId, adTrackingEnabled);
    }

    public final void setAttributionData(@Nullable String network, @Nullable String campaign, @Nullable String adGroup, @Nullable String creative) {
        if (network == null || campaign == null || adGroup == null || creative == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: V3.O
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String attributionData$lambda$66;
                    attributionData$lambda$66 = BrazeReactBridgeImpl.setAttributionData$lambda$66();
                    return attributionData$lambda$66;
                }
            }, 7, (Object) null);
        } else {
            final AttributionData attributionData = new AttributionData(network, campaign, adGroup, creative);
            runOnUser(new Function1() { // from class: V3.P
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit attributionData$lambda$67;
                    attributionData$lambda$67 = BrazeReactBridgeImpl.setAttributionData$lambda$67(AttributionData.this, (BrazeUser) obj);
                    return attributionData$lambda$67;
                }
            });
        }
    }

    public final void setBoolCustomUserAttribute(@NotNull final String key, final boolean value, @Nullable final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        runOnUser(new Function1() { // from class: V3.Q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit boolCustomUserAttribute$lambda$7;
                boolCustomUserAttribute$lambda$7 = BrazeReactBridgeImpl.setBoolCustomUserAttribute$lambda$7(Callback.this, key, value, (BrazeUser) obj);
                return boolCustomUserAttribute$lambda$7;
            }
        });
    }

    public final void setCountry(@Nullable final String country) {
        runOnUser(new Function1() { // from class: V3.X
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit country$lambda$26;
                country$lambda$26 = BrazeReactBridgeImpl.setCountry$lambda$26(country, (BrazeUser) obj);
                return country$lambda$26;
            }
        });
    }

    public final void setCustomUserAttributeArray(@NotNull final String key, @NotNull ReadableArray value, @Nullable final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.size();
        final String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = value.getString(i10);
        }
        runOnUser(new Function1() { // from class: V3.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit customUserAttributeArray$lambda$14;
                customUserAttributeArray$lambda$14 = BrazeReactBridgeImpl.setCustomUserAttributeArray$lambda$14(Callback.this, key, strArr, (BrazeUser) obj);
                return customUserAttributeArray$lambda$14;
            }
        });
    }

    public final void setCustomUserAttributeObject(@Nullable final String key, @Nullable ReadableMap value, final boolean merge, @Nullable final Callback callback) {
        if (key == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: V3.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customUserAttributeObject$lambda$15;
                    customUserAttributeObject$lambda$15 = BrazeReactBridgeImpl.setCustomUserAttributeObject$lambda$15();
                    return customUserAttributeObject$lambda$15;
                }
            }, 7, (Object) null);
        } else if (value == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: V3.K
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customUserAttributeObject$lambda$16;
                    customUserAttributeObject$lambda$16 = BrazeReactBridgeImpl.setCustomUserAttributeObject$lambda$16();
                    return customUserAttributeObject$lambda$16;
                }
            }, 7, (Object) null);
        } else {
            final JSONObject jSONObject = new JSONObject(INSTANCE.parseReadableMap(value));
            runOnUser(new Function1() { // from class: V3.W
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit customUserAttributeObject$lambda$17;
                    customUserAttributeObject$lambda$17 = BrazeReactBridgeImpl.setCustomUserAttributeObject$lambda$17(Callback.this, key, jSONObject, merge, (BrazeUser) obj);
                    return customUserAttributeObject$lambda$17;
                }
            });
        }
    }

    public final void setCustomUserAttributeObjectArray(@NotNull final String key, @NotNull ReadableArray value, @Nullable final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        final JSONArray jSONArray = new JSONArray((Collection) INSTANCE.parseReadableArray(value));
        runOnUser(new Function1() { // from class: V3.U
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit customUserAttributeObjectArray$lambda$13;
                customUserAttributeObjectArray$lambda$13 = BrazeReactBridgeImpl.setCustomUserAttributeObjectArray$lambda$13(Callback.this, key, jSONArray, (BrazeUser) obj);
                return customUserAttributeObjectArray$lambda$13;
            }
        });
    }

    public final void setDateCustomUserAttribute(@NotNull final String key, final int timeStamp, @Nullable final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        runOnUser(new Function1() { // from class: V3.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit dateCustomUserAttribute$lambda$10;
                dateCustomUserAttribute$lambda$10 = BrazeReactBridgeImpl.setDateCustomUserAttribute$lambda$10(Callback.this, key, timeStamp, (BrazeUser) obj);
                return dateCustomUserAttribute$lambda$10;
            }
        });
    }

    public final void setDateOfBirth(final int year, final int month, final int day) {
        runOnUser(new Function1() { // from class: V3.I
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit dateOfBirth$lambda$25;
                dateOfBirth$lambda$25 = BrazeReactBridgeImpl.setDateOfBirth$lambda$25(month, year, day, this, (BrazeUser) obj);
                return dateOfBirth$lambda$25;
            }
        });
    }

    public final void setDoubleCustomUserAttribute(@NotNull final String key, final float value, @Nullable final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        runOnUser(new Function1() { // from class: V3.M
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit doubleCustomUserAttribute$lambda$9;
                doubleCustomUserAttribute$lambda$9 = BrazeReactBridgeImpl.setDoubleCustomUserAttribute$lambda$9(Callback.this, key, value, (BrazeUser) obj);
                return doubleCustomUserAttribute$lambda$9;
            }
        });
    }

    public final void setEmail(@Nullable final String email) {
        runOnUser(new Function1() { // from class: V3.Z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit email$lambda$22;
                email$lambda$22 = BrazeReactBridgeImpl.setEmail$lambda$22(email, (BrazeUser) obj);
                return email$lambda$22;
            }
        });
    }

    public final void setEmailNotificationSubscriptionType(@NotNull String subscriptionType, @Nullable final Callback callback) {
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        Companion companion = INSTANCE;
        final NotificationSubscriptionType parseNotificationSubscriptionType = companion.parseNotificationSubscriptionType(subscriptionType);
        if (parseNotificationSubscriptionType != null) {
            runOnUser(new Function1() { // from class: V3.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit emailNotificationSubscriptionType$lambda$33;
                    emailNotificationSubscriptionType$lambda$33 = BrazeReactBridgeImpl.setEmailNotificationSubscriptionType$lambda$33(Callback.this, parseNotificationSubscriptionType, (BrazeUser) obj);
                    return emailNotificationSubscriptionType$lambda$33;
                }
            });
            return;
        }
        Companion.reportResult$default(companion, callback, null, "Invalid subscription type " + subscriptionType + ". Email notification subscription type not set.", 1, null);
    }

    public final void setFirstName(@Nullable final String firstName) {
        runOnUser(new Function1() { // from class: V3.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit firstName$lambda$20;
                firstName$lambda$20 = BrazeReactBridgeImpl.setFirstName$lambda$20(firstName, (BrazeUser) obj);
                return firstName$lambda$20;
            }
        });
    }

    public final void setGender(@Nullable String gender, @Nullable final Callback callback) {
        String str;
        Gender.Companion companion = Gender.INSTANCE;
        if (gender != null) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            str = gender.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        final Gender gender2 = companion.getGender(str);
        runOnUser(new Function1() { // from class: V3.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit gender$lambda$23;
                gender$lambda$23 = BrazeReactBridgeImpl.setGender$lambda$23(Callback.this, gender2, (BrazeUser) obj);
                return gender$lambda$23;
            }
        });
    }

    public final void setHomeCity(@Nullable final String homeCity) {
        runOnUser(new Function1() { // from class: V3.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit homeCity$lambda$27;
                homeCity$lambda$27 = BrazeReactBridgeImpl.setHomeCity$lambda$27(homeCity, (BrazeUser) obj);
                return homeCity$lambda$27;
            }
        });
    }

    public final void setIntCustomUserAttribute(@NotNull final String key, final int value, @Nullable final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        runOnUser(new Function1() { // from class: V3.A
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit intCustomUserAttribute$lambda$8;
                intCustomUserAttribute$lambda$8 = BrazeReactBridgeImpl.setIntCustomUserAttribute$lambda$8(Callback.this, key, value, (BrazeUser) obj);
                return intCustomUserAttribute$lambda$8;
            }
        });
    }

    public final void setLanguage(@Nullable final String language) {
        runOnUser(new Function1() { // from class: V3.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit language$lambda$29;
                language$lambda$29 = BrazeReactBridgeImpl.setLanguage$lambda$29(language, (BrazeUser) obj);
                return language$lambda$29;
            }
        });
    }

    public final void setLastKnownLocation(final double latitude, final double longitude, @Nullable final Double altitude, @Nullable final Double horizontalAccuracy, @Nullable final Double verticalAccuracy) {
        runOnUser(new Function1() { // from class: V3.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit lastKnownLocation$lambda$53;
                lastKnownLocation$lambda$53 = BrazeReactBridgeImpl.setLastKnownLocation$lambda$53(horizontalAccuracy, verticalAccuracy, altitude, latitude, longitude, (BrazeUser) obj);
                return lastKnownLocation$lambda$53;
            }
        });
    }

    public final void setLastName(@Nullable final String lastName) {
        runOnUser(new Function1() { // from class: V3.H
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit lastName$lambda$21;
                lastName$lambda$21 = BrazeReactBridgeImpl.setLastName$lambda$21(lastName, (BrazeUser) obj);
                return lastName$lambda$21;
            }
        });
    }

    public final void setLocationCustomAttribute(@NotNull final String key, final double latitude, final double longitude, @Nullable final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        runOnUser(new Function1() { // from class: V3.T
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit locationCustomAttribute$lambda$49;
                locationCustomAttribute$lambda$49 = BrazeReactBridgeImpl.setLocationCustomAttribute$lambda$49(key, latitude, longitude, callback, (BrazeUser) obj);
                return locationCustomAttribute$lambda$49;
            }
        });
    }

    public final void setPhoneNumber(@Nullable final String phoneNumber) {
        runOnUser(new Function1() { // from class: V3.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit phoneNumber$lambda$28;
                phoneNumber$lambda$28 = BrazeReactBridgeImpl.setPhoneNumber$lambda$28(phoneNumber, (BrazeUser) obj);
                return phoneNumber$lambda$28;
            }
        });
    }

    public final void setPushNotificationSubscriptionType(@NotNull String subscriptionType, @Nullable final Callback callback) {
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        Companion companion = INSTANCE;
        final NotificationSubscriptionType parseNotificationSubscriptionType = companion.parseNotificationSubscriptionType(subscriptionType);
        if (parseNotificationSubscriptionType != null) {
            runOnUser(new Function1() { // from class: V3.Y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit pushNotificationSubscriptionType$lambda$32;
                    pushNotificationSubscriptionType$lambda$32 = BrazeReactBridgeImpl.setPushNotificationSubscriptionType$lambda$32(Callback.this, parseNotificationSubscriptionType, (BrazeUser) obj);
                    return pushNotificationSubscriptionType$lambda$32;
                }
            });
            return;
        }
        Companion.reportResult$default(companion, callback, null, "Invalid subscription type " + subscriptionType + ". Push notification subscription type not set.", 1, null);
    }

    public final void setSdkAuthenticationSignature(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        getBraze().setSdkAuthenticationSignature(token);
    }

    public final void setStringCustomUserAttribute(@NotNull final String key, @NotNull final String value, @Nullable final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        runOnUser(new Function1() { // from class: V3.B
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit stringCustomUserAttribute$lambda$6;
                stringCustomUserAttribute$lambda$6 = BrazeReactBridgeImpl.setStringCustomUserAttribute$lambda$6(Callback.this, key, value, (BrazeUser) obj);
                return stringCustomUserAttribute$lambda$6;
            }
        });
    }

    public final void subscribeToInAppMessage(boolean useBrazeUI) {
        this.inAppMessageDisplayOperation = useBrazeUI ? InAppMessageOperation.DISPLAY_NOW : InAppMessageOperation.DISPLAY_LATER;
        setDefaultInAppMessageListener();
    }

    public final void unsetCustomUserAttribute(@NotNull final String key, @Nullable final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        runOnUser(new Function1() { // from class: V3.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unsetCustomUserAttribute$lambda$12;
                unsetCustomUserAttribute$lambda$12 = BrazeReactBridgeImpl.unsetCustomUserAttribute$lambda$12(Callback.this, key, (BrazeUser) obj);
                return unsetCustomUserAttribute$lambda$12;
            }
        });
    }

    public final void wipeData() {
        Braze.INSTANCE.wipeData(this.reactApplicationContext);
    }
}
