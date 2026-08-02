package com.vk.music.offline.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.h850;
import xsna.i850;
import xsna.o850;
import xsna.pwj0;
import xsna.vg5;

/* compiled from: StorageTypeComponent.kt */
/* loaded from: classes.dex */
public interface StorageTypeComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: StorageTypeComponent.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final StorageTypeComponent STUB = new StorageTypeComponent() { // from class: com.vk.music.offline.api.di.StorageTypeComponent$Companion$STUB$1
            public final vg5 a = new vg5();
            public final i850 b = i850.a.getSTUB();
            public final h850 c = h850.a.a.getSTUB();

            @Override // com.vk.music.offline.api.di.StorageTypeComponent
            public final o850 Y7() {
                return this.a;
            }

            @Override // com.vk.music.offline.api.di.StorageTypeComponent
            public final h850 j3() {
                return this.c;
            }

            @Override // com.vk.music.offline.api.di.StorageTypeComponent
            public final i850 rb() {
                return this.b;
            }
        };

        public final StorageTypeComponent getSTUB() {
            return STUB;
        }
    }

    o850 Y7();

    h850 j3();

    i850 rb();
}
