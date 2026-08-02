package com.braze;

import Ph.AbstractC1457j;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.P;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import bo.app.a1;
import bo.app.a4;
import bo.app.a9;
import bo.app.ah;
import bo.app.bc;
import bo.app.c5;
import bo.app.d0;
import bo.app.e2;
import bo.app.f0;
import bo.app.f5;
import bo.app.fb;
import bo.app.g;
import bo.app.g8;
import bo.app.g9;
import bo.app.gg;
import bo.app.h;
import bo.app.h9;
import bo.app.hc;
import bo.app.he;
import bo.app.i8;
import bo.app.j1;
import bo.app.j2;
import bo.app.k1;
import bo.app.k4;
import bo.app.kb;
import bo.app.m9;
import bo.app.n8;
import bo.app.ne;
import bo.app.o0;
import bo.app.o6;
import bo.app.p9;
import bo.app.q0;
import bo.app.qc;
import bo.app.r0;
import bo.app.r7;
import bo.app.s0;
import bo.app.t0;
import bo.app.t4;
import bo.app.tc;
import bo.app.u0;
import bo.app.u1;
import bo.app.u3;
import bo.app.u4;
import bo.app.u7;
import bo.app.v0;
import bo.app.v7;
import bo.app.w7;
import bo.app.wb;
import bo.app.x0;
import bo.app.x3;
import bo.app.xg;
import bo.app.y8;
import bo.app.yb;
import bo.app.z0;
import bo.app.z4;
import bo.app.z9;
import bo.app.zf;
import bo.app.zg;
import com.appsflyer.AppsFlyerProperties;
import com.braze.Braze;
import com.braze.configuration.BrazeConfig;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.configuration.RuntimeAppConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.DataStoreKey;
import com.braze.enums.GeofenceTransitionType;
import com.braze.events.BannerDismissedEvent;
import com.braze.events.BannersUpdatedEvent;
import com.braze.events.BrazePushEvent;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.IFireOnceEventSubscriber;
import com.braze.events.IValueCallback;
import com.braze.events.InAppMessageEvent;
import com.braze.events.SdkDataWipeEvent;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.images.IBrazeImageLoader;
import com.braze.location.IBrazeGeofenceApi;
import com.braze.models.Banner;
import com.braze.models.FeatureFlag;
import com.braze.models.IBrazeLocation;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.GeofenceDataStoreProvider;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import com.braze.support.StringUtils;
import com.braze.support.ValidationUtils;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.twilio.voice.EventKeys;
import java.io.File;
import java.io.FilenameFilter;
import java.math.BigDecimal;
import java.util.ArrayList;
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
import org.json.JSONObject;

@Metadata(d1 = {"\u0000Ü\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 ¤\u00022\u00020\u0001:\u0002¤\u0002B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u0013J\u0019\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b!\u0010 J#\u0010%\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u00182\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J?\u0010-\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u00182\b\u0010(\u001a\u0004\u0018\u00010\u00182\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010,\u001a\u00020+2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u00101\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b1\u00102J-\u00106\u001a\u00020\u000b2\b\u00103\u001a\u0004\u0018\u00010\u00182\b\u00104\u001a\u0004\u0018\u00010\u00182\b\u00105\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b6\u00107J#\u00109\u001a\u00020\u000b2\b\u00103\u001a\u0004\u0018\u00010\u00182\b\u00108\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u000bH\u0016¢\u0006\u0004\b;\u0010\u0013J\u000f\u0010<\u001a\u00020\u000bH\u0016¢\u0006\u0004\b<\u0010\u0013J\u000f\u0010=\u001a\u00020\u000bH\u0016¢\u0006\u0004\b=\u0010\u0013J\u0015\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>H\u0016¢\u0006\u0004\b@\u0010AJ\u0019\u0010C\u001a\u0004\u0018\u00010?2\u0006\u0010B\u001a\u00020\u0018H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\u0018H\u0016¢\u0006\u0004\bE\u0010FJ\u001d\u0010H\u001a\u00020\u000b2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00180>H\u0016¢\u0006\u0004\bH\u0010IJ-\u0010H\u001a\u00020\u000b2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00180>2\u000e\u0010L\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010JH\u0016¢\u0006\u0004\bH\u0010MJ\u0019\u0010O\u001a\u0004\u0018\u00010N2\u0006\u0010B\u001a\u00020\u0018H\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\u0018H\u0016¢\u0006\u0004\bR\u0010\u001bJ!\u0010T\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u00182\b\u0010S\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bT\u0010:J\u0017\u0010V\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u0018H\u0000¢\u0006\u0004\bU\u0010FJ\u000f\u0010W\u001a\u00020\u000bH\u0016¢\u0006\u0004\bW\u0010\u0013J\u001d\u0010[\u001a\u00020\u000b2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0XH\u0016¢\u0006\u0004\b[\u0010\\J\u001d\u0010^\u001a\u00020\u000b2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020]0XH\u0016¢\u0006\u0004\b^\u0010\\J\u001d\u0010`\u001a\u00020\u000b2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020_0XH\u0016¢\u0006\u0004\b`\u0010\\J\u001d\u0010a\u001a\u00020\u000b2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020K0XH\u0016¢\u0006\u0004\ba\u0010\\J\u001d\u0010c\u001a\u00020\u000b2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020b0XH\u0016¢\u0006\u0004\bc\u0010\\J\u001d\u0010e\u001a\u00020\u000b2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020d0XH\u0016¢\u0006\u0004\be\u0010\\J\u001d\u0010g\u001a\u00020\u000b2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020f0XH\u0016¢\u0006\u0004\bg\u0010\\J1\u0010k\u001a\u00020\u000b\"\u0004\b\u0000\u0010h2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000X2\f\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00000iH\u0016¢\u0006\u0004\bk\u0010lJ3\u0010m\u001a\u00020\u000b\"\u0004\b\u0000\u0010h2\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010X2\f\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00000iH\u0016¢\u0006\u0004\bm\u0010lJ\u001d\u0010p\u001a\u00020\u000b2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020n0XH\u0000¢\u0006\u0004\bo\u0010\\J\u001d\u0010r\u001a\u00020\u000b2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020n0XH\u0000¢\u0006\u0004\bq\u0010\\J#\u0010u\u001a\u00020\u000b2\b\u0010s\u001a\u0004\u0018\u00010\u00182\b\u0010t\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bu\u0010:J\u001d\u0010w\u001a\u00020\u000b2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020v0JH\u0016¢\u0006\u0004\bw\u0010xJ\u001d\u0010y\u001a\u00020\u000b2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00180JH\u0016¢\u0006\u0004\by\u0010xJ\u001b\u0010|\u001a\u0004\u0018\u00010{2\b\u0010z\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b|\u0010}J#\u0010\u0081\u0001\u001a\u00020\u000b2\u0006\u0010\u007f\u001a\u00020~2\u0007\u0010\u0080\u0001\u001a\u00020~H\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0011\u0010\u0083\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0083\u0001\u0010\u0013J&\u0010\u0086\u0001\u001a\u00020\u000b2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00182\u0007\u0010\u0085\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001a\u0010\u0089\u0001\u001a\u00020\u000b2\u0007\u0010\u0088\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u0089\u0001\u0010FJ)\u0010\u008f\u0001\u001a\u00020\u000b2\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00182\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u0001H\u0000¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001a\u0010\u0092\u0001\u001a\u00020\u000b2\u0007\u0010\u0090\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b\u0091\u0001\u0010\rJ$\u0010\u0095\u0001\u001a\u00020\u000b2\u0007\u0010\u0093\u0001\u001a\u00020\u00182\b\u0010s\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0005\b\u0094\u0001\u0010:J\u001c\u0010\u009a\u0001\u001a\u00020\u000b2\b\u0010\u0097\u0001\u001a\u00030\u0096\u0001H\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0011\u0010\u009c\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b\u009b\u0001\u0010\u0013J\u0011\u0010\u009e\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b\u009d\u0001\u0010\u0013J\u0019\u0010 \u0001\u001a\u00020\u000b2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0005\b\u009f\u0001\u00102J\u0011\u0010¢\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b¡\u0001\u0010\u0013J\u0011\u0010¤\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b£\u0001\u0010\u0013J\u0011\u0010¦\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b¥\u0001\u0010\u0013J\u001b\u0010ª\u0001\u001a\u00020\u000b2\u0007\u0010§\u0001\u001a\u00020YH\u0000¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u001b\u0010¬\u0001\u001a\u00020\u000b2\u0007\u0010§\u0001\u001a\u00020YH\u0000¢\u0006\u0006\b«\u0001\u0010©\u0001J&\u0010³\u0001\u001a\u00020\u000b2\b\u0010®\u0001\u001a\u00030\u00ad\u00012\b\u0010°\u0001\u001a\u00030¯\u0001H\u0000¢\u0006\u0006\b±\u0001\u0010²\u0001J$\u0010¸\u0001\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u00182\b\u0010µ\u0001\u001a\u00030´\u0001H\u0000¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u001c\u0010»\u0001\u001a\u00020\u000b2\b\u0010µ\u0001\u001a\u00030´\u0001H\u0000¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u0011\u0010½\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b¼\u0001\u0010\u0013J\u001a\u0010À\u0001\u001a\u00020\u000b2\u0007\u0010¾\u0001\u001a\u00020\u0018H\u0000¢\u0006\u0005\b¿\u0001\u0010FJ\u001a\u0010Ã\u0001\u001a\u00020\t2\u0007\u0010Á\u0001\u001a\u00020\u0018H\u0000¢\u0006\u0005\bÂ\u0001\u0010\u001bJ\u0080\u0001\u0010Ñ\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010h2\u0007\u0010Ä\u0001\u001a\u00028\u00002\u000e\u0010Æ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180Å\u00012\t\b\u0002\u0010Ç\u0001\u001a\u00020\t2\t\b\u0002\u0010È\u0001\u001a\u00020\t2\t\b\u0002\u0010É\u0001\u001a\u00020\t2,\u0010Î\u0001\u001a'\b\u0001\u0012\u0005\u0012\u00030Ë\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000Ì\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010Ê\u0001¢\u0006\u0003\bÍ\u0001H\u0001¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001JS\u0010Ô\u0001\u001a\u00020\u000b2\u000e\u0010Æ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180Å\u00012\t\b\u0002\u0010Ç\u0001\u001a\u00020\t2\t\b\u0002\u0010È\u0001\u001a\u00020\t2\t\b\u0002\u0010É\u0001\u001a\u00020\t2\u000e\u0010Î\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0Å\u0001H\u0001¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J\u001b\u0010Ø\u0001\u001a\u00030Õ\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0006\bÖ\u0001\u0010×\u0001R4\u0010Û\u0001\u001a\u00030Ù\u00012\b\u0010Ú\u0001\u001a\u00030Ù\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÛ\u0001\u0010Ü\u0001\u001a\u0006\bÝ\u0001\u0010Þ\u0001\"\u0006\bß\u0001\u0010à\u0001R\u0019\u0010á\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R\u001a\u0010ä\u0001\u001a\u00030ã\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u0019\u0010æ\u0001\u001a\u00020v8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R2\u0010è\u0001\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bè\u0001\u0010é\u0001\u0012\u0005\bî\u0001\u0010\u0013\u001a\u0006\bê\u0001\u0010ë\u0001\"\u0006\bì\u0001\u0010í\u0001R\u0019\u0010ï\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R1\u0010ò\u0001\u001a\u00030ñ\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\bò\u0001\u0010ó\u0001\u0012\u0005\bø\u0001\u0010\u0013\u001a\u0006\bô\u0001\u0010õ\u0001\"\u0006\bö\u0001\u0010÷\u0001R1\u0010ú\u0001\u001a\u00030ù\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bú\u0001\u0010û\u0001\u0012\u0005\b\u0080\u0002\u0010\u0013\u001a\u0006\bü\u0001\u0010ý\u0001\"\u0006\bþ\u0001\u0010ÿ\u0001R1\u0010\u0082\u0002\u001a\u00030\u0081\u00028\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b\u0082\u0002\u0010\u0083\u0002\u0012\u0005\b\u0088\u0002\u0010\u0013\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R1\u0010\u0089\u0002\u001a\u00030Õ\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b\u0089\u0002\u0010\u008a\u0002\u0012\u0005\b\u008f\u0002\u0010\u0013\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002\"\u0006\b\u008d\u0002\u0010\u008e\u0002R1\u0010\u0091\u0002\u001a\u00030\u0090\u00028\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b\u0091\u0002\u0010\u0092\u0002\u0012\u0005\b\u0097\u0002\u0010\u0013\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002\"\u0006\b\u0095\u0002\u0010\u0096\u0002R1\u0010\u0099\u0002\u001a\u00030\u0098\u00028\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b\u0099\u0002\u0010\u009a\u0002\u0012\u0005\b\u009f\u0002\u0010\u0013\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002\"\u0006\b\u009d\u0002\u0010\u009e\u0002R-\u0010£\u0002\u001a\u0004\u0018\u00010\u00182\t\u0010Ú\u0001\u001a\u0004\u0018\u00010\u00188V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b \u0002\u0010¡\u0002\"\u0005\b¢\u0002\u0010F¨\u0006¥\u0002"}, d2 = {"Lcom/braze/Braze;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lbo/app/g9;", "getDeviceDataProvider", "()Lbo/app/g9;", "", "isOffline", "", "setSyncPolicyOfflineStatus", "(Z)V", "", "throwable", "publishError", "(Ljava/lang/Throwable;)V", "verifyProperSdkSetup", "()V", "Lbo/app/ah;", "dependencyProvider", "setUserSpecificMemberVariablesAndStartDispatch", "(Lbo/app/ah;)V", "", "key", "isEphemeralEventKey", "(Ljava/lang/String;)Z", "safeCallFlushDelayedInitPushAnalyticsQueue", "Landroid/app/Activity;", "activity", "openSession", "(Landroid/app/Activity;)V", "closeSession", "eventName", "Lcom/braze/models/outgoing/BrazeProperties;", "properties", "logCustomEvent", "(Ljava/lang/String;Lcom/braze/models/outgoing/BrazeProperties;)V", "productId", AppsFlyerProperties.CURRENCY_CODE, "Ljava/math/BigDecimal;", "price", "", "quantity", "logPurchase", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILcom/braze/models/outgoing/BrazeProperties;)V", "Landroid/content/Intent;", "intent", "logPushNotificationOpened", "(Landroid/content/Intent;)V", "campaignId", "actionId", "actionType", "logPushNotificationActionClicked", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "pageId", "logPushStoryPageClicked", "(Ljava/lang/String;Ljava/lang/String;)V", "requestContentCardsRefresh", "requestContentCardsRefreshFromCache", "refreshFeatureFlags", "", "Lcom/braze/models/FeatureFlag;", "getAllFeatureFlags", "()Ljava/util/List;", StackTraceHelper.ID_KEY, "getFeatureFlag", "(Ljava/lang/String;)Lcom/braze/models/FeatureFlag;", "logFeatureFlagImpression", "(Ljava/lang/String;)V", "ids", "requestBannersRefresh", "(Ljava/util/List;)V", "Lcom/braze/events/IValueCallback;", "Lcom/braze/events/BannersUpdatedEvent;", "completionCallback", "(Ljava/util/List;Lcom/braze/events/IValueCallback;)V", "Lcom/braze/models/Banner;", "getBanner", "(Ljava/lang/String;)Lcom/braze/models/Banner;", "placementId", "logBannerImpression", "buttonId", "logBannerClick", "dismissBanner$android_sdk_base_release", "dismissBanner", "requestImmediateDataFlush", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/InAppMessageEvent;", "subscriber", "subscribeToNewInAppMessages", "(Lcom/braze/events/IEventSubscriber;)V", "Lcom/braze/events/ContentCardsUpdatedEvent;", "subscribeToContentCardsUpdates", "Lcom/braze/events/FeatureFlagsUpdatedEvent;", "subscribeToFeatureFlagsUpdates", "subscribeToBannersUpdates", "Lcom/braze/events/BrazeSdkAuthenticationErrorEvent;", "subscribeToSdkAuthenticationFailures", "Lcom/braze/events/BrazePushEvent;", "subscribeToPushNotificationEvents", "Lcom/braze/events/BrazeUserChangeEvent;", "subscribeToChangeUserEvents", "T", "Ljava/lang/Class;", "eventClass", "addSingleSynchronousSubscription", "(Lcom/braze/events/IEventSubscriber;Ljava/lang/Class;)V", "removeSingleSubscription", "Lcom/braze/events/BannerDismissedEvent;", "subscribeToBannersDismissedEvent$android_sdk_base_release", "subscribeToBannersDismissedEvent", "unsubscribeFromBannersDismissedEvent$android_sdk_base_release", "unsubscribeFromBannersDismissedEvent", "userId", "sdkAuthSignature", "changeUser", "Lcom/braze/BrazeUser;", "getCurrentUser", "(Lcom/braze/events/IValueCallback;)V", "getDeviceIdAsync", "inAppMessageString", "Lcom/braze/models/inappmessage/IInAppMessage;", "deserializeInAppMessageString", "(Ljava/lang/String;)Lcom/braze/models/inappmessage/IInAppMessage;", "", "latitude", "longitude", "requestGeofences", "(DD)V", "requestLocationInitialization", "googleAdvertisingId", "isLimitAdTrackingEnabled", "setGoogleAdvertisingId", "(Ljava/lang/String;Z)V", "signature", "setSdkAuthenticationSignature", "geofenceId", "Lcom/braze/enums/GeofenceTransitionType;", "transitionType", "recordGeofenceTransition$android_sdk_base_release", "(Ljava/lang/String;Lcom/braze/enums/GeofenceTransitionType;)V", "recordGeofenceTransition", "ignoreRateLimit", "requestGeofenceRefresh$android_sdk_base_release", "requestGeofenceRefresh", "serializedCardJson", "addSerializedCardJsonToStorage$android_sdk_base_release", "addSerializedCardJsonToStorage", "Lcom/braze/models/IBrazeLocation;", "location", "logLocationRecordedEventFromLocationUpdate$android_sdk_base_release", "(Lcom/braze/models/IBrazeLocation;)V", "logLocationRecordedEventFromLocationUpdate", "requestGeofencesInitialization$android_sdk_base_release", "requestGeofencesInitialization", "requestSingleLocationUpdate$android_sdk_base_release", "requestSingleLocationUpdate", "handleInAppMessageTestPush$android_sdk_base_release", "handleInAppMessageTestPush", "handleInternalBannerRefresh$android_sdk_base_release", "handleInternalBannerRefresh", "deleteRegisteredGeofenceCache$android_sdk_base_release", "deleteRegisteredGeofenceCache", "applyPendingRuntimeConfiguration$android_sdk_base_release", "applyPendingRuntimeConfiguration", "event", "retryInAppMessage$android_sdk_base_release", "(Lcom/braze/events/InAppMessageEvent;)V", "retryInAppMessage", "reenqueueInAppMessage$android_sdk_base_release", "reenqueueInAppMessage", "Lcom/braze/enums/BrazePushEventType;", "pushActionType", "Lcom/braze/models/push/BrazeNotificationPayload;", EventKeys.PAYLOAD, "publishBrazePushAction$android_sdk_base_release", "(Lcom/braze/enums/BrazePushEventType;Lcom/braze/models/push/BrazeNotificationPayload;)V", "publishBrazePushAction", "", "timeInMs", "logPushDelivery$android_sdk_base_release", "(Ljava/lang/String;J)V", "logPushDelivery", "schedulePushDelivery$android_sdk_base_release", "(J)V", "schedulePushDelivery", "performPushDeliveryFlush$android_sdk_base_release", "performPushDeliveryFlush", "campaign", "logPushMaxCampaign$android_sdk_base_release", "logPushMaxCampaign", "pushId", "validateAndStorePushId$android_sdk_base_release", "validateAndStorePushId", "defaultValueOnException", "Lkotlin/Function0;", "errorLog", "earlyReturnIfDisabled", "earlyReturnIfDelayedInitEnabled", "earlyReturnIfUdmUninitialized", "Lkotlin/Function2;", "LPh/P;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "runGuardedForResult$android_sdk_base_release", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;ZZZLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "runGuardedForResult", "runGuardedAsync$android_sdk_base_release", "(Lkotlin/jvm/functions/Function0;ZZZLkotlin/jvm/functions/Function0;)V", "runGuardedAsync", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProviderSafe$android_sdk_base_release", "(Landroid/content/Context;)Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProviderSafe", "Lcom/braze/images/IBrazeImageLoader;", EventKeys.VALUE_KEY, "imageLoader", "Lcom/braze/images/IBrazeImageLoader;", "getImageLoader", "()Lcom/braze/images/IBrazeImageLoader;", "setImageLoader", "(Lcom/braze/images/IBrazeImageLoader;)V", "applicationContext", "Landroid/content/Context;", "Lbo/app/fb;", "offlineUserStorageProvider", "Lbo/app/fb;", "brazeUser", "Lcom/braze/BrazeUser;", "isApiKeyPresent", "Ljava/lang/Boolean;", "isApiKeyPresent$android_sdk_base_release", "()Ljava/lang/Boolean;", "setApiKeyPresent$android_sdk_base_release", "(Ljava/lang/Boolean;)V", "isApiKeyPresent$android_sdk_base_release$annotations", "isInstanceStopped", "Z", "Lbo/app/h9;", "deviceIdProvider", "Lbo/app/h9;", "getDeviceIdProvider$android_sdk_base_release", "()Lbo/app/h9;", "setDeviceIdProvider$android_sdk_base_release", "(Lbo/app/h9;)V", "getDeviceIdProvider$android_sdk_base_release$annotations", "Lbo/app/m9;", "externalIEventMessenger", "Lbo/app/m9;", "getExternalIEventMessenger$android_sdk_base_release", "()Lbo/app/m9;", "setExternalIEventMessenger$android_sdk_base_release", "(Lbo/app/m9;)V", "getExternalIEventMessenger$android_sdk_base_release$annotations", "Lbo/app/p9;", "registrationDataProvider", "Lbo/app/p9;", "getRegistrationDataProvider$android_sdk_base_release", "()Lbo/app/p9;", "setRegistrationDataProvider$android_sdk_base_release", "(Lbo/app/p9;)V", "getRegistrationDataProvider$android_sdk_base_release$annotations", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProvider$android_sdk_base_release", "()Lcom/braze/configuration/BrazeConfigurationProvider;", "setConfigurationProvider$android_sdk_base_release", "(Lcom/braze/configuration/BrazeConfigurationProvider;)V", "getConfigurationProvider$android_sdk_base_release$annotations", "Lbo/app/hc;", "pushDeliveryManager", "Lbo/app/hc;", "getPushDeliveryManager$android_sdk_base_release", "()Lbo/app/hc;", "setPushDeliveryManager$android_sdk_base_release", "(Lbo/app/hc;)V", "getPushDeliveryManager$android_sdk_base_release$annotations", "Lbo/app/z9;", "udm", "Lbo/app/z9;", "getUdm$android_sdk_base_release", "()Lbo/app/z9;", "setUdm$android_sdk_base_release", "(Lbo/app/z9;)V", "getUdm$android_sdk_base_release$annotations", "getRegisteredPushToken", "()Ljava/lang/String;", "setRegisteredPushToken", "registeredPushToken", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Braze {
    private static boolean areOutboundNetworkRequestsOffline;
    private static IBrazeNotificationFactory customBrazeNotificationFactory;
    private static u4 delayedInitializationProvider;
    private static g9 deviceDataProvider;
    private static IBrazeEndpointProvider endpointProvider;
    private static volatile Braze instance;
    private static he sdkEnablementProvider;
    private static boolean shouldMockNetworkRequestsAndDropEvents;
    private static m9 staticExternalIEventMessenger;
    private Context applicationContext;
    private BrazeUser brazeUser;
    public BrazeConfigurationProvider configurationProvider;
    public h9 deviceIdProvider;
    private m9 externalIEventMessenger;
    private IBrazeImageLoader imageLoader;
    private Boolean isApiKeyPresent;
    private boolean isInstanceStopped;
    private fb offlineUserStorageProvider;
    public hc pushDeliveryManager;
    public p9 registrationDataProvider;
    public z9 udm;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ReentrantLock brazeClassLock = new ReentrantLock();
    private static final Set<String> KNOWN_APP_CRAWLER_DEVICE_MODELS = SetsKt.setOf("calypso appcrawler");
    private static final Set<String> NECESSARY_BRAZE_SDK_PERMISSIONS = SetsKt.setOf((Object[]) new String[]{"android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"});
    private static final ReentrantLock endpointProviderLock = new ReentrantLock();
    private static boolean shouldRequestFrameworkListenToNetworkUpdates = true;
    private static final List<BrazeConfig> pendingConfigurations = new ArrayList();
    private static final BrazeConfig clearConfigSentinel = new BrazeConfig.Builder().build();

    @Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0007¢\u0006\u0004\b$\u0010\u000fJ\u0017\u0010%\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b%\u0010\bJ\u0017\u0010&\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b&\u0010\bJ\u0017\u0010'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b'\u0010\bJ\u0017\u0010(\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b(\u0010\bJ\u0019\u0010,\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0004\b*\u0010+J\u0017\u00100\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b.\u0010/J\u001f\u00107\u001a\u00020\u00062\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b5\u00106J\u0017\u0010;\u001a\u00020\u00062\u0006\u00108\u001a\u00020\rH\u0001¢\u0006\u0004\b9\u0010:R*\u0010<\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b<\u0010=\u0012\u0004\bB\u0010\u0003\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR*\u0010C\u001a\u0004\u0018\u00010-8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bC\u0010D\u0012\u0004\bH\u0010\u0003\u001a\u0004\b.\u0010E\"\u0004\bF\u0010GR*\u0010J\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bJ\u0010K\u0012\u0004\bP\u0010\u0003\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR*\u0010R\u001a\u0004\u0018\u00010Q8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bR\u0010S\u0012\u0004\bX\u0010\u0003\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR*\u0010]\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\\\u0010\u0003\u001a\u0004\bZ\u0010\u000f\"\u0004\b[\u0010:R\u001a\u0010^\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b_\u0010\u0003\u001a\u0004\b^\u0010\u000fR\u001a\u0010`\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\ba\u0010\u0003\u001a\u0004\b`\u0010\u000fR\u001a\u0010b\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\bc\u0010\u0003\u001a\u0004\bb\u0010\u000fR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00150g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00150g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010iR\u0018\u0010k\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010m\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010fR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010nR\u0016\u0010o\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010q\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010pR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020 0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010u\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010v¨\u0006w"}, d2 = {"Lcom/braze/Braze$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "clearSharedPreferencesData", "(Landroid/content/Context;)V", "clearDataStoreData", "Lbo/app/he;", "getSdkEnablementProvider", "(Landroid/content/Context;)Lbo/app/he;", "", "shouldAllowSingletonInitialization", "()Z", "Lcom/braze/Braze;", "getInstance", "(Landroid/content/Context;)Lcom/braze/Braze;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "", "getConfiguredApiKey", "(Lcom/braze/configuration/BrazeConfigurationProvider;)Ljava/lang/String;", "Lcom/braze/IBrazeEndpointProvider;", "endpointProvider", "setEndpointProvider", "(Lcom/braze/IBrazeEndpointProvider;)V", "Landroid/net/Uri;", "brazeEndpoint", "getApiEndpoint", "(Landroid/net/Uri;)Landroid/net/Uri;", "Lcom/braze/configuration/BrazeConfig;", "config", "configure", "(Landroid/content/Context;Lcom/braze/configuration/BrazeConfig;)Z", "enableMockNetworkRequestsAndDropEventsMode", "disableSdk", "enableSdk", "disableDelayedInitialization", "wipeData", "configuredCustomEndpoint", "setConfiguredCustomEndpoint$android_sdk_base_release", "(Ljava/lang/String;)V", "setConfiguredCustomEndpoint", "Lbo/app/u4;", "getDelayedInitializationProvider$android_sdk_base_release", "(Landroid/content/Context;)Lbo/app/u4;", "getDelayedInitializationProvider", "Landroid/content/Intent;", "intent", "Lbo/app/a9;", "brazeManager", "requestTriggersIfInAppMessageTestPush$android_sdk_base_release", "(Landroid/content/Intent;Lbo/app/a9;)V", "requestTriggersIfInAppMessageTestPush", "clearStorage", "stopInstance$android_sdk_base_release", "(Z)V", "stopInstance", "sdkEnablementProvider", "Lbo/app/he;", "getSdkEnablementProvider$android_sdk_base_release", "()Lbo/app/he;", "setSdkEnablementProvider$android_sdk_base_release", "(Lbo/app/he;)V", "getSdkEnablementProvider$android_sdk_base_release$annotations", "delayedInitializationProvider", "Lbo/app/u4;", "()Lbo/app/u4;", "setDelayedInitializationProvider$android_sdk_base_release", "(Lbo/app/u4;)V", "getDelayedInitializationProvider$android_sdk_base_release$annotations", "Lcom/braze/IBrazeNotificationFactory;", "customBrazeNotificationFactory", "Lcom/braze/IBrazeNotificationFactory;", "getCustomBrazeNotificationFactory", "()Lcom/braze/IBrazeNotificationFactory;", "setCustomBrazeNotificationFactory", "(Lcom/braze/IBrazeNotificationFactory;)V", "getCustomBrazeNotificationFactory$annotations", "Lbo/app/m9;", "staticExternalIEventMessenger", "Lbo/app/m9;", "getStaticExternalIEventMessenger$android_sdk_base_release", "()Lbo/app/m9;", "setStaticExternalIEventMessenger$android_sdk_base_release", "(Lbo/app/m9;)V", "getStaticExternalIEventMessenger$android_sdk_base_release$annotations", "isOffline", "getOutboundNetworkRequestsOffline", "setOutboundNetworkRequestsOffline", "getOutboundNetworkRequestsOffline$annotations", "outboundNetworkRequestsOffline", "isDisabled", "isDisabled$annotations", "isDelayedInitializationEnabled", "isDelayedInitializationEnabled$annotations", "isSdkDisabledOrDelayed", "isSdkDisabledOrDelayed$annotations", "Ljava/util/concurrent/locks/ReentrantLock;", "brazeClassLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "KNOWN_APP_CRAWLER_DEVICE_MODELS", "Ljava/util/Set;", "NECESSARY_BRAZE_SDK_PERMISSIONS", "instance", "Lcom/braze/Braze;", "endpointProviderLock", "Lcom/braze/IBrazeEndpointProvider;", "shouldMockNetworkRequestsAndDropEvents", "Z", "areOutboundNetworkRequestsOffline", "", "pendingConfigurations", "Ljava/util/List;", "clearConfigSentinel", "Lcom/braze/configuration/BrazeConfig;", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDelayedInitializationEnabled_$lambda$0() {
            return "DelayedInitializationProvider was null. Returning delayed initialization as disabled.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDelayedInitializationEnabled_$lambda$1() {
            return "Delayed initialization mode is enabled. Actions will not be performed on the SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDisabled_$lambda$0() {
            return "SDK enablement provider was null. Returning SDK as enabled.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDisabled_$lambda$1() {
            return "API key not present. Actions will not be performed on the SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDisabled_$lambda$2() {
            return "SDK is disabled. Actions will not be performed on the SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _set_outboundNetworkRequestsOffline_$lambda$0(boolean z10) {
            return "Braze SDK outbound network requests are now " + (z10 ? "disabled" : ViewProps.ENABLED);
        }

        private final void clearDataStoreData(Context context) {
            try {
                DataStoreProvider.INSTANCE.shutdownAllDataStores(context);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.h3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String clearDataStoreData$lambda$0;
                        clearDataStoreData$lambda$0 = Braze.Companion.clearDataStoreData$lambda$0();
                        return clearDataStoreData$lambda$0;
                    }
                }, 4, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String clearDataStoreData$lambda$0() {
            return "Failed to delete DataStore data for the Braze SDK.";
        }

        private final void clearSharedPreferencesData(Context context) {
            File[] listFiles;
            try {
                File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles(new FilenameFilter() { // from class: H3.z3
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str) {
                        boolean clearSharedPreferencesData$lambda$0;
                        clearSharedPreferencesData$lambda$0 = Braze.Companion.clearSharedPreferencesData$lambda$0(file2, str);
                        return clearSharedPreferencesData$lambda$0;
                    }
                })) != null) {
                    for (final File file2 : listFiles) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: H3.A3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String clearSharedPreferencesData$lambda$1$0;
                                clearSharedPreferencesData$lambda$1$0 = Braze.Companion.clearSharedPreferencesData$lambda$1$0(file2);
                                return clearSharedPreferencesData$lambda$1$0;
                            }
                        }, 6, (Object) null);
                        Intrinsics.checkNotNull(file2);
                        BrazeFileUtils.deleteSharedPreferencesFile(context, file2);
                    }
                }
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.B3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String clearSharedPreferencesData$lambda$2;
                        clearSharedPreferencesData$lambda$2 = Braze.Companion.clearSharedPreferencesData$lambda$2();
                        return clearSharedPreferencesData$lambda$2;
                    }
                }, 4, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean clearSharedPreferencesData$lambda$0(File file, String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (!StringsKt.startsWith$default(name, "persistent", false, 2, (Object) null)) {
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
        public static final String clearSharedPreferencesData$lambda$1$0(File file) {
            return "Deleting shared prefs file at: " + file.getAbsolutePath();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String clearSharedPreferencesData$lambda$2() {
            return "Failed to delete shared preference data for the Braze SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String configure$lambda$0(BrazeConfig brazeConfig) {
            return "Braze.configure() called with configuration: " + brazeConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String configure$lambda$1$0() {
            return "Braze.configure() cannot be called while the singleton is still live.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String configure$lambda$1$1() {
            return "Braze.configure() called with a null config; Clearing all configuration values.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableDelayedInitialization$lambda$0() {
            return "Disabling delayed initialization.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableDelayedInitialization$lambda$1() {
            return "Enabling all network requests";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableSdk$lambda$0() {
            return "Stopping the SDK instance.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableSdk$lambda$1() {
            return "Disabling all network requests";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableSdk$lambda$2() {
            return "disableSdk has finished";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableMockNetworkRequestsAndDropEventsMode$lambda$0$0() {
            return "Braze network requests already being mocked. Note that events dispatched in this mode are dropped.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableMockNetworkRequestsAndDropEventsMode$lambda$0$1() {
            return "Braze network requests will be mocked. Events dispatchedin this mode will be dropped.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableMockNetworkRequestsAndDropEventsMode$lambda$1() {
            return "Attempt to enable mocking Braze network requests had no effect since getInstance() has already been called.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableSdk$lambda$0() {
            return "Setting SDK to enabled.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableSdk$lambda$1() {
            return "Enabling all network requests";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getApiEndpoint$lambda$0$0$0() {
            return "Caught exception trying to get a Braze API endpoint from the BrazeEndpointProvider. Using the original URI";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConfiguredApiKey$lambda$0() {
            return "Caught exception while retrieving API key.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInstance$lambda$0$0() {
            return "Created external messenger " + Braze.INSTANCE.getStaticExternalIEventMessenger$android_sdk_base_release();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final he getSdkEnablementProvider(Context context) {
            he sdkEnablementProvider$android_sdk_base_release = getSdkEnablementProvider$android_sdk_base_release();
            if (sdkEnablementProvider$android_sdk_base_release != null) {
                return sdkEnablementProvider$android_sdk_base_release;
            }
            he heVar = new he(context);
            setSdkEnablementProvider$android_sdk_base_release(heVar);
            return heVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String requestTriggersIfInAppMessageTestPush$lambda$0() {
            return "Push contained key for fetching test triggers, fetching triggers.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Uri setConfiguredCustomEndpoint$lambda$0$0(String str, Uri brazeEndpoint) {
            String authority;
            Intrinsics.checkNotNullParameter(brazeEndpoint, "brazeEndpoint");
            Uri parse = str != null ? Uri.parse(str) : null;
            String scheme = parse != null ? parse.getScheme() : null;
            boolean z10 = scheme == null || StringsKt.isBlank(scheme) || (authority = parse.getAuthority()) == null || StringsKt.isBlank(authority);
            Uri.Builder builder = new Uri.Builder();
            if (z10) {
                builder.scheme(brazeEndpoint.getScheme());
            } else if (parse.getScheme() != null) {
                builder.scheme(parse.getScheme());
            } else {
                builder.scheme(brazeEndpoint.getScheme());
            }
            if (z10) {
                builder.encodedAuthority(str);
            } else if (parse.getEncodedAuthority() != null) {
                builder.encodedAuthority(parse.getEncodedAuthority());
            } else {
                builder.encodedAuthority(brazeEndpoint.getEncodedAuthority());
            }
            if (z10) {
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
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: H3.e3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String shouldAllowSingletonInitialization$lambda$0;
                        shouldAllowSingletonInitialization$lambda$0 = Braze.Companion.shouldAllowSingletonInitialization$lambda$0();
                        return shouldAllowSingletonInitialization$lambda$0;
                    }
                }, 6, (Object) null);
                return true;
            }
            if (braze.isInstanceStopped) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: H3.f3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String shouldAllowSingletonInitialization$lambda$1;
                        shouldAllowSingletonInitialization$lambda$1 = Braze.Companion.shouldAllowSingletonInitialization$lambda$1();
                        return shouldAllowSingletonInitialization$lambda$1;
                    }
                }, 7, (Object) null);
                return true;
            }
            if (!Intrinsics.areEqual(Boolean.FALSE, braze.getIsApiKeyPresent())) {
                return false;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: H3.g3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String shouldAllowSingletonInitialization$lambda$2;
                    shouldAllowSingletonInitialization$lambda$2 = Braze.Companion.shouldAllowSingletonInitialization$lambda$2();
                    return shouldAllowSingletonInitialization$lambda$2;
                }
            }, 7, (Object) null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String shouldAllowSingletonInitialization$lambda$0() {
            return "The instance is null. Allowing instance initialization";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String shouldAllowSingletonInitialization$lambda$1() {
            return "The instance was stopped. Allowing instance initialization";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String shouldAllowSingletonInitialization$lambda$2() {
            return "No API key was found previously. Allowing instance initialization";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$0() {
            return "Shutting down all queued work on the Braze SDK";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$1$0() {
            return "Sending sdk data wipe event to external subscribers";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$1$1() {
            return "Shutting down the singleton work queue";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$2() {
            return "Failed to shutdown queued work on the Braze SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String wipeData$lambda$0() {
            return "Failed to delete data from the internal storage cache.";
        }

        @JvmStatic
        public final boolean configure(Context context, final BrazeConfig config) {
            Intrinsics.checkNotNullParameter(context, "context");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f29471I;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: H3.a3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String configure$lambda$0;
                    configure$lambda$0 = Braze.Companion.configure$lambda$0(BrazeConfig.this);
                    return configure$lambda$0;
                }
            }, 6, (Object) null);
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze braze = Braze.instance;
                if (braze != null && !braze.isInstanceStopped && Intrinsics.areEqual(Boolean.TRUE, braze.getIsApiKeyPresent())) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) Braze.INSTANCE, priority, (Throwable) null, false, new Function0() { // from class: H3.b3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String configure$lambda$1$0;
                            configure$lambda$1$0 = Braze.Companion.configure$lambda$1$0();
                            return configure$lambda$1$0;
                        }
                    }, 6, (Object) null);
                    reentrantLock.unlock();
                    return false;
                }
                if (config != null) {
                    Braze.pendingConfigurations.add(config);
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) Braze.INSTANCE, priority, (Throwable) null, false, new Function0() { // from class: H3.c3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String configure$lambda$1$1;
                            configure$lambda$1$1 = Braze.Companion.configure$lambda$1$1();
                            return configure$lambda$1$1;
                        }
                    }, 6, (Object) null);
                    Braze.pendingConfigurations.add(Braze.clearConfigSentinel);
                }
                reentrantLock.unlock();
                return true;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        @JvmStatic
        public final void disableDelayedInitialization(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f29473W;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: H3.j3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String disableDelayedInitialization$lambda$0;
                    disableDelayedInitialization$lambda$0 = Braze.Companion.disableDelayedInitialization$lambda$0();
                    return disableDelayedInitialization$lambda$0;
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: H3.k3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String disableDelayedInitialization$lambda$1;
                    disableDelayedInitialization$lambda$1 = Braze.Companion.disableDelayedInitialization$lambda$1();
                    return disableDelayedInitialization$lambda$1;
                }
            }, 6, (Object) null);
            setOutboundNetworkRequestsOffline(false);
            u4 delayedInitializationProvider$android_sdk_base_release = getDelayedInitializationProvider$android_sdk_base_release(context);
            delayedInitializationProvider$android_sdk_base_release.b(false);
            delayedInitializationProvider$android_sdk_base_release.f26103a.writeData(DataStoreKey.DELAYED_INIT_SET_DURING_RUNTIME_FLAG, Boolean.TRUE);
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
            BrazeLogger.Priority priority = BrazeLogger.Priority.f29473W;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: H3.w3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String disableSdk$lambda$0;
                    disableSdk$lambda$0 = Braze.Companion.disableSdk$lambda$0();
                    return disableSdk$lambda$0;
                }
            }, 6, (Object) null);
            stopInstance$android_sdk_base_release(false);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: H3.x3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String disableSdk$lambda$1;
                    disableSdk$lambda$1 = Braze.Companion.disableSdk$lambda$1();
                    return disableSdk$lambda$1;
                }
            }, 6, (Object) null);
            setOutboundNetworkRequestsOffline(true);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: H3.y3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String disableSdk$lambda$2;
                    disableSdk$lambda$2 = Braze.Companion.disableSdk$lambda$2();
                    return disableSdk$lambda$2;
                }
            }, 6, (Object) null);
        }

        @JvmStatic
        public final boolean enableMockNetworkRequestsAndDropEventsMode() {
            if (Braze.instance == null) {
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    if (Braze.instance == null) {
                        if (Braze.shouldMockNetworkRequestsAndDropEvents) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: H3.l3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String enableMockNetworkRequestsAndDropEventsMode$lambda$0$0;
                                    enableMockNetworkRequestsAndDropEventsMode$lambda$0$0 = Braze.Companion.enableMockNetworkRequestsAndDropEventsMode$lambda$0$0();
                                    return enableMockNetworkRequestsAndDropEventsMode$lambda$0$0;
                                }
                            }, 6, (Object) null);
                        } else {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: H3.m3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String enableMockNetworkRequestsAndDropEventsMode$lambda$0$1;
                                    enableMockNetworkRequestsAndDropEventsMode$lambda$0$1 = Braze.Companion.enableMockNetworkRequestsAndDropEventsMode$lambda$0$1();
                                    return enableMockNetworkRequestsAndDropEventsMode$lambda$0$1;
                                }
                            }, 6, (Object) null);
                            Braze.shouldMockNetworkRequestsAndDropEvents = true;
                        }
                        reentrantLock.unlock();
                        return true;
                    }
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.n3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String enableMockNetworkRequestsAndDropEventsMode$lambda$1;
                    enableMockNetworkRequestsAndDropEventsMode$lambda$1 = Braze.Companion.enableMockNetworkRequestsAndDropEventsMode$lambda$1();
                    return enableMockNetworkRequestsAndDropEventsMode$lambda$1;
                }
            }, 6, (Object) null);
            return false;
        }

        @JvmStatic
        public final void enableSdk(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f29473W;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: H3.o3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String enableSdk$lambda$0;
                    enableSdk$lambda$0 = Braze.Companion.enableSdk$lambda$0();
                    return enableSdk$lambda$0;
                }
            }, 6, (Object) null);
            getSdkEnablementProvider(context).b(false);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: H3.v3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String enableSdk$lambda$1;
                    enableSdk$lambda$1 = Braze.Companion.enableSdk$lambda$1();
                    return enableSdk$lambda$1;
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
                            reentrantLock.unlock();
                            return apiEndpoint;
                        }
                    } catch (Exception e10) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.t3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String apiEndpoint$lambda$0$0$0;
                                apiEndpoint$lambda$0$0$0 = Braze.Companion.getApiEndpoint$lambda$0$0$0();
                                return apiEndpoint$lambda$0$0$0;
                            }
                        }, 4, (Object) null);
                    }
                }
                reentrantLock.unlock();
                return brazeEndpoint;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        @JvmStatic
        public final String getConfiguredApiKey(BrazeConfigurationProvider configurationProvider) {
            Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
            try {
                return configurationProvider.getBrazeApiKey().f25307a;
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: H3.i3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String configuredApiKey$lambda$0;
                        configuredApiKey$lambda$0 = Braze.Companion.getConfiguredApiKey$lambda$0();
                        return configuredApiKey$lambda$0;
                    }
                }, 4, (Object) null);
                return null;
            }
        }

        public final IBrazeNotificationFactory getCustomBrazeNotificationFactory() {
            return Braze.customBrazeNotificationFactory;
        }

        public final u4 getDelayedInitializationProvider$android_sdk_base_release() {
            return Braze.delayedInitializationProvider;
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
                            companion.setStaticExternalIEventMessenger$android_sdk_base_release(new r7(new he(context), new u4(context), false));
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) companion, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: H3.S2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String instance$lambda$0$0;
                                    instance$lambda$0$0 = Braze.Companion.getInstance$lambda$0$0();
                                    return instance$lambda$0$0;
                                }
                            }, 6, (Object) null);
                        }
                        Braze braze = new Braze(context);
                        braze.isInstanceStopped = false;
                        Braze.instance = braze;
                        reentrantLock.unlock();
                        return braze;
                    }
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            Braze braze2 = Braze.instance;
            Intrinsics.checkNotNull(braze2, "null cannot be cast to non-null type com.braze.Braze");
            return braze2;
        }

        public final boolean getOutboundNetworkRequestsOffline() {
            return Braze.areOutboundNetworkRequestsOffline;
        }

        public final he getSdkEnablementProvider$android_sdk_base_release() {
            return Braze.sdkEnablementProvider;
        }

        public final m9 getStaticExternalIEventMessenger$android_sdk_base_release() {
            return Braze.staticExternalIEventMessenger;
        }

        public final boolean isDelayedInitializationEnabled() {
            u4 delayedInitializationProvider$android_sdk_base_release = getDelayedInitializationProvider$android_sdk_base_release();
            if (delayedInitializationProvider$android_sdk_base_release == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: H3.Y2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _get_isDelayedInitializationEnabled_$lambda$0;
                        _get_isDelayedInitializationEnabled_$lambda$0 = Braze.Companion._get_isDelayedInitializationEnabled_$lambda$0();
                        return _get_isDelayedInitializationEnabled_$lambda$0;
                    }
                }, 7, (Object) null);
                return false;
            }
            boolean c10 = delayedInitializationProvider$android_sdk_base_release.c();
            if (c10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.Z2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _get_isDelayedInitializationEnabled_$lambda$1;
                        _get_isDelayedInitializationEnabled_$lambda$1 = Braze.Companion._get_isDelayedInitializationEnabled_$lambda$1();
                        return _get_isDelayedInitializationEnabled_$lambda$1;
                    }
                }, 6, (Object) null);
            }
            return c10;
        }

        public final boolean isDisabled() {
            he sdkEnablementProvider$android_sdk_base_release = getSdkEnablementProvider$android_sdk_base_release();
            if (sdkEnablementProvider$android_sdk_base_release == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: H3.p3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _get_isDisabled_$lambda$0;
                        _get_isDisabled_$lambda$0 = Braze.Companion._get_isDisabled_$lambda$0();
                        return _get_isDisabled_$lambda$0;
                    }
                }, 7, (Object) null);
                return false;
            }
            Braze braze = Braze.instance;
            if (braze != null && Intrinsics.areEqual(Boolean.FALSE, braze.getIsApiKeyPresent())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.q3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _get_isDisabled_$lambda$1;
                        _get_isDisabled_$lambda$1 = Braze.Companion._get_isDisabled_$lambda$1();
                        return _get_isDisabled_$lambda$1;
                    }
                }, 6, (Object) null);
                return true;
            }
            boolean a10 = sdkEnablementProvider$android_sdk_base_release.a();
            if (a10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.r3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _get_isDisabled_$lambda$2;
                        _get_isDisabled_$lambda$2 = Braze.Companion._get_isDisabled_$lambda$2();
                        return _get_isDisabled_$lambda$2;
                    }
                }, 6, (Object) null);
            }
            return a10;
        }

        public final boolean isSdkDisabledOrDelayed() {
            return isDisabled() || isDelayedInitializationEnabled();
        }

        public final void requestTriggersIfInAppMessageTestPush$android_sdk_base_release(Intent intent, a9 brazeManager) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
            String stringExtra = intent.getStringExtra("ab_push_fetch_test_triggers_key");
            if (stringExtra == null || !Intrinsics.areEqual(stringExtra, "true")) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: H3.u3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestTriggersIfInAppMessageTestPush$lambda$0;
                    requestTriggersIfInAppMessageTestPush$lambda$0 = Braze.Companion.requestTriggersIfInAppMessageTestPush$lambda$0();
                    return requestTriggersIfInAppMessageTestPush$lambda$0;
                }
            }, 6, (Object) null);
            kb kbVar = new kb();
            kbVar.f25665b = Boolean.TRUE;
            ((e2) brazeManager).a(kbVar);
        }

        public final void setConfiguredCustomEndpoint$android_sdk_base_release(final String configuredCustomEndpoint) {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.INSTANCE.setEndpointProvider(new IBrazeEndpointProvider() { // from class: H3.s3
                    @Override // com.braze.IBrazeEndpointProvider
                    public final Uri getApiEndpoint(Uri uri) {
                        Uri configuredCustomEndpoint$lambda$0$0;
                        configuredCustomEndpoint$lambda$0$0 = Braze.Companion.setConfiguredCustomEndpoint$lambda$0$0(configuredCustomEndpoint, uri);
                        return configuredCustomEndpoint$lambda$0$0;
                    }
                });
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void setDelayedInitializationProvider$android_sdk_base_release(u4 u4Var) {
            Braze.delayedInitializationProvider = u4Var;
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

        public final void setOutboundNetworkRequestsOffline(final boolean z10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: H3.X2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _set_outboundNetworkRequestsOffline_$lambda$0;
                    _set_outboundNetworkRequestsOffline_$lambda$0 = Braze.Companion._set_outboundNetworkRequestsOffline_$lambda$0(z10);
                    return _set_outboundNetworkRequestsOffline_$lambda$0;
                }
            }, 6, (Object) null);
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze.areOutboundNetworkRequestsOffline = z10;
                Braze braze = Braze.instance;
                if (braze != null) {
                    braze.setSyncPolicyOfflineStatus(z10);
                    Unit unit = Unit.INSTANCE;
                }
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        public final void setSdkEnablementProvider$android_sdk_base_release(he heVar) {
            Braze.sdkEnablementProvider = heVar;
        }

        public final void setStaticExternalIEventMessenger$android_sdk_base_release(m9 m9Var) {
            Braze.staticExternalIEventMessenger = m9Var;
        }

        public final void stopInstance$android_sdk_base_release(boolean clearStorage) {
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: H3.T2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String stopInstance$lambda$0;
                        stopInstance$lambda$0 = Braze.Companion.stopInstance$lambda$0();
                        return stopInstance$lambda$0;
                    }
                }, 6, (Object) null);
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    BrazeCoroutineScope.cancelChildren();
                    Braze braze = Braze.instance;
                    if (braze != null) {
                        Companion companion = Braze.INSTANCE;
                        BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: H3.U2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String stopInstance$lambda$1$0;
                                stopInstance$lambda$1$0 = Braze.Companion.stopInstance$lambda$1$0();
                                return stopInstance$lambda$1$0;
                            }
                        }, 6, (Object) null);
                        ((r7) braze.getExternalIEventMessenger()).b(new SdkDataWipeEvent(), SdkDataWipeEvent.class);
                        BrazeLogger.brazelog$default(brazeLogger, (Object) companion, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: H3.V2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String stopInstance$lambda$1$1;
                                stopInstance$lambda$1$1 = Braze.Companion.stopInstance$lambda$1$1();
                                return stopInstance$lambda$1$1;
                            }
                        }, 7, (Object) null);
                        ne.f25833a.a();
                        if (braze.udm != null) {
                            if (clearStorage) {
                                x3 x3Var = ((ah) braze.getUdm$android_sdk_base_release()).f25283y;
                                x3Var.f26232i.clear();
                                x3Var.f26231h.clear();
                                g8 g8Var = ((ah) braze.getUdm$android_sdk_base_release()).f25281w;
                                g8Var.getClass();
                                g8Var.f25485f = CollectionsKt.emptyList();
                                d0 d0Var = ((ah) braze.getUdm$android_sdk_base_release()).f25282x;
                                d0Var.getClass();
                                d0Var.f25380f = CollectionsKt.emptyList();
                            }
                            k4 k4Var = ((ah) braze.getUdm$android_sdk_base_release()).f25271m;
                            synchronized (k4Var) {
                                k4Var.f25651l = true;
                                k4Var.b();
                                k4Var.f();
                            }
                            u7 u7Var = ((ah) braze.getUdm$android_sdk_base_release()).f25273o;
                            u7Var.f26110b = true;
                            u7Var.f26109a.f26073c = true;
                            ((ah) braze.getUdm$android_sdk_base_release()).f25279u.unregisterGeofences();
                        }
                        braze.getImageLoader().shutdown();
                        braze.isInstanceStopped = true;
                    }
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.W2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String stopInstance$lambda$2;
                        stopInstance$lambda$2 = Braze.Companion.stopInstance$lambda$2();
                        return stopInstance$lambda$2;
                    }
                }, 4, (Object) null);
            }
        }

        @JvmStatic
        public final void wipeData(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            stopInstance$android_sdk_base_release(true);
            try {
                zf.f26359e.a(context);
                DefaultBrazeImageLoader.Companion.a(context);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.d3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String wipeData$lambda$0;
                        wipeData$lambda$0 = Braze.Companion.wipeData$lambda$0();
                        return wipeData$lambda$0;
                    }
                }, 4, (Object) null);
            }
            clearSharedPreferencesData(context);
            clearDataStoreData(context);
            setSdkEnablementProvider$android_sdk_base_release(null);
            setDelayedInitializationProvider$android_sdk_base_release(null);
        }

        private Companion() {
        }

        public final u4 getDelayedInitializationProvider$android_sdk_base_release(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            u4 delayedInitializationProvider$android_sdk_base_release = getDelayedInitializationProvider$android_sdk_base_release();
            if (delayedInitializationProvider$android_sdk_base_release != null) {
                return delayedInitializationProvider$android_sdk_base_release;
            }
            u4 u4Var = new u4(context);
            setDelayedInitializationProvider$android_sdk_base_release(u4Var);
            return u4Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0068  */
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
        BrazeLogger.brazelog$default(brazeLogger2, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: H3.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _init_$lambda$0;
                _init_$lambda$0 = Braze._init_$lambda$0();
                return _init_$lambda$0;
            }
        }, 7, (Object) null);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        this.applicationContext = applicationContext2;
        final String str = Build.MODEL;
        if (str != null) {
            Set<String> set = KNOWN_APP_CRAWLER_DEVICE_MODELS;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (set.contains(lowerCase)) {
                BrazeLogger.brazelog$default(brazeLogger2, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: H3.h1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.M2(str);
                    }
                }, 6, (Object) null);
                brazeLogger = brazeLogger2;
                INSTANCE.enableMockNetworkRequestsAndDropEventsMode();
                m9 m9Var = staticExternalIEventMessenger;
                this.externalIEventMessenger = m9Var == null ? new r7(new he(this.applicationContext), new u4(this.applicationContext), false) : m9Var;
                runGuardedAsync$android_sdk_base_release(new Function0() { // from class: H3.s1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _init_$lambda$2;
                        _init_$lambda$2 = Braze._init_$lambda$2();
                        return _init_$lambda$2;
                    }
                }, false, false, false, new Function0() { // from class: H3.D1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit _init_$lambda$3;
                        _init_$lambda$3 = Braze._init_$lambda$3(Braze.this, context);
                        return _init_$lambda$3;
                    }
                });
                final long nanoTime2 = System.nanoTime();
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: H3.O1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _init_$lambda$4;
                        _init_$lambda$4 = Braze._init_$lambda$4(nanoTime2, nanoTime);
                        return _init_$lambda$4;
                    }
                }, 7, (Object) null);
            }
        }
        brazeLogger = brazeLogger2;
        m9 m9Var2 = staticExternalIEventMessenger;
        this.externalIEventMessenger = m9Var2 == null ? new r7(new he(this.applicationContext), new u4(this.applicationContext), false) : m9Var2;
        runGuardedAsync$android_sdk_base_release(new Function0() { // from class: H3.s1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _init_$lambda$2;
                _init_$lambda$2 = Braze._init_$lambda$2();
                return _init_$lambda$2;
            }
        }, false, false, false, new Function0() { // from class: H3.D1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit _init_$lambda$3;
                _init_$lambda$3 = Braze._init_$lambda$3(Braze.this, context);
                return _init_$lambda$3;
            }
        });
        final long nanoTime22 = System.nanoTime();
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: H3.O1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _init_$lambda$4;
                _init_$lambda$4 = Braze._init_$lambda$4(nanoTime22, nanoTime);
                return _init_$lambda$4;
            }
        }, 7, (Object) null);
    }

    public static String B1() {
        return "**                             instead of an SDK endpoint                            **";
    }

    public static String H1() {
        return "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.";
    }

    public static String M() {
        return "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.";
    }

    public static String M2(String str) {
        return "Device build model matches a known crawler. Enabling mock network request mode. Device it: " + str;
    }

    public static String N1() {
        return "**                                        See                                        **";
    }

    public static String P2() {
        return "Failed to setup pre SDK tasks";
    }

    public static String Q2() {
        return "Finished singleton setup.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0() {
        return "Braze SDK Initializing";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$2() {
        return "Failed to perform initial Braze singleton setup.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$3(Braze braze, Context context) {
        Braze braze2;
        fb fbVar;
        Braze braze3;
        braze.applyPendingRuntimeConfiguration$android_sdk_base_release();
        braze.setConfigurationProvider$android_sdk_base_release(new BrazeConfigurationProvider(braze.applicationContext));
        Companion companion = INSTANCE;
        String configuredApiKey = companion.getConfiguredApiKey(braze.getConfigurationProvider$android_sdk_base_release());
        braze.isApiKeyPresent = Boolean.valueOf(!(configuredApiKey == null || StringsKt.isBlank(configuredApiKey)));
        u4 delayedInitializationProvider$android_sdk_base_release = companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext);
        BrazeConfigurationProvider configurationProvider = braze.getConfigurationProvider$android_sdk_base_release();
        delayedInitializationProvider$android_sdk_base_release.getClass();
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        t4 t4Var = delayedInitializationProvider$android_sdk_base_release.f26103a;
        DataStoreKey dataStoreKey = DataStoreKey.DELAYED_INIT_SET_DURING_RUNTIME_FLAG;
        Boolean bool = Boolean.FALSE;
        Boolean readBoolean = t4Var.readBoolean(dataStoreKey, bool);
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.areEqual(readBoolean, bool2) && configurationProvider.isDelayedInitializationEnabled()) {
            delayedInitializationProvider$android_sdk_base_release.b(true);
        }
        if (!Intrinsics.areEqual(delayedInitializationProvider$android_sdk_base_release.f26103a.readBoolean(dataStoreKey, bool), bool2)) {
            delayedInitializationProvider$android_sdk_base_release.c(configurationProvider.getDelayedInitializationAnalyticsBehavior());
        }
        BrazeLogger.setInitialLogLevelFromConfiguration(braze.getConfigurationProvider$android_sdk_base_release().getLoggerInitialLogLevel());
        BrazeLogger.checkForSystemLogLevelProperty$default(false, 1, null);
        if (companion.getSdkEnablementProvider(context).a() || companion.isDelayedInitializationEnabled()) {
            companion.setOutboundNetworkRequestsOffline(true);
        }
        String str = braze.getConfigurationProvider$android_sdk_base_release().getBrazeApiKey().f25307a;
        braze.setPushDeliveryManager$android_sdk_base_release(new hc(braze.applicationContext, str));
        braze.setDeviceIdProvider$android_sdk_base_release(new f5(braze.applicationContext, str));
        braze.offlineUserStorageProvider = new fb(braze.applicationContext);
        braze.setRegistrationDataProvider$android_sdk_base_release(new tc(braze.applicationContext, braze.getConfigurationProvider$android_sdk_base_release()));
        String customEndpoint = braze.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint();
        if (customEndpoint != null && !StringsKt.isBlank(customEndpoint)) {
            if (ValidationUtils.isInvalidCustomEndpoint$android_sdk_base_release(braze.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint())) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.f29473W;
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: H3.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.x0();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: H3.F
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.k0();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: H3.J
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.s0();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: H3.K
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.h1();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: H3.L
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.c();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: H3.M
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.B1();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: H3.N
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.d1();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: H3.O
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.N1();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: H3.P
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.e2();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: H3.Q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.g();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: H3.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.t0();
                    }
                }, 6, (Object) null);
            }
            companion.setConfiguredCustomEndpoint$android_sdk_base_release(braze.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint());
        }
        try {
            if (braze.getConfigurationProvider$android_sdk_base_release().isFirebaseCloudMessagingRegistrationEnabled()) {
                n8 n8Var = new n8(context, braze.getRegistrationDataProvider$android_sdk_base_release());
                if (n8Var.a()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: H3.v
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Braze.H1();
                        }
                    }, 6, (Object) null);
                    String firebaseCloudMessagingSenderIdKey = braze.getConfigurationProvider$android_sdk_base_release().getFirebaseCloudMessagingSenderIdKey();
                    if (firebaseCloudMessagingSenderIdKey != null) {
                        n8Var.a(firebaseCloudMessagingSenderIdKey);
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Braze.m0();
                        }
                    }, 6, (Object) null);
                }
                braze3 = braze;
            } else {
                braze3 = braze;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze3, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: H3.y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.i();
                    }
                }, 6, (Object) null);
            }
            if (braze3.getConfigurationProvider$android_sdk_base_release().isAdmMessagingRegistrationEnabled()) {
                g gVar = h.f25494c;
                Context context2 = braze3.applicationContext;
                Intrinsics.checkNotNullParameter(context2, "context");
                if (gVar.a() && gVar.a(context2)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze3, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: H3.z
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Braze.u2();
                        }
                    }, 6, (Object) null);
                    new h(braze3.applicationContext, braze3.getRegistrationDataProvider$android_sdk_base_release()).a();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze3, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.A
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Braze.k1();
                        }
                    }, 6, (Object) null);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: H3.B
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.M();
                    }
                }, 6, (Object) null);
            }
            braze.verifyProperSdkSetup();
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: H3.C
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Braze.P2();
                }
            }, 4, (Object) null);
        }
        BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority2 = BrazeLogger.Priority.f29472V;
        BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, priority2, (Throwable) null, false, new Function0() { // from class: H3.D
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Braze.z2();
            }
        }, 6, (Object) null);
        try {
            Context context3 = braze.applicationContext;
            fb fbVar2 = braze.offlineUserStorageProvider;
            if (fbVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                fbVar = null;
            } else {
                fbVar = fbVar2;
            }
            braze.setUserSpecificMemberVariablesAndStartDispatch(new ah(context3, fbVar, braze.getConfigurationProvider$android_sdk_base_release(), braze.externalIEventMessenger, braze.getDeviceIdProvider$android_sdk_base_release(), braze.getRegistrationDataProvider$android_sdk_base_release(), braze.getPushDeliveryManager$android_sdk_base_release(), shouldMockNetworkRequestsAndDropEvents, areOutboundNetworkRequestsOffline, braze.getDeviceDataProvider(), shouldRequestFrameworkListenToNetworkUpdates));
            BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, priority2, (Throwable) null, false, new Function0() { // from class: H3.E
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Braze.w1();
                }
            }, 6, (Object) null);
            braze2 = braze;
        } catch (Exception e11) {
            braze2 = braze;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze2, BrazeLogger.Priority.f29470E, (Throwable) e11, false, new Function0() { // from class: H3.G
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Braze.d2();
                }
            }, 4, (Object) null);
            braze2.publishError(e11);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze2, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: H3.I
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Braze.Q2();
            }
        }, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$4(long j10, long j11) {
        long j12 = j10 - j11;
        return "Braze SDK loaded in " + TimeUnit.MILLISECONDS.convert(j12, TimeUnit.NANOSECONDS) + " ms / " + j12 + " nanos";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$0(String str) {
        return "Failed to set the push token " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _set_registeredPushToken_$lambda$1(Braze braze, final String str) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f29471I;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: H3.r2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _set_registeredPushToken_$lambda$1$0;
                _set_registeredPushToken_$lambda$1$0 = Braze._set_registeredPushToken_$lambda$1$0(str);
                return _set_registeredPushToken_$lambda$1$0;
            }
        }, 6, (Object) null);
        if (str == null || StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.t2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _set_registeredPushToken_$lambda$1$1;
                    _set_registeredPushToken_$lambda$1$1 = Braze._set_registeredPushToken_$lambda$1$1();
                    return _set_registeredPushToken_$lambda$1$1;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(((tc) braze.getRegistrationDataProvider$android_sdk_base_release()).b(), str)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: H3.s2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _set_registeredPushToken_$lambda$1$2;
                    _set_registeredPushToken_$lambda$1$2 = Braze._set_registeredPushToken_$lambda$1$2(str);
                    return _set_registeredPushToken_$lambda$1$2;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        ((tc) braze.getRegistrationDataProvider$android_sdk_base_release()).a(str);
        z4 z4Var = ((ah) braze.getUdm$android_sdk_base_release()).f25266h;
        if (z4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
            z4Var = null;
        }
        z4Var.e();
        braze.requestImmediateDataFlush();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$1$0(String str) {
        return "Push token registered: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$1$1() {
        return "Push token must not be null or blank. Not registering for push with Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$1$2(String str) {
        return "Push token " + str + " is the same as the previous token. Not calling sendFullDeviceObjectOnNextExport or requesting data flush";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addSerializedCardJsonToStorage$lambda$0(String str, String str2) {
        return "Failed to update ContentCard storage provider with single card update. User id: " + str + " Serialized json: " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addSerializedCardJsonToStorage$lambda$1(final String str, Braze braze, final String str2) {
        if (StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.d1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addSerializedCardJsonToStorage$lambda$1$0;
                    addSerializedCardJsonToStorage$lambda$1$0 = Braze.addSerializedCardJsonToStorage$lambda$1$0(str2, str);
                    return addSerializedCardJsonToStorage$lambda$1$0;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        ((ah) braze.getUdm$android_sdk_base_release()).f25283y.a(new u3(str), str2);
        ((r7) braze.externalIEventMessenger).b(((ah) braze.getUdm$android_sdk_base_release()).f25283y.a(true, (Long) null), ContentCardsUpdatedEvent.class);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addSerializedCardJsonToStorage$lambda$1$0(String str, String str2) {
        return "Cannot add null or blank card json to storage. Returning. User id: " + str + " Serialized json: " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addSingleSynchronousSubscription$lambda$0(Class cls) {
        return "Failed to add synchronous subscriber for class: " + cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addSingleSynchronousSubscription$lambda$1(Braze braze, Class cls, IEventSubscriber iEventSubscriber) {
        ((r7) braze.externalIEventMessenger).c(cls, iEventSubscriber);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyPendingRuntimeConfiguration$lambda$0$0() {
        return "Applying any pending runtime configuration values";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyPendingRuntimeConfiguration$lambda$0$1() {
        return "Clearing config values";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyPendingRuntimeConfiguration$lambda$0$2(BrazeConfig brazeConfig) {
        return "Setting pending config object: " + brazeConfig;
    }

    public static String c() {
        return "**                       You are using a Braze REST API endpoint                     **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$0(String str) {
        return "Failed to set external id to: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeUser$lambda$1(final String str, Braze braze, final String str2) {
        fb fbVar;
        if (str == null || str.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String changeUser$lambda$1$0;
                    changeUser$lambda$1$0 = Braze.changeUser$lambda$1$0();
                    return changeUser$lambda$1$0;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (StringUtils.getByteSize(str) > 997) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.Y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String changeUser$lambda$1$1;
                    changeUser$lambda$1$1 = Braze.changeUser$lambda$1$1(str);
                    return changeUser$lambda$1$1;
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
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: H3.Z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String changeUser$lambda$1$2;
                    changeUser$lambda$1$2 = Braze.changeUser$lambda$1$2(str);
                    return changeUser$lambda$1$2;
                }
            }, 6, (Object) null);
            if (str2 != null && !StringsKt.isBlank(str2)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: H3.a0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String changeUser$lambda$1$3;
                        changeUser$lambda$1$3 = Braze.changeUser$lambda$1$3(str2);
                        return changeUser$lambda$1$3;
                    }
                }, 7, (Object) null);
                ((ah) braze.getUdm$android_sdk_base_release()).f25275q.b(str2);
            }
        } else {
            BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: H3.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String changeUser$lambda$1$4;
                    changeUser$lambda$1$4 = Braze.changeUser$lambda$1$4(userId, str);
                    return changeUser$lambda$1$4;
                }
            }, 6, (Object) null);
            r7 r7Var = ((ah) braze.getUdm$android_sdk_base_release()).f25267i;
            ReentrantLock reentrantLock = r7Var.f25985h;
            reentrantLock.lock();
            try {
                reentrantLock.unlock();
                qc qcVar = ((ah) braze.getUdm$android_sdk_base_release()).f25274p;
                qcVar.f25952b.clearData(DataStoreKey.PUSH_MAX_CAMPAIGNS);
                qcVar.f25952b.clearData(DataStoreKey.PUSH_MAX_LAST_UPDATE);
                ((ah) braze.getUdm$android_sdk_base_release()).f25278t.d();
                ((ah) braze.getUdm$android_sdk_base_release()).f25269k.a();
                fb fbVar2 = braze.offlineUserStorageProvider;
                if (fbVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                    fbVar2 = null;
                }
                fbVar2.b(str);
                z9 udm$android_sdk_base_release = braze.getUdm$android_sdk_base_release();
                Context context = braze.applicationContext;
                fb fbVar3 = braze.offlineUserStorageProvider;
                if (fbVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                    fbVar = null;
                } else {
                    fbVar = fbVar3;
                }
                braze.setUserSpecificMemberVariablesAndStartDispatch(new ah(context, fbVar, braze.getConfigurationProvider$android_sdk_base_release(), braze.externalIEventMessenger, braze.getDeviceIdProvider$android_sdk_base_release(), braze.getRegistrationDataProvider$android_sdk_base_release(), braze.getPushDeliveryManager$android_sdk_base_release(), shouldMockNetworkRequestsAndDropEvents, areOutboundNetworkRequestsOffline, braze.getDeviceDataProvider(), shouldRequestFrameworkListenToNetworkUpdates));
                if (str2 != null && !StringsKt.isBlank(str2)) {
                    BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: H3.c0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String changeUser$lambda$1$5;
                            changeUser$lambda$1$5 = Braze.changeUser$lambda$1$5(str2);
                            return changeUser$lambda$1$5;
                        }
                    }, 7, (Object) null);
                    ((ah) braze.getUdm$android_sdk_base_release()).f25275q.b(str2);
                }
                ((ah) braze.getUdm$android_sdk_base_release()).a().j();
                ((ah) braze.getUdm$android_sdk_base_release()).f25278t.l();
                ah ahVar = (ah) udm$android_sdk_base_release;
                ahVar.getClass();
                AbstractC1459k.d(BrazeCoroutineScope.INSTANCE, null, null, new zg(ahVar, null), 3, null);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$1$0() {
        return "userId passed to changeUser was null or empty. The current user will remain the active user.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$1$1(String str) {
        return "Rejected user id with byte length longer than 997. Not changing user. Input user id: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$1$2(String str) {
        return "Received request to change current user " + str + " to the same user id. Not changing user.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$1$3(String str) {
        return "Set sdk auth signature on changeUser call: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$1$4(String str, String str2) {
        return "Changing current user '" + str + "' to new user '" + str2 + ".'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$1$5(String str) {
        return "Set sdk auth signature on changeUser call: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeSession$lambda$0() {
        return "Cannot close session with null activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeSession$lambda$1() {
        return "Failed to close session.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit closeSession$lambda$2(Braze braze, bo.app.f fVar) {
        ((ah) braze.getUdm$android_sdk_base_release()).f25278t.a(fVar);
        return Unit.INSTANCE;
    }

    public static String d1() {
        return "**                Replace \"rest\" with \"sdk\" in your configuration                    **";
    }

    public static String d2() {
        return "Failed to startup user dependency manager.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteRegisteredGeofenceCache$lambda$0() {
        return "Failed to delete registered geofence cache.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteRegisteredGeofenceCache$lambda$1(Braze braze) {
        GeofenceDataStoreProvider geofenceDataStoreProvider = ((ah) braze.getUdm$android_sdk_base_release()).f25279u.getGeofenceDataStoreProvider();
        IBrazeGeofenceApi iBrazeGeofenceApi = new u1(geofenceDataStoreProvider).f26096b;
        if (iBrazeGeofenceApi != null) {
            iBrazeGeofenceApi.deleteRegisteredGeofenceCache(geofenceDataStoreProvider);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deserializeInAppMessageString$lambda$0(String str) {
        return "Failed to deserialize in-app message json. Payload: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String dismissBanner$lambda$0(String str) {
        return "Failed to dismiss Banner for " + str + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dismissBanner$lambda$1(Braze braze, final String str) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: H3.X0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String dismissBanner$lambda$1$0;
                dismissBanner$lambda$1$0 = Braze.dismissBanner$lambda$1$0(str);
                return dismissBanner$lambda$1$0;
            }
        }, 6, (Object) null);
        Banner a10 = ((ah) braze.getUdm$android_sdk_base_release()).f25282x.a(str);
        if (a10 != null) {
            ((ah) braze.getUdm$android_sdk_base_release()).f25282x.a(a10);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String dismissBanner$lambda$1$0(String str) {
        return "Banner dismiss requested. placementId=" + str;
    }

    public static String e2() {
        return "**  https://www.braze.com/docs/user_guide/administrative/access_braze/sdk_endpoints  **";
    }

    public static String g() {
        return "**                                                                                   **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getAllFeatureFlags$lambda$0() {
        return "Failed to get all feature flags";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBanner$lambda$0(String str) {
        return "Failed to get Banner " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getConfigurationProviderSafe$lambda$0() {
        return "ConfigurationProvider has not been initialized. Constructing a new one.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCurrentUser$lambda$0() {
        return "Failed to retrieve the current user.";
    }

    private final g9 getDeviceDataProvider() {
        g9 g9Var = deviceDataProvider;
        if (g9Var == null) {
            g9Var = new c5(this.applicationContext, getConfigurationProvider$android_sdk_base_release());
        }
        deviceDataProvider = g9Var;
        return g9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDeviceIdAsync$lambda$0() {
        return "Failed to retrieve the current device id.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getFeatureFlag$lambda$0(String str) {
        return "Failed to get feature flag " + str;
    }

    public static String h1() {
        return "**                                                                                   **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleInAppMessageTestPush$lambda$0() {
        return "Error handling test in-app message push";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleInAppMessageTestPush$lambda$1(Intent intent, Braze braze) {
        INSTANCE.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(intent, ((ah) braze.getUdm$android_sdk_base_release()).f25278t);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleInternalBannerRefresh$lambda$0() {
        return "Error handling banner push refresh";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleInternalBannerRefresh$lambda$1(Braze braze) {
        ((ah) braze.getUdm$android_sdk_base_release()).f25282x.a();
        return Unit.INSTANCE;
    }

    public static String i() {
        return "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.";
    }

    private final boolean isEphemeralEventKey(final String key) {
        if (!getConfigurationProvider$android_sdk_base_release().isEphemeralEventsEnabled()) {
            return false;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f29472V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: H3.B0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String isEphemeralEventKey$lambda$0;
                isEphemeralEventKey$lambda$0 = Braze.isEphemeralEventKey$lambda$0();
                return isEphemeralEventKey$lambda$0;
            }
        }, 6, (Object) null);
        final Set<String> ephemeralEventKeys = getConfigurationProvider$android_sdk_base_release().getEphemeralEventKeys();
        final boolean contains = ephemeralEventKeys.contains(key);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: H3.C0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String isEphemeralEventKey$lambda$1;
                isEphemeralEventKey$lambda$1 = Braze.isEphemeralEventKey$lambda$1(key, ephemeralEventKeys, contains);
                return isEphemeralEventKey$lambda$1;
            }
        }, 6, (Object) null);
        return contains;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isEphemeralEventKey$lambda$0() {
        return "Ephemeral events enabled";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isEphemeralEventKey$lambda$1(String str, Set set, boolean z10) {
        return "Checking event key [" + str + "] against ephemeral event list " + set + " and got match?: " + z10;
    }

    public static String k0() {
        return "**                                                                                   **";
    }

    public static String k1() {
        return "ADM manifest requirements not met. Braze will not register for ADM.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logBannerClick$lambda$0(String str) {
        return "Failed to log a Banner impression for " + str + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logBannerClick$lambda$1(Braze braze, String str, String str2) {
        ((ah) braze.getUdm$android_sdk_base_release()).f25282x.a(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logBannerImpression$lambda$0(String str) {
        return "Failed to log a Banner impression for " + str + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$0(String str) {
        return "Failed to log custom event: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, java.lang.String] */
    public static final Unit logCustomEvent$lambda$1(Braze braze, final String str, BrazeProperties brazeProperties, final BrazeProperties brazeProperties2) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f29472V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: H3.J2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logCustomEvent$lambda$1$0;
                logCustomEvent$lambda$1$0 = Braze.logCustomEvent$lambda$1$0(str, brazeProperties2);
                return logCustomEvent$lambda$1$0;
            }
        }, 6, (Object) null);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = str;
        if (!ValidationUtils.isValidLogCustomEventInput(str, ((ah) braze.getUdm$android_sdk_base_release()).f25268j)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.K2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logCustomEvent$lambda$1$1;
                    logCustomEvent$lambda$1$1 = Braze.logCustomEvent$lambda$1$1(Ref.ObjectRef.this);
                    return logCustomEvent$lambda$1$1;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (brazeProperties != null && brazeProperties.isInvalid()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.L2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logCustomEvent$lambda$1$2;
                    logCustomEvent$lambda$1$2 = Braze.logCustomEvent$lambda$1$2(Ref.ObjectRef.this);
                    return logCustomEvent$lambda$1$2;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        ?? ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength((String) objectRef.element);
        objectRef.element = ensureBrazeFieldLength;
        y8 a10 = k1.f25630g.a((String) ensureBrazeFieldLength, brazeProperties);
        if (a10 == null) {
            return Unit.INSTANCE;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: H3.M2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logCustomEvent$lambda$1$3;
                logCustomEvent$lambda$1$3 = Braze.logCustomEvent$lambda$1$3(str, brazeProperties2);
                return logCustomEvent$lambda$1$3;
            }
        }, 6, (Object) null);
        if (braze.isEphemeralEventKey((String) objectRef.element) ? ((ah) braze.getUdm$android_sdk_base_release()).f25268j.H() : ((ah) braze.getUdm$android_sdk_base_release()).f25278t.a(a10)) {
            ((ah) braze.getUdm$android_sdk_base_release()).f25258B.a((gg) new a4((String) objectRef.element, brazeProperties, a10));
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: H3.N2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logCustomEvent$lambda$1$4;
                    logCustomEvent$lambda$1$4 = Braze.logCustomEvent$lambda$1$4(Ref.ObjectRef.this);
                    return logCustomEvent$lambda$1$4;
                }
            }, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$1$0(String str, BrazeProperties brazeProperties) {
        return "Called logCustomEvent for custom event " + str + " and properties " + brazeProperties;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$1$1(Ref.ObjectRef objectRef) {
        return "Logged custom event with name " + objectRef.element + " was invalid. Not logging custom event to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$1$2(Ref.ObjectRef objectRef) {
        return "Custom event with name " + objectRef.element + " logged with invalid properties. Not logging custom event to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$1$3(String str, BrazeProperties brazeProperties) {
        return "Logging custom event " + str + " and properties " + brazeProperties;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$1$4(Ref.ObjectRef objectRef) {
        return "Not passing event with name " + objectRef.element + " to trigger manager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logFeatureFlagImpression$lambda$0() {
        return "Failed to log a Feature Flag impression.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logFeatureFlagImpression$lambda$1(Braze braze, String str) {
        ((ah) braze.getUdm$android_sdk_base_release()).f25281w.a(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logLocationRecordedEventFromLocationUpdate$lambda$0() {
        return "Failed to log location recorded event.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logLocationRecordedEventFromLocationUpdate$lambda$1(Braze braze, IBrazeLocation iBrazeLocation) {
        if (!braze.getConfigurationProvider$android_sdk_base_release().isAutomaticLocationCollectionEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: H3.c1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logLocationRecordedEventFromLocationUpdate$lambda$1$0;
                    logLocationRecordedEventFromLocationUpdate$lambda$1$0 = Braze.logLocationRecordedEventFromLocationUpdate$lambda$1$0();
                    return logLocationRecordedEventFromLocationUpdate$lambda$1$0;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        y8 a10 = k1.f25630g.a(iBrazeLocation);
        if (a10 != null) {
            ((ah) braze.getUdm$android_sdk_base_release()).f25278t.a(a10);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logLocationRecordedEventFromLocationUpdate$lambda$1$0() {
        return "Automatic location collection is disabled. Not logging location recorded event.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchase$lambda$0(String str) {
        return "Failed to log purchase event of: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPurchase$lambda$1(String str, String str2, BigDecimal bigDecimal, int i10, Braze braze, BrazeProperties brazeProperties) {
        if (!ValidationUtils.isValidLogPurchaseInput(str, str2, bigDecimal, i10, ((ah) braze.getUdm$android_sdk_base_release()).f25268j)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.n2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPurchase$lambda$1$0;
                    logPurchase$lambda$1$0 = Braze.logPurchase$lambda$1$0();
                    return logPurchase$lambda$1$0;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (brazeProperties != null && brazeProperties.isInvalid()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.o2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPurchase$lambda$1$1;
                    logPurchase$lambda$1$1 = Braze.logPurchase$lambda$1$1();
                    return logPurchase$lambda$1$1;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(str);
        j1 j1Var = k1.f25630g;
        Intrinsics.checkNotNull(str2);
        Intrinsics.checkNotNull(bigDecimal);
        y8 a10 = j1Var.a(ensureBrazeFieldLength, str2, bigDecimal, i10, brazeProperties);
        if (a10 == null) {
            return Unit.INSTANCE;
        }
        if (((ah) braze.getUdm$android_sdk_base_release()).f25278t.a(a10)) {
            ((ah) braze.getUdm$android_sdk_base_release()).f25258B.a((gg) new wb(ensureBrazeFieldLength, brazeProperties, a10));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchase$lambda$1$0() {
        return "Log purchase input was invalid. Not logging in-app purchase to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchase$lambda$1$1() {
        return "Purchase logged with invalid properties. Not logging custom event to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushDelivery$lambda$0(String str) {
        return "Error logging Push Delivery " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushDelivery$lambda$1(Braze braze, String str, long j10) {
        ((ah) braze.getUdm$android_sdk_base_release()).f25278t.a(str);
        braze.schedulePushDelivery$android_sdk_base_release(j10);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushMaxCampaign$lambda$0() {
        return "Failed to log push max campaign";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushMaxCampaign$lambda$1(Braze braze, String str) {
        ((ah) braze.getUdm$android_sdk_base_release()).f25278t.c(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$0() {
        return "Failed to log push notification action clicked.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushNotificationActionClicked$lambda$1(String campaignId, Braze braze, String actionId, String actionType) {
        if (campaignId == null || StringsKt.isBlank(campaignId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.O0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushNotificationActionClicked$lambda$1$0;
                    logPushNotificationActionClicked$lambda$1$0 = Braze.logPushNotificationActionClicked$lambda$1$0();
                    return logPushNotificationActionClicked$lambda$1$0;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (actionId == null || StringsKt.isBlank(actionId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.N0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushNotificationActionClicked$lambda$1$1;
                    logPushNotificationActionClicked$lambda$1$1 = Braze.logPushNotificationActionClicked$lambda$1$1();
                    return logPushNotificationActionClicked$lambda$1$1;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (actionType == null || StringsKt.isBlank(actionType)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.M0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushNotificationActionClicked$lambda$1$2;
                    logPushNotificationActionClicked$lambda$1$2 = Braze.logPushNotificationActionClicked$lambda$1$2();
                    return logPushNotificationActionClicked$lambda$1$2;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        int i10 = yb.f26322j;
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cid", campaignId);
        jSONObject.put("a", actionId);
        v7 v7Var = w7.f26169b;
        yb ybVar = new yb(jSONObject, actionType);
        Companion companion = INSTANCE;
        if (companion.isDelayedInitializationEnabled()) {
            companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(ybVar);
            return Unit.INSTANCE;
        }
        ((ah) braze.getUdm$android_sdk_base_release()).f25278t.a(ybVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$1$0() {
        return "No campaign Id associated with this notification (this is expected for test sends). Not logging push notification action clicked.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$1$1() {
        return "Action ID cannot be null or blank.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$1$2() {
        return "Action Type cannot be null or blank.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$2(Intent intent) {
        return "Error logging push notification with intent: " + intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushNotificationOpened$lambda$3(Intent intent, Braze braze) {
        if (intent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: H3.R0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushNotificationOpened$lambda$3$0;
                    logPushNotificationOpened$lambda$3$0 = Braze.logPushNotificationOpened$lambda$3$0();
                    return logPushNotificationOpened$lambda$3$0;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        final String campaignId = intent.getStringExtra("cid");
        if (campaignId == null || StringsKt.isBlank(campaignId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: H3.T0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushNotificationOpened$lambda$3$2;
                    logPushNotificationOpened$lambda$3$2 = Braze.logPushNotificationOpened$lambda$3$2();
                    return logPushNotificationOpened$lambda$3$2;
                }
            }, 6, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: H3.S0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushNotificationOpened$lambda$3$1;
                    logPushNotificationOpened$lambda$3$1 = Braze.logPushNotificationOpened$lambda$3$1(campaignId);
                    return logPushNotificationOpened$lambda$3$1;
                }
            }, 6, (Object) null);
            int i10 = bc.f25298j;
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cid", campaignId);
            v7 v7Var = w7.f26169b;
            bc bcVar = new bc(jSONObject);
            Companion companion = INSTANCE;
            if (companion.isDelayedInitializationEnabled()) {
                companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(bcVar);
                return Unit.INSTANCE;
            }
            ((ah) braze.getUdm$android_sdk_base_release()).f25278t.a(bcVar);
        }
        INSTANCE.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(intent, ((ah) braze.getUdm$android_sdk_base_release()).f25278t);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$3$0() {
        return "Cannot logPushNotificationOpened with null intent. Not logging push click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$3$1(String str) {
        return "Logging push click. Campaign Id: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$3$2() {
        return "No campaign Id associated with this notification (this is expected for test sends). Not logging push click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushStoryPageClicked$lambda$0(String str, String str2) {
        return "Failed to log push story page clicked for pageId: " + str + " campaignId: " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushStoryPageClicked$lambda$1(String str, String str2, Braze braze) {
        if (!ValidationUtils.isValidPushStoryClickInput(str, str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.J0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushStoryPageClicked$lambda$1$0;
                    logPushStoryPageClicked$lambda$1$0 = Braze.logPushStoryPageClicked$lambda$1$0();
                    return logPushStoryPageClicked$lambda$1$0;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        j1 j1Var = k1.f25630g;
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNull(str2);
        y8 o10 = j1Var.o(str, str2);
        if (o10 != null) {
            Companion companion = INSTANCE;
            if (companion.isDelayedInitializationEnabled()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: H3.K0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String logPushStoryPageClicked$lambda$1$1;
                        logPushStoryPageClicked$lambda$1$1 = Braze.logPushStoryPageClicked$lambda$1$1();
                        return logPushStoryPageClicked$lambda$1$1;
                    }
                }, 7, (Object) null);
                companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(o10);
                return Unit.INSTANCE;
            }
            ((ah) braze.getUdm$android_sdk_base_release()).f25278t.a(o10);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushStoryPageClicked$lambda$1$0() {
        return "Push story page click input was invalid. Not logging in-app purchase to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushStoryPageClicked$lambda$1$1() {
        return "Enqueuing push story page click to delayed init provider";
    }

    public static String m0() {
        return "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openSession$lambda$0() {
        return "Cannot open session with null activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openSession$lambda$1() {
        return "Failed to open session.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openSession$lambda$2(Braze braze, bo.app.f fVar) {
        ((ah) braze.getUdm$android_sdk_base_release()).f25278t.b(fVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performPushDeliveryFlush$lambda$0() {
        return "Failed to flush push delivery events";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performPushDeliveryFlush$lambda$1(Braze braze) {
        ((ah) braze.getUdm$android_sdk_base_release()).f25278t.a(0L);
        return Unit.INSTANCE;
    }

    private final void publishError(final Throwable throwable) {
        if (this.udm == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, throwable, false, new Function0() { // from class: H3.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String publishError$lambda$0;
                    publishError$lambda$0 = Braze.publishError$lambda$0();
                    return publishError$lambda$0;
                }
            }, 4, (Object) null);
            return;
        }
        try {
            ((ah) getUdm$android_sdk_base_release()).f25267i.b(throwable, Throwable.class);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: H3.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String publishError$lambda$1;
                    publishError$lambda$1 = Braze.publishError$lambda$1(throwable);
                    return publishError$lambda$1;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String publishError$lambda$0() {
        return "User dependency manager is uninitialized. Not publishing error.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String publishError$lambda$1(Throwable th2) {
        return "Failed to log throwable: " + th2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String recordGeofenceTransition$lambda$0() {
        return "Failed to post geofence report.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recordGeofenceTransition$lambda$1(String str, GeofenceTransitionType geofenceTransitionType, Braze braze) {
        if (str == null || StringsKt.isBlank(str) || geofenceTransitionType == null) {
            return Unit.INSTANCE;
        }
        ((ah) braze.getUdm$android_sdk_base_release()).f25279u.postGeofenceReport(str, geofenceTransitionType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String reenqueueInAppMessage$lambda$0(InAppMessageEvent inAppMessageEvent) {
        return "Error reenqueueing In-App Message from event " + inAppMessageEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reenqueueInAppMessage$lambda$1(Braze braze, InAppMessageEvent inAppMessageEvent) {
        ((ah) braze.getUdm$android_sdk_base_release()).f25258B.b(inAppMessageEvent.getTriggerAction());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlags$lambda$0() {
        return "Failed to refresh feature flags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshFeatureFlags$lambda$1(Braze braze) {
        if (((ah) braze.getUdm$android_sdk_base_release()).f25268j.I()) {
            g8 g8Var = ((ah) braze.getUdm$android_sdk_base_release()).f25281w;
            j2 j2Var = j2.f25585b;
            g8Var.e();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: H3.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String refreshFeatureFlags$lambda$1$0;
                    refreshFeatureFlags$lambda$1$0 = Braze.refreshFeatureFlags$lambda$1$0();
                    return refreshFeatureFlags$lambda$1$0;
                }
            }, 6, (Object) null);
            ((ah) braze.getUdm$android_sdk_base_release()).f25267i.b(new i8(), i8.class);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlags$lambda$1$0() {
        return "Feature flags not enabled. Not refreshing feature flags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeSingleSubscription$lambda$0(Class cls) {
        return "Failed to remove " + cls.getName() + " subscriber.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeSingleSubscription$lambda$1(final IEventSubscriber iEventSubscriber, Braze braze, final Class cls) {
        if (iEventSubscriber != null) {
            final boolean a10 = ((r7) braze.externalIEventMessenger).a(cls, iEventSubscriber);
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f29472V;
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: H3.u2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String removeSingleSubscription$lambda$1$0$0;
                    removeSingleSubscription$lambda$1$0$0 = Braze.removeSingleSubscription$lambda$1$0$0(cls, iEventSubscriber, a10);
                    return removeSingleSubscription$lambda$1$0$0;
                }
            }, 6, (Object) null);
            final boolean b10 = ((r7) braze.externalIEventMessenger).b(cls, iEventSubscriber);
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: H3.w2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String removeSingleSubscription$lambda$1$0$1;
                    removeSingleSubscription$lambda$1$0$1 = Braze.removeSingleSubscription$lambda$1$0$1(cls, iEventSubscriber, b10);
                    return removeSingleSubscription$lambda$1$0$1;
                }
            }, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeSingleSubscription$lambda$1$0$0(Class cls, IEventSubscriber iEventSubscriber, boolean z10) {
        return "Did remove the background " + cls + " " + iEventSubscriber + "? " + z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeSingleSubscription$lambda$1$0$1(Class cls, IEventSubscriber iEventSubscriber, boolean z10) {
        return "Did remove the synchronous " + cls + " " + iEventSubscriber + "? " + z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestBannersRefresh$lambda$0() {
        return "Failed to refresh banners.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v4, types: [H3.S, T] */
    /* JADX WARN: Type inference failed for: r3v5, types: [H3.U, T] */
    public static final Unit requestBannersRefresh$lambda$1(List list, final Braze braze, final IValueCallback iValueCallback) {
        d0.f25368j.a(list);
        if (((ah) braze.getUdm$android_sdk_base_release()).f25268j.d()) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            if (iValueCallback != null) {
                objectRef.element = new IFireOnceEventSubscriber() { // from class: H3.S
                    @Override // com.braze.events.IEventSubscriber
                    public final void trigger(Object obj) {
                        Braze.requestBannersRefresh$lambda$1$2$0(IValueCallback.this, objectRef, objectRef2, braze, (BannersUpdatedEvent) obj);
                    }
                };
                objectRef2.element = new IFireOnceEventSubscriber() { // from class: H3.U
                    @Override // com.braze.events.IEventSubscriber
                    public final void trigger(Object obj) {
                        Braze.requestBannersRefresh$lambda$1$2$1(IValueCallback.this, objectRef, objectRef2, braze, (bo.app.f0) obj);
                    }
                };
                IFireOnceEventSubscriber iFireOnceEventSubscriber = (IFireOnceEventSubscriber) objectRef.element;
                if (iFireOnceEventSubscriber != null) {
                    ((r7) braze.externalIEventMessenger).d(BannersUpdatedEvent.class, iFireOnceEventSubscriber);
                }
                IFireOnceEventSubscriber iFireOnceEventSubscriber2 = (IFireOnceEventSubscriber) objectRef2.element;
                if (iFireOnceEventSubscriber2 != null) {
                    ((r7) braze.externalIEventMessenger).d(f0.class, iFireOnceEventSubscriber2);
                }
            }
            if (!((ah) braze.getUdm$android_sdk_base_release()).f25282x.d(list)) {
                ((ah) braze.getUdm$android_sdk_base_release()).f25267i.b(new f0(), f0.class);
                requestBannersRefresh$lambda$1$unsubscribeLocalListeners(objectRef, objectRef2, braze);
                if (iValueCallback != null) {
                    iValueCallback.onError();
                }
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: H3.V
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestBannersRefresh$lambda$1$3;
                    requestBannersRefresh$lambda$1$3 = Braze.requestBannersRefresh$lambda$1$3();
                    return requestBannersRefresh$lambda$1$3;
                }
            }, 6, (Object) null);
            ((ah) braze.getUdm$android_sdk_base_release()).f25267i.b(new f0(), f0.class);
            if (iValueCallback != null) {
                iValueCallback.onError();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestBannersRefresh$lambda$1$2$0(IValueCallback iValueCallback, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Braze braze, BannersUpdatedEvent message) {
        Intrinsics.checkNotNullParameter(message, "message");
        requestBannersRefresh$lambda$1$unsubscribeLocalListeners(objectRef, objectRef2, braze);
        iValueCallback.onSuccess(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestBannersRefresh$lambda$1$2$1(IValueCallback iValueCallback, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Braze braze, f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<unused var>");
        requestBannersRefresh$lambda$1$unsubscribeLocalListeners(objectRef, objectRef2, braze);
        iValueCallback.onError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestBannersRefresh$lambda$1$3() {
        return "Banners not enabled. Not refreshing banners. Make sure you have at least one campaign and relaunch the app.";
    }

    private static final void requestBannersRefresh$lambda$1$unsubscribeLocalListeners(Ref.ObjectRef<IFireOnceEventSubscriber<BannersUpdatedEvent>> objectRef, Ref.ObjectRef<IFireOnceEventSubscriber<f0>> objectRef2, Braze braze) {
        IFireOnceEventSubscriber<BannersUpdatedEvent> iFireOnceEventSubscriber = objectRef.element;
        if (iFireOnceEventSubscriber != null) {
            ((r7) braze.externalIEventMessenger).a(BannersUpdatedEvent.class, (IEventSubscriber) iFireOnceEventSubscriber);
        }
        IFireOnceEventSubscriber<f0> iFireOnceEventSubscriber2 = objectRef2.element;
        if (iFireOnceEventSubscriber2 != null) {
            ((r7) braze.externalIEventMessenger).a(f0.class, (IEventSubscriber) iFireOnceEventSubscriber2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefresh$lambda$0() {
        return "Failed to request Content Cards refresh from Braze servers.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestContentCardsRefresh$lambda$1(Braze braze) {
        if (((ah) braze.getUdm$android_sdk_base_release()).f25268j.F()) {
            if (((ah) braze.getUdm$android_sdk_base_release()).f25268j.E()) {
                o6 o6Var = ((ah) braze.getUdm$android_sdk_base_release()).f25269k.f25474c;
                long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
                long j10 = o6Var.f25859c.get();
                long j11 = nowInMilliseconds - j10;
                C0 c02 = o6Var.f25857a;
                if (c02 != null && c02.isActive() && o6Var.f25858b.get() && j10 != 0 && j11 > 3000) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: H3.g0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String requestContentCardsRefresh$lambda$1$0;
                            requestContentCardsRefresh$lambda$1$0 = Braze.requestContentCardsRefresh$lambda$1$0();
                            return requestContentCardsRefresh$lambda$1$0;
                        }
                    }, 6, (Object) null);
                    m9 m9Var = braze.externalIEventMessenger;
                    x3 x3Var = ((ah) braze.getUdm$android_sdk_base_release()).f25283y;
                    x3Var.getClass();
                    ((r7) m9Var).b(x3Var.a(true, Long.valueOf(DateTimeUtils.nowInSeconds())), ContentCardsUpdatedEvent.class);
                    return Unit.INSTANCE;
                }
            }
            ((ah) braze.getUdm$android_sdk_base_release()).f25278t.a(((ah) braze.getUdm$android_sdk_base_release()).f25283y.f26227d, ((ah) braze.getUdm$android_sdk_base_release()).f25283y.f26228e, j2.f25587d);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: H3.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestContentCardsRefresh$lambda$1$1;
                    requestContentCardsRefresh$lambda$1$1 = Braze.requestContentCardsRefresh$lambda$1$1();
                    return requestContentCardsRefresh$lambda$1$1;
                }
            }, 7, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefresh$lambda$1$0() {
        return "DUST is enabled and blocking Content Cards refreshes during active connections. Returning cached Content Cards.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefresh$lambda$1$1() {
        return "Content Cards is not enabled, skipping API call to refresh";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefreshFromCache$lambda$0() {
        return "Failed to request Content Cards refresh from the cache.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestContentCardsRefreshFromCache$lambda$1(Braze braze) {
        ((r7) braze.externalIEventMessenger).b(((ah) braze.getUdm$android_sdk_base_release()).f25283y.a(true, (Long) null), ContentCardsUpdatedEvent.class);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$2(boolean z10) {
        return "Failed to request geofence refresh with rate limit ignore: " + z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestGeofenceRefresh$lambda$3(Braze braze, boolean z10) {
        ((ah) braze.getUdm$android_sdk_base_release()).f25279u.requestGeofenceRefresh(z10);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofences$lambda$0() {
        return "Failed to request geofence refresh.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestGeofences$lambda$1(final double d10, final double d11, Braze braze) {
        if (!ValidationUtils.isValidLocation(d10, d11)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.x2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestGeofences$lambda$1$0;
                    requestGeofences$lambda$1$0 = Braze.requestGeofences$lambda$1$0(d10, d11);
                    return requestGeofences$lambda$1$0;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.y2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestGeofences$lambda$1$1;
                requestGeofences$lambda$1$1 = Braze.requestGeofences$lambda$1$1(d10, d11);
                return requestGeofences$lambda$1$1;
            }
        }, 6, (Object) null);
        ((ah) braze.getUdm$android_sdk_base_release()).f25279u.requestGeofenceRefresh(new BrazeLocation(d10, d11, null, null, null, 28, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofences$lambda$1$0(double d10, double d11) {
        return "Location provided is invalid. Not requesting refresh of Braze Geofences. Provided latitude - longitude: " + d10 + " - " + d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofences$lambda$1$1(double d10, double d11) {
        return "Manually requesting Geofence refresh of with provided latitude - longitude: " + d10 + " - " + d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofencesInitialization$lambda$0() {
        return "Failed to initialize geofences with the geofence manager.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestGeofencesInitialization$lambda$1(Braze braze) {
        ((ah) braze.getUdm$android_sdk_base_release()).f25279u.initializeGeofences();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestImmediateDataFlush$lambda$0() {
        return "Failed to request data flush.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestImmediateDataFlush$lambda$1(Braze braze) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: H3.z2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestImmediateDataFlush$lambda$1$0;
                requestImmediateDataFlush$lambda$1$0 = Braze.requestImmediateDataFlush$lambda$1$0();
                return requestImmediateDataFlush$lambda$1$0;
            }
        }, 6, (Object) null);
        e2 e2Var = ((ah) braze.getUdm$android_sdk_base_release()).f25278t;
        e2Var.getClass();
        e2Var.a(new kb());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestImmediateDataFlush$lambda$1$0() {
        return "requestImmediateDataFlush() called";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestLocationInitialization$lambda$0() {
        return "Location permissions were granted. Requesting geofence and location initialization.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestSingleLocationUpdate$lambda$0() {
        return "Failed to request single location update";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestSingleLocationUpdate$lambda$1(Braze braze) {
        ((ah) braze.getUdm$android_sdk_base_release()).f25280v.f();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retryInAppMessage$lambda$0(InAppMessageEvent inAppMessageEvent) {
        return "Error retrying In-App Message from event " + inAppMessageEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retryInAppMessage$lambda$1(Braze braze, InAppMessageEvent inAppMessageEvent) {
        ((ah) braze.getUdm$android_sdk_base_release()).f25258B.a(inAppMessageEvent.getTriggerEvent(), inAppMessageEvent.getTriggerAction());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void runGuardedAsync$android_sdk_base_release$default(Braze braze, Function0 function0, boolean z10, boolean z11, boolean z12, Function0 function02, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        if ((i10 & 8) != 0) {
            z12 = true;
        }
        braze.runGuardedAsync$android_sdk_base_release(function0, z10, z11, z12, function02);
    }

    public static /* synthetic */ Object runGuardedForResult$android_sdk_base_release$default(Braze braze, Object obj, Function0 function0, boolean z10, boolean z11, boolean z12, Function2 function2, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        if ((i10 & 16) != 0) {
            z12 = true;
        }
        return braze.runGuardedForResult$android_sdk_base_release(obj, function0, z10, z11, z12, function2);
    }

    public static String s0() {
        return "**                                   !! WARNING !!                                   **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void safeCallFlushDelayedInitPushAnalyticsQueue() {
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String safeCallFlushDelayedInitPushAnalyticsQueue$lambda$0;
                safeCallFlushDelayedInitPushAnalyticsQueue$lambda$0 = Braze.safeCallFlushDelayedInitPushAnalyticsQueue$lambda$0();
                return safeCallFlushDelayedInitPushAnalyticsQueue$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit safeCallFlushDelayedInitPushAnalyticsQueue$lambda$1;
                safeCallFlushDelayedInitPushAnalyticsQueue$lambda$1 = Braze.safeCallFlushDelayedInitPushAnalyticsQueue$lambda$1(Braze.this);
                return safeCallFlushDelayedInitPushAnalyticsQueue$lambda$1;
            }
        }, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String safeCallFlushDelayedInitPushAnalyticsQueue$lambda$0() {
        return "Error calling flushPushAnalyticsQueue on instance";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit safeCallFlushDelayedInitPushAnalyticsQueue$lambda$1(Braze braze) {
        INSTANCE.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(((ah) braze.getUdm$android_sdk_base_release()).f25278t);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String schedulePushDelivery$lambda$0() {
        return "Error scheduling push delivery";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit schedulePushDelivery$lambda$1(Braze braze, long j10) {
        ((ah) braze.getUdm$android_sdk_base_release()).f25278t.a(j10);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGoogleAdvertisingId$lambda$0(String str, boolean z10) {
        return "Failed to set Google Advertising ID data on device. Google Advertising ID: " + str + " and limit-ad-tracking: " + z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r9) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit setGoogleAdvertisingId$lambda$1(Braze braze, final String str, final boolean z10) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29469D, (Throwable) null, false, new Function0() { // from class: H3.Q2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String googleAdvertisingId$lambda$1$0;
                googleAdvertisingId$lambda$1$0 = Braze.setGoogleAdvertisingId$lambda$1$0(str, z10);
                return googleAdvertisingId$lambda$1$0;
            }
        }, 6, (Object) null);
        c5 c5Var = (c5) braze.getDeviceDataProvider();
        if (str != null) {
            c5Var.getClass();
        }
        str = "";
        c5Var.f25318d.writeData(DataStoreKey.GOOGLE_ADVERTISING_ID, str);
        ((c5) braze.getDeviceDataProvider()).f25318d.writeData(DataStoreKey.AD_TRACKING_ENABLED, Boolean.valueOf(!z10));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGoogleAdvertisingId$lambda$1$0(String str, boolean z10) {
        return "Setting Google Advertising ID: " + str + " and limit-ad-tracking: " + z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSdkAuthenticationSignature$lambda$0(String str) {
        return "Failed to set SDK authentication signature on device.\n" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSdkAuthenticationSignature$lambda$1(Braze braze, final String str) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: H3.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String sdkAuthenticationSignature$lambda$1$0;
                sdkAuthenticationSignature$lambda$1$0 = Braze.setSdkAuthenticationSignature$lambda$1$0(str);
                return sdkAuthenticationSignature$lambda$1$0;
            }
        }, 6, (Object) null);
        if (StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String sdkAuthenticationSignature$lambda$1$1;
                    sdkAuthenticationSignature$lambda$1$1 = Braze.setSdkAuthenticationSignature$lambda$1$1();
                    return sdkAuthenticationSignature$lambda$1$1;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        ((ah) braze.getUdm$android_sdk_base_release()).f25275q.b(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSdkAuthenticationSignature$lambda$1$0(String str) {
        return "Got new sdk auth signature " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSdkAuthenticationSignature$lambda$1$1() {
        return "SDK authentication signature cannot be null or blank";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSyncPolicyOfflineStatus(final boolean isOffline) {
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.A2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String syncPolicyOfflineStatus$lambda$0;
                syncPolicyOfflineStatus$lambda$0 = Braze.setSyncPolicyOfflineStatus$lambda$0(isOffline);
                return syncPolicyOfflineStatus$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.B2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit syncPolicyOfflineStatus$lambda$1;
                syncPolicyOfflineStatus$lambda$1 = Braze.setSyncPolicyOfflineStatus$lambda$1(Braze.this, isOffline);
                return syncPolicyOfflineStatus$lambda$1;
            }
        }, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSyncPolicyOfflineStatus$lambda$0(boolean z10) {
        return "Failed to set sync policy offline to " + z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSyncPolicyOfflineStatus$lambda$1(Braze braze, final boolean z10) {
        ((ah) braze.getUdm$android_sdk_base_release()).f25278t.getClass();
        k4 k4Var = ((ah) braze.getUdm$android_sdk_base_release()).f25271m;
        synchronized (k4Var) {
            try {
                k4Var.f25651l = z10;
                k4Var.b();
                if (z10) {
                    k4Var.f();
                } else {
                    k4Var.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: H3.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String syncPolicyOfflineStatus$lambda$1$0;
                syncPolicyOfflineStatus$lambda$1$0 = Braze.setSyncPolicyOfflineStatus$lambda$1$0(z10);
                return syncPolicyOfflineStatus$lambda$1$0;
            }
        }, 7, (Object) null);
        braze.getImageLoader().setOffline(z10);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSyncPolicyOfflineStatus$lambda$1$0(boolean z10) {
        return "Setting the image loader deny network downloads to " + z10;
    }

    private final void setUserSpecificMemberVariablesAndStartDispatch(ah dependencyProvider) {
        setUdm$android_sdk_base_release(dependencyProvider);
        ne neVar = ne.f25833a;
        ne.f25834b = ((ah) getUdm$android_sdk_base_release()).f25267i;
        DataStoreProvider.INSTANCE.setEventPublisher$android_sdk_base_release(((ah) getUdm$android_sdk_base_release()).f25267i);
        xg a10 = ((ah) getUdm$android_sdk_base_release()).a();
        e2 e2Var = ((ah) getUdm$android_sdk_base_release()).f25278t;
        fb fbVar = this.offlineUserStorageProvider;
        BrazeUser brazeUser = null;
        if (fbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
            fbVar = null;
        }
        this.brazeUser = new BrazeUser(a10, e2Var, fbVar.a(), ((ah) getUdm$android_sdk_base_release()).f25280v, ((ah) getUdm$android_sdk_base_release()).f25268j);
        ((ah) getUdm$android_sdk_base_release()).f25270l.a(((ah) getUdm$android_sdk_base_release()).f25267i);
        ((ah) getUdm$android_sdk_base_release()).f25267i.a();
        ((ah) getUdm$android_sdk_base_release()).f25273o.a(((ah) getUdm$android_sdk_base_release()).f25267i);
        ((ah) getUdm$android_sdk_base_release()).f25257A.g();
        m9 m9Var = this.externalIEventMessenger;
        BrazeUser brazeUser2 = this.brazeUser;
        if (brazeUser2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
            brazeUser2 = null;
        }
        ((r7) m9Var).b(new BrazeUserChangeEvent(brazeUser2.getUserId()), BrazeUserChangeEvent.class);
        r7 r7Var = ((ah) getUdm$android_sdk_base_release()).f25267i;
        BrazeUser brazeUser3 = this.brazeUser;
        if (brazeUser3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
        } else {
            brazeUser = brazeUser3;
        }
        r7Var.b(new BrazeUserChangeEvent(brazeUser.getUserId()), BrazeUserChangeEvent.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersUpdates$lambda$0() {
        return "Failed to subscribe to Banners updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToBannersUpdates$lambda$1(Braze braze, IEventSubscriber iEventSubscriber) {
        ((r7) braze.externalIEventMessenger).d(BannersUpdatedEvent.class, iEventSubscriber);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersUpdates$lambda$2() {
        return "Failed to send cached Banners updates upon subscription.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToBannersUpdates$lambda$3(Braze braze) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: H3.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToBannersUpdates$lambda$3$0;
                    subscribeToBannersUpdates$lambda$3$0 = Braze.subscribeToBannersUpdates$lambda$3$0();
                    return subscribeToBannersUpdates$lambda$3$0;
                }
            }, 7, (Object) null);
            if (((ah) braze.getUdm$android_sdk_base_release()).f25268j.d()) {
                ((ah) braze.getUdm$android_sdk_base_release()).f25282x.i();
            } else {
                ((ah) braze.getUdm$android_sdk_base_release()).f25267i.b(new BannersUpdatedEvent(CollectionsKt.emptyList()), BannersUpdatedEvent.class);
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToBannersUpdates$lambda$3$1;
                    subscribeToBannersUpdates$lambda$3$1 = Braze.subscribeToBannersUpdates$lambda$3$1();
                    return subscribeToBannersUpdates$lambda$3$1;
                }
            }, 4, (Object) null);
            braze.publishError(e10);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersUpdates$lambda$3$0() {
        return "Sending cached update upon banners subscription";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersUpdates$lambda$3$1() {
        return "Failed to send cached banners upon subscribeToBannersUpdates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToChangeUserEvents$lambda$0() {
        return "Failed to subscribe to BrazeUserChangeEvent.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToChangeUserEvents$lambda$1(Braze braze, IEventSubscriber iEventSubscriber) {
        ((r7) braze.externalIEventMessenger).c(BrazeUserChangeEvent.class, iEventSubscriber);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToChangeUserEvents$lambda$2() {
        return "Failed to send initial BrazeUserChangeEvent upon subscribeToChangeUserEvents.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToChangeUserEvents$lambda$3(Braze braze) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: H3.k0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToChangeUserEvents$lambda$3$0;
                    subscribeToChangeUserEvents$lambda$3$0 = Braze.subscribeToChangeUserEvents$lambda$3$0();
                    return subscribeToChangeUserEvents$lambda$3$0;
                }
            }, 7, (Object) null);
            m9 m9Var = braze.externalIEventMessenger;
            BrazeUser brazeUser = braze.brazeUser;
            if (brazeUser == null) {
                Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
                brazeUser = null;
            }
            ((r7) m9Var).b(new BrazeUserChangeEvent(brazeUser.getUserId()), BrazeUserChangeEvent.class);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.l0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToChangeUserEvents$lambda$3$1;
                    subscribeToChangeUserEvents$lambda$3$1 = Braze.subscribeToChangeUserEvents$lambda$3$1();
                    return subscribeToChangeUserEvents$lambda$3$1;
                }
            }, 4, (Object) null);
            braze.publishError(e10);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToChangeUserEvents$lambda$3$0() {
        return "Sending initial BrazeUserChangeEvent upon subscribeToChangeUserEvents";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToChangeUserEvents$lambda$3$1() {
        return "Failed to send initial BrazeUserChangeEvent upon subscribeToChangeUserEvents.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$0() {
        return "Failed to subscribe to Content Cards updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToContentCardsUpdates$lambda$1(Braze braze, IEventSubscriber iEventSubscriber) {
        ((r7) braze.externalIEventMessenger).d(ContentCardsUpdatedEvent.class, iEventSubscriber);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$2() {
        return "Failed to send cached Content Cards updates upon subscription.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToContentCardsUpdates$lambda$3(Braze braze) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: H3.H2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToContentCardsUpdates$lambda$3$0;
                    subscribeToContentCardsUpdates$lambda$3$0 = Braze.subscribeToContentCardsUpdates$lambda$3$0();
                    return subscribeToContentCardsUpdates$lambda$3$0;
                }
            }, 7, (Object) null);
            if (((ah) braze.getUdm$android_sdk_base_release()).f25268j.F()) {
                ((r7) braze.externalIEventMessenger).b(((ah) braze.getUdm$android_sdk_base_release()).f25283y.a(true, (Long) null), ContentCardsUpdatedEvent.class);
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.I2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToContentCardsUpdates$lambda$3$1;
                    subscribeToContentCardsUpdates$lambda$3$1 = Braze.subscribeToContentCardsUpdates$lambda$3$1();
                    return subscribeToContentCardsUpdates$lambda$3$1;
                }
            }, 4, (Object) null);
            braze.publishError(e10);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$3$0() {
        return "Sending cached update upon content card subscription";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$3$1() {
        return "Failed to send cached content cards upon subscribeToContentCardsUpdates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToFeatureFlagsUpdates$lambda$0() {
        return "Failed to subscribe to Feature Flags updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToFeatureFlagsUpdates$lambda$1(Braze braze, IEventSubscriber iEventSubscriber) {
        ((r7) braze.externalIEventMessenger).d(FeatureFlagsUpdatedEvent.class, iEventSubscriber);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToFeatureFlagsUpdates$lambda$2() {
        return "Failed to send cached Feature Flags updates upon subscription.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToFeatureFlagsUpdates$lambda$3(Braze braze) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: H3.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToFeatureFlagsUpdates$lambda$3$0;
                    subscribeToFeatureFlagsUpdates$lambda$3$0 = Braze.subscribeToFeatureFlagsUpdates$lambda$3$0();
                    return subscribeToFeatureFlagsUpdates$lambda$3$0;
                }
            }, 7, (Object) null);
            if (((ah) braze.getUdm$android_sdk_base_release()).f25268j.I()) {
                g8 g8Var = ((ah) braze.getUdm$android_sdk_base_release()).f25281w;
                if (g8Var.f25486g.get()) {
                    List list = g8Var.f25485f;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
                    }
                    ((r7) g8Var.f25481b).b(new FeatureFlagsUpdatedEvent(arrayList), FeatureFlagsUpdatedEvent.class);
                }
            } else {
                ((ah) braze.getUdm$android_sdk_base_release()).f25267i.b(new i8(), i8.class);
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToFeatureFlagsUpdates$lambda$3$1;
                    subscribeToFeatureFlagsUpdates$lambda$3$1 = Braze.subscribeToFeatureFlagsUpdates$lambda$3$1();
                    return subscribeToFeatureFlagsUpdates$lambda$3$1;
                }
            }, 4, (Object) null);
            braze.publishError(e10);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToFeatureFlagsUpdates$lambda$3$0() {
        return "Sending cached update upon feature flag subscription";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToFeatureFlagsUpdates$lambda$3$1() {
        return "Failed to send cached feature flags upon subscribeToFeatureFlagsUpdates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToNewInAppMessages$lambda$0() {
        return "Failed to add subscriber to new in-app messages.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToNewInAppMessages$lambda$1(Braze braze, IEventSubscriber iEventSubscriber) {
        ((r7) braze.externalIEventMessenger).d(InAppMessageEvent.class, iEventSubscriber);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToPushNotificationEvents$lambda$0() {
        return "Failed to add subscriber for push notification updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToPushNotificationEvents$lambda$1(Braze braze, IEventSubscriber iEventSubscriber) {
        ((r7) braze.externalIEventMessenger).d(BrazePushEvent.class, iEventSubscriber);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToSdkAuthenticationFailures$lambda$0() {
        return "Failed to add subscriber for SDK authentication failures.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToSdkAuthenticationFailures$lambda$1(Braze braze, IEventSubscriber iEventSubscriber) {
        ((r7) braze.externalIEventMessenger).d(BrazeSdkAuthenticationErrorEvent.class, iEventSubscriber);
        return Unit.INSTANCE;
    }

    public static String t0() {
        return "***************************************************************************************";
    }

    public static String u2() {
        return "Amazon Device Messaging found. Setting up Amazon Device Messaging";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String validateAndStorePushId$lambda$0() {
        return "Failed to validate and store push identifier";
    }

    private final void verifyProperSdkSetup() {
        boolean z10 = true;
        for (final String str : NECESSARY_BRAZE_SDK_PERMISSIONS) {
            if (!PermissionUtils.hasPermission(this.applicationContext, str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.o0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String verifyProperSdkSetup$lambda$0;
                        verifyProperSdkSetup$lambda$0 = Braze.verifyProperSdkSetup$lambda$0(str);
                        return verifyProperSdkSetup$lambda$0;
                    }
                }, 6, (Object) null);
                z10 = false;
            }
        }
        if (StringsKt.isBlank(getConfigurationProvider$android_sdk_base_release().getBrazeApiKey().f25307a)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.q0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String verifyProperSdkSetup$lambda$1;
                    verifyProperSdkSetup$lambda$1 = Braze.verifyProperSdkSetup$lambda$1();
                    return verifyProperSdkSetup$lambda$1;
                }
            }, 6, (Object) null);
            z10 = false;
        }
        if (z10) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.r0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String verifyProperSdkSetup$lambda$2;
                verifyProperSdkSetup$lambda$2 = Braze.verifyProperSdkSetup$lambda$2();
                return verifyProperSdkSetup$lambda$2;
            }
        }, 6, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyProperSdkSetup$lambda$0(String str) {
        return "The Braze SDK requires the permission " + str + ". Check your AndroidManifest.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyProperSdkSetup$lambda$1() {
        return "The Braze SDK requires a non-empty API key. Check your braze.xml or BrazeConfig.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyProperSdkSetup$lambda$2() {
        return "The Braze SDK is not integrated correctly. Please visit https://www.braze.com/docs/developer_guide/platform_integration_guides/android/initial_sdk_setup/android_sdk_integration/";
    }

    public static String w1() {
        return "Finished UserDependencyManager creation.";
    }

    public static String x0() {
        return "***************************************************************************************";
    }

    public static String z2() {
        return "Starting up a new user dependency manager";
    }

    public final /* synthetic */ void addSerializedCardJsonToStorage$android_sdk_base_release(final String serializedCardJson, final String userId) {
        Intrinsics.checkNotNullParameter(serializedCardJson, "serializedCardJson");
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.P0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String addSerializedCardJsonToStorage$lambda$0;
                addSerializedCardJsonToStorage$lambda$0 = Braze.addSerializedCardJsonToStorage$lambda$0(userId, serializedCardJson);
                return addSerializedCardJsonToStorage$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.Q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit addSerializedCardJsonToStorage$lambda$1;
                addSerializedCardJsonToStorage$lambda$1 = Braze.addSerializedCardJsonToStorage$lambda$1(serializedCardJson, this, userId);
                return addSerializedCardJsonToStorage$lambda$1;
            }
        }, 14, null);
    }

    public <T> void addSingleSynchronousSubscription(final IEventSubscriber<T> subscriber, final Class<T> eventClass) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        runGuardedAsync$android_sdk_base_release(new Function0() { // from class: H3.A1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String addSingleSynchronousSubscription$lambda$0;
                addSingleSynchronousSubscription$lambda$0 = Braze.addSingleSynchronousSubscription$lambda$0(eventClass);
                return addSingleSynchronousSubscription$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.B1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit addSingleSynchronousSubscription$lambda$1;
                addSingleSynchronousSubscription$lambda$1 = Braze.addSingleSynchronousSubscription$lambda$1(Braze.this, eventClass, subscriber);
                return addSingleSynchronousSubscription$lambda$1;
            }
        });
    }

    public final /* synthetic */ void applyPendingRuntimeConfiguration$android_sdk_base_release() {
        ReentrantLock reentrantLock = brazeClassLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: H3.p1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String applyPendingRuntimeConfiguration$lambda$0$0;
                    applyPendingRuntimeConfiguration$lambda$0$0 = Braze.applyPendingRuntimeConfiguration$lambda$0$0();
                    return applyPendingRuntimeConfiguration$lambda$0$0;
                }
            }, 7, (Object) null);
            Braze braze = this;
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = new RuntimeAppConfigurationProvider(braze.applicationContext);
            for (final BrazeConfig brazeConfig : pendingConfigurations) {
                if (Intrinsics.areEqual(brazeConfig, clearConfigSentinel)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: H3.q1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String applyPendingRuntimeConfiguration$lambda$0$1;
                            applyPendingRuntimeConfiguration$lambda$0$1 = Braze.applyPendingRuntimeConfiguration$lambda$0$1();
                            return applyPendingRuntimeConfiguration$lambda$0$1;
                        }
                    }, 6, (Object) null);
                    runtimeAppConfigurationProvider.clearAllConfigurationValues();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: H3.r1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String applyPendingRuntimeConfiguration$lambda$0$2;
                            applyPendingRuntimeConfiguration$lambda$0$2 = Braze.applyPendingRuntimeConfiguration$lambda$0$2(BrazeConfig.this);
                            return applyPendingRuntimeConfiguration$lambda$0$2;
                        }
                    }, 6, (Object) null);
                    runtimeAppConfigurationProvider.setConfiguration(brazeConfig);
                }
                braze = this;
            }
            pendingConfigurations.clear();
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void changeUser(final String userId, final String sdkAuthSignature) {
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String changeUser$lambda$0;
                changeUser$lambda$0 = Braze.changeUser$lambda$0(userId);
                return changeUser$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.H
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit changeUser$lambda$1;
                changeUser$lambda$1 = Braze.changeUser$lambda$1(userId, this, sdkAuthSignature);
                return changeUser$lambda$1;
            }
        }, 14, null);
    }

    public void closeSession(Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.l1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String closeSession$lambda$0;
                    closeSession$lambda$0 = Braze.closeSession$lambda$0();
                    return closeSession$lambda$0;
                }
            }, 6, (Object) null);
        } else {
            final bo.app.f fVar = new bo.app.f(activity.getClass());
            runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.m1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String closeSession$lambda$1;
                    closeSession$lambda$1 = Braze.closeSession$lambda$1();
                    return closeSession$lambda$1;
                }
            }, false, false, false, new Function0() { // from class: H3.n1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit closeSession$lambda$2;
                    closeSession$lambda$2 = Braze.closeSession$lambda$2(Braze.this, fVar);
                    return closeSession$lambda$2;
                }
            }, 14, null);
        }
    }

    public final void deleteRegisteredGeofenceCache$android_sdk_base_release() {
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String deleteRegisteredGeofenceCache$lambda$0;
                deleteRegisteredGeofenceCache$lambda$0 = Braze.deleteRegisteredGeofenceCache$lambda$0();
                return deleteRegisteredGeofenceCache$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit deleteRegisteredGeofenceCache$lambda$1;
                deleteRegisteredGeofenceCache$lambda$1 = Braze.deleteRegisteredGeofenceCache$lambda$1(Braze.this);
                return deleteRegisteredGeofenceCache$lambda$1;
            }
        }, 14, null);
    }

    public IInAppMessage deserializeInAppMessageString(final String inAppMessageString) {
        return (IInAppMessage) runGuardedForResult$android_sdk_base_release$default(this, null, new Function0() { // from class: H3.l2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String deserializeInAppMessageString$lambda$0;
                deserializeInAppMessageString$lambda$0 = Braze.deserializeInAppMessageString$lambda$0(inAppMessageString);
                return deserializeInAppMessageString$lambda$0;
            }
        }, false, false, false, new o0(inAppMessageString, this, null), 28, null);
    }

    public final void dismissBanner$android_sdk_base_release(final String placementId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String dismissBanner$lambda$0;
                dismissBanner$lambda$0 = Braze.dismissBanner$lambda$0(placementId);
                return dismissBanner$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.t0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit dismissBanner$lambda$1;
                dismissBanner$lambda$1 = Braze.dismissBanner$lambda$1(Braze.this, placementId);
                return dismissBanner$lambda$1;
            }
        }, 14, null);
    }

    public List<FeatureFlag> getAllFeatureFlags() {
        return (List) runGuardedForResult$android_sdk_base_release$default(this, CollectionsKt.emptyList(), new Function0() { // from class: H3.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String allFeatureFlags$lambda$0;
                allFeatureFlags$lambda$0 = Braze.getAllFeatureFlags$lambda$0();
                return allFeatureFlags$lambda$0;
            }
        }, false, false, false, new q0(this, null), 28, null);
    }

    public Banner getBanner(final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return (Banner) runGuardedForResult$android_sdk_base_release$default(this, null, new Function0() { // from class: H3.j2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String banner$lambda$0;
                banner$lambda$0 = Braze.getBanner$lambda$0(id2);
                return banner$lambda$0;
            }
        }, false, false, false, new r0(this, id2, null), 28, null);
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
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: H3.v2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String configurationProviderSafe$lambda$0;
                configurationProviderSafe$lambda$0 = Braze.getConfigurationProviderSafe$lambda$0();
                return configurationProviderSafe$lambda$0;
            }
        }, 7, (Object) null);
        return new BrazeConfigurationProvider(context);
    }

    public void getCurrentUser(IValueCallback<BrazeUser> completionCallback) {
        Intrinsics.checkNotNullParameter(completionCallback, "completionCallback");
        try {
            AbstractC1459k.d(ne.f25833a, null, null, new s0(completionCallback, this, null), 3, null);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String currentUser$lambda$0;
                    currentUser$lambda$0 = Braze.getCurrentUser$lambda$0();
                    return currentUser$lambda$0;
                }
            }, 4, (Object) null);
            completionCallback.onError();
            publishError(e10);
        }
    }

    public void getDeviceIdAsync(IValueCallback<String> completionCallback) {
        Intrinsics.checkNotNullParameter(completionCallback, "completionCallback");
        try {
            AbstractC1459k.d(ne.f25833a, null, null, new t0(completionCallback, this, null), 3, null);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.m2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String deviceIdAsync$lambda$0;
                    deviceIdAsync$lambda$0 = Braze.getDeviceIdAsync$lambda$0();
                    return deviceIdAsync$lambda$0;
                }
            }, 4, (Object) null);
            completionCallback.onError();
            publishError(e10);
        }
    }

    public final h9 getDeviceIdProvider$android_sdk_base_release() {
        h9 h9Var = this.deviceIdProvider;
        if (h9Var != null) {
            return h9Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceIdProvider");
        return null;
    }

    /* renamed from: getExternalIEventMessenger$android_sdk_base_release, reason: from getter */
    public final m9 getExternalIEventMessenger() {
        return this.externalIEventMessenger;
    }

    public FeatureFlag getFeatureFlag(final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return (FeatureFlag) runGuardedForResult$android_sdk_base_release$default(this, null, new Function0() { // from class: H3.H1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String featureFlag$lambda$0;
                featureFlag$lambda$0 = Braze.getFeatureFlag$lambda$0(id2);
                return featureFlag$lambda$0;
            }
        }, false, false, false, new u0(this, id2, null), 28, null);
    }

    public IBrazeImageLoader getImageLoader() {
        return this.imageLoader;
    }

    public final hc getPushDeliveryManager$android_sdk_base_release() {
        hc hcVar = this.pushDeliveryManager;
        if (hcVar != null) {
            return hcVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pushDeliveryManager");
        return null;
    }

    public final p9 getRegistrationDataProvider$android_sdk_base_release() {
        p9 p9Var = this.registrationDataProvider;
        if (p9Var != null) {
            return p9Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("registrationDataProvider");
        return null;
    }

    public final z9 getUdm$android_sdk_base_release() {
        z9 z9Var = this.udm;
        if (z9Var != null) {
            return z9Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("udm");
        return null;
    }

    public final /* synthetic */ void handleInAppMessageTestPush$android_sdk_base_release(final Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String handleInAppMessageTestPush$lambda$0;
                handleInAppMessageTestPush$lambda$0 = Braze.handleInAppMessageTestPush$lambda$0();
                return handleInAppMessageTestPush$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit handleInAppMessageTestPush$lambda$1;
                handleInAppMessageTestPush$lambda$1 = Braze.handleInAppMessageTestPush$lambda$1(intent, this);
                return handleInAppMessageTestPush$lambda$1;
            }
        }, 14, null);
    }

    public final /* synthetic */ void handleInternalBannerRefresh$android_sdk_base_release() {
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.U0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String handleInternalBannerRefresh$lambda$0;
                handleInternalBannerRefresh$lambda$0 = Braze.handleInternalBannerRefresh$lambda$0();
                return handleInternalBannerRefresh$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.V0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit handleInternalBannerRefresh$lambda$1;
                handleInternalBannerRefresh$lambda$1 = Braze.handleInternalBannerRefresh$lambda$1(Braze.this);
                return handleInternalBannerRefresh$lambda$1;
            }
        }, 14, null);
    }

    /* renamed from: isApiKeyPresent$android_sdk_base_release, reason: from getter */
    public final Boolean getIsApiKeyPresent() {
        return this.isApiKeyPresent;
    }

    public void logBannerClick(final String placementId, final String buttonId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.R1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logBannerClick$lambda$0;
                logBannerClick$lambda$0 = Braze.logBannerClick$lambda$0(placementId);
                return logBannerClick$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.S1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logBannerClick$lambda$1;
                logBannerClick$lambda$1 = Braze.logBannerClick$lambda$1(Braze.this, placementId, buttonId);
                return logBannerClick$lambda$1;
            }
        }, 14, null);
    }

    public boolean logBannerImpression(final String placementId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        return ((Boolean) runGuardedForResult$android_sdk_base_release$default(this, Boolean.FALSE, new Function0() { // from class: H3.c2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logBannerImpression$lambda$0;
                logBannerImpression$lambda$0 = Braze.logBannerImpression$lambda$0(placementId);
                return logBannerImpression$lambda$0;
            }
        }, false, false, false, new v0(this, placementId, null), 28, null)).booleanValue();
    }

    public void logCustomEvent(final String eventName, final BrazeProperties properties) {
        final BrazeProperties clone = properties != null ? properties.clone() : null;
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.Z1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logCustomEvent$lambda$0;
                logCustomEvent$lambda$0 = Braze.logCustomEvent$lambda$0(eventName);
                return logCustomEvent$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.k2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logCustomEvent$lambda$1;
                logCustomEvent$lambda$1 = Braze.logCustomEvent$lambda$1(Braze.this, eventName, clone, properties);
                return logCustomEvent$lambda$1;
            }
        }, 14, null);
    }

    public void logFeatureFlagImpression(final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.C1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logFeatureFlagImpression$lambda$0;
                logFeatureFlagImpression$lambda$0 = Braze.logFeatureFlagImpression$lambda$0();
                return logFeatureFlagImpression$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.E1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logFeatureFlagImpression$lambda$1;
                logFeatureFlagImpression$lambda$1 = Braze.logFeatureFlagImpression$lambda$1(Braze.this, id2);
                return logFeatureFlagImpression$lambda$1;
            }
        }, 14, null);
    }

    public final /* synthetic */ void logLocationRecordedEventFromLocationUpdate$android_sdk_base_release(final IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.H0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logLocationRecordedEventFromLocationUpdate$lambda$0;
                logLocationRecordedEventFromLocationUpdate$lambda$0 = Braze.logLocationRecordedEventFromLocationUpdate$lambda$0();
                return logLocationRecordedEventFromLocationUpdate$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.I0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logLocationRecordedEventFromLocationUpdate$lambda$1;
                logLocationRecordedEventFromLocationUpdate$lambda$1 = Braze.logLocationRecordedEventFromLocationUpdate$lambda$1(Braze.this, location);
                return logLocationRecordedEventFromLocationUpdate$lambda$1;
            }
        }, 14, null);
    }

    public void logPurchase(final String productId, final String currencyCode, final BigDecimal price, final int quantity, BrazeProperties properties) {
        final BrazeProperties clone = properties != null ? properties.clone() : null;
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.d2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logPurchase$lambda$0;
                logPurchase$lambda$0 = Braze.logPurchase$lambda$0(productId);
                return logPurchase$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.e2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logPurchase$lambda$1;
                logPurchase$lambda$1 = Braze.logPurchase$lambda$1(productId, currencyCode, price, quantity, this, clone);
                return logPurchase$lambda$1;
            }
        }, 14, null);
    }

    public final /* synthetic */ void logPushDelivery$android_sdk_base_release(final String campaignId, final long timeInMs) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logPushDelivery$lambda$0;
                logPushDelivery$lambda$0 = Braze.logPushDelivery$lambda$0(campaignId);
                return logPushDelivery$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logPushDelivery$lambda$1;
                logPushDelivery$lambda$1 = Braze.logPushDelivery$lambda$1(Braze.this, campaignId, timeInMs);
                return logPushDelivery$lambda$1;
            }
        }, 14, null);
    }

    public final /* synthetic */ void logPushMaxCampaign$android_sdk_base_release(final String campaign) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.F0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logPushMaxCampaign$lambda$0;
                logPushMaxCampaign$lambda$0 = Braze.logPushMaxCampaign$lambda$0();
                return logPushMaxCampaign$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.G0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logPushMaxCampaign$lambda$1;
                logPushMaxCampaign$lambda$1 = Braze.logPushMaxCampaign$lambda$1(Braze.this, campaign);
                return logPushMaxCampaign$lambda$1;
            }
        }, 14, null);
    }

    public void logPushNotificationActionClicked(final String campaignId, final String actionId, final String actionType) {
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.D0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logPushNotificationActionClicked$lambda$0;
                logPushNotificationActionClicked$lambda$0 = Braze.logPushNotificationActionClicked$lambda$0();
                return logPushNotificationActionClicked$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.E0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logPushNotificationActionClicked$lambda$1;
                logPushNotificationActionClicked$lambda$1 = Braze.logPushNotificationActionClicked$lambda$1(campaignId, this, actionId, actionType);
                return logPushNotificationActionClicked$lambda$1;
            }
        }, 10, null);
    }

    public void logPushNotificationOpened(final Intent intent) {
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.w0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logPushNotificationOpened$lambda$2;
                logPushNotificationOpened$lambda$2 = Braze.logPushNotificationOpened$lambda$2(intent);
                return logPushNotificationOpened$lambda$2;
            }
        }, false, false, false, new Function0() { // from class: H3.x0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logPushNotificationOpened$lambda$3;
                logPushNotificationOpened$lambda$3 = Braze.logPushNotificationOpened$lambda$3(intent, this);
                return logPushNotificationOpened$lambda$3;
            }
        }, 10, null);
    }

    public void logPushStoryPageClicked(final String campaignId, final String pageId) {
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.u0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logPushStoryPageClicked$lambda$0;
                logPushStoryPageClicked$lambda$0 = Braze.logPushStoryPageClicked$lambda$0(pageId, campaignId);
                return logPushStoryPageClicked$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.v0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logPushStoryPageClicked$lambda$1;
                logPushStoryPageClicked$lambda$1 = Braze.logPushStoryPageClicked$lambda$1(campaignId, pageId, this);
                return logPushStoryPageClicked$lambda$1;
            }
        }, 10, null);
    }

    public void openSession(Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: H3.t1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String openSession$lambda$0;
                    openSession$lambda$0 = Braze.openSession$lambda$0();
                    return openSession$lambda$0;
                }
            }, 6, (Object) null);
        } else {
            final bo.app.f fVar = new bo.app.f(activity.getClass());
            runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.u1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String openSession$lambda$1;
                    openSession$lambda$1 = Braze.openSession$lambda$1();
                    return openSession$lambda$1;
                }
            }, false, false, false, new Function0() { // from class: H3.v1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit openSession$lambda$2;
                    openSession$lambda$2 = Braze.openSession$lambda$2(Braze.this, fVar);
                    return openSession$lambda$2;
                }
            }, 14, null);
        }
    }

    public final /* synthetic */ void performPushDeliveryFlush$android_sdk_base_release() {
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.X1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String performPushDeliveryFlush$lambda$0;
                performPushDeliveryFlush$lambda$0 = Braze.performPushDeliveryFlush$lambda$0();
                return performPushDeliveryFlush$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.Y1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit performPushDeliveryFlush$lambda$1;
                performPushDeliveryFlush$lambda$1 = Braze.performPushDeliveryFlush$lambda$1(Braze.this);
                return performPushDeliveryFlush$lambda$1;
            }
        }, 14, null);
    }

    public final /* synthetic */ void publishBrazePushAction$android_sdk_base_release(BrazePushEventType pushActionType, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(pushActionType, "pushActionType");
        Intrinsics.checkNotNullParameter(payload, "payload");
        ((r7) this.externalIEventMessenger).b(new BrazePushEvent(pushActionType, payload), BrazePushEvent.class);
    }

    public final /* synthetic */ void recordGeofenceTransition$android_sdk_base_release(final String geofenceId, final GeofenceTransitionType transitionType) {
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.a1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String recordGeofenceTransition$lambda$0;
                recordGeofenceTransition$lambda$0 = Braze.recordGeofenceTransition$lambda$0();
                return recordGeofenceTransition$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.b1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit recordGeofenceTransition$lambda$1;
                recordGeofenceTransition$lambda$1 = Braze.recordGeofenceTransition$lambda$1(geofenceId, transitionType, this);
                return recordGeofenceTransition$lambda$1;
            }
        }, 14, null);
    }

    public final void reenqueueInAppMessage$android_sdk_base_release(final InAppMessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String reenqueueInAppMessage$lambda$0;
                reenqueueInAppMessage$lambda$0 = Braze.reenqueueInAppMessage$lambda$0(InAppMessageEvent.this);
                return reenqueueInAppMessage$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit reenqueueInAppMessage$lambda$1;
                reenqueueInAppMessage$lambda$1 = Braze.reenqueueInAppMessage$lambda$1(Braze.this, event);
                return reenqueueInAppMessage$lambda$1;
            }
        }, 14, null);
    }

    public void refreshFeatureFlags() {
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.a2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String refreshFeatureFlags$lambda$0;
                refreshFeatureFlags$lambda$0 = Braze.refreshFeatureFlags$lambda$0();
                return refreshFeatureFlags$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.b2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit refreshFeatureFlags$lambda$1;
                refreshFeatureFlags$lambda$1 = Braze.refreshFeatureFlags$lambda$1(Braze.this);
                return refreshFeatureFlags$lambda$1;
            }
        }, 14, null);
    }

    public <T> void removeSingleSubscription(final IEventSubscriber<T> subscriber, final Class<T> eventClass) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        runGuardedAsync$android_sdk_base_release(new Function0() { // from class: H3.y1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String removeSingleSubscription$lambda$0;
                removeSingleSubscription$lambda$0 = Braze.removeSingleSubscription$lambda$0(eventClass);
                return removeSingleSubscription$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.z1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit removeSingleSubscription$lambda$1;
                removeSingleSubscription$lambda$1 = Braze.removeSingleSubscription$lambda$1(IEventSubscriber.this, this, eventClass);
                return removeSingleSubscription$lambda$1;
            }
        });
    }

    public void requestBannersRefresh(List<String> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        requestBannersRefresh(ids, null);
    }

    public void requestContentCardsRefresh() {
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.M1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestContentCardsRefresh$lambda$0;
                requestContentCardsRefresh$lambda$0 = Braze.requestContentCardsRefresh$lambda$0();
                return requestContentCardsRefresh$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.N1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestContentCardsRefresh$lambda$1;
                requestContentCardsRefresh$lambda$1 = Braze.requestContentCardsRefresh$lambda$1(Braze.this);
                return requestContentCardsRefresh$lambda$1;
            }
        }, 14, null);
    }

    public void requestContentCardsRefreshFromCache() {
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.T1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestContentCardsRefreshFromCache$lambda$0;
                requestContentCardsRefreshFromCache$lambda$0 = Braze.requestContentCardsRefreshFromCache$lambda$0();
                return requestContentCardsRefreshFromCache$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.U1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestContentCardsRefreshFromCache$lambda$1;
                requestContentCardsRefreshFromCache$lambda$1 = Braze.requestContentCardsRefreshFromCache$lambda$1(Braze.this);
                return requestContentCardsRefreshFromCache$lambda$1;
            }
        }, 14, null);
    }

    public final /* synthetic */ void requestGeofenceRefresh$android_sdk_base_release(final boolean ignoreRateLimit) {
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.e1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestGeofenceRefresh$lambda$2;
                requestGeofenceRefresh$lambda$2 = Braze.requestGeofenceRefresh$lambda$2(ignoreRateLimit);
                return requestGeofenceRefresh$lambda$2;
            }
        }, false, false, false, new Function0() { // from class: H3.f1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestGeofenceRefresh$lambda$3;
                requestGeofenceRefresh$lambda$3 = Braze.requestGeofenceRefresh$lambda$3(Braze.this, ignoreRateLimit);
                return requestGeofenceRefresh$lambda$3;
            }
        }, 14, null);
    }

    public void requestGeofences(final double latitude, final double longitude) {
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.F1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestGeofences$lambda$0;
                requestGeofences$lambda$0 = Braze.requestGeofences$lambda$0();
                return requestGeofences$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.G1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestGeofences$lambda$1;
                requestGeofences$lambda$1 = Braze.requestGeofences$lambda$1(latitude, longitude, this);
                return requestGeofences$lambda$1;
            }
        }, 14, null);
    }

    public final /* synthetic */ void requestGeofencesInitialization$android_sdk_base_release() {
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.O2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestGeofencesInitialization$lambda$0;
                requestGeofencesInitialization$lambda$0 = Braze.requestGeofencesInitialization$lambda$0();
                return requestGeofencesInitialization$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.P2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestGeofencesInitialization$lambda$1;
                requestGeofencesInitialization$lambda$1 = Braze.requestGeofencesInitialization$lambda$1(Braze.this);
                return requestGeofencesInitialization$lambda$1;
            }
        }, 14, null);
    }

    public void requestImmediateDataFlush() {
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.V1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestImmediateDataFlush$lambda$0;
                requestImmediateDataFlush$lambda$0 = Braze.requestImmediateDataFlush$lambda$0();
                return requestImmediateDataFlush$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.W1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestImmediateDataFlush$lambda$1;
                requestImmediateDataFlush$lambda$1 = Braze.requestImmediateDataFlush$lambda$1(Braze.this);
                return requestImmediateDataFlush$lambda$1;
            }
        }, 14, null);
    }

    public void requestLocationInitialization() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: H3.o1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestLocationInitialization$lambda$0;
                requestLocationInitialization$lambda$0 = Braze.requestLocationInitialization$lambda$0();
                return requestLocationInitialization$lambda$0;
            }
        }, 7, (Object) null);
        requestGeofencesInitialization$android_sdk_base_release();
        requestSingleLocationUpdate$android_sdk_base_release();
    }

    public final /* synthetic */ void requestSingleLocationUpdate$android_sdk_base_release() {
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestSingleLocationUpdate$lambda$0;
                requestSingleLocationUpdate$lambda$0 = Braze.requestSingleLocationUpdate$lambda$0();
                return requestSingleLocationUpdate$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestSingleLocationUpdate$lambda$1;
                requestSingleLocationUpdate$lambda$1 = Braze.requestSingleLocationUpdate$lambda$1(Braze.this);
                return requestSingleLocationUpdate$lambda$1;
            }
        }, 14, null);
    }

    public final /* synthetic */ void retryInAppMessage$android_sdk_base_release(final InAppMessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.W
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String retryInAppMessage$lambda$0;
                retryInAppMessage$lambda$0 = Braze.retryInAppMessage$lambda$0(InAppMessageEvent.this);
                return retryInAppMessage$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.X
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit retryInAppMessage$lambda$1;
                retryInAppMessage$lambda$1 = Braze.retryInAppMessage$lambda$1(Braze.this, event);
                return retryInAppMessage$lambda$1;
            }
        }, 14, null);
    }

    public final /* synthetic */ void runGuardedAsync$android_sdk_base_release(Function0 errorLog, boolean earlyReturnIfDisabled, boolean earlyReturnIfDelayedInitEnabled, boolean earlyReturnIfUdmUninitialized, Function0 block) {
        Intrinsics.checkNotNullParameter(errorLog, "errorLog");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            AbstractC1459k.d(ne.f25833a, null, null, new x0(earlyReturnIfDisabled, earlyReturnIfDelayedInitEnabled, earlyReturnIfUdmUninitialized, this, block, errorLog, null), 3, null);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, errorLog, 4, (Object) null);
            publishError(e10);
        }
    }

    public final <T> T runGuardedForResult$android_sdk_base_release(T defaultValueOnException, Function0<String> errorLog, boolean earlyReturnIfDisabled, boolean earlyReturnIfDelayedInitEnabled, boolean earlyReturnIfUdmUninitialized, Function2<? super P, ? super Continuation<? super T>, ? extends Object> block) {
        Object b10;
        Intrinsics.checkNotNullParameter(errorLog, "errorLog");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            b10 = AbstractC1457j.b(null, new z0(earlyReturnIfDisabled, defaultValueOnException, earlyReturnIfDelayedInitEnabled, earlyReturnIfUdmUninitialized, this, block, errorLog, null), 1, null);
            return (T) b10;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, (Function0) errorLog, 4, (Object) null);
            publishError(e10);
            return defaultValueOnException;
        }
    }

    public final /* synthetic */ void schedulePushDelivery$android_sdk_base_release(final long timeInMs) {
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.Y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String schedulePushDelivery$lambda$0;
                schedulePushDelivery$lambda$0 = Braze.schedulePushDelivery$lambda$0();
                return schedulePushDelivery$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.Z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit schedulePushDelivery$lambda$1;
                schedulePushDelivery$lambda$1 = Braze.schedulePushDelivery$lambda$1(Braze.this, timeInMs);
                return schedulePushDelivery$lambda$1;
            }
        }, 14, null);
    }

    public final void setConfigurationProvider$android_sdk_base_release(BrazeConfigurationProvider brazeConfigurationProvider) {
        Intrinsics.checkNotNullParameter(brazeConfigurationProvider, "<set-?>");
        this.configurationProvider = brazeConfigurationProvider;
    }

    public final void setDeviceIdProvider$android_sdk_base_release(h9 h9Var) {
        Intrinsics.checkNotNullParameter(h9Var, "<set-?>");
        this.deviceIdProvider = h9Var;
    }

    public void setGoogleAdvertisingId(final String googleAdvertisingId, final boolean isLimitAdTrackingEnabled) {
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String googleAdvertisingId$lambda$0;
                googleAdvertisingId$lambda$0 = Braze.setGoogleAdvertisingId$lambda$0(googleAdvertisingId, isLimitAdTrackingEnabled);
                return googleAdvertisingId$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.A0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit googleAdvertisingId$lambda$1;
                googleAdvertisingId$lambda$1 = Braze.setGoogleAdvertisingId$lambda$1(Braze.this, googleAdvertisingId, isLimitAdTrackingEnabled);
                return googleAdvertisingId$lambda$1;
            }
        }, 14, null);
    }

    public final void setPushDeliveryManager$android_sdk_base_release(hc hcVar) {
        Intrinsics.checkNotNullParameter(hcVar, "<set-?>");
        this.pushDeliveryManager = hcVar;
    }

    public void setRegisteredPushToken(final String str) {
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.G2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _set_registeredPushToken_$lambda$0;
                _set_registeredPushToken_$lambda$0 = Braze._set_registeredPushToken_$lambda$0(str);
                return _set_registeredPushToken_$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.R2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit _set_registeredPushToken_$lambda$1;
                _set_registeredPushToken_$lambda$1 = Braze._set_registeredPushToken_$lambda$1(Braze.this, str);
                return _set_registeredPushToken_$lambda$1;
            }
        }, 14, null);
    }

    public final void setRegistrationDataProvider$android_sdk_base_release(p9 p9Var) {
        Intrinsics.checkNotNullParameter(p9Var, "<set-?>");
        this.registrationDataProvider = p9Var;
    }

    public void setSdkAuthenticationSignature(final String signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.w1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String sdkAuthenticationSignature$lambda$0;
                sdkAuthenticationSignature$lambda$0 = Braze.setSdkAuthenticationSignature$lambda$0(signature);
                return sdkAuthenticationSignature$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.x1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit sdkAuthenticationSignature$lambda$1;
                sdkAuthenticationSignature$lambda$1 = Braze.setSdkAuthenticationSignature$lambda$1(Braze.this, signature);
                return sdkAuthenticationSignature$lambda$1;
            }
        }, 14, null);
    }

    public final void setUdm$android_sdk_base_release(z9 z9Var) {
        Intrinsics.checkNotNullParameter(z9Var, "<set-?>");
        this.udm = z9Var;
    }

    public final /* synthetic */ void subscribeToBannersDismissedEvent$android_sdk_base_release(IEventSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ((r7) this.externalIEventMessenger).c(BannerDismissedEvent.class, subscriber);
    }

    public void subscribeToBannersUpdates(final IEventSubscriber<BannersUpdatedEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        runGuardedAsync$android_sdk_base_release(new Function0() { // from class: H3.I1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String subscribeToBannersUpdates$lambda$0;
                subscribeToBannersUpdates$lambda$0 = Braze.subscribeToBannersUpdates$lambda$0();
                return subscribeToBannersUpdates$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.J1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit subscribeToBannersUpdates$lambda$1;
                subscribeToBannersUpdates$lambda$1 = Braze.subscribeToBannersUpdates$lambda$1(Braze.this, subscriber);
                return subscribeToBannersUpdates$lambda$1;
            }
        });
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.K1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String subscribeToBannersUpdates$lambda$2;
                subscribeToBannersUpdates$lambda$2 = Braze.subscribeToBannersUpdates$lambda$2();
                return subscribeToBannersUpdates$lambda$2;
            }
        }, false, false, false, new Function0() { // from class: H3.L1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit subscribeToBannersUpdates$lambda$3;
                subscribeToBannersUpdates$lambda$3 = Braze.subscribeToBannersUpdates$lambda$3(Braze.this);
                return subscribeToBannersUpdates$lambda$3;
            }
        }, 14, null);
    }

    public void subscribeToChangeUserEvents(final IEventSubscriber<BrazeUserChangeEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        runGuardedAsync$android_sdk_base_release(new Function0() { // from class: H3.C2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String subscribeToChangeUserEvents$lambda$0;
                subscribeToChangeUserEvents$lambda$0 = Braze.subscribeToChangeUserEvents$lambda$0();
                return subscribeToChangeUserEvents$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.D2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit subscribeToChangeUserEvents$lambda$1;
                subscribeToChangeUserEvents$lambda$1 = Braze.subscribeToChangeUserEvents$lambda$1(Braze.this, subscriber);
                return subscribeToChangeUserEvents$lambda$1;
            }
        });
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.E2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String subscribeToChangeUserEvents$lambda$2;
                subscribeToChangeUserEvents$lambda$2 = Braze.subscribeToChangeUserEvents$lambda$2();
                return subscribeToChangeUserEvents$lambda$2;
            }
        }, false, false, false, new Function0() { // from class: H3.F2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit subscribeToChangeUserEvents$lambda$3;
                subscribeToChangeUserEvents$lambda$3 = Braze.subscribeToChangeUserEvents$lambda$3(Braze.this);
                return subscribeToChangeUserEvents$lambda$3;
            }
        }, 14, null);
    }

    public void subscribeToContentCardsUpdates(final IEventSubscriber<ContentCardsUpdatedEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        runGuardedAsync$android_sdk_base_release(new Function0() { // from class: H3.L0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String subscribeToContentCardsUpdates$lambda$0;
                subscribeToContentCardsUpdates$lambda$0 = Braze.subscribeToContentCardsUpdates$lambda$0();
                return subscribeToContentCardsUpdates$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.W0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit subscribeToContentCardsUpdates$lambda$1;
                subscribeToContentCardsUpdates$lambda$1 = Braze.subscribeToContentCardsUpdates$lambda$1(Braze.this, subscriber);
                return subscribeToContentCardsUpdates$lambda$1;
            }
        });
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.g1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String subscribeToContentCardsUpdates$lambda$2;
                subscribeToContentCardsUpdates$lambda$2 = Braze.subscribeToContentCardsUpdates$lambda$2();
                return subscribeToContentCardsUpdates$lambda$2;
            }
        }, false, false, false, new Function0() { // from class: H3.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit subscribeToContentCardsUpdates$lambda$3;
                subscribeToContentCardsUpdates$lambda$3 = Braze.subscribeToContentCardsUpdates$lambda$3(Braze.this);
                return subscribeToContentCardsUpdates$lambda$3;
            }
        }, 14, null);
    }

    public void subscribeToFeatureFlagsUpdates(final IEventSubscriber<FeatureFlagsUpdatedEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        runGuardedAsync$android_sdk_base_release(new Function0() { // from class: H3.f2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String subscribeToFeatureFlagsUpdates$lambda$0;
                subscribeToFeatureFlagsUpdates$lambda$0 = Braze.subscribeToFeatureFlagsUpdates$lambda$0();
                return subscribeToFeatureFlagsUpdates$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.g2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit subscribeToFeatureFlagsUpdates$lambda$1;
                subscribeToFeatureFlagsUpdates$lambda$1 = Braze.subscribeToFeatureFlagsUpdates$lambda$1(Braze.this, subscriber);
                return subscribeToFeatureFlagsUpdates$lambda$1;
            }
        });
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.h2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String subscribeToFeatureFlagsUpdates$lambda$2;
                subscribeToFeatureFlagsUpdates$lambda$2 = Braze.subscribeToFeatureFlagsUpdates$lambda$2();
                return subscribeToFeatureFlagsUpdates$lambda$2;
            }
        }, false, false, false, new Function0() { // from class: H3.i2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit subscribeToFeatureFlagsUpdates$lambda$3;
                subscribeToFeatureFlagsUpdates$lambda$3 = Braze.subscribeToFeatureFlagsUpdates$lambda$3(Braze.this);
                return subscribeToFeatureFlagsUpdates$lambda$3;
            }
        }, 14, null);
    }

    public void subscribeToNewInAppMessages(final IEventSubscriber<InAppMessageEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        runGuardedAsync$android_sdk_base_release(new Function0() { // from class: H3.p2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String subscribeToNewInAppMessages$lambda$0;
                subscribeToNewInAppMessages$lambda$0 = Braze.subscribeToNewInAppMessages$lambda$0();
                return subscribeToNewInAppMessages$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.q2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit subscribeToNewInAppMessages$lambda$1;
                subscribeToNewInAppMessages$lambda$1 = Braze.subscribeToNewInAppMessages$lambda$1(Braze.this, subscriber);
                return subscribeToNewInAppMessages$lambda$1;
            }
        });
    }

    public void subscribeToPushNotificationEvents(final IEventSubscriber<BrazePushEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        runGuardedAsync$android_sdk_base_release(new Function0() { // from class: H3.P1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String subscribeToPushNotificationEvents$lambda$0;
                subscribeToPushNotificationEvents$lambda$0 = Braze.subscribeToPushNotificationEvents$lambda$0();
                return subscribeToPushNotificationEvents$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.Q1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit subscribeToPushNotificationEvents$lambda$1;
                subscribeToPushNotificationEvents$lambda$1 = Braze.subscribeToPushNotificationEvents$lambda$1(Braze.this, subscriber);
                return subscribeToPushNotificationEvents$lambda$1;
            }
        });
    }

    public void subscribeToSdkAuthenticationFailures(final IEventSubscriber<BrazeSdkAuthenticationErrorEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        runGuardedAsync$android_sdk_base_release(new Function0() { // from class: H3.T
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String subscribeToSdkAuthenticationFailures$lambda$0;
                subscribeToSdkAuthenticationFailures$lambda$0 = Braze.subscribeToSdkAuthenticationFailures$lambda$0();
                return subscribeToSdkAuthenticationFailures$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit subscribeToSdkAuthenticationFailures$lambda$1;
                subscribeToSdkAuthenticationFailures$lambda$1 = Braze.subscribeToSdkAuthenticationFailures$lambda$1(Braze.this, subscriber);
                return subscribeToSdkAuthenticationFailures$lambda$1;
            }
        });
    }

    public final /* synthetic */ void unsubscribeFromBannersDismissedEvent$android_sdk_base_release(IEventSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ((r7) this.externalIEventMessenger).b(BannerDismissedEvent.class, subscriber);
    }

    public final /* synthetic */ boolean validateAndStorePushId$android_sdk_base_release(String pushId) {
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        return ((Boolean) runGuardedForResult$android_sdk_base_release$default(this, Boolean.TRUE, new Function0() { // from class: H3.y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String validateAndStorePushId$lambda$0;
                validateAndStorePushId$lambda$0 = Braze.validateAndStorePushId$lambda$0();
                return validateAndStorePushId$lambda$0;
            }
        }, false, false, false, new a1(this, pushId, null), 28, null)).booleanValue();
    }

    public void requestBannersRefresh(final List<String> ids, final IValueCallback<BannersUpdatedEvent> completionCallback) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        runGuardedAsync$android_sdk_base_release$default(this, new Function0() { // from class: H3.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestBannersRefresh$lambda$0;
                requestBannersRefresh$lambda$0 = Braze.requestBannersRefresh$lambda$0();
                return requestBannersRefresh$lambda$0;
            }
        }, false, false, false, new Function0() { // from class: H3.k1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestBannersRefresh$lambda$1;
                requestBannersRefresh$lambda$1 = Braze.requestBannersRefresh$lambda$1(ids, this, completionCallback);
                return requestBannersRefresh$lambda$1;
            }
        }, 14, null);
    }
}
