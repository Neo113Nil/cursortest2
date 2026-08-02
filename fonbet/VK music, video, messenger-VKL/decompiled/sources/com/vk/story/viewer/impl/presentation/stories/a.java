package com.vk.story.viewer.impl.presentation.stories;

import android.view.MotionEvent;
import android.view.View;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.story.viewer.impl.presentation.stories.view.StoriesViewPager;
import java.util.concurrent.TimeUnit;
import xsna.dc80;
import xsna.jc80;
import xsna.kwg0;
import xsna.qo6;
import xsna.uov;

/* compiled from: StoryViewContainer.java */
/* loaded from: classes6.dex */
public final class a implements jc80.b {
    public boolean a;
    public long b;
    public final /* synthetic */ b c;

    public a(b bVar) {
        this.c = bVar;
    }

    @Override // xsna.jc80.b
    public final void a(int i) {
        b bVar = this.c;
        bVar.P();
        if (i < dc80.m) {
            StoriesViewPager storiesViewPager = bVar.O;
            for (int i2 = 0; i2 < storiesViewPager.getChildCount(); i2++) {
                if (storiesViewPager.getChildAt(i2) instanceof qo6) {
                    ((qo6) storiesViewPager.getChildAt(i2)).Q();
                }
            }
        }
        bVar.U(false);
        StoryEntry currentStoryEntry = bVar.getCurrentStoryEntry();
        if (currentStoryEntry != null && currentStoryEntry.Mb() && System.currentTimeMillis() - this.b < 300) {
            if (bVar.getCurrentStoryView() != null) {
                if (i < bVar.getWidth() / 2) {
                    bVar.getCurrentStoryView().E();
                } else {
                    bVar.getCurrentStoryView().N();
                }
            }
            io.reactivex.rxjava3.disposables.c cVar = bVar.m0;
            if (cVar != null) {
                cVar.dispose();
            }
            bVar.c.d();
        }
        this.b = System.currentTimeMillis();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.vk.story.viewer.impl.presentation.stories.b$k, java.lang.Object] */
    @Override // xsna.jc80.b
    public final void b() {
        this.a = false;
        b bVar = this.c;
        if (bVar.P == 0 && !bVar.t.g1()) {
            bVar.Q();
            qo6 currentStoryView = bVar.getCurrentStoryView();
            if (currentStoryView instanceof uov) {
                ((uov) currentStoryView).tj();
            }
        }
        b.t(bVar);
        bVar.U(true);
        qo6 currentStoryView2 = bVar.getCurrentStoryView();
        if (currentStoryView2 != null) {
            currentStoryView2.b();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.vk.story.viewer.impl.presentation.stories.b$k, java.lang.Object] */
    @Override // xsna.jc80.b
    public final void c() {
        b bVar = this.c;
        qo6 currentStoryView = bVar.getCurrentStoryView();
        StoryEntry currentStory = currentStoryView != null ? currentStoryView.getCurrentStory() : null;
        if (currentStoryView != null && currentStory != null && !currentStoryView.B()) {
            bVar.h0.t(StoryViewAction.PAUSE_LONG_TAP, bVar.getViewEntryPoint(), currentStory, bVar.B(), bVar.B, null);
        }
        if (bVar.P != 0 || bVar.t.g1() || bVar.getCurrentStoryEntry() == null || !bVar.getCurrentStoryEntry().Mb()) {
            return;
        }
        qo6 currentStoryView2 = bVar.getCurrentStoryView();
        if (currentStoryView2 instanceof uov) {
            ((uov) currentStoryView2).Ji();
        }
        this.a = true;
        qo6 currentStoryView3 = bVar.getCurrentStoryView();
        if (currentStoryView3 != null) {
            currentStoryView3.c();
        }
        bVar.O.requestDisallowInterceptTouchEvent(true);
    }

    @Override // xsna.jc80.b
    public final synchronized void d(int i, int i2) {
        try {
            b bVar = this.c;
            if (bVar.P == 0) {
                if (!bVar.b.c() && !this.c.c.c()) {
                    this.c.b.d();
                    StoryEntry currentStoryEntry = this.c.getCurrentStoryEntry();
                    if (currentStoryEntry == null || !currentStoryEntry.Mb()) {
                        e(i, i2, 0L);
                    } else {
                        e(i, i2, 400L);
                    }
                }
            }
        } finally {
        }
    }

    public final void e(final int i, final int i2, long j) {
        b bVar = this.c;
        io.reactivex.rxjava3.disposables.c cVar = bVar.m0;
        if (cVar != null) {
            cVar.dispose();
        }
        bVar.m0 = io.reactivex.rxjava3.core.a.s(j, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.klm0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                com.vk.story.viewer.impl.presentation.stories.b bVar2 = com.vk.story.viewer.impl.presentation.stories.a.this.c;
                qo6 currentStoryView = bVar2.getCurrentStoryView();
                StoriesViewPager storiesViewPager = bVar2.O;
                int measuredWidth = bVar2.getMeasuredWidth() / 5;
                int i3 = dc80.m;
                if (measuredWidth > i3) {
                    measuredWidth = i3;
                }
                int i4 = i;
                int i5 = 0;
                if (i4 < measuredWidth) {
                    if (currentStoryView != null) {
                        currentStoryView.C();
                        return;
                    }
                    while (i5 < storiesViewPager.getChildCount()) {
                        if (storiesViewPager.getChildAt(i5) instanceof qo6) {
                            ((qo6) storiesViewPager.getChildAt(i5)).C();
                        }
                        i5++;
                    }
                    return;
                }
                int measuredWidth2 = bVar2.getMeasuredWidth();
                int measuredWidth3 = bVar2.getMeasuredWidth() / 5;
                if (measuredWidth3 > i3) {
                    measuredWidth3 = i3;
                }
                if (i4 > measuredWidth2 - measuredWidth3) {
                    if (currentStoryView != null) {
                        currentStoryView.A();
                        return;
                    }
                    while (i5 < storiesViewPager.getChildCount()) {
                        if (storiesViewPager.getChildAt(i5) instanceof qo6) {
                            ((qo6) storiesViewPager.getChildAt(i5)).A();
                        }
                        i5++;
                    }
                    return;
                }
                int i6 = i2;
                if (currentStoryView == null || !currentStoryView.X(i4, i6)) {
                    if (currentStoryView == null || !currentStoryView.O(i4, i6)) {
                        if (i4 < i3) {
                            if (currentStoryView != null) {
                                currentStoryView.C();
                                return;
                            }
                            while (i5 < storiesViewPager.getChildCount()) {
                                if (storiesViewPager.getChildAt(i5) instanceof qo6) {
                                    ((qo6) storiesViewPager.getChildAt(i5)).C();
                                }
                                i5++;
                            }
                            return;
                        }
                        if (currentStoryView != null) {
                            currentStoryView.A();
                            return;
                        }
                        while (i5 < storiesViewPager.getChildCount()) {
                            if (storiesViewPager.getChildAt(i5) instanceof qo6) {
                                ((qo6) storiesViewPager.getChildAt(i5)).A();
                            }
                            i5++;
                        }
                    }
                }
            }
        }, kwg0.b());
    }

    @Override // xsna.jc80.b
    public final void onTouch(View view, MotionEvent motionEvent) {
        boolean z = this.a;
        b bVar = this.c;
        if (z) {
            bVar.O.requestDisallowInterceptTouchEvent(true);
        }
        qo6 currentStoryView = bVar.getCurrentStoryView();
        if (currentStoryView != null) {
            currentStoryView.onTouch(motionEvent);
        }
    }
}
