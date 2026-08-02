package com.vk.storycamera.picker.feature;

import com.vk.storycamera.picker.feature.StoryMediaPickerState;
import com.vk.storycamera.picker.feature.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.dm50;
import xsna.eni0;
import xsna.hwi0;
import xsna.tml0;

/* compiled from: StoryMediaPickerReducer.kt */
/* loaded from: classes6.dex */
public final class e extends dm50<com.vk.storycamera.picker.ui.c, d, StoryMediaPickerState> {
    @Override // xsna.dm50
    public final StoryMediaPickerState c(StoryMediaPickerState storyMediaPickerState, d dVar) {
        StoryMediaPickerState storyMediaPickerState2 = storyMediaPickerState;
        d dVar2 = dVar;
        if (dVar2 instanceof d.b) {
            if (storyMediaPickerState2 instanceof StoryMediaPickerState.b) {
                return new StoryMediaPickerState.a(((StoryMediaPickerState.b) storyMediaPickerState2).b ? StoryMediaPickerState.ScreenMode.STORY_TEMPLATE : StoryMediaPickerState.ScreenMode.PHOTO_PICKER, EmptyList.b, 0);
            }
        } else if (dVar2 instanceof d.e) {
            d.e eVar = (d.e) dVar2;
            if (storyMediaPickerState2 instanceof StoryMediaPickerState.a) {
                return StoryMediaPickerState.a.a((StoryMediaPickerState.a) storyMediaPickerState2, null, eVar.b, 0, 5);
            }
        } else if (dVar2 instanceof d.a) {
            if (storyMediaPickerState2 instanceof StoryMediaPickerState.a) {
                StoryMediaPickerState.a aVar = (StoryMediaPickerState.a) storyMediaPickerState2;
                StoryMediaPickerState.ScreenMode screenMode = aVar.b;
                StoryMediaPickerState.ScreenMode screenMode2 = StoryMediaPickerState.ScreenMode.PHOTO_PICKER;
                return screenMode == screenMode2 ? storyMediaPickerState2 : StoryMediaPickerState.a.a(aVar, screenMode2, null, 0, 6);
            }
        } else if (dVar2 instanceof d.C1846d) {
            if (storyMediaPickerState2 instanceof StoryMediaPickerState.a) {
                StoryMediaPickerState.a aVar2 = (StoryMediaPickerState.a) storyMediaPickerState2;
                StoryMediaPickerState.ScreenMode screenMode3 = aVar2.b;
                StoryMediaPickerState.ScreenMode screenMode4 = StoryMediaPickerState.ScreenMode.STORY_TEMPLATE;
                return screenMode3 == screenMode4 ? storyMediaPickerState2 : StoryMediaPickerState.a.a(aVar2, screenMode4, null, 0, 6);
            }
        } else {
            if (!(dVar2 instanceof d.c)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = ((d.c) dVar2).b;
            if (storyMediaPickerState2 instanceof StoryMediaPickerState.a) {
                StoryMediaPickerState.a aVar3 = (StoryMediaPickerState.a) storyMediaPickerState2;
                return (aVar3.b != StoryMediaPickerState.ScreenMode.STORY_TEMPLATE || i == 0) ? StoryMediaPickerState.a.a(aVar3, null, null, i, 3) : storyMediaPickerState2;
            }
        }
        return storyMediaPickerState2;
    }

    @Override // xsna.dm50
    public final com.vk.storycamera.picker.ui.c d() {
        return new com.vk.storycamera.picker.ui.c(e(new hwi0(9)), e(new eni0(3)), e(new tml0(3)));
    }

    @Override // xsna.dm50
    public final void h(StoryMediaPickerState storyMediaPickerState, com.vk.storycamera.picker.ui.c cVar) {
        StoryMediaPickerState storyMediaPickerState2 = storyMediaPickerState;
        com.vk.storycamera.picker.ui.c cVar2 = cVar;
        if (storyMediaPickerState2 instanceof StoryMediaPickerState.b) {
            f(cVar2.a, storyMediaPickerState2);
        } else {
            if (!(storyMediaPickerState2 instanceof StoryMediaPickerState.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f(cVar2.b, storyMediaPickerState2);
        }
    }
}
