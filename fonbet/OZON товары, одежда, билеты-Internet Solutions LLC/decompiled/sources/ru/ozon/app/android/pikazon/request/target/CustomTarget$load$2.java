package ru.ozon.app.android.pikazon.request.target;

import T5.a;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.I;
import m6.h;
import ru.ozon.app.android.pikazon.glide.thumbnail.Thumb;
import ru.ozon.app.android.pikazon.request.target.CustomTarget;

/* JADX INFO: Add missing generic type declarations: [Resource] */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\f\u001a\u00020\t\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00018\u00008\u00002\u0016\u0010\u0006\u001a\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Resource", "", "model", "kotlin.jvm.PlatformType", "resource", "Lm6/h;", "<unused var>", "LT5/a;", "dataSource", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Lm6/h;LT5/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class CustomTarget$load$2<Resource> extends AbstractC7737t implements InterfaceC6512o<Object, Resource, h<Resource>, a, Boolean> {
    final /* synthetic */ I $hasThumbnail;
    final /* synthetic */ boolean $withCrossFade;
    final /* synthetic */ CustomTarget<Resource> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomTarget$load$2(I i11, CustomTarget<Resource> customTarget, boolean z11) {
        super(4);
        this.$hasThumbnail = i11;
        this.this$0 = customTarget;
        this.$withCrossFade = z11;
    }

    @Override // fd.InterfaceC6512o
    public final Boolean invoke(Object obj, Resource resource, h<Resource> hVar, a aVar) {
        Function1 function1;
        if (obj instanceof Thumb) {
            this.$hasThumbnail.f71783a = true;
            obj = ((Thumb) obj).getOrigin();
        }
        function1 = ((CustomTarget) this.this$0).resultCallback;
        function1.invoke(new CustomTarget.Result.Success(obj, resource, aVar, this.$withCrossFade && !this.$hasThumbnail.f71783a));
        return Boolean.TRUE;
    }
}
