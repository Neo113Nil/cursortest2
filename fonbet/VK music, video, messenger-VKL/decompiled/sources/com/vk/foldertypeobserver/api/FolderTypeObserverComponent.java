package com.vk.foldertypeobserver.api;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.models.dialogs.FolderType;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import xsna.g0s;
import xsna.pwj0;

/* compiled from: FolderTypeObserverComponent.kt */
/* loaded from: classes18.dex */
public interface FolderTypeObserverComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: FolderTypeObserverComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final FolderTypeObserverComponent$Companion$STUB$1 STUB = new FolderTypeObserverComponent() { // from class: com.vk.foldertypeobserver.api.FolderTypeObserverComponent$Companion$STUB$1
            public final a a = new a();

            /* compiled from: FolderTypeObserverComponent.kt */
            public static final class a implements g0s {
                @Override // xsna.g0s
                public final q<Boolean> a(FolderType folderType) {
                    return g0.b;
                }
            }

            @Override // com.vk.foldertypeobserver.api.FolderTypeObserverComponent
            public final g0s He() {
                return this.a;
            }
        };
    }

    g0s He();
}
