package ru.ozon.app.android.bank.widgets.bankAccountStatus.core;

import T00.a;
import T00.e;
import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.bank.widgets.bankAccountStatus.data.BankAccountStatusDTO;
import ru.ozon.app.android.bank.widgets.bankAccountStatus.presentation.BankAccountStatusVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0003j\u0002`\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/bank/widgets/bankAccountStatus/core/BankAccountStatusMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/bank/widgets/bankAccountStatus/data/BankAccountStatusDTO;", "Ll20/d;", "", "Lru/ozon/app/android/bank/widgets/bankAccountStatus/presentation/BankAccountStatusVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "toTextDTO", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;", "(Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;)Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO$IconPosition;", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$IconPosition;", "toIconPositionTextDTO", "(Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO$IconPosition;)Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$IconPosition;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/bank/widgets/bankAccountStatus/data/BankAccountStatusDTO;Ll20/d;)Ljava/util/List;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BankAccountStatusMapper implements Function2<BankAccountStatusDTO, d, List<? extends BankAccountStatusVO>> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SocialTextAtomDTO.IconPosition.values().length];
            try {
                iArr[SocialTextAtomDTO.IconPosition.ICON_POSITION_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SocialTextAtomDTO.IconPosition.ICON_POSITION_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final CommonAtomLabelDTO.IconPosition toIconPositionTextDTO(SocialTextAtomDTO.IconPosition iconPosition) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[iconPosition.ordinal()];
        return i11 != 1 ? i11 != 2 ? CommonAtomLabelDTO.IconPosition.END : CommonAtomLabelDTO.IconPosition.END : CommonAtomLabelDTO.IconPosition.START;
    }

    private final TextDTO toTextDTO(TextAtom textAtom) {
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        OzonSpannableString text = textAtom.getText();
        String textStyle = textAtom.getTextStyle();
        String textColor = textAtom.getTextColor();
        Integer maxLines = textAtom.getMaxLines();
        return new TextDTO(text, null, null, null, null, null, textPreset, textStyle, textColor, null, textAtom.getTestInfo(), textAtom.getContext(), textAtom.getTrackingInfo(), false, null, null, null, null, maxLines, 254526, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<BankAccountStatusVO> invoke(@NotNull BankAccountStatusDTO dto, @NotNull d widgetInfo) {
        boolean z11;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        e h11;
        e h12;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = dto.hashCode();
        a b11 = widgetInfo.b();
        if (!Intrinsics.d((b11 == null || (h12 = b11.h()) == null) ? null : h12.e(), "account")) {
            a b12 = widgetInfo.b();
            if (!Intrinsics.d((b12 == null || (h11 = b12.h()) == null) ? null : h11.e(), "my")) {
                z11 = false;
                boolean z12 = z11;
                t tVar = null;
                TextDTO textDTO = toTextDTO(dto.getTitle());
                TextAtom subTitle = dto.getSubTitle();
                TextDTO textDTO2 = subTitle == null ? toTextDTO(subTitle) : null;
                ButtonV3Atom.SmallButton button = dto.getButton();
                AtomActionDTO action = dto.getAction();
                AtomAction atomAction = action == null ? AtomActionMapperKt.toAtomAction(action, dto.getTrackingInfo()) : null;
                trackingInfo = dto.getTrackingInfo();
                if (trackingInfo != null) {
                    tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
                }
                return C7714v.a0(new BankAccountStatusVO(hashCode, textDTO, textDTO2, button, atomAction, tVar, dto.getBackgroundColor(), dto.getWidgetBackground(), dto.getAtom(), z12));
            }
        }
        z11 = true;
        boolean z122 = z11;
        t tVar2 = null;
        TextDTO textDTO3 = toTextDTO(dto.getTitle());
        TextAtom subTitle2 = dto.getSubTitle();
        if (subTitle2 == null) {
        }
        ButtonV3Atom.SmallButton button2 = dto.getButton();
        AtomActionDTO action2 = dto.getAction();
        if (action2 == null) {
        }
        trackingInfo = dto.getTrackingInfo();
        if (trackingInfo != null) {
        }
        return C7714v.a0(new BankAccountStatusVO(hashCode, textDTO3, textDTO2, button2, atomAction, tVar2, dto.getBackgroundColor(), dto.getWidgetBackground(), dto.getAtom(), z122));
    }

    private final TextDTO toTextDTO(SocialTextAtomDTO socialTextAtomDTO) {
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        OzonSpannableString ozonSpannableString = new OzonSpannableString(socialTextAtomDTO.getText());
        String textStyle = socialTextAtomDTO.getTextStyle();
        String iconTintColor = socialTextAtomDTO.getIconTintColor();
        String icon = socialTextAtomDTO.getIcon();
        CommonAtomLabelDTO.IconPosition iconPositionTextDTO = toIconPositionTextDTO(socialTextAtomDTO.getIconPosition());
        String textColor = socialTextAtomDTO.getTextColor();
        Integer maxLines = socialTextAtomDTO.getMaxLines();
        return new TextDTO(ozonSpannableString, null, null, null, null, null, textPreset, textStyle, textColor, null, socialTextAtomDTO.getTestInfo(), socialTextAtomDTO.getContext(), socialTextAtomDTO.getTrackingInfo(), false, null, icon, iconTintColor, iconPositionTextDTO, maxLines, 25150, null);
    }
}
