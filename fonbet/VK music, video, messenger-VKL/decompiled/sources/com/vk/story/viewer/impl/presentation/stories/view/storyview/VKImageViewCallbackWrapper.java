package com.vk.story.viewer.impl.presentation.stories.view.storyview;

import android.content.Context;
import android.util.AttributeSet;
import com.vk.imageloader.view.VKImageView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.b780;

/* compiled from: VKImageViewCallbackWrapper.kt */
/* loaded from: classes6.dex */
public final class VKImageViewCallbackWrapper extends VKImageView {
    public final CopyOnWriteArrayList<b780> m;

    /* compiled from: VKImageViewCallbackWrapper.kt */
    public final class a implements b780 {
        public a() {
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
            Iterator<T> it = VKImageViewCallbackWrapper.this.m.iterator();
            while (it.hasNext()) {
                ((b780) it.next()).b(str, th);
            }
        }

        @Override // xsna.b780
        public final void g(String str) {
            Iterator<T> it = VKImageViewCallbackWrapper.this.m.iterator();
            while (it.hasNext()) {
                ((b780) it.next()).g(str);
            }
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
            Iterator<T> it = VKImageViewCallbackWrapper.this.m.iterator();
            while (it.hasNext()) {
                ((b780) it.next()).onCancel(str);
            }
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
            Iterator<T> it = VKImageViewCallbackWrapper.this.m.iterator();
            while (it.hasNext()) {
                ((b780) it.next()).t(i, i2, str);
            }
        }
    }

    public VKImageViewCallbackWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.m = new CopyOnWriteArrayList<>();
        setOnLoadCallback(new a());
    }
}
