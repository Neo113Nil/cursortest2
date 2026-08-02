package ru.ozon.app.android.session.userAdultModalMobile.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.userAdultModalMobile.data.models.UserAdultModalDTO;
import ru.ozon.app.android.session.userAdultModalMobile.presentation.models.UserAdultModalVO;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u00162\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0001:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0004H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobile/presentation/UserAdultModalMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/session/userAdultModalMobile/data/models/UserAdultModalDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "Lru/ozon/app/android/session/userAdultModalMobile/presentation/models/UserAdultModalVO;", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/utils/AppType;)V", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "correctPdfExtension", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)Lru/ozon/uni/atoms/data/texts/TextAtom;", "", "resolveLinkTextColor", "(Lru/ozon/app/android/utils/AppType;)I", "dto", "info", "invoke", "(Lru/ozon/app/android/session/userAdultModalMobile/data/models/UserAdultModalDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/utils/AppType;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserAdultModalMapper implements Function2<UserAdultModalDTO, d, List<? extends UserAdultModalVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final AppType appType;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobile/presentation/UserAdultModalMapper$Companion;", "", "<init>", "()V", "PDF_ENDING", "", "WEB_VIEW_SCREEN_ID", "PDF_SCREEN_ID", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public UserAdultModalMapper(@NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.appType = appType;
    }

    private final TextAtom correctPdfExtension(TextAtom textAtom) {
        OzonUrlSpan.Companion.configUrlSpans$default(OzonUrlSpan.INSTANCE, textAtom.getText(), UserAdultModalMapper$correctPdfExtension$1$1.INSTANCE, null, null, null, 14, null);
        return textAtom;
    }

    private final int resolveLinkTextColor(AppType appType) {
        return appType == AppType.SELECT ? R$attr.textLightKey : R$attr.oz_semantic_accent_primary;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<UserAdultModalVO> invoke(@NotNull UserAdultModalDTO dto, @NotNull d info) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        TextAtom correctPdfExtension = correctPdfExtension(dto.getSubtitle());
        UserAdultModalDTO.Input input = dto.getInput();
        ButtonV3Atom.LargeButton button = dto.getButton();
        TextAtom termsOfUse = dto.getTermsOfUse();
        return C7714v.a0(new UserAdultModalVO(hashCode, correctPdfExtension, input, button, termsOfUse != null ? correctPdfExtension(termsOfUse) : null, resolveLinkTextColor(this.appType), dto.getTrackingInfo()));
    }
}
