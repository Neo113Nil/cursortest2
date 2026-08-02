package T7;

import T7.C1681v;
import android.R;
import g6.C4331C;
import io.agora.rtc2.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: T7.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1678s {

    /* renamed from: a, reason: collision with root package name */
    public static final C1678s f11164a = new C1678s();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f11165b = new HashMap();

    /* renamed from: T7.s$a */
    public interface a {
        void a(boolean z10);
    }

    /* renamed from: T7.s$b */
    public enum b {
        Unknown(-1),
        Core(0),
        AppEvents(PKIFailureInfo.notAuthorized),
        CodelessEvents(65792),
        CloudBridge(67584),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        ProtectedMode(66564),
        MACARuleMatching(66565),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(PKIFailureInfo.unsupportedVersion),
        CrashReport(131328),
        CrashShield(Constants.AUDIO_ENCODING_TYPE_OPUS_16000_LOW),
        ThreadCheck(Constants.AUDIO_ENCODING_TYPE_OPUS_16000_MEDIUM),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(196608),
        ServiceUpdateCompliance(196864),
        Megatron(PKIFailureInfo.transactionIdInUse),
        Elora(327680),
        Login(16777216),
        ChromeCustomTabsPrefetching(R.attr.theme),
        IgnoreAppSwitchToLoggedOut(R.id.background),
        BypassAppSwitch(R.style.Animation),
        Share(33554432);


        /* renamed from: b, reason: collision with root package name */
        public static final a f11175b = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f11200a;

        /* renamed from: T7.s$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(int i10) {
                b[] valuesCustom = b.valuesCustom();
                int length = valuesCustom.length;
                int i11 = 0;
                while (i11 < length) {
                    b bVar = valuesCustom[i11];
                    i11++;
                    if (bVar.f11200a == i10) {
                        return bVar;
                    }
                }
                return b.Unknown;
            }

            public a() {
            }
        }

        /* renamed from: T7.s$b$b, reason: collision with other inner class name */
        public /* synthetic */ class C0213b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[b.valuesCustom().length];
                iArr[b.Core.ordinal()] = 1;
                iArr[b.AppEvents.ordinal()] = 2;
                iArr[b.CodelessEvents.ordinal()] = 3;
                iArr[b.RestrictiveDataFiltering.ordinal()] = 4;
                iArr[b.Instrument.ordinal()] = 5;
                iArr[b.CrashReport.ordinal()] = 6;
                iArr[b.CrashShield.ordinal()] = 7;
                iArr[b.ThreadCheck.ordinal()] = 8;
                iArr[b.ErrorReport.ordinal()] = 9;
                iArr[b.AnrReport.ordinal()] = 10;
                iArr[b.AAM.ordinal()] = 11;
                iArr[b.CloudBridge.ordinal()] = 12;
                iArr[b.PrivacyProtection.ordinal()] = 13;
                iArr[b.SuggestedEvents.ordinal()] = 14;
                iArr[b.IntelligentIntegrity.ordinal()] = 15;
                iArr[b.ProtectedMode.ordinal()] = 16;
                iArr[b.MACARuleMatching.ordinal()] = 17;
                iArr[b.ModelRequest.ordinal()] = 18;
                iArr[b.EventDeactivation.ordinal()] = 19;
                iArr[b.OnDeviceEventProcessing.ordinal()] = 20;
                iArr[b.OnDevicePostInstallEventProcessing.ordinal()] = 21;
                iArr[b.IapLogging.ordinal()] = 22;
                iArr[b.IapLoggingLib2.ordinal()] = 23;
                iArr[b.Monitoring.ordinal()] = 24;
                iArr[b.Megatron.ordinal()] = 25;
                iArr[b.Elora.ordinal()] = 26;
                iArr[b.ServiceUpdateCompliance.ordinal()] = 27;
                iArr[b.Login.ordinal()] = 28;
                iArr[b.ChromeCustomTabsPrefetching.ordinal()] = 29;
                iArr[b.IgnoreAppSwitchToLoggedOut.ordinal()] = 30;
                iArr[b.BypassAppSwitch.ordinal()] = 31;
                iArr[b.Share.ordinal()] = 32;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        b(int i10) {
            this.f11200a = i10;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] valuesCustom = values();
            return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final b c() {
            int i10 = this.f11200a;
            return (i10 & 255) > 0 ? f11175b.a(i10 & (-256)) : (65280 & i10) > 0 ? f11175b.a(i10 & (-65536)) : (16711680 & i10) > 0 ? f11175b.a(i10 & (-16777216)) : f11175b.a(0);
        }

        public final String d() {
            return Intrinsics.stringPlus("FBSDKFeature", this);
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (C0213b.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "AppEventsCloudbridge";
                case 13:
                    return "PrivacyProtection";
                case 14:
                    return "SuggestedEvents";
                case 15:
                    return "IntelligentIntegrity";
                case 16:
                    return "ProtectedMode";
                case 17:
                    return "MACARuleMatching";
                case 18:
                    return "ModelRequest";
                case 19:
                    return "EventDeactivation";
                case 20:
                    return "OnDeviceEventProcessing";
                case 21:
                    return "OnDevicePostInstallEventProcessing";
                case 22:
                    return "IAPLogging";
                case 23:
                    return "IAPLoggingLib2";
                case 24:
                    return "Monitoring";
                case 25:
                    return "Megatron";
                case 26:
                    return "Elora";
                case 27:
                    return "ServiceUpdateCompliance";
                case 28:
                    return "LoginKit";
                case 29:
                    return "ChromeCustomTabsPrefetching";
                case 30:
                    return "IgnoreAppSwitchToLoggedOut";
                case 31:
                    return "BypassAppSwitch";
                case 32:
                    return "ShareKit";
                default:
                    return "unknown";
            }
        }
    }

    /* renamed from: T7.s$c */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.valuesCustom().length];
            iArr[b.RestrictiveDataFiltering.ordinal()] = 1;
            iArr[b.Instrument.ordinal()] = 2;
            iArr[b.CrashReport.ordinal()] = 3;
            iArr[b.CrashShield.ordinal()] = 4;
            iArr[b.ThreadCheck.ordinal()] = 5;
            iArr[b.ErrorReport.ordinal()] = 6;
            iArr[b.AnrReport.ordinal()] = 7;
            iArr[b.AAM.ordinal()] = 8;
            iArr[b.CloudBridge.ordinal()] = 9;
            iArr[b.PrivacyProtection.ordinal()] = 10;
            iArr[b.SuggestedEvents.ordinal()] = 11;
            iArr[b.IntelligentIntegrity.ordinal()] = 12;
            iArr[b.ModelRequest.ordinal()] = 13;
            iArr[b.EventDeactivation.ordinal()] = 14;
            iArr[b.OnDeviceEventProcessing.ordinal()] = 15;
            iArr[b.OnDevicePostInstallEventProcessing.ordinal()] = 16;
            iArr[b.IapLogging.ordinal()] = 17;
            iArr[b.IapLoggingLib2.ordinal()] = 18;
            iArr[b.ProtectedMode.ordinal()] = 19;
            iArr[b.MACARuleMatching.ordinal()] = 20;
            iArr[b.ChromeCustomTabsPrefetching.ordinal()] = 21;
            iArr[b.Monitoring.ordinal()] = 22;
            iArr[b.IgnoreAppSwitchToLoggedOut.ordinal()] = 23;
            iArr[b.BypassAppSwitch.ordinal()] = 24;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: T7.s$d */
    public static final class d implements C1681v.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f11201a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f11202b;

        public d(a aVar, b bVar) {
            this.f11201a = aVar;
            this.f11202b = bVar;
        }

        @Override // T7.C1681v.a
        public void a() {
            a aVar = this.f11201a;
            C1678s c1678s = C1678s.f11164a;
            aVar.a(C1678s.g(this.f11202b));
        }
    }

    public static final void a(b feature, a callback) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C1681v c1681v = C1681v.f11207a;
        C1681v.h(new d(callback, feature));
    }

    public static final void c(b feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        C4331C.l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(feature.d(), C4331C.B()).apply();
    }

    public static final b d(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        f11164a.f();
        for (Map.Entry entry : f11165b.entrySet()) {
            b bVar = (b) entry.getKey();
            String[] strArr = (String[]) entry.getValue();
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str = strArr[i10];
                i10++;
                if (StringsKt.startsWith$default(className, str, false, 2, (Object) null)) {
                    return bVar;
                }
            }
        }
        return b.Unknown;
    }

    public static final boolean g(b feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        if (b.Unknown == feature) {
            return false;
        }
        if (b.Core == feature) {
            return true;
        }
        String string = C4331C.l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(feature.d(), null);
        if (string != null && Intrinsics.areEqual(string, C4331C.B())) {
            return false;
        }
        b c10 = feature.c();
        return c10 == feature ? f11164a.e(feature) : g(c10) && f11164a.e(feature);
    }

    public final boolean b(b bVar) {
        switch (c.$EnumSwitchMapping$0[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                return false;
            default:
                return true;
        }
    }

    public final boolean e(b bVar) {
        boolean b10 = b(bVar);
        C1681v c1681v = C1681v.f11207a;
        return C1681v.d(bVar.d(), C4331C.m(), b10);
    }

    public final synchronized void f() {
        Map map = f11165b;
        if (map.isEmpty()) {
            map.put(b.AAM, new String[]{"com.facebook.appevents.aam."});
            map.put(b.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
            map.put(b.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
            map.put(b.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
            map.put(b.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
            map.put(b.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
            map.put(b.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
            map.put(b.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
            map.put(b.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
            map.put(b.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
            map.put(b.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
            map.put(b.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
            map.put(b.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
            map.put(b.IapLogging, new String[]{"com.facebook.appevents.iap."});
            map.put(b.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
        }
    }
}
