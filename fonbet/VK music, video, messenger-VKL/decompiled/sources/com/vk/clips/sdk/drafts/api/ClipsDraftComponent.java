package com.vk.clips.sdk.drafts.api;

import com.vk.di.component.DiScopedWithParamsComponent;
import java.io.File;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.htd;
import xsna.mtd;
import xsna.otd;
import xsna.pwj0;
import xsna.vtd;
import xsna.wtd;

/* compiled from: ClipsDraftComponent.kt */
/* loaded from: classes17.dex */
public interface ClipsDraftComponent extends DiScopedWithParamsComponent<pwj0, htd> {
    public static final a Companion = a.a;

    /* compiled from: ClipsDraftComponent.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final ClipsDraftComponent STUB = ClipsDraftComponentKt.a;

        public final ClipsDraftComponent getSTUB() {
            return STUB;
        }
    }

    Object Q7(String str, vtd vtdVar);

    Object Xa(String str, ContinuationImpl continuationImpl);

    mtd getProvider();

    File hb(File file, ClipsDraftDirType clipsDraftDirType, boolean z);

    Object k8(otd otdVar, ContinuationImpl continuationImpl);

    Object qe(wtd wtdVar);

    Object rd(ContinuationImpl continuationImpl);

    void s1(String str, ClearDraftMode clearDraftMode);

    Object y9(otd otdVar, boolean z, ContinuationImpl continuationImpl);
}
