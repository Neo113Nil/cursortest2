package com.vk.clips.editor.di;

import android.content.Context;
import com.vk.clips.editor.mapper.fragment.ClipsEditorFragment;
import com.vk.dto.clips.model.ClipsEditorInitParams;
import com.vkontakte.android.task.di.components.clips.ClipsEditorComponentVkApp;
import xsna.e2e;
import xsna.iyd;
import xsna.qcy;
import xsna.wvd;
import xsna.xnf;

/* compiled from: ClipsEditorComponentBase.kt */
/* loaded from: classes16.dex */
public abstract class ClipsEditorComponentBase implements ClipsEditorComponent {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.clips.editor.di.ClipsEditorComponent
    public final wvd Lc(ClipsEditorInitParams clipsEditorInitParams, Context context, ClipsEditorFragment.b bVar) {
        ClipsEditorComponentVkApp clipsEditorComponentVkApp = (ClipsEditorComponentVkApp) this;
        qcy<Object>[] qcyVarArr = ClipsEditorComponentVkApp.c;
        qcy<Object> qcyVar = qcyVarArr[0];
        int a = ((xnf) clipsEditorComponentVkApp.a.c()).a();
        qcy<Object> qcyVar2 = qcyVarArr[1];
        return new iyd(clipsEditorInitParams, context, a, bVar, (e2e) clipsEditorComponentVkApp.b.c());
    }
}
