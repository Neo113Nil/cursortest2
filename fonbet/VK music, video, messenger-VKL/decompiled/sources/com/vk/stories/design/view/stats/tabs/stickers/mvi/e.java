package com.vk.stories.design.view.stats.tabs.stickers.mvi;

import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.a;
import xsna.pbl0;

/* compiled from: StoryStatisticsStickersMviView.kt */
/* loaded from: classes6.dex */
public final class e implements pbl0 {
    public final /* synthetic */ c a;

    public e(c cVar) {
        this.a = cVar;
    }

    @Override // xsna.pbl0
    public final void a(StoryQuestionEntry storyQuestionEntry) {
        this.a.c.invoke(new a.c.k(storyQuestionEntry));
    }

    @Override // xsna.pbl0
    public final void b(StoryQuestionEntry storyQuestionEntry) {
        this.a.c.invoke(new a.c.e(storyQuestionEntry));
    }

    @Override // xsna.pbl0
    public final void c(StoryQuestionEntry storyQuestionEntry) {
        this.a.c.invoke(new a.c.d(storyQuestionEntry));
    }

    @Override // xsna.pbl0
    public final void d(StoryQuestionEntry storyQuestionEntry) {
        this.a.c.invoke(new a.c.g(storyQuestionEntry));
    }
}
