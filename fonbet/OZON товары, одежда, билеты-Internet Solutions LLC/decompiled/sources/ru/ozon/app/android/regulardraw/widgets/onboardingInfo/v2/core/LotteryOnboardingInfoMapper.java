package ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core;

import WZ.t;
import WZ.x;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.data.LotteryOnboardingInfoDTO;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.presentation.LotteryOnboardingInfoVI;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/core/LotteryOnboardingInfoMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO;", "Ll20/d;", "", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep;", "prefetchProviderStorage", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;)V", "dto", "info", "invoke", "(Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LotteryOnboardingInfoMapper implements Function2<LotteryOnboardingInfoDTO, d, List<? extends LotteryOnboardingInfoVI>> {

    @NotNull
    private final Context context;

    @NotNull
    private final ImagePrefetchInfoProviderStorage<LotteryOnboardingInfoVI.OnboardingStep> prefetchProviderStorage;

    public LotteryOnboardingInfoMapper(@NotNull Context context, @NotNull ImagePrefetchInfoProviderStorage<LotteryOnboardingInfoVI.OnboardingStep> prefetchProviderStorage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prefetchProviderStorage, "prefetchProviderStorage");
        this.context = context;
        this.prefetchProviderStorage = prefetchProviderStorage;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<LotteryOnboardingInfoVI> invoke(@NotNull LotteryOnboardingInfoDTO dto, @NotNull d info) {
        LotteryOnboardingInfoVI.OnboardingStep.FooterContent finishButton;
        LotteryOnboardingInfoVI.OnboardingStep.FooterContent footerContent;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        List<LotteryOnboardingInfoDTO.OnboardingItem> onboardingItems = dto.getOnboardingItems();
        if (onboardingItems == null) {
            return K.f71697a;
        }
        long hashCode = info.d().hashCode();
        boolean mustSkipOnboarding = dto.getMustSkipOnboarding();
        List<LotteryOnboardingInfoDTO.OnboardingItem> list = onboardingItems;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LotteryOnboardingInfoDTO.OnboardingItem onboardingItem = (LotteryOnboardingInfoDTO.OnboardingItem) it.next();
            if (!(onboardingItem instanceof LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep)) {
                return K.f71697a;
            }
            LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep onboardingStep = (LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep) onboardingItem;
            LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.FooterContentWrapper footerContent2 = onboardingStep.getFooterContent();
            t tVar = null;
            if (footerContent2 != null) {
                if (footerContent2.getActionText() != null) {
                    finishButton = new LotteryOnboardingInfoVI.OnboardingStep.FooterContent.TextContent(footerContent2.getActionText());
                } else if (footerContent2.getFinishButton() != null) {
                    finishButton = new LotteryOnboardingInfoVI.OnboardingStep.FooterContent.FinishButton(footerContent2.getFinishButton().getDefaultButton(), footerContent2.getFinishButton().getFirstPresentationButton(), footerContent2.getFinishButton().getFirstPresentationCompletedAction());
                }
                footerContent = finishButton;
                LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.StepType stepType = onboardingStep.getStepType();
                String image = onboardingStep.getImage();
                AtomActionDTO defaultAction = onboardingStep.getCloseButton().getDefaultAction();
                AtomActionDTO firstPresentationAction = onboardingStep.getCloseButton().getFirstPresentationAction();
                AtomActionDTO firstPresentationCompletedAction = onboardingStep.getCloseButton().getFirstPresentationCompletedAction();
                Map<String, TokenizedTrackingInfo> trackingInfo2 = onboardingStep.getCloseButton().getTrackingInfo();
                Iterator it2 = it;
                LotteryOnboardingInfoVI.OnboardingStep.CloseButton closeButton = new LotteryOnboardingInfoVI.OnboardingStep.CloseButton(defaultAction, firstPresentationAction, firstPresentationCompletedAction, trackingInfo2 == null ? x.b(trackingInfo2, Long.valueOf(hashCode), null) : null);
                boolean isSkipable = onboardingStep.isSkipable();
                trackingInfo = onboardingStep.getTrackingInfo();
                if (trackingInfo == null) {
                    tVar = x.b(trackingInfo, Long.valueOf(hashCode), null);
                }
                arrayList.add(new LotteryOnboardingInfoVI.OnboardingStep(stepType, image, closeButton, footerContent, isSkipable, tVar));
                it = it2;
            }
            footerContent = null;
            LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.StepType stepType2 = onboardingStep.getStepType();
            String image2 = onboardingStep.getImage();
            AtomActionDTO defaultAction2 = onboardingStep.getCloseButton().getDefaultAction();
            AtomActionDTO firstPresentationAction2 = onboardingStep.getCloseButton().getFirstPresentationAction();
            AtomActionDTO firstPresentationCompletedAction2 = onboardingStep.getCloseButton().getFirstPresentationCompletedAction();
            Map<String, TokenizedTrackingInfo> trackingInfo22 = onboardingStep.getCloseButton().getTrackingInfo();
            Iterator it22 = it;
            LotteryOnboardingInfoVI.OnboardingStep.CloseButton closeButton2 = new LotteryOnboardingInfoVI.OnboardingStep.CloseButton(defaultAction2, firstPresentationAction2, firstPresentationCompletedAction2, trackingInfo22 == null ? x.b(trackingInfo22, Long.valueOf(hashCode), null) : null);
            boolean isSkipable2 = onboardingStep.isSkipable();
            trackingInfo = onboardingStep.getTrackingInfo();
            if (trackingInfo == null) {
            }
            arrayList.add(new LotteryOnboardingInfoVI.OnboardingStep(stepType2, image2, closeButton2, footerContent, isSkipable2, tVar));
            it = it22;
        }
        LotteryOnboardingInfoVI lotteryOnboardingInfoVI = new LotteryOnboardingInfoVI(hashCode, mustSkipOnboarding, arrayList);
        new ImagePrefetcher(lotteryOnboardingInfoVI.getOnboardingItems().size(), this.prefetchProviderStorage).prefetch(this.context, lotteryOnboardingInfoVI.getOnboardingItems());
        return C7714v.a0(lotteryOnboardingInfoVI);
    }
}
