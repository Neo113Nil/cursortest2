package t60;

import Sc.o;
import U50.j;
import androidx.fragment.app.r;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.permissions.PermissionsStatusData;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import s90.C9635d;
import s90.InterfaceC9636e;
import t90.AbstractC9782b;

/* loaded from: classes3.dex */
public final class d implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    private final r90.f f99221a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Moshi f99222b;

    public d(@NotNull Moshi moshi, r90.f fVar) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f99221a = fVar;
        this.f99222b = moshi;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "get_permission_status";
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0117  */
    @Override // U50.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        String str;
        String str2;
        String str3;
        kotlin.reflect.d<? extends InterfaceC9636e> a11;
        FintechWebView fintechWebView;
        r parentFragmentActivity;
        AbstractC9782b l11;
        FintechWebView fintechWebView2;
        r parentFragmentActivity2;
        FintechWebView fintechWebView3;
        r parentFragmentActivity3;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            str = new JSONObject(parameterJson).getString("permission");
        } catch (Exception e11) {
            L80.a.c("PermissionsStatusBridgeInterface", null, e11);
            str = null;
        }
        if (str != null && (a11 = b.a(str)) != null) {
            boolean equals = a11.equals(N.b(s90.f.class));
            r90.f fVar = this.f99221a;
            if (equals) {
                if (weakReference != null && (fintechWebView3 = weakReference.get()) != null && (parentFragmentActivity3 = fintechWebView3.getParentFragmentActivity()) != null && fVar != null) {
                    l11 = fVar.h(parentFragmentActivity3);
                    if (l11 != null) {
                        Intrinsics.checkNotNullParameter(l11, "<this>");
                        if (l11 instanceof AbstractC9782b.a) {
                            str2 = "GRANTED".toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                        } else if (l11 instanceof AbstractC9782b.C2182b) {
                            str2 = "NEED_RATIONALE_REQUEST".toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                        } else if (l11 instanceof AbstractC9782b.c) {
                            str2 = "NEED_REQUEST".toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                        } else if (l11 instanceof AbstractC9782b.d) {
                            str2 = "NEED_SETTINGS".toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                        } else {
                            if (!(l11 instanceof AbstractC9782b.e)) {
                                throw new o();
                            }
                            str2 = "NOT_DECLARED".toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                        }
                    }
                }
                l11 = null;
                if (l11 != null) {
                }
            } else if (a11.equals(N.b(C9635d.class))) {
                if (weakReference != null && (fintechWebView2 = weakReference.get()) != null && (parentFragmentActivity2 = fintechWebView2.getParentFragmentActivity()) != null && fVar != null) {
                    l11 = fVar.k(parentFragmentActivity2);
                    if (l11 != null) {
                    }
                }
                l11 = null;
                if (l11 != null) {
                }
            } else {
                if (a11.equals(N.b(s90.h.class)) && weakReference != null && (fintechWebView = weakReference.get()) != null && (parentFragmentActivity = fintechWebView.getParentFragmentActivity()) != null && fVar != null) {
                    l11 = fVar.l(parentFragmentActivity);
                    if (l11 != null) {
                    }
                }
                l11 = null;
                if (l11 != null) {
                }
            }
            if (str2 != null) {
                ((j) callback).invoke(new NativeResult.Error("Ошибка при получении статуса разрешения", null, 2, null));
                return;
            }
            try {
                str3 = this.f99222b.c(PermissionsStatusData.class).toJson(new PermissionsStatusData(str2));
            } catch (Throwable th2) {
                th2.printStackTrace();
                str3 = "";
            }
            ((j) callback).invoke(new NativeResult.Success(str3));
            return;
        }
        str2 = null;
        if (str2 != null) {
        }
    }
}
