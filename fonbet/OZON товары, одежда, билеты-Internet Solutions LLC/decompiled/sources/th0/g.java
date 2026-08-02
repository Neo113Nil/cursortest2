package th0;

import C.C2702w;
import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.internal.token.api.TokenUpdateRequest;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f99536a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f99537b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f99538c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f99539d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f99540e;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99541a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.CORRECT_MIGRATION_FROM_OLD_TO_NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.CORRECT_MIGRATION_FROM_NEW_TO_NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.INCORRECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f99541a = iArr;
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f99542b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f99543c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f99544d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f99545e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11, String str, String str2, g gVar) {
            super(0);
            this.f99542b = z11;
            this.f99543c = str;
            this.f99544d = str2;
            this.f99545e = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "wasMigrated: " + this.f99542b + ", hwId: " + this.f99543c + ", oldHwId: " + this.f99544d + ", isMigrationEnabled: " + this.f99545e.f99539d;
        }
    }

    public g(@NotNull d hwIdsPairHandlingChecker, @NotNull f hwIdsPairTypeResolver, @NotNull SharedPreferences sharedPreferences, boolean z11) {
        Intrinsics.checkNotNullParameter(hwIdsPairHandlingChecker, "hwIdsPairHandlingChecker");
        Intrinsics.checkNotNullParameter(hwIdsPairTypeResolver, "hwIdsPairTypeResolver");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f99536a = hwIdsPairHandlingChecker;
        this.f99537b = hwIdsPairTypeResolver;
        this.f99538c = sharedPreferences;
        this.f99539d = z11;
    }

    private final void c(String str, boolean z11, String str2, String str3, Set<TokenUpdateRequest.TokenInfo> set) {
        int i11 = sh0.b.f98783c;
        Tc.d builder = new Tc.d();
        builder.put("wasMigrated", Boolean.valueOf(z11));
        builder.put("hwId", str2);
        builder.put("oldHwId", str3 == null ? "null" : str3);
        builder.put("isMigrationEnabled", Boolean.valueOf(this.f99539d));
        for (TokenUpdateRequest.TokenInfo tokenInfo : set) {
            builder.put(tokenInfo.getProvider().name(), h.q0(5, tokenInfo.getToken()));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        sh0.b.b(str, null, null, builder.u(), new b(z11, str2, str3, this), 4);
    }

    public final void b(@NotNull String hwId, String str, @NotNull Set<TokenUpdateRequest.TokenInfo> pushTokens) {
        boolean z11;
        Intrinsics.checkNotNullParameter(hwId, "hwId");
        Intrinsics.checkNotNullParameter(pushTokens, "pushTokens");
        if (this.f99536a.a()) {
            Boolean bool = this.f99540e;
            SharedPreferences sharedPreferences = this.f99538c;
            if (bool != null) {
                z11 = bool.booleanValue();
            } else {
                z11 = sharedPreferences.getBoolean("ru.ozon.push.sdk.internal.logging.id.WAS_MIGRATED_KEY", false);
                this.f99540e = Boolean.valueOf(z11);
            }
            boolean z12 = z11;
            int i11 = a.f99541a[this.f99537b.b(hwId, str, z12).ordinal()];
            if (i11 == 1) {
                this.f99540e = Boolean.TRUE;
                C2702w.e(sharedPreferences, "ru.ozon.push.sdk.internal.logging.id.WAS_MIGRATED_KEY", true);
            } else if (i11 == 2) {
                c("MigrationFromNewToNew", z12, hwId, str, pushTokens);
            } else {
                if (i11 != 3) {
                    return;
                }
                c("MigrationIncorrect", z12, hwId, str, pushTokens);
            }
        }
    }
}
