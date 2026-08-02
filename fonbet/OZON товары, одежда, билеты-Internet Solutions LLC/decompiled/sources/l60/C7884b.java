package l60;

import Sc.o;
import U50.j;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: l60.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7884b implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final L30.d f72911a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0<String> f72912b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f72913c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0<String> f72914d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: l60.b$a */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ERROR;
        public static final a HEAVY;
        public static final a LIGHT;
        public static final a MEDIUM;
        public static final a RIGID;
        public static final a SELECTION;
        public static final a SOFT;
        public static final a SUCCESS;
        public static final a UNDEFINED;
        public static final a WARNING;

        static {
            a aVar = new a("SELECTION", 0);
            SELECTION = aVar;
            a aVar2 = new a("ERROR", 1);
            ERROR = aVar2;
            a aVar3 = new a("WARNING", 2);
            WARNING = aVar3;
            a aVar4 = new a("SUCCESS", 3);
            SUCCESS = aVar4;
            a aVar5 = new a("UNDEFINED", 4);
            UNDEFINED = aVar5;
            a aVar6 = new a("LIGHT", 5);
            LIGHT = aVar6;
            a aVar7 = new a("MEDIUM", 6);
            MEDIUM = aVar7;
            a aVar8 = new a("HEAVY", 7);
            HEAVY = aVar8;
            a aVar9 = new a("RIGID", 8);
            RIGID = aVar9;
            a aVar10 = new a("SOFT", 9);
            SOFT = aVar10;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* renamed from: l60.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C1215b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72915a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.SELECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.LIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.MEDIUM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.HEAVY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a.RIGID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[a.SOFT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f72915a = iArr;
        }
    }

    public C7884b(@NotNull L30.d finVibrator, Function0<String> function0, @NotNull InterfaceC6618a fintechAnalyticInteractor, Function0<String> function02) {
        Intrinsics.checkNotNullParameter(finVibrator, "finVibrator");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f72911a = finVibrator;
        this.f72912b = function0;
        this.f72913c = fintechAnalyticInteractor;
        this.f72914d = function02;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "call_tap_tic";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((j) callback).invoke(handleSync(weakReference, parameterJson));
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        a aVar = a.UNDEFINED;
        Function0<String> function0 = this.f72912b;
        this.f72913c.d(function0 != null ? function0.invoke() : null, this.f72914d.invoke());
        try {
            String string = new JSONObject(parameterJson).getString("type");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String upperCase = string.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            aVar = a.valueOf(upperCase);
        } catch (IllegalArgumentException e11) {
            L80.a.b("CallTapTicBridgeInterface", "can't parse haptic type, fallback to default haptic effect e=" + e11);
        }
        int i11 = C1215b.f72915a[aVar.ordinal()];
        L30.d dVar = this.f72911a;
        switch (i11) {
            case 1:
                dVar.c();
                break;
            case 2:
                dVar.d();
                break;
            case 3:
                dVar.e();
                break;
            case 4:
                dVar.b();
                break;
            case 5:
                dVar.c();
                break;
            case 6:
                dVar.f(50L);
                break;
            case 7:
                dVar.f(100L);
                break;
            case 8:
                dVar.f(200L);
                break;
            case 9:
                dVar.f(150L);
                break;
            case 10:
                dVar.f(75L);
                break;
            default:
                throw new o();
        }
        NativeResult.Success.INSTANCE.getClass();
        return NativeResult.Success.DEFAULT;
    }
}
