package ub0;

import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.ContentResolver;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.TimeZone;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.id.amf.Amf;
import ru.ozon.id.antibot.FingerprintDTO;

/* renamed from: ub0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10013a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f100506a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C9067a> f100507b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Amf> f100508c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f100509d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f100510e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ub0.a$a, reason: collision with other inner class name */
    public static final class EnumC2205a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC2205a[] $VALUES;
        public static final EnumC2205a Antibot;
        public static final EnumC2205a AsyncOnAuthAppLaunch;
        public static final EnumC2205a AsyncOnLogin;

        @NotNull
        private final String value;

        static {
            EnumC2205a enumC2205a = new EnumC2205a("Antibot", 0, "antibot");
            Antibot = enumC2205a;
            EnumC2205a enumC2205a2 = new EnumC2205a("AsyncOnAuthAppLaunch", 1, "asyncOnAuthAppLaunch");
            AsyncOnAuthAppLaunch = enumC2205a2;
            EnumC2205a enumC2205a3 = new EnumC2205a("AsyncOnLogin", 2, "asyncOnLogin");
            AsyncOnLogin = enumC2205a3;
            EnumC2205a[] enumC2205aArr = {enumC2205a, enumC2205a2, enumC2205a3};
            $VALUES = enumC2205aArr;
            $ENTRIES = Xc.b.a(enumC2205aArr);
        }

        private EnumC2205a(String str, int i11, String str2) {
            this.value = str2;
        }

        public static EnumC2205a valueOf(String str) {
            return (EnumC2205a) Enum.valueOf(EnumC2205a.class, str);
        }

        public static EnumC2205a[] values() {
            return (EnumC2205a[]) $VALUES.clone();
        }

        @NotNull
        public final String a() {
            return this.value;
        }
    }

    /* renamed from: ub0.a$b */
    static final class b extends AbstractC7737t implements Function0<JsonAdapter<FingerprintDTO>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4008j<Moshi> f100511b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC4008j<Moshi> interfaceC4008j) {
            super(0);
            this.f100511b = interfaceC4008j;
        }

        @Override // kotlin.jvm.functions.Function0
        public final JsonAdapter<FingerprintDTO> invoke() {
            return this.f100511b.getValue().c(FingerprintDTO.class);
        }
    }

    public C10013a(@NotNull Fb0.f ozonIdConfig, @NotNull InterfaceC4008j<Moshi> moshi, @NotNull Application application, @NotNull InterfaceC4008j<C9067a> networkInfoProvider, @NotNull InterfaceC4008j<Amf> amf) {
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(amf, "amf");
        this.f100506a = application;
        this.f100507b = networkInfoProvider;
        this.f100508c = amf;
        this.f100509d = ozonIdConfig.getPrimaryDomain().n();
        this.f100510e = k.b(new b(moshi));
    }

    public final String a(@NotNull EnumC2205a type, String str) {
        int i11;
        String str2;
        String str3;
        String str4;
        Integer num;
        Integer num2;
        Integer num3;
        String str5;
        Integer num4;
        String str6;
        int i12;
        byte[] v11;
        String a11;
        String str7;
        String str8;
        long longVersionCode;
        Intrinsics.checkNotNullParameter(type, "type");
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        Application application = this.f100506a;
        PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            i11 = (int) longVersionCode;
        } else {
            i11 = packageInfo.versionCode;
        }
        String languageTags = Resources.getSystem().getConfiguration().getLocales().toLanguageTags();
        Intrinsics.checkNotNullExpressionValue(languageTags, "toLanguageTags(...)");
        List l11 = kotlin.text.h.l(languageTags, new char[]{','}, 0, 6);
        TimeZone timeZone = TimeZone.getDefault();
        KeyguardManager keyguardManager = (KeyguardManager) androidx.core.content.a.getSystemService(application, KeyguardManager.class);
        ContentResolver contentResolver = application.getContentResolver();
        String a12 = type.a();
        String str9 = Build.MODEL;
        String str10 = Build.MANUFACTURER;
        String str11 = Build.BRAND;
        String str12 = Build.HARDWARE;
        String str13 = Build.BOARD;
        String str14 = Build.DEVICE;
        String str15 = Build.PRODUCT;
        Integer valueOf = Integer.valueOf(i13);
        String str16 = Build.VERSION.RELEASE;
        String str17 = Build.VERSION.SECURITY_PATCH;
        String str18 = Build.ID;
        String radioVersion = Build.getRadioVersion();
        String str19 = Build.FINGERPRINT;
        String str20 = Build.TAGS;
        String str21 = Build.TYPE;
        Long valueOf2 = Long.valueOf(Build.TIME);
        String str22 = Build.USER;
        String str23 = Build.BOOTLOADER;
        String str24 = i13 >= 31 ? Build.SKU : null;
        String str25 = i13 >= 31 ? Build.ODM_SKU : null;
        String str26 = Build.DISPLAY;
        String str27 = Build.HOST;
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        List f02 = C7705l.f0(SUPPORTED_ABIS);
        if (i13 >= 31) {
            str8 = Build.SOC_MANUFACTURER;
            str2 = str8;
        } else {
            str2 = null;
        }
        if (i13 >= 31) {
            str7 = Build.SOC_MODEL;
            str3 = str7;
        } else {
            str3 = null;
        }
        Integer valueOf3 = Integer.valueOf(displayMetrics.widthPixels);
        Integer valueOf4 = Integer.valueOf(displayMetrics.heightPixels);
        Float valueOf5 = Float.valueOf(displayMetrics.density);
        Float valueOf6 = Float.valueOf(displayMetrics.xdpi);
        Float valueOf7 = Float.valueOf(displayMetrics.ydpi);
        String str28 = packageInfo.packageName;
        String str29 = packageInfo.versionName;
        Long valueOf8 = Long.valueOf(packageInfo.firstInstallTime);
        Long valueOf9 = Long.valueOf(packageInfo.lastUpdateTime);
        Integer valueOf10 = Integer.valueOf(i11);
        String id2 = timeZone.getID();
        Integer valueOf11 = Integer.valueOf(timeZone.getRawOffset());
        String displayName = timeZone.getDisplayName();
        Boolean valueOf12 = keyguardManager != null ? Boolean.valueOf(keyguardManager.isDeviceSecure()) : null;
        Boolean valueOf13 = Boolean.valueOf((application.getApplicationInfo().flags & 2) != 0);
        InterfaceC4008j<C9067a> interfaceC4008j = this.f100507b;
        String name = C9067a.g(interfaceC4008j.getValue()).name();
        Boolean n11 = interfaceC4008j.getValue().n();
        Boolean valueOf14 = Boolean.valueOf(Jg0.a.a(application));
        try {
            str4 = Settings.Secure.getString(contentResolver, "android_id");
        } catch (Throwable unused) {
            str4 = null;
        }
        try {
            num = Integer.valueOf(Settings.Global.getInt(contentResolver, "development_settings_enabled"));
        } catch (Throwable unused2) {
            num = null;
        }
        try {
            num2 = Integer.valueOf(Settings.Global.getInt(contentResolver, "adb_enabled"));
        } catch (Throwable unused3) {
            num2 = null;
        }
        try {
            num3 = Integer.valueOf(Settings.Global.getInt(contentResolver, "stay_on_while_plugged_in"));
        } catch (Throwable unused4) {
            num3 = null;
        }
        try {
            str5 = Settings.Global.getString(contentResolver, "debug_app");
        } catch (Throwable unused5) {
            str5 = null;
        }
        try {
            num4 = Integer.valueOf(Settings.Global.getInt(contentResolver, "wait_for_debugger"));
        } catch (Throwable unused6) {
            num4 = null;
        }
        try {
            str6 = Hg0.a.c("ro.boot.qemu", null);
        } catch (Throwable unused7) {
            str6 = null;
        }
        String json = ((JsonAdapter) this.f100510e.getValue()).toJson(new FingerprintDTO(a12, str9, str10, str11, str12, str13, str14, str15, valueOf, str16, str17, str18, radioVersion, str19, str20, str21, valueOf2, str22, str23, str24, str25, str26, str27, f02, str2, str3, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, str28, str29, valueOf8, valueOf9, valueOf10, l11, id2, valueOf11, displayName, valueOf12, valueOf13, name, n11, valueOf14, null, str4, num, num2, num3, str5, num4, str6, "14.8.1"));
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        try {
            Iterator it = Arrays.asList(new i[0]).iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            i iVar = it.hasNext() ? (i) it.next() : null;
            if (iVar != null && (a11 = iVar.a()) != null) {
                json = a11;
            }
            byte[] a13 = this.f100508c.getValue().a();
            if (a13 == null) {
                return null;
            }
            byte[] bArr = null;
            if (str != null) {
                bArr = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bArr, "getBytes(...)");
            }
            byte[] bytes = (System.currentTimeMillis() + "," + json).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            Cipher cipher = Cipher.getInstance(kotlin.text.h.x(C7705l.v(67, 84, a13)));
            if (this.f100509d) {
                v11 = C7705l.v(32, 64, a13);
                i12 = 0;
            } else {
                i12 = 0;
                v11 = C7705l.v(0, 32, a13);
            }
            if (bArr != null) {
                v11 = C7705l.S(C7705l.v(i12, 24, v11), C7705l.v(bArr.length - 8, bArr.length, bArr));
            }
            cipher.init(1, new SecretKeySpec(v11, kotlin.text.h.x(C7705l.v(64, 67, a13))));
            byte[] doFinal = cipher.doFinal(bytes);
            byte[] iv = cipher.getIV();
            Intrinsics.checkNotNullExpressionValue(iv, "getIV(...)");
            Intrinsics.f(doFinal);
            String encodeToString = Base64.encodeToString(C7705l.S(iv, doFinal), 2);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
            return encodeToString;
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
