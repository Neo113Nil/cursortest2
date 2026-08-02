package com.vk.id.onetap.compose.button.auth;

import Sc.o;
import android.content.res.Resources;
import com.vk.id.VKIDUser;
import com.vk.id.onetap.compose.R$string;
import com.vk.id.onetap.compose.onetap.OneTapTitleScenario;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/vk/id/onetap/compose/button/auth/DefaultTextProvider;", "Lcom/vk/id/onetap/compose/button/auth/VKIDButtonTextProvider;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "userFoundText", "", "user", "Lcom/vk/id/VKIDUser;", "scenario", "Lcom/vk/id/onetap/compose/onetap/OneTapTitleScenario;", "userFoundShortText", "noUserText", "noUserShortText", "onetap-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DefaultTextProvider implements VKIDButtonTextProvider {

    @NotNull
    private final Resources resources;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OneTapTitleScenario.values().length];
            try {
                iArr[OneTapTitleScenario.SignIn.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OneTapTitleScenario.SignUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OneTapTitleScenario.Get.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OneTapTitleScenario.Open.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OneTapTitleScenario.Calculate.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OneTapTitleScenario.Order.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OneTapTitleScenario.PlaceOrder.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OneTapTitleScenario.SendRequest.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[OneTapTitleScenario.Participate.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultTextProvider(@NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.vk.id.onetap.compose.button.auth.VKIDButtonTextProvider
    @NotNull
    public String noUserShortText(@NotNull OneTapTitleScenario scenario) {
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        String string = this.resources.getString(R$string.vkid_log_in_with_vkid_short);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.vk.id.onetap.compose.button.auth.VKIDButtonTextProvider
    @NotNull
    public String noUserText(@NotNull OneTapTitleScenario scenario) {
        int i11;
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        switch (WhenMappings.$EnumSwitchMapping$0[scenario.ordinal()]) {
            case 1:
                i11 = R$string.vkid_log_in_with_vkid;
                break;
            case 2:
                i11 = R$string.vkid_sign_up_with_vkid;
                break;
            case 3:
                i11 = R$string.vkid_get_with_vkid;
                break;
            case 4:
                i11 = R$string.vkid_open_with_vkid;
                break;
            case 5:
                i11 = R$string.vkid_calculate_with_vkid;
                break;
            case 6:
                i11 = R$string.vkid_order_with_vkid;
                break;
            case 7:
                i11 = R$string.vkid_place_order_with_vkid;
                break;
            case 8:
                i11 = R$string.vkid_send_request_with_vkid;
                break;
            case 9:
                i11 = R$string.vkid_participate_with_vkid;
                break;
            default:
                throw new o();
        }
        String string = this.resources.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "let(...)");
        return string;
    }

    @Override // com.vk.id.onetap.compose.button.auth.VKIDButtonTextProvider
    @NotNull
    public String userFoundShortText(@NotNull VKIDUser user, @NotNull OneTapTitleScenario scenario) {
        int i11;
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        switch (WhenMappings.$EnumSwitchMapping$0[scenario.ordinal()]) {
            case 1:
                i11 = R$string.vkid_log_in;
                break;
            case 2:
                i11 = R$string.vkid_sign_up;
                break;
            case 3:
                i11 = R$string.vkid_get;
                break;
            case 4:
                i11 = R$string.vkid_open;
                break;
            case 5:
                i11 = R$string.vkid_calculate;
                break;
            case 6:
                i11 = R$string.vkid_order;
                break;
            case 7:
                i11 = R$string.vkid_place_order;
                break;
            case 8:
                i11 = R$string.vkid_send_request;
                break;
            case 9:
                i11 = R$string.vkid_participate;
                break;
            default:
                throw new o();
        }
        String string = this.resources.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "let(...)");
        return string;
    }

    @Override // com.vk.id.onetap.compose.button.auth.VKIDButtonTextProvider
    @NotNull
    public String userFoundText(@NotNull VKIDUser user, @NotNull OneTapTitleScenario scenario) {
        int i11;
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        switch (WhenMappings.$EnumSwitchMapping$0[scenario.ordinal()]) {
            case 1:
                i11 = R$string.vkid_log_in_as;
                break;
            case 2:
                i11 = R$string.vkid_sign_up_as;
                break;
            case 3:
                i11 = R$string.vkid_get_as;
                break;
            case 4:
                i11 = R$string.vkid_open_as;
                break;
            case 5:
                i11 = R$string.vkid_calculate_as;
                break;
            case 6:
                i11 = R$string.vkid_order_as;
                break;
            case 7:
                i11 = R$string.vkid_place_order_as;
                break;
            case 8:
                i11 = R$string.vkid_send_request_as;
                break;
            case 9:
                i11 = R$string.vkid_participate_as;
                break;
            default:
                throw new o();
        }
        String string = this.resources.getString(i11, user.getFirstName());
        Intrinsics.checkNotNullExpressionValue(string, "let(...)");
        return string;
    }
}
