package com.vk.push.pushsdk.masterhost.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.gzs;
import xsna.zcl;

/* compiled from: HostAppInfo.kt */
/* loaded from: classes5.dex */
public final class HostAppInfo implements Parcelable {
    private static final String HOST_VERSION = "host_version";
    private static final String IS_IGNORING_BATTERY_OPTIMIZATIONS = "is_ignoring_battery_optimizations";
    private static final String PACKAGE_NAME = "package_name";
    private final Lazy jsonObject$delegate;
    private final String jsonValue;
    public static final b Companion = new b();
    public static final Parcelable.Creator<HostAppInfo> CREATOR = new a();

    /* compiled from: HostAppInfo.kt */
    public static final class a implements Parcelable.Creator<HostAppInfo> {
        @Override // android.os.Parcelable.Creator
        public final HostAppInfo createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            if (readString == null) {
                readString = "";
            }
            return new HostAppInfo(readString, null);
        }

        @Override // android.os.Parcelable.Creator
        public final HostAppInfo[] newArray(int i) {
            return new HostAppInfo[i];
        }
    }

    /* compiled from: HostAppInfo.kt */
    public static final class b {
        public static HostAppInfo a(String str, boolean z) {
            return new HostAppInfo(new JSONObject().put("package_name", str).put(HostAppInfo.HOST_VERSION, "host_sdk/7.4.0-rc01").put(HostAppInfo.IS_IGNORING_BATTERY_OPTIMIZATIONS, z).toString(), null);
        }
    }

    /* compiled from: HostAppInfo.kt */
    public static final class c extends Lambda implements gzs<JSONObject> {
        public c() {
            super(0);
        }

        @Override // xsna.gzs
        public final JSONObject invoke() {
            return new JSONObject(HostAppInfo.this.jsonValue);
        }
    }

    public /* synthetic */ HostAppInfo(String str, zcl zclVar) {
        this(str);
    }

    private final JSONObject getJsonObject() {
        return (JSONObject) this.jsonObject$delegate.getValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getHostAppInfoValue() {
        return this.jsonValue;
    }

    public final String getHostVersion() {
        return getJsonObject().get(HOST_VERSION).toString();
    }

    public final String getPackageName() {
        return getJsonObject().get("package_name").toString();
    }

    public final String isIgnoringBatteryOptimization() {
        return getJsonObject().get(IS_IGNORING_BATTERY_OPTIMIZATIONS).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.jsonValue);
    }

    private HostAppInfo(String str) {
        this.jsonValue = str;
        this.jsonObject$delegate = new bpn0(new c());
    }
}
