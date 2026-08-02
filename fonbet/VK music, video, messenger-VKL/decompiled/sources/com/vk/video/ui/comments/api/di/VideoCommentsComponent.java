package com.vk.video.ui.comments.api.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import xsna.b7m;
import xsna.e7m;
import xsna.mui0;
import xsna.vtk0;

/* compiled from: VideoCommentsComponent.kt */
/* loaded from: classes7.dex */
public interface VideoCommentsComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoCommentsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoCommentsComponent STUB = new VideoCommentsComponent() { // from class: com.vk.video.ui.comments.api.di.VideoCommentsComponent$Companion$STUB$1
            public final mui0 a;

            /* compiled from: VideoCommentsComponent.kt */
            public static final class a {
            }

            {
                vtk0.a(null);
                this.a = SessionManagementComponent.Companion.getSTUB().J2();
            }
        };

        public final VideoCommentsComponent getSTUB() {
            return STUB;
        }
    }

    /* compiled from: VideoCommentsComponent.kt */
    public static final class a implements b7m<VideoCommentsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return VideoCommentsComponent.Companion.getSTUB();
        }
    }
}
