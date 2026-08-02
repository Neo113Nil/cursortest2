package com.vk.video.ui.upload.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.jcq0;
import xsna.pwj0;

/* compiled from: UploadComponent.kt */
/* loaded from: classes11.dex */
public interface UploadComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: UploadComponent.kt */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final UploadComponent STUB = new UploadComponent() { // from class: com.vk.video.ui.upload.api.di.UploadComponent$Companion$STUB$1
            public final jcq0 a = jcq0.a.a.getSTUB();

            @Override // com.vk.video.ui.upload.api.di.UploadComponent
            public final jcq0 a() {
                return this.a;
            }
        };

        public final UploadComponent getSTUB() {
            return STUB;
        }
    }

    jcq0 a();
}
