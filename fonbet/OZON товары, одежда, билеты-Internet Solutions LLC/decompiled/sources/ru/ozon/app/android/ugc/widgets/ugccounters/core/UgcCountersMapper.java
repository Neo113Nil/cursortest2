package ru.ozon.app.android.ugc.widgets.ugccounters.core;

import Sc.o;
import WZ.t;
import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.UgcCountersDTO;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u001f\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0010\u001a\u00020\u0017*\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0018J\u001b\u0010\u0010\u001a\u00020\u0013*\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u001aJ\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u0013*\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u001cJ\u001b\u0010\u0010\u001a\u00020\u001e*\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u001fJ&\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/core/UgcCountersMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Images$Image;", "imagePrefetcher", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "", "widgetId", "toVo", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO;J)Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block;", "toVoBlock", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block;J)Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Single;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Single;", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Single;J)Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Single;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Double;", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Double;J)Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Image;", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Image;J)Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Expanding;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Expanding;", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Expanding;J)Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Expanding;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UgcCountersMapper implements Function2<UgcCountersDTO, d, List<? extends UgcCountersVO>> {

    @NotNull
    private final Context context;

    @NotNull
    private final ImagePrefetcher<UgcCountersVO.Block.Images.Image> imagePrefetcher;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UgcCountersDTO.Block.Expanding.Alignment.values().length];
            try {
                iArr[UgcCountersDTO.Block.Expanding.Alignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UgcCountersDTO.Block.Expanding.Alignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UgcCountersMapper(@NotNull Context context, @NotNull ImagePrefetcher<UgcCountersVO.Block.Images.Image> imagePrefetcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
        this.context = context;
        this.imagePrefetcher = imagePrefetcher;
    }

    private final UgcCountersVO toVo(UgcCountersDTO ugcCountersDTO, long j11) {
        List<UgcCountersDTO.Block> blocks = ugcCountersDTO.getBlocks();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = blocks.iterator();
        while (it.hasNext()) {
            UgcCountersVO.Block voBlock = toVoBlock((UgcCountersDTO.Block) it.next(), j11);
            if (voBlock != null) {
                arrayList.add(voBlock);
            }
        }
        String backgroundColor = ugcCountersDTO.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.LAYER_FLOOR_1.getToken();
        }
        String str = backgroundColor;
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new UgcCountersVO.Item((UgcCountersVO.Block) it2.next(), str));
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = ugcCountersDTO.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
        String json = ugcCountersDTO.getJson();
        if (json == null) {
            json = "";
        }
        return new UgcCountersVO(j11, arrayList2, str, tokenizedEvent$default, json);
    }

    private final UgcCountersVO.Block toVoBlock(UgcCountersDTO.Block block, long j11) {
        if (block instanceof UgcCountersDTO.Block.Single) {
            return toVo((UgcCountersDTO.Block.Single) block, j11);
        }
        if (block instanceof UgcCountersDTO.Block.Double) {
            return toVo((UgcCountersDTO.Block.Double) block, j11);
        }
        if (block instanceof UgcCountersDTO.Block.Image) {
            return toVo((UgcCountersDTO.Block.Image) block, j11);
        }
        if (block instanceof UgcCountersDTO.Block.Expanding) {
            return toVo((UgcCountersDTO.Block.Expanding) block, j11);
        }
        throw new o();
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<UgcCountersVO> invoke(@NotNull UgcCountersDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, state.hashCode()));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO$Block$Single, still in use, count: 2, list:
          (r0v0 ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO$Block$Single) from 0x003f: MOVE (r21v0 ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO$Block$Single) = (r0v0 ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO$Block$Single)
          (r0v0 ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO$Block$Single) from 0x0035: MOVE (r21v2 ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO$Block$Single) = (r0v0 ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO$Block$Single)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Multi-variable type inference failed */
    private final ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO.Block.Single toVo(ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.UgcCountersDTO.Block.Single r23, long r24) {
        /*
            r22 = this;
            ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO$Block$Single r0 = new ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO$Block$Single
            int r1 = r23.hashCode()
            long r1 = (long) r1
            ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.OverlayIcon r3 = r23.getIcon()
            ru.ozon.uni.atoms.data.texts.TextAtom r4 = r23.getTitle()
            r5 = 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            r5 = 0
            if (r4 == 0) goto L3f
            r15 = 0
            r16 = 0
            r6 = r5
            r5 = 0
            r7 = r6
            r6 = 0
            r8 = r7
            r7 = 0
            r9 = r8
            r8 = 0
            r10 = r9
            r9 = 0
            r11 = r10
            r10 = 0
            r12 = r11
            r11 = 0
            r13 = r12
            r12 = 0
            r17 = r13
            r13 = 0
            r18 = r17
            r17 = 3583(0xdff, float:5.021E-42)
            r19 = r18
            r18 = 0
            r21 = r0
            r0 = r19
            ru.ozon.uni.atoms.data.text.TextDTO r5 = ru.ozon.uni.atoms.v3.mappers.TextMapperKt.dsTextAtom$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4 = r5
            goto L43
        L3f:
            r21 = r0
            r0 = r5
            r4 = r0
        L43:
            ru.ozon.uni.atoms.data.texts.TextAtom r6 = r23.getSubtitle()
            r17 = 0
            r18 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = r14
            r14 = 0
            r15 = 0
            r19 = 3583(0xdff, float:5.021E-42)
            r20 = 0
            ru.ozon.uni.atoms.data.text.TextDTO r5 = ru.ozon.uni.atoms.v3.mappers.TextMapperKt.dsTextAtom$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r6 = r23.getBackgroundColor()
            if (r6 != 0) goto L6a
            ru.ozon.uni.core.UniColors r6 = ru.ozon.uni.core.UniColors.BG_SECONDARY
            java.lang.String r6 = r6.getToken()
        L6a:
            ru.ozon.uni.atoms.data.AtomActionDTO r7 = r23.getAction()
            if (r7 == 0) goto L79
            java.util.Map r8 = r23.getTrackingInfo()
            ru.ozon.uni.atoms.af.AtomAction r7 = ru.ozon.uni.atoms.data.AtomActionMapperKt.toAtomAction(r7, r8)
            goto L7a
        L79:
            r7 = r0
        L7a:
            java.util.Map r8 = r23.getTrackingInfo()
            if (r8 == 0) goto L89
            java.lang.Long r9 = java.lang.Long.valueOf(r24)
            r10 = 2
            WZ.t r0 = ru.ozon.app.android.composer.TrackingInfoMapperKt.toTokenizedEvent$default(r8, r9, r0, r10, r0)
        L89:
            r8 = r0
            ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO r9 = r23.getOnboarding()
            ru.ozon.uni.atoms.data.common.CornerRadius r0 = r23.getCornerRadius()
            if (r0 != 0) goto L96
            ru.ozon.uni.atoms.data.common.CornerRadius r0 = ru.ozon.uni.atoms.data.common.CornerRadius.RADIUS_400
        L96:
            r10 = r0
            r0 = r21
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.ugc.widgets.ugccounters.core.UgcCountersMapper.toVo(ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.UgcCountersDTO$Block$Single, long):ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO$Block$Single");
    }

    private final UgcCountersVO.Block toVo(UgcCountersDTO.Block.Double r82, long j11) {
        long hashCode = r82.hashCode();
        UgcCountersVO.Block.Single vo = toVo(r82.getFirstBlock(), j11);
        UgcCountersVO.Block.Single vo2 = toVo(r82.getSecondBlock(), j11);
        Map<String, TokenizedTrackingInfo> trackingInfo = r82.getTrackingInfo();
        return new UgcCountersVO.Block.Double(hashCode, vo, vo2, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, r82.getOnboarding());
    }

    private final UgcCountersVO.Block toVo(UgcCountersDTO.Block.Image image, long j11) {
        TextDTO textDTO;
        if (image.getUrls().isEmpty()) {
            return null;
        }
        long hashCode = image.hashCode();
        List<String> urls = image.getUrls();
        ArrayList arrayList = new ArrayList(C7714v.z(urls, 10));
        int i11 = 0;
        for (Object obj : urls) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            String str = (String) obj;
            boolean z11 = i11 == image.getUrls().size() + (-1);
            TextAtom label = image.getLabel();
            if (label != null) {
                TextAtom textAtom = z11 ? label : null;
                if (textAtom != null) {
                    textDTO = TextMapperKt.dsTextAtom$default(textAtom, null, TextDTO.TextAlignment.CENTER, null, null, null, null, null, null, null, 1, null, false, 3581, null);
                    arrayList.add(new UgcCountersVO.Block.Images.Image(str, textDTO));
                    i11 = i12;
                }
            }
            textDTO = null;
            arrayList.add(new UgcCountersVO.Block.Images.Image(str, textDTO));
            i11 = i12;
        }
        AtomActionDTO action = image.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, image.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = image.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
        OnBoardingDTO onboarding = image.getOnboarding();
        PreloadVideoInfo videoInfo = image.getVideoInfo();
        CornerRadius cornerRadius = image.getCornerRadius();
        if (cornerRadius == null) {
            cornerRadius = CornerRadius.RADIUS_400;
        }
        UgcCountersVO.Block.Images images = new UgcCountersVO.Block.Images(hashCode, arrayList, atomAction, tokenizedEvent$default, onboarding, videoInfo, cornerRadius);
        this.imagePrefetcher.prefetch(this.context, C7714v.K0(images.getImages(), 3));
        return images;
    }

    private final UgcCountersVO.Block.Expanding toVo(UgcCountersDTO.Block.Expanding expanding, long j11) {
        UgcCountersDTO.Block.Expanding.Alignment alignment = expanding.getAlignment();
        int i11 = alignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        int i12 = i11 != 1 ? i11 != 2 ? 17 : 8388629 : 8388627;
        long hashCode = expanding.hashCode();
        IconDTO icon = expanding.getIcon();
        TextDTO title = expanding.getTitle();
        TextDTO subtitle = expanding.getSubtitle();
        String backgroundColor = expanding.getBackgroundColor();
        AtomActionDTO action = expanding.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, expanding.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = expanding.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
        CornerRadius cornerRadius = expanding.getCornerRadius();
        if (cornerRadius == null) {
            cornerRadius = CornerRadius.NO_RADIUS;
        }
        return new UgcCountersVO.Block.Expanding(hashCode, icon, title, subtitle, backgroundColor, atomAction, tokenizedEvent$default, null, cornerRadius, i12, UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }
}
