package com.vk.newsfeed.posting.impl.presentation.base.view.steps.mediapicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.fragments.FragmentImpl;
import com.vkontakte.android.R;
import xsna.oz50;

/* compiled from: MediaPickerProgressbarFragment.kt */
/* loaded from: classes4.dex */
public final class MediaPickerProgressbarFragment extends FragmentImpl {

    /* compiled from: MediaPickerProgressbarFragment.kt */
    public static final class a extends oz50 {
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.media_picker_progressbar_fragment, viewGroup, false);
    }
}
