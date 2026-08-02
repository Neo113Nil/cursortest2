package com.vk.dialogtags.api;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.dialogtags.api.a;

/* compiled from: TagsComponent.kt */
/* loaded from: classes18.dex */
public interface TagsComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: TagsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final TagsComponent STUB = new TagsComponent() { // from class: com.vk.dialogtags.api.TagsComponent$Companion$STUB$1
            public final a a = a.C0896a.a.getSTUB();

            @Override // com.vk.dialogtags.api.TagsComponent
            public final a we() {
                return this.a;
            }
        };

        public final TagsComponent getSTUB() {
            return STUB;
        }
    }

    a we();
}
