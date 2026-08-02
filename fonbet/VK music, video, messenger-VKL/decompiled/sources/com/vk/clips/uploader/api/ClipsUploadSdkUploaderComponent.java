package com.vk.clips.uploader.api;

import com.vk.di.component.DiScopedComponent;
import xsna.eef;
import xsna.nlf;
import xsna.pbf;
import xsna.pwj0;

/* compiled from: ClipsUploadSdkUploaderComponent.kt */
/* loaded from: classes17.dex */
public interface ClipsUploadSdkUploaderComponent extends DiScopedComponent<pwj0> {
    public static final a Companion = a.a;

    /* compiled from: ClipsUploadSdkUploaderComponent.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final ClipsUploadSdkUploaderComponent STUB = new ClipsUploadSdkUploaderComponentStub();

        public final ClipsUploadSdkUploaderComponent getSTUB() {
            return STUB;
        }
    }

    eef Zb();

    nlf k();

    pbf k3();
}
