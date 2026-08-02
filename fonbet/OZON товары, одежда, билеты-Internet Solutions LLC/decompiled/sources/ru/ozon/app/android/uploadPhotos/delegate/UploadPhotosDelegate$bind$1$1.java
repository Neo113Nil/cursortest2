package ru.ozon.app.android.uploadPhotos.delegate;

import a00.C4908c;
import a00.C4911f;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "message", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UploadPhotosDelegate$bind$1$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ C4911f $this_with;
    final /* synthetic */ UploadPhotosDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadPhotosDelegate$bind$1$1(UploadPhotosDelegate uploadPhotosDelegate, C4911f c4911f) {
        super(1);
        this.this$0 = uploadPhotosDelegate;
        this.$this_with = c4911f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        UploadPhotosDelegate uploadPhotosDelegate = this.this$0;
        ComponentCallbacksC5392m j11 = this.$this_with.j();
        C4908c g10 = this.$this_with.g();
        Intrinsics.f(str);
        uploadPhotosDelegate.showMessageRestriction(j11, g10, str);
    }
}
