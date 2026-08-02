package ru.ozon.app.android.pikazon.request.target;

import V5.q;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import m6.h;
import ru.ozon.app.android.pikazon.glide.thumbnail.Thumb;
import ru.ozon.app.android.pikazon.request.target.CustomTarget;

/* JADX INFO: Add missing generic type declarations: [Resource] */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0005\u001a\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Resource", "", "model", "Lm6/h;", "kotlin.jvm.PlatformType", "<unused var>", "LV5/q;", "exception", "", "invoke", "(Ljava/lang/Object;Lm6/h;LV5/q;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class CustomTarget$load$3<Resource> extends AbstractC7737t implements InterfaceC6511n<Object, h<Resource>, q, Boolean> {
    final /* synthetic */ CustomTarget<Resource> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomTarget$load$3(CustomTarget<Resource> customTarget) {
        super(3);
        this.this$0 = customTarget;
    }

    @Override // fd.InterfaceC6511n
    public final Boolean invoke(Object obj, h<Resource> hVar, q qVar) {
        Function1 function1;
        function1 = ((CustomTarget) this.this$0).resultCallback;
        if (obj instanceof Thumb) {
            obj = ((Thumb) obj).getOrigin();
        }
        function1.invoke(new CustomTarget.Result.Fail(obj, qVar));
        return Boolean.FALSE;
    }
}
