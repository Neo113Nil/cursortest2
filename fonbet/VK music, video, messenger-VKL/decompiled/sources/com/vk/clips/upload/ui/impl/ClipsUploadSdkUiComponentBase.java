package com.vk.clips.upload.ui.impl;

import com.vk.clips.upload.ui.api.di.ClipsUploadSdkUiComponent;
import com.vkontakte.android.task.di.components.clips.ClipsUploadSdkUiComponentVkApp;
import xsna.ahf;
import xsna.aif;
import xsna.dhf;
import xsna.qcy;

/* compiled from: ClipsUploadSdkUiComponentBase.kt */
/* loaded from: classes17.dex */
public abstract class ClipsUploadSdkUiComponentBase implements ClipsUploadSdkUiComponent {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.clips.upload.ui.api.di.ClipsUploadSdkUiComponent
    public final ahf Pb() {
        qcy<Object> qcyVar = ClipsUploadSdkUiComponentVkApp.c[0];
        return new dhf((aif) ((ClipsUploadSdkUiComponentVkApp) this).a.c());
    }
}
