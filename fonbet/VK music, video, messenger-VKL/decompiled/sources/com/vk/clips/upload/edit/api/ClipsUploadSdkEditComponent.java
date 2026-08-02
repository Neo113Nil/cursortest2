package com.vk.clips.upload.edit.api;

import com.vk.clips.edit.editor.ClipsChoosePreviewActivity;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewParams;
import com.vk.di.component.DiUnscopedComponent;
import xsna.gy;
import xsna.jqd;
import xsna.mef;
import xsna.mld;
import xsna.zhf;

/* compiled from: ClipsUploadSdkEditComponent.kt */
/* loaded from: classes17.dex */
public interface ClipsUploadSdkEditComponent extends DiUnscopedComponent {
    public static final a Companion = a.a;

    /* compiled from: ClipsUploadSdkEditComponent.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final ClipsUploadSdkEditComponent STUB = new zhf();

        public final ClipsUploadSdkEditComponent getSTUB() {
            return STUB;
        }
    }

    jqd F5();

    mld Fb(ClipsChoosePreviewParams clipsChoosePreviewParams, ClipsChoosePreviewActivity clipsChoosePreviewActivity, gy gyVar);

    mef k();
}
