package ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.presentation.ExternalVerificationVO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u0003j\u0002`\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/data/ExternalVerificationHandlerMobileMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/data/ExternalVerificationDTO;", "Ll20/d;", "", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "toVO", "(Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/data/ExternalVerificationDTO;)Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationVO;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/data/ExternalVerificationDTO;Ll20/d;)Ljava/util/List;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalVerificationHandlerMobileMapper implements Function2<ExternalVerificationDTO, d, List<? extends ExternalVerificationVO>> {
    private final ExternalVerificationVO toVO(ExternalVerificationDTO externalVerificationDTO) {
        return new ExternalVerificationVO(externalVerificationDTO.hashCode(), externalVerificationDTO.getUrl(), externalVerificationDTO.getRedirectUrl(), externalVerificationDTO.getErrorRedirectUrl(), externalVerificationDTO.getAction());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ExternalVerificationVO> invoke(@NotNull ExternalVerificationDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(dto));
    }
}
