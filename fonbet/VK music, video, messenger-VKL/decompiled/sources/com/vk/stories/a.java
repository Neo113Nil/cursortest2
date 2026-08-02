package com.vk.stories;

import android.content.Context;
import com.vk.stories.StoriesVideoEncoder;
import com.vkontakte.android.R;
import java.io.File;
import xsna.bn10;
import xsna.e43;
import xsna.gi9;
import xsna.iah0;
import xsna.ikv0;
import xsna.ner0;

/* compiled from: StoriesProcessor.kt */
/* loaded from: classes6.dex */
public final class a implements StoriesVideoEncoder.a {
    public final /* synthetic */ gi9 a;
    public final /* synthetic */ File b;

    public a(gi9 gi9Var, File file) {
        this.a = gi9Var;
        this.b = file;
    }

    @Override // com.vk.stories.StoriesVideoEncoder.a
    public final void c(boolean z) {
        ner0 ner0Var = this.a.a;
        File file = this.b;
        if (file.exists()) {
            Context context = ner0Var.getContext();
            String string = context.getString(R.string.story_saved_to_galery);
            ikv0.a aVar = new ikv0.a(context);
            aVar.u = new ikv0.d(string, (String) null, (ikv0.d.a) null);
            aVar.o = Integer.valueOf(iah0.a(88));
            aVar.n();
            com.vk.core.files.b.c(new com.vk.core.files.b(e43.a), file, null, 6).subscribe();
        }
        try {
            ner0Var.dismiss();
        } catch (Exception unused) {
        }
    }

    @Override // com.vk.stories.StoriesVideoEncoder.a
    public final void onError(Throwable th) {
        com.vk.metrics.eventtracking.b.a.a(th);
        ner0 ner0Var = this.a.a;
        Context context = ner0Var.getContext();
        String string = context.getString(R.string.story_saving_error);
        ikv0.a aVar = new ikv0.a(context);
        aVar.u = new ikv0.d(string, (String) null, (ikv0.d.a) null);
        aVar.o = Integer.valueOf(iah0.a(88));
        aVar.n();
        try {
            ner0Var.dismiss();
        } catch (Exception unused) {
        }
    }

    @Override // com.vk.stories.StoriesVideoEncoder.a
    public final void r(int i) {
        gi9 gi9Var = this.a;
        gi9Var.getClass();
        gi9Var.a.setProgress(bn10.c(Math.round(i * 1.0f) + 0, 0, 100));
    }

    @Override // com.vk.stories.StoriesVideoEncoder.a
    public final void onCancel() {
    }

    @Override // com.vk.stories.StoriesVideoEncoder.a
    public final void s(int i) {
    }
}
