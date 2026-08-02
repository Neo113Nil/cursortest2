package um0;

import android.content.Context;
import android.provider.Settings;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f100838a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private String f100839b;

    public d(@NotNull Context appContext, @NotNull b deviceIdPreferences) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(deviceIdPreferences, "deviceIdPreferences");
        this.f100838a = appContext;
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        String string = appContext.getSharedPreferences("clickstream_lite_prefs_device_id", 0).getString("deviceId", "");
        this.f100839b = string != null ? string : "";
    }

    private final String a() {
        String androidId = Settings.System.getString(this.f100838a.getContentResolver(), "android_id");
        Intrinsics.checkNotNullExpressionValue(androidId, "androidId");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = androidId.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        messageDigest.update(bytes);
        byte[] hash = messageDigest.digest();
        StringBuilder sb2 = new StringBuilder();
        Intrinsics.checkNotNullExpressionValue(hash, "hash");
        for (byte b11 : hash) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b11)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
            sb2.append(format);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "hexString.toString()");
        return h.z0(new Regex("[\\r\\n\\t]").replace(sb3, "")).toString();
    }

    @Override // um0.c
    @NotNull
    public final String getDeviceId() {
        if (this.f100839b.length() == 0) {
            synchronized (this) {
                try {
                    if (this.f100839b.length() == 0) {
                        String deviceId = a();
                        this.f100839b = deviceId;
                        Context appContext = this.f100838a;
                        Intrinsics.checkNotNullParameter(appContext, "appContext");
                        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
                        appContext.getSharedPreferences("clickstream_lite_prefs_device_id", 0).edit().putString("deviceId", deviceId).apply();
                    }
                    Unit unit = Unit.f71690a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f100839b;
    }
}
