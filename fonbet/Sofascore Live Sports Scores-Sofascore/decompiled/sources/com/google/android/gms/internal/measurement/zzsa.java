package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import com.ironsource.B1;
import com.unity3d.ads.BuildConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzsa {
    public static final Pattern a = Pattern.compile("[a-z]+(_[a-z]+)*");
    public static final Account b = zzrv.a;
    public static final Set c = Collections.unmodifiableSet(new HashSet(Arrays.asList(BuildConfig.FLAVOR, "unused", "special", "reserved", "shared", "virtual", "managed")));
    public static final Set d = Collections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", B1.e)));
}
