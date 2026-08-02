package com.vk.preview.presentation.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.button.VkButton;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.preview.presentation.GalleryPickerInitialData;
import com.vk.preview.presentation.view.GalleryPickerPreview;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import defpackage.q0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.b140;
import xsna.bwt0;
import xsna.e3m0;
import xsna.enj;
import xsna.fa00;
import xsna.gzs;
import xsna.m33;
import xsna.s3q0;
import xsna.t4d0;
import xsna.vvr0;
import xsna.wzs;

/* compiled from: StoryGalleryPickerPreviewViewNew.kt */
/* loaded from: classes5.dex */
public final class StoryGalleryPickerPreviewViewNew extends FrameLayout implements GalleryPickerPreview {
    public final boolean b;
    public final View c;
    public gzs<s3q0> d;
    public gzs<s3q0> e;
    public wzs<? super Integer, ? super Integer, s3q0> f;
    public final VkButton g;
    public final VkButton h;
    public boolean i;

    /* compiled from: StoryGalleryPickerPreviewViewNew.kt */
    public static final class State extends Serializer.StreamParcelableAdapter implements GalleryPickerPreview.State {
        public static final Serializer.c<State> CREATOR = new a();
        public final boolean b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<State> {
            @Override // com.vk.core.serialize.Serializer.c
            public final State a(Serializer serializer) {
                return new State(serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new State[i];
            }
        }

        public State(boolean z) {
            this.b = z;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.L(this.b ? (byte) 1 : (byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof State) && this.b == ((State) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("State(hasVideo="), this.b, ')');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004a, code lost:
    
        if (com.vk.toggle.b.A.a(r7) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StoryGalleryPickerPreviewViewNew(ContextWrapper contextWrapper, boolean z) {
        super(contextWrapper, null, 0);
        boolean z2 = false;
        this.b = z;
        if (z) {
            this.c = View.inflate(contextWrapper, R.layout.story_gallery_picker_preview_item_collage_c, this);
        } else {
            this.c = View.inflate(contextWrapper, R.layout.story_gallery_picker_preview_item_collage_b, this);
        }
        setBackground(m33.a(R.drawable.story_gallery_picker_preview_background, contextWrapper));
        VkButton vkButton = (VkButton) findViewById(R.id.button_collage);
        this.g = vkButton;
        VkButton vkButton2 = (VkButton) findViewById(R.id.button_editor);
        this.h = vkButton2;
        if (!z) {
            StoriesFeatures storiesFeatures = StoriesFeatures.COLLAGES_UPDATE;
            storiesFeatures.getClass();
        }
        z2 = true;
        bwt0.p0(vkButton, z2);
        bwt0.i0(vkButton, new b140(this, 25));
        bwt0.i0(vkButton2, new fa00(this, 27));
        vkButton2.setText(enj.f(R.plurals.story_picker_create_stories, 1, contextWrapper));
    }

    public final View getContainer() {
        return this.c;
    }

    public final gzs<s3q0> getOnAction() {
        return this.d;
    }

    public final gzs<s3q0> getOnOpenPhotoEditor() {
        return this.e;
    }

    public final wzs<Integer, Integer, s3q0> getShowSnackbar() {
        return this.f;
    }

    @Override // com.vk.preview.presentation.view.GalleryPickerPreview
    public final void s3(GalleryPickerPreview.State state) {
        if (state instanceof State) {
            this.i = ((State) state).b;
        }
    }

    public final void setOnAction(gzs<s3q0> gzsVar) {
        this.d = gzsVar;
    }

    public final void setOnOpenPhotoEditor(gzs<s3q0> gzsVar) {
        this.e = gzsVar;
    }

    public final void setShowSnackbar(wzs<? super Integer, ? super Integer, s3q0> wzsVar) {
        this.f = wzsVar;
    }

    @Override // com.vk.preview.presentation.view.GalleryPickerPreview
    public final void z4(List<? extends MediaStoreEntry> list) {
        boolean z;
        Context context = getContext();
        int size = list.size();
        Integer valueOf = Integer.valueOf(size);
        if (size <= 0) {
            valueOf = null;
        }
        boolean z2 = true;
        this.h.setText(enj.f(R.plurals.story_picker_create_stories, valueOf != null ? valueOf.intValue() : 1, context));
        StoriesFeatures storiesFeatures = StoriesFeatures.COLLAGES_UPDATE;
        storiesFeatures.getClass();
        if (com.vk.toggle.b.A.a(storiesFeatures)) {
            List<? extends MediaStoreEntry> list2 = list;
            boolean z3 = list2 instanceof Collection;
            if (!z3 || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (((MediaStoreEntry) it.next()) instanceof MediaStoreVideoEntry) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            boolean z4 = this.i;
            VkButton vkButton = this.g;
            boolean z5 = !z4 && z && bwt0.K(vkButton);
            this.i = z;
            boolean z6 = this.b;
            View view = this.c;
            if (!z6) {
                int size2 = list.size();
                if (2 <= size2 && size2 < 6) {
                    if (!z3 || !list2.isEmpty()) {
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((MediaStoreEntry) it2.next()) instanceof MediaStoreVideoEntry) {
                            }
                        }
                    }
                }
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    ChangeBounds changeBounds = new ChangeBounds();
                    changeBounds.addListener(new e3m0(z5, this));
                    TransitionManager.beginDelayedTransition(viewGroup, changeBounds);
                }
                bwt0.p0(vkButton, false);
                return;
            }
            ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup2 != null) {
                TransitionManager.beginDelayedTransition(viewGroup2, new ChangeBounds());
            }
            bwt0.p0(vkButton, true);
            if (!z3 || !list2.isEmpty()) {
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    } else if (((MediaStoreEntry) it3.next()) instanceof MediaStoreVideoEntry) {
                        z2 = false;
                        break;
                    }
                }
            }
            vkButton.setEnabled(z2);
            if (z5) {
                wzs<? super Integer, ? super Integer, s3q0> wzsVar = this.f;
                if (wzsVar != null) {
                    wzsVar.invoke(Integer.valueOf(R.string.collage_with_video_message), null);
                }
                vvr0.b(150, 75L);
            }
        }
    }

    @Override // com.vk.preview.presentation.view.GalleryPickerPreview
    public State getState() {
        return new State(this.i);
    }

    @Override // com.vk.preview.presentation.view.GalleryPickerPreview
    public void setInitialState(GalleryPickerInitialData galleryPickerInitialData) {
    }

    @Override // com.vk.preview.presentation.view.GalleryPickerPreview
    public void setPreviewListener(t4d0 t4d0Var) {
    }
}
