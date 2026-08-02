package com.google.android.gms.measurement;

import Z9.a;
import Z9.b;
import Z9.c;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.measurement.internal.C3298l3;
import com.google.android.gms.measurement.internal.R3;
import com.google.android.gms.measurement.internal.X4;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    public static volatile AppMeasurement f33256b;

    /* renamed from: a, reason: collision with root package name */
    public final c f33257a;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @NonNull
        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @NonNull
        @Keep
        public String mExpiredEventName;

        @NonNull
        @Keep
        public Bundle mExpiredEventParams;

        @NonNull
        @Keep
        public String mName;

        @NonNull
        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @NonNull
        @Keep
        public String mTimedOutEventName;

        @NonNull
        @Keep
        public Bundle mTimedOutEventParams;

        @NonNull
        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @NonNull
        @Keep
        public String mTriggeredEventName;

        @NonNull
        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @NonNull
        @Keep
        public Object mValue;

        public ConditionalUserProperty(Bundle bundle) {
            AbstractC3191o.m(bundle);
            this.mAppId = (String) R3.b(bundle, PublisherMetadata.APP_ID, String.class, null);
            this.mOrigin = (String) R3.b(bundle, "origin", String.class, null);
            this.mName = (String) R3.b(bundle, "name", String.class, null);
            this.mValue = R3.b(bundle, EventKeys.VALUE_KEY, Object.class, null);
            this.mTriggerEventName = (String) R3.b(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) R3.b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) R3.b(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) R3.b(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) R3.b(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) R3.b(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) R3.b(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) R3.b(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) R3.b(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) R3.b(bundle, AppStateModule.APP_STATE_ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) R3.b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) R3.b(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(C3298l3 c3298l3) {
        this.f33257a = new a(c3298l3);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @NonNull
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(@NonNull Context context) {
        if (f33256b == null) {
            synchronized (AppMeasurement.class) {
                if (f33256b == null) {
                    X4 x42 = (X4) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (x42 != null) {
                        f33256b = new AppMeasurement(x42);
                    } else {
                        f33256b = new AppMeasurement(C3298l3.O(context, new zzdd(0L, 0L, true, null, null), null));
                    }
                }
            }
        }
        return f33256b;
    }

    @Keep
    public void beginAdUnitExposure(@NonNull String str) {
        this.f33257a.d(str);
    }

    @Keep
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f33257a.g(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(@NonNull String str) {
        this.f33257a.c(str);
    }

    @Keep
    public long generateEventId() {
        return this.f33257a.zzl();
    }

    @NonNull
    @Keep
    public String getAppInstanceId() {
        return this.f33257a.zzj();
    }

    @NonNull
    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @NonNull String str2) {
        List h10 = this.f33257a.h(str, str2);
        ArrayList arrayList = new ArrayList(h10 == null ? 0 : h10.size());
        Iterator it = h10.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @NonNull
    @Keep
    public String getCurrentScreenClass() {
        return this.f33257a.zzi();
    }

    @NonNull
    @Keep
    public String getCurrentScreenName() {
        return this.f33257a.zzh();
    }

    @NonNull
    @Keep
    public String getGmpAppId() {
        return this.f33257a.zzk();
    }

    @Keep
    public int getMaxUserProperties(@NonNull String str) {
        return this.f33257a.e(str);
    }

    @NonNull
    @Keep
    public Map<String, Object> getUserProperties(@NonNull String str, @NonNull String str2, boolean z10) {
        return this.f33257a.f(str, str2, z10);
    }

    @Keep
    public void logEventInternal(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f33257a.a(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        AbstractC3191o.m(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString(PublisherMetadata.APP_ID, str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            R3.a(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        c cVar = this.f33257a;
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(AppStateModule.APP_STATE_ACTIVE, conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        cVar.b(bundle);
    }

    public AppMeasurement(X4 x42) {
        this.f33257a = new b(x42);
    }
}
