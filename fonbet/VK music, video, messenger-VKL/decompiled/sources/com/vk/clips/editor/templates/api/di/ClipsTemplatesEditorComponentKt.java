package com.vk.clips.editor.templates.api.di;

import android.content.Context;
import android.view.View;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateExtendedResponseDto;
import com.vk.dto.common.clips.ClipAudioTemplate;
import io.reactivex.rxjava3.core.x;
import xsna.d9f;
import xsna.izs;
import xsna.m7f;
import xsna.s3q0;
import xsna.sn;
import xsna.v8f;

/* compiled from: ClipsTemplatesEditorComponent.kt */
/* loaded from: classes16.dex */
public final class ClipsTemplatesEditorComponentKt {
    public static final ClipsTemplatesEditorComponentKt$COMPONENT_STUB$1 a = new ClipsTemplatesEditorComponent() { // from class: com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponentKt$COMPONENT_STUB$1
        public final a a = new a();

        @Override // com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent
        public final d9f l4() {
            return new com.vk.clips.editor.templates.api.di.a();
        }

        @Override // com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent
        public final v8f l5() {
            return this.a;
        }

        /* compiled from: ClipsTemplatesEditorComponent.kt */
        public static final class a implements v8f {
            @Override // xsna.v8f
            public final x<ShortVideoGetTemplateExtendedResponseDto> a(Context context, String str) {
                return sn.b("method in not implemented");
            }

            @Override // xsna.v8f
            public final void b(View view, m7f m7fVar) {
            }

            @Override // xsna.v8f
            public final void c(Context context, Throwable th, String str, izs<? super String, s3q0> izsVar) {
            }

            @Override // xsna.v8f
            public final void d(View view, ClipAudioTemplate clipAudioTemplate, ShortVideoGetTemplateExtendedResponseDto shortVideoGetTemplateExtendedResponseDto, String str) {
            }
        }
    };
}
