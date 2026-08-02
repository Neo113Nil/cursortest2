package g70;

import Ae.O0;
import Ae.x0;
import android.content.Context;
import g30.InterfaceC6618a;
import h3.C6788a;
import h70.a;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import n70.EnumC8449a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.offline.data.model.main.MainData;
import ru.ozon.fintech.features.offline.data.model.transfer.BankInfo;
import ru.ozon.fintech.features.offline.data.model.transfer.TransferData;
import ru.ozon.fintech.features.offline.ui.accountcard.AccountCardState;
import ru.ozon.fintech.features.offline.ui.itemcard.IconTextCardState;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import xe.C10720e0;
import xe.C10727i;

/* loaded from: classes3.dex */
public final class f extends E30.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f63954a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f63955b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d70.d f63956c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final V60.a f63957d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f63958e;

    /* renamed from: f, reason: collision with root package name */
    private String f63959f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final x0<h70.a> f63960g;

    /* renamed from: h, reason: collision with root package name */
    private MainData f63961h;

    /* renamed from: i, reason: collision with root package name */
    private TransferData f63962i;

    public f(@NotNull Context context, @NotNull S80.b fintechNavigation, @NotNull d70.d offlineManager, @NotNull V60.a offlineRepository, @NotNull InterfaceC6618a analyticInteractor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(offlineManager, "offlineManager");
        Intrinsics.checkNotNullParameter(offlineRepository, "offlineRepository");
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        this.f63954a = context;
        this.f63955b = fintechNavigation;
        this.f63956c = offlineManager;
        this.f63957d = offlineRepository;
        this.f63958e = analyticInteractor;
        this.f63960g = O0.a(null);
    }

    public static final void d0(f fVar) {
        String supportPhone;
        fVar.f63958e.T();
        MainData mainData = fVar.f63961h;
        if (mainData == null || (supportPhone = mainData.getSupportPhone()) == null) {
            return;
        }
        fVar.f63955b.v(supportPhone);
    }

    public static final void f0(f fVar) {
        TransferData transferData;
        List<BankInfo> banks;
        List<String> activeBlocks;
        TransferData transferData2 = fVar.f63962i;
        S80.b bVar = fVar.f63955b;
        if ((transferData2 != null && (activeBlocks = transferData2.getActiveBlocks()) != null && activeBlocks.contains("TERRORIST")) || (((transferData = fVar.f63962i) != null && (banks = transferData.getBanks()) != null && banks.isEmpty()) || !fVar.f63957d.b())) {
            String str = fVar.f63959f;
            if (str != null) {
                bVar.q(str, "COMMON_ERROR", null);
                return;
            } else {
                Intrinsics.n("uuid");
                throw null;
            }
        }
        TransferData transferData3 = fVar.f63962i;
        if (Intrinsics.d(transferData3 != null ? transferData3.getIdentificationLevel() : null, "ANON")) {
            String str2 = fVar.f63959f;
            if (str2 != null) {
                bVar.q(str2, "CONFIRM_FACE", null);
                return;
            } else {
                Intrinsics.n("uuid");
                throw null;
            }
        }
        TransferData transferData4 = fVar.f63962i;
        if (transferData4 == null || transferData4.getSmsPaymentsFlagValue()) {
            bVar.C();
            return;
        }
        String str3 = fVar.f63959f;
        if (str3 != null) {
            bVar.q(str3, "TRANSFER_DISABLE_IN_SETTINGS", null);
        } else {
            Intrinsics.n("uuid");
            throw null;
        }
    }

    public static final void g0(f fVar) {
        MainData mainData = fVar.f63961h;
        if (mainData == null) {
            return;
        }
        TextAtom textAtom = new TextAtom(OzonSpannableStringKt.toOzonSpannableString(mainData.getClient().getName()), null, UniColors.TEXT_PRIMARY.getToken(), 1, null, null, null, 114, null);
        String avatarUrl = mainData.getClient().getAvatarUrl();
        if (avatarUrl == null) {
            avatarUrl = "ic_s_anonymous_filled_compact";
        }
        FinToolbarState finToolbarState = new FinToolbarState(null, null, null, null, textAtom, null, mainData.getClient().getAvatarUrl() == null ? "graphicTertiary" : null, avatarUrl, null, null, null, null, null, null, null, null, 0, 130863, null);
        a.b bVar = new a.b(a.c.WARNING);
        String e11 = U7.d.e(d70.c.g(mainData.getAccountData().getBalanceCents()), " ₽");
        Object[] objArr = {d70.c.c(mainData.getAccountData().getUpdatedAtMs())};
        Context context = fVar.f63954a;
        String string = context.getString(R.string.offline_actually, objArr);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        AccountCardState accountCardState = new AccountCardState("main_account_view", "Основной счёт", e11, string, "ic_m_rubles_filled", "ic_s_info_filled");
        String string2 = context.getString(R.string.offline_transfer);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        IconTextCardState iconTextCardState = new IconTextCardState("card_sbp_view", "ic_m_multicolor_sbp", null, string2, new c(1, fVar, f.class, "goSBP", "goSBP(Ljava/lang/String;)V", 0), 4, null);
        String string3 = context.getString(R.string.offline_call);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        fVar.f63960g.setValue(new h70.a(finToolbarState, bVar, accountCardState, iconTextCardState, new IconTextCardState("card_call_center_view", "ic_m_support_line_filled", "oz_semantic_text_action", string3, new d(1, fVar, f.class, "callSupport", "callSupport(Ljava/lang/String;)V", 0)), C7714v.U0(EnumC8449a.a()), new a.C1054a()));
    }

    @NotNull
    public final x0<h70.a> j0() {
        return this.f63960g;
    }

    public final void k0() {
        String str = this.f63959f;
        if (str != null) {
            this.f63955b.q(str, "WHATS_AVAILABLE_OFFLINE", null);
        } else {
            Intrinsics.n("uuid");
            throw null;
        }
    }

    public final void l0(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f63959f = uuid;
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new e(this, null), 2);
    }

    public final void m0() {
        this.f63958e.a2("offline_main", false);
    }

    public final void n0() {
        this.f63956c.f();
    }

    public final void onBackPressed() {
        this.f63956c.b();
    }
}
