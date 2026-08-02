package ru.ozon.app.android.commonwidgets.widgets.resultheader.domain;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.presentation.ShareListVO;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "<destruct>", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/presentation/ShareListVO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/commonwidgets/widgets/resultheader/presentation/ShareListVO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ResultHeaderAtomActionSheetHandler$shareList$2 extends AbstractC7737t implements Function1<ShareListVO, Unit> {
    final /* synthetic */ ResultHeaderAtomActionSheetHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResultHeaderAtomActionSheetHandler$shareList$2(ResultHeaderAtomActionSheetHandler resultHeaderAtomActionSheetHandler) {
        super(1);
        this.this$0 = resultHeaderAtomActionSheetHandler;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ShareListVO shareListVO) {
        invoke2(shareListVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ShareListVO shareListVO) {
        ComposerReferences composerReferences;
        String shareMessage = shareListVO.getShareMessage();
        ResultHeaderAtomActionSheetHandler resultHeaderAtomActionSheetHandler = this.this$0;
        composerReferences = resultHeaderAtomActionSheetHandler.references;
        resultHeaderAtomActionSheetHandler.showShareSheet(composerReferences.getContainer().i(), shareMessage);
    }
}
