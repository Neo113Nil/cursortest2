package com.vk.clips.editor.di;

import android.content.Context;
import com.vk.clips.editor.mapper.fragment.ClipsEditorFragment;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.dto.clips.model.ClipsEditorInitParams;
import xsna.wvd;

/* compiled from: ClipsEditorComponent.kt */
/* loaded from: classes16.dex */
public interface ClipsEditorComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: ClipsEditorComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public final ClipsEditorComponent getSTUB() {
            return new ClipsEditorComponent() { // from class: com.vk.clips.editor.di.ClipsEditorComponent$Companion$STUB$1
                @Override // com.vk.clips.editor.di.ClipsEditorComponent
                public final wvd Lc(ClipsEditorInitParams clipsEditorInitParams, Context context, ClipsEditorFragment.b bVar) {
                    throw new UnsupportedOperationException();
                }
            };
        }
    }

    wvd Lc(ClipsEditorInitParams clipsEditorInitParams, Context context, ClipsEditorFragment.b bVar);
}
