package ru.ozon.android.messenger.utils.image;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;

/* loaded from: classes10.dex */
public final class d implements PikazonLoaderCallback<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1<Exception, Unit> f91961a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Object, Unit> f91962b;

    /* JADX WARN: Multi-variable type inference failed */
    d(Function1<? super Exception, Unit> function1, Function1<Object, Unit> function12) {
        this.f91961a = function1;
        this.f91962b = function12;
    }

    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
    public final void onLoadFailed(Exception exc) {
        Function1<Exception, Unit> function1 = this.f91961a;
        if (function1 != null) {
            function1.invoke(exc);
        }
    }

    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
    public final void onLoadSuccessful(Object obj) {
        Function1<Object, Unit> function1 = this.f91962b;
        if (function1 != null) {
            function1.invoke(obj);
        }
    }
}
