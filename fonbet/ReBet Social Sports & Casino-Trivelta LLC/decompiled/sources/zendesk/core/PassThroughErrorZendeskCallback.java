package zendesk.core;

import md.InterfaceC5581a;
import md.e;

/* loaded from: classes5.dex */
abstract class PassThroughErrorZendeskCallback<E> extends e {
    private final e callback;

    public PassThroughErrorZendeskCallback(e eVar) {
        this.callback = eVar;
    }

    @Override // md.e
    public void onError(InterfaceC5581a interfaceC5581a) {
        e eVar = this.callback;
        if (eVar != null) {
            eVar.onError(interfaceC5581a);
        }
    }

    @Override // md.e
    public abstract void onSuccess(E e10);
}
