package ru.ozon.android.messenger.blocks.alert;

import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.viewmapper.e;
import ru.ozon.android.messenger.framework.domain.f;
import ru.ozon.android.messenger.framework.presentation.models.h;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.u;
import ru.ozon.android.messenger.framework.presentation.models.v;
import ru.ozon.android.messenger.utils.n;
import ru.ozon.android.networkinfo.models.NetworkInfo;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C1470a f84375c = new C1470a();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String[] f84376d = {"networkErrorUnknown", "networkErrorRetry", "networkErrorUpdate"};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f84377a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.b f84378b;

    /* renamed from: ru.ozon.android.messenger.blocks.alert.a$a, reason: collision with other inner class name */
    public static final class C1470a {
    }

    public a(@NotNull Context context, @NotNull ru.ozon.android.messenger.framework.data.b blockStore) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(blockStore, "blockStore");
        this.f84377a = context;
        this.f84378b = blockStore;
    }

    public static q e(a aVar, String str, Integer num, String icon, DisclaimerDTO.MainButton mainButton, DisclaimerDTO.Theme theme, Long l11, int i11) {
        if ((i11 & 1) != 0) {
            str = n.a();
        }
        String itemId = str;
        DisclaimerDTO.MainButton mainButton2 = (i11 & 16) != 0 ? null : mainButton;
        if ((i11 & 64) != 0) {
            theme = DisclaimerDTO.Theme.NEGATIVE;
        }
        DisclaimerDTO.Theme theme2 = theme;
        Long l12 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : l11;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(theme2, "theme");
        return aVar.d(itemId, null, ru.ozon.android.messenger.utils.c.d(num.intValue(), aVar.f84377a), icon, mainButton2, theme2, l12);
    }

    @NotNull
    public final q b(Long l11) {
        return e(this, "button_alert", Integer.valueOf(R$string.messenger_error_click_chat_button), "ic_m_danger", null, null, l11, 114);
    }

    @NotNull
    public final q c() {
        int i11 = R$string.messenger_error_permission_description;
        DisclaimerDTO.Theme theme = DisclaimerDTO.Theme.WARNING;
        String string = this.f84377a.getString(R$string.messenger_go_to_settings);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return e(this, "button_alert", Integer.valueOf(i11), "m_ic_disclaimer", new DisclaimerDTO.MainButton(string, DisclaimerDTO.ButtonTheme.PRIMARY, null, new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, ru.ozon.android.messenger.framework.navigation.action.d.GO_TO_SETTINGS.a(), null, 10, null), null, null, 6, null), 4, null), theme, null, 34);
    }

    @NotNull
    public final q d(@NotNull String itemId, String str, String str2, @NotNull String icon, DisclaimerDTO.MainButton mainButton, @NotNull DisclaimerDTO.Theme theme, Long l11) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return v.d(new u(new g(h.a(itemId), l11, new DisclaimerDTO(str != null ? OzonSpannableStringKt.toOzonSpannableString(str) : null, str2 != null ? OzonSpannableStringKt.toOzonSpannableString(str2) : null, theme, null, icon, mainButton, null, null, null, null, false, null, null, 8072, null)), ru.ozon.android.messenger.framework.data.d.g(this.f84378b, f.c.ALERT), e.b.f87375a), itemId);
    }

    @NotNull
    public final q f(@NotNull NetworkInfo networkInfo) {
        Intrinsics.checkNotNullParameter(networkInfo, "networkInfo");
        Integer valueOf = Integer.valueOf(networkInfo instanceof NetworkInfo.Available ? R$string.messenger_error_smth_went_wrong_title : R$string.messenger_error_no_connection_title);
        String string = this.f84377a.getString(R$string.messenger_resend_message);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return e(this, "networkErrorRetry", valueOf, "m_ic_disclaimer", new DisclaimerDTO.MainButton(string, DisclaimerDTO.ButtonTheme.PRIMARY, null, new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, ru.ozon.android.messenger.framework.navigation.action.d.RESEND_UNDELIVERED_MESSAGE.a(), null, 10, null), null, null, 6, null), 4, null), null, null, 226);
    }
}
