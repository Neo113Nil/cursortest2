package rl0;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* loaded from: classes8.dex */
public final class e0 extends AbstractC7737t implements Function0<Y> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f83677b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Context context) {
        super(0);
        this.f83677b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Y invoke() {
        T t2 = new T();
        return new Y(this.f83677b, new Q(new AppUpdateInfo.Factory(t2), t2));
    }
}
