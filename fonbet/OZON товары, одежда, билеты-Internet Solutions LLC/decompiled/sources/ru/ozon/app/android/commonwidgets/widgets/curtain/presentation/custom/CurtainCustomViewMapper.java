package ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom;

import A00.a;
import Sc.o;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.common.ui.customcurtain.CurtainCustomVO;
import ru.ozon.app.android.commonwidgets.di.ff.CommonCurtainDisabled;
import ru.ozon.app.android.commonwidgets.widgets.curtain.DeepLinkProcessor;
import ru.ozon.app.android.commonwidgets.widgets.curtain.data.CurtainDTO;
import ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.CurtainTimerUpdate;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u0003*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0010\u0010\u001f\u001a\f\u0012\u0004\u0012\u00020\u001d0\u001cj\u0002`\u001eH\u0016¢\u0006\u0004\b!\u0010\"J+\u0010%\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u00182\n\u0010$\u001a\u00060\u001dj\u0002`#2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R(\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020-0,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R.\u00103\u001a\u0016\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R6\u00109\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u000607j\u0002`8\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030+028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u00106R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/CurtainCustomViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO;", "Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO;", "Lru/ozon/app/android/commonwidgets/widgets/curtain/DeepLinkProcessor;", "customLinkProcessor", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/commonwidgets/widgets/curtain/DeepLinkProcessor;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "", "processActionWithOpenCustomLinkIfNeedIt", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/composer/ComposerNavigator;)Z", "", "stateId", "toVO", "(Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO;Ljava/lang/String;)Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO;", "", "state", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "bind", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "handleRemove", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;)Z", "Lru/ozon/app/android/commonwidgets/widgets/curtain/DeepLinkProcessor;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "", "Ljava/lang/Class;", "LA00/a$J$a;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "updateConsumer", "Lkotlin/jvm/functions/Function2;", "getUpdateConsumer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "mapper", "getMapper", "Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/CurtainShowHelper;", "showHelper", "Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/CurtainShowHelper;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CurtainCustomViewMapper extends SingleNoUiViewMapper<CurtainDTO, CurtainCustomVO> {

    @NotNull
    private final DeepLinkProcessor customLinkProcessor;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final Function2<CurtainDTO, d, List<CurtainCustomVO>> mapper;
    private CurtainShowHelper showHelper;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;

    @NotNull
    private final Function2<a.J.InterfaceC0007a, CurtainCustomVO, CurtainCustomVO> updateConsumer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CurtainDTO.ShowCondition.Type.values().length];
            try {
                iArr[CurtainDTO.ShowCondition.Type.VIEW_PORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CurtainDTO.ShowCondition.Type.PAGE_LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CurtainDTO.ShowCondition.Type.TIMER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CurtainDTO.ShowCondition.Type.OFFSET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CurtainCustomViewMapper(@NotNull DeepLinkProcessor customLinkProcessor, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(customLinkProcessor, "customLinkProcessor");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.customLinkProcessor = customLinkProcessor;
        this.featureChecker = featureChecker;
        this.supportedUpdates = C7714v.a0(CurtainTimerUpdate.class);
        this.updateConsumer = CurtainCustomViewMapper$updateConsumer$1.INSTANCE;
        this.mapper = new CurtainCustomViewMapper$mapper$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean processActionWithOpenCustomLinkIfNeedIt(AtomAction atomAction, ComposerNavigator composerNavigator) {
        if (!(atomAction instanceof AtomAction.OpenComposerNestedPage)) {
            return false;
        }
        String processDeepLink = this.customLinkProcessor.processDeepLink(((AtomAction.OpenComposerNestedPage) atomAction).getLink());
        if (h.K(processDeepLink)) {
            return false;
        }
        ComposerNavigator.DefaultImpls.openDeeplink$default(composerNavigator, processDeepLink, null, 2, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CurtainCustomVO toVO(CurtainDTO curtainDTO, String str) {
        CurtainCustomVO.Condition condition;
        CurtainCustomVO.Condition condition2;
        int i11 = WhenMappings.$EnumSwitchMapping$0[curtainDTO.getShowCondition().getType().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    CurtainDTO.ShowCondition.Condition.Timer timer = curtainDTO.getShowCondition().getTimer();
                    if (timer != null) {
                        condition = new CurtainCustomVO.Condition.Timer(new DateTime().getMillis() + timer.getTime());
                    }
                } else {
                    if (i11 != 4) {
                        throw new o();
                    }
                    CurtainDTO.ShowCondition.Condition.Offset offset = curtainDTO.getShowCondition().getOffset();
                    if (offset != null) {
                        condition = new CurtainCustomVO.Condition.Offset(offset.getOffset());
                    }
                }
            } else if (curtainDTO.getShowCondition().getPageLoaded() != null) {
                condition = CurtainCustomVO.Condition.PageLoaded.INSTANCE;
            }
            condition2 = (CurtainCustomVO.Condition) ExtensionsKt.getExhaustive(condition);
            if (condition2 != null) {
                return null;
            }
            return new CurtainCustomVO(Ih.a.a("CurtainCustomVO + ", str), false, condition2, curtainDTO.getAction(), curtainDTO.getTrackingInfo());
        }
        condition = null;
        condition2 = (CurtainCustomVO.Condition) ExtensionsKt.getExhaustive(condition);
        if (condition2 != null) {
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void bind(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        c d11 = viewObject.d();
        Intrinsics.g(d11, "null cannot be cast to non-null type ru.ozon.app.android.common.ui.customcurtain.CurtainCustomVO");
        CurtainCustomVO curtainCustomVO = (CurtainCustomVO) d11;
        CurtainShowHelper curtainShowHelper = this.showHelper;
        if (curtainShowHelper != null) {
            curtainShowHelper.show(curtainCustomVO, composerRootView);
        }
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return !this.featureChecker.isEnabled(CommonCurtainDisabled.INSTANCE);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull j10.h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        this.showHelper = new CurtainShowHelper(references, new ActionHandler.Builder(references, voHelper, CurtainCustomVO.class).onPreProcess(new CurtainCustomViewMapper$constructLayout$actionHandler$1(this, references)).buildHandler(), this.featureChecker);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<CurtainDTO, d, List<CurtainCustomVO>> getMapper() {
        return this.mapper;
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<a.J.InterfaceC0007a, CurtainCustomVO, CurtainCustomVO> getUpdateConsumer() {
        return this.updateConsumer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public boolean handleRemove(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        CurtainShowHelper curtainShowHelper = this.showHelper;
        if (curtainShowHelper != null) {
            curtainShowHelper.unbind();
        }
        this.showHelper = null;
        return true;
    }
}
