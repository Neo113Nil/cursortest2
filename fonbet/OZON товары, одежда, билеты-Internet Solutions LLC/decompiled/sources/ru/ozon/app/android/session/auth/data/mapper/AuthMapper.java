package ru.ozon.app.android.session.auth.data.mapper;

import B0.C2454a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.domain.session.storage.AuthOriginStorage;
import ru.ozon.app.android.session.auth.data.AuthDTO;
import ru.ozon.app.android.session.auth.data.AuthVO;
import ru.ozon.app.android.session.auth.data.alertentry.AlertEntry;
import ru.ozon.app.android.session.auth.data.alertentry.AlertEntryMapperKt;
import ru.ozon.app.android.session.auth.data.biometry.BiometryEntry;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004*\b\u0012\u0004\u0012\u00020\r0\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ#\u0010\u000b\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u000b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u000b\u0010\u001bJ\u0013\u0010\u000b\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u000b\u0010\u001eJ)\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004*\b\u0012\u0004\u0012\u00020\u001f0\u00042\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\u00020\u001f*\u00020$H\u0002¢\u0006\u0004\b%\u0010&J*\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010'\u001a\u00020\u00022\n\u0010)\u001a\u00060\u0003j\u0002`(H\u0096\u0002¢\u0006\u0004\b*\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/session/auth/data/mapper/AuthMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/session/auth/data/AuthDTO;", "Ll20/d;", "", "Lru/ozon/app/android/session/auth/data/AuthVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/domain/session/storage/AuthOriginStorage;", "authOriginStorage", "<init>", "(Lru/ozon/app/android/domain/session/storage/AuthOriginStorage;)V", "toVO", "(Lru/ozon/app/android/session/auth/data/AuthDTO;)Lru/ozon/app/android/session/auth/data/AuthVO;", "Lru/ozon/app/android/session/auth/data/AuthDTO$Input;", "Lru/ozon/app/android/session/auth/data/AuthVO$Input;", "(Ljava/util/List;)Ljava/util/List;", "", "pos", "lastIndex", "(Lru/ozon/app/android/session/auth/data/AuthDTO$Input;II)Lru/ozon/app/android/session/auth/data/AuthVO$Input;", "", "inputType", "Lru/ozon/app/android/session/auth/data/AuthVO$Input$ViewType;", "viewTypeFromInputType", "(Ljava/lang/String;)Lru/ozon/app/android/session/auth/data/AuthVO$Input$ViewType;", "Lru/ozon/app/android/session/auth/data/AuthDTO$SberIdButton;", "Lru/ozon/app/android/session/auth/data/AuthVO$SberButtonVO;", "(Lru/ozon/app/android/session/auth/data/AuthDTO$SberIdButton;)Lru/ozon/app/android/session/auth/data/AuthVO$SberButtonVO;", "Lru/ozon/app/android/session/auth/data/AuthDTO$Advertisement;", "Lru/ozon/app/android/session/auth/data/AuthVO$Advertisement;", "(Lru/ozon/app/android/session/auth/data/AuthDTO$Advertisement;)Lru/ozon/app/android/session/auth/data/AuthVO$Advertisement;", "Lru/ozon/app/android/session/auth/data/AuthDTO$HintButton;", "Lru/ozon/app/android/session/auth/data/alertentry/AlertEntry;", "alertEntry", "preprocessHintButtons", "(Ljava/util/List;Lru/ozon/app/android/session/auth/data/alertentry/AlertEntry;)Ljava/util/List;", "Lru/ozon/app/android/session/auth/data/biometry/BiometryEntry;", "toHintButton", "(Lru/ozon/app/android/session/auth/data/biometry/BiometryEntry;)Lru/ozon/app/android/session/auth/data/AuthDTO$HintButton;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/session/auth/data/AuthDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/domain/session/storage/AuthOriginStorage;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AuthMapper implements Function2<AuthDTO, d, List<? extends AuthVO>> {

    @NotNull
    private final AuthOriginStorage authOriginStorage;

    public AuthMapper(@NotNull AuthOriginStorage authOriginStorage) {
        Intrinsics.checkNotNullParameter(authOriginStorage, "authOriginStorage");
        this.authOriginStorage = authOriginStorage;
    }

    private final List<AuthDTO.HintButton> preprocessHintButtons(List<AuthDTO.HintButton> list, AlertEntry alertEntry) {
        List<AuthDTO.HintButton> list2;
        if (alertEntry != null) {
            if (!Intrinsics.d(alertEntry.getType(), "biometry") || alertEntry.getBiometry() == null) {
                list2 = list;
            } else {
                list2 = C7714v.p0(list, C7714v.m0(toHintButton(alertEntry.getBiometry())));
            }
            if (list2 != null) {
                return list2;
            }
        }
        return list;
    }

    private final AuthDTO.HintButton toHintButton(BiometryEntry biometryEntry) {
        return new AuthDTO.HintButton(null, biometryEntry.getButtonTitle(), "biometry", biometryEntry.getAction(), C2454a.b("biometry_chalenge", biometryEntry.getChallenge()));
    }

    private final AuthVO toVO(AuthDTO authDTO) {
        long hashCode = (authDTO.getTitle() + "." + authDTO.getSubtitle()).hashCode();
        String title = authDTO.getTitle();
        String origin = authDTO.getOrigin();
        String subtitle = authDTO.getSubtitle();
        List<AuthDTO.Input> inputs = authDTO.getInputs();
        List<AuthVO.Input> vo = inputs != null ? toVO(inputs) : null;
        if (vo == null) {
            vo = K.f71697a;
        }
        List<AuthVO.Input> list = vo;
        AuthDTO.Advertisement advertisement = authDTO.getAdvertisement();
        AuthVO.Advertisement vo2 = advertisement != null ? toVO(advertisement) : null;
        AuthDTO.SubmitButton submitButton = authDTO.getSubmitButton();
        List<AuthDTO.HintButton> preprocessHintButtons = preprocessHintButtons(authDTO.getHintButtons(), authDTO.getAlertEntry());
        AuthDTO.SberIdButton loginBySberIdButton = authDTO.getLoginBySberIdButton();
        AuthVO.SberButtonVO vo3 = loginBySberIdButton != null ? toVO(loginBySberIdButton) : null;
        AlertEntry alertEntry = authDTO.getAlertEntry();
        return new AuthVO(hashCode, title, subtitle, origin, list, vo2, submitButton, preprocessHintButtons, vo3, alertEntry != null ? AlertEntryMapperKt.toVO(alertEntry) : null, authDTO.getDisclaimer(), authDTO.getTermsOfUseText(), authDTO.getTranslationLexemes());
    }

    private final AuthVO.Input.ViewType viewTypeFromInputType(String inputType) {
        return Intrinsics.d(inputType, "password") ? AuthVO.Input.ViewType.PASSWORD : AuthVO.Input.ViewType.INPUT;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AuthVO> invoke(@NotNull AuthDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state));
    }

    private final List<AuthVO.Input> toVO(List<AuthDTO.Input> list) {
        int P11 = C7714v.P(list);
        List<AuthDTO.Input> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(toVO((AuthDTO.Input) obj, i11, P11));
            i11 = i12;
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r1 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AuthVO.Input toVO(AuthDTO.Input input, int i11, int i12) {
        String value;
        AuthVO.Input.ViewType viewTypeFromInputType = viewTypeFromInputType(input.getType());
        String name = input.getName();
        String placeholder = input.getPlaceholder();
        String type = input.getType();
        if (Intrinsics.d(input.getType(), "phone")) {
            value = input.getValue();
            if (value != null) {
                if (value.length() <= 1) {
                    value = null;
                }
            }
            value = "7";
        } else {
            value = input.getValue();
        }
        return new AuthVO.Input(viewTypeFromInputType, name, placeholder, type, value, input.getError(), i11 == 0, i11 == i12 ? 6 : 5, false, 256, null);
    }

    private final AuthVO.SberButtonVO toVO(AuthDTO.SberIdButton sberIdButton) {
        return new AuthVO.SberButtonVO(sberIdButton.getTitle(), sberIdButton.getAuthUriAction(), sberIdButton.getRedirectUriAction(), this.authOriginStorage.pop());
    }

    private final AuthVO.Advertisement toVO(AuthDTO.Advertisement advertisement) {
        return new AuthVO.Advertisement(new CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio(advertisement.getChecked(), false, false, advertisement.getPlaceholder(), null, null, null, CellAtom.Align.ALIGN_TYPE_CENTER, null, new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, null, null, 14, null), true, false, null, null, null, 31094, null), advertisement.getName(), false);
    }
}
