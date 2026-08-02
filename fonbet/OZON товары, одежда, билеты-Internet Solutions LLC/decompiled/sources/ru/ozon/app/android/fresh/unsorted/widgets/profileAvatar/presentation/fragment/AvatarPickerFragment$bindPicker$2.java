package ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.presentation.fragment;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class AvatarPickerFragment$bindPicker$2 extends C7735q implements Function2<Integer, Uri, Unit> {
    AvatarPickerFragment$bindPicker$2(Object obj) {
        super(2, obj, AvatarPickerRouter.class, "sendResult", "sendResult(ILandroid/net/Uri;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Uri uri) {
        invoke(num.intValue(), uri);
        return Unit.f71690a;
    }

    public final void invoke(int i11, Uri uri) {
        ((AvatarPickerRouter) this.receiver).sendResult(i11, uri);
    }
}
