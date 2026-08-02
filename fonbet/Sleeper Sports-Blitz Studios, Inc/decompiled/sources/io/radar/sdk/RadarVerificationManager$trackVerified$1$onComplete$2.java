package io.radar.sdk;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.common.util.UriUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarApiClient;
import io.radar.sdk.model.RadarBeacon;
import io.radar.sdk.model.RadarConfig;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarGeofence;
import io.radar.sdk.model.RadarUser;
import io.radar.sdk.model.RadarVerifiedLocationToken;
import io.sentry.SpanContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: RadarVerificationManager.kt */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"io/radar/sdk/RadarVerificationManager$trackVerified$1$onComplete$2", "Lio/radar/sdk/Radar$RadarLocationCallback;", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "stopped", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarVerificationManager$trackVerified$1$onComplete$2 implements Radar.RadarLocationCallback {
    final /* synthetic */ boolean $beacons;
    final /* synthetic */ Radar.RadarTrackVerifiedCallback $callback;
    final /* synthetic */ Long $googlePlayProjectNumber;
    final /* synthetic */ boolean $lastTokenBeacons;
    final /* synthetic */ String $reason;
    final /* synthetic */ String $transactionId;
    final /* synthetic */ RadarVerificationManager $verificationManager;

    RadarVerificationManager$trackVerified$1$onComplete$2(RadarVerificationManager radarVerificationManager, Long l, Radar.RadarTrackVerifiedCallback radarTrackVerifiedCallback, boolean z, String str, String str2, boolean z2) {
        this.$verificationManager = radarVerificationManager;
        this.$googlePlayProjectNumber = l;
        this.$callback = radarTrackVerifiedCallback;
        this.$beacons = z;
        this.$reason = str;
        this.$transactionId = str2;
        this.$lastTokenBeacons = z2;
    }

    @Override // io.radar.sdk.Radar.RadarLocationCallback
    public void onComplete(final Radar.RadarStatus status, final Location location, boolean stopped) {
        Intrinsics.checkNotNullParameter(status, "status");
        if (status != Radar.RadarStatus.SUCCESS || location == null) {
            Handler handler$sdk_release = Radar.INSTANCE.getHandler$sdk_release();
            final Radar.RadarTrackVerifiedCallback radarTrackVerifiedCallback = this.$callback;
            handler$sdk_release.post(new Runnable() { // from class: io.radar.sdk.RadarVerificationManager$trackVerified$1$onComplete$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    RadarVerificationManager$trackVerified$1$onComplete$2.onComplete$lambda$0(Radar.RadarStatus.this, radarTrackVerifiedCallback);
                }
            });
            return;
        }
        String requestHash = this.$verificationManager.getRequestHash(location);
        RadarVerificationManager radarVerificationManager = this.$verificationManager;
        Long l = this.$googlePlayProjectNumber;
        final boolean z = this.$beacons;
        final RadarVerificationManager radarVerificationManager2 = this.$verificationManager;
        final String str = this.$reason;
        final String str2 = this.$transactionId;
        final boolean z2 = this.$lastTokenBeacons;
        final Radar.RadarTrackVerifiedCallback radarTrackVerifiedCallback2 = this.$callback;
        radarVerificationManager.getIntegrityToken(l, requestHash, new Function2<String, String, Unit>() { // from class: io.radar.sdk.RadarVerificationManager$trackVerified$1$onComplete$2$onComplete$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str3, String str4) {
                invoke2(str3, str4);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final String str3, final String str4) {
                final Location location2 = location;
                final RadarVerificationManager radarVerificationManager3 = radarVerificationManager2;
                final String str5 = str;
                final String str6 = str2;
                final boolean z3 = z2;
                final Radar.RadarTrackVerifiedCallback radarTrackVerifiedCallback3 = radarTrackVerifiedCallback2;
                final Function1<RadarBeacon[], Unit> function1 = new Function1<RadarBeacon[], Unit>() { // from class: io.radar.sdk.RadarVerificationManager$trackVerified$1$onComplete$2$onComplete$2$callTrackApi$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(RadarBeacon[] radarBeaconArr) {
                        invoke2(radarBeaconArr);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(RadarBeacon[] radarBeaconArr) {
                        Context context;
                        String str7;
                        String str8;
                        RadarApiClient apiClient$sdk_release = Radar.INSTANCE.getApiClient$sdk_release();
                        Location location3 = location2;
                        RadarState radarState = RadarState.INSTANCE;
                        context = radarVerificationManager3.context;
                        boolean stopped$sdk_release = radarState.getStopped$sdk_release(context);
                        boolean foreground = RadarActivityLifecycleCallbacks.Companion.getForeground();
                        Radar.RadarLocationSource radarLocationSource = Radar.RadarLocationSource.FOREGROUND_LOCATION;
                        String str9 = str3;
                        String str10 = str4;
                        str7 = radarVerificationManager3.expectedCountryCode;
                        str8 = radarVerificationManager3.expectedStateCode;
                        String str11 = str5;
                        if (str11 == null) {
                            str11 = SpanContext.DEFAULT_ORIGIN;
                        }
                        apiClient$sdk_release.track$sdk_release(location3, stopped$sdk_release, foreground, radarLocationSource, false, radarBeaconArr, true, str9, str10, false, str7, str8, str11, str6, new AnonymousClass1(radarVerificationManager3, z3, radarTrackVerifiedCallback3));
                    }

                    /* compiled from: RadarVerificationManager.kt */
                    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J]\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"io/radar/sdk/RadarVerificationManager$trackVerified$1$onComplete$2$onComplete$2$callTrackApi$1$1", "Lio/radar/sdk/RadarApiClient$RadarTrackApiCallback;", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "events", "", "Lio/radar/sdk/model/RadarEvent;", "user", "Lio/radar/sdk/model/RadarUser;", "nearbyGeofences", "Lio/radar/sdk/model/RadarGeofence;", AnalyticsConstantsKt.KEY_CONFIG, "Lio/radar/sdk/model/RadarConfig;", AnalyticsConstantsKt.KEY_TOKEN, "Lio/radar/sdk/model/RadarVerifiedLocationToken;", "(Lio/radar/sdk/Radar$RadarStatus;Lorg/json/JSONObject;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;[Lio/radar/sdk/model/RadarGeofence;Lio/radar/sdk/model/RadarConfig;Lio/radar/sdk/model/RadarVerifiedLocationToken;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: io.radar.sdk.RadarVerificationManager$trackVerified$1$onComplete$2$onComplete$2$callTrackApi$1$1, reason: invalid class name */
                    public static final class AnonymousClass1 implements RadarApiClient.RadarTrackApiCallback {
                        final /* synthetic */ Radar.RadarTrackVerifiedCallback $callback;
                        final /* synthetic */ boolean $lastTokenBeacons;
                        final /* synthetic */ RadarVerificationManager $verificationManager;

                        AnonymousClass1(RadarVerificationManager radarVerificationManager, boolean z, Radar.RadarTrackVerifiedCallback radarTrackVerifiedCallback) {
                            this.$verificationManager = radarVerificationManager;
                            this.$lastTokenBeacons = z;
                            this.$callback = radarTrackVerifiedCallback;
                        }

                        @Override // io.radar.sdk.RadarApiClient.RadarTrackApiCallback
                        public void onComplete(final Radar.RadarStatus status, JSONObject res, RadarEvent[] events, RadarUser user, RadarGeofence[] nearbyGeofences, RadarConfig config, final RadarVerifiedLocationToken token) {
                            Intrinsics.checkNotNullParameter(status, "status");
                            if (status == Radar.RadarStatus.SUCCESS) {
                                Radar.INSTANCE.getLocationManager$sdk_release().updateTrackingFromMeta$sdk_release(config != null ? config.getMeta() : null);
                            }
                            if (token != null) {
                                this.$verificationManager.lastToken = token;
                                this.$verificationManager.lastTokenElapsedRealtime = SystemClock.elapsedRealtime();
                                this.$verificationManager.lastTokenBeacons = this.$lastTokenBeacons;
                            }
                            Handler handler$sdk_release = Radar.INSTANCE.getHandler$sdk_release();
                            final Radar.RadarTrackVerifiedCallback radarTrackVerifiedCallback = this.$callback;
                            handler$sdk_release.post(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: INVOKE 
                                  (r2v4 'handler$sdk_release' android.os.Handler)
                                  (wrap:java.lang.Runnable:0x003c: CONSTRUCTOR 
                                  (r1v0 'status' io.radar.sdk.Radar$RadarStatus A[DONT_INLINE])
                                  (r3v1 'radarTrackVerifiedCallback' io.radar.sdk.Radar$RadarTrackVerifiedCallback A[DONT_INLINE])
                                  (r7v0 'token' io.radar.sdk.model.RadarVerifiedLocationToken A[DONT_INLINE])
                                 A[MD:(io.radar.sdk.Radar$RadarStatus, io.radar.sdk.Radar$RadarTrackVerifiedCallback, io.radar.sdk.model.RadarVerifiedLocationToken):void (m), WRAPPED] call: io.radar.sdk.RadarVerificationManager$trackVerified$1$onComplete$2$onComplete$2$callTrackApi$1$1$$ExternalSyntheticLambda0.<init>(io.radar.sdk.Radar$RadarStatus, io.radar.sdk.Radar$RadarTrackVerifiedCallback, io.radar.sdk.model.RadarVerifiedLocationToken):void type: CONSTRUCTOR)
                                 VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean A[MD:(java.lang.Runnable):boolean (c)] in method: io.radar.sdk.RadarVerificationManager$trackVerified$1$onComplete$2$onComplete$2$callTrackApi$1.1.onComplete(io.radar.sdk.Radar$RadarStatus, org.json.JSONObject, io.radar.sdk.model.RadarEvent[], io.radar.sdk.model.RadarUser, io.radar.sdk.model.RadarGeofence[], io.radar.sdk.model.RadarConfig, io.radar.sdk.model.RadarVerifiedLocationToken):void, file: classes9.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.radar.sdk.RadarVerificationManager$trackVerified$1$onComplete$2$onComplete$2$callTrackApi$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 15 more
                                */
                            /*
                                this = this;
                                java.lang.String r2 = "status"
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                                io.radar.sdk.Radar$RadarStatus r2 = io.radar.sdk.Radar.RadarStatus.SUCCESS
                                if (r1 != r2) goto L1b
                                io.radar.sdk.Radar r2 = io.radar.sdk.Radar.INSTANCE
                                io.radar.sdk.RadarLocationManager r2 = r2.getLocationManager$sdk_release()
                                if (r6 == 0) goto L17
                                io.radar.sdk.model.RadarMeta r3 = r6.getMeta()
                                goto L18
                            L17:
                                r3 = 0
                            L18:
                                r2.updateTrackingFromMeta$sdk_release(r3)
                            L1b:
                                if (r7 == 0) goto L32
                                io.radar.sdk.RadarVerificationManager r2 = r0.$verificationManager
                                io.radar.sdk.RadarVerificationManager.access$setLastToken$p(r2, r7)
                                io.radar.sdk.RadarVerificationManager r2 = r0.$verificationManager
                                long r3 = android.os.SystemClock.elapsedRealtime()
                                io.radar.sdk.RadarVerificationManager.access$setLastTokenElapsedRealtime$p(r2, r3)
                                io.radar.sdk.RadarVerificationManager r2 = r0.$verificationManager
                                boolean r3 = r0.$lastTokenBeacons
                                io.radar.sdk.RadarVerificationManager.access$setLastTokenBeacons$p(r2, r3)
                            L32:
                                io.radar.sdk.Radar r2 = io.radar.sdk.Radar.INSTANCE
                                android.os.Handler r2 = r2.getHandler$sdk_release()
                                io.radar.sdk.Radar$RadarTrackVerifiedCallback r3 = r0.$callback
                                io.radar.sdk.RadarVerificationManager$trackVerified$1$onComplete$2$onComplete$2$callTrackApi$1$1$$ExternalSyntheticLambda0 r4 = new io.radar.sdk.RadarVerificationManager$trackVerified$1$onComplete$2$onComplete$2$callTrackApi$1$1$$ExternalSyntheticLambda0
                                r4.<init>(r1, r3, r7)
                                r2.post(r4)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.radar.sdk.RadarVerificationManager$trackVerified$1$onComplete$2$onComplete$2$callTrackApi$1.AnonymousClass1.onComplete(io.radar.sdk.Radar$RadarStatus, org.json.JSONObject, io.radar.sdk.model.RadarEvent[], io.radar.sdk.model.RadarUser, io.radar.sdk.model.RadarGeofence[], io.radar.sdk.model.RadarConfig, io.radar.sdk.model.RadarVerifiedLocationToken):void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final void onComplete$lambda$0(Radar.RadarStatus status, Radar.RadarTrackVerifiedCallback radarTrackVerifiedCallback, RadarVerifiedLocationToken radarVerifiedLocationToken) {
                            Intrinsics.checkNotNullParameter(status, "$status");
                            if (status != Radar.RadarStatus.SUCCESS) {
                                Radar.sendError$sdk_release$default(Radar.INSTANCE, status, null, 2, null);
                            }
                            if (radarTrackVerifiedCallback != null) {
                                radarTrackVerifiedCallback.onComplete(status, radarVerifiedLocationToken);
                            }
                        }
                    }
                };
                if (z && Build.VERSION.SDK_INT >= 26) {
                    Radar.INSTANCE.getApiClient$sdk_release().searchBeacons$sdk_release(location, 1000, 10, new RadarApiClient.RadarSearchBeaconsApiCallback() { // from class: io.radar.sdk.RadarVerificationManager$trackVerified$1$onComplete$2$onComplete$2.1
                        @Override // io.radar.sdk.RadarApiClient.RadarSearchBeaconsApiCallback
                        public void onComplete(Radar.RadarStatus status2, JSONObject res, RadarBeacon[] beacons, String[] uuids, String[] uids) {
                            Intrinsics.checkNotNullParameter(status2, "status");
                            if ((uuids != null && uuids.length != 0) || (uids != null && uids.length != 0)) {
                                Radar.INSTANCE.getBeaconManager$sdk_release().startMonitoringBeaconUUIDs(uuids, uids);
                                RadarBeaconManager beaconManager$sdk_release = Radar.INSTANCE.getBeaconManager$sdk_release();
                                final Function1<RadarBeacon[], Unit> function12 = function1;
                                beaconManager$sdk_release.rangeBeaconUUIDs(uuids, uids, false, new Radar.RadarBeaconCallback() { // from class: io.radar.sdk.RadarVerificationManager$trackVerified$1$onComplete$2$onComplete$2$1$onComplete$1
                                    @Override // io.radar.sdk.Radar.RadarBeaconCallback
                                    public void onComplete(Radar.RadarStatus status3, RadarBeacon[] beacons2) {
                                        Intrinsics.checkNotNullParameter(status3, "status");
                                        if (status3 != Radar.RadarStatus.SUCCESS || beacons2 == null) {
                                            function12.invoke(null);
                                        } else {
                                            function12.invoke(beacons2);
                                        }
                                    }
                                });
                                return;
                            }
                            if (beacons != null) {
                                Radar.INSTANCE.getBeaconManager$sdk_release().startMonitoringBeacons(beacons);
                                RadarBeaconManager beaconManager$sdk_release2 = Radar.INSTANCE.getBeaconManager$sdk_release();
                                final Function1<RadarBeacon[], Unit> function13 = function1;
                                beaconManager$sdk_release2.rangeBeacons(beacons, false, new Radar.RadarBeaconCallback() { // from class: io.radar.sdk.RadarVerificationManager$trackVerified$1$onComplete$2$onComplete$2$1$onComplete$2
                                    @Override // io.radar.sdk.Radar.RadarBeaconCallback
                                    public void onComplete(Radar.RadarStatus status3, RadarBeacon[] beacons2) {
                                        Intrinsics.checkNotNullParameter(status3, "status");
                                        if (status3 != Radar.RadarStatus.SUCCESS || beacons2 == null) {
                                            function13.invoke(null);
                                        } else {
                                            function13.invoke(beacons2);
                                        }
                                    }
                                });
                                return;
                            }
                            function1.invoke(new RadarBeacon[0]);
                        }
                    }, false);
                } else {
                    function1.invoke(null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onComplete$lambda$0(Radar.RadarStatus status, Radar.RadarTrackVerifiedCallback radarTrackVerifiedCallback) {
        Intrinsics.checkNotNullParameter(status, "$status");
        if (status != Radar.RadarStatus.SUCCESS) {
            Radar.sendError$sdk_release$default(Radar.INSTANCE, status, null, 2, null);
        }
        if (radarTrackVerifiedCallback != null) {
            Radar.RadarTrackVerifiedCallback.DefaultImpls.onComplete$default(radarTrackVerifiedCallback, status, null, 2, null);
        }
    }
}
