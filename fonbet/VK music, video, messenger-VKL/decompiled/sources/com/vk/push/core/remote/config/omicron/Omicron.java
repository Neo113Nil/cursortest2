package com.vk.push.core.remote.config.omicron;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.preference.Preference;
import com.vk.push.core.remote.config.omicron.Data;
import com.vk.push.core.remote.config.omicron.Omicron;
import com.vk.push.core.remote.config.omicron.a;
import com.vk.push.core.remote.config.omicron.a.c;
import com.vk.push.core.remote.config.omicron.a.d;
import com.vk.push.core.remote.config.omicron.a.e;
import com.vk.push.core.remote.config.omicron.executor.DefaultExecutorFactory;
import com.vk.push.core.remote.config.omicron.fingerprint.AppFingerprint;
import com.vk.push.core.remote.config.omicron.fingerprint.DeviceFingerprint;
import com.vk.push.core.remote.config.omicron.fingerprint.SessionFingerprint;
import com.vk.push.core.remote.config.omicron.retriever.NetworkDataRetriever;
import com.vk.push.core.remote.config.omicron.retriever.ResponseParserImpl;
import com.vk.push.core.remote.config.omicron.segment.SegmentsHolder;
import com.vk.push.core.remote.config.omicron.segment.SegmentsProvider;
import com.vk.push.core.remote.config.omicron.storage.SerializationDataStorage;
import com.vk.push.core.remote.config.omicron.timetable.SharedPreferencesUpdateTimetable;
import com.vk.push.core.remote.config.omicron.util.PackageInfoUtil;
import java.io.File;
import java.util.Map;

/* loaded from: classes.dex */
public final class Omicron {
    public static final Omicron b = new Omicron();
    public volatile a.b a;

    @NonNull
    public static Omicron getInstance() {
        return b;
    }

    @NonNull
    public final synchronized Data a() {
        Data data;
        try {
            if (this.a == null) {
                throw new IllegalStateException("Trying to access data before method 'init' called");
            }
            data = this.a.b;
            if (data == null) {
                throw new IllegalStateException("init() must be called before any access to logic");
            }
        } catch (Throwable th) {
            throw th;
        }
        return data;
    }

    @NonNull
    public final synchronized Data b() {
        a.b bVar;
        try {
            if (this.a == null) {
                throw new IllegalStateException("Trying to access latest data before method 'init' called");
            }
            bVar = this.a;
            if (bVar.b == null) {
                throw new IllegalStateException("init() must be called before any access to logic");
            }
        } catch (Throwable th) {
            throw th;
        }
        return bVar.a.get();
    }

    public void clearLogic() {
        SegmentsHolder.clearProvider();
        this.a = null;
    }

    public boolean getBoolean(String str) {
        return a().getBoolean(str);
    }

    public double getDouble(String str) {
        return a().getDouble(str);
    }

    public float getFloat(String str) {
        return a().getFloat(str);
    }

    public int getInt(String str) {
        return a().getInt(str);
    }

    @Deprecated
    public boolean getLatestBoolean(String str) {
        return b().getBoolean(str);
    }

    @Nullable
    public Boolean getLatestBooleanOrNull(String str) {
        return b().getBooleanOrNull(str);
    }

    @Deprecated
    public double getLatestDouble(String str) {
        return b().getDouble(str);
    }

    @Nullable
    public Double getLatestDoubleOrNull(String str) {
        return b().getDoubleOrNull(str);
    }

    @Deprecated
    public float getLatestFloat(String str) {
        return b().getFloat(str);
    }

    @Nullable
    public Float getLatestFloatOrNull(String str) {
        return b().getFloatOrNull(str);
    }

    @Deprecated
    public int getLatestInt(String str) {
        return b().getInt(str);
    }

    @Nullable
    public Integer getLatestIntOrNull(String str) {
        return b().getIntOrNull(str);
    }

    @Deprecated
    public long getLatestLong(String str) {
        return b().getLong(str);
    }

    @Nullable
    public Long getLatestLongOrNull(String str) {
        return b().getLongOrNull(str);
    }

    @Deprecated
    public String getLatestString(String str) {
        return b().getString(str);
    }

    @Nullable
    public String getLatestStringOrNull(String str) {
        return b().getString(str);
    }

    public long getLong(String str) {
        return a().getLong(str);
    }

    public String getString(String str) {
        return a().getString(str);
    }

    public synchronized void init(@NonNull Context context, @NonNull OmicronConfig omicronConfig) {
        try {
            if (this.a != null) {
                return;
            }
            SerializationDataStorage serializationDataStorage = new SerializationDataStorage(new File(context.getFilesDir(), "push_sdk_omicron"), omicronConfig.f);
            NetworkDataRetriever networkDataRetriever = new NetworkDataRetriever(omicronConfig.m, new ResponseParserImpl(omicronConfig.f), omicronConfig.f);
            SharedPreferencesUpdateTimetable sharedPreferencesUpdateTimetable = new SharedPreferencesUpdateTimetable(Preference.h(context, 0, "push_sdk_omicron_".concat("timetable")), omicronConfig.n);
            DefaultExecutorFactory defaultExecutorFactory = new DefaultExecutorFactory();
            SharedPreferences h = Preference.h(context, 0, "push_sdk_omicron_".concat("session_counter"));
            int versionCode = PackageInfoUtil.getVersionCode(context);
            SessionCounter sessionCounter = new SessionCounter(h, versionCode);
            h.edit().putInt("current_count", (versionCode != h.getInt("last_version_code", -1) ? 0 : h.getInt("current_count", 0)) + 1).putInt("total_count", h.getInt("total_count", 0) + 1).putInt("last_version_code", versionCode).apply();
            omicronConfig.e.add(new DeviceFingerprint(context, omicronConfig.o));
            omicronConfig.e.add(new AppFingerprint(context));
            omicronConfig.e.add(new SessionFingerprint(sessionCounter));
            a aVar = new a(serializationDataStorage, networkDataRetriever, sharedPreferencesUpdateTimetable, omicronConfig.n, defaultExecutorFactory);
            int i = a.C1732a.a[omicronConfig.j.ordinal()];
            this.a = i != 1 ? i != 2 ? aVar.new d(omicronConfig) : aVar.new c(omicronConfig) : aVar.new e(omicronConfig);
            if (omicronConfig.l) {
                a.this.a.clearData();
                a.b bVar = this.a;
                a.this.c.setNeedUpdate(bVar.d);
            }
            a.b bVar2 = this.a;
            Data a = bVar2.a();
            bVar2.b = a;
            bVar2.a.set(a);
            SegmentsHolder.registerProvider(new SegmentsProvider() { // from class: xsna.p080
                @Override // com.vk.push.core.remote.config.omicron.segment.SegmentsProvider
                public final Map getSegments() {
                    Data data = Omicron.this.a.b;
                    if (data != null) {
                        return data.getSegments();
                    }
                    throw new IllegalStateException("init() must be called before any access to logic");
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void needUpdateCache() {
        if (this.a == null) {
            throw new IllegalStateException("Should be called after 'init' method");
        }
        a.b bVar = this.a;
        a.this.c.setNeedUpdate(bVar.d);
        a.b bVar2 = this.a;
        Data a = bVar2.a();
        bVar2.b = a;
        bVar2.a.set(a);
    }

    public synchronized void reInit() {
        if (this.a == null) {
            throw new IllegalStateException("Should be called after 'init' method");
        }
        a.b bVar = this.a;
        Data a = bVar.a();
        bVar.b = a;
        bVar.a.set(a);
    }

    public boolean getBoolean(String str, boolean z) {
        return a().getBoolean(str, z);
    }

    public double getDouble(String str, double d) {
        return a().getDouble(str, d);
    }

    public float getFloat(String str, float f) {
        return a().getFloat(str, f);
    }

    public int getInt(String str, int i) {
        return a().getInt(str, i);
    }

    public boolean getLatestBoolean(String str, boolean z) {
        return b().getBoolean(str, z);
    }

    public double getLatestDouble(String str, double d) {
        return b().getDouble(str, d);
    }

    public float getLatestFloat(String str, float f) {
        return b().getFloat(str, f);
    }

    public int getLatestInt(String str, int i) {
        return b().getInt(str, i);
    }

    public long getLatestLong(String str, long j) {
        return b().getLong(str, j);
    }

    public String getLatestString(String str, String str2) {
        return b().getString(str, str2);
    }

    public long getLong(String str, long j) {
        return a().getLong(str, j);
    }

    public String getString(String str, String str2) {
        return a().getString(str, str2);
    }
}
