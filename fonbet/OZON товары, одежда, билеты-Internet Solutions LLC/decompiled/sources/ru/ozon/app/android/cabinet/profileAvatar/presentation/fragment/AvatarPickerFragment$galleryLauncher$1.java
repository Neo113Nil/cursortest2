package ru.ozon.app.android.cabinet.profileAvatar.presentation.fragment;

import Hi.l;
import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cabinet.profileAvatar.presentation.view.AvatarPickerView;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LHi/l;", "selectedMedia", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class AvatarPickerFragment$galleryLauncher$1 extends AbstractC7737t implements Function1<List<? extends l>, Unit> {
    final /* synthetic */ AvatarPickerFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AvatarPickerFragment$galleryLauncher$1(AvatarPickerFragment avatarPickerFragment) {
        super(1);
        this.this$0 = avatarPickerFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends l> list) {
        invoke2(list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends l> selectedMedia) {
        AvatarPickerView avatarPickerView;
        AvatarPickerView avatarPickerView2;
        Intrinsics.checkNotNullParameter(selectedMedia, "selectedMedia");
        l lVar = (l) C7714v.M(selectedMedia);
        if (lVar != null) {
            avatarPickerView2 = this.this$0.avatarPickerView;
            if (avatarPickerView2 == null) {
                Intrinsics.n("avatarPickerView");
                throw null;
            }
            Function2<Integer, Uri, Unit> sendResult = avatarPickerView2.getSendResult();
            if (sendResult != null) {
                sendResult.invoke(-1, lVar.getUri());
                return;
            }
            return;
        }
        avatarPickerView = this.this$0.avatarPickerView;
        if (avatarPickerView == null) {
            Intrinsics.n("avatarPickerView");
            throw null;
        }
        Function2<Integer, Uri, Unit> sendResult2 = avatarPickerView.getSendResult();
        if (sendResult2 != null) {
            sendResult2.invoke(0, null);
        }
    }
}
