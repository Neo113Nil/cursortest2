package com.vk.storycamera.picker.ui;

import androidx.viewpager2.widget.ViewPager2;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;

/* compiled from: StoryMediaPickerFragment.kt */
/* loaded from: classes6.dex */
public final class b extends ViewPager2.g {
    public final /* synthetic */ StoryMediaPickerFragment d;
    public final /* synthetic */ StoryMediaPickerFragment.b e;

    public b(StoryMediaPickerFragment storyMediaPickerFragment, StoryMediaPickerFragment.b bVar) {
        this.d = storyMediaPickerFragment;
        this.e = bVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i) {
        StoryMediaPickerFragment storyMediaPickerFragment = this.d;
        if (storyMediaPickerFragment.X) {
            storyMediaPickerFragment.X = false;
            return;
        }
        StoryMediaPickerFragment.b bVar = this.e;
        if (i == 0) {
            storyMediaPickerFragment.io(bVar, false);
        } else {
            if (i != 1) {
                return;
            }
            storyMediaPickerFragment.jo(bVar, false);
        }
    }
}
