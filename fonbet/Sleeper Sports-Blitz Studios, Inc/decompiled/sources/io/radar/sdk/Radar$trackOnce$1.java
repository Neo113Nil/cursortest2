package io.radar.sdk;

import android.location.Location;
import android.os.Build;
import android.os.Handler;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: Radar.kt */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"io/radar/sdk/Radar$trackOnce$1", "Lio/radar/sdk/Radar$RadarLocationCallback;", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "stopped", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Radar$trackOnce$1 implements Radar.RadarLocationCallback {
    final /* synthetic */ boolean $beacons;
    final /* synthetic */ Radar.RadarTrackCallback $callback;

    Radar$trackOnce$1(boolean z, Radar.RadarTrackCallback radarTrackCallback) {
        this.$beacons = z;
        this.$callback = radarTrackCallback;
    }

    @Override // io.radar.sdk.Radar.RadarLocationCallback
    public void onComplete(final Radar.RadarStatus status, final Location location, final boolean stopped) {
        Intrinsics.checkNotNullParameter(status, "status");
        if (status != Radar.RadarStatus.SUCCESS || location == null) {
            Handler handler$sdk_release = Radar.INSTANCE.getHandler$sdk_release();
            final Radar.RadarTrackCallback radarTrackCallback = this.$callback;
            handler$sdk_release.post(new Runnable() { // from class: io.radar.sdk.Radar$trackOnce$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Radar$trackOnce$1.onComplete$lambda$0(Radar.RadarTrackCallback.this, status);
                }
            });
            return;
        }
        final Radar.RadarTrackCallback radarTrackCallback2 = this.$callback;
        final Function1<RadarBeacon[], Unit> function1 = new Function1<RadarBeacon[], Unit>() { // from class: io.radar.sdk.Radar$trackOnce$1$onComplete$callTrackApi$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* compiled from: Radar.kt */
            @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J]\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"io/radar/sdk/Radar$trackOnce$1$onComplete$callTrackApi$1$1", "Lio/radar/sdk/RadarApiClient$RadarTrackApiCallback;", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "events", "", "Lio/radar/sdk/model/RadarEvent;", "user", "Lio/radar/sdk/model/RadarUser;", "nearbyGeofences", "Lio/radar/sdk/model/RadarGeofence;", AnalyticsConstantsKt.KEY_CONFIG, "Lio/radar/sdk/model/RadarConfig;", AnalyticsConstantsKt.KEY_TOKEN, "Lio/radar/sdk/model/RadarVerifiedLocationToken;", "(Lio/radar/sdk/Radar$RadarStatus;Lorg/json/JSONObject;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;[Lio/radar/sdk/model/RadarGeofence;Lio/radar/sdk/model/RadarConfig;Lio/radar/sdk/model/RadarVerifiedLocationToken;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: io.radar.sdk.Radar$trackOnce$1$onComplete$callTrackApi$1$1, reason: invalid class name */
            public static final class AnonymousClass1 implements RadarApiClient.RadarTrackApiCallback {
                final /* synthetic */ Radar.RadarTrackCallback $callback;
                final /* synthetic */ Location $location;

                AnonymousClass1(Radar.RadarTrackCallback radarTrackCallback, Location location) {
                    this.$callback = radarTrackCallback;
                    this.$location = location;
                }

                @Override // io.radar.sdk.RadarApiClient.RadarTrackApiCallback
                public void onComplete(final Radar.RadarStatus status, JSONObject res, final RadarEvent[] events, final RadarUser user, RadarGeofence[] nearbyGeofences, RadarConfig config, RadarVerifiedLocationToken token) {
                    Intrinsics.checkNotNullParameter(status, "status");
                    if (status == Radar.RadarStatus.SUCCESS) {
                        Radar.INSTANCE.getLocationManager$sdk_release().updateTrackingFromMeta$sdk_release(config != null ? config.getMeta() : null);
                    }
                    Handler handler$sdk_release = Radar.INSTANCE.getHandler$sdk_release();
                    final Radar.RadarTrackCallback radarTrackCallback = this.$callback;
                    final Location location = this.$location;
                    handler$sdk_release.post(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002d: INVOKE 
                          (r8v4 'handler$sdk_release' android.os.Handler)
                          (wrap:java.lang.Runnable:0x002a: CONSTRUCTOR 
                          (r1v0 'radarTrackCallback' io.radar.sdk.Radar$RadarTrackCallback A[DONT_INLINE])
                          (r7v0 'status' io.radar.sdk.Radar$RadarStatus A[DONT_INLINE])
                          (r3v0 'location' android.location.Location A[DONT_INLINE])
                          (r9v0 'events' io.radar.sdk.model.RadarEvent[] A[DONT_INLINE])
                          (r10v0 'user' io.radar.sdk.model.RadarUser A[DONT_INLINE])
                         A[MD:(io.radar.sdk.Radar$RadarTrackCallback, io.radar.sdk.Radar$RadarStatus, android.location.Location, io.radar.sdk.model.RadarEvent[], io.radar.sdk.model.RadarUser):void (m), WRAPPED] call: io.radar.sdk.Radar$trackOnce$1$onComplete$callTrackApi$1$1$$ExternalSyntheticLambda0.<init>(io.radar.sdk.Radar$RadarTrackCallback, io.radar.sdk.Radar$RadarStatus, android.location.Location, io.radar.sdk.model.RadarEvent[], io.radar.sdk.model.RadarUser):void type: CONSTRUCTOR)
                         VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean A[MD:(java.lang.Runnable):boolean (c)] in method: io.radar.sdk.Radar$trackOnce$1$onComplete$callTrackApi$1.1.onComplete(io.radar.sdk.Radar$RadarStatus, org.json.JSONObject, io.radar.sdk.model.RadarEvent[], io.radar.sdk.model.RadarUser, io.radar.sdk.model.RadarGeofence[], io.radar.sdk.model.RadarConfig, io.radar.sdk.model.RadarVerifiedLocationToken):void, file: classes9.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.radar.sdk.Radar$trackOnce$1$onComplete$callTrackApi$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
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
                        java.lang.String r8 = "status"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)
                        io.radar.sdk.Radar$RadarStatus r8 = io.radar.sdk.Radar.RadarStatus.SUCCESS
                        if (r7 != r8) goto L1b
                        io.radar.sdk.Radar r8 = io.radar.sdk.Radar.INSTANCE
                        io.radar.sdk.RadarLocationManager r8 = r8.getLocationManager$sdk_release()
                        if (r12 == 0) goto L17
                        io.radar.sdk.model.RadarMeta r11 = r12.getMeta()
                        goto L18
                    L17:
                        r11 = 0
                    L18:
                        r8.updateTrackingFromMeta$sdk_release(r11)
                    L1b:
                        io.radar.sdk.Radar r8 = io.radar.sdk.Radar.INSTANCE
                        android.os.Handler r8 = r8.getHandler$sdk_release()
                        io.radar.sdk.Radar$RadarTrackCallback r1 = r6.$callback
                        android.location.Location r3 = r6.$location
                        io.radar.sdk.Radar$trackOnce$1$onComplete$callTrackApi$1$1$$ExternalSyntheticLambda0 r0 = new io.radar.sdk.Radar$trackOnce$1$onComplete$callTrackApi$1$1$$ExternalSyntheticLambda0
                        r2 = r7
                        r4 = r9
                        r5 = r10
                        r0.<init>(r1, r2, r3, r4, r5)
                        r8.post(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.radar.sdk.Radar$trackOnce$1$onComplete$callTrackApi$1.AnonymousClass1.onComplete(io.radar.sdk.Radar$RadarStatus, org.json.JSONObject, io.radar.sdk.model.RadarEvent[], io.radar.sdk.model.RadarUser, io.radar.sdk.model.RadarGeofence[], io.radar.sdk.model.RadarConfig, io.radar.sdk.model.RadarVerifiedLocationToken):void");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void onComplete$lambda$0(Radar.RadarTrackCallback radarTrackCallback, Radar.RadarStatus status, Location location, RadarEvent[] radarEventArr, RadarUser radarUser) {
                    Intrinsics.checkNotNullParameter(status, "$status");
                    if (radarTrackCallback != null) {
                        radarTrackCallback.onComplete(status, location, radarEventArr, radarUser);
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(RadarBeacon[] radarBeaconArr) {
                invoke2(radarBeaconArr);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RadarBeacon[] radarBeaconArr) {
                RadarApiClient.track$sdk_release$default(Radar.INSTANCE.getApiClient$sdk_release(), location, stopped, true, Radar.RadarLocationSource.FOREGROUND_LOCATION, false, radarBeaconArr, false, null, null, null, null, null, null, null, new AnonymousClass1(radarTrackCallback2, location), 16320, null);
            }
        };
        if (this.$beacons && Build.VERSION.SDK_INT >= 26) {
            Radar.INSTANCE.getApiClient$sdk_release().searchBeacons$sdk_release(location, 1000, 10, new RadarApiClient.RadarSearchBeaconsApiCallback() { // from class: io.radar.sdk.Radar$trackOnce$1$onComplete$2
                @Override // io.radar.sdk.RadarApiClient.RadarSearchBeaconsApiCallback
                public void onComplete(Radar.RadarStatus status2, JSONObject res, RadarBeacon[] beacons, String[] uuids, String[] uids) {
                    Intrinsics.checkNotNullParameter(status2, "status");
                    if ((uuids != null && uuids.length != 0) || (uids != null && uids.length != 0)) {
                        Radar.INSTANCE.getBeaconManager$sdk_release().startMonitoringBeaconUUIDs(uuids, uids);
                        RadarBeaconManager beaconManager$sdk_release = Radar.INSTANCE.getBeaconManager$sdk_release();
                        final Function1<RadarBeacon[], Unit> function12 = function1;
                        beaconManager$sdk_release.rangeBeaconUUIDs(uuids, uids, false, new Radar.RadarBeaconCallback() { // from class: io.radar.sdk.Radar$trackOnce$1$onComplete$2$onComplete$1
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
                        beaconManager$sdk_release2.rangeBeacons(beacons, false, new Radar.RadarBeaconCallback() { // from class: io.radar.sdk.Radar$trackOnce$1$onComplete$2$onComplete$2
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onComplete$lambda$0(Radar.RadarTrackCallback radarTrackCallback, Radar.RadarStatus status) {
        Intrinsics.checkNotNullParameter(status, "$status");
        if (radarTrackCallback != null) {
            Radar.RadarTrackCallback.DefaultImpls.onComplete$default(radarTrackCallback, status, null, null, null, 14, null);
        }
    }
}
